package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SecT239Field {
    private static final long M47 = 140737488355327L;
    private static final long M60 = 1152921504606846975L;

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
        return Nat.fromBigInteger64(239, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] createExt64 = Nat256.createExt64();
        Nat256.copy64(jArr, jArr2);
        for (int i3 = 1; i3 < 239; i3 += 2) {
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
        jArr[0] = j ^ (j3 << 60);
        jArr[1] = (j3 >>> 4) ^ (j10 << 56);
        jArr[2] = (j10 >>> 8) ^ (j11 << 52);
        jArr[3] = (j11 >>> 12) ^ (j12 << 48);
        jArr[4] = (j12 >>> 16) ^ (j13 << 44);
        jArr[5] = (j13 >>> 20) ^ (j14 << 40);
        jArr[6] = (j14 >>> 24) ^ (j15 << 36);
        jArr[7] = j15 >>> 28;
    }

    public static void implExpand(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j3 = jArr[1];
        long j10 = jArr[2];
        long j11 = jArr[3];
        jArr2[0] = j & M60;
        jArr2[1] = ((j >>> 60) ^ (j3 << 4)) & M60;
        jArr2[2] = ((j3 >>> 56) ^ (j10 << 8)) & M60;
        jArr2[3] = (j10 >>> 52) ^ (j11 << 12);
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
        jArr2[i3] = jArr2[i3] ^ (M60 & j14);
        int i13 = i3 + 1;
        jArr2[i13] = ((((((j & 585610922974906400L) & ((j3 << 4) >> 63)) >>> 5) ^ j15) << 4) ^ (j14 >>> 60)) ^ jArr2[i13];
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
        square(create64, create64);
        multiply(create64, jArr, create64);
        squareN(create64, 59, create642);
        multiply(create642, create64, create642);
        square(create642, create642);
        multiply(create642, jArr, create642);
        squareN(create642, 119, create64);
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
        long j16 = j14 ^ (j15 >>> 17);
        long j17 = (j13 ^ (j15 << 47)) ^ (j16 >>> 17);
        long j18 = ((j12 ^ (j15 >>> 47)) ^ (j16 << 47)) ^ (j17 >>> 17);
        long j19 = j ^ (j18 << 17);
        long j20 = (j3 ^ (j17 << 17)) ^ (j18 >>> 47);
        long j21 = ((j10 ^ (j16 << 17)) ^ (j17 >>> 47)) ^ (j18 << 47);
        long j22 = (((j11 ^ (j15 << 17)) ^ (j16 >>> 47)) ^ (j17 << 47)) ^ (j18 >>> 17);
        long j23 = j22 >>> 47;
        jArr2[0] = j19 ^ j23;
        jArr2[1] = j20;
        jArr2[2] = (j23 << 30) ^ j21;
        jArr2[3] = M47 & j22;
    }

    public static void reduce17(long[] jArr, int i3) {
        int i10 = i3 + 3;
        long j = jArr[i10];
        long j3 = j >>> 47;
        jArr[i3] = jArr[i3] ^ j3;
        int i11 = i3 + 2;
        jArr[i11] = (j3 << 30) ^ jArr[i11];
        jArr[i10] = j & M47;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long unshuffle = Interleave.unshuffle(jArr[0]);
        long unshuffle2 = Interleave.unshuffle(jArr[1]);
        long j = (unshuffle & BodyPartID.bodyIdMax) | (unshuffle2 << 32);
        long j3 = (unshuffle >>> 32) | (unshuffle2 & (-4294967296L));
        int i3 = 2;
        long unshuffle3 = Interleave.unshuffle(jArr[2]);
        long unshuffle4 = Interleave.unshuffle(jArr[3]);
        long j10 = (unshuffle3 & BodyPartID.bodyIdMax) | (unshuffle4 << 32);
        long j11 = (unshuffle4 & (-4294967296L)) | (unshuffle3 >>> 32);
        long j12 = j11 >>> 49;
        long j13 = (j3 >>> 49) | (j11 << 15);
        long j14 = j11 ^ (j3 << 15);
        long[] createExt64 = Nat256.createExt64();
        int[] iArr = {39, 120};
        int i10 = 0;
        while (i10 < i3) {
            int i11 = iArr[i10];
            int i12 = i11 >>> 6;
            int i13 = i11 & 63;
            createExt64[i12] = createExt64[i12] ^ (j3 << i13);
            int i14 = i12 + 1;
            int[] iArr2 = iArr;
            int i15 = -i13;
            createExt64[i14] = createExt64[i14] ^ ((j14 << i13) | (j3 >>> i15));
            int i16 = i12 + 2;
            createExt64[i16] = createExt64[i16] ^ ((j13 << i13) | (j14 >>> i15));
            int i17 = i12 + 3;
            createExt64[i17] = createExt64[i17] ^ ((j12 << i13) | (j13 >>> i15));
            int i18 = i12 + 4;
            createExt64[i18] = createExt64[i18] ^ (j12 >>> i15);
            i10++;
            i3 = 2;
            iArr = iArr2;
        }
        reduce(createExt64, jArr2);
        jArr2[0] = jArr2[0] ^ j;
        jArr2[1] = jArr2[1] ^ j10;
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
        return ((int) ((jArr[0] ^ (jArr[1] >>> 17)) ^ (jArr[2] >>> 34))) & 1;
    }
}
