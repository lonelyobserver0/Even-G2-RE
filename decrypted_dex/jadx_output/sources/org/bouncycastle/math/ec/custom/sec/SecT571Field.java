package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat576;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SecT571Field {
    private static final long M59 = 576460752303423487L;
    private static final long[] ROOT_Z = {3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L};

    private static void add(long[] jArr, int i3, long[] jArr2, int i10, long[] jArr3, int i11) {
        for (int i12 = 0; i12 < 9; i12++) {
            jArr3[i11 + i12] = jArr[i3 + i12] ^ jArr2[i10 + i12];
        }
    }

    private static void addBothTo(long[] jArr, int i3, long[] jArr2, int i10, long[] jArr3, int i11) {
        for (int i12 = 0; i12 < 9; i12++) {
            int i13 = i11 + i12;
            jArr3[i13] = jArr3[i13] ^ (jArr[i3 + i12] ^ jArr2[i10 + i12]);
        }
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i3 = 0; i3 < 18; i3++) {
            jArr3[i3] = jArr[i3] ^ jArr2[i3];
        }
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        for (int i3 = 1; i3 < 9; i3++) {
            jArr2[i3] = jArr[i3];
        }
    }

    private static void addTo(long[] jArr, long[] jArr2) {
        for (int i3 = 0; i3 < 9; i3++) {
            jArr2[i3] = jArr2[i3] ^ jArr[i3];
        }
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return Nat.fromBigInteger64(571, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] createExt64 = Nat576.createExt64();
        Nat576.copy64(jArr, jArr2);
        for (int i3 = 1; i3 < 571; i3 += 2) {
            implSquare(jArr2, createExt64);
            reduce(createExt64, jArr2);
            implSquare(jArr2, createExt64);
            reduce(createExt64, jArr2);
            addTo(jArr, jArr2);
        }
    }

    public static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[16];
        for (int i3 = 0; i3 < 9; i3++) {
            implMulwAcc(jArr4, jArr[i3], jArr2[i3], jArr3, i3 << 1);
        }
        long j = jArr3[0];
        long j3 = jArr3[1];
        long j10 = jArr3[2] ^ j;
        long j11 = j10 ^ j3;
        jArr3[1] = j11;
        long j12 = j3 ^ jArr3[3];
        long j13 = j10 ^ jArr3[4];
        long j14 = j13 ^ j12;
        jArr3[2] = j14;
        long j15 = j12 ^ jArr3[5];
        long j16 = j13 ^ jArr3[6];
        long j17 = j16 ^ j15;
        jArr3[3] = j17;
        long j18 = j15 ^ jArr3[7];
        long j19 = j16 ^ jArr3[8];
        long j20 = j19 ^ j18;
        jArr3[4] = j20;
        long j21 = j18 ^ jArr3[9];
        long j22 = j19 ^ jArr3[10];
        long j23 = j22 ^ j21;
        jArr3[5] = j23;
        long j24 = j21 ^ jArr3[11];
        long j25 = j22 ^ jArr3[12];
        long j26 = j25 ^ j24;
        jArr3[6] = j26;
        long j27 = j24 ^ jArr3[13];
        long j28 = j25 ^ jArr3[14];
        long j29 = j28 ^ j27;
        jArr3[7] = j29;
        long j30 = j27 ^ jArr3[15];
        long j31 = j28 ^ jArr3[16];
        long j32 = j31 ^ j30;
        jArr3[8] = j32;
        long j33 = (j30 ^ jArr3[17]) ^ j31;
        jArr3[9] = j ^ j33;
        jArr3[10] = j11 ^ j33;
        jArr3[11] = j14 ^ j33;
        jArr3[12] = j17 ^ j33;
        jArr3[13] = j20 ^ j33;
        jArr3[14] = j23 ^ j33;
        jArr3[15] = j26 ^ j33;
        jArr3[16] = j29 ^ j33;
        jArr3[17] = j32 ^ j33;
        implMulwAcc(jArr4, jArr[0] ^ jArr[1], jArr2[0] ^ jArr2[1], jArr3, 1);
        implMulwAcc(jArr4, jArr[0] ^ jArr[2], jArr2[0] ^ jArr2[2], jArr3, 2);
        implMulwAcc(jArr4, jArr[0] ^ jArr[3], jArr2[0] ^ jArr2[3], jArr3, 3);
        implMulwAcc(jArr4, jArr[1] ^ jArr[2], jArr2[1] ^ jArr2[2], jArr3, 3);
        implMulwAcc(jArr4, jArr[0] ^ jArr[4], jArr2[0] ^ jArr2[4], jArr3, 4);
        implMulwAcc(jArr4, jArr[1] ^ jArr[3], jArr2[1] ^ jArr2[3], jArr3, 4);
        implMulwAcc(jArr4, jArr[0] ^ jArr[5], jArr2[0] ^ jArr2[5], jArr3, 5);
        implMulwAcc(jArr4, jArr[1] ^ jArr[4], jArr2[1] ^ jArr2[4], jArr3, 5);
        implMulwAcc(jArr4, jArr[2] ^ jArr[3], jArr2[2] ^ jArr2[3], jArr3, 5);
        implMulwAcc(jArr4, jArr[0] ^ jArr[6], jArr2[0] ^ jArr2[6], jArr3, 6);
        implMulwAcc(jArr4, jArr[1] ^ jArr[5], jArr2[1] ^ jArr2[5], jArr3, 6);
        implMulwAcc(jArr4, jArr[2] ^ jArr[4], jArr2[2] ^ jArr2[4], jArr3, 6);
        implMulwAcc(jArr4, jArr[0] ^ jArr[7], jArr2[0] ^ jArr2[7], jArr3, 7);
        implMulwAcc(jArr4, jArr[1] ^ jArr[6], jArr2[1] ^ jArr2[6], jArr3, 7);
        implMulwAcc(jArr4, jArr[2] ^ jArr[5], jArr2[2] ^ jArr2[5], jArr3, 7);
        implMulwAcc(jArr4, jArr[3] ^ jArr[4], jArr2[3] ^ jArr2[4], jArr3, 7);
        implMulwAcc(jArr4, jArr[0] ^ jArr[8], jArr2[0] ^ jArr2[8], jArr3, 8);
        implMulwAcc(jArr4, jArr[1] ^ jArr[7], jArr2[1] ^ jArr2[7], jArr3, 8);
        implMulwAcc(jArr4, jArr[2] ^ jArr[6], jArr2[2] ^ jArr2[6], jArr3, 8);
        implMulwAcc(jArr4, jArr[3] ^ jArr[5], jArr2[3] ^ jArr2[5], jArr3, 8);
        implMulwAcc(jArr4, jArr[1] ^ jArr[8], jArr2[1] ^ jArr2[8], jArr3, 9);
        implMulwAcc(jArr4, jArr[2] ^ jArr[7], jArr2[2] ^ jArr2[7], jArr3, 9);
        implMulwAcc(jArr4, jArr[3] ^ jArr[6], jArr2[3] ^ jArr2[6], jArr3, 9);
        implMulwAcc(jArr4, jArr[4] ^ jArr[5], jArr2[4] ^ jArr2[5], jArr3, 9);
        implMulwAcc(jArr4, jArr[2] ^ jArr[8], jArr2[2] ^ jArr2[8], jArr3, 10);
        implMulwAcc(jArr4, jArr[3] ^ jArr[7], jArr2[3] ^ jArr2[7], jArr3, 10);
        implMulwAcc(jArr4, jArr[4] ^ jArr[6], jArr2[4] ^ jArr2[6], jArr3, 10);
        implMulwAcc(jArr4, jArr[3] ^ jArr[8], jArr2[3] ^ jArr2[8], jArr3, 11);
        implMulwAcc(jArr4, jArr[4] ^ jArr[7], jArr2[4] ^ jArr2[7], jArr3, 11);
        implMulwAcc(jArr4, jArr[5] ^ jArr[6], jArr2[5] ^ jArr2[6], jArr3, 11);
        implMulwAcc(jArr4, jArr[4] ^ jArr[8], jArr2[4] ^ jArr2[8], jArr3, 12);
        implMulwAcc(jArr4, jArr[5] ^ jArr[7], jArr2[5] ^ jArr2[7], jArr3, 12);
        implMulwAcc(jArr4, jArr[5] ^ jArr[8], jArr2[5] ^ jArr2[8], jArr3, 13);
        implMulwAcc(jArr4, jArr[6] ^ jArr[7], jArr2[6] ^ jArr2[7], jArr3, 13);
        implMulwAcc(jArr4, jArr[6] ^ jArr[8], jArr2[6] ^ jArr2[8], jArr3, 14);
        implMulwAcc(jArr4, jArr[7] ^ jArr[8], jArr2[7] ^ jArr2[8], jArr3, 15);
    }

    public static void implMultiplyPrecomp(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i3 = 56; i3 >= 0; i3 -= 8) {
            for (int i10 = 1; i10 < 9; i10 += 2) {
                int i11 = (int) (jArr[i10] >>> i3);
                addBothTo(jArr2, (i11 & 15) * 9, jArr2, (((i11 >>> 4) & 15) + 16) * 9, jArr3, i10 - 1);
            }
            Nat.shiftUpBits64(16, jArr3, 0, 8, 0L);
        }
        for (int i12 = 56; i12 >= 0; i12 -= 8) {
            int i13 = 0;
            while (i13 < 9) {
                int i14 = (int) (jArr[i13] >>> i12);
                int i15 = i13;
                addBothTo(jArr2, (i14 & 15) * 9, jArr2, (((i14 >>> 4) & 15) + 16) * 9, jArr3, i15);
                i13 = i15 + 2;
            }
            if (i12 > 0) {
                Nat.shiftUpBits64(18, jArr3, 0, 8, 0L);
            }
        }
    }

    public static void implMulwAcc(long[] jArr, long j, long j3, long[] jArr2, int i3) {
        long j10 = j;
        jArr[1] = j3;
        for (int i10 = 2; i10 < 16; i10 += 2) {
            long j11 = jArr[i10 >>> 1] << 1;
            jArr[i10] = j11;
            jArr[i10 + 1] = j11 ^ j3;
        }
        int i11 = (int) j10;
        long j12 = jArr[i11 & 15] ^ (jArr[(i11 >>> 4) & 15] << 4);
        long j13 = 0;
        int i12 = 56;
        do {
            int i13 = (int) (j10 >>> i12);
            long j14 = jArr[i13 & 15] ^ (jArr[(i13 >>> 4) & 15] << 4);
            j12 ^= j14 << i12;
            j13 ^= j14 >>> (-i12);
            i12 -= 8;
        } while (i12 > 0);
        for (int i14 = 0; i14 < 7; i14++) {
            j10 = (j10 & (-72340172838076674L)) >>> 1;
            j13 ^= ((j3 << i14) >> 63) & j10;
        }
        jArr2[i3] = jArr2[i3] ^ j12;
        int i15 = i3 + 1;
        jArr2[i15] = jArr2[i15] ^ j13;
    }

    public static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr, 0, 9, jArr2, 0);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat576.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] create64 = Nat576.create64();
        long[] create642 = Nat576.create64();
        long[] create643 = Nat576.create64();
        square(jArr, create643);
        square(create643, create64);
        square(create64, create642);
        multiply(create64, create642, create64);
        squareN(create64, 2, create642);
        multiply(create64, create642, create64);
        multiply(create64, create643, create64);
        squareN(create64, 5, create642);
        multiply(create64, create642, create64);
        squareN(create642, 5, create642);
        multiply(create64, create642, create64);
        squareN(create64, 15, create642);
        multiply(create64, create642, create643);
        squareN(create643, 30, create64);
        squareN(create64, 30, create642);
        multiply(create64, create642, create64);
        squareN(create64, 60, create642);
        multiply(create64, create642, create64);
        squareN(create642, 60, create642);
        multiply(create64, create642, create64);
        squareN(create64, 180, create642);
        multiply(create64, create642, create64);
        squareN(create642, 180, create642);
        multiply(create64, create642, create64);
        multiply(create64, create643, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] createExt64 = Nat576.createExt64();
        implMultiply(jArr, jArr2, createExt64);
        reduce(createExt64, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] createExt64 = Nat576.createExt64();
        implMultiply(jArr, jArr2, createExt64);
        addExt(jArr3, createExt64, jArr3);
    }

    public static void multiplyPrecomp(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] createExt64 = Nat576.createExt64();
        implMultiplyPrecomp(jArr, jArr2, createExt64);
        reduce(createExt64, jArr3);
    }

    public static void multiplyPrecompAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] createExt64 = Nat576.createExt64();
        implMultiplyPrecomp(jArr, jArr2, createExt64);
        addExt(jArr3, createExt64, jArr3);
    }

    public static long[] precompMultiplicand(long[] jArr) {
        long[] jArr2 = new long[288];
        System.arraycopy(jArr, 0, jArr2, 9, 9);
        int i3 = 7;
        int i10 = 0;
        while (i3 > 0) {
            int i11 = i10 + 18;
            Nat.shiftUpBit64(9, jArr2, i11 >>> 1, 0L, jArr2, i11);
            reduce5(jArr2, i11);
            long[] jArr3 = jArr2;
            add(jArr3, 9, jArr3, i11, jArr3, i10 + 27);
            jArr2 = jArr3;
            i3--;
            i10 = i11;
        }
        Nat.shiftUpBits64(144, jArr2, 0, 4, 0L, jArr2, 144);
        return jArr2;
    }

    public static void reduce(long[] jArr, long[] jArr2) {
        long j = jArr[9];
        long j3 = jArr[17];
        long j10 = (((j ^ (j3 >>> 59)) ^ (j3 >>> 57)) ^ (j3 >>> 54)) ^ (j3 >>> 49);
        long j11 = (j3 << 15) ^ (((jArr[8] ^ (j3 << 5)) ^ (j3 << 7)) ^ (j3 << 10));
        for (int i3 = 16; i3 >= 10; i3--) {
            long j12 = jArr[i3];
            jArr2[i3 - 8] = (((j11 ^ (j12 >>> 59)) ^ (j12 >>> 57)) ^ (j12 >>> 54)) ^ (j12 >>> 49);
            j11 = (((jArr[i3 - 9] ^ (j12 << 5)) ^ (j12 << 7)) ^ (j12 << 10)) ^ (j12 << 15);
        }
        jArr2[1] = (((j11 ^ (j10 >>> 59)) ^ (j10 >>> 57)) ^ (j10 >>> 54)) ^ (j10 >>> 49);
        long j13 = (j10 << 15) ^ (((jArr[0] ^ (j10 << 5)) ^ (j10 << 7)) ^ (j10 << 10));
        long j14 = jArr2[8];
        long j15 = j14 >>> 59;
        jArr2[0] = (((j13 ^ j15) ^ (j15 << 2)) ^ (j15 << 5)) ^ (j15 << 10);
        jArr2[8] = M59 & j14;
    }

    public static void reduce5(long[] jArr, int i3) {
        int i10 = i3 + 8;
        long j = jArr[i10];
        long j3 = j >>> 59;
        jArr[i3] = ((j3 << 10) ^ (((j3 << 2) ^ j3) ^ (j3 << 5))) ^ jArr[i3];
        jArr[i10] = j & M59;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long[] create64 = Nat576.create64();
        long[] create642 = Nat576.create64();
        int i3 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = i3 + 1;
            long unshuffle = Interleave.unshuffle(jArr[i3]);
            i3 += 2;
            long unshuffle2 = Interleave.unshuffle(jArr[i11]);
            create64[i10] = (BodyPartID.bodyIdMax & unshuffle) | (unshuffle2 << 32);
            create642[i10] = (unshuffle >>> 32) | ((-4294967296L) & unshuffle2);
        }
        long unshuffle3 = Interleave.unshuffle(jArr[i3]);
        create64[4] = BodyPartID.bodyIdMax & unshuffle3;
        create642[4] = unshuffle3 >>> 32;
        multiply(create642, ROOT_Z, jArr2);
        add(jArr2, create64, jArr2);
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] createExt64 = Nat576.createExt64();
        implSquare(jArr, createExt64);
        reduce(createExt64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] createExt64 = Nat576.createExt64();
        implSquare(jArr, createExt64);
        addExt(jArr2, createExt64, jArr2);
    }

    public static void squareN(long[] jArr, int i3, long[] jArr2) {
        long[] createExt64 = Nat576.createExt64();
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
        long j = jArr[0];
        long j3 = jArr[8];
        return ((int) ((j ^ (j3 >>> 49)) ^ (j3 >>> 57))) & 1;
    }

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i3 = 0; i3 < 9; i3++) {
            jArr3[i3] = jArr[i3] ^ jArr2[i3];
        }
    }

    public static void addBothTo(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i3 = 0; i3 < 9; i3++) {
            jArr3[i3] = jArr3[i3] ^ (jArr[i3] ^ jArr2[i3]);
        }
    }
}
