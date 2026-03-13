package org.bouncycastle.math.ec.rfc7748;

import i2.u;
import kotlin.UByte;
import kotlin.jvm.internal.IntCompanionObject;
import org.bouncycastle.math.raw.Mod;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class X25519Field {
    private static final int M24 = 16777215;
    private static final int M25 = 33554431;
    private static final int M26 = 67108863;
    private static final int[] P32 = {-19, -1, -1, -1, -1, -1, -1, IntCompanionObject.MAX_VALUE};
    private static final int[] ROOT_NEG_ONE = {34513072, 59165138, 4688974, 3500415, 6194736, 33281959, 54535759, 32551604, 163342, 5703241};
    public static final int SIZE = 10;

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i3 = 0; i3 < 10; i3++) {
            iArr3[i3] = iArr[i3] + iArr2[i3];
        }
    }

    public static void addOne(int[] iArr) {
        iArr[0] = iArr[0] + 1;
    }

    public static void apm(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        for (int i3 = 0; i3 < 10; i3++) {
            int i10 = iArr[i3];
            int i11 = iArr2[i3];
            iArr3[i3] = i10 + i11;
            iArr4[i3] = i10 - i11;
        }
    }

    public static int areEqual(int[] iArr, int[] iArr2) {
        int i3 = 0;
        for (int i10 = 0; i10 < 10; i10++) {
            i3 |= iArr[i10] ^ iArr2[i10];
        }
        return (((i3 >>> 1) | (i3 & 1)) - 1) >> 31;
    }

    public static boolean areEqualVar(int[] iArr, int[] iArr2) {
        return areEqual(iArr, iArr2) != 0;
    }

    public static void carry(int[] iArr) {
        int i3 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int i17 = iArr[8];
        int i18 = iArr[9];
        int i19 = i11 + (i10 >> 26);
        int i20 = i10 & M26;
        int i21 = i13 + (i12 >> 26);
        int i22 = i12 & M26;
        int i23 = i16 + (i15 >> 26);
        int i24 = i15 & M26;
        int i25 = i18 + (i17 >> 26);
        int i26 = i17 & M26;
        int i27 = i22 + (i19 >> 25);
        int i28 = i19 & M25;
        int i29 = i14 + (i21 >> 25);
        int i30 = i21 & M25;
        int i31 = i26 + (i23 >> 25);
        int i32 = i23 & M25;
        int i33 = ((i25 >> 25) * 38) + i3;
        int i34 = i25 & M25;
        int i35 = i20 + (i33 >> 26);
        int i36 = i33 & M26;
        int i37 = i24 + (i29 >> 26);
        int i38 = i29 & M26;
        int i39 = i28 + (i35 >> 26);
        int i40 = i35 & M26;
        int i41 = i30 + (i27 >> 26);
        int i42 = i27 & M26;
        int i43 = i32 + (i37 >> 26);
        int i44 = i37 & M26;
        int i45 = i34 + (i31 >> 26);
        int i46 = i31 & M26;
        iArr[0] = i36;
        iArr[1] = i40;
        iArr[2] = i39;
        iArr[3] = i42;
        iArr[4] = i41;
        iArr[5] = i38;
        iArr[6] = i44;
        iArr[7] = i43;
        iArr[8] = i46;
        iArr[9] = i45;
    }

    public static void cmov(int i3, int[] iArr, int i10, int[] iArr2, int i11) {
        for (int i12 = 0; i12 < 10; i12++) {
            int i13 = i11 + i12;
            int i14 = iArr2[i13];
            iArr2[i13] = i14 ^ ((iArr[i10 + i12] ^ i14) & i3);
        }
    }

    public static void cnegate(int i3, int[] iArr) {
        int i10 = 0 - i3;
        for (int i11 = 0; i11 < 10; i11++) {
            iArr[i11] = (iArr[i11] ^ i10) - i10;
        }
    }

    public static void copy(int[] iArr, int i3, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < 10; i11++) {
            iArr2[i10 + i11] = iArr[i3 + i11];
        }
    }

    public static int[] create() {
        return new int[10];
    }

    public static int[] createTable(int i3) {
        return new int[i3 * 10];
    }

    public static void cswap(int i3, int[] iArr, int[] iArr2) {
        int i10 = 0 - i3;
        for (int i11 = 0; i11 < 10; i11++) {
            int i12 = iArr[i11];
            int i13 = iArr2[i11];
            int i14 = (i12 ^ i13) & i10;
            iArr[i11] = i12 ^ i14;
            iArr2[i11] = i13 ^ i14;
        }
    }

    public static void decode(byte[] bArr, int i3, int[] iArr) {
        decode128(bArr, i3, iArr, 0);
        decode128(bArr, i3 + 16, iArr, 5);
        iArr[9] = iArr[9] & M24;
    }

    private static void decode128(byte[] bArr, int i3, int[] iArr, int i10) {
        int decode32 = decode32(bArr, i3);
        int decode322 = decode32(bArr, i3 + 4);
        int decode323 = decode32(bArr, i3 + 8);
        int decode324 = decode32(bArr, i3 + 12);
        iArr[i10] = decode32 & M26;
        iArr[i10 + 1] = ((decode32 >>> 26) | (decode322 << 6)) & M26;
        iArr[i10 + 2] = ((decode322 >>> 20) | (decode323 << 12)) & M25;
        iArr[i10 + 3] = M26 & ((decode324 << 19) | (decode323 >>> 13));
        iArr[i10 + 4] = decode324 >>> 7;
    }

    private static int decode32(byte[] bArr, int i3) {
        return (bArr[i3 + 3] << 24) | (bArr[i3] & UByte.MAX_VALUE) | ((bArr[i3 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i3 + 2] & UByte.MAX_VALUE) << 16);
    }

    public static void encode(int[] iArr, byte[] bArr, int i3) {
        encode128(iArr, 0, bArr, i3);
        encode128(iArr, 5, bArr, i3 + 16);
    }

    private static void encode128(int[] iArr, int i3, byte[] bArr, int i10) {
        int i11 = iArr[i3];
        int i12 = iArr[i3 + 1];
        int i13 = iArr[i3 + 2];
        int i14 = iArr[i3 + 3];
        int i15 = iArr[i3 + 4];
        encode32((i12 << 26) | i11, bArr, i10);
        encode32((i12 >>> 6) | (i13 << 20), bArr, i10 + 4);
        encode32((i13 >>> 12) | (i14 << 13), bArr, i10 + 8);
        encode32((i15 << 7) | (i14 >>> 19), bArr, i10 + 12);
    }

    private static void encode32(int i3, byte[] bArr, int i10) {
        bArr[i10] = (byte) i3;
        bArr[i10 + 1] = (byte) (i3 >>> 8);
        bArr[i10 + 2] = (byte) (i3 >>> 16);
        bArr[i10 + 3] = (byte) (i3 >>> 24);
    }

    public static void inv(int[] iArr, int[] iArr2) {
        int[] create = create();
        int[] iArr3 = new int[8];
        copy(iArr, 0, create, 0);
        normalize(create);
        encode(create, iArr3, 0);
        Mod.modOddInverse(P32, iArr3, iArr3);
        decode(iArr3, 0, iArr2);
    }

    public static void invVar(int[] iArr, int[] iArr2) {
        int[] create = create();
        int[] iArr3 = new int[8];
        copy(iArr, 0, create, 0);
        normalize(create);
        encode(create, iArr3, 0);
        Mod.modOddInverseVar(P32, iArr3, iArr3);
        decode(iArr3, 0, iArr2);
    }

    public static int isOne(int[] iArr) {
        int i3 = iArr[0] ^ 1;
        for (int i10 = 1; i10 < 10; i10++) {
            i3 |= iArr[i10];
        }
        return (((i3 >>> 1) | (i3 & 1)) - 1) >> 31;
    }

    public static boolean isOneVar(int[] iArr) {
        return isOne(iArr) != 0;
    }

    public static int isZero(int[] iArr) {
        int i3 = 0;
        for (int i10 = 0; i10 < 10; i10++) {
            i3 |= iArr[i10];
        }
        return (((i3 >>> 1) | (i3 & 1)) - 1) >> 31;
    }

    public static boolean isZeroVar(int[] iArr) {
        return isZero(iArr) != 0;
    }

    public static void mul(int[] iArr, int i3, int[] iArr2) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = iArr[8];
        int i19 = iArr[9];
        long j = i3;
        long j3 = i12 * j;
        int i20 = ((int) j3) & M25;
        long j10 = j3 >> 25;
        long j11 = i14 * j;
        int i21 = ((int) j11) & M25;
        long j12 = i17 * j;
        int i22 = ((int) j12) & M25;
        long j13 = i19 * j;
        int i23 = ((int) j13) & M25;
        long j14 = (i10 * j) + ((j13 >> 25) * 38);
        iArr2[0] = ((int) j14) & M26;
        long j15 = (i15 * j) + (j11 >> 25);
        iArr2[5] = ((int) j15) & M26;
        long j16 = (i11 * j) + (j14 >> 26);
        iArr2[1] = ((int) j16) & M26;
        long j17 = (i13 * j) + j10;
        iArr2[3] = ((int) j17) & M26;
        long j18 = (i16 * j) + (j15 >> 26);
        iArr2[6] = ((int) j18) & M26;
        long j19 = (i18 * j) + (j12 >> 25);
        iArr2[8] = ((int) j19) & M26;
        iArr2[2] = i20 + ((int) (j16 >> 26));
        iArr2[4] = i21 + ((int) (j17 >> 26));
        iArr2[7] = i22 + ((int) (j18 >> 26));
        iArr2[9] = i23 + ((int) (j19 >> 26));
    }

    public static void negate(int[] iArr, int[] iArr2) {
        for (int i3 = 0; i3 < 10; i3++) {
            iArr2[i3] = -iArr[i3];
        }
    }

    public static void normalize(int[] iArr) {
        int i3 = (iArr[9] >>> 23) & 1;
        reduce(iArr, i3);
        reduce(iArr, -i3);
    }

    public static void one(int[] iArr) {
        iArr[0] = 1;
        for (int i3 = 1; i3 < 10; i3++) {
            iArr[i3] = 0;
        }
    }

    private static void powPm5d8(int[] iArr, int[] iArr2, int[] iArr3) {
        sqr(iArr, iArr2);
        mul(iArr, iArr2, iArr2);
        int[] create = create();
        sqr(iArr2, create);
        mul(iArr, create, create);
        sqr(create, 2, create);
        mul(iArr2, create, create);
        int[] create2 = create();
        sqr(create, 5, create2);
        mul(create, create2, create2);
        int[] create3 = create();
        sqr(create2, 5, create3);
        mul(create, create3, create3);
        sqr(create3, 10, create);
        mul(create2, create, create);
        sqr(create, 25, create2);
        mul(create, create2, create2);
        sqr(create2, 25, create3);
        mul(create, create3, create3);
        sqr(create3, 50, create);
        mul(create2, create, create);
        sqr(create, 125, create2);
        mul(create, create2, create2);
        sqr(create2, 2, create);
        mul(create, iArr, iArr3);
    }

    private static void reduce(int[] iArr, int i3) {
        int i10 = M24 & iArr[9];
        long j = (((r1 >> 24) + i3) * 19) + iArr[0];
        iArr[0] = ((int) j) & M26;
        long j3 = (j >> 26) + iArr[1];
        iArr[1] = ((int) j3) & M26;
        long j10 = (j3 >> 26) + iArr[2];
        iArr[2] = ((int) j10) & M25;
        long j11 = (j10 >> 25) + iArr[3];
        iArr[3] = ((int) j11) & M26;
        long j12 = (j11 >> 26) + iArr[4];
        iArr[4] = ((int) j12) & M25;
        long j13 = (j12 >> 25) + iArr[5];
        iArr[5] = ((int) j13) & M26;
        long j14 = (j13 >> 26) + iArr[6];
        iArr[6] = ((int) j14) & M26;
        long j15 = (j14 >> 26) + iArr[7];
        iArr[7] = M25 & ((int) j15);
        long j16 = (j15 >> 25) + iArr[8];
        iArr[8] = M26 & ((int) j16);
        iArr[9] = i10 + ((int) (j16 >> 26));
    }

    public static void sqr(int[] iArr, int i3, int[] iArr2) {
        sqr(iArr, iArr2);
        while (true) {
            i3--;
            if (i3 <= 0) {
                return;
            } else {
                sqr(iArr2, iArr2);
            }
        }
    }

    public static boolean sqrtRatioVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] create = create();
        int[] create2 = create();
        mul(iArr, iArr2, create);
        sqr(iArr2, create2);
        mul(create, create2, create);
        sqr(create2, create2);
        mul(create2, create, create2);
        int[] create3 = create();
        int[] create4 = create();
        powPm5d8(create2, create3, create4);
        mul(create4, create, create4);
        int[] create5 = create();
        sqr(create4, create5);
        mul(create5, iArr2, create5);
        sub(create5, iArr, create3);
        normalize(create3);
        if (isZeroVar(create3)) {
            copy(create4, 0, iArr3, 0);
            return true;
        }
        add(create5, iArr, create3);
        normalize(create3);
        if (!isZeroVar(create3)) {
            return false;
        }
        mul(create4, ROOT_NEG_ONE, iArr3);
        return true;
    }

    public static void sub(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i3 = 0; i3 < 10; i3++) {
            iArr3[i3] = iArr[i3] - iArr2[i3];
        }
    }

    public static void subOne(int[] iArr) {
        iArr[0] = iArr[0] - 1;
    }

    public static void zero(int[] iArr) {
        for (int i3 = 0; i3 < 10; i3++) {
            iArr[i3] = 0;
        }
    }

    public static void addOne(int[] iArr, int i3) {
        iArr[i3] = iArr[i3] + 1;
    }

    public static void decode(int[] iArr, int i3, int[] iArr2) {
        decode128(iArr, i3, iArr2, 0);
        decode128(iArr, i3 + 4, iArr2, 5);
        iArr2[9] = iArr2[9] & M24;
    }

    private static void decode128(int[] iArr, int i3, int[] iArr2, int i10) {
        int i11 = iArr[i3];
        int i12 = iArr[i3 + 1];
        int i13 = iArr[i3 + 2];
        int i14 = iArr[i3 + 3];
        iArr2[i10] = i11 & M26;
        iArr2[i10 + 1] = ((i11 >>> 26) | (i12 << 6)) & M26;
        iArr2[i10 + 2] = ((i12 >>> 20) | (i13 << 12)) & M25;
        iArr2[i10 + 3] = M26 & ((i14 << 19) | (i13 >>> 13));
        iArr2[i10 + 4] = i14 >>> 7;
    }

    public static void encode(int[] iArr, int[] iArr2, int i3) {
        encode128(iArr, 0, iArr2, i3);
        encode128(iArr, 5, iArr2, i3 + 4);
    }

    private static void encode128(int[] iArr, int i3, int[] iArr2, int i10) {
        int i11 = iArr[i3];
        int i12 = iArr[i3 + 1];
        int i13 = iArr[i3 + 2];
        int i14 = iArr[i3 + 3];
        int i15 = iArr[i3 + 4];
        iArr2[i10] = (i12 << 26) | i11;
        iArr2[i10 + 1] = (i12 >>> 6) | (i13 << 20);
        iArr2[i10 + 2] = (i13 >>> 12) | (i14 << 13);
        iArr2[i10 + 3] = (i15 << 7) | (i14 >>> 19);
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        int i3 = iArr[0];
        int i10 = iArr2[0];
        int i11 = iArr[1];
        int i12 = iArr2[1];
        int i13 = iArr[2];
        int i14 = iArr2[2];
        int i15 = iArr[3];
        int i16 = iArr2[3];
        int i17 = iArr[4];
        int i18 = iArr2[4];
        int i19 = iArr[5];
        int i20 = iArr2[5];
        int i21 = iArr[6];
        int i22 = iArr2[6];
        int i23 = iArr[7];
        int i24 = iArr2[7];
        int i25 = iArr[8];
        int i26 = iArr2[8];
        int i27 = iArr[9];
        int i28 = iArr2[9];
        long j = i3;
        long j3 = i10;
        long j10 = j * j3;
        long j11 = i12;
        long j12 = j * j11;
        long j13 = i11;
        long j14 = (j13 * j3) + j12;
        long j15 = i14;
        long j16 = (j13 * j11) + (j * j15);
        long j17 = i13;
        long j18 = (j17 * j3) + j16;
        long j19 = ((j17 * j11) + (j13 * j15)) << 1;
        long j20 = i16;
        long j21 = j * j20;
        long j22 = i15;
        long i29 = u.i(j22, j3, j21, j19);
        long j23 = (j17 * j15) << 1;
        long j24 = i18;
        long j25 = i17;
        long i30 = u.i(j25, j3, (j22 * j11) + (j13 * j20) + (j * j24), j23);
        long j26 = ((j25 * j11) + ((j22 * j15) + ((j17 * j20) + (j13 * j24)))) << 1;
        long j27 = (j22 * j20) + (((j25 * j15) + (j17 * j24)) << 1);
        long j28 = (j25 * j20) + (j22 * j24);
        long j29 = (j25 * j24) << 1;
        long j30 = i19;
        long j31 = i20;
        long j32 = j30 * j31;
        long j33 = i22;
        long j34 = j30 * j33;
        long j35 = i21;
        long j36 = (j35 * j31) + j34;
        long j37 = i24;
        long j38 = (j35 * j33) + (j30 * j37);
        long j39 = i23;
        long j40 = i26;
        long j41 = j30 * j40;
        long j42 = i25;
        long i31 = u.i(j42, j31, j41, ((j39 * j33) + (j35 * j37)) << 1);
        long j43 = i28;
        long j44 = (j42 * j33) + (j35 * j40) + (j30 * j43);
        long j45 = i27;
        long i32 = u.i(j45, j31, j44, (j39 * j37) << 1);
        long j46 = j10 - (((j33 * j45) + ((j42 * j37) + ((j39 * j40) + (j35 * j43)))) * 76);
        long j47 = j14 - (((j42 * j40) + (((j37 * j45) + (j39 * j43)) << 1)) * 38);
        long j48 = j18 - (((j45 * j40) + (j42 * j43)) * 38);
        long j49 = i29 - ((j43 * j45) * 76);
        long j50 = j26 - j32;
        long j51 = j27 - j36;
        long j52 = j28 - ((j39 * j31) + j38);
        long j53 = j29 - i31;
        long j54 = i3 + i19;
        long j55 = i10 + i20;
        long j56 = j54 * j55;
        long j57 = i12 + i22;
        long j58 = j54 * j57;
        long j59 = i11 + i21;
        long j60 = (j59 * j55) + j58;
        long j61 = i14 + i24;
        long j62 = i13 + i23;
        long j63 = (j62 * j55) + (j59 * j57) + (j54 * j61);
        long j64 = ((j62 * j57) + (j59 * j61)) << 1;
        long j65 = i16 + i26;
        long j66 = i15 + i25;
        long i33 = u.i(j66, j55, j54 * j65, j64);
        long j67 = i18 + i28;
        long j68 = i17 + i27;
        long i34 = u.i(j68, j55, (j66 * j57) + (j59 * j65) + (j54 * j67), (j62 * j61) << 1);
        long j69 = ((j57 * j68) + ((j66 * j61) + ((j62 * j65) + (j59 * j67)))) << 1;
        long j70 = (j66 * j65) + (((j61 * j68) + (j62 * j67)) << 1);
        long j71 = (j68 * j65) + (j66 * j67);
        long j72 = (j67 * j68) << 1;
        long j73 = (i33 - j49) + j53;
        int i35 = ((int) j73) & M26;
        long j74 = ((i34 - i30) - i32) + (j73 >> 26);
        int i36 = ((int) j74) & M25;
        long j75 = ((((j74 >> 25) + j69) - j50) * 38) + j46;
        iArr3[0] = ((int) j75) & M26;
        long j76 = ((j70 - j51) * 38) + j47 + (j75 >> 26);
        iArr3[1] = ((int) j76) & M26;
        long j77 = ((j71 - j52) * 38) + j48 + (j76 >> 26);
        iArr3[2] = ((int) j77) & M25;
        long j78 = ((j72 - j53) * 38) + j49 + (j77 >> 25);
        iArr3[3] = ((int) j78) & M26;
        long i37 = u.i(i32, 38L, i30, j78 >> 26);
        iArr3[4] = ((int) i37) & M25;
        long j79 = (j56 - j46) + j50 + (i37 >> 25);
        iArr3[5] = ((int) j79) & M26;
        long j80 = (j60 - j47) + j51 + (j79 >> 26);
        iArr3[6] = ((int) j80) & M26;
        long j81 = (j63 - j48) + j52 + (j80 >> 26);
        iArr3[7] = ((int) j81) & M25;
        long j82 = (j81 >> 25) + i35;
        iArr3[8] = ((int) j82) & M26;
        iArr3[9] = i36 + ((int) (j82 >> 26));
    }

    public static void sqr(int[] iArr, int[] iArr2) {
        int i3 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int i17 = iArr[8];
        int i18 = iArr[9];
        long j = i3;
        long j3 = j * j;
        long j10 = i10 * 2;
        long j11 = j * j10;
        long j12 = i11 * 2;
        long j13 = j * j12;
        long j14 = i10;
        long j15 = (j14 * j14) + j13;
        long j16 = i12 * 2;
        long j17 = (j * j16) + (j10 * j12);
        long j18 = i13 * 2;
        long j19 = (j14 * j16) + (j * j18) + (i11 * j12);
        long j20 = (j12 * j16) + (j10 * j18);
        long j21 = j12 * j18;
        long j22 = i12;
        long j23 = (j22 * j22) + j21;
        long j24 = j22 * j18;
        long j25 = i14;
        long j26 = j25 * j25;
        long j27 = i15 * 2;
        long j28 = j25 * j27;
        long j29 = i16 * 2;
        long j30 = j25 * j29;
        long j31 = i15;
        long j32 = (j31 * j31) + j30;
        long j33 = j27 * j29;
        long j34 = i17 * 2;
        long j35 = i18 * 2;
        long j36 = (j31 * j34) + (j25 * j35) + (i16 * j29);
        long j37 = (j29 * j34) + (j27 * j35);
        long j38 = j29 * j35;
        long j39 = i17;
        long j40 = j3 - (j37 * 38);
        long j41 = j11 - (((j39 * j39) + j38) * 38);
        long j42 = j15 - ((j39 * j35) * 38);
        long j43 = j17 - ((i18 * j35) * 38);
        long j44 = j20 - j26;
        long j45 = j23 - j28;
        long j46 = j24 - j32;
        long j47 = (i13 * j18) - ((j25 * j34) + j33);
        int i19 = i10 + i15;
        int i20 = i11 + i16;
        int i21 = i12 + i17;
        int i22 = i13 + i18;
        long j48 = i3 + i14;
        long j49 = i19 * 2;
        long j50 = j48 * j49;
        long j51 = i20 * 2;
        long j52 = i19;
        long j53 = (j52 * j52) + (j48 * j51);
        long j54 = i21 * 2;
        long j55 = i22 * 2;
        long j56 = i21;
        long j57 = i22 * j55;
        long j58 = (((j48 * j54) + (j49 * j51)) - j43) + j47;
        int i23 = ((int) j58) & M26;
        long j59 = ((((j52 * j54) + ((j48 * j55) + (i20 * j51))) - j19) - j36) + (j58 >> 26);
        int i24 = ((int) j59) & M25;
        long j60 = ((((j59 >> 25) + ((j54 * j51) + (j49 * j55))) - j44) * 38) + j40;
        iArr2[0] = ((int) j60) & M26;
        long j61 = ((((j56 * j56) + (j51 * j55)) - j45) * 38) + j41 + (j60 >> 26);
        iArr2[1] = ((int) j61) & M26;
        long j62 = (((j56 * j55) - j46) * 38) + j42 + (j61 >> 26);
        iArr2[2] = ((int) j62) & M25;
        long j63 = ((j57 - j47) * 38) + j43 + (j62 >> 25);
        iArr2[3] = ((int) j63) & M26;
        long i25 = u.i(j36, 38L, j19, j63 >> 26);
        iArr2[4] = ((int) i25) & M25;
        long j64 = ((j48 * j48) - j40) + j44 + (i25 >> 25);
        iArr2[5] = ((int) j64) & M26;
        long j65 = (j50 - j41) + j45 + (j64 >> 26);
        iArr2[6] = ((int) j65) & M26;
        long j66 = (j53 - j42) + j46 + (j65 >> 26);
        iArr2[7] = ((int) j66) & M25;
        long j67 = (j66 >> 25) + i23;
        iArr2[8] = ((int) j67) & M26;
        iArr2[9] = i24 + ((int) (j67 >> 26));
    }
}
