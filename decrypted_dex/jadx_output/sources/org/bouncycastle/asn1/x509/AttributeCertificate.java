package org.bouncycastle.asn1.x509;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class AttributeCertificate extends ASN1Object {
    AttributeCertificateInfo acinfo;
    AlgorithmIdentifier signatureAlgorithm;
    ASN1BitString signatureValue;

    private AttributeCertificate(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException(a.k(aSN1Sequence, new StringBuilder(StubApp.getString2(26912))));
        }
        this.acinfo = AttributeCertificateInfo.getInstance(aSN1Sequence.getObjectAt(0));
        this.signatureAlgorithm = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.signatureValue = DERBitString.getInstance((Object) aSN1Sequence.getObjectAt(2));
    }

    public static AttributeCertificate getInstance(Object obj) {
        if (obj instanceof AttributeCertificate) {
            return (AttributeCertificate) obj;
        }
        if (obj != null) {
            return new AttributeCertificate(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public AttributeCertificateInfo getAcinfo() {
        return this.acinfo;
    }

    public AlgorithmIdentifier getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    public ASN1BitString getSignatureValue() {
        return this.signatureValue;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.acinfo);
        aSN1EncodableVector.add(this.signatureAlgorithm);
        aSN1EncodableVector.add(this.signatureValue);
        return new DERSequence(aSN1EncodableVector);
    }

    public AttributeCertificate(AttributeCertificateInfo attributeCertificateInfo, AlgorithmIdentifier algorithmIdentifier, DERBitString dERBitString) {
        this.acinfo = attributeCertificateInfo;
        this.signatureAlgorithm = algorithmIdentifier;
        this.signatureValue = dERBitString;
    }
}
