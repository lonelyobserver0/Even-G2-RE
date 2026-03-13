package org.bouncycastle.math.ec;

import com.stub.StubApp;
import java.math.BigInteger;
import java.util.Random;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Integers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class ECFieldElement implements ECConstants {

    public static abstract class AbstractF2m extends ECFieldElement {
        public ECFieldElement halfTrace() {
            int fieldSize = getFieldSize();
            if ((fieldSize & 1) == 0) {
                throw new IllegalStateException(StubApp.getString2(32914));
            }
            int i3 = (fieldSize + 1) >>> 1;
            int numberOfLeadingZeros = 31 - Integers.numberOfLeadingZeros(i3);
            ECFieldElement eCFieldElement = this;
            int i10 = 1;
            while (numberOfLeadingZeros > 0) {
                eCFieldElement = eCFieldElement.squarePow(i10 << 1).add(eCFieldElement);
                numberOfLeadingZeros--;
                i10 = i3 >>> numberOfLeadingZeros;
                if ((i10 & 1) != 0) {
                    eCFieldElement = eCFieldElement.squarePow(2).add(this);
                }
            }
            return eCFieldElement;
        }

        public boolean hasFastTrace() {
            return false;
        }

        public int trace() {
            int fieldSize = getFieldSize();
            int numberOfLeadingZeros = 31 - Integers.numberOfLeadingZeros(fieldSize);
            ECFieldElement eCFieldElement = this;
            int i3 = 1;
            while (numberOfLeadingZeros > 0) {
                eCFieldElement = eCFieldElement.squarePow(i3).add(eCFieldElement);
                numberOfLeadingZeros--;
                i3 = fieldSize >>> numberOfLeadingZeros;
                if ((i3 & 1) != 0) {
                    eCFieldElement = eCFieldElement.square().add(this);
                }
            }
            if (eCFieldElement.isZero()) {
                return 0;
            }
            if (eCFieldElement.isOne()) {
                return 1;
            }
            throw new IllegalStateException(StubApp.getString2(32915));
        }
    }

    public static abstract class AbstractFp extends ECFieldElement {
    }

    public static class F2m extends AbstractF2m {
        public static final int GNB = 1;
        public static final int PPB = 3;
        public static final int TPB = 2;
        private int[] ks;

        /* renamed from: m, reason: collision with root package name */
        private int f19186m;
        private int representation;

        /* renamed from: x, reason: collision with root package name */
        LongArray f19187x;

        public F2m(int i3, int[] iArr, LongArray longArray) {
            this.f19186m = i3;
            this.representation = iArr.length == 1 ? 2 : 3;
            this.ks = iArr;
            this.f19187x = longArray;
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement add(ECFieldElement eCFieldElement) {
            LongArray longArray = (LongArray) this.f19187x.clone();
            longArray.addShiftedByWords(((F2m) eCFieldElement).f19187x, 0);
            return new F2m(this.f19186m, this.ks, longArray);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement addOne() {
            return new F2m(this.f19186m, this.ks, this.f19187x.addOne());
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public int bitLength() {
            return this.f19187x.degree();
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement divide(ECFieldElement eCFieldElement) {
            return multiply(eCFieldElement.invert());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof F2m)) {
                return false;
            }
            F2m f2m = (F2m) obj;
            return this.f19186m == f2m.f19186m && this.representation == f2m.representation && Arrays.areEqual(this.ks, f2m.ks) && this.f19187x.equals(f2m.f19187x);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public String getFieldName() {
            return StubApp.getString2(32916);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public int getFieldSize() {
            return this.f19186m;
        }

        public int getK1() {
            return this.ks[0];
        }

        public int getK2() {
            int[] iArr = this.ks;
            if (iArr.length >= 2) {
                return iArr[1];
            }
            return 0;
        }

        public int getK3() {
            int[] iArr = this.ks;
            if (iArr.length >= 3) {
                return iArr[2];
            }
            return 0;
        }

        public int getM() {
            return this.f19186m;
        }

        public int getRepresentation() {
            return this.representation;
        }

        public int hashCode() {
            return (this.f19187x.hashCode() ^ this.f19186m) ^ Arrays.hashCode(this.ks);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement invert() {
            int i3 = this.f19186m;
            int[] iArr = this.ks;
            return new F2m(i3, iArr, this.f19187x.modInverse(i3, iArr));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public boolean isOne() {
            return this.f19187x.isOne();
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public boolean isZero() {
            return this.f19187x.isZero();
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiply(ECFieldElement eCFieldElement) {
            int i3 = this.f19186m;
            int[] iArr = this.ks;
            return new F2m(i3, iArr, this.f19187x.modMultiply(((F2m) eCFieldElement).f19187x, i3, iArr));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            LongArray longArray = this.f19187x;
            LongArray longArray2 = ((F2m) eCFieldElement).f19187x;
            LongArray longArray3 = ((F2m) eCFieldElement2).f19187x;
            LongArray longArray4 = ((F2m) eCFieldElement3).f19187x;
            LongArray multiply = longArray.multiply(longArray2, this.f19186m, this.ks);
            LongArray multiply2 = longArray3.multiply(longArray4, this.f19186m, this.ks);
            if (multiply == longArray || multiply == longArray2) {
                multiply = (LongArray) multiply.clone();
            }
            multiply.addShiftedByWords(multiply2, 0);
            multiply.reduce(this.f19186m, this.ks);
            return new F2m(this.f19186m, this.ks, multiply);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement negate() {
            return this;
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement sqrt() {
            return (this.f19187x.isZero() || this.f19187x.isOne()) ? this : squarePow(this.f19186m - 1);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement square() {
            int i3 = this.f19186m;
            int[] iArr = this.ks;
            return new F2m(i3, iArr, this.f19187x.modSquare(i3, iArr));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            return squarePlusProduct(eCFieldElement, eCFieldElement2);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            LongArray longArray = this.f19187x;
            LongArray longArray2 = ((F2m) eCFieldElement).f19187x;
            LongArray longArray3 = ((F2m) eCFieldElement2).f19187x;
            LongArray square = longArray.square(this.f19186m, this.ks);
            LongArray multiply = longArray2.multiply(longArray3, this.f19186m, this.ks);
            if (square == longArray) {
                square = (LongArray) square.clone();
            }
            square.addShiftedByWords(multiply, 0);
            square.reduce(this.f19186m, this.ks);
            return new F2m(this.f19186m, this.ks, square);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement squarePow(int i3) {
            if (i3 < 1) {
                return this;
            }
            int i10 = this.f19186m;
            int[] iArr = this.ks;
            return new F2m(i10, iArr, this.f19187x.modSquareN(i3, i10, iArr));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement subtract(ECFieldElement eCFieldElement) {
            return add(eCFieldElement);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public boolean testBitZero() {
            return this.f19187x.testBitZero();
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public BigInteger toBigInteger() {
            return this.f19187x.toBigInteger();
        }
    }

    public static class Fp extends AbstractFp {

        /* renamed from: q, reason: collision with root package name */
        BigInteger f19188q;

        /* renamed from: r, reason: collision with root package name */
        BigInteger f19189r;

        /* renamed from: x, reason: collision with root package name */
        BigInteger f19190x;

        public Fp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            this.f19188q = bigInteger;
            this.f19189r = bigInteger2;
            this.f19190x = bigInteger3;
        }

        public static BigInteger calculateResidue(BigInteger bigInteger) {
            int bitLength = bigInteger.bitLength();
            if (bitLength < 96 || bigInteger.shiftRight(bitLength - 64).longValue() != -1) {
                return null;
            }
            return ECConstants.ONE.shiftLeft(bitLength).subtract(bigInteger);
        }

        private ECFieldElement checkSqrt(ECFieldElement eCFieldElement) {
            if (eCFieldElement.square().equals(this)) {
                return eCFieldElement;
            }
            return null;
        }

        private BigInteger[] lucasSequence(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            int bitLength = bigInteger3.bitLength();
            int lowestSetBit = bigInteger3.getLowestSetBit();
            BigInteger bigInteger4 = ECConstants.ONE;
            BigInteger bigInteger5 = bigInteger;
            BigInteger bigInteger6 = bigInteger4;
            BigInteger bigInteger7 = ECConstants.TWO;
            BigInteger bigInteger8 = bigInteger6;
            for (int i3 = bitLength - 1; i3 >= lowestSetBit + 1; i3--) {
                bigInteger4 = modMult(bigInteger4, bigInteger8);
                if (bigInteger3.testBit(i3)) {
                    bigInteger8 = modMult(bigInteger4, bigInteger2);
                    bigInteger6 = modMult(bigInteger6, bigInteger5);
                    bigInteger7 = modReduce(bigInteger5.multiply(bigInteger7).subtract(bigInteger.multiply(bigInteger4)));
                    bigInteger5 = modReduce(bigInteger5.multiply(bigInteger5).subtract(bigInteger8.shiftLeft(1)));
                } else {
                    BigInteger modReduce = modReduce(bigInteger6.multiply(bigInteger7).subtract(bigInteger4));
                    BigInteger modReduce2 = modReduce(bigInteger5.multiply(bigInteger7).subtract(bigInteger.multiply(bigInteger4)));
                    bigInteger7 = modReduce(bigInteger7.multiply(bigInteger7).subtract(bigInteger4.shiftLeft(1)));
                    bigInteger5 = modReduce2;
                    bigInteger6 = modReduce;
                    bigInteger8 = bigInteger4;
                }
            }
            BigInteger modMult = modMult(bigInteger4, bigInteger8);
            BigInteger modMult2 = modMult(modMult, bigInteger2);
            BigInteger modReduce3 = modReduce(bigInteger6.multiply(bigInteger7).subtract(modMult));
            BigInteger modReduce4 = modReduce(bigInteger5.multiply(bigInteger7).subtract(bigInteger.multiply(modMult)));
            BigInteger modMult3 = modMult(modMult, modMult2);
            for (int i10 = 1; i10 <= lowestSetBit; i10++) {
                modReduce3 = modMult(modReduce3, modReduce4);
                modReduce4 = modReduce(modReduce4.multiply(modReduce4).subtract(modMult3.shiftLeft(1)));
                modMult3 = modMult(modMult3, modMult3);
            }
            return new BigInteger[]{modReduce3, modReduce4};
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement add(ECFieldElement eCFieldElement) {
            return new Fp(this.f19188q, this.f19189r, modAdd(this.f19190x, eCFieldElement.toBigInteger()));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement addOne() {
            BigInteger add = this.f19190x.add(ECConstants.ONE);
            if (add.compareTo(this.f19188q) == 0) {
                add = ECConstants.ZERO;
            }
            return new Fp(this.f19188q, this.f19189r, add);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement divide(ECFieldElement eCFieldElement) {
            return new Fp(this.f19188q, this.f19189r, modMult(this.f19190x, modInverse(eCFieldElement.toBigInteger())));
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Fp)) {
                return false;
            }
            Fp fp = (Fp) obj;
            return this.f19188q.equals(fp.f19188q) && this.f19190x.equals(fp.f19190x);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public String getFieldName() {
            return StubApp.getString2(32917);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public int getFieldSize() {
            return this.f19188q.bitLength();
        }

        public BigInteger getQ() {
            return this.f19188q;
        }

        public int hashCode() {
            return this.f19188q.hashCode() ^ this.f19190x.hashCode();
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement invert() {
            return new Fp(this.f19188q, this.f19189r, modInverse(this.f19190x));
        }

        public BigInteger modAdd(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger add = bigInteger.add(bigInteger2);
            return add.compareTo(this.f19188q) >= 0 ? add.subtract(this.f19188q) : add;
        }

        public BigInteger modDouble(BigInteger bigInteger) {
            BigInteger shiftLeft = bigInteger.shiftLeft(1);
            return shiftLeft.compareTo(this.f19188q) >= 0 ? shiftLeft.subtract(this.f19188q) : shiftLeft;
        }

        public BigInteger modHalf(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.f19188q.add(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }

        public BigInteger modHalfAbs(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.f19188q.subtract(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }

        public BigInteger modInverse(BigInteger bigInteger) {
            return BigIntegers.modOddInverse(this.f19188q, bigInteger);
        }

        public BigInteger modMult(BigInteger bigInteger, BigInteger bigInteger2) {
            return modReduce(bigInteger.multiply(bigInteger2));
        }

        public BigInteger modReduce(BigInteger bigInteger) {
            if (this.f19189r == null) {
                return bigInteger.mod(this.f19188q);
            }
            boolean z2 = bigInteger.signum() < 0;
            if (z2) {
                bigInteger = bigInteger.abs();
            }
            int bitLength = this.f19188q.bitLength();
            boolean equals = this.f19189r.equals(ECConstants.ONE);
            while (bigInteger.bitLength() > bitLength + 1) {
                BigInteger shiftRight = bigInteger.shiftRight(bitLength);
                BigInteger subtract = bigInteger.subtract(shiftRight.shiftLeft(bitLength));
                if (!equals) {
                    shiftRight = shiftRight.multiply(this.f19189r);
                }
                bigInteger = shiftRight.add(subtract);
            }
            while (bigInteger.compareTo(this.f19188q) >= 0) {
                bigInteger = bigInteger.subtract(this.f19188q);
            }
            return (!z2 || bigInteger.signum() == 0) ? bigInteger : this.f19188q.subtract(bigInteger);
        }

        public BigInteger modSubtract(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger subtract = bigInteger.subtract(bigInteger2);
            return subtract.signum() < 0 ? subtract.add(this.f19188q) : subtract;
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiply(ECFieldElement eCFieldElement) {
            return new Fp(this.f19188q, this.f19189r, modMult(this.f19190x, eCFieldElement.toBigInteger()));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            BigInteger bigInteger = this.f19190x;
            BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            BigInteger bigInteger4 = eCFieldElement3.toBigInteger();
            return new Fp(this.f19188q, this.f19189r, modReduce(bigInteger.multiply(bigInteger2).subtract(bigInteger3.multiply(bigInteger4))));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            BigInteger bigInteger = this.f19190x;
            BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            BigInteger bigInteger4 = eCFieldElement3.toBigInteger();
            return new Fp(this.f19188q, this.f19189r, modReduce(bigInteger.multiply(bigInteger2).add(bigInteger3.multiply(bigInteger4))));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement negate() {
            if (this.f19190x.signum() == 0) {
                return this;
            }
            BigInteger bigInteger = this.f19188q;
            return new Fp(bigInteger, this.f19189r, bigInteger.subtract(this.f19190x));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement sqrt() {
            if (isZero() || isOne()) {
                return this;
            }
            if (!this.f19188q.testBit(0)) {
                throw new RuntimeException(StubApp.getString2(32918));
            }
            if (this.f19188q.testBit(1)) {
                BigInteger add = this.f19188q.shiftRight(2).add(ECConstants.ONE);
                BigInteger bigInteger = this.f19188q;
                return checkSqrt(new Fp(bigInteger, this.f19189r, this.f19190x.modPow(add, bigInteger)));
            }
            if (this.f19188q.testBit(2)) {
                BigInteger modPow = this.f19190x.modPow(this.f19188q.shiftRight(3), this.f19188q);
                BigInteger modMult = modMult(modPow, this.f19190x);
                if (modMult(modMult, modPow).equals(ECConstants.ONE)) {
                    return checkSqrt(new Fp(this.f19188q, this.f19189r, modMult));
                }
                return checkSqrt(new Fp(this.f19188q, this.f19189r, modMult(modMult, ECConstants.TWO.modPow(this.f19188q.shiftRight(2), this.f19188q))));
            }
            BigInteger shiftRight = this.f19188q.shiftRight(1);
            BigInteger modPow2 = this.f19190x.modPow(shiftRight, this.f19188q);
            BigInteger bigInteger2 = ECConstants.ONE;
            if (!modPow2.equals(bigInteger2)) {
                return null;
            }
            BigInteger bigInteger3 = this.f19190x;
            BigInteger modDouble = modDouble(modDouble(bigInteger3));
            BigInteger add2 = shiftRight.add(bigInteger2);
            BigInteger subtract = this.f19188q.subtract(bigInteger2);
            Random random = new Random();
            while (true) {
                BigInteger bigInteger4 = new BigInteger(this.f19188q.bitLength(), random);
                if (bigInteger4.compareTo(this.f19188q) < 0 && modReduce(bigInteger4.multiply(bigInteger4).subtract(modDouble)).modPow(shiftRight, this.f19188q).equals(subtract)) {
                    BigInteger[] lucasSequence = lucasSequence(bigInteger4, bigInteger3, add2);
                    BigInteger bigInteger5 = lucasSequence[0];
                    BigInteger bigInteger6 = lucasSequence[1];
                    if (modMult(bigInteger6, bigInteger6).equals(modDouble)) {
                        return new Fp(this.f19188q, this.f19189r, modHalfAbs(bigInteger6));
                    }
                    if (!bigInteger5.equals(ECConstants.ONE) && !bigInteger5.equals(subtract)) {
                        return null;
                    }
                }
            }
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement square() {
            BigInteger bigInteger = this.f19188q;
            BigInteger bigInteger2 = this.f19189r;
            BigInteger bigInteger3 = this.f19190x;
            return new Fp(bigInteger, bigInteger2, modMult(bigInteger3, bigInteger3));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            BigInteger bigInteger = this.f19190x;
            BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            return new Fp(this.f19188q, this.f19189r, modReduce(bigInteger.multiply(bigInteger).subtract(bigInteger2.multiply(bigInteger3))));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            BigInteger bigInteger = this.f19190x;
            BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            return new Fp(this.f19188q, this.f19189r, modReduce(bigInteger.multiply(bigInteger).add(bigInteger2.multiply(bigInteger3))));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement subtract(ECFieldElement eCFieldElement) {
            return new Fp(this.f19188q, this.f19189r, modSubtract(this.f19190x, eCFieldElement.toBigInteger()));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public BigInteger toBigInteger() {
            return this.f19190x;
        }
    }

    public abstract ECFieldElement add(ECFieldElement eCFieldElement);

    public abstract ECFieldElement addOne();

    public int bitLength() {
        return toBigInteger().bitLength();
    }

    public abstract ECFieldElement divide(ECFieldElement eCFieldElement);

    public byte[] getEncoded() {
        return BigIntegers.asUnsignedByteArray((getFieldSize() + 7) / 8, toBigInteger());
    }

    public abstract String getFieldName();

    public abstract int getFieldSize();

    public abstract ECFieldElement invert();

    public boolean isOne() {
        return bitLength() == 1;
    }

    public boolean isZero() {
        return toBigInteger().signum() == 0;
    }

    public abstract ECFieldElement multiply(ECFieldElement eCFieldElement);

    public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiply(eCFieldElement).subtract(eCFieldElement2.multiply(eCFieldElement3));
    }

    public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiply(eCFieldElement).add(eCFieldElement2.multiply(eCFieldElement3));
    }

    public abstract ECFieldElement negate();

    public abstract ECFieldElement sqrt();

    public abstract ECFieldElement square();

    public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return square().subtract(eCFieldElement.multiply(eCFieldElement2));
    }

    public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return square().add(eCFieldElement.multiply(eCFieldElement2));
    }

    public ECFieldElement squarePow(int i3) {
        ECFieldElement eCFieldElement = this;
        for (int i10 = 0; i10 < i3; i10++) {
            eCFieldElement = eCFieldElement.square();
        }
        return eCFieldElement;
    }

    public abstract ECFieldElement subtract(ECFieldElement eCFieldElement);

    public boolean testBitZero() {
        return toBigInteger().testBit(0);
    }

    public abstract BigInteger toBigInteger();

    public String toString() {
        return toBigInteger().toString(16);
    }
}
