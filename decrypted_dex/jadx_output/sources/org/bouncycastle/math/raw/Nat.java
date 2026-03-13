package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class Nat {

    /* renamed from: M, reason: collision with root package name */
    private static final long f19307M = 4294967295L;

    public static int add(int i3, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i10 = 0; i10 < i3; i10++) {
            long j3 = (iArr[i10] & 4294967295L) + (4294967295L & iArr2[i10]) + j;
            iArr3[i10] = (int) j3;
            j = j3 >>> 32;
        }
        return (int) j;
    }

    public static int add33At(int i3, int i10, int[] iArr, int i11) {
        long j = (iArr[i11] & 4294967295L) + (i10 & 4294967295L);
        iArr[i11] = (int) j;
        long j3 = (4294967295L & iArr[r4]) + 1 + (j >>> 32);
        iArr[i11 + 1] = (int) j3;
        if ((j3 >>> 32) == 0) {
            return 0;
        }
        return incAt(i3, iArr, i11 + 2);
    }

    public static int add33To(int i3, int i10, int[] iArr) {
        long j = (iArr[0] & 4294967295L) + (i10 & 4294967295L);
        iArr[0] = (int) j;
        long j3 = (4294967295L & iArr[1]) + 1 + (j >>> 32);
        iArr[1] = (int) j3;
        if ((j3 >>> 32) == 0) {
            return 0;
        }
        return incAt(i3, iArr, 2);
    }

    public static int addBothTo(int i3, int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j = 0;
        for (int i13 = 0; i13 < i3; i13++) {
            long j3 = (iArr[i10 + i13] & 4294967295L) + (iArr2[i11 + i13] & 4294967295L) + (4294967295L & iArr3[r7]) + j;
            iArr3[i12 + i13] = (int) j3;
            j = j3 >>> 32;
        }
        return (int) j;
    }

    public static int addDWordAt(int i3, long j, int[] iArr, int i10) {
        long j3 = (iArr[i10] & 4294967295L) + (j & 4294967295L);
        iArr[i10] = (int) j3;
        long j10 = (4294967295L & iArr[r5]) + (j >>> 32) + (j3 >>> 32);
        iArr[i10 + 1] = (int) j10;
        if ((j10 >>> 32) == 0) {
            return 0;
        }
        return incAt(i3, iArr, i10 + 2);
    }

    public static int addDWordTo(int i3, long j, int[] iArr) {
        long j3 = (iArr[0] & 4294967295L) + (j & 4294967295L);
        iArr[0] = (int) j3;
        long j10 = (4294967295L & iArr[1]) + (j >>> 32) + (j3 >>> 32);
        iArr[1] = (int) j10;
        if ((j10 >>> 32) == 0) {
            return 0;
        }
        return incAt(i3, iArr, 2);
    }

    public static int addTo(int i3, int[] iArr, int i10, int[] iArr2, int i11) {
        long j = 0;
        for (int i12 = 0; i12 < i3; i12++) {
            long j3 = (iArr[i10 + i12] & 4294967295L) + (4294967295L & iArr2[r7]) + j;
            iArr2[i11 + i12] = (int) j3;
            j = j3 >>> 32;
        }
        return (int) j;
    }

    public static int addToEachOther(int i3, int[] iArr, int i10, int[] iArr2, int i11) {
        long j = 0;
        for (int i12 = 0; i12 < i3; i12++) {
            long j3 = (iArr[r3] & 4294967295L) + (4294967295L & iArr2[r8]) + j;
            int i13 = (int) j3;
            iArr[i10 + i12] = i13;
            iArr2[i11 + i12] = i13;
            j = j3 >>> 32;
        }
        return (int) j;
    }

    public static int addWordAt(int i3, int i10, int[] iArr, int i11) {
        long j = (i10 & 4294967295L) + (4294967295L & iArr[i11]);
        iArr[i11] = (int) j;
        if ((j >>> 32) == 0) {
            return 0;
        }
        return incAt(i3, iArr, i11 + 1);
    }

    public static int addWordTo(int i3, int i10, int[] iArr) {
        long j = (i10 & 4294967295L) + (4294967295L & iArr[0]);
        iArr[0] = (int) j;
        if ((j >>> 32) == 0) {
            return 0;
        }
        return incAt(i3, iArr, 1);
    }

    public static int cadd(int i3, int i10, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (-(i10 & 1)) & 4294967295L;
        long j3 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            long j10 = (iArr[i11] & 4294967295L) + (iArr2[i11] & j) + j3;
            iArr3[i11] = (int) j10;
            j3 = j10 >>> 32;
        }
        return (int) j3;
    }

    public static void cmov(int i3, int i10, int[] iArr, int i11, int[] iArr2, int i12) {
        int i13 = -(i10 & 1);
        for (int i14 = 0; i14 < i3; i14++) {
            int i15 = i12 + i14;
            int i16 = iArr2[i15];
            iArr2[i15] = i16 ^ ((iArr[i11 + i14] ^ i16) & i13);
        }
    }

    public static int compare(int i3, int[] iArr, int i10, int[] iArr2, int i11) {
        for (int i12 = i3 - 1; i12 >= 0; i12--) {
            int i13 = iArr[i10 + i12] ^ Integer.MIN_VALUE;
            int i14 = Integer.MIN_VALUE ^ iArr2[i11 + i12];
            if (i13 < i14) {
                return -1;
            }
            if (i13 > i14) {
                return 1;
            }
        }
        return 0;
    }

    public static void copy(int i3, int[] iArr, int i10, int[] iArr2, int i11) {
        System.arraycopy(iArr, i10, iArr2, i11, i3);
    }

    public static void copy64(int i3, long[] jArr, int i10, long[] jArr2, int i11) {
        System.arraycopy(jArr, i10, jArr2, i11, i3);
    }

    public static int[] create(int i3) {
        return new int[i3];
    }

    public static long[] create64(int i3) {
        return new long[i3];
    }

    public static int csub(int i3, int i10, int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        long j = (-(i10 & 1)) & 4294967295L;
        long j3 = 0;
        for (int i14 = 0; i14 < i3; i14++) {
            long j10 = ((iArr[i11 + i14] & 4294967295L) - (iArr2[i12 + i14] & j)) + j3;
            iArr3[i13 + i14] = (int) j10;
            j3 = j10 >> 32;
        }
        return (int) j3;
    }

    public static int dec(int i3, int[] iArr) {
        for (int i10 = 0; i10 < i3; i10++) {
            int i11 = iArr[i10] - 1;
            iArr[i10] = i11;
            if (i11 != -1) {
                return 0;
            }
        }
        return -1;
    }

    public static int decAt(int i3, int[] iArr, int i10) {
        while (i10 < i3) {
            int i11 = iArr[i10] - 1;
            iArr[i10] = i11;
            if (i11 != -1) {
                return 0;
            }
            i10++;
        }
        return -1;
    }

    public static boolean diff(int i3, int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        boolean gte = gte(i3, iArr, i10, iArr2, i11);
        if (gte) {
            sub(i3, iArr, i10, iArr2, i11, iArr3, i12);
            return gte;
        }
        sub(i3, iArr2, i11, iArr, i10, iArr3, i12);
        return gte;
    }

    public static boolean eq(int i3, int[] iArr, int[] iArr2) {
        for (int i10 = i3 - 1; i10 >= 0; i10--) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static int equalTo(int i3, int[] iArr, int i10) {
        int i11 = i10 ^ iArr[0];
        for (int i12 = 1; i12 < i3; i12++) {
            i11 |= iArr[i12];
        }
        return (((i11 >>> 1) | (i11 & 1)) - 1) >> 31;
    }

    public static int equalToZero(int i3, int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            i10 |= iArr[i11];
        }
        return (((i10 >>> 1) | (i10 & 1)) - 1) >> 31;
    }

    public static int[] fromBigInteger(int i3, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i3) {
            throw new IllegalArgumentException();
        }
        int i10 = (i3 + 31) >> 5;
        int[] create = create(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            create[i11] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return create;
    }

    public static long[] fromBigInteger64(int i3, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i3) {
            throw new IllegalArgumentException();
        }
        int i10 = (i3 + 63) >> 6;
        long[] create64 = create64(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            create64[i11] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
        }
        return create64;
    }

    public static int getBit(int[] iArr, int i3) {
        int i10;
        if (i3 == 0) {
            i10 = iArr[0];
        } else {
            int i11 = i3 >> 5;
            if (i11 < 0 || i11 >= iArr.length) {
                return 0;
            }
            i10 = iArr[i11] >>> (i3 & 31);
        }
        return i10 & 1;
    }

    public static boolean gte(int i3, int[] iArr, int i10, int[] iArr2, int i11) {
        for (int i12 = i3 - 1; i12 >= 0; i12--) {
            int i13 = iArr[i10 + i12] ^ Integer.MIN_VALUE;
            int i14 = Integer.MIN_VALUE ^ iArr2[i11 + i12];
            if (i13 < i14) {
                return false;
            }
            if (i13 > i14) {
                return true;
            }
        }
        return true;
    }

    public static int inc(int i3, int[] iArr) {
        for (int i10 = 0; i10 < i3; i10++) {
            int i11 = iArr[i10] + 1;
            iArr[i10] = i11;
            if (i11 != 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int incAt(int i3, int[] iArr, int i10) {
        while (i10 < i3) {
            int i11 = iArr[i10] + 1;
            iArr[i10] = i11;
            if (i11 != 0) {
                return 0;
            }
            i10++;
        }
        return 1;
    }

    public static boolean isOne(int i3, int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i10 = 1; i10 < i3; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int i3, int[] iArr) {
        for (int i10 = 0; i10 < i3; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int lessThan(int i3, int[] iArr, int i10, int[] iArr2, int i11) {
        long j = 0;
        for (int i12 = 0; i12 < i3; i12++) {
            j = (((iArr[i10 + i12] & 4294967295L) - (4294967295L & iArr2[i11 + i12])) + j) >> 32;
        }
        return (int) j;
    }

    public static void mul(int i3, int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        iArr3[i12 + i3] = mulWord(i3, iArr[i10], iArr2, i11, iArr3, i12);
        for (int i13 = 1; i13 < i3; i13++) {
            int i14 = i12 + i13;
            iArr3[i14 + i3] = mulWordAddTo(i3, iArr[i10 + i13], iArr2, i11, iArr3, i14);
        }
    }

    public static int mul31BothAdd(int i3, int i10, int[] iArr, int i11, int[] iArr2, int[] iArr3, int i12) {
        long j = i10 & 4294967295L;
        long j3 = i11 & 4294967295L;
        long j10 = 0;
        int i13 = 0;
        do {
            long j11 = ((iArr2[i13] & 4294967295L) * j3) + ((iArr[i13] & 4294967295L) * j) + (iArr3[r9] & 4294967295L) + j10;
            iArr3[i12 + i13] = (int) j11;
            j10 = j11 >>> 32;
            i13++;
        } while (i13 < i3);
        return (int) j10;
    }

    public static int mulAddTo(int i3, int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j = 0;
        int i13 = 0;
        int i14 = i12;
        while (i13 < i3) {
            int i15 = i3;
            int[] iArr4 = iArr3;
            long mulWordAddTo = j + (mulWordAddTo(i15, iArr[i10 + i13], r5, r6, iArr4, i14) & 4294967295L) + (iArr4[r9] & 4294967295L);
            iArr4[i14 + i15] = (int) mulWordAddTo;
            j = mulWordAddTo >>> 32;
            i14++;
            i13++;
            i3 = i15;
            iArr2 = iArr2;
            i11 = i11;
            iArr3 = iArr4;
        }
        return (int) j;
    }

    public static int mulWord(int i3, int i10, int[] iArr, int i11, int[] iArr2, int i12) {
        long j = i10 & 4294967295L;
        long j3 = 0;
        int i13 = 0;
        do {
            long j10 = ((iArr[i11 + i13] & 4294967295L) * j) + j3;
            iArr2[i12 + i13] = (int) j10;
            j3 = j10 >>> 32;
            i13++;
        } while (i13 < i3);
        return (int) j3;
    }

    public static int mulWordAddTo(int i3, int i10, int[] iArr, int i11, int[] iArr2, int i12) {
        long j = i10 & 4294967295L;
        long j3 = 0;
        int i13 = 0;
        do {
            long j10 = ((iArr[i11 + i13] & 4294967295L) * j) + (iArr2[r8] & 4294967295L) + j3;
            iArr2[i12 + i13] = (int) j10;
            j3 = j10 >>> 32;
            i13++;
        } while (i13 < i3);
        return (int) j3;
    }

    public static int mulWordDwordAddAt(int i3, int i10, long j, int[] iArr, int i11) {
        long j3 = i10 & 4294967295L;
        long j10 = ((j & 4294967295L) * j3) + (iArr[i11] & 4294967295L);
        iArr[i11] = (int) j10;
        long j11 = j3 * (j >>> 32);
        long j12 = j11 + (iArr[r10] & 4294967295L) + (j10 >>> 32);
        iArr[i11 + 1] = (int) j12;
        long j13 = j12 >>> 32;
        long j14 = j13 + (iArr[r0] & 4294967295L);
        iArr[i11 + 2] = (int) j14;
        if ((j14 >>> 32) == 0) {
            return 0;
        }
        return incAt(i3, iArr, i11 + 3);
    }

    public static int shiftDownBit(int i3, int[] iArr, int i10) {
        while (true) {
            i3--;
            if (i3 < 0) {
                return i10 << 31;
            }
            int i11 = iArr[i3];
            iArr[i3] = (i10 << 31) | (i11 >>> 1);
            i10 = i11;
        }
    }

    public static int shiftDownBits(int i3, int[] iArr, int i10, int i11) {
        while (true) {
            i3--;
            if (i3 < 0) {
                return i11 << (-i10);
            }
            int i12 = iArr[i3];
            iArr[i3] = (i11 << (-i10)) | (i12 >>> i10);
            i11 = i12;
        }
    }

    public static int shiftDownWord(int i3, int[] iArr, int i10) {
        while (true) {
            i3--;
            if (i3 < 0) {
                return i10;
            }
            int i11 = iArr[i3];
            iArr[i3] = i10;
            i10 = i11;
        }
    }

    public static int shiftUpBit(int i3, int[] iArr, int i10) {
        int i11 = 0;
        while (i11 < i3) {
            int i12 = iArr[i11];
            iArr[i11] = (i10 >>> 31) | (i12 << 1);
            i11++;
            i10 = i12;
        }
        return i10 >>> 31;
    }

    public static long shiftUpBit64(int i3, long[] jArr, int i10, long j, long[] jArr2, int i11) {
        int i12 = 0;
        while (i12 < i3) {
            long j3 = jArr[i10 + i12];
            jArr2[i11 + i12] = (j >>> 63) | (j3 << 1);
            i12++;
            j = j3;
        }
        return j >>> 63;
    }

    public static int shiftUpBits(int i3, int[] iArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i3) {
            int i13 = iArr[i12];
            iArr[i12] = (i11 >>> (-i10)) | (i13 << i10);
            i12++;
            i11 = i13;
        }
        return i11 >>> (-i10);
    }

    public static long shiftUpBits64(int i3, long[] jArr, int i10, int i11, long j) {
        int i12 = 0;
        while (i12 < i3) {
            int i13 = i10 + i12;
            long j3 = jArr[i13];
            jArr[i13] = (j >>> (-i11)) | (j3 << i11);
            i12++;
            j = j3;
        }
        return j >>> (-i11);
    }

    public static void square(int i3, int[] iArr, int i10, int[] iArr2, int i11) {
        int i12;
        int i13 = i3 << 1;
        int i14 = 0;
        int i15 = i3;
        int i16 = i13;
        do {
            i15--;
            long j = iArr[i10 + i15] & 4294967295L;
            long j3 = j * j;
            iArr2[(i16 - 1) + i11] = (i14 << 31) | ((int) (j3 >>> 33));
            i16 -= 2;
            iArr2[i11 + i16] = (int) (j3 >>> 1);
            i14 = (int) j3;
        } while (i15 > 0);
        int i17 = i11 + 2;
        long j10 = 0;
        for (i12 = 1; i12 < i3; i12++) {
            long squareWordAddTo = j10 + (squareWordAddTo(iArr, i10, i12, iArr2, i11) & 4294967295L) + (iArr2[i17] & 4294967295L);
            int i18 = i17 + 1;
            iArr2[i17] = (int) squareWordAddTo;
            long j11 = (squareWordAddTo >>> 32) + (iArr2[i18] & 4294967295L);
            i17 += 2;
            iArr2[i18] = (int) j11;
            j10 = j11 >>> 32;
        }
        shiftUpBit(i13, iArr2, i11, iArr[i10] << 31);
    }

    public static int squareWordAddTo(int[] iArr, int i3, int i10, int[] iArr2, int i11) {
        long j = iArr[i3 + i10] & 4294967295L;
        int i12 = 0;
        long j3 = 0;
        int i13 = i11;
        do {
            long j10 = ((iArr[i3 + i12] & 4294967295L) * j) + (iArr2[r11] & 4294967295L) + j3;
            iArr2[i10 + i13] = (int) j10;
            j3 = j10 >>> 32;
            i13++;
            i12++;
        } while (i12 < i10);
        return (int) j3;
    }

    public static int sub(int i3, int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j = 0;
        for (int i13 = 0; i13 < i3; i13++) {
            long j3 = ((iArr[i10 + i13] & 4294967295L) - (4294967295L & iArr2[i11 + i13])) + j;
            iArr3[i12 + i13] = (int) j3;
            j = j3 >> 32;
        }
        return (int) j;
    }

    public static int sub33At(int i3, int i10, int[] iArr, int i11) {
        long j = (iArr[i11] & 4294967295L) - (i10 & 4294967295L);
        iArr[i11] = (int) j;
        long j3 = ((4294967295L & iArr[r4]) - 1) + (j >> 32);
        iArr[i11 + 1] = (int) j3;
        if ((j3 >> 32) == 0) {
            return 0;
        }
        return decAt(i3, iArr, i11 + 2);
    }

    public static int sub33From(int i3, int i10, int[] iArr) {
        long j = (iArr[0] & 4294967295L) - (i10 & 4294967295L);
        iArr[0] = (int) j;
        long j3 = ((4294967295L & iArr[1]) - 1) + (j >> 32);
        iArr[1] = (int) j3;
        if ((j3 >> 32) == 0) {
            return 0;
        }
        return decAt(i3, iArr, 2);
    }

    public static int subBothFrom(int i3, int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j = 0;
        for (int i13 = 0; i13 < i3; i13++) {
            long j3 = (((iArr3[r3] & 4294967295L) - (iArr[i10 + i13] & 4294967295L)) - (4294967295L & iArr2[i11 + i13])) + j;
            iArr3[i12 + i13] = (int) j3;
            j = j3 >> 32;
        }
        return (int) j;
    }

    public static int subDWordAt(int i3, long j, int[] iArr, int i10) {
        long j3 = (iArr[i10] & 4294967295L) - (j & 4294967295L);
        iArr[i10] = (int) j3;
        long j10 = ((4294967295L & iArr[r5]) - (j >>> 32)) + (j3 >> 32);
        iArr[i10 + 1] = (int) j10;
        if ((j10 >> 32) == 0) {
            return 0;
        }
        return decAt(i3, iArr, i10 + 2);
    }

    public static int subDWordFrom(int i3, long j, int[] iArr) {
        long j3 = (iArr[0] & 4294967295L) - (j & 4294967295L);
        iArr[0] = (int) j3;
        long j10 = ((4294967295L & iArr[1]) - (j >>> 32)) + (j3 >> 32);
        iArr[1] = (int) j10;
        if ((j10 >> 32) == 0) {
            return 0;
        }
        return decAt(i3, iArr, 2);
    }

    public static int subFrom(int i3, int[] iArr, int i10, int[] iArr2, int i11) {
        long j = 0;
        for (int i12 = 0; i12 < i3; i12++) {
            long j3 = ((iArr2[r3] & 4294967295L) - (4294967295L & iArr[i10 + i12])) + j;
            iArr2[i11 + i12] = (int) j3;
            j = j3 >> 32;
        }
        return (int) j;
    }

    public static int subWordAt(int i3, int i10, int[] iArr, int i11) {
        long j = (iArr[i11] & 4294967295L) - (4294967295L & i10);
        iArr[i11] = (int) j;
        if ((j >> 32) == 0) {
            return 0;
        }
        return decAt(i3, iArr, i11 + 1);
    }

    public static int subWordFrom(int i3, int i10, int[] iArr) {
        long j = (iArr[0] & 4294967295L) - (4294967295L & i10);
        iArr[0] = (int) j;
        if ((j >> 32) == 0) {
            return 0;
        }
        return decAt(i3, iArr, 1);
    }

    public static BigInteger toBigInteger(int i3, int[] iArr) {
        byte[] bArr = new byte[i3 << 2];
        for (int i10 = 0; i10 < i3; i10++) {
            int i11 = iArr[i10];
            if (i11 != 0) {
                Pack.intToBigEndian(i11, bArr, ((i3 - 1) - i10) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int i3, int[] iArr) {
        for (int i10 = 0; i10 < i3; i10++) {
            iArr[i10] = 0;
        }
    }

    public static void zero64(int i3, long[] jArr) {
        for (int i10 = 0; i10 < i3; i10++) {
            jArr[i10] = 0;
        }
    }

    public static int add33At(int i3, int i10, int[] iArr, int i11, int i12) {
        int i13 = i11 + i12;
        long j = (iArr[i13] & 4294967295L) + (i10 & 4294967295L);
        iArr[i13] = (int) j;
        long j3 = (4294967295L & iArr[r0]) + 1 + (j >>> 32);
        iArr[i13 + 1] = (int) j3;
        if ((j3 >>> 32) == 0) {
            return 0;
        }
        return incAt(i3, iArr, i11, i12 + 2);
    }

    public static int add33To(int i3, int i10, int[] iArr, int i11) {
        long j = (iArr[i11] & 4294967295L) + (i10 & 4294967295L);
        iArr[i11] = (int) j;
        long j3 = (4294967295L & iArr[r4]) + 1 + (j >>> 32);
        iArr[i11 + 1] = (int) j3;
        if ((j3 >>> 32) == 0) {
            return 0;
        }
        return incAt(i3, iArr, i11, 2);
    }

    public static int addBothTo(int i3, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i10 = 0; i10 < i3; i10++) {
            long j3 = (iArr[i10] & 4294967295L) + (iArr2[i10] & 4294967295L) + (4294967295L & iArr3[i10]) + j;
            iArr3[i10] = (int) j3;
            j = j3 >>> 32;
        }
        return (int) j;
    }

    public static int addDWordAt(int i3, long j, int[] iArr, int i10, int i11) {
        int i12 = i10 + i11;
        long j3 = (iArr[i12] & 4294967295L) + (j & 4294967295L);
        iArr[i12] = (int) j3;
        long j10 = (4294967295L & iArr[r0]) + (j >>> 32) + (j3 >>> 32);
        iArr[i12 + 1] = (int) j10;
        if ((j10 >>> 32) == 0) {
            return 0;
        }
        return incAt(i3, iArr, i10, i11 + 2);
    }

    public static int addDWordTo(int i3, long j, int[] iArr, int i10) {
        long j3 = (iArr[i10] & 4294967295L) + (j & 4294967295L);
        iArr[i10] = (int) j3;
        long j10 = (4294967295L & iArr[r5]) + (j >>> 32) + (j3 >>> 32);
        iArr[i10 + 1] = (int) j10;
        if ((j10 >>> 32) == 0) {
            return 0;
        }
        return incAt(i3, iArr, i10, 2);
    }

    public static int addTo(int i3, int[] iArr, int i10, int[] iArr2, int i11, int i12) {
        long j = i12 & 4294967295L;
        for (int i13 = 0; i13 < i3; i13++) {
            long j3 = (iArr[i10 + i13] & 4294967295L) + (iArr2[r6] & 4294967295L) + j;
            iArr2[i11 + i13] = (int) j3;
            j = j3 >>> 32;
        }
        return (int) j;
    }

    public static int addWordAt(int i3, int i10, int[] iArr, int i11, int i12) {
        long j = i10 & 4294967295L;
        long j3 = j + (4294967295L & iArr[r7]);
        iArr[i11 + i12] = (int) j3;
        if ((j3 >>> 32) == 0) {
            return 0;
        }
        return incAt(i3, iArr, i11, i12 + 1);
    }

    public static int addWordTo(int i3, int i10, int[] iArr, int i11) {
        long j = (i10 & 4294967295L) + (4294967295L & iArr[i11]);
        iArr[i11] = (int) j;
        if ((j >>> 32) == 0) {
            return 0;
        }
        return incAt(i3, iArr, i11, 1);
    }

    public static int compare(int i3, int[] iArr, int[] iArr2) {
        for (int i10 = i3 - 1; i10 >= 0; i10--) {
            int i11 = iArr[i10] ^ Integer.MIN_VALUE;
            int i12 = Integer.MIN_VALUE ^ iArr2[i10];
            if (i11 < i12) {
                return -1;
            }
            if (i11 > i12) {
                return 1;
            }
        }
        return 0;
    }

    public static void copy(int i3, int[] iArr, int[] iArr2) {
        System.arraycopy(iArr, 0, iArr2, 0, i3);
    }

    public static void copy64(int i3, long[] jArr, long[] jArr2) {
        System.arraycopy(jArr, 0, jArr2, 0, i3);
    }

    public static int csub(int i3, int i10, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (-(i10 & 1)) & 4294967295L;
        long j3 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            long j10 = ((iArr[i11] & 4294967295L) - (iArr2[i11] & j)) + j3;
            iArr3[i11] = (int) j10;
            j3 = j10 >> 32;
        }
        return (int) j3;
    }

    public static int dec(int i3, int[] iArr, int[] iArr2) {
        int i10 = 0;
        while (i10 < i3) {
            int i11 = iArr[i10] - 1;
            iArr2[i10] = i11;
            i10++;
            if (i11 != -1) {
                while (i10 < i3) {
                    iArr2[i10] = iArr[i10];
                    i10++;
                }
                return 0;
            }
        }
        return -1;
    }

    public static int decAt(int i3, int[] iArr, int i10, int i11) {
        while (i11 < i3) {
            int i12 = i10 + i11;
            int i13 = iArr[i12] - 1;
            iArr[i12] = i13;
            if (i13 != -1) {
                return 0;
            }
            i11++;
        }
        return -1;
    }

    public static int equalTo(int i3, int[] iArr, int i10, int i11) {
        int i12 = i11 ^ iArr[i10];
        for (int i13 = 1; i13 < i3; i13++) {
            i12 |= iArr[i10 + i13];
        }
        return (((i12 >>> 1) | (i12 & 1)) - 1) >> 31;
    }

    public static int equalToZero(int i3, int[] iArr, int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i3; i12++) {
            i11 |= iArr[i10 + i12];
        }
        return (((i11 >>> 1) | (i11 & 1)) - 1) >> 31;
    }

    public static boolean gte(int i3, int[] iArr, int[] iArr2) {
        for (int i10 = i3 - 1; i10 >= 0; i10--) {
            int i11 = iArr[i10] ^ Integer.MIN_VALUE;
            int i12 = Integer.MIN_VALUE ^ iArr2[i10];
            if (i11 < i12) {
                return false;
            }
            if (i11 > i12) {
                return true;
            }
        }
        return true;
    }

    public static int inc(int i3, int[] iArr, int[] iArr2) {
        int i10 = 0;
        while (i10 < i3) {
            int i11 = iArr[i10] + 1;
            iArr2[i10] = i11;
            i10++;
            if (i11 != 0) {
                while (i10 < i3) {
                    iArr2[i10] = iArr[i10];
                    i10++;
                }
                return 0;
            }
        }
        return 1;
    }

    public static int incAt(int i3, int[] iArr, int i10, int i11) {
        while (i11 < i3) {
            int i12 = i10 + i11;
            int i13 = iArr[i12] + 1;
            iArr[i12] = i13;
            if (i13 != 0) {
                return 0;
            }
            i11++;
        }
        return 1;
    }

    public static int lessThan(int i3, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i10 = 0; i10 < i3; i10++) {
            j = (((iArr[i10] & 4294967295L) - (4294967295L & iArr2[i10])) + j) >> 32;
        }
        return (int) j;
    }

    public static void mul(int i3, int[] iArr, int[] iArr2, int[] iArr3) {
        iArr3[i3] = mulWord(i3, iArr[0], iArr2, iArr3);
        int i10 = 1;
        while (i10 < i3) {
            int i11 = i3;
            iArr3[i10 + i3] = mulWordAddTo(i11, iArr[i10], iArr2, 0, iArr3, i10);
            i10++;
            i3 = i11;
        }
    }

    public static int mulAddTo(int i3, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        int i10 = 0;
        while (i10 < i3) {
            int i11 = i3;
            int[] iArr4 = iArr3;
            long mulWordAddTo = j + (mulWordAddTo(i11, iArr[i10], r4, 0, iArr4, i10) & 4294967295L) + (iArr4[r10] & 4294967295L);
            iArr4[i10 + i11] = (int) mulWordAddTo;
            j = mulWordAddTo >>> 32;
            i10++;
            i3 = i11;
            iArr2 = iArr2;
            iArr3 = iArr4;
        }
        return (int) j;
    }

    public static int mulWord(int i3, int i10, int[] iArr, int[] iArr2) {
        long j = i10 & 4294967295L;
        long j3 = 0;
        int i11 = 0;
        do {
            long j10 = ((iArr[i11] & 4294967295L) * j) + j3;
            iArr2[i11] = (int) j10;
            j3 = j10 >>> 32;
            i11++;
        } while (i11 < i3);
        return (int) j3;
    }

    public static int shiftDownBit(int i3, int[] iArr, int i10, int i11) {
        while (true) {
            i3--;
            if (i3 < 0) {
                return i11 << 31;
            }
            int i12 = i10 + i3;
            int i13 = iArr[i12];
            iArr[i12] = (i11 << 31) | (i13 >>> 1);
            i11 = i13;
        }
    }

    public static int shiftDownBits(int i3, int[] iArr, int i10, int i11, int i12) {
        while (true) {
            i3--;
            if (i3 < 0) {
                return i12 << (-i11);
            }
            int i13 = i10 + i3;
            int i14 = iArr[i13];
            iArr[i13] = (i12 << (-i11)) | (i14 >>> i11);
            i12 = i14;
        }
    }

    public static int shiftUpBit(int i3, int[] iArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i3) {
            int i13 = i10 + i12;
            int i14 = iArr[i13];
            iArr[i13] = (i11 >>> 31) | (i14 << 1);
            i12++;
            i11 = i14;
        }
        return i11 >>> 31;
    }

    public static int shiftUpBits(int i3, int[] iArr, int i10, int i11, int i12) {
        int i13 = 0;
        while (i13 < i3) {
            int i14 = i10 + i13;
            int i15 = iArr[i14];
            iArr[i14] = (i12 >>> (-i11)) | (i15 << i11);
            i13++;
            i12 = i15;
        }
        return i12 >>> (-i11);
    }

    public static long shiftUpBits64(int i3, long[] jArr, int i10, int i11, long j, long[] jArr2, int i12) {
        int i13 = 0;
        while (i13 < i3) {
            long j3 = jArr[i10 + i13];
            jArr2[i12 + i13] = (j >>> (-i11)) | (j3 << i11);
            i13++;
            j = j3;
        }
        return j >>> (-i11);
    }

    public static void square(int i3, int[] iArr, int[] iArr2) {
        int i10;
        int i11 = i3 << 1;
        int i12 = i3;
        int i13 = i11;
        int i14 = 0;
        while (true) {
            i12--;
            long j = iArr[i12] & 4294967295L;
            long j3 = j * j;
            iArr2[i13 - 1] = (i14 << 31) | ((int) (j3 >>> 33));
            i13 -= 2;
            iArr2[i13] = (int) (j3 >>> 1);
            int i15 = (int) j3;
            if (i12 <= 0) {
                break;
            } else {
                i14 = i15;
            }
        }
        long j10 = 0;
        int i16 = 2;
        for (i10 = 1; i10 < i3; i10++) {
            long squareWordAddTo = j10 + (squareWordAddTo(iArr, i10, iArr2) & 4294967295L) + (iArr2[i16] & 4294967295L);
            int i17 = i16 + 1;
            iArr2[i16] = (int) squareWordAddTo;
            long j11 = (squareWordAddTo >>> 32) + (iArr2[i17] & 4294967295L);
            i16 += 2;
            iArr2[i17] = (int) j11;
            j10 = j11 >>> 32;
        }
        shiftUpBit(i11, iArr2, iArr[0] << 31);
    }

    public static int squareWordAddTo(int[] iArr, int i3, int[] iArr2) {
        long j = iArr[i3] & 4294967295L;
        long j3 = 0;
        int i10 = 0;
        do {
            long j10 = ((iArr[i10] & 4294967295L) * j) + (iArr2[r9] & 4294967295L) + j3;
            iArr2[i3 + i10] = (int) j10;
            j3 = j10 >>> 32;
            i10++;
        } while (i10 < i3);
        return (int) j3;
    }

    public static int sub(int i3, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i10 = 0; i10 < i3; i10++) {
            long j3 = ((iArr[i10] & 4294967295L) - (4294967295L & iArr2[i10])) + j;
            iArr3[i10] = (int) j3;
            j = j3 >> 32;
        }
        return (int) j;
    }

    public static int sub33At(int i3, int i10, int[] iArr, int i11, int i12) {
        int i13 = i11 + i12;
        long j = (iArr[i13] & 4294967295L) - (i10 & 4294967295L);
        iArr[i13] = (int) j;
        long j3 = ((4294967295L & iArr[r0]) - 1) + (j >> 32);
        iArr[i13 + 1] = (int) j3;
        if ((j3 >> 32) == 0) {
            return 0;
        }
        return decAt(i3, iArr, i11, i12 + 2);
    }

    public static int sub33From(int i3, int i10, int[] iArr, int i11) {
        long j = (iArr[i11] & 4294967295L) - (i10 & 4294967295L);
        iArr[i11] = (int) j;
        long j3 = ((4294967295L & iArr[r4]) - 1) + (j >> 32);
        iArr[i11 + 1] = (int) j3;
        if ((j3 >> 32) == 0) {
            return 0;
        }
        return decAt(i3, iArr, i11, 2);
    }

    public static int subBothFrom(int i3, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i10 = 0; i10 < i3; i10++) {
            long j3 = (((iArr3[i10] & 4294967295L) - (iArr[i10] & 4294967295L)) - (4294967295L & iArr2[i10])) + j;
            iArr3[i10] = (int) j3;
            j = j3 >> 32;
        }
        return (int) j;
    }

    public static int subDWordAt(int i3, long j, int[] iArr, int i10, int i11) {
        int i12 = i10 + i11;
        long j3 = (iArr[i12] & 4294967295L) - (j & 4294967295L);
        iArr[i12] = (int) j3;
        long j10 = ((4294967295L & iArr[r0]) - (j >>> 32)) + (j3 >> 32);
        iArr[i12 + 1] = (int) j10;
        if ((j10 >> 32) == 0) {
            return 0;
        }
        return decAt(i3, iArr, i10, i11 + 2);
    }

    public static int subDWordFrom(int i3, long j, int[] iArr, int i10) {
        long j3 = (iArr[i10] & 4294967295L) - (j & 4294967295L);
        iArr[i10] = (int) j3;
        long j10 = ((4294967295L & iArr[r5]) - (j >>> 32)) + (j3 >> 32);
        iArr[i10 + 1] = (int) j10;
        if ((j10 >> 32) == 0) {
            return 0;
        }
        return decAt(i3, iArr, i10, 2);
    }

    public static int subFrom(int i3, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i10 = 0; i10 < i3; i10++) {
            long j3 = ((iArr2[i10] & 4294967295L) - (4294967295L & iArr[i10])) + j;
            iArr2[i10] = (int) j3;
            j = j3 >> 32;
        }
        return (int) j;
    }

    public static int subWordAt(int i3, int i10, int[] iArr, int i11, int i12) {
        long j = (iArr[r0] & 4294967295L) - (4294967295L & i10);
        iArr[i11 + i12] = (int) j;
        if ((j >> 32) == 0) {
            return 0;
        }
        return decAt(i3, iArr, i11, i12 + 1);
    }

    public static int subWordFrom(int i3, int i10, int[] iArr, int i11) {
        long j = (iArr[i11] & 4294967295L) - (4294967295L & i10);
        iArr[i11] = (int) j;
        if ((j >> 32) == 0) {
            return 0;
        }
        return decAt(i3, iArr, i11, 1);
    }

    public static void zero(int i3, int[] iArr, int i10) {
        for (int i11 = 0; i11 < i3; i11++) {
            iArr[i10 + i11] = 0;
        }
    }

    public static int addTo(int i3, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i10 = 0; i10 < i3; i10++) {
            long j3 = (iArr[i10] & 4294967295L) + (4294967295L & iArr2[i10]) + j;
            iArr2[i10] = (int) j3;
            j = j3 >>> 32;
        }
        return (int) j;
    }

    public static int[] copy(int i3, int[] iArr) {
        int[] iArr2 = new int[i3];
        System.arraycopy(iArr, 0, iArr2, 0, i3);
        return iArr2;
    }

    public static long[] copy64(int i3, long[] jArr) {
        long[] jArr2 = new long[i3];
        System.arraycopy(jArr, 0, jArr2, 0, i3);
        return jArr2;
    }

    public static int equalTo(int i3, int[] iArr, int i10, int[] iArr2, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 < i3; i13++) {
            i12 |= iArr[i10 + i13] ^ iArr2[i11 + i13];
        }
        return (((i12 >>> 1) | (i12 & 1)) - 1) >> 31;
    }

    public static void mul(int[] iArr, int i3, int i10, int[] iArr2, int i11, int i12, int[] iArr3, int i13) {
        iArr3[i13 + i12] = mulWord(i12, iArr[i3], iArr2, i11, iArr3, i13);
        for (int i14 = 1; i14 < i10; i14++) {
            int i15 = i13 + i14;
            iArr3[i15 + i12] = mulWordAddTo(i12, iArr[i3 + i14], iArr2, i11, iArr3, i15);
        }
    }

    public static int shiftDownBit(int i3, int[] iArr, int i10, int i11, int[] iArr2, int i12) {
        while (true) {
            i3--;
            if (i3 < 0) {
                return i11 << 31;
            }
            int i13 = iArr[i10 + i3];
            iArr2[i12 + i3] = (i11 << 31) | (i13 >>> 1);
            i11 = i13;
        }
    }

    public static int shiftDownBits(int i3, int[] iArr, int i10, int i11, int i12, int[] iArr2, int i13) {
        while (true) {
            i3--;
            if (i3 < 0) {
                return i12 << (-i11);
            }
            int i14 = iArr[i10 + i3];
            iArr2[i13 + i3] = (i12 << (-i11)) | (i14 >>> i11);
            i12 = i14;
        }
    }

    public static int shiftUpBit(int i3, int[] iArr, int i10, int i11, int[] iArr2, int i12) {
        int i13 = 0;
        while (i13 < i3) {
            int i14 = iArr[i10 + i13];
            iArr2[i12 + i13] = (i11 >>> 31) | (i14 << 1);
            i13++;
            i11 = i14;
        }
        return i11 >>> 31;
    }

    public static int shiftUpBits(int i3, int[] iArr, int i10, int i11, int i12, int[] iArr2, int i13) {
        int i14 = 0;
        while (i14 < i3) {
            int i15 = iArr[i10 + i14];
            iArr2[i13 + i14] = (i12 >>> (-i11)) | (i15 << i11);
            i14++;
            i12 = i15;
        }
        return i12 >>> (-i11);
    }

    public static int equalTo(int i3, int[] iArr, int[] iArr2) {
        int i10 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            i10 |= iArr[i11] ^ iArr2[i11];
        }
        return (((i10 >>> 1) | (i10 & 1)) - 1) >> 31;
    }

    public static int shiftDownBit(int i3, int[] iArr, int i10, int[] iArr2) {
        while (true) {
            i3--;
            if (i3 < 0) {
                return i10 << 31;
            }
            int i11 = iArr[i3];
            iArr2[i3] = (i10 << 31) | (i11 >>> 1);
            i10 = i11;
        }
    }

    public static int shiftDownBits(int i3, int[] iArr, int i10, int i11, int[] iArr2) {
        while (true) {
            i3--;
            if (i3 < 0) {
                return i11 << (-i10);
            }
            int i12 = iArr[i3];
            iArr2[i3] = (i11 << (-i10)) | (i12 >>> i10);
            i11 = i12;
        }
    }

    public static int shiftUpBit(int i3, int[] iArr, int i10, int[] iArr2) {
        int i11 = 0;
        while (i11 < i3) {
            int i12 = iArr[i11];
            iArr2[i11] = (i10 >>> 31) | (i12 << 1);
            i11++;
            i10 = i12;
        }
        return i10 >>> 31;
    }

    public static int shiftUpBits(int i3, int[] iArr, int i10, int i11, int[] iArr2) {
        int i12 = 0;
        while (i12 < i3) {
            int i13 = iArr[i12];
            iArr2[i12] = (i11 >>> (-i10)) | (i13 << i10);
            i12++;
            i11 = i13;
        }
        return i11 >>> (-i10);
    }
}
