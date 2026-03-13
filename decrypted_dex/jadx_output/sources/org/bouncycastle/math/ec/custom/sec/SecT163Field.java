package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat192;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SecT163Field {
    private static final long M35 = 34359738367L;
    private static final long M55 = 36028797018963967L;
    private static final long[] ROOT_Z = {-5270498306774157648L, 5270498306774195053L, 19634136210L};

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr2[2] ^ jArr[2];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr2[5] ^ jArr[5];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    private static void addTo(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return Nat.fromBigInteger64(163, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] createExt64 = Nat192.createExt64();
        Nat192.copy64(jArr, jArr2);
        for (int i3 = 1; i3 < 163; i3 += 2) {
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
        jArr[0] = j ^ (j3 << 55);
        jArr[1] = (j3 >>> 9) ^ (j10 << 46);
        jArr[2] = (j10 >>> 18) ^ (j11 << 37);
        jArr[3] = (j11 >>> 27) ^ (j12 << 28);
        jArr[4] = (j12 >>> 36) ^ (j13 << 19);
        jArr[5] = j13 >>> 45;
    }

    public static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j3 = jArr[1];
        long j10 = (j3 >>> 46) ^ (jArr[2] << 18);
        long j11 = ((j3 << 9) ^ (j >>> 55)) & M55;
        long j12 = j & M55;
        long j13 = jArr2[0];
        long j14 = jArr2[1];
        long j15 = (j14 >>> 46) ^ (jArr2[2] << 18);
        long j16 = ((j13 >>> 55) ^ (j14 << 9)) & M55;
        long j17 = j13 & M55;
        long[] jArr4 = new long[10];
        implMulw(jArr3, j12, j17, jArr4, 0);
        implMulw(jArr3, j10, j15, jArr4, 2);
        long j18 = (j12 ^ j11) ^ j10;
        long j19 = (j17 ^ j16) ^ j15;
        implMulw(jArr3, j18, j19, jArr4, 4);
        long j20 = (j11 << 1) ^ (j10 << 2);
        long j21 = (j16 << 1) ^ (j15 << 2);
        implMulw(jArr3, j12 ^ j20, j17 ^ j21, jArr4, 6);
        implMulw(jArr3, j18 ^ j20, j19 ^ j21, jArr4, 8);
        long j22 = jArr4[6];
        long j23 = jArr4[8] ^ j22;
        long j24 = jArr4[7];
        long j25 = jArr4[9] ^ j24;
        long j26 = (j23 << 1) ^ j22;
        long j27 = (j23 ^ (j25 << 1)) ^ j24;
        long j28 = jArr4[0];
        long j29 = jArr4[1];
        long j30 = (j29 ^ j28) ^ jArr4[4];
        long j31 = j29 ^ jArr4[5];
        long j32 = jArr4[2];
        long j33 = ((j26 ^ j28) ^ (j32 << 4)) ^ (j32 << 1);
        long j34 = jArr4[3];
        long j35 = (((j30 ^ j27) ^ (j34 << 4)) ^ (j34 << 1)) ^ (j33 >>> 55);
        long j36 = j33 & M55;
        long j37 = (j31 ^ j25) ^ (j35 >>> 55);
        long j38 = (j36 >>> 1) ^ ((j35 & 1) << 54);
        long j39 = ((j35 & M55) >>> 1) ^ ((j37 & 1) << 54);
        long j40 = j38 ^ (j38 << 1);
        long j41 = j40 ^ (j40 << 2);
        long j42 = j41 ^ (j41 << 4);
        long j43 = j42 ^ (j42 << 8);
        long j44 = j43 ^ (j43 << 16);
        long j45 = (j44 ^ (j44 << 32)) & M55;
        long j46 = j39 ^ (j45 >>> 54);
        long j47 = j46 ^ (j46 << 1);
        long j48 = j47 ^ (j47 << 2);
        long j49 = j48 ^ (j48 << 4);
        long j50 = j49 ^ (j49 << 8);
        long j51 = j50 ^ (j50 << 16);
        long j52 = M55 & (j51 ^ (j51 << 32));
        long j53 = (j37 >>> 1) ^ (j52 >>> 54);
        long j54 = j53 ^ (j53 << 1);
        long j55 = j54 ^ (j54 << 2);
        long j56 = j55 ^ (j55 << 4);
        long j57 = j56 ^ (j56 << 8);
        long j58 = j57 ^ (j57 << 16);
        long j59 = j58 ^ (j58 << 32);
        jArr3[0] = j28;
        jArr3[1] = (j30 ^ j45) ^ j32;
        jArr3[2] = ((j31 ^ j52) ^ j45) ^ j34;
        jArr3[3] = j59 ^ j52;
        jArr3[4] = jArr4[2] ^ j59;
        jArr3[5] = jArr4[3];
        implCompactExt(jArr3);
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
        long j14 = jArr[((int) j) & 3];
        long j15 = 0;
        int i10 = 47;
        do {
            int i11 = (int) (j >>> i10);
            long j16 = (jArr[i11 & 7] ^ (jArr[(i11 >>> 3) & 7] << 3)) ^ (jArr[(i11 >>> 6) & 7] << 6);
            j14 ^= j16 << i10;
            j15 ^= j16 >>> (-i10);
            i10 -= 9;
        } while (i10 > 0);
        jArr2[i3] = M55 & j14;
        jArr2[i3 + 1] = (j14 >>> 55) ^ (j15 << 9);
    }

    public static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr, 0, 3, jArr2, 0);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat192.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] create64 = Nat192.create64();
        long[] create642 = Nat192.create64();
        square(jArr, create64);
        squareN(create64, 1, create642);
        multiply(create64, create642, create64);
        squareN(create642, 1, create642);
        multiply(create64, create642, create64);
        squareN(create64, 3, create642);
        multiply(create64, create642, create64);
        squareN(create642, 3, create642);
        multiply(create64, create642, create64);
        squareN(create64, 9, create642);
        multiply(create64, create642, create64);
        squareN(create642, 9, create642);
        multiply(create64, create642, create64);
        squareN(create64, 27, create642);
        multiply(create64, create642, create64);
        squareN(create642, 27, create642);
        multiply(create64, create642, create64);
        squareN(create64, 81, create642);
        multiply(create64, create642, jArr2);
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
        long j12 = jArr[4];
        long j13 = jArr[5];
        long j14 = j11 ^ ((((j13 >>> 35) ^ (j13 >>> 32)) ^ (j13 >>> 29)) ^ (j13 >>> 28));
        long j15 = (j10 ^ ((((j13 << 29) ^ (j13 << 32)) ^ (j13 << 35)) ^ (j13 << 36))) ^ ((j12 >>> 28) ^ (((j12 >>> 35) ^ (j12 >>> 32)) ^ (j12 >>> 29)));
        long j16 = j ^ ((((j14 << 29) ^ (j14 << 32)) ^ (j14 << 35)) ^ (j14 << 36));
        long j17 = (j3 ^ ((((j12 << 29) ^ (j12 << 32)) ^ (j12 << 35)) ^ (j12 << 36))) ^ ((j14 >>> 28) ^ (((j14 >>> 35) ^ (j14 >>> 32)) ^ (j14 >>> 29)));
        long j18 = j15 >>> 35;
        jArr2[0] = (((j16 ^ j18) ^ (j18 << 3)) ^ (j18 << 6)) ^ (j18 << 7);
        jArr2[1] = j17;
        jArr2[2] = M35 & j15;
    }

    public static void reduce29(long[] jArr, int i3) {
        int i10 = i3 + 2;
        long j = jArr[i10];
        long j3 = j >>> 35;
        jArr[i3] = ((j3 << 7) ^ (((j3 << 3) ^ j3) ^ (j3 << 6))) ^ jArr[i3];
        jArr[i10] = j & M35;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long[] create64 = Nat192.create64();
        long unshuffle = Interleave.unshuffle(jArr[0]);
        long unshuffle2 = Interleave.unshuffle(jArr[1]);
        long j = (unshuffle & BodyPartID.bodyIdMax) | (unshuffle2 << 32);
        create64[0] = (unshuffle >>> 32) | (unshuffle2 & (-4294967296L));
        long unshuffle3 = Interleave.unshuffle(jArr[2]);
        long j3 = unshuffle3 & BodyPartID.bodyIdMax;
        create64[1] = unshuffle3 >>> 32;
        multiply(create64, ROOT_Z, jArr2);
        jArr2[0] = jArr2[0] ^ j;
        jArr2[1] = jArr2[1] ^ j3;
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] createExt64 = Nat192.createExt64();
        implSquare(jArr, createExt64);
        reduce(createExt64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] createExt64 = Nat192.createExt64();
        implSquare(jArr, createExt64);
        addExt(jArr2, createExt64, jArr2);
    }

    public static void squareN(long[] jArr, int i3, long[] jArr2) {
        long[] createExt64 = Nat192.createExt64();
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
        return ((int) (jArr[0] ^ (jArr[2] >>> 29))) & 1;
    }
}
