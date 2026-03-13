package org.bouncycastle.pqc.legacy.crypto.rainbow.util;

import java.lang.reflect.Array;
import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RainbowUtil {
    public static byte[] convertArray(short[] sArr) {
        byte[] bArr = new byte[sArr.length];
        for (int i3 = 0; i3 < sArr.length; i3++) {
            bArr[i3] = (byte) sArr[i3];
        }
        return bArr;
    }

    public static int[] convertArraytoInt(byte[] bArr) {
        int[] iArr = new int[bArr.length];
        for (int i3 = 0; i3 < bArr.length; i3++) {
            iArr[i3] = bArr[i3] & UByte.MAX_VALUE;
        }
        return iArr;
    }

    public static byte[] convertIntArray(int[] iArr) {
        byte[] bArr = new byte[iArr.length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            bArr[i3] = (byte) iArr[i3];
        }
        return bArr;
    }

    public static boolean equals(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z2 = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z2 &= sArr[length] == sArr2[length];
        }
        return z2;
    }

    public static short[] convertArray(byte[] bArr) {
        short[] sArr = new short[bArr.length];
        for (int i3 = 0; i3 < bArr.length; i3++) {
            sArr[i3] = (short) (bArr[i3] & UByte.MAX_VALUE);
        }
        return sArr;
    }

    public static boolean equals(short[][] sArr, short[][] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z2 = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z2 &= equals(sArr[length], sArr2[length]);
        }
        return z2;
    }

    public static byte[][] convertArray(short[][] sArr) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, sArr.length, sArr[0].length);
        for (int i3 = 0; i3 < sArr.length; i3++) {
            for (int i10 = 0; i10 < sArr[0].length; i10++) {
                bArr[i3][i10] = (byte) sArr[i3][i10];
            }
        }
        return bArr;
    }

    public static boolean equals(short[][][] sArr, short[][][] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z2 = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z2 &= equals(sArr[length], sArr2[length]);
        }
        return z2;
    }

    public static short[][] convertArray(byte[][] bArr) {
        short[][] sArr = (short[][]) Array.newInstance((Class<?>) Short.TYPE, bArr.length, bArr[0].length);
        for (int i3 = 0; i3 < bArr.length; i3++) {
            for (int i10 = 0; i10 < bArr[0].length; i10++) {
                sArr[i3][i10] = (short) (bArr[i3][i10] & UByte.MAX_VALUE);
            }
        }
        return sArr;
    }

    public static byte[][][] convertArray(short[][][] sArr) {
        int length = sArr.length;
        short[][] sArr2 = sArr[0];
        byte[][][] bArr = (byte[][][]) Array.newInstance((Class<?>) Byte.TYPE, length, sArr2.length, sArr2[0].length);
        for (int i3 = 0; i3 < sArr.length; i3++) {
            for (int i10 = 0; i10 < sArr[0].length; i10++) {
                for (int i11 = 0; i11 < sArr[0][0].length; i11++) {
                    bArr[i3][i10][i11] = (byte) sArr[i3][i10][i11];
                }
            }
        }
        return bArr;
    }

    public static short[][][] convertArray(byte[][][] bArr) {
        int length = bArr.length;
        byte[][] bArr2 = bArr[0];
        short[][][] sArr = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, length, bArr2.length, bArr2[0].length);
        for (int i3 = 0; i3 < bArr.length; i3++) {
            for (int i10 = 0; i10 < bArr[0].length; i10++) {
                for (int i11 = 0; i11 < bArr[0][0].length; i11++) {
                    sArr[i3][i10][i11] = (short) (bArr[i3][i10][i11] & UByte.MAX_VALUE);
                }
            }
        }
        return sArr;
    }
}
