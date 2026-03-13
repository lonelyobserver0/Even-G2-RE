package org.bouncycastle.crypto.modes.kgcm;

import org.bouncycastle.math.raw.Interleave;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KGCMUtil_128 {
    public static final int SIZE = 2;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }

    public static void copy(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
    }

    public static boolean equal(long[] jArr, long[] jArr2) {
        return ((jArr2[1] ^ jArr[1]) | (jArr[0] ^ jArr2[0])) == 0;
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        int i3 = 0;
        long j = jArr[0];
        long j3 = jArr[1];
        long j10 = jArr2[0];
        long j11 = jArr2[1];
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        while (i3 < 64) {
            long j15 = j;
            int i10 = i3;
            long j16 = -(j15 & 1);
            j12 ^= j10 & j16;
            long j17 = (j16 & j11) ^ j14;
            long j18 = -(j3 & 1);
            j3 >>>= 1;
            long j19 = j17 ^ (j10 & j18);
            j13 ^= j18 & j11;
            long j20 = j11 >> 63;
            j11 = (j11 << 1) | (j10 >>> 63);
            j10 = (j10 << 1) ^ (j20 & 135);
            j14 = j19;
            i3 = i10 + 1;
            j = j15 >>> 1;
        }
        jArr3[0] = ((((j13 << 1) ^ j13) ^ (j13 << 2)) ^ (j13 << 7)) ^ j12;
        jArr3[1] = (((j13 >>> 63) ^ (j13 >>> 62)) ^ (j13 >>> 57)) ^ j14;
    }

    public static void multiplyX(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j3 = jArr[1];
        jArr2[0] = ((j3 >> 63) & 135) ^ (j << 1);
        jArr2[1] = (j >>> 63) | (j3 << 1);
    }

    public static void multiplyX8(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j3 = jArr[1];
        long j10 = j3 >>> 56;
        jArr2[0] = (j10 << 7) ^ ((((j << 8) ^ j10) ^ (j10 << 1)) ^ (j10 << 2));
        jArr2[1] = (j >>> 56) | (j3 << 8);
    }

    public static void one(long[] jArr) {
        jArr[0] = 1;
        jArr[1] = 0;
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[4];
        Interleave.expand64To128(jArr[0], jArr3, 0);
        Interleave.expand64To128(jArr[1], jArr3, 2);
        long j = jArr3[0];
        long j3 = jArr3[1];
        long j10 = jArr3[2];
        long j11 = jArr3[3];
        long j12 = j10 ^ ((j11 >>> 57) ^ ((j11 >>> 63) ^ (j11 >>> 62)));
        jArr2[0] = j ^ ((((j12 << 1) ^ j12) ^ (j12 << 2)) ^ (j12 << 7));
        jArr2[1] = (j3 ^ ((((j11 << 1) ^ j11) ^ (j11 << 2)) ^ (j11 << 7))) ^ ((j12 >>> 57) ^ ((j12 >>> 63) ^ (j12 >>> 62)));
    }

    public static void x(long[] jArr) {
        jArr[0] = 2;
        jArr[1] = 0;
    }

    public static void zero(long[] jArr) {
        jArr[0] = 0;
        jArr[1] = 0;
    }
}
