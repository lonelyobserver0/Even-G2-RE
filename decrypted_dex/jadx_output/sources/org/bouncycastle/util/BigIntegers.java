package org.bouncycastle.util;

import com.stub.StubApp;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Map;
import java.util.WeakHashMap;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class BigIntegers {
    private static final int MAX_ITERATIONS = 1000;
    public static final BigInteger ZERO = BigInteger.valueOf(0);
    public static final BigInteger ONE = BigInteger.valueOf(1);
    public static final BigInteger TWO = BigInteger.valueOf(2);
    private static final BigInteger THREE = BigInteger.valueOf(3);
    private static final BigInteger SMALL_PRIMES_PRODUCT = new BigInteger(StubApp.getString2(29226), 16);
    private static final int MAX_SMALL = BigInteger.valueOf(743).bitLength();

    public static class Cache {
        private final Map<BigInteger, Boolean> values = new WeakHashMap();
        private final BigInteger[] preserve = new BigInteger[8];
        private int preserveCounter = 0;

        public synchronized void add(BigInteger bigInteger) {
            this.values.put(bigInteger, Boolean.TRUE);
            BigInteger[] bigIntegerArr = this.preserve;
            int i3 = this.preserveCounter;
            bigIntegerArr[i3] = bigInteger;
            this.preserveCounter = (i3 + 1) % bigIntegerArr.length;
        }

        public synchronized void clear() {
            this.values.clear();
            int i3 = 0;
            while (true) {
                BigInteger[] bigIntegerArr = this.preserve;
                if (i3 != bigIntegerArr.length) {
                    bigIntegerArr[i3] = null;
                    i3++;
                }
            }
        }

        public synchronized boolean contains(BigInteger bigInteger) {
            return this.values.containsKey(bigInteger);
        }

        public synchronized int size() {
            return this.values.size();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
    
        if (r3.length != 1) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void asUnsignedByteArray(java.math.BigInteger r3, byte[] r4, int r5, int r6) {
        /*
            byte[] r3 = r3.toByteArray()
            int r0 = r3.length
            r1 = 0
            if (r0 != r6) goto Lc
            java.lang.System.arraycopy(r3, r1, r4, r5, r6)
            return
        Lc:
            r0 = r3[r1]
            if (r0 != 0) goto L15
            int r0 = r3.length
            r2 = 1
            if (r0 == r2) goto L15
            goto L16
        L15:
            r2 = r1
        L16:
            int r0 = r3.length
            int r0 = r0 - r2
            if (r0 > r6) goto L23
            int r6 = r6 - r0
            int r6 = r6 + r5
            org.bouncycastle.util.Arrays.fill(r4, r5, r6, r1)
            java.lang.System.arraycopy(r3, r2, r4, r6, r0)
            return
        L23:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r4 = 34974(0x889e, float:4.9009E-41)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.util.BigIntegers.asUnsignedByteArray(java.math.BigInteger, byte[], int, int):void");
    }

    public static byte byteValueExact(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 7) {
            return bigInteger.byteValue();
        }
        throw new ArithmeticException(StubApp.getString2(34975));
    }

    private static byte[] createRandom(int i3, SecureRandom secureRandom) throws IllegalArgumentException {
        if (i3 < 1) {
            throw new IllegalArgumentException(StubApp.getString2(34976));
        }
        int i10 = (i3 + 7) / 8;
        byte[] bArr = new byte[i10];
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & ((byte) (255 >>> ((i10 * 8) - i3))));
        return bArr;
    }

    public static BigInteger createRandomBigInteger(int i3, SecureRandom secureRandom) {
        return new BigInteger(1, createRandom(i3, secureRandom));
    }

    public static BigInteger createRandomInRange(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        BigInteger createRandomBigInteger;
        int compareTo = bigInteger.compareTo(bigInteger2);
        if (compareTo >= 0) {
            if (compareTo <= 0) {
                return bigInteger;
            }
            throw new IllegalArgumentException(StubApp.getString2(34977));
        }
        if (bigInteger.bitLength() > bigInteger2.bitLength() / 2) {
            createRandomBigInteger = createRandomInRange(ZERO, bigInteger2.subtract(bigInteger), secureRandom);
        } else {
            for (int i3 = 0; i3 < MAX_ITERATIONS; i3++) {
                BigInteger createRandomBigInteger2 = createRandomBigInteger(bigInteger2.bitLength(), secureRandom);
                if (createRandomBigInteger2.compareTo(bigInteger) >= 0 && createRandomBigInteger2.compareTo(bigInteger2) <= 0) {
                    return createRandomBigInteger2;
                }
            }
            createRandomBigInteger = createRandomBigInteger(bigInteger2.subtract(bigInteger).bitLength() - 1, secureRandom);
        }
        return createRandomBigInteger.add(bigInteger);
    }

    public static BigInteger createRandomPrime(int i3, int i10, SecureRandom secureRandom) {
        BigInteger bigInteger;
        if (i3 < 2) {
            throw new IllegalArgumentException(StubApp.getString2(34978));
        }
        if (i3 == 2) {
            return secureRandom.nextInt() < 0 ? TWO : THREE;
        }
        do {
            byte[] createRandom = createRandom(i3, secureRandom);
            createRandom[0] = (byte) (((byte) (1 << (7 - ((createRandom.length * 8) - i3)))) | createRandom[0]);
            int length = createRandom.length - 1;
            createRandom[length] = (byte) (createRandom[length] | 1);
            bigInteger = new BigInteger(1, createRandom);
            if (i3 > MAX_SMALL) {
                while (!bigInteger.gcd(SMALL_PRIMES_PRODUCT).equals(ONE)) {
                    bigInteger = bigInteger.add(TWO);
                }
            }
        } while (!bigInteger.isProbablePrime(i10));
        return bigInteger;
    }

    public static BigInteger fromUnsignedByteArray(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    public static int getUnsignedByteLength(BigInteger bigInteger) {
        if (bigInteger.equals(ZERO)) {
            return 1;
        }
        return (bigInteger.bitLength() + 7) / 8;
    }

    public static int intValueExact(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 31) {
            return bigInteger.intValue();
        }
        throw new ArithmeticException(StubApp.getString2(34975));
    }

    public static long longValueExact(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 63) {
            return bigInteger.longValue();
        }
        throw new ArithmeticException(StubApp.getString2(34979));
    }

    public static BigInteger modOddInverse(BigInteger bigInteger, BigInteger bigInteger2) {
        if (!bigInteger.testBit(0)) {
            throw new IllegalArgumentException(StubApp.getString2(34982));
        }
        if (bigInteger.signum() != 1) {
            throw new ArithmeticException(StubApp.getString2(34981));
        }
        if (bigInteger2.signum() < 0 || bigInteger2.compareTo(bigInteger) >= 0) {
            bigInteger2 = bigInteger2.mod(bigInteger);
        }
        int bitLength = bigInteger.bitLength();
        int[] fromBigInteger = Nat.fromBigInteger(bitLength, bigInteger);
        int[] fromBigInteger2 = Nat.fromBigInteger(bitLength, bigInteger2);
        int length = fromBigInteger.length;
        int[] create = Nat.create(length);
        if (Mod.modOddInverse(fromBigInteger, fromBigInteger2, create) != 0) {
            return Nat.toBigInteger(length, create);
        }
        throw new ArithmeticException(StubApp.getString2(34980));
    }

    public static BigInteger modOddInverseVar(BigInteger bigInteger, BigInteger bigInteger2) {
        if (!bigInteger.testBit(0)) {
            throw new IllegalArgumentException(StubApp.getString2(34982));
        }
        if (bigInteger.signum() != 1) {
            throw new ArithmeticException(StubApp.getString2(34981));
        }
        BigInteger bigInteger3 = ONE;
        if (bigInteger.equals(bigInteger3)) {
            return ZERO;
        }
        if (bigInteger2.signum() < 0 || bigInteger2.compareTo(bigInteger) >= 0) {
            bigInteger2 = bigInteger2.mod(bigInteger);
        }
        if (bigInteger2.equals(bigInteger3)) {
            return bigInteger3;
        }
        int bitLength = bigInteger.bitLength();
        int[] fromBigInteger = Nat.fromBigInteger(bitLength, bigInteger);
        int[] fromBigInteger2 = Nat.fromBigInteger(bitLength, bigInteger2);
        int length = fromBigInteger.length;
        int[] create = Nat.create(length);
        if (Mod.modOddInverseVar(fromBigInteger, fromBigInteger2, create)) {
            return Nat.toBigInteger(length, create);
        }
        throw new ArithmeticException(StubApp.getString2(34980));
    }

    public static short shortValueExact(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 15) {
            return bigInteger.shortValue();
        }
        throw new ArithmeticException(StubApp.getString2(34975));
    }

    public static byte[] asUnsignedByteArray(int i3, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i3) {
            return byteArray;
        }
        int i10 = 0;
        if (byteArray[0] == 0 && byteArray.length != 1) {
            i10 = 1;
        }
        int length = byteArray.length - i10;
        if (length > i3) {
            throw new IllegalArgumentException(StubApp.getString2(34974));
        }
        byte[] bArr = new byte[i3];
        System.arraycopy(byteArray, i10, bArr, i3 - length, length);
        return bArr;
    }

    public static BigInteger fromUnsignedByteArray(byte[] bArr, int i3, int i10) {
        if (i3 != 0 || i10 != bArr.length) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, i3, bArr2, 0, i10);
            bArr = bArr2;
        }
        return new BigInteger(1, bArr);
    }

    public static byte[] asUnsignedByteArray(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] != 0 || byteArray.length == 1) {
            return byteArray;
        }
        int length = byteArray.length - 1;
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 1, bArr, 0, length);
        return bArr;
    }
}
