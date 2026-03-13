package org.bouncycastle.asn1.cmc;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.a;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PendInfo extends ASN1Object {
    private final ASN1GeneralizedTime pendTime;
    private final byte[] pendToken;

    private PendInfo(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(StubApp.getString2(26869));
        }
        this.pendToken = a.B(aSN1Sequence, 0);
        this.pendTime = ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static PendInfo getInstance(Object obj) {
        if (obj instanceof PendInfo) {
            return (PendInfo) obj;
        }
        if (obj != null) {
            return new PendInfo(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1GeneralizedTime getPendTime() {
        return this.pendTime;
    }

    public byte[] getPendToken() {
        return Arrays.clone(this.pendToken);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(new DEROctetString(this.pendToken));
        aSN1EncodableVector.add(this.pendTime);
        return new DERSequence(aSN1EncodableVector);
    }

    public PendInfo(byte[] bArr, ASN1GeneralizedTime aSN1GeneralizedTime) {
        this.pendToken = Arrays.clone(bArr);
        this.pendTime = aSN1GeneralizedTime;
    }
}
