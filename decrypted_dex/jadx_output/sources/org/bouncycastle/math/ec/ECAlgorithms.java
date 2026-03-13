package org.bouncycastle.math.ec;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.endo.ECEndomorphism;
import org.bouncycastle.math.ec.endo.EndoUtil;
import org.bouncycastle.math.ec.endo.GLVEndomorphism;
import org.bouncycastle.math.field.FiniteField;
import org.bouncycastle.math.field.PolynomialExtensionField;
import org.bouncycastle.math.raw.Nat;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ECAlgorithms {
    public static ECPoint cleanPoint(ECCurve eCCurve, ECPoint eCPoint) {
        if (eCCurve.equals(eCPoint.getCurve())) {
            return eCCurve.decodePoint(eCPoint.getEncoded(false));
        }
        throw new IllegalArgumentException(StubApp.getString2(32888));
    }

    public static ECPoint implCheckResult(ECPoint eCPoint) {
        if (eCPoint.isValidPartial()) {
            return eCPoint;
        }
        throw new IllegalStateException(StubApp.getString2(32889));
    }

    private static ECPoint implShamirsTrickFixedPoint(ECPoint eCPoint, BigInteger bigInteger, ECPoint eCPoint2, BigInteger bigInteger2) {
        ECCurve curve = eCPoint.getCurve();
        int combSize = FixedPointUtil.getCombSize(curve);
        if (bigInteger.bitLength() > combSize || bigInteger2.bitLength() > combSize) {
            throw new IllegalStateException(StubApp.getString2(32890));
        }
        FixedPointPreCompInfo precompute = FixedPointUtil.precompute(eCPoint);
        FixedPointPreCompInfo precompute2 = FixedPointUtil.precompute(eCPoint2);
        ECLookupTable lookupTable = precompute.getLookupTable();
        ECLookupTable lookupTable2 = precompute2.getLookupTable();
        int width = precompute.getWidth();
        if (width != precompute2.getWidth()) {
            FixedPointCombMultiplier fixedPointCombMultiplier = new FixedPointCombMultiplier();
            return fixedPointCombMultiplier.multiply(eCPoint, bigInteger).add(fixedPointCombMultiplier.multiply(eCPoint2, bigInteger2));
        }
        int v2 = AbstractC1482f.v(combSize, width, 1, width);
        ECPoint infinity = curve.getInfinity();
        int i3 = width * v2;
        int[] fromBigInteger = Nat.fromBigInteger(i3, bigInteger);
        int[] fromBigInteger2 = Nat.fromBigInteger(i3, bigInteger2);
        int i10 = i3 - 1;
        for (int i11 = 0; i11 < v2; i11++) {
            int i12 = 0;
            int i13 = 0;
            for (int i14 = i10 - i11; i14 >= 0; i14 -= v2) {
                int i15 = i14 >>> 5;
                int i16 = i14 & 31;
                int i17 = fromBigInteger[i15] >>> i16;
                i12 = ((i12 ^ (i17 >>> 1)) << 1) ^ i17;
                int i18 = fromBigInteger2[i15] >>> i16;
                i13 = ((i13 ^ (i18 >>> 1)) << 1) ^ i18;
            }
            infinity = infinity.twicePlus(lookupTable.lookupVar(i12).add(lookupTable2.lookupVar(i13)));
        }
        return infinity.add(precompute.getOffset()).add(precompute2.getOffset());
    }

    public static ECPoint implShamirsTrickJsf(ECPoint eCPoint, BigInteger bigInteger, ECPoint eCPoint2, BigInteger bigInteger2) {
        ECCurve curve = eCPoint.getCurve();
        ECPoint infinity = curve.getInfinity();
        ECPoint[] eCPointArr = {eCPoint2, eCPoint.subtract(eCPoint2), eCPoint, eCPoint.add(eCPoint2)};
        curve.normalizeAll(eCPointArr);
        ECPoint[] eCPointArr2 = {eCPointArr[3].negate(), eCPointArr[2].negate(), eCPointArr[1].negate(), eCPointArr[0].negate(), infinity, eCPointArr[0], eCPointArr[1], eCPointArr[2], eCPointArr[3]};
        byte[] generateJSF = WNafUtil.generateJSF(bigInteger, bigInteger2);
        int length = generateJSF.length;
        while (true) {
            length--;
            if (length < 0) {
                return infinity;
            }
            byte b2 = generateJSF[length];
            infinity = infinity.twicePlus(eCPointArr2[AbstractC1482f.c((b2 << 24) >> 28, 3, 4, (b2 << 28) >> 28)]);
        }
    }

    public static ECPoint implShamirsTrickWNaf(ECPoint eCPoint, BigInteger bigInteger, ECPoint eCPoint2, BigInteger bigInteger2) {
        boolean z2 = bigInteger.signum() < 0;
        boolean z10 = bigInteger2.signum() < 0;
        BigInteger abs = bigInteger.abs();
        BigInteger abs2 = bigInteger2.abs();
        int windowSize = WNafUtil.getWindowSize(abs.bitLength(), 8);
        int windowSize2 = WNafUtil.getWindowSize(abs2.bitLength(), 8);
        WNafPreCompInfo precompute = WNafUtil.precompute(eCPoint, windowSize, true);
        WNafPreCompInfo precompute2 = WNafUtil.precompute(eCPoint2, windowSize2, true);
        int combSize = FixedPointUtil.getCombSize(eCPoint.getCurve());
        if (!z2 && !z10 && bigInteger.bitLength() <= combSize && bigInteger2.bitLength() <= combSize && precompute.isPromoted() && precompute2.isPromoted()) {
            return implShamirsTrickFixedPoint(eCPoint, bigInteger, eCPoint2, bigInteger2);
        }
        int min = Math.min(8, precompute.getWidth());
        int min2 = Math.min(8, precompute2.getWidth());
        return implShamirsTrickWNaf(z2 ? precompute.getPreCompNeg() : precompute.getPreComp(), z2 ? precompute.getPreComp() : precompute.getPreCompNeg(), WNafUtil.generateWindowNaf(min, abs), z10 ? precompute2.getPreCompNeg() : precompute2.getPreComp(), z10 ? precompute2.getPreComp() : precompute2.getPreCompNeg(), WNafUtil.generateWindowNaf(min2, abs2));
    }

    public static ECPoint implSumOfMultiplies(ECEndomorphism eCEndomorphism, ECPoint[] eCPointArr, BigInteger[] bigIntegerArr) {
        ECPoint[] eCPointArr2 = eCPointArr;
        int length = eCPointArr2.length;
        int i3 = length << 1;
        boolean[] zArr = new boolean[i3];
        WNafPreCompInfo[] wNafPreCompInfoArr = new WNafPreCompInfo[i3];
        byte[][] bArr = new byte[i3][];
        ECPointMap pointMap = eCEndomorphism.getPointMap();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 << 1;
            int i12 = i11 + 1;
            BigInteger bigInteger = bigIntegerArr[i11];
            zArr[i11] = bigInteger.signum() < 0;
            BigInteger abs = bigInteger.abs();
            BigInteger bigInteger2 = bigIntegerArr[i12];
            zArr[i12] = bigInteger2.signum() < 0;
            BigInteger abs2 = bigInteger2.abs();
            int windowSize = WNafUtil.getWindowSize(Math.max(abs.bitLength(), abs2.bitLength()), 8);
            ECPoint eCPoint = eCPointArr2[i10];
            WNafPreCompInfo precompute = WNafUtil.precompute(eCPoint, windowSize, true);
            WNafPreCompInfo precomputeWithPointMap = WNafUtil.precomputeWithPointMap(EndoUtil.mapPoint(eCEndomorphism, eCPoint), pointMap, precompute, true);
            int min = Math.min(8, precompute.getWidth());
            int min2 = Math.min(8, precomputeWithPointMap.getWidth());
            wNafPreCompInfoArr[i11] = precompute;
            wNafPreCompInfoArr[i12] = precomputeWithPointMap;
            bArr[i11] = WNafUtil.generateWindowNaf(min, abs);
            bArr[i12] = WNafUtil.generateWindowNaf(min2, abs2);
            i10++;
            eCPointArr2 = eCPointArr;
        }
        return implSumOfMultiplies(zArr, wNafPreCompInfoArr, bArr);
    }

    public static ECPoint implSumOfMultipliesGLV(ECPoint[] eCPointArr, BigInteger[] bigIntegerArr, GLVEndomorphism gLVEndomorphism) {
        BigInteger order = eCPointArr[0].getCurve().getOrder();
        int length = eCPointArr.length;
        int i3 = length << 1;
        BigInteger[] bigIntegerArr2 = new BigInteger[i3];
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            BigInteger[] decomposeScalar = gLVEndomorphism.decomposeScalar(bigIntegerArr[i11].mod(order));
            int i12 = i10 + 1;
            bigIntegerArr2[i10] = decomposeScalar[0];
            i10 += 2;
            bigIntegerArr2[i12] = decomposeScalar[1];
        }
        if (gLVEndomorphism.hasEfficientPointMap()) {
            return implSumOfMultiplies(gLVEndomorphism, eCPointArr, bigIntegerArr2);
        }
        ECPoint[] eCPointArr2 = new ECPoint[i3];
        int i13 = 0;
        for (ECPoint eCPoint : eCPointArr) {
            ECPoint mapPoint = EndoUtil.mapPoint(gLVEndomorphism, eCPoint);
            int i14 = i13 + 1;
            eCPointArr2[i13] = eCPoint;
            i13 += 2;
            eCPointArr2[i14] = mapPoint;
        }
        return implSumOfMultiplies(eCPointArr2, bigIntegerArr2);
    }

    public static ECPoint importPoint(ECCurve eCCurve, ECPoint eCPoint) {
        if (eCCurve.equals(eCPoint.getCurve())) {
            return eCCurve.importPoint(eCPoint);
        }
        throw new IllegalArgumentException(StubApp.getString2(32888));
    }

    public static boolean isF2mCurve(ECCurve eCCurve) {
        return isF2mField(eCCurve.getField());
    }

    public static boolean isF2mField(FiniteField finiteField) {
        return finiteField.getDimension() > 1 && finiteField.getCharacteristic().equals(ECConstants.TWO) && (finiteField instanceof PolynomialExtensionField);
    }

    public static boolean isFpCurve(ECCurve eCCurve) {
        return isFpField(eCCurve.getField());
    }

    public static boolean isFpField(FiniteField finiteField) {
        return finiteField.getDimension() == 1;
    }

    public static void montgomeryTrick(ECFieldElement[] eCFieldElementArr, int i3, int i10) {
        montgomeryTrick(eCFieldElementArr, i3, i10, null);
    }

    public static ECPoint referenceMultiply(ECPoint eCPoint, BigInteger bigInteger) {
        BigInteger abs = bigInteger.abs();
        ECPoint infinity = eCPoint.getCurve().getInfinity();
        int bitLength = abs.bitLength();
        if (bitLength > 0) {
            if (abs.testBit(0)) {
                infinity = eCPoint;
            }
            for (int i3 = 1; i3 < bitLength; i3++) {
                eCPoint = eCPoint.twice();
                if (abs.testBit(i3)) {
                    infinity = infinity.add(eCPoint);
                }
            }
        }
        return bigInteger.signum() < 0 ? infinity.negate() : infinity;
    }

    public static ECPoint shamirsTrick(ECPoint eCPoint, BigInteger bigInteger, ECPoint eCPoint2, BigInteger bigInteger2) {
        return implCheckResult(implShamirsTrickJsf(eCPoint, bigInteger, importPoint(eCPoint.getCurve(), eCPoint2), bigInteger2));
    }

    public static ECPoint sumOfMultiplies(ECPoint[] eCPointArr, BigInteger[] bigIntegerArr) {
        if (eCPointArr != null && bigIntegerArr != null && eCPointArr.length == bigIntegerArr.length) {
            if (eCPointArr.length >= 1) {
                int length = eCPointArr.length;
                if (length == 1) {
                    return eCPointArr[0].multiply(bigIntegerArr[0]);
                }
                if (length == 2) {
                    return sumOfTwoMultiplies(eCPointArr[0], bigIntegerArr[0], eCPointArr[1], bigIntegerArr[1]);
                }
                ECPoint eCPoint = eCPointArr[0];
                ECCurve curve = eCPoint.getCurve();
                ECPoint[] eCPointArr2 = new ECPoint[length];
                eCPointArr2[0] = eCPoint;
                for (int i3 = 1; i3 < length; i3++) {
                    eCPointArr2[i3] = importPoint(curve, eCPointArr[i3]);
                }
                ECEndomorphism endomorphism = curve.getEndomorphism();
                return endomorphism instanceof GLVEndomorphism ? implCheckResult(implSumOfMultipliesGLV(eCPointArr2, bigIntegerArr, (GLVEndomorphism) endomorphism)) : implCheckResult(implSumOfMultiplies(eCPointArr2, bigIntegerArr));
            }
        }
        throw new IllegalArgumentException(StubApp.getString2(32891));
    }

    public static ECPoint sumOfTwoMultiplies(ECPoint eCPoint, BigInteger bigInteger, ECPoint eCPoint2, BigInteger bigInteger2) {
        ECPoint implSumOfMultipliesGLV;
        ECCurve curve = eCPoint.getCurve();
        ECPoint importPoint = importPoint(curve, eCPoint2);
        if ((curve instanceof ECCurve.AbstractF2m) && ((ECCurve.AbstractF2m) curve).isKoblitz()) {
            implSumOfMultipliesGLV = eCPoint.multiply(bigInteger).add(importPoint.multiply(bigInteger2));
        } else {
            ECEndomorphism endomorphism = curve.getEndomorphism();
            implSumOfMultipliesGLV = endomorphism instanceof GLVEndomorphism ? implSumOfMultipliesGLV(new ECPoint[]{eCPoint, importPoint}, new BigInteger[]{bigInteger, bigInteger2}, (GLVEndomorphism) endomorphism) : implShamirsTrickWNaf(eCPoint, bigInteger, importPoint, bigInteger2);
        }
        return implCheckResult(implSumOfMultipliesGLV);
    }

    public static ECPoint validatePoint(ECPoint eCPoint) {
        if (eCPoint.isValid()) {
            return eCPoint;
        }
        throw new IllegalStateException(StubApp.getString2(32892));
    }

    public static ECPoint implShamirsTrickWNaf(ECEndomorphism eCEndomorphism, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        boolean z2 = bigInteger.signum() < 0;
        boolean z10 = bigInteger2.signum() < 0;
        BigInteger abs = bigInteger.abs();
        BigInteger abs2 = bigInteger2.abs();
        WNafPreCompInfo precompute = WNafUtil.precompute(eCPoint, WNafUtil.getWindowSize(Math.max(abs.bitLength(), abs2.bitLength()), 8), true);
        WNafPreCompInfo precomputeWithPointMap = WNafUtil.precomputeWithPointMap(EndoUtil.mapPoint(eCEndomorphism, eCPoint), eCEndomorphism.getPointMap(), precompute, true);
        int min = Math.min(8, precompute.getWidth());
        int min2 = Math.min(8, precomputeWithPointMap.getWidth());
        return implShamirsTrickWNaf(z2 ? precompute.getPreCompNeg() : precompute.getPreComp(), z2 ? precompute.getPreComp() : precompute.getPreCompNeg(), WNafUtil.generateWindowNaf(min, abs), z10 ? precomputeWithPointMap.getPreCompNeg() : precomputeWithPointMap.getPreComp(), z10 ? precomputeWithPointMap.getPreComp() : precomputeWithPointMap.getPreCompNeg(), WNafUtil.generateWindowNaf(min2, abs2));
    }

    public static ECPoint implSumOfMultiplies(ECPoint[] eCPointArr, BigInteger[] bigIntegerArr) {
        int length = eCPointArr.length;
        boolean[] zArr = new boolean[length];
        WNafPreCompInfo[] wNafPreCompInfoArr = new WNafPreCompInfo[length];
        byte[][] bArr = new byte[length][];
        for (int i3 = 0; i3 < length; i3++) {
            BigInteger bigInteger = bigIntegerArr[i3];
            zArr[i3] = bigInteger.signum() < 0;
            BigInteger abs = bigInteger.abs();
            WNafPreCompInfo precompute = WNafUtil.precompute(eCPointArr[i3], WNafUtil.getWindowSize(abs.bitLength(), 8), true);
            int min = Math.min(8, precompute.getWidth());
            wNafPreCompInfoArr[i3] = precompute;
            bArr[i3] = WNafUtil.generateWindowNaf(min, abs);
        }
        return implSumOfMultiplies(zArr, wNafPreCompInfoArr, bArr);
    }

    public static void montgomeryTrick(ECFieldElement[] eCFieldElementArr, int i3, int i10, ECFieldElement eCFieldElement) {
        ECFieldElement[] eCFieldElementArr2 = new ECFieldElement[i10];
        int i11 = 0;
        eCFieldElementArr2[0] = eCFieldElementArr[i3];
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= i10) {
                break;
            }
            eCFieldElementArr2[i12] = eCFieldElementArr2[i11].multiply(eCFieldElementArr[i3 + i12]);
            i11 = i12;
        }
        if (eCFieldElement != null) {
            eCFieldElementArr2[i11] = eCFieldElementArr2[i11].multiply(eCFieldElement);
        }
        ECFieldElement invert = eCFieldElementArr2[i11].invert();
        while (i11 > 0) {
            int i13 = i11 - 1;
            int i14 = i11 + i3;
            ECFieldElement eCFieldElement2 = eCFieldElementArr[i14];
            eCFieldElementArr[i14] = eCFieldElementArr2[i13].multiply(invert);
            invert = invert.multiply(eCFieldElement2);
            i11 = i13;
        }
        eCFieldElementArr[i3] = invert;
    }

    private static ECPoint implShamirsTrickWNaf(ECPoint[] eCPointArr, ECPoint[] eCPointArr2, byte[] bArr, ECPoint[] eCPointArr3, ECPoint[] eCPointArr4, byte[] bArr2) {
        ECPoint eCPoint;
        int max = Math.max(bArr.length, bArr2.length);
        ECPoint infinity = eCPointArr[0].getCurve().getInfinity();
        int i3 = max - 1;
        int i10 = 0;
        ECPoint eCPoint2 = infinity;
        while (i3 >= 0) {
            byte b2 = i3 < bArr.length ? bArr[i3] : (byte) 0;
            byte b10 = i3 < bArr2.length ? bArr2[i3] : (byte) 0;
            if ((b2 | b10) == 0) {
                i10++;
            } else {
                if (b2 != 0) {
                    eCPoint = infinity.add((b2 < 0 ? eCPointArr2 : eCPointArr)[Math.abs((int) b2) >>> 1]);
                } else {
                    eCPoint = infinity;
                }
                if (b10 != 0) {
                    eCPoint = eCPoint.add((b10 < 0 ? eCPointArr4 : eCPointArr3)[Math.abs((int) b10) >>> 1]);
                }
                if (i10 > 0) {
                    eCPoint2 = eCPoint2.timesPow2(i10);
                    i10 = 0;
                }
                eCPoint2 = eCPoint2.twicePlus(eCPoint);
            }
            i3--;
        }
        return i10 > 0 ? eCPoint2.timesPow2(i10) : eCPoint2;
    }

    private static ECPoint implSumOfMultiplies(boolean[] zArr, WNafPreCompInfo[] wNafPreCompInfoArr, byte[][] bArr) {
        int length = bArr.length;
        int i3 = 0;
        for (byte[] bArr2 : bArr) {
            i3 = Math.max(i3, bArr2.length);
        }
        ECPoint infinity = wNafPreCompInfoArr[0].getPreComp()[0].getCurve().getInfinity();
        int i10 = i3 - 1;
        int i11 = 0;
        ECPoint eCPoint = infinity;
        while (i10 >= 0) {
            ECPoint eCPoint2 = infinity;
            for (int i12 = 0; i12 < length; i12++) {
                byte[] bArr3 = bArr[i12];
                byte b2 = i10 < bArr3.length ? bArr3[i10] : (byte) 0;
                if (b2 != 0) {
                    int abs = Math.abs((int) b2);
                    WNafPreCompInfo wNafPreCompInfo = wNafPreCompInfoArr[i12];
                    eCPoint2 = eCPoint2.add(((b2 < 0) == zArr[i12] ? wNafPreCompInfo.getPreComp() : wNafPreCompInfo.getPreCompNeg())[abs >>> 1]);
                }
            }
            if (eCPoint2 == infinity) {
                i11++;
            } else {
                if (i11 > 0) {
                    eCPoint = eCPoint.timesPow2(i11);
                    i11 = 0;
                }
                eCPoint = eCPoint.twicePlus(eCPoint2);
            }
            i10--;
        }
        return i11 > 0 ? eCPoint.timesPow2(i11) : eCPoint;
    }
}
