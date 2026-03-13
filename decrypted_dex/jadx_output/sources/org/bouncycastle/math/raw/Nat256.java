package org.bouncycastle.math.raw;

import i2.u;
import java.math.BigInteger;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class Nat256 {

    /* renamed from: M, reason: collision with root package name */
    private static final long f19312M = 4294967295L;

    public static int add(int[] iArr, int i3, int[] iArr2, int i10, int[] iArr3, int i11) {
        long j = (iArr[i3] & 4294967295L) + (iArr2[i10] & 4294967295L);
        iArr3[i11] = (int) j;
        long j3 = (iArr[i3 + 1] & 4294967295L) + (iArr2[i10 + 1] & 4294967295L) + (j >>> 32);
        iArr3[i11 + 1] = (int) j3;
        long j10 = (iArr[i3 + 2] & 4294967295L) + (iArr2[i10 + 2] & 4294967295L) + (j3 >>> 32);
        iArr3[i11 + 2] = (int) j10;
        long j11 = (iArr[i3 + 3] & 4294967295L) + (iArr2[i10 + 3] & 4294967295L) + (j10 >>> 32);
        iArr3[i11 + 3] = (int) j11;
        long j12 = (iArr[i3 + 4] & 4294967295L) + (iArr2[i10 + 4] & 4294967295L) + (j11 >>> 32);
        iArr3[i11 + 4] = (int) j12;
        long j13 = (iArr[i3 + 5] & 4294967295L) + (iArr2[i10 + 5] & 4294967295L) + (j12 >>> 32);
        iArr3[i11 + 5] = (int) j13;
        long j14 = (iArr[i3 + 6] & 4294967295L) + (iArr2[i10 + 6] & 4294967295L) + (j13 >>> 32);
        iArr3[i11 + 6] = (int) j14;
        long j15 = (iArr[i3 + 7] & 4294967295L) + (iArr2[i10 + 7] & 4294967295L) + (j14 >>> 32);
        iArr3[i11 + 7] = (int) j15;
        return (int) (j15 >>> 32);
    }

    public static int addBothTo(int[] iArr, int i3, int[] iArr2, int i10, int[] iArr3, int i11) {
        long j = (iArr[i3] & 4294967295L) + (iArr2[i10] & 4294967295L) + (iArr3[i11] & 4294967295L);
        iArr3[i11] = (int) j;
        long j3 = (iArr[i3 + 1] & 4294967295L) + (iArr2[i10 + 1] & 4294967295L) + (iArr3[r7] & 4294967295L) + (j >>> 32);
        iArr3[i11 + 1] = (int) j3;
        long j10 = (iArr[i3 + 2] & 4294967295L) + (iArr2[i10 + 2] & 4294967295L) + (iArr3[r7] & 4294967295L) + (j3 >>> 32);
        iArr3[i11 + 2] = (int) j10;
        long j11 = (iArr[i3 + 3] & 4294967295L) + (iArr2[i10 + 3] & 4294967295L) + (iArr3[r7] & 4294967295L) + (j10 >>> 32);
        iArr3[i11 + 3] = (int) j11;
        long j12 = (iArr[i3 + 4] & 4294967295L) + (iArr2[i10 + 4] & 4294967295L) + (iArr3[r7] & 4294967295L) + (j11 >>> 32);
        iArr3[i11 + 4] = (int) j12;
        long j13 = (iArr[i3 + 5] & 4294967295L) + (iArr2[i10 + 5] & 4294967295L) + (iArr3[r7] & 4294967295L) + (j12 >>> 32);
        iArr3[i11 + 5] = (int) j13;
        long j14 = (iArr[i3 + 6] & 4294967295L) + (iArr2[i10 + 6] & 4294967295L) + (iArr3[r7] & 4294967295L) + (j13 >>> 32);
        iArr3[i11 + 6] = (int) j14;
        long j15 = (iArr[i3 + 7] & 4294967295L) + (iArr2[i10 + 7] & 4294967295L) + (iArr3[r15] & 4294967295L) + (j14 >>> 32);
        iArr3[i11 + 7] = (int) j15;
        return (int) (j15 >>> 32);
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
        long j12 = (iArr[i3 + 4] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j11 >>> 32);
        iArr2[i10 + 4] = (int) j12;
        long j13 = (iArr[i3 + 5] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j12 >>> 32);
        iArr2[i10 + 5] = (int) j13;
        long j14 = (iArr[i3 + 6] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j13 >>> 32);
        iArr2[i10 + 6] = (int) j14;
        long j15 = (iArr[i3 + 7] & 4294967295L) + (4294967295L & iArr2[r12]) + (j14 >>> 32);
        iArr2[i10 + 7] = (int) j15;
        return (int) (j15 >>> 32);
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
        long j12 = (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L) + (j11 >>> 32);
        int i15 = (int) j12;
        iArr[i3 + 4] = i15;
        iArr2[i10 + 4] = i15;
        long j13 = (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L) + (j12 >>> 32);
        int i16 = (int) j13;
        iArr[i3 + 5] = i16;
        iArr2[i10 + 5] = i16;
        long j14 = (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L) + (j13 >>> 32);
        int i17 = (int) j14;
        iArr[i3 + 6] = i17;
        iArr2[i10 + 6] = i17;
        long j15 = (iArr[r12] & 4294967295L) + (4294967295L & iArr2[r14]) + (j14 >>> 32);
        int i18 = (int) j15;
        iArr[i3 + 7] = i18;
        iArr2[i10 + 7] = i18;
        return (int) (j15 >>> 32);
    }

    public static void copy(int[] iArr, int i3, int[] iArr2, int i10) {
        iArr2[i10] = iArr[i3];
        iArr2[i10 + 1] = iArr[i3 + 1];
        iArr2[i10 + 2] = iArr[i3 + 2];
        iArr2[i10 + 3] = iArr[i3 + 3];
        iArr2[i10 + 4] = iArr[i3 + 4];
        iArr2[i10 + 5] = iArr[i3 + 5];
        iArr2[i10 + 6] = iArr[i3 + 6];
        iArr2[i10 + 7] = iArr[i3 + 7];
    }

    public static void copy64(long[] jArr, int i3, long[] jArr2, int i10) {
        jArr2[i10] = jArr[i3];
        jArr2[i10 + 1] = jArr[i3 + 1];
        jArr2[i10 + 2] = jArr[i3 + 2];
        jArr2[i10 + 3] = jArr[i3 + 3];
    }

    public static int[] create() {
        return new int[8];
    }

    public static long[] create64() {
        return new long[4];
    }

    public static int[] createExt() {
        return new int[16];
    }

    public static long[] createExt64() {
        return new long[8];
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
        for (int i3 = 7; i3 >= 0; i3--) {
            if (iArr[i3] != iArr2[i3]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i3 = 3; i3 >= 0; i3--) {
            if (jArr[i3] != jArr2[i3]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        int[] create = create();
        for (int i3 = 0; i3 < 8; i3++) {
            create[i3] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return create;
    }

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        long[] create64 = create64();
        for (int i3 = 0; i3 < 4; i3++) {
            create64[i3] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
        }
        return create64;
    }

    public static int getBit(int[] iArr, int i3) {
        int i10;
        if (i3 == 0) {
            i10 = iArr[0];
        } else {
            if ((i3 & 255) != i3) {
                return 0;
            }
            i10 = iArr[i3 >>> 5] >>> (i3 & 31);
        }
        return i10 & 1;
    }

    public static boolean gte(int[] iArr, int i3, int[] iArr2, int i10) {
        for (int i11 = 7; i11 >= 0; i11--) {
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
        for (int i3 = 1; i3 < 8; i3++) {
            if (iArr[i3] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOne64(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i3 = 1; i3 < 4; i3++) {
            if (jArr[i3] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i3 = 0; i3 < 8; i3++) {
            if (iArr[i3] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i3 = 0; i3 < 4; i3++) {
            if (jArr[i3] != 0) {
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
        long j13 = iArr2[i10 + 5] & 4294967295L;
        long j14 = iArr2[i10 + 6] & 4294967295L;
        long j15 = iArr2[i10 + 7] & 4294967295L;
        long j16 = iArr[i3] & 4294967295L;
        long j17 = j16 * j;
        iArr3[i11] = (int) j17;
        long j18 = (j16 * j3) + (j17 >>> 32);
        iArr3[i11 + 1] = (int) j18;
        long j19 = (j16 * j10) + (j18 >>> 32);
        iArr3[i11 + 2] = (int) j19;
        long j20 = (j16 * j11) + (j19 >>> 32);
        iArr3[i11 + 3] = (int) j20;
        long j21 = (j16 * j12) + (j20 >>> 32);
        iArr3[i11 + 4] = (int) j21;
        long j22 = (j16 * j13) + (j21 >>> 32);
        iArr3[i11 + 5] = (int) j22;
        long j23 = (j16 * j14) + (j22 >>> 32);
        iArr3[i11 + 6] = (int) j23;
        long j24 = (j16 * j15) + (j23 >>> 32);
        iArr3[i11 + 7] = (int) j24;
        iArr3[i11 + 8] = (int) (j24 >>> 32);
        int i12 = 1;
        int i13 = i11;
        while (i12 < 8) {
            int i14 = i13 + 1;
            int i15 = i13;
            long j25 = iArr[i3 + i12] & 4294967295L;
            long j26 = (j25 * j) + (iArr3[i14] & 4294967295L);
            iArr3[i14] = (int) j26;
            long j27 = (j25 * j3) + (iArr3[r3] & 4294967295L) + (j26 >>> 32);
            iArr3[i15 + 2] = (int) j27;
            long j28 = (j25 * j10) + (iArr3[r24] & 4294967295L) + (j27 >>> 32);
            iArr3[i15 + 3] = (int) j28;
            long j29 = (j25 * j11) + (iArr3[r24] & 4294967295L) + (j28 >>> 32);
            iArr3[i15 + 4] = (int) j29;
            long j30 = (j25 * j12) + (iArr3[r24] & 4294967295L) + (j29 >>> 32);
            iArr3[i15 + 5] = (int) j30;
            long j31 = (j25 * j13) + (iArr3[r24] & 4294967295L) + (j30 >>> 32);
            iArr3[i15 + 6] = (int) j31;
            long j32 = (j25 * j14) + (iArr3[r24] & 4294967295L) + (j31 >>> 32);
            iArr3[i15 + 7] = (int) j32;
            long j33 = (j25 * j15) + (iArr3[r24] & 4294967295L) + (j32 >>> 32);
            iArr3[i15 + 8] = (int) j33;
            iArr3[i15 + 9] = (int) (j33 >>> 32);
            i12++;
            i13 = i14;
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
        long j18 = (j * j17) + j15 + (iArr2[i11 + 4] & 4294967295L) + (j16 >>> 32);
        iArr3[i12 + 4] = (int) j18;
        long j19 = iArr[i10 + 5] & 4294967295L;
        long j20 = (j * j19) + j17 + (iArr2[i11 + 5] & 4294967295L) + (j18 >>> 32);
        iArr3[i12 + 5] = (int) j20;
        long j21 = iArr[i10 + 6] & 4294967295L;
        long j22 = (j * j21) + j19 + (iArr2[i11 + 6] & 4294967295L) + (j20 >>> 32);
        iArr3[i12 + 6] = (int) j22;
        long j23 = iArr[i10 + 7] & 4294967295L;
        long j24 = (j * j23) + j21 + (4294967295L & iArr2[i11 + 7]) + (j22 >>> 32);
        iArr3[i12 + 7] = (int) j24;
        return (j24 >>> 32) + j23;
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
        return Nat.incAt(8, iArr, i10, 4);
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
        return Nat.incAt(8, iArr, i11, 3);
    }

    public static int mulAddTo(int[] iArr, int i3, int[] iArr2, int i10, int[] iArr3, int i11) {
        long j = iArr2[i10] & 4294967295L;
        long j3 = iArr2[i10 + 1] & 4294967295L;
        long j10 = iArr2[i10 + 2] & 4294967295L;
        long j11 = iArr2[i10 + 3] & 4294967295L;
        long j12 = iArr2[i10 + 4] & 4294967295L;
        long j13 = iArr2[i10 + 5] & 4294967295L;
        long j14 = iArr2[i10 + 6] & 4294967295L;
        long j15 = iArr2[i10 + 7] & 4294967295L;
        int i12 = i11;
        int i13 = 0;
        long j16 = 0;
        while (i13 < 8) {
            long j17 = j3;
            long j18 = iArr[i3 + i13] & 4294967295L;
            long j19 = (j18 * j) + (iArr3[i12] & 4294967295L);
            iArr3[i12] = (int) j19;
            int i14 = i12 + 1;
            long j20 = (j18 * j17) + (iArr3[i14] & 4294967295L) + (j19 >>> 32);
            iArr3[i14] = (int) j20;
            int i15 = i13;
            long j21 = (j18 * j10) + (iArr3[r5] & 4294967295L) + (j20 >>> 32);
            iArr3[i12 + 2] = (int) j21;
            long j22 = (j18 * j11) + (iArr3[r0] & 4294967295L) + (j21 >>> 32);
            iArr3[i12 + 3] = (int) j22;
            long j23 = (j18 * j12) + (iArr3[r0] & 4294967295L) + (j22 >>> 32);
            iArr3[i12 + 4] = (int) j23;
            long j24 = (j18 * j13) + (iArr3[r0] & 4294967295L) + (j23 >>> 32);
            iArr3[i12 + 5] = (int) j24;
            long j25 = (j18 * j14) + (iArr3[r0] & 4294967295L) + (j24 >>> 32);
            iArr3[i12 + 6] = (int) j25;
            long j26 = (j18 * j15) + (iArr3[r0] & 4294967295L) + (j25 >>> 32);
            iArr3[i12 + 7] = (int) j26;
            long j27 = (j26 >>> 32) + (iArr3[r16] & 4294967295L) + j16;
            iArr3[i12 + 8] = (int) j27;
            j16 = j27 >>> 32;
            i13 = i15 + 1;
            j3 = j17;
            i12 = i14;
        }
        return (int) j16;
    }

    public static int mulByWord(int i3, int[] iArr) {
        long j = i3 & 4294967295L;
        long j3 = (iArr[0] & 4294967295L) * j;
        iArr[0] = (int) j3;
        long j10 = ((iArr[1] & 4294967295L) * j) + (j3 >>> 32);
        iArr[1] = (int) j10;
        long j11 = ((iArr[2] & 4294967295L) * j) + (j10 >>> 32);
        iArr[2] = (int) j11;
        long j12 = ((iArr[3] & 4294967295L) * j) + (j11 >>> 32);
        iArr[3] = (int) j12;
        long j13 = ((iArr[4] & 4294967295L) * j) + (j12 >>> 32);
        iArr[4] = (int) j13;
        long j14 = ((iArr[5] & 4294967295L) * j) + (j13 >>> 32);
        iArr[5] = (int) j14;
        long j15 = ((iArr[6] & 4294967295L) * j) + (j14 >>> 32);
        iArr[6] = (int) j15;
        long j16 = (j * (4294967295L & iArr[7])) + (j15 >>> 32);
        iArr[7] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int mulByWordAddTo(int i3, int[] iArr, int[] iArr2) {
        long j = i3 & 4294967295L;
        long j3 = ((iArr2[0] & 4294967295L) * j) + (iArr[0] & 4294967295L);
        iArr2[0] = (int) j3;
        long j10 = ((iArr2[1] & 4294967295L) * j) + (iArr[1] & 4294967295L) + (j3 >>> 32);
        iArr2[1] = (int) j10;
        long j11 = ((iArr2[2] & 4294967295L) * j) + (iArr[2] & 4294967295L) + (j10 >>> 32);
        iArr2[2] = (int) j11;
        long j12 = ((iArr2[3] & 4294967295L) * j) + (iArr[3] & 4294967295L) + (j11 >>> 32);
        iArr2[3] = (int) j12;
        long j13 = ((iArr2[4] & 4294967295L) * j) + (iArr[4] & 4294967295L) + (j12 >>> 32);
        iArr2[4] = (int) j13;
        long j14 = ((iArr2[5] & 4294967295L) * j) + (iArr[5] & 4294967295L) + (j13 >>> 32);
        iArr2[5] = (int) j14;
        long j15 = ((iArr2[6] & 4294967295L) * j) + (iArr[6] & 4294967295L) + (j14 >>> 32);
        iArr2[6] = (int) j15;
        long j16 = (j * (iArr2[7] & 4294967295L)) + (4294967295L & iArr[7]) + (j15 >>> 32);
        iArr2[7] = (int) j16;
        return (int) (j16 >>> 32);
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
        } while (i11 < 8);
        return (int) j3;
    }

    public static int mulWordAddTo(int i3, int[] iArr, int i10, int[] iArr2, int i11) {
        long j = i3 & 4294967295L;
        long j3 = ((iArr[i10] & 4294967295L) * j) + (iArr2[i11] & 4294967295L);
        iArr2[i11] = (int) j3;
        long j10 = ((iArr[i10 + 1] & 4294967295L) * j) + (iArr2[r8] & 4294967295L) + (j3 >>> 32);
        iArr2[i11 + 1] = (int) j10;
        long j11 = ((iArr[i10 + 2] & 4294967295L) * j) + (iArr2[r8] & 4294967295L) + (j10 >>> 32);
        iArr2[i11 + 2] = (int) j11;
        long j12 = ((iArr[i10 + 3] & 4294967295L) * j) + (iArr2[r8] & 4294967295L) + (j11 >>> 32);
        iArr2[i11 + 3] = (int) j12;
        long j13 = ((iArr[i10 + 4] & 4294967295L) * j) + (iArr2[r8] & 4294967295L) + (j12 >>> 32);
        iArr2[i11 + 4] = (int) j13;
        long j14 = ((iArr[i10 + 5] & 4294967295L) * j) + (iArr2[r8] & 4294967295L) + (j13 >>> 32);
        iArr2[i11 + 5] = (int) j14;
        long j15 = ((iArr[i10 + 6] & 4294967295L) * j) + (iArr2[r8] & 4294967295L) + (j14 >>> 32);
        iArr2[i11 + 6] = (int) j15;
        long j16 = (j * (iArr[i10 + 7] & 4294967295L)) + (iArr2[r15] & 4294967295L) + (j15 >>> 32);
        iArr2[i11 + 7] = (int) j16;
        return (int) (j16 >>> 32);
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
        return Nat.incAt(8, iArr, i10, 3);
    }

    public static void square(int[] iArr, int i3, int[] iArr2, int i10) {
        long j = iArr[i3] & 4294967295L;
        int i11 = 0;
        int i12 = 16;
        int i13 = 7;
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
                long j28 = (iArr2[r4] & 4294967295L) + (j25 >>> 32);
                long j29 = j25 & 4294967295L;
                long j30 = (iArr2[r5] & 4294967295L) + (j28 >>> 32);
                long j31 = j28 & 4294967295L;
                long j32 = (j27 * j) + (i20 & 4294967295L);
                int i22 = (int) j32;
                iArr2[i10 + 4] = (i19 >>> 31) | (i22 << 1);
                int i23 = i22 >>> 31;
                long i24 = u.i(j27, j13, j32 >>> 32, j26);
                long i25 = u.i(j27, j16, i24 >>> 32, j29);
                long i26 = u.i(j27, j19, i25 >>> 32, j31);
                long j33 = i25 & 4294967295L;
                long j34 = j30 + (i26 >>> 32);
                long j35 = iArr[i3 + 5] & 4294967295L;
                long j36 = (iArr2[r10] & 4294967295L) + (j34 >>> 32);
                long j37 = j34 & 4294967295L;
                long j38 = (iArr2[r6] & 4294967295L) + (j36 >>> 32);
                long j39 = j36 & 4294967295L;
                long j40 = (j35 * j) + (i24 & 4294967295L);
                int i27 = (int) j40;
                iArr2[i10 + 5] = i23 | (i27 << 1);
                int i28 = i27 >>> 31;
                long i29 = u.i(j35, j13, j40 >>> 32, j33);
                long i30 = u.i(j35, j16, i29 >>> 32, i26 & 4294967295L);
                long i31 = u.i(j35, j19, i30 >>> 32, j37);
                long j41 = i30 & 4294967295L;
                long i32 = u.i(j35, j27, i31 >>> 32, j39);
                long j42 = j38 + (i32 >>> 32);
                long j43 = i32 & 4294967295L;
                long j44 = iArr[i3 + 6] & 4294967295L;
                long j45 = (iArr2[r9] & 4294967295L) + (j42 >>> 32);
                long j46 = j42 & 4294967295L;
                long j47 = (iArr2[r11] & 4294967295L) + (j45 >>> 32);
                long j48 = j45 & 4294967295L;
                long j49 = (j44 * j) + (i29 & 4294967295L);
                int i33 = (int) j49;
                iArr2[i10 + 6] = (i33 << 1) | i28;
                int i34 = i33 >>> 31;
                long i35 = u.i(j44, j13, j49 >>> 32, j41);
                long i36 = u.i(j44, j16, i35 >>> 32, i31 & 4294967295L);
                long i37 = u.i(j44, j19, i36 >>> 32, j43);
                long j50 = i36 & 4294967295L;
                long i38 = u.i(j44, j27, i37 >>> 32, j46);
                long j51 = i37 & 4294967295L;
                long i39 = u.i(j44, j35, i38 >>> 32, j48);
                long j52 = i38 & 4294967295L;
                long j53 = j47 + (i39 >>> 32);
                long j54 = i39 & 4294967295L;
                long j55 = iArr[i3 + 7] & 4294967295L;
                long j56 = (iArr2[r3] & 4294967295L) + (j53 >>> 32);
                long j57 = j53 & 4294967295L;
                long j58 = (iArr2[r2] & 4294967295L) + (j56 >>> 32);
                long j59 = j56 & 4294967295L;
                long j60 = (j55 * j) + (i35 & 4294967295L);
                int i40 = (int) j60;
                iArr2[i10 + 7] = (i40 << 1) | i34;
                int i41 = i40 >>> 31;
                long i42 = u.i(j55, j13, j60 >>> 32, j50);
                long i43 = u.i(j55, j16, i42 >>> 32, j51);
                long i44 = u.i(j55, j19, i43 >>> 32, j52);
                long i45 = u.i(j55, j27, i44 >>> 32, j54);
                long i46 = u.i(j55, j35, i45 >>> 32, j57);
                long i47 = u.i(j55, j44, i46 >>> 32, j59);
                long j61 = j58 + (i47 >>> 32);
                int i48 = (int) i42;
                iArr2[i10 + 8] = (i48 << 1) | i41;
                int i49 = (int) i43;
                iArr2[i10 + 9] = (i48 >>> 31) | (i49 << 1);
                int i50 = i49 >>> 31;
                int i51 = (int) i44;
                iArr2[i10 + 10] = i50 | (i51 << 1);
                int i52 = i51 >>> 31;
                int i53 = (int) i45;
                iArr2[i10 + 11] = i52 | (i53 << 1);
                int i54 = i53 >>> 31;
                int i55 = (int) i46;
                iArr2[i10 + 12] = i54 | (i55 << 1);
                int i56 = i55 >>> 31;
                int i57 = (int) i47;
                iArr2[i10 + 13] = i56 | (i57 << 1);
                int i58 = i57 >>> 31;
                int i59 = (int) j61;
                iArr2[i10 + 14] = i58 | (i59 << 1);
                int i60 = i59 >>> 31;
                int i61 = i10 + 15;
                iArr2[i61] = i60 | ((iArr2[i61] + ((int) (j61 >>> 32))) << 1);
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
        long j13 = ((iArr[i3 + 5] & 4294967295L) - (iArr2[i10 + 5] & 4294967295L)) + (j12 >> 32);
        iArr3[i11 + 5] = (int) j13;
        long j14 = ((iArr[i3 + 6] & 4294967295L) - (iArr2[i10 + 6] & 4294967295L)) + (j13 >> 32);
        iArr3[i11 + 6] = (int) j14;
        long j15 = ((iArr[i3 + 7] & 4294967295L) - (iArr2[i10 + 7] & 4294967295L)) + (j14 >> 32);
        iArr3[i11 + 7] = (int) j15;
        return (int) (j15 >> 32);
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
        long j13 = (((iArr3[5] & 4294967295L) - (iArr[5] & 4294967295L)) - (iArr2[5] & 4294967295L)) + (j12 >> 32);
        iArr3[5] = (int) j13;
        long j14 = (((iArr3[6] & 4294967295L) - (iArr[6] & 4294967295L)) - (iArr2[6] & 4294967295L)) + (j13 >> 32);
        iArr3[6] = (int) j14;
        long j15 = (((iArr3[7] & 4294967295L) - (iArr[7] & 4294967295L)) - (iArr2[7] & 4294967295L)) + (j14 >> 32);
        iArr3[7] = (int) j15;
        return (int) (j15 >> 32);
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
        long j12 = ((iArr2[r5] & 4294967295L) - (iArr[i3 + 4] & 4294967295L)) + (j11 >> 32);
        iArr2[i10 + 4] = (int) j12;
        long j13 = ((iArr2[r5] & 4294967295L) - (iArr[i3 + 5] & 4294967295L)) + (j12 >> 32);
        iArr2[i10 + 5] = (int) j13;
        long j14 = ((iArr2[r5] & 4294967295L) - (iArr[i3 + 6] & 4294967295L)) + (j13 >> 32);
        iArr2[i10 + 6] = (int) j14;
        long j15 = ((iArr2[r13] & 4294967295L) - (iArr[i3 + 7] & 4294967295L)) + (j14 >> 32);
        iArr2[i10 + 7] = (int) j15;
        return (int) (j15 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i3 = 0; i3 < 8; i3++) {
            int i10 = iArr[i3];
            if (i10 != 0) {
                Pack.intToBigEndian(i10, bArr, (7 - i3) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i3 = 0; i3 < 4; i3++) {
            long j = jArr[i3];
            if (j != 0) {
                Pack.longToBigEndian(j, bArr, (3 - i3) << 3);
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
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
    }

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
        long j13 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (j12 >>> 32);
        iArr3[5] = (int) j13;
        long j14 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (j13 >>> 32);
        iArr3[6] = (int) j14;
        long j15 = (iArr[7] & 4294967295L) + (iArr2[7] & 4294967295L) + (j14 >>> 32);
        iArr3[7] = (int) j15;
        return (int) (j15 >>> 32);
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
        long j13 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (iArr3[5] & 4294967295L) + (j12 >>> 32);
        iArr3[5] = (int) j13;
        long j14 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (iArr3[6] & 4294967295L) + (j13 >>> 32);
        iArr3[6] = (int) j14;
        long j15 = (iArr[7] & 4294967295L) + (iArr2[7] & 4294967295L) + (iArr3[7] & 4294967295L) + (j14 >>> 32);
        iArr3[7] = (int) j15;
        return (int) (j15 >>> 32);
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
        long j12 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (j11 >>> 32);
        iArr2[4] = (int) j12;
        long j13 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (j12 >>> 32);
        iArr2[5] = (int) j13;
        long j14 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (j13 >>> 32);
        iArr2[6] = (int) j14;
        long j15 = (iArr[7] & 4294967295L) + (4294967295L & iArr2[7]) + (j14 >>> 32);
        iArr2[7] = (int) j15;
        return (int) (j15 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
        iArr2[7] = iArr[7];
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i3 = 7; i3 >= 0; i3--) {
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
        long j13 = iArr2[5] & 4294967295L;
        long j14 = iArr2[6] & 4294967295L;
        long j15 = iArr2[7] & 4294967295L;
        long j16 = iArr[0] & 4294967295L;
        long j17 = j16 * j;
        iArr3[0] = (int) j17;
        long j18 = (j16 * j3) + (j17 >>> 32);
        iArr3[1] = (int) j18;
        long j19 = (j16 * j10) + (j18 >>> 32);
        iArr3[2] = (int) j19;
        long j20 = (j16 * j11) + (j19 >>> 32);
        iArr3[3] = (int) j20;
        long j21 = (j16 * j12) + (j20 >>> 32);
        iArr3[4] = (int) j21;
        long j22 = (j16 * j13) + (j21 >>> 32);
        iArr3[5] = (int) j22;
        long j23 = (j16 * j14) + (j22 >>> 32);
        iArr3[6] = (int) j23;
        long j24 = (j16 * j15) + (j23 >>> 32);
        iArr3[7] = (int) j24;
        int i3 = (int) (j24 >>> 32);
        iArr3[8] = i3;
        int i10 = 1;
        for (int i11 = 8; i10 < i11; i11 = 8) {
            long j25 = iArr[i10] & 4294967295L;
            long j26 = j12;
            long j27 = (j25 * j) + (iArr3[i10] & 4294967295L);
            iArr3[i10] = (int) j27;
            int i12 = i10 + 1;
            long j28 = (j25 * j3) + (iArr3[i12] & 4294967295L) + (j27 >>> 32);
            iArr3[i12] = (int) j28;
            long j29 = (j25 * j10) + (iArr3[r25] & 4294967295L) + (j28 >>> 32);
            iArr3[i10 + 2] = (int) j29;
            long j30 = (j25 * j11) + (iArr3[r25] & 4294967295L) + (j29 >>> 32);
            iArr3[i10 + 3] = (int) j30;
            long j31 = (j25 * j26) + (iArr3[r25] & 4294967295L) + (j30 >>> 32);
            iArr3[i10 + 4] = (int) j31;
            long j32 = (j25 * j13) + (iArr3[r25] & 4294967295L) + (j31 >>> 32);
            iArr3[i10 + 5] = (int) j32;
            long j33 = (j25 * j14) + (iArr3[r25] & 4294967295L) + (j32 >>> 32);
            iArr3[i10 + 6] = (int) j33;
            long j34 = j33 >>> 32;
            long j35 = (j25 * j15) + (iArr3[r14] & 4294967295L) + j34;
            iArr3[i10 + 7] = (int) j35;
            iArr3[i10 + 8] = (int) (j35 >>> 32);
            i10 = i12;
            j12 = j26;
        }
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0] & 4294967295L;
        long j3 = iArr2[1] & 4294967295L;
        long j10 = iArr2[2] & 4294967295L;
        long j11 = iArr2[3] & 4294967295L;
        long j12 = iArr2[4] & 4294967295L;
        long j13 = iArr2[5] & 4294967295L;
        long j14 = iArr2[6] & 4294967295L;
        long j15 = iArr2[7] & 4294967295L;
        long j16 = 0;
        int i3 = 0;
        while (i3 < 8) {
            long j17 = iArr[i3] & 4294967295L;
            long j18 = (j17 * j) + (iArr3[i3] & 4294967295L);
            int i10 = i3;
            iArr3[i10] = (int) j18;
            int i11 = i10 + 1;
            long j19 = (j17 * j3) + (iArr3[i11] & 4294967295L) + (j18 >>> 32);
            iArr3[i11] = (int) j19;
            long j20 = (j17 * j10) + (iArr3[r4] & 4294967295L) + (j19 >>> 32);
            iArr3[i10 + 2] = (int) j20;
            long j21 = (j17 * j11) + (iArr3[r4] & 4294967295L) + (j20 >>> 32);
            iArr3[i10 + 3] = (int) j21;
            long j22 = (j17 * j12) + (iArr3[r4] & 4294967295L) + (j21 >>> 32);
            iArr3[i10 + 4] = (int) j22;
            long j23 = (j17 * j13) + (iArr3[r4] & 4294967295L) + (j22 >>> 32);
            iArr3[i10 + 5] = (int) j23;
            long j24 = (j17 * j14) + (iArr3[r4] & 4294967295L) + (j23 >>> 32);
            iArr3[i10 + 6] = (int) j24;
            long j25 = (j17 * j15) + (iArr3[r4] & 4294967295L) + (j24 >>> 32);
            iArr3[i10 + 7] = (int) j25;
            long j26 = (j25 >>> 32) + (iArr3[r4] & 4294967295L) + j16;
            iArr3[i10 + 8] = (int) j26;
            j16 = j26 >>> 32;
            i3 = i11;
        }
        return (int) j16;
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j = iArr[0] & 4294967295L;
        int i3 = 16;
        int i10 = 0;
        int i11 = 7;
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
                long j25 = i20 & 4294967295L;
                long j26 = iArr[4] & 4294967295L;
                long j27 = (iArr2[7] & 4294967295L) + (j24 >>> 32);
                long j28 = (iArr2[8] & 4294967295L) + (j27 >>> 32);
                long j29 = j27 & 4294967295L;
                long j30 = (j26 * j) + (i19 & 4294967295L);
                int i21 = (int) j30;
                iArr2[4] = i18 | (i21 << 1);
                long i22 = u.i(j26, j13, j30 >>> 32, j25);
                long i23 = u.i(j26, j15, i22 >>> 32, j24 & 4294967295L);
                long i24 = u.i(j26, j18, i23 >>> 32, j29);
                long j31 = i23 & 4294967295L;
                long j32 = j28 + (i24 >>> 32);
                long j33 = i24 & 4294967295L;
                long j34 = iArr[5] & 4294967295L;
                long j35 = (iArr2[9] & 4294967295L) + (j32 >>> 32);
                long j36 = (j34 * j) + (i22 & 4294967295L);
                int i25 = (int) j36;
                iArr2[5] = (i21 >>> 31) | (i25 << 1);
                int i26 = i25 >>> 31;
                long i27 = u.i(j34, j13, j36 >>> 32, j31);
                long i28 = u.i(j34, j15, i27 >>> 32, j33);
                long i29 = u.i(j34, j18, i28 >>> 32, j32 & 4294967295L);
                long j37 = i28 & 4294967295L;
                long i30 = u.i(j34, j26, i29 >>> 32, j35 & 4294967295L);
                long j38 = i29 & 4294967295L;
                long j39 = (iArr2[10] & 4294967295L) + (j35 >>> 32) + (i30 >>> 32);
                long j40 = iArr[6] & 4294967295L;
                long j41 = (iArr2[11] & 4294967295L) + (j39 >>> 32);
                long j42 = (iArr2[12] & 4294967295L) + (j41 >>> 32);
                long j43 = (j40 * j) + (i27 & 4294967295L);
                int i31 = (int) j43;
                iArr2[6] = i26 | (i31 << 1);
                int i32 = i31 >>> 31;
                long i33 = u.i(j40, j13, j43 >>> 32, j37);
                long i34 = u.i(j40, j15, i33 >>> 32, j38);
                long i35 = u.i(j40, j18, i34 >>> 32, i30 & 4294967295L);
                long j44 = i34 & 4294967295L;
                long i36 = u.i(j40, j26, i35 >>> 32, j39 & 4294967295L);
                long j45 = i35 & 4294967295L;
                long i37 = u.i(j40, j34, i36 >>> 32, j41 & 4294967295L);
                long j46 = j42 + (i37 >>> 32);
                long j47 = iArr[7] & 4294967295L;
                long j48 = (iArr2[13] & 4294967295L) + (j46 >>> 32);
                long j49 = (iArr2[14] & 4294967295L) + (j48 >>> 32);
                long j50 = j48 & 4294967295L;
                long j51 = (j47 * j) + (i33 & 4294967295L);
                int i38 = (int) j51;
                iArr2[7] = (i38 << 1) | i32;
                int i39 = i38 >>> 31;
                long i40 = u.i(j47, j13, j51 >>> 32, j44);
                long i41 = u.i(j47, j15, i40 >>> 32, j45);
                long i42 = u.i(j47, j18, i41 >>> 32, i36 & 4294967295L);
                long i43 = u.i(j47, j26, i42 >>> 32, i37 & 4294967295L);
                long i44 = u.i(j47, j34, i43 >>> 32, j46 & 4294967295L);
                long i45 = u.i(j47, j40, i44 >>> 32, j50);
                long j52 = j49 + (i45 >>> 32);
                int i46 = (int) i40;
                iArr2[8] = (i46 << 1) | i39;
                int i47 = (int) i41;
                iArr2[9] = (i46 >>> 31) | (i47 << 1);
                int i48 = i47 >>> 31;
                int i49 = (int) i42;
                iArr2[10] = i48 | (i49 << 1);
                int i50 = i49 >>> 31;
                int i51 = (int) i43;
                iArr2[11] = i50 | (i51 << 1);
                int i52 = i51 >>> 31;
                int i53 = (int) i44;
                iArr2[12] = i52 | (i53 << 1);
                int i54 = i53 >>> 31;
                int i55 = (int) i45;
                iArr2[13] = i54 | (i55 << 1);
                int i56 = i55 >>> 31;
                int i57 = (int) j52;
                iArr2[14] = i56 | (i57 << 1);
                iArr2[15] = ((iArr2[15] + ((int) (j52 >>> 32))) << 1) | (i57 >>> 31);
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
        long j13 = ((iArr[5] & 4294967295L) - (iArr2[5] & 4294967295L)) + (j12 >> 32);
        iArr3[5] = (int) j13;
        long j14 = ((iArr[6] & 4294967295L) - (iArr2[6] & 4294967295L)) + (j13 >> 32);
        iArr3[6] = (int) j14;
        long j15 = ((iArr[7] & 4294967295L) - (iArr2[7] & 4294967295L)) + (j14 >> 32);
        iArr3[7] = (int) j15;
        return (int) (j15 >> 32);
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
        long j12 = ((iArr2[4] & 4294967295L) - (iArr[4] & 4294967295L)) + (j11 >> 32);
        iArr2[4] = (int) j12;
        long j13 = ((iArr2[5] & 4294967295L) - (iArr[5] & 4294967295L)) + (j12 >> 32);
        iArr2[5] = (int) j13;
        long j14 = ((iArr2[6] & 4294967295L) - (iArr[6] & 4294967295L)) + (j13 >> 32);
        iArr2[6] = (int) j14;
        long j15 = ((iArr2[7] & 4294967295L) - (4294967295L & iArr[7])) + (j14 >> 32);
        iArr2[7] = (int) j15;
        return (int) (j15 >> 32);
    }
}
