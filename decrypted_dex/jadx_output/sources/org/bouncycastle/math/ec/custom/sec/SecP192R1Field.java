package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat192;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SecP192R1Field {

    /* renamed from: M, reason: collision with root package name */
    private static final long f19229M = 4294967295L;

    /* renamed from: P5, reason: collision with root package name */
    private static final int f19231P5 = -1;
    private static final int PExt11 = -1;

    /* renamed from: P, reason: collision with root package name */
    static final int[] f19230P = {-1, -1, -2, -1, -1, -1};
    private static final int[] PExt = {1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};
    private static final int[] PExtInv = {-1, -1, -3, -1, -2, -1, 1, 0, 2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat192.add(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && Nat192.gte(iArr3, f19230P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && Nat.gte(12, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(12, iArr3, iArr4.length);
            }
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && Nat192.gte(iArr2, f19230P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
        long j = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j3 = j >> 32;
        if (j3 != 0) {
            long j10 = j3 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j10;
            j3 = j10 >> 32;
        }
        long j11 = (4294967295L & iArr[2]) + 1 + j3;
        iArr[2] = (int) j11;
        if ((j11 >> 32) != 0) {
            Nat.incAt(6, iArr, 3);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] fromBigInteger = Nat192.fromBigInteger(bigInteger);
        if (fromBigInteger[5] == -1) {
            int[] iArr = f19230P;
            if (Nat192.gte(fromBigInteger, iArr)) {
                Nat192.subFrom(iArr, fromBigInteger);
            }
        }
        return fromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(6, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(6, iArr2, Nat192.add(iArr, f19230P, iArr2));
        }
    }

    public static void inv(int[] iArr, int[] iArr2) {
        Mod.checkedModOddInverse(f19230P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i3 = 0;
        for (int i10 = 0; i10 < 6; i10++) {
            i3 |= iArr[i10];
        }
        return (((i3 >>> 1) | (i3 & 1)) - 1) >> 31;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] createExt = Nat192.createExt();
        Nat192.mul(iArr, iArr2, createExt);
        reduce(createExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat192.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && Nat.gte(12, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(12, iArr3, iArr4.length);
            }
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            Nat192.sub(f19230P, iArr, iArr2);
        } else {
            int[] iArr3 = f19230P;
            Nat192.sub(iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[24];
        do {
            secureRandom.nextBytes(bArr);
            Pack.littleEndianToInt(bArr, 0, iArr, 0, 6);
        } while (Nat.lessThan(6, iArr, f19230P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j = iArr[6] & 4294967295L;
        long j3 = iArr[7] & 4294967295L;
        long j10 = (iArr[10] & 4294967295L) + j;
        long j11 = (iArr[11] & 4294967295L) + j3;
        long j12 = (iArr[0] & 4294967295L) + j10;
        int i3 = (int) j12;
        long j13 = (iArr[1] & 4294967295L) + j11 + (j12 >> 32);
        int i10 = (int) j13;
        iArr2[1] = i10;
        long j14 = j10 + (iArr[8] & 4294967295L);
        long j15 = j11 + (iArr[9] & 4294967295L);
        long j16 = (iArr[2] & 4294967295L) + j14 + (j13 >> 32);
        long j17 = j16 & 4294967295L;
        long j18 = (iArr[3] & 4294967295L) + j15 + (j16 >> 32);
        iArr2[3] = (int) j18;
        long j19 = (iArr[4] & 4294967295L) + (j14 - j) + (j18 >> 32);
        iArr2[4] = (int) j19;
        long j20 = (iArr[5] & 4294967295L) + (j15 - j3) + (j19 >> 32);
        iArr2[5] = (int) j20;
        long j21 = j20 >> 32;
        long j22 = j17 + j21;
        long j23 = j21 + (i3 & 4294967295L);
        iArr2[0] = (int) j23;
        long j24 = j23 >> 32;
        if (j24 != 0) {
            long j25 = j24 + (i10 & 4294967295L);
            iArr2[1] = (int) j25;
            j22 += j25 >> 32;
        }
        iArr2[2] = (int) j22;
        if (((j22 >> 32) == 0 || Nat.incAt(6, iArr2, 3) == 0) && !(iArr2[5] == -1 && Nat192.gte(iArr2, f19230P))) {
            return;
        }
        addPInvTo(iArr2);
    }

    public static void reduce32(int i3, int[] iArr) {
        long j;
        if (i3 != 0) {
            long j3 = i3 & 4294967295L;
            long j10 = (iArr[0] & 4294967295L) + j3;
            iArr[0] = (int) j10;
            long j11 = j10 >> 32;
            if (j11 != 0) {
                long j12 = j11 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j12;
                j11 = j12 >> 32;
            }
            long j13 = (4294967295L & iArr[2]) + j3 + j11;
            iArr[2] = (int) j13;
            j = j13 >> 32;
        } else {
            j = 0;
        }
        if ((j == 0 || Nat.incAt(6, iArr, 3) == 0) && !(iArr[5] == -1 && Nat192.gte(iArr, f19230P))) {
            return;
        }
        addPInvTo(iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] createExt = Nat192.createExt();
        Nat192.square(iArr, createExt);
        reduce(createExt, iArr2);
    }

    public static void squareN(int[] iArr, int i3, int[] iArr2) {
        int[] createExt = Nat192.createExt();
        Nat192.square(iArr, createExt);
        while (true) {
            reduce(createExt, iArr2);
            i3--;
            if (i3 <= 0) {
                return;
            } else {
                Nat192.square(iArr2, createExt);
            }
        }
    }

    private static void subPInvFrom(int[] iArr) {
        long j = (iArr[0] & 4294967295L) - 1;
        iArr[0] = (int) j;
        long j3 = j >> 32;
        if (j3 != 0) {
            long j10 = j3 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j10;
            j3 = j10 >> 32;
        }
        long j11 = ((4294967295L & iArr[2]) - 1) + j3;
        iArr[2] = (int) j11;
        if ((j11 >> 32) != 0) {
            Nat.decAt(6, iArr, 3);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat192.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(12, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            if (Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                Nat.decAt(12, iArr3, iArr4.length);
            }
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && Nat192.gte(iArr2, f19230P))) {
            addPInvTo(iArr2);
        }
    }
}
