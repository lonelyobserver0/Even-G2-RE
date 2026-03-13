package org.bouncycastle.math.ec;

import com.stub.StubApp;
import i2.u;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Random;
import java.util.Set;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.math.Primes;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.endo.ECEndomorphism;
import org.bouncycastle.math.ec.endo.GLVEndomorphism;
import org.bouncycastle.math.field.FiniteField;
import org.bouncycastle.math.field.FiniteFields;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Properties;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class ECCurve {
    public static final int COORD_AFFINE = 0;
    public static final int COORD_HOMOGENEOUS = 1;
    public static final int COORD_JACOBIAN = 2;
    public static final int COORD_JACOBIAN_CHUDNOVSKY = 3;
    public static final int COORD_JACOBIAN_MODIFIED = 4;
    public static final int COORD_LAMBDA_AFFINE = 5;
    public static final int COORD_LAMBDA_PROJECTIVE = 6;
    public static final int COORD_SKEWED = 7;

    /* renamed from: a, reason: collision with root package name */
    protected ECFieldElement f19179a;

    /* renamed from: b, reason: collision with root package name */
    protected ECFieldElement f19180b;
    protected BigInteger cofactor;
    protected FiniteField field;
    protected BigInteger order;
    protected int coord = 0;
    protected ECEndomorphism endomorphism = null;
    protected ECMultiplier multiplier = null;

    public static abstract class AbstractF2m extends ECCurve {
        private BigInteger[] si;

        public AbstractF2m(int i3, int i10, int i11, int i12) {
            super(buildField(i3, i10, i11, i12));
            this.si = null;
        }

        private static FiniteField buildField(int i3, int i10, int i11, int i12) {
            return FiniteFields.getBinaryExtensionField((i11 | i12) == 0 ? new int[]{0, i10, i3} : new int[]{0, i10, i11, i12, i3});
        }

        private static BigInteger implRandomFieldElementMult(SecureRandom secureRandom, int i3) {
            BigInteger createRandomBigInteger;
            do {
                createRandomBigInteger = BigIntegers.createRandomBigInteger(i3, secureRandom);
            } while (createRandomBigInteger.signum() <= 0);
            return createRandomBigInteger;
        }

        public static BigInteger inverse(int i3, int[] iArr, BigInteger bigInteger) {
            return new LongArray(bigInteger).modInverse(i3, iArr).toBigInteger();
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint createPoint(BigInteger bigInteger, BigInteger bigInteger2) {
            ECFieldElement fromBigInteger = fromBigInteger(bigInteger);
            ECFieldElement fromBigInteger2 = fromBigInteger(bigInteger2);
            int coordinateSystem = getCoordinateSystem();
            if (coordinateSystem == 5 || coordinateSystem == 6) {
                if (!fromBigInteger.isZero()) {
                    fromBigInteger2 = fromBigInteger2.divide(fromBigInteger).add(fromBigInteger);
                } else if (!fromBigInteger2.square().equals(getB())) {
                    throw new IllegalArgumentException();
                }
            }
            return createRawPoint(fromBigInteger, fromBigInteger2);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint decompressPoint(int i3, BigInteger bigInteger) {
            ECFieldElement eCFieldElement;
            ECFieldElement fromBigInteger = fromBigInteger(bigInteger);
            if (fromBigInteger.isZero()) {
                eCFieldElement = getB().sqrt();
            } else {
                ECFieldElement solveQuadraticEquation = solveQuadraticEquation(fromBigInteger.square().invert().multiply(getB()).add(getA()).add(fromBigInteger));
                if (solveQuadraticEquation != null) {
                    if (solveQuadraticEquation.testBitZero() != (i3 == 1)) {
                        solveQuadraticEquation = solveQuadraticEquation.addOne();
                    }
                    int coordinateSystem = getCoordinateSystem();
                    eCFieldElement = (coordinateSystem == 5 || coordinateSystem == 6) ? solveQuadraticEquation.add(fromBigInteger) : solveQuadraticEquation.multiply(fromBigInteger);
                } else {
                    eCFieldElement = null;
                }
            }
            if (eCFieldElement != null) {
                return createRawPoint(fromBigInteger, eCFieldElement);
            }
            throw new IllegalArgumentException(StubApp.getString2(27513));
        }

        public synchronized BigInteger[] getSi() {
            try {
                if (this.si == null) {
                    this.si = Tnaf.getSi(this);
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.si;
        }

        public boolean isKoblitz() {
            if (this.order == null || this.cofactor == null || !this.f19180b.isOne()) {
                return false;
            }
            return this.f19179a.isZero() || this.f19179a.isOne();
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public boolean isValidFieldElement(BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.bitLength() <= getFieldSize();
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECFieldElement randomFieldElement(SecureRandom secureRandom) {
            return fromBigInteger(BigIntegers.createRandomBigInteger(getFieldSize(), secureRandom));
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECFieldElement randomFieldElementMult(SecureRandom secureRandom) {
            int fieldSize = getFieldSize();
            return fromBigInteger(implRandomFieldElementMult(secureRandom, fieldSize)).multiply(fromBigInteger(implRandomFieldElementMult(secureRandom, fieldSize)));
        }

        public ECFieldElement solveQuadraticEquation(ECFieldElement eCFieldElement) {
            ECFieldElement eCFieldElement2;
            ECFieldElement.AbstractF2m abstractF2m = (ECFieldElement.AbstractF2m) eCFieldElement;
            boolean hasFastTrace = abstractF2m.hasFastTrace();
            if (hasFastTrace && abstractF2m.trace() != 0) {
                return null;
            }
            int fieldSize = getFieldSize();
            if ((fieldSize & 1) != 0) {
                ECFieldElement halfTrace = abstractF2m.halfTrace();
                if (hasFastTrace || halfTrace.square().add(halfTrace).add(eCFieldElement).isZero()) {
                    return halfTrace;
                }
                return null;
            }
            if (eCFieldElement.isZero()) {
                return eCFieldElement;
            }
            ECFieldElement fromBigInteger = fromBigInteger(ECConstants.ZERO);
            Random random = new Random();
            do {
                ECFieldElement fromBigInteger2 = fromBigInteger(new BigInteger(fieldSize, random));
                ECFieldElement eCFieldElement3 = eCFieldElement;
                eCFieldElement2 = fromBigInteger;
                for (int i3 = 1; i3 < fieldSize; i3++) {
                    ECFieldElement square = eCFieldElement3.square();
                    eCFieldElement2 = eCFieldElement2.square().add(square.multiply(fromBigInteger2));
                    eCFieldElement3 = square.add(eCFieldElement);
                }
                if (!eCFieldElement3.isZero()) {
                    return null;
                }
            } while (eCFieldElement2.square().add(eCFieldElement2).isZero());
            return eCFieldElement2;
        }
    }

    public static abstract class AbstractFp extends ECCurve {
        public AbstractFp(BigInteger bigInteger) {
            super(FiniteFields.getPrimeField(bigInteger));
        }

        private static BigInteger implRandomFieldElement(SecureRandom secureRandom, BigInteger bigInteger) {
            BigInteger createRandomBigInteger;
            do {
                createRandomBigInteger = BigIntegers.createRandomBigInteger(bigInteger.bitLength(), secureRandom);
            } while (createRandomBigInteger.compareTo(bigInteger) >= 0);
            return createRandomBigInteger;
        }

        private static BigInteger implRandomFieldElementMult(SecureRandom secureRandom, BigInteger bigInteger) {
            while (true) {
                BigInteger createRandomBigInteger = BigIntegers.createRandomBigInteger(bigInteger.bitLength(), secureRandom);
                if (createRandomBigInteger.signum() > 0 && createRandomBigInteger.compareTo(bigInteger) < 0) {
                    return createRandomBigInteger;
                }
            }
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint decompressPoint(int i3, BigInteger bigInteger) {
            ECFieldElement fromBigInteger = fromBigInteger(bigInteger);
            ECFieldElement sqrt = fromBigInteger.square().add(this.f19179a).multiply(fromBigInteger).add(this.f19180b).sqrt();
            if (sqrt == null) {
                throw new IllegalArgumentException(StubApp.getString2(27513));
            }
            if (sqrt.testBitZero() != (i3 == 1)) {
                sqrt = sqrt.negate();
            }
            return createRawPoint(fromBigInteger, sqrt);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public boolean isValidFieldElement(BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.compareTo(getField().getCharacteristic()) < 0;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECFieldElement randomFieldElement(SecureRandom secureRandom) {
            BigInteger characteristic = getField().getCharacteristic();
            return fromBigInteger(implRandomFieldElement(secureRandom, characteristic)).multiply(fromBigInteger(implRandomFieldElement(secureRandom, characteristic)));
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECFieldElement randomFieldElementMult(SecureRandom secureRandom) {
            BigInteger characteristic = getField().getCharacteristic();
            return fromBigInteger(implRandomFieldElementMult(secureRandom, characteristic)).multiply(fromBigInteger(implRandomFieldElementMult(secureRandom, characteristic)));
        }
    }

    public class Config {
        protected int coord;
        protected ECEndomorphism endomorphism;
        protected ECMultiplier multiplier;

        public Config(int i3, ECEndomorphism eCEndomorphism, ECMultiplier eCMultiplier) {
            this.coord = i3;
            this.endomorphism = eCEndomorphism;
            this.multiplier = eCMultiplier;
        }

        public ECCurve create() {
            if (!ECCurve.this.supportsCoordinateSystem(this.coord)) {
                throw new IllegalStateException(StubApp.getString2(32894));
            }
            ECCurve cloneCurve = ECCurve.this.cloneCurve();
            if (cloneCurve == ECCurve.this) {
                throw new IllegalStateException(StubApp.getString2(32893));
            }
            synchronized (cloneCurve) {
                cloneCurve.coord = this.coord;
                cloneCurve.endomorphism = this.endomorphism;
                cloneCurve.multiplier = this.multiplier;
            }
            return cloneCurve;
        }

        public Config setCoordinateSystem(int i3) {
            this.coord = i3;
            return this;
        }

        public Config setEndomorphism(ECEndomorphism eCEndomorphism) {
            this.endomorphism = eCEndomorphism;
            return this;
        }

        public Config setMultiplier(ECMultiplier eCMultiplier) {
            this.multiplier = eCMultiplier;
            return this;
        }
    }

    public static class F2m extends AbstractF2m {
        private static final int F2M_DEFAULT_COORDS = 6;
        private ECPoint.F2m infinity;

        /* renamed from: k1, reason: collision with root package name */
        private int f19181k1;

        /* renamed from: k2, reason: collision with root package name */
        private int f19182k2;
        private int k3;

        /* renamed from: m, reason: collision with root package name */
        private int f19183m;

        public F2m(int i3, int i10, int i11, int i12, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i3, i10, i11, i12, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECCurve cloneCurve() {
            return new F2m(this.f19183m, this.f19181k1, this.f19182k2, this.k3, this.f19179a, this.f19180b, this.order, this.cofactor);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i3, final int i10) {
            final int i11 = (this.f19183m + 63) >>> 6;
            final int[] iArr = isTrinomial() ? new int[]{this.f19181k1} : new int[]{this.f19181k1, this.f19182k2, this.k3};
            final long[] jArr = new long[i10 * i11 * 2];
            int i12 = 0;
            for (int i13 = 0; i13 < i10; i13++) {
                ECPoint eCPoint = eCPointArr[i3 + i13];
                ((ECFieldElement.F2m) eCPoint.getRawXCoord()).f19187x.copyTo(jArr, i12);
                int i14 = i12 + i11;
                ((ECFieldElement.F2m) eCPoint.getRawYCoord()).f19187x.copyTo(jArr, i14);
                i12 = i14 + i11;
            }
            return new AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.ECCurve.F2m.1
                private ECPoint createPoint(long[] jArr2, long[] jArr3) {
                    return F2m.this.createRawPoint(new ECFieldElement.F2m(F2m.this.f19183m, iArr, new LongArray(jArr2)), new ECFieldElement.F2m(F2m.this.f19183m, iArr, new LongArray(jArr3)));
                }

                @Override // org.bouncycastle.math.ec.ECLookupTable
                public int getSize() {
                    return i10;
                }

                @Override // org.bouncycastle.math.ec.ECLookupTable
                public ECPoint lookup(int i15) {
                    int i16;
                    long[] create64 = Nat.create64(i11);
                    long[] create642 = Nat.create64(i11);
                    int i17 = 0;
                    for (int i18 = 0; i18 < i10; i18++) {
                        long j = ((i18 ^ i15) - 1) >> 31;
                        int i19 = 0;
                        while (true) {
                            i16 = i11;
                            if (i19 < i16) {
                                long j3 = create64[i19];
                                long[] jArr2 = jArr;
                                create64[i19] = j3 ^ (jArr2[i17 + i19] & j);
                                create642[i19] = create642[i19] ^ (jArr2[(i16 + i17) + i19] & j);
                                i19++;
                            }
                        }
                        i17 += i16 * 2;
                    }
                    return createPoint(create64, create642);
                }

                @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
                public ECPoint lookupVar(int i15) {
                    long[] create64 = Nat.create64(i11);
                    long[] create642 = Nat.create64(i11);
                    int i16 = i15 * i11 * 2;
                    int i17 = 0;
                    while (true) {
                        int i18 = i11;
                        if (i17 >= i18) {
                            return createPoint(create64, create642);
                        }
                        long[] jArr2 = jArr;
                        create64[i17] = jArr2[i16 + i17];
                        create642[i17] = jArr2[i18 + i16 + i17];
                        i17++;
                    }
                }
            };
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECMultiplier createDefaultMultiplier() {
            return isKoblitz() ? new WTauNafMultiplier() : super.createDefaultMultiplier();
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            return new ECPoint.F2m(this, eCFieldElement, eCFieldElement2);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECFieldElement fromBigInteger(BigInteger bigInteger) {
            if (bigInteger != null && bigInteger.signum() >= 0) {
                int bitLength = bigInteger.bitLength();
                int i3 = this.f19183m;
                if (bitLength <= i3) {
                    int i10 = this.f19182k2;
                    int i11 = this.k3;
                    return new ECFieldElement.F2m(i3, (i10 | i11) == 0 ? new int[]{this.f19181k1} : new int[]{this.f19181k1, i10, i11}, new LongArray(bigInteger));
                }
            }
            throw new IllegalArgumentException(StubApp.getString2(32895));
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public int getFieldSize() {
            return this.f19183m;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint getInfinity() {
            return this.infinity;
        }

        public int getK1() {
            return this.f19181k1;
        }

        public int getK2() {
            return this.f19182k2;
        }

        public int getK3() {
            return this.k3;
        }

        public int getM() {
            return this.f19183m;
        }

        public boolean isTrinomial() {
            return this.f19182k2 == 0 && this.k3 == 0;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public boolean supportsCoordinateSystem(int i3) {
            return i3 == 0 || i3 == 1 || i3 == 6;
        }

        public F2m(int i3, int i10, int i11, int i12, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(i3, i10, i11, i12);
            this.f19183m = i3;
            this.f19181k1 = i10;
            this.f19182k2 = i11;
            this.k3 = i12;
            this.order = bigInteger3;
            this.cofactor = bigInteger4;
            this.infinity = new ECPoint.F2m(this, null, null);
            this.f19179a = fromBigInteger(bigInteger);
            this.f19180b = fromBigInteger(bigInteger2);
            this.coord = 6;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
            return new ECPoint.F2m(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        }

        public F2m(int i3, int i10, int i11, int i12, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, BigInteger bigInteger, BigInteger bigInteger2) {
            super(i3, i10, i11, i12);
            this.f19183m = i3;
            this.f19181k1 = i10;
            this.f19182k2 = i11;
            this.k3 = i12;
            this.order = bigInteger;
            this.cofactor = bigInteger2;
            this.infinity = new ECPoint.F2m(this, null, null);
            this.f19179a = eCFieldElement;
            this.f19180b = eCFieldElement2;
            this.coord = 6;
        }

        public F2m(int i3, int i10, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i3, i10, 0, 0, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        public F2m(int i3, int i10, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            this(i3, i10, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
        }
    }

    public static class Fp extends AbstractFp {
        private static final int FP_DEFAULT_COORDS = 4;
        private static final Set<BigInteger> knownQs = Collections.synchronizedSet(new HashSet());
        private static final BigIntegers.Cache validatedQs = new BigIntegers.Cache();
        ECPoint.Fp infinity;

        /* renamed from: q, reason: collision with root package name */
        BigInteger f19184q;

        /* renamed from: r, reason: collision with root package name */
        BigInteger f19185r;

        public Fp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            this(bigInteger, bigInteger2, bigInteger3, null, null);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECCurve cloneCurve() {
            return new Fp(this.f19184q, this.f19185r, this.f19179a, this.f19180b, this.order, this.cofactor);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            return new ECPoint.Fp(this, eCFieldElement, eCFieldElement2);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECFieldElement fromBigInteger(BigInteger bigInteger) {
            if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(this.f19184q) >= 0) {
                throw new IllegalArgumentException(StubApp.getString2(32900));
            }
            return new ECFieldElement.Fp(this.f19184q, this.f19185r, bigInteger);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public int getFieldSize() {
            return this.f19184q.bitLength();
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint getInfinity() {
            return this.infinity;
        }

        public BigInteger getQ() {
            return this.f19184q;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint importPoint(ECPoint eCPoint) {
            int coordinateSystem;
            return (this == eCPoint.getCurve() || getCoordinateSystem() != 2 || eCPoint.isInfinity() || !((coordinateSystem = eCPoint.getCurve().getCoordinateSystem()) == 2 || coordinateSystem == 3 || coordinateSystem == 4)) ? super.importPoint(eCPoint) : new ECPoint.Fp(this, fromBigInteger(eCPoint.f19191x.toBigInteger()), fromBigInteger(eCPoint.f19192y.toBigInteger()), new ECFieldElement[]{fromBigInteger(eCPoint.zs[0].toBigInteger())});
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public boolean supportsCoordinateSystem(int i3) {
            return i3 == 0 || i3 == 1 || i3 == 2 || i3 == 4;
        }

        public Fp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
            this(bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5, false);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
            return new ECPoint.Fp(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        }

        public Fp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, boolean z2) {
            super(bigInteger);
            if (z2) {
                this.f19184q = bigInteger;
                knownQs.add(bigInteger);
            } else {
                if (!knownQs.contains(bigInteger)) {
                    BigIntegers.Cache cache = validatedQs;
                    if (!cache.contains(bigInteger)) {
                        int asInteger = Properties.asInteger(StubApp.getString2(32896), 1042);
                        int asInteger2 = Properties.asInteger(StubApp.getString2(32897), 100);
                        int bitLength = bigInteger.bitLength();
                        if (asInteger < bitLength) {
                            throw new IllegalArgumentException(StubApp.getString2(32899));
                        }
                        if (Primes.hasAnySmallFactors(bigInteger) || !Primes.isMRProbablePrime(bigInteger, CryptoServicesRegistrar.getSecureRandom(), ECCurve.getNumberOfIterations(bitLength, asInteger2))) {
                            throw new IllegalArgumentException(StubApp.getString2(32898));
                        }
                        cache.add(bigInteger);
                    }
                }
                this.f19184q = bigInteger;
            }
            this.f19185r = ECFieldElement.Fp.calculateResidue(bigInteger);
            this.infinity = new ECPoint.Fp(this, null, null);
            this.f19179a = fromBigInteger(bigInteger2);
            this.f19180b = fromBigInteger(bigInteger3);
            this.order = bigInteger4;
            this.cofactor = bigInteger5;
            this.coord = 4;
        }

        public Fp(BigInteger bigInteger, BigInteger bigInteger2, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(bigInteger);
            this.f19184q = bigInteger;
            this.f19185r = bigInteger2;
            this.infinity = new ECPoint.Fp(this, null, null);
            this.f19179a = eCFieldElement;
            this.f19180b = eCFieldElement2;
            this.order = bigInteger3;
            this.cofactor = bigInteger4;
            this.coord = 4;
        }
    }

    public ECCurve(FiniteField finiteField) {
        this.field = finiteField;
    }

    public static int[] getAllCoordinateSystems() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getNumberOfIterations(int i3, int i10) {
        if (i3 >= 1536) {
            if (i10 <= 100) {
                return 3;
            }
            if (i10 <= 128) {
                return 4;
            }
            return u.c(i10, CertificateBody.profileType, 2, 4);
        }
        if (i3 >= 1024) {
            if (i10 <= 100) {
                return 4;
            }
            if (i10 <= 112) {
                return 5;
            }
            return u.c(i10, 111, 2, 5);
        }
        if (i3 < 512) {
            if (i10 <= 80) {
                return 40;
            }
            return u.c(i10, 79, 2, 40);
        }
        if (i10 <= 80) {
            return 5;
        }
        if (i10 <= 100) {
            return 7;
        }
        return u.c(i10, 99, 2, 7);
    }

    public void checkPoint(ECPoint eCPoint) {
        if (eCPoint == null || this != eCPoint.getCurve()) {
            throw new IllegalArgumentException(StubApp.getString2(32901));
        }
    }

    public void checkPoints(ECPoint[] eCPointArr) {
        checkPoints(eCPointArr, 0, eCPointArr.length);
    }

    public abstract ECCurve cloneCurve();

    public synchronized Config configure() {
        return new Config(this.coord, this.endomorphism, this.multiplier);
    }

    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i3, final int i10) {
        final int fieldSize = (getFieldSize() + 7) >>> 3;
        final byte[] bArr = new byte[i10 * fieldSize * 2];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            ECPoint eCPoint = eCPointArr[i3 + i12];
            byte[] byteArray = eCPoint.getRawXCoord().toBigInteger().toByteArray();
            byte[] byteArray2 = eCPoint.getRawYCoord().toBigInteger().toByteArray();
            int i13 = 1;
            int i14 = byteArray.length > fieldSize ? 1 : 0;
            int length = byteArray.length - i14;
            if (byteArray2.length <= fieldSize) {
                i13 = 0;
            }
            int length2 = byteArray2.length - i13;
            int i15 = i11 + fieldSize;
            System.arraycopy(byteArray, i14, bArr, i15 - length, length);
            i11 = i15 + fieldSize;
            System.arraycopy(byteArray2, i13, bArr, i11 - length2, length2);
        }
        return new AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.ECCurve.1
            private ECPoint createPoint(byte[] bArr2, byte[] bArr3) {
                ECCurve eCCurve = ECCurve.this;
                return eCCurve.createRawPoint(eCCurve.fromBigInteger(new BigInteger(1, bArr2)), ECCurve.this.fromBigInteger(new BigInteger(1, bArr3)));
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public int getSize() {
                return i10;
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookup(int i16) {
                int i17;
                int i18 = fieldSize;
                byte[] bArr2 = new byte[i18];
                byte[] bArr3 = new byte[i18];
                int i19 = 0;
                for (int i20 = 0; i20 < i10; i20++) {
                    int i21 = ((i20 ^ i16) - 1) >> 31;
                    int i22 = 0;
                    while (true) {
                        i17 = fieldSize;
                        if (i22 < i17) {
                            byte b2 = bArr2[i22];
                            byte[] bArr4 = bArr;
                            bArr2[i22] = (byte) (b2 ^ (bArr4[i19 + i22] & i21));
                            bArr3[i22] = (byte) ((bArr4[(i17 + i19) + i22] & i21) ^ bArr3[i22]);
                            i22++;
                        }
                    }
                    i19 += i17 * 2;
                }
                return createPoint(bArr2, bArr3);
            }

            @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookupVar(int i16) {
                int i17 = fieldSize;
                byte[] bArr2 = new byte[i17];
                byte[] bArr3 = new byte[i17];
                int i18 = i16 * i17 * 2;
                int i19 = 0;
                while (true) {
                    int i20 = fieldSize;
                    if (i19 >= i20) {
                        return createPoint(bArr2, bArr3);
                    }
                    byte[] bArr4 = bArr;
                    bArr2[i19] = bArr4[i18 + i19];
                    bArr3[i19] = bArr4[i20 + i18 + i19];
                    i19++;
                }
            }
        };
    }

    public ECMultiplier createDefaultMultiplier() {
        ECEndomorphism eCEndomorphism = this.endomorphism;
        return eCEndomorphism instanceof GLVEndomorphism ? new GLVMultiplier(this, (GLVEndomorphism) eCEndomorphism) : new WNafL2RMultiplier();
    }

    public ECPoint createPoint(BigInteger bigInteger, BigInteger bigInteger2) {
        return createRawPoint(fromBigInteger(bigInteger), fromBigInteger(bigInteger2));
    }

    public abstract ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2);

    public abstract ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr);

    public ECPoint decodePoint(byte[] bArr) {
        ECPoint infinity;
        int fieldSize = (getFieldSize() + 7) / 8;
        byte b2 = bArr[0];
        if (b2 != 0) {
            if (b2 == 2 || b2 == 3) {
                if (bArr.length != fieldSize + 1) {
                    throw new IllegalArgumentException(StubApp.getString2(32909));
                }
                infinity = decompressPoint(b2 & 1, BigIntegers.fromUnsignedByteArray(bArr, 1, fieldSize));
                if (!infinity.implIsValid(true, true)) {
                    throw new IllegalArgumentException(StubApp.getString2(32892));
                }
            } else if (b2 != 4) {
                if (b2 != 6 && b2 != 7) {
                    throw new IllegalArgumentException(StubApp.getString2(32905) + Integer.toString(b2, 16));
                }
                if (bArr.length != (fieldSize * 2) + 1) {
                    throw new IllegalArgumentException(StubApp.getString2(32907));
                }
                BigInteger fromUnsignedByteArray = BigIntegers.fromUnsignedByteArray(bArr, 1, fieldSize);
                BigInteger fromUnsignedByteArray2 = BigIntegers.fromUnsignedByteArray(bArr, fieldSize + 1, fieldSize);
                if (fromUnsignedByteArray2.testBit(0) != (b2 == 7)) {
                    throw new IllegalArgumentException(StubApp.getString2(32906));
                }
                infinity = validatePoint(fromUnsignedByteArray, fromUnsignedByteArray2);
            } else {
                if (bArr.length != (fieldSize * 2) + 1) {
                    throw new IllegalArgumentException(StubApp.getString2(32908));
                }
                infinity = validatePoint(BigIntegers.fromUnsignedByteArray(bArr, 1, fieldSize), BigIntegers.fromUnsignedByteArray(bArr, fieldSize + 1, fieldSize));
            }
        } else {
            if (bArr.length != 1) {
                throw new IllegalArgumentException(StubApp.getString2(32911));
            }
            infinity = getInfinity();
        }
        if (b2 == 0 || !infinity.isInfinity()) {
            return infinity;
        }
        throw new IllegalArgumentException(StubApp.getString2(32910));
    }

    public abstract ECPoint decompressPoint(int i3, BigInteger bigInteger);

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ECCurve) && equals((ECCurve) obj);
        }
        return true;
    }

    public abstract ECFieldElement fromBigInteger(BigInteger bigInteger);

    public ECFieldElement getA() {
        return this.f19179a;
    }

    public ECFieldElement getB() {
        return this.f19180b;
    }

    public BigInteger getCofactor() {
        return this.cofactor;
    }

    public int getCoordinateSystem() {
        return this.coord;
    }

    public ECEndomorphism getEndomorphism() {
        return this.endomorphism;
    }

    public FiniteField getField() {
        return this.field;
    }

    public abstract int getFieldSize();

    public abstract ECPoint getInfinity();

    public ECMultiplier getMultiplier() {
        if (this.multiplier == null) {
            this.multiplier = createDefaultMultiplier();
        }
        return this.multiplier;
    }

    public BigInteger getOrder() {
        return this.order;
    }

    public PreCompInfo getPreCompInfo(ECPoint eCPoint, String str) {
        Hashtable hashtable;
        PreCompInfo preCompInfo;
        checkPoint(eCPoint);
        synchronized (eCPoint) {
            hashtable = eCPoint.preCompTable;
        }
        if (hashtable == null) {
            return null;
        }
        synchronized (hashtable) {
            preCompInfo = (PreCompInfo) hashtable.get(str);
        }
        return preCompInfo;
    }

    public int hashCode() {
        return (getField().hashCode() ^ Integers.rotateLeft(getA().toBigInteger().hashCode(), 8)) ^ Integers.rotateLeft(getB().toBigInteger().hashCode(), 16);
    }

    public ECPoint importPoint(ECPoint eCPoint) {
        if (this == eCPoint.getCurve()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return getInfinity();
        }
        ECPoint normalize = eCPoint.normalize();
        return createPoint(normalize.getXCoord().toBigInteger(), normalize.getYCoord().toBigInteger());
    }

    public abstract boolean isValidFieldElement(BigInteger bigInteger);

    public void normalizeAll(ECPoint[] eCPointArr) {
        normalizeAll(eCPointArr, 0, eCPointArr.length, null);
    }

    public PreCompInfo precompute(ECPoint eCPoint, String str, PreCompCallback preCompCallback) {
        Hashtable hashtable;
        PreCompInfo precompute;
        checkPoint(eCPoint);
        synchronized (eCPoint) {
            try {
                hashtable = eCPoint.preCompTable;
                if (hashtable == null) {
                    hashtable = new Hashtable(4);
                    eCPoint.preCompTable = hashtable;
                }
            } finally {
            }
        }
        synchronized (hashtable) {
            try {
                PreCompInfo preCompInfo = (PreCompInfo) hashtable.get(str);
                precompute = preCompCallback.precompute(preCompInfo);
                if (precompute != preCompInfo) {
                    hashtable.put(str, precompute);
                }
            } finally {
            }
        }
        return precompute;
    }

    public abstract ECFieldElement randomFieldElement(SecureRandom secureRandom);

    public abstract ECFieldElement randomFieldElementMult(SecureRandom secureRandom);

    public boolean supportsCoordinateSystem(int i3) {
        return i3 == 0;
    }

    public ECPoint validatePoint(BigInteger bigInteger, BigInteger bigInteger2) {
        ECPoint createPoint = createPoint(bigInteger, bigInteger2);
        if (createPoint.isValid()) {
            return createPoint;
        }
        throw new IllegalArgumentException(StubApp.getString2(32913));
    }

    public void checkPoints(ECPoint[] eCPointArr, int i3, int i10) {
        if (eCPointArr == null) {
            throw new IllegalArgumentException(StubApp.getString2(32904));
        }
        if (i3 < 0 || i10 < 0 || i3 > eCPointArr.length - i10) {
            throw new IllegalArgumentException(StubApp.getString2(32903));
        }
        for (int i11 = 0; i11 < i10; i11++) {
            ECPoint eCPoint = eCPointArr[i3 + i11];
            if (eCPoint != null && this != eCPoint.getCurve()) {
                throw new IllegalArgumentException(StubApp.getString2(32902));
            }
        }
    }

    public boolean equals(ECCurve eCCurve) {
        if (this != eCCurve) {
            return eCCurve != null && getField().equals(eCCurve.getField()) && getA().toBigInteger().equals(eCCurve.getA().toBigInteger()) && getB().toBigInteger().equals(eCCurve.getB().toBigInteger());
        }
        return true;
    }

    public void normalizeAll(ECPoint[] eCPointArr, int i3, int i10, ECFieldElement eCFieldElement) {
        checkPoints(eCPointArr, i3, i10);
        int coordinateSystem = getCoordinateSystem();
        if (coordinateSystem == 0 || coordinateSystem == 5) {
            if (eCFieldElement != null) {
                throw new IllegalArgumentException(StubApp.getString2(32912));
            }
            return;
        }
        ECFieldElement[] eCFieldElementArr = new ECFieldElement[i10];
        int[] iArr = new int[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = i3 + i12;
            ECPoint eCPoint = eCPointArr[i13];
            if (eCPoint != null && (eCFieldElement != null || !eCPoint.isNormalized())) {
                eCFieldElementArr[i11] = eCPoint.getZCoord(0);
                iArr[i11] = i13;
                i11++;
            }
        }
        if (i11 == 0) {
            return;
        }
        ECAlgorithms.montgomeryTrick(eCFieldElementArr, 0, i11, eCFieldElement);
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = iArr[i14];
            eCPointArr[i15] = eCPointArr[i15].normalize(eCFieldElementArr[i14]);
        }
    }
}
