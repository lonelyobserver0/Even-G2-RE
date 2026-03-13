package org.bouncycastle.pqc.crypto.crystals.kyber;

import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
final class CBD {
    private static long convertByteTo24BitUnsignedInt(byte[] bArr, int i3) {
        return ((bArr[i3 + 2] & UByte.MAX_VALUE) << 16) | (bArr[i3] & UByte.MAX_VALUE) | ((bArr[i3 + 1] & UByte.MAX_VALUE) << 8);
    }

    private static long convertByteTo32BitUnsignedInt(byte[] bArr, int i3) {
        return ((bArr[i3 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i3] & UByte.MAX_VALUE) | ((bArr[i3 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i3 + 2] & UByte.MAX_VALUE) << 16);
    }

    public static void kyberCBD(Poly poly, byte[] bArr, int i3) {
        if (i3 != 3) {
            for (int i10 = 0; i10 < 32; i10++) {
                long convertByteTo32BitUnsignedInt = convertByteTo32BitUnsignedInt(bArr, i10 * 4);
                long j = (convertByteTo32BitUnsignedInt & 1431655765) + ((convertByteTo32BitUnsignedInt >> 1) & 1431655765);
                for (int i11 = 0; i11 < 8; i11++) {
                    int i12 = i11 * 4;
                    poly.setCoeffIndex((i10 * 8) + i11, (short) (((short) ((j >> i12) & 3)) - ((short) (3 & (j >> (i12 + i3))))));
                }
            }
            return;
        }
        for (int i13 = 0; i13 < 64; i13++) {
            long convertByteTo24BitUnsignedInt = convertByteTo24BitUnsignedInt(bArr, i13 * 3);
            long j3 = (convertByteTo24BitUnsignedInt & 2396745) + ((convertByteTo24BitUnsignedInt >> 1) & 2396745) + ((convertByteTo24BitUnsignedInt >> 2) & 2396745);
            for (int i14 = 0; i14 < 4; i14++) {
                int i15 = i14 * 6;
                poly.setCoeffIndex((i13 * 4) + i14, (short) (((short) ((j3 >> i15) & 7)) - ((short) (7 & (j3 >> (i15 + 3))))));
            }
        }
    }
}
