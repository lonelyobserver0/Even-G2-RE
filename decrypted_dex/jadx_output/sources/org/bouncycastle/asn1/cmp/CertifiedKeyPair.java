package org.bouncycastle.asn1.cmp;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.crmf.EncryptedKey;
import org.bouncycastle.asn1.crmf.EncryptedValue;
import org.bouncycastle.asn1.crmf.PKIPublicationInfo;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CertifiedKeyPair extends ASN1Object {
    private final CertOrEncCert certOrEncCert;
    private EncryptedKey privateKey;
    private PKIPublicationInfo publicationInfo;

    private CertifiedKeyPair(ASN1Sequence aSN1Sequence) {
        this.certOrEncCert = CertOrEncCert.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() >= 2) {
            if (aSN1Sequence.size() != 2) {
                this.privateKey = EncryptedKey.getInstance(ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1)).getObject());
                this.publicationInfo = PKIPublicationInfo.getInstance(ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(2)).getObject());
                return;
            }
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1));
            int tagNo = aSN1TaggedObject.getTagNo();
            ASN1Primitive object = aSN1TaggedObject.getObject();
            if (tagNo == 0) {
                this.privateKey = EncryptedKey.getInstance(object);
            } else {
                this.publicationInfo = PKIPublicationInfo.getInstance(object);
            }
        }
    }

    public static CertifiedKeyPair getInstance(Object obj) {
        if (obj instanceof CertifiedKeyPair) {
            return (CertifiedKeyPair) obj;
        }
        if (obj != null) {
            return new CertifiedKeyPair(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CertOrEncCert getCertOrEncCert() {
        return this.certOrEncCert;
    }

    public EncryptedKey getPrivateKey() {
        return this.privateKey;
    }

    public PKIPublicationInfo getPublicationInfo() {
        return this.publicationInfo;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.certOrEncCert);
        EncryptedKey encryptedKey = this.privateKey;
        if (encryptedKey != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, (ASN1Encodable) encryptedKey));
        }
        PKIPublicationInfo pKIPublicationInfo = this.publicationInfo;
        if (pKIPublicationInfo != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, (ASN1Encodable) pKIPublicationInfo));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public CertifiedKeyPair(CertOrEncCert certOrEncCert) {
        this(certOrEncCert, (EncryptedKey) null, (PKIPublicationInfo) null);
    }

    public CertifiedKeyPair(CertOrEncCert certOrEncCert, EncryptedKey encryptedKey, PKIPublicationInfo pKIPublicationInfo) {
        if (certOrEncCert == null) {
            throw new IllegalArgumentException(StubApp.getString2(26891));
        }
        this.certOrEncCert = certOrEncCert;
        this.privateKey = encryptedKey;
        this.publicationInfo = pKIPublicationInfo;
    }

    public CertifiedKeyPair(CertOrEncCert certOrEncCert, EncryptedValue encryptedValue, PKIPublicationInfo pKIPublicationInfo) {
        if (certOrEncCert == null) {
            throw new IllegalArgumentException(StubApp.getString2(26891));
        }
        this.certOrEncCert = certOrEncCert;
        this.privateKey = encryptedValue != null ? new EncryptedKey(encryptedValue) : null;
        this.publicationInfo = pKIPublicationInfo;
    }
}
