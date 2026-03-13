package org.bouncycastle.pqc.legacy.math.linearalgebra;

import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class LittleEndianConversions {
    private LittleEndianConversions() {
    }

    public static void I2OSP(int i3, byte[] bArr, int i10) {
        bArr[i10] = (byte) i3;
        bArr[i10 + 1] = (byte) (i3 >>> 8);
        bArr[i10 + 2] = (byte) (i3 >>> 16);
        bArr[i10 + 3] = (byte) (i3 >>> 24);
    }

    public static int OS2IP(byte[] bArr) {
        return ((bArr[3] & UByte.MAX_VALUE) << 24) | (bArr[0] & UByte.MAX_VALUE) | ((bArr[1] & UByte.MAX_VALUE) << 8) | ((bArr[2] & UByte.MAX_VALUE) << 16);
    }

    public static long OS2LIP(byte[] bArr, int i3) {
        return ((bArr[i3 + 7] & 255) << 56) | (bArr[i3] & UByte.MAX_VALUE) | ((bArr[i3 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i3 + 2] & UByte.MAX_VALUE) << 16) | ((bArr[i3 + 3] & 255) << 24) | ((bArr[i3 + 4] & 255) << 32) | ((bArr[i3 + 5] & 255) << 40) | ((bArr[i3 + 6] & 255) << 48);
    }

    public static byte[] toByteArray(int[] iArr, int i3) {
        int length = iArr.length;
        byte[] bArr = new byte[i3];
        int i10 = 0;
        int i11 = 0;
        while (i10 <= length - 2) {
            I2OSP(iArr[i10], bArr, i11);
            i10++;
            i11 += 4;
        }
        I2OSP(iArr[length - 1], bArr, i11, i3 - i11);
        return bArr;
    }

    public static int[] toIntArray(byte[] bArr) {
        int length = (bArr.length + 3) / 4;
        int length2 = bArr.length & 3;
        int[] iArr = new int[length];
        int i3 = 0;
        int i10 = 0;
        while (i3 <= length - 2) {
            iArr[i3] = OS2IP(bArr, i10);
            i3++;
            i10 += 4;
        }
        int i11 = length - 1;
        if (length2 != 0) {
            iArr[i11] = OS2IP(bArr, i10, length2);
            return iArr;
        }
        iArr[i11] = OS2IP(bArr, i10);
        return iArr;
    }

    public static void I2OSP(int i3, byte[] bArr, int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= 0; i12--) {
            bArr[i10 + i12] = (byte) (i3 >>> (i12 * 8));
        }
    }

    public static int OS2IP(byte[] bArr, int i3) {
        int i10 = ((bArr[i3 + 1] & UByte.MAX_VALUE) << 8) | (bArr[i3] & UByte.MAX_VALUE);
        return ((bArr[i3 + 3] & UByte.MAX_VALUE) << 24) | i10 | ((bArr[i3 + 2] & UByte.MAX_VALUE) << 16);
    }

    public static void I2OSP(long j, byte[] bArr, int i3) {
        bArr[i3] = (byte) j;
        bArr[i3 + 1] = (byte) (j >>> 8);
        bArr[i3 + 2] = (byte) (j >>> 16);
        bArr[i3 + 3] = (byte) (j >>> 24);
        bArr[i3 + 4] = (byte) (j >>> 32);
        bArr[i3 + 5] = (byte) (j >>> 40);
        bArr[i3 + 6] = (byte) (j >>> 48);
        bArr[i3 + 7] = (byte) (j >>> 56);
    }

    public static int OS2IP(byte[] bArr, int i3, int i10) {
        int i11 = 0;
        for (int i12 = i10 - 1; i12 >= 0; i12--) {
            i11 |= (bArr[i3 + i12] & 255) << (i12 * 8);
        }
        return i11;
    }

    public static byte[] I2OSP(int i3) {
        return new byte[]{(byte) i3, (byte) (i3 >>> 8), (byte) (i3 >>> 16), (byte) (i3 >>> 24)};
    }

    public static byte[] I2OSP(long j) {
        return new byte[]{(byte) j, (byte) (j >>> 8), (byte) (j >>> 16), (byte) (j >>> 24), (byte) (j >>> 32), (byte) (j >>> 40), (byte) (j >>> 48), (byte) (j >>> 56)};
    }
}
