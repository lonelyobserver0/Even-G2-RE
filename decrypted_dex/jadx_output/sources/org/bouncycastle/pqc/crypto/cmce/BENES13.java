package org.bouncycastle.pqc.crypto.cmce;

import java.lang.reflect.Array;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class BENES13 extends BENES {
    public BENES13(int i3, int i10, int i11) {
        super(i3, i10, i11);
    }

    public static void layer_ex(long[] jArr, long[] jArr2, int i3) {
        int i10 = 1 << i3;
        int i11 = 0;
        for (int i12 = 0; i12 < 128; i12 += i10 * 2) {
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

    public static void layer_in(long[] jArr, long[] jArr2, int i3) {
        int i10 = 1 << i3;
        int i11 = 0;
        for (int i12 = 0; i12 < 64; i12 += i10 * 2) {
            for (int i13 = i12; i13 < i12 + i10; i13++) {
                long j = jArr[i13];
                int i14 = i13 + i10;
                int i15 = i11 + 1;
                long j3 = (jArr[i14] ^ j) & jArr2[i11];
                jArr[i13] = j ^ j3;
                jArr[i14] = jArr[i14] ^ j3;
                int i16 = i13 + 64;
                long j10 = jArr[i16];
                int i17 = i16 + i10;
                i11 += 2;
                long j11 = jArr2[i15] & (jArr[i17] ^ j10);
                jArr[i16] = j10 ^ j11;
                jArr[i17] = jArr[i17] ^ j11;
            }
        }
    }

    public void apply_benes(byte[] bArr, byte[] bArr2, int i3) {
        int i10;
        int i11;
        int i12;
        long[] jArr = new long[128];
        long[] jArr2 = new long[128];
        long[] jArr3 = new long[64];
        long[] jArr4 = new long[64];
        if (i3 == 0) {
            i10 = (this.SYS_T * 2) + 40;
            i11 = 0;
        } else {
            i10 = (this.SYS_T * 2) + 12328;
            i11 = -1024;
        }
        for (int i13 = 0; i13 < 64; i13++) {
            int i14 = i13 * 16;
            jArr[i13] = Utils.load8(bArr, i14);
            jArr[i13 + 64] = Utils.load8(bArr, i14 + 8);
        }
        BENES.transpose_64x64(jArr2, jArr, 0);
        BENES.transpose_64x64(jArr2, jArr, 64);
        int i15 = 0;
        while (true) {
            if (i15 > 6) {
                break;
            }
            for (int i16 = 0; i16 < 64; i16++) {
                jArr3[i16] = Utils.load8(bArr2, i10);
                i10 += 8;
            }
            i10 += i11;
            BENES.transpose_64x64(jArr4, jArr3);
            layer_ex(jArr2, jArr4, i15);
            i15++;
        }
        BENES.transpose_64x64(jArr, jArr2, 0);
        BENES.transpose_64x64(jArr, jArr2, 64);
        for (int i17 = 0; i17 <= 5; i17++) {
            for (int i18 = 0; i18 < 64; i18++) {
                jArr3[i18] = Utils.load8(bArr2, i10);
                i10 += 8;
            }
            i10 += i11;
            layer_in(jArr, jArr3, i17);
        }
        for (int i19 = 4; i19 >= 0; i19--) {
            for (int i20 = 0; i20 < 64; i20++) {
                jArr3[i20] = Utils.load8(bArr2, i10);
                i10 += 8;
            }
            i10 += i11;
            layer_in(jArr, jArr3, i19);
        }
        BENES.transpose_64x64(jArr2, jArr, 0);
        BENES.transpose_64x64(jArr2, jArr, 64);
        for (i12 = 6; i12 >= 0; i12--) {
            for (int i21 = 0; i21 < 64; i21++) {
                jArr3[i21] = Utils.load8(bArr2, i10);
                i10 += 8;
            }
            i10 += i11;
            BENES.transpose_64x64(jArr4, jArr3);
            layer_ex(jArr2, jArr4, i12);
        }
        BENES.transpose_64x64(jArr, jArr2, 0);
        BENES.transpose_64x64(jArr, jArr2, 64);
        for (int i22 = 0; i22 < 64; i22++) {
            int i23 = i22 * 16;
            Utils.store8(bArr, i23, jArr[i22]);
            Utils.store8(bArr, i23 + 8, jArr[i22 + 64]);
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
