package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat128;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SecT113Field {
    private static final long M49 = 562949953421311L;
    private static final long M57 = 144115188075855871L;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
    }

    private static void addTo(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return Nat.fromBigInteger64(113, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] createExt64 = Nat128.createExt64();
        Nat128.copy64(jArr, jArr2);
        for (int i3 = 1; i3 < 113; i3 += 2) {
            implSquare(jArr2, createExt64);
            reduce(createExt64, jArr2);
            implSquare(jArr2, createExt64);
            reduce(createExt64, jArr2);
            addTo(jArr, jArr2);
        }
    }

    public static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j3 = ((jArr[1] << 7) ^ (j >>> 57)) & M57;
        long j10 = j & M57;
        long j11 = jArr2[0];
        long j12 = ((j11 >>> 57) ^ (jArr2[1] << 7)) & M57;
        long j13 = j11 & M57;
        long[] jArr4 = new long[6];
        implMulw(jArr3, j10, j13, jArr4, 0);
        implMulw(jArr3, j3, j12, jArr4, 2);
        implMulw(jArr3, j10 ^ j3, j13 ^ j12, jArr4, 4);
        long j14 = jArr4[1] ^ jArr4[2];
        long j15 = jArr4[0];
        long j16 = jArr4[3];
        long j17 = (jArr4[4] ^ j15) ^ j14;
        long j18 = j14 ^ (jArr4[5] ^ j16);
        jArr3[0] = j15 ^ (j17 << 57);
        jArr3[1] = (j17 >>> 7) ^ (j18 << 50);
        jArr3[2] = (j18 >>> 14) ^ (j16 << 43);
        jArr3[3] = j16 >>> 21;
    }

    public static void implMulw(long[] jArr, long j, long j3, long[] jArr2, int i3) {
        jArr[1] = j3;
        long j10 = j3 << 1;
        jArr[2] = j10;
        long j11 = j10 ^ j3;
        jArr[3] = j11;
        long j12 = j3 << 2;
        jArr[4] = j12;
        jArr[5] = j12 ^ j3;
        long j13 = j11 << 1;
        jArr[6] = j13;
        jArr[7] = j13 ^ j3;
        long j14 = jArr[((int) j) & 7];
        long j15 = 0;
        int i10 = 48;
        do {
            int i11 = (int) (j >>> i10);
            long j16 = (jArr[i11 & 7] ^ (jArr[(i11 >>> 3) & 7] << 3)) ^ (jArr[(i11 >>> 6) & 7] << 6);
            j14 ^= j16 << i10;
            j15 ^= j16 >>> (-i10);
            i10 -= 9;
        } while (i10 > 0);
        jArr2[i3] = M57 & j14;
        jArr2[i3 + 1] = (((((j & 72198606942111744L) & ((j3 << 7) >> 63)) >>> 8) ^ j15) << 7) ^ (j14 >>> 57);
    }

    public static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr, 0, 2, jArr2, 0);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat128.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] create64 = Nat128.create64();
        long[] create642 = Nat128.create64();
        square(jArr, create64);
        multiply(create64, jArr, create64);
        square(create64, create64);
        multiply(create64, jArr, create64);
        squareN(create64, 3, create642);
        multiply(create642, create64, create642);
        square(create642, create642);
        multiply(create642, jArr, create642);
        squareN(create642, 7, create64);
        multiply(create64, create642, create64);
        squareN(create64, 14, create642);
        multiply(create642, create64, create642);
        squareN(create642, 28, create64);
        multiply(create64, create642, create64);
        squareN(create64, 56, create642);
        multiply(create642, create64, create642);
        square(create642, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        implMultiply(jArr, jArr2, jArr4);
        reduce(jArr4, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        implMultiply(jArr, jArr2, jArr4);
        addExt(jArr3, jArr4, jArr3);
    }

    public static void reduce(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j3 = jArr[1];
        long j10 = jArr[2];
        long j11 = jArr[3];
        long j12 = j10 ^ ((j11 >>> 40) ^ (j11 >>> 49));
        long j13 = j ^ ((j12 << 15) ^ (j12 << 24));
        long j14 = (j3 ^ ((j11 << 15) ^ (j11 << 24))) ^ ((j12 >>> 40) ^ (j12 >>> 49));
        long j15 = j14 >>> 49;
        jArr2[0] = (j13 ^ j15) ^ (j15 << 9);
        jArr2[1] = M49 & j14;
    }

    public static void reduce15(long[] jArr, int i3) {
        int i10 = i3 + 1;
        long j = jArr[i10];
        long j3 = j >>> 49;
        jArr[i3] = (j3 ^ (j3 << 9)) ^ jArr[i3];
        jArr[i10] = j & M49;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long unshuffle = Interleave.unshuffle(jArr[0]);
        long unshuffle2 = Interleave.unshuffle(jArr[1]);
        long j = (BodyPartID.bodyIdMax & unshuffle) | (unshuffle2 << 32);
        long j3 = (unshuffle >>> 32) | (unshuffle2 & (-4294967296L));
        jArr2[0] = ((j3 << 57) ^ j) ^ (j3 << 5);
        jArr2[1] = (j3 >>> 59) ^ (j3 >>> 7);
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] createExt64 = Nat128.createExt64();
        implSquare(jArr, createExt64);
        reduce(createExt64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] createExt64 = Nat128.createExt64();
        implSquare(jArr, createExt64);
        addExt(jArr2, createExt64, jArr2);
    }

    public static void squareN(long[] jArr, int i3, long[] jArr2) {
        long[] createExt64 = Nat128.createExt64();
        implSquare(jArr, createExt64);
        while (true) {
            reduce(createExt64, jArr2);
            i3--;
            if (i3 <= 0) {
                return;
            } else {
                implSquare(jArr2, createExt64);
            }
        }
    }

    public static int trace(long[] jArr) {
        return ((int) jArr[0]) & 1;
    }
}
