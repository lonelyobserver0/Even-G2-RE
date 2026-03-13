package org.bouncycastle.pqc.crypto.bike;

import org.bouncycastle.crypto.Xof;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class BIKERandomGenerator {
    private static int GetRandomInMod(int i3, Xof xof) {
        int randomNumber;
        int maskNumber = maskNumber(bitScanReverse(i3));
        do {
            randomNumber = getRandomNumber(xof) & maskNumber;
        } while (randomNumber >= i3);
        return randomNumber;
    }

    private static int bitScanReverse(int i3) {
        int i10 = 0;
        while (i3 != 0) {
            i3 >>= 1;
            i10++;
        }
        return i10;
    }

    private static int checkBit(byte[] bArr, int i3) {
        return (bArr[i3 / 8] >> (i3 % 8)) & 1;
    }

    private static void generateRandomArray(byte[] bArr, int i3, int i10, Xof xof) {
        int i11 = 0;
        while (i11 < i10) {
            int GetRandomInMod = GetRandomInMod(i3, xof);
            if (checkBit(bArr, GetRandomInMod) == 0) {
                setBit(bArr, GetRandomInMod);
                i11++;
            }
        }
    }

    public static byte[] generateRandomByteArray(int i3, int i10, int i11, Xof xof) {
        byte[] bArr = new byte[i10];
        generateRandomArray(bArr, i3, i11, xof);
        return bArr;
    }

    private static int getRandomNumber(Xof xof) {
        byte[] bArr = new byte[4];
        xof.doOutput(bArr, 0, 4);
        return Pack.littleEndianToInt(bArr, 0);
    }

    private static int maskNumber(int i3) {
        return (1 << i3) - 1;
    }

    private static void setBit(byte[] bArr, int i3) {
        int i10 = i3 / 8;
        bArr[i10] = (byte) ((1 << (i3 % 8)) | bArr[i10]);
    }
}
