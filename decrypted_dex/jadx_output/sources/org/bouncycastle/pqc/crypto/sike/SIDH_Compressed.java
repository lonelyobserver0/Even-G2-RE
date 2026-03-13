package org.bouncycastle.pqc.crypto.sike;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.util.Arrays;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class SIDH_Compressed {
    private static final int t_points = 2;
    private SIKEEngine engine;

    public SIDH_Compressed(SIKEEngine sIKEEngine) {
        this.engine = sIKEEngine;
    }

    private int EphemeralKeyGeneration_A(byte[] bArr, byte[] bArr2) {
        int[] iArr = new int[3];
        Internal internal = this.engine.params;
        int[] iArr2 = new int[internal.DLEN_3];
        int i3 = internal.NWORDS_ORDER;
        long[] jArr = new long[i3];
        long[] jArr2 = new long[i3];
        long[] jArr3 = new long[i3];
        long[] jArr4 = new long[i3];
        int[] iArr3 = {2, internal.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr5 = (long[][]) Array.newInstance((Class<?>) cls, iArr3);
        long[][][] jArr6 = (long[][][]) Array.newInstance((Class<?>) cls, 4, 2, this.engine.params.NWORDS_FIELD);
        Internal internal2 = this.engine.params;
        long[][][][] jArr7 = (long[][][][]) Array.newInstance((Class<?>) cls, internal2.MAX_Alice + 1, 5, 2, internal2.NWORDS_FIELD);
        PointProjFull[] pointProjFullArr = new PointProjFull[2];
        FullIsogeny_A_dual(bArr, jArr7, jArr5, 0);
        BuildOrdinary3nBasis_dual(jArr5, jArr7, pointProjFullArr, iArr, iArr, 2);
        Tate3_pairings(pointProjFullArr, jArr6);
        Dlogs3_dual(jArr6, iArr2, jArr2, jArr, jArr4, jArr3);
        Compress_PKA_dual(jArr2, jArr, jArr4, jArr3, jArr5, iArr, bArr2);
        return 0;
    }

    private boolean FirstPoint_dual(PointProj pointProj, PointProjFull pointProjFull, byte[] bArr) {
        PointProjFull pointProjFull2 = new PointProjFull(this.engine.params.NWORDS_FIELD);
        PointProjFull pointProjFull3 = new PointProjFull(this.engine.params.NWORDS_FIELD);
        int[] iArr = {2, 2, this.engine.params.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][][] jArr = (long[][][]) Array.newInstance((Class<?>) cls, iArr);
        long[][][] jArr2 = (long[][][]) Array.newInstance((Class<?>) cls, 2, 2, this.engine.params.NWORDS_FIELD);
        SIKEEngine sIKEEngine = this.engine;
        Internal internal = sIKEEngine.params;
        int i3 = internal.NWORDS_FIELD;
        long[] jArr3 = new long[i3];
        sIKEEngine.fpx.fpcopy(internal.B_gen_3_tors, 0, pointProjFull2.f19466X[0]);
        SIKEEngine sIKEEngine2 = this.engine;
        Fpx fpx = sIKEEngine2.fpx;
        Internal internal2 = sIKEEngine2.params;
        fpx.fpcopy(internal2.B_gen_3_tors, internal2.NWORDS_FIELD, pointProjFull2.f19466X[1]);
        SIKEEngine sIKEEngine3 = this.engine;
        Fpx fpx2 = sIKEEngine3.fpx;
        Internal internal3 = sIKEEngine3.params;
        fpx2.fpcopy(internal3.B_gen_3_tors, internal3.NWORDS_FIELD * 2, pointProjFull2.f19467Y[0]);
        SIKEEngine sIKEEngine4 = this.engine;
        Fpx fpx3 = sIKEEngine4.fpx;
        Internal internal4 = sIKEEngine4.params;
        fpx3.fpcopy(internal4.B_gen_3_tors, internal4.NWORDS_FIELD * 3, pointProjFull2.f19467Y[1]);
        SIKEEngine sIKEEngine5 = this.engine;
        Fpx fpx4 = sIKEEngine5.fpx;
        Internal internal5 = sIKEEngine5.params;
        fpx4.fpcopy(internal5.B_gen_3_tors, internal5.NWORDS_FIELD * 4, pointProjFull3.f19466X[0]);
        SIKEEngine sIKEEngine6 = this.engine;
        Fpx fpx5 = sIKEEngine6.fpx;
        Internal internal6 = sIKEEngine6.params;
        fpx5.fpcopy(internal6.B_gen_3_tors, internal6.NWORDS_FIELD * 5, pointProjFull3.f19466X[1]);
        SIKEEngine sIKEEngine7 = this.engine;
        Fpx fpx6 = sIKEEngine7.fpx;
        Internal internal7 = sIKEEngine7.params;
        fpx6.fpcopy(internal7.B_gen_3_tors, internal7.NWORDS_FIELD * 6, pointProjFull3.f19467Y[0]);
        SIKEEngine sIKEEngine8 = this.engine;
        Fpx fpx7 = sIKEEngine8.fpx;
        Internal internal8 = sIKEEngine8.params;
        fpx7.fpcopy(internal8.B_gen_3_tors, internal8.NWORDS_FIELD * 7, pointProjFull3.f19467Y[1]);
        this.engine.isogeny.CompletePoint(pointProj, pointProjFull);
        Tate3_proj(pointProjFull2, pointProjFull, jArr[0], jArr2[0]);
        Tate3_proj(pointProjFull3, pointProjFull, jArr[1], jArr2[1]);
        FinalExpo3_2way(jArr, jArr2);
        this.engine.fpx.fp2correction(jArr[0]);
        this.engine.fpx.fp2correction(jArr[1]);
        int i10 = Fpx.subarrayEquals(jArr[0][1], jArr3, i3) ? 0 : Fpx.subarrayEquals(jArr[0][1], this.engine.params.g_R_S_im, i3) ? 1 : 2;
        int i11 = Fpx.subarrayEquals(jArr[1][1], jArr3, i3) ? 0 : Fpx.subarrayEquals(jArr[1][1], this.engine.params.g_R_S_im, i3) ? 1 : 2;
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        if (i10 == 0) {
            bArr[0] = 0;
        } else if (i11 == 0) {
            bArr[0] = 1;
        } else if (i10 + i11 == 3) {
            bArr[0] = 3;
        } else {
            bArr[0] = 2;
        }
        return true;
    }

    private boolean SecondPoint_dual(PointProj pointProj, PointProjFull pointProjFull, byte[] bArr) {
        PointProjFull pointProjFull2 = new PointProjFull(this.engine.params.NWORDS_FIELD);
        int[] iArr = {2, this.engine.params.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr = (long[][]) Array.newInstance((Class<?>) cls, iArr);
        long[][] jArr2 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        SIKEEngine sIKEEngine = this.engine;
        Internal internal = sIKEEngine.params;
        int i3 = internal.NWORDS_FIELD;
        sIKEEngine.fpx.fpcopy(internal.B_gen_3_tors, bArr[0] * 4 * i3, pointProjFull2.f19466X[0]);
        SIKEEngine sIKEEngine2 = this.engine;
        Fpx fpx = sIKEEngine2.fpx;
        Internal internal2 = sIKEEngine2.params;
        fpx.fpcopy(internal2.B_gen_3_tors, ((bArr[0] * 4) + 1) * internal2.NWORDS_FIELD, pointProjFull2.f19466X[1]);
        SIKEEngine sIKEEngine3 = this.engine;
        Fpx fpx2 = sIKEEngine3.fpx;
        Internal internal3 = sIKEEngine3.params;
        fpx2.fpcopy(internal3.B_gen_3_tors, ((bArr[0] * 4) + 2) * internal3.NWORDS_FIELD, pointProjFull2.f19467Y[0]);
        SIKEEngine sIKEEngine4 = this.engine;
        Fpx fpx3 = sIKEEngine4.fpx;
        Internal internal4 = sIKEEngine4.params;
        fpx3.fpcopy(internal4.B_gen_3_tors, ((bArr[0] * 4) + 3) * internal4.NWORDS_FIELD, pointProjFull2.f19467Y[1]);
        this.engine.isogeny.CompletePoint(pointProj, pointProjFull);
        Tate3_proj(pointProjFull2, pointProjFull, jArr, jArr2);
        FinalExpo3(jArr, jArr2);
        this.engine.fpx.fp2correction(jArr);
        return !Fpx.subarrayEquals(jArr[1], new long[i3], i3);
    }

    private void Tate2_pairings(PointProj pointProj, PointProj pointProj2, PointProjFull[] pointProjFullArr, long[][][] jArr) {
        int[] iArr = {4, 2, this.engine.params.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][][] jArr2 = (long[][][]) Array.newInstance((Class<?>) cls, iArr);
        long[][] jArr3 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr4 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr5 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr6 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr7 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr8 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        SIKEEngine sIKEEngine = this.engine;
        sIKEEngine.fpx.fpcopy(sIKEEngine.params.Montgomery_one, 0, jArr3[0]);
        for (int i3 = 0; i3 < 2; i3++) {
            this.engine.fpx.fp2copy(jArr3, jArr[i3]);
            this.engine.fpx.fp2copy(jArr3, jArr[i3 + 2]);
        }
        long[][] jArr9 = pointProj.f19464X;
        long[][] jArr10 = pointProj.f19465Z;
        SIKEEngine sIKEEngine2 = this.engine;
        Internal internal = sIKEEngine2.params;
        long[] jArr11 = internal.T_tate2_firststep_P;
        int i10 = 0;
        sIKEEngine2.fpx.fpcopy(jArr11, internal.NWORDS_FIELD * 2, jArr4[0]);
        SIKEEngine sIKEEngine3 = this.engine;
        Fpx fpx = sIKEEngine3.fpx;
        Internal internal2 = sIKEEngine3.params;
        fpx.fpcopy(internal2.T_tate2_firststep_P, internal2.NWORDS_FIELD * 3, jArr4[1]);
        int i11 = 0;
        while (i11 < 2) {
            this.engine.fpx.fp2sub(pointProjFullArr[i11].f19466X, jArr9, jArr5);
            this.engine.fpx.fp2sub(pointProjFullArr[i11].f19467Y, jArr10, jArr6);
            this.engine.fpx.fp2mul_mont(jArr4, jArr5, jArr5);
            this.engine.fpx.fp2sub(jArr5, jArr6, jArr7);
            SIKEEngine sIKEEngine4 = this.engine;
            long[][] jArr12 = jArr10;
            int i12 = i11;
            int i13 = i10;
            sIKEEngine4.fpx.fpsubPRIME(pointProjFullArr[i11].f19466X[i10], sIKEEngine4.params.T_tate2_firststep_P, i13, jArr8[i10]);
            this.engine.fpx.fpcopy(pointProjFullArr[i12].f19466X[1], i13, jArr8[1]);
            this.engine.fpx.fpnegPRIME(jArr8[1]);
            this.engine.fpx.fp2mul_mont(jArr7, jArr8, jArr7);
            Fpx fpx2 = this.engine.fpx;
            long[][] jArr13 = jArr[i12];
            fpx2.fp2sqr_mont(jArr13, jArr13);
            Fpx fpx3 = this.engine.fpx;
            long[][] jArr14 = jArr[i12];
            fpx3.fp2mul_mont(jArr14, jArr7, jArr14);
            i11 = i12 + 1;
            jArr10 = jArr12;
            i10 = 0;
        }
        int i14 = this.engine.params.NWORDS_FIELD;
        long[] jArr15 = jArr11;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            Internal internal3 = this.engine.params;
            if (i15 >= internal3.OALICE_BITS - 2) {
                break;
            }
            long[] jArr16 = internal3.T_tate2_P;
            int i17 = internal3.NWORDS_FIELD;
            int i18 = i15 * 3;
            int i19 = i15;
            int i20 = i17 * i18;
            int i21 = (i18 + 1) * i17;
            int i22 = i17 * (i18 + 2);
            long[][][] jArr17 = jArr2;
            int i23 = 0;
            for (int i24 = 2; i23 < i24; i24 = 2) {
                int i25 = i23;
                this.engine.fpx.fpsubPRIME(jArr11, i16, pointProjFullArr[i25].f19466X[0], jArr5[1]);
                Fpx fpx4 = this.engine.fpx;
                long[] jArr18 = jArr5[1];
                fpx4.fpmul_mont(jArr16, i22, jArr18, jArr18);
                this.engine.fpx.fpmul_mont(jArr16, i22, pointProjFullArr[i25].f19466X[1], jArr5[0]);
                this.engine.fpx.fpsubPRIME(pointProjFullArr[i25].f19467Y[1], jArr15, i14, jArr6[1]);
                int i26 = i14;
                this.engine.fpx.fpsubPRIME(jArr5[1], jArr6[1], jArr7[1]);
                this.engine.fpx.fpsubPRIME(jArr5[0], pointProjFullArr[i25].f19467Y[0], jArr7[0]);
                this.engine.fpx.fpsubPRIME(pointProjFullArr[i25].f19466X[0], jArr16, i20, jArr8[0]);
                this.engine.fpx.fpcopy(pointProjFullArr[i25].f19466X[1], 0, jArr8[1]);
                this.engine.fpx.fpnegPRIME(jArr8[1]);
                this.engine.fpx.fp2mul_mont(jArr7, jArr8, jArr7);
                Fpx fpx5 = this.engine.fpx;
                long[][] jArr19 = jArr[i25];
                fpx5.fp2sqr_mont(jArr19, jArr19);
                Fpx fpx6 = this.engine.fpx;
                long[][] jArr20 = jArr[i25];
                fpx6.fp2mul_mont(jArr20, jArr7, jArr20);
                i23 = i25 + 1;
                jArr4 = jArr4;
                i14 = i26;
            }
            i16 = i20;
            jArr15 = jArr16;
            jArr11 = jArr15;
            jArr2 = jArr17;
            i15 = i19 + 1;
            i14 = i21;
        }
        long[][][] jArr21 = jArr2;
        long[][] jArr22 = jArr4;
        for (int i27 = 0; i27 < 2; i27++) {
            this.engine.fpx.fpsubPRIME(pointProjFullArr[i27].f19466X[0], jArr11, i16, jArr7[0]);
            this.engine.fpx.fpcopy(pointProjFullArr[i27].f19466X[1], 0, jArr7[1]);
            Fpx fpx7 = this.engine.fpx;
            long[][] jArr23 = jArr[i27];
            fpx7.fp2sqr_mont(jArr23, jArr23);
            Fpx fpx8 = this.engine.fpx;
            long[][] jArr24 = jArr[i27];
            fpx8.fp2mul_mont(jArr24, jArr7, jArr24);
        }
        long[][] jArr25 = pointProj2.f19464X;
        long[][] jArr26 = pointProj2.f19465Z;
        SIKEEngine sIKEEngine5 = this.engine;
        Internal internal4 = sIKEEngine5.params;
        long[] jArr27 = internal4.T_tate2_firststep_Q;
        int i28 = internal4.NWORDS_FIELD;
        sIKEEngine5.fpx.fpcopy(jArr27, i28 * 2, jArr22[0]);
        SIKEEngine sIKEEngine6 = this.engine;
        Fpx fpx9 = sIKEEngine6.fpx;
        Internal internal5 = sIKEEngine6.params;
        fpx9.fpcopy(internal5.T_tate2_firststep_Q, internal5.NWORDS_FIELD * 3, jArr22[1]);
        for (int i29 = 0; i29 < 2; i29++) {
            this.engine.fpx.fp2sub(pointProjFullArr[i29].f19466X, jArr25, jArr5);
            this.engine.fpx.fp2sub(pointProjFullArr[i29].f19467Y, jArr26, jArr6);
            this.engine.fpx.fp2mul_mont(jArr22, jArr5, jArr5);
            this.engine.fpx.fp2sub(jArr5, jArr6, jArr7);
            this.engine.fpx.fpsubPRIME(pointProjFullArr[i29].f19466X[0], jArr27, 0, jArr8[0]);
            this.engine.fpx.fpcopy(pointProjFullArr[i29].f19466X[1], 0, jArr8[1]);
            this.engine.fpx.fpnegPRIME(jArr8[1]);
            this.engine.fpx.fp2mul_mont(jArr7, jArr8, jArr7);
            Fpx fpx10 = this.engine.fpx;
            int i30 = i29 + 2;
            long[][] jArr28 = jArr[i30];
            fpx10.fp2sqr_mont(jArr28, jArr28);
            Fpx fpx11 = this.engine.fpx;
            long[][] jArr29 = jArr[i30];
            fpx11.fp2mul_mont(jArr29, jArr7, jArr29);
        }
        long[] jArr30 = jArr27;
        int i31 = 0;
        int i32 = 0;
        while (true) {
            long[] jArr31 = jArr30;
            Internal internal6 = this.engine.params;
            if (i32 >= internal6.OALICE_BITS - 2) {
                break;
            }
            long[] jArr32 = internal6.T_tate2_Q;
            int i33 = internal6.NWORDS_FIELD;
            int i34 = i32 * 3;
            int i35 = i33 * i34;
            int i36 = (i34 + 1) * i33;
            int i37 = (i34 + 2) * i33;
            int i38 = 0;
            for (int i39 = 2; i38 < i39; i39 = 2) {
                int i40 = i32;
                int i41 = i38;
                this.engine.fpx.fpsubPRIME(pointProjFullArr[i38].f19466X[0], jArr30, i31, jArr5[0]);
                Fpx fpx12 = this.engine.fpx;
                long[] jArr33 = jArr5[0];
                fpx12.fpmul_mont(jArr32, i37, jArr33, jArr33);
                this.engine.fpx.fpmul_mont(jArr32, i37, pointProjFullArr[i41].f19466X[1], jArr5[1]);
                this.engine.fpx.fpsubPRIME(pointProjFullArr[i41].f19467Y[0], jArr31, i28, jArr6[0]);
                long[] jArr34 = jArr31;
                this.engine.fpx.fpsubPRIME(jArr5[0], jArr6[0], jArr7[0]);
                this.engine.fpx.fpsubPRIME(jArr5[1], pointProjFullArr[i41].f19467Y[1], jArr7[1]);
                this.engine.fpx.fpsubPRIME(pointProjFullArr[i41].f19466X[0], jArr32, i35, jArr8[0]);
                this.engine.fpx.fpcopy(pointProjFullArr[i41].f19466X[1], 0, jArr8[1]);
                this.engine.fpx.fpnegPRIME(jArr8[1]);
                this.engine.fpx.fp2mul_mont(jArr7, jArr8, jArr7);
                Fpx fpx13 = this.engine.fpx;
                int i42 = i41 + 2;
                long[][] jArr35 = jArr[i42];
                fpx13.fp2sqr_mont(jArr35, jArr35);
                Fpx fpx14 = this.engine.fpx;
                long[][] jArr36 = jArr[i42];
                fpx14.fp2mul_mont(jArr36, jArr7, jArr36);
                i38 = i41 + 1;
                i32 = i40;
                jArr31 = jArr34;
            }
            i32++;
            jArr30 = jArr32;
            i31 = i35;
            i28 = i36;
        }
        for (int i43 = 0; i43 < 2; i43++) {
            this.engine.fpx.fpsubPRIME(pointProjFullArr[i43].f19466X[0], jArr30, i31, jArr7[0]);
            this.engine.fpx.fpcopy(pointProjFullArr[i43].f19466X[1], 0, jArr7[1]);
            Fpx fpx15 = this.engine.fpx;
            int i44 = i43 + 2;
            long[][] jArr37 = jArr[i44];
            fpx15.fp2sqr_mont(jArr37, jArr37);
            Fpx fpx16 = this.engine.fpx;
            long[][] jArr38 = jArr[i44];
            fpx16.fp2mul_mont(jArr38, jArr7, jArr38);
        }
        this.engine.fpx.mont_n_way_inv(jArr, 4, jArr21);
        for (int i45 = 0; i45 < 4; i45++) {
            long[][] jArr39 = jArr[i45];
            final_exponentiation_2_torsion(jArr39, jArr21[i45], jArr39);
        }
    }

    private void Tate3_pairings(PointProjFull[] pointProjFullArr, long[][][] jArr) {
        int i3 = this.engine.params.NWORDS_FIELD;
        long[] jArr2 = new long[i3];
        long[] jArr3 = new long[i3];
        long[] jArr4 = new long[i3];
        long[] jArr5 = new long[i3];
        long[] jArr6 = new long[i3];
        long[] jArr7 = new long[i3];
        long[] jArr8 = new long[i3];
        long[] jArr9 = new long[i3];
        long[] jArr10 = new long[i3];
        int[] iArr = {2, 2, i3};
        Class cls = Long.TYPE;
        long[][][] jArr11 = (long[][][]) Array.newInstance((Class<?>) cls, iArr);
        long[][][] jArr12 = (long[][][]) Array.newInstance((Class<?>) cls, 4, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr13 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr14 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr15 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr16 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr17 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr18 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr19 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr20 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr21 = jArr18;
        long[][] jArr22 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr23 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        SIKEEngine sIKEEngine = this.engine;
        long[][] jArr24 = jArr23;
        long[][] jArr25 = jArr20;
        sIKEEngine.fpx.fpcopy(sIKEEngine.params.Montgomery_one, 0, jArr13[0]);
        for (int i10 = 0; i10 < 2; i10++) {
            this.engine.fpx.fp2copy(jArr13, jArr[i10]);
            this.engine.fpx.fp2copy(jArr13, jArr[i10 + 2]);
            this.engine.fpx.fp2sqr_mont(pointProjFullArr[i10].f19466X, jArr11[i10]);
        }
        int i11 = 0;
        while (true) {
            Internal internal = this.engine.params;
            if (i11 >= internal.OBOB_EXPON - 1) {
                break;
            }
            long[] jArr26 = internal.T_tate3;
            int i12 = internal.NWORDS_FIELD;
            int i13 = i11 * 6;
            int i14 = i11;
            char c10 = 0;
            System.arraycopy(jArr26, i12 * i13, jArr4, 0, i12);
            Internal internal2 = this.engine.params;
            long[] jArr27 = internal2.T_tate3;
            int i15 = internal2.NWORDS_FIELD;
            System.arraycopy(jArr27, (i13 + 1) * i15, jArr5, 0, i15);
            Internal internal3 = this.engine.params;
            long[] jArr28 = internal3.T_tate3;
            int i16 = internal3.NWORDS_FIELD;
            System.arraycopy(jArr28, (i13 + 2) * i16, jArr6, 0, i16);
            Internal internal4 = this.engine.params;
            long[] jArr29 = internal4.T_tate3;
            int i17 = internal4.NWORDS_FIELD;
            System.arraycopy(jArr29, (i13 + 3) * i17, jArr7, 0, i17);
            Internal internal5 = this.engine.params;
            long[] jArr30 = internal5.T_tate3;
            int i18 = internal5.NWORDS_FIELD;
            System.arraycopy(jArr30, (i13 + 4) * i18, jArr9, 0, i18);
            Internal internal6 = this.engine.params;
            long[] jArr31 = internal6.T_tate3;
            int i19 = internal6.NWORDS_FIELD;
            System.arraycopy(jArr31, (i13 + 5) * i19, jArr10, 0, i19);
            int i20 = 0;
            while (i20 < 2) {
                this.engine.fpx.fpmul_mont(pointProjFullArr[i20].f19466X[c10], jArr4, jArr14[c10]);
                this.engine.fpx.fpmul_mont(pointProjFullArr[i20].f19466X[1], jArr4, jArr14[1]);
                this.engine.fpx.fpmul_mont(pointProjFullArr[i20].f19466X[0], jArr5, jArr16[0]);
                this.engine.fpx.fpmul_mont(pointProjFullArr[i20].f19466X[1], jArr5, jArr16[1]);
                this.engine.fpx.fpaddPRIME(jArr11[i20][0], jArr9, jArr21[0]);
                this.engine.fpx.fpcopy(jArr11[i20][1], 0, jArr21[1]);
                this.engine.fpx.fpmul_mont(pointProjFullArr[i20].f19466X[0], jArr10, jArr19[0]);
                this.engine.fpx.fpmul_mont(pointProjFullArr[i20].f19466X[1], jArr10, jArr19[1]);
                this.engine.fpx.fp2sub(jArr14, pointProjFullArr[i20].f19467Y, jArr15);
                Fpx fpx = this.engine.fpx;
                long[] jArr32 = jArr15[0];
                fpx.fpaddPRIME(jArr32, jArr6, jArr32);
                this.engine.fpx.fp2sub(jArr16, pointProjFullArr[i20].f19467Y, jArr17);
                Fpx fpx2 = this.engine.fpx;
                long[] jArr33 = jArr17[0];
                fpx2.fpaddPRIME(jArr33, jArr7, jArr33);
                long[][] jArr34 = jArr25;
                this.engine.fpx.fp2mul_mont(jArr15, jArr17, jArr34);
                long[][] jArr35 = jArr19;
                long[][] jArr36 = jArr21;
                int i21 = i20;
                long[][] jArr37 = jArr22;
                this.engine.fpx.fp2sub(jArr36, jArr35, jArr37);
                this.engine.fpx.fp2_conj(jArr37, jArr37);
                this.engine.fpx.fp2mul_mont(jArr34, jArr37, jArr34);
                long[] jArr38 = jArr5;
                long[] jArr39 = jArr9;
                long[][] jArr40 = jArr24;
                this.engine.fpx.fp2sqr_mont(jArr[i21], jArr40);
                Fpx fpx3 = this.engine.fpx;
                long[][] jArr41 = jArr[i21];
                fpx3.fp2mul_mont(jArr41, jArr40, jArr41);
                Fpx fpx4 = this.engine.fpx;
                long[][] jArr42 = jArr[i21];
                fpx4.fp2mul_mont(jArr42, jArr34, jArr42);
                long[] jArr43 = jArr10;
                long[][] jArr44 = jArr14;
                this.engine.fpx.fpsubPRIME(jArr14[1], pointProjFullArr[i21].f19467Y[0], jArr15[0]);
                this.engine.fpx.fpaddPRIME(jArr44[0], pointProjFullArr[i21].f19467Y[1], jArr15[1]);
                this.engine.fpx.fpnegPRIME(jArr15[1]);
                Fpx fpx5 = this.engine.fpx;
                long[] jArr45 = jArr15[1];
                fpx5.fpaddPRIME(jArr45, jArr6, jArr45);
                this.engine.fpx.fpsubPRIME(jArr16[1], pointProjFullArr[i21].f19467Y[0], jArr17[0]);
                this.engine.fpx.fpaddPRIME(jArr16[0], pointProjFullArr[i21].f19467Y[1], jArr17[1]);
                this.engine.fpx.fpnegPRIME(jArr17[1]);
                Fpx fpx6 = this.engine.fpx;
                long[] jArr46 = jArr17[1];
                fpx6.fpaddPRIME(jArr46, jArr7, jArr46);
                this.engine.fpx.fp2mul_mont(jArr15, jArr17, jArr34);
                this.engine.fpx.fp2add(jArr36, jArr35, jArr37);
                this.engine.fpx.fp2_conj(jArr37, jArr37);
                this.engine.fpx.fp2mul_mont(jArr34, jArr37, jArr34);
                int i22 = i21 + 2;
                this.engine.fpx.fp2sqr_mont(jArr[i22], jArr40);
                Fpx fpx7 = this.engine.fpx;
                long[][] jArr47 = jArr[i22];
                fpx7.fp2mul_mont(jArr47, jArr40, jArr47);
                Fpx fpx8 = this.engine.fpx;
                long[][] jArr48 = jArr[i22];
                fpx8.fp2mul_mont(jArr48, jArr34, jArr48);
                int i23 = i21 + 1;
                jArr19 = jArr35;
                jArr10 = jArr43;
                jArr5 = jArr38;
                jArr14 = jArr44;
                jArr25 = jArr34;
                jArr24 = jArr40;
                jArr21 = jArr36;
                jArr9 = jArr39;
                jArr22 = jArr37;
                i20 = i23;
                c10 = 0;
            }
            i11 = i14 + 1;
            jArr25 = jArr25;
            jArr24 = jArr24;
            jArr21 = jArr21;
            jArr9 = jArr9;
            jArr22 = jArr22;
        }
        long[][] jArr49 = jArr24;
        long[][] jArr50 = jArr22;
        long[][] jArr51 = jArr25;
        int i24 = 0;
        long[][] jArr52 = jArr14;
        for (int i25 = 2; i24 < i25; i25 = 2) {
            Internal internal7 = this.engine.params;
            long[] jArr53 = internal7.T_tate3;
            int i26 = internal7.NWORDS_FIELD;
            System.arraycopy(jArr53, (internal7.OBOB_EXPON - 1) * 6 * i26, jArr2, 0, i26);
            Internal internal8 = this.engine.params;
            long[] jArr54 = internal8.T_tate3;
            int i27 = internal8.NWORDS_FIELD;
            System.arraycopy(jArr54, (((internal8.OBOB_EXPON - 1) * 6) + 1) * i27, jArr3, 0, i27);
            Internal internal9 = this.engine.params;
            long[] jArr55 = internal9.T_tate3;
            int i28 = internal9.NWORDS_FIELD;
            System.arraycopy(jArr55, (((internal9.OBOB_EXPON - 1) * 6) + 2) * i28, jArr4, 0, i28);
            Internal internal10 = this.engine.params;
            long[] jArr56 = internal10.T_tate3;
            int i29 = internal10.NWORDS_FIELD;
            System.arraycopy(jArr56, (((internal10.OBOB_EXPON - 1) * 6) + 3) * i29, jArr8, 0, i29);
            this.engine.fpx.fpsubPRIME(pointProjFullArr[i24].f19466X[0], jArr2, jArr52[0]);
            this.engine.fpx.fpcopy(pointProjFullArr[i24].f19466X[1], 0, jArr52[1]);
            this.engine.fpx.fpmul_mont(jArr4, jArr52[0], jArr15[0]);
            this.engine.fpx.fpmul_mont(jArr4, jArr52[1], jArr15[1]);
            this.engine.fpx.fp2sub(jArr15, pointProjFullArr[i24].f19467Y, jArr16);
            Fpx fpx9 = this.engine.fpx;
            long[] jArr57 = jArr16[0];
            fpx9.fpaddPRIME(jArr57, jArr3, jArr57);
            this.engine.fpx.fp2mul_mont(jArr52, jArr16, jArr51);
            this.engine.fpx.fpsubPRIME(pointProjFullArr[i24].f19466X[0], jArr8, jArr50[0]);
            this.engine.fpx.fpcopy(pointProjFullArr[i24].f19466X[1], 0, jArr50[1]);
            this.engine.fpx.fpnegPRIME(jArr50[1]);
            this.engine.fpx.fp2mul_mont(jArr51, jArr50, jArr51);
            this.engine.fpx.fp2sqr_mont(jArr[i24], jArr49);
            Fpx fpx10 = this.engine.fpx;
            long[][] jArr58 = jArr[i24];
            fpx10.fp2mul_mont(jArr58, jArr49, jArr58);
            Fpx fpx11 = this.engine.fpx;
            long[][] jArr59 = jArr[i24];
            fpx11.fp2mul_mont(jArr59, jArr51, jArr59);
            this.engine.fpx.fpaddPRIME(pointProjFullArr[i24].f19466X[0], jArr2, jArr52[0]);
            this.engine.fpx.fpmul_mont(jArr4, jArr52[0], jArr15[0]);
            this.engine.fpx.fpsubPRIME(pointProjFullArr[i24].f19467Y[0], jArr15[1], jArr16[0]);
            this.engine.fpx.fpaddPRIME(pointProjFullArr[i24].f19467Y[1], jArr15[0], jArr16[1]);
            Fpx fpx12 = this.engine.fpx;
            long[] jArr60 = jArr16[1];
            fpx12.fpsubPRIME(jArr60, jArr3, jArr60);
            this.engine.fpx.fp2mul_mont(jArr52, jArr16, jArr51);
            this.engine.fpx.fpaddPRIME(pointProjFullArr[i24].f19466X[0], jArr8, jArr50[0]);
            this.engine.fpx.fp2mul_mont(jArr51, jArr50, jArr51);
            int i30 = i24 + 2;
            this.engine.fpx.fp2sqr_mont(jArr[i30], jArr49);
            Fpx fpx13 = this.engine.fpx;
            long[][] jArr61 = jArr[i30];
            fpx13.fp2mul_mont(jArr61, jArr49, jArr61);
            Fpx fpx14 = this.engine.fpx;
            long[][] jArr62 = jArr[i30];
            fpx14.fp2mul_mont(jArr62, jArr51, jArr62);
            i24++;
        }
        this.engine.fpx.mont_n_way_inv(jArr, 4, jArr12);
        for (int i31 = 0; i31 < 4; i31++) {
            long[][] jArr63 = jArr[i31];
            final_exponentiation_3_torsion(jArr63, jArr12[i31], jArr63);
        }
    }

    private void final_exponentiation_2_torsion(long[][] jArr, long[][] jArr2, long[][] jArr3) {
        int i3 = this.engine.params.NWORDS_FIELD;
        long[] jArr4 = new long[i3];
        int[] iArr = {2, i3};
        int i10 = 0;
        long[][] jArr5 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iArr);
        SIKEEngine sIKEEngine = this.engine;
        sIKEEngine.fpx.fpcopy(sIKEEngine.params.Montgomery_one, 0, jArr4);
        this.engine.fpx.fp2_conj(jArr, jArr5);
        this.engine.fpx.fp2mul_mont(jArr5, jArr2, jArr5);
        while (true) {
            SIKEEngine sIKEEngine2 = this.engine;
            int i11 = sIKEEngine2.params.OBOB_EXPON;
            Fpx fpx = sIKEEngine2.fpx;
            if (i10 >= i11) {
                fpx.fp2copy(jArr5, jArr3);
                return;
            } else {
                fpx.cube_Fp2_cycl(jArr5, jArr4);
                i10++;
            }
        }
    }

    private void final_exponentiation_3_torsion(long[][] jArr, long[][] jArr2, long[][] jArr3) {
        int i3 = this.engine.params.NWORDS_FIELD;
        long[] jArr4 = new long[i3];
        int[] iArr = {2, i3};
        int i10 = 0;
        long[][] jArr5 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iArr);
        SIKEEngine sIKEEngine = this.engine;
        sIKEEngine.fpx.fpcopy(sIKEEngine.params.Montgomery_one, 0, jArr4);
        this.engine.fpx.fp2_conj(jArr, jArr5);
        this.engine.fpx.fp2mul_mont(jArr5, jArr2, jArr5);
        while (true) {
            SIKEEngine sIKEEngine2 = this.engine;
            int i11 = sIKEEngine2.params.OALICE_BITS;
            Fpx fpx = sIKEEngine2.fpx;
            if (i10 >= i11) {
                fpx.fp2copy(jArr5, jArr3);
                return;
            } else {
                fpx.sqr_Fp2_cycl(jArr5, jArr4);
                i10++;
            }
        }
    }

    private void from_base(int[] iArr, long[] jArr, int i3, int i10) {
        SIKEEngine sIKEEngine = this.engine;
        Internal internal = sIKEEngine.params;
        int i11 = internal.NWORDS_ORDER;
        long[] jArr2 = new long[i11];
        long[] jArr3 = new long[i11];
        long j = i10;
        new long[i11][0] = j;
        int i12 = iArr[i3 - 1];
        if (i12 < 0) {
            jArr2[0] = (-i12) * j;
            int i13 = i10 & 1;
            Fpx fpx = sIKEEngine.fpx;
            if (i13 == 0) {
                fpx.Montgomery_neg(jArr2, internal.Alice_order);
                SIKEEngine sIKEEngine2 = this.engine;
                sIKEEngine2.fpx.copy_words(jArr2, jArr, sIKEEngine2.params.NWORDS_ORDER);
            } else {
                fpx.mp_sub(internal.Bob_order, jArr2, jArr, i11);
            }
        } else {
            jArr[0] = i12 * j;
        }
        int i14 = i3 - 2;
        while (true) {
            Arrays.fill(jArr2, 0L);
            if (i14 < 1) {
                break;
            }
            int i15 = iArr[i14];
            if (i15 < 0) {
                jArr2[0] = -i15;
                if ((i10 & 1) == 0) {
                    SIKEEngine sIKEEngine3 = this.engine;
                    sIKEEngine3.fpx.Montgomery_neg(jArr2, sIKEEngine3.params.Alice_order);
                } else {
                    SIKEEngine sIKEEngine4 = this.engine;
                    Fpx fpx2 = sIKEEngine4.fpx;
                    Internal internal2 = sIKEEngine4.params;
                    fpx2.mp_sub(internal2.Bob_order, jArr2, jArr2, internal2.NWORDS_ORDER);
                }
            } else {
                jArr2[0] = i15;
            }
            SIKEEngine sIKEEngine5 = this.engine;
            sIKEEngine5.fpx.mp_add(jArr, jArr2, jArr, sIKEEngine5.params.NWORDS_ORDER);
            int i16 = i10 & 1;
            if (i16 != 0) {
                SIKEEngine sIKEEngine6 = this.engine;
                if (!sIKEEngine6.fpx.is_orderelm_lt(jArr, sIKEEngine6.params.Bob_order)) {
                    SIKEEngine sIKEEngine7 = this.engine;
                    Fpx fpx3 = sIKEEngine7.fpx;
                    Internal internal3 = sIKEEngine7.params;
                    fpx3.mp_sub(jArr, internal3.Bob_order, jArr, internal3.NWORDS_ORDER);
                }
            }
            if (i16 == 0) {
                for (int i17 = i10; i17 > 1; i17 /= 2) {
                    SIKEEngine sIKEEngine8 = this.engine;
                    sIKEEngine8.fpx.mp_add(jArr, jArr, jArr, sIKEEngine8.params.NWORDS_ORDER);
                }
            } else {
                for (int i18 = i10; i18 > 1; i18 /= 3) {
                    Arrays.fill(jArr3, 0L);
                    SIKEEngine sIKEEngine9 = this.engine;
                    sIKEEngine9.fpx.mp_add(jArr, jArr, jArr3, sIKEEngine9.params.NWORDS_ORDER);
                    SIKEEngine sIKEEngine10 = this.engine;
                    if (!sIKEEngine10.fpx.is_orderelm_lt(jArr3, sIKEEngine10.params.Bob_order)) {
                        SIKEEngine sIKEEngine11 = this.engine;
                        Fpx fpx4 = sIKEEngine11.fpx;
                        Internal internal4 = sIKEEngine11.params;
                        fpx4.mp_sub(jArr3, internal4.Bob_order, jArr3, internal4.NWORDS_ORDER);
                    }
                    SIKEEngine sIKEEngine12 = this.engine;
                    sIKEEngine12.fpx.mp_add(jArr, jArr3, jArr, sIKEEngine12.params.NWORDS_ORDER);
                    SIKEEngine sIKEEngine13 = this.engine;
                    if (!sIKEEngine13.fpx.is_orderelm_lt(jArr, sIKEEngine13.params.Bob_order)) {
                        SIKEEngine sIKEEngine14 = this.engine;
                        Fpx fpx5 = sIKEEngine14.fpx;
                        Internal internal5 = sIKEEngine14.params;
                        fpx5.mp_sub(jArr, internal5.Bob_order, jArr, internal5.NWORDS_ORDER);
                    }
                }
            }
            i14--;
        }
        int i19 = iArr[0];
        if (i19 < 0) {
            jArr2[0] = -i19;
            if ((i10 & 1) == 0) {
                SIKEEngine sIKEEngine15 = this.engine;
                sIKEEngine15.fpx.Montgomery_neg(jArr2, sIKEEngine15.params.Alice_order);
            } else {
                SIKEEngine sIKEEngine16 = this.engine;
                Fpx fpx6 = sIKEEngine16.fpx;
                Internal internal6 = sIKEEngine16.params;
                fpx6.mp_sub(internal6.Bob_order, jArr2, jArr2, internal6.NWORDS_ORDER);
            }
        } else {
            jArr2[0] = i19;
        }
        SIKEEngine sIKEEngine17 = this.engine;
        sIKEEngine17.fpx.mp_add(jArr, jArr2, jArr, sIKEEngine17.params.NWORDS_ORDER);
        if ((i10 & 1) != 0) {
            SIKEEngine sIKEEngine18 = this.engine;
            if (sIKEEngine18.fpx.is_orderelm_lt(jArr, sIKEEngine18.params.Bob_order)) {
                return;
            }
            SIKEEngine sIKEEngine19 = this.engine;
            Fpx fpx7 = sIKEEngine19.fpx;
            Internal internal7 = sIKEEngine19.params;
            fpx7.mp_sub(jArr, internal7.Bob_order, jArr, internal7.NWORDS_ORDER);
        }
    }

    public void BiQuad_affine(long[][] jArr, long[][] jArr2, long[][] jArr3, PointProj pointProj) {
        int[] iArr = {2, this.engine.params.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr4 = (long[][]) Array.newInstance((Class<?>) cls, iArr);
        long[][] jArr5 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr6 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr7 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr8 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr9 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        this.engine.fpx.fp2add(jArr, jArr, jArr4);
        this.engine.fpx.fp2add(jArr4, jArr4, jArr4);
        this.engine.fpx.fp2sub(jArr2, jArr3, jArr5);
        this.engine.fpx.fp2sqr_mont(jArr5, jArr5);
        this.engine.fpx.fp2mul_mont(jArr2, jArr3, jArr7);
        SIKEEngine sIKEEngine = this.engine;
        Fpx fpx = sIKEEngine.fpx;
        long[] jArr10 = jArr7[0];
        fpx.fpsubPRIME(jArr10, sIKEEngine.params.Montgomery_one, jArr10);
        this.engine.fpx.fp2sqr_mont(jArr7, jArr7);
        SIKEEngine sIKEEngine2 = this.engine;
        sIKEEngine2.fpx.fpsubPRIME(jArr2[0], sIKEEngine2.params.Montgomery_one, jArr6[0]);
        this.engine.fpx.fpcopy(jArr2[1], 0, jArr6[1]);
        this.engine.fpx.fp2sqr_mont(jArr6, jArr6);
        this.engine.fpx.fp2mul_mont(jArr4, jArr2, jArr8);
        this.engine.fpx.fp2add(jArr6, jArr8, jArr6);
        this.engine.fpx.fp2mul_mont(jArr3, jArr6, jArr6);
        SIKEEngine sIKEEngine3 = this.engine;
        sIKEEngine3.fpx.fpsubPRIME(jArr3[0], sIKEEngine3.params.Montgomery_one, jArr8[0]);
        this.engine.fpx.fpcopy(jArr3[1], 0, jArr8[1]);
        this.engine.fpx.fp2sqr_mont(jArr8, jArr8);
        this.engine.fpx.fp2mul_mont(jArr4, jArr3, jArr9);
        this.engine.fpx.fp2add(jArr8, jArr9, jArr8);
        this.engine.fpx.fp2mul_mont(jArr2, jArr8, jArr8);
        this.engine.fpx.fp2add(jArr6, jArr8, jArr6);
        this.engine.fpx.fp2add(jArr6, jArr6, jArr6);
        this.engine.fpx.fp2sqr_mont(jArr6, jArr8);
        this.engine.fpx.fp2mul_mont(jArr5, jArr7, jArr9);
        this.engine.fpx.fp2add(jArr9, jArr9, jArr9);
        this.engine.fpx.fp2add(jArr9, jArr9, jArr9);
        this.engine.fpx.fp2sub(jArr8, jArr9, jArr8);
        this.engine.fpx.sqrt_Fp2(jArr8, jArr8);
        make_positive(jArr8);
        this.engine.fpx.fp2add(jArr6, jArr8, pointProj.f19464X);
        this.engine.fpx.fp2add(jArr5, jArr5, pointProj.f19465Z);
    }

    public void BuildEntangledXonly(long[][] jArr, PointProj[] pointProjArr, byte[] bArr, byte[] bArr2) {
        long[][] jArr2;
        int i3 = this.engine.params.NWORDS_FIELD;
        long[] jArr3 = new long[i3];
        Class cls = Long.TYPE;
        long[][] jArr4 = (long[][]) Array.newInstance((Class<?>) cls, 2, i3);
        long[][] jArr5 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        if (this.engine.fpx.is_sqr_fp2(jArr, jArr3)) {
            jArr2 = this.engine.params.table_v_qnr;
            bArr[0] = 1;
        } else {
            jArr2 = this.engine.params.table_v_qr;
            bArr[0] = 0;
        }
        bArr2[0] = 0;
        int i10 = 0;
        do {
            this.engine.fpx.fp2mul_mont(jArr, jArr2, i10, pointProjArr[0].f19464X);
            i10 += 2;
            this.engine.fpx.fp2neg(pointProjArr[0].f19464X);
            this.engine.fpx.fp2add(pointProjArr[0].f19464X, jArr, jArr5);
            this.engine.fpx.fp2mul_mont(pointProjArr[0].f19464X, jArr5, jArr5);
            SIKEEngine sIKEEngine = this.engine;
            Fpx fpx = sIKEEngine.fpx;
            long[] jArr6 = jArr5[0];
            fpx.fpaddPRIME(jArr6, sIKEEngine.params.Montgomery_one, jArr6);
            this.engine.fpx.fp2mul_mont(pointProjArr[0].f19464X, jArr5, jArr5);
            bArr2[0] = (byte) (bArr2[0] + 1);
        } while (!this.engine.fpx.is_sqr_fp2(jArr5, jArr3));
        byte b2 = (byte) (bArr2[0] - 1);
        bArr2[0] = b2;
        if (bArr[0] == 1) {
            SIKEEngine sIKEEngine2 = this.engine;
            sIKEEngine2.fpx.fpcopy(sIKEEngine2.params.table_r_qnr[b2], 0, jArr4[0]);
        } else {
            SIKEEngine sIKEEngine3 = this.engine;
            sIKEEngine3.fpx.fpcopy(sIKEEngine3.params.table_r_qr[b2], 0, jArr4[0]);
        }
        this.engine.fpx.fp2add(pointProjArr[0].f19464X, jArr, pointProjArr[1].f19464X);
        this.engine.fpx.fp2neg(pointProjArr[1].f19464X);
        this.engine.fpx.fp2sub(pointProjArr[0].f19464X, pointProjArr[1].f19464X, pointProjArr[2].f19465Z);
        Fpx fpx2 = this.engine.fpx;
        long[][] jArr7 = pointProjArr[2].f19465Z;
        fpx2.fp2sqr_mont(jArr7, jArr7);
        this.engine.fpx.fpcopy(jArr4[0], 0, jArr4[1]);
        SIKEEngine sIKEEngine4 = this.engine;
        Fpx fpx3 = sIKEEngine4.fpx;
        long[] jArr8 = sIKEEngine4.params.Montgomery_one;
        long[] jArr9 = jArr4[0];
        fpx3.fpaddPRIME(jArr8, jArr9, jArr9);
        this.engine.fpx.fp2sqr_mont(jArr4, jArr4);
        this.engine.fpx.fp2mul_mont(jArr5, jArr4, pointProjArr[2].f19464X);
    }

    public void BuildEntangledXonly_Decomp(long[][] jArr, PointProj[] pointProjArr, int i3, int i10) {
        int[] iArr = {2, this.engine.params.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr2 = (long[][]) Array.newInstance((Class<?>) cls, iArr);
        long[][] jArr3 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        Internal internal = this.engine.params;
        long[][] jArr4 = i3 == 1 ? internal.table_v_qnr : internal.table_v_qr;
        SIKEEngine sIKEEngine = this.engine;
        if (i10 >= sIKEEngine.params.TABLE_V_LEN / 2) {
            i10 = 0;
        }
        sIKEEngine.fpx.fp2mul_mont(jArr, jArr4, i10 * 2, pointProjArr[0].f19464X);
        this.engine.fpx.fp2neg(pointProjArr[0].f19464X);
        this.engine.fpx.fp2add(pointProjArr[0].f19464X, jArr, jArr3);
        this.engine.fpx.fp2mul_mont(pointProjArr[0].f19464X, jArr3, jArr3);
        SIKEEngine sIKEEngine2 = this.engine;
        Fpx fpx = sIKEEngine2.fpx;
        long[] jArr5 = jArr3[0];
        fpx.fpaddPRIME(jArr5, sIKEEngine2.params.Montgomery_one, jArr5);
        this.engine.fpx.fp2mul_mont(pointProjArr[0].f19464X, jArr3, jArr3);
        if (i3 == 1) {
            SIKEEngine sIKEEngine3 = this.engine;
            sIKEEngine3.fpx.fpcopy(sIKEEngine3.params.table_r_qnr[i10], 0, jArr2[0]);
        } else {
            SIKEEngine sIKEEngine4 = this.engine;
            sIKEEngine4.fpx.fpcopy(sIKEEngine4.params.table_r_qr[i10], 0, jArr2[0]);
        }
        this.engine.fpx.fp2add(pointProjArr[0].f19464X, jArr, pointProjArr[1].f19464X);
        this.engine.fpx.fp2neg(pointProjArr[1].f19464X);
        this.engine.fpx.fp2sub(pointProjArr[0].f19464X, pointProjArr[1].f19464X, pointProjArr[2].f19465Z);
        Fpx fpx2 = this.engine.fpx;
        long[][] jArr6 = pointProjArr[2].f19465Z;
        fpx2.fp2sqr_mont(jArr6, jArr6);
        this.engine.fpx.fpcopy(jArr2[0], 0, jArr2[1]);
        SIKEEngine sIKEEngine5 = this.engine;
        Fpx fpx3 = sIKEEngine5.fpx;
        long[] jArr7 = sIKEEngine5.params.Montgomery_one;
        long[] jArr8 = jArr2[0];
        fpx3.fpaddPRIME(jArr7, jArr8, jArr8);
        this.engine.fpx.fp2sqr_mont(jArr2, jArr2);
        this.engine.fpx.fp2mul_mont(jArr3, jArr2, pointProjArr[2].f19464X);
    }

    public void BuildOrdinary2nBasis_dual(long[][] jArr, long[][][][] jArr2, PointProjFull[] pointProjFullArr, byte[] bArr, byte[] bArr2) {
        int i3 = this.engine.params.NWORDS_FIELD;
        long[] jArr3 = new long[i3];
        long[][] jArr4 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 2, i3);
        PointProj[] pointProjArr = {new PointProj(this.engine.params.NWORDS_FIELD), new PointProj(this.engine.params.NWORDS_FIELD), new PointProj(this.engine.params.NWORDS_FIELD)};
        BuildEntangledXonly(jArr, pointProjArr, bArr, bArr2);
        SIKEEngine sIKEEngine = this.engine;
        sIKEEngine.fpx.fpcopy(sIKEEngine.params.Montgomery_one, 0, pointProjArr[0].f19465Z[0]);
        SIKEEngine sIKEEngine2 = this.engine;
        sIKEEngine2.fpx.fpcopy(sIKEEngine2.params.Montgomery_one, 0, pointProjArr[1].f19465Z[0]);
        int i10 = 0;
        while (true) {
            SIKEEngine sIKEEngine3 = this.engine;
            Internal internal = sIKEEngine3.params;
            int i11 = internal.MAX_Bob;
            if (i10 >= i11) {
                sIKEEngine3.fpx.fpcopy(internal.Montgomery_one, 0, jArr4[0]);
                Fpx fpx = this.engine.fpx;
                long[] jArr5 = jArr4[0];
                fpx.fpaddPRIME(jArr5, jArr5, jArr3);
                this.engine.fpx.fpaddPRIME(jArr3, jArr3, jArr4[0]);
                Fpx fpx2 = this.engine.fpx;
                long[] jArr6 = jArr4[0];
                fpx2.fpaddPRIME(jArr6, jArr3, jArr6);
                this.engine.isogeny.CompleteMPoint(jArr4, pointProjArr[0], pointProjFullArr[0]);
                RecoverY(jArr4, pointProjArr, pointProjFullArr);
                return;
            }
            sIKEEngine3.isogeny.eval_3_isog(pointProjArr[0], jArr2[(i11 - 1) - i10]);
            SIKEEngine sIKEEngine4 = this.engine;
            sIKEEngine4.isogeny.eval_3_isog(pointProjArr[1], jArr2[(sIKEEngine4.params.MAX_Bob - 1) - i10]);
            SIKEEngine sIKEEngine5 = this.engine;
            sIKEEngine5.isogeny.eval_3_isog(pointProjArr[2], jArr2[(sIKEEngine5.params.MAX_Bob - 1) - i10]);
            i10++;
        }
    }

    public void BuildOrdinary3nBasis_Decomp_dual(long[][] jArr, PointProj[] pointProjArr, int[] iArr, int[] iArr2, int i3) {
        int i10 = iArr2[i3];
        byte[] bArr = {(byte) (i10 & 1), (byte) ((i10 >>> 1) & 1)};
        iArr[0] = iArr[0] - 1;
        Elligator2(jArr, iArr, 0, pointProjArr[0].f19464X, bArr, 0, 1);
        iArr[1] = iArr[1] - 1;
        Elligator2(jArr, iArr, 1, pointProjArr[1].f19464X, bArr, 1, 1);
        BiQuad_affine(jArr, pointProjArr[0].f19464X, pointProjArr[1].f19464X, pointProjArr[2]);
    }

    public void BuildOrdinary3nBasis_dual(long[][] jArr, long[][][][] jArr2, PointProjFull[] pointProjFullArr, int[] iArr, int[] iArr2, int i3) {
        PointProj pointProj = new PointProj(this.engine.params.NWORDS_FIELD);
        long[][][] jArr3 = (long[][][]) Array.newInstance((Class<?>) Long.TYPE, 2, 2, this.engine.params.NWORDS_FIELD);
        byte[] bArr = new byte[1];
        byte[] bArr2 = new byte[1];
        FirstPoint3n(jArr, jArr2, jArr3[0], pointProjFullArr[0], iArr, bArr, bArr2);
        iArr2[i3] = bArr2[0];
        iArr[1] = iArr[0];
        SecondPoint3n(jArr, jArr2, jArr3[1], pointProjFullArr[1], iArr, bArr, bArr2);
        iArr2[i3] = iArr2[i3] | (bArr2[0] << 1);
        BiQuad_affine(jArr, jArr3[0], jArr3[1], pointProj);
        eval_full_dual_4_isog(jArr2, pointProj);
        makeDiff(pointProjFullArr[0], pointProjFullArr[1], pointProj);
    }

    public void Compress_PKA_dual(long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4, long[][] jArr5, int[] iArr, byte[] bArr) {
        long[][] jArr6;
        char c10;
        int i3;
        int i10;
        int i11;
        Internal internal = this.engine.params;
        int i12 = internal.NWORDS_ORDER;
        long[] jArr7 = new long[i12];
        long[] jArr8 = new long[i12];
        long[][] jArr9 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 2, internal.NWORDS_FIELD);
        this.engine.fpx.fp2add(jArr5, jArr5, jArr9);
        this.engine.fpx.fp2add(jArr9, jArr9, jArr9);
        SIKEEngine sIKEEngine = this.engine;
        Fpx fpx = sIKEEngine.fpx;
        long[] jArr10 = jArr9[0];
        fpx.fpsubPRIME(jArr10, sIKEEngine.params.Montgomery_one, jArr10);
        SIKEEngine sIKEEngine2 = this.engine;
        Fpx fpx2 = sIKEEngine2.fpx;
        long[] jArr11 = jArr9[0];
        fpx2.fpsubPRIME(jArr11, sIKEEngine2.params.Montgomery_one, jArr11);
        int mod3 = this.engine.fpx.mod3(jArr3);
        SIKEEngine sIKEEngine3 = this.engine;
        Fpx fpx3 = sIKEEngine3.fpx;
        Internal internal2 = sIKEEngine3.params;
        fpx3.to_Montgomery_mod_order(jArr2, jArr2, internal2.Bob_order, internal2.Montgomery_RB2, internal2.Montgomery_RB1);
        SIKEEngine sIKEEngine4 = this.engine;
        Fpx fpx4 = sIKEEngine4.fpx;
        Internal internal3 = sIKEEngine4.params;
        fpx4.to_Montgomery_mod_order(jArr4, jArr4, internal3.Bob_order, internal3.Montgomery_RB2, internal3.Montgomery_RB1);
        SIKEEngine sIKEEngine5 = this.engine;
        Fpx fpx5 = sIKEEngine5.fpx;
        Internal internal4 = sIKEEngine5.params;
        fpx5.to_Montgomery_mod_order(jArr, jArr, internal4.Bob_order, internal4.Montgomery_RB2, internal4.Montgomery_RB1);
        SIKEEngine sIKEEngine6 = this.engine;
        Fpx fpx6 = sIKEEngine6.fpx;
        Internal internal5 = sIKEEngine6.params;
        fpx6.to_Montgomery_mod_order(jArr3, jArr3, internal5.Bob_order, internal5.Montgomery_RB2, internal5.Montgomery_RB1);
        if (mod3 != 0) {
            SIKEEngine sIKEEngine7 = this.engine;
            Fpx fpx7 = sIKEEngine7.fpx;
            Internal internal6 = sIKEEngine7.params;
            fpx7.Montgomery_inversion_mod_order_bingcd(jArr3, jArr8, internal6.Bob_order, internal6.Montgomery_RB2, internal6.Montgomery_RB1);
            SIKEEngine sIKEEngine8 = this.engine;
            sIKEEngine8.fpx.Montgomery_neg(jArr, sIKEEngine8.params.Bob_order);
            SIKEEngine sIKEEngine9 = this.engine;
            Fpx fpx8 = sIKEEngine9.fpx;
            Internal internal7 = sIKEEngine9.params;
            i10 = 3;
            fpx8.Montgomery_multiply_mod_order(jArr, jArr8, jArr7, internal7.Bob_order, internal7.Montgomery_RB2);
            SIKEEngine sIKEEngine10 = this.engine;
            Fpx fpx9 = sIKEEngine10.fpx;
            Internal internal8 = sIKEEngine10.params;
            fpx9.from_Montgomery_mod_order(jArr7, jArr7, internal8.Bob_order, internal8.Montgomery_RB2);
            SIKEEngine sIKEEngine11 = this.engine;
            sIKEEngine11.fpx.encode_to_bytes(jArr7, bArr, 0, sIKEEngine11.params.ORDER_B_ENCODED_BYTES);
            SIKEEngine sIKEEngine12 = this.engine;
            sIKEEngine12.fpx.Montgomery_neg(jArr4, sIKEEngine12.params.Bob_order);
            SIKEEngine sIKEEngine13 = this.engine;
            Fpx fpx10 = sIKEEngine13.fpx;
            Internal internal9 = sIKEEngine13.params;
            fpx10.Montgomery_multiply_mod_order(jArr4, jArr8, jArr7, internal9.Bob_order, internal9.Montgomery_RB2);
            SIKEEngine sIKEEngine14 = this.engine;
            Fpx fpx11 = sIKEEngine14.fpx;
            Internal internal10 = sIKEEngine14.params;
            fpx11.from_Montgomery_mod_order(jArr7, jArr7, internal10.Bob_order, internal10.Montgomery_RB2);
            SIKEEngine sIKEEngine15 = this.engine;
            Fpx fpx12 = sIKEEngine15.fpx;
            int i13 = sIKEEngine15.params.ORDER_B_ENCODED_BYTES;
            fpx12.encode_to_bytes(jArr7, bArr, i13, i13);
            SIKEEngine sIKEEngine16 = this.engine;
            Fpx fpx13 = sIKEEngine16.fpx;
            Internal internal11 = sIKEEngine16.params;
            fpx13.Montgomery_multiply_mod_order(jArr2, jArr8, jArr7, internal11.Bob_order, internal11.Montgomery_RB2);
            SIKEEngine sIKEEngine17 = this.engine;
            Fpx fpx14 = sIKEEngine17.fpx;
            Internal internal12 = sIKEEngine17.params;
            fpx14.from_Montgomery_mod_order(jArr7, jArr7, internal12.Bob_order, internal12.Montgomery_RB2);
            SIKEEngine sIKEEngine18 = this.engine;
            Fpx fpx15 = sIKEEngine18.fpx;
            int i14 = sIKEEngine18.params.ORDER_B_ENCODED_BYTES;
            fpx15.encode_to_bytes(jArr7, bArr, i14 * 2, i14);
            Internal internal13 = this.engine.params;
            bArr[(internal13.ORDER_B_ENCODED_BYTES * 3) + internal13.FP2_ENCODED_BYTES] = 0;
            i11 = 1;
            jArr6 = jArr9;
            i3 = 2;
            c10 = 0;
        } else {
            SIKEEngine sIKEEngine19 = this.engine;
            Fpx fpx16 = sIKEEngine19.fpx;
            Internal internal14 = sIKEEngine19.params;
            fpx16.Montgomery_inversion_mod_order_bingcd(jArr, jArr8, internal14.Bob_order, internal14.Montgomery_RB2, internal14.Montgomery_RB1);
            SIKEEngine sIKEEngine20 = this.engine;
            sIKEEngine20.fpx.Montgomery_neg(jArr3, sIKEEngine20.params.Bob_order);
            SIKEEngine sIKEEngine21 = this.engine;
            Fpx fpx17 = sIKEEngine21.fpx;
            Internal internal15 = sIKEEngine21.params;
            jArr6 = jArr9;
            c10 = 0;
            fpx17.Montgomery_multiply_mod_order(jArr3, jArr8, jArr7, internal15.Bob_order, internal15.Montgomery_RB2);
            SIKEEngine sIKEEngine22 = this.engine;
            Fpx fpx18 = sIKEEngine22.fpx;
            Internal internal16 = sIKEEngine22.params;
            fpx18.from_Montgomery_mod_order(jArr7, jArr7, internal16.Bob_order, internal16.Montgomery_RB2);
            SIKEEngine sIKEEngine23 = this.engine;
            sIKEEngine23.fpx.encode_to_bytes(jArr7, bArr, 0, sIKEEngine23.params.ORDER_B_ENCODED_BYTES);
            SIKEEngine sIKEEngine24 = this.engine;
            i3 = 2;
            Fpx fpx19 = sIKEEngine24.fpx;
            Internal internal17 = sIKEEngine24.params;
            i10 = 3;
            i11 = 1;
            fpx19.Montgomery_multiply_mod_order(jArr4, jArr8, jArr7, internal17.Bob_order, internal17.Montgomery_RB2);
            SIKEEngine sIKEEngine25 = this.engine;
            Fpx fpx20 = sIKEEngine25.fpx;
            Internal internal18 = sIKEEngine25.params;
            fpx20.from_Montgomery_mod_order(jArr7, jArr7, internal18.Bob_order, internal18.Montgomery_RB2);
            SIKEEngine sIKEEngine26 = this.engine;
            Fpx fpx21 = sIKEEngine26.fpx;
            int i15 = sIKEEngine26.params.ORDER_B_ENCODED_BYTES;
            fpx21.encode_to_bytes(jArr7, bArr, i15, i15);
            SIKEEngine sIKEEngine27 = this.engine;
            sIKEEngine27.fpx.Montgomery_neg(jArr2, sIKEEngine27.params.Bob_order);
            SIKEEngine sIKEEngine28 = this.engine;
            Fpx fpx22 = sIKEEngine28.fpx;
            Internal internal19 = sIKEEngine28.params;
            fpx22.Montgomery_multiply_mod_order(jArr2, jArr8, jArr7, internal19.Bob_order, internal19.Montgomery_RB2);
            SIKEEngine sIKEEngine29 = this.engine;
            Fpx fpx23 = sIKEEngine29.fpx;
            Internal internal20 = sIKEEngine29.params;
            fpx23.from_Montgomery_mod_order(jArr7, jArr7, internal20.Bob_order, internal20.Montgomery_RB2);
            SIKEEngine sIKEEngine30 = this.engine;
            Fpx fpx24 = sIKEEngine30.fpx;
            int i16 = sIKEEngine30.params.ORDER_B_ENCODED_BYTES;
            fpx24.encode_to_bytes(jArr7, bArr, i16 * 2, i16);
            Internal internal21 = this.engine.params;
            bArr[(internal21.ORDER_B_ENCODED_BYTES * 3) + internal21.FP2_ENCODED_BYTES] = ByteCompanionObject.MIN_VALUE;
        }
        SIKEEngine sIKEEngine31 = this.engine;
        sIKEEngine31.fpx.fp2_encode(jArr6, bArr, sIKEEngine31.params.ORDER_B_ENCODED_BYTES * i10);
        Internal internal22 = this.engine.params;
        int i17 = internal22.ORDER_B_ENCODED_BYTES;
        int i18 = internal22.FP2_ENCODED_BYTES;
        int i19 = (i17 * 3) + i18;
        bArr[i19] = (byte) (bArr[i19] | ((byte) iArr[c10]));
        bArr[AbstractC1482f.c(i17, 3, i18, i11)] = (byte) iArr[i11];
        bArr[AbstractC1482f.c(i17, i10, i18, i3)] = (byte) iArr[i3];
    }

    public void Compress_PKB_dual(long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4, long[][] jArr5, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        SIKEEngine sIKEEngine = this.engine;
        int i3 = sIKEEngine.params.NWORDS_ORDER;
        long[] jArr6 = new long[i3 * 2];
        long[] jArr7 = new long[i3];
        long j = jArr3[0] & 1;
        Fpx fpx = sIKEEngine.fpx;
        if (j == 1) {
            fpx.inv_mod_orderA(jArr3, jArr7);
            SIKEEngine sIKEEngine2 = this.engine;
            sIKEEngine2.fpx.Montgomery_neg(jArr, sIKEEngine2.params.Alice_order);
            SIKEEngine sIKEEngine3 = this.engine;
            sIKEEngine3.fpx.multiply(jArr, jArr7, jArr6, sIKEEngine3.params.NWORDS_ORDER);
            SIKEEngine sIKEEngine4 = this.engine;
            sIKEEngine4.fpx.encode_to_bytes(jArr6, bArr3, 0, sIKEEngine4.params.ORDER_A_ENCODED_BYTES);
            SIKEEngine sIKEEngine5 = this.engine;
            Internal internal = sIKEEngine5.params;
            int i10 = internal.ORDER_A_ENCODED_BYTES - 1;
            bArr3[i10] = (byte) (bArr3[i10] & internal.MASK_ALICE);
            sIKEEngine5.fpx.Montgomery_neg(jArr4, internal.Alice_order);
            SIKEEngine sIKEEngine6 = this.engine;
            sIKEEngine6.fpx.multiply(jArr4, jArr7, jArr6, sIKEEngine6.params.NWORDS_ORDER);
            SIKEEngine sIKEEngine7 = this.engine;
            Fpx fpx2 = sIKEEngine7.fpx;
            int i11 = sIKEEngine7.params.ORDER_A_ENCODED_BYTES;
            fpx2.encode_to_bytes(jArr6, bArr3, i11, i11);
            SIKEEngine sIKEEngine8 = this.engine;
            Internal internal2 = sIKEEngine8.params;
            int i12 = (internal2.ORDER_A_ENCODED_BYTES * 2) - 1;
            bArr3[i12] = (byte) (bArr3[i12] & internal2.MASK_ALICE);
            sIKEEngine8.fpx.multiply(jArr2, jArr7, jArr6, internal2.NWORDS_ORDER);
            SIKEEngine sIKEEngine9 = this.engine;
            Fpx fpx3 = sIKEEngine9.fpx;
            int i13 = sIKEEngine9.params.ORDER_A_ENCODED_BYTES;
            fpx3.encode_to_bytes(jArr6, bArr3, i13 * 2, i13);
            Internal internal3 = this.engine.params;
            int i14 = internal3.ORDER_A_ENCODED_BYTES;
            int i15 = (i14 * 3) - 1;
            bArr3[i15] = (byte) (bArr3[i15] & internal3.MASK_ALICE);
            bArr3[(i14 * 3) + internal3.FP2_ENCODED_BYTES] = 0;
        } else {
            fpx.inv_mod_orderA(jArr, jArr7);
            SIKEEngine sIKEEngine10 = this.engine;
            sIKEEngine10.fpx.Montgomery_neg(jArr3, sIKEEngine10.params.Alice_order);
            SIKEEngine sIKEEngine11 = this.engine;
            sIKEEngine11.fpx.multiply(jArr3, jArr7, jArr6, sIKEEngine11.params.NWORDS_ORDER);
            SIKEEngine sIKEEngine12 = this.engine;
            sIKEEngine12.fpx.encode_to_bytes(jArr6, bArr3, 0, sIKEEngine12.params.ORDER_A_ENCODED_BYTES);
            SIKEEngine sIKEEngine13 = this.engine;
            Internal internal4 = sIKEEngine13.params;
            int i16 = internal4.ORDER_A_ENCODED_BYTES - 1;
            bArr3[i16] = (byte) (bArr3[i16] & internal4.MASK_ALICE);
            sIKEEngine13.fpx.multiply(jArr4, jArr7, jArr6, internal4.NWORDS_ORDER);
            SIKEEngine sIKEEngine14 = this.engine;
            Fpx fpx4 = sIKEEngine14.fpx;
            int i17 = sIKEEngine14.params.ORDER_A_ENCODED_BYTES;
            fpx4.encode_to_bytes(jArr6, bArr3, i17, i17);
            SIKEEngine sIKEEngine15 = this.engine;
            Internal internal5 = sIKEEngine15.params;
            int i18 = (internal5.ORDER_A_ENCODED_BYTES * 2) - 1;
            bArr3[i18] = (byte) (bArr3[i18] & internal5.MASK_ALICE);
            sIKEEngine15.fpx.Montgomery_neg(jArr2, internal5.Alice_order);
            SIKEEngine sIKEEngine16 = this.engine;
            sIKEEngine16.fpx.multiply(jArr2, jArr7, jArr6, sIKEEngine16.params.NWORDS_ORDER);
            SIKEEngine sIKEEngine17 = this.engine;
            Fpx fpx5 = sIKEEngine17.fpx;
            int i19 = sIKEEngine17.params.ORDER_A_ENCODED_BYTES;
            fpx5.encode_to_bytes(jArr6, bArr3, i19 * 2, i19);
            Internal internal6 = this.engine.params;
            int i20 = internal6.ORDER_A_ENCODED_BYTES;
            int i21 = (i20 * 3) - 1;
            bArr3[i21] = (byte) (bArr3[i21] & internal6.MASK_ALICE);
            bArr3[(i20 * 3) + internal6.FP2_ENCODED_BYTES] = ByteCompanionObject.MIN_VALUE;
        }
        SIKEEngine sIKEEngine18 = this.engine;
        sIKEEngine18.fpx.fp2_encode(jArr5, bArr3, sIKEEngine18.params.ORDER_A_ENCODED_BYTES * 3);
        Internal internal7 = this.engine.params;
        int i22 = internal7.ORDER_A_ENCODED_BYTES;
        int i23 = internal7.FP2_ENCODED_BYTES;
        int i24 = (i22 * 3) + i23;
        bArr3[i24] = (byte) (bArr3[i24] | bArr[0]);
        bArr3[AbstractC1482f.c(i22, 3, i23, 1)] = bArr2[0];
        bArr3[AbstractC1482f.c(i22, 3, i23, 2)] = 0;
    }

    public void Compress_PKB_dual_extended(long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4, long[][] jArr5, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        SIKEEngine sIKEEngine = this.engine;
        Internal internal = sIKEEngine.params;
        int i3 = internal.NWORDS_ORDER;
        long[] jArr6 = new long[i3 * 2];
        long[] jArr7 = new long[i3 * 2];
        long[] jArr8 = new long[i3 * 2];
        long j = (-1) >>> (internal.MAXBITS_ORDER - internal.OALICE_BITS);
        sIKEEngine.fpx.multiply(jArr2, jArr3, jArr6, i3);
        SIKEEngine sIKEEngine2 = this.engine;
        sIKEEngine2.fpx.multiply(jArr4, jArr, jArr7, sIKEEngine2.params.NWORDS_ORDER);
        SIKEEngine sIKEEngine3 = this.engine;
        sIKEEngine3.fpx.Montgomery_neg(jArr7, sIKEEngine3.params.Alice_order);
        SIKEEngine sIKEEngine4 = this.engine;
        sIKEEngine4.fpx.mp_add(jArr6, jArr7, jArr7, sIKEEngine4.params.NWORDS_ORDER);
        SIKEEngine sIKEEngine5 = this.engine;
        int i10 = sIKEEngine5.params.NWORDS_ORDER - 1;
        jArr7[i10] = jArr7[i10] & j;
        sIKEEngine5.fpx.inv_mod_orderA(jArr7, jArr8);
        SIKEEngine sIKEEngine6 = this.engine;
        sIKEEngine6.fpx.multiply(jArr3, jArr8, jArr6, sIKEEngine6.params.NWORDS_ORDER);
        SIKEEngine sIKEEngine7 = this.engine;
        Internal internal2 = sIKEEngine7.params;
        int i11 = internal2.NWORDS_ORDER - 1;
        jArr6[i11] = jArr6[i11] & j;
        sIKEEngine7.fpx.encode_to_bytes(jArr6, bArr3, 0, internal2.ORDER_A_ENCODED_BYTES);
        SIKEEngine sIKEEngine8 = this.engine;
        sIKEEngine8.fpx.Montgomery_neg(jArr, sIKEEngine8.params.Alice_order);
        SIKEEngine sIKEEngine9 = this.engine;
        sIKEEngine9.fpx.multiply(jArr, jArr8, jArr6, sIKEEngine9.params.NWORDS_ORDER);
        SIKEEngine sIKEEngine10 = this.engine;
        Internal internal3 = sIKEEngine10.params;
        int i12 = internal3.NWORDS_ORDER - 1;
        jArr6[i12] = jArr6[i12] & j;
        Fpx fpx = sIKEEngine10.fpx;
        int i13 = internal3.ORDER_A_ENCODED_BYTES;
        fpx.encode_to_bytes(jArr6, bArr3, i13, i13);
        SIKEEngine sIKEEngine11 = this.engine;
        sIKEEngine11.fpx.Montgomery_neg(jArr4, sIKEEngine11.params.Alice_order);
        SIKEEngine sIKEEngine12 = this.engine;
        sIKEEngine12.fpx.multiply(jArr4, jArr8, jArr6, sIKEEngine12.params.NWORDS_ORDER);
        SIKEEngine sIKEEngine13 = this.engine;
        Internal internal4 = sIKEEngine13.params;
        int i14 = internal4.NWORDS_ORDER - 1;
        jArr6[i14] = jArr6[i14] & j;
        Fpx fpx2 = sIKEEngine13.fpx;
        int i15 = internal4.ORDER_A_ENCODED_BYTES;
        fpx2.encode_to_bytes(jArr6, bArr3, i15 * 2, i15);
        SIKEEngine sIKEEngine14 = this.engine;
        sIKEEngine14.fpx.multiply(jArr2, jArr8, jArr6, sIKEEngine14.params.NWORDS_ORDER);
        SIKEEngine sIKEEngine15 = this.engine;
        Internal internal5 = sIKEEngine15.params;
        int i16 = internal5.NWORDS_ORDER - 1;
        jArr6[i16] = jArr6[i16] & j;
        Fpx fpx3 = sIKEEngine15.fpx;
        int i17 = internal5.ORDER_A_ENCODED_BYTES;
        fpx3.encode_to_bytes(jArr6, bArr3, i17 * 3, i17);
        SIKEEngine sIKEEngine16 = this.engine;
        sIKEEngine16.fpx.fp2_encode(jArr5, bArr3, sIKEEngine16.params.ORDER_A_ENCODED_BYTES * 4);
        Internal internal6 = this.engine.params;
        int i18 = internal6.ORDER_A_ENCODED_BYTES;
        int i19 = internal6.FP2_ENCODED_BYTES;
        bArr3[(i18 * 4) + i19] = bArr[0];
        bArr3[AbstractC1482f.c(i18, 4, i19, 1)] = bArr2[0];
    }

    public void Dlogs2_dual(long[][][] jArr, int[] iArr, long[] jArr2, long[] jArr3, long[] jArr4, long[] jArr5) {
        solve_dlog(jArr[0], iArr, jArr2, 2);
        solve_dlog(jArr[2], iArr, jArr3, 2);
        solve_dlog(jArr[1], iArr, jArr4, 2);
        solve_dlog(jArr[3], iArr, jArr5, 2);
        SIKEEngine sIKEEngine = this.engine;
        Fpx fpx = sIKEEngine.fpx;
        Internal internal = sIKEEngine.params;
        fpx.mp_sub(internal.Alice_order, jArr3, jArr3, internal.NWORDS_ORDER);
        SIKEEngine sIKEEngine2 = this.engine;
        Fpx fpx2 = sIKEEngine2.fpx;
        Internal internal2 = sIKEEngine2.params;
        fpx2.mp_sub(internal2.Alice_order, jArr5, jArr5, internal2.NWORDS_ORDER);
    }

    public void Dlogs3_dual(long[][][] jArr, int[] iArr, long[] jArr2, long[] jArr3, long[] jArr4, long[] jArr5) {
        solve_dlog(jArr[0], iArr, jArr2, 3);
        solve_dlog(jArr[2], iArr, jArr3, 3);
        solve_dlog(jArr[1], iArr, jArr4, 3);
        solve_dlog(jArr[3], iArr, jArr5, 3);
        SIKEEngine sIKEEngine = this.engine;
        Fpx fpx = sIKEEngine.fpx;
        Internal internal = sIKEEngine.params;
        fpx.mp_sub(internal.Bob_order, jArr3, jArr3, internal.NWORDS_ORDER);
        SIKEEngine sIKEEngine2 = this.engine;
        Fpx fpx2 = sIKEEngine2.fpx;
        Internal internal2 = sIKEEngine2.params;
        fpx2.mp_sub(internal2.Bob_order, jArr5, jArr5, internal2.NWORDS_ORDER);
    }

    public void Elligator2(long[][] jArr, int[] iArr, int i3, long[][] jArr2, byte[] bArr, int i10, int i11) {
        SIKEEngine sIKEEngine;
        int i12 = this.engine.params.NWORDS_FIELD;
        long[] jArr3 = new long[i12];
        long[] jArr4 = new long[i12];
        long[] jArr5 = new long[i12];
        long[] jArr6 = new long[i12];
        long[] jArr7 = new long[i12];
        long[] jArr8 = new long[i12];
        int[] iArr2 = {2, i12};
        int i13 = 0;
        Class cls = Long.TYPE;
        long[][] jArr9 = (long[][]) Array.newInstance((Class<?>) cls, iArr2);
        long[][] jArr10 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        SIKEEngine sIKEEngine2 = this.engine;
        sIKEEngine2.fpx.fpcopy(sIKEEngine2.params.Montgomery_one, 0, jArr3);
        this.engine.fpx.fp2add(jArr, jArr, jArr9);
        Fpx fpx = this.engine.fpx;
        long[] jArr11 = jArr9[0];
        fpx.fpsubPRIME(jArr11, jArr3, jArr11);
        this.engine.fpx.fp2add(jArr9, jArr9, jArr9);
        int i14 = iArr[i3];
        SIKEEngine sIKEEngine3 = this.engine;
        sIKEEngine3.fpx.fp2mul_mont(jArr9, sIKEEngine3.params.v_3_torsion[i14], jArr2);
        this.engine.fpx.fp2neg(jArr2);
        if (i11 != 0) {
            if (bArr[i10] == 1) {
                this.engine.fpx.fp2neg(jArr2);
                this.engine.fpx.fp2sub(jArr2, jArr9, jArr2);
                return;
            }
            return;
        }
        this.engine.fpx.fp2add(jArr9, jArr2, jArr10);
        this.engine.fpx.fp2mul_mont(jArr10, jArr2, jArr10);
        Fpx fpx2 = this.engine.fpx;
        long[] jArr12 = jArr10[0];
        fpx2.fpaddPRIME(jArr12, jArr3, jArr12);
        this.engine.fpx.fp2mul_mont(jArr2, jArr10, jArr10);
        this.engine.fpx.fpsqr_mont(jArr10[0], jArr4);
        this.engine.fpx.fpsqr_mont(jArr10[1], jArr5);
        this.engine.fpx.fpaddPRIME(jArr4, jArr5, jArr6);
        this.engine.fpx.fpcopy(jArr6, 0, jArr7);
        int i15 = 0;
        while (true) {
            SIKEEngine sIKEEngine4 = this.engine;
            if (i15 >= sIKEEngine4.params.OALICE_BITS - 2) {
                break;
            }
            sIKEEngine4.fpx.fpsqr_mont(jArr7, jArr7);
            i15++;
        }
        while (true) {
            sIKEEngine = this.engine;
            if (i13 >= sIKEEngine.params.OBOB_EXPON) {
                break;
            }
            sIKEEngine.fpx.fpsqr_mont(jArr7, jArr8);
            this.engine.fpx.fpmul_mont(jArr7, jArr8, jArr7);
            i13++;
        }
        sIKEEngine.fpx.fpsqr_mont(jArr7, jArr8);
        this.engine.fpx.fpcorrectionPRIME(jArr8);
        this.engine.fpx.fpcorrectionPRIME(jArr6);
        if (Fpx.subarrayEquals(jArr8, jArr6, this.engine.params.NWORDS_FIELD)) {
            return;
        }
        this.engine.fpx.fp2neg(jArr2);
        this.engine.fpx.fp2sub(jArr2, jArr9, jArr2);
        if (i11 == 0) {
            bArr[i10] = 1;
        }
    }

    public int EphemeralKeyGeneration_A_extended(byte[] bArr, byte[] bArr2) {
        int[] iArr = new int[3];
        Internal internal = this.engine.params;
        int[] iArr2 = new int[internal.DLEN_3];
        int[] iArr3 = {2, internal.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr = (long[][]) Array.newInstance((Class<?>) cls, iArr3);
        Internal internal2 = this.engine.params;
        long[][][][] jArr2 = (long[][][][]) Array.newInstance((Class<?>) cls, internal2.MAX_Alice + 1, 5, 2, internal2.NWORDS_FIELD);
        long[][][] jArr3 = (long[][][]) Array.newInstance((Class<?>) cls, 4, 2, this.engine.params.NWORDS_FIELD);
        Internal internal3 = this.engine.params;
        int i3 = internal3.NWORDS_ORDER;
        long[] jArr4 = new long[i3];
        long[] jArr5 = new long[i3];
        long[] jArr6 = new long[i3];
        long[] jArr7 = new long[i3];
        PointProjFull[] pointProjFullArr = {new PointProjFull(internal3.NWORDS_FIELD), new PointProjFull(this.engine.params.NWORDS_FIELD)};
        FullIsogeny_A_dual(bArr, jArr2, jArr, 1);
        BuildOrdinary3nBasis_dual(jArr, jArr2, pointProjFullArr, iArr, iArr, 2);
        Tate3_pairings(pointProjFullArr, jArr3);
        Dlogs3_dual(jArr3, iArr2, jArr5, jArr4, jArr7, jArr6);
        Compress_PKA_dual(jArr5, jArr4, jArr7, jArr6, jArr, iArr, bArr2);
        return 0;
    }

    public int EphemeralKeyGeneration_B(byte[] bArr, byte[] bArr2) {
        return EphemeralKeyGeneration_B_extended(bArr, bArr2, 0);
    }

    public int EphemeralKeyGeneration_B_extended(byte[] bArr, byte[] bArr2, int i3) {
        byte[] bArr3 = new byte[1];
        byte[] bArr4 = new byte[1];
        Internal internal = this.engine.params;
        int[] iArr = new int[internal.DLEN_2];
        int i10 = internal.NWORDS_ORDER;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        long[] jArr3 = new long[i10];
        long[] jArr4 = new long[i10];
        int[] iArr2 = {internal.MAX_Bob, 2, 2, internal.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][][][] jArr5 = (long[][][][]) Array.newInstance((Class<?>) cls, iArr2);
        long[][][] jArr6 = (long[][][]) Array.newInstance((Class<?>) cls, 4, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr7 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        PointProjFull[] pointProjFullArr = {new PointProjFull(this.engine.params.NWORDS_FIELD), new PointProjFull(this.engine.params.NWORDS_FIELD)};
        PointProj pointProj = new PointProj(this.engine.params.NWORDS_FIELD);
        PointProj pointProj2 = new PointProj(this.engine.params.NWORDS_FIELD);
        FullIsogeny_B_dual(bArr, jArr5, jArr7);
        BuildOrdinary2nBasis_dual(jArr7, jArr5, pointProjFullArr, bArr3, bArr4);
        SIKEEngine sIKEEngine = this.engine;
        Fpx fpx = sIKEEngine.fpx;
        long[] jArr8 = sIKEEngine.params.Montgomery_one;
        long[] jArr9 = pointProjFullArr[0].f19466X[0];
        fpx.fpaddPRIME(jArr8, jArr9, jArr9);
        SIKEEngine sIKEEngine2 = this.engine;
        Fpx fpx2 = sIKEEngine2.fpx;
        long[] jArr10 = sIKEEngine2.params.Montgomery_one;
        long[] jArr11 = pointProjFullArr[0].f19466X[0];
        fpx2.fpaddPRIME(jArr10, jArr11, jArr11);
        SIKEEngine sIKEEngine3 = this.engine;
        Fpx fpx3 = sIKEEngine3.fpx;
        long[] jArr12 = sIKEEngine3.params.Montgomery_one;
        long[] jArr13 = pointProjFullArr[1].f19466X[0];
        fpx3.fpaddPRIME(jArr12, jArr13, jArr13);
        SIKEEngine sIKEEngine4 = this.engine;
        Fpx fpx4 = sIKEEngine4.fpx;
        long[] jArr14 = sIKEEngine4.params.Montgomery_one;
        long[] jArr15 = pointProjFullArr[1].f19466X[0];
        fpx4.fpaddPRIME(jArr14, jArr15, jArr15);
        SIKEEngine sIKEEngine5 = this.engine;
        Fpx fpx5 = sIKEEngine5.fpx;
        Internal internal2 = sIKEEngine5.params;
        long[] jArr16 = internal2.A_basis_zero;
        int i11 = internal2.NWORDS_FIELD;
        fpx5.fpcopy(jArr16, 0, pointProj.f19464X[0]);
        SIKEEngine sIKEEngine6 = this.engine;
        Fpx fpx6 = sIKEEngine6.fpx;
        Internal internal3 = sIKEEngine6.params;
        fpx6.fpcopy(internal3.A_basis_zero, internal3.NWORDS_FIELD, pointProj.f19464X[1]);
        SIKEEngine sIKEEngine7 = this.engine;
        Fpx fpx7 = sIKEEngine7.fpx;
        Internal internal4 = sIKEEngine7.params;
        fpx7.fpcopy(internal4.A_basis_zero, internal4.NWORDS_FIELD * 2, pointProj.f19465Z[0]);
        SIKEEngine sIKEEngine8 = this.engine;
        Fpx fpx8 = sIKEEngine8.fpx;
        Internal internal5 = sIKEEngine8.params;
        fpx8.fpcopy(internal5.A_basis_zero, internal5.NWORDS_FIELD * 3, pointProj.f19465Z[1]);
        SIKEEngine sIKEEngine9 = this.engine;
        Fpx fpx9 = sIKEEngine9.fpx;
        Internal internal6 = sIKEEngine9.params;
        fpx9.fpcopy(internal6.A_basis_zero, internal6.NWORDS_FIELD * 4, pointProj2.f19464X[0]);
        SIKEEngine sIKEEngine10 = this.engine;
        Fpx fpx10 = sIKEEngine10.fpx;
        Internal internal7 = sIKEEngine10.params;
        fpx10.fpcopy(internal7.A_basis_zero, internal7.NWORDS_FIELD * 5, pointProj2.f19464X[1]);
        SIKEEngine sIKEEngine11 = this.engine;
        Fpx fpx11 = sIKEEngine11.fpx;
        Internal internal8 = sIKEEngine11.params;
        fpx11.fpcopy(internal8.A_basis_zero, internal8.NWORDS_FIELD * 6, pointProj2.f19465Z[0]);
        SIKEEngine sIKEEngine12 = this.engine;
        Fpx fpx12 = sIKEEngine12.fpx;
        Internal internal9 = sIKEEngine12.params;
        fpx12.fpcopy(internal9.A_basis_zero, internal9.NWORDS_FIELD * 7, pointProj2.f19465Z[1]);
        Tate2_pairings(pointProj, pointProj2, pointProjFullArr, jArr6);
        this.engine.fpx.fp2correction(jArr6[0]);
        this.engine.fpx.fp2correction(jArr6[1]);
        this.engine.fpx.fp2correction(jArr6[2]);
        this.engine.fpx.fp2correction(jArr6[3]);
        Dlogs2_dual(jArr6, iArr, jArr2, jArr, jArr4, jArr3);
        if (i3 == 1) {
            Compress_PKB_dual_extended(jArr2, jArr, jArr4, jArr3, jArr7, bArr3, bArr4, bArr2);
        } else {
            Compress_PKB_dual(jArr2, jArr, jArr4, jArr3, jArr7, bArr3, bArr4, bArr2);
        }
        return 0;
    }

    public int EphemeralSecretAgreement_A(byte[] bArr, int i3, byte[] bArr2, byte[] bArr3) {
        return EphemeralSecretAgreement_A_extended(bArr, i3, bArr2, bArr3, 0);
    }

    public int EphemeralSecretAgreement_A_extended(byte[] bArr, int i3, byte[] bArr2, byte[] bArr3, int i10) {
        int i11;
        PointProj pointProj;
        long[][][] jArr;
        long[][] jArr2;
        long[][] jArr3;
        long[][] jArr4;
        long[][] jArr5;
        PointProj[] pointProjArr;
        SIKEEngine sIKEEngine;
        SIDH_Compressed sIDH_Compressed = this;
        Internal internal = sIDH_Compressed.engine.params;
        int[] iArr = new int[internal.MAX_INT_POINTS_ALICE];
        int i12 = 1;
        int[] iArr2 = {2, internal.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr6 = (long[][]) Array.newInstance((Class<?>) cls, iArr2);
        long[][] jArr7 = (long[][]) Array.newInstance((Class<?>) cls, 2, sIDH_Compressed.engine.params.NWORDS_FIELD);
        PointProj pointProj2 = new PointProj(sIDH_Compressed.engine.params.NWORDS_FIELD);
        Internal internal2 = sIDH_Compressed.engine.params;
        PointProj[] pointProjArr2 = new PointProj[internal2.MAX_INT_POINTS_ALICE];
        long[][] jArr8 = (long[][]) Array.newInstance((Class<?>) cls, 2, internal2.NWORDS_FIELD);
        long[][] jArr9 = (long[][]) Array.newInstance((Class<?>) cls, 2, sIDH_Compressed.engine.params.NWORDS_FIELD);
        long[][] jArr10 = (long[][]) Array.newInstance((Class<?>) cls, 2, sIDH_Compressed.engine.params.NWORDS_FIELD);
        long[][][] jArr11 = (long[][][]) Array.newInstance((Class<?>) cls, 5, 2, sIDH_Compressed.engine.params.NWORDS_FIELD);
        if (i10 == 1) {
            i11 = 0;
            pointProj = pointProj2;
            jArr = jArr11;
            jArr2 = jArr8;
            jArr3 = jArr9;
            sIDH_Compressed.PKBDecompression_extended(bArr, i3, bArr2, pointProj, jArr10, bArr3, sIDH_Compressed.engine.params.FP2_ENCODED_BYTES);
            sIDH_Compressed = this;
        } else {
            i11 = 0;
            pointProj = pointProj2;
            jArr = jArr11;
            jArr2 = jArr8;
            jArr3 = jArr9;
            sIDH_Compressed.PKBDecompression(bArr, i3, bArr2, pointProj, jArr10);
        }
        sIDH_Compressed.engine.fpx.fp2copy(jArr10, jArr3);
        SIKEEngine sIKEEngine2 = sIDH_Compressed.engine;
        Fpx fpx = sIKEEngine2.fpx;
        long[] jArr12 = sIKEEngine2.params.Montgomery_one;
        fpx.fpaddPRIME(jArr12, jArr12, jArr7[i11]);
        sIDH_Compressed.engine.fpx.fp2add(jArr3, jArr7, jArr6);
        Fpx fpx2 = sIDH_Compressed.engine.fpx;
        long[] jArr13 = jArr7[i11];
        fpx2.fpaddPRIME(jArr13, jArr13, jArr13);
        Internal internal3 = sIDH_Compressed.engine.params;
        if (internal3.OALICE_BITS % 2 == 1) {
            pointProjArr = pointProjArr2;
            PointProj pointProj3 = new PointProj(internal3.NWORDS_FIELD);
            SIKEEngine sIKEEngine3 = sIDH_Compressed.engine;
            Isogeny isogeny = sIKEEngine3.isogeny;
            int i13 = sIKEEngine3.params.OALICE_BITS - 1;
            jArr5 = jArr2;
            isogeny.xDBLe(pointProj, pointProj3, jArr6, jArr7, i13);
            jArr4 = jArr7;
            sIDH_Compressed.engine.isogeny.get_2_isog(pointProj3, jArr6, jArr4);
            sIDH_Compressed.engine.isogeny.eval_2_isog(pointProj, pointProj3);
        } else {
            jArr4 = jArr7;
            jArr5 = jArr2;
            pointProjArr = pointProjArr2;
        }
        int i14 = i11;
        int i15 = i14;
        int i16 = i15;
        while (true) {
            SIKEEngine sIKEEngine4 = sIDH_Compressed.engine;
            if (i12 >= sIKEEngine4.params.MAX_Alice) {
                sIKEEngine4.isogeny.get_4_isog(pointProj, jArr6, jArr4, jArr);
                sIDH_Compressed.engine.fpx.fp2add(jArr6, jArr6, jArr6);
                sIDH_Compressed.engine.fpx.fp2sub(jArr6, jArr4, jArr6);
                sIDH_Compressed.engine.fpx.fp2add(jArr6, jArr6, jArr6);
                sIDH_Compressed.engine.isogeny.j_inv(jArr6, jArr4, jArr5);
                int i17 = i11;
                sIDH_Compressed.engine.fpx.fp2_encode(jArr5, bArr3, i17);
                return i17;
            }
            while (true) {
                sIKEEngine = sIDH_Compressed.engine;
                Internal internal4 = sIKEEngine.params;
                if (i15 >= internal4.MAX_Alice - i12) {
                    break;
                }
                PointProj pointProj4 = new PointProj(internal4.NWORDS_FIELD);
                pointProjArr[i16] = pointProj4;
                sIDH_Compressed.engine.fpx.fp2copy(pointProj.f19464X, pointProj4.f19464X);
                sIDH_Compressed.engine.fpx.fp2copy(pointProj.f19465Z, pointProjArr[i16].f19465Z);
                int i18 = i16 + 1;
                iArr[i16] = i15;
                SIKEEngine sIKEEngine5 = sIDH_Compressed.engine;
                int i19 = i14 + 1;
                int i20 = sIKEEngine5.params.strat_Alice[i14];
                sIKEEngine5.isogeny.xDBLe(pointProj, pointProj, jArr6, jArr4, i20 * 2);
                i15 += i20;
                i16 = i18;
                i14 = i19;
            }
            sIKEEngine.isogeny.get_4_isog(pointProj, jArr6, jArr4, jArr);
            for (int i21 = i11; i21 < i16; i21++) {
                sIDH_Compressed.engine.isogeny.eval_4_isog(pointProjArr[i21], jArr);
            }
            int i22 = i16 - 1;
            sIDH_Compressed.engine.fpx.fp2copy(pointProjArr[i22].f19464X, pointProj.f19464X);
            sIDH_Compressed.engine.fpx.fp2copy(pointProjArr[i22].f19465Z, pointProj.f19465Z);
            i15 = iArr[i22];
            i16--;
            i12++;
        }
    }

    public int EphemeralSecretAgreement_B(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        SIKEEngine sIKEEngine;
        Internal internal = this.engine.params;
        int[] iArr = new int[internal.MAX_INT_POINTS_BOB];
        int i3 = 1;
        int[] iArr2 = {2, internal.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr = (long[][]) Array.newInstance((Class<?>) cls, iArr2);
        long[][] jArr2 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        PointProj pointProj = new PointProj(this.engine.params.NWORDS_FIELD);
        Internal internal2 = this.engine.params;
        PointProj[] pointProjArr = new PointProj[internal2.MAX_INT_POINTS_BOB];
        long[][] jArr3 = (long[][]) Array.newInstance((Class<?>) cls, 2, internal2.NWORDS_FIELD);
        long[][] jArr4 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][][] jArr5 = (long[][][]) Array.newInstance((Class<?>) cls, 3, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr6 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        PKADecompression_dual(bArr, bArr2, pointProj, jArr6);
        this.engine.fpx.fp2copy(jArr6, jArr4);
        SIKEEngine sIKEEngine2 = this.engine;
        Fpx fpx = sIKEEngine2.fpx;
        long[] jArr7 = sIKEEngine2.params.Montgomery_one;
        fpx.fpaddPRIME(jArr7, jArr7, jArr2[0]);
        this.engine.fpx.fp2add(jArr4, jArr2, jArr);
        this.engine.fpx.fp2sub(jArr4, jArr2, jArr2);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            SIKEEngine sIKEEngine3 = this.engine;
            if (i3 >= sIKEEngine3.params.MAX_Bob) {
                sIKEEngine3.isogeny.get_3_isog(pointProj, jArr2, jArr, jArr5);
                this.engine.fpx.fp2add(jArr, jArr2, jArr4);
                this.engine.fpx.fp2add(jArr4, jArr4, jArr4);
                this.engine.fpx.fp2sub(jArr, jArr2, jArr);
                this.engine.isogeny.j_inv(jArr4, jArr, jArr3);
                this.engine.fpx.fp2_encode(jArr3, bArr3, 0);
                return 0;
            }
            while (true) {
                sIKEEngine = this.engine;
                Internal internal3 = sIKEEngine.params;
                if (i11 >= internal3.MAX_Bob - i3) {
                    break;
                }
                PointProj pointProj2 = new PointProj(internal3.NWORDS_FIELD);
                pointProjArr[i12] = pointProj2;
                this.engine.fpx.fp2copy(pointProj.f19464X, pointProj2.f19464X);
                this.engine.fpx.fp2copy(pointProj.f19465Z, pointProjArr[i12].f19465Z);
                int i13 = i12 + 1;
                iArr[i12] = i11;
                SIKEEngine sIKEEngine4 = this.engine;
                int i14 = sIKEEngine4.params.strat_Bob[i10];
                sIKEEngine4.isogeny.xTPLe(pointProj, pointProj, jArr2, jArr, i14);
                i11 += i14;
                i12 = i13;
                i10++;
            }
            sIKEEngine.isogeny.get_3_isog(pointProj, jArr2, jArr, jArr5);
            for (int i15 = 0; i15 < i12; i15++) {
                this.engine.isogeny.eval_3_isog(pointProjArr[i15], jArr5);
            }
            int i16 = i12 - 1;
            this.engine.fpx.fp2copy(pointProjArr[i16].f19464X, pointProj.f19464X);
            this.engine.fpx.fp2copy(pointProjArr[i16].f19465Z, pointProj.f19465Z);
            i11 = iArr[i16];
            i12--;
            i3++;
        }
    }

    public void FinalExpo3(long[][] jArr, long[][] jArr2) {
        int i3 = 0;
        long[][] jArr3 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 2, this.engine.params.NWORDS_FIELD);
        this.engine.fpx.fp2copy(jArr2, jArr3);
        this.engine.fpx.fpnegPRIME(jArr3[1]);
        this.engine.fpx.fp2mul_mont(jArr, jArr3, jArr3);
        this.engine.fpx.fp2inv_mont_bingcd(jArr3);
        this.engine.fpx.fpnegPRIME(jArr[1]);
        this.engine.fpx.fp2mul_mont(jArr, jArr2, jArr);
        this.engine.fpx.fp2mul_mont(jArr, jArr3, jArr);
        int i10 = 0;
        while (true) {
            SIKEEngine sIKEEngine = this.engine;
            if (i10 >= sIKEEngine.params.OALICE_BITS) {
                break;
            }
            sIKEEngine.fpx.fp2sqr_mont(jArr, jArr);
            i10++;
        }
        while (true) {
            SIKEEngine sIKEEngine2 = this.engine;
            Internal internal = sIKEEngine2.params;
            if (i3 >= internal.OBOB_EXPON - 1) {
                return;
            }
            sIKEEngine2.fpx.cube_Fp2_cycl(jArr, internal.Montgomery_one);
            i3++;
        }
    }

    public void FinalExpo3_2way(long[][][] jArr, long[][][] jArr2) {
        int[] iArr = {2, 2, this.engine.params.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][][] jArr3 = (long[][][]) Array.newInstance((Class<?>) cls, iArr);
        long[][][] jArr4 = (long[][][]) Array.newInstance((Class<?>) cls, 2, 2, this.engine.params.NWORDS_FIELD);
        for (int i3 = 0; i3 < 2; i3++) {
            this.engine.fpx.fp2copy(jArr2[i3], jArr3[i3]);
            this.engine.fpx.fpnegPRIME(jArr3[i3][1]);
            Fpx fpx = this.engine.fpx;
            long[][] jArr5 = jArr[i3];
            long[][] jArr6 = jArr3[i3];
            fpx.fp2mul_mont(jArr5, jArr6, jArr6);
        }
        this.engine.fpx.mont_n_way_inv(jArr3, 2, jArr4);
        for (int i10 = 0; i10 < 2; i10++) {
            this.engine.fpx.fpnegPRIME(jArr[i10][1]);
            Fpx fpx2 = this.engine.fpx;
            long[][] jArr7 = jArr[i10];
            fpx2.fp2mul_mont(jArr7, jArr2[i10], jArr7);
            Fpx fpx3 = this.engine.fpx;
            long[][] jArr8 = jArr[i10];
            fpx3.fp2mul_mont(jArr8, jArr4[i10], jArr8);
            int i11 = 0;
            while (true) {
                SIKEEngine sIKEEngine = this.engine;
                if (i11 >= sIKEEngine.params.OALICE_BITS) {
                    break;
                }
                Fpx fpx4 = sIKEEngine.fpx;
                long[][] jArr9 = jArr[i10];
                fpx4.fp2sqr_mont(jArr9, jArr9);
                i11++;
            }
            int i12 = 0;
            while (true) {
                SIKEEngine sIKEEngine2 = this.engine;
                Internal internal = sIKEEngine2.params;
                if (i12 < internal.OBOB_EXPON - 1) {
                    sIKEEngine2.fpx.cube_Fp2_cycl(jArr[i10], internal.Montgomery_one);
                    i12++;
                }
            }
        }
    }

    public void FirstPoint3n(long[][] jArr, long[][][][] jArr2, long[][] jArr3, PointProjFull pointProjFull, int[] iArr, byte[] bArr, byte[] bArr2) {
        PointProj pointProj = new PointProj(this.engine.params.NWORDS_FIELD);
        long[] jArr4 = new long[this.engine.params.NWORDS_FIELD];
        iArr[0] = 0;
        boolean z2 = false;
        while (!z2) {
            bArr2[0] = 0;
            Elligator2(jArr, iArr, 0, jArr3, bArr2, 0, 0);
            this.engine.fpx.fp2copy(jArr3, pointProj.f19464X);
            SIKEEngine sIKEEngine = this.engine;
            sIKEEngine.fpx.fpcopy(sIKEEngine.params.Montgomery_one, 0, pointProj.f19465Z[0]);
            this.engine.fpx.fpcopy(jArr4, 0, pointProj.f19465Z[1]);
            eval_full_dual_4_isog(jArr2, pointProj);
            boolean FirstPoint_dual = FirstPoint_dual(pointProj, pointProjFull, bArr);
            iArr[0] = iArr[0] + 1;
            z2 = FirstPoint_dual;
        }
    }

    public void FormatPrivKey_B(byte[] bArr) {
        SIKEEngine sIKEEngine = this.engine;
        Internal internal = sIKEEngine.params;
        int i3 = internal.SECRETKEY_B_BYTES;
        int i10 = i3 - 2;
        bArr[i10] = (byte) (bArr[i10] & internal.MASK3_BOB);
        int i11 = i3 - 1;
        bArr[i11] = (byte) (internal.MASK2_BOB & bArr[i11]);
        sIKEEngine.fpx.mul3(bArr);
    }

    public void FullIsogeny_A_dual(byte[] bArr, long[][][][] jArr, long[][] jArr2, int i3) {
        long[][] jArr3;
        long[][] jArr4;
        SIKEEngine sIKEEngine;
        PointProj pointProj = new PointProj(this.engine.params.NWORDS_FIELD);
        Internal internal = this.engine.params;
        PointProj[] pointProjArr = new PointProj[internal.MAX_INT_POINTS_ALICE];
        int[] iArr = {2, internal.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr5 = (long[][]) Array.newInstance((Class<?>) cls, iArr);
        long[][] jArr6 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr7 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr8 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr9 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr10 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][][] jArr11 = (long[][][]) Array.newInstance((Class<?>) cls, 5, 2, this.engine.params.NWORDS_FIELD);
        Internal internal2 = this.engine.params;
        int[] iArr2 = new int[internal2.MAX_INT_POINTS_ALICE];
        long[] jArr12 = new long[internal2.NWORDS_ORDER];
        init_basis(internal2.A_gen, jArr5, jArr6, jArr7);
        SIKEEngine sIKEEngine2 = this.engine;
        sIKEEngine2.fpx.fpcopy(sIKEEngine2.params.Montgomery_one, 0, jArr8[0]);
        this.engine.fpx.fp2add(jArr8, jArr8, jArr8);
        this.engine.fpx.fp2add(jArr8, jArr8, jArr9);
        this.engine.fpx.fp2add(jArr8, jArr9, jArr10);
        this.engine.fpx.fp2add(jArr9, jArr9, jArr8);
        SIKEEngine sIKEEngine3 = this.engine;
        Fpx fpx = sIKEEngine3.fpx;
        Internal internal3 = sIKEEngine3.params;
        fpx.decode_to_digits(bArr, internal3.MSG_BYTES, jArr12, internal3.SECRETKEY_A_BYTES, internal3.NWORDS_ORDER);
        SIKEEngine sIKEEngine4 = this.engine;
        sIKEEngine4.isogeny.LADDER3PT(jArr5, jArr6, jArr7, jArr12, sIKEEngine4.params.ALICE, pointProj, jArr10);
        PointProj pointProj2 = pointProj;
        this.engine.fpx.fp2inv_mont(pointProj2.f19465Z);
        Fpx fpx2 = this.engine.fpx;
        long[][] jArr13 = pointProj2.f19464X;
        fpx2.fp2mul_mont(jArr13, pointProj2.f19465Z, jArr13);
        SIKEEngine sIKEEngine5 = this.engine;
        sIKEEngine5.fpx.fpcopy(sIKEEngine5.params.Montgomery_one, 0, pointProj2.f19465Z[0]);
        this.engine.fpx.fpzero(pointProj2.f19465Z[1]);
        if (i3 == 1) {
            SIKEEngine sIKEEngine6 = this.engine;
            Fpx fpx3 = sIKEEngine6.fpx;
            long[][] jArr14 = pointProj2.f19464X;
            Internal internal4 = sIKEEngine6.params;
            fpx3.fp2_encode(jArr14, bArr, internal4.MSG_BYTES + internal4.SECRETKEY_A_BYTES + internal4.CRYPTO_PUBLICKEYBYTES);
        }
        Internal internal5 = this.engine.params;
        if (internal5.OALICE_BITS % 2 == 1) {
            PointProj pointProj3 = new PointProj(internal5.NWORDS_FIELD);
            jArr3 = jArr8;
            jArr4 = jArr9;
            this.engine.isogeny.xDBLe(pointProj2, pointProj3, jArr3, jArr4, r1.params.OALICE_BITS - 1);
            this.engine.isogeny.get_2_isog(pointProj3, jArr3, jArr4);
            this.engine.isogeny.eval_2_isog(pointProj2, pointProj3);
            SIKEEngine sIKEEngine7 = this.engine;
            sIKEEngine7.fpx.fp2copy(pointProj3.f19464X, jArr[sIKEEngine7.params.MAX_Alice][2]);
            SIKEEngine sIKEEngine8 = this.engine;
            sIKEEngine8.fpx.fp2copy(pointProj3.f19465Z, jArr[sIKEEngine8.params.MAX_Alice][3]);
        } else {
            jArr3 = jArr8;
            jArr4 = jArr9;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (true) {
            SIKEEngine sIKEEngine9 = this.engine;
            int i14 = sIKEEngine9.params.MAX_Alice;
            if (i13 >= i14) {
                long[][] jArr15 = jArr3;
                long[][] jArr16 = jArr4;
                sIKEEngine9.fpx.fp2copy(jArr15, jArr[i14 - 1][0]);
                this.engine.fpx.fp2copy(jArr16, jArr[r1.params.MAX_Alice - 1][1]);
                get_4_isog_dual(pointProj2, jArr15, jArr16, jArr11);
                eval_dual_4_isog_shared(jArr11[2], jArr11[3], jArr11[4], jArr[this.engine.params.MAX_Alice - 1], 2);
                SIKEEngine sIKEEngine10 = this.engine;
                sIKEEngine10.fpx.fp2copy(jArr15, jArr[sIKEEngine10.params.MAX_Alice][0]);
                SIKEEngine sIKEEngine11 = this.engine;
                sIKEEngine11.fpx.fp2copy(jArr16, jArr[sIKEEngine11.params.MAX_Alice][1]);
                this.engine.fpx.fp2inv_mont_bingcd(jArr16);
                this.engine.fpx.fp2mul_mont(jArr15, jArr16, jArr2);
                return;
            }
            int i15 = i10;
            int i16 = i12;
            int i17 = i11;
            while (true) {
                sIKEEngine = this.engine;
                Internal internal6 = sIKEEngine.params;
                if (i15 >= internal6.MAX_Alice - i13) {
                    break;
                }
                PointProj pointProj4 = new PointProj(internal6.NWORDS_FIELD);
                pointProjArr[i17] = pointProj4;
                this.engine.fpx.fp2copy(pointProj2.f19464X, pointProj4.f19464X);
                this.engine.fpx.fp2copy(pointProj2.f19465Z, pointProjArr[i17].f19465Z);
                iArr2[i17] = i15;
                SIKEEngine sIKEEngine12 = this.engine;
                int i18 = i16 + 1;
                int i19 = sIKEEngine12.params.strat_Alice[i16];
                sIKEEngine12.isogeny.xDBLe(pointProj2, pointProj2, jArr3, jArr4, i19 * 2);
                i15 += i19;
                i17++;
                i16 = i18;
                jArr3 = jArr3;
            }
            long[][] jArr17 = jArr3;
            long[][] jArr18 = jArr4;
            int i20 = i13 - 1;
            sIKEEngine.fpx.fp2copy(jArr17, jArr[i20][0]);
            this.engine.fpx.fp2copy(jArr18, jArr[i20][1]);
            get_4_isog_dual(pointProj2, jArr17, jArr18, jArr11);
            for (int i21 = 0; i21 < i17; i21++) {
                this.engine.isogeny.eval_4_isog(pointProjArr[i21], jArr11);
            }
            PointProj pointProj5 = pointProj2;
            eval_dual_4_isog_shared(jArr11[2], jArr11[3], jArr11[4], jArr[i20], 2);
            int i22 = i17 - 1;
            this.engine.fpx.fp2copy(pointProjArr[i22].f19464X, pointProj5.f19464X);
            this.engine.fpx.fp2copy(pointProjArr[i22].f19465Z, pointProj5.f19465Z);
            i10 = iArr2[i22];
            i11 = i17 - 1;
            i13++;
            i12 = i16;
            jArr4 = jArr18;
            pointProj2 = pointProj5;
            jArr3 = jArr17;
        }
    }

    public void FullIsogeny_B_dual(byte[] bArr, long[][][][] jArr, long[][] jArr2) {
        SIKEEngine sIKEEngine;
        PointProj pointProj = new PointProj(this.engine.params.NWORDS_FIELD);
        PointProj pointProj2 = new PointProj(this.engine.params.NWORDS_FIELD);
        Internal internal = this.engine.params;
        PointProj[] pointProjArr = new PointProj[internal.MAX_INT_POINTS_BOB];
        int[] iArr = {2, internal.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr3 = (long[][]) Array.newInstance((Class<?>) cls, iArr);
        long[][] jArr4 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr5 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr6 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr7 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][][] jArr8 = (long[][][]) Array.newInstance((Class<?>) cls, 3, 2, this.engine.params.NWORDS_FIELD);
        Internal internal2 = this.engine.params;
        int[] iArr2 = new int[internal2.MAX_INT_POINTS_BOB];
        long[] jArr9 = new long[internal2.NWORDS_ORDER];
        init_basis(internal2.B_gen, jArr3, jArr4, jArr5);
        SIKEEngine sIKEEngine2 = this.engine;
        sIKEEngine2.fpx.fpcopy(sIKEEngine2.params.XQB3, 0, pointProj2.f19464X[0]);
        SIKEEngine sIKEEngine3 = this.engine;
        Fpx fpx = sIKEEngine3.fpx;
        Internal internal3 = sIKEEngine3.params;
        fpx.fpcopy(internal3.XQB3, internal3.NWORDS_FIELD, pointProj2.f19464X[1]);
        SIKEEngine sIKEEngine4 = this.engine;
        sIKEEngine4.fpx.fpcopy(sIKEEngine4.params.Montgomery_one, 0, pointProj2.f19465Z[0]);
        SIKEEngine sIKEEngine5 = this.engine;
        sIKEEngine5.fpx.fpcopy(sIKEEngine5.params.Montgomery_one, 0, jArr6[0]);
        this.engine.fpx.fp2add(jArr6, jArr6, jArr6);
        this.engine.fpx.fp2add(jArr6, jArr6, jArr7);
        this.engine.fpx.fp2add(jArr6, jArr7, jArr2);
        this.engine.fpx.fp2add(jArr7, jArr7, jArr6);
        SIKEEngine sIKEEngine6 = this.engine;
        Fpx fpx2 = sIKEEngine6.fpx;
        Internal internal4 = sIKEEngine6.params;
        fpx2.decode_to_digits(bArr, 0, jArr9, internal4.SECRETKEY_B_BYTES, internal4.NWORDS_ORDER);
        SIKEEngine sIKEEngine7 = this.engine;
        sIKEEngine7.isogeny.LADDER3PT(jArr3, jArr4, jArr5, jArr9, sIKEEngine7.params.BOB, pointProj, jArr2);
        int i3 = 1;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            SIKEEngine sIKEEngine8 = this.engine;
            if (i3 >= sIKEEngine8.params.MAX_Bob) {
                long[][] jArr10 = jArr6;
                long[][] jArr11 = jArr7;
                sIKEEngine8.isogeny.get_3_isog(pointProj, jArr11, jArr10, jArr8);
                this.engine.isogeny.eval_3_isog(pointProj2, jArr8);
                this.engine.fpx.fp2sub(pointProj2.f19464X, pointProj2.f19465Z, jArr[r1.params.MAX_Bob - 1][0]);
                this.engine.fpx.fp2add(pointProj2.f19464X, pointProj2.f19465Z, jArr[r1.params.MAX_Bob - 1][1]);
                this.engine.fpx.fp2add(jArr10, jArr11, jArr2);
                this.engine.fpx.fp2sub(jArr10, jArr11, jArr10);
                this.engine.fpx.fp2inv_mont_bingcd(jArr10);
                this.engine.fpx.fp2mul_mont(jArr10, jArr2, jArr2);
                this.engine.fpx.fp2add(jArr2, jArr2, jArr2);
                return;
            }
            int i13 = i10;
            while (true) {
                sIKEEngine = this.engine;
                Internal internal5 = sIKEEngine.params;
                if (i13 >= internal5.MAX_Bob - i3) {
                    break;
                }
                PointProj pointProj3 = new PointProj(internal5.NWORDS_FIELD);
                pointProjArr[i11] = pointProj3;
                this.engine.fpx.fp2copy(pointProj.f19464X, pointProj3.f19464X);
                this.engine.fpx.fp2copy(pointProj.f19465Z, pointProjArr[i11].f19465Z);
                iArr2[i11] = i13;
                SIKEEngine sIKEEngine9 = this.engine;
                int i14 = i12 + 1;
                int i15 = sIKEEngine9.params.strat_Bob[i12];
                long[][] jArr12 = jArr6;
                long[][] jArr13 = jArr7;
                sIKEEngine9.isogeny.xTPLe(pointProj, pointProj, jArr13, jArr12, i15);
                i13 += i15;
                jArr7 = jArr13;
                i11++;
                i12 = i14;
                jArr6 = jArr12;
            }
            long[][] jArr14 = jArr6;
            long[][] jArr15 = jArr7;
            sIKEEngine.isogeny.get_3_isog(pointProj, jArr15, jArr14, jArr8);
            for (int i16 = 0; i16 < i11; i16++) {
                this.engine.isogeny.eval_3_isog(pointProjArr[i16], jArr8);
            }
            this.engine.isogeny.eval_3_isog(pointProj2, jArr8);
            int i17 = i3 - 1;
            int i18 = i11;
            this.engine.fpx.fp2sub(pointProj2.f19464X, pointProj2.f19465Z, jArr[i17][0]);
            this.engine.fpx.fp2add(pointProj2.f19464X, pointProj2.f19465Z, jArr[i17][1]);
            int i19 = i18 - 1;
            this.engine.fpx.fp2copy(pointProjArr[i19].f19464X, pointProj.f19464X);
            this.engine.fpx.fp2copy(pointProjArr[i19].f19465Z, pointProj.f19465Z);
            i10 = iArr2[i19];
            i11 = i18 - 1;
            i3++;
            jArr7 = jArr15;
            jArr6 = jArr14;
        }
    }

    public void Ladder3pt_dual(PointProj[] pointProjArr, long[] jArr, int i3, PointProj pointProj, long[][] jArr2) {
        PointProj pointProj2 = new PointProj(this.engine.params.NWORDS_FIELD);
        PointProj pointProj3 = new PointProj(this.engine.params.NWORDS_FIELD);
        SIKEEngine sIKEEngine = this.engine;
        Internal internal = sIKEEngine.params;
        int i10 = i3 == internal.ALICE ? internal.OALICE_BITS : internal.OBOB_BITS;
        sIKEEngine.fpx.fp2copy(pointProjArr[1].f19464X, pointProj2.f19464X);
        this.engine.fpx.fp2copy(pointProjArr[1].f19465Z, pointProj2.f19465Z);
        this.engine.fpx.fp2copy(pointProjArr[2].f19464X, pointProj3.f19464X);
        this.engine.fpx.fp2copy(pointProjArr[2].f19465Z, pointProj3.f19465Z);
        int i11 = 0;
        this.engine.fpx.fp2copy(pointProjArr[0].f19464X, pointProj.f19464X);
        this.engine.fpx.fp2copy(pointProjArr[0].f19465Z, pointProj.f19465Z);
        int i12 = 0;
        while (i11 < i10) {
            int i13 = (int) ((jArr[i11 >>> 6] >>> (i11 & 63)) & 1);
            this.engine.isogeny.swap_points(pointProj, pointProj3, 0 - (i12 ^ i13));
            this.engine.isogeny.xDBLADD(pointProj2, pointProj3, pointProj.f19464X, jArr2);
            Fpx fpx = this.engine.fpx;
            long[][] jArr3 = pointProj3.f19464X;
            fpx.fp2mul_mont(jArr3, pointProj.f19465Z, jArr3);
            i11++;
            i12 = i13;
        }
        this.engine.isogeny.swap_points(pointProj, pointProj3, 0 - i12);
    }

    public void PKADecompression_dual(byte[] bArr, byte[] bArr2, PointProj pointProj, long[][] jArr) {
        SIDH_Compressed sIDH_Compressed;
        int i3;
        PointProj pointProj2;
        long[][] jArr2;
        PointProj[] pointProjArr;
        long[] jArr3;
        long[][] jArr4 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 2, this.engine.params.NWORDS_FIELD);
        PointProj[] pointProjArr2 = {new PointProj(this.engine.params.NWORDS_FIELD), new PointProj(this.engine.params.NWORDS_FIELD), new PointProj(this.engine.params.NWORDS_FIELD)};
        SIKEEngine sIKEEngine = this.engine;
        Internal internal = sIKEEngine.params;
        int i10 = internal.NWORDS_ORDER;
        long[] jArr5 = new long[i10];
        long[] jArr6 = new long[i10];
        long[] jArr7 = new long[i10];
        long[] jArr8 = new long[i10];
        long[] jArr9 = new long[i10];
        long[] jArr10 = new long[i10];
        long[] jArr11 = new long[i10];
        sIKEEngine.fpx.fp2_decode(bArr2, jArr, internal.ORDER_B_ENCODED_BYTES * 3);
        jArr9[0] = 1;
        SIKEEngine sIKEEngine2 = this.engine;
        Fpx fpx = sIKEEngine2.fpx;
        Internal internal2 = sIKEEngine2.params;
        fpx.to_Montgomery_mod_order(jArr9, jArr9, internal2.Bob_order, internal2.Montgomery_RB2, internal2.Montgomery_RB1);
        Internal internal3 = this.engine.params;
        int i11 = internal3.ORDER_B_ENCODED_BYTES;
        int i12 = internal3.FP2_ENCODED_BYTES;
        byte b2 = (byte) ((bArr2[(i11 * 3) + i12] & UByte.MAX_VALUE) >> 7);
        byte[] bArr3 = new byte[3];
        System.arraycopy(bArr2, (i11 * 3) + i12, bArr3, 0, 3);
        byte b10 = bArr3[0];
        int[] iArr = {b10 & UByte.MAX_VALUE, bArr3[1] & UByte.MAX_VALUE, bArr3[2] & UByte.MAX_VALUE};
        iArr[0] = b10 & ByteCompanionObject.MAX_VALUE;
        SIKEEngine sIKEEngine3 = this.engine;
        sIKEEngine3.fpx.fpaddPRIME(jArr[0], sIKEEngine3.params.Montgomery_one, jArr4[0]);
        this.engine.fpx.fpcopy(jArr[1], 0, jArr4[1]);
        SIKEEngine sIKEEngine4 = this.engine;
        Fpx fpx2 = sIKEEngine4.fpx;
        long[] jArr12 = jArr4[0];
        fpx2.fpaddPRIME(jArr12, sIKEEngine4.params.Montgomery_one, jArr12);
        this.engine.fpx.fp2div2(jArr4, jArr4);
        this.engine.fpx.fp2div2(jArr4, jArr4);
        BuildOrdinary3nBasis_Decomp_dual(jArr4, pointProjArr2, iArr, iArr, 2);
        SIKEEngine sIKEEngine5 = this.engine;
        sIKEEngine5.fpx.fpcopy(sIKEEngine5.params.Montgomery_one, 0, pointProjArr2[0].f19465Z[0]);
        SIKEEngine sIKEEngine6 = this.engine;
        sIKEEngine6.fpx.fpcopy(sIKEEngine6.params.Montgomery_one, 0, pointProjArr2[1].f19465Z[0]);
        this.engine.isogeny.swap_points(pointProjArr2[0], pointProjArr2[1], -b2);
        SIKEEngine sIKEEngine7 = this.engine;
        Fpx fpx3 = sIKEEngine7.fpx;
        Internal internal4 = sIKEEngine7.params;
        fpx3.decode_to_digits(bArr, 0, jArr11, internal4.SECRETKEY_B_BYTES, internal4.NWORDS_ORDER);
        SIKEEngine sIKEEngine8 = this.engine;
        Fpx fpx4 = sIKEEngine8.fpx;
        Internal internal5 = sIKEEngine8.params;
        fpx4.to_Montgomery_mod_order(jArr11, jArr5, internal5.Bob_order, internal5.Montgomery_RB2, internal5.Montgomery_RB1);
        SIKEEngine sIKEEngine9 = this.engine;
        Fpx fpx5 = sIKEEngine9.fpx;
        Internal internal6 = sIKEEngine9.params;
        fpx5.decode_to_digits(bArr2, 0, jArr10, internal6.ORDER_B_ENCODED_BYTES, internal6.NWORDS_ORDER);
        SIKEEngine sIKEEngine10 = this.engine;
        Fpx fpx6 = sIKEEngine10.fpx;
        Internal internal7 = sIKEEngine10.params;
        fpx6.to_Montgomery_mod_order(jArr10, jArr6, internal7.Bob_order, internal7.Montgomery_RB2, internal7.Montgomery_RB1);
        SIKEEngine sIKEEngine11 = this.engine;
        Fpx fpx7 = sIKEEngine11.fpx;
        Internal internal8 = sIKEEngine11.params;
        int i13 = internal8.ORDER_B_ENCODED_BYTES;
        fpx7.decode_to_digits(bArr2, i13, jArr10, i13, internal8.NWORDS_ORDER);
        SIKEEngine sIKEEngine12 = this.engine;
        Fpx fpx8 = sIKEEngine12.fpx;
        Internal internal9 = sIKEEngine12.params;
        fpx8.to_Montgomery_mod_order(jArr10, jArr7, internal9.Bob_order, internal9.Montgomery_RB2, internal9.Montgomery_RB1);
        SIKEEngine sIKEEngine13 = this.engine;
        Fpx fpx9 = sIKEEngine13.fpx;
        Internal internal10 = sIKEEngine13.params;
        int i14 = internal10.ORDER_B_ENCODED_BYTES;
        fpx9.decode_to_digits(bArr2, i14 * 2, jArr10, i14, internal10.NWORDS_ORDER);
        SIKEEngine sIKEEngine14 = this.engine;
        Fpx fpx10 = sIKEEngine14.fpx;
        Internal internal11 = sIKEEngine14.params;
        fpx10.to_Montgomery_mod_order(jArr10, jArr8, internal11.Bob_order, internal11.Montgomery_RB2, internal11.Montgomery_RB1);
        if (b2 == 0) {
            SIKEEngine sIKEEngine15 = this.engine;
            Fpx fpx11 = sIKEEngine15.fpx;
            Internal internal12 = sIKEEngine15.params;
            fpx11.Montgomery_multiply_mod_order(jArr5, jArr7, jArr7, internal12.Bob_order, internal12.Montgomery_RB2);
            SIKEEngine sIKEEngine16 = this.engine;
            sIKEEngine16.fpx.mp_add(jArr7, jArr9, jArr7, sIKEEngine16.params.NWORDS_ORDER);
            SIKEEngine sIKEEngine17 = this.engine;
            Fpx fpx12 = sIKEEngine17.fpx;
            Internal internal13 = sIKEEngine17.params;
            fpx12.Montgomery_inversion_mod_order_bingcd(jArr7, jArr7, internal13.Bob_order, internal13.Montgomery_RB2, internal13.Montgomery_RB1);
            SIKEEngine sIKEEngine18 = this.engine;
            Fpx fpx13 = sIKEEngine18.fpx;
            Internal internal14 = sIKEEngine18.params;
            fpx13.Montgomery_multiply_mod_order(jArr5, jArr8, jArr8, internal14.Bob_order, internal14.Montgomery_RB2);
            SIKEEngine sIKEEngine19 = this.engine;
            sIKEEngine19.fpx.mp_add(jArr6, jArr8, jArr8, sIKEEngine19.params.NWORDS_ORDER);
            SIKEEngine sIKEEngine20 = this.engine;
            Fpx fpx14 = sIKEEngine20.fpx;
            Internal internal15 = sIKEEngine20.params;
            fpx14.Montgomery_multiply_mod_order(jArr7, jArr8, jArr7, internal15.Bob_order, internal15.Montgomery_RB2);
            SIKEEngine sIKEEngine21 = this.engine;
            Fpx fpx15 = sIKEEngine21.fpx;
            Internal internal16 = sIKEEngine21.params;
            fpx15.from_Montgomery_mod_order(jArr7, jArr7, internal16.Bob_order, internal16.Montgomery_RB2);
            i3 = this.engine.params.BOB;
            pointProj2 = pointProj;
            sIDH_Compressed = this;
            jArr3 = jArr7;
            jArr2 = jArr4;
            pointProjArr = pointProjArr2;
        } else {
            sIDH_Compressed = this;
            SIKEEngine sIKEEngine22 = sIDH_Compressed.engine;
            Fpx fpx16 = sIKEEngine22.fpx;
            Internal internal17 = sIKEEngine22.params;
            fpx16.Montgomery_multiply_mod_order(jArr5, jArr8, jArr8, internal17.Bob_order, internal17.Montgomery_RB2);
            SIKEEngine sIKEEngine23 = sIDH_Compressed.engine;
            sIKEEngine23.fpx.mp_add(jArr8, jArr9, jArr8, sIKEEngine23.params.NWORDS_ORDER);
            SIKEEngine sIKEEngine24 = sIDH_Compressed.engine;
            Fpx fpx17 = sIKEEngine24.fpx;
            Internal internal18 = sIKEEngine24.params;
            fpx17.Montgomery_inversion_mod_order_bingcd(jArr8, jArr8, internal18.Bob_order, internal18.Montgomery_RB2, internal18.Montgomery_RB1);
            SIKEEngine sIKEEngine25 = sIDH_Compressed.engine;
            Fpx fpx18 = sIKEEngine25.fpx;
            Internal internal19 = sIKEEngine25.params;
            fpx18.Montgomery_multiply_mod_order(jArr5, jArr7, jArr7, internal19.Bob_order, internal19.Montgomery_RB2);
            SIKEEngine sIKEEngine26 = sIDH_Compressed.engine;
            sIKEEngine26.fpx.mp_add(jArr6, jArr7, jArr7, sIKEEngine26.params.NWORDS_ORDER);
            SIKEEngine sIKEEngine27 = sIDH_Compressed.engine;
            Fpx fpx19 = sIKEEngine27.fpx;
            Internal internal20 = sIKEEngine27.params;
            fpx19.Montgomery_multiply_mod_order(jArr7, jArr8, jArr7, internal20.Bob_order, internal20.Montgomery_RB2);
            SIKEEngine sIKEEngine28 = sIDH_Compressed.engine;
            Fpx fpx20 = sIKEEngine28.fpx;
            Internal internal21 = sIKEEngine28.params;
            fpx20.from_Montgomery_mod_order(jArr7, jArr7, internal21.Bob_order, internal21.Montgomery_RB2);
            i3 = sIDH_Compressed.engine.params.BOB;
            pointProj2 = pointProj;
            jArr2 = jArr4;
            pointProjArr = pointProjArr2;
            jArr3 = jArr7;
        }
        sIDH_Compressed.Ladder3pt_dual(pointProjArr, jArr3, i3, pointProj2, jArr2);
        long[][] jArr13 = jArr2;
        SIKEEngine sIKEEngine29 = sIDH_Compressed.engine;
        sIKEEngine29.isogeny.Double(pointProj, pointProj, jArr13, sIKEEngine29.params.OALICE_BITS);
    }

    public void PKBDecompression(byte[] bArr, int i3, byte[] bArr2, PointProj pointProj, long[][] jArr) {
        int i10;
        PointProj pointProj2;
        long[][] jArr2;
        long[] jArr3;
        PointProj[] pointProjArr;
        SIDH_Compressed sIDH_Compressed = this;
        long[][] jArr4 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 2, sIDH_Compressed.engine.params.NWORDS_FIELD);
        SIKEEngine sIKEEngine = sIDH_Compressed.engine;
        Internal internal = sIKEEngine.params;
        int i11 = internal.NWORDS_ORDER;
        long[] jArr5 = new long[i11 * 2];
        long[] jArr6 = new long[i11 * 2];
        long[] jArr7 = new long[i11 * 2];
        long[] jArr8 = new long[i11];
        long[] jArr9 = new long[i11];
        PointProj[] pointProjArr2 = new PointProj[3];
        long j = (-1) >>> (internal.MAXBITS_ORDER - internal.OALICE_BITS);
        jArr7[0] = 1;
        sIKEEngine.fpx.fp2_decode(bArr2, jArr, internal.ORDER_A_ENCODED_BYTES * 3);
        Internal internal2 = sIDH_Compressed.engine.params;
        int i12 = internal2.ORDER_A_ENCODED_BYTES;
        int i13 = internal2.FP2_ENCODED_BYTES;
        int i14 = bArr2[(i12 * 3) + i13] >>> 7;
        sIDH_Compressed.BuildEntangledXonly_Decomp(jArr, pointProjArr2, bArr2[(i12 * 3) + i13] & 1, bArr2[AbstractC1482f.c(i12, 3, i13, 1)]);
        SIKEEngine sIKEEngine2 = sIDH_Compressed.engine;
        sIKEEngine2.fpx.fpcopy(sIKEEngine2.params.Montgomery_one, 0, pointProjArr2[0].f19465Z[0]);
        SIKEEngine sIKEEngine3 = sIDH_Compressed.engine;
        sIKEEngine3.fpx.fpcopy(sIKEEngine3.params.Montgomery_one, 0, pointProjArr2[1].f19465Z[0]);
        SIKEEngine sIKEEngine4 = sIDH_Compressed.engine;
        sIKEEngine4.fpx.fpaddPRIME(jArr[0], sIKEEngine4.params.Montgomery_one, jArr4[0]);
        sIDH_Compressed.engine.fpx.fpcopy(jArr[1], 0, jArr4[1]);
        SIKEEngine sIKEEngine5 = sIDH_Compressed.engine;
        Fpx fpx = sIKEEngine5.fpx;
        long[] jArr10 = jArr4[0];
        fpx.fpaddPRIME(jArr10, sIKEEngine5.params.Montgomery_one, jArr10);
        sIDH_Compressed.engine.fpx.fp2div2(jArr4, jArr4);
        sIDH_Compressed.engine.fpx.fp2div2(jArr4, jArr4);
        SIKEEngine sIKEEngine6 = sIDH_Compressed.engine;
        Fpx fpx2 = sIKEEngine6.fpx;
        Internal internal3 = sIKEEngine6.params;
        fpx2.decode_to_digits(bArr, i3, jArr8, internal3.SECRETKEY_A_BYTES, internal3.NWORDS_ORDER);
        sIDH_Compressed.engine.isogeny.swap_points(pointProjArr2[0], pointProjArr2[1], 0 - i14);
        if (i14 == 0) {
            SIKEEngine sIKEEngine7 = sIDH_Compressed.engine;
            Fpx fpx3 = sIKEEngine7.fpx;
            Internal internal4 = sIKEEngine7.params;
            int i15 = internal4.ORDER_A_ENCODED_BYTES;
            fpx3.decode_to_digits(bArr2, i15, jArr9, i15, internal4.NWORDS_ORDER);
            SIKEEngine sIKEEngine8 = sIDH_Compressed.engine;
            sIKEEngine8.fpx.multiply(jArr8, jArr9, jArr5, sIKEEngine8.params.NWORDS_ORDER);
            SIKEEngine sIKEEngine9 = sIDH_Compressed.engine;
            sIKEEngine9.fpx.mp_add(jArr5, jArr7, jArr5, sIKEEngine9.params.NWORDS_ORDER);
            SIKEEngine sIKEEngine10 = sIDH_Compressed.engine;
            int i16 = sIKEEngine10.params.NWORDS_ORDER - 1;
            jArr5[i16] = jArr5[i16] & j;
            sIKEEngine10.fpx.inv_mod_orderA(jArr5, jArr6);
            SIKEEngine sIKEEngine11 = sIDH_Compressed.engine;
            Fpx fpx4 = sIKEEngine11.fpx;
            Internal internal5 = sIKEEngine11.params;
            int i17 = internal5.ORDER_A_ENCODED_BYTES;
            fpx4.decode_to_digits(bArr2, i17 * 2, jArr9, i17, internal5.NWORDS_ORDER);
            SIKEEngine sIKEEngine12 = sIDH_Compressed.engine;
            sIKEEngine12.fpx.multiply(jArr8, jArr9, jArr5, sIKEEngine12.params.NWORDS_ORDER);
            SIKEEngine sIKEEngine13 = sIDH_Compressed.engine;
            Fpx fpx5 = sIKEEngine13.fpx;
            Internal internal6 = sIKEEngine13.params;
            fpx5.decode_to_digits(bArr2, 0, jArr9, internal6.ORDER_A_ENCODED_BYTES, internal6.NWORDS_ORDER);
            SIKEEngine sIKEEngine14 = sIDH_Compressed.engine;
            sIKEEngine14.fpx.mp_add(jArr9, jArr5, jArr5, sIKEEngine14.params.NWORDS_ORDER);
            SIKEEngine sIKEEngine15 = sIDH_Compressed.engine;
            sIKEEngine15.fpx.multiply(jArr5, jArr6, jArr7, sIKEEngine15.params.NWORDS_ORDER);
            Internal internal7 = sIDH_Compressed.engine.params;
            int i18 = internal7.NWORDS_ORDER - 1;
            jArr7[i18] = jArr7[i18] & j;
            i10 = internal7.ALICE;
            pointProj2 = pointProj;
            pointProjArr = pointProjArr2;
            jArr2 = jArr4;
            jArr3 = jArr7;
        } else {
            SIKEEngine sIKEEngine16 = sIDH_Compressed.engine;
            Fpx fpx6 = sIKEEngine16.fpx;
            Internal internal8 = sIKEEngine16.params;
            int i19 = internal8.ORDER_A_ENCODED_BYTES;
            fpx6.decode_to_digits(bArr2, i19 * 2, jArr9, i19, internal8.NWORDS_ORDER);
            SIKEEngine sIKEEngine17 = sIDH_Compressed.engine;
            sIKEEngine17.fpx.multiply(jArr8, jArr9, jArr5, sIKEEngine17.params.NWORDS_ORDER);
            SIKEEngine sIKEEngine18 = sIDH_Compressed.engine;
            sIKEEngine18.fpx.mp_add(jArr5, jArr7, jArr5, sIKEEngine18.params.NWORDS_ORDER);
            SIKEEngine sIKEEngine19 = sIDH_Compressed.engine;
            int i20 = sIKEEngine19.params.NWORDS_ORDER - 1;
            jArr5[i20] = jArr5[i20] & j;
            sIKEEngine19.fpx.inv_mod_orderA(jArr5, jArr6);
            SIKEEngine sIKEEngine20 = sIDH_Compressed.engine;
            Fpx fpx7 = sIKEEngine20.fpx;
            Internal internal9 = sIKEEngine20.params;
            int i21 = internal9.ORDER_A_ENCODED_BYTES;
            fpx7.decode_to_digits(bArr2, i21, jArr9, i21, internal9.NWORDS_ORDER);
            SIKEEngine sIKEEngine21 = sIDH_Compressed.engine;
            sIKEEngine21.fpx.multiply(jArr8, jArr9, jArr5, sIKEEngine21.params.NWORDS_ORDER);
            SIKEEngine sIKEEngine22 = sIDH_Compressed.engine;
            Fpx fpx8 = sIKEEngine22.fpx;
            Internal internal10 = sIKEEngine22.params;
            fpx8.decode_to_digits(bArr2, 0, jArr9, internal10.ORDER_A_ENCODED_BYTES, internal10.NWORDS_ORDER);
            SIKEEngine sIKEEngine23 = sIDH_Compressed.engine;
            sIKEEngine23.fpx.mp_add(jArr9, jArr5, jArr5, sIKEEngine23.params.NWORDS_ORDER);
            SIKEEngine sIKEEngine24 = sIDH_Compressed.engine;
            sIKEEngine24.fpx.multiply(jArr5, jArr6, jArr7, sIKEEngine24.params.NWORDS_ORDER);
            Internal internal11 = sIDH_Compressed.engine.params;
            int i22 = internal11.NWORDS_ORDER - 1;
            jArr7[i22] = jArr7[i22] & j;
            i10 = internal11.ALICE;
            pointProj2 = pointProj;
            sIDH_Compressed = sIDH_Compressed;
            jArr2 = jArr4;
            jArr3 = jArr7;
            pointProjArr = pointProjArr2;
        }
        sIDH_Compressed.Ladder3pt_dual(pointProjArr, jArr3, i10, pointProj2, jArr2);
        sIDH_Compressed.engine.fpx.fp2div2(jArr, jArr2);
        SIKEEngine sIKEEngine25 = sIDH_Compressed.engine;
        sIKEEngine25.isogeny.xTPLe_fast(pointProj, pointProj, jArr2, sIKEEngine25.params.OBOB_EXPON);
    }

    public void PKBDecompression_extended(byte[] bArr, int i3, byte[] bArr2, PointProj pointProj, long[][] jArr, byte[] bArr3, int i10) {
        long[] jArr2;
        long[][] jArr3;
        PointProj[] pointProjArr;
        int i11;
        PointProj pointProj2;
        int[] iArr = {2, this.engine.params.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr4 = (long[][]) Array.newInstance((Class<?>) cls, iArr);
        long[][] jArr5 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        Internal internal = this.engine.params;
        int i12 = internal.NWORDS_ORDER;
        long[] jArr6 = new long[i12 * 2];
        long[] jArr7 = new long[i12 * 2];
        long[] jArr8 = new long[i12];
        long[] jArr9 = new long[i12 * 2];
        long[] jArr10 = new long[i12];
        long[] jArr11 = new long[i12];
        long[] jArr12 = new long[i12];
        long[] jArr13 = new long[i12];
        long[] jArr14 = new long[i12];
        PointProj[] pointProjArr2 = {new PointProj(internal.NWORDS_FIELD), new PointProj(this.engine.params.NWORDS_FIELD), new PointProj(this.engine.params.NWORDS_FIELD)};
        SIKEEngine sIKEEngine = this.engine;
        Internal internal2 = sIKEEngine.params;
        long j = (-1) >>> (internal2.MAXBITS_ORDER - internal2.OALICE_BITS);
        sIKEEngine.fpx.fp2_decode(bArr2, jArr, internal2.ORDER_A_ENCODED_BYTES * 4);
        Internal internal3 = this.engine.params;
        int i13 = internal3.ORDER_A_ENCODED_BYTES;
        int i14 = internal3.FP2_ENCODED_BYTES;
        BuildEntangledXonly_Decomp(jArr, pointProjArr2, bArr2[(i13 * 4) + i14] & 1, bArr2[AbstractC1482f.c(i13, 4, i14, 1)]);
        SIKEEngine sIKEEngine2 = this.engine;
        sIKEEngine2.fpx.fpcopy(sIKEEngine2.params.Montgomery_one, 0, pointProjArr2[0].f19465Z[0]);
        SIKEEngine sIKEEngine3 = this.engine;
        sIKEEngine3.fpx.fpcopy(sIKEEngine3.params.Montgomery_one, 0, pointProjArr2[1].f19465Z[0]);
        SIKEEngine sIKEEngine4 = this.engine;
        sIKEEngine4.fpx.fpaddPRIME(jArr[0], sIKEEngine4.params.Montgomery_one, jArr4[0]);
        this.engine.fpx.fpcopy(jArr[1], 0, jArr4[1]);
        SIKEEngine sIKEEngine5 = this.engine;
        Fpx fpx = sIKEEngine5.fpx;
        long[] jArr15 = jArr4[0];
        fpx.fpaddPRIME(jArr15, sIKEEngine5.params.Montgomery_one, jArr15);
        this.engine.fpx.fp2div2(jArr4, jArr4);
        this.engine.fpx.fp2div2(jArr4, jArr4);
        SIKEEngine sIKEEngine6 = this.engine;
        Fpx fpx2 = sIKEEngine6.fpx;
        Internal internal4 = sIKEEngine6.params;
        fpx2.decode_to_digits(bArr, i3, jArr10, internal4.SECRETKEY_A_BYTES, internal4.NWORDS_ORDER);
        SIKEEngine sIKEEngine7 = this.engine;
        Fpx fpx3 = sIKEEngine7.fpx;
        Internal internal5 = sIKEEngine7.params;
        fpx3.decode_to_digits(bArr2, 0, jArr11, internal5.ORDER_A_ENCODED_BYTES, internal5.NWORDS_ORDER);
        SIKEEngine sIKEEngine8 = this.engine;
        Fpx fpx4 = sIKEEngine8.fpx;
        Internal internal6 = sIKEEngine8.params;
        int i15 = internal6.ORDER_A_ENCODED_BYTES;
        fpx4.decode_to_digits(bArr2, i15, jArr13, i15, internal6.NWORDS_ORDER);
        SIKEEngine sIKEEngine9 = this.engine;
        Fpx fpx5 = sIKEEngine9.fpx;
        Internal internal7 = sIKEEngine9.params;
        int i16 = internal7.ORDER_A_ENCODED_BYTES;
        fpx5.decode_to_digits(bArr2, i16 * 2, jArr12, i16, internal7.NWORDS_ORDER);
        SIKEEngine sIKEEngine10 = this.engine;
        Fpx fpx6 = sIKEEngine10.fpx;
        Internal internal8 = sIKEEngine10.params;
        int i17 = internal8.ORDER_A_ENCODED_BYTES;
        fpx6.decode_to_digits(bArr2, i17 * 3, jArr14, i17, internal8.NWORDS_ORDER);
        if ((jArr11[0] & 1) == 1) {
            SIKEEngine sIKEEngine11 = this.engine;
            sIKEEngine11.fpx.multiply(jArr10, jArr14, jArr6, sIKEEngine11.params.NWORDS_ORDER);
            SIKEEngine sIKEEngine12 = this.engine;
            sIKEEngine12.fpx.mp_add(jArr6, jArr13, jArr6, sIKEEngine12.params.NWORDS_ORDER);
            SIKEEngine sIKEEngine13 = this.engine;
            int i18 = sIKEEngine13.params.NWORDS_ORDER;
            int i19 = i18 - 1;
            jArr6[i19] = jArr6[i19] & j;
            sIKEEngine13.fpx.multiply(jArr10, jArr12, jArr7, i18);
            SIKEEngine sIKEEngine14 = this.engine;
            sIKEEngine14.fpx.mp_add(jArr7, jArr11, jArr7, sIKEEngine14.params.NWORDS_ORDER);
            SIKEEngine sIKEEngine15 = this.engine;
            int i20 = sIKEEngine15.params.NWORDS_ORDER - 1;
            jArr7[i20] = jArr7[i20] & j;
            sIKEEngine15.fpx.inv_mod_orderA(jArr7, jArr8);
            SIKEEngine sIKEEngine16 = this.engine;
            sIKEEngine16.fpx.multiply(jArr6, jArr8, jArr9, sIKEEngine16.params.NWORDS_ORDER);
            Internal internal9 = this.engine.params;
            int i21 = internal9.NWORDS_ORDER - 1;
            jArr9[i21] = jArr9[i21] & j;
            i11 = internal9.ALICE;
            pointProj2 = pointProj;
            jArr2 = jArr9;
            jArr3 = jArr4;
            pointProjArr = pointProjArr2;
        } else {
            jArr2 = jArr9;
            jArr3 = jArr4;
            pointProjArr = pointProjArr2;
            SIKEEngine sIKEEngine17 = this.engine;
            sIKEEngine17.fpx.multiply(jArr10, jArr12, jArr6, sIKEEngine17.params.NWORDS_ORDER);
            SIKEEngine sIKEEngine18 = this.engine;
            sIKEEngine18.fpx.mp_add(jArr6, jArr11, jArr6, sIKEEngine18.params.NWORDS_ORDER);
            SIKEEngine sIKEEngine19 = this.engine;
            int i22 = sIKEEngine19.params.NWORDS_ORDER;
            int i23 = i22 - 1;
            jArr6[i23] = jArr6[i23] & j;
            sIKEEngine19.fpx.multiply(jArr10, jArr14, jArr7, i22);
            SIKEEngine sIKEEngine20 = this.engine;
            sIKEEngine20.fpx.mp_add(jArr7, jArr13, jArr7, sIKEEngine20.params.NWORDS_ORDER);
            SIKEEngine sIKEEngine21 = this.engine;
            int i24 = sIKEEngine21.params.NWORDS_ORDER - 1;
            jArr7[i24] = jArr7[i24] & j;
            sIKEEngine21.fpx.inv_mod_orderA(jArr7, jArr8);
            SIKEEngine sIKEEngine22 = this.engine;
            sIKEEngine22.fpx.multiply(jArr8, jArr6, jArr2, sIKEEngine22.params.NWORDS_ORDER);
            SIKEEngine sIKEEngine23 = this.engine;
            int i25 = sIKEEngine23.params.NWORDS_ORDER - 1;
            jArr2[i25] = jArr2[i25] & j;
            sIKEEngine23.isogeny.swap_points(pointProjArr[0], pointProjArr[1], -1L);
            i11 = this.engine.params.ALICE;
            pointProj2 = pointProj;
        }
        Ladder3pt_dual(pointProjArr, jArr2, i11, pointProj2, jArr3);
        this.engine.fpx.fp2div2(jArr, jArr5);
        SIKEEngine sIKEEngine24 = this.engine;
        sIKEEngine24.isogeny.xTPLe_fast(pointProj2, pointProj2, jArr5, sIKEEngine24.params.OBOB_EXPON);
        this.engine.fpx.fp2_encode(pointProj2.f19464X, bArr3, i10);
        SIKEEngine sIKEEngine25 = this.engine;
        sIKEEngine25.fpx.fp2_encode(pointProj2.f19465Z, bArr3, sIKEEngine25.params.FP2_ENCODED_BYTES + i10);
        SIKEEngine sIKEEngine26 = this.engine;
        Fpx fpx7 = sIKEEngine26.fpx;
        Internal internal10 = sIKEEngine26.params;
        fpx7.encode_to_bytes(jArr8, bArr3, (internal10.FP2_ENCODED_BYTES * 2) + i10, internal10.ORDER_A_ENCODED_BYTES);
    }

    public void RecoverY(long[][] jArr, PointProj[] pointProjArr, PointProjFull[] pointProjFullArr) {
        int[] iArr = {2, this.engine.params.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr2 = (long[][]) Array.newInstance((Class<?>) cls, iArr);
        long[][] jArr3 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr4 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr5 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr6 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        this.engine.fpx.fp2mul_mont(pointProjArr[2].f19464X, pointProjArr[1].f19465Z, jArr2);
        this.engine.fpx.fp2mul_mont(pointProjArr[1].f19464X, pointProjArr[2].f19465Z, jArr3);
        this.engine.fpx.fp2mul_mont(pointProjArr[1].f19464X, pointProjArr[2].f19464X, jArr4);
        this.engine.fpx.fp2mul_mont(pointProjArr[1].f19465Z, pointProjArr[2].f19465Z, jArr5);
        this.engine.fpx.fp2sqr_mont(pointProjArr[1].f19464X, jArr6);
        this.engine.fpx.fp2sqr_mont(pointProjArr[1].f19465Z, pointProjFullArr[1].f19466X);
        this.engine.fpx.fp2sub(jArr4, jArr5, pointProjFullArr[1].f19467Y);
        Fpx fpx = this.engine.fpx;
        long[][] jArr7 = pointProjArr[1].f19464X;
        long[][] jArr8 = pointProjFullArr[1].f19467Y;
        fpx.fp2mul_mont(jArr7, jArr8, jArr8);
        this.engine.fpx.fp2add(jArr6, pointProjFullArr[1].f19466X, jArr6);
        this.engine.fpx.fp2mul_mont(pointProjArr[2].f19465Z, jArr6, jArr6);
        this.engine.fpx.fp2mul_mont(jArr, jArr3, pointProjFullArr[1].f19466X);
        this.engine.fpx.fp2sub(jArr2, jArr3, pointProjFullArr[1].f19468Z);
        this.engine.fpx.fp2mul_mont(pointProjFullArr[0].f19466X, pointProjFullArr[1].f19468Z, jArr2);
        this.engine.fpx.fp2add(jArr4, pointProjFullArr[1].f19466X, jArr3);
        this.engine.fpx.fp2add(jArr3, jArr3, jArr3);
        this.engine.fpx.fp2sub(jArr2, jArr3, jArr2);
        this.engine.fpx.fp2mul_mont(pointProjArr[1].f19465Z, jArr2, jArr2);
        this.engine.fpx.fp2sub(jArr2, jArr6, jArr2);
        this.engine.fpx.fp2mul_mont(pointProjFullArr[0].f19466X, jArr2, jArr2);
        Fpx fpx2 = this.engine.fpx;
        long[][] jArr9 = pointProjFullArr[1].f19467Y;
        fpx2.fp2add(jArr2, jArr9, jArr9);
        this.engine.fpx.fp2mul_mont(pointProjFullArr[0].f19467Y, jArr5, jArr2);
        this.engine.fpx.fp2mul_mont(pointProjArr[1].f19464X, jArr2, pointProjFullArr[1].f19466X);
        Fpx fpx3 = this.engine.fpx;
        long[][] jArr10 = pointProjFullArr[1].f19466X;
        fpx3.fp2add(jArr10, jArr10, jArr10);
        this.engine.fpx.fp2mul_mont(pointProjArr[1].f19465Z, jArr2, pointProjFullArr[1].f19468Z);
        Fpx fpx4 = this.engine.fpx;
        long[][] jArr11 = pointProjFullArr[1].f19468Z;
        fpx4.fp2add(jArr11, jArr11, jArr11);
        this.engine.fpx.fp2inv_mont_bingcd(pointProjFullArr[1].f19468Z);
        Fpx fpx5 = this.engine.fpx;
        PointProjFull pointProjFull = pointProjFullArr[1];
        long[][] jArr12 = pointProjFull.f19466X;
        fpx5.fp2mul_mont(jArr12, pointProjFull.f19468Z, jArr12);
        Fpx fpx6 = this.engine.fpx;
        PointProjFull pointProjFull2 = pointProjFullArr[1];
        long[][] jArr13 = pointProjFull2.f19467Y;
        fpx6.fp2mul_mont(jArr13, pointProjFull2.f19468Z, jArr13);
    }

    public void SecondPoint3n(long[][] jArr, long[][][][] jArr2, long[][] jArr3, PointProjFull pointProjFull, int[] iArr, byte[] bArr, byte[] bArr2) {
        PointProj pointProj = new PointProj(this.engine.params.NWORDS_FIELD);
        long[] jArr4 = new long[this.engine.params.NWORDS_FIELD];
        boolean z2 = false;
        while (!z2) {
            bArr2[0] = 0;
            Elligator2(jArr, iArr, 1, jArr3, bArr2, 0, 0);
            this.engine.fpx.fp2copy(jArr3, pointProj.f19464X);
            SIKEEngine sIKEEngine = this.engine;
            sIKEEngine.fpx.fpcopy(sIKEEngine.params.Montgomery_one, 0, pointProj.f19465Z[0]);
            this.engine.fpx.fpcopy(jArr4, 0, pointProj.f19465Z[1]);
            eval_full_dual_4_isog(jArr2, pointProj);
            boolean SecondPoint_dual = SecondPoint_dual(pointProj, pointProjFull, bArr);
            iArr[1] = iArr[1] + 1;
            z2 = SecondPoint_dual;
        }
    }

    public void Tate3_proj(PointProjFull pointProjFull, PointProjFull pointProjFull2, long[][] jArr, long[][] jArr2) {
        int[] iArr = {2, this.engine.params.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr3 = (long[][]) Array.newInstance((Class<?>) cls, iArr);
        long[][] jArr4 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        TripleAndParabola_proj(pointProjFull, jArr4, jArr2);
        this.engine.fpx.fp2sub(pointProjFull2.f19466X, pointProjFull.f19466X, jArr);
        this.engine.fpx.fp2mul_mont(jArr4, jArr, jArr);
        this.engine.fpx.fp2sub(pointProjFull.f19467Y, pointProjFull2.f19467Y, jArr3);
        this.engine.fpx.fp2mul_mont(jArr2, jArr3, jArr3);
        this.engine.fpx.fp2add(jArr, jArr3, jArr);
    }

    public void Traverse_w_div_e_fullsigned(long[][] jArr, int i3, int i10, int i11, int[] iArr, long[] jArr2, int[] iArr2, int i12, int i13, int i14) {
        int i15;
        int[] iArr3 = {2, this.engine.params.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr3 = (long[][]) Array.newInstance((Class<?>) cls, iArr3);
        long[][] jArr4 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        if (i11 > 1) {
            int i16 = iArr[i11];
            this.engine.fpx.fp2copy(jArr, jArr3);
            int i17 = 0;
            while (true) {
                i15 = i11 - i16;
                if (i17 >= i15) {
                    break;
                }
                if ((i13 & 1) == 0) {
                    for (int i18 = 0; i18 < i14; i18++) {
                        SIKEEngine sIKEEngine = this.engine;
                        sIKEEngine.fpx.sqr_Fp2_cycl(jArr3, sIKEEngine.params.Montgomery_one);
                    }
                } else {
                    for (int i19 = 0; i19 < i14; i19++) {
                        SIKEEngine sIKEEngine2 = this.engine;
                        sIKEEngine2.fpx.cube_Fp2_cycl(jArr3, sIKEEngine2.params.Montgomery_one);
                    }
                }
                i17++;
            }
            Traverse_w_div_e_fullsigned(jArr3, i3 + i15, i10, i16, iArr, jArr2, iArr2, i12, i13, i14);
            this.engine.fpx.fp2copy(jArr, jArr3);
            int i20 = i10;
            while (true) {
                int i21 = i10 + i16;
                if (i20 >= i21) {
                    Traverse_w_div_e_fullsigned(jArr3, i3, i21, i15, iArr, jArr2, iArr2, i12, i13, i14);
                    return;
                }
                int i22 = iArr2[i20];
                if (i22 != 0) {
                    SIKEEngine sIKEEngine3 = this.engine;
                    Fpx fpx = sIKEEngine3.fpx;
                    int i23 = sIKEEngine3.params.NWORDS_FIELD;
                    int i24 = (i13 / 2) * (i3 + i20);
                    if (i22 < 0) {
                        fpx.fp2copy(jArr2, (((-i22) - 1) + i24) * 2 * i23, jArr4);
                        this.engine.fpx.fpnegPRIME(jArr4[1]);
                        this.engine.fpx.fp2mul_mont(jArr3, jArr4, jArr3);
                    } else {
                        fpx.fp2mul_mont(jArr3, jArr2, ((i22 - 1) + i24) * 2 * i23, jArr3);
                    }
                }
                i20++;
            }
        } else {
            this.engine.fpx.fp2copy(jArr, jArr3);
            this.engine.fpx.fp2correction(jArr3);
            if (this.engine.fpx.is_felm_zero(jArr3[1])) {
                long[] jArr5 = jArr3[0];
                Internal internal = this.engine.params;
                if (Fpx.subarrayEquals(jArr5, internal.Montgomery_one, internal.NWORDS_FIELD)) {
                    iArr2[i10] = 0;
                    return;
                }
            }
            int i25 = 1;
            while (true) {
                int i26 = i13 / 2;
                if (i25 > i26) {
                    return;
                }
                int i27 = this.engine.params.NWORDS_FIELD;
                int i28 = ((i25 - 1) + ((i12 - 1) * i26)) * 2;
                if (Fpx.subarrayEquals(jArr3, jArr2, i27 * i28, i27 * 2)) {
                    iArr2[i10] = -i25;
                    return;
                }
                SIKEEngine sIKEEngine4 = this.engine;
                sIKEEngine4.fpx.fp2copy(jArr2, sIKEEngine4.params.NWORDS_FIELD * i28, jArr4);
                this.engine.fpx.fpnegPRIME(jArr4[1]);
                this.engine.fpx.fpcorrectionPRIME(jArr4[1]);
                if (Fpx.subarrayEquals(jArr3, jArr4, this.engine.params.NWORDS_FIELD * 2)) {
                    iArr2[i10] = i25;
                    return;
                }
                i25++;
            }
        }
    }

    public void Traverse_w_notdiv_e_fullsigned(long[][] jArr, int i3, int i10, int i11, int[] iArr, long[] jArr2, long[] jArr3, int[] iArr2, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18;
        long[][] jArr4;
        int[] iArr3 = {2, this.engine.params.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr5 = (long[][]) Array.newInstance((Class<?>) cls, iArr3);
        long[][] jArr6 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        if (i11 > 1) {
            int i19 = iArr[i11];
            this.engine.fpx.fp2copy(jArr, jArr5);
            int i20 = i3 > 0 ? (i11 - i19) * i16 : (i17 % i16) + (((i11 - i19) - 1) * i16);
            for (int i21 = 0; i21 < i20; i21++) {
                if ((i13 & 1) == 0) {
                    SIKEEngine sIKEEngine = this.engine;
                    sIKEEngine.fpx.sqr_Fp2_cycl(jArr5, sIKEEngine.params.Montgomery_one);
                } else {
                    SIKEEngine sIKEEngine2 = this.engine;
                    sIKEEngine2.fpx.cube_Fp2_cycl(jArr5, sIKEEngine2.params.Montgomery_one);
                }
            }
            int i22 = i11 - i19;
            long[][] jArr7 = jArr6;
            Traverse_w_notdiv_e_fullsigned(jArr5, i3 + i22, i10, i19, iArr, jArr2, jArr3, iArr2, i12, i13, i14, i15, i16, i17);
            this.engine.fpx.fp2copy(jArr, jArr5);
            int i23 = i10;
            while (true) {
                int i24 = i10 + i19;
                if (i23 >= i24) {
                    Traverse_w_notdiv_e_fullsigned(jArr5, i3, i24, i22, iArr, jArr2, jArr3, iArr2, i12, i13, i14, i15, i16, i17);
                    return;
                }
                int i25 = iArr2[i23];
                if (i25 == 0) {
                    jArr4 = jArr7;
                } else if (i3 <= 0) {
                    jArr4 = jArr7;
                    SIKEEngine sIKEEngine3 = this.engine;
                    Fpx fpx = sIKEEngine3.fpx;
                    int i26 = sIKEEngine3.params.NWORDS_FIELD;
                    int i27 = (i14 / 2) * (i3 + i23);
                    if (i25 < 0) {
                        fpx.fp2copy(jArr2, (((-i25) - 1) + i27) * 2 * i26, jArr4);
                        this.engine.fpx.fpnegPRIME(jArr4[1]);
                        this.engine.fpx.fp2mul_mont(jArr5, jArr4, jArr5);
                    } else {
                        fpx.fp2mul_mont(jArr5, jArr2, ((i25 - 1) + i27) * 2 * i26, jArr5);
                    }
                } else if (i25 < 0) {
                    SIKEEngine sIKEEngine4 = this.engine;
                    jArr4 = jArr7;
                    sIKEEngine4.fpx.fp2copy(jArr3, ((((-i25) - 1) * 2) + ((i14 / 2) * (i3 + i23) * 2)) * sIKEEngine4.params.NWORDS_FIELD, jArr4);
                    this.engine.fpx.fpnegPRIME(jArr4[1]);
                    this.engine.fpx.fp2mul_mont(jArr5, jArr4, jArr5);
                } else {
                    jArr4 = jArr7;
                    SIKEEngine sIKEEngine5 = this.engine;
                    sIKEEngine5.fpx.fp2mul_mont(jArr5, jArr3, ((i25 - 1) + ((i14 / 2) * (i3 + i23))) * 2 * sIKEEngine5.params.NWORDS_FIELD, jArr5);
                }
                i23++;
                jArr7 = jArr4;
            }
        } else {
            this.engine.fpx.fp2copy(jArr, jArr5);
            this.engine.fpx.fp2correction(jArr5);
            if (this.engine.fpx.is_felm_zero(jArr5[1])) {
                long[] jArr8 = jArr5[0];
                Internal internal = this.engine.params;
                if (Fpx.subarrayEquals(jArr8, internal.Montgomery_one, internal.NWORDS_FIELD)) {
                    iArr2[i10] = 0;
                    return;
                }
            }
            if (i3 == 0 && i10 == i12 - 1) {
                for (int i28 = 1; i28 <= i15 / 2; i28++) {
                    int i29 = this.engine.params.NWORDS_FIELD;
                    int i30 = i14 / 2;
                    int i31 = i28 - 1;
                    if (Fpx.subarrayEquals(jArr5, jArr2, ((i31 * 2) + (i30 * 2 * i18)) * i29, i29 * 2)) {
                        iArr2[i10] = -i28;
                        return;
                    }
                    SIKEEngine sIKEEngine6 = this.engine;
                    sIKEEngine6.fpx.fp2copy(jArr2, ((i30 * i18) + i31) * 2 * sIKEEngine6.params.NWORDS_FIELD, jArr6);
                    this.engine.fpx.fpnegPRIME(jArr6[1]);
                    this.engine.fpx.fpcorrectionPRIME(jArr6[1]);
                    if (Fpx.subarrayEquals(jArr5, jArr6, this.engine.params.NWORDS_FIELD * 2)) {
                        iArr2[i10] = i28;
                        return;
                    }
                }
                return;
            }
            int i32 = 1;
            while (true) {
                int i33 = i14 / 2;
                if (i32 > i33) {
                    return;
                }
                int i34 = this.engine.params.NWORDS_FIELD;
                int i35 = i12 - 1;
                int i36 = i32 - 1;
                if (Fpx.subarrayEquals(jArr5, jArr3, ((i36 * 2) + (i33 * 2 * i35)) * i34, i34 * 2)) {
                    iArr2[i10] = -i32;
                    return;
                }
                SIKEEngine sIKEEngine7 = this.engine;
                sIKEEngine7.fpx.fp2copy(jArr3, ((i33 * i35) + i36) * 2 * sIKEEngine7.params.NWORDS_FIELD, jArr6);
                this.engine.fpx.fpnegPRIME(jArr6[1]);
                this.engine.fpx.fpcorrectionPRIME(jArr6[1]);
                if (Fpx.subarrayEquals(jArr5, jArr6, this.engine.params.NWORDS_FIELD * 2)) {
                    iArr2[i10] = i32;
                    return;
                }
                i32++;
            }
        }
    }

    public void TripleAndParabola_proj(PointProjFull pointProjFull, long[][] jArr, long[][] jArr2) {
        this.engine.fpx.fp2sqr_mont(pointProjFull.f19466X, jArr2);
        this.engine.fpx.fp2add(jArr2, jArr2, jArr);
        this.engine.fpx.fp2add(jArr, jArr2, jArr);
        SIKEEngine sIKEEngine = this.engine;
        Fpx fpx = sIKEEngine.fpx;
        long[] jArr3 = jArr[0];
        fpx.fpaddPRIME(jArr3, sIKEEngine.params.Montgomery_one, jArr3);
        Fpx fpx2 = this.engine.fpx;
        long[][] jArr4 = pointProjFull.f19467Y;
        fpx2.fp2add(jArr4, jArr4, jArr2);
    }

    public void eval_dual_2_isog(long[][] jArr, long[][] jArr2, PointProj pointProj) {
        long[][] jArr3 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 2, this.engine.params.NWORDS_FIELD);
        this.engine.fpx.fp2add(pointProj.f19464X, pointProj.f19465Z, jArr3);
        Fpx fpx = this.engine.fpx;
        long[][] jArr4 = pointProj.f19464X;
        long[][] jArr5 = pointProj.f19465Z;
        fpx.fp2sub(jArr4, jArr5, jArr5);
        this.engine.fpx.fp2sqr_mont(jArr3, jArr3);
        Fpx fpx2 = this.engine.fpx;
        long[][] jArr6 = pointProj.f19465Z;
        fpx2.fp2sqr_mont(jArr6, jArr6);
        Fpx fpx3 = this.engine.fpx;
        long[][] jArr7 = pointProj.f19465Z;
        fpx3.fp2sub(jArr3, jArr7, jArr7);
        Fpx fpx4 = this.engine.fpx;
        long[][] jArr8 = pointProj.f19465Z;
        fpx4.fp2mul_mont(jArr, jArr8, jArr8);
        this.engine.fpx.fp2mul_mont(jArr2, jArr3, pointProj.f19464X);
    }

    public void eval_dual_4_isog(long[][] jArr, long[][] jArr2, long[][][] jArr3, int i3, PointProj pointProj) {
        int[] iArr = {2, this.engine.params.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr4 = (long[][]) Array.newInstance((Class<?>) cls, iArr);
        long[][] jArr5 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr6 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr7 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        this.engine.fpx.fp2add(pointProj.f19464X, pointProj.f19465Z, jArr4);
        this.engine.fpx.fp2sub(pointProj.f19464X, pointProj.f19465Z, jArr5);
        this.engine.fpx.fp2sqr_mont(jArr4, jArr4);
        this.engine.fpx.fp2sqr_mont(jArr5, jArr5);
        this.engine.fpx.fp2sub(jArr4, jArr5, jArr6);
        this.engine.fpx.fp2sub(jArr2, jArr, jArr7);
        this.engine.fpx.fp2mul_mont(jArr6, jArr7, jArr7);
        this.engine.fpx.fp2mul_mont(jArr2, jArr4, jArr6);
        this.engine.fpx.fp2sub(jArr6, jArr7, jArr6);
        this.engine.fpx.fp2mul_mont(jArr6, jArr4, pointProj.f19464X);
        this.engine.fpx.fp2mul_mont(jArr7, jArr5, pointProj.f19465Z);
        Fpx fpx = this.engine.fpx;
        long[][] jArr8 = jArr3[i3];
        long[][] jArr9 = pointProj.f19464X;
        fpx.fp2mul_mont(jArr8, jArr9, jArr9);
        this.engine.fpx.fp2mul_mont(jArr3[i3 + 1], pointProj.f19465Z, jArr4);
        Fpx fpx2 = this.engine.fpx;
        long[][] jArr10 = pointProj.f19464X;
        fpx2.fp2add(jArr10, jArr4, jArr10);
        Fpx fpx3 = this.engine.fpx;
        long[][] jArr11 = jArr3[i3 + 2];
        long[][] jArr12 = pointProj.f19465Z;
        fpx3.fp2mul_mont(jArr11, jArr12, jArr12);
    }

    public void eval_dual_4_isog_shared(long[][] jArr, long[][] jArr2, long[][] jArr3, long[][][] jArr4, int i3) {
        this.engine.fpx.fp2sub(jArr2, jArr3, jArr4[i3]);
        int i10 = i3 + 1;
        this.engine.fpx.fp2add(jArr2, jArr3, jArr4[i10]);
        int i11 = i3 + 2;
        this.engine.fpx.fp2sqr_mont(jArr, jArr4[i11]);
        Fpx fpx = this.engine.fpx;
        long[][] jArr5 = jArr4[i11];
        fpx.fp2sub(jArr5, jArr4[i10], jArr5);
    }

    public void eval_final_dual_2_isog(PointProj pointProj) {
        int[] iArr = {2, this.engine.params.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr = (long[][]) Array.newInstance((Class<?>) cls, iArr);
        long[][] jArr2 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        SIKEEngine sIKEEngine = this.engine;
        long[] jArr3 = new long[sIKEEngine.params.NWORDS_FIELD];
        sIKEEngine.fpx.fp2add(pointProj.f19464X, pointProj.f19465Z, jArr);
        this.engine.fpx.fp2mul_mont(pointProj.f19464X, pointProj.f19465Z, jArr2);
        this.engine.fpx.fp2sqr_mont(jArr, pointProj.f19464X);
        this.engine.fpx.fpcopy(pointProj.f19464X[0], 0, jArr3);
        Fpx fpx = this.engine.fpx;
        long[][] jArr4 = pointProj.f19464X;
        fpx.fpcopy(jArr4[1], 0, jArr4[0]);
        this.engine.fpx.fpcopy(jArr3, 0, pointProj.f19464X[1]);
        this.engine.fpx.fpnegPRIME(pointProj.f19464X[1]);
        this.engine.fpx.fp2add(jArr2, jArr2, pointProj.f19465Z);
        Fpx fpx2 = this.engine.fpx;
        long[][] jArr5 = pointProj.f19465Z;
        fpx2.fp2add(jArr5, jArr5, jArr5);
    }

    public void eval_full_dual_4_isog(long[][][][] jArr, PointProj pointProj) {
        Internal internal;
        int i3;
        int i10 = 0;
        while (true) {
            internal = this.engine.params;
            i3 = internal.MAX_Alice;
            if (i10 >= i3) {
                break;
            }
            eval_dual_4_isog(jArr[i3 - i10][0], jArr[i3 - i10][1], jArr[(i3 - i10) - 1], 2, pointProj);
            i10++;
        }
        if (internal.OALICE_BITS % 2 == 1) {
            long[][][] jArr2 = jArr[i3];
            eval_dual_2_isog(jArr2[2], jArr2[3], pointProj);
        }
        eval_final_dual_2_isog(pointProj);
    }

    public void get_4_isog_dual(PointProj pointProj, long[][] jArr, long[][] jArr2, long[][][] jArr3) {
        this.engine.fpx.fp2sub(pointProj.f19464X, pointProj.f19465Z, jArr3[1]);
        this.engine.fpx.fp2add(pointProj.f19464X, pointProj.f19465Z, jArr3[2]);
        this.engine.fpx.fp2sqr_mont(pointProj.f19465Z, jArr3[4]);
        Fpx fpx = this.engine.fpx;
        long[][] jArr4 = jArr3[4];
        fpx.fp2add(jArr4, jArr4, jArr3[0]);
        this.engine.fpx.fp2sqr_mont(jArr3[0], jArr2);
        Fpx fpx2 = this.engine.fpx;
        long[][] jArr5 = jArr3[0];
        fpx2.fp2add(jArr5, jArr5, jArr5);
        this.engine.fpx.fp2sqr_mont(pointProj.f19464X, jArr3[3]);
        Fpx fpx3 = this.engine.fpx;
        long[][] jArr6 = jArr3[3];
        fpx3.fp2add(jArr6, jArr6, jArr);
        this.engine.fpx.fp2sqr_mont(jArr, jArr);
    }

    public void init_basis(long[] jArr, long[][] jArr2, long[][] jArr3, long[][] jArr4) {
        this.engine.fpx.fpcopy(jArr, 0, jArr2[0]);
        SIKEEngine sIKEEngine = this.engine;
        sIKEEngine.fpx.fpcopy(jArr, sIKEEngine.params.NWORDS_FIELD, jArr2[1]);
        SIKEEngine sIKEEngine2 = this.engine;
        sIKEEngine2.fpx.fpcopy(jArr, sIKEEngine2.params.NWORDS_FIELD * 2, jArr3[0]);
        SIKEEngine sIKEEngine3 = this.engine;
        sIKEEngine3.fpx.fpcopy(jArr, sIKEEngine3.params.NWORDS_FIELD * 3, jArr3[1]);
        SIKEEngine sIKEEngine4 = this.engine;
        sIKEEngine4.fpx.fpcopy(jArr, sIKEEngine4.params.NWORDS_FIELD * 4, jArr4[0]);
        SIKEEngine sIKEEngine5 = this.engine;
        sIKEEngine5.fpx.fpcopy(jArr, sIKEEngine5.params.NWORDS_FIELD * 5, jArr4[1]);
    }

    public void makeDiff(PointProjFull pointProjFull, PointProjFull pointProjFull2, PointProj pointProj) {
        int[] iArr = {2, this.engine.params.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr = (long[][]) Array.newInstance((Class<?>) cls, iArr);
        long[][] jArr2 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr3 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        SIKEEngine sIKEEngine = this.engine;
        int i3 = sIKEEngine.params.NWORDS_FIELD;
        sIKEEngine.fpx.fp2sub(pointProjFull.f19466X, pointProjFull2.f19466X, jArr);
        this.engine.fpx.fp2sub(pointProjFull.f19467Y, pointProjFull2.f19467Y, jArr2);
        this.engine.fpx.fp2sqr_mont(jArr, jArr);
        this.engine.fpx.fp2sqr_mont(jArr2, jArr2);
        this.engine.fpx.fp2add(pointProjFull.f19466X, pointProjFull2.f19466X, jArr3);
        this.engine.fpx.fp2mul_mont(jArr, jArr3, jArr3);
        this.engine.fpx.fp2sub(jArr2, jArr3, jArr2);
        this.engine.fpx.fp2mul_mont(pointProj.f19465Z, jArr2, jArr2);
        this.engine.fpx.fp2mul_mont(pointProj.f19464X, jArr, jArr);
        this.engine.fpx.fp2correction(jArr);
        this.engine.fpx.fp2correction(jArr2);
        if (Fpx.subarrayEquals(jArr[0], jArr2[0], i3) && Fpx.subarrayEquals(jArr[1], jArr2[1], i3)) {
            this.engine.fpx.fp2neg(pointProjFull2.f19467Y);
        }
    }

    public void make_positive(long[][] jArr) {
        SIKEEngine sIKEEngine = this.engine;
        int i3 = sIKEEngine.params.NWORDS_FIELD;
        sIKEEngine.fpx.from_fp2mont(jArr, jArr);
        if (Fpx.subarrayEquals(jArr[0], new long[i3], i3) ? (jArr[1][0] & 1) == 1 : (jArr[0][0] & 1) == 1) {
            this.engine.fpx.fp2neg(jArr);
        }
        this.engine.fpx.to_fp2mont(jArr, jArr);
    }

    public void random_mod_order_A(byte[] bArr, SecureRandom secureRandom) {
        byte[] bArr2 = new byte[this.engine.params.SECRETKEY_A_BYTES];
        secureRandom.nextBytes(bArr2);
        System.arraycopy(bArr2, 0, bArr, 0, this.engine.params.SECRETKEY_A_BYTES);
        bArr[0] = (byte) (bArr[0] & 254);
        Internal internal = this.engine.params;
        int i3 = internal.SECRETKEY_A_BYTES - 1;
        bArr[i3] = (byte) (internal.MASK_ALICE & bArr[i3]);
    }

    public void random_mod_order_B(byte[] bArr, SecureRandom secureRandom) {
        byte[] bArr2 = new byte[this.engine.params.SECRETKEY_B_BYTES];
        secureRandom.nextBytes(bArr2);
        System.arraycopy(bArr2, 0, bArr, 0, this.engine.params.SECRETKEY_A_BYTES);
        FormatPrivKey_B(bArr);
    }

    public void solve_dlog(long[][] jArr, int[] iArr, long[] jArr2, int i3) {
        SIDH_Compressed sIDH_Compressed;
        int[] iArr2;
        int i10;
        int i11;
        if (i3 == 2) {
            Internal internal = this.engine.params;
            int i12 = internal.OALICE_BITS;
            int i13 = internal.W_2;
            if (i12 % i13 == 0) {
                iArr2 = iArr;
                Traverse_w_div_e_fullsigned(jArr, 0, 0, internal.PLEN_2 - 1, internal.ph2_path, internal.ph2_T, iArr2, internal.DLEN_2, internal.ELL2_W, i13);
                sIDH_Compressed = this;
            } else {
                sIDH_Compressed = this;
                sIDH_Compressed.Traverse_w_notdiv_e_fullsigned(jArr, 0, 0, internal.PLEN_2 - 1, internal.ph2_path, internal.ph2_T1, internal.ph2_T2, iArr, internal.DLEN_2, i3, internal.ELL2_W, internal.ELL2_EMODW, i13, i12);
                iArr2 = iArr;
            }
            Internal internal2 = sIDH_Compressed.engine.params;
            i10 = internal2.DLEN_2;
            i11 = internal2.ELL2_W;
        } else {
            if (i3 != 3) {
                return;
            }
            Internal internal3 = this.engine.params;
            int i14 = internal3.OBOB_EXPON;
            int i15 = internal3.W_3;
            if (i14 % i15 == 0) {
                Traverse_w_div_e_fullsigned(jArr, 0, 0, internal3.PLEN_3 - 1, internal3.ph3_path, internal3.ph3_T, iArr, internal3.DLEN_3, internal3.ELL3_W, i15);
                sIDH_Compressed = this;
                iArr2 = iArr;
            } else {
                sIDH_Compressed = this;
                sIDH_Compressed.Traverse_w_notdiv_e_fullsigned(jArr, 0, 0, internal3.PLEN_3 - 1, internal3.ph3_path, internal3.ph3_T1, internal3.ph3_T2, iArr, internal3.DLEN_3, i3, internal3.ELL3_W, internal3.ELL3_EMODW, i15, i14);
                iArr2 = iArr;
            }
            Internal internal4 = sIDH_Compressed.engine.params;
            i10 = internal4.DLEN_3;
            i11 = internal4.ELL3_W;
        }
        sIDH_Compressed.from_base(iArr2, jArr2, i10, i11);
    }

    public byte validate_ciphertext(byte[] bArr, byte[] bArr2, byte[] bArr3, int i3, byte[] bArr4, int i10) {
        SIKEEngine sIKEEngine;
        Internal internal = this.engine.params;
        PointProj[] pointProjArr = new PointProj[internal.MAX_INT_POINTS_BOB];
        PointProj[] pointProjArr2 = {new PointProj(internal.NWORDS_FIELD), new PointProj(this.engine.params.NWORDS_FIELD), new PointProj(this.engine.params.NWORDS_FIELD)};
        PointProj pointProj = new PointProj(this.engine.params.NWORDS_FIELD);
        PointProj pointProj2 = new PointProj(this.engine.params.NWORDS_FIELD);
        int[] iArr = {2, this.engine.params.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr = (long[][]) Array.newInstance((Class<?>) cls, iArr);
        long[][] jArr2 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr3 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr4 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr5 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr6 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr7 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr8 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr9 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][][] jArr10 = (long[][][]) Array.newInstance((Class<?>) cls, 3, 2, this.engine.params.NWORDS_FIELD);
        SIKEEngine sIKEEngine2 = this.engine;
        Internal internal2 = sIKEEngine2.params;
        int[] iArr2 = new int[internal2.MAX_INT_POINTS_BOB];
        int i11 = internal2.NWORDS_ORDER;
        long[] jArr11 = new long[i11];
        long[] jArr12 = new long[i11];
        sIKEEngine2.fpx.fpcopy(internal2.Montgomery_one, 0, jArr9[0]);
        init_basis(this.engine.params.B_gen, jArr, jArr2, jArr3);
        this.engine.fpx.fp2_decode(bArr3, pointProjArr2[0].f19464X, i3);
        SIKEEngine sIKEEngine3 = this.engine;
        sIKEEngine3.fpx.fpcopy(sIKEEngine3.params.Montgomery_one, 0, pointProjArr2[0].f19465Z[0]);
        SIKEEngine sIKEEngine4 = this.engine;
        sIKEEngine4.fpx.fpcopy(sIKEEngine4.params.Montgomery_one, 0, jArr4[0]);
        this.engine.fpx.fp2add(jArr4, jArr4, jArr4);
        this.engine.fpx.fp2add(jArr4, jArr4, jArr5);
        this.engine.fpx.fp2add(jArr4, jArr5, jArr6);
        this.engine.fpx.fp2add(jArr5, jArr5, jArr4);
        SIKEEngine sIKEEngine5 = this.engine;
        Fpx fpx = sIKEEngine5.fpx;
        Internal internal3 = sIKEEngine5.params;
        fpx.decode_to_digits(bArr, 0, jArr12, internal3.SECRETKEY_B_BYTES, internal3.NWORDS_ORDER);
        SIKEEngine sIKEEngine6 = this.engine;
        Isogeny isogeny = sIKEEngine6.isogeny;
        int i12 = sIKEEngine6.params.BOB;
        long[][] jArr13 = jArr4;
        isogeny.LADDER3PT(jArr, jArr2, jArr3, jArr12, i12, pointProj, jArr6);
        int i13 = 1;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            SIKEEngine sIKEEngine7 = this.engine;
            if (i13 >= sIKEEngine7.params.MAX_Bob) {
                sIKEEngine7.isogeny.get_3_isog(pointProj, jArr5, jArr13, jArr10);
                this.engine.isogeny.eval_3_isog(pointProjArr2[0], jArr10);
                SIKEEngine sIKEEngine8 = this.engine;
                sIKEEngine8.fpx.fp2_decode(bArr2, jArr6, sIKEEngine8.params.ORDER_A_ENCODED_BYTES * 4);
                this.engine.fpx.fp2_decode(bArr4, pointProj2.f19464X, i10);
                SIKEEngine sIKEEngine9 = this.engine;
                sIKEEngine9.fpx.fp2_decode(bArr4, pointProj2.f19465Z, sIKEEngine9.params.FP2_ENCODED_BYTES + i10);
                SIKEEngine sIKEEngine10 = this.engine;
                Fpx fpx2 = sIKEEngine10.fpx;
                Internal internal4 = sIKEEngine10.params;
                fpx2.decode_to_digits(bArr4, (internal4.FP2_ENCODED_BYTES * 2) + i10, jArr11, internal4.ORDER_A_ENCODED_BYTES, internal4.NWORDS_ORDER);
                SIKEEngine sIKEEngine11 = this.engine;
                sIKEEngine11.isogeny.Ladder(pointProjArr2[0], jArr11, jArr6, sIKEEngine11.params.OALICE_BITS, pointProj);
                this.engine.fpx.fp2mul_mont(pointProj.f19464X, pointProj2.f19465Z, jArr7);
                this.engine.fpx.fp2mul_mont(pointProj.f19465Z, pointProj2.f19464X, jArr8);
                return this.engine.fpx.cmp_f2elm(jArr7, jArr8);
            }
            while (true) {
                sIKEEngine = this.engine;
                Internal internal5 = sIKEEngine.params;
                if (i14 >= internal5.MAX_Bob - i13) {
                    break;
                }
                PointProj pointProj3 = new PointProj(internal5.NWORDS_FIELD);
                pointProjArr[i15] = pointProj3;
                this.engine.fpx.fp2copy(pointProj.f19464X, pointProj3.f19464X);
                this.engine.fpx.fp2copy(pointProj.f19465Z, pointProjArr[i15].f19465Z);
                int i17 = i15 + 1;
                iArr2[i15] = i14;
                SIKEEngine sIKEEngine12 = this.engine;
                int i18 = sIKEEngine12.params.strat_Bob[i16];
                long[][] jArr14 = jArr13;
                sIKEEngine12.isogeny.xTPLe(pointProj, pointProj, jArr5, jArr14, i18);
                i14 += i18;
                jArr13 = jArr14;
                i15 = i17;
                i16++;
            }
            long[][] jArr15 = jArr13;
            sIKEEngine.isogeny.get_3_isog(pointProj, jArr5, jArr15, jArr10);
            for (int i19 = 0; i19 < i15; i19++) {
                this.engine.isogeny.eval_3_isog(pointProjArr[i19], jArr10);
            }
            this.engine.isogeny.eval_3_isog(pointProjArr2[0], jArr10);
            int i20 = i15 - 1;
            this.engine.fpx.fp2copy(pointProjArr[i20].f19464X, pointProj.f19464X);
            this.engine.fpx.fp2copy(pointProjArr[i20].f19465Z, pointProj.f19465Z);
            i14 = iArr2[i20];
            i15--;
            i13++;
            jArr13 = jArr15;
        }
    }
}
