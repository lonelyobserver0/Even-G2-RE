package org.bouncycastle.math.raw;

import i2.u;
import java.math.BigInteger;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class Nat160 {

    /* renamed from: M, reason: collision with root package name */
    private static final long f19309M = 4294967295L;

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j3 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j3;
        long j10 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (j3 >>> 32);
        iArr3[2] = (int) j10;
        long j11 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (j10 >>> 32);
        iArr3[3] = (int) j11;
        long j12 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (j11 >>> 32);
        iArr3[4] = (int) j12;
        return (int) (j12 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (iArr3[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j3 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (iArr3[1] & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j3;
        long j10 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (iArr3[2] & 4294967295L) + (j3 >>> 32);
        iArr3[2] = (int) j10;
        long j11 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (iArr3[3] & 4294967295L) + (j10 >>> 32);
        iArr3[3] = (int) j11;
        long j12 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (iArr3[4] & 4294967295L) + (j11 >>> 32);
        iArr3[4] = (int) j12;
        return (int) (j12 >>> 32);
    }

    public static int addTo(int[] iArr, int i3, int[] iArr2, int i10, int i11) {
        long j = (iArr[i3] & 4294967295L) + (iArr2[i10] & 4294967295L) + (i11 & 4294967295L);
        iArr2[i10] = (int) j;
        long j3 = (iArr[i3 + 1] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j >>> 32);
        iArr2[i10 + 1] = (int) j3;
        long j10 = (iArr[i3 + 2] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j3 >>> 32);
        iArr2[i10 + 2] = (int) j10;
        long j11 = (iArr[i3 + 3] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j10 >>> 32);
        iArr2[i10 + 3] = (int) j11;
        long j12 = (iArr[i3 + 4] & 4294967295L) + (4294967295L & iArr2[r12]) + (j11 >>> 32);
        iArr2[i10 + 4] = (int) j12;
        return (int) (j12 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i3, int[] iArr2, int i10) {
        long j = (iArr[i3] & 4294967295L) + (iArr2[i10] & 4294967295L);
        int i11 = (int) j;
        iArr[i3] = i11;
        iArr2[i10] = i11;
        long j3 = (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L) + (j >>> 32);
        int i12 = (int) j3;
        iArr[i3 + 1] = i12;
        iArr2[i10 + 1] = i12;
        long j10 = (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L) + (j3 >>> 32);
        int i13 = (int) j10;
        iArr[i3 + 2] = i13;
        iArr2[i10 + 2] = i13;
        long j11 = (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L) + (j10 >>> 32);
        int i14 = (int) j11;
        iArr[i3 + 3] = i14;
        iArr2[i10 + 3] = i14;
        long j12 = (iArr[r12] & 4294967295L) + (4294967295L & iArr2[r14]) + (j11 >>> 32);
        int i15 = (int) j12;
        iArr[i3 + 4] = i15;
        iArr2[i10 + 4] = i15;
        return (int) (j12 >>> 32);
    }

    public static void copy(int[] iArr, int i3, int[] iArr2, int i10) {
        iArr2[i10] = iArr[i3];
        iArr2[i10 + 1] = iArr[i3 + 1];
        iArr2[i10 + 2] = iArr[i3 + 2];
        iArr2[i10 + 3] = iArr[i3 + 3];
        iArr2[i10 + 4] = iArr[i3 + 4];
    }

    public static int[] create() {
        return new int[5];
    }

    public static int[] createExt() {
        return new int[10];
    }

    public static boolean diff(int[] iArr, int i3, int[] iArr2, int i10, int[] iArr3, int i11) {
        boolean gte = gte(iArr, i3, iArr2, i10);
        if (gte) {
            sub(iArr, i3, iArr2, i10, iArr3, i11);
            return gte;
        }
        sub(iArr2, i10, iArr, i3, iArr3, i11);
        return gte;
    }

    public static boolean eq(int[] iArr, int[] iArr2) {
        for (int i3 = 4; i3 >= 0; i3--) {
            if (iArr[i3] != iArr2[i3]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 160) {
            throw new IllegalArgumentException();
        }
        int[] create = create();
        for (int i3 = 0; i3 < 5; i3++) {
            create[i3] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return create;
    }

    public static int getBit(int[] iArr, int i3) {
        int i10;
        if (i3 == 0) {
            i10 = iArr[0];
        } else {
            int i11 = i3 >> 5;
            if (i11 < 0 || i11 >= 5) {
                return 0;
            }
            i10 = iArr[i11] >>> (i3 & 31);
        }
        return i10 & 1;
    }

    public static boolean gte(int[] iArr, int i3, int[] iArr2, int i10) {
        for (int i11 = 4; i11 >= 0; i11--) {
            int i12 = iArr[i3 + i11] ^ Integer.MIN_VALUE;
            int i13 = Integer.MIN_VALUE ^ iArr2[i10 + i11];
            if (i12 < i13) {
                return false;
            }
            if (i12 > i13) {
                return true;
            }
        }
        return true;
    }

    public static boolean isOne(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i3 = 1; i3 < 5; i3++) {
            if (iArr[i3] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i3 = 0; i3 < 5; i3++) {
            if (iArr[i3] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int i3, int[] iArr2, int i10, int[] iArr3, int i11) {
        long j = iArr2[i10] & 4294967295L;
        long j3 = iArr2[i10 + 1] & 4294967295L;
        long j10 = iArr2[i10 + 2] & 4294967295L;
        long j11 = iArr2[i10 + 3] & 4294967295L;
        long j12 = iArr2[i10 + 4] & 4294967295L;
        long j13 = iArr[i3] & 4294967295L;
        long j14 = j13 * j;
        iArr3[i11] = (int) j14;
        long j15 = (j13 * j3) + (j14 >>> 32);
        iArr3[i11 + 1] = (int) j15;
        long j16 = (j13 * j10) + (j15 >>> 32);
        iArr3[i11 + 2] = (int) j16;
        long j17 = (j13 * j11) + (j16 >>> 32);
        iArr3[i11 + 3] = (int) j17;
        long j18 = (j13 * j12) + (j17 >>> 32);
        iArr3[i11 + 4] = (int) j18;
        iArr3[i11 + 5] = (int) (j18 >>> 32);
        int i12 = 1;
        int i13 = i11;
        while (i12 < 5) {
            int i14 = i13 + 1;
            long j19 = iArr[i3 + i12] & 4294967295L;
            long j20 = j;
            long j21 = (j19 * j) + (iArr3[i14] & 4294967295L);
            iArr3[i14] = (int) j21;
            long j22 = (j19 * j3) + (iArr3[r15] & 4294967295L) + (j21 >>> 32);
            int i15 = i13;
            iArr3[i13 + 2] = (int) j22;
            long j23 = (j19 * j10) + (iArr3[r2] & 4294967295L) + (j22 >>> 32);
            iArr3[i15 + 3] = (int) j23;
            long j24 = (j19 * j11) + (iArr3[r2] & 4294967295L) + (j23 >>> 32);
            iArr3[i15 + 4] = (int) j24;
            long j25 = (j19 * j12) + (iArr3[r2] & 4294967295L) + (j24 >>> 32);
            iArr3[i15 + 5] = (int) j25;
            iArr3[i15 + 6] = (int) (j25 >>> 32);
            i12++;
            i13 = i14;
            j = j20;
        }
    }

    public static long mul33Add(int i3, int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j = i3 & 4294967295L;
        long j3 = iArr[i10] & 4294967295L;
        long j10 = (j * j3) + (iArr2[i11] & 4294967295L);
        iArr3[i12] = (int) j10;
        long j11 = iArr[i10 + 1] & 4294967295L;
        long j12 = (j * j11) + j3 + (iArr2[i11 + 1] & 4294967295L) + (j10 >>> 32);
        iArr3[i12 + 1] = (int) j12;
        long j13 = iArr[i10 + 2] & 4294967295L;
        long j14 = (j * j13) + j11 + (iArr2[i11 + 2] & 4294967295L) + (j12 >>> 32);
        iArr3[i12 + 2] = (int) j14;
        long j15 = iArr[i10 + 3] & 4294967295L;
        long j16 = (j * j15) + j13 + (iArr2[i11 + 3] & 4294967295L) + (j14 >>> 32);
        iArr3[i12 + 3] = (int) j16;
        long j17 = iArr[i10 + 4] & 4294967295L;
        long j18 = (j * j17) + j15 + (4294967295L & iArr2[i11 + 4]) + (j16 >>> 32);
        iArr3[i12 + 4] = (int) j18;
        return (j18 >>> 32) + j17;
    }

    public static int mul33DWordAdd(int i3, long j, int[] iArr, int i10) {
        long j3 = i3 & 4294967295L;
        long j10 = j & 4294967295L;
        long j11 = (j3 * j10) + (iArr[i10] & 4294967295L);
        iArr[i10] = (int) j11;
        long j12 = j >>> 32;
        long j13 = (j3 * j12) + j10;
        long j14 = j13 + (iArr[r4] & 4294967295L) + (j11 >>> 32);
        iArr[i10 + 1] = (int) j14;
        long j15 = j12 + (iArr[r4] & 4294967295L) + (j14 >>> 32);
        iArr[i10 + 2] = (int) j15;
        long j16 = (j15 >>> 32) + (iArr[r0] & 4294967295L);
        iArr[i10 + 3] = (int) j16;
        if ((j16 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(5, iArr, i10, 4);
    }

    public static int mul33WordAdd(int i3, int i10, int[] iArr, int i11) {
        long j = i3 & 4294967295L;
        long j3 = i10 & 4294967295L;
        long j10 = (j * j3) + (iArr[i11] & 4294967295L);
        iArr[i11] = (int) j10;
        long j11 = j3 + (iArr[r5] & 4294967295L) + (j10 >>> 32);
        iArr[i11 + 1] = (int) j11;
        long j12 = (j11 >>> 32) + (iArr[r0] & 4294967295L);
        iArr[i11 + 2] = (int) j12;
        if ((j12 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(5, iArr, i11, 3);
    }

    public static int mulAddTo(int[] iArr, int i3, int[] iArr2, int i10, int[] iArr3, int i11) {
        long j = iArr2[i10] & 4294967295L;
        long j3 = iArr2[i10 + 1] & 4294967295L;
        long j10 = iArr2[i10 + 2] & 4294967295L;
        long j11 = iArr2[i10 + 3] & 4294967295L;
        long j12 = iArr2[i10 + 4] & 4294967295L;
        int i12 = 0;
        long j13 = 0;
        int i13 = i11;
        while (i12 < 5) {
            long j14 = iArr[i3 + i12] & 4294967295L;
            long j15 = j;
            long j16 = (j14 * j) + (iArr3[i13] & 4294967295L);
            iArr3[i13] = (int) j16;
            int i14 = i13 + 1;
            long j17 = (j14 * j3) + (iArr3[i14] & 4294967295L) + (j16 >>> 32);
            iArr3[i14] = (int) j17;
            long j18 = j14 * j10;
            long j19 = j18 + (iArr3[r2] & 4294967295L) + (j17 >>> 32);
            iArr3[i13 + 2] = (int) j19;
            long j20 = j14 * j11;
            long j21 = j20 + (iArr3[r2] & 4294967295L) + (j19 >>> 32);
            iArr3[i13 + 3] = (int) j21;
            long j22 = j14 * j12;
            long j23 = j22 + (iArr3[r2] & 4294967295L) + (j21 >>> 32);
            iArr3[i13 + 4] = (int) j23;
            long j24 = (j23 >>> 32) + (iArr3[r12] & 4294967295L) + j13;
            iArr3[i13 + 5] = (int) j24;
            j13 = j24 >>> 32;
            i12++;
            i13 = i14;
            j = j15;
        }
        return (int) j13;
    }

    public static int mulWord(int i3, int[] iArr, int[] iArr2, int i10) {
        long j = i3 & 4294967295L;
        long j3 = 0;
        int i11 = 0;
        do {
            long j10 = ((iArr[i11] & 4294967295L) * j) + j3;
            iArr2[i10 + i11] = (int) j10;
            j3 = j10 >>> 32;
            i11++;
        } while (i11 < 5);
        return (int) j3;
    }

    public static int mulWordAddExt(int i3, int[] iArr, int i10, int[] iArr2, int i11) {
        long j = i3 & 4294967295L;
        long j3 = ((iArr[i10] & 4294967295L) * j) + (iArr2[i11] & 4294967295L);
        iArr2[i11] = (int) j3;
        long j10 = ((iArr[i10 + 1] & 4294967295L) * j) + (iArr2[r8] & 4294967295L) + (j3 >>> 32);
        iArr2[i11 + 1] = (int) j10;
        long j11 = ((iArr[i10 + 2] & 4294967295L) * j) + (iArr2[r8] & 4294967295L) + (j10 >>> 32);
        iArr2[i11 + 2] = (int) j11;
        long j12 = ((iArr[i10 + 3] & 4294967295L) * j) + (iArr2[r8] & 4294967295L) + (j11 >>> 32);
        iArr2[i11 + 3] = (int) j12;
        long j13 = (j * (iArr[i10 + 4] & 4294967295L)) + (iArr2[r15] & 4294967295L) + (j12 >>> 32);
        iArr2[i11 + 4] = (int) j13;
        return (int) (j13 >>> 32);
    }

    public static int mulWordDwordAdd(int i3, long j, int[] iArr, int i10) {
        long j3 = i3 & 4294967295L;
        long j10 = ((j & 4294967295L) * j3) + (iArr[i10] & 4294967295L);
        iArr[i10] = (int) j10;
        long j11 = j3 * (j >>> 32);
        long j12 = j11 + (iArr[r9] & 4294967295L) + (j10 >>> 32);
        iArr[i10 + 1] = (int) j12;
        long j13 = j12 >>> 32;
        long j14 = j13 + (iArr[r0] & 4294967295L);
        iArr[i10 + 2] = (int) j14;
        if ((j14 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(5, iArr, i10, 3);
    }

    public static int mulWordsAdd(int i3, int i10, int[] iArr, int i11) {
        long j = ((i10 & 4294967295L) * (i3 & 4294967295L)) + (iArr[i11] & 4294967295L);
        iArr[i11] = (int) j;
        long j3 = (j >>> 32) + (4294967295L & iArr[r1]);
        iArr[i11 + 1] = (int) j3;
        if ((j3 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(5, iArr, i11, 2);
    }

    public static void square(int[] iArr, int i3, int[] iArr2, int i10) {
        long j = iArr[i3] & 4294967295L;
        int i11 = 0;
        int i12 = 10;
        int i13 = 4;
        while (true) {
            int i14 = i13 - 1;
            long j3 = iArr[i3 + i13] & 4294967295L;
            long j10 = j3 * j3;
            iArr2[(i12 - 1) + i10] = (i11 << 31) | ((int) (j10 >>> 33));
            i12 -= 2;
            iArr2[i10 + i12] = (int) (j10 >>> 1);
            i11 = (int) j10;
            if (i14 <= 0) {
                long j11 = j * j;
                long j12 = (j11 >>> 33) | ((i11 << 31) & 4294967295L);
                iArr2[i10] = (int) j11;
                int i15 = ((int) (j11 >>> 32)) & 1;
                long j13 = iArr[i3 + 1] & 4294967295L;
                long j14 = (j13 * j) + j12;
                int i16 = (int) j14;
                iArr2[i10 + 1] = (i16 << 1) | i15;
                long j15 = (iArr2[r8] & 4294967295L) + (j14 >>> 32);
                long j16 = iArr[i3 + 2] & 4294967295L;
                long j17 = (j16 * j) + j15;
                int i17 = (int) j17;
                iArr2[i10 + 2] = (i17 << 1) | (i16 >>> 31);
                long i18 = u.i(j16, j13, j17 >>> 32, iArr2[r9] & 4294967295L);
                long j18 = (iArr2[r24] & 4294967295L) + (i18 >>> 32);
                long j19 = iArr[i3 + 3] & 4294967295L;
                long j20 = (iArr2[r6] & 4294967295L) + (j18 >>> 32);
                long j21 = j18 & 4294967295L;
                long j22 = (iArr2[r2] & 4294967295L) + (j20 >>> 32);
                long j23 = j20 & 4294967295L;
                long j24 = (j19 * j) + (i18 & 4294967295L);
                int i19 = (int) j24;
                iArr2[i10 + 3] = (i17 >>> 31) | (i19 << 1);
                long i20 = u.i(j19, j13, j24 >>> 32, j21);
                long i21 = u.i(j19, j16, i20 >>> 32, j23);
                long j25 = j22 + (i21 >>> 32);
                long j26 = i21 & 4294967295L;
                long j27 = iArr[i3 + 4] & 4294967295L;
                long j28 = (iArr2[r6] & 4294967295L) + (j25 >>> 32);
                long j29 = j25 & 4294967295L;
                long j30 = (j27 * j) + (i20 & 4294967295L);
                int i22 = (int) j30;
                iArr2[i10 + 4] = (i19 >>> 31) | (i22 << 1);
                int i23 = i22 >>> 31;
                long i24 = u.i(j27, j13, j30 >>> 32, j26);
                long i25 = u.i(j27, j16, i24 >>> 32, j29);
                long i26 = u.i(j27, j19, i25 >>> 32, j28 & 4294967295L);
                long j31 = (iArr2[r7] & 4294967295L) + (j28 >>> 32) + (i26 >>> 32);
                int i27 = (int) i24;
                iArr2[i10 + 5] = i23 | (i27 << 1);
                int i28 = i27 >>> 31;
                int i29 = (int) i25;
                iArr2[i10 + 6] = i28 | (i29 << 1);
                int i30 = (int) i26;
                iArr2[i10 + 7] = (i29 >>> 31) | (i30 << 1);
                int i31 = i30 >>> 31;
                int i32 = (int) j31;
                iArr2[i10 + 8] = i31 | (i32 << 1);
                int i33 = i32 >>> 31;
                int i34 = i10 + 9;
                iArr2[i34] = ((iArr2[i34] + ((int) (j31 >>> 32))) << 1) | i33;
                return;
            }
            i13 = i14;
        }
    }

    public static int sub(int[] iArr, int i3, int[] iArr2, int i10, int[] iArr3, int i11) {
        long j = (iArr[i3] & 4294967295L) - (iArr2[i10] & 4294967295L);
        iArr3[i11] = (int) j;
        long j3 = ((iArr[i3 + 1] & 4294967295L) - (iArr2[i10 + 1] & 4294967295L)) + (j >> 32);
        iArr3[i11 + 1] = (int) j3;
        long j10 = ((iArr[i3 + 2] & 4294967295L) - (iArr2[i10 + 2] & 4294967295L)) + (j3 >> 32);
        iArr3[i11 + 2] = (int) j10;
        long j11 = ((iArr[i3 + 3] & 4294967295L) - (iArr2[i10 + 3] & 4294967295L)) + (j10 >> 32);
        iArr3[i11 + 3] = (int) j11;
        long j12 = ((iArr[i3 + 4] & 4294967295L) - (iArr2[i10 + 4] & 4294967295L)) + (j11 >> 32);
        iArr3[i11 + 4] = (int) j12;
        return (int) (j12 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((iArr3[0] & 4294967295L) - (iArr[0] & 4294967295L)) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j3 = (((iArr3[1] & 4294967295L) - (iArr[1] & 4294967295L)) - (iArr2[1] & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j3;
        long j10 = (((iArr3[2] & 4294967295L) - (iArr[2] & 4294967295L)) - (iArr2[2] & 4294967295L)) + (j3 >> 32);
        iArr3[2] = (int) j10;
        long j11 = (((iArr3[3] & 4294967295L) - (iArr[3] & 4294967295L)) - (iArr2[3] & 4294967295L)) + (j10 >> 32);
        iArr3[3] = (int) j11;
        long j12 = (((iArr3[4] & 4294967295L) - (iArr[4] & 4294967295L)) - (iArr2[4] & 4294967295L)) + (j11 >> 32);
        iArr3[4] = (int) j12;
        return (int) (j12 >> 32);
    }

    public static int subFrom(int[] iArr, int i3, int[] iArr2, int i10) {
        long j = (iArr2[i10] & 4294967295L) - (iArr[i3] & 4294967295L);
        iArr2[i10] = (int) j;
        long j3 = ((iArr2[r5] & 4294967295L) - (iArr[i3 + 1] & 4294967295L)) + (j >> 32);
        iArr2[i10 + 1] = (int) j3;
        long j10 = ((iArr2[r5] & 4294967295L) - (iArr[i3 + 2] & 4294967295L)) + (j3 >> 32);
        iArr2[i10 + 2] = (int) j10;
        long j11 = ((iArr2[r5] & 4294967295L) - (iArr[i3 + 3] & 4294967295L)) + (j10 >> 32);
        iArr2[i10 + 3] = (int) j11;
        long j12 = ((iArr2[r13] & 4294967295L) - (iArr[i3 + 4] & 4294967295L)) + (j11 >> 32);
        iArr2[i10 + 4] = (int) j12;
        return (int) (j12 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[20];
        for (int i3 = 0; i3 < 5; i3++) {
            int i10 = iArr[i3];
            if (i10 != 0) {
                Pack.intToBigEndian(i10, bArr, (4 - i3) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr2[0] = (int) j;
        long j3 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (j >>> 32);
        iArr2[1] = (int) j3;
        long j10 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (j3 >>> 32);
        iArr2[2] = (int) j10;
        long j11 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (j10 >>> 32);
        iArr2[3] = (int) j11;
        long j12 = (iArr[4] & 4294967295L) + (4294967295L & iArr2[4]) + (j11 >>> 32);
        iArr2[4] = (int) j12;
        return (int) (j12 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i3 = 4; i3 >= 0; i3--) {
            int i10 = iArr[i3] ^ Integer.MIN_VALUE;
            int i11 = Integer.MIN_VALUE ^ iArr2[i3];
            if (i10 < i11) {
                return false;
            }
            if (i10 > i11) {
                return true;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0] & 4294967295L;
        long j3 = iArr2[1] & 4294967295L;
        long j10 = iArr2[2] & 4294967295L;
        long j11 = iArr2[3] & 4294967295L;
        long j12 = iArr2[4] & 4294967295L;
        long j13 = iArr[0] & 4294967295L;
        int i3 = 1;
        long j14 = j13 * j;
        iArr3[0] = (int) j14;
        char c10 = ' ';
        long j15 = (j14 >>> 32) + (j13 * j3);
        iArr3[1] = (int) j15;
        long j16 = (j15 >>> 32) + (j13 * j10);
        iArr3[2] = (int) j16;
        long j17 = (j16 >>> 32) + (j13 * j11);
        iArr3[3] = (int) j17;
        long j18 = (j13 * j12) + (j17 >>> 32);
        iArr3[4] = (int) j18;
        int i10 = 5;
        iArr3[5] = (int) (j18 >>> 32);
        while (true) {
            int i11 = i3;
            if (i11 >= i10) {
                return;
            }
            long j19 = iArr[i11] & 4294967295L;
            long j20 = (j19 * j) + (iArr3[i11] & 4294967295L);
            iArr3[i11] = (int) j20;
            i3 = i11 + 1;
            char c11 = c10;
            long j21 = (j19 * j3) + (iArr3[i3] & 4294967295L) + (j20 >>> c10);
            iArr3[i3] = (int) j21;
            long j22 = j12;
            long j23 = (j19 * j10) + (iArr3[r8] & 4294967295L) + (j21 >>> c11);
            iArr3[i11 + 2] = (int) j23;
            long j24 = j23 >>> c11;
            long j25 = (j19 * j11) + (iArr3[r6] & 4294967295L) + j24;
            iArr3[i11 + 3] = (int) j25;
            long j26 = j25 >>> c11;
            long j27 = (j19 * j22) + (iArr3[r2] & 4294967295L) + j26;
            iArr3[i11 + 4] = (int) j27;
            iArr3[i11 + 5] = (int) (j27 >>> c11);
            c10 = c11;
            j12 = j22;
            i10 = 5;
        }
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        int i3 = 0;
        long j = 4294967295L;
        long j3 = iArr2[0] & 4294967295L;
        long j10 = iArr2[1] & 4294967295L;
        long j11 = iArr2[2] & 4294967295L;
        long j12 = iArr2[3] & 4294967295L;
        long j13 = iArr2[4] & 4294967295L;
        long j14 = 0;
        while (i3 < 5) {
            long j15 = j;
            long j16 = iArr[i3] & j15;
            int i10 = i3;
            long j17 = (j16 * j3) + (iArr3[i3] & j15);
            iArr3[i10] = (int) j17;
            int i11 = i10 + 1;
            long j18 = (j16 * j10) + (iArr3[i11] & j15) + (j17 >>> 32);
            iArr3[i11] = (int) j18;
            long j19 = (j16 * j11) + (iArr3[r15] & j15) + (j18 >>> 32);
            iArr3[i10 + 2] = (int) j19;
            long j20 = (j16 * j12) + (iArr3[r2] & j15) + (j19 >>> 32);
            iArr3[i10 + 3] = (int) j20;
            long j21 = (j16 * j13) + (iArr3[r2] & j15) + (j20 >>> 32);
            iArr3[i10 + 4] = (int) j21;
            long j22 = (j21 >>> 32) + (iArr3[r2] & j15) + j14;
            iArr3[i10 + 5] = (int) j22;
            j14 = j22 >>> 32;
            j = j15;
            j3 = j3;
            i3 = i11;
        }
        return (int) j14;
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j = iArr[0] & 4294967295L;
        int i3 = 10;
        int i10 = 0;
        int i11 = 4;
        while (true) {
            int i12 = i11 - 1;
            long j3 = iArr[i11] & 4294967295L;
            long j10 = j3 * j3;
            iArr2[i3 - 1] = (i10 << 31) | ((int) (j10 >>> 33));
            i3 -= 2;
            iArr2[i3] = (int) (j10 >>> 1);
            i10 = (int) j10;
            if (i12 <= 0) {
                long j11 = j * j;
                long j12 = (j11 >>> 33) | ((i10 << 31) & 4294967295L);
                iArr2[0] = (int) j11;
                int i13 = ((int) (j11 >>> 32)) & 1;
                long j13 = iArr[1] & 4294967295L;
                long j14 = (j13 * j) + j12;
                int i14 = (int) j14;
                iArr2[1] = i13 | (i14 << 1);
                long j15 = iArr[2] & 4294967295L;
                long j16 = (j15 * j) + (iArr2[2] & 4294967295L) + (j14 >>> 32);
                int i15 = (int) j16;
                iArr2[2] = (i15 << 1) | (i14 >>> 31);
                long i16 = u.i(j15, j13, j16 >>> 32, iArr2[3] & 4294967295L);
                long j17 = (iArr2[4] & 4294967295L) + (i16 >>> 32);
                long j18 = iArr[3] & 4294967295L;
                long j19 = (iArr2[5] & 4294967295L) + (j17 >>> 32);
                long j20 = j17 & 4294967295L;
                long j21 = (iArr2[6] & 4294967295L) + (j19 >>> 32);
                long j22 = j19 & 4294967295L;
                long j23 = (j18 * j) + (i16 & 4294967295L);
                int i17 = (int) j23;
                iArr2[3] = (i15 >>> 31) | (i17 << 1);
                int i18 = i17 >>> 31;
                long i19 = u.i(j18, j13, j23 >>> 32, j20);
                long i20 = u.i(j18, j15, i19 >>> 32, j22);
                long j24 = j21 + (i20 >>> 32);
                long j25 = iArr[4] & 4294967295L;
                long j26 = (iArr2[7] & 4294967295L) + (j24 >>> 32);
                long j27 = j24 & 4294967295L;
                long j28 = (iArr2[8] & 4294967295L) + (j26 >>> 32);
                long j29 = (j25 * j) + (i19 & 4294967295L);
                int i21 = (int) j29;
                iArr2[4] = i18 | (i21 << 1);
                int i22 = i21 >>> 31;
                long i23 = u.i(j25, j13, j29 >>> 32, i20 & 4294967295L);
                long i24 = u.i(j25, j15, i23 >>> 32, j27);
                long i25 = u.i(j25, j18, i24 >>> 32, j26 & 4294967295L);
                long j30 = j28 + (i25 >>> 32);
                int i26 = (int) i23;
                iArr2[5] = (i26 << 1) | i22;
                int i27 = (int) i24;
                iArr2[6] = (i26 >>> 31) | (i27 << 1);
                int i28 = i27 >>> 31;
                int i29 = (int) i25;
                iArr2[7] = i28 | (i29 << 1);
                int i30 = i29 >>> 31;
                int i31 = (int) j30;
                iArr2[8] = i30 | (i31 << 1);
                iArr2[9] = ((iArr2[9] + ((int) (j30 >>> 32))) << 1) | (i31 >>> 31);
                return;
            }
            i11 = i12;
        }
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j3 = ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j3;
        long j10 = ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L)) + (j3 >> 32);
        iArr3[2] = (int) j10;
        long j11 = ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L)) + (j10 >> 32);
        iArr3[3] = (int) j11;
        long j12 = ((iArr[4] & 4294967295L) - (iArr2[4] & 4294967295L)) + (j11 >> 32);
        iArr3[4] = (int) j12;
        return (int) (j12 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j = (iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L);
        iArr2[0] = (int) j;
        long j3 = ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L)) + (j >> 32);
        iArr2[1] = (int) j3;
        long j10 = ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L)) + (j3 >> 32);
        iArr2[2] = (int) j10;
        long j11 = ((iArr2[3] & 4294967295L) - (iArr[3] & 4294967295L)) + (j10 >> 32);
        iArr2[3] = (int) j11;
        long j12 = ((iArr2[4] & 4294967295L) - (4294967295L & iArr[4])) + (j11 >> 32);
        iArr2[4] = (int) j12;
        return (int) (j12 >> 32);
    }
}
