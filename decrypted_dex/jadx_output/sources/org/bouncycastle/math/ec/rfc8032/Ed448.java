package org.bouncycastle.math.ec.rfc8032;

import com.stub.StubApp;
import java.security.SecureRandom;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.math.ec.rfc7748.X448;
import org.bouncycastle.math.ec.rfc7748.X448Field;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class Ed448 {
    private static final int COORD_INTS = 14;
    private static final int C_d = -39081;
    private static final int L4_0 = 43969588;
    private static final int L4_1 = 30366549;
    private static final int L4_2 = 163752818;
    private static final int L4_3 = 258169998;
    private static final int L4_4 = 96434764;
    private static final int L4_5 = 227822194;
    private static final int L4_6 = 149865618;
    private static final int L4_7 = 550336261;
    private static final int L_0 = 78101261;
    private static final int L_1 = 141809365;
    private static final int L_2 = 175155932;
    private static final int L_3 = 64542499;
    private static final int L_4 = 158326419;
    private static final int L_5 = 191173276;
    private static final int L_6 = 104575268;
    private static final int L_7 = 137584065;
    private static final long M26L = 67108863;
    private static final long M28L = 268435455;
    private static final long M32L = 4294967295L;
    private static final int POINT_BYTES = 57;
    private static final int PRECOMP_BLOCKS = 5;
    private static final int PRECOMP_MASK = 15;
    private static final int PRECOMP_POINTS = 16;
    private static final int PRECOMP_RANGE = 450;
    private static final int PRECOMP_SPACING = 18;
    private static final int PRECOMP_TEETH = 5;
    public static final int PREHASH_SIZE = 64;
    public static final int PUBLIC_KEY_SIZE = 57;
    private static final int SCALAR_BYTES = 57;
    private static final int SCALAR_INTS = 14;
    public static final int SECRET_KEY_SIZE = 57;
    public static final int SIGNATURE_SIZE = 114;
    private static final int WNAF_WIDTH = 5;
    private static final int WNAF_WIDTH_BASE = 7;
    private static final byte[] DOM4_PREFIX = {83, 105, 103, 69, 100, 52, 52, 56};

    /* renamed from: P, reason: collision with root package name */
    private static final int[] f19299P = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};

    /* renamed from: L, reason: collision with root package name */
    private static final int[] f19298L = {-1420278541, 595116690, -1916432555, 560775794, -1361693040, -1001465015, 2093622249, -1, -1, -1, -1, -1, -1, 1073741823};
    private static final int[] B_x = {118276190, 40534716, 9670182, 135141552, 85017403, 259173222, 68333082, 171784774, 174973732, 15824510, 73756743, 57518561, 94773951, 248652241, 107736333, 82941708};
    private static final int[] B_y = {36764180, 8885695, 130592152, 20104429, 163904957, 30304195, 121295871, 5901357, 125344798, 171541512, 175338348, 209069246, 3626697, 38307682, 24032956, 110359655};
    private static final Object PRECOMP_LOCK = new Object();
    private static PointAffine[] PRECOMP_BASE_WNAF = null;
    private static int[] PRECOMP_BASE_COMB = null;

    /* renamed from: org.bouncycastle.math.ec.rfc8032.Ed448$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Algorithm {
        public static final int Ed448 = 0;
        public static final int Ed448ph = 1;
    }

    public static class F extends X448Field {
        private F() {
        }
    }

    public static class PointAffine {

        /* renamed from: x, reason: collision with root package name */
        int[] f19300x;

        /* renamed from: y, reason: collision with root package name */
        int[] f19301y;

        private PointAffine() {
            this.f19300x = X448Field.create();
            this.f19301y = X448Field.create();
        }

        public /* synthetic */ PointAffine(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class PointProjective {

        /* renamed from: x, reason: collision with root package name */
        int[] f19302x;

        /* renamed from: y, reason: collision with root package name */
        int[] f19303y;

        /* renamed from: z, reason: collision with root package name */
        int[] f19304z;

        private PointProjective() {
            this.f19302x = X448Field.create();
            this.f19303y = X448Field.create();
            this.f19304z = X448Field.create();
        }

        public /* synthetic */ PointProjective(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    private static byte[] calculateS(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int[] iArr = new int[28];
        decodeScalar(bArr, 0, iArr);
        int[] iArr2 = new int[14];
        decodeScalar(bArr2, 0, iArr2);
        int[] iArr3 = new int[14];
        decodeScalar(bArr3, 0, iArr3);
        Nat.mulAddTo(14, iArr2, iArr3, iArr);
        byte[] bArr4 = new byte[114];
        for (int i3 = 0; i3 < 28; i3++) {
            encode32(iArr[i3], bArr4, i3 * 4);
        }
        return reduceScalar(bArr4);
    }

    private static boolean checkContextVar(byte[] bArr) {
        return bArr != null && bArr.length < 256;
    }

    private static int checkPoint(int[] iArr, int[] iArr2) {
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        int[] create3 = X448Field.create();
        X448Field.sqr(iArr, create2);
        X448Field.sqr(iArr2, create3);
        X448Field.mul(create2, create3, create);
        X448Field.add(create2, create3, create2);
        X448Field.mul(create, 39081, create);
        X448Field.subOne(create);
        X448Field.add(create, create2, create);
        X448Field.normalize(create);
        return X448Field.isZero(create);
    }

    private static boolean checkPointVar(byte[] bArr) {
        if ((bArr[56] & ByteCompanionObject.MAX_VALUE) != 0) {
            return false;
        }
        decode32(bArr, 0, new int[14], 0, 14);
        return !Nat.gte(14, r2, f19299P);
    }

    private static boolean checkScalarVar(byte[] bArr, int[] iArr) {
        if (bArr[56] != 0) {
            return false;
        }
        decodeScalar(bArr, 0, iArr);
        return !Nat.gte(14, iArr, f19298L);
    }

    private static byte[] copy(byte[] bArr, int i3, int i10) {
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i3, bArr2, 0, i10);
        return bArr2;
    }

    public static Xof createPrehash() {
        return createXof();
    }

    private static Xof createXof() {
        return new SHAKEDigest(256);
    }

    private static int decode16(byte[] bArr, int i3) {
        return ((bArr[i3 + 1] & UByte.MAX_VALUE) << 8) | (bArr[i3] & UByte.MAX_VALUE);
    }

    private static int decode24(byte[] bArr, int i3) {
        return ((bArr[i3 + 2] & UByte.MAX_VALUE) << 16) | (bArr[i3] & UByte.MAX_VALUE) | ((bArr[i3 + 1] & UByte.MAX_VALUE) << 8);
    }

    private static int decode32(byte[] bArr, int i3) {
        return (bArr[i3 + 3] << 24) | (bArr[i3] & UByte.MAX_VALUE) | ((bArr[i3 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i3 + 2] & UByte.MAX_VALUE) << 16);
    }

    private static boolean decodePointVar(byte[] bArr, int i3, boolean z2, PointProjective pointProjective) {
        byte[] copy = copy(bArr, i3, 57);
        if (!checkPointVar(copy)) {
            return false;
        }
        byte b2 = copy[56];
        int i10 = (b2 & ByteCompanionObject.MIN_VALUE) >>> 7;
        copy[56] = (byte) (b2 & ByteCompanionObject.MAX_VALUE);
        X448Field.decode(copy, 0, pointProjective.f19303y);
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        X448Field.sqr(pointProjective.f19303y, create);
        X448Field.mul(create, 39081, create2);
        X448Field.negate(create, create);
        X448Field.addOne(create);
        X448Field.addOne(create2);
        if (!X448Field.sqrtRatioVar(create, create2, pointProjective.f19302x)) {
            return false;
        }
        X448Field.normalize(pointProjective.f19302x);
        if (i10 == 1 && X448Field.isZeroVar(pointProjective.f19302x)) {
            return false;
        }
        int[] iArr = pointProjective.f19302x;
        if (z2 ^ (i10 != (iArr[0] & 1))) {
            X448Field.negate(iArr, iArr);
        }
        X448Field.one(pointProjective.f19304z);
        return true;
    }

    private static void decodeScalar(byte[] bArr, int i3, int[] iArr) {
        decode32(bArr, i3, iArr, 0, 14);
    }

    private static void dom4(Xof xof, byte b2, byte[] bArr) {
        byte[] bArr2 = DOM4_PREFIX;
        int length = bArr2.length;
        int i3 = length + 2;
        int length2 = bArr.length + i3;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr2, 0, bArr3, 0, length);
        bArr3[length] = b2;
        bArr3[length + 1] = (byte) bArr.length;
        System.arraycopy(bArr, 0, bArr3, i3, bArr.length);
        xof.update(bArr3, 0, length2);
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

    private static void encode56(long j, byte[] bArr, int i3) {
        encode32((int) j, bArr, i3);
        encode24((int) (j >>> 32), bArr, i3 + 4);
    }

    private static int encodePoint(PointProjective pointProjective, byte[] bArr, int i3) {
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        X448Field.inv(pointProjective.f19304z, create2);
        X448Field.mul(pointProjective.f19302x, create2, create);
        X448Field.mul(pointProjective.f19303y, create2, create2);
        X448Field.normalize(create);
        X448Field.normalize(create2);
        int checkPoint = checkPoint(create, create2);
        X448Field.encode(create2, bArr, i3);
        bArr[i3 + 56] = (byte) ((create[0] & 1) << 7);
        return checkPoint;
    }

    public static void generatePrivateKey(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
    }

    public static void generatePublicKey(byte[] bArr, int i3, byte[] bArr2, int i10) {
        Xof createXof = createXof();
        byte[] bArr3 = new byte[114];
        createXof.update(bArr, i3, 57);
        createXof.doFinal(bArr3, 0, 114);
        byte[] bArr4 = new byte[57];
        pruneScalar(bArr3, 0, bArr4);
        scalarMultBaseEncoded(bArr4, bArr2, i10);
    }

    private static int getWindow4(int[] iArr, int i3) {
        return (iArr[i3 >>> 3] >>> ((i3 & 7) << 2)) & 15;
    }

    private static byte[] getWnafVar(int[] iArr, int i3) {
        int[] iArr2 = new int[28];
        int i10 = 0;
        int i11 = 14;
        int i12 = 28;
        int i13 = 0;
        while (true) {
            i11--;
            if (i11 < 0) {
                break;
            }
            int i14 = iArr[i11];
            iArr2[i12 - 1] = (i13 << 16) | (i14 >>> 16);
            i12 -= 2;
            iArr2[i12] = i14;
            i13 = i14;
        }
        byte[] bArr = new byte[447];
        int i15 = 32 - i3;
        int i16 = 0;
        int i17 = 0;
        while (i10 < 28) {
            int i18 = iArr2[i10];
            while (i16 < 16) {
                int i19 = i18 >>> i16;
                if ((i19 & 1) == i17) {
                    i16++;
                } else {
                    int i20 = (i19 | 1) << i15;
                    bArr[(i10 << 4) + i16] = (byte) (i20 >> i15);
                    i16 += i3;
                    i17 = i20 >>> 31;
                }
            }
            i10++;
            i16 -= 16;
        }
        return bArr;
    }

    private static void implSign(Xof xof, byte[] bArr, byte[] bArr2, byte[] bArr3, int i3, byte[] bArr4, byte b2, byte[] bArr5, int i10, int i11, byte[] bArr6, int i12) {
        dom4(xof, b2, bArr4);
        xof.update(bArr, 57, 57);
        xof.update(bArr5, i10, i11);
        xof.doFinal(bArr, 0, bArr.length);
        byte[] reduceScalar = reduceScalar(bArr);
        byte[] bArr7 = new byte[57];
        scalarMultBaseEncoded(reduceScalar, bArr7, 0);
        dom4(xof, b2, bArr4);
        xof.update(bArr7, 0, 57);
        xof.update(bArr3, i3, 57);
        xof.update(bArr5, i10, i11);
        xof.doFinal(bArr, 0, bArr.length);
        byte[] calculateS = calculateS(reduceScalar, reduceScalar(bArr), bArr2);
        System.arraycopy(bArr7, 0, bArr6, i12, 57);
        System.arraycopy(calculateS, 0, bArr6, i12 + 57, 57);
    }

    private static boolean implVerify(byte[] bArr, int i3, byte[] bArr2, int i10, byte[] bArr3, byte b2, byte[] bArr4, int i11, int i12) {
        if (!checkContextVar(bArr3)) {
            throw new IllegalArgumentException(StubApp.getString2(3493));
        }
        byte[] copy = copy(bArr, i3, 57);
        byte[] copy2 = copy(bArr, i3 + 57, 57);
        if (!checkPointVar(copy)) {
            return false;
        }
        int[] iArr = new int[14];
        if (!checkScalarVar(copy2, iArr)) {
            return false;
        }
        AnonymousClass1 anonymousClass1 = null;
        PointProjective pointProjective = new PointProjective(anonymousClass1);
        if (!decodePointVar(bArr2, i10, true, pointProjective)) {
            return false;
        }
        Xof createXof = createXof();
        byte[] bArr5 = new byte[114];
        dom4(createXof, b2, bArr3);
        createXof.update(copy, 0, 57);
        createXof.update(bArr2, i10, 57);
        createXof.update(bArr4, i11, i12);
        createXof.doFinal(bArr5, 0, 114);
        int[] iArr2 = new int[14];
        decodeScalar(reduceScalar(bArr5), 0, iArr2);
        PointProjective pointProjective2 = new PointProjective(anonymousClass1);
        scalarMultStrausVar(iArr, iArr2, pointProjective, pointProjective2);
        byte[] bArr6 = new byte[57];
        return encodePoint(pointProjective2, bArr6, 0) != 0 && Arrays.areEqual(bArr6, copy);
    }

    private static void invertZs(PointProjective[] pointProjectiveArr) {
        int length = pointProjectiveArr.length;
        int[] createTable = X448Field.createTable(length);
        int[] create = X448Field.create();
        X448Field.copy(pointProjectiveArr[0].f19304z, 0, create, 0);
        X448Field.copy(create, 0, createTable, 0);
        int i3 = 0;
        while (true) {
            int i10 = i3 + 1;
            if (i10 >= length) {
                break;
            }
            X448Field.mul(create, pointProjectiveArr[i10].f19304z, create);
            X448Field.copy(create, 0, createTable, i10 * 16);
            i3 = i10;
        }
        X448Field.invVar(create, create);
        int[] create2 = X448Field.create();
        while (i3 > 0) {
            int i11 = i3 - 1;
            X448Field.copy(createTable, i11 * 16, create2, 0);
            X448Field.mul(create2, create, create2);
            X448Field.mul(create, pointProjectiveArr[i3].f19304z, create);
            X448Field.copy(create2, 0, pointProjectiveArr[i3].f19304z, 0);
            i3 = i11;
        }
        X448Field.copy(create, 0, pointProjectiveArr[0].f19304z, 0);
    }

    private static boolean isNeutralElementVar(int[] iArr, int[] iArr2, int[] iArr3) {
        return X448Field.isZeroVar(iArr) && X448Field.areEqualVar(iArr2, iArr3);
    }

    private static void pointAdd(PointAffine pointAffine, PointProjective pointProjective) {
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        int[] create3 = X448Field.create();
        int[] create4 = X448Field.create();
        int[] create5 = X448Field.create();
        int[] create6 = X448Field.create();
        int[] create7 = X448Field.create();
        X448Field.sqr(pointProjective.f19304z, create);
        X448Field.mul(pointAffine.f19300x, pointProjective.f19302x, create2);
        X448Field.mul(pointAffine.f19301y, pointProjective.f19303y, create3);
        X448Field.mul(create2, create3, create4);
        X448Field.mul(create4, 39081, create4);
        X448Field.add(create, create4, create5);
        X448Field.sub(create, create4, create6);
        X448Field.add(pointAffine.f19301y, pointAffine.f19300x, create7);
        X448Field.add(pointProjective.f19303y, pointProjective.f19302x, create4);
        X448Field.mul(create7, create4, create7);
        X448Field.add(create3, create2, create);
        X448Field.sub(create3, create2, create4);
        X448Field.carry(create);
        X448Field.sub(create7, create, create7);
        X448Field.mul(create7, pointProjective.f19304z, create7);
        X448Field.mul(create4, pointProjective.f19304z, create4);
        X448Field.mul(create5, create7, pointProjective.f19302x);
        X448Field.mul(create4, create6, pointProjective.f19303y);
        X448Field.mul(create5, create6, pointProjective.f19304z);
    }

    private static void pointAddVar(boolean z2, PointAffine pointAffine, PointProjective pointProjective) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        int[] create3 = X448Field.create();
        int[] create4 = X448Field.create();
        int[] create5 = X448Field.create();
        int[] create6 = X448Field.create();
        int[] create7 = X448Field.create();
        if (z2) {
            X448Field.sub(pointAffine.f19301y, pointAffine.f19300x, create7);
            iArr2 = create;
            iArr = create4;
            iArr4 = create5;
            iArr3 = create6;
        } else {
            X448Field.add(pointAffine.f19301y, pointAffine.f19300x, create7);
            iArr = create;
            iArr2 = create4;
            iArr3 = create5;
            iArr4 = create6;
        }
        X448Field.sqr(pointProjective.f19304z, create);
        X448Field.mul(pointAffine.f19300x, pointProjective.f19302x, create2);
        X448Field.mul(pointAffine.f19301y, pointProjective.f19303y, create3);
        X448Field.mul(create2, create3, create4);
        X448Field.mul(create4, 39081, create4);
        X448Field.add(create, create4, iArr3);
        X448Field.sub(create, create4, iArr4);
        X448Field.add(pointProjective.f19303y, pointProjective.f19302x, create4);
        X448Field.mul(create7, create4, create7);
        X448Field.add(create3, create2, iArr);
        X448Field.sub(create3, create2, iArr2);
        X448Field.carry(iArr);
        X448Field.sub(create7, create, create7);
        X448Field.mul(create7, pointProjective.f19304z, create7);
        X448Field.mul(create4, pointProjective.f19304z, create4);
        X448Field.mul(create5, create7, pointProjective.f19302x);
        X448Field.mul(create4, create6, pointProjective.f19303y);
        X448Field.mul(create5, create6, pointProjective.f19304z);
    }

    private static void pointCopy(PointProjective pointProjective, PointProjective pointProjective2) {
        X448Field.copy(pointProjective.f19302x, 0, pointProjective2.f19302x, 0);
        X448Field.copy(pointProjective.f19303y, 0, pointProjective2.f19303y, 0);
        X448Field.copy(pointProjective.f19304z, 0, pointProjective2.f19304z, 0);
    }

    private static void pointDouble(PointProjective pointProjective) {
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        int[] create3 = X448Field.create();
        int[] create4 = X448Field.create();
        int[] create5 = X448Field.create();
        int[] create6 = X448Field.create();
        X448Field.add(pointProjective.f19302x, pointProjective.f19303y, create);
        X448Field.sqr(create, create);
        X448Field.sqr(pointProjective.f19302x, create2);
        X448Field.sqr(pointProjective.f19303y, create3);
        X448Field.add(create2, create3, create4);
        X448Field.carry(create4);
        X448Field.sqr(pointProjective.f19304z, create5);
        X448Field.add(create5, create5, create5);
        X448Field.carry(create5);
        X448Field.sub(create4, create5, create6);
        X448Field.sub(create, create4, create);
        X448Field.sub(create2, create3, create2);
        X448Field.mul(create, create6, pointProjective.f19302x);
        X448Field.mul(create4, create2, pointProjective.f19303y);
        X448Field.mul(create4, create6, pointProjective.f19304z);
    }

    private static void pointLookup(int i3, int i10, PointAffine pointAffine) {
        int i11 = i3 * 512;
        for (int i12 = 0; i12 < 16; i12++) {
            int i13 = ((i12 ^ i10) - 1) >> 31;
            X448Field.cmov(i13, PRECOMP_BASE_COMB, i11, pointAffine.f19300x, 0);
            X448Field.cmov(i13, PRECOMP_BASE_COMB, i11 + 16, pointAffine.f19301y, 0);
            i11 += 32;
        }
    }

    private static void pointLookup15(int[] iArr, PointProjective pointProjective) {
        X448Field.copy(iArr, 336, pointProjective.f19302x, 0);
        X448Field.copy(iArr, 352, pointProjective.f19303y, 0);
        X448Field.copy(iArr, 368, pointProjective.f19304z, 0);
    }

    private static int[] pointPrecompute(PointProjective pointProjective, int i3) {
        AnonymousClass1 anonymousClass1 = null;
        PointProjective pointProjective2 = new PointProjective(anonymousClass1);
        pointCopy(pointProjective, pointProjective2);
        PointProjective pointProjective3 = new PointProjective(anonymousClass1);
        pointCopy(pointProjective2, pointProjective3);
        pointDouble(pointProjective3);
        int[] createTable = X448Field.createTable(i3 * 3);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            X448Field.copy(pointProjective2.f19302x, 0, createTable, i10);
            X448Field.copy(pointProjective2.f19303y, 0, createTable, i10 + 16);
            X448Field.copy(pointProjective2.f19304z, 0, createTable, i10 + 32);
            i10 += 48;
            i11++;
            if (i11 == i3) {
                return createTable;
            }
            pointAdd(pointProjective3, pointProjective2);
        }
    }

    private static void pointPrecomputeVar(PointProjective pointProjective, PointProjective[] pointProjectiveArr, int i3) {
        AnonymousClass1 anonymousClass1 = null;
        PointProjective pointProjective2 = new PointProjective(anonymousClass1);
        pointCopy(pointProjective, pointProjective2);
        pointDouble(pointProjective2);
        PointProjective pointProjective3 = new PointProjective(anonymousClass1);
        pointProjectiveArr[0] = pointProjective3;
        pointCopy(pointProjective, pointProjective3);
        for (int i10 = 1; i10 < i3; i10++) {
            PointProjective pointProjective4 = new PointProjective(anonymousClass1);
            pointProjectiveArr[i10] = pointProjective4;
            pointCopy(pointProjectiveArr[i10 - 1], pointProjective4);
            pointAdd(pointProjective2, pointProjectiveArr[i10]);
        }
    }

    private static void pointSetNeutral(PointProjective pointProjective) {
        X448Field.zero(pointProjective.f19302x);
        X448Field.one(pointProjective.f19303y);
        X448Field.one(pointProjective.f19304z);
    }

    public static void precompute() {
        synchronized (PRECOMP_LOCK) {
            try {
                if (PRECOMP_BASE_WNAF == null || PRECOMP_BASE_COMB == null) {
                    PointProjective[] pointProjectiveArr = new PointProjective[112];
                    AnonymousClass1 anonymousClass1 = null;
                    PointProjective pointProjective = new PointProjective(anonymousClass1);
                    X448Field.copy(B_x, 0, pointProjective.f19302x, 0);
                    X448Field.copy(B_y, 0, pointProjective.f19303y, 0);
                    X448Field.one(pointProjective.f19304z);
                    pointPrecomputeVar(pointProjective, pointProjectiveArr, 32);
                    PointProjective[] pointProjectiveArr2 = new PointProjective[5];
                    for (int i3 = 0; i3 < 5; i3++) {
                        pointProjectiveArr2[i3] = new PointProjective(anonymousClass1);
                    }
                    int i10 = 32;
                    int i11 = 0;
                    for (int i12 = 5; i11 < i12; i12 = 5) {
                        int i13 = i10 + 1;
                        PointProjective pointProjective2 = new PointProjective(anonymousClass1);
                        pointProjectiveArr[i10] = pointProjective2;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= i12) {
                                break;
                            }
                            if (i14 == 0) {
                                pointCopy(pointProjective, pointProjective2);
                            } else {
                                pointAdd(pointProjective, pointProjective2);
                            }
                            pointDouble(pointProjective);
                            pointCopy(pointProjective, pointProjectiveArr2[i14]);
                            if (i11 + i14 != 8) {
                                for (int i15 = 1; i15 < 18; i15++) {
                                    pointDouble(pointProjective);
                                }
                            }
                            i14++;
                        }
                        int[] iArr = pointProjective2.f19302x;
                        X448Field.negate(iArr, iArr);
                        i10 = i13;
                        for (int i16 = 0; i16 < 4; i16++) {
                            int i17 = 1 << i16;
                            int i18 = 0;
                            while (i18 < i17) {
                                PointProjective pointProjective3 = new PointProjective(anonymousClass1);
                                pointProjectiveArr[i10] = pointProjective3;
                                pointCopy(pointProjectiveArr[i10 - i17], pointProjective3);
                                pointAdd(pointProjectiveArr2[i16], pointProjectiveArr[i10]);
                                i18++;
                                i10++;
                            }
                        }
                        i11++;
                    }
                    invertZs(pointProjectiveArr);
                    PRECOMP_BASE_WNAF = new PointAffine[32];
                    for (int i19 = 0; i19 < 32; i19++) {
                        PointProjective pointProjective4 = pointProjectiveArr[i19];
                        PointAffine[] pointAffineArr = PRECOMP_BASE_WNAF;
                        PointAffine pointAffine = new PointAffine(anonymousClass1);
                        pointAffineArr[i19] = pointAffine;
                        X448Field.mul(pointProjective4.f19302x, pointProjective4.f19304z, pointAffine.f19300x);
                        X448Field.normalize(pointAffine.f19300x);
                        X448Field.mul(pointProjective4.f19303y, pointProjective4.f19304z, pointAffine.f19301y);
                        X448Field.normalize(pointAffine.f19301y);
                    }
                    PRECOMP_BASE_COMB = X448Field.createTable(160);
                    int i20 = 0;
                    for (int i21 = 32; i21 < 112; i21++) {
                        PointProjective pointProjective5 = pointProjectiveArr[i21];
                        int[] iArr2 = pointProjective5.f19302x;
                        X448Field.mul(iArr2, pointProjective5.f19304z, iArr2);
                        X448Field.normalize(pointProjective5.f19302x);
                        int[] iArr3 = pointProjective5.f19303y;
                        X448Field.mul(iArr3, pointProjective5.f19304z, iArr3);
                        X448Field.normalize(pointProjective5.f19303y);
                        X448Field.copy(pointProjective5.f19302x, 0, PRECOMP_BASE_COMB, i20);
                        X448Field.copy(pointProjective5.f19303y, 0, PRECOMP_BASE_COMB, i20 + 16);
                        i20 += 32;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void pruneScalar(byte[] bArr, int i3, byte[] bArr2) {
        System.arraycopy(bArr, i3, bArr2, 0, 56);
        bArr2[0] = (byte) (bArr2[0] & 252);
        bArr2[55] = (byte) (bArr2[55] | ByteCompanionObject.MIN_VALUE);
        bArr2[56] = 0;
    }

    private static byte[] reduceScalar(byte[] bArr) {
        long decode32 = decode32(bArr, 84);
        long j = decode32 & 4294967295L;
        long decode322 = decode32(bArr, 91);
        long j3 = decode322 & 4294967295L;
        long decode323 = decode32(bArr, 98);
        long j10 = decode323 & 4294967295L;
        long decode324 = decode32(bArr, 105);
        long j11 = decode324 & 4294967295L;
        long decode16 = decode16(bArr, 112) & 4294967295L;
        long decode24 = ((decode24(bArr, 109) << 4) & 4294967295L) + (j11 >>> 28);
        long j12 = decode324 & M28L;
        long decode325 = (j12 * 163752818) + (decode24 * 30366549) + (decode16 * 43969588) + (decode32(bArr, 56) & 4294967295L);
        long decode242 = (j12 * 258169998) + (decode24 * 163752818) + (decode16 * 30366549) + ((decode24(bArr, 60) << 4) & 4294967295L);
        long decode326 = (j12 * 96434764) + (decode24 * 258169998) + (decode16 * 163752818) + (decode32(bArr, 63) & 4294967295L);
        long decode243 = (j12 * 227822194) + (decode24 * 96434764) + (decode16 * 258169998) + ((decode24(bArr, 67) << 4) & 4294967295L);
        long decode327 = (j12 * 149865618) + (decode24 * 227822194) + (decode16 * 96434764) + (decode32(bArr, 70) & 4294967295L);
        long decode244 = ((decode24(bArr, 102) << 4) & 4294967295L) + (j10 >>> 28);
        long j13 = decode323 & M28L;
        long decode245 = (decode244 * 43969588) + ((decode24(bArr, 46) << 4) & 4294967295L);
        long decode328 = (decode244 * 30366549) + (j12 * 43969588) + (decode32(bArr, 49) & 4294967295L);
        long decode246 = (decode244 * 163752818) + (j12 * 30366549) + (decode24 * 43969588) + ((decode24(bArr, 53) << 4) & 4294967295L);
        long j14 = (decode244 * 258169998) + decode325;
        long j15 = (decode244 * 96434764) + decode242;
        long j16 = (decode244 * 227822194) + decode326;
        long j17 = (decode244 * 149865618) + decode243;
        long j18 = (decode244 * 550336261) + decode327;
        long decode329 = (j13 * 43969588) + (decode32(bArr, 42) & 4294967295L);
        long j19 = (j13 * 30366549) + decode245;
        long j20 = (j13 * 163752818) + decode328;
        long j21 = (j13 * 258169998) + decode246;
        long j22 = (j13 * 96434764) + j14;
        long j23 = (j13 * 227822194) + j15;
        long j24 = (j13 * 149865618) + j16;
        long j25 = (j13 * 550336261) + j17;
        long decode247 = ((decode24(bArr, 95) << 4) & 4294967295L) + (j3 >>> 28);
        long j26 = decode322 & M28L;
        long j27 = (decode247 * 163752818) + j19;
        long j28 = (decode247 * 258169998) + j20;
        long j29 = (decode247 * 149865618) + j23;
        long decode3210 = (j26 * 43969588) + (decode32(bArr, 35) & 4294967295L);
        long decode248 = (j26 * 30366549) + (decode247 * 43969588) + ((decode24(bArr, 39) << 4) & 4294967295L);
        long j30 = (j26 * 163752818) + (decode247 * 30366549) + decode329;
        long j31 = (j26 * 258169998) + j27;
        long j32 = (j26 * 96434764) + j28;
        long j33 = (j26 * 227822194) + (decode247 * 96434764) + j21;
        long j34 = (j26 * 149865618) + (decode247 * 227822194) + j22;
        long j35 = (j26 * 550336261) + j29;
        long decode249 = ((decode24(bArr, 88) << 4) & 4294967295L) + (j >>> 28);
        long j36 = decode32 & M28L;
        long decode2410 = (decode249 * 43969588) + ((decode24(bArr, 32) << 4) & 4294967295L);
        long j37 = (decode249 * 30366549) + decode3210;
        long j38 = (decode249 * 163752818) + decode248;
        long j39 = (decode249 * 258169998) + j30;
        long j40 = (decode249 * 96434764) + j31;
        long j41 = (decode249 * 227822194) + j32;
        long j42 = (decode249 * 149865618) + j33;
        long j43 = (decode249 * 550336261) + j34;
        long decode2411 = (j12 * 550336261) + (decode24 * 149865618) + (decode16 * 227822194) + ((decode24(bArr, 74) << 4) & 4294967295L) + (j18 >>> 28);
        long j44 = j18 & M28L;
        long decode3211 = (decode24 * 550336261) + (decode16 * 149865618) + (decode32(bArr, 77) & 4294967295L) + (decode2411 >>> 28);
        long j45 = decode2411 & M28L;
        long decode2412 = (decode16 * 550336261) + ((decode24(bArr, 81) << 4) & 4294967295L) + (decode3211 >>> 28);
        long j46 = decode3211 & M28L;
        long j47 = j36 + (decode2412 >>> 28);
        long j48 = decode2412 & M28L;
        long decode3212 = (j47 * 43969588) + (decode32(bArr, 28) & 4294967295L);
        long j49 = (j47 * 30366549) + decode2410;
        long j50 = (j47 * 163752818) + j37;
        long j51 = (j47 * 258169998) + j38;
        long j52 = (j47 * 96434764) + j39;
        long j53 = (j47 * 227822194) + j40;
        long j54 = (j47 * 149865618) + j41;
        long j55 = (j47 * 550336261) + j42;
        long decode2413 = (j48 * 43969588) + ((decode24(bArr, 25) << 4) & 4294967295L);
        long j56 = (j48 * 30366549) + decode3212;
        long j57 = (j48 * 163752818) + j49;
        long j58 = (j48 * 258169998) + j50;
        long j59 = (j48 * 96434764) + j51;
        long j60 = (j48 * 227822194) + j52;
        long j61 = (j48 * 149865618) + j53;
        long j62 = (j48 * 550336261) + j54;
        long decode3213 = (j46 * 43969588) + (decode32(bArr, 21) & 4294967295L);
        long j63 = (j46 * 30366549) + decode2413;
        long j64 = (j46 * 163752818) + j56;
        long j65 = (j46 * 258169998) + j57;
        long j66 = (j46 * 96434764) + j58;
        long j67 = (j46 * 227822194) + j59;
        long j68 = (j46 * 149865618) + j60;
        long j69 = (j46 * 550336261) + j61;
        long j70 = (decode247 * 550336261) + j24 + (j35 >>> 28);
        long j71 = j35 & M28L;
        long j72 = j25 + (j70 >>> 28);
        long j73 = j70 & M28L;
        long j74 = j44 + (j72 >>> 28);
        long j75 = j72 & M28L;
        long j76 = j45 + (j74 >>> 28);
        long j77 = j74 & M28L;
        long decode2414 = (j76 * 43969588) + ((decode24(bArr, 18) << 4) & 4294967295L);
        long j78 = (j76 * 30366549) + decode3213;
        long j79 = (j76 * 163752818) + j63;
        long j80 = (j76 * 258169998) + j64;
        long j81 = (j76 * 96434764) + j65;
        long j82 = (j76 * 227822194) + j66;
        long j83 = (j76 * 149865618) + j67;
        long decode3214 = (j77 * 43969588) + (decode32(bArr, 14) & 4294967295L);
        long j84 = (j77 * 30366549) + decode2414;
        long j85 = (j77 * 163752818) + j78;
        long j86 = (j77 * 258169998) + j79;
        long j87 = (j77 * 96434764) + j80;
        long j88 = (j77 * 227822194) + j81;
        long j89 = (j77 * 149865618) + j82;
        long decode2415 = (j75 * 43969588) + ((decode24(bArr, 11) << 4) & 4294967295L);
        long j90 = (j75 * 30366549) + decode3214;
        long j91 = (j75 * 163752818) + j84;
        long j92 = (j75 * 258169998) + j85;
        long j93 = (j75 * 96434764) + j86;
        long j94 = (j75 * 227822194) + j87;
        long j95 = (j75 * 149865618) + j88;
        long j96 = (j75 * 550336261) + j89;
        long j97 = j55 + (j62 >>> 28);
        long j98 = j62 & M28L;
        long j99 = j43 + (j97 >>> 28);
        long j100 = j97 & M28L;
        long j101 = j71 + (j99 >>> 28);
        long j102 = j99 & M28L;
        long j103 = j73 + (j101 >>> 28);
        long j104 = j101 & M28L;
        long decode3215 = (j103 * 43969588) + (decode32(bArr, 7) & 4294967295L);
        long j105 = (j103 * 30366549) + decode2415;
        long j106 = (j103 * 163752818) + j90;
        long j107 = (j103 * 258169998) + j91;
        long j108 = (j103 * 96434764) + j92;
        long j109 = (j103 * 227822194) + j93;
        long j110 = (j103 * 149865618) + j94;
        long j111 = (j103 * 550336261) + j95;
        long decode2416 = (43969588 * j104) + ((decode24(bArr, 4) << 4) & 4294967295L);
        long j112 = j97 & M26L;
        long j113 = (j102 * 4) + (j100 >>> 26) + 1;
        long decode3216 = (78101261 * j113) + (decode32(bArr, 0) & 4294967295L);
        long j114 = (141809365 * j113) + decode2416 + (decode3216 >>> 28);
        long j115 = decode3216 & M28L;
        long j116 = (175155932 * j113) + (30366549 * j104) + decode3215 + (j114 >>> 28);
        long j117 = j114 & M28L;
        long j118 = (64542499 * j113) + (163752818 * j104) + j105 + (j116 >>> 28);
        long j119 = j116 & M28L;
        long j120 = (158326419 * j113) + (258169998 * j104) + j106 + (j118 >>> 28);
        long j121 = j118 & M28L;
        long j122 = (191173276 * j113) + (96434764 * j104) + j107 + (j120 >>> 28);
        long j123 = j120 & M28L;
        long j124 = (104575268 * j113) + (227822194 * j104) + j108 + (j122 >>> 28);
        long j125 = j122 & M28L;
        long j126 = (j113 * 137584065) + (149865618 * j104) + j109 + (j124 >>> 28);
        long j127 = j124 & M28L;
        long j128 = (j104 * 550336261) + j110 + (j126 >>> 28);
        long j129 = j126 & M28L;
        long j130 = j111 + (j128 >>> 28);
        long j131 = j128 & M28L;
        long j132 = j96 + (j130 >>> 28);
        long j133 = j130 & M28L;
        long j134 = (j77 * 550336261) + j83 + (j132 >>> 28);
        long j135 = j132 & M28L;
        long j136 = (j76 * 550336261) + j68 + (j134 >>> 28);
        long j137 = j134 & M28L;
        long j138 = j69 + (j136 >>> 28);
        long j139 = j136 & M28L;
        long j140 = j98 + (j138 >>> 28);
        long j141 = j138 & M28L;
        long j142 = j112 + (j140 >>> 28);
        long j143 = j140 & M28L;
        long j144 = j142 & M26L;
        long j145 = (j142 >>> 26) - 1;
        long j146 = j115 - (j145 & 78101261);
        long j147 = (j117 - (j145 & 141809365)) + (j146 >> 28);
        long j148 = j146 & M28L;
        long j149 = (j119 - (j145 & 175155932)) + (j147 >> 28);
        long j150 = j147 & M28L;
        long j151 = (j121 - (j145 & 64542499)) + (j149 >> 28);
        long j152 = j149 & M28L;
        long j153 = (j123 - (j145 & 158326419)) + (j151 >> 28);
        long j154 = j151 & M28L;
        long j155 = (j125 - (j145 & 191173276)) + (j153 >> 28);
        long j156 = j153 & M28L;
        long j157 = (j127 - (j145 & 104575268)) + (j155 >> 28);
        long j158 = j155 & M28L;
        long j159 = (j129 - (j145 & 137584065)) + (j157 >> 28);
        long j160 = j157 & M28L;
        long j161 = j131 + (j159 >> 28);
        long j162 = j159 & M28L;
        long j163 = j133 + (j161 >> 28);
        long j164 = j161 & M28L;
        long j165 = j135 + (j163 >> 28);
        long j166 = j163 & M28L;
        long j167 = j137 + (j165 >> 28);
        long j168 = j165 & M28L;
        long j169 = j139 + (j167 >> 28);
        long j170 = j167 & M28L;
        long j171 = j141 + (j169 >> 28);
        long j172 = j169 & M28L;
        long j173 = j143 + (j171 >> 28);
        long j174 = j171 & M28L;
        long j175 = j144 + (j173 >> 28);
        long j176 = j173 & M28L;
        byte[] bArr2 = new byte[57];
        encode56(j148 | (j150 << 28), bArr2, 0);
        encode56(j152 | (j154 << 28), bArr2, 7);
        encode56((j158 << 28) | j156, bArr2, 14);
        encode56(j160 | (j162 << 28), bArr2, 21);
        encode56(j164 | (j166 << 28), bArr2, 28);
        encode56(j168 | (j170 << 28), bArr2, 35);
        encode56(j172 | (j174 << 28), bArr2, 42);
        encode56(j176 | (j175 << 28), bArr2, 49);
        return bArr2;
    }

    private static void scalarMult(byte[] bArr, PointProjective pointProjective, PointProjective pointProjective2) {
        int[] iArr = new int[14];
        decodeScalar(bArr, 0, iArr);
        Nat.shiftDownBit(14, iArr, Nat.cadd(14, (~iArr[0]) & 1, iArr, f19298L, iArr));
        int[] pointPrecompute = pointPrecompute(pointProjective, 8);
        PointProjective pointProjective3 = new PointProjective(null);
        pointLookup15(pointPrecompute, pointProjective2);
        pointAdd(pointProjective, pointProjective2);
        int i3 = 111;
        while (true) {
            pointLookup(iArr, i3, pointPrecompute, pointProjective3);
            pointAdd(pointProjective3, pointProjective2);
            i3--;
            if (i3 < 0) {
                return;
            }
            for (int i10 = 0; i10 < 4; i10++) {
                pointDouble(pointProjective2);
            }
        }
    }

    private static void scalarMultBase(byte[] bArr, PointProjective pointProjective) {
        precompute();
        int[] iArr = new int[15];
        decodeScalar(bArr, 0, iArr);
        iArr[14] = Nat.cadd(14, (~iArr[0]) & 1, iArr, f19298L, iArr) + 4;
        Nat.shiftDownBit(15, iArr, 0);
        PointAffine pointAffine = new PointAffine(null);
        pointSetNeutral(pointProjective);
        int i3 = 17;
        while (true) {
            int i10 = i3;
            for (int i11 = 0; i11 < 5; i11++) {
                int i12 = 0;
                for (int i13 = 0; i13 < 5; i13++) {
                    i12 = (i12 & (~(1 << i13))) ^ ((iArr[i10 >>> 5] >>> (i10 & 31)) << i13);
                    i10 += 18;
                }
                int i14 = (i12 >>> 4) & 1;
                pointLookup(i11, ((-i14) ^ i12) & 15, pointAffine);
                X448Field.cnegate(i14, pointAffine.f19300x);
                pointAdd(pointAffine, pointProjective);
            }
            i3--;
            if (i3 < 0) {
                return;
            } else {
                pointDouble(pointProjective);
            }
        }
    }

    private static void scalarMultBaseEncoded(byte[] bArr, byte[] bArr2, int i3) {
        PointProjective pointProjective = new PointProjective(null);
        scalarMultBase(bArr, pointProjective);
        if (encodePoint(pointProjective, bArr2, i3) == 0) {
            throw new IllegalStateException();
        }
    }

    public static void scalarMultBaseXY(X448.Friend friend, byte[] bArr, int i3, int[] iArr, int[] iArr2) {
        if (friend == null) {
            throw new NullPointerException(StubApp.getString2(32995));
        }
        byte[] bArr2 = new byte[57];
        pruneScalar(bArr, i3, bArr2);
        PointProjective pointProjective = new PointProjective(null);
        scalarMultBase(bArr2, pointProjective);
        if (checkPoint(pointProjective.f19302x, pointProjective.f19303y, pointProjective.f19304z) == 0) {
            throw new IllegalStateException();
        }
        X448Field.copy(pointProjective.f19302x, 0, iArr, 0);
        X448Field.copy(pointProjective.f19303y, 0, iArr2, 0);
    }

    private static void scalarMultOrderVar(PointProjective pointProjective, PointProjective pointProjective2) {
        byte[] wnafVar = getWnafVar(f19298L, 5);
        PointProjective[] pointProjectiveArr = new PointProjective[8];
        pointPrecomputeVar(pointProjective, pointProjectiveArr, 8);
        pointSetNeutral(pointProjective2);
        int i3 = 446;
        while (true) {
            byte b2 = wnafVar[i3];
            if (b2 != 0) {
                int i10 = b2 >> 31;
                pointAddVar(i10 != 0, pointProjectiveArr[(b2 ^ i10) >>> 1], pointProjective2);
            }
            i3--;
            if (i3 < 0) {
                return;
            } else {
                pointDouble(pointProjective2);
            }
        }
    }

    private static void scalarMultStrausVar(int[] iArr, int[] iArr2, PointProjective pointProjective, PointProjective pointProjective2) {
        precompute();
        byte[] wnafVar = getWnafVar(iArr, 7);
        byte[] wnafVar2 = getWnafVar(iArr2, 5);
        PointProjective[] pointProjectiveArr = new PointProjective[8];
        pointPrecomputeVar(pointProjective, pointProjectiveArr, 8);
        pointSetNeutral(pointProjective2);
        int i3 = 446;
        while (true) {
            byte b2 = wnafVar[i3];
            if (b2 != 0) {
                int i10 = b2 >> 31;
                pointAddVar(i10 != 0, PRECOMP_BASE_WNAF[(b2 ^ i10) >>> 1], pointProjective2);
            }
            byte b10 = wnafVar2[i3];
            if (b10 != 0) {
                int i11 = b10 >> 31;
                pointAddVar(i11 != 0, pointProjectiveArr[(b10 ^ i11) >>> 1], pointProjective2);
            }
            i3--;
            if (i3 < 0) {
                return;
            } else {
                pointDouble(pointProjective2);
            }
        }
    }

    public static void sign(byte[] bArr, int i3, byte[] bArr2, int i10, byte[] bArr3, byte[] bArr4, int i11, int i12, byte[] bArr5, int i13) {
        implSign(bArr, i3, bArr2, i10, bArr3, (byte) 0, bArr4, i11, i12, bArr5, i13);
    }

    public static void signPrehash(byte[] bArr, int i3, byte[] bArr2, int i10, byte[] bArr3, Xof xof, byte[] bArr4, int i11) {
        byte[] bArr5 = new byte[64];
        if (64 != xof.doFinal(bArr5, 0, 64)) {
            throw new IllegalArgumentException(StubApp.getString2(32994));
        }
        implSign(bArr, i3, bArr2, i10, bArr3, (byte) 1, bArr5, 0, 64, bArr4, i11);
    }

    public static boolean validatePublicKeyFull(byte[] bArr, int i3) {
        AnonymousClass1 anonymousClass1 = null;
        PointProjective pointProjective = new PointProjective(anonymousClass1);
        if (!decodePointVar(bArr, i3, false, pointProjective)) {
            return false;
        }
        X448Field.normalize(pointProjective.f19302x);
        X448Field.normalize(pointProjective.f19303y);
        X448Field.normalize(pointProjective.f19304z);
        if (isNeutralElementVar(pointProjective.f19302x, pointProjective.f19303y, pointProjective.f19304z)) {
            return false;
        }
        PointProjective pointProjective2 = new PointProjective(anonymousClass1);
        scalarMultOrderVar(pointProjective, pointProjective2);
        X448Field.normalize(pointProjective2.f19302x);
        X448Field.normalize(pointProjective2.f19303y);
        X448Field.normalize(pointProjective2.f19304z);
        return isNeutralElementVar(pointProjective2.f19302x, pointProjective2.f19303y, pointProjective2.f19304z);
    }

    public static boolean validatePublicKeyPartial(byte[] bArr, int i3) {
        return decodePointVar(bArr, i3, false, new PointProjective(null));
    }

    public static boolean verify(byte[] bArr, int i3, byte[] bArr2, int i10, byte[] bArr3, byte[] bArr4, int i11, int i12) {
        return implVerify(bArr, i3, bArr2, i10, bArr3, (byte) 0, bArr4, i11, i12);
    }

    public static boolean verifyPrehash(byte[] bArr, int i3, byte[] bArr2, int i10, byte[] bArr3, Xof xof) {
        byte[] bArr4 = new byte[64];
        if (64 == xof.doFinal(bArr4, 0, 64)) {
            return implVerify(bArr, i3, bArr2, i10, bArr3, (byte) 1, bArr4, 0, 64);
        }
        throw new IllegalArgumentException(StubApp.getString2(32994));
    }

    private static int checkPoint(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        int[] create3 = X448Field.create();
        int[] create4 = X448Field.create();
        X448Field.sqr(iArr, create2);
        X448Field.sqr(iArr2, create3);
        X448Field.sqr(iArr3, create4);
        X448Field.mul(create2, create3, create);
        X448Field.add(create2, create3, create2);
        X448Field.mul(create2, create4, create2);
        X448Field.sqr(create4, create4);
        X448Field.mul(create, 39081, create);
        X448Field.sub(create, create4, create);
        X448Field.add(create, create2, create);
        X448Field.normalize(create);
        return X448Field.isZero(create);
    }

    private static void decode32(byte[] bArr, int i3, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i10 + i12] = decode32(bArr, (i12 * 4) + i3);
        }
    }

    private static void implSign(byte[] bArr, int i3, byte[] bArr2, byte b2, byte[] bArr3, int i10, int i11, byte[] bArr4, int i12) {
        if (!checkContextVar(bArr2)) {
            throw new IllegalArgumentException(StubApp.getString2(3493));
        }
        Xof createXof = createXof();
        byte[] bArr5 = new byte[114];
        createXof.update(bArr, i3, 57);
        createXof.doFinal(bArr5, 0, 114);
        byte[] bArr6 = new byte[57];
        pruneScalar(bArr5, 0, bArr6);
        byte[] bArr7 = new byte[57];
        scalarMultBaseEncoded(bArr6, bArr7, 0);
        implSign(createXof, bArr5, bArr6, bArr7, 0, bArr2, b2, bArr3, i10, i11, bArr4, i12);
    }

    private static void pointAdd(PointProjective pointProjective, PointProjective pointProjective2) {
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        int[] create3 = X448Field.create();
        int[] create4 = X448Field.create();
        int[] create5 = X448Field.create();
        int[] create6 = X448Field.create();
        int[] create7 = X448Field.create();
        int[] create8 = X448Field.create();
        X448Field.mul(pointProjective.f19304z, pointProjective2.f19304z, create);
        X448Field.sqr(create, create2);
        X448Field.mul(pointProjective.f19302x, pointProjective2.f19302x, create3);
        X448Field.mul(pointProjective.f19303y, pointProjective2.f19303y, create4);
        X448Field.mul(create3, create4, create5);
        X448Field.mul(create5, 39081, create5);
        X448Field.add(create2, create5, create6);
        X448Field.sub(create2, create5, create7);
        X448Field.add(pointProjective.f19303y, pointProjective.f19302x, create8);
        X448Field.add(pointProjective2.f19303y, pointProjective2.f19302x, create5);
        X448Field.mul(create8, create5, create8);
        X448Field.add(create4, create3, create2);
        X448Field.sub(create4, create3, create5);
        X448Field.carry(create2);
        X448Field.sub(create8, create2, create8);
        X448Field.mul(create8, create, create8);
        X448Field.mul(create5, create, create5);
        X448Field.mul(create6, create8, pointProjective2.f19302x);
        X448Field.mul(create5, create7, pointProjective2.f19303y);
        X448Field.mul(create6, create7, pointProjective2.f19304z);
    }

    private static void pointAddVar(boolean z2, PointProjective pointProjective, PointProjective pointProjective2) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        int[] create3 = X448Field.create();
        int[] create4 = X448Field.create();
        int[] create5 = X448Field.create();
        int[] create6 = X448Field.create();
        int[] create7 = X448Field.create();
        int[] create8 = X448Field.create();
        if (z2) {
            X448Field.sub(pointProjective.f19303y, pointProjective.f19302x, create8);
            iArr2 = create2;
            iArr = create5;
            iArr4 = create6;
            iArr3 = create7;
        } else {
            X448Field.add(pointProjective.f19303y, pointProjective.f19302x, create8);
            iArr = create2;
            iArr2 = create5;
            iArr3 = create6;
            iArr4 = create7;
        }
        X448Field.mul(pointProjective.f19304z, pointProjective2.f19304z, create);
        X448Field.sqr(create, create2);
        X448Field.mul(pointProjective.f19302x, pointProjective2.f19302x, create3);
        X448Field.mul(pointProjective.f19303y, pointProjective2.f19303y, create4);
        X448Field.mul(create3, create4, create5);
        X448Field.mul(create5, 39081, create5);
        X448Field.add(create2, create5, iArr3);
        X448Field.sub(create2, create5, iArr4);
        X448Field.add(pointProjective2.f19303y, pointProjective2.f19302x, create5);
        X448Field.mul(create8, create5, create8);
        X448Field.add(create4, create3, iArr);
        X448Field.sub(create4, create3, iArr2);
        X448Field.carry(iArr);
        X448Field.sub(create8, create2, create8);
        X448Field.mul(create8, create, create8);
        X448Field.mul(create5, create, create5);
        X448Field.mul(create6, create8, pointProjective2.f19302x);
        X448Field.mul(create5, create7, pointProjective2.f19303y);
        X448Field.mul(create6, create7, pointProjective2.f19304z);
    }

    private static void pointLookup(int[] iArr, int i3, int[] iArr2, PointProjective pointProjective) {
        int window4 = getWindow4(iArr, i3);
        int i10 = (window4 >>> 3) ^ 1;
        int i11 = (window4 ^ (-i10)) & 7;
        int i12 = 0;
        for (int i13 = 0; i13 < 8; i13++) {
            int i14 = ((i13 ^ i11) - 1) >> 31;
            X448Field.cmov(i14, iArr2, i12, pointProjective.f19302x, 0);
            X448Field.cmov(i14, iArr2, i12 + 16, pointProjective.f19303y, 0);
            X448Field.cmov(i14, iArr2, i12 + 32, pointProjective.f19304z, 0);
            i12 += 48;
        }
        X448Field.cnegate(i10, pointProjective.f19302x);
    }

    public static void sign(byte[] bArr, int i3, byte[] bArr2, byte[] bArr3, int i10, int i11, byte[] bArr4, int i12) {
        implSign(bArr, i3, bArr2, (byte) 0, bArr3, i10, i11, bArr4, i12);
    }

    public static void signPrehash(byte[] bArr, int i3, byte[] bArr2, int i10, byte[] bArr3, byte[] bArr4, int i11, byte[] bArr5, int i12) {
        implSign(bArr, i3, bArr2, i10, bArr3, (byte) 1, bArr4, i11, 64, bArr5, i12);
    }

    public static boolean verifyPrehash(byte[] bArr, int i3, byte[] bArr2, int i10, byte[] bArr3, byte[] bArr4, int i11) {
        return implVerify(bArr, i3, bArr2, i10, bArr3, (byte) 1, bArr4, i11, 64);
    }

    private static void implSign(byte[] bArr, int i3, byte[] bArr2, int i10, byte[] bArr3, byte b2, byte[] bArr4, int i11, int i12, byte[] bArr5, int i13) {
        if (!checkContextVar(bArr3)) {
            throw new IllegalArgumentException(StubApp.getString2(3493));
        }
        Xof createXof = createXof();
        byte[] bArr6 = new byte[114];
        createXof.update(bArr, i3, 57);
        createXof.doFinal(bArr6, 0, 114);
        byte[] bArr7 = new byte[57];
        pruneScalar(bArr6, 0, bArr7);
        implSign(createXof, bArr6, bArr7, bArr2, i10, bArr3, b2, bArr4, i11, i12, bArr5, i13);
    }

    public static void signPrehash(byte[] bArr, int i3, byte[] bArr2, Xof xof, byte[] bArr3, int i10) {
        byte[] bArr4 = new byte[64];
        if (64 != xof.doFinal(bArr4, 0, 64)) {
            throw new IllegalArgumentException(StubApp.getString2(32994));
        }
        implSign(bArr, i3, bArr2, (byte) 1, bArr4, 0, 64, bArr3, i10);
    }

    public static void signPrehash(byte[] bArr, int i3, byte[] bArr2, byte[] bArr3, int i10, byte[] bArr4, int i11) {
        implSign(bArr, i3, bArr2, (byte) 1, bArr3, i10, 64, bArr4, i11);
    }
}
