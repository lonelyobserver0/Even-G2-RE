package org.bouncycastle.pqc.crypto.saber;

import kotlin.UByte;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Poly {
    private static final int KARATSUBA_N = 64;
    private static int SCHB_N = 16;
    private final int N_RES;
    private final int N_SB;
    private final int N_SB_RES;
    private final int SABER_L;
    private final int SABER_N;
    private final SABEREngine engine;
    private final Utils utils;

    public Poly(SABEREngine sABEREngine) {
        this.engine = sABEREngine;
        this.SABER_L = sABEREngine.getSABER_L();
        int saber_n = sABEREngine.getSABER_N();
        this.SABER_N = saber_n;
        this.N_RES = saber_n << 1;
        this.N_SB = saber_n >> 2;
        this.N_SB_RES = (r0 * 2) - 1;
        this.utils = sABEREngine.getUtils();
    }

    private short OVERFLOWING_MUL(int i3, int i10) {
        return (short) (i3 * i10);
    }

    private void cbd(short[] sArr, byte[] bArr, int i3) {
        int i10 = 4;
        int[] iArr = new int[4];
        char c10 = 2;
        if (this.engine.getSABER_MU() == 6) {
            for (int i11 = 0; i11 < this.SABER_N / 4; i11++) {
                int load_littleendian = (int) load_littleendian(bArr, (i11 * 3) + i3, 3);
                int i12 = 0;
                for (int i13 = 0; i13 < 3; i13++) {
                    i12 += (load_littleendian >> i13) & 2396745;
                }
                iArr[0] = i12 & 7;
                iArr[1] = (i12 >>> 6) & 7;
                iArr[2] = (i12 >>> 12) & 7;
                iArr[3] = (i12 >>> 18) & 7;
                int i14 = i11 * 4;
                sArr[i14] = (short) (iArr[0] - ((i12 >>> 3) & 7));
                sArr[i14 + 1] = (short) (iArr[1] - ((i12 >>> 9) & 7));
                sArr[i14 + 2] = (short) (iArr[2] - ((i12 >>> 15) & 7));
                sArr[i14 + 3] = (short) (iArr[3] - (i12 >>> 21));
            }
            return;
        }
        if (this.engine.getSABER_MU() == 8) {
            for (int i15 = 0; i15 < this.SABER_N / 4; i15++) {
                int i16 = i15 * 4;
                int load_littleendian2 = (int) load_littleendian(bArr, i3 + i16, 4);
                int i17 = 0;
                for (int i18 = 0; i18 < 4; i18++) {
                    i17 += (load_littleendian2 >>> i18) & 286331153;
                }
                iArr[0] = i17 & 15;
                iArr[1] = (i17 >>> 8) & 15;
                iArr[2] = (i17 >>> 16) & 15;
                iArr[3] = (i17 >>> 24) & 15;
                sArr[i16] = (short) (iArr[0] - ((i17 >>> 4) & 15));
                sArr[i16 + 1] = (short) (iArr[1] - ((i17 >>> 12) & 15));
                sArr[i16 + 2] = (short) (iArr[2] - ((i17 >>> 20) & 15));
                sArr[i16 + 3] = (short) (iArr[3] - (i17 >>> 28));
            }
            return;
        }
        char c11 = '\n';
        if (this.engine.getSABER_MU() == 10) {
            int i19 = 0;
            while (i19 < this.SABER_N / i10) {
                long load_littleendian3 = load_littleendian(bArr, (i19 * 5) + i3, 5);
                long j = 0;
                for (int i20 = 0; i20 < 5; i20++) {
                    j += (load_littleendian3 >>> i20) & 35468117025L;
                }
                int[] iArr2 = iArr;
                iArr2[0] = (int) (j & 31);
                char c12 = c10;
                iArr2[1] = (int) ((j >>> c11) & 31);
                int i21 = i19;
                iArr2[c12] = (int) ((j >>> 20) & 31);
                iArr2[3] = (int) ((j >>> 30) & 31);
                int i22 = i21 * 4;
                sArr[i22] = (short) (iArr2[0] - ((int) ((j >>> 5) & 31)));
                sArr[i22 + 1] = (short) (iArr2[1] - ((int) ((j >>> 15) & 31)));
                sArr[i22 + 2] = (short) (iArr2[c12] - ((int) ((j >>> 25) & 31)));
                sArr[i22 + 3] = (short) (iArr2[3] - ((int) (j >>> 35)));
                i19 = i21 + 1;
                iArr = iArr2;
                c10 = c12;
                i10 = 4;
                c11 = '\n';
            }
        }
    }

    private void karatsuba_simple(int[] iArr, int[] iArr2, int[] iArr3) {
        int i3 = 31;
        int[] iArr4 = new int[31];
        int[] iArr5 = new int[31];
        int[] iArr6 = new int[31];
        int[] iArr7 = new int[63];
        int i10 = 0;
        while (true) {
            if (i10 >= 16) {
                break;
            }
            int i11 = iArr[i10];
            int i12 = iArr[i10 + 16];
            int i13 = iArr[i10 + 32];
            int i14 = iArr[i10 + 48];
            int i15 = 0;
            for (int i16 = 16; i15 < i16; i16 = 16) {
                int i17 = iArr2[i15];
                int i18 = iArr2[i15 + 16];
                int i19 = i10 + i15;
                iArr3[i19] = iArr3[i19] + OVERFLOWING_MUL(i11, i17);
                int i20 = i19 + 32;
                iArr3[i20] = iArr3[i20] + OVERFLOWING_MUL(i12, i18);
                int[] iArr8 = iArr4;
                iArr8[i19] = (int) (((i11 + i12) * (i17 + i18)) + iArr4[i19]);
                int i21 = iArr2[i15 + 32];
                int i22 = iArr2[i15 + 48];
                int i23 = i19 + 64;
                iArr3[i23] = iArr3[i23] + OVERFLOWING_MUL(i21, i13);
                int i24 = i19 + 96;
                iArr3[i24] = iArr3[i24] + OVERFLOWING_MUL(i22, i14);
                iArr6[i19] = iArr6[i19] + OVERFLOWING_MUL(i13 + i14, i21 + i22);
                int i25 = i17 + i21;
                int i26 = i11 + i13;
                iArr7[i19] = iArr7[i19] + OVERFLOWING_MUL(i25, i26);
                int i27 = i18 + i22;
                int i28 = i12 + i14;
                iArr7[i20] = iArr7[i20] + OVERFLOWING_MUL(i27, i28);
                iArr5[i19] = iArr5[i19] + OVERFLOWING_MUL(i25 + i27, i26 + i28);
                i15++;
                iArr4 = iArr8;
            }
            i10++;
            i3 = 31;
        }
        int[] iArr9 = iArr4;
        int i29 = 0;
        while (i29 < i3) {
            int i30 = i29 + 32;
            iArr5[i29] = (iArr5[i29] - iArr7[i29]) - iArr7[i30];
            iArr9[i29] = (iArr9[i29] - iArr3[i29]) - iArr3[i30];
            iArr6[i29] = (iArr6[i29] - iArr3[i29 + 64]) - iArr3[i29 + 96];
            i29++;
            i3 = 31;
        }
        for (int i31 = 0; i31 < i3; i31++) {
            int i32 = i31 + 16;
            iArr7[i32] = iArr7[i32] + iArr5[i31];
            iArr3[i32] = iArr3[i32] + iArr9[i31];
            int i33 = i31 + 80;
            iArr3[i33] = iArr3[i33] + iArr6[i31];
        }
        for (int i34 = 0; i34 < 63; i34++) {
            iArr7[i34] = (iArr7[i34] - iArr3[i34]) - iArr3[i34 + 64];
        }
        for (int i35 = 0; i35 < 63; i35++) {
            int i36 = i35 + 32;
            iArr3[i36] = iArr3[i36] + iArr7[i35];
        }
    }

    private long load_littleendian(byte[] bArr, int i3, int i10) {
        long j = bArr[i3] & UByte.MAX_VALUE;
        for (int i11 = 1; i11 < i10; i11++) {
            j |= (bArr[i3 + i11] & UByte.MAX_VALUE) << (i11 * 8);
        }
        return j;
    }

    private void poly_mul_acc(short[] sArr, short[] sArr2, short[] sArr3) {
        short[] sArr4 = new short[this.SABER_N * 2];
        toom_cook_4way(sArr, sArr2, sArr4);
        int i3 = this.SABER_N;
        while (true) {
            int i10 = this.SABER_N;
            if (i3 >= i10 * 2) {
                return;
            }
            int i11 = i3 - i10;
            sArr3[i11] = (short) ((sArr4[i3 - i10] - sArr4[i3]) + sArr3[i11]);
            i3++;
        }
    }

    private void toom_cook_4way(short[] sArr, short[] sArr2, short[] sArr3) {
        int i3 = this.N_SB;
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[i3];
        int[] iArr5 = new int[i3];
        int[] iArr6 = new int[i3];
        int[] iArr7 = new int[i3];
        int[] iArr8 = new int[i3];
        int[] iArr9 = new int[i3];
        int[] iArr10 = new int[i3];
        int[] iArr11 = new int[i3];
        int[] iArr12 = new int[i3];
        int[] iArr13 = new int[i3];
        int[] iArr14 = new int[i3];
        int i10 = this.N_SB_RES;
        int[] iArr15 = new int[i10];
        int[] iArr16 = new int[i10];
        int[] iArr17 = new int[i10];
        int[] iArr18 = new int[i10];
        int[] iArr19 = new int[i10];
        int[] iArr20 = new int[i10];
        int[] iArr21 = new int[i10];
        int i11 = 0;
        while (true) {
            int i12 = this.N_SB;
            if (i11 >= i12) {
                break;
            }
            short s10 = sArr[i11];
            short s11 = sArr[i11 + i12];
            short s12 = sArr[(i12 * 2) + i11];
            short s13 = sArr[(i12 * 3) + i11];
            short s14 = (short) (s10 + s12);
            short s15 = (short) (s11 + s13);
            iArr3[i11] = (short) (s14 + s15);
            iArr4[i11] = (short) (s14 - s15);
            short s16 = (short) (((s10 << 2) + s12) << 1);
            short s17 = (short) ((s11 << 2) + s13);
            iArr5[i11] = (short) (s16 + s17);
            iArr6[i11] = (short) (s16 - s17);
            iArr2[i11] = (short) ((s13 << 3) + (s12 << 2) + (s11 << 1) + s10);
            iArr7[i11] = s10;
            iArr[i11] = s13;
            i11++;
        }
        int i13 = 0;
        while (true) {
            int i14 = this.N_SB;
            if (i13 >= i14) {
                break;
            }
            short s18 = sArr2[i13];
            short s19 = sArr2[i13 + i14];
            short s20 = sArr2[(i14 * 2) + i13];
            short s21 = sArr2[(i14 * 3) + i13];
            int i15 = s18 + s20;
            int i16 = s19 + s21;
            iArr10[i13] = i15 + i16;
            iArr11[i13] = i15 - i16;
            int i17 = ((s18 << 2) + s20) << 1;
            int i18 = (s19 << 2) + s21;
            iArr12[i13] = i17 + i18;
            iArr13[i13] = i17 - i18;
            iArr9[i13] = (s21 << 3) + (s20 << 2) + (s19 << 1) + s18;
            iArr14[i13] = s18;
            iArr8[i13] = s21;
            i13++;
        }
        karatsuba_simple(iArr, iArr8, iArr15);
        karatsuba_simple(iArr2, iArr9, iArr16);
        karatsuba_simple(iArr3, iArr10, iArr17);
        karatsuba_simple(iArr4, iArr11, iArr18);
        karatsuba_simple(iArr5, iArr12, iArr19);
        karatsuba_simple(iArr6, iArr13, iArr20);
        karatsuba_simple(iArr7, iArr14, iArr21);
        for (int i19 = 0; i19 < this.N_SB_RES; i19++) {
            int i20 = iArr15[i19];
            int i21 = iArr16[i19];
            int i22 = iArr17[i19];
            int i23 = iArr18[i19];
            int i24 = iArr19[i19];
            int i25 = iArr20[i19];
            int i26 = iArr21[i19];
            int i27 = i25 - i24;
            int i28 = ((i23 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) - (i22 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH)) >>> 1;
            int i29 = i22 + i28;
            int i30 = ((i21 + i24) - (i29 << 6)) - i29;
            int i31 = (i29 - i26) - i20;
            int i32 = (i31 * 45) + i30;
            int i33 = (((((((i24 - i20) - (i26 << 6)) << 1) + i27) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) - (i31 << 3)) * 43691) >> 3;
            int i34 = (((i32 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) + ((i28 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) << 4)) * 36409) >> 1;
            int i35 = -(i28 + i34);
            int i36 = ((((i34 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) * 30) - ((i27 + i32) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH)) * 61167) >> 2;
            int i37 = i31 - i33;
            int i38 = i34 - i36;
            sArr3[i19] = (short) (sArr3[i19] + (i26 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
            int i39 = i19 + 64;
            sArr3[i39] = (short) (sArr3[i39] + (i36 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
            int i40 = i19 + 128;
            sArr3[i40] = (short) (sArr3[i40] + (i33 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
            int i41 = i19 + 192;
            sArr3[i41] = (short) (sArr3[i41] + (i35 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
            int i42 = i19 + 256;
            sArr3[i42] = (short) (sArr3[i42] + (i37 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
            int i43 = i19 + DilithiumEngine.DilithiumPolyT1PackedBytes;
            sArr3[i43] = (short) (sArr3[i43] + (i38 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
            int i44 = i19 + KyberEngine.KyberPolyBytes;
            sArr3[i44] = (short) (sArr3[i44] + (i20 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        }
    }

    public void GenMatrix(short[][][] sArr, byte[] bArr) {
        int saber_polyvecbytes = this.SABER_L * this.engine.getSABER_POLYVECBYTES();
        byte[] bArr2 = new byte[saber_polyvecbytes];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(128);
        sHAKEDigest.update(bArr, 0, this.engine.getSABER_SEEDBYTES());
        sHAKEDigest.doFinal(bArr2, 0, saber_polyvecbytes);
        for (int i3 = 0; i3 < this.SABER_L; i3++) {
            this.utils.BS2POLVECq(bArr2, this.engine.getSABER_POLYVECBYTES() * i3, sArr[i3]);
        }
    }

    public void GenSecret(short[][] sArr, byte[] bArr) {
        int saber_polycoinbytes = this.SABER_L * this.engine.getSABER_POLYCOINBYTES();
        byte[] bArr2 = new byte[saber_polycoinbytes];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(128);
        sHAKEDigest.update(bArr, 0, this.engine.getSABER_NOISE_SEEDBYTES());
        sHAKEDigest.doFinal(bArr2, 0, saber_polycoinbytes);
        for (int i3 = 0; i3 < this.SABER_L; i3++) {
            cbd(sArr[i3], bArr2, this.engine.getSABER_POLYCOINBYTES() * i3);
        }
    }

    public void InnerProd(short[][] sArr, short[][] sArr2, short[] sArr3) {
        for (int i3 = 0; i3 < this.SABER_L; i3++) {
            poly_mul_acc(sArr[i3], sArr2[i3], sArr3);
        }
    }

    public void MatrixVectorMul(short[][][] sArr, short[][] sArr2, short[][] sArr3, int i3) {
        for (int i10 = 0; i10 < this.SABER_L; i10++) {
            for (int i11 = 0; i11 < this.SABER_L; i11++) {
                if (i3 == 1) {
                    poly_mul_acc(sArr[i11][i10], sArr2[i11], sArr3[i10]);
                } else {
                    poly_mul_acc(sArr[i10][i11], sArr2[i11], sArr3[i10]);
                }
            }
        }
    }
}
