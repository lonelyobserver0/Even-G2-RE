package org.bouncycastle.pqc.legacy.crypto.gmss.util;

import com.stub.StubApp;
import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GMSSUtil {
    public int bytesToIntLittleEndian(byte[] bArr) {
        return ((bArr[3] & UByte.MAX_VALUE) << 24) | (bArr[0] & UByte.MAX_VALUE) | ((bArr[1] & UByte.MAX_VALUE) << 8) | ((bArr[2] & UByte.MAX_VALUE) << 16);
    }

    public byte[] concatenateArray(byte[][] bArr) {
        byte[] bArr2 = new byte[bArr.length * bArr[0].length];
        int i3 = 0;
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte[] bArr3 = bArr[i10];
            System.arraycopy(bArr3, 0, bArr2, i3, bArr3.length);
            i3 += bArr[i10].length;
        }
        return bArr2;
    }

    public int getLog(int i3) {
        int i10 = 1;
        int i11 = 2;
        while (i11 < i3) {
            i11 <<= 1;
            i10++;
        }
        return i10;
    }

    public byte[] intToBytesLittleEndian(int i3) {
        return new byte[]{(byte) (i3 & 255), (byte) ((i3 >> 8) & 255), (byte) ((i3 >> 16) & 255), (byte) ((i3 >> 24) & 255)};
    }

    public void printArray(String str, byte[] bArr) {
        System.out.println(str);
        int i3 = 0;
        for (byte b2 : bArr) {
            System.out.println(i3 + StubApp.getString2(5156) + ((int) b2));
            i3++;
        }
    }

    public boolean testPowerOfTwo(int i3) {
        int i10 = 1;
        while (i10 < i3) {
            i10 <<= 1;
        }
        return i3 == i10;
    }

    public int bytesToIntLittleEndian(byte[] bArr, int i3) {
        int i10 = ((bArr[i3 + 1] & UByte.MAX_VALUE) << 8) | (bArr[i3] & UByte.MAX_VALUE);
        return ((bArr[i3 + 3] & UByte.MAX_VALUE) << 24) | i10 | ((bArr[i3 + 2] & UByte.MAX_VALUE) << 16);
    }

    public void printArray(String str, byte[][] bArr) {
        System.out.println(str);
        int i3 = 0;
        for (byte[] bArr2 : bArr) {
            for (int i10 = 0; i10 < bArr[0].length; i10++) {
                System.out.println(i3 + StubApp.getString2(5156) + ((int) bArr2[i10]));
                i3++;
            }
        }
    }
}
