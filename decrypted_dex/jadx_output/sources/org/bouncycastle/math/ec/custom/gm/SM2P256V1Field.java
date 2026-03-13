package org.bouncycastle.math.ec.custom.gm;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SM2P256V1Field {

    /* renamed from: M, reason: collision with root package name */
    private static final long f19202M = 4294967295L;
    private static final int P7s1 = Integer.MAX_VALUE;
    private static final int PExt15s1 = Integer.MAX_VALUE;

    /* renamed from: P, reason: collision with root package name */
    static final int[] f19203P = {-1, -1, 0, -1, -1, -1, -1, -2};
    private static final int[] PExt = {1, 0, -2, 1, 1, -2, 0, 2, -2, -3, 3, -2, -1, -1, 0, -2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.add(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= Integer.MAX_VALUE && Nat256.gte(iArr3, f19203P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(16, iArr, iArr2, iArr3) != 0 || ((iArr3[15] >>> 1) >= Integer.MAX_VALUE && Nat.gte(16, iArr3, PExt))) {
            Nat.subFrom(16, PExt, iArr3);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(8, iArr, iArr2) != 0 || ((iArr2[7] >>> 1) >= Integer.MAX_VALUE && Nat256.gte(iArr2, f19203P))) {
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
        long j11 = ((iArr[2] & 4294967295L) - 1) + j3;
        iArr[2] = (int) j11;
        long j12 = (iArr[3] & 4294967295L) + 1 + (j11 >> 32);
        iArr[3] = (int) j12;
        long j13 = j12 >> 32;
        if (j13 != 0) {
            long j14 = j13 + (iArr[4] & 4294967295L);
            iArr[4] = (int) j14;
            long j15 = (j14 >> 32) + (iArr[5] & 4294967295L);
            iArr[5] = (int) j15;
            long j16 = (j15 >> 32) + (iArr[6] & 4294967295L);
            iArr[6] = (int) j16;
            j13 = j16 >> 32;
        }
        iArr[7] = (int) ((4294967295L & iArr[7]) + 1 + j13);
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] fromBigInteger = Nat256.fromBigInteger(bigInteger);
        if ((fromBigInteger[7] >>> 1) >= Integer.MAX_VALUE) {
            int[] iArr = f19203P;
            if (Nat256.gte(fromBigInteger, iArr)) {
                Nat256.subFrom(iArr, fromBigInteger);
            }
        }
        return fromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(8, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(8, iArr2, Nat256.add(iArr, f19203P, iArr2));
        }
    }

    public static void inv(int[] iArr, int[] iArr2) {
        Mod.checkedModOddInverse(f19203P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i3 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            i3 |= iArr[i10];
        }
        return (((i3 >>> 1) | (i3 & 1)) - 1) >> 31;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] createExt = Nat256.createExt();
        Nat256.mul(iArr, iArr2, createExt);
        reduce(createExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.mulAddTo(iArr, iArr2, iArr3) != 0 || ((iArr3[15] >>> 1) >= Integer.MAX_VALUE && Nat.gte(16, iArr3, PExt))) {
            Nat.subFrom(16, PExt, iArr3);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            Nat256.sub(f19203P, iArr, iArr2);
        } else {
            int[] iArr3 = f19203P;
            Nat256.sub(iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[32];
        do {
            secureRandom.nextBytes(bArr);
            Pack.littleEndianToInt(bArr, 0, iArr, 0, 8);
        } while (Nat.lessThan(8, iArr, f19203P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j = iArr[8] & 4294967295L;
        long j3 = iArr[9] & 4294967295L;
        long j10 = iArr[10] & 4294967295L;
        long j11 = iArr[11] & 4294967295L;
        long j12 = iArr[12] & 4294967295L;
        long j13 = iArr[13] & 4294967295L;
        long j14 = iArr[14] & 4294967295L;
        long j15 = iArr[15] & 4294967295L;
        long j16 = j10 + j11;
        long j17 = j13 + j14;
        long j18 = j17 + (j15 << 1);
        long j19 = j + j3 + j17;
        long j20 = j16 + j12 + j15 + j19;
        long j21 = (iArr[0] & 4294967295L) + j20 + j13 + j14 + j15;
        iArr2[0] = (int) j21;
        long j22 = (((iArr[1] & 4294967295L) + j20) - j) + j14 + j15 + (j21 >> 32);
        iArr2[1] = (int) j22;
        long j23 = ((iArr[2] & 4294967295L) - j19) + (j22 >> 32);
        iArr2[2] = (int) j23;
        long j24 = ((((iArr[3] & 4294967295L) + j20) - j3) - j10) + j13 + (j23 >> 32);
        iArr2[3] = (int) j24;
        long j25 = ((((iArr[4] & 4294967295L) + j20) - j16) - j) + j14 + (j24 >> 32);
        iArr2[4] = (int) j25;
        long j26 = (iArr[5] & 4294967295L) + j18 + j10 + (j25 >> 32);
        iArr2[5] = (int) j26;
        long j27 = (iArr[6] & 4294967295L) + j11 + j14 + j15 + (j26 >> 32);
        iArr2[6] = (int) j27;
        long j28 = (iArr[7] & 4294967295L) + j20 + j18 + j12 + (j27 >> 32);
        iArr2[7] = (int) j28;
        reduce32((int) (j28 >> 32), iArr2);
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
            long j13 = ((iArr[2] & 4294967295L) - j3) + j11;
            iArr[2] = (int) j13;
            long j14 = (iArr[3] & 4294967295L) + j3 + (j13 >> 32);
            iArr[3] = (int) j14;
            long j15 = j14 >> 32;
            if (j15 != 0) {
                long j16 = j15 + (iArr[4] & 4294967295L);
                iArr[4] = (int) j16;
                long j17 = (j16 >> 32) + (iArr[5] & 4294967295L);
                iArr[5] = (int) j17;
                long j18 = (j17 >> 32) + (iArr[6] & 4294967295L);
                iArr[6] = (int) j18;
                j15 = j18 >> 32;
            }
            long j19 = (4294967295L & iArr[7]) + j3 + j15;
            iArr[7] = (int) j19;
            j = j19 >> 32;
        } else {
            j = 0;
        }
        if (j != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && Nat256.gte(iArr, f19203P))) {
            addPInvTo(iArr);
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] createExt = Nat256.createExt();
        Nat256.square(iArr, createExt);
        reduce(createExt, iArr2);
    }

    public static void squareN(int[] iArr, int i3, int[] iArr2) {
        int[] createExt = Nat256.createExt();
        Nat256.square(iArr, createExt);
        while (true) {
            reduce(createExt, iArr2);
            i3--;
            if (i3 <= 0) {
                return;
            } else {
                Nat256.square(iArr2, createExt);
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
        long j11 = (iArr[2] & 4294967295L) + 1 + j3;
        iArr[2] = (int) j11;
        long j12 = ((iArr[3] & 4294967295L) - 1) + (j11 >> 32);
        iArr[3] = (int) j12;
        long j13 = j12 >> 32;
        if (j13 != 0) {
            long j14 = j13 + (iArr[4] & 4294967295L);
            iArr[4] = (int) j14;
            long j15 = (j14 >> 32) + (iArr[5] & 4294967295L);
            iArr[5] = (int) j15;
            long j16 = (j15 >> 32) + (iArr[6] & 4294967295L);
            iArr[6] = (int) j16;
            j13 = j16 >> 32;
        }
        iArr[7] = (int) (((4294967295L & iArr[7]) - 1) + j13);
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(16, iArr, iArr2, iArr3) != 0) {
            Nat.addTo(16, PExt, iArr3);
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(8, iArr, 0, iArr2) != 0 || ((iArr2[7] >>> 1) >= Integer.MAX_VALUE && Nat256.gte(iArr2, f19203P))) {
            addPInvTo(iArr2);
        }
    }
}
