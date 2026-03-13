package org.bouncycastle.pqc.legacy.math.linearalgebra;

import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class BigIntUtils {
    private BigIntUtils() {
    }

    public static boolean equals(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2) {
        if (bigIntegerArr.length != bigIntegerArr2.length) {
            return false;
        }
        int i3 = 0;
        for (int i10 = 0; i10 < bigIntegerArr.length; i10++) {
            i3 |= bigIntegerArr[i10].compareTo(bigIntegerArr2[i10]);
        }
        return i3 == 0;
    }

    public static void fill(BigInteger[] bigIntegerArr, BigInteger bigInteger) {
        for (int length = bigIntegerArr.length - 1; length >= 0; length--) {
            bigIntegerArr[length] = bigInteger;
        }
    }

    public static BigInteger[] subArray(BigInteger[] bigIntegerArr, int i3, int i10) {
        int i11 = i10 - i3;
        BigInteger[] bigIntegerArr2 = new BigInteger[i11];
        System.arraycopy(bigIntegerArr, i3, bigIntegerArr2, 0, i11);
        return bigIntegerArr2;
    }

    public static int[] toIntArray(BigInteger[] bigIntegerArr) {
        int[] iArr = new int[bigIntegerArr.length];
        for (int i3 = 0; i3 < bigIntegerArr.length; i3++) {
            iArr[i3] = bigIntegerArr[i3].intValue();
        }
        return iArr;
    }

    public static int[] toIntArrayModQ(int i3, BigInteger[] bigIntegerArr) {
        BigInteger valueOf = BigInteger.valueOf(i3);
        int[] iArr = new int[bigIntegerArr.length];
        for (int i10 = 0; i10 < bigIntegerArr.length; i10++) {
            iArr[i10] = bigIntegerArr[i10].mod(valueOf).intValue();
        }
        return iArr;
    }

    public static byte[] toMinimalByteArray(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == 1 || (bigInteger.bitLength() & 7) != 0) {
            return byteArray;
        }
        int bitLength = bigInteger.bitLength() >> 3;
        byte[] bArr = new byte[bitLength];
        System.arraycopy(byteArray, 1, bArr, 0, bitLength);
        return bArr;
    }
}
