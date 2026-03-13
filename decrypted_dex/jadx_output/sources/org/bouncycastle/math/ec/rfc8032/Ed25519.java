package org.bouncycastle.math.ec.rfc8032;

import com.stub.StubApp;
import java.security.SecureRandom;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.math.ec.rfc7748.X25519;
import org.bouncycastle.math.ec.rfc7748.X25519Field;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class Ed25519 {
    private static final int COORD_INTS = 8;

    /* renamed from: L0, reason: collision with root package name */
    private static final int f19278L0 = -50998291;

    /* renamed from: L1, reason: collision with root package name */
    private static final int f19279L1 = 19280294;

    /* renamed from: L2, reason: collision with root package name */
    private static final int f19280L2 = 127719000;

    /* renamed from: L3, reason: collision with root package name */
    private static final int f19281L3 = -6428113;

    /* renamed from: L4, reason: collision with root package name */
    private static final int f19282L4 = 5343;
    private static final long M08L = 255;
    private static final long M28L = 268435455;
    private static final long M32L = 4294967295L;
    private static final int POINT_BYTES = 32;
    private static final int PRECOMP_BLOCKS = 8;
    private static final int PRECOMP_MASK = 7;
    private static final int PRECOMP_POINTS = 8;
    private static final int PRECOMP_SPACING = 8;
    private static final int PRECOMP_TEETH = 4;
    public static final int PREHASH_SIZE = 64;
    public static final int PUBLIC_KEY_SIZE = 32;
    private static final int SCALAR_BYTES = 32;
    private static final int SCALAR_INTS = 8;
    public static final int SECRET_KEY_SIZE = 32;
    public static final int SIGNATURE_SIZE = 64;
    private static final int WNAF_WIDTH = 5;
    private static final int WNAF_WIDTH_BASE = 7;
    private static final byte[] DOM2_PREFIX = {83, 105, 103, 69, 100, 50, 53, 53, 49, 57, 32, 110, 111, 32, 69, 100, 50, 53, 53, 49, 57, 32, 99, 111, 108, 108, 105, 115, 105, 111, 110, 115};

    /* renamed from: P, reason: collision with root package name */
    private static final int[] f19283P = {-19, -1, -1, -1, -1, -1, -1, IntCompanionObject.MAX_VALUE};

    /* renamed from: L, reason: collision with root package name */
    private static final int[] f19277L = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, 268435456};
    private static final int[] B_x = {52811034, 25909283, 8072341, 50637101, 13785486, 30858332, 20483199, 20966410, 43936626, 4379245};
    private static final int[] B_y = {40265304, 26843545, 6710886, 53687091, 13421772, 40265318, 26843545, 6710886, 53687091, 13421772};
    private static final int[] C_d = {56195235, 47411844, 25868126, 40503822, 57364, 58321048, 30416477, 31930572, 57760639, 10749657};
    private static final int[] C_d2 = {45281625, 27714825, 18181821, 13898781, 114729, 49533232, 60832955, 30306712, 48412415, 4722099};
    private static final int[] C_d4 = {23454386, 55429651, 2809210, 27797563, 229458, 31957600, 54557047, 27058993, 29715967, 9444199};
    private static final Object PRECOMP_LOCK = new Object();
    private static PointPrecomp[] PRECOMP_BASE_WNAF = null;
    private static int[] PRECOMP_BASE_COMB = null;

    /* renamed from: org.bouncycastle.math.ec.rfc8032.Ed25519$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Algorithm {
        public static final int Ed25519 = 0;
        public static final int Ed25519ctx = 1;
        public static final int Ed25519ph = 2;
    }

    public static class F extends X25519Field {
        private F() {
        }
    }

    public static class PointAccum {

        /* renamed from: u, reason: collision with root package name */
        int[] f19284u;

        /* renamed from: v, reason: collision with root package name */
        int[] f19285v;

        /* renamed from: x, reason: collision with root package name */
        int[] f19286x;

        /* renamed from: y, reason: collision with root package name */
        int[] f19287y;

        /* renamed from: z, reason: collision with root package name */
        int[] f19288z;

        private PointAccum() {
            this.f19286x = X25519Field.create();
            this.f19287y = X25519Field.create();
            this.f19288z = X25519Field.create();
            this.f19284u = X25519Field.create();
            this.f19285v = X25519Field.create();
        }

        public /* synthetic */ PointAccum(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class PointAffine {

        /* renamed from: x, reason: collision with root package name */
        int[] f19289x;

        /* renamed from: y, reason: collision with root package name */
        int[] f19290y;

        private PointAffine() {
            this.f19289x = X25519Field.create();
            this.f19290y = X25519Field.create();
        }

        public /* synthetic */ PointAffine(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class PointExtended {

        /* renamed from: t, reason: collision with root package name */
        int[] f19291t;

        /* renamed from: x, reason: collision with root package name */
        int[] f19292x;

        /* renamed from: y, reason: collision with root package name */
        int[] f19293y;

        /* renamed from: z, reason: collision with root package name */
        int[] f19294z;

        private PointExtended() {
            this.f19292x = X25519Field.create();
            this.f19293y = X25519Field.create();
            this.f19294z = X25519Field.create();
            this.f19291t = X25519Field.create();
        }

        public /* synthetic */ PointExtended(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class PointPrecomp {
        int[] xyd;
        int[] ymx_h;
        int[] ypx_h;

        private PointPrecomp() {
            this.ymx_h = X25519Field.create();
            this.ypx_h = X25519Field.create();
            this.xyd = X25519Field.create();
        }

        public /* synthetic */ PointPrecomp(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class PointPrecompZ {
        int[] xyd;
        int[] ymx_h;
        int[] ypx_h;

        /* renamed from: z, reason: collision with root package name */
        int[] f19295z;

        private PointPrecompZ() {
            this.ymx_h = X25519Field.create();
            this.ypx_h = X25519Field.create();
            this.xyd = X25519Field.create();
            this.f19295z = X25519Field.create();
        }

        public /* synthetic */ PointPrecompZ(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class PointTemp {

        /* renamed from: r0, reason: collision with root package name */
        int[] f19296r0;

        /* renamed from: r1, reason: collision with root package name */
        int[] f19297r1;

        private PointTemp() {
            this.f19296r0 = X25519Field.create();
            this.f19297r1 = X25519Field.create();
        }

        public /* synthetic */ PointTemp(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    private static byte[] calculateS(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int[] iArr = new int[16];
        decodeScalar(bArr, 0, iArr);
        int[] iArr2 = new int[8];
        decodeScalar(bArr2, 0, iArr2);
        int[] iArr3 = new int[8];
        decodeScalar(bArr3, 0, iArr3);
        Nat256.mulAddTo(iArr2, iArr3, iArr);
        byte[] bArr4 = new byte[64];
        for (int i3 = 0; i3 < 16; i3++) {
            encode32(iArr[i3], bArr4, i3 * 4);
        }
        return reduceScalar(bArr4);
    }

    private static boolean checkContextVar(byte[] bArr, byte b2) {
        if (bArr == null && b2 == 0) {
            return true;
        }
        return bArr != null && bArr.length < 256;
    }

    private static int checkPoint(int[] iArr, int[] iArr2) {
        int[] create = X25519Field.create();
        int[] create2 = X25519Field.create();
        int[] create3 = X25519Field.create();
        X25519Field.sqr(iArr, create2);
        X25519Field.sqr(iArr2, create3);
        X25519Field.mul(create2, create3, create);
        X25519Field.sub(create3, create2, create3);
        X25519Field.mul(create, C_d, create);
        X25519Field.addOne(create);
        X25519Field.sub(create, create3, create);
        X25519Field.normalize(create);
        return X25519Field.isZero(create);
    }

    private static boolean checkPointVar(byte[] bArr) {
        int[] iArr = new int[8];
        decode32(bArr, 0, iArr, 0, 8);
        iArr[7] = iArr[7] & IntCompanionObject.MAX_VALUE;
        return !Nat256.gte(iArr, f19283P);
    }

    private static boolean checkScalarVar(byte[] bArr, int[] iArr) {
        decodeScalar(bArr, 0, iArr);
        return !Nat256.gte(iArr, f19277L);
    }

    private static byte[] copy(byte[] bArr, int i3, int i10) {
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i3, bArr2, 0, i10);
        return bArr2;
    }

    private static Digest createDigest() {
        return new SHA512Digest();
    }

    public static Digest createPrehash() {
        return createDigest();
    }

    private static int decode24(byte[] bArr, int i3) {
        return ((bArr[i3 + 2] & UByte.MAX_VALUE) << 16) | (bArr[i3] & UByte.MAX_VALUE) | ((bArr[i3 + 1] & UByte.MAX_VALUE) << 8);
    }

    private static int decode32(byte[] bArr, int i3) {
        return (bArr[i3 + 3] << 24) | (bArr[i3] & UByte.MAX_VALUE) | ((bArr[i3 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i3 + 2] & UByte.MAX_VALUE) << 16);
    }

    private static boolean decodePointVar(byte[] bArr, int i3, boolean z2, PointAffine pointAffine) {
        byte[] copy = copy(bArr, i3, 32);
        if (!checkPointVar(copy)) {
            return false;
        }
        byte b2 = copy[31];
        int i10 = (b2 & ByteCompanionObject.MIN_VALUE) >>> 7;
        copy[31] = (byte) (b2 & ByteCompanionObject.MAX_VALUE);
        X25519Field.decode(copy, 0, pointAffine.f19290y);
        int[] create = X25519Field.create();
        int[] create2 = X25519Field.create();
        X25519Field.sqr(pointAffine.f19290y, create);
        X25519Field.mul(C_d, create, create2);
        X25519Field.subOne(create);
        X25519Field.addOne(create2);
        if (!X25519Field.sqrtRatioVar(create, create2, pointAffine.f19289x)) {
            return false;
        }
        X25519Field.normalize(pointAffine.f19289x);
        if (i10 == 1 && X25519Field.isZeroVar(pointAffine.f19289x)) {
            return false;
        }
        int[] iArr = pointAffine.f19289x;
        if (z2 ^ (i10 != (iArr[0] & 1))) {
            X25519Field.negate(iArr, iArr);
        }
        return true;
    }

    private static void decodeScalar(byte[] bArr, int i3, int[] iArr) {
        decode32(bArr, i3, iArr, 0, 8);
    }

    private static void dom2(Digest digest, byte b2, byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = DOM2_PREFIX;
            int length = bArr2.length;
            int i3 = length + 2;
            int length2 = bArr.length + i3;
            byte[] bArr3 = new byte[length2];
            System.arraycopy(bArr2, 0, bArr3, 0, length);
            bArr3[length] = b2;
            bArr3[length + 1] = (byte) bArr.length;
            System.arraycopy(bArr, 0, bArr3, i3, bArr.length);
            digest.update(bArr3, 0, length2);
        }
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

    private static int encodePoint(PointAccum pointAccum, byte[] bArr, int i3) {
        int[] create = X25519Field.create();
        int[] create2 = X25519Field.create();
        X25519Field.inv(pointAccum.f19288z, create2);
        X25519Field.mul(pointAccum.f19286x, create2, create);
        X25519Field.mul(pointAccum.f19287y, create2, create2);
        X25519Field.normalize(create);
        X25519Field.normalize(create2);
        int checkPoint = checkPoint(create, create2);
        X25519Field.encode(create2, bArr, i3);
        int i10 = i3 + 31;
        bArr[i10] = (byte) (((create[0] & 1) << 7) | bArr[i10]);
        return checkPoint;
    }

    public static void generatePrivateKey(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
    }

    public static void generatePublicKey(byte[] bArr, int i3, byte[] bArr2, int i10) {
        Digest createDigest = createDigest();
        byte[] bArr3 = new byte[createDigest.getDigestSize()];
        createDigest.update(bArr, i3, 32);
        createDigest.doFinal(bArr3, 0);
        byte[] bArr4 = new byte[32];
        pruneScalar(bArr3, 0, bArr4);
        scalarMultBaseEncoded(bArr4, bArr2, i10);
    }

    private static int getWindow4(int[] iArr, int i3) {
        return (iArr[i3 >>> 3] >>> ((i3 & 7) << 2)) & 15;
    }

    private static byte[] getWnafVar(int[] iArr, int i3) {
        int[] iArr2 = new int[16];
        int i10 = 0;
        int i11 = 8;
        int i12 = 16;
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
        byte[] bArr = new byte[253];
        int i15 = 32 - i3;
        int i16 = 0;
        int i17 = 0;
        while (i10 < 16) {
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

    private static void implSign(Digest digest, byte[] bArr, byte[] bArr2, byte[] bArr3, int i3, byte[] bArr4, byte b2, byte[] bArr5, int i10, int i11, byte[] bArr6, int i12) {
        dom2(digest, b2, bArr4);
        digest.update(bArr, 32, 32);
        digest.update(bArr5, i10, i11);
        digest.doFinal(bArr, 0);
        byte[] reduceScalar = reduceScalar(bArr);
        byte[] bArr7 = new byte[32];
        scalarMultBaseEncoded(reduceScalar, bArr7, 0);
        dom2(digest, b2, bArr4);
        digest.update(bArr7, 0, 32);
        digest.update(bArr3, i3, 32);
        digest.update(bArr5, i10, i11);
        digest.doFinal(bArr, 0);
        byte[] calculateS = calculateS(reduceScalar, reduceScalar(bArr), bArr2);
        System.arraycopy(bArr7, 0, bArr6, i12, 32);
        System.arraycopy(calculateS, 0, bArr6, i12 + 32, 32);
    }

    private static boolean implVerify(byte[] bArr, int i3, byte[] bArr2, int i10, byte[] bArr3, byte b2, byte[] bArr4, int i11, int i12) {
        if (!checkContextVar(bArr3, b2)) {
            throw new IllegalArgumentException(StubApp.getString2(3493));
        }
        byte[] copy = copy(bArr, i3, 32);
        byte[] copy2 = copy(bArr, i3 + 32, 32);
        if (!checkPointVar(copy)) {
            return false;
        }
        int[] iArr = new int[8];
        if (!checkScalarVar(copy2, iArr)) {
            return false;
        }
        AnonymousClass1 anonymousClass1 = null;
        PointAffine pointAffine = new PointAffine(anonymousClass1);
        if (!decodePointVar(bArr2, i10, true, pointAffine)) {
            return false;
        }
        Digest createDigest = createDigest();
        byte[] bArr5 = new byte[createDigest.getDigestSize()];
        dom2(createDigest, b2, bArr3);
        createDigest.update(copy, 0, 32);
        createDigest.update(bArr2, i10, 32);
        createDigest.update(bArr4, i11, i12);
        createDigest.doFinal(bArr5, 0);
        int[] iArr2 = new int[8];
        decodeScalar(reduceScalar(bArr5), 0, iArr2);
        PointAccum pointAccum = new PointAccum(anonymousClass1);
        scalarMultStrausVar(iArr, iArr2, pointAffine, pointAccum);
        byte[] bArr6 = new byte[32];
        return encodePoint(pointAccum, bArr6, 0) != 0 && Arrays.areEqual(bArr6, copy);
    }

    private static void invertDoubleZs(PointExtended[] pointExtendedArr) {
        int length = pointExtendedArr.length;
        int[] createTable = X25519Field.createTable(length);
        int[] create = X25519Field.create();
        X25519Field.copy(pointExtendedArr[0].f19294z, 0, create, 0);
        X25519Field.copy(create, 0, createTable, 0);
        int i3 = 0;
        while (true) {
            int i10 = i3 + 1;
            if (i10 >= length) {
                break;
            }
            X25519Field.mul(create, pointExtendedArr[i10].f19294z, create);
            X25519Field.copy(create, 0, createTable, i10 * 10);
            i3 = i10;
        }
        X25519Field.add(create, create, create);
        X25519Field.invVar(create, create);
        int[] create2 = X25519Field.create();
        while (i3 > 0) {
            int i11 = i3 - 1;
            X25519Field.copy(createTable, i11 * 10, create2, 0);
            X25519Field.mul(create2, create, create2);
            X25519Field.mul(create, pointExtendedArr[i3].f19294z, create);
            X25519Field.copy(create2, 0, pointExtendedArr[i3].f19294z, 0);
            i3 = i11;
        }
        X25519Field.copy(create, 0, pointExtendedArr[0].f19294z, 0);
    }

    private static boolean isNeutralElementVar(int[] iArr, int[] iArr2) {
        return X25519Field.isZeroVar(iArr) && X25519Field.isOneVar(iArr2);
    }

    private static void pointAdd(PointExtended pointExtended, PointExtended pointExtended2, PointExtended pointExtended3, PointTemp pointTemp) {
        int[] iArr = pointExtended3.f19292x;
        int[] iArr2 = pointExtended3.f19293y;
        int[] iArr3 = pointTemp.f19296r0;
        int[] iArr4 = pointTemp.f19297r1;
        X25519Field.apm(pointExtended.f19293y, pointExtended.f19292x, iArr2, iArr);
        X25519Field.apm(pointExtended2.f19293y, pointExtended2.f19292x, iArr4, iArr3);
        X25519Field.mul(iArr, iArr3, iArr);
        X25519Field.mul(iArr2, iArr4, iArr2);
        X25519Field.mul(pointExtended.f19291t, pointExtended2.f19291t, iArr3);
        X25519Field.mul(iArr3, C_d2, iArr3);
        int[] iArr5 = pointExtended.f19294z;
        X25519Field.add(iArr5, iArr5, iArr4);
        X25519Field.mul(iArr4, pointExtended2.f19294z, iArr4);
        X25519Field.apm(iArr2, iArr, iArr2, iArr);
        X25519Field.apm(iArr4, iArr3, iArr4, iArr3);
        X25519Field.mul(iArr, iArr2, pointExtended3.f19291t);
        X25519Field.mul(iArr3, iArr4, pointExtended3.f19294z);
        X25519Field.mul(iArr, iArr3, pointExtended3.f19292x);
        X25519Field.mul(iArr2, iArr4, pointExtended3.f19293y);
    }

    private static void pointAddVar(boolean z2, PointPrecomp pointPrecomp, PointAccum pointAccum, PointTemp pointTemp) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3 = pointAccum.f19286x;
        int[] iArr4 = pointAccum.f19287y;
        int[] iArr5 = pointTemp.f19296r0;
        int[] iArr6 = pointAccum.f19284u;
        int[] iArr7 = pointAccum.f19285v;
        if (z2) {
            iArr2 = iArr3;
            iArr = iArr4;
        } else {
            iArr = iArr3;
            iArr2 = iArr4;
        }
        X25519Field.apm(iArr4, iArr3, iArr4, iArr3);
        X25519Field.mul(iArr, pointPrecomp.ymx_h, iArr);
        X25519Field.mul(iArr2, pointPrecomp.ypx_h, iArr2);
        X25519Field.mul(pointAccum.f19284u, pointAccum.f19285v, iArr5);
        X25519Field.mul(iArr5, pointPrecomp.xyd, iArr5);
        X25519Field.apm(iArr4, iArr3, iArr7, iArr6);
        X25519Field.apm(pointAccum.f19288z, iArr5, iArr2, iArr);
        X25519Field.mul(iArr3, iArr4, pointAccum.f19288z);
        X25519Field.mul(iArr3, iArr6, pointAccum.f19286x);
        X25519Field.mul(iArr4, iArr7, pointAccum.f19287y);
    }

    private static void pointCopy(PointAccum pointAccum, PointExtended pointExtended) {
        X25519Field.copy(pointAccum.f19286x, 0, pointExtended.f19292x, 0);
        X25519Field.copy(pointAccum.f19287y, 0, pointExtended.f19293y, 0);
        X25519Field.copy(pointAccum.f19288z, 0, pointExtended.f19294z, 0);
        X25519Field.mul(pointAccum.f19284u, pointAccum.f19285v, pointExtended.f19291t);
    }

    private static void pointDouble(PointAccum pointAccum) {
        int[] iArr = pointAccum.f19286x;
        int[] iArr2 = pointAccum.f19287y;
        int[] iArr3 = pointAccum.f19288z;
        int[] iArr4 = pointAccum.f19284u;
        int[] iArr5 = pointAccum.f19285v;
        X25519Field.add(iArr, iArr2, iArr4);
        X25519Field.sqr(pointAccum.f19286x, iArr);
        X25519Field.sqr(pointAccum.f19287y, iArr2);
        X25519Field.sqr(pointAccum.f19288z, iArr3);
        X25519Field.add(iArr3, iArr3, iArr3);
        X25519Field.apm(iArr, iArr2, iArr5, iArr2);
        X25519Field.sqr(iArr4, iArr4);
        X25519Field.sub(iArr5, iArr4, iArr4);
        X25519Field.add(iArr3, iArr2, iArr);
        X25519Field.carry(iArr);
        X25519Field.mul(iArr, iArr2, pointAccum.f19288z);
        X25519Field.mul(iArr, iArr4, pointAccum.f19286x);
        X25519Field.mul(iArr2, iArr5, pointAccum.f19287y);
    }

    private static void pointLookup(int i3, int i10, PointPrecomp pointPrecomp) {
        int i11 = i3 * 240;
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = ((i12 ^ i10) - 1) >> 31;
            X25519Field.cmov(i13, PRECOMP_BASE_COMB, i11, pointPrecomp.ymx_h, 0);
            X25519Field.cmov(i13, PRECOMP_BASE_COMB, i11 + 10, pointPrecomp.ypx_h, 0);
            X25519Field.cmov(i13, PRECOMP_BASE_COMB, i11 + 20, pointPrecomp.xyd, 0);
            i11 += 30;
        }
    }

    private static void pointLookupZ(int[] iArr, int i3, int[] iArr2, PointPrecompZ pointPrecompZ) {
        int window4 = getWindow4(iArr, i3);
        int i10 = (window4 >>> 3) ^ 1;
        int i11 = (window4 ^ (-i10)) & 7;
        int i12 = 0;
        for (int i13 = 0; i13 < 8; i13++) {
            int i14 = ((i13 ^ i11) - 1) >> 31;
            X25519Field.cmov(i14, iArr2, i12, pointPrecompZ.ymx_h, 0);
            X25519Field.cmov(i14, iArr2, i12 + 10, pointPrecompZ.ypx_h, 0);
            X25519Field.cmov(i14, iArr2, i12 + 20, pointPrecompZ.xyd, 0);
            X25519Field.cmov(i14, iArr2, i12 + 30, pointPrecompZ.f19295z, 0);
            i12 += 40;
        }
        X25519Field.cswap(i10, pointPrecompZ.ymx_h, pointPrecompZ.ypx_h);
        X25519Field.cnegate(i10, pointPrecompZ.xyd);
    }

    private static void pointPrecompute(PointAffine pointAffine, PointExtended[] pointExtendedArr, int i3, PointTemp pointTemp) {
        AnonymousClass1 anonymousClass1 = null;
        PointExtended pointExtended = new PointExtended(anonymousClass1);
        pointExtendedArr[0] = pointExtended;
        pointCopy(pointAffine, pointExtended);
        PointExtended pointExtended2 = new PointExtended(anonymousClass1);
        PointExtended pointExtended3 = pointExtendedArr[0];
        pointAdd(pointExtended3, pointExtended3, pointExtended2, pointTemp);
        for (int i10 = 1; i10 < i3; i10++) {
            PointExtended pointExtended4 = pointExtendedArr[i10 - 1];
            PointExtended pointExtended5 = new PointExtended(anonymousClass1);
            pointExtendedArr[i10] = pointExtended5;
            pointAdd(pointExtended4, pointExtended2, pointExtended5, pointTemp);
        }
    }

    private static void pointPrecomputeZ(PointAffine pointAffine, PointPrecompZ[] pointPrecompZArr, int i3, PointTemp pointTemp) {
        AnonymousClass1 anonymousClass1 = null;
        PointExtended pointExtended = new PointExtended(anonymousClass1);
        pointCopy(pointAffine, pointExtended);
        PointExtended pointExtended2 = new PointExtended(anonymousClass1);
        pointAdd(pointExtended, pointExtended, pointExtended2, pointTemp);
        int i10 = 0;
        while (true) {
            PointPrecompZ pointPrecompZ = new PointPrecompZ(anonymousClass1);
            pointPrecompZArr[i10] = pointPrecompZ;
            pointCopy(pointExtended, pointPrecompZ);
            i10++;
            if (i10 == i3) {
                return;
            } else {
                pointAdd(pointExtended, pointExtended2, pointExtended, pointTemp);
            }
        }
    }

    private static void pointSetNeutral(PointAccum pointAccum) {
        X25519Field.zero(pointAccum.f19286x);
        X25519Field.one(pointAccum.f19287y);
        X25519Field.one(pointAccum.f19288z);
        X25519Field.zero(pointAccum.f19284u);
        X25519Field.one(pointAccum.f19285v);
    }

    public static void precompute() {
        synchronized (PRECOMP_LOCK) {
            try {
                if (PRECOMP_BASE_WNAF == null || PRECOMP_BASE_COMB == null) {
                    PointExtended[] pointExtendedArr = new PointExtended[96];
                    AnonymousClass1 anonymousClass1 = null;
                    PointTemp pointTemp = new PointTemp(anonymousClass1);
                    PointAffine pointAffine = new PointAffine(anonymousClass1);
                    int[] iArr = B_x;
                    int i3 = 0;
                    X25519Field.copy(iArr, 0, pointAffine.f19289x, 0);
                    int[] iArr2 = B_y;
                    X25519Field.copy(iArr2, 0, pointAffine.f19290y, 0);
                    pointPrecompute(pointAffine, pointExtendedArr, 32, pointTemp);
                    PointAccum pointAccum = new PointAccum(anonymousClass1);
                    X25519Field.copy(iArr, 0, pointAccum.f19286x, 0);
                    X25519Field.copy(iArr2, 0, pointAccum.f19287y, 0);
                    X25519Field.one(pointAccum.f19288z);
                    X25519Field.copy(pointAccum.f19286x, 0, pointAccum.f19284u, 0);
                    X25519Field.copy(pointAccum.f19287y, 0, pointAccum.f19285v, 0);
                    int i10 = 4;
                    PointExtended[] pointExtendedArr2 = new PointExtended[4];
                    for (int i11 = 0; i11 < 4; i11++) {
                        pointExtendedArr2[i11] = new PointExtended(anonymousClass1);
                    }
                    PointExtended pointExtended = new PointExtended(anonymousClass1);
                    int i12 = 0;
                    int i13 = 32;
                    while (i12 < 8) {
                        int i14 = i13 + 1;
                        PointExtended pointExtended2 = new PointExtended(anonymousClass1);
                        pointExtendedArr[i13] = pointExtended2;
                        int i15 = i3;
                        while (i15 < i10) {
                            if (i15 == 0) {
                                pointCopy(pointAccum, pointExtended2);
                            } else {
                                pointCopy(pointAccum, pointExtended);
                                pointAdd(pointExtended2, pointExtended, pointExtended2, pointTemp);
                            }
                            pointDouble(pointAccum);
                            pointCopy(pointAccum, pointExtendedArr2[i15]);
                            if (i12 + i15 != 10) {
                                for (int i16 = 1; i16 < 8; i16++) {
                                    pointDouble(pointAccum);
                                }
                            }
                            i15++;
                            i10 = 4;
                        }
                        int[] iArr3 = pointExtended2.f19292x;
                        X25519Field.negate(iArr3, iArr3);
                        int[] iArr4 = pointExtended2.f19291t;
                        X25519Field.negate(iArr4, iArr4);
                        i13 = i14;
                        for (int i17 = 0; i17 < 3; i17++) {
                            int i18 = 1 << i17;
                            int i19 = 0;
                            while (i19 < i18) {
                                PointExtended pointExtended3 = new PointExtended(anonymousClass1);
                                pointExtendedArr[i13] = pointExtended3;
                                pointAdd(pointExtendedArr[i13 - i18], pointExtendedArr2[i17], pointExtended3, pointTemp);
                                i19++;
                                i13++;
                            }
                        }
                        i12++;
                        i10 = 4;
                        i3 = 0;
                    }
                    invertDoubleZs(pointExtendedArr);
                    PRECOMP_BASE_WNAF = new PointPrecomp[32];
                    for (int i20 = 0; i20 < 32; i20++) {
                        PointExtended pointExtended4 = pointExtendedArr[i20];
                        PointPrecomp[] pointPrecompArr = PRECOMP_BASE_WNAF;
                        PointPrecomp pointPrecomp = new PointPrecomp(anonymousClass1);
                        pointPrecompArr[i20] = pointPrecomp;
                        int[] iArr5 = pointExtended4.f19292x;
                        X25519Field.mul(iArr5, pointExtended4.f19294z, iArr5);
                        int[] iArr6 = pointExtended4.f19293y;
                        X25519Field.mul(iArr6, pointExtended4.f19294z, iArr6);
                        X25519Field.apm(pointExtended4.f19293y, pointExtended4.f19292x, pointPrecomp.ypx_h, pointPrecomp.ymx_h);
                        X25519Field.mul(pointExtended4.f19292x, pointExtended4.f19293y, pointPrecomp.xyd);
                        int[] iArr7 = pointPrecomp.xyd;
                        X25519Field.mul(iArr7, C_d4, iArr7);
                        X25519Field.normalize(pointPrecomp.ymx_h);
                        X25519Field.normalize(pointPrecomp.ypx_h);
                        X25519Field.normalize(pointPrecomp.xyd);
                    }
                    PRECOMP_BASE_COMB = X25519Field.createTable(192);
                    PointPrecomp pointPrecomp2 = new PointPrecomp(anonymousClass1);
                    int i21 = 0;
                    for (int i22 = 32; i22 < 96; i22++) {
                        PointExtended pointExtended5 = pointExtendedArr[i22];
                        int[] iArr8 = pointExtended5.f19292x;
                        X25519Field.mul(iArr8, pointExtended5.f19294z, iArr8);
                        int[] iArr9 = pointExtended5.f19293y;
                        X25519Field.mul(iArr9, pointExtended5.f19294z, iArr9);
                        X25519Field.apm(pointExtended5.f19293y, pointExtended5.f19292x, pointPrecomp2.ypx_h, pointPrecomp2.ymx_h);
                        X25519Field.mul(pointExtended5.f19292x, pointExtended5.f19293y, pointPrecomp2.xyd);
                        int[] iArr10 = pointPrecomp2.xyd;
                        X25519Field.mul(iArr10, C_d4, iArr10);
                        X25519Field.normalize(pointPrecomp2.ymx_h);
                        X25519Field.normalize(pointPrecomp2.ypx_h);
                        X25519Field.normalize(pointPrecomp2.xyd);
                        X25519Field.copy(pointPrecomp2.ymx_h, 0, PRECOMP_BASE_COMB, i21);
                        X25519Field.copy(pointPrecomp2.ypx_h, 0, PRECOMP_BASE_COMB, i21 + 10);
                        X25519Field.copy(pointPrecomp2.xyd, 0, PRECOMP_BASE_COMB, i21 + 20);
                        i21 += 30;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void pruneScalar(byte[] bArr, int i3, byte[] bArr2) {
        System.arraycopy(bArr, i3, bArr2, 0, 32);
        bArr2[0] = (byte) (bArr2[0] & 248);
        byte b2 = (byte) (bArr2[31] & ByteCompanionObject.MAX_VALUE);
        bArr2[31] = b2;
        bArr2[31] = (byte) (b2 | 64);
    }

    private static byte[] reduceScalar(byte[] bArr) {
        long decode32 = decode32(bArr, 49);
        long j = decode32 & 4294967295L;
        long decode322 = decode32(bArr, 56);
        long j3 = bArr[63] & M08L;
        long decode24 = ((decode24(bArr, 60) << 4) & 4294967295L) + ((decode322 & 4294967295L) >> 28);
        long j10 = decode322 & M28L;
        long decode323 = ((decode32(bArr, 42) & 4294967295L) - (j3 * (-6428113))) - (decode24 * 5343);
        long decode324 = ((decode32(bArr, 28) & 4294967295L) - (decode24 * (-50998291))) - (j10 * 19280294);
        long decode242 = ((((decode24(bArr, 32) << 4) & 4294967295L) - (j3 * (-50998291))) - (decode24 * 19280294)) - (j10 * 127719000);
        long decode325 = (((decode32(bArr, 35) & 4294967295L) - (j3 * 19280294)) - (decode24 * 127719000)) - (j10 * (-6428113));
        long decode243 = ((((decode24(bArr, 39) << 4) & 4294967295L) - (j3 * 127719000)) - (decode24 * (-6428113))) - (j10 * 5343);
        long decode244 = ((decode24(bArr, 53) << 4) & 4294967295L) + (j >> 28);
        long j11 = decode32 & M28L;
        long j12 = decode325 - (decode244 * 5343);
        long j13 = (decode242 - (decode244 * (-6428113))) - (j11 * 5343);
        long decode245 = (((decode24(bArr, 46) << 4) & 4294967295L) - (j3 * 5343)) + (decode323 >> 28);
        long decode326 = (((decode32(bArr, 21) & 4294967295L) - (decode244 * (-50998291))) - (j11 * 19280294)) - (decode245 * 127719000);
        long decode246 = (((((decode24(bArr, 25) << 4) & 4294967295L) - (j10 * (-50998291))) - (decode244 * 19280294)) - (j11 * 127719000)) - (decode245 * (-6428113));
        long j14 = ((decode324 - (decode244 * 127719000)) - (j11 * (-6428113))) - (decode245 * 5343);
        long j15 = (decode323 & M28L) + (decode243 >> 28);
        long decode327 = ((decode32(bArr, 14) & 4294967295L) - (decode245 * (-50998291))) - (j15 * 19280294);
        long decode247 = ((((decode24(bArr, 18) << 4) & 4294967295L) - (j11 * (-50998291))) - (decode245 * 19280294)) - (j15 * 127719000);
        long j16 = decode246 - (j15 * 5343);
        long j17 = (decode243 & M28L) + (j12 >> 28);
        long decode328 = (decode32(bArr, 7) & 4294967295L) - (j17 * (-50998291));
        long decode248 = (((decode24(bArr, 11) << 4) & 4294967295L) - (j15 * (-50998291))) - (j17 * 19280294);
        long j18 = decode327 - (j17 * 127719000);
        long j19 = decode247 - (j17 * (-6428113));
        long j20 = (decode326 - (j15 * (-6428113))) - (j17 * 5343);
        long j21 = (j12 & M28L) + (j13 >> 28);
        long j22 = j13 & M28L;
        long decode249 = ((decode24(bArr, 4) << 4) & 4294967295L) - (j21 * (-50998291));
        long j23 = decode328 - (j21 * 19280294);
        long j24 = decode248 - (j21 * 127719000);
        long j25 = j18 - (j21 * (-6428113));
        long j26 = j19 - (j21 * 5343);
        long j27 = j14 + (j16 >> 28);
        long j28 = j16 & M28L;
        long j29 = j22 + (j27 >> 28);
        long j30 = j27 & M28L;
        long j31 = j30 >>> 27;
        long j32 = j29 + j31;
        long decode329 = (decode32(bArr, 0) & 4294967295L) - (j32 * (-50998291));
        long j33 = j23 - (j32 * 127719000);
        long j34 = j24 - (j32 * (-6428113));
        long j35 = j25 - (j32 * 5343);
        long j36 = (decode249 - (j32 * 19280294)) + (decode329 >> 28);
        long j37 = decode329 & M28L;
        long j38 = j33 + (j36 >> 28);
        long j39 = j36 & M28L;
        long j40 = j34 + (j38 >> 28);
        long j41 = j38 & M28L;
        long j42 = j35 + (j40 >> 28);
        long j43 = j40 & M28L;
        long j44 = j26 + (j42 >> 28);
        long j45 = j42 & M28L;
        long j46 = j20 + (j44 >> 28);
        long j47 = j44 & M28L;
        long j48 = j28 + (j46 >> 28);
        long j49 = j46 & M28L;
        long j50 = j30 + (j48 >> 28);
        long j51 = j48 & M28L;
        long j52 = j50 >> 28;
        long j53 = j50 & M28L;
        long j54 = j52 - j31;
        long j55 = j37 + (j54 & (-50998291));
        long j56 = j39 + (j54 & 19280294) + (j55 >> 28);
        long j57 = j55 & M28L;
        long j58 = j41 + (j54 & 127719000) + (j56 >> 28);
        long j59 = j56 & M28L;
        long j60 = j43 + (j54 & (-6428113)) + (j58 >> 28);
        long j61 = j58 & M28L;
        long j62 = j45 + (j54 & 5343) + (j60 >> 28);
        long j63 = j60 & M28L;
        long j64 = j47 + (j62 >> 28);
        long j65 = j62 & M28L;
        long j66 = j49 + (j64 >> 28);
        long j67 = j64 & M28L;
        long j68 = j51 + (j66 >> 28);
        long j69 = j66 & M28L;
        long j70 = j53 + (j68 >> 28);
        long j71 = j68 & M28L;
        byte[] bArr2 = new byte[32];
        encode56(j57 | (j59 << 28), bArr2, 0);
        encode56(j61 | (j63 << 28), bArr2, 7);
        encode56((j67 << 28) | j65, bArr2, 14);
        encode56((j71 << 28) | j69, bArr2, 21);
        encode32((int) j70, bArr2, 28);
        return bArr2;
    }

    private static void scalarMult(byte[] bArr, PointAffine pointAffine, PointAccum pointAccum) {
        int[] iArr = new int[8];
        decodeScalar(bArr, 0, iArr);
        Nat.cadd(8, (~iArr[0]) & 1, iArr, f19277L, iArr);
        Nat.shiftDownBit(8, iArr, 1);
        AnonymousClass1 anonymousClass1 = null;
        PointPrecompZ pointPrecompZ = new PointPrecompZ(anonymousClass1);
        PointTemp pointTemp = new PointTemp(anonymousClass1);
        int[] pointPrecomputeZ = pointPrecomputeZ(pointAffine, 8, pointTemp);
        pointSetNeutral(pointAccum);
        int i3 = 63;
        while (true) {
            pointLookupZ(iArr, i3, pointPrecomputeZ, pointPrecompZ);
            pointAdd(pointPrecompZ, pointAccum, pointTemp);
            i3--;
            if (i3 < 0) {
                return;
            }
            for (int i10 = 0; i10 < 4; i10++) {
                pointDouble(pointAccum);
            }
        }
    }

    private static void scalarMultBase(byte[] bArr, PointAccum pointAccum) {
        precompute();
        int[] iArr = new int[8];
        decodeScalar(bArr, 0, iArr);
        Nat.cadd(8, (~iArr[0]) & 1, iArr, f19277L, iArr);
        Nat.shiftDownBit(8, iArr, 1);
        for (int i3 = 0; i3 < 8; i3++) {
            iArr[i3] = Interleave.shuffle2(iArr[i3]);
        }
        AnonymousClass1 anonymousClass1 = null;
        PointPrecomp pointPrecomp = new PointPrecomp(anonymousClass1);
        PointTemp pointTemp = new PointTemp(anonymousClass1);
        pointSetNeutral(pointAccum);
        int i10 = 28;
        int i11 = 0;
        while (true) {
            int i12 = 0;
            while (i12 < 8) {
                int i13 = iArr[i12] >>> i10;
                int i14 = (i13 >>> 3) & 1;
                pointLookup(i12, (i13 ^ (-i14)) & 7, pointPrecomp);
                int i15 = i11 ^ i14;
                X25519Field.cnegate(i15, pointAccum.f19286x);
                X25519Field.cnegate(i15, pointAccum.f19284u);
                pointAdd(pointPrecomp, pointAccum, pointTemp);
                i12++;
                i11 = i14;
            }
            i10 -= 4;
            if (i10 < 0) {
                X25519Field.cnegate(i11, pointAccum.f19286x);
                X25519Field.cnegate(i11, pointAccum.f19284u);
                return;
            }
            pointDouble(pointAccum);
        }
    }

    private static void scalarMultBaseEncoded(byte[] bArr, byte[] bArr2, int i3) {
        PointAccum pointAccum = new PointAccum(null);
        scalarMultBase(bArr, pointAccum);
        if (encodePoint(pointAccum, bArr2, i3) == 0) {
            throw new IllegalStateException();
        }
    }

    public static void scalarMultBaseYZ(X25519.Friend friend, byte[] bArr, int i3, int[] iArr, int[] iArr2) {
        if (friend == null) {
            throw new NullPointerException(StubApp.getString2(32993));
        }
        byte[] bArr2 = new byte[32];
        pruneScalar(bArr, i3, bArr2);
        PointAccum pointAccum = new PointAccum(null);
        scalarMultBase(bArr2, pointAccum);
        if (checkPoint(pointAccum.f19286x, pointAccum.f19287y, pointAccum.f19288z) == 0) {
            throw new IllegalStateException();
        }
        X25519Field.copy(pointAccum.f19287y, 0, iArr, 0);
        X25519Field.copy(pointAccum.f19288z, 0, iArr2, 0);
    }

    private static void scalarMultOrderVar(PointAffine pointAffine, PointAccum pointAccum) {
        byte[] wnafVar = getWnafVar(f19277L, 5);
        PointPrecompZ[] pointPrecompZArr = new PointPrecompZ[8];
        PointTemp pointTemp = new PointTemp(null);
        pointPrecomputeZ(pointAffine, pointPrecompZArr, 8, pointTemp);
        pointSetNeutral(pointAccum);
        int i3 = 252;
        while (true) {
            byte b2 = wnafVar[i3];
            if (b2 != 0) {
                int i10 = b2 >> 31;
                pointAddVar(i10 != 0, pointPrecompZArr[(b2 ^ i10) >>> 1], pointAccum, pointTemp);
            }
            i3--;
            if (i3 < 0) {
                return;
            } else {
                pointDouble(pointAccum);
            }
        }
    }

    private static void scalarMultStrausVar(int[] iArr, int[] iArr2, PointAffine pointAffine, PointAccum pointAccum) {
        precompute();
        byte[] wnafVar = getWnafVar(iArr, 7);
        byte[] wnafVar2 = getWnafVar(iArr2, 5);
        PointPrecompZ[] pointPrecompZArr = new PointPrecompZ[8];
        PointTemp pointTemp = new PointTemp(null);
        pointPrecomputeZ(pointAffine, pointPrecompZArr, 8, pointTemp);
        pointSetNeutral(pointAccum);
        int i3 = 252;
        while (true) {
            byte b2 = wnafVar[i3];
            if (b2 != 0) {
                int i10 = b2 >> 31;
                pointAddVar(i10 != 0, PRECOMP_BASE_WNAF[(b2 ^ i10) >>> 1], pointAccum, pointTemp);
            }
            byte b10 = wnafVar2[i3];
            if (b10 != 0) {
                int i11 = b10 >> 31;
                pointAddVar(i11 != 0, pointPrecompZArr[(b10 ^ i11) >>> 1], pointAccum, pointTemp);
            }
            i3--;
            if (i3 < 0) {
                return;
            } else {
                pointDouble(pointAccum);
            }
        }
    }

    public static void sign(byte[] bArr, int i3, byte[] bArr2, int i10, int i11, byte[] bArr3, int i12) {
        implSign(bArr, i3, null, (byte) 0, bArr2, i10, i11, bArr3, i12);
    }

    public static void signPrehash(byte[] bArr, int i3, byte[] bArr2, int i10, byte[] bArr3, Digest digest, byte[] bArr4, int i11) {
        byte[] bArr5 = new byte[64];
        if (64 != digest.doFinal(bArr5, 0)) {
            throw new IllegalArgumentException(StubApp.getString2(32994));
        }
        implSign(bArr, i3, bArr2, i10, bArr3, (byte) 1, bArr5, 0, 64, bArr4, i11);
    }

    public static boolean validatePublicKeyFull(byte[] bArr, int i3) {
        AnonymousClass1 anonymousClass1 = null;
        PointAffine pointAffine = new PointAffine(anonymousClass1);
        if (!decodePointVar(bArr, i3, false, pointAffine)) {
            return false;
        }
        X25519Field.normalize(pointAffine.f19289x);
        X25519Field.normalize(pointAffine.f19290y);
        if (isNeutralElementVar(pointAffine.f19289x, pointAffine.f19290y)) {
            return false;
        }
        PointAccum pointAccum = new PointAccum(anonymousClass1);
        scalarMultOrderVar(pointAffine, pointAccum);
        X25519Field.normalize(pointAccum.f19286x);
        X25519Field.normalize(pointAccum.f19287y);
        X25519Field.normalize(pointAccum.f19288z);
        return isNeutralElementVar(pointAccum.f19286x, pointAccum.f19287y, pointAccum.f19288z);
    }

    public static boolean validatePublicKeyPartial(byte[] bArr, int i3) {
        return decodePointVar(bArr, i3, false, new PointAffine(null));
    }

    public static boolean verify(byte[] bArr, int i3, byte[] bArr2, int i10, byte[] bArr3, int i11, int i12) {
        return implVerify(bArr, i3, bArr2, i10, null, (byte) 0, bArr3, i11, i12);
    }

    public static boolean verifyPrehash(byte[] bArr, int i3, byte[] bArr2, int i10, byte[] bArr3, Digest digest) {
        byte[] bArr4 = new byte[64];
        if (64 == digest.doFinal(bArr4, 0)) {
            return implVerify(bArr, i3, bArr2, i10, bArr3, (byte) 1, bArr4, 0, 64);
        }
        throw new IllegalArgumentException(StubApp.getString2(32994));
    }

    private static int checkPoint(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] create = X25519Field.create();
        int[] create2 = X25519Field.create();
        int[] create3 = X25519Field.create();
        int[] create4 = X25519Field.create();
        X25519Field.sqr(iArr, create2);
        X25519Field.sqr(iArr2, create3);
        X25519Field.sqr(iArr3, create4);
        X25519Field.mul(create2, create3, create);
        X25519Field.sub(create3, create2, create3);
        X25519Field.mul(create3, create4, create3);
        X25519Field.sqr(create4, create4);
        X25519Field.mul(create, C_d, create);
        X25519Field.add(create, create4, create);
        X25519Field.sub(create, create3, create);
        X25519Field.normalize(create);
        return X25519Field.isZero(create);
    }

    private static void decode32(byte[] bArr, int i3, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i10 + i12] = decode32(bArr, (i12 * 4) + i3);
        }
    }

    private static void implSign(byte[] bArr, int i3, byte[] bArr2, byte b2, byte[] bArr3, int i10, int i11, byte[] bArr4, int i12) {
        if (!checkContextVar(bArr2, b2)) {
            throw new IllegalArgumentException(StubApp.getString2(3493));
        }
        Digest createDigest = createDigest();
        byte[] bArr5 = new byte[createDigest.getDigestSize()];
        createDigest.update(bArr, i3, 32);
        createDigest.doFinal(bArr5, 0);
        byte[] bArr6 = new byte[32];
        pruneScalar(bArr5, 0, bArr6);
        byte[] bArr7 = new byte[32];
        scalarMultBaseEncoded(bArr6, bArr7, 0);
        implSign(createDigest, bArr5, bArr6, bArr7, 0, bArr2, b2, bArr3, i10, i11, bArr4, i12);
    }

    private static boolean isNeutralElementVar(int[] iArr, int[] iArr2, int[] iArr3) {
        return X25519Field.isZeroVar(iArr) && X25519Field.areEqualVar(iArr2, iArr3);
    }

    private static void pointAdd(PointPrecomp pointPrecomp, PointAccum pointAccum, PointTemp pointTemp) {
        int[] iArr = pointAccum.f19286x;
        int[] iArr2 = pointAccum.f19287y;
        int[] iArr3 = pointTemp.f19296r0;
        int[] iArr4 = pointAccum.f19284u;
        int[] iArr5 = pointAccum.f19285v;
        X25519Field.apm(iArr2, iArr, iArr2, iArr);
        X25519Field.mul(iArr, pointPrecomp.ymx_h, iArr);
        X25519Field.mul(iArr2, pointPrecomp.ypx_h, iArr2);
        X25519Field.mul(pointAccum.f19284u, pointAccum.f19285v, iArr3);
        X25519Field.mul(iArr3, pointPrecomp.xyd, iArr3);
        X25519Field.apm(iArr2, iArr, iArr5, iArr4);
        X25519Field.apm(pointAccum.f19288z, iArr3, iArr2, iArr);
        X25519Field.mul(iArr, iArr2, pointAccum.f19288z);
        X25519Field.mul(iArr, iArr4, pointAccum.f19286x);
        X25519Field.mul(iArr2, iArr5, pointAccum.f19287y);
    }

    private static void pointAddVar(boolean z2, PointPrecompZ pointPrecompZ, PointAccum pointAccum, PointTemp pointTemp) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3 = pointAccum.f19286x;
        int[] iArr4 = pointAccum.f19287y;
        int[] iArr5 = pointTemp.f19296r0;
        int[] iArr6 = pointAccum.f19288z;
        int[] iArr7 = pointAccum.f19284u;
        int[] iArr8 = pointAccum.f19285v;
        if (z2) {
            iArr2 = iArr3;
            iArr = iArr4;
        } else {
            iArr = iArr3;
            iArr2 = iArr4;
        }
        X25519Field.apm(iArr4, iArr3, iArr4, iArr3);
        X25519Field.mul(iArr, pointPrecompZ.ymx_h, iArr);
        X25519Field.mul(iArr2, pointPrecompZ.ypx_h, iArr2);
        X25519Field.mul(pointAccum.f19284u, pointAccum.f19285v, iArr5);
        X25519Field.mul(iArr5, pointPrecompZ.xyd, iArr5);
        X25519Field.mul(pointAccum.f19288z, pointPrecompZ.f19295z, iArr6);
        X25519Field.apm(iArr4, iArr3, iArr8, iArr7);
        X25519Field.apm(iArr6, iArr5, iArr2, iArr);
        X25519Field.mul(iArr3, iArr4, pointAccum.f19288z);
        X25519Field.mul(iArr3, iArr7, pointAccum.f19286x);
        X25519Field.mul(iArr4, iArr8, pointAccum.f19287y);
    }

    private static void pointCopy(PointAffine pointAffine, PointExtended pointExtended) {
        X25519Field.copy(pointAffine.f19289x, 0, pointExtended.f19292x, 0);
        X25519Field.copy(pointAffine.f19290y, 0, pointExtended.f19293y, 0);
        X25519Field.one(pointExtended.f19294z);
        X25519Field.mul(pointAffine.f19289x, pointAffine.f19290y, pointExtended.f19291t);
    }

    private static int[] pointPrecomputeZ(PointAffine pointAffine, int i3, PointTemp pointTemp) {
        AnonymousClass1 anonymousClass1 = null;
        PointExtended pointExtended = new PointExtended(anonymousClass1);
        pointCopy(pointAffine, pointExtended);
        PointExtended pointExtended2 = new PointExtended(anonymousClass1);
        pointAdd(pointExtended, pointExtended, pointExtended2, pointTemp);
        PointPrecompZ pointPrecompZ = new PointPrecompZ(anonymousClass1);
        int[] createTable = X25519Field.createTable(i3 * 4);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            pointCopy(pointExtended, pointPrecompZ);
            X25519Field.copy(pointPrecompZ.ymx_h, 0, createTable, i10);
            X25519Field.copy(pointPrecompZ.ypx_h, 0, createTable, i10 + 10);
            X25519Field.copy(pointPrecompZ.xyd, 0, createTable, i10 + 20);
            X25519Field.copy(pointPrecompZ.f19295z, 0, createTable, i10 + 30);
            i10 += 40;
            i11++;
            if (i11 == i3) {
                return createTable;
            }
            pointAdd(pointExtended, pointExtended2, pointExtended, pointTemp);
        }
    }

    public static void sign(byte[] bArr, int i3, byte[] bArr2, int i10, byte[] bArr3, int i11, int i12, byte[] bArr4, int i13) {
        implSign(bArr, i3, bArr2, i10, null, (byte) 0, bArr3, i11, i12, bArr4, i13);
    }

    public static void signPrehash(byte[] bArr, int i3, byte[] bArr2, int i10, byte[] bArr3, byte[] bArr4, int i11, byte[] bArr5, int i12) {
        implSign(bArr, i3, bArr2, i10, bArr3, (byte) 1, bArr4, i11, 64, bArr5, i12);
    }

    public static boolean verify(byte[] bArr, int i3, byte[] bArr2, int i10, byte[] bArr3, byte[] bArr4, int i11, int i12) {
        return implVerify(bArr, i3, bArr2, i10, bArr3, (byte) 0, bArr4, i11, i12);
    }

    public static boolean verifyPrehash(byte[] bArr, int i3, byte[] bArr2, int i10, byte[] bArr3, byte[] bArr4, int i11) {
        return implVerify(bArr, i3, bArr2, i10, bArr3, (byte) 1, bArr4, i11, 64);
    }

    private static void implSign(byte[] bArr, int i3, byte[] bArr2, int i10, byte[] bArr3, byte b2, byte[] bArr4, int i11, int i12, byte[] bArr5, int i13) {
        if (!checkContextVar(bArr3, b2)) {
            throw new IllegalArgumentException(StubApp.getString2(3493));
        }
        Digest createDigest = createDigest();
        byte[] bArr6 = new byte[createDigest.getDigestSize()];
        createDigest.update(bArr, i3, 32);
        createDigest.doFinal(bArr6, 0);
        byte[] bArr7 = new byte[32];
        pruneScalar(bArr6, 0, bArr7);
        implSign(createDigest, bArr6, bArr7, bArr2, i10, bArr3, b2, bArr4, i11, i12, bArr5, i13);
    }

    private static void pointAdd(PointPrecompZ pointPrecompZ, PointAccum pointAccum, PointTemp pointTemp) {
        int[] iArr = pointAccum.f19286x;
        int[] iArr2 = pointAccum.f19287y;
        int[] iArr3 = pointTemp.f19296r0;
        int[] iArr4 = pointAccum.f19288z;
        int[] iArr5 = pointAccum.f19284u;
        int[] iArr6 = pointAccum.f19285v;
        X25519Field.apm(iArr2, iArr, iArr2, iArr);
        X25519Field.mul(iArr, pointPrecompZ.ymx_h, iArr);
        X25519Field.mul(iArr2, pointPrecompZ.ypx_h, iArr2);
        X25519Field.mul(pointAccum.f19284u, pointAccum.f19285v, iArr3);
        X25519Field.mul(iArr3, pointPrecompZ.xyd, iArr3);
        X25519Field.mul(pointAccum.f19288z, pointPrecompZ.f19295z, iArr4);
        X25519Field.apm(iArr2, iArr, iArr6, iArr5);
        X25519Field.apm(iArr4, iArr3, iArr2, iArr);
        X25519Field.mul(iArr, iArr2, pointAccum.f19288z);
        X25519Field.mul(iArr, iArr5, pointAccum.f19286x);
        X25519Field.mul(iArr2, iArr6, pointAccum.f19287y);
    }

    private static void pointCopy(PointExtended pointExtended, PointPrecompZ pointPrecompZ) {
        X25519Field.apm(pointExtended.f19293y, pointExtended.f19292x, pointPrecompZ.ypx_h, pointPrecompZ.ymx_h);
        X25519Field.mul(pointExtended.f19291t, C_d2, pointPrecompZ.xyd);
        int[] iArr = pointExtended.f19294z;
        X25519Field.add(iArr, iArr, pointPrecompZ.f19295z);
    }

    public static void sign(byte[] bArr, int i3, byte[] bArr2, int i10, byte[] bArr3, byte[] bArr4, int i11, int i12, byte[] bArr5, int i13) {
        implSign(bArr, i3, bArr2, i10, bArr3, (byte) 0, bArr4, i11, i12, bArr5, i13);
    }

    public static void signPrehash(byte[] bArr, int i3, byte[] bArr2, Digest digest, byte[] bArr3, int i10) {
        byte[] bArr4 = new byte[64];
        if (64 != digest.doFinal(bArr4, 0)) {
            throw new IllegalArgumentException(StubApp.getString2(32994));
        }
        implSign(bArr, i3, bArr2, (byte) 1, bArr4, 0, 64, bArr3, i10);
    }

    public static void sign(byte[] bArr, int i3, byte[] bArr2, byte[] bArr3, int i10, int i11, byte[] bArr4, int i12) {
        implSign(bArr, i3, bArr2, (byte) 0, bArr3, i10, i11, bArr4, i12);
    }

    public static void signPrehash(byte[] bArr, int i3, byte[] bArr2, byte[] bArr3, int i10, byte[] bArr4, int i11) {
        implSign(bArr, i3, bArr2, (byte) 1, bArr3, i10, 64, bArr4, i11);
    }
}
