package org.bouncycastle.cert.crmf;

import com.stub.StubApp;
import i2.u;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.EnvelopedData;
import org.bouncycastle.asn1.crmf.CRMFObjectIdentifiers;
import org.bouncycastle.asn1.crmf.EncryptedKey;
import org.bouncycastle.asn1.crmf.PKIArchiveOptions;
import org.bouncycastle.cms.CMSEnvelopedData;
import org.bouncycastle.cms.CMSException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PKIArchiveControl implements Control {
    public static final int archiveRemGenPrivKey = 2;
    public static final int encryptedPrivKey = 0;
    public static final int keyGenParameters = 1;
    private static final ASN1ObjectIdentifier type = CRMFObjectIdentifiers.id_regCtrl_pkiArchiveOptions;
    private final PKIArchiveOptions pkiArchiveOptions;

    public PKIArchiveControl(PKIArchiveOptions pKIArchiveOptions) {
        this.pkiArchiveOptions = pKIArchiveOptions;
    }

    public int getArchiveType() {
        return this.pkiArchiveOptions.getType();
    }

    public CMSEnvelopedData getEnvelopedData() throws CRMFException {
        try {
            return new CMSEnvelopedData(new ContentInfo(CMSObjectIdentifiers.envelopedData, EnvelopedData.getInstance(EncryptedKey.getInstance(this.pkiArchiveOptions.getValue()).getValue())));
        } catch (CMSException e10) {
            throw new CRMFException(StubApp.getString2(28040) + e10.getMessage(), e10.getCause());
        } catch (Exception e11) {
            throw new CRMFException(u.r(e11, new StringBuilder(StubApp.getString2(28039))), e11);
        }
    }

    @Override // org.bouncycastle.cert.crmf.Control
    public ASN1ObjectIdentifier getType() {
        return type;
    }

    @Override // org.bouncycastle.cert.crmf.Control
    public ASN1Encodable getValue() {
        return this.pkiArchiveOptions;
    }

    public boolean isEnvelopedData() {
        return !EncryptedKey.getInstance(this.pkiArchiveOptions.getValue()).isEncryptedValue();
    }
}
