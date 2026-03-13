package org.bouncycastle.pqc.crypto.cmce;

import java.lang.reflect.Array;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class BENES12 extends BENES {
    public BENES12(int i3, int i10, int i11) {
        super(i3, i10, i11);
    }

    private void apply_benes(byte[] bArr, byte[] bArr2, int i3) {
        int i10;
        int i11;
        long[] jArr = new long[64];
        long[] jArr2 = new long[64];
        for (int i12 = 0; i12 < 64; i12++) {
            jArr[i12] = Utils.load8(bArr, i12 * 8);
        }
        int i13 = 256;
        if (i3 == 0) {
            i10 = (this.SYS_T * 2) + 40;
        } else {
            i10 = (this.SYS_T * 2) + 40 + (((this.GFBITS * 2) - 2) * 256);
            i13 = -256;
        }
        BENES.transpose_64x64(jArr, jArr);
        int i14 = 0;
        while (true) {
            if (i14 > 5) {
                break;
            }
            for (int i15 = 0; i15 < 64; i15++) {
                jArr2[i15] = Utils.load4(bArr2, (i15 * 4) + i10);
            }
            BENES.transpose_64x64(jArr2, jArr2);
            layerBenes(jArr, jArr2, i14);
            i10 += i13;
            i14++;
        }
        BENES.transpose_64x64(jArr, jArr);
        for (int i16 = 0; i16 <= 5; i16++) {
            for (int i17 = 0; i17 < 32; i17++) {
                jArr2[i17] = Utils.load8(bArr2, (i17 * 8) + i10);
            }
            layerBenes(jArr, jArr2, i16);
            i10 += i13;
        }
        for (int i18 = 4; i18 >= 0; i18--) {
            for (int i19 = 0; i19 < 32; i19++) {
                jArr2[i19] = Utils.load8(bArr2, (i19 * 8) + i10);
            }
            layerBenes(jArr, jArr2, i18);
            i10 += i13;
        }
        BENES.transpose_64x64(jArr, jArr);
        for (i11 = 5; i11 >= 0; i11--) {
            for (int i20 = 0; i20 < 64; i20++) {
                jArr2[i20] = Utils.load4(bArr2, (i20 * 4) + i10);
            }
            BENES.transpose_64x64(jArr2, jArr2);
            layerBenes(jArr, jArr2, i11);
            i10 += i13;
        }
        BENES.transpose_64x64(jArr, jArr);
        for (int i21 = 0; i21 < 64; i21++) {
            Utils.store8(bArr, i21 * 8, jArr[i21]);
        }
    }

    public static void layerBenes(long[] jArr, long[] jArr2, int i3) {
        int i10 = 1 << i3;
        int i11 = 0;
        for (int i12 = 0; i12 < 64; i12 += i10 * 2) {
            int i13 = i12;
            while (i13 < i12 + i10) {
                long j = jArr[i13];
                int i14 = i13 + i10;
                long j3 = (jArr[i14] ^ j) & jArr2[i11];
                jArr[i13] = j ^ j3;
                jArr[i14] = jArr[i14] ^ j3;
                i13++;
                i11++;
            }
        }
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.BENES
    public void support_gen(short[] sArr, byte[] bArr) {
        int i3 = this.GFBITS;
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i3, (1 << i3) / 8);
        for (int i10 = 0; i10 < this.GFBITS; i10++) {
            for (int i11 = 0; i11 < (1 << this.GFBITS) / 8; i11++) {
                bArr2[i10][i11] = 0;
            }
        }
        int i12 = 0;
        while (true) {
            int i13 = this.GFBITS;
            if (i12 >= (1 << i13)) {
                break;
            }
            short bitrev = Utils.bitrev((short) i12, i13);
            for (int i14 = 0; i14 < this.GFBITS; i14++) {
                byte[] bArr3 = bArr2[i14];
                int i15 = i12 / 8;
                bArr3[i15] = (byte) (bArr3[i15] | (((bitrev >> i14) & 1) << (i12 % 8)));
            }
            i12++;
        }
        for (int i16 = 0; i16 < this.GFBITS; i16++) {
            apply_benes(bArr2[i16], bArr, 0);
        }
        for (int i17 = 0; i17 < this.SYS_N; i17++) {
            sArr[i17] = 0;
            for (int i18 = this.GFBITS - 1; i18 >= 0; i18--) {
                short s10 = (short) (sArr[i17] << 1);
                sArr[i17] = s10;
                sArr[i17] = (short) (s10 | ((bArr2[i18][i17 / 8] >> (i17 % 8)) & 1));
            }
        }
    }
}
