package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat384;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SecP384R1Field {

    /* renamed from: M, reason: collision with root package name */
    private static final long f19257M = 4294967295L;
    private static final int P11 = -1;
    private static final int PExt23 = -1;

    /* renamed from: P, reason: collision with root package name */
    static final int[] f19258P = {-1, 0, 0, -1, -2, -1, -1, -1, -1, -1, -1, -1};
    private static final int[] PExt = {1, -2, 0, 2, 0, -2, 0, 2, 1, 0, 0, 0, -2, 1, 0, -2, -3, -1, -1, -1, -1, -1, -1, -1};
    private static final int[] PExtInv = {-1, 1, -1, -3, -1, 1, -1, -3, -2, -1, -1, -1, 1, -2, -1, 1, 2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && Nat.gte(12, iArr3, f19258P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(24, iArr, iArr2, iArr3) != 0 || (iArr3[23] == -1 && Nat.gte(24, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(24, iArr3, iArr4.length);
            }
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(12, iArr, iArr2) != 0 || (iArr2[11] == -1 && Nat.gte(12, iArr2, f19258P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
        long j = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j3 = ((iArr[1] & 4294967295L) - 1) + (j >> 32);
        iArr[1] = (int) j3;
        long j10 = j3 >> 32;
        if (j10 != 0) {
            long j11 = j10 + (iArr[2] & 4294967295L);
            iArr[2] = (int) j11;
            j10 = j11 >> 32;
        }
        long j12 = (iArr[3] & 4294967295L) + 1 + j10;
        iArr[3] = (int) j12;
        long j13 = (4294967295L & iArr[4]) + 1 + (j12 >> 32);
        iArr[4] = (int) j13;
        if ((j13 >> 32) != 0) {
            Nat.incAt(12, iArr, 5);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] fromBigInteger = Nat.fromBigInteger(KyberEngine.KyberPolyBytes, bigInteger);
        if (fromBigInteger[11] == -1) {
            int[] iArr = f19258P;
            if (Nat.gte(12, fromBigInteger, iArr)) {
                Nat.subFrom(12, iArr, fromBigInteger);
            }
        }
        return fromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(12, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(12, iArr2, Nat.add(12, iArr, f19258P, iArr2));
        }
    }

    public static void inv(int[] iArr, int[] iArr2) {
        Mod.checkedModOddInverse(f19258P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i3 = 0;
        for (int i10 = 0; i10 < 12; i10++) {
            i3 |= iArr[i10];
        }
        return (((i3 >>> 1) | (i3 & 1)) - 1) >> 31;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] create = Nat.create(24);
        Nat384.mul(iArr, iArr2, create);
        reduce(create, iArr3);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            Nat.sub(12, f19258P, iArr, iArr2);
        } else {
            int[] iArr3 = f19258P;
            Nat.sub(12, iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[48];
        do {
            secureRandom.nextBytes(bArr);
            Pack.littleEndianToInt(bArr, 0, iArr, 0, 12);
        } while (Nat.lessThan(12, iArr, f19258P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j = iArr[16] & 4294967295L;
        long j3 = iArr[17] & 4294967295L;
        long j10 = iArr[18] & 4294967295L;
        long j11 = iArr[19] & 4294967295L;
        long j12 = iArr[20] & 4294967295L;
        long j13 = iArr[21] & 4294967295L;
        long j14 = iArr[22] & 4294967295L;
        long j15 = iArr[23] & 4294967295L;
        long j16 = ((iArr[12] & 4294967295L) + j12) - 1;
        long j17 = (iArr[13] & 4294967295L) + j14;
        long j18 = (iArr[14] & 4294967295L) + j14 + j15;
        long j19 = (iArr[15] & 4294967295L) + j15;
        long j20 = j3 + j13;
        long j21 = j13 - j15;
        long j22 = j14 - j15;
        long j23 = j16 + j21;
        long j24 = (iArr[0] & 4294967295L) + j23;
        iArr2[0] = (int) j24;
        long j25 = (((iArr[1] & 4294967295L) + j15) - j16) + j17 + (j24 >> 32);
        iArr2[1] = (int) j25;
        long j26 = (((iArr[2] & 4294967295L) - j13) - j17) + j18 + (j25 >> 32);
        iArr2[2] = (int) j26;
        long j27 = ((iArr[3] & 4294967295L) - j18) + j19 + j23 + (j26 >> 32);
        iArr2[3] = (int) j27;
        long j28 = (((((iArr[4] & 4294967295L) + j) + j13) + j17) - j19) + j23 + (j27 >> 32);
        iArr2[4] = (int) j28;
        long j29 = ((iArr[5] & 4294967295L) - j) + j17 + j18 + j20 + (j28 >> 32);
        iArr2[5] = (int) j29;
        long j30 = (((iArr[6] & 4294967295L) + j10) - j3) + j18 + j19 + (j29 >> 32);
        iArr2[6] = (int) j30;
        long j31 = ((((iArr[7] & 4294967295L) + j) + j11) - j10) + j19 + (j30 >> 32);
        iArr2[7] = (int) j31;
        long j32 = (((((iArr[8] & 4294967295L) + j) + j3) + j12) - j11) + (j31 >> 32);
        iArr2[8] = (int) j32;
        long j33 = (((iArr[9] & 4294967295L) + j10) - j12) + j20 + (j32 >> 32);
        iArr2[9] = (int) j33;
        long j34 = ((((iArr[10] & 4294967295L) + j10) + j11) - j21) + j22 + (j33 >> 32);
        iArr2[10] = (int) j34;
        long j35 = ((((iArr[11] & 4294967295L) + j11) + j12) - j22) + (j34 >> 32);
        iArr2[11] = (int) j35;
        reduce32((int) ((j35 >> 32) + 1), iArr2);
    }

    public static void reduce32(int i3, int[] iArr) {
        long j;
        if (i3 != 0) {
            long j3 = i3 & 4294967295L;
            long j10 = (iArr[0] & 4294967295L) + j3;
            iArr[0] = (int) j10;
            long j11 = ((iArr[1] & 4294967295L) - j3) + (j10 >> 32);
            iArr[1] = (int) j11;
            long j12 = j11 >> 32;
            if (j12 != 0) {
                long j13 = j12 + (iArr[2] & 4294967295L);
                iArr[2] = (int) j13;
                j12 = j13 >> 32;
            }
            long j14 = (iArr[3] & 4294967295L) + j3 + j12;
            iArr[3] = (int) j14;
            long j15 = (4294967295L & iArr[4]) + j3 + (j14 >> 32);
            iArr[4] = (int) j15;
            j = j15 >> 32;
        } else {
            j = 0;
        }
        if ((j == 0 || Nat.incAt(12, iArr, 5) == 0) && !(iArr[11] == -1 && Nat.gte(12, iArr, f19258P))) {
            return;
        }
        addPInvTo(iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] create = Nat.create(24);
        Nat384.square(iArr, create);
        reduce(create, iArr2);
    }

    public static void squareN(int[] iArr, int i3, int[] iArr2) {
        int[] create = Nat.create(24);
        Nat384.square(iArr, create);
        while (true) {
            reduce(create, iArr2);
            i3--;
            if (i3 <= 0) {
                return;
            } else {
                Nat384.square(iArr2, create);
            }
        }
    }

    private static void subPInvFrom(int[] iArr) {
        long j = (iArr[0] & 4294967295L) - 1;
        iArr[0] = (int) j;
        long j3 = (iArr[1] & 4294967295L) + 1 + (j >> 32);
        iArr[1] = (int) j3;
        long j10 = j3 >> 32;
        if (j10 != 0) {
            long j11 = j10 + (iArr[2] & 4294967295L);
            iArr[2] = (int) j11;
            j10 = j11 >> 32;
        }
        long j12 = ((iArr[3] & 4294967295L) - 1) + j10;
        iArr[3] = (int) j12;
        long j13 = ((4294967295L & iArr[4]) - 1) + (j12 >> 32);
        iArr[4] = (int) j13;
        if ((j13 >> 32) != 0) {
            Nat.decAt(12, iArr, 5);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(12, iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(24, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            if (Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                Nat.decAt(24, iArr3, iArr4.length);
            }
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(12, iArr, 0, iArr2) != 0 || (iArr2[11] == -1 && Nat.gte(12, iArr2, f19258P))) {
            addPInvTo(iArr2);
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        Nat384.mul(iArr, iArr2, iArr4);
        reduce(iArr4, iArr3);
    }

    public static void square(int[] iArr, int[] iArr2, int[] iArr3) {
        Nat384.square(iArr, iArr3);
        reduce(iArr3, iArr2);
    }

    public static void squareN(int[] iArr, int i3, int[] iArr2, int[] iArr3) {
        Nat384.square(iArr, iArr3);
        while (true) {
            reduce(iArr3, iArr2);
            i3--;
            if (i3 <= 0) {
                return;
            } else {
                Nat384.square(iArr2, iArr3);
            }
        }
    }
}
