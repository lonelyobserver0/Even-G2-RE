package org.bouncycastle.pqc.crypto.sike;

import java.lang.reflect.Array;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class SIDH {
    private SIKEEngine engine;

    public SIDH(SIKEEngine sIKEEngine) {
        this.engine = sIKEEngine;
    }

    public void EphemeralKeyGeneration_A(byte[] bArr, byte[] bArr2) {
        long[][] jArr;
        long[][] jArr2;
        SIKEEngine sIKEEngine;
        PointProj pointProj = new PointProj(this.engine.params.NWORDS_FIELD);
        PointProj pointProj2 = new PointProj(this.engine.params.NWORDS_FIELD);
        PointProj pointProj3 = new PointProj(this.engine.params.NWORDS_FIELD);
        PointProj pointProj4 = new PointProj(this.engine.params.NWORDS_FIELD);
        Internal internal = this.engine.params;
        PointProj[] pointProjArr = new PointProj[internal.MAX_INT_POINTS_ALICE];
        int[] iArr = {2, internal.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr3 = (long[][]) Array.newInstance((Class<?>) cls, iArr);
        long[][] jArr4 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr5 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr6 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr7 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr8 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][][] jArr9 = (long[][][]) Array.newInstance((Class<?>) cls, 3, 2, this.engine.params.NWORDS_FIELD);
        Internal internal2 = this.engine.params;
        int[] iArr2 = new int[internal2.MAX_INT_POINTS_ALICE];
        long[] jArr10 = new long[internal2.NWORDS_ORDER];
        init_basis(internal2.A_gen, jArr3, jArr4, jArr5);
        init_basis(this.engine.params.B_gen, pointProj2.f19464X, pointProj3.f19464X, pointProj4.f19464X);
        SIKEEngine sIKEEngine2 = this.engine;
        sIKEEngine2.fpx.fpcopy(sIKEEngine2.params.Montgomery_one, 0, pointProj2.f19465Z[0]);
        SIKEEngine sIKEEngine3 = this.engine;
        sIKEEngine3.fpx.fpcopy(sIKEEngine3.params.Montgomery_one, 0, pointProj3.f19465Z[0]);
        SIKEEngine sIKEEngine4 = this.engine;
        sIKEEngine4.fpx.fpcopy(sIKEEngine4.params.Montgomery_one, 0, pointProj4.f19465Z[0]);
        SIKEEngine sIKEEngine5 = this.engine;
        sIKEEngine5.fpx.fpcopy(sIKEEngine5.params.Montgomery_one, 0, jArr6[0]);
        this.engine.fpx.mp2_add(jArr6, jArr6, jArr6);
        this.engine.fpx.mp2_add(jArr6, jArr6, jArr7);
        this.engine.fpx.mp2_add(jArr6, jArr7, jArr8);
        this.engine.fpx.mp2_add(jArr7, jArr7, jArr6);
        SIKEEngine sIKEEngine6 = this.engine;
        Fpx fpx = sIKEEngine6.fpx;
        Internal internal3 = sIKEEngine6.params;
        fpx.decode_to_digits(bArr, 0, jArr10, internal3.SECRETKEY_A_BYTES, internal3.NWORDS_ORDER);
        SIKEEngine sIKEEngine7 = this.engine;
        sIKEEngine7.isogeny.LADDER3PT(jArr3, jArr4, jArr5, jArr10, sIKEEngine7.params.ALICE, pointProj, jArr8);
        Internal internal4 = this.engine.params;
        if (internal4.OALICE_BITS % 2 == 1) {
            PointProj pointProj5 = new PointProj(internal4.NWORDS_FIELD);
            jArr = jArr7;
            jArr2 = jArr6;
            this.engine.isogeny.xDBLe(pointProj, pointProj5, jArr2, jArr, r2.params.OALICE_BITS - 1);
            this.engine.isogeny.get_2_isog(pointProj5, jArr2, jArr);
            this.engine.isogeny.eval_2_isog(pointProj2, pointProj5);
            this.engine.isogeny.eval_2_isog(pointProj3, pointProj5);
            this.engine.isogeny.eval_2_isog(pointProj4, pointProj5);
            this.engine.isogeny.eval_2_isog(pointProj, pointProj5);
        } else {
            jArr = jArr7;
            jArr2 = jArr6;
        }
        int i3 = 1;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            SIKEEngine sIKEEngine8 = this.engine;
            if (i3 >= sIKEEngine8.params.MAX_Alice) {
                sIKEEngine8.isogeny.get_4_isog(pointProj, jArr2, jArr, jArr9);
                this.engine.isogeny.eval_4_isog(pointProj2, jArr9);
                this.engine.isogeny.eval_4_isog(pointProj3, jArr9);
                this.engine.isogeny.eval_4_isog(pointProj4, jArr9);
                this.engine.isogeny.inv_3_way(pointProj2.f19465Z, pointProj3.f19465Z, pointProj4.f19465Z);
                Fpx fpx2 = this.engine.fpx;
                long[][] jArr11 = pointProj2.f19464X;
                fpx2.fp2mul_mont(jArr11, pointProj2.f19465Z, jArr11);
                Fpx fpx3 = this.engine.fpx;
                long[][] jArr12 = pointProj3.f19464X;
                fpx3.fp2mul_mont(jArr12, pointProj3.f19465Z, jArr12);
                Fpx fpx4 = this.engine.fpx;
                long[][] jArr13 = pointProj4.f19464X;
                fpx4.fp2mul_mont(jArr13, pointProj4.f19465Z, jArr13);
                this.engine.fpx.fp2_encode(pointProj2.f19464X, bArr2, 0);
                SIKEEngine sIKEEngine9 = this.engine;
                sIKEEngine9.fpx.fp2_encode(pointProj3.f19464X, bArr2, sIKEEngine9.params.FP2_ENCODED_BYTES);
                SIKEEngine sIKEEngine10 = this.engine;
                sIKEEngine10.fpx.fp2_encode(pointProj4.f19464X, bArr2, sIKEEngine10.params.FP2_ENCODED_BYTES * 2);
                return;
            }
            int i13 = i10;
            while (true) {
                sIKEEngine = this.engine;
                Internal internal5 = sIKEEngine.params;
                if (i13 >= internal5.MAX_Alice - i3) {
                    break;
                }
                PointProj pointProj6 = new PointProj(internal5.NWORDS_FIELD);
                pointProjArr[i11] = pointProj6;
                this.engine.fpx.fp2copy(pointProj.f19464X, pointProj6.f19464X);
                this.engine.fpx.fp2copy(pointProj.f19465Z, pointProjArr[i11].f19465Z);
                iArr2[i11] = i13;
                SIKEEngine sIKEEngine11 = this.engine;
                int i14 = sIKEEngine11.params.strat_Alice[i12];
                sIKEEngine11.isogeny.xDBLe(pointProj, pointProj, jArr2, jArr, i14 * 2);
                i13 += i14;
                i11++;
                i12++;
            }
            sIKEEngine.isogeny.get_4_isog(pointProj, jArr2, jArr, jArr9);
            for (int i15 = 0; i15 < i11; i15++) {
                this.engine.isogeny.eval_4_isog(pointProjArr[i15], jArr9);
            }
            this.engine.isogeny.eval_4_isog(pointProj2, jArr9);
            this.engine.isogeny.eval_4_isog(pointProj3, jArr9);
            this.engine.isogeny.eval_4_isog(pointProj4, jArr9);
            int i16 = i11 - 1;
            this.engine.fpx.fp2copy(pointProjArr[i16].f19464X, pointProj.f19464X);
            this.engine.fpx.fp2copy(pointProjArr[i16].f19465Z, pointProj.f19465Z);
            i10 = iArr2[i16];
            i11--;
            i3++;
        }
    }

    public void EphemeralKeyGeneration_B(byte[] bArr, byte[] bArr2) {
        SIKEEngine sIKEEngine;
        PointProj pointProj = new PointProj(this.engine.params.NWORDS_FIELD);
        PointProj pointProj2 = new PointProj(this.engine.params.NWORDS_FIELD);
        PointProj pointProj3 = new PointProj(this.engine.params.NWORDS_FIELD);
        PointProj pointProj4 = new PointProj(this.engine.params.NWORDS_FIELD);
        Internal internal = this.engine.params;
        PointProj[] pointProjArr = new PointProj[internal.MAX_INT_POINTS_BOB];
        int[] iArr = {2, internal.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr = (long[][]) Array.newInstance((Class<?>) cls, iArr);
        long[][] jArr2 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr3 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr4 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr5 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr6 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][][] jArr7 = (long[][][]) Array.newInstance((Class<?>) cls, 3, 2, this.engine.params.NWORDS_FIELD);
        Internal internal2 = this.engine.params;
        int[] iArr2 = new int[internal2.MAX_INT_POINTS_BOB];
        long[] jArr8 = new long[internal2.NWORDS_ORDER];
        init_basis(internal2.B_gen, jArr, jArr2, jArr3);
        init_basis(this.engine.params.A_gen, pointProj2.f19464X, pointProj3.f19464X, pointProj4.f19464X);
        SIKEEngine sIKEEngine2 = this.engine;
        sIKEEngine2.fpx.fpcopy(sIKEEngine2.params.Montgomery_one, 0, pointProj2.f19465Z[0]);
        SIKEEngine sIKEEngine3 = this.engine;
        sIKEEngine3.fpx.fpcopy(sIKEEngine3.params.Montgomery_one, 0, pointProj3.f19465Z[0]);
        SIKEEngine sIKEEngine4 = this.engine;
        sIKEEngine4.fpx.fpcopy(sIKEEngine4.params.Montgomery_one, 0, pointProj4.f19465Z[0]);
        SIKEEngine sIKEEngine5 = this.engine;
        sIKEEngine5.fpx.fpcopy(sIKEEngine5.params.Montgomery_one, 0, jArr4[0]);
        this.engine.fpx.mp2_add(jArr4, jArr4, jArr4);
        this.engine.fpx.mp2_add(jArr4, jArr4, jArr5);
        this.engine.fpx.mp2_add(jArr4, jArr5, jArr6);
        this.engine.fpx.mp2_add(jArr5, jArr5, jArr4);
        SIKEEngine sIKEEngine6 = this.engine;
        Fpx fpx = sIKEEngine6.fpx;
        Internal internal3 = sIKEEngine6.params;
        fpx.decode_to_digits(bArr, internal3.MSG_BYTES, jArr8, internal3.SECRETKEY_B_BYTES, internal3.NWORDS_ORDER);
        SIKEEngine sIKEEngine7 = this.engine;
        long[][] jArr9 = jArr4;
        int i3 = 0;
        sIKEEngine7.isogeny.LADDER3PT(jArr, jArr2, jArr3, jArr8, sIKEEngine7.params.BOB, pointProj, jArr6);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (true) {
            SIKEEngine sIKEEngine8 = this.engine;
            if (i13 >= sIKEEngine8.params.MAX_Bob) {
                sIKEEngine8.isogeny.get_3_isog(pointProj, jArr5, jArr9, jArr7);
                this.engine.isogeny.eval_3_isog(pointProj2, jArr7);
                this.engine.isogeny.eval_3_isog(pointProj3, jArr7);
                this.engine.isogeny.eval_3_isog(pointProj4, jArr7);
                this.engine.isogeny.inv_3_way(pointProj2.f19465Z, pointProj3.f19465Z, pointProj4.f19465Z);
                Fpx fpx2 = this.engine.fpx;
                long[][] jArr10 = pointProj2.f19464X;
                fpx2.fp2mul_mont(jArr10, pointProj2.f19465Z, jArr10);
                Fpx fpx3 = this.engine.fpx;
                long[][] jArr11 = pointProj3.f19464X;
                fpx3.fp2mul_mont(jArr11, pointProj3.f19465Z, jArr11);
                Fpx fpx4 = this.engine.fpx;
                long[][] jArr12 = pointProj4.f19464X;
                fpx4.fp2mul_mont(jArr12, pointProj4.f19465Z, jArr12);
                this.engine.fpx.fp2_encode(pointProj2.f19464X, bArr2, 0);
                SIKEEngine sIKEEngine9 = this.engine;
                sIKEEngine9.fpx.fp2_encode(pointProj3.f19464X, bArr2, sIKEEngine9.params.FP2_ENCODED_BYTES);
                SIKEEngine sIKEEngine10 = this.engine;
                sIKEEngine10.fpx.fp2_encode(pointProj4.f19464X, bArr2, sIKEEngine10.params.FP2_ENCODED_BYTES * 2);
                return;
            }
            int i14 = i10;
            while (true) {
                sIKEEngine = this.engine;
                Internal internal4 = sIKEEngine.params;
                if (i14 >= internal4.MAX_Bob - i13) {
                    break;
                }
                PointProj pointProj5 = new PointProj(internal4.NWORDS_FIELD);
                pointProjArr[i11] = pointProj5;
                this.engine.fpx.fp2copy(pointProj.f19464X, pointProj5.f19464X);
                this.engine.fpx.fp2copy(pointProj.f19465Z, pointProjArr[i11].f19465Z);
                iArr2[i11] = i14;
                SIKEEngine sIKEEngine11 = this.engine;
                int i15 = sIKEEngine11.params.strat_Bob[i12];
                long[][] jArr13 = jArr9;
                sIKEEngine11.isogeny.xTPLe(pointProj, pointProj, jArr5, jArr13, i15);
                i14 += i15;
                jArr9 = jArr13;
                i11++;
                i12++;
            }
            long[][] jArr14 = jArr9;
            sIKEEngine.isogeny.get_3_isog(pointProj, jArr5, jArr14, jArr7);
            for (int i16 = i3; i16 < i11; i16++) {
                this.engine.isogeny.eval_3_isog(pointProjArr[i16], jArr7);
            }
            this.engine.isogeny.eval_3_isog(pointProj2, jArr7);
            this.engine.isogeny.eval_3_isog(pointProj3, jArr7);
            this.engine.isogeny.eval_3_isog(pointProj4, jArr7);
            int i17 = i11 - 1;
            this.engine.fpx.fp2copy(pointProjArr[i17].f19464X, pointProj.f19464X);
            this.engine.fpx.fp2copy(pointProjArr[i17].f19465Z, pointProj.f19465Z);
            i10 = iArr2[i17];
            i11--;
            i13++;
            jArr9 = jArr14;
            i3 = 0;
        }
    }

    public void EphemeralSecretAgreement_A(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        long[][] jArr;
        long[][] jArr2;
        SIKEEngine sIKEEngine;
        PointProj pointProj = new PointProj(this.engine.params.NWORDS_FIELD);
        Internal internal = this.engine.params;
        PointProj[] pointProjArr = new PointProj[internal.MAX_INT_POINTS_ALICE];
        int[] iArr = {3, 2, internal.NWORDS_FIELD};
        int i3 = 1;
        Class cls = Long.TYPE;
        long[][][] jArr3 = (long[][][]) Array.newInstance((Class<?>) cls, iArr);
        long[][][] jArr4 = (long[][][]) Array.newInstance((Class<?>) cls, 3, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr5 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr6 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr7 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr8 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        SIKEEngine sIKEEngine2 = this.engine;
        Internal internal2 = sIKEEngine2.params;
        int[] iArr2 = new int[internal2.MAX_INT_POINTS_ALICE];
        long[] jArr9 = new long[internal2.NWORDS_ORDER];
        sIKEEngine2.fpx.fp2_decode(bArr2, jArr3[0], 0);
        SIKEEngine sIKEEngine3 = this.engine;
        sIKEEngine3.fpx.fp2_decode(bArr2, jArr3[1], sIKEEngine3.params.FP2_ENCODED_BYTES);
        SIKEEngine sIKEEngine4 = this.engine;
        sIKEEngine4.fpx.fp2_decode(bArr2, jArr3[2], sIKEEngine4.params.FP2_ENCODED_BYTES * 2);
        this.engine.isogeny.get_A(jArr3[0], jArr3[1], jArr3[2], jArr8);
        SIKEEngine sIKEEngine5 = this.engine;
        Fpx fpx = sIKEEngine5.fpx;
        Internal internal3 = sIKEEngine5.params;
        long[] jArr10 = internal3.Montgomery_one;
        fpx.mp_add(jArr10, jArr10, jArr7[0], internal3.NWORDS_FIELD);
        this.engine.fpx.mp2_add(jArr8, jArr7, jArr6);
        SIKEEngine sIKEEngine6 = this.engine;
        Fpx fpx2 = sIKEEngine6.fpx;
        long[] jArr11 = jArr7[0];
        fpx2.mp_add(jArr11, jArr11, jArr11, sIKEEngine6.params.NWORDS_FIELD);
        SIKEEngine sIKEEngine7 = this.engine;
        Fpx fpx3 = sIKEEngine7.fpx;
        Internal internal4 = sIKEEngine7.params;
        fpx3.decode_to_digits(bArr, 0, jArr9, internal4.SECRETKEY_A_BYTES, internal4.NWORDS_ORDER);
        SIKEEngine sIKEEngine8 = this.engine;
        sIKEEngine8.isogeny.LADDER3PT(jArr3[0], jArr3[1], jArr3[2], jArr9, sIKEEngine8.params.ALICE, pointProj, jArr8);
        Internal internal5 = this.engine.params;
        if (internal5.OALICE_BITS % 2 == 1) {
            PointProj pointProj2 = new PointProj(internal5.NWORDS_FIELD);
            jArr = jArr7;
            jArr2 = jArr6;
            this.engine.isogeny.xDBLe(pointProj, pointProj2, jArr2, jArr, r1.params.OALICE_BITS - 1);
            this.engine.isogeny.get_2_isog(pointProj2, jArr2, jArr);
            this.engine.isogeny.eval_2_isog(pointProj, pointProj2);
        } else {
            jArr = jArr7;
            jArr2 = jArr6;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            SIKEEngine sIKEEngine9 = this.engine;
            if (i3 >= sIKEEngine9.params.MAX_Alice) {
                sIKEEngine9.isogeny.get_4_isog(pointProj, jArr2, jArr, jArr4);
                this.engine.fpx.mp2_add(jArr2, jArr2, jArr2);
                this.engine.fpx.fp2sub(jArr2, jArr, jArr2);
                this.engine.fpx.fp2add(jArr2, jArr2, jArr2);
                this.engine.isogeny.j_inv(jArr2, jArr, jArr5);
                this.engine.fpx.fp2_encode(jArr5, bArr3, 0);
                return;
            }
            int i13 = i12;
            while (true) {
                sIKEEngine = this.engine;
                Internal internal6 = sIKEEngine.params;
                if (i13 >= internal6.MAX_Alice - i3) {
                    break;
                }
                PointProj pointProj3 = new PointProj(internal6.NWORDS_FIELD);
                pointProjArr[i10] = pointProj3;
                this.engine.fpx.fp2copy(pointProj.f19464X, pointProj3.f19464X);
                this.engine.fpx.fp2copy(pointProj.f19465Z, pointProjArr[i10].f19465Z);
                int i14 = i10 + 1;
                iArr2[i10] = i13;
                SIKEEngine sIKEEngine10 = this.engine;
                int i15 = sIKEEngine10.params.strat_Alice[i11];
                sIKEEngine10.isogeny.xDBLe(pointProj, pointProj, jArr2, jArr, i15 * 2);
                i13 += i15;
                i10 = i14;
                i11++;
            }
            sIKEEngine.isogeny.get_4_isog(pointProj, jArr2, jArr, jArr4);
            for (int i16 = 0; i16 < i10; i16++) {
                this.engine.isogeny.eval_4_isog(pointProjArr[i16], jArr4);
            }
            int i17 = i10 - 1;
            this.engine.fpx.fp2copy(pointProjArr[i17].f19464X, pointProj.f19464X);
            this.engine.fpx.fp2copy(pointProjArr[i17].f19465Z, pointProj.f19465Z);
            i12 = iArr2[i17];
            i10--;
            i3++;
        }
    }

    public void EphemeralSecretAgreement_B(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        SIKEEngine sIKEEngine;
        PointProj pointProj = new PointProj(this.engine.params.NWORDS_FIELD);
        Internal internal = this.engine.params;
        PointProj[] pointProjArr = new PointProj[internal.MAX_INT_POINTS_BOB];
        int[] iArr = {3, 2, internal.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][][] jArr = (long[][][]) Array.newInstance((Class<?>) cls, iArr);
        long[][][] jArr2 = (long[][][]) Array.newInstance((Class<?>) cls, 3, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr3 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr4 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr5 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        long[][] jArr6 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        SIKEEngine sIKEEngine2 = this.engine;
        Internal internal2 = sIKEEngine2.params;
        int[] iArr2 = new int[internal2.MAX_INT_POINTS_BOB];
        long[] jArr7 = new long[internal2.NWORDS_ORDER];
        sIKEEngine2.fpx.fp2_decode(bArr2, jArr2[0], 0);
        SIKEEngine sIKEEngine3 = this.engine;
        sIKEEngine3.fpx.fp2_decode(bArr2, jArr2[1], sIKEEngine3.params.FP2_ENCODED_BYTES);
        SIKEEngine sIKEEngine4 = this.engine;
        sIKEEngine4.fpx.fp2_decode(bArr2, jArr2[2], sIKEEngine4.params.FP2_ENCODED_BYTES * 2);
        this.engine.isogeny.get_A(jArr2[0], jArr2[1], jArr2[2], jArr6);
        SIKEEngine sIKEEngine5 = this.engine;
        Fpx fpx = sIKEEngine5.fpx;
        Internal internal3 = sIKEEngine5.params;
        long[] jArr8 = internal3.Montgomery_one;
        fpx.mp_add(jArr8, jArr8, jArr5[0], internal3.NWORDS_FIELD);
        this.engine.fpx.mp2_add(jArr6, jArr5, jArr4);
        this.engine.fpx.mp2_sub_p2(jArr6, jArr5, jArr5);
        SIKEEngine sIKEEngine6 = this.engine;
        Fpx fpx2 = sIKEEngine6.fpx;
        Internal internal4 = sIKEEngine6.params;
        fpx2.decode_to_digits(bArr, internal4.MSG_BYTES, jArr7, internal4.SECRETKEY_B_BYTES, internal4.NWORDS_ORDER);
        SIKEEngine sIKEEngine7 = this.engine;
        PointProj pointProj2 = pointProj;
        sIKEEngine7.isogeny.LADDER3PT(jArr2[0], jArr2[1], jArr2[2], jArr7, sIKEEngine7.params.BOB, pointProj2, jArr6);
        int i3 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1;
        while (true) {
            SIKEEngine sIKEEngine8 = this.engine;
            if (i12 >= sIKEEngine8.params.MAX_Bob) {
                long[][] jArr9 = jArr4;
                long[][] jArr10 = jArr5;
                sIKEEngine8.isogeny.get_3_isog(pointProj2, jArr10, jArr9, jArr);
                this.engine.fpx.fp2add(jArr9, jArr10, jArr6);
                this.engine.fpx.fp2add(jArr6, jArr6, jArr6);
                this.engine.fpx.fp2sub(jArr9, jArr10, jArr9);
                this.engine.isogeny.j_inv(jArr6, jArr9, jArr3);
                this.engine.fpx.fp2_encode(jArr3, bArr3, 0);
                return;
            }
            while (true) {
                sIKEEngine = this.engine;
                Internal internal5 = sIKEEngine.params;
                if (i11 >= internal5.MAX_Bob - i12) {
                    break;
                }
                PointProj pointProj3 = new PointProj(internal5.NWORDS_FIELD);
                pointProjArr[i3] = pointProj3;
                this.engine.fpx.fp2copy(pointProj2.f19464X, pointProj3.f19464X);
                this.engine.fpx.fp2copy(pointProj2.f19465Z, pointProjArr[i3].f19465Z);
                int i13 = i3 + 1;
                iArr2[i3] = i11;
                SIKEEngine sIKEEngine9 = this.engine;
                int i14 = i10 + 1;
                int i15 = sIKEEngine9.params.strat_Bob[i10];
                Isogeny isogeny = sIKEEngine9.isogeny;
                PointProj pointProj4 = pointProj2;
                PointProj pointProj5 = pointProj2;
                long[][] jArr11 = jArr4;
                int i16 = i11;
                long[][] jArr12 = jArr5;
                isogeny.xTPLe(pointProj5, pointProj4, jArr12, jArr11, i15);
                int i17 = i15 + i16;
                pointProj2 = pointProj5;
                jArr4 = jArr11;
                jArr5 = jArr12;
                i10 = i14;
                i12 = i12;
                i11 = i17;
                i3 = i13;
            }
            int i18 = i12;
            PointProj pointProj6 = pointProj2;
            long[][] jArr13 = jArr4;
            long[][] jArr14 = jArr5;
            sIKEEngine.isogeny.get_3_isog(pointProj6, jArr14, jArr13, jArr);
            for (int i19 = 0; i19 < i3; i19++) {
                this.engine.isogeny.eval_3_isog(pointProjArr[i19], jArr);
            }
            int i20 = i3 - 1;
            this.engine.fpx.fp2copy(pointProjArr[i20].f19464X, pointProj6.f19464X);
            this.engine.fpx.fp2copy(pointProjArr[i20].f19465Z, pointProj6.f19465Z);
            int i21 = iArr2[i20];
            i3--;
            pointProj2 = pointProj6;
            i12 = i18 + 1;
            jArr4 = jArr13;
            i11 = i21;
            jArr5 = jArr14;
        }
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
}
