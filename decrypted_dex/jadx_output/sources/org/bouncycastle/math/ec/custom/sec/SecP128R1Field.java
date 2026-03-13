package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat128;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SecP128R1Field {

    /* renamed from: M, reason: collision with root package name */
    private static final long f19207M = 4294967295L;
    private static final int P3s1 = 2147483646;
    private static final int PExt7s1 = 2147483646;

    /* renamed from: P, reason: collision with root package name */
    static final int[] f19208P = {-1, -1, -1, -3};
    private static final int[] PExt = {1, 0, 0, 4, -2, -1, 3, -4};
    private static final int[] PExtInv = {-1, -1, -1, -5, 1, 0, -4, 3};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat128.add(iArr, iArr2, iArr3) != 0 || ((iArr3[3] >>> 1) >= 2147483646 && Nat128.gte(iArr3, f19208P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.add(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= 2147483646 && Nat256.gte(iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            Nat.addTo(iArr4.length, iArr4, iArr3);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(4, iArr, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && Nat128.gte(iArr2, f19208P))) {
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
            long j11 = (j10 >> 32) + (iArr[2] & 4294967295L);
            iArr[2] = (int) j11;
            j3 = j11 >> 32;
        }
        iArr[3] = (int) ((4294967295L & iArr[3]) + 2 + j3);
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] fromBigInteger = Nat128.fromBigInteger(bigInteger);
        if ((fromBigInteger[3] >>> 1) >= 2147483646) {
            int[] iArr = f19208P;
            if (Nat128.gte(fromBigInteger, iArr)) {
                Nat128.subFrom(iArr, fromBigInteger);
            }
        }
        return fromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(4, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(4, iArr2, Nat128.add(iArr, f19208P, iArr2));
        }
    }

    public static void inv(int[] iArr, int[] iArr2) {
        Mod.checkedModOddInverse(f19208P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i3 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            i3 |= iArr[i10];
        }
        return (((i3 >>> 1) | (i3 & 1)) - 1) >> 31;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] createExt = Nat128.createExt();
        Nat128.mul(iArr, iArr2, createExt);
        reduce(createExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat128.mulAddTo(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= 2147483646 && Nat256.gte(iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            Nat.addTo(iArr4.length, iArr4, iArr3);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            Nat128.sub(f19208P, iArr, iArr2);
        } else {
            int[] iArr3 = f19208P;
            Nat128.sub(iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[16];
        do {
            secureRandom.nextBytes(bArr);
            Pack.littleEndianToInt(bArr, 0, iArr, 0, 4);
        } while (Nat.lessThan(4, iArr, f19208P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j = iArr[7] & 4294967295L;
        long j3 = (iArr[3] & 4294967295L) + j;
        long j10 = (iArr[6] & 4294967295L) + (j << 1);
        long j11 = (iArr[5] & 4294967295L) + (j10 << 1);
        long j12 = (iArr[1] & 4294967295L) + j11;
        long j13 = (iArr[4] & 4294967295L) + (j11 << 1);
        long j14 = (iArr[0] & 4294967295L) + j13;
        iArr2[0] = (int) j14;
        long j15 = j12 + (j14 >>> 32);
        iArr2[1] = (int) j15;
        long j16 = (iArr[2] & 4294967295L) + j10 + (j15 >>> 32);
        iArr2[2] = (int) j16;
        long j17 = j3 + (j13 << 1) + (j16 >>> 32);
        iArr2[3] = (int) j17;
        reduce32((int) (j17 >>> 32), iArr2);
    }

    public static void reduce32(int i3, int[] iArr) {
        while (i3 != 0) {
            long j = i3 & 4294967295L;
            long j3 = (iArr[0] & 4294967295L) + j;
            iArr[0] = (int) j3;
            long j10 = j3 >> 32;
            if (j10 != 0) {
                long j11 = j10 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j11;
                long j12 = (j11 >> 32) + (iArr[2] & 4294967295L);
                iArr[2] = (int) j12;
                j10 = j12 >> 32;
            }
            long j13 = (4294967295L & iArr[3]) + (j << 1) + j10;
            iArr[3] = (int) j13;
            i3 = (int) (j13 >> 32);
        }
        if ((iArr[3] >>> 1) < 2147483646 || !Nat128.gte(iArr, f19208P)) {
            return;
        }
        addPInvTo(iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] createExt = Nat128.createExt();
        Nat128.square(iArr, createExt);
        reduce(createExt, iArr2);
    }

    public static void squareN(int[] iArr, int i3, int[] iArr2) {
        int[] createExt = Nat128.createExt();
        Nat128.square(iArr, createExt);
        while (true) {
            reduce(createExt, iArr2);
            i3--;
            if (i3 <= 0) {
                return;
            } else {
                Nat128.square(iArr2, createExt);
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
            long j11 = (j10 >> 32) + (iArr[2] & 4294967295L);
            iArr[2] = (int) j11;
            j3 = j11 >> 32;
        }
        iArr[3] = (int) (((4294967295L & iArr[3]) - 2) + j3);
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat128.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(10, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            Nat.subFrom(iArr4.length, iArr4, iArr3);
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(4, iArr, 0, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && Nat128.gte(iArr2, f19208P))) {
            addPInvTo(iArr2);
        }
    }
}
