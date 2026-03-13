package org.bouncycastle.cms;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cms.IssuerAndSerialNumber;
import org.bouncycastle.asn1.cms.KeyTransRecipientInfo;
import org.bouncycastle.asn1.cms.RecipientIdentifier;
import org.bouncycastle.asn1.cms.RecipientInfo;
import org.bouncycastle.operator.AsymmetricKeyWrapper;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.OperatorException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class KeyTransRecipientInfoGenerator implements RecipientInfoGenerator {
    private IssuerAndSerialNumber issuerAndSerial;
    private byte[] subjectKeyIdentifier;
    protected final AsymmetricKeyWrapper wrapper;

    public KeyTransRecipientInfoGenerator(IssuerAndSerialNumber issuerAndSerialNumber, AsymmetricKeyWrapper asymmetricKeyWrapper) {
        this.issuerAndSerial = issuerAndSerialNumber;
        this.wrapper = asymmetricKeyWrapper;
    }

    @Override // org.bouncycastle.cms.RecipientInfoGenerator
    public final RecipientInfo generate(GenericKey genericKey) throws CMSException {
        try {
            byte[] generateWrappedKey = this.wrapper.generateWrappedKey(genericKey);
            IssuerAndSerialNumber issuerAndSerialNumber = this.issuerAndSerial;
            return new RecipientInfo(new KeyTransRecipientInfo(issuerAndSerialNumber != null ? new RecipientIdentifier(issuerAndSerialNumber) : new RecipientIdentifier((ASN1OctetString) new DEROctetString(this.subjectKeyIdentifier)), this.wrapper.getAlgorithmIdentifier(), new DEROctetString(generateWrappedKey)));
        } catch (OperatorException e10) {
            throw new CMSException(StubApp.getString2(28205) + e10.getMessage(), e10);
        }
    }

    public KeyTransRecipientInfoGenerator(byte[] bArr, AsymmetricKeyWrapper asymmetricKeyWrapper) {
        this.subjectKeyIdentifier = bArr;
        this.wrapper = asymmetricKeyWrapper;
    }
}
