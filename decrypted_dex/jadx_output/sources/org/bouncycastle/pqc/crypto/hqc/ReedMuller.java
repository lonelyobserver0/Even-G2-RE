package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class ReedMuller {

    public static class Codeword {
        int[] type32 = new int[4];
        int[] type8 = new int[16];
    }

    private static int Bit0Mask(int i3) {
        return -(i3 & 1);
    }

    public static void decode(long[] jArr, long[] jArr2, int i3, int i10) {
        byte[] bArr = new byte[i3];
        Utils.fromLongArrayToByteArray(bArr, jArr, i3 * 8);
        int length = jArr2.length / 2;
        Codeword[] codewordArr = new Codeword[length];
        int[] iArr = new int[jArr2.length * 2];
        Utils.fromLongArrayToByte32Array(iArr, jArr2);
        for (int i11 = 0; i11 < length; i11++) {
            codewordArr[i11] = new Codeword();
            for (int i12 = 0; i12 < 4; i12++) {
                codewordArr[i11].type32[i12] = iArr[(i11 * 4) + i12];
            }
        }
        int[] iArr2 = new int[128];
        for (int i13 = 0; i13 < i3; i13++) {
            expandThenSum(iArr2, codewordArr, i13 * i10, i10);
            int[] iArr3 = new int[128];
            hadamardTransform(iArr2, iArr3);
            iArr3[0] = iArr3[0] - (i10 * 64);
            findPeaks(iArr3);
            bArr[i13] = (byte) findPeaks(iArr3);
        }
        int[] iArr4 = new int[length * 4];
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            int[] iArr5 = codewordArr[i15].type32;
            System.arraycopy(iArr5, 0, iArr4, i14, iArr5.length);
            i14 += 4;
        }
        Utils.fromByte32ArrayToLongArray(jArr2, iArr4);
        Utils.fromByteArrayToLongArray(jArr, bArr);
    }

    public static void encode(long[] jArr, long[] jArr2, int i3, int i10) {
        byte[] bArr = new byte[i3];
        Utils.fromLongArrayToByteArray(bArr, jArr2, i3 * 8);
        int i11 = i3 * i10;
        Codeword[] codewordArr = new Codeword[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            codewordArr[i12] = new Codeword();
        }
        for (int i13 = 0; i13 < i3; i13++) {
            int i14 = i13 * i10;
            encodeSub(codewordArr[i14], bArr[i13]);
            for (int i15 = 1; i15 < i10; i15++) {
                codewordArr[i14 + i15] = codewordArr[i14];
            }
        }
        int[] iArr = new int[i11 * 4];
        int i16 = 0;
        for (int i17 = 0; i17 < i11; i17++) {
            int[] iArr2 = codewordArr[i17].type32;
            System.arraycopy(iArr2, 0, iArr, i16, iArr2.length);
            i16 += 4;
        }
        Utils.fromByte32ArrayToLongArray(jArr, iArr);
    }

    public static void encodeSub(Codeword codeword, int i3) {
        int Bit0Mask = ((((Bit0Mask(i3 >> 7) ^ (Bit0Mask(i3) & (-1431655766))) ^ (Bit0Mask(i3 >> 1) & (-858993460))) ^ (Bit0Mask(i3 >> 2) & (-252645136))) ^ (Bit0Mask(i3 >> 3) & (-16711936))) ^ (Bit0Mask(i3 >> 4) & (-65536));
        codeword.type32[0] = Bit0Mask;
        int i10 = i3 >> 5;
        int Bit0Mask2 = Bit0Mask ^ Bit0Mask(i10);
        codeword.type32[1] = Bit0Mask2;
        int Bit0Mask3 = Bit0Mask(i3 >> 6) ^ Bit0Mask2;
        codeword.type32[3] = Bit0Mask3;
        codeword.type32[2] = Bit0Mask3 ^ Bit0Mask(i10);
    }

    private static void expandThenSum(int[] iArr, Codeword[] codewordArr, int i3, int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            for (int i12 = 0; i12 < 32; i12++) {
                iArr[(i11 * 32) + i12] = (codewordArr[i3].type32[i11] >> i12) & 1;
            }
        }
        for (int i13 = 1; i13 < i10; i13++) {
            for (int i14 = 0; i14 < 4; i14++) {
                for (int i15 = 0; i15 < 32; i15++) {
                    int i16 = (i14 * 32) + i15;
                    iArr[i16] = iArr[i16] + ((codewordArr[i13 + i3].type32[i14] >> i15) & 1);
                }
            }
        }
    }

    private static int findPeaks(int[] iArr) {
        int i3 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 128; i12++) {
            int i13 = iArr[i12];
            int i14 = i13 > 0 ? -1 : 0;
            int i15 = ((~i14) & (-i13)) | (i14 & i13);
            if (i15 > i11) {
                i3 = i13;
            }
            if (i15 > i11) {
                i10 = i12;
            }
            if (i15 > i11) {
                i11 = i15;
            }
        }
        return i10 | ((i3 > 0 ? 1 : 0) * 128);
    }

    private static void hadamardTransform(int[] iArr, int[] iArr2) {
        int[] clone = Arrays.clone(iArr);
        int[] clone2 = Arrays.clone(iArr2);
        int i3 = 0;
        while (i3 < 7) {
            for (int i10 = 0; i10 < 64; i10++) {
                int i11 = i10 * 2;
                int i12 = i11 + 1;
                clone2[i10] = clone[i11] + clone[i12];
                clone2[i10 + 64] = clone[i11] - clone[i12];
            }
            int[] clone3 = Arrays.clone(clone);
            int[] clone4 = Arrays.clone(clone2);
            i3++;
            clone2 = Arrays.clone(clone3);
            clone = clone4;
        }
        System.arraycopy(clone2, 0, iArr, 0, iArr.length);
        System.arraycopy(clone, 0, iArr2, 0, iArr2.length);
    }
}
