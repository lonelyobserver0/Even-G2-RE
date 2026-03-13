package org.bouncycastle.pqc.crypto.sike;

import java.lang.reflect.Array;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Fpx {
    private SIKEEngine engine;

    public Fpx(SIKEEngine sIKEEngine) {
        this.engine = sIKEEngine;
    }

    private void Montgomery_inversion_mod_order_bingcd_partial(long[] jArr, long[] jArr2, int[] iArr, long[] jArr3) {
        int i3 = this.engine.params.NWORDS_ORDER;
        long[] jArr4 = new long[i3];
        long[] jArr5 = new long[i3];
        long[] jArr6 = new long[i3];
        copy_words(jArr, jArr4, i3);
        copy_words(jArr3, jArr5, this.engine.params.NWORDS_ORDER);
        copy_words(jArr6, jArr2, this.engine.params.NWORDS_ORDER);
        jArr2[0] = 1;
        iArr[0] = 0;
        while (!is_zero_mod_order(jArr5)) {
            int i10 = ((iArr[0] + 1) / 64) + 1;
            if (i10 < this.engine.params.NWORDS_ORDER) {
                if (is_even_mod_order(jArr5)) {
                    mp_shiftr1(jArr5, this.engine.params.NWORDS_ORDER);
                } else {
                    if (is_even_mod_order(jArr4)) {
                        mp_shiftr1(jArr4, this.engine.params.NWORDS_ORDER);
                    } else if (is_lt_mod_order(jArr5, jArr4)) {
                        mp_sub(jArr4, jArr5, jArr4, this.engine.params.NWORDS_ORDER);
                        mp_shiftr1(jArr4, this.engine.params.NWORDS_ORDER);
                        mp_add(jArr2, jArr6, jArr2, i10);
                    } else {
                        mp_sub(jArr5, jArr4, jArr5, this.engine.params.NWORDS_ORDER);
                        mp_shiftr1(jArr5, this.engine.params.NWORDS_ORDER);
                        mp_add(jArr2, jArr6, jArr6, i10);
                    }
                    mp_shiftl1(jArr6, i10);
                }
                mp_shiftl1(jArr2, i10);
            } else {
                if (is_even_mod_order(jArr5)) {
                    mp_shiftr1(jArr5, this.engine.params.NWORDS_ORDER);
                } else {
                    if (is_even_mod_order(jArr4)) {
                        mp_shiftr1(jArr4, this.engine.params.NWORDS_ORDER);
                    } else if (is_lt_mod_order(jArr5, jArr4)) {
                        mp_sub(jArr4, jArr5, jArr4, this.engine.params.NWORDS_ORDER);
                        mp_shiftr1(jArr4, this.engine.params.NWORDS_ORDER);
                        mp_add(jArr2, jArr6, jArr2, this.engine.params.NWORDS_ORDER);
                    } else {
                        mp_sub(jArr5, jArr4, jArr5, this.engine.params.NWORDS_ORDER);
                        mp_shiftr1(jArr5, this.engine.params.NWORDS_ORDER);
                        mp_add(jArr2, jArr6, jArr6, this.engine.params.NWORDS_ORDER);
                    }
                    i10 = this.engine.params.NWORDS_ORDER;
                    mp_shiftl1(jArr6, i10);
                }
                i10 = this.engine.params.NWORDS_ORDER;
                mp_shiftl1(jArr2, i10);
            }
            iArr[0] = iArr[0] + 1;
        }
        if (is_lt_mod_order(jArr3, jArr2)) {
            mp_sub(jArr2, jArr3, jArr2, this.engine.params.NWORDS_ORDER);
        }
    }

    private void digit_x_digit(long j, long j3, long[] jArr) {
        long j10 = j & BodyPartID.bodyIdMax;
        long j11 = j >>> 32;
        long j12 = j3 & BodyPartID.bodyIdMax;
        long j13 = j3 >>> 32;
        long j14 = j10 * j12;
        long j15 = j10 * j13;
        long j16 = j12 * j11;
        long j17 = j11 * j13;
        long j18 = j14 & BodyPartID.bodyIdMax;
        jArr[0] = j18;
        long j19 = (j14 >>> 32) + (j16 & BodyPartID.bodyIdMax) + (j15 & BodyPartID.bodyIdMax);
        jArr[0] = j18 ^ (j19 << 32);
        long j20 = (j16 >>> 32) + (j15 >>> 32) + (j17 & BodyPartID.bodyIdMax) + (j19 >>> 32);
        long j21 = BodyPartID.bodyIdMax & j20;
        jArr[1] = j21;
        jArr[1] = j21 ^ (((-4294967296L) & j17) + (j20 & (-4294967296L)));
    }

    private void fpdiv2_PRIME(long[] jArr, long[] jArr2) {
        int i3 = 0;
        long j = 0 - (jArr[0] & 1);
        int i10 = 0;
        while (true) {
            Internal internal = this.engine.params;
            if (i3 >= internal.NWORDS_FIELD) {
                mp_shiftr1(jArr2);
                return;
            }
            long j3 = i10;
            long j10 = jArr[i3] + j3;
            jArr2[i3] = (internal.PRIME[i3] & j) + j10;
            i10 = is_digit_lessthan_ct(j10, j3) | is_digit_lessthan_ct(jArr2[i3], j10);
            i3++;
        }
    }

    private void fpinv_chain_mont(long[] jArr) {
        int i3;
        int i10;
        int i11;
        char c10;
        Internal internal = this.engine.params;
        int i12 = 13;
        if (internal.NBITS_FIELD == 434) {
            int i13 = internal.NWORDS_FIELD;
            long[] jArr2 = new long[i13];
            long[][] jArr3 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 31, i13);
            fpsqr_mont(jArr, jArr2);
            fpmul_mont(jArr, jArr2, jArr3[0]);
            int i14 = 0;
            i3 = 20;
            while (i14 <= 29) {
                long[] jArr4 = jArr3[i14];
                i14++;
                fpmul_mont(jArr4, jArr2, jArr3[i14]);
            }
            i10 = 12;
            fpcopy(jArr, 0, jArr2);
            for (int i15 = 0; i15 < 7; i15++) {
                fpsqr_mont(jArr2, jArr2);
            }
            fpmul_mont(jArr3[5], jArr2, jArr2);
            for (int i16 = 0; i16 < 10; i16++) {
                fpsqr_mont(jArr2, jArr2);
            }
            fpmul_mont(jArr3[14], jArr2, jArr2);
            for (int i17 = 0; i17 < 6; i17++) {
                fpsqr_mont(jArr2, jArr2);
            }
            fpmul_mont(jArr3[3], jArr2, jArr2);
            for (int i18 = 0; i18 < 6; i18++) {
                fpsqr_mont(jArr2, jArr2);
            }
            fpmul_mont(jArr3[23], jArr2, jArr2);
            for (int i19 = 0; i19 < 6; i19++) {
                fpsqr_mont(jArr2, jArr2);
            }
            fpmul_mont(jArr3[13], jArr2, jArr2);
            for (int i20 = 0; i20 < 6; i20++) {
                fpsqr_mont(jArr2, jArr2);
            }
            fpmul_mont(jArr3[24], jArr2, jArr2);
            for (int i21 = 0; i21 < 6; i21++) {
                fpsqr_mont(jArr2, jArr2);
            }
            fpmul_mont(jArr3[7], jArr2, jArr2);
            for (int i22 = 0; i22 < 8; i22++) {
                fpsqr_mont(jArr2, jArr2);
            }
            fpmul_mont(jArr3[12], jArr2, jArr2);
            for (int i23 = 0; i23 < 8; i23++) {
                fpsqr_mont(jArr2, jArr2);
            }
            fpmul_mont(jArr3[30], jArr2, jArr2);
            for (int i24 = 0; i24 < 6; i24++) {
                fpsqr_mont(jArr2, jArr2);
            }
            fpmul_mont(jArr3[1], jArr2, jArr2);
            for (int i25 = 0; i25 < 6; i25++) {
                fpsqr_mont(jArr2, jArr2);
            }
            fpmul_mont(jArr3[30], jArr2, jArr2);
            for (int i26 = 0; i26 < 7; i26++) {
                fpsqr_mont(jArr2, jArr2);
            }
            fpmul_mont(jArr3[21], jArr2, jArr2);
            for (int i27 = 0; i27 < 9; i27++) {
                fpsqr_mont(jArr2, jArr2);
            }
            fpmul_mont(jArr3[2], jArr2, jArr2);
            for (int i28 = 0; i28 < 9; i28++) {
                fpsqr_mont(jArr2, jArr2);
            }
            fpmul_mont(jArr3[19], jArr2, jArr2);
            for (int i29 = 0; i29 < 9; i29++) {
                fpsqr_mont(jArr2, jArr2);
            }
            fpmul_mont(jArr3[1], jArr2, jArr2);
            for (int i30 = 0; i30 < 7; i30++) {
                fpsqr_mont(jArr2, jArr2);
            }
            fpmul_mont(jArr3[24], jArr2, jArr2);
            for (int i31 = 0; i31 < 6; i31++) {
                fpsqr_mont(jArr2, jArr2);
            }
            fpmul_mont(jArr3[26], jArr2, jArr2);
            for (int i32 = 0; i32 < 6; i32++) {
                fpsqr_mont(jArr2, jArr2);
            }
            fpmul_mont(jArr3[16], jArr2, jArr2);
            for (int i33 = 0; i33 < 7; i33++) {
                fpsqr_mont(jArr2, jArr2);
            }
            fpmul_mont(jArr3[10], jArr2, jArr2);
            for (int i34 = 0; i34 < 7; i34++) {
                fpsqr_mont(jArr2, jArr2);
            }
            fpmul_mont(jArr3[6], jArr2, jArr2);
            for (int i35 = 0; i35 < 7; i35++) {
                fpsqr_mont(jArr2, jArr2);
            }
            fpmul_mont(jArr3[0], jArr2, jArr2);
            for (int i36 = 0; i36 < 9; i36++) {
                fpsqr_mont(jArr2, jArr2);
            }
            fpmul_mont(jArr3[20], jArr2, jArr2);
            for (int i37 = 0; i37 < 8; i37++) {
                fpsqr_mont(jArr2, jArr2);
            }
            fpmul_mont(jArr3[9], jArr2, jArr2);
            for (int i38 = 0; i38 < 6; i38++) {
                fpsqr_mont(jArr2, jArr2);
            }
            fpmul_mont(jArr3[25], jArr2, jArr2);
            for (int i39 = 0; i39 < 9; i39++) {
                fpsqr_mont(jArr2, jArr2);
            }
            fpmul_mont(jArr3[30], jArr2, jArr2);
            for (int i40 = 0; i40 < 6; i40++) {
                fpsqr_mont(jArr2, jArr2);
            }
            fpmul_mont(jArr3[26], jArr2, jArr2);
            for (int i41 = 0; i41 < 6; i41++) {
                fpsqr_mont(jArr2, jArr2);
            }
            fpmul_mont(jArr, jArr2, jArr2);
            for (int i42 = 0; i42 < 7; i42++) {
                fpsqr_mont(jArr2, jArr2);
            }
            fpmul_mont(jArr3[28], jArr2, jArr2);
            for (int i43 = 0; i43 < 6; i43++) {
                fpsqr_mont(jArr2, jArr2);
            }
            fpmul_mont(jArr3[6], jArr2, jArr2);
            for (int i44 = 0; i44 < 6; i44++) {
                fpsqr_mont(jArr2, jArr2);
            }
            fpmul_mont(jArr3[10], jArr2, jArr2);
            for (int i45 = 0; i45 < 9; i45++) {
                fpsqr_mont(jArr2, jArr2);
            }
            fpmul_mont(jArr3[22], jArr2, jArr2);
            for (int i46 = 0; i46 < 35; i46++) {
                for (int i47 = 0; i47 < 6; i47++) {
                    fpsqr_mont(jArr2, jArr2);
                }
                fpmul_mont(jArr3[30], jArr2, jArr2);
            }
            fpcopy(jArr2, 0, jArr);
        } else {
            i3 = 20;
            i10 = 12;
        }
        Internal internal2 = this.engine.params;
        if (internal2.NBITS_FIELD == 503) {
            long[][] jArr5 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 15, internal2.NWORDS_FIELD);
            long[] jArr6 = new long[this.engine.params.NWORDS_FIELD];
            fpsqr_mont(jArr, jArr6);
            fpmul_mont(jArr, jArr6, jArr5[0]);
            int i48 = 0;
            while (i48 <= i12) {
                long[] jArr7 = jArr5[i48];
                i48++;
                fpmul_mont(jArr7, jArr6, jArr5[i48]);
                i12 = i12;
            }
            i11 = i12;
            c10 = 4;
            fpcopy(jArr, 0, jArr6);
            for (int i49 = 0; i49 < 8; i49++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr, jArr6, jArr6);
            for (int i50 = 0; i50 < 5; i50++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[8], jArr6, jArr6);
            for (int i51 = 0; i51 < 5; i51++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[6], jArr6, jArr6);
            for (int i52 = 0; i52 < 6; i52++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[9], jArr6, jArr6);
            for (int i53 = 0; i53 < 7; i53++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[0], jArr6, jArr6);
            for (int i54 = 0; i54 < 7; i54++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr, jArr6, jArr6);
            for (int i55 = 0; i55 < 7; i55++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[6], jArr6, jArr6);
            for (int i56 = 0; i56 < 7; i56++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[2], jArr6, jArr6);
            for (int i57 = 0; i57 < 5; i57++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[8], jArr6, jArr6);
            for (int i58 = 0; i58 < 7; i58++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr, jArr6, jArr6);
            for (int i59 = 0; i59 < 8; i59++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[10], jArr6, jArr6);
            for (int i60 = 0; i60 < 5; i60++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[0], jArr6, jArr6);
            for (int i61 = 0; i61 < 6; i61++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[10], jArr6, jArr6);
            for (int i62 = 0; i62 < 5; i62++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[10], jArr6, jArr6);
            for (int i63 = 0; i63 < 5; i63++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[5], jArr6, jArr6);
            for (int i64 = 0; i64 < 5; i64++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[2], jArr6, jArr6);
            for (int i65 = 0; i65 < 5; i65++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[6], jArr6, jArr6);
            for (int i66 = 0; i66 < 5; i66++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[3], jArr6, jArr6);
            for (int i67 = 0; i67 < 6; i67++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[5], jArr6, jArr6);
            int i68 = i10;
            for (int i69 = 0; i69 < i68; i69++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[i68], jArr6, jArr6);
            for (int i70 = 0; i70 < 5; i70++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[8], jArr6, jArr6);
            for (int i71 = 0; i71 < 5; i71++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[6], jArr6, jArr6);
            for (int i72 = 0; i72 < 5; i72++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[12], jArr6, jArr6);
            for (int i73 = 0; i73 < 6; i73++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[11], jArr6, jArr6);
            for (int i74 = 0; i74 < 8; i74++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[6], jArr6, jArr6);
            for (int i75 = 0; i75 < 5; i75++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[5], jArr6, jArr6);
            for (int i76 = 0; i76 < 5; i76++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[14], jArr6, jArr6);
            for (int i77 = 0; i77 < 7; i77++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[14], jArr6, jArr6);
            for (int i78 = 0; i78 < 5; i78++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[5], jArr6, jArr6);
            for (int i79 = 0; i79 < 5; i79++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[6], jArr6, jArr6);
            for (int i80 = 0; i80 < 8; i80++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[8], jArr6, jArr6);
            for (int i81 = 0; i81 < 5; i81++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr, jArr6, jArr6);
            for (int i82 = 0; i82 < 8; i82++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[4], jArr6, jArr6);
            for (int i83 = 0; i83 < 5; i83++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[6], jArr6, jArr6);
            for (int i84 = 0; i84 < 5; i84++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[5], jArr6, jArr6);
            for (int i85 = 0; i85 < 8; i85++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[7], jArr6, jArr6);
            for (int i86 = 0; i86 < 5; i86++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr, jArr6, jArr6);
            for (int i87 = 0; i87 < 5; i87++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[0], jArr6, jArr6);
            for (int i88 = 0; i88 < 5; i88++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[11], jArr6, jArr6);
            for (int i89 = 0; i89 < 5; i89++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[i11], jArr6, jArr6);
            for (int i90 = 0; i90 < 8; i90++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[1], jArr6, jArr6);
            for (int i91 = 0; i91 < 6; i91++) {
                fpsqr_mont(jArr6, jArr6);
            }
            fpmul_mont(jArr5[10], jArr6, jArr6);
            for (int i92 = 0; i92 < 49; i92++) {
                for (int i93 = 0; i93 < 5; i93++) {
                    fpsqr_mont(jArr6, jArr6);
                }
                fpmul_mont(jArr5[14], jArr6, jArr6);
            }
            fpcopy(jArr6, 0, jArr);
        } else {
            i11 = 13;
            c10 = 4;
        }
        Internal internal3 = this.engine.params;
        if (internal3.NBITS_FIELD == 610) {
            long[][] jArr8 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 31, internal3.NWORDS_FIELD);
            long[] jArr9 = new long[this.engine.params.NWORDS_FIELD];
            fpsqr_mont(jArr, jArr9);
            fpmul_mont(jArr, jArr9, jArr8[0]);
            int i94 = 0;
            while (i94 <= 29) {
                long[] jArr10 = jArr8[i94];
                i94++;
                fpmul_mont(jArr10, jArr9, jArr8[i94]);
            }
            fpcopy(jArr, 0, jArr9);
            for (int i95 = 0; i95 < 6; i95++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[6], jArr9, jArr9);
            for (int i96 = 0; i96 < 7; i96++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[30], jArr9, jArr9);
            for (int i97 = 0; i97 < 7; i97++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[25], jArr9, jArr9);
            for (int i98 = 0; i98 < 8; i98++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[28], jArr9, jArr9);
            for (int i99 = 0; i99 < 6; i99++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[7], jArr9, jArr9);
            for (int i100 = 0; i100 < 11; i100++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[11], jArr9, jArr9);
            for (int i101 = 0; i101 < 8; i101++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr, jArr9, jArr9);
            for (int i102 = 0; i102 < 6; i102++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[0], jArr9, jArr9);
            for (int i103 = 0; i103 < 8; i103++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[3], jArr9, jArr9);
            for (int i104 = 0; i104 < 7; i104++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[16], jArr9, jArr9);
            for (int i105 = 0; i105 < 6; i105++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[24], jArr9, jArr9);
            for (int i106 = 0; i106 < 6; i106++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[28], jArr9, jArr9);
            for (int i107 = 0; i107 < 9; i107++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[16], jArr9, jArr9);
            for (int i108 = 0; i108 < 6; i108++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[c10], jArr9, jArr9);
            for (int i109 = 0; i109 < 6; i109++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[3], jArr9, jArr9);
            for (int i110 = 0; i110 < 7; i110++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[i3], jArr9, jArr9);
            for (int i111 = 0; i111 < 6; i111++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[11], jArr9, jArr9);
            for (int i112 = 0; i112 < 6; i112++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[14], jArr9, jArr9);
            for (int i113 = 0; i113 < 7; i113++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[15], jArr9, jArr9);
            for (int i114 = 0; i114 < 6; i114++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[0], jArr9, jArr9);
            for (int i115 = 0; i115 < 9; i115++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[15], jArr9, jArr9);
            for (int i116 = 0; i116 < 8; i116++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[19], jArr9, jArr9);
            for (int i117 = 0; i117 < 6; i117++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[9], jArr9, jArr9);
            for (int i118 = 0; i118 < 6; i118++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[5], jArr9, jArr9);
            for (int i119 = 0; i119 < 7; i119++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[27], jArr9, jArr9);
            for (int i120 = 0; i120 < 6; i120++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[28], jArr9, jArr9);
            for (int i121 = 0; i121 < 6; i121++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[29], jArr9, jArr9);
            for (int i122 = 0; i122 < 6; i122++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[1], jArr9, jArr9);
            for (int i123 = 0; i123 < 9; i123++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[3], jArr9, jArr9);
            for (int i124 = 0; i124 < 6; i124++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[2], jArr9, jArr9);
            for (int i125 = 0; i125 < 6; i125++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[30], jArr9, jArr9);
            for (int i126 = 0; i126 < 8; i126++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[25], jArr9, jArr9);
            for (int i127 = 0; i127 < 7; i127++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[28], jArr9, jArr9);
            for (int i128 = 0; i128 < 9; i128++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[22], jArr9, jArr9);
            for (int i129 = 0; i129 < 8; i129++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[3], jArr9, jArr9);
            for (int i130 = 0; i130 < 6; i130++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[22], jArr9, jArr9);
            for (int i131 = 0; i131 < 6; i131++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[7], jArr9, jArr9);
            for (int i132 = 0; i132 < 6; i132++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[9], jArr9, jArr9);
            for (int i133 = 0; i133 < 6; i133++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[c10], jArr9, jArr9);
            for (int i134 = 0; i134 < 7; i134++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[i3], jArr9, jArr9);
            for (int i135 = 0; i135 < 11; i135++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[10], jArr9, jArr9);
            for (int i136 = 0; i136 < 8; i136++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[26], jArr9, jArr9);
            for (int i137 = 0; i137 < 11; i137++) {
                fpsqr_mont(jArr9, jArr9);
            }
            fpmul_mont(jArr8[2], jArr9, jArr9);
            for (int i138 = 0; i138 < 50; i138++) {
                for (int i139 = 0; i139 < 6; i139++) {
                    fpsqr_mont(jArr9, jArr9);
                }
                fpmul_mont(jArr8[30], jArr9, jArr9);
            }
            fpcopy(jArr9, 0, jArr);
        }
        Internal internal4 = this.engine.params;
        if (internal4.NBITS_FIELD == 751) {
            long[][] jArr11 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 27, internal4.NWORDS_FIELD);
            long[] jArr12 = new long[this.engine.params.NWORDS_FIELD];
            fpsqr_mont(jArr, jArr12);
            fpmul_mont(jArr, jArr12, jArr11[0]);
            fpmul_mont(jArr11[0], jArr12, jArr11[1]);
            fpmul_mont(jArr11[1], jArr12, jArr11[2]);
            fpmul_mont(jArr11[2], jArr12, jArr11[3]);
            long[] jArr13 = jArr11[3];
            fpmul_mont(jArr13, jArr12, jArr13);
            int i140 = 3;
            while (i140 <= 8) {
                long[] jArr14 = jArr11[i140];
                i140++;
                fpmul_mont(jArr14, jArr12, jArr11[i140]);
            }
            long[] jArr15 = jArr11[9];
            fpmul_mont(jArr15, jArr12, jArr15);
            int i141 = 9;
            for (int i142 = i3; i141 <= i142; i142 = 20) {
                long[] jArr16 = jArr11[i141];
                i141++;
                fpmul_mont(jArr16, jArr12, jArr11[i141]);
            }
            long[] jArr17 = jArr11[21];
            fpmul_mont(jArr17, jArr12, jArr17);
            int i143 = 21;
            for (int i144 = 24; i143 <= i144; i144 = 24) {
                long[] jArr18 = jArr11[i143];
                i143++;
                fpmul_mont(jArr18, jArr12, jArr11[i143]);
            }
            long[] jArr19 = jArr11[25];
            fpmul_mont(jArr19, jArr12, jArr19);
            fpmul_mont(jArr11[25], jArr12, jArr11[26]);
            fpcopy(jArr, 0, jArr12);
            for (int i145 = 0; i145 < 6; i145++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[20], jArr12, jArr12);
            for (int i146 = 0; i146 < 6; i146++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[24], jArr12, jArr12);
            for (int i147 = 0; i147 < 6; i147++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[11], jArr12, jArr12);
            for (int i148 = 0; i148 < 6; i148++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[8], jArr12, jArr12);
            for (int i149 = 0; i149 < 8; i149++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[2], jArr12, jArr12);
            for (int i150 = 0; i150 < 6; i150++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[23], jArr12, jArr12);
            for (int i151 = 0; i151 < 6; i151++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[2], jArr12, jArr12);
            for (int i152 = 0; i152 < 9; i152++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[2], jArr12, jArr12);
            for (int i153 = 0; i153 < 10; i153++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[15], jArr12, jArr12);
            for (int i154 = 0; i154 < 8; i154++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[i11], jArr12, jArr12);
            for (int i155 = 0; i155 < 8; i155++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[26], jArr12, jArr12);
            for (int i156 = 0; i156 < 8; i156++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[20], jArr12, jArr12);
            for (int i157 = 0; i157 < 6; i157++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[11], jArr12, jArr12);
            for (int i158 = 0; i158 < 6; i158++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[10], jArr12, jArr12);
            for (int i159 = 0; i159 < 6; i159++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[14], jArr12, jArr12);
            for (int i160 = 0; i160 < 6; i160++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[c10], jArr12, jArr12);
            for (int i161 = 0; i161 < 10; i161++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[18], jArr12, jArr12);
            for (int i162 = 0; i162 < 6; i162++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[1], jArr12, jArr12);
            for (int i163 = 0; i163 < 7; i163++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[22], jArr12, jArr12);
            for (int i164 = 0; i164 < 10; i164++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[6], jArr12, jArr12);
            for (int i165 = 0; i165 < 7; i165++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[24], jArr12, jArr12);
            for (int i166 = 0; i166 < 6; i166++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[9], jArr12, jArr12);
            for (int i167 = 0; i167 < 8; i167++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[18], jArr12, jArr12);
            for (int i168 = 0; i168 < 6; i168++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[17], jArr12, jArr12);
            for (int i169 = 0; i169 < 8; i169++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr, jArr12, jArr12);
            for (int i170 = 0; i170 < 10; i170++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[16], jArr12, jArr12);
            for (int i171 = 0; i171 < 6; i171++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[7], jArr12, jArr12);
            for (int i172 = 0; i172 < 6; i172++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[0], jArr12, jArr12);
            for (int i173 = 0; i173 < 7; i173++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[12], jArr12, jArr12);
            for (int i174 = 0; i174 < 7; i174++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[19], jArr12, jArr12);
            for (int i175 = 0; i175 < 6; i175++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[22], jArr12, jArr12);
            for (int i176 = 0; i176 < 6; i176++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[25], jArr12, jArr12);
            for (int i177 = 0; i177 < 7; i177++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[2], jArr12, jArr12);
            for (int i178 = 0; i178 < 6; i178++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[10], jArr12, jArr12);
            for (int i179 = 0; i179 < 7; i179++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[22], jArr12, jArr12);
            for (int i180 = 0; i180 < 8; i180++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[18], jArr12, jArr12);
            for (int i181 = 0; i181 < 6; i181++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[c10], jArr12, jArr12);
            for (int i182 = 0; i182 < 6; i182++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[14], jArr12, jArr12);
            for (int i183 = 0; i183 < 7; i183++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[i11], jArr12, jArr12);
            for (int i184 = 0; i184 < 6; i184++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[5], jArr12, jArr12);
            for (int i185 = 0; i185 < 6; i185++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[23], jArr12, jArr12);
            for (int i186 = 0; i186 < 6; i186++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[21], jArr12, jArr12);
            for (int i187 = 0; i187 < 6; i187++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[2], jArr12, jArr12);
            for (int i188 = 0; i188 < 7; i188++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[23], jArr12, jArr12);
            for (int i189 = 0; i189 < 8; i189++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[12], jArr12, jArr12);
            for (int i190 = 0; i190 < 6; i190++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[9], jArr12, jArr12);
            for (int i191 = 0; i191 < 6; i191++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[3], jArr12, jArr12);
            for (int i192 = 0; i192 < 7; i192++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[i11], jArr12, jArr12);
            for (int i193 = 0; i193 < 7; i193++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[17], jArr12, jArr12);
            for (int i194 = 0; i194 < 8; i194++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[26], jArr12, jArr12);
            for (int i195 = 0; i195 < 8; i195++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[5], jArr12, jArr12);
            for (int i196 = 0; i196 < 8; i196++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[8], jArr12, jArr12);
            for (int i197 = 0; i197 < 6; i197++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[2], jArr12, jArr12);
            for (int i198 = 0; i198 < 6; i198++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[11], jArr12, jArr12);
            for (int i199 = 0; i199 < 7; i199++) {
                fpsqr_mont(jArr12, jArr12);
            }
            fpmul_mont(jArr11[20], jArr12, jArr12);
            for (int i200 = 0; i200 < 61; i200++) {
                for (int i201 = 0; i201 < 6; i201++) {
                    fpsqr_mont(jArr12, jArr12);
                }
                fpmul_mont(jArr11[26], jArr12, jArr12);
            }
            fpcopy(jArr12, 0, jArr);
        }
    }

    private void fpinv_mont(long[] jArr) {
        long[] jArr2 = new long[this.engine.params.NWORDS_FIELD];
        fpcopy(jArr, 0, jArr2);
        fpinv_chain_mont(jArr2);
        fpsqr_mont(jArr2, jArr2);
        fpsqr_mont(jArr2, jArr2);
        fpmul_mont(jArr, jArr2, jArr);
    }

    private void fpinv_mont_bingcd(long[] jArr) {
        int i3 = this.engine.params.NWORDS_FIELD;
        long[] jArr2 = new long[i3];
        long[] jArr3 = new long[i3];
        int[] iArr = new int[1];
        if (is_felm_zero(jArr)) {
            return;
        }
        fpinv_mont_bingcd_partial(jArr, jArr2, iArr);
        int i10 = iArr[0];
        Internal internal = this.engine.params;
        if (i10 <= internal.MAXBITS_FIELD) {
            fpmul_mont(jArr2, internal.Montgomery_R2, jArr2);
            iArr[0] = iArr[0] + this.engine.params.MAXBITS_FIELD;
        }
        fpmul_mont(jArr2, this.engine.params.Montgomery_R2, jArr2);
        Internal internal2 = this.engine.params;
        power2_setup(jArr3, (internal2.MAXBITS_FIELD * 2) - iArr[0], internal2.NWORDS_FIELD);
        fpmul_mont(jArr2, jArr3, jArr);
    }

    private void fpinv_mont_bingcd_partial(long[] jArr, long[] jArr2, int[] iArr) {
        int i3 = this.engine.params.NWORDS_FIELD;
        long[] jArr3 = new long[i3];
        long[] jArr4 = new long[i3];
        long[] jArr5 = new long[i3];
        fpcopy(jArr, 0, jArr3);
        fpcopy(this.engine.params.PRIME, 0, jArr4);
        fpzero(jArr2);
        jArr2[0] = 1;
        fpzero(jArr5);
        iArr[0] = 0;
        while (!is_felm_zero(jArr4)) {
            int i10 = ((iArr[0] + 1) / 64) + 1;
            if (i10 < this.engine.params.NWORDS_FIELD) {
                if (is_felm_even(jArr4)) {
                    mp_shiftr1(jArr4);
                } else {
                    if (is_felm_even(jArr3)) {
                        mp_shiftr1(jArr3);
                    } else if (is_felm_lt(jArr4, jArr3)) {
                        mp_sub(jArr3, jArr4, jArr3, this.engine.params.NWORDS_FIELD);
                        mp_shiftr1(jArr3);
                        mp_add(jArr2, jArr5, jArr2, i10);
                    } else {
                        mp_sub(jArr4, jArr3, jArr4, this.engine.params.NWORDS_FIELD);
                        mp_shiftr1(jArr4);
                        mp_add(jArr2, jArr5, jArr5, i10);
                    }
                    mp_shiftl1(jArr5, i10);
                }
                mp_shiftl1(jArr2, i10);
            } else {
                if (is_felm_even(jArr4)) {
                    mp_shiftr1(jArr4);
                } else {
                    if (is_felm_even(jArr3)) {
                        mp_shiftr1(jArr3);
                    } else if (is_felm_lt(jArr4, jArr3)) {
                        mp_sub(jArr3, jArr4, jArr3, this.engine.params.NWORDS_FIELD);
                        mp_shiftr1(jArr3);
                        mp_add(jArr2, jArr5, jArr2, this.engine.params.NWORDS_FIELD);
                    } else {
                        mp_sub(jArr4, jArr3, jArr4, this.engine.params.NWORDS_FIELD);
                        mp_shiftr1(jArr4);
                        mp_add(jArr2, jArr5, jArr5, this.engine.params.NWORDS_FIELD);
                    }
                    i10 = this.engine.params.NWORDS_FIELD;
                    mp_shiftl1(jArr5, i10);
                }
                i10 = this.engine.params.NWORDS_FIELD;
                mp_shiftl1(jArr2, i10);
            }
            iArr[0] = iArr[0] + 1;
        }
        if (is_felm_lt(this.engine.params.PRIME, jArr2)) {
            Internal internal = this.engine.params;
            mp_sub(jArr2, internal.PRIME, jArr2, internal.NWORDS_FIELD);
        }
    }

    private void from_mont(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[this.engine.params.NWORDS_FIELD];
        jArr3[0] = 1;
        fpmul_mont(jArr, jArr3, jArr2);
        fpcorrectionPRIME(jArr2);
    }

    private int is_digit_lessthan_ct(long j, long j3) {
        return (int) ((j ^ ((j3 ^ (j - j3)) | (j ^ j3))) >>> 63);
    }

    private int is_digit_nonzero_ct(long j) {
        return (int) ((j | (0 - j)) >>> 63);
    }

    private int is_digit_zero_ct(long j) {
        return is_digit_nonzero_ct(j) ^ 1;
    }

    private boolean is_even_mod_order(long[] jArr) {
        return ((jArr[0] & 1) ^ 1) == 1;
    }

    private static boolean is_felm_even(long[] jArr) {
        return (jArr[0] & 1) == 0;
    }

    private boolean is_felm_lt(long[] jArr, long[] jArr2) {
        for (int i3 = this.engine.params.NWORDS_FIELD - 1; i3 >= 0; i3--) {
            long j = jArr[i3];
            long j3 = j - Long.MIN_VALUE;
            long j10 = jArr2[i3];
            if (j3 < j10 - Long.MIN_VALUE) {
                return true;
            }
            if (j - Long.MIN_VALUE > j10 - Long.MIN_VALUE) {
                return false;
            }
        }
        return false;
    }

    private boolean is_lt_mod_order(long[] jArr, long[] jArr2) {
        for (int i3 = this.engine.params.NWORDS_ORDER - 1; i3 >= 0; i3--) {
            long j = jArr[i3];
            long j3 = j - Long.MIN_VALUE;
            long j10 = jArr2[i3];
            if (j3 < j10 - Long.MIN_VALUE) {
                return true;
            }
            if (j - Long.MIN_VALUE > j10 - Long.MIN_VALUE) {
                return false;
            }
        }
        return false;
    }

    private boolean is_zero(long[] jArr, int i3) {
        for (int i10 = 0; i10 < i3; i10++) {
            if (jArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    private boolean is_zero_mod_order(long[] jArr) {
        for (int i3 = 0; i3 < this.engine.params.NWORDS_ORDER; i3++) {
            if (jArr[i3] != 0) {
                return false;
            }
        }
        return true;
    }

    private void mp2_sub_p4(long[][] jArr, long[][] jArr2, long[][] jArr3) {
        mp_subPRIME_p4(jArr[0], jArr2[0], jArr3[0]);
        mp_subPRIME_p4(jArr[1], jArr2[1], jArr3[1]);
    }

    private int mp_add(long[] jArr, int i3, long[] jArr2, int i10, long[] jArr3, int i11, int i12) {
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            long j = i13;
            long j3 = jArr[i14 + i3] + j;
            int i15 = i14 + i11;
            jArr3[i15] = jArr2[i14 + i10] + j3;
            i13 = is_digit_lessthan_ct(jArr3[i15], j3) | is_digit_lessthan_ct(j3, j);
        }
        return i13;
    }

    private void mp_dblsubfast(long[] jArr, long[] jArr2, long[] jArr3) {
        mp_sub(jArr3, jArr, jArr3, this.engine.params.NWORDS_FIELD * 2);
        mp_sub(jArr3, jArr2, jArr3, this.engine.params.NWORDS_FIELD * 2);
    }

    private void mp_shiftl1(long[] jArr, int i3) {
        for (int i10 = i3 - 1; i10 > 0; i10--) {
            jArr[i10] = (jArr[i10] << 1) ^ (jArr[i10 - 1] >>> 63);
        }
        jArr[0] = jArr[0] << 1;
    }

    private void mp_shiftr1(long[] jArr) {
        int i3 = 0;
        while (true) {
            int i10 = this.engine.params.NWORDS_FIELD;
            if (i3 >= i10 - 1) {
                int i11 = i10 - 1;
                jArr[i11] = jArr[i11] >>> 1;
                return;
            } else {
                int i12 = i3 + 1;
                jArr[i3] = (jArr[i3] >>> 1) ^ (jArr[i12] << 63);
                i3 = i12;
            }
        }
    }

    private void mp_subPRIME_p2(long[] jArr, long[] jArr2, long[] jArr3) {
        int i3 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < this.engine.params.NWORDS_FIELD) {
            long j = jArr[i10];
            long j3 = jArr2[i10];
            long j10 = j - j3;
            int is_digit_lessthan_ct = is_digit_lessthan_ct(j, j3) | (is_digit_zero_ct(j10) & i11);
            jArr3[i10] = j10 - i11;
            i10++;
            i11 = is_digit_lessthan_ct;
        }
        int i12 = 0;
        while (true) {
            Internal internal = this.engine.params;
            if (i3 >= internal.NWORDS_FIELD) {
                return;
            }
            long j11 = i12;
            long j12 = jArr3[i3] + j11;
            jArr3[i3] = internal.PRIMEx2[i3] + j12;
            i12 = is_digit_lessthan_ct(j12, j11) | is_digit_lessthan_ct(jArr3[i3], j12);
            i3++;
        }
    }

    private void mp_subPRIME_p4(long[] jArr, long[] jArr2, long[] jArr3) {
        int i3 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < this.engine.params.NWORDS_FIELD) {
            long j = jArr[i10];
            long j3 = jArr2[i10];
            long j10 = j - j3;
            int is_digit_lessthan_ct = is_digit_lessthan_ct(j, j3) | (is_digit_zero_ct(j10) & i11);
            jArr3[i10] = j10 - i11;
            i10++;
            i11 = is_digit_lessthan_ct;
        }
        int i12 = 0;
        while (true) {
            Internal internal = this.engine.params;
            if (i3 >= internal.NWORDS_FIELD) {
                return;
            }
            long j11 = i12;
            long j12 = jArr3[i3] + j11;
            jArr3[i3] = internal.PRIMEx4[i3] + j12;
            i12 = is_digit_lessthan_ct(j12, j11) | is_digit_lessthan_ct(jArr3[i3], j12);
            i3++;
        }
    }

    private void mp_subaddfast(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[this.engine.params.NWORDS_FIELD];
        long mp_sub = 0 - mp_sub(jArr, jArr2, jArr3, r0 * 2);
        int i3 = 0;
        while (true) {
            Internal internal = this.engine.params;
            int i10 = internal.NWORDS_FIELD;
            if (i3 >= i10) {
                mp_add(jArr3, i10, jArr4, jArr3, i10, i10);
                return;
            } else {
                jArr4[i3] = internal.PRIME[i3] & mp_sub;
                i3++;
            }
        }
    }

    private void power2_setup(long[] jArr, int i3, int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            jArr[i12] = 0;
        }
        while (i3 >= 0) {
            if (i3 < 64) {
                jArr[i11] = 1 << i3;
            }
            i3 -= 64;
            i11++;
        }
    }

    private void rdc_mont(long[] jArr, long[] jArr2) {
        int i3;
        int i10 = this.engine.params.PRIME_ZERO_WORDS;
        int i11 = 2;
        long[] jArr3 = new long[2];
        char c10 = 0;
        for (int i12 = 0; i12 < this.engine.params.NWORDS_FIELD; i12++) {
            jArr2[i12] = 0;
        }
        int i13 = 0;
        long j = 0;
        long j3 = 0;
        while (true) {
            i3 = this.engine.params.NWORDS_FIELD;
            if (i13 >= i3) {
                break;
            }
            long j10 = j;
            long j11 = j3;
            long j12 = 0;
            for (int i14 = 0; i14 < i13; i14++) {
                Internal internal = this.engine.params;
                if (i14 < (i13 - internal.PRIME_ZERO_WORDS) + 1) {
                    digit_x_digit(jArr2[i14], internal.PRIMEp1[i13 - i14], jArr3);
                    long j13 = j11 + jArr3[0];
                    j10 += jArr3[1] + is_digit_lessthan_ct(j13, r1);
                    j12 += is_digit_lessthan_ct(j10, r1);
                    j11 = j13;
                }
            }
            long j14 = jArr[i13];
            long j15 = j11 + j14;
            long is_digit_lessthan_ct = is_digit_lessthan_ct(j15, j14) + j10;
            j = j12 + (r1 & is_digit_zero_ct(is_digit_lessthan_ct));
            jArr2[i13] = j15;
            i13++;
            j3 = is_digit_lessthan_ct;
        }
        while (true) {
            int i15 = this.engine.params.NWORDS_FIELD;
            if (i3 >= (i15 * 2) - 1) {
                long j16 = jArr[(i15 * i11) - 1];
                long j17 = j3 + j16;
                is_digit_lessthan_ct(j17, j16);
                jArr2[this.engine.params.NWORDS_FIELD - 1] = j17;
                return;
            }
            if (i10 > 0) {
                i10--;
            }
            int i16 = (i3 - i15) + 1;
            long j18 = j;
            long j19 = j3;
            long j20 = 0;
            while (true) {
                Internal internal2 = this.engine.params;
                int i17 = internal2.NWORDS_FIELD;
                if (i16 < i17) {
                    if (i16 < i17 - i10) {
                        digit_x_digit(jArr2[i16], internal2.PRIMEp1[i3 - i16], jArr3);
                        long j21 = j19 + jArr3[c10];
                        j18 += jArr3[1] + is_digit_lessthan_ct(j21, r1);
                        j20 += is_digit_lessthan_ct(j18, r1);
                        j19 = j21;
                    }
                    i16++;
                }
            }
            long j22 = jArr[i3];
            long j23 = j19 + j22;
            int i18 = i11;
            long is_digit_lessthan_ct2 = is_digit_lessthan_ct(j23, j22) + j18;
            long is_digit_zero_ct = j20 + (r1 & is_digit_zero_ct(is_digit_lessthan_ct2));
            jArr2[i3 - this.engine.params.NWORDS_FIELD] = j23;
            i3++;
            j3 = is_digit_lessthan_ct2;
            c10 = 0;
            i11 = i18;
            j = is_digit_zero_ct;
        }
    }

    public static boolean subarrayEquals(long[] jArr, long[] jArr2, int i3) {
        for (int i10 = 0; i10 < i3; i10++) {
            if (jArr[i10] != jArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    private void to_mont(long[] jArr, long[] jArr2) {
        fpmul_mont(jArr, this.engine.params.Montgomery_R2, jArr2);
    }

    public void Montgomery_inversion_mod_order_bingcd(long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4, long[] jArr5) {
        Fpx fpx;
        long[] jArr6;
        long[] jArr7;
        long[] jArr8;
        int i3 = this.engine.params.NWORDS_ORDER;
        long[] jArr9 = new long[i3];
        long[] jArr10 = new long[i3];
        int[] iArr = new int[1];
        if (is_zero(jArr, i3)) {
            copy_words(jArr10, jArr2, this.engine.params.NWORDS_ORDER);
            return;
        }
        Montgomery_inversion_mod_order_bingcd_partial(jArr, jArr9, iArr, jArr3);
        if (iArr[0] <= this.engine.params.NBITS_ORDER) {
            fpx = this;
            jArr6 = jArr3;
            jArr7 = jArr4;
            jArr8 = jArr5;
            fpx.Montgomery_multiply_mod_order(jArr9, jArr8, jArr9, jArr6, jArr7);
            iArr[0] = iArr[0] + fpx.engine.params.NBITS_ORDER;
        } else {
            fpx = this;
            jArr6 = jArr3;
            jArr7 = jArr4;
            jArr8 = jArr5;
        }
        fpx.Montgomery_multiply_mod_order(jArr9, jArr8, jArr9, jArr6, jArr7);
        Internal internal = fpx.engine.params;
        power2_setup(jArr10, (internal.NBITS_ORDER * 2) - iArr[0], internal.NWORDS_ORDER);
        fpx.Montgomery_multiply_mod_order(jArr9, jArr10, jArr2, jArr6, jArr7);
    }

    public void Montgomery_multiply_mod_order(long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4, long[] jArr5) {
        int i3;
        int i10 = this.engine.params.NWORDS_ORDER;
        long[] jArr6 = new long[i10 * 2];
        long[] jArr7 = new long[i10 * 2];
        long[] jArr8 = new long[i10 * 2];
        multiply(jArr, jArr2, jArr6, i10);
        multiply(jArr6, jArr5, jArr7, this.engine.params.NWORDS_ORDER);
        multiply(jArr7, jArr4, jArr8, this.engine.params.NWORDS_ORDER);
        int mp_add = mp_add(jArr6, jArr8, jArr8, this.engine.params.NWORDS_ORDER * 2);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i3 = this.engine.params.NWORDS_ORDER;
            if (i12 >= i3) {
                break;
            }
            jArr3[i12] = jArr8[i3 + i12];
            i12++;
        }
        long mp_sub = mp_add - mp_sub(jArr3, jArr4, jArr3, i3);
        while (true) {
            int i13 = this.engine.params.NWORDS_ORDER;
            if (i11 >= i13) {
                mp_add(jArr3, jArr8, jArr3, i13);
                return;
            } else {
                jArr8[i11] = jArr4[i11] & mp_sub;
                i11++;
            }
        }
    }

    public void Montgomery_neg(long[] jArr, long[] jArr2) {
        int i3 = 0;
        int i10 = 0;
        while (i3 < this.engine.params.NWORDS_ORDER) {
            long j = jArr2[i3];
            long j3 = jArr[i3];
            long j10 = j - j3;
            int is_digit_lessthan_ct = is_digit_lessthan_ct(j, j3) | (is_digit_zero_ct(j10) & i10);
            jArr[i3] = j10 - i10;
            i3++;
            i10 = is_digit_lessthan_ct;
        }
    }

    public byte cmp_f2elm(long[][] jArr, long[][] jArr2) {
        int[] iArr = {2, this.engine.params.NWORDS_FIELD};
        Class cls = Long.TYPE;
        long[][] jArr3 = (long[][]) Array.newInstance((Class<?>) cls, iArr);
        long[][] jArr4 = (long[][]) Array.newInstance((Class<?>) cls, 2, this.engine.params.NWORDS_FIELD);
        fp2copy(jArr, jArr3);
        fp2copy(jArr2, jArr4);
        fp2correction(jArr3);
        fp2correction(jArr4);
        byte b2 = 0;
        for (int i3 = this.engine.params.NWORDS_FIELD - 1; i3 >= 0; i3--) {
            b2 = (byte) (b2 | (jArr3[0][i3] ^ jArr4[0][i3]) | (jArr3[1][i3] ^ jArr4[1][i3]));
        }
        return (byte) ((-b2) >>> 7);
    }

    public void copy_words(PointProj pointProj, PointProj pointProj2) {
        for (int i3 = 0; i3 < this.engine.params.NWORDS_FIELD; i3++) {
            long[][] jArr = pointProj2.f19464X;
            long[] jArr2 = jArr[0];
            long[][] jArr3 = pointProj.f19464X;
            jArr2[i3] = jArr3[0][i3];
            jArr[1][i3] = jArr3[1][i3];
            long[][] jArr4 = pointProj2.f19465Z;
            long[] jArr5 = jArr4[0];
            long[][] jArr6 = pointProj.f19465Z;
            jArr5[i3] = jArr6[0][i3];
            jArr4[1][i3] = jArr6[1][i3];
        }
    }

    public void ct_cmov(byte[] bArr, byte[] bArr2, int i3, byte b2) {
        for (int i10 = 0; i10 < i3; i10++) {
            byte b10 = bArr[i10];
            bArr[i10] = (byte) (b10 ^ ((bArr2[i10] ^ b10) & b2));
        }
    }

    public byte ct_compare(byte[] bArr, byte[] bArr2, int i3) {
        byte b2 = 0;
        for (int i10 = 0; i10 < i3; i10++) {
            b2 = (byte) (b2 | (bArr[i10] ^ bArr2[i10]));
        }
        return (byte) ((-b2) >>> 7);
    }

    public void cube_Fp2_cycl(long[][] jArr, long[] jArr2) {
        long[] jArr3 = new long[this.engine.params.NWORDS_FIELD];
        long[] jArr4 = jArr[0];
        fpaddPRIME(jArr4, jArr4, jArr3);
        fpsqr_mont(jArr3, jArr3);
        fpsubPRIME(jArr3, jArr2, jArr3);
        long[] jArr5 = jArr[1];
        fpmul_mont(jArr5, jArr3, jArr5);
        fpsubPRIME(jArr3, jArr2, jArr3);
        fpsubPRIME(jArr3, jArr2, jArr3);
        long[] jArr6 = jArr[0];
        fpmul_mont(jArr6, jArr3, jArr6);
    }

    public void decode_to_digits(byte[] bArr, int i3, long[] jArr, int i10, int i11) {
        jArr[i11 - 1] = 0;
        byte[] bArr2 = new byte[(i10 + 7) & (-8)];
        System.arraycopy(bArr, i3, bArr2, 0, i10);
        Pack.littleEndianToLong(bArr2, 0, jArr);
    }

    public void encode_to_bytes(long[] jArr, byte[] bArr, int i3, int i10) {
        byte[] bArr2 = new byte[((i10 * 4) + 7) & (-8)];
        Pack.longToLittleEndian(jArr, bArr2, 0);
        System.arraycopy(bArr2, 0, bArr, i3, i10);
    }

    public void fp2_conj(long[][] jArr, long[][] jArr2) {
        fpcopy(jArr[0], 0, jArr2[0]);
        fpcopy(jArr[1], 0, jArr2[1]);
        if (is_felm_zero(jArr2[1])) {
            return;
        }
        fpnegPRIME(jArr2[1]);
    }

    public void fp2_decode(byte[] bArr, long[][] jArr, int i3) {
        long[] jArr2 = jArr[0];
        Internal internal = this.engine.params;
        decode_to_digits(bArr, i3, jArr2, internal.FP2_ENCODED_BYTES / 2, internal.NWORDS_FIELD);
        Internal internal2 = this.engine.params;
        int i10 = internal2.FP2_ENCODED_BYTES;
        decode_to_digits(bArr, (i10 / 2) + i3, jArr[1], i10 / 2, internal2.NWORDS_FIELD);
        to_fp2mont(jArr, jArr);
    }

    public void fp2_encode(long[][] jArr, byte[] bArr, int i3) {
        long[][] jArr2 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 2, this.engine.params.NWORDS_FIELD);
        from_fp2mont(jArr, jArr2);
        encode_to_bytes(jArr2[0], bArr, i3, this.engine.params.FP2_ENCODED_BYTES / 2);
        long[] jArr3 = jArr2[1];
        int i10 = this.engine.params.FP2_ENCODED_BYTES;
        encode_to_bytes(jArr3, bArr, (i10 / 2) + i3, i10 / 2);
    }

    public void fp2add(long[][] jArr, long[][] jArr2, long[][] jArr3) {
        fpaddPRIME(jArr[0], jArr2[0], jArr3[0]);
        fpaddPRIME(jArr[1], jArr2[1], jArr3[1]);
    }

    public void fp2copy(long[] jArr, int i3, long[][] jArr2) {
        fpcopy(jArr, i3, jArr2[0]);
        fpcopy(jArr, i3 + this.engine.params.NWORDS_FIELD, jArr2[1]);
    }

    public void fp2correction(long[][] jArr) {
        fpcorrectionPRIME(jArr[0]);
        fpcorrectionPRIME(jArr[1]);
    }

    public void fp2div2(long[][] jArr, long[][] jArr2) {
        fpdiv2_PRIME(jArr[0], jArr2[0]);
        fpdiv2_PRIME(jArr[1], jArr2[1]);
    }

    public void fp2inv_mont(long[][] jArr) {
        long[][] jArr2 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 2, this.engine.params.NWORDS_FIELD);
        fpsqr_mont(jArr[0], jArr2[0]);
        fpsqr_mont(jArr[1], jArr2[1]);
        long[] jArr3 = jArr2[0];
        fpaddPRIME(jArr3, jArr2[1], jArr3);
        fpinv_mont(jArr2[0]);
        fpnegPRIME(jArr[1]);
        long[] jArr4 = jArr[0];
        fpmul_mont(jArr4, jArr2[0], jArr4);
        long[] jArr5 = jArr[1];
        fpmul_mont(jArr5, jArr2[0], jArr5);
    }

    public void fp2inv_mont_bingcd(long[][] jArr) {
        long[][] jArr2 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 2, this.engine.params.NWORDS_FIELD);
        fpsqr_mont(jArr[0], jArr2[0]);
        fpsqr_mont(jArr[1], jArr2[1]);
        long[] jArr3 = jArr2[0];
        fpaddPRIME(jArr3, jArr2[1], jArr3);
        fpinv_mont_bingcd(jArr2[0]);
        fpnegPRIME(jArr[1]);
        long[] jArr4 = jArr[0];
        fpmul_mont(jArr4, jArr2[0], jArr4);
        long[] jArr5 = jArr[1];
        fpmul_mont(jArr5, jArr2[0], jArr5);
    }

    public void fp2mul_mont(long[][] jArr, long[] jArr2, int i3, long[][] jArr3) {
        int i10 = this.engine.params.NWORDS_FIELD;
        long[] jArr4 = new long[i10];
        long[] jArr5 = new long[i10];
        long[] jArr6 = new long[i10 * 2];
        long[] jArr7 = new long[i10 * 2];
        long[] jArr8 = new long[i10 * 2];
        mp_add(jArr[0], jArr[1], jArr4, i10);
        int i11 = this.engine.params.NWORDS_FIELD;
        mp_add(jArr2, i3, jArr2, i3 + i11, jArr5, 0, i11);
        mp_mul(jArr2, i3, jArr[0], jArr6, this.engine.params.NWORDS_FIELD);
        int i12 = this.engine.params.NWORDS_FIELD;
        mp_mul(jArr2, i3 + i12, jArr[1], jArr7, i12);
        mp_mul(jArr4, jArr5, jArr8, this.engine.params.NWORDS_FIELD);
        mp_dblsubfast(jArr6, jArr7, jArr8);
        mp_subaddfast(jArr6, jArr7, jArr6);
        rdc_mont(jArr8, jArr3[1]);
        rdc_mont(jArr6, jArr3[0]);
    }

    public void fp2neg(long[][] jArr) {
        fpnegPRIME(jArr[0]);
        fpnegPRIME(jArr[1]);
    }

    public void fp2shl(long[][] jArr, int i3, long[][] jArr2) {
        fp2copy(jArr, jArr2);
        for (int i10 = 0; i10 < i3; i10++) {
            fp2add(jArr2, jArr2, jArr2);
        }
    }

    public void fp2sqr_mont(long[][] jArr, long[][] jArr2) {
        int i3 = this.engine.params.NWORDS_FIELD;
        long[] jArr3 = new long[i3];
        long[] jArr4 = new long[i3];
        long[] jArr5 = new long[i3];
        mp_add(jArr[0], jArr[1], jArr3, i3);
        mp_subPRIME_p4(jArr[0], jArr[1], jArr4);
        long[] jArr6 = jArr[0];
        mp_add(jArr6, jArr6, jArr5, this.engine.params.NWORDS_FIELD);
        fpmul_mont(jArr3, jArr4, jArr2[0]);
        fpmul_mont(jArr5, jArr[1], jArr2[1]);
    }

    public void fp2sub(long[][] jArr, long[][] jArr2, long[][] jArr3) {
        fpsubPRIME(jArr[0], jArr2[0], jArr3[0]);
        fpsubPRIME(jArr[1], jArr2[1], jArr3[1]);
    }

    public void fpaddPRIME(long[] jArr, long[] jArr2, long[] jArr3) {
        int i3 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < this.engine.params.NWORDS_FIELD; i11++) {
            long j = i10;
            long j3 = jArr[i11] + j;
            jArr3[i11] = jArr2[i11] + j3;
            i10 = is_digit_lessthan_ct(j3, j) | is_digit_lessthan_ct(jArr3[i11], j3);
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            Internal internal = this.engine.params;
            if (i12 >= internal.NWORDS_FIELD) {
                break;
            }
            long j10 = jArr3[i12];
            long j11 = internal.PRIMEx2[i12];
            long j12 = j10 - j11;
            int is_digit_lessthan_ct = is_digit_lessthan_ct(j10, j11) | (is_digit_zero_ct(j12) & i13);
            jArr3[i12] = j12 - i13;
            i12++;
            i13 = is_digit_lessthan_ct;
        }
        long j13 = 0 - i13;
        int i14 = 0;
        while (true) {
            Internal internal2 = this.engine.params;
            if (i3 >= internal2.NWORDS_FIELD) {
                return;
            }
            long j14 = i14;
            long j15 = jArr3[i3] + j14;
            jArr3[i3] = (internal2.PRIMEx2[i3] & j13) + j15;
            i14 = is_digit_lessthan_ct(j15, j14) | is_digit_lessthan_ct(jArr3[i3], j15);
            i3++;
        }
    }

    public void fpcopy(long[] jArr, int i3, long[] jArr2) {
        for (int i10 = 0; i10 < this.engine.params.NWORDS_FIELD; i10++) {
            jArr2[i10] = jArr[i10 + i3];
        }
    }

    public void fpcorrectionPRIME(long[] jArr) {
        int i3 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            Internal internal = this.engine.params;
            if (i10 >= internal.NWORDS_FIELD) {
                break;
            }
            long j = jArr[i10];
            long j3 = internal.PRIME[i10];
            long j10 = j - j3;
            int is_digit_lessthan_ct = is_digit_lessthan_ct(j, j3) | (is_digit_zero_ct(j10) & i11);
            jArr[i10] = j10 - i11;
            i10++;
            i11 = is_digit_lessthan_ct;
        }
        long j11 = 0 - i11;
        int i12 = 0;
        while (true) {
            Internal internal2 = this.engine.params;
            if (i3 >= internal2.NWORDS_FIELD) {
                return;
            }
            long j12 = i12;
            long j13 = jArr[i3] + j12;
            jArr[i3] = (internal2.PRIME[i3] & j11) + j13;
            i12 = is_digit_lessthan_ct(j13, j12) | is_digit_lessthan_ct(jArr[i3], j13);
            i3++;
        }
    }

    public void fpmul_mont(long[] jArr, int i3, long[] jArr2, long[] jArr3) {
        int i10 = this.engine.params.NWORDS_FIELD;
        long[] jArr4 = new long[i10 * 2];
        mp_mul(jArr, i3, jArr2, jArr4, i10);
        rdc_mont(jArr4, jArr3);
    }

    public void fpnegPRIME(long[] jArr) {
        int i3 = 0;
        int i10 = 0;
        while (true) {
            Internal internal = this.engine.params;
            if (i3 >= internal.NWORDS_FIELD) {
                return;
            }
            long j = internal.PRIMEx2[i3];
            long j3 = jArr[i3];
            long j10 = j - j3;
            int is_digit_lessthan_ct = is_digit_lessthan_ct(j, j3) | (is_digit_zero_ct(j10) & i10);
            jArr[i3] = j10 - i10;
            i3++;
            i10 = is_digit_lessthan_ct;
        }
    }

    public void fpsqr_mont(long[] jArr, long[] jArr2) {
        int i3 = this.engine.params.NWORDS_FIELD;
        long[] jArr3 = new long[i3 * 2];
        mp_mul(jArr, jArr, jArr3, i3);
        rdc_mont(jArr3, jArr2);
    }

    public void fpsubPRIME(long[] jArr, int i3, long[] jArr2, long[] jArr3) {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < this.engine.params.NWORDS_FIELD) {
            long j = jArr[i11 + i3];
            long j3 = jArr2[i11];
            long j10 = j - j3;
            int is_digit_lessthan_ct = is_digit_lessthan_ct(j, j3) | (is_digit_zero_ct(j10) & i12);
            jArr3[i11] = j10 - i12;
            i11++;
            i12 = is_digit_lessthan_ct;
        }
        long j11 = 0 - i12;
        int i13 = 0;
        while (true) {
            Internal internal = this.engine.params;
            if (i10 >= internal.NWORDS_FIELD) {
                return;
            }
            long j12 = i13;
            long j13 = jArr3[i10] + j12;
            jArr3[i10] = (internal.PRIMEx2[i10] & j11) + j13;
            i13 = is_digit_lessthan_ct(j13, j12) | is_digit_lessthan_ct(jArr3[i10], j13);
            i10++;
        }
    }

    public void fpzero(long[] jArr) {
        for (int i3 = 0; i3 < this.engine.params.NWORDS_FIELD; i3++) {
            jArr[i3] = 0;
        }
    }

    public void from_Montgomery_mod_order(long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4) {
        long[] jArr5 = new long[this.engine.params.NWORDS_ORDER];
        jArr5[0] = 1;
        Montgomery_multiply_mod_order(jArr, jArr5, jArr2, jArr3, jArr4);
    }

    public void from_fp2mont(long[][] jArr, long[][] jArr2) {
        from_mont(jArr[0], jArr2[0]);
        from_mont(jArr[1], jArr2[1]);
    }

    public void inv_mod_orderA(long[] jArr, long[] jArr2) {
        Internal internal = this.engine.params;
        int i3 = internal.NWORDS_ORDER;
        long[] jArr3 = new long[i3];
        long[] jArr4 = new long[i3];
        long[] jArr5 = new long[i3 * 2];
        long[] jArr6 = new long[i3];
        long[] jArr7 = new long[i3];
        int i10 = internal.NBITS_ORDER;
        int i11 = internal.OALICE_BITS;
        long j = (-1) >>> (i10 - i11);
        jArr7[i3 - 1] = 1 << (64 - (i10 - i11));
        jArr6[0] = 1;
        mp_sub(jArr, jArr6, jArr3, i3);
        if ((jArr[0] & 1) == 0 || is_zero(jArr3, this.engine.params.NWORDS_ORDER)) {
            copy_words(jArr, jArr2, this.engine.params.NWORDS_ORDER);
            int i12 = this.engine.params.NWORDS_ORDER - 1;
            jArr2[i12] = jArr2[i12] & j;
            return;
        }
        mp_sub(jArr7, jArr3, jArr2, this.engine.params.NWORDS_ORDER);
        mp_add(jArr2, jArr6, jArr2, this.engine.params.NWORDS_ORDER);
        copy_words(jArr3, jArr4, this.engine.params.NWORDS_ORDER);
        int i13 = 0;
        while ((jArr4[0] & 1) == 0) {
            i13++;
            mp_shiftr1(jArr4, this.engine.params.NWORDS_ORDER);
        }
        int i14 = this.engine.params.OALICE_BITS / i13;
        for (int i15 = 1; i15 < i14; i15 <<= 1) {
            multiply(jArr3, jArr3, jArr5, this.engine.params.NWORDS_ORDER);
            copy_words(jArr5, jArr3, this.engine.params.NWORDS_ORDER);
            int i16 = this.engine.params.NWORDS_ORDER;
            int i17 = i16 - 1;
            jArr3[i17] = jArr3[i17] & j;
            mp_add(jArr3, jArr6, jArr4, i16);
            int i18 = this.engine.params.NWORDS_ORDER;
            int i19 = i18 - 1;
            jArr4[i19] = jArr4[i19] & j;
            multiply(jArr2, jArr4, jArr5, i18);
            copy_words(jArr5, jArr2, this.engine.params.NWORDS_ORDER);
            int i20 = this.engine.params.NWORDS_ORDER - 1;
            jArr2[i20] = jArr2[i20] & j;
        }
    }

    public boolean is_felm_zero(long[] jArr) {
        for (int i3 = 0; i3 < this.engine.params.NWORDS_FIELD; i3++) {
            if (jArr[i3] != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean is_orderelm_lt(long[] jArr, long[] jArr2) {
        for (int i3 = this.engine.params.NWORDS_ORDER - 1; i3 >= 0; i3--) {
            long j = jArr[i3];
            long j3 = j - Long.MIN_VALUE;
            long j10 = jArr2[i3];
            if (j3 < j10 - Long.MIN_VALUE) {
                return true;
            }
            if (j - Long.MIN_VALUE > j10 - Long.MIN_VALUE) {
                return false;
            }
        }
        return false;
    }

    public boolean is_sqr_fp2(long[][] jArr, long[] jArr2) {
        int i3 = this.engine.params.NWORDS_FIELD;
        long[] jArr3 = new long[i3];
        long[] jArr4 = new long[i3];
        long[] jArr5 = new long[i3];
        long[] jArr6 = new long[i3];
        fpsqr_mont(jArr[0], jArr3);
        fpsqr_mont(jArr[1], jArr4);
        fpaddPRIME(jArr3, jArr4, jArr5);
        fpcopy(jArr5, 0, jArr2);
        for (int i10 = 0; i10 < this.engine.params.OALICE_BITS - 2; i10++) {
            fpsqr_mont(jArr2, jArr2);
        }
        int i11 = 0;
        while (true) {
            int i12 = this.engine.params.OBOB_EXPON;
            fpsqr_mont(jArr2, jArr6);
            if (i11 >= i12) {
                break;
            }
            fpmul_mont(jArr2, jArr6, jArr2);
            i11++;
        }
        fpcorrectionPRIME(jArr6);
        fpcorrectionPRIME(jArr5);
        return subarrayEquals(jArr6, jArr5, this.engine.params.NWORDS_FIELD);
    }

    public int mod3(long[] jArr) {
        int i3 = 0;
        int[] littleEndianToInt = Pack.littleEndianToInt(Pack.longToLittleEndian(jArr), 0, jArr.length * 2);
        for (int i10 = (this.engine.params.NWORDS_ORDER * 2) - 1; i10 >= 0; i10--) {
            i3 = (int) (((i3 << 32) | (littleEndianToInt[i10] & BodyPartID.bodyIdMax)) % 3);
        }
        return i3;
    }

    public void mont_n_way_inv(long[][][] jArr, int i3, long[][][] jArr2) {
        long[][] jArr3 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 2, this.engine.params.NWORDS_FIELD);
        fp2copy(jArr[0], jArr2[0]);
        for (int i10 = 1; i10 < i3; i10++) {
            fp2mul_mont(jArr2[i10 - 1], jArr[i10], jArr2[i10]);
        }
        int i11 = i3 - 1;
        fp2copy(jArr2[i11], jArr3);
        fp2inv_mont_bingcd(jArr3);
        while (i11 >= 1) {
            fp2mul_mont(jArr2[i11 - 1], jArr3, jArr2[i11]);
            fp2mul_mont(jArr3, jArr[i11], jArr3);
            i11--;
        }
        fp2copy(jArr3, jArr2[0]);
    }

    public void mp2_add(long[][] jArr, long[][] jArr2, long[][] jArr3) {
        mp_add(jArr[0], jArr2[0], jArr3[0], this.engine.params.NWORDS_FIELD);
        mp_add(jArr[1], jArr2[1], jArr3[1], this.engine.params.NWORDS_FIELD);
    }

    public void mp2_sub_p2(long[][] jArr, long[][] jArr2, long[][] jArr3) {
        mp_subPRIME_p2(jArr[0], jArr2[0], jArr3[0]);
        mp_subPRIME_p2(jArr[1], jArr2[1], jArr3[1]);
    }

    public void mp_mul(long[] jArr, int i3, long[] jArr2, long[] jArr3, int i10) {
        long[] jArr4 = new long[2];
        long j = 0;
        long j3 = 0;
        int i11 = 0;
        while (i11 < i10) {
            long j10 = j;
            long j11 = j3;
            long j12 = 0;
            int i12 = 0;
            while (i12 <= i11) {
                int i13 = i12;
                digit_x_digit(jArr[i12 + i3], jArr2[i11 - i12], jArr4);
                j11 += jArr4[0];
                j12 += is_digit_lessthan_ct(r0, r2);
                j10 += jArr4[1] + is_digit_lessthan_ct(j11, r0);
                i12 = i13 + 1;
            }
            jArr3[i11] = j11;
            i11++;
            j = j12;
            j3 = j10;
        }
        Fpx fpx = this;
        int i14 = i10;
        while (true) {
            int i15 = (i10 * 2) - 1;
            if (i14 >= i15) {
                jArr3[i15] = j3;
                return;
            }
            long j13 = j;
            long j14 = j3;
            int i16 = (i14 - i10) + 1;
            long j15 = 0;
            while (i16 < i10) {
                long j16 = jArr[i16 + i3];
                long j17 = jArr2[i14 - i16];
                int i17 = i16;
                Fpx fpx2 = fpx;
                fpx2.digit_x_digit(j16, j17, jArr4);
                j14 += jArr4[0];
                j15 += fpx2.is_digit_lessthan_ct(r1, r3);
                fpx = fpx2;
                j13 += jArr4[1] + fpx2.is_digit_lessthan_ct(j14, r1);
                i16 = i17 + 1;
            }
            jArr3[i14] = j14;
            i14++;
            j = j15;
            j3 = j13;
        }
    }

    public int mp_sub(long[] jArr, long[] jArr2, long[] jArr3, int i3) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < i3) {
            long j = jArr[i10];
            long j3 = jArr2[i10];
            long j10 = j - j3;
            int is_digit_lessthan_ct = is_digit_lessthan_ct(j, j3) | (is_digit_zero_ct(j10) & i11);
            jArr3[i10] = j10 - i11;
            i10++;
            i11 = is_digit_lessthan_ct;
        }
        return i11;
    }

    public void mul3(byte[] bArr) {
        Internal internal = this.engine.params;
        int i3 = internal.NWORDS_ORDER;
        long[] jArr = new long[i3];
        long[] jArr2 = new long[i3];
        decode_to_digits(bArr, 0, jArr, internal.SECRETKEY_B_BYTES, i3);
        mp_add(jArr, jArr, jArr2, this.engine.params.NWORDS_ORDER);
        mp_add(jArr, jArr2, jArr, this.engine.params.NWORDS_ORDER);
        encode_to_bytes(jArr, bArr, 0, this.engine.params.SECRETKEY_B_BYTES);
    }

    public void multiply(long[] jArr, long[] jArr2, long[] jArr3, int i3) {
        long[] jArr4 = new long[2];
        long j = 0;
        long j3 = 0;
        int i10 = 0;
        while (i10 < i3) {
            long j10 = j;
            long j11 = j3;
            long j12 = 0;
            int i11 = 0;
            while (i11 <= i10) {
                int i12 = i11;
                digit_x_digit(jArr[i11], jArr2[i10 - i11], jArr4);
                j11 += jArr4[0];
                j12 += is_digit_lessthan_ct(r0, r2);
                j10 += jArr4[1] + is_digit_lessthan_ct(j11, r0);
                i11 = i12 + 1;
            }
            jArr3[i10] = j11;
            i10++;
            j = j12;
            j3 = j10;
        }
        Fpx fpx = this;
        int i13 = i3;
        while (true) {
            int i14 = (i3 * 2) - 1;
            if (i13 >= i14) {
                jArr3[i14] = j3;
                return;
            }
            long j13 = j;
            long j14 = j3;
            int i15 = (i13 - i3) + 1;
            long j15 = 0;
            while (i15 < i3) {
                long j16 = jArr[i15];
                long j17 = jArr2[i13 - i15];
                int i16 = i15;
                Fpx fpx2 = fpx;
                fpx2.digit_x_digit(j16, j17, jArr4);
                j14 += jArr4[0];
                j15 += fpx2.is_digit_lessthan_ct(r1, r3);
                fpx = fpx2;
                j13 += jArr4[1] + fpx2.is_digit_lessthan_ct(j14, r1);
                i15 = i16 + 1;
            }
            jArr3[i13] = j14;
            i13++;
            j = j15;
            j3 = j13;
        }
    }

    public void sqr_Fp2_cycl(long[][] jArr, long[] jArr2) {
        long[] jArr3 = new long[this.engine.params.NWORDS_FIELD];
        fpaddPRIME(jArr[0], jArr[1], jArr3);
        fpsqr_mont(jArr3, jArr3);
        fpsubPRIME(jArr3, jArr2, jArr[1]);
        fpsqr_mont(jArr[0], jArr3);
        fpaddPRIME(jArr3, jArr3, jArr3);
        fpsubPRIME(jArr3, jArr2, jArr[0]);
    }

    public void sqrt_Fp2(long[][] jArr, long[][] jArr2) {
        int i3 = this.engine.params.NWORDS_FIELD;
        long[] jArr3 = new long[i3];
        long[] jArr4 = new long[i3];
        long[] jArr5 = new long[i3];
        long[] jArr6 = new long[i3];
        fpsqr_mont(jArr[0], jArr3);
        fpsqr_mont(jArr[1], jArr4);
        fpaddPRIME(jArr3, jArr4, jArr3);
        fpcopy(jArr3, 0, jArr4);
        for (int i10 = 0; i10 < this.engine.params.OALICE_BITS - 2; i10++) {
            fpsqr_mont(jArr4, jArr4);
        }
        for (int i11 = 0; i11 < this.engine.params.OBOB_EXPON; i11++) {
            fpsqr_mont(jArr4, jArr3);
            fpmul_mont(jArr4, jArr3, jArr4);
        }
        fpaddPRIME(jArr[0], jArr4, jArr3);
        fpdiv2_PRIME(jArr3, jArr3);
        fpcopy(jArr3, 0, jArr5);
        fpinv_chain_mont(jArr5);
        fpmul_mont(jArr3, jArr5, jArr4);
        fpmul_mont(jArr5, jArr[1], jArr5);
        fpdiv2_PRIME(jArr5, jArr5);
        fpsqr_mont(jArr4, jArr6);
        fpcorrectionPRIME(jArr3);
        fpcorrectionPRIME(jArr6);
        if (subarrayEquals(jArr3, jArr6, this.engine.params.NWORDS_FIELD)) {
            fpcopy(jArr4, 0, jArr2[0]);
            fpcopy(jArr5, 0, jArr2[1]);
        } else {
            fpnegPRIME(jArr4);
            fpcopy(jArr5, 0, jArr2[0]);
            fpcopy(jArr4, 0, jArr2[1]);
        }
    }

    public void to_Montgomery_mod_order(long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4, long[] jArr5) {
        Montgomery_multiply_mod_order(jArr, jArr5, jArr2, jArr3, jArr4);
    }

    public void to_fp2mont(long[][] jArr, long[][] jArr2) {
        to_mont(jArr[0], jArr2[0]);
        to_mont(jArr[1], jArr2[1]);
    }

    private int mp_add(long[] jArr, int i3, long[] jArr2, long[] jArr3, int i10, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            long j = i12;
            long j3 = jArr[i13 + i3] + j;
            int i14 = i13 + i10;
            jArr3[i14] = jArr2[i13] + j3;
            i12 = is_digit_lessthan_ct(jArr3[i14], j3) | is_digit_lessthan_ct(j3, j);
        }
        return i12;
    }

    private void mp_shiftr1(long[] jArr, int i3) {
        int i10 = 0;
        while (true) {
            int i11 = i3 - 1;
            if (i10 >= i11) {
                jArr[i11] = jArr[i11] >>> 1;
                return;
            } else {
                int i12 = i10 + 1;
                jArr[i10] = (jArr[i10] >>> 1) ^ (jArr[i12] << 63);
                i10 = i12;
            }
        }
    }

    public static boolean subarrayEquals(long[][] jArr, long[] jArr2, int i3, int i10) {
        int length = jArr[0].length;
        for (int i11 = 0; i11 < i10; i11++) {
            if (jArr[i11 / length][i11 % length] != jArr2[i11 + i3]) {
                return false;
            }
        }
        return true;
    }

    public void copy_words(long[] jArr, long[] jArr2, int i3) {
        for (int i10 = 0; i10 < i3; i10++) {
            jArr2[i10] = jArr[i10];
        }
    }

    public void fp2copy(long[][] jArr, int i3, long[][] jArr2) {
        fpcopy(jArr[i3], 0, jArr2[0]);
        fpcopy(jArr[i3 + 1], 0, jArr2[1]);
    }

    public void fp2mul_mont(long[][] jArr, long[][] jArr2, int i3, long[][] jArr3) {
        int i10 = this.engine.params.NWORDS_FIELD;
        long[] jArr4 = new long[i10];
        long[] jArr5 = new long[i10];
        long[] jArr6 = new long[i10 * 2];
        long[] jArr7 = new long[i10 * 2];
        long[] jArr8 = new long[i10 * 2];
        mp_add(jArr[0], jArr[1], jArr4, i10);
        int i11 = i3 + 1;
        mp_add(jArr2[i3], jArr2[i11], jArr5, this.engine.params.NWORDS_FIELD);
        mp_mul(jArr[0], jArr2[i3], jArr6, this.engine.params.NWORDS_FIELD);
        mp_mul(jArr[1], jArr2[i11], jArr7, this.engine.params.NWORDS_FIELD);
        mp_mul(jArr4, jArr5, jArr8, this.engine.params.NWORDS_FIELD);
        mp_dblsubfast(jArr6, jArr7, jArr8);
        mp_subaddfast(jArr6, jArr7, jArr6);
        rdc_mont(jArr8, jArr3[1]);
        rdc_mont(jArr6, jArr3[0]);
    }

    public void fpmul_mont(long[] jArr, long[] jArr2, long[] jArr3) {
        int i3 = this.engine.params.NWORDS_FIELD;
        long[] jArr4 = new long[i3 * 2];
        mp_mul(jArr, jArr2, jArr4, i3);
        rdc_mont(jArr4, jArr3);
    }

    public void fpsubPRIME(long[] jArr, long[] jArr2, int i3, long[] jArr3) {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < this.engine.params.NWORDS_FIELD) {
            long j = jArr[i11];
            long j3 = jArr2[i11 + i3];
            long j10 = j - j3;
            int is_digit_lessthan_ct = is_digit_lessthan_ct(j, j3) | (is_digit_zero_ct(j10) & i12);
            jArr3[i11] = j10 - i12;
            i11++;
            i12 = is_digit_lessthan_ct;
        }
        long j11 = 0 - i12;
        int i13 = 0;
        while (true) {
            Internal internal = this.engine.params;
            if (i10 >= internal.NWORDS_FIELD) {
                return;
            }
            long j12 = i13;
            long j13 = jArr3[i10] + j12;
            jArr3[i10] = (internal.PRIMEx2[i10] & j11) + j13;
            i13 = is_digit_lessthan_ct(j13, j12) | is_digit_lessthan_ct(jArr3[i10], j13);
            i10++;
        }
    }

    public void mp_mul(long[] jArr, long[] jArr2, long[] jArr3, int i3) {
        long[] jArr4 = new long[2];
        long j = 0;
        long j3 = 0;
        int i10 = 0;
        while (i10 < i3) {
            long j10 = j;
            long j11 = j3;
            long j12 = 0;
            int i11 = 0;
            while (i11 <= i10) {
                int i12 = i11;
                digit_x_digit(jArr[i11], jArr2[i10 - i11], jArr4);
                j11 += jArr4[0];
                j12 += is_digit_lessthan_ct(r0, r2);
                j10 += jArr4[1] + is_digit_lessthan_ct(j11, r0);
                i11 = i12 + 1;
            }
            jArr3[i10] = j11;
            i10++;
            j = j12;
            j3 = j10;
        }
        Fpx fpx = this;
        int i13 = i3;
        while (true) {
            int i14 = (i3 * 2) - 1;
            if (i13 >= i14) {
                jArr3[i14] = j3;
                return;
            }
            long j13 = j;
            long j14 = j3;
            int i15 = (i13 - i3) + 1;
            long j15 = 0;
            while (i15 < i3) {
                long j16 = jArr[i15];
                long j17 = jArr2[i13 - i15];
                int i16 = i15;
                Fpx fpx2 = fpx;
                fpx2.digit_x_digit(j16, j17, jArr4);
                j14 += jArr4[0];
                j15 += fpx2.is_digit_lessthan_ct(r1, r3);
                fpx = fpx2;
                j13 += jArr4[1] + fpx2.is_digit_lessthan_ct(j14, r1);
                i15 = i16 + 1;
            }
            jArr3[i13] = j14;
            i13++;
            j = j15;
            j3 = j13;
        }
    }

    public static boolean subarrayEquals(long[][] jArr, long[][] jArr2, int i3) {
        int length = jArr2[0].length;
        for (int i10 = 0; i10 < i3; i10++) {
            int i11 = i10 / length;
            int i12 = i10 % length;
            if (jArr[i11][i12] != jArr2[i11][i12]) {
                return false;
            }
        }
        return true;
    }

    public void fp2copy(long[][] jArr, long[][] jArr2) {
        fpcopy(jArr[0], 0, jArr2[0]);
        fpcopy(jArr[1], 0, jArr2[1]);
    }

    public void fp2mul_mont(long[][] jArr, long[][] jArr2, long[][] jArr3) {
        int i3 = this.engine.params.NWORDS_FIELD;
        long[] jArr4 = new long[i3];
        long[] jArr5 = new long[i3];
        long[] jArr6 = new long[i3 * 2];
        long[] jArr7 = new long[i3 * 2];
        long[] jArr8 = new long[i3 * 2];
        mp_add(jArr[0], jArr[1], jArr4, i3);
        mp_add(jArr2[0], jArr2[1], jArr5, this.engine.params.NWORDS_FIELD);
        mp_mul(jArr[0], jArr2[0], jArr6, this.engine.params.NWORDS_FIELD);
        mp_mul(jArr[1], jArr2[1], jArr7, this.engine.params.NWORDS_FIELD);
        mp_mul(jArr4, jArr5, jArr8, this.engine.params.NWORDS_FIELD);
        mp_dblsubfast(jArr6, jArr7, jArr8);
        mp_subaddfast(jArr6, jArr7, jArr6);
        rdc_mont(jArr8, jArr3[1]);
        rdc_mont(jArr6, jArr3[0]);
    }

    public void fpsubPRIME(long[] jArr, long[] jArr2, long[] jArr3) {
        int i3 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < this.engine.params.NWORDS_FIELD) {
            long j = jArr[i10];
            long j3 = jArr2[i10];
            long j10 = j - j3;
            int is_digit_lessthan_ct = is_digit_lessthan_ct(j, j3) | (is_digit_zero_ct(j10) & i11);
            jArr3[i10] = j10 - i11;
            i10++;
            i11 = is_digit_lessthan_ct;
        }
        long j11 = 0 - i11;
        int i12 = 0;
        while (true) {
            Internal internal = this.engine.params;
            if (i3 >= internal.NWORDS_FIELD) {
                return;
            }
            long j12 = i12;
            long j13 = jArr3[i3] + j12;
            jArr3[i3] = (internal.PRIMEx2[i3] & j11) + j13;
            i12 = is_digit_lessthan_ct(j13, j12) | is_digit_lessthan_ct(jArr3[i3], j13);
            i3++;
        }
    }

    public int mp_add(long[] jArr, long[] jArr2, long[] jArr3, int i3) {
        int i10 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            long j = i10;
            long j3 = jArr[i11] + j;
            jArr3[i11] = jArr2[i11] + j3;
            i10 = is_digit_lessthan_ct(j3, j) | is_digit_lessthan_ct(jArr3[i11], j3);
        }
        return i10;
    }

    public static boolean subarrayEquals(long[][] jArr, long[][] jArr2, int i3, int i10) {
        int length = jArr2[0].length;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = i11 + i3;
            if (jArr[i11 / length][i11 % length] != jArr2[i12 / length][i12 % length]) {
                return false;
            }
        }
        return true;
    }
}
