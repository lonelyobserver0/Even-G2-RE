package org.bouncycastle.util.encoders;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class HexTranslator implements Translator {
    private static final byte[] hexTable = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    @Override // org.bouncycastle.util.encoders.Translator
    public int decode(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) {
        int i12 = i10 / 2;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = (i13 * 2) + i3;
            byte b2 = bArr[i14];
            byte b10 = bArr[i14 + 1];
            if (b2 < 97) {
                bArr2[i11] = (byte) ((b2 - 48) << 4);
            } else {
                bArr2[i11] = (byte) ((b2 - 87) << 4);
            }
            if (b10 < 97) {
                bArr2[i11] = (byte) (bArr2[i11] + ((byte) (b10 - 48)));
            } else {
                bArr2[i11] = (byte) (bArr2[i11] + ((byte) (b10 - 87)));
            }
            i11++;
        }
        return i12;
    }

    @Override // org.bouncycastle.util.encoders.Translator
    public int encode(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            int i14 = i11 + i13;
            byte[] bArr3 = hexTable;
            bArr2[i14] = bArr3[(bArr[i3] >> 4) & 15];
            bArr2[i14 + 1] = bArr3[bArr[i3] & 15];
            i3++;
            i12++;
            i13 += 2;
        }
        return i10 * 2;
    }

    @Override // org.bouncycastle.util.encoders.Translator
    public int getDecodedBlockSize() {
        return 1;
    }

    @Override // org.bouncycastle.util.encoders.Translator
    public int getEncodedBlockSize() {
        return 2;
    }
}
