package org.bouncycastle.asn1.x509;

import com.stub.StubApp;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CertificatePair extends ASN1Object {
    private Certificate forward;
    private Certificate reverse;

    private CertificatePair(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 1 && aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(a.k(aSN1Sequence, new StringBuilder(StubApp.getString2(26912))));
        }
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(objects.nextElement());
            if (aSN1TaggedObject.getTagNo() == 0) {
                this.forward = Certificate.getInstance(aSN1TaggedObject, true);
            } else {
                if (aSN1TaggedObject.getTagNo() != 1) {
                    throw new IllegalArgumentException(a.l(aSN1TaggedObject, new StringBuilder(StubApp.getString2(27122))));
                }
                this.reverse = Certificate.getInstance(aSN1TaggedObject, true);
            }
        }
    }

    public static CertificatePair getInstance(Object obj) {
        if (obj == null || (obj instanceof CertificatePair)) {
            return (CertificatePair) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new CertificatePair((ASN1Sequence) obj);
        }
        throw new IllegalArgumentException(E1.a.h(obj, StubApp.getString2(26708)));
    }

    public Certificate getForward() {
        return this.forward;
    }

    public Certificate getReverse() {
        return this.reverse;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        Certificate certificate = this.forward;
        if (certificate != null) {
            aSN1EncodableVector.add(new DERTaggedObject(0, certificate));
        }
        Certificate certificate2 = this.reverse;
        if (certificate2 != null) {
            aSN1EncodableVector.add(new DERTaggedObject(1, certificate2));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public CertificatePair(Certificate certificate, Certificate certificate2) {
        this.forward = certificate;
        this.reverse = certificate2;
    }
}
