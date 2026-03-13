package org.bouncycastle.pqc.crypto.bike;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Utils {
    public static byte[] append0s(byte[] bArr, int i3) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static void fromBitArrayToByteArray(byte[] bArr, byte[] bArr2) {
        long length = bArr2.length;
        int i3 = 0;
        int i10 = 0;
        while (i3 < length) {
            int i11 = i3 + 8;
            if (i11 >= bArr2.length) {
                int i12 = bArr2[i3];
                for (int length2 = (bArr2.length - i3) - 1; length2 >= 1; length2--) {
                    i12 |= bArr2[i3 + length2] << length2;
                }
                bArr[i10] = (byte) i12;
            } else {
                int i13 = bArr2[i3];
                for (int i14 = 7; i14 >= 1; i14--) {
                    i13 |= bArr2[i3 + i14] << i14;
                }
                bArr[i10] = (byte) i13;
            }
            i10++;
            i3 = i11;
        }
    }

    public static void fromByteArrayToBitArray(byte[] bArr, byte[] bArr2) {
        int length = bArr.length / 8;
        int i3 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            for (int i11 = 0; i11 != 8; i11++) {
                bArr[(i10 * 8) + i11] = (byte) ((bArr2[i10] & (1 << i11)) >>> i11);
            }
        }
        if (bArr.length % 8 != 0) {
            for (int i12 = length * 8; i12 < bArr.length; i12++) {
                bArr[i12] = (byte) ((bArr2[length] & (1 << i3)) >>> i3);
                i3++;
            }
        }
    }

    public static int getHammingWeight(byte[] bArr) {
        int i3 = 0;
        for (byte b2 : bArr) {
            i3 += b2;
        }
        return i3;
    }

    public static byte[] removeLast0Bits(byte[] bArr) {
        int length = bArr.length - 1;
        while (true) {
            if (length < 0) {
                length = 0;
                break;
            }
            if (bArr[length] == 1) {
                break;
            }
            length--;
        }
        int i3 = length + 1;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, 0, bArr2, 0, i3);
        return bArr2;
    }

    public static byte[] xorBytes(byte[] bArr, byte[] bArr2, int i3) {
        byte[] bArr3 = new byte[i3];
        for (int i10 = 0; i10 < i3; i10++) {
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
        return bArr3;
    }
}
