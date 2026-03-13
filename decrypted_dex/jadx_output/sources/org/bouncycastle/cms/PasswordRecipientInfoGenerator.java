package org.bouncycastle.cms;

import com.stub.StubApp;
import java.security.SecureRandom;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.cms.PasswordRecipientInfo;
import org.bouncycastle.asn1.cms.RecipientInfo;
import org.bouncycastle.asn1.pkcs.PBKDF2Params;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.PasswordRecipient;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class PasswordRecipientInfoGenerator implements RecipientInfoGenerator {
    private int blockSize;
    private int iterationCount;
    private ASN1ObjectIdentifier kekAlgorithm;
    private AlgorithmIdentifier keyDerivationAlgorithm;
    private int keySize;
    protected char[] password;
    private PasswordRecipient.PRF prf;
    private SecureRandom random;
    private byte[] salt;
    private int schemeID;

    public PasswordRecipientInfoGenerator(ASN1ObjectIdentifier aSN1ObjectIdentifier, char[] cArr) {
        this(aSN1ObjectIdentifier, cArr, getKeySize(aSN1ObjectIdentifier), ((Integer) PasswordRecipientInformation.BLOCKSIZES.get(aSN1ObjectIdentifier)).intValue());
    }

    private static int getKeySize(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        Integer num = (Integer) PasswordRecipientInformation.KEYSIZES.get(aSN1ObjectIdentifier);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException(a.e(StubApp.getString2(28213), aSN1ObjectIdentifier));
    }

    public abstract byte[] calculateDerivedKey(int i3, AlgorithmIdentifier algorithmIdentifier, int i10) throws CMSException;

    @Override // org.bouncycastle.cms.RecipientInfoGenerator
    public RecipientInfo generate(GenericKey genericKey) throws CMSException {
        byte[] bArr = new byte[this.blockSize];
        if (this.random == null) {
            this.random = new SecureRandom();
        }
        this.random.nextBytes(bArr);
        if (this.salt == null) {
            byte[] bArr2 = new byte[20];
            this.salt = bArr2;
            this.random.nextBytes(bArr2);
        }
        AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBKDF2, new PBKDF2Params(this.salt, this.iterationCount, this.prf.prfAlgID));
        this.keyDerivationAlgorithm = algorithmIdentifier;
        DEROctetString dEROctetString = new DEROctetString(generateEncryptedBytes(new AlgorithmIdentifier(this.kekAlgorithm, new DEROctetString(bArr)), calculateDerivedKey(this.schemeID, algorithmIdentifier, this.keySize), genericKey));
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.kekAlgorithm);
        aSN1EncodableVector.add(new DEROctetString(bArr));
        return new RecipientInfo(new PasswordRecipientInfo(this.keyDerivationAlgorithm, new AlgorithmIdentifier(PKCSObjectIdentifiers.id_alg_PWRI_KEK, new DERSequence(aSN1EncodableVector)), dEROctetString));
    }

    public abstract byte[] generateEncryptedBytes(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, GenericKey genericKey) throws CMSException;

    public PasswordRecipientInfoGenerator setPRF(PasswordRecipient.PRF prf) {
        this.prf = prf;
        return this;
    }

    public PasswordRecipientInfoGenerator setPasswordConversionScheme(int i3) {
        this.schemeID = i3;
        return this;
    }

    public PasswordRecipientInfoGenerator setSaltAndIterationCount(byte[] bArr, int i3) {
        this.salt = Arrays.clone(bArr);
        this.iterationCount = i3;
        return this;
    }

    public PasswordRecipientInfoGenerator setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }

    public PasswordRecipientInfoGenerator(ASN1ObjectIdentifier aSN1ObjectIdentifier, char[] cArr, int i3, int i10) {
        this.password = cArr;
        this.schemeID = 1;
        this.kekAlgorithm = aSN1ObjectIdentifier;
        this.keySize = i3;
        this.blockSize = i10;
        this.prf = PasswordRecipient.PRF.HMacSHA1;
        this.iterationCount = 1024;
    }
}
