package org.bouncycastle.pqc.crypto.sphincs;

import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Wots {
    static final int WOTS_L = 67;
    static final int WOTS_L1 = 64;
    static final int WOTS_LOGW = 4;
    static final int WOTS_LOG_L = 7;
    static final int WOTS_SIGBYTES = 2144;
    static final int WOTS_W = 16;

    private static void clear(byte[] bArr, int i3, int i10) {
        for (int i11 = 0; i11 != i10; i11++) {
            bArr[i11 + i3] = 0;
        }
    }

    public static void expand_seed(byte[] bArr, int i3, byte[] bArr2, int i10) {
        clear(bArr, i3, WOTS_SIGBYTES);
        Seed.prg(bArr, i3, 2144L, bArr2, i10);
    }

    public static void gen_chain(HashFunctions hashFunctions, byte[] bArr, int i3, byte[] bArr2, int i10, byte[] bArr3, int i11, int i12) {
        for (int i13 = 0; i13 < 32; i13++) {
            bArr[i13 + i3] = bArr2[i13 + i10];
        }
        for (int i14 = 0; i14 < i12 && i14 < 16; i14++) {
            hashFunctions.hash_n_n_mask(bArr, i3, bArr, i3, bArr3, (i14 * 32) + i11);
        }
    }

    public void wots_pkgen(HashFunctions hashFunctions, byte[] bArr, int i3, byte[] bArr2, int i10, byte[] bArr3, int i11) {
        expand_seed(bArr, i3, bArr2, i10);
        for (int i12 = 0; i12 < 67; i12++) {
            int i13 = (i12 * 32) + i3;
            gen_chain(hashFunctions, bArr, i13, bArr, i13, bArr3, i11, 15);
        }
    }

    public void wots_sign(HashFunctions hashFunctions, byte[] bArr, int i3, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int[] iArr = new int[67];
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < 64) {
            byte b2 = bArr2[i11 / 2];
            iArr[i11] = b2 & 15;
            int i13 = (b2 & UByte.MAX_VALUE) >>> 4;
            iArr[i11 + 1] = i13;
            i12 = (15 - i13) + (15 - iArr[i11]) + i12;
            i11 += 2;
        }
        while (i11 < 67) {
            iArr[i11] = i12 & 15;
            i12 >>>= 4;
            i11++;
        }
        byte[] bArr5 = bArr;
        expand_seed(bArr5, i3, bArr3, 0);
        while (i10 < 67) {
            int i14 = (i10 * 32) + i3;
            gen_chain(hashFunctions, bArr5, i14, bArr, i14, bArr4, 0, iArr[i10]);
            i10++;
            bArr5 = bArr;
        }
    }

    public void wots_verify(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2, int i3, byte[] bArr3, byte[] bArr4) {
        int[] iArr = new int[67];
        int i10 = 0;
        int i11 = 0;
        while (i10 < 64) {
            byte b2 = bArr3[i10 / 2];
            iArr[i10] = b2 & 15;
            int i12 = (b2 & UByte.MAX_VALUE) >>> 4;
            iArr[i10 + 1] = i12;
            i11 = (15 - i12) + (15 - iArr[i10]) + i11;
            i10 += 2;
        }
        while (i10 < 67) {
            iArr[i10] = i11 & 15;
            i11 >>>= 4;
            i10++;
        }
        for (int i13 = 0; i13 < 67; i13++) {
            int i14 = i13 * 32;
            int i15 = iArr[i13];
            gen_chain(hashFunctions, bArr, i14, bArr2, i3 + i14, bArr4, i15 * 32, 15 - i15);
        }
    }
}
