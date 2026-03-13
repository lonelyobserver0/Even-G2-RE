package org.bouncycastle.pqc.legacy.math.linearalgebra;

import com.stub.StubApp;
import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class BigEndianConversions {
    private BigEndianConversions() {
    }

    public static void I2OSP(int i3, byte[] bArr, int i10) {
        bArr[i10] = (byte) (i3 >>> 24);
        bArr[i10 + 1] = (byte) (i3 >>> 16);
        bArr[i10 + 2] = (byte) (i3 >>> 8);
        bArr[i10 + 3] = (byte) i3;
    }

    public static int OS2IP(byte[] bArr) {
        if (bArr.length > 4) {
            throw new ArithmeticException(StubApp.getString2(34801));
        }
        if (bArr.length == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i10 = 0; i10 < bArr.length; i10++) {
            i3 |= (bArr[i10] & UByte.MAX_VALUE) << (((bArr.length - 1) - i10) * 8);
        }
        return i3;
    }

    public static long OS2LIP(byte[] bArr, int i3) {
        return (bArr[i3 + 7] & UByte.MAX_VALUE) | ((bArr[i3] & 255) << 56) | ((bArr[i3 + 1] & 255) << 48) | ((bArr[i3 + 2] & 255) << 40) | ((bArr[i3 + 3] & 255) << 32) | ((255 & bArr[i3 + 4]) << 24) | ((bArr[i3 + 5] & UByte.MAX_VALUE) << 16) | ((bArr[i3 + 6] & UByte.MAX_VALUE) << 8);
    }

    public static byte[] toByteArray(int[] iArr) {
        byte[] bArr = new byte[iArr.length << 2];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            I2OSP(iArr[i3], bArr, i3 << 2);
        }
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
        int i12 = i11 - 1;
        for (int i13 = i12; i13 >= 0; i13--) {
            bArr[i10 + i13] = (byte) (i3 >>> ((i12 - i13) * 8));
        }
    }

    public static int OS2IP(byte[] bArr, int i3) {
        int i10 = ((bArr[i3 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i3] & UByte.MAX_VALUE) << 24);
        return (bArr[i3 + 3] & UByte.MAX_VALUE) | i10 | ((bArr[i3 + 2] & UByte.MAX_VALUE) << 8);
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

    public static void I2OSP(long j, byte[] bArr, int i3) {
        bArr[i3] = (byte) (j >>> 56);
        bArr[i3 + 1] = (byte) (j >>> 48);
        bArr[i3 + 2] = (byte) (j >>> 40);
        bArr[i3 + 3] = (byte) (j >>> 32);
        bArr[i3 + 4] = (byte) (j >>> 24);
        bArr[i3 + 5] = (byte) (j >>> 16);
        bArr[i3 + 6] = (byte) (j >>> 8);
        bArr[i3 + 7] = (byte) j;
    }

    public static int OS2IP(byte[] bArr, int i3, int i10) {
        if (bArr.length == 0 || bArr.length < (i3 + i10) - 1) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 |= (bArr[i3 + i12] & 255) << (((i10 - i12) - 1) * 8);
        }
        return i11;
    }

    public static byte[] I2OSP(int i3) {
        return new byte[]{(byte) (i3 >>> 24), (byte) (i3 >>> 16), (byte) (i3 >>> 8), (byte) i3};
    }

    public static byte[] I2OSP(int i3, int i10) throws ArithmeticException {
        if (i3 < 0) {
            return null;
        }
        int ceilLog256 = IntegerFunctions.ceilLog256(i3);
        if (ceilLog256 > i10) {
            throw new ArithmeticException(StubApp.getString2(34800));
        }
        byte[] bArr = new byte[i10];
        int i11 = i10 - 1;
        for (int i12 = i11; i12 >= i10 - ceilLog256; i12--) {
            bArr[i12] = (byte) (i3 >>> ((i11 - i12) * 8));
        }
        return bArr;
    }

    public static byte[] I2OSP(long j) {
        return new byte[]{(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
    }
}
