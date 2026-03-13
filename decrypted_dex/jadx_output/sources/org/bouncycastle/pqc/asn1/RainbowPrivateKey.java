package org.bouncycastle.pqc.asn1;

import E1.a;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.pqc.legacy.crypto.rainbow.Layer;
import org.bouncycastle.pqc.legacy.crypto.rainbow.util.RainbowUtil;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RainbowPrivateKey extends ASN1Object {

    /* renamed from: b1, reason: collision with root package name */
    private byte[] f19349b1;
    private byte[] b2;
    private byte[][] invA1;
    private byte[][] invA2;
    private Layer[] layers;
    private ASN1ObjectIdentifier oid;
    private ASN1Integer version;
    private byte[] vi;

    private RainbowPrivateKey(ASN1Sequence aSN1Sequence) {
        int i3 = 0;
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1Integer) {
            this.version = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        } else {
            this.oid = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        }
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(1);
        this.invA1 = new byte[aSN1Sequence2.size()][];
        for (int i10 = 0; i10 < aSN1Sequence2.size(); i10++) {
            this.invA1[i10] = ((ASN1OctetString) aSN1Sequence2.getObjectAt(i10)).getOctets();
        }
        this.f19349b1 = ((ASN1OctetString) ((ASN1Sequence) aSN1Sequence.getObjectAt(2)).getObjectAt(0)).getOctets();
        ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence.getObjectAt(3);
        this.invA2 = new byte[aSN1Sequence3.size()][];
        for (int i11 = 0; i11 < aSN1Sequence3.size(); i11++) {
            this.invA2[i11] = ((ASN1OctetString) aSN1Sequence3.getObjectAt(i11)).getOctets();
        }
        this.b2 = ((ASN1OctetString) ((ASN1Sequence) aSN1Sequence.getObjectAt(4)).getObjectAt(0)).getOctets();
        this.vi = ((ASN1OctetString) ((ASN1Sequence) aSN1Sequence.getObjectAt(5)).getObjectAt(0)).getOctets();
        ASN1Sequence aSN1Sequence4 = (ASN1Sequence) aSN1Sequence.getObjectAt(6);
        byte[][][][] bArr = new byte[aSN1Sequence4.size()][][][];
        byte[][][][] bArr2 = new byte[aSN1Sequence4.size()][][][];
        byte[][][] bArr3 = new byte[aSN1Sequence4.size()][][];
        byte[][] bArr4 = new byte[aSN1Sequence4.size()][];
        int i12 = 0;
        while (i12 < aSN1Sequence4.size()) {
            ASN1Sequence aSN1Sequence5 = (ASN1Sequence) aSN1Sequence4.getObjectAt(i12);
            ASN1Sequence aSN1Sequence6 = (ASN1Sequence) aSN1Sequence5.getObjectAt(i3);
            bArr[i12] = new byte[aSN1Sequence6.size()][][];
            for (int i13 = i3; i13 < aSN1Sequence6.size(); i13++) {
                ASN1Sequence aSN1Sequence7 = (ASN1Sequence) aSN1Sequence6.getObjectAt(i13);
                bArr[i12][i13] = new byte[aSN1Sequence7.size()][];
                for (int i14 = 0; i14 < aSN1Sequence7.size(); i14++) {
                    bArr[i12][i13][i14] = ((ASN1OctetString) aSN1Sequence7.getObjectAt(i14)).getOctets();
                }
            }
            ASN1Sequence aSN1Sequence8 = (ASN1Sequence) aSN1Sequence5.getObjectAt(1);
            bArr2[i12] = new byte[aSN1Sequence8.size()][][];
            for (int i15 = 0; i15 < aSN1Sequence8.size(); i15++) {
                ASN1Sequence aSN1Sequence9 = (ASN1Sequence) aSN1Sequence8.getObjectAt(i15);
                bArr2[i12][i15] = new byte[aSN1Sequence9.size()][];
                for (int i16 = 0; i16 < aSN1Sequence9.size(); i16++) {
                    bArr2[i12][i15][i16] = ((ASN1OctetString) aSN1Sequence9.getObjectAt(i16)).getOctets();
                }
            }
            ASN1Sequence aSN1Sequence10 = (ASN1Sequence) aSN1Sequence5.getObjectAt(2);
            bArr3[i12] = new byte[aSN1Sequence10.size()][];
            for (int i17 = 0; i17 < aSN1Sequence10.size(); i17++) {
                bArr3[i12][i17] = ((ASN1OctetString) aSN1Sequence10.getObjectAt(i17)).getOctets();
            }
            bArr4[i12] = ((ASN1OctetString) aSN1Sequence5.getObjectAt(3)).getOctets();
            i12++;
            i3 = 0;
        }
        int length = this.vi.length - 1;
        this.layers = new Layer[length];
        int i18 = 0;
        while (i18 < length) {
            byte[] bArr5 = this.vi;
            int i19 = i18 + 1;
            this.layers[i18] = new Layer(bArr5[i18], bArr5[i19], RainbowUtil.convertArray(bArr[i18]), RainbowUtil.convertArray(bArr2[i18]), RainbowUtil.convertArray(bArr3[i18]), RainbowUtil.convertArray(bArr4[i18]));
            i18 = i19;
        }
    }

    public static RainbowPrivateKey getInstance(Object obj) {
        if (obj instanceof RainbowPrivateKey) {
            return (RainbowPrivateKey) obj;
        }
        if (obj != null) {
            return new RainbowPrivateKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public short[] getB1() {
        return RainbowUtil.convertArray(this.f19349b1);
    }

    public short[] getB2() {
        return RainbowUtil.convertArray(this.b2);
    }

    public short[][] getInvA1() {
        return RainbowUtil.convertArray(this.invA1);
    }

    public short[][] getInvA2() {
        return RainbowUtil.convertArray(this.invA2);
    }

    public Layer[] getLayers() {
        return this.layers;
    }

    public ASN1Integer getVersion() {
        return this.version;
    }

    public int[] getVi() {
        return RainbowUtil.convertArraytoInt(this.vi);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1Encodable aSN1Encodable = this.version;
        if (aSN1Encodable == null) {
            aSN1Encodable = this.oid;
        }
        aSN1EncodableVector.add(aSN1Encodable);
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        for (int i3 = 0; i3 < this.invA1.length; i3++) {
            aSN1EncodableVector2.add(new DEROctetString(this.invA1[i3]));
        }
        ASN1EncodableVector r8 = a.r(aSN1EncodableVector2, aSN1EncodableVector);
        r8.add(new DEROctetString(this.f19349b1));
        aSN1EncodableVector.add(new DERSequence(r8));
        ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
        for (int i10 = 0; i10 < this.invA2.length; i10++) {
            aSN1EncodableVector3.add(new DEROctetString(this.invA2[i10]));
        }
        ASN1EncodableVector r10 = a.r(aSN1EncodableVector3, aSN1EncodableVector);
        r10.add(new DEROctetString(this.b2));
        aSN1EncodableVector.add(new DERSequence(r10));
        ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
        aSN1EncodableVector4.add(new DEROctetString(this.vi));
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector4));
        ASN1EncodableVector aSN1EncodableVector5 = new ASN1EncodableVector();
        for (int i11 = 0; i11 < this.layers.length; i11++) {
            ASN1EncodableVector aSN1EncodableVector6 = new ASN1EncodableVector();
            byte[][][] convertArray = RainbowUtil.convertArray(this.layers[i11].getCoeffAlpha());
            ASN1EncodableVector aSN1EncodableVector7 = new ASN1EncodableVector();
            for (int i12 = 0; i12 < convertArray.length; i12++) {
                ASN1EncodableVector aSN1EncodableVector8 = new ASN1EncodableVector();
                for (int i13 = 0; i13 < convertArray[i12].length; i13++) {
                    aSN1EncodableVector8.add(new DEROctetString(convertArray[i12][i13]));
                }
                aSN1EncodableVector7.add(new DERSequence(aSN1EncodableVector8));
            }
            aSN1EncodableVector6.add(new DERSequence(aSN1EncodableVector7));
            byte[][][] convertArray2 = RainbowUtil.convertArray(this.layers[i11].getCoeffBeta());
            ASN1EncodableVector aSN1EncodableVector9 = new ASN1EncodableVector();
            for (int i14 = 0; i14 < convertArray2.length; i14++) {
                ASN1EncodableVector aSN1EncodableVector10 = new ASN1EncodableVector();
                for (int i15 = 0; i15 < convertArray2[i14].length; i15++) {
                    aSN1EncodableVector10.add(new DEROctetString(convertArray2[i14][i15]));
                }
                aSN1EncodableVector9.add(new DERSequence(aSN1EncodableVector10));
            }
            aSN1EncodableVector6.add(new DERSequence(aSN1EncodableVector9));
            byte[][] convertArray3 = RainbowUtil.convertArray(this.layers[i11].getCoeffGamma());
            ASN1EncodableVector aSN1EncodableVector11 = new ASN1EncodableVector();
            for (byte[] bArr : convertArray3) {
                aSN1EncodableVector11.add(new DEROctetString(bArr));
            }
            aSN1EncodableVector6.add(new DERSequence(aSN1EncodableVector11));
            aSN1EncodableVector6.add(new DEROctetString(RainbowUtil.convertArray(this.layers[i11].getCoeffEta())));
            aSN1EncodableVector5.add(new DERSequence(aSN1EncodableVector6));
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector5));
        return new DERSequence(aSN1EncodableVector);
    }

    public RainbowPrivateKey(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, Layer[] layerArr) {
        this.version = new ASN1Integer(1L);
        this.invA1 = RainbowUtil.convertArray(sArr);
        this.f19349b1 = RainbowUtil.convertArray(sArr2);
        this.invA2 = RainbowUtil.convertArray(sArr3);
        this.b2 = RainbowUtil.convertArray(sArr4);
        this.vi = RainbowUtil.convertIntArray(iArr);
        this.layers = layerArr;
    }
}
