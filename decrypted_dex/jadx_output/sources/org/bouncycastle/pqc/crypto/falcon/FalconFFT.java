package org.bouncycastle.pqc.crypto.falcon;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class FalconFFT {
    FPREngine fpr = new FPREngine();

    public void FFT(FalconFPR[] falconFPRArr, int i3, int i10) {
        int i11 = i10;
        int i12 = 1;
        int i13 = (1 << i11) >> 1;
        int i14 = 2;
        int i15 = 1;
        int i16 = i13;
        while (i15 < i11) {
            int i17 = i16 >> 1;
            int i18 = i14 >> 1;
            int i19 = 0;
            int i20 = 0;
            while (i19 < i18) {
                int i21 = i20 + i17;
                FalconFPR[] falconFPRArr2 = this.fpr.fpr_gm_tab;
                int i22 = (i14 + i19) << i12;
                FalconFPR falconFPR = falconFPRArr2[i22];
                FalconFPR falconFPR2 = falconFPRArr2[i22 + i12];
                int i23 = i20;
                while (i23 < i21) {
                    int i24 = i3 + i23;
                    FalconFPR falconFPR3 = falconFPRArr[i24];
                    int i25 = i24 + i13;
                    FalconFPR falconFPR4 = falconFPRArr[i25];
                    int i26 = i24 + i17;
                    int i27 = i13;
                    int i28 = i26 + i27;
                    int i29 = i14;
                    ComplexNumberWrapper FPC_MUL = FPC_MUL(falconFPRArr[i26], falconFPRArr[i28], falconFPR, falconFPR2);
                    FalconFPR falconFPR5 = FPC_MUL.re;
                    FalconFPR falconFPR6 = FPC_MUL.im;
                    int i30 = i15;
                    ComplexNumberWrapper FPC_ADD = FPC_ADD(falconFPR3, falconFPR4, falconFPR5, falconFPR6);
                    falconFPRArr[i24] = FPC_ADD.re;
                    falconFPRArr[i25] = FPC_ADD.im;
                    ComplexNumberWrapper FPC_SUB = FPC_SUB(falconFPR3, falconFPR4, falconFPR5, falconFPR6);
                    falconFPRArr[i26] = FPC_SUB.re;
                    falconFPRArr[i28] = FPC_SUB.im;
                    i23++;
                    i13 = i27;
                    i14 = i29;
                    i15 = i30;
                    i16 = i16;
                }
                i19++;
                i20 += i16;
                i12 = 1;
            }
            i15++;
            i14 <<= 1;
            i11 = i10;
            i16 = i17;
            i12 = 1;
        }
    }

    public ComplexNumberWrapper FPC_ADD(FalconFPR falconFPR, FalconFPR falconFPR2, FalconFPR falconFPR3, FalconFPR falconFPR4) {
        return new ComplexNumberWrapper(this.fpr.fpr_add(falconFPR, falconFPR3), this.fpr.fpr_add(falconFPR2, falconFPR4));
    }

    public ComplexNumberWrapper FPC_DIV(FalconFPR falconFPR, FalconFPR falconFPR2, FalconFPR falconFPR3, FalconFPR falconFPR4) {
        FPREngine fPREngine = this.fpr;
        FalconFPR fpr_inv = this.fpr.fpr_inv(fPREngine.fpr_add(fPREngine.fpr_sqr(falconFPR3), this.fpr.fpr_sqr(falconFPR4)));
        FalconFPR fpr_mul = this.fpr.fpr_mul(falconFPR3, fpr_inv);
        FPREngine fPREngine2 = this.fpr;
        FalconFPR fpr_mul2 = fPREngine2.fpr_mul(fPREngine2.fpr_neg(falconFPR4), fpr_inv);
        FPREngine fPREngine3 = this.fpr;
        FalconFPR fpr_sub = fPREngine3.fpr_sub(fPREngine3.fpr_mul(falconFPR, fpr_mul), this.fpr.fpr_mul(falconFPR2, fpr_mul2));
        FPREngine fPREngine4 = this.fpr;
        return new ComplexNumberWrapper(fpr_sub, fPREngine4.fpr_add(fPREngine4.fpr_mul(falconFPR, fpr_mul2), this.fpr.fpr_mul(falconFPR2, fpr_mul)));
    }

    public ComplexNumberWrapper FPC_INV(FalconFPR falconFPR, FalconFPR falconFPR2) {
        FPREngine fPREngine = this.fpr;
        FalconFPR fpr_inv = this.fpr.fpr_inv(fPREngine.fpr_add(fPREngine.fpr_sqr(falconFPR), this.fpr.fpr_sqr(falconFPR2)));
        FalconFPR fpr_mul = this.fpr.fpr_mul(falconFPR, fpr_inv);
        FPREngine fPREngine2 = this.fpr;
        return new ComplexNumberWrapper(fpr_mul, fPREngine2.fpr_mul(fPREngine2.fpr_neg(falconFPR2), fpr_inv));
    }

    public ComplexNumberWrapper FPC_MUL(FalconFPR falconFPR, FalconFPR falconFPR2, FalconFPR falconFPR3, FalconFPR falconFPR4) {
        FPREngine fPREngine = this.fpr;
        FalconFPR fpr_sub = fPREngine.fpr_sub(fPREngine.fpr_mul(falconFPR, falconFPR3), this.fpr.fpr_mul(falconFPR2, falconFPR4));
        FPREngine fPREngine2 = this.fpr;
        return new ComplexNumberWrapper(fpr_sub, fPREngine2.fpr_add(fPREngine2.fpr_mul(falconFPR, falconFPR4), this.fpr.fpr_mul(falconFPR2, falconFPR3)));
    }

    public ComplexNumberWrapper FPC_SQR(FalconFPR falconFPR, FalconFPR falconFPR2) {
        FPREngine fPREngine = this.fpr;
        FalconFPR fpr_sub = fPREngine.fpr_sub(fPREngine.fpr_sqr(falconFPR), this.fpr.fpr_sqr(falconFPR2));
        FPREngine fPREngine2 = this.fpr;
        return new ComplexNumberWrapper(fpr_sub, fPREngine2.fpr_double(fPREngine2.fpr_mul(falconFPR, falconFPR2)));
    }

    public ComplexNumberWrapper FPC_SUB(FalconFPR falconFPR, FalconFPR falconFPR2, FalconFPR falconFPR3, FalconFPR falconFPR4) {
        return new ComplexNumberWrapper(this.fpr.fpr_sub(falconFPR, falconFPR3), this.fpr.fpr_sub(falconFPR2, falconFPR4));
    }

    public void iFFT(FalconFPR[] falconFPRArr, int i3, int i10) {
        int i11;
        int i12 = 1;
        int i13 = 1 << i10;
        int i14 = i13 >> 1;
        int i15 = i10;
        int i16 = 1;
        int i17 = i13;
        while (true) {
            i11 = 0;
            if (i15 <= i12) {
                break;
            }
            i17 >>= i12;
            int i18 = i16 << 1;
            int i19 = 0;
            while (i11 < i14) {
                int i20 = i11 + i16;
                FPREngine fPREngine = this.fpr;
                FalconFPR[] falconFPRArr2 = fPREngine.fpr_gm_tab;
                int i21 = (i17 + i19) << i12;
                FalconFPR falconFPR = falconFPRArr2[i21];
                FalconFPR fpr_neg = fPREngine.fpr_neg(falconFPRArr2[i21 + i12]);
                int i22 = i11;
                while (i22 < i20) {
                    int i23 = i3 + i22;
                    FalconFPR falconFPR2 = falconFPRArr[i23];
                    int i24 = i23 + i14;
                    FalconFPR falconFPR3 = falconFPRArr[i24];
                    int i25 = i23 + i16;
                    int i26 = i14;
                    FalconFPR falconFPR4 = falconFPRArr[i25];
                    int i27 = i25 + i26;
                    int i28 = i15;
                    FalconFPR falconFPR5 = falconFPRArr[i27];
                    int i29 = i17;
                    ComplexNumberWrapper FPC_ADD = FPC_ADD(falconFPR2, falconFPR3, falconFPR4, falconFPR5);
                    falconFPRArr[i23] = FPC_ADD.re;
                    falconFPRArr[i24] = FPC_ADD.im;
                    ComplexNumberWrapper FPC_SUB = FPC_SUB(falconFPR2, falconFPR3, falconFPR4, falconFPR5);
                    ComplexNumberWrapper FPC_MUL = FPC_MUL(FPC_SUB.re, FPC_SUB.im, falconFPR, fpr_neg);
                    falconFPRArr[i25] = FPC_MUL.re;
                    falconFPRArr[i27] = FPC_MUL.im;
                    i22++;
                    i14 = i26;
                    i15 = i28;
                    i17 = i29;
                    i16 = i16;
                }
                i19++;
                i11 += i18;
                i12 = 1;
            }
            i15--;
            i16 = i18;
            i12 = 1;
        }
        if (i10 > 0) {
            FalconFPR falconFPR6 = this.fpr.fpr_p2_tab[i10];
            while (i11 < i13) {
                int i30 = i3 + i11;
                falconFPRArr[i30] = this.fpr.fpr_mul(falconFPRArr[i30], falconFPR6);
                i11++;
            }
        }
    }

    public void poly_LDL_fft(FalconFPR[] falconFPRArr, int i3, FalconFPR[] falconFPRArr2, int i10, FalconFPR[] falconFPRArr3, int i11, int i12) {
        int i13 = (1 << i12) >> 1;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i3 + i14;
            FalconFPR falconFPR = falconFPRArr[i15];
            FalconFPR falconFPR2 = falconFPRArr[i15 + i13];
            int i16 = i10 + i14;
            FalconFPR falconFPR3 = falconFPRArr2[i16];
            int i17 = i16 + i13;
            FalconFPR falconFPR4 = falconFPRArr2[i17];
            int i18 = i11 + i14;
            FalconFPR falconFPR5 = falconFPRArr3[i18];
            int i19 = i18 + i13;
            FalconFPR falconFPR6 = falconFPRArr3[i19];
            ComplexNumberWrapper FPC_DIV = FPC_DIV(falconFPR3, falconFPR4, falconFPR, falconFPR2);
            FalconFPR falconFPR7 = FPC_DIV.re;
            FalconFPR falconFPR8 = FPC_DIV.im;
            ComplexNumberWrapper FPC_MUL = FPC_MUL(falconFPR7, falconFPR8, falconFPR3, this.fpr.fpr_neg(falconFPR4));
            ComplexNumberWrapper FPC_SUB = FPC_SUB(falconFPR5, falconFPR6, FPC_MUL.re, FPC_MUL.im);
            falconFPRArr3[i18] = FPC_SUB.re;
            falconFPRArr3[i19] = FPC_SUB.im;
            falconFPRArr2[i16] = falconFPR7;
            falconFPRArr2[i17] = this.fpr.fpr_neg(falconFPR8);
        }
    }

    public void poly_LDLmv_fft(FalconFPR[] falconFPRArr, int i3, FalconFPR[] falconFPRArr2, int i10, FalconFPR[] falconFPRArr3, int i11, FalconFPR[] falconFPRArr4, int i12, FalconFPR[] falconFPRArr5, int i13, int i14) {
        int i15 = (1 << i14) >> 1;
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = i11 + i16;
            FalconFPR falconFPR = falconFPRArr3[i17];
            FalconFPR falconFPR2 = falconFPRArr3[i17 + i15];
            int i18 = i12 + i16;
            FalconFPR falconFPR3 = falconFPRArr4[i18];
            FalconFPR falconFPR4 = falconFPRArr4[i18 + i15];
            int i19 = i13 + i16;
            FalconFPR falconFPR5 = falconFPRArr5[i19];
            FalconFPR falconFPR6 = falconFPRArr5[i19 + i15];
            ComplexNumberWrapper FPC_DIV = FPC_DIV(falconFPR3, falconFPR4, falconFPR, falconFPR2);
            FalconFPR falconFPR7 = FPC_DIV.re;
            FalconFPR falconFPR8 = FPC_DIV.im;
            ComplexNumberWrapper FPC_MUL = FPC_MUL(falconFPR7, falconFPR8, falconFPR3, this.fpr.fpr_neg(falconFPR4));
            ComplexNumberWrapper FPC_SUB = FPC_SUB(falconFPR5, falconFPR6, FPC_MUL.re, FPC_MUL.im);
            int i20 = i3 + i16;
            falconFPRArr[i20] = FPC_SUB.re;
            falconFPRArr[i20 + i15] = FPC_SUB.im;
            int i21 = i10 + i16;
            falconFPRArr2[i21] = falconFPR7;
            falconFPRArr2[i21 + i15] = this.fpr.fpr_neg(falconFPR8);
        }
    }

    public void poly_add(FalconFPR[] falconFPRArr, int i3, FalconFPR[] falconFPRArr2, int i10, int i11) {
        int i12 = 1 << i11;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i3 + i13;
            falconFPRArr[i14] = this.fpr.fpr_add(falconFPRArr[i14], falconFPRArr2[i10 + i13]);
        }
    }

    public void poly_add_muladj_fft(FalconFPR[] falconFPRArr, int i3, FalconFPR[] falconFPRArr2, int i10, FalconFPR[] falconFPRArr3, int i11, FalconFPR[] falconFPRArr4, int i12, FalconFPR[] falconFPRArr5, int i13, int i14) {
        int i15 = (1 << i14) >> 1;
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = i10 + i16;
            FalconFPR falconFPR = falconFPRArr2[i17];
            FalconFPR falconFPR2 = falconFPRArr2[i17 + i15];
            int i18 = i11 + i16;
            FalconFPR falconFPR3 = falconFPRArr3[i18];
            FalconFPR falconFPR4 = falconFPRArr3[i18 + i15];
            int i19 = i12 + i16;
            FalconFPR falconFPR5 = falconFPRArr4[i19];
            FalconFPR falconFPR6 = falconFPRArr4[i19 + i15];
            int i20 = i13 + i16;
            FalconFPR falconFPR7 = falconFPRArr5[i20];
            FalconFPR falconFPR8 = falconFPRArr5[i20 + i15];
            ComplexNumberWrapper FPC_MUL = FPC_MUL(falconFPR, falconFPR2, falconFPR5, this.fpr.fpr_neg(falconFPR6));
            FalconFPR falconFPR9 = FPC_MUL.re;
            FalconFPR falconFPR10 = FPC_MUL.im;
            ComplexNumberWrapper FPC_MUL2 = FPC_MUL(falconFPR3, falconFPR4, falconFPR7, this.fpr.fpr_neg(falconFPR8));
            FalconFPR falconFPR11 = FPC_MUL2.re;
            FalconFPR falconFPR12 = FPC_MUL2.im;
            int i21 = i3 + i16;
            falconFPRArr[i21] = this.fpr.fpr_add(falconFPR9, falconFPR11);
            falconFPRArr[i21 + i15] = this.fpr.fpr_add(falconFPR10, falconFPR12);
        }
    }

    public void poly_adj_fft(FalconFPR[] falconFPRArr, int i3, int i10) {
        int i11 = 1 << i10;
        for (int i12 = i11 >> 1; i12 < i11; i12++) {
            int i13 = i3 + i12;
            falconFPRArr[i13] = this.fpr.fpr_neg(falconFPRArr[i13]);
        }
    }

    public void poly_div_autoadj_fft(FalconFPR[] falconFPRArr, int i3, FalconFPR[] falconFPRArr2, int i10, int i11) {
        int i12 = (1 << i11) >> 1;
        for (int i13 = 0; i13 < i12; i13++) {
            FalconFPR fpr_inv = this.fpr.fpr_inv(falconFPRArr2[i10 + i13]);
            int i14 = i3 + i13;
            falconFPRArr[i14] = this.fpr.fpr_mul(falconFPRArr[i14], fpr_inv);
            int i15 = i14 + i12;
            falconFPRArr[i15] = this.fpr.fpr_mul(falconFPRArr[i15], fpr_inv);
        }
    }

    public void poly_div_fft(FalconFPR[] falconFPRArr, int i3, FalconFPR[] falconFPRArr2, int i10, int i11) {
        int i12 = (1 << i11) >> 1;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i3 + i13;
            int i15 = i14 + i12;
            int i16 = i10 + i13;
            ComplexNumberWrapper FPC_DIV = FPC_DIV(falconFPRArr[i14], falconFPRArr[i15], falconFPRArr2[i16], falconFPRArr2[i16 + i12]);
            falconFPRArr[i14] = FPC_DIV.re;
            falconFPRArr[i15] = FPC_DIV.im;
        }
    }

    public void poly_invnorm2_fft(FalconFPR[] falconFPRArr, int i3, FalconFPR[] falconFPRArr2, int i10, FalconFPR[] falconFPRArr3, int i11, int i12) {
        int i13 = (1 << i12) >> 1;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i10 + i14;
            FalconFPR falconFPR = falconFPRArr2[i15];
            FalconFPR falconFPR2 = falconFPRArr2[i15 + i13];
            int i16 = i11 + i14;
            FalconFPR falconFPR3 = falconFPRArr3[i16];
            FalconFPR falconFPR4 = falconFPRArr3[i16 + i13];
            FPREngine fPREngine = this.fpr;
            FalconFPR fpr_add = fPREngine.fpr_add(fPREngine.fpr_sqr(falconFPR), this.fpr.fpr_sqr(falconFPR2));
            FPREngine fPREngine2 = this.fpr;
            falconFPRArr[i3 + i14] = fPREngine.fpr_inv(fPREngine.fpr_add(fpr_add, fPREngine2.fpr_add(fPREngine2.fpr_sqr(falconFPR3), this.fpr.fpr_sqr(falconFPR4))));
        }
    }

    public void poly_merge_fft(FalconFPR[] falconFPRArr, int i3, FalconFPR[] falconFPRArr2, int i10, FalconFPR[] falconFPRArr3, int i11, int i12) {
        int i13 = 1 << i12;
        int i14 = i13 >> 1;
        int i15 = i13 >> 2;
        falconFPRArr[i3] = falconFPRArr2[i10];
        falconFPRArr[i3 + i14] = falconFPRArr3[i11];
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = i10 + i16;
            FalconFPR falconFPR = falconFPRArr2[i17];
            FalconFPR falconFPR2 = falconFPRArr2[i17 + i15];
            int i18 = i11 + i16;
            FalconFPR falconFPR3 = falconFPRArr3[i18];
            FalconFPR falconFPR4 = falconFPRArr3[i18 + i15];
            FalconFPR[] falconFPRArr4 = this.fpr.fpr_gm_tab;
            int i19 = (i16 + i14) << 1;
            ComplexNumberWrapper FPC_MUL = FPC_MUL(falconFPR3, falconFPR4, falconFPRArr4[i19], falconFPRArr4[i19 + 1]);
            FalconFPR falconFPR5 = FPC_MUL.re;
            FalconFPR falconFPR6 = FPC_MUL.im;
            ComplexNumberWrapper FPC_ADD = FPC_ADD(falconFPR, falconFPR2, falconFPR5, falconFPR6);
            FalconFPR falconFPR7 = FPC_ADD.re;
            FalconFPR falconFPR8 = FPC_ADD.im;
            int i20 = (i16 << 1) + i3;
            falconFPRArr[i20] = falconFPR7;
            falconFPRArr[i20 + i14] = falconFPR8;
            ComplexNumberWrapper FPC_SUB = FPC_SUB(falconFPR, falconFPR2, falconFPR5, falconFPR6);
            FalconFPR falconFPR9 = FPC_SUB.re;
            FalconFPR falconFPR10 = FPC_SUB.im;
            int i21 = i20 + 1;
            falconFPRArr[i21] = falconFPR9;
            falconFPRArr[i21 + i14] = falconFPR10;
        }
    }

    public void poly_mul_autoadj_fft(FalconFPR[] falconFPRArr, int i3, FalconFPR[] falconFPRArr2, int i10, int i11) {
        int i12 = (1 << i11) >> 1;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i3 + i13;
            int i15 = i10 + i13;
            falconFPRArr[i14] = this.fpr.fpr_mul(falconFPRArr[i14], falconFPRArr2[i15]);
            int i16 = i14 + i12;
            falconFPRArr[i16] = this.fpr.fpr_mul(falconFPRArr[i16], falconFPRArr2[i15]);
        }
    }

    public void poly_mul_fft(FalconFPR[] falconFPRArr, int i3, FalconFPR[] falconFPRArr2, int i10, int i11) {
        int i12 = (1 << i11) >> 1;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i3 + i13;
            int i15 = i14 + i12;
            int i16 = i10 + i13;
            ComplexNumberWrapper FPC_MUL = FPC_MUL(falconFPRArr[i14], falconFPRArr[i15], falconFPRArr2[i16], falconFPRArr2[i16 + i12]);
            falconFPRArr[i14] = FPC_MUL.re;
            falconFPRArr[i15] = FPC_MUL.im;
        }
    }

    public void poly_muladj_fft(FalconFPR[] falconFPRArr, int i3, FalconFPR[] falconFPRArr2, int i10, int i11) {
        int i12 = (1 << i11) >> 1;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i3 + i13;
            int i15 = i14 + i12;
            int i16 = i10 + i13;
            ComplexNumberWrapper FPC_MUL = FPC_MUL(falconFPRArr[i14], falconFPRArr[i15], falconFPRArr2[i16], this.fpr.fpr_neg(falconFPRArr2[i16 + i12]));
            falconFPRArr[i14] = FPC_MUL.re;
            falconFPRArr[i15] = FPC_MUL.im;
        }
    }

    public void poly_mulconst(FalconFPR[] falconFPRArr, int i3, FalconFPR falconFPR, int i10) {
        int i11 = 1 << i10;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i3 + i12;
            falconFPRArr[i13] = this.fpr.fpr_mul(falconFPRArr[i13], falconFPR);
        }
    }

    public void poly_mulselfadj_fft(FalconFPR[] falconFPRArr, int i3, int i10) {
        int i11 = (1 << i10) >> 1;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i3 + i12;
            FalconFPR falconFPR = falconFPRArr[i13];
            int i14 = i13 + i11;
            FalconFPR falconFPR2 = falconFPRArr[i14];
            FPREngine fPREngine = this.fpr;
            falconFPRArr[i13] = fPREngine.fpr_add(fPREngine.fpr_sqr(falconFPR), this.fpr.fpr_sqr(falconFPR2));
            falconFPRArr[i14] = this.fpr.fpr_zero;
        }
    }

    public void poly_neg(FalconFPR[] falconFPRArr, int i3, int i10) {
        int i11 = 1 << i10;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i3 + i12;
            falconFPRArr[i13] = this.fpr.fpr_neg(falconFPRArr[i13]);
        }
    }

    public void poly_split_fft(FalconFPR[] falconFPRArr, int i3, FalconFPR[] falconFPRArr2, int i10, FalconFPR[] falconFPRArr3, int i11, int i12) {
        int i13 = 1 << i12;
        int i14 = i13 >> 1;
        int i15 = i13 >> 2;
        falconFPRArr[i3] = falconFPRArr3[i11];
        falconFPRArr2[i10] = falconFPRArr3[i11 + i14];
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = i11 + (i16 << 1);
            FalconFPR falconFPR = falconFPRArr3[i17];
            FalconFPR falconFPR2 = falconFPRArr3[i17 + i14];
            int i18 = i17 + 1;
            FalconFPR falconFPR3 = falconFPRArr3[i18];
            FalconFPR falconFPR4 = falconFPRArr3[i18 + i14];
            ComplexNumberWrapper FPC_ADD = FPC_ADD(falconFPR, falconFPR2, falconFPR3, falconFPR4);
            FalconFPR falconFPR5 = FPC_ADD.re;
            FalconFPR falconFPR6 = FPC_ADD.im;
            int i19 = i3 + i16;
            falconFPRArr[i19] = this.fpr.fpr_half(falconFPR5);
            falconFPRArr[i19 + i15] = this.fpr.fpr_half(falconFPR6);
            ComplexNumberWrapper FPC_SUB = FPC_SUB(falconFPR, falconFPR2, falconFPR3, falconFPR4);
            FalconFPR falconFPR7 = FPC_SUB.re;
            FalconFPR falconFPR8 = FPC_SUB.im;
            FPREngine fPREngine = this.fpr;
            FalconFPR[] falconFPRArr4 = fPREngine.fpr_gm_tab;
            int i20 = (i16 + i14) << 1;
            ComplexNumberWrapper FPC_MUL = FPC_MUL(falconFPR7, falconFPR8, falconFPRArr4[i20], fPREngine.fpr_neg(falconFPRArr4[i20 + 1]));
            FalconFPR falconFPR9 = FPC_MUL.re;
            FalconFPR falconFPR10 = FPC_MUL.im;
            int i21 = i10 + i16;
            falconFPRArr2[i21] = this.fpr.fpr_half(falconFPR9);
            falconFPRArr2[i21 + i15] = this.fpr.fpr_half(falconFPR10);
        }
    }

    public void poly_sub(FalconFPR[] falconFPRArr, int i3, FalconFPR[] falconFPRArr2, int i10, int i11) {
        int i12 = 1 << i11;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i3 + i13;
            falconFPRArr[i14] = this.fpr.fpr_sub(falconFPRArr[i14], falconFPRArr2[i10 + i13]);
        }
    }
}
