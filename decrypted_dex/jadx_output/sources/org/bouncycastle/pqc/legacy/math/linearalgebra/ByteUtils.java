package org.bouncycastle.pqc.legacy.math.linearalgebra;

import com.stub.StubApp;
import p0.AbstractC1482f;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class ByteUtils {
    private static final char[] HEX_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private ByteUtils() {
    }

    public static byte[] clone(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static byte[] concatenate(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static int deepHashCode(byte[] bArr) {
        int i3 = 1;
        for (byte b2 : bArr) {
            i3 = (i3 * 31) + b2;
        }
        return i3;
    }

    public static boolean equals(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2 == null;
        }
        if (bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        boolean z2 = true;
        for (int length = bArr.length - 1; length >= 0; length--) {
            z2 &= bArr[length] == bArr2[length];
        }
        return z2;
    }

    public static byte[] fromHexString(String str) {
        char[] charArray = str.toUpperCase().toCharArray();
        int i3 = 0;
        for (char c10 : charArray) {
            if ((c10 >= '0' && c10 <= '9') || (c10 >= 'A' && c10 <= 'F')) {
                i3++;
            }
        }
        byte[] bArr = new byte[(i3 + 1) >> 1];
        int i10 = i3 & 1;
        for (char c11 : charArray) {
            if (c11 < '0' || c11 > '9') {
                if (c11 >= 'A' && c11 <= 'F') {
                    int i11 = i10 >> 1;
                    byte b2 = (byte) (bArr[i11] << 4);
                    bArr[i11] = b2;
                    bArr[i11] = (byte) ((c11 - '7') | b2);
                }
            } else {
                int i12 = i10 >> 1;
                byte b10 = (byte) (bArr[i12] << 4);
                bArr[i12] = b10;
                bArr[i12] = (byte) ((c11 - '0') | b10);
            }
            i10++;
        }
        return bArr;
    }

    public static byte[][] split(byte[] bArr, int i3) throws ArrayIndexOutOfBoundsException {
        if (i3 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        byte[][] bArr2 = {new byte[i3], new byte[bArr.length - i3]};
        System.arraycopy(bArr, 0, bArr2[0], 0, i3);
        System.arraycopy(bArr, i3, bArr2[1], 0, bArr.length - i3);
        return bArr2;
    }

    public static byte[] subArray(byte[] bArr, int i3) {
        return subArray(bArr, i3, bArr.length);
    }

    public static String toBinaryString(byte[] bArr) {
        String str = "";
        for (int i3 = 0; i3 < bArr.length; i3++) {
            byte b2 = bArr[i3];
            for (int i10 = 0; i10 < 8; i10++) {
                str = str + ((b2 >>> i10) & 1);
            }
            if (i3 != bArr.length - 1) {
                str = AbstractC1482f.g(str, StubApp.getString2(397));
            }
        }
        return str;
    }

    public static char[] toCharArray(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        for (int i3 = 0; i3 < bArr.length; i3++) {
            cArr[i3] = (char) bArr[i3];
        }
        return cArr;
    }

    public static String toHexString(byte[] bArr) {
        String str = "";
        for (int i3 = 0; i3 < bArr.length; i3++) {
            StringBuilder b2 = AbstractC1856e.b(str);
            char[] cArr = HEX_CHARS;
            b2.append(cArr[(bArr[i3] >>> 4) & 15]);
            StringBuilder b10 = AbstractC1856e.b(b2.toString());
            b10.append(cArr[bArr[i3] & 15]);
            str = b10.toString();
        }
        return str;
    }

    public static byte[] xor(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int length = bArr.length - 1; length >= 0; length--) {
            bArr3[length] = (byte) (bArr[length] ^ bArr2[length]);
        }
        return bArr3;
    }

    public static byte[] concatenate(byte[][] bArr) {
        int length = bArr[0].length;
        byte[] bArr2 = new byte[bArr.length * length];
        int i3 = 0;
        for (byte[] bArr3 : bArr) {
            System.arraycopy(bArr3, 0, bArr2, i3, length);
            i3 += length;
        }
        return bArr2;
    }

    public static int deepHashCode(byte[][] bArr) {
        int i3 = 1;
        for (byte[] bArr2 : bArr) {
            i3 = (i3 * 31) + deepHashCode(bArr2);
        }
        return i3;
    }

    public static boolean equals(byte[][] bArr, byte[][] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        boolean z2 = true;
        for (int length = bArr.length - 1; length >= 0; length--) {
            z2 &= equals(bArr[length], bArr2[length]);
        }
        return z2;
    }

    public static byte[] subArray(byte[] bArr, int i3, int i10) {
        int i11 = i10 - i3;
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i3, bArr2, 0, i11);
        return bArr2;
    }

    public static int deepHashCode(byte[][][] bArr) {
        int i3 = 1;
        for (byte[][] bArr2 : bArr) {
            i3 = (i3 * 31) + deepHashCode(bArr2);
        }
        return i3;
    }

    public static boolean equals(byte[][][] bArr, byte[][][] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        boolean z2 = true;
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte[][] bArr3 = bArr[length];
            if (bArr3.length != bArr2[length].length) {
                return false;
            }
            for (int length2 = bArr3.length - 1; length2 >= 0; length2--) {
                z2 &= equals(bArr[length][length2], bArr2[length][length2]);
            }
        }
        return z2;
    }

    public static String toHexString(byte[] bArr, String str, String str2) {
        String str3 = new String(str);
        for (int i3 = 0; i3 < bArr.length; i3++) {
            StringBuilder b2 = AbstractC1856e.b(str3);
            char[] cArr = HEX_CHARS;
            b2.append(cArr[(bArr[i3] >>> 4) & 15]);
            StringBuilder b10 = AbstractC1856e.b(b2.toString());
            b10.append(cArr[bArr[i3] & 15]);
            str3 = b10.toString();
            if (i3 < bArr.length - 1) {
                str3 = AbstractC1482f.g(str3, str2);
            }
        }
        return str3;
    }
}
