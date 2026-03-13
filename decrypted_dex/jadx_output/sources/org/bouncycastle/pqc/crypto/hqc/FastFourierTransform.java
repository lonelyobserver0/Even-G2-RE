package org.bouncycastle.pqc.crypto.hqc;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class FastFourierTransform {
    public static void computeFFTBetas(int[] iArr, int i3) {
        int i10 = 0;
        while (true) {
            int i11 = i3 - 1;
            if (i10 >= i11) {
                return;
            }
            iArr[i10] = 1 << (i11 - i10);
            i10++;
        }
    }

    public static void computeFFTRec(int[] iArr, int[] iArr2, int i3, int i10, int i11, int[] iArr3, int i12, int i13) {
        int i14;
        int i15;
        int[] iArr4;
        int i16 = 1;
        int i17 = 1 << (i12 - 2);
        int i18 = i13 - 2;
        int i19 = 1 << i18;
        int[] iArr5 = new int[i17];
        int[] iArr6 = new int[i17];
        int[] iArr7 = new int[i18];
        int[] iArr8 = new int[i18];
        int[] iArr9 = new int[i19];
        int[] iArr10 = new int[i19];
        int[] iArr11 = new int[i19];
        int[] iArr12 = new int[(i13 - i12) + 1];
        if (i11 == 1) {
            for (int i20 = 0; i20 < i10; i20++) {
                iArr12[i20] = GFCalculator.mult(iArr3[i20], iArr2[1]);
            }
            iArr[0] = iArr2[0];
            for (int i21 = 0; i21 < i10; i21++) {
                for (int i22 = 0; i22 < i16; i22++) {
                    iArr[i16 + i22] = iArr[i22] ^ iArr12[i21];
                }
                i16 <<= 1;
            }
            return;
        }
        int i23 = i10 - 1;
        if (iArr3[i23] != 1) {
            int i24 = 1 << i11;
            i14 = 1;
            i15 = 0;
            int i25 = 1;
            while (true) {
                iArr4 = iArr8;
                if (i16 >= i24) {
                    break;
                }
                i25 = GFCalculator.mult(i25, iArr3[i23]);
                iArr2[i16] = GFCalculator.mult(i25, iArr2[i16]);
                i16++;
                iArr8 = iArr4;
            }
        } else {
            i14 = 1;
            i15 = 0;
            iArr4 = iArr8;
        }
        computeRadix(iArr5, iArr6, iArr2, i11, i12);
        for (int i26 = i15; i26 < i23; i26++) {
            int mult = GFCalculator.mult(iArr3[i26], GFCalculator.inverse(iArr3[i23]));
            iArr7[i26] = mult;
            iArr4[i26] = GFCalculator.mult(mult, mult) ^ iArr7[i26];
        }
        computeSubsetSum(iArr9, iArr7, i23);
        int i27 = i11 - 1;
        int[] iArr13 = iArr4;
        computeFFTRec(iArr10, iArr5, (i3 + 1) / 2, i23, i27, iArr13, i12, i13);
        int i28 = i14 << (i23 & 15);
        if (i3 <= 3) {
            iArr[i15] = iArr10[i15];
            iArr[i28] = iArr10[i15] ^ iArr6[i15];
            for (int i29 = i14; i29 < i28; i29++) {
                int mult2 = iArr10[i29] ^ GFCalculator.mult(iArr9[i29], iArr6[i15]);
                iArr[i29] = mult2;
                iArr[i28 + i29] = mult2 ^ iArr6[i15];
            }
            return;
        }
        computeFFTRec(iArr11, iArr6, i3 / 2, i23, i27, iArr13, i12, i13);
        int i30 = i15;
        System.arraycopy(iArr11, i30, iArr, i28, i28);
        iArr[i30] = iArr10[i30];
        iArr[i28] = iArr10[i30] ^ iArr[i28];
        for (int i31 = i14; i31 < i28; i31++) {
            int mult3 = iArr10[i31] ^ GFCalculator.mult(iArr9[i31], iArr11[i31]);
            iArr[i31] = mult3;
            int i32 = i28 + i31;
            iArr[i32] = mult3 ^ iArr[i32];
        }
    }

    public static void computeRadix(int[] iArr, int[] iArr2, int[] iArr3, int i3, int i10) {
        if (i3 == 1) {
            iArr[0] = iArr3[0];
            iArr2[0] = iArr3[1];
            return;
        }
        if (i3 == 2) {
            iArr[0] = iArr3[0];
            int i11 = iArr3[2];
            int i12 = iArr3[3];
            int i13 = i11 ^ i12;
            iArr[1] = i13;
            iArr2[0] = i13 ^ iArr3[1];
            iArr2[1] = i12;
            return;
        }
        if (i3 == 3) {
            iArr[0] = iArr3[0];
            int i14 = iArr3[4];
            int i15 = iArr3[6];
            iArr[2] = i14 ^ i15;
            int i16 = iArr3[7];
            iArr[3] = i15 ^ i16;
            int i17 = iArr3[3];
            int i18 = iArr3[5];
            int i19 = (i17 ^ i18) ^ i16;
            iArr2[1] = i19;
            iArr2[2] = i18 ^ i15;
            iArr2[3] = i16;
            int i20 = (iArr3[2] ^ iArr[2]) ^ i19;
            iArr[1] = i20;
            iArr2[0] = i20 ^ iArr3[1];
            return;
        }
        if (i3 != 4) {
            computeRadixBig(iArr, iArr2, iArr3, i3, i10);
            return;
        }
        int i21 = iArr3[8];
        int i22 = iArr3[12];
        iArr[4] = i21 ^ i22;
        int i23 = iArr3[14];
        iArr[6] = i22 ^ i23;
        int i24 = iArr3[15];
        iArr[7] = i23 ^ i24;
        int i25 = iArr3[11];
        int i26 = iArr3[13];
        int i27 = i25 ^ i26;
        iArr2[5] = i27;
        iArr2[6] = i26 ^ i23;
        iArr2[7] = i24;
        int i28 = iArr3[10];
        int i29 = (i22 ^ i28) ^ i27;
        iArr[5] = i29;
        int i30 = iArr3[9];
        iArr2[4] = i29 ^ (i30 ^ i26);
        iArr[0] = iArr3[0];
        int i31 = (iArr3[7] ^ i25) ^ i24;
        iArr2[3] = i31;
        int i32 = (i23 ^ (iArr3[6] ^ i28)) ^ i31;
        iArr[3] = i32;
        int i33 = (iArr3[4] ^ iArr[4]) ^ i32;
        int i34 = iArr2[3];
        iArr[2] = i33 ^ i34;
        int i35 = iArr3[3];
        int i36 = (((iArr3[5] ^ i35) ^ i30) ^ i26) ^ i34;
        iArr2[1] = i36;
        iArr2[2] = i32 ^ (i35 ^ i36);
        int i37 = (iArr3[2] ^ iArr[2]) ^ i36;
        iArr[1] = i37;
        iArr2[0] = i37 ^ iArr3[1];
    }

    public static void computeRadixBig(int[] iArr, int[] iArr2, int[] iArr3, int i3, int i10) {
        int i11 = 1 << (i3 - 2);
        int i12 = 1 << (i10 - 2);
        int i13 = i12 * 2;
        int[] iArr4 = new int[i13];
        int[] iArr5 = new int[i13];
        int[] iArr6 = new int[i12];
        int[] iArr7 = new int[i12];
        int[] iArr8 = new int[i12];
        int[] iArr9 = new int[i12];
        int i14 = i11 * 3;
        int i15 = i11 * 2;
        Utils.copyBytes(iArr3, i14, iArr4, 0, i15);
        Utils.copyBytes(iArr3, i14, iArr4, i11, i15);
        Utils.copyBytes(iArr3, 0, iArr5, 0, i11 * 4);
        for (int i16 = 0; i16 < i11; i16++) {
            int i17 = iArr4[i16] ^ iArr3[i15 + i16];
            iArr4[i16] = i17;
            int i18 = i11 + i16;
            iArr5[i18] = iArr5[i18] ^ i17;
        }
        int i19 = i3 - 1;
        computeRadix(iArr6, iArr7, iArr4, i19, i10);
        computeRadix(iArr8, iArr9, iArr5, i19, i10);
        Utils.copyBytes(iArr8, 0, iArr, 0, i15);
        Utils.copyBytes(iArr6, 0, iArr, i11, i15);
        Utils.copyBytes(iArr9, 0, iArr2, 0, i15);
        Utils.copyBytes(iArr7, 0, iArr2, i11, i15);
    }

    public static void computeSubsetSum(int[] iArr, int[] iArr2, int i3) {
        iArr[0] = 0;
        for (int i10 = 0; i10 < i3; i10++) {
            int i11 = 0;
            while (true) {
                int i12 = 1 << i10;
                if (i11 < i12) {
                    iArr[i12 + i11] = iArr2[i10] ^ iArr[i11];
                    i11++;
                }
            }
        }
    }

    public static void fastFourierTransform(int[] iArr, int[] iArr2, int i3, int i10) {
        int i11 = 1 << i10;
        int[] iArr3 = new int[i11];
        int[] iArr4 = new int[i11];
        int[] iArr5 = new int[7];
        int[] iArr6 = new int[128];
        int[] iArr7 = new int[128];
        int[] iArr8 = new int[7];
        int[] iArr9 = new int[128];
        computeFFTBetas(iArr8, 8);
        computeSubsetSum(iArr9, iArr8, 7);
        computeRadix(iArr3, iArr4, iArr2, i10, i10);
        for (int i12 = 0; i12 < 7; i12++) {
            int i13 = iArr8[i12];
            iArr5[i12] = GFCalculator.mult(i13, i13) ^ iArr8[i12];
        }
        int i14 = i10 - 1;
        computeFFTRec(iArr6, iArr3, (i3 + 1) / 2, 7, i14, iArr5, i10, 8);
        computeFFTRec(iArr7, iArr4, i3 / 2, 7, i14, iArr5, i10, 8);
        System.arraycopy(iArr7, 0, iArr, 128, 128);
        iArr[0] = iArr6[0];
        iArr[128] = iArr[128] ^ iArr6[0];
        for (int i15 = 1; i15 < 128; i15++) {
            int mult = iArr6[i15] ^ GFCalculator.mult(iArr9[i15], iArr7[i15]);
            iArr[i15] = mult;
            int i16 = 128 + i15;
            iArr[i16] = mult ^ iArr[i16];
        }
    }

    public static void fastFourierTransformGetError(byte[] bArr, int[] iArr, int i3, int[] iArr2) {
        int[] iArr3 = new int[7];
        int[] iArr4 = new int[i3];
        computeFFTBetas(iArr3, 8);
        computeSubsetSum(iArr4, iArr3, 7);
        byte unsigned16Bits = (byte) (bArr[0] ^ (Utils.toUnsigned16Bits((-iArr[0]) >> 15) ^ 1));
        bArr[0] = unsigned16Bits;
        bArr[0] = (byte) (unsigned16Bits ^ (Utils.toUnsigned16Bits((-iArr[i3]) >> 15) ^ 1));
        for (int i10 = 1; i10 < i3; i10++) {
            int i11 = 255 - iArr2[iArr4[i10]];
            bArr[i11] = (byte) (bArr[i11] ^ (Math.abs((-iArr[i10]) >> 15) ^ 1));
            int i12 = 255 - iArr2[iArr4[i10] ^ 1];
            bArr[i12] = (byte) (bArr[i12] ^ (Math.abs((-iArr[i3 + i10]) >> 15) ^ 1));
        }
    }
}
