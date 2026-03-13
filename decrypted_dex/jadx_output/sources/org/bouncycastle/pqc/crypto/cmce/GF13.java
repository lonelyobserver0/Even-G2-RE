package org.bouncycastle.pqc.crypto.cmce;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class GF13 extends GF {
    public GF13(int i3) {
        super(i3);
    }

    private short gf_sq2mul(short s10, short s11) {
        long[] jArr = {2301339409586323456L, 4494803534348288L, 8778913153024L, 17146314752L, 33423360, 122880};
        long j = s10;
        long j3 = s11;
        long j10 = (j3 << 18) * (64 & j);
        long j11 = j ^ (j << 21);
        long j12 = ((j3 * (j11 & 8589934624L)) << 15) ^ (((((j10 ^ ((268435457 & j11) * j3)) ^ (((536870914 & j11) * j3) << 3)) ^ (((1073741828 & j11) * j3) << 6)) ^ (((2147483656L & j11) * j3) << 9)) ^ (((4294967312L & j11) * j3) << 12));
        for (int i3 = 0; i3 < 6; i3++) {
            long j13 = jArr[i3] & j12;
            j12 ^= (j13 >> 13) ^ (((j13 >> 9) ^ (j13 >> 10)) ^ (j13 >> 12));
        }
        return (short) (j12 & this.GFMASK);
    }

    private short gf_sqmul(short s10, short s11) {
        long[] jArr = {137170518016L, 267911168, 516096};
        long j = s10;
        long j3 = s11;
        long j10 = (j3 << 6) * (64 & j);
        long j11 = j ^ (j << 7);
        long j12 = ((j3 * (j11 & 524320)) << 5) ^ (((((j10 ^ ((16385 & j11) * j3)) ^ (((32770 & j11) * j3) << 1)) ^ (((65540 & j11) * j3) << 2)) ^ (((131080 & j11) * j3) << 3)) ^ (((262160 & j11) * j3) << 4));
        for (int i3 = 0; i3 < 3; i3++) {
            long j13 = jArr[i3] & j12;
            j12 ^= (j13 >> 13) ^ (((j13 >> 9) ^ (j13 >> 10)) ^ (j13 >> 12));
        }
        return (short) (j12 & this.GFMASK);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_frac(short s10, short s11) {
        short gf_sqmul = gf_sqmul(s10, s10);
        short gf_sq2mul = gf_sq2mul(gf_sqmul, gf_sqmul);
        return gf_sqmul(gf_sq2mul(gf_sq2(gf_sq2mul(gf_sq2(gf_sq2mul), gf_sq2mul)), gf_sq2mul), s11);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_inv(short s10) {
        return gf_frac(s10, (short) 1);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_mul(short s10, short s11) {
        long j = s10;
        long j3 = s11;
        long j10 = (1 & j3) * j;
        for (int i3 = 1; i3 < this.GFBITS; i3++) {
            j10 ^= ((1 << i3) & j3) * j;
        }
        long j11 = 33488896 & j10;
        long j12 = 57344 & (((j11 >> 13) ^ (((j11 >> 9) ^ (j11 >> 10)) ^ (j11 >> 12))) ^ j10);
        return (short) ((r10 ^ ((((j12 >> 10) ^ (j12 >> 9)) ^ (j12 >> 12)) ^ (j12 >> 13))) & this.GFMASK);
    }

    public short gf_sq2(short s10) {
        long[] jArr = {1229782938247303441L, 217020518514230019L, 4222189076152335L, 1095216660735L};
        long[] jArr2 = {561850441793536L, 1097364144128L, 2143289344, 4186112};
        long j = s10;
        long j3 = (j | (j << 24)) & jArr[3];
        long j10 = (j3 | (j3 << 12)) & jArr[2];
        long j11 = (j10 | (j10 << 6)) & jArr[1];
        long j12 = (j11 | (j11 << 3)) & jArr[0];
        for (int i3 = 0; i3 < 4; i3++) {
            long j13 = jArr2[i3] & j12;
            j12 ^= (j13 >> 13) ^ (((j13 >> 9) ^ (j13 >> 10)) ^ (j13 >> 12));
        }
        return (short) (this.GFMASK & j12);
    }
}
