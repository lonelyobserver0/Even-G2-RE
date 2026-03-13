package org.bouncycastle.crypto.modes;

import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class GOST3413CipherUtil {
    public static byte[] LSB(byte[] bArr, int i3) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, bArr.length - i3, bArr2, 0, i3);
        return bArr2;
    }

    public static byte[] MSB(byte[] bArr, int i3) {
        return Arrays.copyOf(bArr, i3);
    }

    public static byte[] copyFromInput(byte[] bArr, int i3, int i10) {
        if (bArr.length < i3 + i10) {
            i3 = bArr.length - i10;
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i10, bArr2, 0, i3);
        return bArr2;
    }

    public static byte[] sum(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i3 = 0; i3 < bArr.length; i3++) {
            bArr3[i3] = (byte) (bArr[i3] ^ bArr2[i3]);
        }
        return bArr3;
    }
}
