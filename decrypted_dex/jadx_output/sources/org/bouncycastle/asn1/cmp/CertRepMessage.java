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

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CertRepMessage extends ASN1Object {
    private ASN1Sequence caPubs;
    private final ASN1Sequence response;

    private CertRepMessage(ASN1Sequence aSN1Sequence) {
        int i3 = 0;
        if (aSN1Sequence.size() > 1) {
            this.caPubs = ASN1Sequence.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(0), true);
            i3 = 1;
        }
        this.response = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(i3));
    }

    public static CertRepMessage getInstance(Object obj) {
        if (obj instanceof CertRepMessage) {
            return (CertRepMessage) obj;
        }
        if (obj != null) {
            return new CertRepMessage(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CMPCertificate[] getCaPubs() {
        ASN1Sequence aSN1Sequence = this.caPubs;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        CMPCertificate[] cMPCertificateArr = new CMPCertificate[size];
        for (int i3 = 0; i3 != size; i3++) {
            cMPCertificateArr[i3] = CMPCertificate.getInstance(this.caPubs.getObjectAt(i3));
        }
        return cMPCertificateArr;
    }

    public CertResponse[] getResponse() {
        int size = this.response.size();
        CertResponse[] certResponseArr = new CertResponse[size];
        for (int i3 = 0; i3 != size; i3++) {
            certResponseArr[i3] = CertResponse.getInstance(this.response.getObjectAt(i3));
        }
        return certResponseArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        ASN1Sequence aSN1Sequence = this.caPubs;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, (ASN1Encodable) aSN1Sequence));
        }
        aSN1EncodableVector.add(this.response);
        return new DERSequence(aSN1EncodableVector);
    }

    public CertRepMessage(CMPCertificate[] cMPCertificateArr, CertResponse[] certResponseArr) {
        if (certResponseArr == null) {
            throw new IllegalArgumentException(StubApp.getString2(26887));
        }
        if (cMPCertificateArr != null) {
            this.caPubs = new DERSequence(cMPCertificateArr);
        }
        this.response = new DERSequence(certResponseArr);
    }
}
