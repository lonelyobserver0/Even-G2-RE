package org.bouncycastle.crypto.modes.kgcm;

import kotlin.text.Typography;
import org.bouncycastle.math.raw.Interleave;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KGCMUtil_256 {
    public static final int SIZE = 4;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void copy(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static boolean equal(long[] jArr, long[] jArr2) {
        return ((jArr2[3] ^ jArr[3]) | (((jArr[0] ^ jArr2[0]) | (jArr[1] ^ jArr2[1])) | (jArr[2] ^ jArr2[2]))) == 0;
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        boolean z2;
        char c10;
        long j;
        int i3 = 0;
        long j3 = jArr[0];
        boolean z10 = true;
        long j10 = jArr[1];
        char c11 = 2;
        long j11 = jArr[2];
        char c12 = 3;
        long j12 = jArr[3];
        long j13 = jArr2[0];
        long j14 = jArr2[1];
        long j15 = jArr2[2];
        long j16 = jArr2[3];
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        long j20 = 0;
        long j21 = 0;
        while (true) {
            z2 = z10;
            c10 = c11;
            j = j11;
            if (i3 >= 64) {
                break;
            }
            long j22 = -(j3 & 1);
            j3 >>>= z2 ? 1L : 0L;
            j17 ^= j13 & j22;
            char c13 = c12;
            long j23 = -(j10 & 1);
            j10 >>>= z2 ? 1L : 0L;
            j18 = (j18 ^ (j14 & j22)) ^ (j13 & j23);
            j19 = (j19 ^ (j15 & j22)) ^ (j14 & j23);
            j20 = (j20 ^ (j16 & j22)) ^ (j15 & j23);
            j21 ^= j16 & j23;
            long j24 = j16 >> 63;
            j16 = (j16 << (z2 ? 1L : 0L)) | (j15 >>> 63);
            j15 = (j15 << (z2 ? 1L : 0L)) | (j14 >>> 63);
            j14 = (j13 >>> 63) | (j14 << (z2 ? 1L : 0L));
            j13 = (j13 << (z2 ? 1L : 0L)) ^ (j24 & 1061);
            i3++;
            c12 = c13;
            z10 = z2 ? 1 : 0;
            c11 = c10;
            j11 = j;
            j12 = j12;
        }
        char c14 = c12;
        long j25 = j12;
        char c15 = Typography.greater;
        long j26 = (((j16 >>> 62) ^ j13) ^ (j16 >>> 59)) ^ (j16 >>> 54);
        long j27 = ((j16 ^ (j16 << c10)) ^ (j16 << 5)) ^ (j16 << 10);
        int i10 = 0;
        while (i10 < 64) {
            long j28 = -(j & 1);
            j >>>= z2 ? 1L : 0L;
            j17 ^= j27 & j28;
            char c16 = c15;
            long j29 = j26;
            long j30 = -(j25 & 1);
            j25 >>>= z2 ? 1L : 0L;
            long j31 = (j18 ^ (j26 & j28)) ^ (j27 & j30);
            j19 = (j19 ^ (j14 & j28)) ^ (j29 & j30);
            j20 = (j20 ^ (j15 & j28)) ^ (j14 & j30);
            j21 ^= j15 & j30;
            long j32 = j15 >> 63;
            j15 = (j15 << (z2 ? 1L : 0L)) | (j14 >>> 63);
            j14 = (j29 >>> 63) | (j14 << (z2 ? 1L : 0L));
            long j33 = (j29 << (z2 ? 1L : 0L)) | (j27 >>> 63);
            j27 = (j27 << (z2 ? 1L : 0L)) ^ (j32 & 1061);
            i10++;
            c15 = c16;
            j26 = j33;
            j18 = j31;
        }
        jArr3[0] = j17 ^ (((j21 ^ (j21 << c10)) ^ (j21 << 5)) ^ (j21 << 10));
        jArr3[z2 ? 1 : 0] = j18 ^ (((j21 >>> c15) ^ (j21 >>> 59)) ^ (j21 >>> 54));
        jArr3[c10] = j19;
        jArr3[c14] = j20;
    }

    public static void multiplyX(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j3 = jArr[1];
        long j10 = jArr[2];
        long j11 = jArr[3];
        jArr2[0] = ((j11 >> 63) & 1061) ^ (j << 1);
        jArr2[1] = (j >>> 63) | (j3 << 1);
        jArr2[2] = (j10 << 1) | (j3 >>> 63);
        jArr2[3] = (j11 << 1) | (j10 >>> 63);
    }

    public static void multiplyX8(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j3 = jArr[1];
        long j10 = jArr[2];
        long j11 = jArr[3];
        long j12 = j11 >>> 56;
        jArr2[0] = ((((j << 8) ^ j12) ^ (j12 << 2)) ^ (j12 << 5)) ^ (j12 << 10);
        jArr2[1] = (j >>> 56) | (j3 << 8);
        jArr2[2] = (j10 << 8) | (j3 >>> 56);
        jArr2[3] = (j11 << 8) | (j10 >>> 56);
    }

    public static void one(long[] jArr) {
        jArr[0] = 1;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
    }

    public static void square(long[] jArr, long[] jArr2) {
        int i3 = 8;
        long[] jArr3 = new long[8];
        for (int i10 = 0; i10 < 4; i10++) {
            Interleave.expand64To128(jArr[i10], jArr3, i10 << 1);
        }
        while (true) {
            int i11 = i3 - 1;
            if (i11 < 4) {
                copy(jArr3, jArr2);
                return;
            }
            long j = jArr3[i11];
            int i12 = i3 - 5;
            jArr3[i12] = jArr3[i12] ^ ((((j << 2) ^ j) ^ (j << 5)) ^ (j << 10));
            int i13 = i3 - 4;
            jArr3[i13] = ((j >>> 54) ^ ((j >>> 62) ^ (j >>> 59))) ^ jArr3[i13];
            i3 = i11;
        }
    }

    public static void x(long[] jArr) {
        jArr[0] = 2;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
    }

    public static void zero(long[] jArr) {
        jArr[0] = 0;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
    }
}
