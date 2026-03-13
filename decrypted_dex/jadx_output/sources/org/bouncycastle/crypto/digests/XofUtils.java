package org.bouncycastle.crypto.digests;

import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class XofUtils {
    public static byte[] encode(byte b2) {
        return Arrays.concatenate(leftEncode(8L), new byte[]{b2});
    }

    public static byte[] leftEncode(long j) {
        long j3 = j;
        byte b2 = 1;
        while (true) {
            j3 >>= 8;
            if (j3 == 0) {
                break;
            }
            b2 = (byte) (b2 + 1);
        }
        byte[] bArr = new byte[b2 + 1];
        bArr[0] = b2;
        for (int i3 = 1; i3 <= b2; i3++) {
            bArr[i3] = (byte) (j >> ((b2 - i3) * 8));
        }
        return bArr;
    }

    public static byte[] rightEncode(long j) {
        long j3 = j;
        byte b2 = 1;
        while (true) {
            j3 >>= 8;
            if (j3 == 0) {
                break;
            }
            b2 = (byte) (b2 + 1);
        }
        byte[] bArr = new byte[b2 + 1];
        bArr[b2] = b2;
        for (int i3 = 0; i3 < b2; i3++) {
            bArr[i3] = (byte) (j >> (((b2 - i3) - 1) * 8));
        }
        return bArr;
    }

    public static byte[] encode(byte[] bArr, int i3, int i10) {
        return bArr.length == i10 ? Arrays.concatenate(leftEncode(i10 * 8), bArr) : Arrays.concatenate(leftEncode(i10 * 8), Arrays.copyOfRange(bArr, i3, i10 + i3));
    }
}
