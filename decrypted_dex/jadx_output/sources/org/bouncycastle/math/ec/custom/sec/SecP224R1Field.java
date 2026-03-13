package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat224;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SecP224R1Field {

    /* renamed from: M, reason: collision with root package name */
    private static final long f19240M = 4294967295L;

    /* renamed from: P6, reason: collision with root package name */
    private static final int f19242P6 = -1;
    private static final int PExt13 = -1;

    /* renamed from: P, reason: collision with root package name */
    static final int[] f19241P = {1, 0, 0, -1, -1, -1, -1};
    private static final int[] PExt = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};
    private static final int[] PExtInv = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat224.add(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && Nat224.gte(iArr3, f19241P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(14, iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && Nat.gte(14, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(14, iArr3, iArr4.length);
            }
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && Nat224.gte(iArr2, f19241P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
        long j = (iArr[0] & 4294967295L) - 1;
        iArr[0] = (int) j;
        long j3 = j >> 32;
        if (j3 != 0) {
            long j10 = j3 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j10;
            long j11 = (j10 >> 32) + (iArr[2] & 4294967295L);
            iArr[2] = (int) j11;
            j3 = j11 >> 32;
        }
        long j12 = (4294967295L & iArr[3]) + 1 + j3;
        iArr[3] = (int) j12;
        if ((j12 >> 32) != 0) {
            Nat.incAt(7, iArr, 4);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] fromBigInteger = Nat224.fromBigInteger(bigInteger);
        if (fromBigInteger[6] == -1) {
            int[] iArr = f19241P;
            if (Nat224.gte(fromBigInteger, iArr)) {
                Nat224.subFrom(iArr, fromBigInteger);
            }
        }
        return fromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(7, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(7, iArr2, Nat224.add(iArr, f19241P, iArr2));
        }
    }

    public static void inv(int[] iArr, int[] iArr2) {
        Mod.checkedModOddInverse(f19241P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i3 = 0;
        for (int i10 = 0; i10 < 7; i10++) {
            i3 |= iArr[i10];
        }
        return (((i3 >>> 1) | (i3 & 1)) - 1) >> 31;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] createExt = Nat224.createExt();
        Nat224.mul(iArr, iArr2, createExt);
        reduce(createExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat224.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && Nat.gte(14, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(14, iArr3, iArr4.length);
            }
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            Nat224.sub(f19241P, iArr, iArr2);
        } else {
            int[] iArr3 = f19241P;
            Nat224.sub(iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[28];
        do {
            secureRandom.nextBytes(bArr);
            Pack.littleEndianToInt(bArr, 0, iArr, 0, 7);
        } while (Nat.lessThan(7, iArr, f19241P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j = iArr[10] & 4294967295L;
        long j3 = iArr[11] & 4294967295L;
        long j10 = iArr[12] & 4294967295L;
        long j11 = iArr[13] & 4294967295L;
        long j12 = ((iArr[7] & 4294967295L) + j3) - 1;
        long j13 = (iArr[8] & 4294967295L) + j10;
        long j14 = (iArr[9] & 4294967295L) + j11;
        long j15 = (iArr[0] & 4294967295L) - j12;
        long j16 = j15 & 4294967295L;
        long j17 = ((iArr[1] & 4294967295L) - j13) + (j15 >> 32);
        int i3 = (int) j17;
        iArr2[1] = i3;
        long j18 = ((iArr[2] & 4294967295L) - j14) + (j17 >> 32);
        int i10 = (int) j18;
        iArr2[2] = i10;
        long j19 = (((iArr[3] & 4294967295L) + j12) - j) + (j18 >> 32);
        long j20 = j19 & 4294967295L;
        long j21 = (((iArr[4] & 4294967295L) + j13) - j3) + (j19 >> 32);
        iArr2[4] = (int) j21;
        long j22 = (((iArr[5] & 4294967295L) + j14) - j10) + (j21 >> 32);
        iArr2[5] = (int) j22;
        long j23 = (((iArr[6] & 4294967295L) + j) - j11) + (j22 >> 32);
        iArr2[6] = (int) j23;
        long j24 = (j23 >> 32) + 1;
        long j25 = j20 + j24;
        long j26 = j16 - j24;
        iArr2[0] = (int) j26;
        long j27 = j26 >> 32;
        if (j27 != 0) {
            long j28 = j27 + (i3 & 4294967295L);
            iArr2[1] = (int) j28;
            long j29 = (j28 >> 32) + (i10 & 4294967295L);
            iArr2[2] = (int) j29;
            j25 += j29 >> 32;
        }
        iArr2[3] = (int) j25;
        if (((j25 >> 32) == 0 || Nat.incAt(7, iArr2, 4) == 0) && !(iArr2[6] == -1 && Nat224.gte(iArr2, f19241P))) {
            return;
        }
        addPInvTo(iArr2);
    }

    public static void reduce32(int i3, int[] iArr) {
        long j;
        if (i3 != 0) {
            long j3 = i3 & 4294967295L;
            long j10 = (iArr[0] & 4294967295L) - j3;
            iArr[0] = (int) j10;
            long j11 = j10 >> 32;
            if (j11 != 0) {
                long j12 = j11 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j12;
                long j13 = (j12 >> 32) + (iArr[2] & 4294967295L);
                iArr[2] = (int) j13;
                j11 = j13 >> 32;
            }
            long j14 = (4294967295L & iArr[3]) + j3 + j11;
            iArr[3] = (int) j14;
            j = j14 >> 32;
        } else {
            j = 0;
        }
        if ((j == 0 || Nat.incAt(7, iArr, 4) == 0) && !(iArr[6] == -1 && Nat224.gte(iArr, f19241P))) {
            return;
        }
        addPInvTo(iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] createExt = Nat224.createExt();
        Nat224.square(iArr, createExt);
        reduce(createExt, iArr2);
    }

    public static void squareN(int[] iArr, int i3, int[] iArr2) {
        int[] createExt = Nat224.createExt();
        Nat224.square(iArr, createExt);
        while (true) {
            reduce(createExt, iArr2);
            i3--;
            if (i3 <= 0) {
                return;
            } else {
                Nat224.square(iArr2, createExt);
            }
        }
    }

    private static void subPInvFrom(int[] iArr) {
        long j = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j3 = j >> 32;
        if (j3 != 0) {
            long j10 = j3 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j10;
            long j11 = (j10 >> 32) + (iArr[2] & 4294967295L);
            iArr[2] = (int) j11;
            j3 = j11 >> 32;
        }
        long j12 = ((4294967295L & iArr[3]) - 1) + j3;
        iArr[3] = (int) j12;
        if ((j12 >> 32) != 0) {
            Nat.decAt(7, iArr, 4);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat224.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(14, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            if (Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                Nat.decAt(14, iArr3, iArr4.length);
            }
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && Nat224.gte(iArr2, f19241P))) {
            addPInvTo(iArr2);
        }
    }
}
