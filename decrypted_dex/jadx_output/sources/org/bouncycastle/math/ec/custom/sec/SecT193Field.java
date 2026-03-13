package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SecT193Field {
    private static final long M01 = 1;
    private static final long M49 = 562949953421311L;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ M01;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    private static void addTo(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
        jArr2[3] = jArr2[3] ^ jArr[3];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return Nat.fromBigInteger64(193, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] createExt64 = Nat256.createExt64();
        Nat256.copy64(jArr, jArr2);
        for (int i3 = 1; i3 < 193; i3 += 2) {
            implSquare(jArr2, createExt64);
            reduce(createExt64, jArr2);
            implSquare(jArr2, createExt64);
            reduce(createExt64, jArr2);
            addTo(jArr, jArr2);
        }
    }

    public static void implCompactExt(long[] jArr) {
        long j = jArr[0];
        long j3 = jArr[1];
        long j10 = jArr[2];
        long j11 = jArr[3];
        long j12 = jArr[4];
        long j13 = jArr[5];
        long j14 = jArr[6];
        long j15 = jArr[7];
        jArr[0] = j ^ (j3 << 49);
        jArr[1] = (j3 >>> 15) ^ (j10 << 34);
        jArr[2] = (j10 >>> 30) ^ (j11 << 19);
        jArr[3] = ((j11 >>> 45) ^ (j12 << 4)) ^ (j13 << 53);
        jArr[4] = ((j12 >>> 60) ^ (j14 << 38)) ^ (j13 >>> 11);
        jArr[5] = (j14 >>> 26) ^ (j15 << 23);
        jArr[6] = j15 >>> 41;
        jArr[7] = 0;
    }

    public static void implExpand(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j3 = jArr[1];
        long j10 = jArr[2];
        long j11 = jArr[3];
        jArr2[0] = j & M49;
        jArr2[1] = ((j >>> 49) ^ (j3 << 15)) & M49;
        jArr2[2] = ((j3 >>> 34) ^ (j10 << 30)) & M49;
        jArr2[3] = (j10 >>> 19) ^ (j11 << 45);
    }

    public static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        implExpand(jArr, jArr4);
        implExpand(jArr2, jArr5);
        long[] jArr6 = new long[8];
        implMulwAcc(jArr6, jArr4[0], jArr5[0], jArr3, 0);
        implMulwAcc(jArr6, jArr4[1], jArr5[1], jArr3, 1);
        implMulwAcc(jArr6, jArr4[2], jArr5[2], jArr3, 2);
        implMulwAcc(jArr6, jArr4[3], jArr5[3], jArr3, 3);
        for (int i3 = 5; i3 > 0; i3--) {
            jArr3[i3] = jArr3[i3] ^ jArr3[i3 - 1];
        }
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        implMulwAcc(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i10 = 7; i10 > 1; i10--) {
            jArr3[i10] = jArr3[i10] ^ jArr3[i10 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j3 = jArr4[1] ^ jArr4[3];
        long j10 = jArr5[0] ^ jArr5[2];
        long j11 = jArr5[3] ^ jArr5[1];
        implMulwAcc(jArr6, j ^ j3, j10 ^ j11, jArr3, 3);
        long[] jArr7 = new long[3];
        implMulwAcc(jArr6, j, j10, jArr7, 0);
        implMulwAcc(jArr6, j3, j11, jArr7, 1);
        long j12 = jArr7[0];
        long j13 = jArr7[1];
        long j14 = jArr7[2];
        jArr3[2] = jArr3[2] ^ j12;
        jArr3[3] = (j12 ^ j13) ^ jArr3[3];
        jArr3[4] = jArr3[4] ^ (j13 ^ j14);
        jArr3[5] = jArr3[5] ^ j14;
        implCompactExt(jArr3);
    }

    public static void implMulwAcc(long[] jArr, long j, long j3, long[] jArr2, int i3) {
        jArr[1] = j3;
        long j10 = j3 << M01;
        jArr[2] = j10;
        long j11 = j10 ^ j3;
        jArr[3] = j11;
        long j12 = j3 << 2;
        jArr[4] = j12;
        jArr[5] = j12 ^ j3;
        long j13 = j11 << M01;
        jArr[6] = j13;
        jArr[7] = j13 ^ j3;
        int i10 = (int) j;
        long j14 = (jArr[(i10 >>> 3) & 7] << 3) ^ jArr[i10 & 7];
        long j15 = 0;
        int i11 = 36;
        do {
            int i12 = (int) (j >>> i11);
            long j16 = (((jArr[i12 & 7] ^ (jArr[(i12 >>> 3) & 7] << 3)) ^ (jArr[(i12 >>> 6) & 7] << 6)) ^ (jArr[(i12 >>> 9) & 7] << 9)) ^ (jArr[(i12 >>> 12) & 7] << 12);
            j14 ^= j16 << i11;
            j15 ^= j16 >>> (-i11);
            i11 -= 15;
        } while (i11 > 0);
        jArr2[i3] = jArr2[i3] ^ (M49 & j14);
        int i13 = i3 + 1;
        jArr2[i13] = jArr2[i13] ^ ((j14 >>> 49) ^ (j15 << 15));
    }

    public static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr, 0, 3, jArr2, 0);
        jArr2[6] = jArr[3] & M01;
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat256.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] create64 = Nat256.create64();
        long[] create642 = Nat256.create64();
        square(jArr, create64);
        squareN(create64, 1, create642);
        multiply(create64, create642, create64);
        squareN(create642, 1, create642);
        multiply(create64, create642, create64);
        squareN(create64, 3, create642);
        multiply(create64, create642, create64);
        squareN(create64, 6, create642);
        multiply(create64, create642, create64);
        squareN(create64, 12, create642);
        multiply(create64, create642, create64);
        squareN(create64, 24, create642);
        multiply(create64, create642, create64);
        squareN(create64, 48, create642);
        multiply(create64, create642, create64);
        squareN(create64, 96, create642);
        multiply(create64, create642, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] createExt64 = Nat256.createExt64();
        implMultiply(jArr, jArr2, createExt64);
        reduce(createExt64, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] createExt64 = Nat256.createExt64();
        implMultiply(jArr, jArr2, createExt64);
        addExt(jArr3, createExt64, jArr3);
    }

    public static void reduce(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j3 = jArr[1];
        long j10 = jArr[2];
        long j11 = jArr[3];
        long j12 = jArr[4];
        long j13 = jArr[5];
        long j14 = jArr[6];
        long j15 = j11 ^ ((j14 >>> M01) ^ (j14 << 14));
        long j16 = j12 ^ (j14 >>> 50);
        long j17 = (j10 ^ (j14 << 63)) ^ ((j13 >>> M01) ^ (j13 << 14));
        long j18 = j15 ^ (j13 >>> 50);
        long j19 = j ^ (j16 << 63);
        long j20 = (j3 ^ (j13 << 63)) ^ ((j16 >>> M01) ^ (j16 << 14));
        long j21 = j17 ^ (j16 >>> 50);
        long j22 = j18 >>> M01;
        jArr2[0] = (j19 ^ j22) ^ (j22 << 15);
        jArr2[1] = (j18 >>> 50) ^ j20;
        jArr2[2] = j21;
        jArr2[3] = M01 & j18;
    }

    public static void reduce63(long[] jArr, int i3) {
        int i10 = i3 + 3;
        long j = jArr[i10];
        long j3 = j >>> M01;
        jArr[i3] = (j3 ^ (j3 << 15)) ^ jArr[i3];
        int i11 = i3 + 1;
        jArr[i11] = jArr[i11] ^ (j >>> 50);
        jArr[i10] = j & M01;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long unshuffle = Interleave.unshuffle(jArr[0]);
        long unshuffle2 = Interleave.unshuffle(jArr[1]);
        long j = (unshuffle & BodyPartID.bodyIdMax) | (unshuffle2 << 32);
        long j3 = (unshuffle >>> 32) | (unshuffle2 & (-4294967296L));
        long unshuffle3 = Interleave.unshuffle(jArr[2]);
        long j10 = (unshuffle3 & BodyPartID.bodyIdMax) ^ (jArr[3] << 32);
        long j11 = unshuffle3 >>> 32;
        jArr2[0] = j ^ (j3 << 8);
        jArr2[1] = ((j10 ^ (j11 << 8)) ^ (j3 >>> 56)) ^ (j3 << 33);
        jArr2[2] = (j3 >>> 31) ^ (j11 << 33);
        jArr2[3] = unshuffle3 >>> 63;
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] createExt64 = Nat256.createExt64();
        implSquare(jArr, createExt64);
        reduce(createExt64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] createExt64 = Nat256.createExt64();
        implSquare(jArr, createExt64);
        addExt(jArr2, createExt64, jArr2);
    }

    public static void squareN(long[] jArr, int i3, long[] jArr2) {
        long[] createExt64 = Nat256.createExt64();
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
