package org.bouncycastle.pqc.crypto.sphincsplus;

import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class WotsPlus {
    private final SPHINCSPlusEngine engine;

    /* renamed from: w, reason: collision with root package name */
    private final int f19494w;

    public WotsPlus(SPHINCSPlusEngine sPHINCSPlusEngine) {
        this.engine = sPHINCSPlusEngine;
        this.f19494w = sPHINCSPlusEngine.WOTS_W;
    }

    public int[] base_w(byte[] bArr, int i3, int i10) {
        int[] iArr = new int[i10];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i10; i15++) {
            if (i11 == 0) {
                i14 = bArr[i12];
                i12++;
                i11 += 8;
            }
            i11 -= this.engine.WOTS_LOGW;
            iArr[i13] = (i14 >>> i11) & (i3 - 1);
            i13++;
        }
        return iArr;
    }

    public byte[] chain(byte[] bArr, int i3, int i10, byte[] bArr2, ADRS adrs) {
        if (i10 == 0) {
            return Arrays.clone(bArr);
        }
        int i11 = i3 + i10;
        if (i11 > this.f19494w - 1) {
            return null;
        }
        byte[] chain = chain(bArr, i3, i10 - 1, bArr2, adrs);
        adrs.setHashAddress(i11 - 1);
        return this.engine.F(bArr2, adrs, chain);
    }

    public byte[] pkFromSig(byte[] bArr, byte[] bArr2, byte[] bArr3, ADRS adrs) {
        SPHINCSPlusEngine sPHINCSPlusEngine;
        ADRS adrs2 = new ADRS(adrs);
        int[] base_w = base_w(bArr2, this.f19494w, this.engine.WOTS_LEN1);
        int i3 = 0;
        int i10 = 0;
        while (true) {
            sPHINCSPlusEngine = this.engine;
            if (i3 >= sPHINCSPlusEngine.WOTS_LEN1) {
                break;
            }
            i10 += (this.f19494w - 1) - base_w[i3];
            i3++;
        }
        int i11 = sPHINCSPlusEngine.WOTS_LEN2;
        int i12 = sPHINCSPlusEngine.WOTS_LOGW;
        int[] concatenate = Arrays.concatenate(base_w, base_w(Arrays.copyOfRange(Pack.intToBigEndian(i10 << (8 - ((i11 * i12) % 8))), 4 - (((i11 * i12) + 7) / 8), 4), this.f19494w, this.engine.WOTS_LEN2));
        SPHINCSPlusEngine sPHINCSPlusEngine2 = this.engine;
        byte[] bArr4 = new byte[sPHINCSPlusEngine2.f19474N];
        byte[][] bArr5 = new byte[sPHINCSPlusEngine2.WOTS_LEN][];
        for (int i13 = 0; i13 < this.engine.WOTS_LEN; i13++) {
            adrs.setChainAddress(i13);
            int i14 = this.engine.f19474N;
            System.arraycopy(bArr, i13 * i14, bArr4, 0, i14);
            int i15 = concatenate[i13];
            bArr5[i13] = chain(bArr4, i15, (this.f19494w - 1) - i15, bArr3, adrs);
        }
        adrs2.setType(1);
        adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
        return this.engine.T_l(bArr3, adrs2, Arrays.concatenate(bArr5));
    }

    public byte[] pkGen(byte[] bArr, byte[] bArr2, ADRS adrs) {
        ADRS adrs2 = new ADRS(adrs);
        byte[][] bArr3 = new byte[this.engine.WOTS_LEN][];
        int i3 = 0;
        while (i3 < this.engine.WOTS_LEN) {
            ADRS adrs3 = new ADRS(adrs);
            adrs3.setType(5);
            adrs3.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs3.setChainAddress(i3);
            adrs3.setHashAddress(0);
            byte[] PRF = this.engine.PRF(bArr2, bArr, adrs3);
            adrs3.setType(0);
            adrs3.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs3.setChainAddress(i3);
            adrs3.setHashAddress(0);
            byte[] bArr4 = bArr2;
            bArr3[i3] = chain(PRF, 0, this.f19494w - 1, bArr4, adrs3);
            i3++;
            bArr2 = bArr4;
        }
        adrs2.setType(1);
        adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
        return this.engine.T_l(bArr2, adrs2, Arrays.concatenate(bArr3));
    }

    public byte[] sign(byte[] bArr, byte[] bArr2, byte[] bArr3, ADRS adrs) {
        SPHINCSPlusEngine sPHINCSPlusEngine;
        ADRS adrs2 = new ADRS(adrs);
        int[] base_w = base_w(bArr, this.f19494w, this.engine.WOTS_LEN1);
        int i3 = 0;
        int i10 = 0;
        while (true) {
            sPHINCSPlusEngine = this.engine;
            if (i3 >= sPHINCSPlusEngine.WOTS_LEN1) {
                break;
            }
            i10 += (this.f19494w - 1) - base_w[i3];
            i3++;
        }
        int i11 = sPHINCSPlusEngine.WOTS_LOGW;
        if (i11 % 8 != 0) {
            i10 <<= 8 - ((sPHINCSPlusEngine.WOTS_LEN2 * i11) % 8);
        }
        int i12 = ((sPHINCSPlusEngine.WOTS_LEN2 * i11) + 7) / 8;
        byte[] intToBigEndian = Pack.intToBigEndian(i10);
        int[] concatenate = Arrays.concatenate(base_w, base_w(Arrays.copyOfRange(intToBigEndian, i12, intToBigEndian.length), this.f19494w, this.engine.WOTS_LEN2));
        byte[][] bArr4 = new byte[this.engine.WOTS_LEN][];
        int i13 = 0;
        while (i13 < this.engine.WOTS_LEN) {
            adrs2.setType(5);
            adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs2.setChainAddress(i13);
            adrs2.setHashAddress(0);
            byte[] PRF = this.engine.PRF(bArr3, bArr2, adrs2);
            adrs2.setType(0);
            adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs2.setChainAddress(i13);
            adrs2.setHashAddress(0);
            byte[] bArr5 = bArr3;
            bArr4[i13] = chain(PRF, 0, concatenate[i13], bArr5, adrs2);
            i13++;
            bArr3 = bArr5;
        }
        return Arrays.concatenate(bArr4);
    }
}
