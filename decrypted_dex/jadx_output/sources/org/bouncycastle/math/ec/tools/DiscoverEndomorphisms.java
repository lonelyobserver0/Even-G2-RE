package org.bouncycastle.math.ec.tools;

import com.stub.StubApp;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.TreeSet;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.BigIntegers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DiscoverEndomorphisms {
    private static final int radix = 16;

    private static boolean areRelativelyPrime(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.gcd(bigInteger2).equals(ECConstants.ONE);
    }

    private static BigInteger[] calculateRange(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return order(bigInteger.subtract(bigInteger2).divide(bigInteger3), bigInteger.add(bigInteger2).divide(bigInteger3));
    }

    private static BigInteger[] chooseShortest(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2) {
        return isShorter(bigIntegerArr, bigIntegerArr2) ? bigIntegerArr : bigIntegerArr2;
    }

    private static void discoverEndomorphisms(String str) {
        X9ECParameters byName = CustomNamedCurves.getByName(str);
        if (byName != null || (byName = ECNamedCurveTable.getByName(str)) != null) {
            discoverEndomorphisms(byName, str);
            return;
        }
        System.err.println(StubApp.getString2(32996) + str);
    }

    private static ArrayList enumToList(Enumeration enumeration) {
        ArrayList arrayList = new ArrayList();
        while (enumeration.hasMoreElements()) {
            arrayList.add(enumeration.nextElement());
        }
        return arrayList;
    }

    private static BigInteger[] extEuclidBezout(BigInteger[] bigIntegerArr) {
        boolean z2 = bigIntegerArr[0].compareTo(bigIntegerArr[1]) < 0;
        if (z2) {
            swap(bigIntegerArr);
        }
        BigInteger bigInteger = bigIntegerArr[0];
        BigInteger bigInteger2 = bigIntegerArr[1];
        BigInteger bigInteger3 = ECConstants.ONE;
        BigInteger bigInteger4 = ECConstants.ZERO;
        BigInteger bigInteger5 = bigInteger2;
        BigInteger bigInteger6 = bigInteger;
        BigInteger bigInteger7 = bigInteger3;
        BigInteger bigInteger8 = bigInteger4;
        while (bigInteger5.compareTo(ECConstants.ONE) > 0) {
            BigInteger[] divideAndRemainder = bigInteger6.divideAndRemainder(bigInteger5);
            BigInteger bigInteger9 = divideAndRemainder[0];
            BigInteger bigInteger10 = divideAndRemainder[1];
            BigInteger subtract = bigInteger3.subtract(bigInteger9.multiply(bigInteger4));
            BigInteger subtract2 = bigInteger8.subtract(bigInteger9.multiply(bigInteger7));
            BigInteger bigInteger11 = bigInteger5;
            bigInteger5 = bigInteger10;
            bigInteger6 = bigInteger11;
            BigInteger bigInteger12 = bigInteger4;
            bigInteger4 = subtract;
            bigInteger3 = bigInteger12;
            bigInteger8 = bigInteger7;
            bigInteger7 = subtract2;
        }
        if (bigInteger5.signum() <= 0) {
            return null;
        }
        BigInteger[] bigIntegerArr2 = {bigInteger4, bigInteger7};
        if (z2) {
            swap(bigIntegerArr2);
        }
        return bigIntegerArr2;
    }

    private static BigInteger[] extEuclidGLV(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = bigInteger;
        BigInteger bigInteger4 = bigInteger2;
        BigInteger bigInteger5 = ECConstants.ZERO;
        BigInteger bigInteger6 = ECConstants.ONE;
        while (true) {
            BigInteger[] divideAndRemainder = bigInteger3.divideAndRemainder(bigInteger4);
            BigInteger bigInteger7 = divideAndRemainder[0];
            BigInteger bigInteger8 = divideAndRemainder[1];
            BigInteger subtract = bigInteger5.subtract(bigInteger7.multiply(bigInteger6));
            if (isLessThanSqrt(bigInteger4, bigInteger)) {
                return new BigInteger[]{bigInteger3, bigInteger5, bigInteger4, bigInteger6, bigInteger8, subtract};
            }
            bigInteger3 = bigInteger4;
            bigInteger5 = bigInteger6;
            bigInteger4 = bigInteger8;
            bigInteger6 = subtract;
        }
    }

    private static ECFieldElement[] findNonTrivialOrder3FieldElements(ECCurve eCCurve) {
        BigInteger modPow;
        BigInteger characteristic = eCCurve.getField().getCharacteristic();
        BigInteger divide = characteristic.divide(ECConstants.THREE);
        SecureRandom secureRandom = new SecureRandom();
        do {
            BigInteger bigInteger = ECConstants.TWO;
            modPow = BigIntegers.createRandomInRange(bigInteger, characteristic.subtract(bigInteger), secureRandom).modPow(divide, characteristic);
        } while (modPow.equals(ECConstants.ONE));
        ECFieldElement fromBigInteger = eCCurve.fromBigInteger(modPow);
        return new ECFieldElement[]{fromBigInteger, fromBigInteger.square()};
    }

    private static ECFieldElement[] findNonTrivialOrder4FieldElements(ECCurve eCCurve) {
        ECFieldElement sqrt = eCCurve.fromBigInteger(ECConstants.ONE).negate().sqrt();
        if (sqrt != null) {
            return new ECFieldElement[]{sqrt, sqrt.negate()};
        }
        throw new IllegalStateException(StubApp.getString2(33001));
    }

    private static BigInteger firstNonResidue(BigInteger bigInteger, BigInteger bigInteger2) {
        for (int i3 = 2; i3 < 1000; i3++) {
            BigInteger valueOf = BigInteger.valueOf(i3);
            if (!valueOf.modPow(bigInteger2, bigInteger).equals(ECConstants.ONE)) {
                return valueOf;
            }
        }
        throw new IllegalStateException();
    }

    private static BigInteger[] intersect(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2) {
        BigInteger max = bigIntegerArr[0].max(bigIntegerArr2[0]);
        BigInteger min = bigIntegerArr[1].min(bigIntegerArr2[1]);
        if (max.compareTo(min) > 0) {
            return null;
        }
        return new BigInteger[]{max, min};
    }

    private static boolean isLessThanSqrt(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger abs = bigInteger.abs();
        BigInteger abs2 = bigInteger2.abs();
        int bitLength = abs2.bitLength();
        int bitLength2 = abs.bitLength() * 2;
        if (bitLength2 - 1 <= bitLength) {
            return bitLength2 < bitLength || abs.multiply(abs).compareTo(abs2) < 0;
        }
        return false;
    }

    private static boolean isShorter(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2) {
        BigInteger abs = bigIntegerArr[0].abs();
        BigInteger abs2 = bigIntegerArr[1].abs();
        BigInteger abs3 = bigIntegerArr2[0].abs();
        BigInteger abs4 = bigIntegerArr2[1].abs();
        boolean z2 = abs.compareTo(abs3) < 0;
        return z2 == (abs2.compareTo(abs4) < 0) ? z2 : abs.multiply(abs).add(abs2.multiply(abs2)).compareTo(abs3.multiply(abs3).add(abs4.multiply(abs4))) < 0;
    }

    private static boolean isVectorBoundedBySqrt(BigInteger[] bigIntegerArr, BigInteger bigInteger) {
        return isLessThanSqrt(bigIntegerArr[0].abs().max(bigIntegerArr[1].abs()), bigInteger);
    }

    private static BigInteger isqrt(BigInteger bigInteger) {
        BigInteger shiftRight = bigInteger.shiftRight(bigInteger.bitLength() / 2);
        while (true) {
            BigInteger shiftRight2 = shiftRight.add(bigInteger.divide(shiftRight)).shiftRight(1);
            if (shiftRight2.equals(shiftRight)) {
                return shiftRight2;
            }
            shiftRight = shiftRight2;
        }
    }

    public static void main(String[] strArr) {
        if (strArr.length > 0) {
            for (String str : strArr) {
                discoverEndomorphisms(str);
            }
            return;
        }
        TreeSet treeSet = new TreeSet(enumToList(ECNamedCurveTable.getNames()));
        treeSet.addAll(enumToList(CustomNamedCurves.getNames()));
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            discoverEndomorphisms((String) it.next());
        }
    }

    private static BigInteger modSqrt(BigInteger bigInteger, BigInteger bigInteger2) {
        if (!bigInteger2.testBit(0)) {
            throw new IllegalStateException();
        }
        BigInteger bigInteger3 = ECConstants.ONE;
        BigInteger shiftRight = bigInteger2.subtract(bigInteger3).shiftRight(1);
        if (!bigInteger.modPow(shiftRight, bigInteger2).equals(bigInteger3)) {
            return null;
        }
        BigInteger bigInteger4 = shiftRight;
        while (!bigInteger4.testBit(0)) {
            bigInteger4 = bigInteger4.shiftRight(1);
            if (!bigInteger.modPow(bigInteger4, bigInteger2).equals(ECConstants.ONE)) {
                return modSqrtComplex(bigInteger, bigInteger4, bigInteger2, shiftRight);
            }
        }
        return bigInteger.modPow(bigInteger4.add(ECConstants.ONE).shiftRight(1), bigInteger2);
    }

    private static BigInteger modSqrtComplex(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        BigInteger firstNonResidue = firstNonResidue(bigInteger3, bigInteger4);
        BigInteger bigInteger5 = bigInteger4;
        while (!bigInteger2.testBit(0)) {
            bigInteger2 = bigInteger2.shiftRight(1);
            bigInteger5 = bigInteger5.shiftRight(1);
            if (!bigInteger.modPow(bigInteger2, bigInteger3).equals(firstNonResidue.modPow(bigInteger5, bigInteger3))) {
                bigInteger5 = bigInteger5.add(bigInteger4);
            }
        }
        return bigInteger.modInverse(bigInteger3).modPow(bigInteger2.subtract(ECConstants.ONE).shiftRight(1), bigInteger3).multiply(firstNonResidue.modPow(bigInteger5.shiftRight(1), bigInteger3)).mod(bigInteger3);
    }

    private static BigInteger[] order(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.compareTo(bigInteger2) <= 0 ? new BigInteger[]{bigInteger, bigInteger2} : new BigInteger[]{bigInteger2, bigInteger};
    }

    private static void printGLVTypeAParameters(X9ECParameters x9ECParameters) {
        BigInteger n10 = x9ECParameters.getN();
        BigInteger bigInteger = ECConstants.ONE;
        BigInteger[] solveQuadraticEquation = solveQuadraticEquation(n10, bigInteger, ECConstants.ZERO, bigInteger);
        ECFieldElement[] findNonTrivialOrder4FieldElements = findNonTrivialOrder4FieldElements(x9ECParameters.getCurve());
        printGLVTypeAParameters(x9ECParameters, solveQuadraticEquation[0], findNonTrivialOrder4FieldElements);
        System.out.println(StubApp.getString2(12260));
        printGLVTypeAParameters(x9ECParameters, solveQuadraticEquation[1], findNonTrivialOrder4FieldElements);
    }

    private static void printGLVTypeBParameters(X9ECParameters x9ECParameters) {
        BigInteger n10 = x9ECParameters.getN();
        BigInteger bigInteger = ECConstants.ONE;
        BigInteger[] solveQuadraticEquation = solveQuadraticEquation(n10, bigInteger, bigInteger, bigInteger);
        ECFieldElement[] findNonTrivialOrder3FieldElements = findNonTrivialOrder3FieldElements(x9ECParameters.getCurve());
        printGLVTypeBParameters(x9ECParameters, solveQuadraticEquation[0], findNonTrivialOrder3FieldElements);
        System.out.println(StubApp.getString2(12260));
        printGLVTypeBParameters(x9ECParameters, solveQuadraticEquation[1], findNonTrivialOrder3FieldElements);
    }

    private static void printProperty(String str, Object obj) {
        StringBuffer stringBuffer = new StringBuffer(StubApp.getString2(6127));
        stringBuffer.append(str);
        while (stringBuffer.length() < 20) {
            stringBuffer.append(' ');
        }
        stringBuffer.append(StubApp.getString2(994));
        stringBuffer.append(obj.toString());
        System.out.println(stringBuffer.toString());
    }

    private static void printScalarDecompositionParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger[] extEuclidGLV = extEuclidGLV(bigInteger, bigInteger2);
        BigInteger[] bigIntegerArr = {extEuclidGLV[2], extEuclidGLV[3].negate()};
        BigInteger[] chooseShortest = chooseShortest(new BigInteger[]{extEuclidGLV[0], extEuclidGLV[1].negate()}, new BigInteger[]{extEuclidGLV[4], extEuclidGLV[5].negate()});
        if (!isVectorBoundedBySqrt(chooseShortest, bigInteger) && areRelativelyPrime(bigIntegerArr[0], bigIntegerArr[1])) {
            BigInteger bigInteger3 = bigIntegerArr[0];
            BigInteger bigInteger4 = bigIntegerArr[1];
            BigInteger divide = bigInteger3.add(bigInteger4.multiply(bigInteger2)).divide(bigInteger);
            BigInteger[] extEuclidBezout = extEuclidBezout(new BigInteger[]{divide.abs(), bigInteger4.abs()});
            if (extEuclidBezout != null) {
                BigInteger bigInteger5 = extEuclidBezout[0];
                BigInteger bigInteger6 = extEuclidBezout[1];
                if (divide.signum() < 0) {
                    bigInteger5 = bigInteger5.negate();
                }
                if (bigInteger4.signum() > 0) {
                    bigInteger6 = bigInteger6.negate();
                }
                BigInteger subtract = divide.multiply(bigInteger5).subtract(bigInteger4.multiply(bigInteger6));
                BigInteger bigInteger7 = ECConstants.ONE;
                if (!subtract.equals(bigInteger7)) {
                    throw new IllegalStateException();
                }
                BigInteger subtract2 = bigInteger6.multiply(bigInteger).subtract(bigInteger5.multiply(bigInteger2));
                BigInteger negate = bigInteger5.negate();
                BigInteger negate2 = subtract2.negate();
                BigInteger add = isqrt(bigInteger.subtract(bigInteger7)).add(bigInteger7);
                BigInteger[] intersect = intersect(calculateRange(negate, add, bigInteger4), calculateRange(negate2, add, bigInteger3));
                if (intersect != null) {
                    for (BigInteger bigInteger8 = intersect[0]; bigInteger8.compareTo(intersect[1]) <= 0; bigInteger8 = bigInteger8.add(ECConstants.ONE)) {
                        BigInteger[] bigIntegerArr2 = {subtract2.add(bigInteger8.multiply(bigInteger3)), bigInteger5.add(bigInteger8.multiply(bigInteger4))};
                        if (isShorter(bigIntegerArr2, chooseShortest)) {
                            chooseShortest = bigIntegerArr2;
                        }
                    }
                }
            }
        }
        BigInteger subtract3 = bigIntegerArr[0].multiply(chooseShortest[1]).subtract(bigIntegerArr[1].multiply(chooseShortest[0]));
        int bitLength = (bigInteger.bitLength() + 16) - (bigInteger.bitLength() & 7);
        BigInteger roundQuotient = roundQuotient(chooseShortest[1].shiftLeft(bitLength), subtract3);
        BigInteger negate3 = roundQuotient(bigIntegerArr[1].shiftLeft(bitLength), subtract3).negate();
        String string2 = StubApp.getString2(16822);
        StringBuilder sb2 = new StringBuilder(string2);
        sb2.append(bigIntegerArr[0].toString(16));
        String string22 = StubApp.getString2(81);
        sb2.append(string22);
        sb2.append(bigIntegerArr[1].toString(16));
        String string23 = StubApp.getString2(9385);
        sb2.append(string23);
        printProperty(StubApp.getString2(32991), sb2.toString());
        printProperty(StubApp.getString2(820), string2 + chooseShortest[0].toString(16) + string22 + chooseShortest[1].toString(16) + string23);
        printProperty(StubApp.getString2(1315), subtract3.toString(16));
        printProperty(StubApp.getString2(33007), roundQuotient.toString(16));
        printProperty(StubApp.getString2(33008), negate3.toString(16));
        printProperty(StubApp.getString2(33009), Integer.toString(bitLength));
    }

    private static BigInteger roundQuotient(BigInteger bigInteger, BigInteger bigInteger2) {
        boolean z2 = bigInteger.signum() != bigInteger2.signum();
        BigInteger abs = bigInteger.abs();
        BigInteger abs2 = bigInteger2.abs();
        BigInteger divide = abs.add(abs2.shiftRight(1)).divide(abs2);
        return z2 ? divide.negate() : divide;
    }

    private static BigInteger[] solveQuadraticEquation(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        BigInteger modSqrt = modSqrt(bigInteger3.multiply(bigInteger3).subtract(bigInteger2.multiply(bigInteger4).shiftLeft(2)).mod(bigInteger), bigInteger);
        if (modSqrt == null) {
            throw new IllegalStateException(StubApp.getString2(33010));
        }
        BigInteger modInverse = bigInteger2.shiftLeft(1).modInverse(bigInteger);
        return new BigInteger[]{modSqrt.subtract(bigInteger3).multiply(modInverse).mod(bigInteger), modSqrt.negate().subtract(bigInteger3).multiply(modInverse).mod(bigInteger)};
    }

    private static void swap(BigInteger[] bigIntegerArr) {
        BigInteger bigInteger = bigIntegerArr[0];
        bigIntegerArr[0] = bigIntegerArr[1];
        bigIntegerArr[1] = bigInteger;
    }

    public static void discoverEndomorphisms(X9ECParameters x9ECParameters) {
        if (x9ECParameters == null) {
            throw new NullPointerException(StubApp.getString2(32997));
        }
        discoverEndomorphisms(x9ECParameters, StubApp.getString2(10772));
    }

    private static void printGLVTypeAParameters(X9ECParameters x9ECParameters, BigInteger bigInteger, ECFieldElement[] eCFieldElementArr) {
        ECPoint normalize = x9ECParameters.getG().normalize();
        ECPoint normalize2 = normalize.multiply(bigInteger).normalize();
        boolean equals = normalize.getXCoord().negate().equals(normalize2.getXCoord());
        String string2 = StubApp.getString2(33002);
        if (!equals) {
            throw new IllegalStateException(string2);
        }
        ECFieldElement eCFieldElement = eCFieldElementArr[0];
        if (!normalize.getYCoord().multiply(eCFieldElement).equals(normalize2.getYCoord())) {
            eCFieldElement = eCFieldElementArr[1];
            if (!normalize.getYCoord().multiply(eCFieldElement).equals(normalize2.getYCoord())) {
                throw new IllegalStateException(string2);
            }
        }
        printProperty(StubApp.getString2(33003), StubApp.getString2(33004));
        printProperty(StubApp.getString2(2368), eCFieldElement.toBigInteger().toString(16));
        printProperty(StubApp.getString2(24316), bigInteger.toString(16));
        printScalarDecompositionParameters(x9ECParameters.getN(), bigInteger);
    }

    private static void printGLVTypeBParameters(X9ECParameters x9ECParameters, BigInteger bigInteger, ECFieldElement[] eCFieldElementArr) {
        ECPoint normalize = x9ECParameters.getG().normalize();
        ECPoint normalize2 = normalize.multiply(bigInteger).normalize();
        boolean equals = normalize.getYCoord().equals(normalize2.getYCoord());
        String string2 = StubApp.getString2(33005);
        if (!equals) {
            throw new IllegalStateException(string2);
        }
        ECFieldElement eCFieldElement = eCFieldElementArr[0];
        if (!normalize.getXCoord().multiply(eCFieldElement).equals(normalize2.getXCoord())) {
            eCFieldElement = eCFieldElementArr[1];
            if (!normalize.getXCoord().multiply(eCFieldElement).equals(normalize2.getXCoord())) {
                throw new IllegalStateException(string2);
            }
        }
        printProperty(StubApp.getString2(33003), StubApp.getString2(33006));
        printProperty(StubApp.getString2(24278), eCFieldElement.toBigInteger().toString(16));
        printProperty(StubApp.getString2(24316), bigInteger.toString(16));
        printScalarDecompositionParameters(x9ECParameters.getN(), bigInteger);
    }

    private static void discoverEndomorphisms(X9ECParameters x9ECParameters, String str) {
        ECCurve curve = x9ECParameters.getCurve();
        if (ECAlgorithms.isFpCurve(curve)) {
            BigInteger characteristic = curve.getField().getCharacteristic();
            boolean isZero = curve.getB().isZero();
            String string2 = StubApp.getString2(32998);
            if (isZero && characteristic.mod(ECConstants.FOUR).equals(ECConstants.ONE)) {
                System.out.println(string2 + str + StubApp.getString2(32999));
                printGLVTypeAParameters(x9ECParameters);
            }
            if (curve.getA().isZero() && characteristic.mod(ECConstants.THREE).equals(ECConstants.ONE)) {
                System.out.println(string2 + str + StubApp.getString2(33000));
                printGLVTypeBParameters(x9ECParameters);
            }
        }
    }
}
