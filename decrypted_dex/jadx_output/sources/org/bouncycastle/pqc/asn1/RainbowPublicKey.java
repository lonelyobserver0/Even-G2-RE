package org.bouncycastle.pqc.asn1;

import E1.a;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.pqc.legacy.crypto.rainbow.util.RainbowUtil;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RainbowPublicKey extends ASN1Object {
    private byte[][] coeffQuadratic;
    private byte[] coeffScalar;
    private byte[][] coeffSingular;
    private ASN1Integer docLength;
    private ASN1ObjectIdentifier oid;
    private ASN1Integer version;

    public RainbowPublicKey(int i3, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.version = new ASN1Integer(0L);
        this.docLength = new ASN1Integer(i3);
        this.coeffQuadratic = RainbowUtil.convertArray(sArr);
        this.coeffSingular = RainbowUtil.convertArray(sArr2);
        this.coeffScalar = RainbowUtil.convertArray(sArr3);
    }

    public static RainbowPublicKey getInstance(Object obj) {
        if (obj instanceof RainbowPublicKey) {
            return (RainbowPublicKey) obj;
        }
        if (obj != null) {
            return new RainbowPublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public short[][] getCoeffQuadratic() {
        return RainbowUtil.convertArray(this.coeffQuadratic);
    }

    public short[] getCoeffScalar() {
        return RainbowUtil.convertArray(this.coeffScalar);
    }

    public short[][] getCoeffSingular() {
        return RainbowUtil.convertArray(this.coeffSingular);
    }

    public int getDocLength() {
        return this.docLength.intValueExact();
    }

    public ASN1Integer getVersion() {
        return this.version;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1Encodable aSN1Encodable = this.version;
        if (aSN1Encodable == null) {
            aSN1Encodable = this.oid;
        }
        aSN1EncodableVector.add(aSN1Encodable);
        aSN1EncodableVector.add(this.docLength);
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        for (int i3 = 0; i3 < this.coeffQuadratic.length; i3++) {
            aSN1EncodableVector2.add(new DEROctetString(this.coeffQuadratic[i3]));
        }
        ASN1EncodableVector r8 = a.r(aSN1EncodableVector2, aSN1EncodableVector);
        for (int i10 = 0; i10 < this.coeffSingular.length; i10++) {
            r8.add(new DEROctetString(this.coeffSingular[i10]));
        }
        ASN1EncodableVector r10 = a.r(r8, aSN1EncodableVector);
        r10.add(new DEROctetString(this.coeffScalar));
        aSN1EncodableVector.add(new DERSequence(r10));
        return new DERSequence(aSN1EncodableVector);
    }

    private RainbowPublicKey(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1Integer) {
            this.version = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        } else {
            this.oid = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        }
        this.docLength = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
        ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(2));
        this.coeffQuadratic = new byte[aSN1Sequence2.size()][];
        for (int i3 = 0; i3 < aSN1Sequence2.size(); i3++) {
            this.coeffQuadratic[i3] = org.bouncycastle.asn1.a.D(aSN1Sequence2, i3);
        }
        ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence.getObjectAt(3);
        this.coeffSingular = new byte[aSN1Sequence3.size()][];
        for (int i10 = 0; i10 < aSN1Sequence3.size(); i10++) {
            this.coeffSingular[i10] = org.bouncycastle.asn1.a.D(aSN1Sequence3, i10);
        }
        this.coeffScalar = org.bouncycastle.asn1.a.D((ASN1Sequence) aSN1Sequence.getObjectAt(4), 0);
    }
}
