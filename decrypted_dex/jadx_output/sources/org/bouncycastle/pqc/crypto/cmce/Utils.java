package org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Utils {
    public static short bitrev(short s10, int i3) {
        short s11 = (short) (((s10 & 65280) >> 8) | ((s10 & 255) << 8));
        short s12 = (short) (((s11 & 61680) >> 4) | ((s11 & 3855) << 4));
        short s13 = (short) (((s12 & 52428) >> 2) | ((s12 & 13107) << 2));
        short s14 = (short) (((s13 & 43690) >> 1) | ((s13 & 21845) << 1));
        return (short) (i3 == 12 ? s14 >> 4 : s14 >> 3);
    }

    public static int load4(byte[] bArr, int i3) {
        return Pack.littleEndianToInt(bArr, i3);
    }

    public static long load8(byte[] bArr, int i3) {
        return Pack.littleEndianToLong(bArr, i3);
    }

    public static short load_gf(byte[] bArr, int i3, int i10) {
        return (short) (Pack.littleEndianToShort(bArr, i3) & i10);
    }

    public static void store8(byte[] bArr, int i3, long j) {
        bArr[i3] = (byte) (j & 255);
        bArr[i3 + 1] = (byte) ((j >> 8) & 255);
        bArr[i3 + 2] = (byte) ((j >> 16) & 255);
        bArr[i3 + 3] = (byte) ((j >> 24) & 255);
        bArr[i3 + 4] = (byte) ((j >> 32) & 255);
        bArr[i3 + 5] = (byte) ((j >> 40) & 255);
        bArr[i3 + 6] = (byte) ((j >> 48) & 255);
        bArr[i3 + 7] = (byte) ((j >> 56) & 255);
    }

    public static void store_gf(byte[] bArr, int i3, short s10) {
        bArr[i3] = (byte) (s10 & 255);
        bArr[i3 + 1] = (byte) (s10 >> 8);
    }
}
