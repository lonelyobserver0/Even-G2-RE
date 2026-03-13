package org.bouncycastle.crypto.modes.kgcm;

import org.bouncycastle.math.raw.Interleave;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KGCMUtil_512 {
    public static final int SIZE = 8;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static void copy(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
        jArr2[5] = jArr[5];
        jArr2[6] = jArr[6];
        jArr2[7] = jArr[7];
    }

    public static boolean equal(long[] jArr, long[] jArr2) {
        return ((jArr2[7] ^ jArr[7]) | (((((((jArr[0] ^ jArr2[0]) | (jArr[1] ^ jArr2[1])) | (jArr[2] ^ jArr2[2])) | (jArr[3] ^ jArr2[3])) | (jArr[4] ^ jArr2[4])) | (jArr[5] ^ jArr2[5])) | (jArr[6] ^ jArr2[6]))) == 0;
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        int i3 = 0;
        long j = jArr2[0];
        boolean z2 = true;
        long j3 = jArr2[1];
        char c10 = 2;
        long j10 = jArr2[2];
        char c11 = 3;
        long j11 = jArr2[3];
        long j12 = jArr2[4];
        long j13 = jArr2[5];
        long j14 = jArr2[6];
        long j15 = jArr2[7];
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        long j20 = 0;
        long j21 = 0;
        long j22 = 0;
        long j23 = 0;
        long j24 = 0;
        while (true) {
            boolean z10 = z2;
            if (i3 >= 8) {
                char c12 = c10;
                jArr3[0] = j16 ^ (((j17 ^ (j17 << c12)) ^ (j17 << 5)) ^ (j17 << 8));
                jArr3[z10 ? 1 : 0] = j18 ^ (((j17 >>> 62) ^ (j17 >>> 59)) ^ (j17 >>> 56));
                jArr3[c12] = j19;
                jArr3[c11] = j20;
                jArr3[4] = j21;
                jArr3[5] = j22;
                jArr3[6] = j23;
                jArr3[7] = j24;
                return;
            }
            long j25 = jArr[i3];
            long j26 = jArr[i3 + 1];
            long j27 = j10;
            long j28 = j3;
            long j29 = j14;
            j14 = j13;
            j13 = j12;
            j12 = j11;
            long j30 = j27;
            char c13 = c10;
            int i10 = 0;
            while (i10 < 64) {
                char c14 = c11;
                long j31 = j30;
                long j32 = -(j25 & 1);
                j25 >>>= z10 ? 1L : 0L;
                j16 ^= j & j32;
                long j33 = j28;
                long j34 = -(j26 & 1);
                j26 >>>= z10 ? 1L : 0L;
                j18 = (j18 ^ (j28 & j32)) ^ (j & j34);
                j19 = (j19 ^ (j31 & j32)) ^ (j33 & j34);
                j20 = (j20 ^ (j12 & j32)) ^ (j31 & j34);
                j21 = (j21 ^ (j13 & j32)) ^ (j12 & j34);
                j22 = (j22 ^ (j14 & j32)) ^ (j13 & j34);
                j23 = (j23 ^ (j29 & j32)) ^ (j14 & j34);
                j24 = (j24 ^ (j15 & j32)) ^ (j29 & j34);
                j17 ^= j15 & j34;
                long j35 = j15 >> 63;
                j15 = (j15 << (z10 ? 1L : 0L)) | (j29 >>> 63);
                j29 = (j29 << (z10 ? 1L : 0L)) | (j14 >>> 63);
                j14 = (j14 << (z10 ? 1L : 0L)) | (j13 >>> 63);
                j13 = (j13 << (z10 ? 1L : 0L)) | (j12 >>> 63);
                j12 = (j12 << (z10 ? 1L : 0L)) | (j31 >>> 63);
                long j36 = (j31 << (z10 ? 1L : 0L)) | (j33 >>> 63);
                long j37 = (j33 << (z10 ? 1L : 0L)) | (j >>> 63);
                j = (j << (z10 ? 1L : 0L)) ^ (j35 & 293);
                i10++;
                c11 = c14;
                j30 = j36;
                j28 = j37;
            }
            long j38 = ((j ^ (j15 >>> 62)) ^ (j15 >>> 59)) ^ (j15 >>> 56);
            long j39 = ((j15 ^ (j15 << c13)) ^ (j15 << 5)) ^ (j15 << 8);
            i3 += 2;
            j15 = j29;
            c11 = c11;
            z2 = z10 ? 1 : 0;
            j11 = j30;
            j3 = j38;
            j = j39;
            c10 = c13;
            j10 = j28;
        }
    }

    public static void multiplyX(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j3 = jArr[1];
        long j10 = jArr[2];
        long j11 = jArr[3];
        long j12 = jArr[4];
        long j13 = jArr[5];
        long j14 = jArr[6];
        long j15 = jArr[7];
        jArr2[0] = (j << 1) ^ ((j15 >> 63) & 293);
        jArr2[1] = (j3 << 1) | (j >>> 63);
        jArr2[2] = (j10 << 1) | (j3 >>> 63);
        jArr2[3] = (j11 << 1) | (j10 >>> 63);
        jArr2[4] = (j12 << 1) | (j11 >>> 63);
        jArr2[5] = (j13 << 1) | (j12 >>> 63);
        jArr2[6] = (j14 << 1) | (j13 >>> 63);
        jArr2[7] = (j15 << 1) | (j14 >>> 63);
    }

    public static void multiplyX8(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j3 = jArr[1];
        long j10 = jArr[2];
        long j11 = jArr[3];
        long j12 = jArr[4];
        long j13 = jArr[5];
        long j14 = jArr[6];
        long j15 = jArr[7];
        long j16 = j15 >>> 56;
        jArr2[0] = ((((j << 8) ^ j16) ^ (j16 << 2)) ^ (j16 << 5)) ^ (j16 << 8);
        jArr2[1] = (j3 << 8) | (j >>> 56);
        jArr2[2] = (j10 << 8) | (j3 >>> 56);
        jArr2[3] = (j11 << 8) | (j10 >>> 56);
        jArr2[4] = (j12 << 8) | (j11 >>> 56);
        jArr2[5] = (j13 << 8) | (j12 >>> 56);
        jArr2[6] = (j14 << 8) | (j13 >>> 56);
        jArr2[7] = (j15 << 8) | (j14 >>> 56);
    }

    public static void one(long[] jArr) {
        jArr[0] = 1;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
        jArr[4] = 0;
        jArr[5] = 0;
        jArr[6] = 0;
        jArr[7] = 0;
    }

    public static void square(long[] jArr, long[] jArr2) {
        int i3 = 16;
        long[] jArr3 = new long[16];
        for (int i10 = 0; i10 < 8; i10++) {
            Interleave.expand64To128(jArr[i10], jArr3, i10 << 1);
        }
        while (true) {
            int i11 = i3 - 1;
            if (i11 < 8) {
                copy(jArr3, jArr2);
                return;
            }
            long j = jArr3[i11];
            int i12 = i3 - 9;
            jArr3[i12] = jArr3[i12] ^ ((((j << 2) ^ j) ^ (j << 5)) ^ (j << 8));
            int i13 = i3 - 8;
            jArr3[i13] = ((j >>> 56) ^ ((j >>> 62) ^ (j >>> 59))) ^ jArr3[i13];
            i3 = i11;
        }
    }

    public static void x(long[] jArr) {
        jArr[0] = 2;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
        jArr[4] = 0;
        jArr[5] = 0;
        jArr[6] = 0;
        jArr[7] = 0;
    }

    public static void zero(long[] jArr) {
        jArr[0] = 0;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
        jArr[4] = 0;
        jArr[5] = 0;
        jArr[6] = 0;
        jArr[7] = 0;
    }
}
