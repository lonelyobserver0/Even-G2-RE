package org.bouncycastle.pqc.crypto.newhope;

import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class ErrorCorrection {
    public static short LDDecode(int i3, int i10, int i11, int i12) {
        return (short) (((((g(i3) + g(i10)) + g(i11)) + g(i12)) - 98312) >>> 31);
    }

    public static int abs(int i3) {
        int i10 = i3 >> 31;
        return (i3 ^ i10) - i10;
    }

    public static int f(int[] iArr, int i3, int i10, int i11) {
        int i12 = (i11 * 2730) >> 25;
        int i13 = i12 - ((12288 - (i11 - (i12 * 12289))) >> 31);
        iArr[i3] = (i13 >> 1) + (i13 & 1);
        int i14 = i13 - 1;
        iArr[i10] = (i14 >> 1) + (i14 & 1);
        return abs(i11 - (iArr[i3] * 24578));
    }

    public static int g(int i3) {
        int i10 = (i3 * 2730) >> 27;
        int i11 = i10 - ((49155 - (i3 - (49156 * i10))) >> 31);
        return abs((((i11 >> 1) + (i11 & 1)) * 98312) - i3);
    }

    public static void helpRec(short[] sArr, short[] sArr2, byte[] bArr, byte b2) {
        short s10 = 8;
        byte[] bArr2 = new byte[8];
        bArr2[0] = b2;
        byte[] bArr3 = new byte[32];
        ChaCha20.process(bArr, bArr2, bArr3, 0, 32);
        int[] iArr = new int[8];
        int i3 = 0;
        while (i3 < 256) {
            int i10 = ((bArr3[i3 >>> 3] >>> (i3 & 7)) & 1) * 4;
            int i11 = i3 + 256;
            int i12 = i3 + 512;
            int i13 = i3 + 768;
            int f10 = (24577 - (((f(iArr, 0, 4, (sArr2[i3] * s10) + i10) + f(iArr, 1, 5, (sArr2[i11] * s10) + i10)) + f(iArr, 2, 6, (sArr2[i12] * s10) + i10)) + f(iArr, 3, 7, (sArr2[i13] * s10) + i10))) >> 31;
            int i14 = ~f10;
            int[] iArr2 = {(i14 & iArr[0]) ^ (iArr[4] & f10), (i14 & iArr[1]) ^ (iArr[5] & f10), (i14 & iArr[2]) ^ (iArr[6] & f10), (iArr[7] & f10) ^ (i14 & iArr[3])};
            int i15 = iArr2[0];
            int i16 = iArr2[3];
            sArr[i3] = (short) ((i15 - i16) & 3);
            sArr[i11] = (short) ((iArr2[1] - i16) & 3);
            sArr[i12] = (short) ((iArr2[2] - i16) & 3);
            sArr[i13] = (short) (((i16 * 2) + (-f10)) & 3);
            i3++;
            s10 = 8;
        }
    }

    public static void rec(byte[] bArr, short[] sArr, short[] sArr2) {
        Arrays.fill(bArr, (byte) 0);
        for (int i3 = 0; i3 < 256; i3++) {
            int i10 = (sArr[i3] * 8) + 196624;
            int i11 = sArr2[i3] * 2;
            int i12 = i3 + 768;
            short s10 = sArr2[i12];
            int i13 = i10 - ((i11 + s10) * 12289);
            int i14 = i3 + 256;
            int i15 = ((sArr[i14] * 8) + 196624) - (((sArr2[i14] * 2) + s10) * 12289);
            int i16 = i3 + 512;
            int[] iArr = {i13, i15, ((sArr[i16] * 8) + 196624) - (((sArr2[i16] * 2) + s10) * 12289), ((sArr[i12] * 8) + 196624) - (s10 * 12289)};
            int i17 = i3 >>> 3;
            bArr[i17] = (byte) ((LDDecode(iArr[0], iArr[1], iArr[2], iArr[3]) << (i3 & 7)) | bArr[i17]);
        }
    }
}
