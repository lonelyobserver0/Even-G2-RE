package org.bouncycastle.pqc.crypto.picnic;

import i2.u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Utils {
    public static int ceil_log2(int i3) {
        if (i3 == 0) {
            return 0;
        }
        return 32 - nlz(i3 - 1);
    }

    public static byte getBit(byte[] bArr, int i3) {
        return (byte) ((bArr[i3 >>> 3] >>> ((i3 & 7) ^ 7)) & 1);
    }

    public static int getBitFromWordArray(int[] iArr, int i3) {
        return getBit(iArr, i3);
    }

    private static int nlz(int i3) {
        int i10;
        if (i3 == 0) {
            return 32;
        }
        if ((i3 >>> 16) == 0) {
            i3 <<= 16;
            i10 = 17;
        } else {
            i10 = 1;
        }
        if ((i3 >>> 24) == 0) {
            i10 += 8;
            i3 <<= 8;
        }
        if ((i3 >>> 28) == 0) {
            i10 += 4;
            i3 <<= 4;
        }
        if ((i3 >>> 30) == 0) {
            i10 += 2;
            i3 <<= 2;
        }
        return i10 - (i3 >>> 31);
    }

    public static int numBytes(int i3) {
        if (i3 == 0) {
            return 0;
        }
        return u.c(i3, 1, 8, 1);
    }

    public static int parity(byte[] bArr, int i3) {
        byte b2 = bArr[0];
        for (int i10 = 1; i10 < i3; i10++) {
            b2 = (byte) (b2 ^ bArr[i10]);
        }
        int i11 = (b2 >>> 1) ^ b2;
        int i12 = i11 ^ (i11 >>> 2);
        int i13 = i12 ^ (i12 >>> 4);
        int i14 = i13 ^ (i13 >>> 8);
        return (i14 ^ (i14 >>> 16)) & 1;
    }

    public static int parity16(int i3) {
        int i10 = i3 ^ (i3 >>> 1);
        int i11 = i10 ^ (i10 >>> 2);
        int i12 = i11 ^ (i11 >>> 4);
        return (i12 ^ (i12 >>> 8)) & 1;
    }

    public static int parity32(int i3) {
        int i10 = i3 ^ (i3 >>> 1);
        int i11 = i10 ^ (i10 >>> 2);
        int i12 = i11 ^ (i11 >>> 4);
        int i13 = i12 ^ (i12 >>> 8);
        return (i13 ^ (i13 >>> 16)) & 1;
    }

    public static void setBit(byte[] bArr, int i3, byte b2) {
        int i10 = i3 >>> 3;
        int i11 = (i3 & 7) ^ 7;
        bArr[i10] = (byte) ((b2 << i11) | (bArr[i10] & (~(1 << i11))));
    }

    public static void setBitInWordArray(int[] iArr, int i3, int i10) {
        setBit(iArr, i3, i10);
    }

    public static int getBit(int[] iArr, int i3) {
        return (iArr[i3 >>> 5] >> ((i3 & 31) ^ 7)) & 1;
    }

    public static void setBit(int[] iArr, int i3, int i10) {
        int i11 = i3 >>> 5;
        int i12 = (i3 & 31) ^ 7;
        iArr[i11] = (i10 << i12) | (iArr[i11] & (~(1 << i12)));
    }
}
