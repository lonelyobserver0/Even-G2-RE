package org.bouncycastle.asn1.cmp;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.crmf.EncryptedKey;
import org.bouncycastle.asn1.crmf.EncryptedValue;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CertOrEncCert extends ASN1Object implements ASN1Choice {
    private CMPCertificate certificate;
    private EncryptedKey encryptedCert;

    private CertOrEncCert(ASN1TaggedObject aSN1TaggedObject) {
        if (aSN1TaggedObject.getTagNo() == 0) {
            this.certificate = CMPCertificate.getInstance(aSN1TaggedObject.getObject());
        } else {
            if (aSN1TaggedObject.getTagNo() != 1) {
                throw new IllegalArgumentException(a.l(aSN1TaggedObject, new StringBuilder(StubApp.getString2(26884))));
            }
            this.encryptedCert = EncryptedKey.getInstance(aSN1TaggedObject.getObject());
        }
    }

    public static CertOrEncCert getInstance(Object obj) {
        if (obj instanceof CertOrEncCert) {
            return (CertOrEncCert) obj;
        }
        if (obj instanceof ASN1TaggedObject) {
            return new CertOrEncCert((ASN1TaggedObject) obj);
        }
        return null;
    }

    public CMPCertificate getCertificate() {
        return this.certificate;
    }

    public EncryptedKey getEncryptedCert() {
        return this.encryptedCert;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        CMPCertificate cMPCertificate = this.certificate;
        return cMPCertificate != null ? new DERTaggedObject(true, 0, (ASN1Encodable) cMPCertificate) : new DERTaggedObject(true, 1, (ASN1Encodable) this.encryptedCert);
    }

    public CertOrEncCert(CMPCertificate cMPCertificate) {
        if (cMPCertificate == null) {
            throw new IllegalArgumentException(StubApp.getString2(26885));
        }
        this.certificate = cMPCertificate;
    }

    public CertOrEncCert(EncryptedKey encryptedKey) {
        if (encryptedKey == null) {
            throw new IllegalArgumentException(StubApp.getString2(26886));
        }
        this.encryptedCert = encryptedKey;
    }

    public CertOrEncCert(EncryptedValue encryptedValue) {
        if (encryptedValue == null) {
            throw new IllegalArgumentException(StubApp.getString2(26886));
        }
        this.encryptedCert = new EncryptedKey(encryptedValue);
    }
}
