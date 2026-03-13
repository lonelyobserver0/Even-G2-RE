package org.bouncycastle.pqc.asn1;

import com.stub.StubApp;
import i2.u;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.a;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ParSet extends ASN1Object {

    /* renamed from: h, reason: collision with root package name */
    private int[] f19345h;

    /* renamed from: k, reason: collision with root package name */
    private int[] f19346k;

    /* renamed from: t, reason: collision with root package name */
    private int f19347t;

    /* renamed from: w, reason: collision with root package name */
    private int[] f19348w;

    public ParSet(int i3, int[] iArr, int[] iArr2, int[] iArr3) {
        this.f19347t = i3;
        this.f19345h = iArr;
        this.f19348w = iArr2;
        this.f19346k = iArr3;
    }

    private static int checkBigIntegerInIntRangeAndPositive(ASN1Encodable aSN1Encodable) {
        int intValueExact = ((ASN1Integer) aSN1Encodable).intValueExact();
        if (intValueExact > 0) {
            return intValueExact;
        }
        throw new IllegalArgumentException(u.p(intValueExact, StubApp.getString2(33949)));
    }

    public static ParSet getInstance(Object obj) {
        if (obj instanceof ParSet) {
            return (ParSet) obj;
        }
        if (obj != null) {
            return new ParSet(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public int[] getH() {
        return Arrays.clone(this.f19345h);
    }

    public int[] getK() {
        return Arrays.clone(this.f19346k);
    }

    public int getT() {
        return this.f19347t;
    }

    public int[] getW() {
        return Arrays.clone(this.f19348w);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
        for (int i3 = 0; i3 < this.f19345h.length; i3++) {
            aSN1EncodableVector.add(new ASN1Integer(this.f19345h[i3]));
            aSN1EncodableVector2.add(new ASN1Integer(this.f19348w[i3]));
            aSN1EncodableVector3.add(new ASN1Integer(this.f19346k[i3]));
        }
        ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
        aSN1EncodableVector4.add(new ASN1Integer(this.f19347t));
        aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector));
        aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector2));
        aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector3));
        return new DERSequence(aSN1EncodableVector4);
    }

    private ParSet(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 4) {
            throw new IllegalArgumentException(a.k(aSN1Sequence, new StringBuilder(StubApp.getString2(33948))));
        }
        this.f19347t = checkBigIntegerInIntRangeAndPositive(aSN1Sequence.getObjectAt(0));
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(1);
        ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence.getObjectAt(2);
        ASN1Sequence aSN1Sequence4 = (ASN1Sequence) aSN1Sequence.getObjectAt(3);
        if (aSN1Sequence2.size() != this.f19347t || aSN1Sequence3.size() != this.f19347t || aSN1Sequence4.size() != this.f19347t) {
            throw new IllegalArgumentException(StubApp.getString2(33947));
        }
        this.f19345h = new int[aSN1Sequence2.size()];
        this.f19348w = new int[aSN1Sequence3.size()];
        this.f19346k = new int[aSN1Sequence4.size()];
        for (int i3 = 0; i3 < this.f19347t; i3++) {
            this.f19345h[i3] = checkBigIntegerInIntRangeAndPositive(aSN1Sequence2.getObjectAt(i3));
            this.f19348w[i3] = checkBigIntegerInIntRangeAndPositive(aSN1Sequence3.getObjectAt(i3));
            this.f19346k[i3] = checkBigIntegerInIntRangeAndPositive(aSN1Sequence4.getObjectAt(i3));
        }
    }
}
