package org.bouncycastle.pqc.crypto.newhope;

import android.R;
import kotlin.UByte;
import kotlin.UShort;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Poly {
    public static void add(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i3 = 0; i3 < 1024; i3++) {
            sArr3[i3] = Reduce.barrett((short) (sArr[i3] + sArr2[i3]));
        }
    }

    public static void fromBytes(short[] sArr, byte[] bArr) {
        for (int i3 = 0; i3 < 256; i3++) {
            int i10 = i3 * 7;
            int i11 = bArr[i10] & UByte.MAX_VALUE;
            byte b2 = bArr[i10 + 1];
            int i12 = b2 & UByte.MAX_VALUE;
            int i13 = bArr[i10 + 2] & UByte.MAX_VALUE;
            byte b10 = bArr[i10 + 3];
            int i14 = b10 & UByte.MAX_VALUE;
            int i15 = bArr[i10 + 4] & UByte.MAX_VALUE;
            byte b11 = bArr[i10 + 5];
            int i16 = b11 & UByte.MAX_VALUE;
            int i17 = bArr[i10 + 6] & UByte.MAX_VALUE;
            int i18 = i3 * 4;
            sArr[i18] = (short) (i11 | ((b2 & 63) << 8));
            sArr[i18 + 1] = (short) ((i12 >>> 6) | (i13 << 2) | ((b10 & 15) << 10));
            sArr[i18 + 2] = (short) ((i14 >>> 4) | (i15 << 4) | ((b11 & 3) << 12));
            sArr[i18 + 3] = (short) ((i17 << 6) | (i16 >>> 2));
        }
    }

    public static void fromNTT(short[] sArr) {
        NTT.bitReverse(sArr);
        NTT.core(sArr, Precomp.OMEGAS_INV_MONTGOMERY);
        NTT.mulCoefficients(sArr, Precomp.PSIS_INV_MONTGOMERY);
    }

    public static void getNoise(short[] sArr, byte[] bArr, byte b2) {
        byte[] bArr2 = new byte[8];
        bArr2[0] = b2;
        byte[] bArr3 = new byte[4096];
        ChaCha20.process(bArr, bArr2, bArr3, 0, 4096);
        for (int i3 = 0; i3 < 1024; i3++) {
            int bigEndianToInt = Pack.bigEndianToInt(bArr3, i3 * 4);
            int i10 = 0;
            for (int i11 = 0; i11 < 8; i11++) {
                i10 += (bigEndianToInt >> i11) & R.attr.cacheColorHint;
            }
            sArr[i3] = (short) (((((i10 >>> 24) + i10) & 255) + 12289) - (((i10 >>> 16) + (i10 >>> 8)) & 255));
        }
    }

    private static short normalize(short s10) {
        short barrett = Reduce.barrett(s10);
        int i3 = barrett - 12289;
        return (short) (((barrett ^ i3) & (i3 >> 31)) ^ i3);
    }

    public static void pointWise(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i3 = 0; i3 < 1024; i3++) {
            sArr3[i3] = Reduce.montgomery((sArr[i3] & UShort.MAX_VALUE) * (65535 & Reduce.montgomery((sArr2[i3] & UShort.MAX_VALUE) * 3186)));
        }
    }

    public static void toBytes(byte[] bArr, short[] sArr) {
        for (int i3 = 0; i3 < 256; i3++) {
            int i10 = i3 * 4;
            short normalize = normalize(sArr[i10]);
            short normalize2 = normalize(sArr[i10 + 1]);
            short normalize3 = normalize(sArr[i10 + 2]);
            short normalize4 = normalize(sArr[i10 + 3]);
            int i11 = i3 * 7;
            bArr[i11] = (byte) normalize;
            bArr[i11 + 1] = (byte) ((normalize >> 8) | (normalize2 << 6));
            bArr[i11 + 2] = (byte) (normalize2 >> 2);
            bArr[i11 + 3] = (byte) ((normalize2 >> 10) | (normalize3 << 4));
            bArr[i11 + 4] = (byte) (normalize3 >> 4);
            bArr[i11 + 5] = (byte) ((normalize3 >> 12) | (normalize4 << 2));
            bArr[i11 + 6] = (byte) (normalize4 >> 6);
        }
    }

    public static void toNTT(short[] sArr) {
        NTT.mulCoefficients(sArr, Precomp.PSIS_BITREV_MONTGOMERY);
        NTT.core(sArr, Precomp.OMEGAS_MONTGOMERY);
    }

    public static void uniform(short[] sArr, byte[] bArr) {
        SHAKEDigest sHAKEDigest = new SHAKEDigest(128);
        sHAKEDigest.update(bArr, 0, bArr.length);
        int i3 = 0;
        while (true) {
            byte[] bArr2 = new byte[256];
            sHAKEDigest.doOutput(bArr2, 0, 256);
            for (int i10 = 0; i10 < 256; i10 += 2) {
                int i11 = (bArr2[i10] & UByte.MAX_VALUE) | ((bArr2[i10 + 1] & UByte.MAX_VALUE) << 8);
                if (i11 < 61445) {
                    int i12 = i3 + 1;
                    sArr[i3] = (short) i11;
                    if (i12 == 1024) {
                        return;
                    } else {
                        i3 = i12;
                    }
                }
            }
        }
    }
}
