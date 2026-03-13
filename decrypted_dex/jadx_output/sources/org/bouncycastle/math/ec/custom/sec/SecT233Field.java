package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SecT233Field {
    private static final long M41 = 2199023255551L;
    private static final long M59 = 576460752303423487L;

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
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
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
        return Nat.fromBigInteger64(233, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] createExt64 = Nat256.createExt64();
        Nat256.copy64(jArr, jArr2);
        for (int i3 = 1; i3 < 233; i3 += 2) {
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
        jArr[0] = j ^ (j3 << 59);
        jArr[1] = (j3 >>> 5) ^ (j10 << 54);
        jArr[2] = (j10 >>> 10) ^ (j11 << 49);
        jArr[3] = (j11 >>> 15) ^ (j12 << 44);
        jArr[4] = (j12 >>> 20) ^ (j13 << 39);
        jArr[5] = (j13 >>> 25) ^ (j14 << 34);
        jArr[6] = (j14 >>> 30) ^ (j15 << 29);
        jArr[7] = j15 >>> 35;
    }

    public static void implExpand(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j3 = jArr[1];
        long j10 = jArr[2];
        long j11 = jArr[3];
        jArr2[0] = j & M59;
        jArr2[1] = ((j >>> 59) ^ (j3 << 5)) & M59;
        jArr2[2] = ((j3 >>> 54) ^ (j10 << 10)) & M59;
        jArr2[3] = (j10 >>> 49) ^ (j11 << 15);
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
        int i10 = (int) j;
        long j14 = (jArr[(i10 >>> 3) & 7] << 3) ^ jArr[i10 & 7];
        long j15 = 0;
        int i11 = 54;
        do {
            int i12 = (int) (j >>> i11);
            long j16 = jArr[i12 & 7] ^ (jArr[(i12 >>> 3) & 7] << 3);
            j14 ^= j16 << i11;
            j15 ^= j16 >>> (-i11);
            i11 -= 6;
        } while (i11 > 0);
        jArr2[i3] = jArr2[i3] ^ (M59 & j14);
        int i13 = i3 + 1;
        jArr2[i13] = jArr2[i13] ^ ((j14 >>> 59) ^ (j15 << 5));
    }

    public static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr, 0, 4, jArr2, 0);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat256.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] create64 = Nat256.create64();
        long[] create642 = Nat256.create64();
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
        square(create642, create642);
        multiply(create642, jArr, create642);
        squareN(create642, 29, create64);
        multiply(create64, create642, create64);
        squareN(create64, 58, create642);
        multiply(create642, create64, create642);
        squareN(create642, 116, create64);
        multiply(create64, create642, create64);
        square(create64, jArr2);
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
        long j15 = jArr[7];
        long j16 = j13 ^ (j15 >>> 31);
        long j17 = (j12 ^ ((j15 >>> 41) ^ (j15 << 33))) ^ (j14 >>> 31);
        long j18 = ((j11 ^ (j15 << 23)) ^ ((j14 >>> 41) ^ (j14 << 33))) ^ (j16 >>> 31);
        long j19 = j ^ (j17 << 23);
        long j20 = (j3 ^ (j16 << 23)) ^ ((j17 >>> 41) ^ (j17 << 33));
        long j21 = ((j10 ^ (j14 << 23)) ^ ((j16 >>> 41) ^ (j16 << 33))) ^ (j17 >>> 31);
        long j22 = j18 >>> 41;
        jArr2[0] = j19 ^ j22;
        jArr2[1] = (j22 << 10) ^ j20;
        jArr2[2] = j21;
        jArr2[3] = M41 & j18;
    }

    public static void reduce23(long[] jArr, int i3) {
        int i10 = i3 + 3;
        long j = jArr[i10];
        long j3 = j >>> 41;
        jArr[i3] = jArr[i3] ^ j3;
        int i11 = i3 + 1;
        jArr[i11] = (j3 << 10) ^ jArr[i11];
        jArr[i10] = j & M41;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long unshuffle = Interleave.unshuffle(jArr[0]);
        boolean z2 = true;
        long unshuffle2 = Interleave.unshuffle(jArr[1]);
        long j = (unshuffle & BodyPartID.bodyIdMax) | (unshuffle2 << 32);
        long j3 = (unshuffle >>> 32) | (unshuffle2 & (-4294967296L));
        long unshuffle3 = Interleave.unshuffle(jArr[2]);
        long unshuffle4 = Interleave.unshuffle(jArr[3]);
        long j10 = (BodyPartID.bodyIdMax & unshuffle3) | (unshuffle4 << 32);
        long j11 = (unshuffle3 >>> 32) | ((-4294967296L) & unshuffle4);
        long j12 = j11 >>> 27;
        long j13 = j11 ^ ((j3 >>> 27) | (j11 << 37));
        long j14 = j3 ^ (j3 << 37);
        long[] createExt64 = Nat256.createExt64();
        int[] iArr = {32, 117, 191};
        int i3 = 0;
        while (i3 < 3) {
            int i10 = iArr[i3];
            int i11 = i10 >>> 6;
            int i12 = i10 & 63;
            createExt64[i11] = createExt64[i11] ^ (j14 << i12);
            int i13 = i11 + 1;
            boolean z10 = z2;
            int i14 = -i12;
            createExt64[i13] = createExt64[i13] ^ ((j13 << i12) | (j14 >>> i14));
            int i15 = i11 + 2;
            createExt64[i15] = createExt64[i15] ^ ((j12 << i12) | (j13 >>> i14));
            int i16 = i11 + 3;
            createExt64[i16] = createExt64[i16] ^ (j12 >>> i14);
            i3++;
            z2 = z10;
        }
        boolean z11 = z2;
        reduce(createExt64, jArr2);
        jArr2[0] = jArr2[0] ^ j;
        jArr2[z11 ? 1 : 0] = jArr2[z11 ? 1 : 0] ^ j10;
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
        return ((int) (jArr[0] ^ (jArr[2] >>> 31))) & 1;
    }
}
