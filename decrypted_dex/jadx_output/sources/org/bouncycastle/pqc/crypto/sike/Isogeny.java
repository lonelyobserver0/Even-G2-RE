package org.bouncycastle.pqc.crypto.sike;

import java.lang.reflect.Array;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Isogeny {
    SIKEEngine engine;

    public Isogeny(SIKEEngine sIKEEngine) {
        this.engine = sIKEEngine;
    }

    private void xDBLADD_proj(PointProj pointProj, PointProj pointProj2, long[][] jArr, long[][] jArr2, long[][] jArr3) {
        int[] iArr = {2, this.engine.params.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr4 = (long[][]) Array.newInstance((Class<?>) cls, iArr);
        long[][] jArr5 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr6 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        this.engine.fpx.fp2add(pointProj.f19464X, pointProj.f19465Z, jArr4);
        this.engine.fpx.fp2sub(pointProj.f19464X, pointProj.f19465Z, jArr5);
        this.engine.fpx.fp2sqr_mont(jArr4, pointProj.f19464X);
        this.engine.fpx.fp2sub(pointProj2.f19464X, pointProj2.f19465Z, jArr6);
        this.engine.fpx.fp2correction(jArr6);
        Fpx fpx = this.engine.fpx;
        long[][] jArr7 = pointProj2.f19464X;
        fpx.fp2add(jArr7, pointProj2.f19465Z, jArr7);
        this.engine.fpx.fp2mul_mont(jArr4, jArr6, jArr4);
        this.engine.fpx.fp2sqr_mont(jArr5, pointProj.f19465Z);
        this.engine.fpx.fp2mul_mont(jArr5, pointProj2.f19464X, jArr5);
        this.engine.fpx.fp2sub(pointProj.f19464X, pointProj.f19465Z, jArr6);
        Fpx fpx2 = this.engine.fpx;
        long[][] jArr8 = pointProj.f19464X;
        fpx2.fp2mul_mont(jArr8, pointProj.f19465Z, jArr8);
        this.engine.fpx.fp2mul_mont(jArr6, jArr3, pointProj2.f19464X);
        this.engine.fpx.fp2sub(jArr4, jArr5, pointProj2.f19465Z);
        Fpx fpx3 = this.engine.fpx;
        long[][] jArr9 = pointProj2.f19464X;
        long[][] jArr10 = pointProj.f19465Z;
        fpx3.fp2add(jArr9, jArr10, jArr10);
        this.engine.fpx.fp2add(jArr4, jArr5, pointProj2.f19464X);
        Fpx fpx4 = this.engine.fpx;
        long[][] jArr11 = pointProj.f19465Z;
        fpx4.fp2mul_mont(jArr11, jArr6, jArr11);
        Fpx fpx5 = this.engine.fpx;
        long[][] jArr12 = pointProj2.f19465Z;
        fpx5.fp2sqr_mont(jArr12, jArr12);
        Fpx fpx6 = this.engine.fpx;
        long[][] jArr13 = pointProj2.f19464X;
        fpx6.fp2sqr_mont(jArr13, jArr13);
        Fpx fpx7 = this.engine.fpx;
        long[][] jArr14 = pointProj2.f19464X;
        fpx7.fp2mul_mont(jArr14, jArr2, jArr14);
        Fpx fpx8 = this.engine.fpx;
        long[][] jArr15 = pointProj2.f19465Z;
        fpx8.fp2mul_mont(jArr15, jArr, jArr15);
    }

    private void xDBL_e(PointProj pointProj, PointProj pointProj2, long[][] jArr, int i3) {
        int[] iArr = {2, this.engine.params.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr2 = (long[][]) Array.newInstance((Class<?>) cls, iArr);
        long[][] jArr3 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr4 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr5 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr6 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr7 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        this.engine.fpx.fp2copy(pointProj.f19464X, pointProj2.f19464X);
        this.engine.fpx.fp2copy(pointProj.f19465Z, pointProj2.f19465Z);
        for (int i10 = 0; i10 < i3; i10++) {
            this.engine.fpx.fp2add(pointProj2.f19464X, pointProj2.f19465Z, jArr3);
            this.engine.fpx.fp2sub(pointProj2.f19464X, pointProj2.f19465Z, jArr4);
            this.engine.fpx.fp2sqr_mont(jArr3, jArr6);
            this.engine.fpx.fp2sqr_mont(jArr4, jArr7);
            this.engine.fpx.fp2sub(jArr6, jArr7, jArr5);
            this.engine.fpx.fp2mul_mont(jArr6, jArr7, pointProj2.f19464X);
            this.engine.fpx.fp2mul_mont(jArr, jArr5, jArr2);
            this.engine.fpx.fp2add(jArr2, jArr7, jArr2);
            this.engine.fpx.fp2mul_mont(jArr5, jArr2, pointProj2.f19465Z);
        }
    }

    private void xTPL(PointProj pointProj, PointProj pointProj2, long[][] jArr, long[][] jArr2) {
        int[] iArr = {2, this.engine.params.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr3 = (long[][]) Array.newInstance((Class<?>) cls, iArr);
        long[][] jArr4 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr5 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr6 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr7 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr8 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr9 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        this.engine.fpx.mp2_sub_p2(pointProj.f19464X, pointProj.f19465Z, jArr3);
        this.engine.fpx.fp2sqr_mont(jArr3, jArr5);
        this.engine.fpx.mp2_add(pointProj.f19464X, pointProj.f19465Z, jArr4);
        this.engine.fpx.fp2sqr_mont(jArr4, jArr6);
        Fpx fpx = this.engine.fpx;
        long[][] jArr10 = pointProj.f19464X;
        fpx.mp2_add(jArr10, jArr10, jArr7);
        Fpx fpx2 = this.engine.fpx;
        long[][] jArr11 = pointProj.f19465Z;
        fpx2.mp2_add(jArr11, jArr11, jArr3);
        this.engine.fpx.fp2sqr_mont(jArr7, jArr4);
        this.engine.fpx.mp2_sub_p2(jArr4, jArr6, jArr4);
        this.engine.fpx.mp2_sub_p2(jArr4, jArr5, jArr4);
        this.engine.fpx.fp2mul_mont(jArr2, jArr6, jArr8);
        this.engine.fpx.fp2mul_mont(jArr6, jArr8, jArr6);
        this.engine.fpx.fp2mul_mont(jArr, jArr5, jArr9);
        this.engine.fpx.fp2mul_mont(jArr5, jArr9, jArr5);
        this.engine.fpx.mp2_sub_p2(jArr5, jArr6, jArr6);
        this.engine.fpx.mp2_sub_p2(jArr8, jArr9, jArr5);
        this.engine.fpx.fp2mul_mont(jArr4, jArr5, jArr4);
        this.engine.fpx.fp2add(jArr6, jArr4, jArr5);
        this.engine.fpx.fp2sqr_mont(jArr5, jArr5);
        this.engine.fpx.fp2mul_mont(jArr7, jArr5, pointProj2.f19464X);
        this.engine.fpx.fp2sub(jArr6, jArr4, jArr4);
        this.engine.fpx.fp2sqr_mont(jArr4, jArr4);
        this.engine.fpx.fp2mul_mont(jArr3, jArr4, pointProj2.f19465Z);
    }

    private void xTPL_fast(PointProj pointProj, PointProj pointProj2, long[][] jArr) {
        int[] iArr = {2, this.engine.params.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr2 = (long[][]) Array.newInstance((Class<?>) cls, iArr);
        long[][] jArr3 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr4 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr5 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        this.engine.fpx.fp2sqr_mont(pointProj.f19464X, jArr2);
        this.engine.fpx.fp2sqr_mont(pointProj.f19465Z, jArr3);
        this.engine.fpx.fp2add(jArr2, jArr3, jArr4);
        this.engine.fpx.fp2add(pointProj.f19464X, pointProj.f19465Z, jArr5);
        this.engine.fpx.fp2sqr_mont(jArr5, jArr5);
        this.engine.fpx.fp2sub(jArr5, jArr4, jArr5);
        this.engine.fpx.fp2mul_mont(jArr, jArr5, jArr5);
        this.engine.fpx.fp2add(jArr4, jArr5, jArr5);
        this.engine.fpx.fp2sub(jArr2, jArr3, jArr4);
        this.engine.fpx.fp2sqr_mont(jArr4, jArr4);
        this.engine.fpx.fp2mul_mont(jArr2, jArr5, jArr2);
        this.engine.fpx.fp2shl(jArr2, 2, jArr2);
        this.engine.fpx.fp2sub(jArr2, jArr4, jArr2);
        this.engine.fpx.fp2sqr_mont(jArr2, jArr2);
        this.engine.fpx.fp2mul_mont(jArr3, jArr5, jArr3);
        this.engine.fpx.fp2shl(jArr3, 2, jArr3);
        this.engine.fpx.fp2sub(jArr3, jArr4, jArr3);
        this.engine.fpx.fp2sqr_mont(jArr3, jArr3);
        this.engine.fpx.fp2mul_mont(pointProj.f19464X, jArr3, pointProj2.f19464X);
        this.engine.fpx.fp2mul_mont(pointProj.f19465Z, jArr2, pointProj2.f19465Z);
    }

    public void CompleteMPoint(long[][] jArr, PointProj pointProj, PointProjFull pointProjFull) {
        int[] iArr = {2, this.engine.params.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr2 = (long[][]) Array.newInstance((Class<?>) cls, iArr);
        long[][] jArr3 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr4 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr5 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr6 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr7 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr8 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr9 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr10 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        SIKEEngine sIKEEngine = this.engine;
        sIKEEngine.fpx.fpcopy(sIKEEngine.params.Montgomery_one, 0, jArr3[0]);
        if (Fpx.subarrayEquals(pointProj.f19465Z[0], jArr2[0], this.engine.params.NWORDS_FIELD) && Fpx.subarrayEquals(pointProj.f19465Z[1], jArr2[1], this.engine.params.NWORDS_FIELD)) {
            this.engine.fpx.fp2copy(jArr2, pointProjFull.f19466X);
            this.engine.fpx.fp2copy(jArr3, pointProjFull.f19467Y);
            this.engine.fpx.fp2copy(jArr2, pointProjFull.f19468Z);
            return;
        }
        this.engine.fpx.fp2mul_mont(pointProj.f19464X, pointProj.f19465Z, jArr4);
        this.engine.fpx.fpsubPRIME(pointProj.f19464X[0], pointProj.f19465Z[1], jArr9[0]);
        this.engine.fpx.fpaddPRIME(pointProj.f19464X[1], pointProj.f19465Z[0], jArr9[1]);
        this.engine.fpx.fpaddPRIME(pointProj.f19464X[0], pointProj.f19465Z[1], jArr10[0]);
        this.engine.fpx.fpsubPRIME(pointProj.f19464X[1], pointProj.f19465Z[0], jArr10[1]);
        this.engine.fpx.fp2mul_mont(jArr9, jArr10, jArr6);
        this.engine.fpx.fp2mul_mont(jArr, jArr4, jArr9);
        this.engine.fpx.fp2add(jArr9, jArr6, jArr10);
        this.engine.fpx.fp2mul_mont(jArr4, jArr10, jArr7);
        this.engine.fpx.sqrt_Fp2(jArr7, jArr5);
        this.engine.fpx.fp2copy(pointProj.f19465Z, jArr8);
        this.engine.fpx.fp2inv_mont_bingcd(jArr8);
        this.engine.fpx.fp2mul_mont(pointProj.f19464X, jArr8, pointProjFull.f19466X);
        this.engine.fpx.fp2sqr_mont(jArr8, jArr9);
        this.engine.fpx.fp2mul_mont(jArr5, jArr9, pointProjFull.f19467Y);
        this.engine.fpx.fp2copy(jArr3, pointProjFull.f19468Z);
    }

    public void CompletePoint(PointProj pointProj, PointProjFull pointProjFull) {
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
        SIKEEngine sIKEEngine = this.engine;
        sIKEEngine.fpx.fpcopy(sIKEEngine.params.Montgomery_one, 0, jArr8[0]);
        this.engine.fpx.fp2mul_mont(pointProj.f19464X, pointProj.f19465Z, jArr);
        this.engine.fpx.fpsubPRIME(pointProj.f19464X[0], pointProj.f19465Z[1], jArr6[0]);
        this.engine.fpx.fpaddPRIME(pointProj.f19464X[1], pointProj.f19465Z[0], jArr6[1]);
        this.engine.fpx.fpaddPRIME(pointProj.f19464X[0], pointProj.f19465Z[1], jArr7[0]);
        this.engine.fpx.fpsubPRIME(pointProj.f19464X[1], pointProj.f19465Z[0], jArr7[1]);
        this.engine.fpx.fp2mul_mont(jArr6, jArr7, jArr2);
        this.engine.fpx.fp2mul_mont(jArr, jArr2, jArr3);
        this.engine.fpx.sqrt_Fp2(jArr3, jArr4);
        this.engine.fpx.fp2copy(pointProj.f19465Z, jArr5);
        this.engine.fpx.fp2inv_mont_bingcd(jArr5);
        this.engine.fpx.fp2mul_mont(pointProj.f19464X, jArr5, pointProjFull.f19466X);
        this.engine.fpx.fp2sqr_mont(jArr5, jArr6);
        this.engine.fpx.fp2mul_mont(jArr4, jArr6, pointProjFull.f19467Y);
        this.engine.fpx.fp2copy(jArr8, pointProjFull.f19468Z);
    }

    public void Double(PointProj pointProj, PointProj pointProj2, long[][] jArr, int i3) {
        int[] iArr = {2, this.engine.params.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr2 = (long[][]) Array.newInstance((Class<?>) cls, iArr);
        long[][] jArr3 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr4 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr5 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr6 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr7 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        this.engine.fpx.fp2copy(pointProj.f19464X, pointProj2.f19464X);
        this.engine.fpx.fp2copy(pointProj.f19465Z, pointProj2.f19465Z);
        for (int i10 = 0; i10 < i3; i10++) {
            this.engine.fpx.fp2add(pointProj2.f19464X, pointProj2.f19465Z, jArr3);
            this.engine.fpx.fp2sub(pointProj2.f19464X, pointProj2.f19465Z, jArr4);
            this.engine.fpx.fp2sqr_mont(jArr3, jArr6);
            this.engine.fpx.fp2sqr_mont(jArr4, jArr7);
            this.engine.fpx.fp2sub(jArr6, jArr7, jArr5);
            this.engine.fpx.fp2mul_mont(jArr6, jArr7, pointProj2.f19464X);
            this.engine.fpx.fp2mul_mont(jArr, jArr5, jArr2);
            this.engine.fpx.fp2add(jArr2, jArr7, jArr2);
            this.engine.fpx.fp2mul_mont(jArr5, jArr2, pointProj2.f19465Z);
        }
    }

    public void LADDER3PT(long[][] jArr, long[][] jArr2, long[][] jArr3, long[] jArr4, int i3, PointProj pointProj, long[][] jArr5) {
        PointProj pointProj2 = new PointProj(this.engine.params.NWORDS_FIELD);
        PointProj pointProj3 = new PointProj(this.engine.params.NWORDS_FIELD);
        int i10 = 0;
        long[][] jArr6 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 2, this.engine.params.NWORDS_FIELD);
        SIKEEngine sIKEEngine = this.engine;
        Internal internal = sIKEEngine.params;
        int i11 = i3 == internal.ALICE ? internal.OALICE_BITS : internal.OBOB_BITS - 1;
        sIKEEngine.fpx.fpcopy(internal.Montgomery_one, 0, jArr6[0]);
        this.engine.fpx.mp2_add(jArr6, jArr6, jArr6);
        this.engine.fpx.mp2_add(jArr5, jArr6, jArr6);
        this.engine.fpx.fp2div2(jArr6, jArr6);
        this.engine.fpx.fp2div2(jArr6, jArr6);
        this.engine.fpx.fp2copy(jArr2, pointProj2.f19464X);
        SIKEEngine sIKEEngine2 = this.engine;
        sIKEEngine2.fpx.fpcopy(sIKEEngine2.params.Montgomery_one, 0, pointProj2.f19465Z[0]);
        this.engine.fpx.fp2copy(jArr3, pointProj3.f19464X);
        SIKEEngine sIKEEngine3 = this.engine;
        sIKEEngine3.fpx.fpcopy(sIKEEngine3.params.Montgomery_one, 0, pointProj3.f19465Z[0]);
        this.engine.fpx.fp2copy(jArr, pointProj.f19464X);
        SIKEEngine sIKEEngine4 = this.engine;
        sIKEEngine4.fpx.fpcopy(sIKEEngine4.params.Montgomery_one, 0, pointProj.f19465Z[0]);
        this.engine.fpx.fpzero(pointProj.f19465Z[1]);
        int i12 = 0;
        while (i10 < i11) {
            int i13 = (int) ((jArr4[i10 >>> 6] >>> (i10 & 63)) & 1);
            swap_points(pointProj, pointProj3, 0 - (i12 ^ i13));
            xDBLADD(pointProj2, pointProj3, pointProj.f19464X, jArr6);
            Fpx fpx = this.engine.fpx;
            long[][] jArr7 = pointProj3.f19464X;
            fpx.fp2mul_mont(jArr7, pointProj.f19465Z, jArr7);
            i10++;
            i12 = i13;
        }
        swap_points(pointProj, pointProj3, 0 - i12);
    }

    public void Ladder(PointProj pointProj, long[] jArr, long[][] jArr2, int i3, PointProj pointProj2) {
        PointProj pointProj3 = new PointProj(this.engine.params.NWORDS_FIELD);
        PointProj pointProj4 = new PointProj(this.engine.params.NWORDS_FIELD);
        long[][] jArr3 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 2, this.engine.params.NWORDS_FIELD);
        SIKEEngine sIKEEngine = this.engine;
        sIKEEngine.fpx.fpcopy(sIKEEngine.params.Montgomery_one, 0, jArr3[0]);
        Fpx fpx = this.engine.fpx;
        long[] jArr4 = jArr3[0];
        fpx.fpaddPRIME(jArr4, jArr4, jArr4);
        this.engine.fpx.fp2add(jArr2, jArr3, jArr3);
        this.engine.fpx.fp2div2(jArr3, jArr3);
        this.engine.fpx.fp2div2(jArr3, jArr3);
        int i10 = i3 - 1;
        long j = jArr[i10 >> 6] >>> (i10 & 63);
        while (((int) (j & 1)) == 0) {
            i10--;
            j = jArr[i10 >> 6] >>> (i10 & 63);
        }
        this.engine.fpx.fp2copy(pointProj.f19464X, pointProj3.f19464X);
        this.engine.fpx.fp2copy(pointProj.f19465Z, pointProj3.f19465Z);
        xDBL_e(pointProj, pointProj4, jArr3, 1);
        int i11 = i10 - 1;
        int i12 = 0;
        while (i11 >= 0) {
            int i13 = (int) ((jArr[i11 >> 6] >>> (i11 & 63)) & 1);
            swap_points(pointProj3, pointProj4, 0 - (i12 ^ i13));
            long[][] jArr5 = jArr3;
            xDBLADD_proj(pointProj3, pointProj4, pointProj.f19464X, pointProj.f19465Z, jArr5);
            i11--;
            jArr3 = jArr5;
            i12 = i13;
        }
        swap_points(pointProj3, pointProj4, 0 - i12);
        this.engine.fpx.fp2copy(pointProj3.f19464X, pointProj2.f19464X);
        this.engine.fpx.fp2copy(pointProj3.f19465Z, pointProj2.f19465Z);
    }

    public void eval_2_isog(PointProj pointProj, PointProj pointProj2) {
        int[] iArr = {2, this.engine.params.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr = (long[][]) Array.newInstance((Class<?>) cls, iArr);
        long[][] jArr2 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr3 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr4 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        this.engine.fpx.mp2_add(pointProj2.f19464X, pointProj2.f19465Z, jArr);
        this.engine.fpx.mp2_sub_p2(pointProj2.f19464X, pointProj2.f19465Z, jArr2);
        this.engine.fpx.mp2_add(pointProj.f19464X, pointProj.f19465Z, jArr3);
        this.engine.fpx.mp2_sub_p2(pointProj.f19464X, pointProj.f19465Z, jArr4);
        this.engine.fpx.fp2mul_mont(jArr, jArr4, jArr);
        this.engine.fpx.fp2mul_mont(jArr2, jArr3, jArr2);
        this.engine.fpx.mp2_add(jArr, jArr2, jArr3);
        this.engine.fpx.mp2_sub_p2(jArr, jArr2, jArr4);
        Fpx fpx = this.engine.fpx;
        long[][] jArr5 = pointProj.f19464X;
        fpx.fp2mul_mont(jArr5, jArr3, jArr5);
        Fpx fpx2 = this.engine.fpx;
        long[][] jArr6 = pointProj.f19465Z;
        fpx2.fp2mul_mont(jArr6, jArr4, jArr6);
    }

    public void eval_3_isog(PointProj pointProj, long[][][] jArr) {
        int[] iArr = {2, this.engine.params.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr2 = (long[][]) Array.newInstance((Class<?>) cls, iArr);
        long[][] jArr3 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr4 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        this.engine.fpx.mp2_add(pointProj.f19464X, pointProj.f19465Z, jArr2);
        this.engine.fpx.mp2_sub_p2(pointProj.f19464X, pointProj.f19465Z, jArr3);
        this.engine.fpx.fp2mul_mont(jArr[0], jArr2, jArr2);
        this.engine.fpx.fp2mul_mont(jArr[1], jArr3, jArr3);
        this.engine.fpx.mp2_add(jArr2, jArr3, jArr4);
        this.engine.fpx.mp2_sub_p2(jArr3, jArr2, jArr2);
        this.engine.fpx.fp2sqr_mont(jArr4, jArr4);
        this.engine.fpx.fp2sqr_mont(jArr2, jArr2);
        Fpx fpx = this.engine.fpx;
        long[][] jArr5 = pointProj.f19464X;
        fpx.fp2mul_mont(jArr5, jArr4, jArr5);
        Fpx fpx2 = this.engine.fpx;
        long[][] jArr6 = pointProj.f19465Z;
        fpx2.fp2mul_mont(jArr6, jArr2, jArr6);
    }

    public void eval_4_isog(PointProj pointProj, long[][][] jArr) {
        int[] iArr = {2, this.engine.params.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr2 = (long[][]) Array.newInstance((Class<?>) cls, iArr);
        long[][] jArr3 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        this.engine.fpx.mp2_add(pointProj.f19464X, pointProj.f19465Z, jArr2);
        this.engine.fpx.mp2_sub_p2(pointProj.f19464X, pointProj.f19465Z, jArr3);
        this.engine.fpx.fp2mul_mont(jArr2, jArr[1], pointProj.f19464X);
        this.engine.fpx.fp2mul_mont(jArr3, jArr[2], pointProj.f19465Z);
        this.engine.fpx.fp2mul_mont(jArr2, jArr3, jArr2);
        this.engine.fpx.fp2mul_mont(jArr[0], jArr2, jArr2);
        this.engine.fpx.mp2_add(pointProj.f19464X, pointProj.f19465Z, jArr3);
        Fpx fpx = this.engine.fpx;
        long[][] jArr4 = pointProj.f19464X;
        long[][] jArr5 = pointProj.f19465Z;
        fpx.mp2_sub_p2(jArr4, jArr5, jArr5);
        this.engine.fpx.fp2sqr_mont(jArr3, jArr3);
        Fpx fpx2 = this.engine.fpx;
        long[][] jArr6 = pointProj.f19465Z;
        fpx2.fp2sqr_mont(jArr6, jArr6);
        this.engine.fpx.mp2_add(jArr3, jArr2, pointProj.f19464X);
        this.engine.fpx.mp2_sub_p2(pointProj.f19465Z, jArr2, jArr2);
        Fpx fpx3 = this.engine.fpx;
        long[][] jArr7 = pointProj.f19464X;
        fpx3.fp2mul_mont(jArr7, jArr3, jArr7);
        Fpx fpx4 = this.engine.fpx;
        long[][] jArr8 = pointProj.f19465Z;
        fpx4.fp2mul_mont(jArr8, jArr2, jArr8);
    }

    public void get_2_isog(PointProj pointProj, long[][] jArr, long[][] jArr2) {
        this.engine.fpx.fp2sqr_mont(pointProj.f19464X, jArr);
        this.engine.fpx.fp2sqr_mont(pointProj.f19465Z, jArr2);
        this.engine.fpx.mp2_sub_p2(jArr2, jArr, jArr);
    }

    public void get_3_isog(PointProj pointProj, long[][] jArr, long[][] jArr2, long[][][] jArr3) {
        int[] iArr = {2, this.engine.params.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr4 = (long[][]) Array.newInstance((Class<?>) cls, iArr);
        long[][] jArr5 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr6 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr7 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr8 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        this.engine.fpx.mp2_sub_p2(pointProj.f19464X, pointProj.f19465Z, jArr3[0]);
        this.engine.fpx.fp2sqr_mont(jArr3[0], jArr4);
        this.engine.fpx.mp2_add(pointProj.f19464X, pointProj.f19465Z, jArr3[1]);
        this.engine.fpx.fp2sqr_mont(jArr3[1], jArr5);
        Fpx fpx = this.engine.fpx;
        long[][] jArr9 = pointProj.f19464X;
        fpx.mp2_add(jArr9, jArr9, jArr7);
        this.engine.fpx.fp2sqr_mont(jArr7, jArr7);
        this.engine.fpx.fp2sub(jArr7, jArr4, jArr6);
        this.engine.fpx.fp2sub(jArr7, jArr5, jArr7);
        this.engine.fpx.mp2_add(jArr4, jArr7, jArr8);
        this.engine.fpx.mp2_add(jArr8, jArr8, jArr8);
        this.engine.fpx.mp2_add(jArr5, jArr8, jArr8);
        this.engine.fpx.fp2mul_mont(jArr6, jArr8, jArr);
        this.engine.fpx.mp2_add(jArr5, jArr6, jArr8);
        this.engine.fpx.mp2_add(jArr8, jArr8, jArr8);
        this.engine.fpx.mp2_add(jArr4, jArr8, jArr8);
        this.engine.fpx.fp2mul_mont(jArr7, jArr8, jArr2);
    }

    public void get_4_isog(PointProj pointProj, long[][] jArr, long[][] jArr2, long[][][] jArr3) {
        this.engine.fpx.mp2_sub_p2(pointProj.f19464X, pointProj.f19465Z, jArr3[1]);
        this.engine.fpx.mp2_add(pointProj.f19464X, pointProj.f19465Z, jArr3[2]);
        this.engine.fpx.fp2sqr_mont(pointProj.f19465Z, jArr3[0]);
        Fpx fpx = this.engine.fpx;
        long[][] jArr4 = jArr3[0];
        fpx.mp2_add(jArr4, jArr4, jArr4);
        this.engine.fpx.fp2sqr_mont(jArr3[0], jArr2);
        Fpx fpx2 = this.engine.fpx;
        long[][] jArr5 = jArr3[0];
        fpx2.mp2_add(jArr5, jArr5, jArr5);
        this.engine.fpx.fp2sqr_mont(pointProj.f19464X, jArr);
        this.engine.fpx.mp2_add(jArr, jArr, jArr);
        this.engine.fpx.fp2sqr_mont(jArr, jArr);
    }

    public void get_A(long[][] jArr, long[][] jArr2, long[][] jArr3, long[][] jArr4) {
        int[] iArr = {2, this.engine.params.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr5 = (long[][]) Array.newInstance((Class<?>) cls, iArr);
        long[][] jArr6 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr7 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        SIKEEngine sIKEEngine = this.engine;
        sIKEEngine.fpx.fpcopy(sIKEEngine.params.Montgomery_one, 0, jArr7[0]);
        this.engine.fpx.fp2add(jArr, jArr2, jArr6);
        this.engine.fpx.fp2mul_mont(jArr, jArr2, jArr5);
        this.engine.fpx.fp2mul_mont(jArr3, jArr6, jArr4);
        this.engine.fpx.fp2add(jArr5, jArr4, jArr4);
        this.engine.fpx.fp2mul_mont(jArr5, jArr3, jArr5);
        this.engine.fpx.fp2sub(jArr4, jArr7, jArr4);
        this.engine.fpx.fp2add(jArr5, jArr5, jArr5);
        this.engine.fpx.fp2add(jArr6, jArr3, jArr6);
        this.engine.fpx.fp2add(jArr5, jArr5, jArr5);
        this.engine.fpx.fp2sqr_mont(jArr4, jArr4);
        this.engine.fpx.fp2inv_mont(jArr5);
        this.engine.fpx.fp2mul_mont(jArr4, jArr5, jArr4);
        this.engine.fpx.fp2sub(jArr4, jArr6, jArr4);
    }

    public void inv_3_way(long[][] jArr, long[][] jArr2, long[][] jArr3) {
        int[] iArr = {2, this.engine.params.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr4 = (long[][]) Array.newInstance((Class<?>) cls, iArr);
        long[][] jArr5 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr6 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr7 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        this.engine.fpx.fp2mul_mont(jArr, jArr2, jArr4);
        this.engine.fpx.fp2mul_mont(jArr3, jArr4, jArr5);
        this.engine.fpx.fp2inv_mont(jArr5);
        this.engine.fpx.fp2mul_mont(jArr3, jArr5, jArr6);
        this.engine.fpx.fp2mul_mont(jArr6, jArr2, jArr7);
        this.engine.fpx.fp2mul_mont(jArr6, jArr, jArr2);
        this.engine.fpx.fp2mul_mont(jArr4, jArr5, jArr3);
        this.engine.fpx.fp2copy(jArr7, jArr);
    }

    public void j_inv(long[][] jArr, long[][] jArr2, long[][] jArr3) {
        int[] iArr = {2, this.engine.params.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr4 = (long[][]) Array.newInstance((Class<?>) cls, iArr);
        long[][] jArr5 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        this.engine.fpx.fp2sqr_mont(jArr, jArr3);
        this.engine.fpx.fp2sqr_mont(jArr2, jArr5);
        this.engine.fpx.fp2add(jArr5, jArr5, jArr4);
        this.engine.fpx.fp2sub(jArr3, jArr4, jArr4);
        this.engine.fpx.fp2sub(jArr4, jArr5, jArr4);
        this.engine.fpx.fp2sub(jArr4, jArr5, jArr3);
        this.engine.fpx.fp2sqr_mont(jArr5, jArr5);
        this.engine.fpx.fp2mul_mont(jArr3, jArr5, jArr3);
        this.engine.fpx.fp2add(jArr4, jArr4, jArr4);
        this.engine.fpx.fp2add(jArr4, jArr4, jArr4);
        this.engine.fpx.fp2sqr_mont(jArr4, jArr5);
        this.engine.fpx.fp2mul_mont(jArr4, jArr5, jArr4);
        this.engine.fpx.fp2add(jArr4, jArr4, jArr4);
        this.engine.fpx.fp2add(jArr4, jArr4, jArr4);
        this.engine.fpx.fp2inv_mont(jArr3);
        this.engine.fpx.fp2mul_mont(jArr3, jArr4, jArr3);
    }

    public void swap_points(PointProj pointProj, PointProj pointProj2, long j) {
        for (int i3 = 0; i3 < this.engine.params.NWORDS_FIELD; i3++) {
            long[][] jArr = pointProj.f19464X;
            long[] jArr2 = jArr[0];
            long j3 = jArr2[i3];
            long[][] jArr3 = pointProj2.f19464X;
            long[] jArr4 = jArr3[0];
            long j10 = (jArr4[i3] ^ j3) & j;
            jArr2[i3] = j3 ^ j10;
            jArr4[i3] = jArr4[i3] ^ j10;
            long[] jArr5 = jArr[1];
            long j11 = jArr5[i3];
            long[] jArr6 = jArr3[1];
            long j12 = (jArr6[i3] ^ j11) & j;
            jArr5[i3] = j11 ^ j12;
            jArr6[i3] = jArr6[i3] ^ j12;
            long[][] jArr7 = pointProj.f19465Z;
            long[] jArr8 = jArr7[0];
            long j13 = jArr8[i3];
            long[][] jArr9 = pointProj2.f19465Z;
            long[] jArr10 = jArr9[0];
            long j14 = (jArr10[i3] ^ j13) & j;
            jArr8[i3] = j13 ^ j14;
            jArr10[i3] = jArr10[i3] ^ j14;
            long[] jArr11 = jArr7[1];
            long j15 = jArr11[i3];
            long[] jArr12 = jArr9[1];
            long j16 = (jArr12[i3] ^ j15) & j;
            jArr11[i3] = j15 ^ j16;
            jArr12[i3] = jArr12[i3] ^ j16;
        }
    }

    public void xDBL(PointProj pointProj, PointProj pointProj2, long[][] jArr, long[][] jArr2) {
        int[] iArr = {2, this.engine.params.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr3 = (long[][]) Array.newInstance((Class<?>) cls, iArr);
        long[][] jArr4 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        this.engine.fpx.mp2_sub_p2(pointProj.f19464X, pointProj.f19465Z, jArr3);
        this.engine.fpx.mp2_add(pointProj.f19464X, pointProj.f19465Z, jArr4);
        this.engine.fpx.fp2sqr_mont(jArr3, jArr3);
        this.engine.fpx.fp2sqr_mont(jArr4, jArr4);
        this.engine.fpx.fp2mul_mont(jArr2, jArr3, pointProj2.f19465Z);
        this.engine.fpx.fp2mul_mont(jArr4, pointProj2.f19465Z, pointProj2.f19464X);
        this.engine.fpx.mp2_sub_p2(jArr4, jArr3, jArr4);
        this.engine.fpx.fp2mul_mont(jArr, jArr4, jArr3);
        Fpx fpx = this.engine.fpx;
        long[][] jArr5 = pointProj2.f19465Z;
        fpx.mp2_add(jArr5, jArr3, jArr5);
        Fpx fpx2 = this.engine.fpx;
        long[][] jArr6 = pointProj2.f19465Z;
        fpx2.fp2mul_mont(jArr6, jArr4, jArr6);
    }

    public void xDBLADD(PointProj pointProj, PointProj pointProj2, long[][] jArr, long[][] jArr2) {
        int[] iArr = {2, this.engine.params.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr3 = (long[][]) Array.newInstance((Class<?>) cls, iArr);
        long[][] jArr4 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr5 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        this.engine.fpx.mp2_add(pointProj.f19464X, pointProj.f19465Z, jArr3);
        this.engine.fpx.mp2_sub_p2(pointProj.f19464X, pointProj.f19465Z, jArr4);
        this.engine.fpx.fp2sqr_mont(jArr3, pointProj.f19464X);
        this.engine.fpx.mp2_sub_p2(pointProj2.f19464X, pointProj2.f19465Z, jArr5);
        Fpx fpx = this.engine.fpx;
        long[][] jArr6 = pointProj2.f19464X;
        fpx.mp2_add(jArr6, pointProj2.f19465Z, jArr6);
        this.engine.fpx.fp2mul_mont(jArr3, jArr5, jArr3);
        this.engine.fpx.fp2sqr_mont(jArr4, pointProj.f19465Z);
        this.engine.fpx.fp2mul_mont(jArr4, pointProj2.f19464X, jArr4);
        this.engine.fpx.mp2_sub_p2(pointProj.f19464X, pointProj.f19465Z, jArr5);
        Fpx fpx2 = this.engine.fpx;
        long[][] jArr7 = pointProj.f19464X;
        fpx2.fp2mul_mont(jArr7, pointProj.f19465Z, jArr7);
        this.engine.fpx.fp2mul_mont(jArr2, jArr5, pointProj2.f19464X);
        this.engine.fpx.mp2_sub_p2(jArr3, jArr4, pointProj2.f19465Z);
        Fpx fpx3 = this.engine.fpx;
        long[][] jArr8 = pointProj2.f19464X;
        long[][] jArr9 = pointProj.f19465Z;
        fpx3.mp2_add(jArr8, jArr9, jArr9);
        this.engine.fpx.mp2_add(jArr3, jArr4, pointProj2.f19464X);
        Fpx fpx4 = this.engine.fpx;
        long[][] jArr10 = pointProj.f19465Z;
        fpx4.fp2mul_mont(jArr10, jArr5, jArr10);
        Fpx fpx5 = this.engine.fpx;
        long[][] jArr11 = pointProj2.f19465Z;
        fpx5.fp2sqr_mont(jArr11, jArr11);
        Fpx fpx6 = this.engine.fpx;
        long[][] jArr12 = pointProj2.f19464X;
        fpx6.fp2sqr_mont(jArr12, jArr12);
        Fpx fpx7 = this.engine.fpx;
        long[][] jArr13 = pointProj2.f19465Z;
        fpx7.fp2mul_mont(jArr13, jArr, jArr13);
    }

    public void xDBLe(PointProj pointProj, PointProj pointProj2, long[][] jArr, long[][] jArr2, int i3) {
        this.engine.fpx.copy_words(pointProj, pointProj2);
        for (int i10 = 0; i10 < i3; i10++) {
            xDBL(pointProj2, pointProj2, jArr, jArr2);
        }
    }

    public void xTPLe(PointProj pointProj, PointProj pointProj2, long[][] jArr, long[][] jArr2, int i3) {
        this.engine.fpx.copy_words(pointProj, pointProj2);
        for (int i10 = 0; i10 < i3; i10++) {
            xTPL(pointProj2, pointProj2, jArr, jArr2);
        }
    }

    public void xTPLe_fast(PointProj pointProj, PointProj pointProj2, long[][] jArr, int i3) {
        PointProj pointProj3 = new PointProj(this.engine.params.NWORDS_FIELD);
        this.engine.fpx.copy_words(pointProj, pointProj3);
        for (int i10 = 0; i10 < i3; i10++) {
            xTPL_fast(pointProj3, pointProj3, jArr);
        }
        this.engine.fpx.copy_words(pointProj3, pointProj2);
    }
}
