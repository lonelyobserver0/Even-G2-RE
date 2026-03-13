package org.bouncycastle.pqc.legacy.crypto.mceliece;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.pqc.legacy.math.linearalgebra.BigIntUtils;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Vector;
import org.bouncycastle.pqc.legacy.math.linearalgebra.IntegerFunctions;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
final class Conversions {
    private static final BigInteger ZERO = BigInteger.valueOf(0);
    private static final BigInteger ONE = BigInteger.valueOf(1);

    private Conversions() {
    }

    public static byte[] decode(int i3, int i10, GF2Vector gF2Vector) {
        if (gF2Vector.getLength() != i3 || gF2Vector.getHammingWeight() != i10) {
            throw new IllegalArgumentException(StubApp.getString2(34775));
        }
        int[] vecArray = gF2Vector.getVecArray();
        BigInteger binomial = IntegerFunctions.binomial(i3, i10);
        BigInteger bigInteger = ZERO;
        int i11 = i3;
        for (int i12 = 0; i12 < i3; i12++) {
            binomial = binomial.multiply(BigInteger.valueOf(i11 - i10)).divide(BigInteger.valueOf(i11));
            i11--;
            if ((vecArray[i12 >> 5] & (1 << (i12 & 31))) != 0) {
                bigInteger = bigInteger.add(binomial);
                int i13 = i10 - 1;
                binomial = i11 == i13 ? ONE : binomial.multiply(BigInteger.valueOf(i10)).divide(BigInteger.valueOf(i11 - i13));
                i10 = i13;
            }
        }
        return BigIntUtils.toMinimalByteArray(bigInteger);
    }

    public static GF2Vector encode(int i3, int i10, byte[] bArr) {
        if (i3 < i10) {
            throw new IllegalArgumentException(StubApp.getString2(34777));
        }
        BigInteger binomial = IntegerFunctions.binomial(i3, i10);
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(binomial) >= 0) {
            throw new IllegalArgumentException(StubApp.getString2(34776));
        }
        GF2Vector gF2Vector = new GF2Vector(i3);
        int i11 = i3;
        for (int i12 = 0; i12 < i3; i12++) {
            binomial = binomial.multiply(BigInteger.valueOf(i11 - i10)).divide(BigInteger.valueOf(i11));
            i11--;
            if (binomial.compareTo(bigInteger) <= 0) {
                gF2Vector.setBit(i12);
                bigInteger = bigInteger.subtract(binomial);
                int i13 = i10 - 1;
                binomial = i11 == i13 ? ONE : binomial.multiply(BigInteger.valueOf(i10)).divide(BigInteger.valueOf(i11 - i13));
                i10 = i13;
            }
        }
        return gF2Vector;
    }

    public static byte[] signConversion(int i3, int i10, byte[] bArr) {
        if (i3 < i10) {
            throw new IllegalArgumentException(StubApp.getString2(34777));
        }
        BigInteger binomial = IntegerFunctions.binomial(i3, i10);
        int bitLength = binomial.bitLength() - 1;
        int i11 = bitLength >> 3;
        int i12 = bitLength & 7;
        int i13 = 8;
        if (i12 == 0) {
            i11--;
            i12 = 8;
        }
        int i14 = i3 >> 3;
        int i15 = i3 & 7;
        if (i15 == 0) {
            i14--;
        } else {
            i13 = i15;
        }
        int i16 = i14 + 1;
        byte[] bArr2 = new byte[i16];
        if (bArr.length < i16) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            for (int length = bArr.length; length < i16; length++) {
                bArr2[length] = 0;
            }
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, i14);
            bArr2[i14] = (byte) (bArr[i14] & ((1 << i13) - 1));
        }
        BigInteger bigInteger = ZERO;
        int i17 = i3;
        for (int i18 = 0; i18 < i3; i18++) {
            binomial = binomial.multiply(new BigInteger(Integer.toString(i17 - i10))).divide(new BigInteger(Integer.toString(i17)));
            i17--;
            if (((byte) (bArr2[i18 >>> 3] & (1 << (i18 & 7)))) != 0) {
                bigInteger = bigInteger.add(binomial);
                int i19 = i10 - 1;
                binomial = i17 == i19 ? ONE : binomial.multiply(new BigInteger(Integer.toString(i10))).divide(new BigInteger(Integer.toString(i17 - i19)));
                i10 = i19;
            }
        }
        int i20 = i11 + 1;
        byte[] bArr3 = new byte[i20];
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length >= i20) {
            System.arraycopy(byteArray, 0, bArr3, 0, i11);
            bArr3[i11] = (byte) (((1 << i12) - 1) & byteArray[i11]);
            return bArr3;
        }
        System.arraycopy(byteArray, 0, bArr3, 0, byteArray.length);
        for (int length2 = byteArray.length; length2 < i20; length2++) {
            bArr3[length2] = 0;
        }
        return bArr3;
    }
}
