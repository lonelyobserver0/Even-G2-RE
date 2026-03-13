package org.bouncycastle.pqc.crypto.falcon;

import kotlin.UShort;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class FalconSign {
    FPREngine fpr = new FPREngine();
    FalconFFT fft = new FalconFFT();
    FalconCommon common = new FalconCommon();

    private static int MKN(int i3) {
        return 1 << i3;
    }

    public int do_sign_dyn(SamplerZ samplerZ, SamplerCtx samplerCtx, short[] sArr, int i3, byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12, byte[] bArr4, int i13, short[] sArr2, int i14, int i15, FalconFPR[] falconFPRArr, int i16) {
        int MKN = MKN(i15);
        int i17 = i16 + MKN;
        int i18 = i17 + MKN;
        int i19 = i18 + MKN;
        smallints_to_fpr(falconFPRArr, i17, bArr, i10, i15);
        smallints_to_fpr(falconFPRArr, i16, bArr2, i11, i15);
        smallints_to_fpr(falconFPRArr, i19, bArr3, i12, i15);
        smallints_to_fpr(falconFPRArr, i18, bArr4, i13, i15);
        this.fft.FFT(falconFPRArr, i17, i15);
        this.fft.FFT(falconFPRArr, i16, i15);
        this.fft.FFT(falconFPRArr, i19, i15);
        this.fft.FFT(falconFPRArr, i18, i15);
        this.fft.poly_neg(falconFPRArr, i17, i15);
        this.fft.poly_neg(falconFPRArr, i19, i15);
        int i20 = i19 + MKN;
        int i21 = i20 + MKN;
        System.arraycopy(falconFPRArr, i17, falconFPRArr, i20, MKN);
        this.fft.poly_mulselfadj_fft(falconFPRArr, i20, i15);
        System.arraycopy(falconFPRArr, i16, falconFPRArr, i21, MKN);
        this.fft.poly_muladj_fft(falconFPRArr, i21, falconFPRArr, i18, i15);
        this.fft.poly_mulselfadj_fft(falconFPRArr, i16, i15);
        this.fft.poly_add(falconFPRArr, i16, falconFPRArr, i20, i15);
        System.arraycopy(falconFPRArr, i17, falconFPRArr, i20, MKN);
        this.fft.poly_muladj_fft(falconFPRArr, i17, falconFPRArr, i19, i15);
        this.fft.poly_add(falconFPRArr, i17, falconFPRArr, i21, i15);
        this.fft.poly_mulselfadj_fft(falconFPRArr, i18, i15);
        System.arraycopy(falconFPRArr, i19, falconFPRArr, i21, MKN);
        this.fft.poly_mulselfadj_fft(falconFPRArr, i21, i15);
        this.fft.poly_add(falconFPRArr, i18, falconFPRArr, i21, i15);
        int i22 = i21 + MKN;
        for (int i23 = 0; i23 < MKN; i23++) {
            falconFPRArr[i21 + i23] = this.fpr.fpr_of(sArr2[i14 + i23]);
        }
        this.fft.FFT(falconFPRArr, i21, i15);
        FalconFPR falconFPR = this.fpr.fpr_inverse_of_q;
        System.arraycopy(falconFPRArr, i21, falconFPRArr, i22, MKN);
        this.fft.poly_mul_fft(falconFPRArr, i22, falconFPRArr, i20, i15);
        this.fft.poly_mulconst(falconFPRArr, i22, this.fpr.fpr_neg(falconFPR), i15);
        this.fft.poly_mul_fft(falconFPRArr, i21, falconFPRArr, i19, i15);
        this.fft.poly_mulconst(falconFPRArr, i21, falconFPR, i15);
        int i24 = MKN * 2;
        System.arraycopy(falconFPRArr, i21, falconFPRArr, i19, i24);
        ffSampling_fft_dyntree(samplerZ, samplerCtx, falconFPRArr, i19, falconFPRArr, i20, falconFPRArr, i16, falconFPRArr, i17, falconFPRArr, i18, i15, i15, falconFPRArr, i21);
        System.arraycopy(falconFPRArr, i19, falconFPRArr, i20, i24);
        smallints_to_fpr(falconFPRArr, i17, bArr, i10, i15);
        smallints_to_fpr(falconFPRArr, i16, bArr2, i11, i15);
        smallints_to_fpr(falconFPRArr, i19, bArr3, i12, i15);
        smallints_to_fpr(falconFPRArr, i18, bArr4, i13, i15);
        this.fft.FFT(falconFPRArr, i17, i15);
        this.fft.FFT(falconFPRArr, i16, i15);
        this.fft.FFT(falconFPRArr, i19, i15);
        this.fft.FFT(falconFPRArr, i18, i15);
        this.fft.poly_neg(falconFPRArr, i17, i15);
        this.fft.poly_neg(falconFPRArr, i19, i15);
        int i25 = i22 + MKN;
        System.arraycopy(falconFPRArr, i20, falconFPRArr, i22, MKN);
        System.arraycopy(falconFPRArr, i21, falconFPRArr, i25, MKN);
        this.fft.poly_mul_fft(falconFPRArr, i22, falconFPRArr, i16, i15);
        this.fft.poly_mul_fft(falconFPRArr, i25, falconFPRArr, i18, i15);
        this.fft.poly_add(falconFPRArr, i22, falconFPRArr, i25, i15);
        System.arraycopy(falconFPRArr, i20, falconFPRArr, i25, MKN);
        this.fft.poly_mul_fft(falconFPRArr, i25, falconFPRArr, i17, i15);
        System.arraycopy(falconFPRArr, i22, falconFPRArr, i20, MKN);
        this.fft.poly_mul_fft(falconFPRArr, i21, falconFPRArr, i19, i15);
        this.fft.poly_add(falconFPRArr, i21, falconFPRArr, i25, i15);
        this.fft.iFFT(falconFPRArr, i20, i15);
        this.fft.iFFT(falconFPRArr, i21, i15);
        short[] sArr3 = new short[MKN];
        int i26 = 0;
        int i27 = 0;
        for (int i28 = 0; i28 < MKN; i28++) {
            int fpr_rint = (sArr2[i14 + i28] & UShort.MAX_VALUE) - ((int) this.fpr.fpr_rint(falconFPRArr[i20 + i28]));
            i26 += fpr_rint * fpr_rint;
            i27 |= i26;
            sArr3[i28] = (short) fpr_rint;
        }
        int i29 = (-(i27 >>> 31)) | i26;
        short[] sArr4 = new short[MKN];
        for (int i30 = 0; i30 < MKN; i30++) {
            sArr4[i30] = (short) (-this.fpr.fpr_rint(falconFPRArr[i21 + i30]));
        }
        if (this.common.is_short_half(i29, sArr4, 0, i15) == 0) {
            return 0;
        }
        System.arraycopy(sArr4, 0, sArr, i3, MKN);
        return 1;
    }

    public int do_sign_tree(SamplerZ samplerZ, SamplerCtx samplerCtx, short[] sArr, int i3, FalconFPR[] falconFPRArr, int i10, short[] sArr2, int i11, int i12, FalconFPR[] falconFPRArr2, int i13) {
        int MKN = MKN(i12);
        int i14 = i13 + MKN;
        int skoff_b00 = i10 + skoff_b00(i12);
        int skoff_b01 = i10 + skoff_b01(i12);
        int skoff_b10 = i10 + skoff_b10(i12);
        int skoff_b11 = i10 + skoff_b11(i12);
        int skoff_tree = i10 + skoff_tree(i12);
        for (int i15 = 0; i15 < MKN; i15++) {
            falconFPRArr2[i13 + i15] = this.fpr.fpr_of(sArr2[i11 + i15]);
        }
        this.fft.FFT(falconFPRArr2, i13, i12);
        FalconFPR falconFPR = this.fpr.fpr_inverse_of_q;
        System.arraycopy(falconFPRArr2, i13, falconFPRArr2, i14, MKN);
        this.fft.poly_mul_fft(falconFPRArr2, i14, falconFPRArr, skoff_b01, i12);
        this.fft.poly_mulconst(falconFPRArr2, i14, this.fpr.fpr_neg(falconFPR), i12);
        this.fft.poly_mul_fft(falconFPRArr2, i13, falconFPRArr, skoff_b11, i12);
        this.fft.poly_mulconst(falconFPRArr2, i13, falconFPR, i12);
        int i16 = i14 + MKN;
        int i17 = i16 + MKN;
        ffSampling_fft(samplerZ, samplerCtx, falconFPRArr2, i16, falconFPRArr2, i17, falconFPRArr, skoff_tree, falconFPRArr2, i13, falconFPRArr2, i14, i12, falconFPRArr2, i17 + MKN);
        System.arraycopy(falconFPRArr2, i16, falconFPRArr2, i13, MKN);
        System.arraycopy(falconFPRArr2, i17, falconFPRArr2, i14, MKN);
        this.fft.poly_mul_fft(falconFPRArr2, i16, falconFPRArr, skoff_b00, i12);
        this.fft.poly_mul_fft(falconFPRArr2, i17, falconFPRArr, skoff_b10, i12);
        this.fft.poly_add(falconFPRArr2, i16, falconFPRArr2, i17, i12);
        System.arraycopy(falconFPRArr2, i13, falconFPRArr2, i17, MKN);
        this.fft.poly_mul_fft(falconFPRArr2, i17, falconFPRArr, skoff_b01, i12);
        System.arraycopy(falconFPRArr2, i16, falconFPRArr2, i13, MKN);
        this.fft.poly_mul_fft(falconFPRArr2, i14, falconFPRArr, skoff_b11, i12);
        this.fft.poly_add(falconFPRArr2, i14, falconFPRArr2, i17, i12);
        this.fft.iFFT(falconFPRArr2, i13, i12);
        this.fft.iFFT(falconFPRArr2, i14, i12);
        short[] sArr3 = new short[MKN];
        int i18 = 0;
        int i19 = 0;
        for (int i20 = 0; i20 < MKN; i20++) {
            int fpr_rint = (sArr2[i11 + i20] & UShort.MAX_VALUE) - ((int) this.fpr.fpr_rint(falconFPRArr2[i13 + i20]));
            i18 += fpr_rint * fpr_rint;
            i19 |= i18;
            sArr3[i20] = (short) fpr_rint;
        }
        int i21 = i18 | (-(i19 >>> 31));
        short[] sArr4 = new short[MKN];
        for (int i22 = 0; i22 < MKN; i22++) {
            sArr4[i22] = (short) (-this.fpr.fpr_rint(falconFPRArr2[i14 + i22]));
        }
        if (this.common.is_short_half(i21, sArr4, 0, i12) == 0) {
            return 0;
        }
        System.arraycopy(sArr4, 0, sArr, i3, MKN);
        System.arraycopy(sArr3, 0, falconFPRArr2, i13, MKN);
        return 1;
    }

    public void expand_privkey(FalconFPR[] falconFPRArr, int i3, byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12, byte[] bArr4, int i13, int i14, FalconFPR[] falconFPRArr2, int i15) {
        int MKN = MKN(i14);
        int skoff_b00 = i3 + skoff_b00(i14);
        int skoff_b01 = i3 + skoff_b01(i14);
        int skoff_b10 = i3 + skoff_b10(i14);
        int skoff_b11 = i3 + skoff_b11(i14);
        int skoff_tree = i3 + skoff_tree(i14);
        smallints_to_fpr(falconFPRArr, skoff_b01, bArr, i10, i14);
        smallints_to_fpr(falconFPRArr, skoff_b00, bArr2, i11, i14);
        smallints_to_fpr(falconFPRArr, skoff_b11, bArr3, i12, i14);
        smallints_to_fpr(falconFPRArr, skoff_b10, bArr4, i13, i14);
        this.fft.FFT(falconFPRArr, skoff_b01, i14);
        this.fft.FFT(falconFPRArr, skoff_b00, i14);
        this.fft.FFT(falconFPRArr, skoff_b11, i14);
        this.fft.FFT(falconFPRArr, skoff_b10, i14);
        this.fft.poly_neg(falconFPRArr, skoff_b01, i14);
        this.fft.poly_neg(falconFPRArr, skoff_b11, i14);
        int i16 = i15 + MKN;
        int i17 = i16 + MKN;
        int i18 = i17 + MKN;
        System.arraycopy(falconFPRArr, skoff_b00, falconFPRArr2, i15, MKN);
        this.fft.poly_mulselfadj_fft(falconFPRArr2, i15, i14);
        System.arraycopy(falconFPRArr, skoff_b01, falconFPRArr2, i18, MKN);
        this.fft.poly_mulselfadj_fft(falconFPRArr2, i18, i14);
        this.fft.poly_add(falconFPRArr2, i15, falconFPRArr2, i18, i14);
        System.arraycopy(falconFPRArr, skoff_b00, falconFPRArr2, i16, MKN);
        this.fft.poly_muladj_fft(falconFPRArr2, i16, falconFPRArr, skoff_b10, i14);
        System.arraycopy(falconFPRArr, skoff_b01, falconFPRArr2, i18, MKN);
        this.fft.poly_muladj_fft(falconFPRArr2, i18, falconFPRArr, skoff_b11, i14);
        this.fft.poly_add(falconFPRArr2, i16, falconFPRArr2, i18, i14);
        System.arraycopy(falconFPRArr, skoff_b10, falconFPRArr2, i17, MKN);
        this.fft.poly_mulselfadj_fft(falconFPRArr2, i17, i14);
        System.arraycopy(falconFPRArr, skoff_b11, falconFPRArr2, i18, MKN);
        this.fft.poly_mulselfadj_fft(falconFPRArr2, i18, i14);
        this.fft.poly_add(falconFPRArr2, i17, falconFPRArr2, i18, i14);
        ffLDL_fft(falconFPRArr, skoff_tree, falconFPRArr2, i15, falconFPRArr2, i16, falconFPRArr2, i17, i14, falconFPRArr2, i18);
        ffLDL_binary_normalize(falconFPRArr, skoff_tree, i14, i14);
    }

    public void ffLDL_binary_normalize(FalconFPR[] falconFPRArr, int i3, int i10, int i11) {
        int MKN = MKN(i11);
        if (MKN == 1) {
            FPREngine fPREngine = this.fpr;
            falconFPRArr[i3] = fPREngine.fpr_mul(fPREngine.fpr_sqrt(falconFPRArr[i3]), this.fpr.fpr_inv_sigma[i10]);
        } else {
            int i12 = i3 + MKN;
            int i13 = i11 - 1;
            ffLDL_binary_normalize(falconFPRArr, i12, i10, i13);
            ffLDL_binary_normalize(falconFPRArr, i12 + ffLDL_treesize(i13), i10, i13);
        }
    }

    public void ffLDL_fft(FalconFPR[] falconFPRArr, int i3, FalconFPR[] falconFPRArr2, int i10, FalconFPR[] falconFPRArr3, int i11, FalconFPR[] falconFPRArr4, int i12, int i13, FalconFPR[] falconFPRArr5, int i14) {
        int MKN = MKN(i13);
        if (MKN == 1) {
            falconFPRArr[i3] = falconFPRArr2[i10];
            return;
        }
        int i15 = MKN >> 1;
        int i16 = i14 + MKN;
        int i17 = i14 + (MKN << 1);
        System.arraycopy(falconFPRArr2, i10, falconFPRArr5, i14, MKN);
        this.fft.poly_LDLmv_fft(falconFPRArr5, i16, falconFPRArr, i3, falconFPRArr2, i10, falconFPRArr3, i11, falconFPRArr4, i12, i13);
        this.fft.poly_split_fft(falconFPRArr5, i17, falconFPRArr5, i17 + i15, falconFPRArr5, i14, i13);
        int i18 = i14 + i15;
        this.fft.poly_split_fft(falconFPRArr5, i14, falconFPRArr5, i18, falconFPRArr5, i16, i13);
        System.arraycopy(falconFPRArr5, i17, falconFPRArr5, i16, MKN);
        int i19 = i3 + MKN;
        int i20 = i13 - 1;
        ffLDL_fft_inner(falconFPRArr, i19, falconFPRArr5, i16, falconFPRArr5, i16 + i15, i20, falconFPRArr5, i17);
        ffLDL_fft_inner(falconFPRArr, i19 + ffLDL_treesize(i20), falconFPRArr5, i14, falconFPRArr5, i18, i20, falconFPRArr5, i17);
    }

    public void ffLDL_fft_inner(FalconFPR[] falconFPRArr, int i3, FalconFPR[] falconFPRArr2, int i10, FalconFPR[] falconFPRArr3, int i11, int i12, FalconFPR[] falconFPRArr4, int i13) {
        int MKN = MKN(i12);
        if (MKN == 1) {
            falconFPRArr[i3] = falconFPRArr2[i10];
            return;
        }
        int i14 = MKN >> 1;
        this.fft.poly_LDLmv_fft(falconFPRArr4, i13, falconFPRArr, i3, falconFPRArr2, i10, falconFPRArr3, i11, falconFPRArr2, i10, i12);
        int i15 = i11 + i14;
        this.fft.poly_split_fft(falconFPRArr3, i11, falconFPRArr3, i15, falconFPRArr2, i10, i12);
        int i16 = i10 + i14;
        this.fft.poly_split_fft(falconFPRArr2, i10, falconFPRArr2, i16, falconFPRArr4, i13, i12);
        int i17 = i3 + MKN;
        int i18 = i12 - 1;
        ffLDL_fft_inner(falconFPRArr, i17, falconFPRArr3, i11, falconFPRArr3, i15, i18, falconFPRArr4, i13);
        ffLDL_fft_inner(falconFPRArr, i17 + ffLDL_treesize(i18), falconFPRArr2, i10, falconFPRArr2, i16, i18, falconFPRArr4, i13);
    }

    public int ffLDL_treesize(int i3) {
        return (i3 + 1) << i3;
    }

    public void ffSampling_fft(SamplerZ samplerZ, SamplerCtx samplerCtx, FalconFPR[] falconFPRArr, int i3, FalconFPR[] falconFPRArr2, int i10, FalconFPR[] falconFPRArr3, int i11, FalconFPR[] falconFPRArr4, int i12, FalconFPR[] falconFPRArr5, int i13, int i14, FalconFPR[] falconFPRArr6, int i15) {
        if (i14 != 2) {
            if (i14 != 1) {
                int i16 = 1 << i14;
                int i17 = i16 >> 1;
                int i18 = i11 + i16;
                int i19 = i14 - 1;
                int ffLDL_treesize = i18 + ffLDL_treesize(i19);
                int i20 = i10 + i17;
                this.fft.poly_split_fft(falconFPRArr2, i10, falconFPRArr2, i20, falconFPRArr5, i13, i14);
                int i21 = i15 + i17;
                int i22 = i15 + i16;
                ffSampling_fft(samplerZ, samplerCtx, falconFPRArr6, i15, falconFPRArr6, i21, falconFPRArr3, ffLDL_treesize, falconFPRArr2, i10, falconFPRArr2, i20, i19, falconFPRArr6, i22);
                this.fft.poly_merge_fft(falconFPRArr2, i10, falconFPRArr6, i15, falconFPRArr6, i21, i14);
                System.arraycopy(falconFPRArr5, i13, falconFPRArr6, i15, i16);
                this.fft.poly_sub(falconFPRArr6, i15, falconFPRArr2, i10, i14);
                this.fft.poly_mul_fft(falconFPRArr6, i15, falconFPRArr3, i11, i14);
                this.fft.poly_add(falconFPRArr6, i15, falconFPRArr4, i12, i14);
                int i23 = i3 + i17;
                this.fft.poly_split_fft(falconFPRArr, i3, falconFPRArr, i23, falconFPRArr6, i15, i14);
                ffSampling_fft(samplerZ, samplerCtx, falconFPRArr6, i15, falconFPRArr6, i21, falconFPRArr3, i18, falconFPRArr, i3, falconFPRArr, i23, i19, falconFPRArr6, i22);
                this.fft.poly_merge_fft(falconFPRArr, i3, falconFPRArr6, i15, falconFPRArr6, i21, i14);
                return;
            }
            FalconFPR falconFPR = falconFPRArr5[i13];
            FalconFPR falconFPR2 = falconFPRArr5[i13 + 1];
            FalconFPR falconFPR3 = falconFPRArr3[i11 + 3];
            FalconFPR fpr_of = this.fpr.fpr_of(samplerZ.sample(samplerCtx, falconFPR, falconFPR3));
            falconFPRArr2[i10] = fpr_of;
            FalconFPR fpr_of2 = this.fpr.fpr_of(samplerZ.sample(samplerCtx, falconFPR2, falconFPR3));
            falconFPRArr2[i10 + 1] = fpr_of2;
            FalconFPR fpr_sub = this.fpr.fpr_sub(falconFPR, fpr_of);
            FalconFPR fpr_sub2 = this.fpr.fpr_sub(falconFPR2, fpr_of2);
            FalconFPR falconFPR4 = falconFPRArr3[i11];
            FalconFPR falconFPR5 = falconFPRArr3[i11 + 1];
            FPREngine fPREngine = this.fpr;
            FalconFPR fpr_sub3 = fPREngine.fpr_sub(fPREngine.fpr_mul(fpr_sub, falconFPR4), this.fpr.fpr_mul(fpr_sub2, falconFPR5));
            FPREngine fPREngine2 = this.fpr;
            FalconFPR fpr_add = fPREngine2.fpr_add(fPREngine2.fpr_mul(fpr_sub, falconFPR5), this.fpr.fpr_mul(fpr_sub2, falconFPR4));
            FalconFPR fpr_add2 = this.fpr.fpr_add(fpr_sub3, falconFPRArr4[i12]);
            FalconFPR fpr_add3 = this.fpr.fpr_add(fpr_add, falconFPRArr4[i12 + 1]);
            FalconFPR falconFPR6 = falconFPRArr3[i11 + 2];
            falconFPRArr[i3] = this.fpr.fpr_of(samplerZ.sample(samplerCtx, fpr_add2, falconFPR6));
            falconFPRArr[i3 + 1] = this.fpr.fpr_of(samplerZ.sample(samplerCtx, fpr_add3, falconFPR6));
            return;
        }
        FalconFPR falconFPR7 = falconFPRArr5[i13];
        int i24 = i13 + 2;
        FalconFPR falconFPR8 = falconFPRArr5[i24];
        int i25 = i13 + 1;
        FalconFPR falconFPR9 = falconFPRArr5[i25];
        int i26 = i13 + 3;
        FalconFPR falconFPR10 = falconFPRArr5[i26];
        FalconFPR fpr_add4 = this.fpr.fpr_add(falconFPR7, falconFPR9);
        FalconFPR fpr_add5 = this.fpr.fpr_add(falconFPR8, falconFPR10);
        FalconFPR fpr_half = this.fpr.fpr_half(fpr_add4);
        FalconFPR fpr_half2 = this.fpr.fpr_half(fpr_add5);
        FalconFPR fpr_sub4 = this.fpr.fpr_sub(falconFPR7, falconFPR9);
        FalconFPR fpr_sub5 = this.fpr.fpr_sub(falconFPR8, falconFPR10);
        FPREngine fPREngine3 = this.fpr;
        FalconFPR fpr_mul = fPREngine3.fpr_mul(fPREngine3.fpr_add(fpr_sub4, fpr_sub5), this.fpr.fpr_invsqrt8);
        FPREngine fPREngine4 = this.fpr;
        FalconFPR fpr_mul2 = fPREngine4.fpr_mul(fPREngine4.fpr_sub(fpr_sub5, fpr_sub4), this.fpr.fpr_invsqrt8);
        FalconFPR falconFPR11 = falconFPRArr3[i11 + 11];
        FalconFPR fpr_of3 = this.fpr.fpr_of(samplerZ.sample(samplerCtx, fpr_mul, falconFPR11));
        FalconFPR fpr_of4 = this.fpr.fpr_of(samplerZ.sample(samplerCtx, fpr_mul2, falconFPR11));
        FalconFPR fpr_sub6 = this.fpr.fpr_sub(fpr_mul, fpr_of3);
        FalconFPR fpr_sub7 = this.fpr.fpr_sub(fpr_mul2, fpr_of4);
        FalconFPR falconFPR12 = falconFPRArr3[i11 + 8];
        FalconFPR falconFPR13 = falconFPRArr3[i11 + 9];
        FPREngine fPREngine5 = this.fpr;
        FalconFPR fpr_sub8 = fPREngine5.fpr_sub(fPREngine5.fpr_mul(fpr_sub6, falconFPR12), this.fpr.fpr_mul(fpr_sub7, falconFPR13));
        FPREngine fPREngine6 = this.fpr;
        FalconFPR fpr_add6 = fPREngine6.fpr_add(fPREngine6.fpr_mul(fpr_sub6, falconFPR13), this.fpr.fpr_mul(fpr_sub7, falconFPR12));
        FalconFPR fpr_add7 = this.fpr.fpr_add(fpr_sub8, fpr_half);
        FalconFPR fpr_add8 = this.fpr.fpr_add(fpr_add6, fpr_half2);
        FalconFPR falconFPR14 = falconFPRArr3[i11 + 10];
        FalconFPR fpr_of5 = this.fpr.fpr_of(samplerZ.sample(samplerCtx, fpr_add7, falconFPR14));
        FalconFPR fpr_of6 = this.fpr.fpr_of(samplerZ.sample(samplerCtx, fpr_add8, falconFPR14));
        FPREngine fPREngine7 = this.fpr;
        FalconFPR fpr_mul3 = fPREngine7.fpr_mul(fPREngine7.fpr_sub(fpr_of3, fpr_of4), this.fpr.fpr_invsqrt2);
        FPREngine fPREngine8 = this.fpr;
        FalconFPR fpr_mul4 = fPREngine8.fpr_mul(fPREngine8.fpr_add(fpr_of3, fpr_of4), this.fpr.fpr_invsqrt2);
        FalconFPR fpr_add9 = this.fpr.fpr_add(fpr_of5, fpr_mul3);
        falconFPRArr2[i10] = fpr_add9;
        FalconFPR fpr_add10 = this.fpr.fpr_add(fpr_of6, fpr_mul4);
        falconFPRArr2[i10 + 2] = fpr_add10;
        FalconFPR fpr_sub9 = this.fpr.fpr_sub(fpr_of5, fpr_mul3);
        falconFPRArr2[i10 + 1] = fpr_sub9;
        FalconFPR fpr_sub10 = this.fpr.fpr_sub(fpr_of6, fpr_mul4);
        falconFPRArr2[i10 + 3] = fpr_sub10;
        FalconFPR fpr_sub11 = this.fpr.fpr_sub(falconFPRArr5[i13], fpr_add9);
        FalconFPR fpr_sub12 = this.fpr.fpr_sub(falconFPRArr5[i25], fpr_sub9);
        FalconFPR fpr_sub13 = this.fpr.fpr_sub(falconFPRArr5[i24], fpr_add10);
        FalconFPR fpr_sub14 = this.fpr.fpr_sub(falconFPRArr5[i26], fpr_sub10);
        FalconFPR falconFPR15 = falconFPRArr3[i11];
        FalconFPR falconFPR16 = falconFPRArr3[i11 + 2];
        FPREngine fPREngine9 = this.fpr;
        FalconFPR fpr_sub15 = fPREngine9.fpr_sub(fPREngine9.fpr_mul(fpr_sub11, falconFPR15), this.fpr.fpr_mul(fpr_sub13, falconFPR16));
        FPREngine fPREngine10 = this.fpr;
        FalconFPR fpr_add11 = fPREngine10.fpr_add(fPREngine10.fpr_mul(fpr_sub11, falconFPR16), this.fpr.fpr_mul(fpr_sub13, falconFPR15));
        FalconFPR falconFPR17 = falconFPRArr3[i11 + 1];
        FalconFPR falconFPR18 = falconFPRArr3[i11 + 3];
        FPREngine fPREngine11 = this.fpr;
        FalconFPR fpr_sub16 = fPREngine11.fpr_sub(fPREngine11.fpr_mul(fpr_sub12, falconFPR17), this.fpr.fpr_mul(fpr_sub14, falconFPR18));
        FPREngine fPREngine12 = this.fpr;
        FalconFPR fpr_add12 = fPREngine12.fpr_add(fPREngine12.fpr_mul(fpr_sub12, falconFPR18), this.fpr.fpr_mul(fpr_sub14, falconFPR17));
        FalconFPR fpr_add13 = this.fpr.fpr_add(fpr_sub15, falconFPRArr4[i12]);
        FalconFPR fpr_add14 = this.fpr.fpr_add(fpr_sub16, falconFPRArr4[i12 + 1]);
        FalconFPR fpr_add15 = this.fpr.fpr_add(fpr_add11, falconFPRArr4[i12 + 2]);
        FalconFPR fpr_add16 = this.fpr.fpr_add(fpr_add12, falconFPRArr4[i12 + 3]);
        FalconFPR fpr_add17 = this.fpr.fpr_add(fpr_add13, fpr_add14);
        FalconFPR fpr_add18 = this.fpr.fpr_add(fpr_add15, fpr_add16);
        FalconFPR fpr_half3 = this.fpr.fpr_half(fpr_add17);
        FalconFPR fpr_half4 = this.fpr.fpr_half(fpr_add18);
        FalconFPR fpr_sub17 = this.fpr.fpr_sub(fpr_add13, fpr_add14);
        FalconFPR fpr_sub18 = this.fpr.fpr_sub(fpr_add15, fpr_add16);
        FPREngine fPREngine13 = this.fpr;
        FalconFPR fpr_mul5 = fPREngine13.fpr_mul(fPREngine13.fpr_add(fpr_sub17, fpr_sub18), this.fpr.fpr_invsqrt8);
        FPREngine fPREngine14 = this.fpr;
        FalconFPR fpr_mul6 = fPREngine14.fpr_mul(fPREngine14.fpr_sub(fpr_sub18, fpr_sub17), this.fpr.fpr_invsqrt8);
        FalconFPR falconFPR19 = falconFPRArr3[i11 + 7];
        FalconFPR fpr_of7 = this.fpr.fpr_of(samplerZ.sample(samplerCtx, fpr_mul5, falconFPR19));
        FalconFPR fpr_of8 = this.fpr.fpr_of(samplerZ.sample(samplerCtx, fpr_mul6, falconFPR19));
        FalconFPR fpr_sub19 = this.fpr.fpr_sub(fpr_mul5, fpr_of7);
        FalconFPR fpr_sub20 = this.fpr.fpr_sub(fpr_mul6, fpr_of8);
        FalconFPR falconFPR20 = falconFPRArr3[i11 + 4];
        FalconFPR falconFPR21 = falconFPRArr3[i11 + 5];
        FPREngine fPREngine15 = this.fpr;
        FalconFPR fpr_sub21 = fPREngine15.fpr_sub(fPREngine15.fpr_mul(fpr_sub19, falconFPR20), this.fpr.fpr_mul(fpr_sub20, falconFPR21));
        FPREngine fPREngine16 = this.fpr;
        FalconFPR fpr_add19 = fPREngine16.fpr_add(fPREngine16.fpr_mul(fpr_sub19, falconFPR21), this.fpr.fpr_mul(fpr_sub20, falconFPR20));
        FalconFPR fpr_add20 = this.fpr.fpr_add(fpr_sub21, fpr_half3);
        FalconFPR fpr_add21 = this.fpr.fpr_add(fpr_add19, fpr_half4);
        FalconFPR falconFPR22 = falconFPRArr3[i11 + 6];
        FalconFPR fpr_of9 = this.fpr.fpr_of(samplerZ.sample(samplerCtx, fpr_add20, falconFPR22));
        FalconFPR fpr_of10 = this.fpr.fpr_of(samplerZ.sample(samplerCtx, fpr_add21, falconFPR22));
        FPREngine fPREngine17 = this.fpr;
        FalconFPR fpr_mul7 = fPREngine17.fpr_mul(fPREngine17.fpr_sub(fpr_of7, fpr_of8), this.fpr.fpr_invsqrt2);
        FPREngine fPREngine18 = this.fpr;
        FalconFPR fpr_mul8 = fPREngine18.fpr_mul(fPREngine18.fpr_add(fpr_of7, fpr_of8), this.fpr.fpr_invsqrt2);
        falconFPRArr[i3] = this.fpr.fpr_add(fpr_of9, fpr_mul7);
        falconFPRArr[i3 + 2] = this.fpr.fpr_add(fpr_of10, fpr_mul8);
        falconFPRArr[i3 + 1] = this.fpr.fpr_sub(fpr_of9, fpr_mul7);
        falconFPRArr[i3 + 3] = this.fpr.fpr_sub(fpr_of10, fpr_mul8);
    }

    public void ffSampling_fft_dyntree(SamplerZ samplerZ, SamplerCtx samplerCtx, FalconFPR[] falconFPRArr, int i3, FalconFPR[] falconFPRArr2, int i10, FalconFPR[] falconFPRArr3, int i11, FalconFPR[] falconFPRArr4, int i12, FalconFPR[] falconFPRArr5, int i13, int i14, int i15, FalconFPR[] falconFPRArr6, int i16) {
        if (i15 == 0) {
            FalconFPR falconFPR = falconFPRArr3[i11];
            FPREngine fPREngine = this.fpr;
            FalconFPR fpr_mul = fPREngine.fpr_mul(fPREngine.fpr_sqrt(falconFPR), this.fpr.fpr_inv_sigma[i14]);
            falconFPRArr[i3] = this.fpr.fpr_of(samplerZ.sample(samplerCtx, falconFPRArr[i3], fpr_mul));
            falconFPRArr2[i10] = this.fpr.fpr_of(samplerZ.sample(samplerCtx, falconFPRArr2[i10], fpr_mul));
            return;
        }
        int i17 = 1 << i15;
        int i18 = i17 >> 1;
        this.fft.poly_LDL_fft(falconFPRArr3, i11, falconFPRArr4, i12, falconFPRArr5, i13, i15);
        int i19 = i16 + i18;
        this.fft.poly_split_fft(falconFPRArr6, i16, falconFPRArr6, i19, falconFPRArr3, i11, i15);
        System.arraycopy(falconFPRArr6, i16, falconFPRArr3, i11, i17);
        this.fft.poly_split_fft(falconFPRArr6, i16, falconFPRArr6, i19, falconFPRArr5, i13, i15);
        System.arraycopy(falconFPRArr6, i16, falconFPRArr5, i13, i17);
        System.arraycopy(falconFPRArr4, i12, falconFPRArr6, i16, i17);
        System.arraycopy(falconFPRArr3, i11, falconFPRArr4, i12, i18);
        int i20 = i12 + i18;
        System.arraycopy(falconFPRArr5, i13, falconFPRArr4, i20, i18);
        int i21 = i16 + i17;
        int i22 = i21 + i18;
        this.fft.poly_split_fft(falconFPRArr6, i21, falconFPRArr6, i22, falconFPRArr2, i10, i15);
        int i23 = i15 - 1;
        ffSampling_fft_dyntree(samplerZ, samplerCtx, falconFPRArr6, i21, falconFPRArr6, i22, falconFPRArr5, i13, falconFPRArr5, i13 + i18, falconFPRArr4, i20, i14, i23, falconFPRArr6, i21 + i17);
        int i24 = i16 + (i17 << 1);
        this.fft.poly_merge_fft(falconFPRArr6, i24, falconFPRArr6, i21, falconFPRArr6, i22, i15);
        System.arraycopy(falconFPRArr2, i10, falconFPRArr6, i21, i17);
        this.fft.poly_sub(falconFPRArr6, i21, falconFPRArr6, i24, i15);
        System.arraycopy(falconFPRArr6, i24, falconFPRArr2, i10, i17);
        this.fft.poly_mul_fft(falconFPRArr6, i16, falconFPRArr6, i21, i15);
        this.fft.poly_add(falconFPRArr, i3, falconFPRArr6, i16, i15);
        this.fft.poly_split_fft(falconFPRArr6, i16, falconFPRArr6, i19, falconFPRArr, i3, i15);
        ffSampling_fft_dyntree(samplerZ, samplerCtx, falconFPRArr6, i16, falconFPRArr6, i19, falconFPRArr3, i11, falconFPRArr3, i11 + i18, falconFPRArr4, i12, i14, i23, falconFPRArr6, i21);
        this.fft.poly_merge_fft(falconFPRArr, i3, falconFPRArr6, i16, falconFPRArr6, i19, i15);
    }

    public void sign_dyn(short[] sArr, int i3, SHAKE256 shake256, byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12, byte[] bArr4, int i13, short[] sArr2, int i14, int i15, FalconFPR[] falconFPRArr, int i16) {
        SamplerCtx samplerCtx;
        SamplerZ samplerZ;
        do {
            samplerCtx = new SamplerCtx();
            samplerZ = new SamplerZ();
            samplerCtx.sigma_min = this.fpr.fpr_sigma_min[i15];
            samplerCtx.f19396p.prng_init(shake256);
        } while (do_sign_dyn(samplerZ, samplerCtx, sArr, i3, bArr, i10, bArr2, i11, bArr3, i12, bArr4, i13, sArr2, i14, i15, falconFPRArr, i16) == 0);
    }

    public void sign_tree(short[] sArr, int i3, SHAKE256 shake256, FalconFPR[] falconFPRArr, int i10, short[] sArr2, int i11, int i12, FalconFPR[] falconFPRArr2, int i13) {
        SamplerCtx samplerCtx;
        SamplerZ samplerZ;
        do {
            samplerCtx = new SamplerCtx();
            samplerZ = new SamplerZ();
            samplerCtx.sigma_min = this.fpr.fpr_sigma_min[i12];
            samplerCtx.f19396p.prng_init(shake256);
        } while (do_sign_tree(samplerZ, samplerCtx, sArr, i3, falconFPRArr, i10, sArr2, i11, i12, falconFPRArr2, i13) == 0);
    }

    public int skoff_b00(int i3) {
        return 0;
    }

    public int skoff_b01(int i3) {
        return MKN(i3);
    }

    public int skoff_b10(int i3) {
        return MKN(i3) * 2;
    }

    public int skoff_b11(int i3) {
        return MKN(i3) * 3;
    }

    public int skoff_tree(int i3) {
        return MKN(i3) * 4;
    }

    public void smallints_to_fpr(FalconFPR[] falconFPRArr, int i3, byte[] bArr, int i10, int i11) {
        int MKN = MKN(i11);
        for (int i12 = 0; i12 < MKN; i12++) {
            falconFPRArr[i3 + i12] = this.fpr.fpr_of(bArr[i10 + i12]);
        }
    }
}
