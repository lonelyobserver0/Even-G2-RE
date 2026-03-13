package org.bouncycastle.pqc.asn1;

import E1.a;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.pqc.legacy.crypto.gmss.GMSSLeaf;
import org.bouncycastle.pqc.legacy.crypto.gmss.GMSSParameters;
import org.bouncycastle.pqc.legacy.crypto.gmss.GMSSRootCalc;
import org.bouncycastle.pqc.legacy.crypto.gmss.GMSSRootSig;
import org.bouncycastle.pqc.legacy.crypto.gmss.Treehash;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GMSSPrivateKey extends ASN1Object {
    private ASN1Primitive primitive;

    private GMSSPrivateKey(ASN1Sequence aSN1Sequence) {
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(0);
        int[] iArr = new int[aSN1Sequence2.size()];
        for (int i3 = 0; i3 < aSN1Sequence2.size(); i3++) {
            iArr[i3] = checkBigIntegerInIntRange(aSN1Sequence2.getObjectAt(i3));
        }
        ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence.getObjectAt(1);
        int size = aSN1Sequence3.size();
        byte[][] bArr = new byte[size][];
        for (int i10 = 0; i10 < size; i10++) {
            bArr[i10] = ((DEROctetString) aSN1Sequence3.getObjectAt(i10)).getOctets();
        }
        ASN1Sequence aSN1Sequence4 = (ASN1Sequence) aSN1Sequence.getObjectAt(2);
        int size2 = aSN1Sequence4.size();
        byte[][] bArr2 = new byte[size2][];
        for (int i11 = 0; i11 < size2; i11++) {
            bArr2[i11] = ((DEROctetString) aSN1Sequence4.getObjectAt(i11)).getOctets();
        }
        ASN1Sequence aSN1Sequence5 = (ASN1Sequence) aSN1Sequence.getObjectAt(3);
        int size3 = aSN1Sequence5.size();
        byte[][][] bArr3 = new byte[size3][][];
        for (int i12 = 0; i12 < size3; i12++) {
            ASN1Sequence aSN1Sequence6 = (ASN1Sequence) aSN1Sequence5.getObjectAt(i12);
            bArr3[i12] = new byte[aSN1Sequence6.size()][];
            int i13 = 0;
            while (true) {
                byte[][] bArr4 = bArr3[i12];
                if (i13 < bArr4.length) {
                    bArr4[i13] = ((DEROctetString) aSN1Sequence6.getObjectAt(i13)).getOctets();
                    i13++;
                }
            }
        }
        ASN1Sequence aSN1Sequence7 = (ASN1Sequence) aSN1Sequence.getObjectAt(4);
        int size4 = aSN1Sequence7.size();
        byte[][][] bArr5 = new byte[size4][][];
        for (int i14 = 0; i14 < size4; i14++) {
            ASN1Sequence aSN1Sequence8 = (ASN1Sequence) aSN1Sequence7.getObjectAt(i14);
            bArr5[i14] = new byte[aSN1Sequence8.size()][];
            int i15 = 0;
            while (true) {
                byte[][] bArr6 = bArr5[i14];
                if (i15 < bArr6.length) {
                    bArr6[i15] = ((DEROctetString) aSN1Sequence8.getObjectAt(i15)).getOctets();
                    i15++;
                }
            }
        }
        Treehash[][] treehashArr = new Treehash[((ASN1Sequence) aSN1Sequence.getObjectAt(5)).size()][];
    }

    private static int checkBigIntegerInIntRange(ASN1Encodable aSN1Encodable) {
        return ((ASN1Integer) aSN1Encodable).intValueExact();
    }

    private ASN1Primitive encode(int[] iArr, byte[][] bArr, byte[][] bArr2, byte[][][] bArr3, byte[][][] bArr4, byte[][][] bArr5, Treehash[][] treehashArr, Treehash[][] treehashArr2, Vector[] vectorArr, Vector[] vectorArr2, Vector[][] vectorArr3, Vector[][] vectorArr4, GMSSLeaf[] gMSSLeafArr, GMSSLeaf[] gMSSLeafArr2, GMSSLeaf[] gMSSLeafArr3, int[] iArr2, byte[][] bArr6, GMSSRootCalc[] gMSSRootCalcArr, byte[][] bArr7, GMSSRootSig[] gMSSRootSigArr, GMSSParameters gMSSParameters, AlgorithmIdentifier[] algorithmIdentifierArr) {
        int[] iArr3 = iArr;
        Treehash[][] treehashArr3 = treehashArr;
        Treehash[][] treehashArr4 = treehashArr2;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        int i3 = 0;
        while (i3 < iArr3.length) {
            aSN1EncodableVector2.add(new ASN1Integer(iArr[i3]));
            i3++;
            iArr3 = iArr;
        }
        ASN1EncodableVector r8 = a.r(aSN1EncodableVector2, aSN1EncodableVector);
        for (byte[] bArr8 : bArr) {
            r8.add(new DEROctetString(bArr8));
        }
        ASN1EncodableVector r10 = a.r(r8, aSN1EncodableVector);
        for (byte[] bArr9 : bArr2) {
            r10.add(new DEROctetString(bArr9));
        }
        ASN1EncodableVector r11 = a.r(r10, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
        for (int i10 = 0; i10 < bArr3.length; i10++) {
            for (int i11 = 0; i11 < bArr3[i10].length; i11++) {
                r11.add(new DEROctetString(bArr3[i10][i11]));
            }
            r11 = a.r(r11, aSN1EncodableVector3);
        }
        ASN1EncodableVector r12 = a.r(aSN1EncodableVector3, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
        for (int i12 = 0; i12 < bArr4.length; i12++) {
            for (int i13 = 0; i13 < bArr4[i12].length; i13++) {
                r12.add(new DEROctetString(bArr4[i12][i13]));
            }
            r12 = a.r(r12, aSN1EncodableVector4);
        }
        ASN1EncodableVector r13 = a.r(aSN1EncodableVector4, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector5 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector6 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector7 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector8 = new ASN1EncodableVector();
        int i14 = 0;
        while (i14 < treehashArr3.length) {
            int i15 = 0;
            while (i15 < treehashArr3[i14].length) {
                aSN1EncodableVector6.add(new DERSequence(algorithmIdentifierArr[0]));
                int i16 = treehashArr3[i14][i15].getStatInt()[1];
                aSN1EncodableVector7.add(new DEROctetString(treehashArr3[i14][i15].getStatByte()[0]));
                aSN1EncodableVector7.add(new DEROctetString(treehashArr3[i14][i15].getStatByte()[1]));
                aSN1EncodableVector7.add(new DEROctetString(treehashArr3[i14][i15].getStatByte()[2]));
                int i17 = 0;
                while (i17 < i16) {
                    aSN1EncodableVector7.add(new DEROctetString(treehashArr3[i14][i15].getStatByte()[i17 + 3]));
                    i17++;
                    treehashArr3 = treehashArr;
                }
                aSN1EncodableVector7 = a.r(aSN1EncodableVector7, aSN1EncodableVector6);
                aSN1EncodableVector8.add(new ASN1Integer(treehashArr[i14][i15].getStatInt()[0]));
                aSN1EncodableVector8.add(new ASN1Integer(i16));
                aSN1EncodableVector8.add(new ASN1Integer(treehashArr[i14][i15].getStatInt()[2]));
                aSN1EncodableVector8.add(new ASN1Integer(treehashArr[i14][i15].getStatInt()[3]));
                aSN1EncodableVector8.add(new ASN1Integer(treehashArr[i14][i15].getStatInt()[4]));
                aSN1EncodableVector8.add(new ASN1Integer(treehashArr[i14][i15].getStatInt()[5]));
                int i18 = 0;
                while (i18 < i16) {
                    aSN1EncodableVector8.add(new ASN1Integer(treehashArr[i14][i15].getStatInt()[i18 + 6]));
                    i18++;
                    i14 = i14;
                    i15 = i15;
                }
                aSN1EncodableVector8 = a.r(aSN1EncodableVector8, aSN1EncodableVector6);
                aSN1EncodableVector6 = a.r(aSN1EncodableVector6, aSN1EncodableVector5);
                i15++;
                treehashArr3 = treehashArr;
            }
            aSN1EncodableVector5 = a.r(aSN1EncodableVector5, r13);
            i14++;
            treehashArr3 = treehashArr;
        }
        ASN1EncodableVector r14 = a.r(r13, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector9 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector10 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector11 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector12 = new ASN1EncodableVector();
        int i19 = 0;
        while (i19 < treehashArr4.length) {
            int i20 = 0;
            while (i20 < treehashArr4[i19].length) {
                aSN1EncodableVector10.add(new DERSequence(algorithmIdentifierArr[0]));
                int i21 = treehashArr4[i19][i20].getStatInt()[1];
                aSN1EncodableVector11.add(new DEROctetString(treehashArr4[i19][i20].getStatByte()[0]));
                aSN1EncodableVector11.add(new DEROctetString(treehashArr4[i19][i20].getStatByte()[1]));
                aSN1EncodableVector11.add(new DEROctetString(treehashArr4[i19][i20].getStatByte()[2]));
                for (int i22 = 0; i22 < i21; i22++) {
                    aSN1EncodableVector11.add(new DEROctetString(treehashArr4[i19][i20].getStatByte()[i22 + 3]));
                }
                aSN1EncodableVector11 = a.r(aSN1EncodableVector11, aSN1EncodableVector10);
                aSN1EncodableVector12.add(new ASN1Integer(treehashArr4[i19][i20].getStatInt()[0]));
                aSN1EncodableVector12.add(new ASN1Integer(i21));
                aSN1EncodableVector12.add(new ASN1Integer(treehashArr4[i19][i20].getStatInt()[2]));
                aSN1EncodableVector12.add(new ASN1Integer(treehashArr4[i19][i20].getStatInt()[3]));
                aSN1EncodableVector12.add(new ASN1Integer(treehashArr4[i19][i20].getStatInt()[4]));
                aSN1EncodableVector12.add(new ASN1Integer(treehashArr4[i19][i20].getStatInt()[5]));
                int i23 = 0;
                while (i23 < i21) {
                    aSN1EncodableVector12.add(new ASN1Integer(treehashArr4[i19][i20].getStatInt()[i23 + 6]));
                    i23++;
                    treehashArr4 = treehashArr2;
                    i19 = i19;
                }
                aSN1EncodableVector12 = a.r(aSN1EncodableVector12, aSN1EncodableVector10);
                aSN1EncodableVector10 = a.r(aSN1EncodableVector10, aSN1EncodableVector9);
                i20++;
                treehashArr4 = treehashArr2;
            }
            r14.add(new DERSequence(new DERSequence(aSN1EncodableVector9)));
            aSN1EncodableVector9 = new ASN1EncodableVector();
            i19++;
            treehashArr4 = treehashArr2;
        }
        ASN1EncodableVector r15 = a.r(r14, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector13 = new ASN1EncodableVector();
        for (int i24 = 0; i24 < bArr5.length; i24++) {
            for (int i25 = 0; i25 < bArr5[i24].length; i25++) {
                r15.add(new DEROctetString(bArr5[i24][i25]));
            }
            r15 = a.r(r15, aSN1EncodableVector13);
        }
        ASN1EncodableVector r16 = a.r(aSN1EncodableVector13, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector14 = new ASN1EncodableVector();
        for (int i26 = 0; i26 < vectorArr.length; i26++) {
            for (int i27 = 0; i27 < vectorArr[i26].size(); i27++) {
                r16.add(new DEROctetString((byte[]) vectorArr[i26].elementAt(i27)));
            }
            r16 = a.r(r16, aSN1EncodableVector14);
        }
        ASN1EncodableVector r17 = a.r(aSN1EncodableVector14, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector15 = new ASN1EncodableVector();
        for (int i28 = 0; i28 < vectorArr2.length; i28++) {
            for (int i29 = 0; i29 < vectorArr2[i28].size(); i29++) {
                r17.add(new DEROctetString((byte[]) vectorArr2[i28].elementAt(i29)));
            }
            r17 = a.r(r17, aSN1EncodableVector15);
        }
        ASN1EncodableVector r18 = a.r(aSN1EncodableVector15, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector16 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector17 = new ASN1EncodableVector();
        for (int i30 = 0; i30 < vectorArr3.length; i30++) {
            for (int i31 = 0; i31 < vectorArr3[i30].length; i31++) {
                for (int i32 = 0; i32 < vectorArr3[i30][i31].size(); i32++) {
                    r18.add(new DEROctetString((byte[]) vectorArr3[i30][i31].elementAt(i32)));
                }
                r18 = a.r(r18, aSN1EncodableVector16);
            }
            aSN1EncodableVector16 = a.r(aSN1EncodableVector16, aSN1EncodableVector17);
        }
        ASN1EncodableVector r19 = a.r(aSN1EncodableVector17, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector18 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector19 = new ASN1EncodableVector();
        for (int i33 = 0; i33 < vectorArr4.length; i33++) {
            for (int i34 = 0; i34 < vectorArr4[i33].length; i34++) {
                for (int i35 = 0; i35 < vectorArr4[i33][i34].size(); i35++) {
                    r19.add(new DEROctetString((byte[]) vectorArr4[i33][i34].elementAt(i35)));
                }
                r19 = a.r(r19, aSN1EncodableVector18);
            }
            aSN1EncodableVector18 = a.r(aSN1EncodableVector18, aSN1EncodableVector19);
        }
        ASN1EncodableVector r20 = a.r(aSN1EncodableVector19, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector20 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector21 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector22 = new ASN1EncodableVector();
        for (int i36 = 0; i36 < gMSSLeafArr.length; i36++) {
            aSN1EncodableVector20.add(new DERSequence(algorithmIdentifierArr[0]));
            byte[][] statByte = gMSSLeafArr[i36].getStatByte();
            aSN1EncodableVector21.add(new DEROctetString(statByte[0]));
            aSN1EncodableVector21.add(new DEROctetString(statByte[1]));
            aSN1EncodableVector21.add(new DEROctetString(statByte[2]));
            aSN1EncodableVector21.add(new DEROctetString(statByte[3]));
            aSN1EncodableVector20.add(new DERSequence(aSN1EncodableVector21));
            aSN1EncodableVector21 = new ASN1EncodableVector();
            int[] statInt = gMSSLeafArr[i36].getStatInt();
            aSN1EncodableVector22.add(new ASN1Integer(statInt[0]));
            aSN1EncodableVector22.add(new ASN1Integer(statInt[1]));
            aSN1EncodableVector22.add(new ASN1Integer(statInt[2]));
            aSN1EncodableVector22.add(new ASN1Integer(statInt[3]));
            aSN1EncodableVector20.add(new DERSequence(aSN1EncodableVector22));
            aSN1EncodableVector22 = new ASN1EncodableVector();
            aSN1EncodableVector20 = a.r(aSN1EncodableVector20, r20);
        }
        ASN1EncodableVector r21 = a.r(r20, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector23 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector24 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector25 = new ASN1EncodableVector();
        for (int i37 = 0; i37 < gMSSLeafArr2.length; i37++) {
            aSN1EncodableVector23.add(new DERSequence(algorithmIdentifierArr[0]));
            byte[][] statByte2 = gMSSLeafArr2[i37].getStatByte();
            aSN1EncodableVector24.add(new DEROctetString(statByte2[0]));
            aSN1EncodableVector24.add(new DEROctetString(statByte2[1]));
            aSN1EncodableVector24.add(new DEROctetString(statByte2[2]));
            aSN1EncodableVector24.add(new DEROctetString(statByte2[3]));
            aSN1EncodableVector23.add(new DERSequence(aSN1EncodableVector24));
            aSN1EncodableVector24 = new ASN1EncodableVector();
            int[] statInt2 = gMSSLeafArr2[i37].getStatInt();
            aSN1EncodableVector25.add(new ASN1Integer(statInt2[0]));
            aSN1EncodableVector25.add(new ASN1Integer(statInt2[1]));
            aSN1EncodableVector25.add(new ASN1Integer(statInt2[2]));
            aSN1EncodableVector25.add(new ASN1Integer(statInt2[3]));
            aSN1EncodableVector23.add(new DERSequence(aSN1EncodableVector25));
            aSN1EncodableVector25 = new ASN1EncodableVector();
            aSN1EncodableVector23 = a.r(aSN1EncodableVector23, r21);
        }
        ASN1EncodableVector r22 = a.r(r21, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector26 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector27 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector28 = new ASN1EncodableVector();
        for (int i38 = 0; i38 < gMSSLeafArr3.length; i38++) {
            aSN1EncodableVector26.add(new DERSequence(algorithmIdentifierArr[0]));
            byte[][] statByte3 = gMSSLeafArr3[i38].getStatByte();
            aSN1EncodableVector27.add(new DEROctetString(statByte3[0]));
            aSN1EncodableVector27.add(new DEROctetString(statByte3[1]));
            aSN1EncodableVector27.add(new DEROctetString(statByte3[2]));
            aSN1EncodableVector27.add(new DEROctetString(statByte3[3]));
            aSN1EncodableVector26.add(new DERSequence(aSN1EncodableVector27));
            aSN1EncodableVector27 = new ASN1EncodableVector();
            int[] statInt3 = gMSSLeafArr3[i38].getStatInt();
            aSN1EncodableVector28.add(new ASN1Integer(statInt3[0]));
            aSN1EncodableVector28.add(new ASN1Integer(statInt3[1]));
            aSN1EncodableVector28.add(new ASN1Integer(statInt3[2]));
            aSN1EncodableVector28.add(new ASN1Integer(statInt3[3]));
            aSN1EncodableVector26.add(new DERSequence(aSN1EncodableVector28));
            aSN1EncodableVector28 = new ASN1EncodableVector();
            aSN1EncodableVector26 = a.r(aSN1EncodableVector26, r22);
        }
        ASN1EncodableVector r23 = a.r(r22, aSN1EncodableVector);
        for (int i39 : iArr2) {
            r23.add(new ASN1Integer(i39));
        }
        ASN1EncodableVector r24 = a.r(r23, aSN1EncodableVector);
        for (byte[] bArr10 : bArr6) {
            r24.add(new DEROctetString(bArr10));
        }
        ASN1EncodableVector r25 = a.r(r24, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector29 = new ASN1EncodableVector();
        new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector30 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector31 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector32 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector33 = new ASN1EncodableVector();
        int i40 = 0;
        while (i40 < gMSSRootCalcArr.length) {
            aSN1EncodableVector29.add(new DERSequence(algorithmIdentifierArr[0]));
            new ASN1EncodableVector();
            int i41 = gMSSRootCalcArr[i40].getStatInt()[0];
            int i42 = gMSSRootCalcArr[i40].getStatInt()[7];
            aSN1EncodableVector30.add(new DEROctetString(gMSSRootCalcArr[i40].getStatByte()[0]));
            int i43 = 0;
            while (i43 < i41) {
                i43++;
                aSN1EncodableVector30.add(new DEROctetString(gMSSRootCalcArr[i40].getStatByte()[i43]));
            }
            for (int i44 = 0; i44 < i42; i44++) {
                aSN1EncodableVector30.add(new DEROctetString(gMSSRootCalcArr[i40].getStatByte()[i41 + 1 + i44]));
            }
            ASN1EncodableVector r26 = a.r(aSN1EncodableVector30, aSN1EncodableVector29);
            aSN1EncodableVector31.add(new ASN1Integer(i41));
            aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i40].getStatInt()[1]));
            aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i40].getStatInt()[2]));
            aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i40].getStatInt()[3]));
            aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i40].getStatInt()[4]));
            aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i40].getStatInt()[5]));
            aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i40].getStatInt()[6]));
            aSN1EncodableVector31.add(new ASN1Integer(i42));
            for (int i45 = 0; i45 < i41; i45++) {
                aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i40].getStatInt()[i45 + 8]));
            }
            for (int i46 = 0; i46 < i42; i46++) {
                aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i40].getStatInt()[i41 + 8 + i46]));
            }
            ASN1EncodableVector r27 = a.r(aSN1EncodableVector31, aSN1EncodableVector29);
            ASN1EncodableVector aSN1EncodableVector34 = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector35 = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector36 = new ASN1EncodableVector();
            if (gMSSRootCalcArr[i40].getTreehash() != null) {
                int i47 = 0;
                while (i47 < gMSSRootCalcArr[i40].getTreehash().length) {
                    aSN1EncodableVector34.add(new DERSequence(algorithmIdentifierArr[0]));
                    int i48 = gMSSRootCalcArr[i40].getTreehash()[i47].getStatInt()[1];
                    aSN1EncodableVector35.add(new DEROctetString(gMSSRootCalcArr[i40].getTreehash()[i47].getStatByte()[0]));
                    aSN1EncodableVector35.add(new DEROctetString(gMSSRootCalcArr[i40].getTreehash()[i47].getStatByte()[1]));
                    aSN1EncodableVector35.add(new DEROctetString(gMSSRootCalcArr[i40].getTreehash()[i47].getStatByte()[2]));
                    int i49 = 0;
                    while (i49 < i48) {
                        aSN1EncodableVector35.add(new DEROctetString(gMSSRootCalcArr[i40].getTreehash()[i47].getStatByte()[i49 + 3]));
                        i49++;
                        r26 = r26;
                    }
                    ASN1EncodableVector aSN1EncodableVector37 = r26;
                    aSN1EncodableVector35 = a.r(aSN1EncodableVector35, aSN1EncodableVector34);
                    aSN1EncodableVector36.add(new ASN1Integer(gMSSRootCalcArr[i40].getTreehash()[i47].getStatInt()[0]));
                    aSN1EncodableVector36.add(new ASN1Integer(i48));
                    aSN1EncodableVector36.add(new ASN1Integer(gMSSRootCalcArr[i40].getTreehash()[i47].getStatInt()[2]));
                    aSN1EncodableVector36.add(new ASN1Integer(gMSSRootCalcArr[i40].getTreehash()[i47].getStatInt()[3]));
                    aSN1EncodableVector36.add(new ASN1Integer(gMSSRootCalcArr[i40].getTreehash()[i47].getStatInt()[4]));
                    aSN1EncodableVector36.add(new ASN1Integer(gMSSRootCalcArr[i40].getTreehash()[i47].getStatInt()[5]));
                    int i50 = 0;
                    while (i50 < i48) {
                        aSN1EncodableVector36.add(new ASN1Integer(gMSSRootCalcArr[i40].getTreehash()[i47].getStatInt()[i50 + 6]));
                        i50++;
                        r27 = r27;
                    }
                    aSN1EncodableVector36 = a.r(aSN1EncodableVector36, aSN1EncodableVector34);
                    aSN1EncodableVector34 = a.r(aSN1EncodableVector34, aSN1EncodableVector32);
                    i47++;
                    r26 = aSN1EncodableVector37;
                }
            }
            ASN1EncodableVector aSN1EncodableVector38 = r26;
            ASN1EncodableVector aSN1EncodableVector39 = r27;
            aSN1EncodableVector32 = a.r(aSN1EncodableVector32, aSN1EncodableVector29);
            ASN1EncodableVector aSN1EncodableVector40 = new ASN1EncodableVector();
            if (gMSSRootCalcArr[i40].getRetain() != null) {
                for (int i51 = 0; i51 < gMSSRootCalcArr[i40].getRetain().length; i51++) {
                    for (int i52 = 0; i52 < gMSSRootCalcArr[i40].getRetain()[i51].size(); i52++) {
                        aSN1EncodableVector40.add(new DEROctetString((byte[]) gMSSRootCalcArr[i40].getRetain()[i51].elementAt(i52)));
                    }
                    aSN1EncodableVector40 = a.r(aSN1EncodableVector40, aSN1EncodableVector33);
                }
            }
            aSN1EncodableVector33 = a.r(aSN1EncodableVector33, aSN1EncodableVector29);
            aSN1EncodableVector29 = a.r(aSN1EncodableVector29, r25);
            i40++;
            aSN1EncodableVector30 = aSN1EncodableVector38;
            aSN1EncodableVector31 = aSN1EncodableVector39;
        }
        ASN1EncodableVector r28 = a.r(r25, aSN1EncodableVector);
        for (byte[] bArr11 : bArr7) {
            r28.add(new DEROctetString(bArr11));
        }
        ASN1EncodableVector r29 = a.r(r28, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector41 = new ASN1EncodableVector();
        new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector42 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector43 = new ASN1EncodableVector();
        for (int i53 = 0; i53 < gMSSRootSigArr.length; i53++) {
            aSN1EncodableVector41.add(new DERSequence(algorithmIdentifierArr[0]));
            new ASN1EncodableVector();
            aSN1EncodableVector42.add(new DEROctetString(gMSSRootSigArr[i53].getStatByte()[0]));
            aSN1EncodableVector42.add(new DEROctetString(gMSSRootSigArr[i53].getStatByte()[1]));
            aSN1EncodableVector42.add(new DEROctetString(gMSSRootSigArr[i53].getStatByte()[2]));
            aSN1EncodableVector42.add(new DEROctetString(gMSSRootSigArr[i53].getStatByte()[3]));
            aSN1EncodableVector42.add(new DEROctetString(gMSSRootSigArr[i53].getStatByte()[4]));
            aSN1EncodableVector41.add(new DERSequence(aSN1EncodableVector42));
            aSN1EncodableVector42 = new ASN1EncodableVector();
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i53].getStatInt()[0]));
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i53].getStatInt()[1]));
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i53].getStatInt()[2]));
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i53].getStatInt()[3]));
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i53].getStatInt()[4]));
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i53].getStatInt()[5]));
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i53].getStatInt()[6]));
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i53].getStatInt()[7]));
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i53].getStatInt()[8]));
            aSN1EncodableVector41.add(new DERSequence(aSN1EncodableVector43));
            aSN1EncodableVector43 = new ASN1EncodableVector();
            aSN1EncodableVector41 = a.r(aSN1EncodableVector41, r29);
        }
        ASN1EncodableVector r30 = a.r(r29, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector44 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector45 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector46 = new ASN1EncodableVector();
        for (int i54 = 0; i54 < gMSSParameters.getHeightOfTrees().length; i54++) {
            aSN1EncodableVector44.add(new ASN1Integer(gMSSParameters.getHeightOfTrees()[i54]));
            aSN1EncodableVector45.add(new ASN1Integer(gMSSParameters.getWinternitzParameter()[i54]));
            aSN1EncodableVector46.add(new ASN1Integer(gMSSParameters.getK()[i54]));
        }
        r30.add(new ASN1Integer(gMSSParameters.getNumOfLayers()));
        r30.add(new DERSequence(aSN1EncodableVector44));
        r30.add(new DERSequence(aSN1EncodableVector45));
        r30.add(new DERSequence(aSN1EncodableVector46));
        ASN1EncodableVector r31 = a.r(r30, aSN1EncodableVector);
        for (AlgorithmIdentifier algorithmIdentifier : algorithmIdentifierArr) {
            r31.add(algorithmIdentifier);
        }
        aSN1EncodableVector.add(new DERSequence(r31));
        return new DERSequence(aSN1EncodableVector);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.primitive;
    }

    public GMSSPrivateKey(int[] iArr, byte[][] bArr, byte[][] bArr2, byte[][][] bArr3, byte[][][] bArr4, Treehash[][] treehashArr, Treehash[][] treehashArr2, Vector[] vectorArr, Vector[] vectorArr2, Vector[][] vectorArr3, Vector[][] vectorArr4, byte[][][] bArr5, GMSSLeaf[] gMSSLeafArr, GMSSLeaf[] gMSSLeafArr2, GMSSLeaf[] gMSSLeafArr3, int[] iArr2, byte[][] bArr6, GMSSRootCalc[] gMSSRootCalcArr, byte[][] bArr7, GMSSRootSig[] gMSSRootSigArr, GMSSParameters gMSSParameters, AlgorithmIdentifier algorithmIdentifier) {
        this.primitive = encode(iArr, bArr, bArr2, bArr3, bArr4, bArr5, treehashArr, treehashArr2, vectorArr, vectorArr2, vectorArr3, vectorArr4, gMSSLeafArr, gMSSLeafArr2, gMSSLeafArr3, iArr2, bArr6, gMSSRootCalcArr, bArr7, gMSSRootSigArr, gMSSParameters, new AlgorithmIdentifier[]{algorithmIdentifier});
    }
}
