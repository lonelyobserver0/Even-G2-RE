package org.bouncycastle.pqc.legacy.math.linearalgebra;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class CharUtils {
    private CharUtils() {
    }

    public static char[] clone(char[] cArr) {
        char[] cArr2 = new char[cArr.length];
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
        return cArr2;
    }

    public static boolean equals(char[] cArr, char[] cArr2) {
        if (cArr.length != cArr2.length) {
            return false;
        }
        boolean z2 = true;
        for (int length = cArr.length - 1; length >= 0; length--) {
            z2 &= cArr[length] == cArr2[length];
        }
        return z2;
    }

    public static byte[] toByteArray(char[] cArr) {
        byte[] bArr = new byte[cArr.length];
        for (int length = cArr.length - 1; length >= 0; length--) {
            bArr[length] = (byte) cArr[length];
        }
        return bArr;
    }

    public static byte[] toByteArrayForPBE(char[] cArr) {
        int length = cArr.length;
        byte[] bArr = new byte[length];
        for (int i3 = 0; i3 < cArr.length; i3++) {
            bArr[i3] = (byte) cArr[i3];
        }
        int i10 = length * 2;
        byte[] bArr2 = new byte[i10 + 2];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * 2;
            bArr2[i12] = 0;
            bArr2[i12 + 1] = bArr[i11];
        }
        bArr2[i10] = 0;
        bArr2[i10 + 1] = 0;
        return bArr2;
    }
}
