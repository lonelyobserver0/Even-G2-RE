package org.bouncycastle.pqc.crypto.cmce;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class GF12 extends GF {
    public GF12(int i3) {
        super(i3);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_frac(short s10, short s11) {
        return gf_mul(gf_inv(s10), s11);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_inv(short s10) {
        short gf_mul = gf_mul(gf_sq(s10), s10);
        short gf_mul2 = gf_mul(gf_sq(gf_sq(gf_mul)), gf_mul);
        return gf_sq(gf_mul(gf_sq(gf_mul(gf_sq(gf_sq(gf_mul(gf_sq(gf_sq(gf_sq(gf_sq(gf_mul2)))), gf_mul2))), gf_mul)), s10));
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_mul(short s10, short s11) {
        int i3 = (s11 & 1) * s10;
        int i10 = 1;
        while (true) {
            int i11 = this.GFBITS;
            if (i10 >= i11) {
                int i12 = 8372224 & i3;
                int i13 = (i12 >> 12) ^ ((i12 >> 9) ^ i3);
                int i14 = i13 & 12288;
                return (short) (((i13 ^ (i14 >> 9)) ^ (i14 >> 12)) & ((1 << i11) - 1));
            }
            i3 ^= ((1 << i10) & s11) * s10;
            i10++;
        }
    }

    public short gf_sq(short s10) {
        int[] iArr = {1431655765, 858993459, 252645135, 16711935};
        int i3 = (s10 | (s10 << 8)) & iArr[3];
        int i10 = (i3 | (i3 << 4)) & iArr[2];
        int i11 = (i10 | (i10 << 2)) & iArr[1];
        int i12 = (i11 | (i11 << 1)) & iArr[0];
        int i13 = 8372224 & i12;
        int i14 = (i12 ^ (i13 >> 9)) ^ (i13 >> 12);
        int i15 = i14 & 12288;
        return (short) (((i14 ^ (i15 >> 9)) ^ (i15 >> 12)) & ((1 << this.GFBITS) - 1));
    }
}
