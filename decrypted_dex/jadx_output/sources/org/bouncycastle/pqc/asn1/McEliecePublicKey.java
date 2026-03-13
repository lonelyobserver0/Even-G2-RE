package org.bouncycastle.pqc.asn1;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Matrix;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class McEliecePublicKey extends ASN1Object {

    /* renamed from: g, reason: collision with root package name */
    private final GF2Matrix f19342g;

    /* renamed from: n, reason: collision with root package name */
    private final int f19343n;

    /* renamed from: t, reason: collision with root package name */
    private final int f19344t;

    public McEliecePublicKey(int i3, int i10, GF2Matrix gF2Matrix) {
        this.f19343n = i3;
        this.f19344t = i10;
        this.f19342g = new GF2Matrix(gF2Matrix);
    }

    public static McEliecePublicKey getInstance(Object obj) {
        if (obj instanceof McEliecePublicKey) {
            return (McEliecePublicKey) obj;
        }
        if (obj != null) {
            return new McEliecePublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GF2Matrix getG() {
        return new GF2Matrix(this.f19342g);
    }

    public int getN() {
        return this.f19343n;
    }

    public int getT() {
        return this.f19344t;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.f19343n));
        aSN1EncodableVector.add(new ASN1Integer(this.f19344t));
        aSN1EncodableVector.add(new DEROctetString(this.f19342g.getEncoded()));
        return new DERSequence(aSN1EncodableVector);
    }

    private McEliecePublicKey(ASN1Sequence aSN1Sequence) {
        this.f19343n = ((ASN1Integer) aSN1Sequence.getObjectAt(0)).intValueExact();
        this.f19344t = ((ASN1Integer) aSN1Sequence.getObjectAt(1)).intValueExact();
        this.f19342g = new GF2Matrix(((ASN1OctetString) aSN1Sequence.getObjectAt(2)).getOctets());
    }
}
