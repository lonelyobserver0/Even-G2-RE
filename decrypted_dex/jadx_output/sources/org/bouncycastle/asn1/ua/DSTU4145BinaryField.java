package org.bouncycastle.asn1.ua;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DSTU4145BinaryField extends ASN1Object {
    private int j;

    /* renamed from: k, reason: collision with root package name */
    private int f18686k;

    /* renamed from: l, reason: collision with root package name */
    private int f18687l;

    /* renamed from: m, reason: collision with root package name */
    private int f18688m;

    public DSTU4145BinaryField(int i3, int i10) {
        this(i3, i10, 0, 0);
    }

    public static DSTU4145BinaryField getInstance(Object obj) {
        if (obj instanceof DSTU4145BinaryField) {
            return (DSTU4145BinaryField) obj;
        }
        if (obj != null) {
            return new DSTU4145BinaryField(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public int getK1() {
        return this.f18686k;
    }

    public int getK2() {
        return this.j;
    }

    public int getK3() {
        return this.f18687l;
    }

    public int getM() {
        return this.f18688m;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(new ASN1Integer(this.f18688m));
        if (this.j == 0) {
            aSN1EncodableVector.add(new ASN1Integer(this.f18686k));
        } else {
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(3);
            aSN1EncodableVector2.add(new ASN1Integer(this.f18686k));
            aSN1EncodableVector2.add(new ASN1Integer(this.j));
            aSN1EncodableVector2.add(new ASN1Integer(this.f18687l));
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public DSTU4145BinaryField(int i3, int i10, int i11, int i12) {
        this.f18688m = i3;
        this.f18686k = i10;
        this.j = i11;
        this.f18687l = i12;
    }

    private DSTU4145BinaryField(ASN1Sequence aSN1Sequence) {
        this.f18688m = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).intPositiveValueExact();
        if (aSN1Sequence.getObjectAt(1) instanceof ASN1Integer) {
            this.f18686k = ((ASN1Integer) aSN1Sequence.getObjectAt(1)).intPositiveValueExact();
        } else {
            if (!(aSN1Sequence.getObjectAt(1) instanceof ASN1Sequence)) {
                throw new IllegalArgumentException(StubApp.getString2(27469));
            }
            ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
            this.f18686k = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(0)).intPositiveValueExact();
            this.j = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(1)).intPositiveValueExact();
            this.f18687l = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(2)).intPositiveValueExact();
        }
    }
}
