package org.bouncycastle.math.ec.rfc7748;

import kotlin.UByte;
import org.bouncycastle.math.raw.Mod;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class X448Field {
    private static final int M28 = 268435455;
    private static final int[] P32 = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};
    public static final int SIZE = 16;
    private static final long U32 = 4294967295L;

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i3 = 0; i3 < 16; i3++) {
            iArr3[i3] = iArr[i3] + iArr2[i3];
        }
    }

    public static void addOne(int[] iArr) {
        iArr[0] = iArr[0] + 1;
    }

    public static int areEqual(int[] iArr, int[] iArr2) {
        int i3 = 0;
        for (int i10 = 0; i10 < 16; i10++) {
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
        int i19 = iArr[10];
        int i20 = iArr[11];
        int i21 = iArr[12];
        int i22 = iArr[13];
        int i23 = iArr[14];
        int i24 = iArr[15];
        int i25 = i10 + (i3 >>> 28);
        int i26 = i3 & M28;
        int i27 = i14 + (i13 >>> 28);
        int i28 = i13 & M28;
        int i29 = i18 + (i17 >>> 28);
        int i30 = i17 & M28;
        int i31 = i22 + (i21 >>> 28);
        int i32 = i21 & M28;
        int i33 = i11 + (i25 >>> 28);
        int i34 = i25 & M28;
        int i35 = i15 + (i27 >>> 28);
        int i36 = i27 & M28;
        int i37 = i19 + (i29 >>> 28);
        int i38 = i29 & M28;
        int i39 = i23 + (i31 >>> 28);
        int i40 = i31 & M28;
        int i41 = i12 + (i33 >>> 28);
        int i42 = i33 & M28;
        int i43 = i16 + (i35 >>> 28);
        int i44 = i35 & M28;
        int i45 = i20 + (i37 >>> 28);
        int i46 = i37 & M28;
        int i47 = i24 + (i39 >>> 28);
        int i48 = i39 & M28;
        int i49 = i47 >>> 28;
        int i50 = i47 & M28;
        int i51 = i26 + i49;
        int i52 = i28 + (i41 >>> 28);
        int i53 = i41 & M28;
        int i54 = i30 + i49 + (i43 >>> 28);
        int i55 = i43 & M28;
        int i56 = i32 + (i45 >>> 28);
        int i57 = i45 & M28;
        int i58 = i34 + (i51 >>> 28);
        int i59 = i51 & M28;
        int i60 = i36 + (i52 >>> 28);
        int i61 = i52 & M28;
        int i62 = i38 + (i54 >>> 28);
        int i63 = i54 & M28;
        int i64 = i40 + (i56 >>> 28);
        int i65 = i56 & M28;
        iArr[0] = i59;
        iArr[1] = i58;
        iArr[2] = i42;
        iArr[3] = i53;
        iArr[4] = i61;
        iArr[5] = i60;
        iArr[6] = i44;
        iArr[7] = i55;
        iArr[8] = i63;
        iArr[9] = i62;
        iArr[10] = i46;
        iArr[11] = i57;
        iArr[12] = i65;
        iArr[13] = i64;
        iArr[14] = i48;
        iArr[15] = i50;
    }

    public static void cmov(int i3, int[] iArr, int i10, int[] iArr2, int i11) {
        for (int i12 = 0; i12 < 16; i12++) {
            int i13 = i11 + i12;
            int i14 = iArr2[i13];
            iArr2[i13] = i14 ^ ((iArr[i10 + i12] ^ i14) & i3);
        }
    }

    public static void cnegate(int i3, int[] iArr) {
        int[] create = create();
        sub(create, iArr, create);
        cmov(-i3, create, 0, iArr, 0);
    }

    public static void copy(int[] iArr, int i3, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < 16; i11++) {
            iArr2[i10 + i11] = iArr[i3 + i11];
        }
    }

    public static int[] create() {
        return new int[16];
    }

    public static int[] createTable(int i3) {
        return new int[i3 * 16];
    }

    public static void cswap(int i3, int[] iArr, int[] iArr2) {
        int i10 = 0 - i3;
        for (int i11 = 0; i11 < 16; i11++) {
            int i12 = iArr[i11];
            int i13 = iArr2[i11];
            int i14 = (i12 ^ i13) & i10;
            iArr[i11] = i12 ^ i14;
            iArr2[i11] = i13 ^ i14;
        }
    }

    public static void decode(byte[] bArr, int i3, int[] iArr) {
        decode56(bArr, i3, iArr, 0);
        decode56(bArr, i3 + 7, iArr, 2);
        decode56(bArr, i3 + 14, iArr, 4);
        decode56(bArr, i3 + 21, iArr, 6);
        decode56(bArr, i3 + 28, iArr, 8);
        decode56(bArr, i3 + 35, iArr, 10);
        decode56(bArr, i3 + 42, iArr, 12);
        decode56(bArr, i3 + 49, iArr, 14);
    }

    private static void decode224(int[] iArr, int i3, int[] iArr2, int i10) {
        int i11 = iArr[i3];
        int i12 = iArr[i3 + 1];
        int i13 = iArr[i3 + 2];
        int i14 = iArr[i3 + 3];
        int i15 = iArr[i3 + 4];
        int i16 = iArr[i3 + 5];
        int i17 = iArr[i3 + 6];
        iArr2[i10] = i11 & M28;
        iArr2[i10 + 1] = ((i11 >>> 28) | (i12 << 4)) & M28;
        iArr2[i10 + 2] = ((i12 >>> 24) | (i13 << 8)) & M28;
        iArr2[i10 + 3] = ((i13 >>> 20) | (i14 << 12)) & M28;
        iArr2[i10 + 4] = ((i14 >>> 16) | (i15 << 16)) & M28;
        iArr2[i10 + 5] = ((i15 >>> 12) | (i16 << 20)) & M28;
        iArr2[i10 + 6] = M28 & ((i16 >>> 8) | (i17 << 24));
        iArr2[i10 + 7] = i17 >>> 4;
    }

    private static int decode24(byte[] bArr, int i3) {
        return ((bArr[i3 + 2] & UByte.MAX_VALUE) << 16) | (bArr[i3] & UByte.MAX_VALUE) | ((bArr[i3 + 1] & UByte.MAX_VALUE) << 8);
    }

    private static int decode32(byte[] bArr, int i3) {
        return (bArr[i3 + 3] << 24) | (bArr[i3] & UByte.MAX_VALUE) | ((bArr[i3 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i3 + 2] & UByte.MAX_VALUE) << 16);
    }

    private static void decode56(byte[] bArr, int i3, int[] iArr, int i10) {
        int decode32 = decode32(bArr, i3);
        int decode24 = decode24(bArr, i3 + 4);
        iArr[i10] = M28 & decode32;
        iArr[i10 + 1] = (decode24 << 4) | (decode32 >>> 28);
    }

    public static void encode(int[] iArr, byte[] bArr, int i3) {
        encode56(iArr, 0, bArr, i3);
        encode56(iArr, 2, bArr, i3 + 7);
        encode56(iArr, 4, bArr, i3 + 14);
        encode56(iArr, 6, bArr, i3 + 21);
        encode56(iArr, 8, bArr, i3 + 28);
        encode56(iArr, 10, bArr, i3 + 35);
        encode56(iArr, 12, bArr, i3 + 42);
        encode56(iArr, 14, bArr, i3 + 49);
    }

    private static void encode224(int[] iArr, int i3, int[] iArr2, int i10) {
        int i11 = iArr[i3];
        int i12 = iArr[i3 + 1];
        int i13 = iArr[i3 + 2];
        int i14 = iArr[i3 + 3];
        int i15 = iArr[i3 + 4];
        int i16 = iArr[i3 + 5];
        int i17 = iArr[i3 + 6];
        int i18 = iArr[i3 + 7];
        iArr2[i10] = (i12 << 28) | i11;
        iArr2[i10 + 1] = (i12 >>> 4) | (i13 << 24);
        iArr2[i10 + 2] = (i13 >>> 8) | (i14 << 20);
        iArr2[i10 + 3] = (i14 >>> 12) | (i15 << 16);
        iArr2[i10 + 4] = (i15 >>> 16) | (i16 << 12);
        iArr2[i10 + 5] = (i16 >>> 20) | (i17 << 8);
        iArr2[i10 + 6] = (i18 << 4) | (i17 >>> 24);
    }

    private static void encode24(int i3, byte[] bArr, int i10) {
        bArr[i10] = (byte) i3;
        bArr[i10 + 1] = (byte) (i3 >>> 8);
        bArr[i10 + 2] = (byte) (i3 >>> 16);
    }

    private static void encode32(int i3, byte[] bArr, int i10) {
        bArr[i10] = (byte) i3;
        bArr[i10 + 1] = (byte) (i3 >>> 8);
        bArr[i10 + 2] = (byte) (i3 >>> 16);
        bArr[i10 + 3] = (byte) (i3 >>> 24);
    }

    private static void encode56(int[] iArr, int i3, byte[] bArr, int i10) {
        int i11 = iArr[i3];
        int i12 = iArr[i3 + 1];
        encode32((i12 << 28) | i11, bArr, i10);
        encode24(i12 >>> 4, bArr, i10 + 4);
    }

    public static void inv(int[] iArr, int[] iArr2) {
        int[] create = create();
        int[] iArr3 = new int[14];
        copy(iArr, 0, create, 0);
        normalize(create);
        encode(create, iArr3, 0);
        Mod.modOddInverse(P32, iArr3, iArr3);
        decode(iArr3, 0, iArr2);
    }

    public static void invVar(int[] iArr, int[] iArr2) {
        int[] create = create();
        int[] iArr3 = new int[14];
        copy(iArr, 0, create, 0);
        normalize(create);
        encode(create, iArr3, 0);
        Mod.modOddInverseVar(P32, iArr3, iArr3);
        decode(iArr3, 0, iArr2);
    }

    public static int isOne(int[] iArr) {
        int i3 = iArr[0] ^ 1;
        for (int i10 = 1; i10 < 16; i10++) {
            i3 |= iArr[i10];
        }
        return (((i3 >>> 1) | (i3 & 1)) - 1) >> 31;
    }

    public static boolean isOneVar(int[] iArr) {
        return isOne(iArr) != 0;
    }

    public static int isZero(int[] iArr) {
        int i3 = 0;
        for (int i10 = 0; i10 < 16; i10++) {
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
        int i20 = iArr[10];
        int i21 = iArr[11];
        int i22 = iArr[12];
        int i23 = iArr[13];
        int i24 = iArr[14];
        int i25 = iArr[15];
        long j = i3;
        long j3 = i11 * j;
        int i26 = ((int) j3) & M28;
        long j10 = j3 >>> 28;
        long j11 = i15 * j;
        int i27 = ((int) j11) & M28;
        long j12 = j11 >>> 28;
        long j13 = i19 * j;
        int i28 = ((int) j13) & M28;
        long j14 = j13 >>> 28;
        long j15 = i23 * j;
        int i29 = ((int) j15) & M28;
        long j16 = j15 >>> 28;
        long j17 = (i12 * j) + j10;
        iArr2[2] = ((int) j17) & M28;
        long j18 = j17 >>> 28;
        long j19 = (i16 * j) + j12;
        iArr2[6] = ((int) j19) & M28;
        long j20 = j19 >>> 28;
        long j21 = (i20 * j) + j14;
        iArr2[10] = ((int) j21) & M28;
        long j22 = (i24 * j) + j16;
        iArr2[14] = ((int) j22) & M28;
        long j23 = j22 >>> 28;
        long j24 = (i13 * j) + j18;
        iArr2[3] = ((int) j24) & M28;
        long j25 = (i17 * j) + j20;
        iArr2[7] = ((int) j25) & M28;
        long j26 = (i21 * j) + (j21 >>> 28);
        iArr2[11] = ((int) j26) & M28;
        long j27 = j26 >>> 28;
        long j28 = (i25 * j) + j23;
        iArr2[15] = ((int) j28) & M28;
        long j29 = j28 >>> 28;
        long j30 = (i14 * j) + (j24 >>> 28);
        iArr2[4] = ((int) j30) & M28;
        long j31 = j30 >>> 28;
        long j32 = (i18 * j) + (j25 >>> 28) + j29;
        iArr2[8] = ((int) j32) & M28;
        long j33 = (i22 * j) + j27;
        iArr2[12] = ((int) j33) & M28;
        long j34 = j33 >>> 28;
        long j35 = (i10 * j) + j29;
        iArr2[0] = ((int) j35) & M28;
        iArr2[1] = i26 + ((int) (j35 >>> 28));
        iArr2[5] = i27 + ((int) j31);
        iArr2[9] = i28 + ((int) (j32 >>> 28));
        iArr2[13] = i29 + ((int) j34);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        sub(create(), iArr, iArr2);
    }

    public static void normalize(int[] iArr) {
        reduce(iArr, 1);
        reduce(iArr, -1);
    }

    public static void one(int[] iArr) {
        iArr[0] = 1;
        for (int i3 = 1; i3 < 16; i3++) {
            iArr[i3] = 0;
        }
    }

    private static void powPm3d4(int[] iArr, int[] iArr2) {
        int[] create = create();
        sqr(iArr, create);
        mul(iArr, create, create);
        int[] create2 = create();
        sqr(create, create2);
        mul(iArr, create2, create2);
        int[] create3 = create();
        sqr(create2, 3, create3);
        mul(create2, create3, create3);
        int[] create4 = create();
        sqr(create3, 3, create4);
        mul(create2, create4, create4);
        int[] create5 = create();
        sqr(create4, 9, create5);
        mul(create4, create5, create5);
        int[] create6 = create();
        sqr(create5, create6);
        mul(iArr, create6, create6);
        int[] create7 = create();
        sqr(create6, 18, create7);
        mul(create5, create7, create7);
        int[] create8 = create();
        sqr(create7, 37, create8);
        mul(create7, create8, create8);
        int[] create9 = create();
        sqr(create8, 37, create9);
        mul(create7, create9, create9);
        int[] create10 = create();
        sqr(create9, 111, create10);
        mul(create9, create10, create10);
        int[] create11 = create();
        sqr(create10, create11);
        mul(iArr, create11, create11);
        int[] create12 = create();
        sqr(create11, 223, create12);
        mul(create12, create10, iArr2);
    }

    private static void reduce(int[] iArr, int i3) {
        int i10;
        int i11 = iArr[15];
        int i12 = i11 & M28;
        long j = (i11 >>> 28) + i3;
        int i13 = 0;
        long j3 = j;
        while (true) {
            if (i13 >= 8) {
                break;
            }
            long j10 = j3 + (4294967295L & iArr[i13]);
            iArr[i13] = ((int) j10) & M28;
            j3 = j10 >> 28;
            i13++;
        }
        long j11 = j3 + j;
        for (i10 = 8; i10 < 15; i10++) {
            long j12 = j11 + (iArr[i10] & 4294967295L);
            iArr[i10] = ((int) j12) & M28;
            j11 = j12 >> 28;
        }
        iArr[15] = i12 + ((int) j11);
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
        sqr(iArr, create);
        mul(create, iArr2, create);
        sqr(create, create2);
        mul(create, iArr, create);
        mul(create2, iArr, create2);
        mul(create2, iArr2, create2);
        int[] create3 = create();
        powPm3d4(create2, create3);
        mul(create3, create, create3);
        int[] create4 = create();
        sqr(create3, create4);
        mul(create4, iArr2, create4);
        sub(iArr, create4, create4);
        normalize(create4);
        if (!isZeroVar(create4)) {
            return false;
        }
        copy(create3, 0, iArr3, 0);
        return true;
    }

    public static void sub(int[] iArr, int[] iArr2, int[] iArr3) {
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
        int i19 = iArr[10];
        int i20 = iArr[11];
        int i21 = iArr[12];
        int i22 = iArr[13];
        int i23 = iArr[14];
        int i24 = iArr[15];
        int i25 = iArr2[0];
        int i26 = iArr2[1];
        int i27 = iArr2[2];
        int i28 = iArr2[3];
        int i29 = iArr2[4];
        int i30 = iArr2[5];
        int i31 = iArr2[6];
        int i32 = iArr2[7];
        int i33 = iArr2[8];
        int i34 = iArr2[9];
        int i35 = iArr2[10];
        int i36 = iArr2[11];
        int i37 = iArr2[12];
        int i38 = iArr2[13];
        int i39 = iArr2[14];
        int i40 = (i10 + 536870910) - i26;
        int i41 = (i14 + 536870910) - i30;
        int i42 = (i18 + 536870910) - i34;
        int i43 = (i22 + 536870910) - i38;
        int i44 = (i24 + 536870910) - iArr2[15];
        int i45 = ((i11 + 536870910) - i27) + (i40 >>> 28);
        int i46 = i40 & M28;
        int i47 = ((i15 + 536870910) - i31) + (i41 >>> 28);
        int i48 = i41 & M28;
        int i49 = ((i19 + 536870910) - i35) + (i42 >>> 28);
        int i50 = i42 & M28;
        int i51 = ((i23 + 536870910) - i39) + (i43 >>> 28);
        int i52 = i43 & M28;
        int i53 = ((i12 + 536870910) - i28) + (i45 >>> 28);
        int i54 = i45 & M28;
        int i55 = ((i16 + 536870910) - i32) + (i47 >>> 28);
        int i56 = i47 & M28;
        int i57 = ((i20 + 536870910) - i36) + (i49 >>> 28);
        int i58 = i49 & M28;
        int i59 = i44 + (i51 >>> 28);
        int i60 = i51 & M28;
        int i61 = i59 >>> 28;
        int i62 = i59 & M28;
        int i63 = ((i3 + 536870910) - i25) + i61;
        int i64 = ((i13 + 536870910) - i29) + (i53 >>> 28);
        int i65 = i53 & M28;
        int i66 = ((i17 + 536870908) - i33) + i61 + (i55 >>> 28);
        int i67 = i55 & M28;
        int i68 = ((i21 + 536870910) - i37) + (i57 >>> 28);
        int i69 = i57 & M28;
        int i70 = i46 + (i63 >>> 28);
        int i71 = i63 & M28;
        int i72 = i48 + (i64 >>> 28);
        int i73 = i64 & M28;
        int i74 = i50 + (i66 >>> 28);
        int i75 = i66 & M28;
        int i76 = i52 + (i68 >>> 28);
        int i77 = i68 & M28;
        iArr3[0] = i71;
        iArr3[1] = i70;
        iArr3[2] = i54;
        iArr3[3] = i65;
        iArr3[4] = i73;
        iArr3[5] = i72;
        iArr3[6] = i56;
        iArr3[7] = i67;
        iArr3[8] = i75;
        iArr3[9] = i74;
        iArr3[10] = i58;
        iArr3[11] = i69;
        iArr3[12] = i77;
        iArr3[13] = i76;
        iArr3[14] = i60;
        iArr3[15] = i62;
    }

    public static void subOne(int[] iArr) {
        int[] create = create();
        create[0] = 1;
        sub(iArr, create, iArr);
    }

    public static void zero(int[] iArr) {
        for (int i3 = 0; i3 < 16; i3++) {
            iArr[i3] = 0;
        }
    }

    public static void addOne(int[] iArr, int i3) {
        iArr[i3] = iArr[i3] + 1;
    }

    public static void decode(int[] iArr, int i3, int[] iArr2) {
        decode224(iArr, i3, iArr2, 0);
        decode224(iArr, i3 + 7, iArr2, 8);
    }

    public static void encode(int[] iArr, int[] iArr2, int i3) {
        encode224(iArr, 0, iArr2, i3);
        encode224(iArr, 8, iArr2, i3 + 7);
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
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
        int i19 = iArr[10];
        int i20 = iArr[11];
        int i21 = iArr[12];
        int i22 = iArr[13];
        int i23 = iArr[14];
        int i24 = iArr[15];
        int i25 = iArr2[0];
        int i26 = iArr2[1];
        int i27 = iArr2[2];
        int i28 = iArr2[3];
        int i29 = iArr2[4];
        int i30 = iArr2[5];
        int i31 = iArr2[6];
        int i32 = iArr2[7];
        int i33 = iArr2[8];
        int i34 = iArr2[9];
        int i35 = iArr2[10];
        int i36 = iArr2[11];
        int i37 = iArr2[12];
        int i38 = iArr2[13];
        int i39 = iArr2[14];
        int i40 = iArr2[15];
        int i41 = i3 + i17;
        int i42 = i10 + i18;
        int i43 = i11 + i19;
        int i44 = i12 + i20;
        int i45 = i13 + i21;
        int i46 = i14 + i22;
        int i47 = i15 + i23;
        int i48 = i16 + i24;
        int i49 = i25 + i33;
        int i50 = i26 + i34;
        int i51 = i27 + i35;
        int i52 = i28 + i36;
        int i53 = i29 + i37;
        int i54 = i30 + i38;
        int i55 = i31 + i39;
        int i56 = i32 + i40;
        long j = i3;
        long j3 = i25;
        long j10 = j * j3;
        long j11 = i16;
        long j12 = i26;
        long j13 = j11 * j12;
        long j14 = i15;
        long j15 = i27;
        long j16 = (j14 * j15) + j13;
        long j17 = i14;
        long j18 = i28;
        long j19 = i13;
        long j20 = i29;
        long j21 = i12;
        long j22 = i30;
        long j23 = (j21 * j22) + (j19 * j20) + (j17 * j18) + j16;
        long j24 = i11;
        long j25 = i31;
        long j26 = i10;
        long j27 = i32;
        long j28 = j26 * j27;
        long j29 = i17;
        long j30 = i33;
        long j31 = j29 * j30;
        long j32 = i24;
        long j33 = i34;
        long j34 = j32 * j33;
        long j35 = i23;
        long j36 = i35;
        long j37 = (j35 * j36) + j34;
        long j38 = i22;
        long j39 = i36;
        long j40 = (j38 * j39) + j37;
        long j41 = i21;
        long j42 = i37;
        long j43 = (j41 * j42) + j40;
        long j44 = i20;
        long j45 = i38;
        long j46 = (j44 * j45) + j43;
        long j47 = i19;
        long j48 = i39;
        long j49 = (j47 * j48) + j46;
        long j50 = i18;
        long j51 = i40;
        long j52 = (j50 * j51) + j49;
        long j53 = i41;
        long j54 = i49;
        long j55 = j53 * j54;
        long j56 = i48;
        long j57 = i50;
        long j58 = j56 * j57;
        long j59 = i47;
        long j60 = i51;
        long j61 = (j59 * j60) + j58;
        long j62 = i46;
        long j63 = i52;
        long j64 = (j62 * j63) + j61;
        long j65 = i45;
        long j66 = i53;
        long j67 = (j65 * j66) + j64;
        long j68 = i44;
        long j69 = i54;
        long j70 = (j68 * j69) + j67;
        long j71 = i43;
        long j72 = i55;
        long j73 = (j71 * j72) + j70;
        long j74 = i42;
        long j75 = i56;
        long j76 = (j74 * j75) + j73;
        long j77 = ((j10 + j31) + j76) - (j28 + ((j24 * j25) + j23));
        int i57 = ((int) j77) & M28;
        long j78 = ((j52 + j55) - j10) + j76;
        int i58 = ((int) j78) & M28;
        long j79 = j78 >>> 28;
        long j80 = (j * j12) + (j26 * j3);
        long j81 = (j47 * j51) + (j44 * j48) + (j41 * j45) + (j38 * j42) + (j35 * j39) + (j32 * j36);
        long j82 = (j53 * j57) + (j74 * j54);
        long j83 = (j71 * j75) + (j68 * j72) + (j65 * j69) + (j62 * j66) + (j59 * j63) + (j56 * j60);
        long j84 = (((j80 + ((j29 * j33) + (j50 * j30))) + j83) - ((j24 * j27) + ((j21 * j25) + ((j19 * j22) + ((j17 * j20) + ((j14 * j18) + (j11 * j15))))))) + (j77 >>> 28);
        int i59 = ((int) j84) & M28;
        long j85 = j84 >>> 28;
        long j86 = ((j81 + j82) - j80) + j83 + j79;
        int i60 = ((int) j86) & M28;
        long j87 = j86 >>> 28;
        long j88 = (j * j15) + (j26 * j12) + (j24 * j3);
        long j89 = (j44 * j51) + (j41 * j48) + (j38 * j45) + (j35 * j42) + (j32 * j39);
        long j90 = (j53 * j60) + (j74 * j57) + (j71 * j54);
        long j91 = (j68 * j75) + (j65 * j72) + (j62 * j69) + (j59 * j66) + (j56 * j63);
        long j92 = (((j88 + ((j29 * j36) + ((j50 * j33) + (j47 * j30)))) + j91) - ((j21 * j27) + ((j19 * j25) + ((j17 * j22) + ((j14 * j20) + (j11 * j18)))))) + j85;
        int i61 = ((int) j92) & M28;
        long j93 = j92 >>> 28;
        long j94 = ((j89 + j90) - j88) + j91 + j87;
        int i62 = ((int) j94) & M28;
        long j95 = j94 >>> 28;
        long j96 = (j * j18) + (j26 * j15) + (j24 * j12) + (j21 * j3);
        long j97 = (j41 * j51) + (j38 * j48) + (j35 * j45) + (j32 * j42);
        long j98 = (j53 * j63) + (j74 * j60) + (j71 * j57) + (j68 * j54);
        long j99 = (j65 * j75) + (j62 * j72) + (j59 * j69) + (j56 * j66);
        long j100 = (((j96 + ((j29 * j39) + ((j50 * j36) + ((j47 * j33) + (j44 * j30))))) + j99) - ((j19 * j27) + ((j17 * j25) + ((j14 * j22) + (j11 * j20))))) + j93;
        int i63 = ((int) j100) & M28;
        long j101 = j100 >>> 28;
        long j102 = ((j97 + j98) - j96) + j99 + j95;
        int i64 = ((int) j102) & M28;
        long j103 = j102 >>> 28;
        long j104 = (j * j20) + (j26 * j18) + (j24 * j15) + (j21 * j12) + (j19 * j3);
        long j105 = (j38 * j51) + (j35 * j48) + (j32 * j45);
        long j106 = (j53 * j66) + (j74 * j63) + (j71 * j60) + (j68 * j57) + (j65 * j54);
        long j107 = (j62 * j75) + (j59 * j72) + (j56 * j69);
        long j108 = (((j104 + ((j29 * j42) + ((j50 * j39) + ((j47 * j36) + ((j44 * j33) + (j41 * j30)))))) + j107) - ((j17 * j27) + ((j14 * j25) + (j11 * j22)))) + j101;
        int i65 = ((int) j108) & M28;
        long j109 = j108 >>> 28;
        long j110 = ((j105 + j106) - j104) + j107 + j103;
        int i66 = ((int) j110) & M28;
        long j111 = j110 >>> 28;
        long j112 = (j * j22) + (j26 * j20) + (j24 * j18) + (j21 * j15) + (j19 * j12) + (j17 * j3);
        long j113 = (j35 * j51) + (j32 * j48);
        long j114 = (j53 * j69) + (j74 * j66) + (j71 * j63) + (j68 * j60) + (j65 * j57) + (j62 * j54);
        long j115 = (j59 * j75) + (j56 * j72);
        long j116 = (((j112 + ((j29 * j45) + ((j50 * j42) + ((j47 * j39) + ((j44 * j36) + ((j41 * j33) + (j38 * j30))))))) + j115) - ((j14 * j27) + (j11 * j25))) + j109;
        int i67 = ((int) j116) & M28;
        long j117 = j116 >>> 28;
        long j118 = ((j113 + j114) - j112) + j115 + j111;
        int i68 = ((int) j118) & M28;
        long j119 = j118 >>> 28;
        long j120 = (j * j25) + (j26 * j22) + (j24 * j20) + (j21 * j18) + (j19 * j15) + (j17 * j12) + (j14 * j3);
        long j121 = j32 * j51;
        long j122 = (j53 * j72) + (j74 * j69) + (j71 * j66) + (j68 * j63) + (j65 * j60) + (j62 * j57) + (j59 * j54);
        long j123 = j56 * j75;
        long j124 = (((j120 + ((j29 * j48) + ((j50 * j45) + ((j47 * j42) + ((j44 * j39) + ((j41 * j36) + ((j38 * j33) + (j35 * j30)))))))) + j123) - (j11 * j27)) + j117;
        int i69 = ((int) j124) & M28;
        long j125 = j124 >>> 28;
        long j126 = ((j121 + j122) - j120) + j123 + j119;
        int i70 = ((int) j126) & M28;
        long j127 = j21 * j20;
        long j128 = (j * j27) + (j26 * j25) + (j24 * j22) + j127 + (j19 * j18) + (j17 * j15) + (j14 * j12) + (j3 * j11);
        long j129 = (j29 * j51) + (j50 * j48) + (j47 * j45) + (j44 * j42) + (j41 * j39) + (j38 * j36) + (j35 * j33) + (j32 * j30) + j128 + j125;
        int i71 = ((int) j129) & M28;
        long j130 = (((j53 * j75) + ((j74 * j72) + ((j71 * j69) + ((j68 * j66) + ((j65 * j63) + ((j62 * j60) + ((j59 * j57) + (j56 * j54)))))))) - j128) + (j126 >>> 28);
        int i72 = ((int) j130) & M28;
        long j131 = j130 >>> 28;
        long j132 = (j129 >>> 28) + j131 + i58;
        int i73 = ((int) j132) & M28;
        long j133 = j131 + i57;
        iArr3[0] = ((int) j133) & M28;
        iArr3[1] = i59 + ((int) (j133 >>> 28));
        iArr3[2] = i61;
        iArr3[3] = i63;
        iArr3[4] = i65;
        iArr3[5] = i67;
        iArr3[6] = i69;
        iArr3[7] = i71;
        iArr3[8] = i73;
        iArr3[9] = i60 + ((int) (j132 >>> 28));
        iArr3[10] = i62;
        iArr3[11] = i64;
        iArr3[12] = i66;
        iArr3[13] = i68;
        iArr3[14] = i70;
        iArr3[15] = i72;
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
        int i19 = iArr[10];
        int i20 = iArr[11];
        int i21 = iArr[12];
        int i22 = iArr[13];
        int i23 = iArr[14];
        int i24 = iArr[15];
        int i25 = i3 * 2;
        int i26 = i10 * 2;
        int i27 = i13 * 2;
        int i28 = i14 * 2;
        int i29 = i15 * 2;
        int i30 = i17 * 2;
        int i31 = i19 * 2;
        int i32 = i20 * 2;
        int i33 = i21 * 2;
        int i34 = i3 + i17;
        int i35 = i10 + i18;
        int i36 = i11 + i19;
        int i37 = i12 + i20;
        int i38 = i13 + i21;
        int i39 = i14 + i22;
        int i40 = i15 + i23;
        int i41 = i34 * 2;
        int i42 = i35 * 2;
        int i43 = i36 * 2;
        int i44 = i37 * 2;
        long j = i3;
        long j3 = j * j;
        long j10 = i16;
        long j11 = i26;
        long j12 = j10 * j11;
        long j13 = i15;
        long j14 = i11 * 2;
        long j15 = (j13 * j14) + j12;
        long j16 = i14;
        long j17 = i12 * 2;
        long j18 = (j16 * j17) + j15;
        long j19 = i13;
        long j20 = i17;
        long j21 = j20 * j20;
        long j22 = i24;
        long j23 = i18 * 2;
        long j24 = i23;
        long j25 = i31;
        long j26 = (j24 * j25) + (j22 * j23);
        long j27 = i22;
        long j28 = i32;
        long j29 = i21;
        long j30 = j29 * j29;
        long j31 = i34;
        long j32 = j31 * j31;
        long j33 = i16 + i24;
        long j34 = i42 & 4294967295L;
        long j35 = j33 * j34;
        long j36 = i40;
        long j37 = i43 & 4294967295L;
        long j38 = (j36 * j37) + j35;
        long j39 = i39;
        long j40 = i44 & 4294967295L;
        long j41 = (j39 * j40) + j38;
        long j42 = i38;
        long j43 = (j42 * j42) + j41;
        long j44 = ((j3 + j21) + j43) - ((j19 * j19) + j18);
        int i45 = ((int) j44) & M28;
        long j45 = j44 >>> 28;
        long j46 = (((j30 + ((j27 * j28) + j26)) + j32) - j3) + j43;
        int i46 = ((int) j46) & M28;
        long j47 = j46 >>> 28;
        long j48 = i10;
        long j49 = i25;
        long j50 = j48 * j49;
        long j51 = i27;
        long j52 = j16 * j51;
        long j53 = i18;
        long j54 = i30;
        long j55 = j53 * j54;
        long j56 = i33;
        long j57 = j27 * j56;
        long j58 = i35;
        long j59 = i41 & 4294967295L;
        long j60 = j58 * j59;
        long j61 = (j36 * j40) + (j33 * j37);
        long j62 = (i38 * 2) & 4294967295L;
        long j63 = (j39 * j62) + j61;
        long j64 = (((j50 + j55) + j63) - (j52 + ((j13 * j17) + (j10 * j14)))) + j45;
        int i47 = ((int) j64) & M28;
        long j65 = j64 >>> 28;
        long j66 = (((j57 + ((j24 * j28) + (j22 * j25))) + j60) - j50) + j63 + j47;
        int i48 = ((int) j66) & M28;
        long j67 = j66 >>> 28;
        long j68 = i11;
        long j69 = (j48 * j48) + (j68 * j49);
        long j70 = (j13 * j51) + (j10 * j17);
        long j71 = i19;
        long j72 = (j53 * j53) + (j71 * j54);
        long j73 = (j24 * j56) + (j22 * j28);
        long j74 = i36;
        long j75 = (j58 * j58) + (j74 * j59);
        long j76 = (j39 * j39) + (j36 * j62) + (j33 * j40);
        long j77 = (((j69 + j72) + j76) - ((j16 * j16) + j70)) + j65;
        int i49 = ((int) j77) & M28;
        long j78 = j77 >>> 28;
        long j79 = ((((j27 * j27) + j73) + j75) - j69) + j76 + j67;
        int i50 = ((int) j79) & M28;
        long j80 = j79 >>> 28;
        long j81 = i12;
        long j82 = (j68 * j11) + (j81 * j49);
        long j83 = j10 * j51;
        long j84 = i28;
        long j85 = (j13 * j84) + j83;
        long j86 = i20;
        long j87 = (j71 * j23) + (j86 * j54);
        long j88 = j22 * j56;
        long j89 = i22 * 2;
        long j90 = (j24 * j89) + j88;
        long j91 = i37;
        long j92 = (j74 * j34) + (j91 * j59);
        long j93 = j62 * j33;
        long j94 = (i39 * 2) & 4294967295L;
        long j95 = (j36 * j94) + j93;
        long j96 = (((j82 + j87) + j95) - j85) + j78;
        int i51 = ((int) j96) & M28;
        long j97 = j96 >>> 28;
        long j98 = ((j90 + j92) - j82) + j95 + j80;
        int i52 = ((int) j98) & M28;
        long j99 = j98 >>> 28;
        long j100 = (j68 * j68) + (j81 * j11) + (j19 * j49);
        long j101 = (j24 * j24) + (j89 * j22);
        long j102 = (j74 * j74) + (j91 * j34) + (j42 * j59);
        long j103 = (j36 * j36) + (j33 * j94);
        long j104 = (((j100 + ((j71 * j71) + ((j86 * j23) + (j29 * j54)))) + j103) - ((j13 * j13) + (j10 * j84))) + j97;
        int i53 = ((int) j104) & M28;
        long j105 = j104 >>> 28;
        long j106 = ((j101 + j102) - j100) + j103 + j99;
        int i54 = ((int) j106) & M28;
        long j107 = j106 >>> 28;
        long j108 = (j81 * j14) + (j19 * j11) + (j16 * j49);
        long j109 = (j86 * j25) + (j29 * j23) + (j27 * j54);
        long j110 = (j91 * j37) + (j42 * j34) + (j39 * j59);
        long j111 = ((i40 * 2) & 4294967295L) * j33;
        long j112 = (((j108 + j109) + j111) - (i29 * j10)) + j105;
        int i55 = ((int) j112) & M28;
        long j113 = j112 >>> 28;
        long j114 = ((((i23 * 2) * j22) + j110) - j108) + j111 + j107;
        int i56 = ((int) j114) & M28;
        long j115 = j114 >>> 28;
        long j116 = (j81 * j81) + (j19 * j14) + (j16 * j11) + (j13 * j49);
        long j117 = (j91 * j91) + (j42 * j37) + (j39 * j34) + (j36 * j59);
        long j118 = j33 * j33;
        long j119 = (((j116 + ((j86 * j86) + ((j29 * j25) + ((j27 * j23) + (j24 * j54))))) + j118) - (j10 * j10)) + j113;
        int i57 = ((int) j119) & M28;
        long j120 = j119 >>> 28;
        long j121 = (((j22 * j22) + j117) - j116) + j118 + j115;
        int i58 = ((int) j121) & M28;
        long j122 = (j17 * j19) + (j16 * j14) + (j13 * j11) + (j10 * j49);
        long j123 = j27 * j25;
        long j124 = (j29 * j28) + j123 + (j24 * j23) + (j22 * j54);
        long j125 = j124 + j122 + j120;
        int i59 = ((int) j125) & M28;
        long j126 = (((j42 * j40) + ((j39 * j37) + ((j36 * j34) + (j33 * j59)))) - j122) + (j121 >>> 28);
        int i60 = ((int) j126) & M28;
        long j127 = j126 >>> 28;
        long j128 = (j125 >>> 28) + j127 + i46;
        int i61 = ((int) j128) & M28;
        long j129 = j127 + i45;
        iArr2[0] = ((int) j129) & M28;
        iArr2[1] = i47 + ((int) (j129 >>> 28));
        iArr2[2] = i49;
        iArr2[3] = i51;
        iArr2[4] = i53;
        iArr2[5] = i55;
        iArr2[6] = i57;
        iArr2[7] = i59;
        iArr2[8] = i61;
        iArr2[9] = i48 + ((int) (j128 >>> 28));
        iArr2[10] = i50;
        iArr2[11] = i52;
        iArr2[12] = i54;
        iArr2[13] = i56;
        iArr2[14] = i58;
        iArr2[15] = i60;
    }
}
