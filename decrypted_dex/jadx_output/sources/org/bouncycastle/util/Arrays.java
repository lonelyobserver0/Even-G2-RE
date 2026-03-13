package org.bouncycastle.util;

import com.stub.StubApp;
import java.math.BigInteger;
import java.util.NoSuchElementException;
import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class Arrays {

    public static class Iterator<T> implements java.util.Iterator<T> {
        private final T[] dataArray;
        private int position = 0;

        public Iterator(T[] tArr) {
            this.dataArray = tArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.position < this.dataArray.length;
        }

        @Override // java.util.Iterator
        public T next() {
            int i3 = this.position;
            T[] tArr = this.dataArray;
            if (i3 != tArr.length) {
                this.position = i3 + 1;
                return tArr[i3];
            }
            throw new NoSuchElementException(StubApp.getString2(34968) + this.position);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(StubApp.getString2(34969));
        }
    }

    private Arrays() {
    }

    public static byte[] append(byte[] bArr, byte b2) {
        if (bArr == null) {
            return new byte[]{b2};
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[1 + length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        bArr2[length] = b2;
        return bArr2;
    }

    public static boolean areAllZeroes(byte[] bArr, int i3, int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 |= bArr[i3 + i12];
        }
        return i11 == 0;
    }

    public static boolean areEqual(byte[] bArr, int i3, int i10, byte[] bArr2, int i11, int i12) {
        int i13 = i10 - i3;
        if (i13 != i12 - i11) {
            return false;
        }
        for (int i14 = 0; i14 < i13; i14++) {
            if (bArr[i3 + i14] != bArr2[i11 + i14]) {
                return false;
            }
        }
        return true;
    }

    public static void clear(byte[] bArr) {
        if (bArr != null) {
            java.util.Arrays.fill(bArr, (byte) 0);
        }
    }

    public static byte[] clone(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public static int compareUnsigned(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        int min = Math.min(bArr.length, bArr2.length);
        for (int i3 = 0; i3 < min; i3++) {
            int i10 = bArr[i3] & UByte.MAX_VALUE;
            int i11 = bArr2[i3] & UByte.MAX_VALUE;
            if (i10 < i11) {
                return -1;
            }
            if (i10 > i11) {
                return 1;
            }
        }
        if (bArr.length < bArr2.length) {
            return -1;
        }
        return bArr.length > bArr2.length ? 1 : 0;
    }

    public static byte[] concatenate(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return clone(bArr2);
        }
        if (bArr2 == null) {
            return clone(bArr);
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static boolean constantTimeAreEqual(int i3, byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (bArr == null) {
            throw new NullPointerException(StubApp.getString2(34973));
        }
        if (bArr2 == null) {
            throw new NullPointerException(StubApp.getString2(34972));
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(29094));
        }
        if (i10 > bArr.length - i3) {
            throw new IndexOutOfBoundsException(StubApp.getString2(34971));
        }
        if (i11 > bArr2.length - i3) {
            throw new IndexOutOfBoundsException(StubApp.getString2(34970));
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i3; i13++) {
            i12 |= bArr[i10 + i13] ^ bArr2[i11 + i13];
        }
        return i12 == 0;
    }

    public static boolean contains(byte[] bArr, byte b2) {
        for (byte b10 : bArr) {
            if (b10 == b2) {
                return true;
            }
        }
        return false;
    }

    public static byte[] copyOf(byte[] bArr, int i3) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i3));
        return bArr2;
    }

    public static byte[] copyOfRange(byte[] bArr, int i3, int i10) {
        int length = getLength(i3, i10);
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, i3, bArr2, 0, Math.min(bArr.length - i3, length));
        return bArr2;
    }

    public static void fill(byte[] bArr, byte b2) {
        java.util.Arrays.fill(bArr, b2);
    }

    private static int getLength(int i3, int i10) {
        int i11 = i10 - i3;
        if (i11 >= 0) {
            return i11;
        }
        StringBuffer stringBuffer = new StringBuffer(i3);
        stringBuffer.append(StubApp.getString2(21089));
        stringBuffer.append(i10);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public static int hashCode(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i3 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i3;
            }
            i3 = (i3 * 257) ^ bArr[length];
        }
    }

    public static boolean isNullOrContainsNull(Object[] objArr) {
        if (objArr == null) {
            return true;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNullOrEmpty(byte[] bArr) {
        return bArr == null || bArr.length < 1;
    }

    public static byte[] prepend(byte[] bArr, byte b2) {
        if (bArr == null) {
            return new byte[]{b2};
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, 0, bArr2, 1, length);
        bArr2[0] = b2;
        return bArr2;
    }

    public static byte[] reverse(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        int i3 = 0;
        while (true) {
            length--;
            if (length < 0) {
                return bArr2;
            }
            bArr2[length] = bArr[i3];
            i3++;
        }
    }

    public static byte[] reverseInPlace(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length - 1;
        for (int i3 = 0; i3 < length; i3++) {
            byte b2 = bArr[i3];
            bArr[i3] = bArr[length];
            bArr[length] = b2;
            length--;
        }
        return bArr;
    }

    public static int[] append(int[] iArr, int i3) {
        if (iArr == null) {
            return new int[]{i3};
        }
        int length = iArr.length;
        int[] iArr2 = new int[length + 1];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        iArr2[length] = i3;
        return iArr2;
    }

    public static boolean areEqual(byte[] bArr, byte[] bArr2) {
        return java.util.Arrays.equals(bArr, bArr2);
    }

    public static void clear(int[] iArr) {
        if (iArr != null) {
            java.util.Arrays.fill(iArr, 0);
        }
    }

    public static byte[] clone(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return null;
        }
        if (bArr2 == null || bArr2.length != bArr.length) {
            return clone(bArr);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        return bArr2;
    }

    public static byte[] concatenate(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            return concatenate(bArr2, bArr3);
        }
        if (bArr2 == null) {
            return concatenate(bArr, bArr3);
        }
        if (bArr3 == null) {
            return concatenate(bArr, bArr2);
        }
        byte[] bArr4 = new byte[bArr.length + bArr2.length + bArr3.length];
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        int length = bArr.length;
        System.arraycopy(bArr2, 0, bArr4, length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr4, length + bArr2.length, bArr3.length);
        return bArr4;
    }

    public static boolean constantTimeAreEqual(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null) {
            if (bArr == bArr2) {
                return true;
            }
            int length = bArr.length < bArr2.length ? bArr.length : bArr2.length;
            int length2 = bArr.length ^ bArr2.length;
            for (int i3 = 0; i3 != length; i3++) {
                length2 |= bArr[i3] ^ bArr2[i3];
            }
            while (length < bArr2.length) {
                byte b2 = bArr2[length];
                length2 |= b2 ^ (~b2);
                length++;
            }
            if (length2 == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(char[] cArr, char c10) {
        for (char c11 : cArr) {
            if (c11 == c10) {
                return true;
            }
        }
        return false;
    }

    public static char[] copyOf(char[] cArr, int i3) {
        char[] cArr2 = new char[i3];
        System.arraycopy(cArr, 0, cArr2, 0, Math.min(cArr.length, i3));
        return cArr2;
    }

    public static char[] copyOfRange(char[] cArr, int i3, int i10) {
        int length = getLength(i3, i10);
        char[] cArr2 = new char[length];
        System.arraycopy(cArr, i3, cArr2, 0, Math.min(cArr.length - i3, length));
        return cArr2;
    }

    public static void fill(byte[] bArr, int i3, int i10, byte b2) {
        java.util.Arrays.fill(bArr, i3, i10, b2);
    }

    public static int hashCode(byte[] bArr, int i3, int i10) {
        if (bArr == null) {
            return 0;
        }
        int i11 = i10 + 1;
        while (true) {
            i10--;
            if (i10 < 0) {
                return i11;
            }
            i11 = (i11 * 257) ^ bArr[i3 + i10];
        }
    }

    public static boolean isNullOrEmpty(int[] iArr) {
        return iArr == null || iArr.length < 1;
    }

    public static int[] prepend(int[] iArr, int i3) {
        if (iArr == null) {
            return new int[]{i3};
        }
        int length = iArr.length;
        int[] iArr2 = new int[length + 1];
        System.arraycopy(iArr, 0, iArr2, 1, length);
        iArr2[0] = i3;
        return iArr2;
    }

    public static int[] reverse(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i3 = 0;
        while (true) {
            length--;
            if (length < 0) {
                return iArr2;
            }
            iArr2[length] = iArr[i3];
            i3++;
        }
    }

    public static int[] reverseInPlace(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length - 1;
        for (int i3 = 0; i3 < length; i3++) {
            int i10 = iArr[i3];
            iArr[i3] = iArr[length];
            iArr[length] = i10;
            length--;
        }
        return iArr;
    }

    public static String[] append(String[] strArr, String str) {
        if (strArr == null) {
            return new String[]{str};
        }
        int length = strArr.length;
        String[] strArr2 = new String[length + 1];
        System.arraycopy(strArr, 0, strArr2, 0, length);
        strArr2[length] = str;
        return strArr2;
    }

    public static boolean areEqual(char[] cArr, char[] cArr2) {
        return java.util.Arrays.equals(cArr, cArr2);
    }

    public static char[] clone(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return (char[]) cArr.clone();
    }

    public static byte[] concatenate(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr == null) {
            return concatenate(bArr2, bArr3, bArr4);
        }
        if (bArr2 == null) {
            return concatenate(bArr, bArr3, bArr4);
        }
        if (bArr3 == null) {
            return concatenate(bArr, bArr2, bArr4);
        }
        if (bArr4 == null) {
            return concatenate(bArr, bArr2, bArr3);
        }
        byte[] bArr5 = new byte[bArr.length + bArr2.length + bArr3.length + bArr4.length];
        System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
        int length = bArr.length;
        System.arraycopy(bArr2, 0, bArr5, length, bArr2.length);
        int length2 = length + bArr2.length;
        System.arraycopy(bArr3, 0, bArr5, length2, bArr3.length);
        System.arraycopy(bArr4, 0, bArr5, length2 + bArr3.length, bArr4.length);
        return bArr5;
    }

    public static boolean constantTimeAreEqual(char[] cArr, char[] cArr2) {
        if (cArr != null && cArr2 != null) {
            if (cArr == cArr2) {
                return true;
            }
            int min = Math.min(cArr.length, cArr2.length);
            int length = cArr.length ^ cArr2.length;
            for (int i3 = 0; i3 != min; i3++) {
                length |= cArr[i3] ^ cArr2[i3];
            }
            while (min < cArr2.length) {
                char c10 = cArr2[min];
                length |= ((byte) (~c10)) ^ ((byte) c10);
                min++;
            }
            if (length == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(int[] iArr, int i3) {
        for (int i10 : iArr) {
            if (i10 == i3) {
                return true;
            }
        }
        return false;
    }

    public static int[] copyOf(int[] iArr, int i3) {
        int[] iArr2 = new int[i3];
        System.arraycopy(iArr, 0, iArr2, 0, Math.min(iArr.length, i3));
        return iArr2;
    }

    public static int[] copyOfRange(int[] iArr, int i3, int i10) {
        int length = getLength(i3, i10);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, i3, iArr2, 0, Math.min(iArr.length - i3, length));
        return iArr2;
    }

    public static void fill(char[] cArr, char c10) {
        java.util.Arrays.fill(cArr, c10);
    }

    public static int hashCode(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i3 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i3;
            }
            i3 = (i3 * 257) ^ cArr[length];
        }
    }

    public static boolean isNullOrEmpty(Object[] objArr) {
        return objArr == null || objArr.length < 1;
    }

    public static short[] prepend(short[] sArr, short s10) {
        if (sArr == null) {
            return new short[]{s10};
        }
        int length = sArr.length;
        short[] sArr2 = new short[length + 1];
        System.arraycopy(sArr, 0, sArr2, 1, length);
        sArr2[0] = s10;
        return sArr2;
    }

    public static short[] append(short[] sArr, short s10) {
        if (sArr == null) {
            return new short[]{s10};
        }
        int length = sArr.length;
        short[] sArr2 = new short[1 + length];
        System.arraycopy(sArr, 0, sArr2, 0, length);
        sArr2[length] = s10;
        return sArr2;
    }

    public static boolean areEqual(int[] iArr, int[] iArr2) {
        return java.util.Arrays.equals(iArr, iArr2);
    }

    public static int[] clone(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        return (int[]) iArr.clone();
    }

    public static byte[] concatenate(byte[][] bArr) {
        int i3 = 0;
        for (int i10 = 0; i10 != bArr.length; i10++) {
            i3 += bArr[i10].length;
        }
        byte[] bArr2 = new byte[i3];
        int i11 = 0;
        for (int i12 = 0; i12 != bArr.length; i12++) {
            byte[] bArr3 = bArr[i12];
            System.arraycopy(bArr3, 0, bArr2, i11, bArr3.length);
            i11 += bArr[i12].length;
        }
        return bArr2;
    }

    public static boolean contains(long[] jArr, long j) {
        for (long j3 : jArr) {
            if (j3 == j) {
                return true;
            }
        }
        return false;
    }

    public static long[] copyOf(long[] jArr, int i3) {
        long[] jArr2 = new long[i3];
        System.arraycopy(jArr, 0, jArr2, 0, Math.min(jArr.length, i3));
        return jArr2;
    }

    public static long[] copyOfRange(long[] jArr, int i3, int i10) {
        int length = getLength(i3, i10);
        long[] jArr2 = new long[length];
        System.arraycopy(jArr, i3, jArr2, 0, Math.min(jArr.length - i3, length));
        return jArr2;
    }

    public static void fill(char[] cArr, int i3, int i10, char c10) {
        java.util.Arrays.fill(cArr, i3, i10, c10);
    }

    public static int hashCode(int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i3 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i3;
            }
            i3 = (i3 * 257) ^ iArr[length];
        }
    }

    public static boolean areEqual(long[] jArr, long[] jArr2) {
        return java.util.Arrays.equals(jArr, jArr2);
    }

    public static long[] clone(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        return (long[]) jArr.clone();
    }

    public static int[] concatenate(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return clone(iArr2);
        }
        if (iArr2 == null) {
            return clone(iArr);
        }
        int[] iArr3 = new int[iArr.length + iArr2.length];
        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
        return iArr3;
    }

    public static boolean contains(short[] sArr, short s10) {
        for (short s11 : sArr) {
            if (s11 == s10) {
                return true;
            }
        }
        return false;
    }

    public static BigInteger[] copyOf(BigInteger[] bigIntegerArr, int i3) {
        BigInteger[] bigIntegerArr2 = new BigInteger[i3];
        System.arraycopy(bigIntegerArr, 0, bigIntegerArr2, 0, Math.min(bigIntegerArr.length, i3));
        return bigIntegerArr2;
    }

    public static BigInteger[] copyOfRange(BigInteger[] bigIntegerArr, int i3, int i10) {
        int length = getLength(i3, i10);
        BigInteger[] bigIntegerArr2 = new BigInteger[length];
        System.arraycopy(bigIntegerArr, i3, bigIntegerArr2, 0, Math.min(bigIntegerArr.length - i3, length));
        return bigIntegerArr2;
    }

    public static void fill(int[] iArr, int i3) {
        java.util.Arrays.fill(iArr, i3);
    }

    public static int hashCode(int[] iArr, int i3, int i10) {
        if (iArr == null) {
            return 0;
        }
        int i11 = i10 + 1;
        while (true) {
            i10--;
            if (i10 < 0) {
                return i11;
            }
            i11 = (i11 * 257) ^ iArr[i3 + i10];
        }
    }

    public static boolean areEqual(Object[] objArr, Object[] objArr2) {
        return java.util.Arrays.equals(objArr, objArr2);
    }

    public static long[] clone(long[] jArr, long[] jArr2) {
        if (jArr == null) {
            return null;
        }
        if (jArr2 == null || jArr2.length != jArr.length) {
            return clone(jArr);
        }
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        return jArr2;
    }

    public static short[] concatenate(short[] sArr, short[] sArr2) {
        if (sArr == null) {
            return clone(sArr2);
        }
        if (sArr2 == null) {
            return clone(sArr);
        }
        short[] sArr3 = new short[sArr.length + sArr2.length];
        System.arraycopy(sArr, 0, sArr3, 0, sArr.length);
        System.arraycopy(sArr2, 0, sArr3, sArr.length, sArr2.length);
        return sArr3;
    }

    public static boolean contains(boolean[] zArr, boolean z2) {
        for (boolean z10 : zArr) {
            if (z10 == z2) {
                return true;
            }
        }
        return false;
    }

    public static short[] copyOf(short[] sArr, int i3) {
        short[] sArr2 = new short[i3];
        System.arraycopy(sArr, 0, sArr2, 0, Math.min(sArr.length, i3));
        return sArr2;
    }

    public static short[] copyOfRange(short[] sArr, int i3, int i10) {
        int length = getLength(i3, i10);
        short[] sArr2 = new short[length];
        System.arraycopy(sArr, i3, sArr2, 0, Math.min(sArr.length - i3, length));
        return sArr2;
    }

    public static void fill(int[] iArr, int i3, int i10, int i11) {
        java.util.Arrays.fill(iArr, i3, i10, i11);
    }

    public static int hashCode(long[] jArr) {
        if (jArr == null) {
            return 0;
        }
        int length = jArr.length;
        int i3 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i3;
            }
            long j = jArr[length];
            i3 = (((i3 * 257) ^ ((int) j)) * 257) ^ ((int) (j >>> 32));
        }
    }

    public static boolean areEqual(short[] sArr, short[] sArr2) {
        return java.util.Arrays.equals(sArr, sArr2);
    }

    public static BigInteger[] clone(BigInteger[] bigIntegerArr) {
        if (bigIntegerArr == null) {
            return null;
        }
        return (BigInteger[]) bigIntegerArr.clone();
    }

    public static boolean[] copyOf(boolean[] zArr, int i3) {
        boolean[] zArr2 = new boolean[i3];
        System.arraycopy(zArr, 0, zArr2, 0, Math.min(zArr.length, i3));
        return zArr2;
    }

    public static boolean[] copyOfRange(boolean[] zArr, int i3, int i10) {
        int length = getLength(i3, i10);
        boolean[] zArr2 = new boolean[length];
        System.arraycopy(zArr, i3, zArr2, 0, Math.min(zArr.length - i3, length));
        return zArr2;
    }

    public static void fill(long[] jArr, int i3, int i10, long j) {
        java.util.Arrays.fill(jArr, i3, i10, j);
    }

    public static int hashCode(long[] jArr, int i3, int i10) {
        if (jArr == null) {
            return 0;
        }
        int i11 = i10 + 1;
        while (true) {
            i10--;
            if (i10 < 0) {
                return i11;
            }
            long j = jArr[i3 + i10];
            i11 = (((i11 * 257) ^ ((int) j)) * 257) ^ ((int) (j >>> 32));
        }
    }

    public static boolean areEqual(boolean[] zArr, boolean[] zArr2) {
        return java.util.Arrays.equals(zArr, zArr2);
    }

    public static short[] clone(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        return (short[]) sArr.clone();
    }

    public static void fill(long[] jArr, long j) {
        java.util.Arrays.fill(jArr, j);
    }

    public static int hashCode(Object[] objArr) {
        if (objArr == null) {
            return 0;
        }
        int length = objArr.length;
        int i3 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i3;
            }
            i3 = (i3 * 257) ^ Objects.hashCode(objArr[length]);
        }
    }

    public static boolean[] clone(boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        return (boolean[]) zArr.clone();
    }

    public static void fill(Object[] objArr, int i3, int i10, Object obj) {
        java.util.Arrays.fill(objArr, i3, i10, obj);
    }

    public static int hashCode(short[] sArr) {
        if (sArr == null) {
            return 0;
        }
        int length = sArr.length;
        int i3 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i3;
            }
            i3 = (i3 * 257) ^ (sArr[length] & 255);
        }
    }

    public static byte[][] clone(byte[][] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[][] bArr2 = new byte[length][];
        for (int i3 = 0; i3 != length; i3++) {
            bArr2[i3] = clone(bArr[i3]);
        }
        return bArr2;
    }

    public static void fill(Object[] objArr, Object obj) {
        java.util.Arrays.fill(objArr, obj);
    }

    public static int hashCode(int[][] iArr) {
        int i3 = 0;
        for (int i10 = 0; i10 != iArr.length; i10++) {
            i3 = (i3 * 257) + hashCode(iArr[i10]);
        }
        return i3;
    }

    public static byte[][][] clone(byte[][][] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[][][] bArr2 = new byte[length][][];
        for (int i3 = 0; i3 != length; i3++) {
            bArr2[i3] = clone(bArr[i3]);
        }
        return bArr2;
    }

    public static void fill(short[] sArr, int i3, int i10, short s10) {
        java.util.Arrays.fill(sArr, i3, i10, s10);
    }

    public static int hashCode(short[][] sArr) {
        int i3 = 0;
        for (int i10 = 0; i10 != sArr.length; i10++) {
            i3 = (i3 * 257) + hashCode(sArr[i10]);
        }
        return i3;
    }

    public static void fill(short[] sArr, short s10) {
        java.util.Arrays.fill(sArr, s10);
    }

    public static int hashCode(short[][][] sArr) {
        int i3 = 0;
        for (int i10 = 0; i10 != sArr.length; i10++) {
            i3 = (i3 * 257) + hashCode(sArr[i10]);
        }
        return i3;
    }

    public static void fill(boolean[] zArr, int i3, int i10, boolean z2) {
        java.util.Arrays.fill(zArr, i3, i10, z2);
    }

    public static void fill(boolean[] zArr, boolean z2) {
        java.util.Arrays.fill(zArr, z2);
    }
}
