package org.bouncycastle.asn1.x509;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class AttCertValidityPeriod extends ASN1Object {
    ASN1GeneralizedTime notAfterTime;
    ASN1GeneralizedTime notBeforeTime;

    public AttCertValidityPeriod(ASN1GeneralizedTime aSN1GeneralizedTime, ASN1GeneralizedTime aSN1GeneralizedTime2) {
        this.notBeforeTime = aSN1GeneralizedTime;
        this.notAfterTime = aSN1GeneralizedTime2;
    }

    public static AttCertValidityPeriod getInstance(Object obj) {
        if (obj instanceof AttCertValidityPeriod) {
            return (AttCertValidityPeriod) obj;
        }
        if (obj != null) {
            return new AttCertValidityPeriod(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1GeneralizedTime getNotAfterTime() {
        return this.notAfterTime;
    }

    public ASN1GeneralizedTime getNotBeforeTime() {
        return this.notBeforeTime;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.notBeforeTime);
        aSN1EncodableVector.add(this.notAfterTime);
        return new DERSequence(aSN1EncodableVector);
    }

    private AttCertValidityPeriod(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(a.k(aSN1Sequence, new StringBuilder(StubApp.getString2(26912))));
        }
        this.notBeforeTime = ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(0));
        this.notAfterTime = ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(1));
    }
}
