package org.bouncycastle.util;

import kotlin.UByte;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class Pack {
    public static int bigEndianToInt(byte[] bArr, int i3) {
        return (bArr[i3 + 3] & UByte.MAX_VALUE) | (bArr[i3] << 24) | ((bArr[i3 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i3 + 2] & UByte.MAX_VALUE) << 8);
    }

    public static long bigEndianToLong(byte[] bArr, int i3) {
        int bigEndianToInt = bigEndianToInt(bArr, i3);
        return (bigEndianToInt(bArr, i3 + 4) & BodyPartID.bodyIdMax) | ((bigEndianToInt & BodyPartID.bodyIdMax) << 32);
    }

    public static short bigEndianToShort(byte[] bArr, int i3) {
        return (short) ((bArr[i3 + 1] & UByte.MAX_VALUE) | ((bArr[i3] & UByte.MAX_VALUE) << 8));
    }

    public static void intToBigEndian(int i3, byte[] bArr, int i10) {
        bArr[i10] = (byte) (i3 >>> 24);
        bArr[i10 + 1] = (byte) (i3 >>> 16);
        bArr[i10 + 2] = (byte) (i3 >>> 8);
        bArr[i10 + 3] = (byte) i3;
    }

    public static void intToLittleEndian(int i3, byte[] bArr, int i10) {
        bArr[i10] = (byte) i3;
        bArr[i10 + 1] = (byte) (i3 >>> 8);
        bArr[i10 + 2] = (byte) (i3 >>> 16);
        bArr[i10 + 3] = (byte) (i3 >>> 24);
    }

    public static int littleEndianToInt(byte[] bArr, int i3) {
        return (bArr[i3 + 3] << 24) | (bArr[i3] & UByte.MAX_VALUE) | ((bArr[i3 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i3 + 2] & UByte.MAX_VALUE) << 16);
    }

    public static long littleEndianToLong(byte[] bArr, int i3) {
        return ((littleEndianToInt(bArr, i3 + 4) & BodyPartID.bodyIdMax) << 32) | (littleEndianToInt(bArr, i3) & BodyPartID.bodyIdMax);
    }

    public static short littleEndianToShort(byte[] bArr, int i3) {
        return (short) (((bArr[i3 + 1] & UByte.MAX_VALUE) << 8) | (bArr[i3] & UByte.MAX_VALUE));
    }

    public static void longToBigEndian(long j, byte[] bArr, int i3) {
        intToBigEndian((int) (j >>> 32), bArr, i3);
        intToBigEndian((int) (j & BodyPartID.bodyIdMax), bArr, i3 + 4);
    }

    public static void longToLittleEndian(long j, byte[] bArr, int i3) {
        intToLittleEndian((int) (BodyPartID.bodyIdMax & j), bArr, i3);
        intToLittleEndian((int) (j >>> 32), bArr, i3 + 4);
    }

    public static void shortToBigEndian(short s10, byte[] bArr, int i3) {
        bArr[i3] = (byte) (s10 >>> 8);
        bArr[i3 + 1] = (byte) s10;
    }

    public static void shortToLittleEndian(short s10, byte[] bArr, int i3) {
        bArr[i3] = (byte) s10;
        bArr[i3 + 1] = (byte) (s10 >>> 8);
    }

    public static void bigEndianToInt(byte[] bArr, int i3, int[] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr[i10] = bigEndianToInt(bArr, i3);
            i3 += 4;
        }
    }

    public static void bigEndianToLong(byte[] bArr, int i3, long[] jArr) {
        for (int i10 = 0; i10 < jArr.length; i10++) {
            jArr[i10] = bigEndianToLong(bArr, i3);
            i3 += 8;
        }
    }

    public static void intToBigEndian(int[] iArr, int i3, int i10, byte[] bArr, int i11) {
        for (int i12 = 0; i12 < i10; i12++) {
            intToBigEndian(iArr[i3 + i12], bArr, i11);
            i11 += 4;
        }
    }

    public static void intToLittleEndian(int[] iArr, int i3, int i10, byte[] bArr, int i11) {
        for (int i12 = 0; i12 < i10; i12++) {
            intToLittleEndian(iArr[i3 + i12], bArr, i11);
            i11 += 4;
        }
    }

    public static void littleEndianToInt(byte[] bArr, int i3, int[] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr[i10] = littleEndianToInt(bArr, i3);
            i3 += 4;
        }
    }

    public static void littleEndianToLong(byte[] bArr, int i3, long[] jArr) {
        for (int i10 = 0; i10 < jArr.length; i10++) {
            jArr[i10] = littleEndianToLong(bArr, i3);
            i3 += 8;
        }
    }

    public static void longToBigEndian(long j, byte[] bArr, int i3, int i10) {
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            bArr[i11 + i3] = (byte) (255 & j);
            j >>>= 8;
        }
    }

    public static void longToLittleEndian(long[] jArr, int i3, int i10, byte[] bArr, int i11) {
        for (int i12 = 0; i12 < i10; i12++) {
            longToLittleEndian(jArr[i3 + i12], bArr, i11);
            i11 += 8;
        }
    }

    public static byte[] shortToBigEndian(short s10) {
        byte[] bArr = new byte[2];
        shortToBigEndian(s10, bArr, 0);
        return bArr;
    }

    public static byte[] shortToLittleEndian(short s10) {
        byte[] bArr = new byte[2];
        shortToLittleEndian(s10, bArr, 0);
        return bArr;
    }

    public static void bigEndianToInt(byte[] bArr, int i3, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i10 + i12] = bigEndianToInt(bArr, i3);
            i3 += 4;
        }
    }

    public static void bigEndianToLong(byte[] bArr, int i3, long[] jArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            jArr[i10 + i12] = bigEndianToLong(bArr, i3);
            i3 += 8;
        }
    }

    public static void intToBigEndian(int[] iArr, byte[] bArr, int i3) {
        for (int i10 : iArr) {
            intToBigEndian(i10, bArr, i3);
            i3 += 4;
        }
    }

    public static void intToLittleEndian(int[] iArr, byte[] bArr, int i3) {
        for (int i10 : iArr) {
            intToLittleEndian(i10, bArr, i3);
            i3 += 4;
        }
    }

    public static void littleEndianToInt(byte[] bArr, int i3, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i10 + i12] = littleEndianToInt(bArr, i3);
            i3 += 4;
        }
    }

    public static void littleEndianToLong(byte[] bArr, int i3, long[] jArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            jArr[i10 + i12] = littleEndianToLong(bArr, i3);
            i3 += 8;
        }
    }

    public static void longToBigEndian(long[] jArr, int i3, int i10, byte[] bArr, int i11) {
        for (int i12 = 0; i12 < i10; i12++) {
            longToBigEndian(jArr[i3 + i12], bArr, i11);
            i11 += 8;
        }
    }

    public static void longToLittleEndian(long[] jArr, byte[] bArr, int i3) {
        for (long j : jArr) {
            longToLittleEndian(j, bArr, i3);
            i3 += 8;
        }
    }

    public static byte[] intToBigEndian(int i3) {
        byte[] bArr = new byte[4];
        intToBigEndian(i3, bArr, 0);
        return bArr;
    }

    public static byte[] intToLittleEndian(int i3) {
        byte[] bArr = new byte[4];
        intToLittleEndian(i3, bArr, 0);
        return bArr;
    }

    public static int[] littleEndianToInt(byte[] bArr, int i3, int i10) {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = littleEndianToInt(bArr, i3);
            i3 += 4;
        }
        return iArr;
    }

    public static void longToBigEndian(long[] jArr, byte[] bArr, int i3) {
        for (long j : jArr) {
            longToBigEndian(j, bArr, i3);
            i3 += 8;
        }
    }

    public static byte[] longToLittleEndian(long j) {
        byte[] bArr = new byte[8];
        longToLittleEndian(j, bArr, 0);
        return bArr;
    }

    public static byte[] intToBigEndian(int[] iArr) {
        byte[] bArr = new byte[iArr.length * 4];
        intToBigEndian(iArr, bArr, 0);
        return bArr;
    }

    public static byte[] intToLittleEndian(int[] iArr) {
        byte[] bArr = new byte[iArr.length * 4];
        intToLittleEndian(iArr, bArr, 0);
        return bArr;
    }

    public static byte[] longToBigEndian(long j) {
        byte[] bArr = new byte[8];
        longToBigEndian(j, bArr, 0);
        return bArr;
    }

    public static byte[] longToLittleEndian(long[] jArr) {
        byte[] bArr = new byte[jArr.length * 8];
        longToLittleEndian(jArr, bArr, 0);
        return bArr;
    }

    public static byte[] longToBigEndian(long[] jArr) {
        byte[] bArr = new byte[jArr.length * 8];
        longToBigEndian(jArr, bArr, 0);
        return bArr;
    }
}
