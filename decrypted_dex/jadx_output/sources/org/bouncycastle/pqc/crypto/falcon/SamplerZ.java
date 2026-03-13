package org.bouncycastle.pqc.crypto.falcon;

import E1.a;
import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class SamplerZ {
    FPREngine fpr = new FPREngine();

    public int BerExp(FalconRNG falconRNG, FalconFPR falconFPR, FalconFPR falconFPR2) {
        int prng_get_u8;
        FPREngine fPREngine = this.fpr;
        int fpr_trunc = (int) fPREngine.fpr_trunc(fPREngine.fpr_mul(falconFPR, fPREngine.fpr_inv_log2));
        FPREngine fPREngine2 = this.fpr;
        long fpr_expm_p63 = ((this.fpr.fpr_expm_p63(fPREngine2.fpr_sub(falconFPR, fPREngine2.fpr_mul(fPREngine2.fpr_of(fpr_trunc), this.fpr.fpr_log2)), falconFPR2) << 1) - 1) >>> (fpr_trunc ^ ((fpr_trunc ^ 63) & (-((63 - fpr_trunc) >>> 31))));
        int i3 = 64;
        do {
            i3 -= 8;
            prng_get_u8 = (falconRNG.prng_get_u8() & UByte.MAX_VALUE) - (((int) (fpr_expm_p63 >>> i3)) & 255);
            if (prng_get_u8 != 0) {
                break;
            }
        } while (i3 > 0);
        return prng_get_u8 >>> 31;
    }

    public int gaussian0_sampler(FalconRNG falconRNG) {
        int[] iArr = {10745844, 3068844, 3741698, 5559083, 1580863, 8248194, 2260429, 13669192, 2736639, 708981, 4421575, 10046180, 169348, 7122675, 4136815, 30538, 13063405, 7650655, 4132, 14505003, 7826148, 417, 16768101, 11363290, 31, 8444042, 8086568, 1, 12844466, 265321, 0, 1232676, 13644283, 0, 38047, 9111839, 0, 870, 6138264, 0, 14, 12545723, 0, 0, 3104126, 0, 0, 28824, 0, 0, 198, 0, 0, 1};
        long prng_get_u64 = falconRNG.prng_get_u64();
        int i3 = ((int) prng_get_u64) & 16777215;
        int i10 = 16777215 & ((int) (prng_get_u64 >>> 24));
        int prng_get_u8 = ((falconRNG.prng_get_u8() & UByte.MAX_VALUE) << 16) | ((int) (prng_get_u64 >>> 48));
        int i11 = 0;
        for (int i12 = 0; i12 < 54; i12 += 3) {
            i11 += ((prng_get_u8 - iArr[i12]) - (((i10 - iArr[i12 + 1]) - ((i3 - iArr[i12 + 2]) >>> 31)) >>> 31)) >>> 31;
        }
        return i11;
    }

    public int sample(SamplerCtx samplerCtx, FalconFPR falconFPR, FalconFPR falconFPR2) {
        return sampler(samplerCtx, falconFPR, falconFPR2);
    }

    public int sampler(SamplerCtx samplerCtx, FalconFPR falconFPR, FalconFPR falconFPR2) {
        int gaussian0_sampler;
        int f10;
        FalconFPR fpr_mul;
        FPREngine fPREngine;
        int fpr_floor = (int) this.fpr.fpr_floor(falconFPR);
        FPREngine fPREngine2 = this.fpr;
        FalconFPR fpr_sub = fPREngine2.fpr_sub(falconFPR, fPREngine2.fpr_of(fpr_floor));
        FPREngine fPREngine3 = this.fpr;
        FalconFPR fpr_half = fPREngine3.fpr_half(fPREngine3.fpr_sqr(falconFPR2));
        FalconFPR fpr_mul2 = this.fpr.fpr_mul(falconFPR2, samplerCtx.sigma_min);
        do {
            gaussian0_sampler = gaussian0_sampler(samplerCtx.f19396p);
            int prng_get_u8 = samplerCtx.f19396p.prng_get_u8() & 1;
            f10 = a.f(prng_get_u8 << 1, 1, gaussian0_sampler, prng_get_u8);
            FPREngine fPREngine4 = this.fpr;
            fpr_mul = fPREngine4.fpr_mul(fPREngine4.fpr_sqr(fPREngine4.fpr_sub(fPREngine4.fpr_of(f10), fpr_sub)), fpr_half);
            fPREngine = this.fpr;
        } while (BerExp(samplerCtx.f19396p, fPREngine.fpr_sub(fpr_mul, fPREngine.fpr_mul(fPREngine.fpr_of(gaussian0_sampler * gaussian0_sampler), this.fpr.fpr_inv_2sqrsigma0)), fpr_mul2) == 0);
        return fpr_floor + f10;
    }
}
