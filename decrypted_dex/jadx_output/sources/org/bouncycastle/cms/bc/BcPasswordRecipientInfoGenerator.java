package org.bouncycastle.cms.bc;

import com.stub.StubApp;
import i2.u;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.pkcs.PBKDF2Params;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.PasswordRecipientInfoGenerator;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.operator.GenericKey;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BcPasswordRecipientInfoGenerator extends PasswordRecipientInfoGenerator {
    public BcPasswordRecipientInfoGenerator(ASN1ObjectIdentifier aSN1ObjectIdentifier, char[] cArr) {
        super(aSN1ObjectIdentifier, cArr);
    }

    @Override // org.bouncycastle.cms.PasswordRecipientInfoGenerator
    public byte[] calculateDerivedKey(int i3, AlgorithmIdentifier algorithmIdentifier, int i10) throws CMSException {
        PBKDF2Params pBKDF2Params = PBKDF2Params.getInstance(algorithmIdentifier.getParameters());
        byte[] PKCS5PasswordToBytes = i3 == 0 ? PBEParametersGenerator.PKCS5PasswordToBytes(this.password) : PBEParametersGenerator.PKCS5PasswordToUTF8Bytes(this.password);
        try {
            PKCS5S2ParametersGenerator pKCS5S2ParametersGenerator = new PKCS5S2ParametersGenerator(EnvelopedDataHelper.getPRF(pBKDF2Params.getPrf()));
            pKCS5S2ParametersGenerator.init(PKCS5PasswordToBytes, pBKDF2Params.getSalt(), pBKDF2Params.getIterationCount().intValue());
            return ((KeyParameter) pKCS5S2ParametersGenerator.generateDerivedParameters(i10)).getKey();
        } catch (Exception e10) {
            throw new CMSException(u.r(e10, new StringBuilder(StubApp.getString2(28247))), e10);
        }
    }

    @Override // org.bouncycastle.cms.PasswordRecipientInfoGenerator
    public byte[] generateEncryptedBytes(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, GenericKey genericKey) throws CMSException {
        byte[] key = ((KeyParameter) CMSUtils.getBcKey(genericKey)).getKey();
        Wrapper createRFC3211Wrapper = EnvelopedDataHelper.createRFC3211Wrapper(algorithmIdentifier.getAlgorithm());
        createRFC3211Wrapper.init(true, new ParametersWithIV(new KeyParameter(bArr), ASN1OctetString.getInstance(algorithmIdentifier.getParameters()).getOctets()));
        return createRFC3211Wrapper.wrap(key, 0, key.length);
    }
}
