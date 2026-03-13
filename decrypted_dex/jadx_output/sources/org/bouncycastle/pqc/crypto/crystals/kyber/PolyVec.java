package org.bouncycastle.pqc.crypto.crystals.kyber;

import com.stub.StubApp;
import kotlin.UByte;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class PolyVec {
    private KyberEngine engine;
    private int kyberK;
    private int polyVecBytes;
    Poly[] vec;

    public PolyVec() throws Exception {
        throw new Exception(StubApp.getString2(33981));
    }

    public static void pointwiseAccountMontgomery(Poly poly, PolyVec polyVec, PolyVec polyVec2, KyberEngine kyberEngine) {
        Poly poly2 = new Poly(kyberEngine);
        Poly.baseMultMontgomery(poly, polyVec.getVectorIndex(0), polyVec2.getVectorIndex(0));
        for (int i3 = 1; i3 < kyberEngine.getKyberK(); i3++) {
            Poly.baseMultMontgomery(poly2, polyVec.getVectorIndex(i3), polyVec2.getVectorIndex(i3));
            poly.addCoeffs(poly2);
        }
        poly.reduce();
    }

    public void addPoly(PolyVec polyVec) {
        for (int i3 = 0; i3 < this.kyberK; i3++) {
            getVectorIndex(i3).addCoeffs(polyVec.getVectorIndex(i3));
        }
    }

    public byte[] compressPolyVec() {
        conditionalSubQ();
        byte[] bArr = new byte[this.engine.getKyberPolyVecCompressedBytes()];
        char c10 = 3;
        if (this.engine.getKyberPolyVecCompressedBytes() == this.kyberK * DilithiumEngine.DilithiumPolyT1PackedBytes) {
            short[] sArr = new short[4];
            int i3 = 0;
            for (int i10 = 0; i10 < this.kyberK; i10++) {
                for (int i11 = 0; i11 < 64; i11++) {
                    for (int i12 = 0; i12 < 4; i12++) {
                        sArr[i12] = (short) ((((getVectorIndex(i10).getCoeffIndex((i11 * 4) + i12) << 10) + 1664) / KyberEngine.KyberQ) & 1023);
                    }
                    short s10 = sArr[0];
                    bArr[i3] = (byte) s10;
                    short s11 = sArr[1];
                    bArr[i3 + 1] = (byte) ((s10 >> 8) | (s11 << 2));
                    int i13 = s11 >> 6;
                    short s12 = sArr[2];
                    bArr[i3 + 2] = (byte) (i13 | (s12 << 4));
                    int i14 = s12 >> 4;
                    short s13 = sArr[3];
                    bArr[i3 + 3] = (byte) (i14 | (s13 << 6));
                    bArr[i3 + 4] = (byte) (s13 >> 2);
                    i3 += 5;
                }
            }
        } else {
            if (this.engine.getKyberPolyVecCompressedBytes() != this.kyberK * 352) {
                throw new RuntimeException(StubApp.getString2(33999));
            }
            short[] sArr2 = new short[8];
            int i15 = 0;
            for (int i16 = 0; i16 < this.kyberK; i16++) {
                int i17 = 0;
                while (i17 < 32) {
                    for (int i18 = 0; i18 < 8; i18++) {
                        sArr2[i18] = (short) ((((getVectorIndex(i16).getCoeffIndex((i17 * 8) + i18) << 11) + 1664) / KyberEngine.KyberQ) & 2047);
                    }
                    short s14 = sArr2[0];
                    bArr[i15] = (byte) s14;
                    short s15 = sArr2[1];
                    bArr[i15 + 1] = (byte) ((s14 >> 8) | (s15 << 3));
                    short s16 = sArr2[2];
                    bArr[i15 + 2] = (byte) ((s15 >> 5) | (s16 << 6));
                    bArr[i15 + 3] = (byte) (s16 >> 2);
                    int i19 = s16 >> 10;
                    short s17 = sArr2[c10];
                    bArr[i15 + 4] = (byte) (i19 | (s17 << 1));
                    short s18 = sArr2[4];
                    bArr[i15 + 5] = (byte) ((s17 >> 7) | (s18 << 4));
                    short s19 = sArr2[5];
                    bArr[i15 + 6] = (byte) ((s18 >> 4) | (s19 << 7));
                    bArr[i15 + 7] = (byte) (s19 >> 1);
                    int i20 = s19 >> 9;
                    short s20 = sArr2[6];
                    bArr[i15 + 8] = (byte) (i20 | (s20 << 2));
                    int i21 = s20 >> 6;
                    short s21 = sArr2[7];
                    bArr[i15 + 9] = (byte) (i21 | (s21 << 5));
                    bArr[i15 + 10] = (byte) (s21 >> 3);
                    i15 += 11;
                    i17++;
                    c10 = c10;
                }
            }
        }
        return bArr;
    }

    public void conditionalSubQ() {
        for (int i3 = 0; i3 < this.kyberK; i3++) {
            getVectorIndex(i3).conditionalSubQ();
        }
    }

    public void decompressPolyVec(byte[] bArr) {
        int i3 = 3;
        int i10 = 1;
        int i11 = 6;
        short s10 = 2;
        if (this.engine.getKyberPolyVecCompressedBytes() == this.kyberK * DilithiumEngine.DilithiumPolyT1PackedBytes) {
            int i12 = 0;
            for (int i13 = 0; i13 < this.kyberK; i13++) {
                for (int i14 = 0; i14 < 64; i14++) {
                    int i15 = bArr[i12] & UByte.MAX_VALUE;
                    byte b2 = bArr[i12 + 1];
                    short s11 = (short) (i15 | ((short) ((b2 & UByte.MAX_VALUE) << 8)));
                    int i16 = (b2 & UByte.MAX_VALUE) >> 2;
                    byte b10 = bArr[i12 + 2];
                    short s12 = (short) (i16 | ((short) ((b10 & UByte.MAX_VALUE) << 6)));
                    int i17 = (b10 & UByte.MAX_VALUE) >> 4;
                    byte b11 = bArr[i12 + 3];
                    short[] sArr = {s11, s12, (short) (((short) ((b11 & UByte.MAX_VALUE) << 4)) | i17), (short) (((b11 & UByte.MAX_VALUE) >> 6) | ((short) ((bArr[i12 + 4] & UByte.MAX_VALUE) << 2)))};
                    i12 += 5;
                    for (int i18 = 0; i18 < 4; i18++) {
                        this.vec[i13].setCoeffIndex((i14 * 4) + i18, (short) ((((sArr[i18] & 1023) * KyberEngine.KyberQ) + 512) >> 10));
                    }
                }
            }
            return;
        }
        if (this.engine.getKyberPolyVecCompressedBytes() != this.kyberK * 352) {
            throw new RuntimeException(StubApp.getString2(33999));
        }
        int i19 = 0;
        for (int i20 = 0; i20 < this.kyberK; i20++) {
            int i21 = 0;
            while (i21 < 32) {
                int i22 = bArr[i19] & UByte.MAX_VALUE;
                byte b12 = bArr[i19 + 1];
                short s13 = (short) (i22 | (((short) (b12 & UByte.MAX_VALUE)) << 8));
                int i23 = (b12 & UByte.MAX_VALUE) >> i3;
                byte b13 = bArr[i19 + 2];
                short s14 = (short) (i23 | (((short) (b13 & UByte.MAX_VALUE)) << 5));
                int i24 = ((b13 & UByte.MAX_VALUE) >> i11) | (((short) (bArr[i19 + 3] & UByte.MAX_VALUE)) << s10);
                byte b14 = bArr[i19 + 4];
                short s15 = (short) (((short) ((b14 & UByte.MAX_VALUE) << 10)) | i24);
                int i25 = (b14 & UByte.MAX_VALUE) >> i10;
                byte b15 = bArr[i19 + 5];
                int i26 = i3;
                short s16 = (short) ((((short) (b15 & UByte.MAX_VALUE)) << 7) | i25);
                int i27 = (b15 & UByte.MAX_VALUE) >> 4;
                byte b16 = bArr[i19 + 6];
                int i28 = i10;
                short s17 = (short) ((((short) (b16 & UByte.MAX_VALUE)) << 4) | i27);
                int i29 = ((b16 & UByte.MAX_VALUE) >> 7) | (((short) (bArr[i19 + 7] & UByte.MAX_VALUE)) << 1);
                byte b17 = bArr[i19 + 8];
                int i30 = i11;
                short s18 = (short) (((short) ((b17 & UByte.MAX_VALUE) << 9)) | i29);
                int i31 = (b17 & UByte.MAX_VALUE) >> s10;
                byte b18 = bArr[i19 + 9];
                short s19 = s10;
                short s20 = (short) ((((short) (b18 & UByte.MAX_VALUE)) << 6) | i31);
                short s21 = (short) (((b18 & UByte.MAX_VALUE) >> 5) | (((short) (bArr[i19 + 10] & UByte.MAX_VALUE)) << 3));
                short[] sArr2 = new short[8];
                sArr2[0] = s13;
                sArr2[i28] = s14;
                sArr2[s19] = s15;
                sArr2[i26] = s16;
                sArr2[4] = s17;
                sArr2[5] = s18;
                sArr2[i30] = s20;
                sArr2[7] = s21;
                i19 += 11;
                for (int i32 = 0; i32 < 8; i32++) {
                    this.vec[i20].setCoeffIndex((i21 * 8) + i32, (short) ((((sArr2[i32] & 2047) * KyberEngine.KyberQ) + 1024) >> 11));
                }
                i21++;
                i3 = i26;
                i10 = i28;
                i11 = i30;
                s10 = s19;
            }
        }
    }

    public void fromBytes(byte[] bArr) {
        int i3 = 0;
        while (i3 < this.kyberK) {
            Poly vectorIndex = getVectorIndex(i3);
            int i10 = i3 * KyberEngine.KyberPolyBytes;
            i3++;
            vectorIndex.fromBytes(Arrays.copyOfRange(bArr, i10, i3 * KyberEngine.KyberPolyBytes));
        }
    }

    public Poly getVectorIndex(int i3) {
        return this.vec[i3];
    }

    public void polyVecInverseNttToMont() {
        for (int i3 = 0; i3 < this.kyberK; i3++) {
            getVectorIndex(i3).polyInverseNttToMont();
        }
    }

    public void polyVecNtt() {
        for (int i3 = 0; i3 < this.kyberK; i3++) {
            getVectorIndex(i3).polyNtt();
        }
    }

    public void reducePoly() {
        for (int i3 = 0; i3 < this.kyberK; i3++) {
            getVectorIndex(i3).reduce();
        }
    }

    public byte[] toBytes() {
        byte[] bArr = new byte[this.polyVecBytes];
        for (int i3 = 0; i3 < this.kyberK; i3++) {
            System.arraycopy(this.vec[i3].toBytes(), 0, bArr, i3 * KyberEngine.KyberPolyBytes, KyberEngine.KyberPolyBytes);
        }
        return bArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(StubApp.getString2(1557));
        for (int i3 = 0; i3 < this.kyberK; i3++) {
            stringBuffer.append(this.vec[i3].toString());
            if (i3 != this.kyberK - 1) {
                stringBuffer.append(StubApp.getString2(81));
            }
        }
        stringBuffer.append(StubApp.getString2(511));
        return stringBuffer.toString();
    }

    public PolyVec(KyberEngine kyberEngine) {
        this.engine = kyberEngine;
        this.kyberK = kyberEngine.getKyberK();
        this.polyVecBytes = kyberEngine.getKyberPolyVecBytes();
        this.vec = new Poly[this.kyberK];
        for (int i3 = 0; i3 < this.kyberK; i3++) {
            this.vec[i3] = new Poly(kyberEngine);
        }
    }
}
