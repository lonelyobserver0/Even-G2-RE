package org.bouncycastle.crypto.modes.gcm;

import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.util.Longs;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class GCMUtil {

    /* renamed from: E1, reason: collision with root package name */
    private static final int f19043E1 = -520093696;
    private static final long E1L = -2233785415175766016L;
    public static final int SIZE_BYTES = 16;
    public static final int SIZE_INTS = 4;
    public static final int SIZE_LONGS = 2;

    public static byte areEqual(byte[] bArr, byte[] bArr2) {
        int i3 = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            i3 |= bArr[i10] ^ bArr2[i10];
        }
        return (byte) ((((i3 >>> 1) | (i3 & 1)) - 1) >> 31);
    }

    public static void asBytes(int[] iArr, byte[] bArr) {
        Pack.intToBigEndian(iArr, 0, 4, bArr, 0);
    }

    public static void asInts(byte[] bArr, int[] iArr) {
        Pack.bigEndianToInt(bArr, 0, iArr, 0, 4);
    }

    public static void asLongs(byte[] bArr, long[] jArr) {
        Pack.bigEndianToLong(bArr, 0, jArr, 0, 2);
    }

    public static void copy(byte[] bArr, byte[] bArr2) {
        for (int i3 = 0; i3 < 16; i3++) {
            bArr2[i3] = bArr[i3];
        }
    }

    public static void divideP(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j3 = jArr[1];
        long j10 = j >> 63;
        jArr2[0] = ((j ^ (E1L & j10)) << 1) | (j3 >>> 63);
        jArr2[1] = (j3 << 1) | (-j10);
    }

    private static long implMul64(long j, long j3) {
        long j10 = j & 1229782938247303441L;
        long j11 = j & 2459565876494606882L;
        long j12 = j & 4919131752989213764L;
        long j13 = j & (-8608480567731124088L);
        long j14 = j3 & 1229782938247303441L;
        long j15 = j3 & 2459565876494606882L;
        long j16 = j3 & 4919131752989213764L;
        long j17 = j3 & (-8608480567731124088L);
        long j18 = (((j10 * j14) ^ (j11 * j17)) ^ (j12 * j16)) ^ (j13 * j15);
        long j19 = (((j10 * j15) ^ (j11 * j14)) ^ (j12 * j17)) ^ (j13 * j16);
        long j20 = (((j10 * j16) ^ (j11 * j15)) ^ (j12 * j14)) ^ (j13 * j17);
        return (j18 & 1229782938247303441L) | (j19 & 2459565876494606882L) | (j20 & 4919131752989213764L) | (((((j10 * j17) ^ (j11 * j16)) ^ (j12 * j15)) ^ (j13 * j14)) & (-8608480567731124088L));
    }

    public static void multiply(byte[] bArr, byte[] bArr2) {
        long[] asLongs = asLongs(bArr);
        multiply(asLongs, asLongs(bArr2));
        asBytes(asLongs, bArr);
    }

    public static void multiplyP(int[] iArr) {
        int i3 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        iArr[0] = (((i12 << 31) >> 31) & f19043E1) ^ (i3 >>> 1);
        iArr[1] = (i10 >>> 1) | (i3 << 31);
        iArr[2] = (i11 >>> 1) | (i10 << 31);
        iArr[3] = (i12 >>> 1) | (i11 << 31);
    }

    public static void multiplyP16(long[] jArr) {
        long j = jArr[0];
        long j3 = jArr[1];
        long j10 = j3 << 48;
        jArr[0] = (j10 >>> 7) ^ ((((j >>> 16) ^ j10) ^ (j10 >>> 1)) ^ (j10 >>> 2));
        jArr[1] = (j << 48) | (j3 >>> 16);
    }

    public static void multiplyP3(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j3 = jArr[1];
        long j10 = j3 << 61;
        jArr2[0] = (j10 >>> 7) ^ ((((j >>> 3) ^ j10) ^ (j10 >>> 1)) ^ (j10 >>> 2));
        jArr2[1] = (j << 61) | (j3 >>> 3);
    }

    public static void multiplyP4(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j3 = jArr[1];
        long j10 = j3 << 60;
        jArr2[0] = (j10 >>> 7) ^ ((((j >>> 4) ^ j10) ^ (j10 >>> 1)) ^ (j10 >>> 2));
        jArr2[1] = (j << 60) | (j3 >>> 4);
    }

    public static void multiplyP7(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j3 = jArr[1];
        long j10 = j3 << 57;
        jArr2[0] = (j10 >>> 7) ^ ((((j >>> 7) ^ j10) ^ (j10 >>> 1)) ^ (j10 >>> 2));
        jArr2[1] = (j << 57) | (j3 >>> 7);
    }

    public static void multiplyP8(int[] iArr) {
        int i3 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = i12 << 24;
        iArr[0] = (i13 >>> 7) ^ ((((i3 >>> 8) ^ i13) ^ (i13 >>> 1)) ^ (i13 >>> 2));
        iArr[1] = (i10 >>> 8) | (i3 << 24);
        iArr[2] = (i11 >>> 8) | (i10 << 24);
        iArr[3] = (i12 >>> 8) | (i11 << 24);
    }

    public static byte[] oneAsBytes() {
        byte[] bArr = new byte[16];
        bArr[0] = ByteCompanionObject.MIN_VALUE;
        return bArr;
    }

    public static int[] oneAsInts() {
        int[] iArr = new int[4];
        iArr[0] = Integer.MIN_VALUE;
        return iArr;
    }

    public static long[] oneAsLongs() {
        return new long[]{Long.MIN_VALUE, 0};
    }

    public static long[] pAsLongs() {
        return new long[]{4611686018427387904L, 0};
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[4];
        Interleave.expand64To128Rev(jArr[0], jArr3, 0);
        Interleave.expand64To128Rev(jArr[1], jArr3, 2);
        long j = jArr3[0];
        long j3 = jArr3[1];
        long j10 = jArr3[2];
        long j11 = jArr3[3];
        long j12 = j10 ^ ((j11 << 57) ^ ((j11 << 63) ^ (j11 << 62)));
        jArr2[0] = j ^ ((((j12 >>> 1) ^ j12) ^ (j12 >>> 2)) ^ (j12 >>> 7));
        jArr2[1] = (j3 ^ ((((j11 >>> 1) ^ j11) ^ (j11 >>> 2)) ^ (j11 >>> 7))) ^ ((j12 << 57) ^ ((j12 << 63) ^ (j12 << 62)));
    }

    public static void xor(byte[] bArr, int i3, byte[] bArr2, int i10, int i11) {
        while (true) {
            i11--;
            if (i11 < 0) {
                return;
            }
            int i12 = i3 + i11;
            bArr[i12] = (byte) (bArr[i12] ^ bArr2[i10 + i11]);
        }
    }

    public static int areEqual(int[] iArr, int[] iArr2) {
        int i3 = (iArr[3] ^ iArr2[3]) | (iArr2[0] ^ iArr[0]) | (iArr[1] ^ iArr2[1]) | (iArr2[2] ^ iArr[2]);
        return (((i3 & 1) | (i3 >>> 1)) - 1) >> 31;
    }

    public static void asBytes(long[] jArr, byte[] bArr) {
        Pack.longToBigEndian(jArr, 0, 2, bArr, 0);
    }

    public static int[] asInts(byte[] bArr) {
        int[] iArr = new int[4];
        Pack.bigEndianToInt(bArr, 0, iArr, 0, 4);
        return iArr;
    }

    public static long[] asLongs(byte[] bArr) {
        long[] jArr = new long[2];
        Pack.bigEndianToLong(bArr, 0, jArr, 0, 2);
        return jArr;
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
    }

    public static void multiply(byte[] bArr, long[] jArr) {
        long bigEndianToLong = Pack.bigEndianToLong(bArr, 0);
        long bigEndianToLong2 = Pack.bigEndianToLong(bArr, 8);
        long j = jArr[0];
        long j3 = jArr[1];
        long reverse = Longs.reverse(bigEndianToLong);
        long reverse2 = Longs.reverse(bigEndianToLong2);
        long reverse3 = Longs.reverse(j);
        long reverse4 = Longs.reverse(j3);
        long reverse5 = Longs.reverse(implMul64(reverse, reverse3));
        long implMul64 = implMul64(bigEndianToLong, j) << 1;
        long reverse6 = Longs.reverse(implMul64(reverse2, reverse4));
        long implMul642 = implMul64(bigEndianToLong2, j3);
        long j10 = implMul642 << 1;
        long reverse7 = Longs.reverse(implMul64(reverse ^ reverse2, reverse3 ^ reverse4));
        long implMul643 = ((implMul64(bigEndianToLong ^ bigEndianToLong2, j ^ j3) << 1) ^ ((reverse6 ^ implMul64) ^ j10)) ^ ((implMul642 << 63) ^ (implMul642 << 58));
        Pack.longToBigEndian(reverse5 ^ (((implMul643 >>> 2) ^ ((implMul643 >>> 1) ^ implMul643)) ^ (implMul643 >>> 7)), bArr, 0);
        Pack.longToBigEndian(((implMul643 << 57) ^ ((implMul643 << 63) ^ (implMul643 << 62))) ^ ((reverse7 ^ ((implMul64 ^ reverse5) ^ reverse6)) ^ (((j10 ^ (j10 >>> 1)) ^ (j10 >>> 2)) ^ (j10 >>> 7))), bArr, 8);
    }

    public static void multiplyP(int[] iArr, int[] iArr2) {
        int i3 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        iArr2[0] = (((i12 << 31) >> 31) & f19043E1) ^ (i3 >>> 1);
        iArr2[1] = (i10 >>> 1) | (i3 << 31);
        iArr2[2] = (i11 >>> 1) | (i10 << 31);
        iArr2[3] = (i12 >>> 1) | (i11 << 31);
    }

    public static void multiplyP8(int[] iArr, int[] iArr2) {
        int i3 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = i12 << 24;
        iArr2[0] = (i13 >>> 7) ^ ((((i3 >>> 8) ^ i13) ^ (i13 >>> 1)) ^ (i13 >>> 2));
        iArr2[1] = (i10 >>> 8) | (i3 << 24);
        iArr2[2] = (i11 >>> 8) | (i10 << 24);
        iArr2[3] = (i12 >>> 8) | (i11 << 24);
    }

    public static void xor(byte[] bArr, int i3, byte[] bArr2, int i10, byte[] bArr3, int i11) {
        int i12 = 0;
        do {
            bArr3[i11 + i12] = (byte) (bArr[i3 + i12] ^ bArr2[i10 + i12]);
            int i13 = i12 + 1;
            bArr3[i11 + i13] = (byte) (bArr2[i13 + i10] ^ bArr[i3 + i13]);
            int i14 = i12 + 2;
            bArr3[i11 + i14] = (byte) (bArr2[i14 + i10] ^ bArr[i3 + i14]);
            int i15 = i12 + 3;
            bArr3[i11 + i15] = (byte) (bArr2[i15 + i10] ^ bArr[i3 + i15]);
            i12 += 4;
        } while (i12 < 16);
    }

    public static long areEqual(long[] jArr, long[] jArr2) {
        long j = (jArr2[1] ^ jArr[1]) | (jArr[0] ^ jArr2[0]);
        return (((j & 1) | (j >>> 1)) - 1) >> 63;
    }

    public static byte[] asBytes(int[] iArr) {
        byte[] bArr = new byte[16];
        Pack.intToBigEndian(iArr, 0, 4, bArr, 0);
        return bArr;
    }

    public static void copy(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
    }

    public static void multiply(int[] iArr, int[] iArr2) {
        int i3 = iArr2[0];
        int i10 = iArr2[1];
        int i11 = iArr2[2];
        int i12 = iArr2[3];
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < 4; i17++) {
            int i18 = iArr[i17];
            for (int i19 = 0; i19 < 32; i19++) {
                int i20 = i18 >> 31;
                i18 <<= 1;
                i13 ^= i3 & i20;
                i14 ^= i10 & i20;
                i15 ^= i11 & i20;
                i16 ^= i20 & i12;
                int i21 = (i12 << 31) >> 8;
                i12 = (i12 >>> 1) | (i11 << 31);
                i11 = (i11 >>> 1) | (i10 << 31);
                i10 = (i10 >>> 1) | (i3 << 31);
                i3 = (i3 >>> 1) ^ (i21 & f19043E1);
            }
        }
        iArr[0] = i13;
        iArr[1] = i14;
        iArr[2] = i15;
        iArr[3] = i16;
    }

    public static void multiplyP(long[] jArr) {
        long j = jArr[0];
        long j3 = jArr[1];
        jArr[0] = (((j3 << 63) >> 63) & E1L) ^ (j >>> 1);
        jArr[1] = (j << 63) | (j3 >>> 1);
    }

    public static void multiplyP8(long[] jArr) {
        long j = jArr[0];
        long j3 = jArr[1];
        long j10 = j3 << 56;
        jArr[0] = (j10 >>> 7) ^ ((((j >>> 8) ^ j10) ^ (j10 >>> 1)) ^ (j10 >>> 2));
        jArr[1] = (j << 56) | (j3 >>> 8);
    }

    public static void xor(byte[] bArr, byte[] bArr2) {
        int i3 = 0;
        do {
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i3]);
            int i10 = i3 + 1;
            bArr[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
            int i11 = i3 + 2;
            bArr[i11] = (byte) (bArr[i11] ^ bArr2[i11]);
            int i12 = i3 + 3;
            bArr[i12] = (byte) (bArr[i12] ^ bArr2[i12]);
            i3 += 4;
        } while (i3 < 16);
    }

    public static byte[] asBytes(long[] jArr) {
        byte[] bArr = new byte[16];
        Pack.longToBigEndian(jArr, 0, 2, bArr, 0);
        return bArr;
    }

    public static void multiply(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j3 = jArr[1];
        long j10 = jArr2[0];
        long j11 = jArr2[1];
        long reverse = Longs.reverse(j);
        long reverse2 = Longs.reverse(j3);
        long reverse3 = Longs.reverse(j10);
        long reverse4 = Longs.reverse(j11);
        long reverse5 = Longs.reverse(implMul64(reverse, reverse3));
        long implMul64 = implMul64(j, j10) << 1;
        long reverse6 = Longs.reverse(implMul64(reverse2, reverse4));
        long implMul642 = implMul64(j3, j11);
        long j12 = implMul642 << 1;
        long reverse7 = Longs.reverse(implMul64(reverse ^ reverse2, reverse3 ^ reverse4));
        long implMul643 = ((implMul64(j ^ j3, j10 ^ j11) << 1) ^ ((reverse6 ^ implMul64) ^ j12)) ^ ((implMul642 << 63) ^ (implMul642 << 58));
        jArr[0] = reverse5 ^ ((implMul643 >>> 7) ^ (((implMul643 >>> 1) ^ implMul643) ^ (implMul643 >>> 2)));
        jArr[1] = ((implMul643 << 57) ^ ((implMul643 << 63) ^ (implMul643 << 62))) ^ ((reverse7 ^ ((implMul64 ^ reverse5) ^ reverse6)) ^ (((j12 ^ (j12 >>> 1)) ^ (j12 >>> 2)) ^ (j12 >>> 7)));
    }

    public static void multiplyP(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j3 = jArr[1];
        jArr2[0] = (((j3 << 63) >> 63) & E1L) ^ (j >>> 1);
        jArr2[1] = (j << 63) | (j3 >>> 1);
    }

    public static void multiplyP8(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j3 = jArr[1];
        long j10 = j3 << 56;
        jArr2[0] = (j10 >>> 7) ^ ((((j >>> 8) ^ j10) ^ (j10 >>> 1)) ^ (j10 >>> 2));
        jArr2[1] = (j << 56) | (j3 >>> 8);
    }

    public static void xor(byte[] bArr, byte[] bArr2, int i3) {
        int i10 = 0;
        do {
            bArr[i10] = (byte) (bArr[i10] ^ bArr2[i3 + i10]);
            int i11 = i10 + 1;
            bArr[i11] = (byte) (bArr[i11] ^ bArr2[i3 + i11]);
            int i12 = i10 + 2;
            bArr[i12] = (byte) (bArr[i12] ^ bArr2[i3 + i12]);
            int i13 = i10 + 3;
            bArr[i13] = (byte) (bArr[i13] ^ bArr2[i3 + i13]);
            i10 += 4;
        } while (i10 < 16);
    }

    public static void xor(byte[] bArr, byte[] bArr2, int i3, int i10) {
        while (true) {
            i10--;
            if (i10 < 0) {
                return;
            } else {
                bArr[i10] = (byte) (bArr[i10] ^ bArr2[i3 + i10]);
            }
        }
    }

    public static void xor(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i3 = 0;
        do {
            bArr3[i3] = (byte) (bArr[i3] ^ bArr2[i3]);
            int i10 = i3 + 1;
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
            int i11 = i3 + 2;
            bArr3[i11] = (byte) (bArr[i11] ^ bArr2[i11]);
            int i12 = i3 + 3;
            bArr3[i12] = (byte) (bArr[i12] ^ bArr2[i12]);
            i3 += 4;
        } while (i3 < 16);
    }

    public static void xor(int[] iArr, int[] iArr2) {
        iArr[0] = iArr[0] ^ iArr2[0];
        iArr[1] = iArr[1] ^ iArr2[1];
        iArr[2] = iArr[2] ^ iArr2[2];
        iArr[3] = iArr2[3] ^ iArr[3];
    }

    public static void xor(int[] iArr, int[] iArr2, int[] iArr3) {
        iArr3[0] = iArr[0] ^ iArr2[0];
        iArr3[1] = iArr[1] ^ iArr2[1];
        iArr3[2] = iArr[2] ^ iArr2[2];
        iArr3[3] = iArr[3] ^ iArr2[3];
    }

    public static void xor(long[] jArr, long[] jArr2) {
        jArr[0] = jArr[0] ^ jArr2[0];
        jArr[1] = jArr[1] ^ jArr2[1];
    }

    public static void xor(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }
}
