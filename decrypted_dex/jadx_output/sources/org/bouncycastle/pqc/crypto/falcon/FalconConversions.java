package org.bouncycastle.pqc.crypto.falcon;

import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class FalconConversions {
    private int toUnsignedInt(byte b2) {
        return b2 & UByte.MAX_VALUE;
    }

    private long toUnsignedLong(byte b2) {
        return b2 & 255;
    }

    public int bytes_to_int(byte[] bArr, int i3) {
        return (toUnsignedInt(bArr[i3 + 3]) << 24) | toUnsignedInt(bArr[i3]) | (toUnsignedInt(bArr[i3 + 1]) << 8) | (toUnsignedInt(bArr[i3 + 2]) << 16);
    }

    public int[] bytes_to_int_array(byte[] bArr, int i3, int i10) {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = bytes_to_int(bArr, (i11 * 4) + i3);
        }
        return iArr;
    }

    public long bytes_to_long(byte[] bArr, int i3) {
        return (toUnsignedLong(bArr[i3 + 7]) << 56) | toUnsignedLong(bArr[i3]) | (toUnsignedLong(bArr[i3 + 1]) << 8) | (toUnsignedLong(bArr[i3 + 2]) << 16) | (toUnsignedLong(bArr[i3 + 3]) << 24) | (toUnsignedLong(bArr[i3 + 4]) << 32) | (toUnsignedLong(bArr[i3 + 5]) << 40) | (toUnsignedLong(bArr[i3 + 6]) << 48);
    }

    public byte[] int_to_bytes(int i3) {
        return new byte[]{(byte) i3, (byte) (i3 >>> 8), (byte) (i3 >>> 16), (byte) (i3 >>> 24)};
    }

    public byte[] long_to_bytes(long j) {
        return new byte[]{(byte) j, (byte) (j >>> 8), (byte) (j >>> 16), (byte) (j >>> 24), (byte) (j >>> 32), (byte) (j >>> 40), (byte) (j >>> 48), (byte) (j >>> 56)};
    }
}
