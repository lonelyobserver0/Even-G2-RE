package org.bouncycastle.pqc.crypto.cmce;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import kotlin.UByte;
import kotlin.jvm.internal.LongCompanionObject;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class CMCEEngine {
    private int COND_BYTES;
    private int GFBITS;
    private int GFMASK;
    private int IRR_BYTES;
    private int PK_NCOLS;
    private int PK_NROWS;
    private int PK_ROW_BYTES;
    private int SYND_BYTES;
    private int SYS_N;
    private int SYS_T;
    private BENES benes;
    private boolean countErrorIndices;
    private final int defaultKeySize;
    private GF gf;
    private int[] poly;
    private boolean usePadding;
    private boolean usePivots;

    public CMCEEngine(int i3, int i10, int i11, int[] iArr, boolean z2, int i12) {
        BENES benes13;
        this.usePivots = z2;
        this.SYS_N = i10;
        this.SYS_T = i11;
        this.GFBITS = i3;
        this.poly = iArr;
        this.defaultKeySize = i12;
        this.IRR_BYTES = i11 * 2;
        this.COND_BYTES = ((i3 * 2) - 1) * (1 << (i3 - 4));
        int i13 = i11 * i3;
        this.PK_NROWS = i13;
        int i14 = i10 - i13;
        this.PK_NCOLS = i14;
        this.PK_ROW_BYTES = (i14 + 7) / 8;
        this.SYND_BYTES = (i13 + 7) / 8;
        this.GFMASK = (1 << i3) - 1;
        if (i3 == 12) {
            this.gf = new GF12(i3);
            benes13 = new BENES12(this.SYS_N, this.SYS_T, this.GFBITS);
        } else {
            this.gf = new GF13(i3);
            benes13 = new BENES13(this.SYS_N, this.SYS_T, this.GFBITS);
        }
        this.benes = benes13;
        this.usePadding = this.SYS_T % 8 != 0;
        this.countErrorIndices = (1 << this.GFBITS) > this.SYS_N;
    }

    private void GF_mul(short[] sArr, short[] sArr2, short[] sArr3) {
        int i3;
        int i10;
        short[] sArr4 = new short[(this.SYS_T * 2) - 1];
        for (int i11 = 0; i11 < (this.SYS_T * 2) - 1; i11++) {
            sArr4[i11] = 0;
        }
        int i12 = 0;
        while (true) {
            i3 = this.SYS_T;
            if (i12 >= i3) {
                break;
            }
            for (int i13 = 0; i13 < this.SYS_T; i13++) {
                int i14 = i12 + i13;
                sArr4[i14] = (short) (this.gf.gf_mul(sArr2[i12], sArr3[i13]) ^ sArr4[i14]);
            }
            i12++;
        }
        int i15 = (i3 - 1) * 2;
        while (true) {
            i10 = this.SYS_T;
            if (i15 < i10) {
                break;
            }
            int i16 = 0;
            while (true) {
                int[] iArr = this.poly;
                if (i16 != iArr.length) {
                    int i17 = iArr[i16];
                    if (i17 == 0 && this.GFBITS == 12) {
                        int i18 = i15 - this.SYS_T;
                        sArr4[i18] = (short) (sArr4[i18] ^ this.gf.gf_mul(sArr4[i15], (short) 2));
                    } else {
                        int i19 = (i15 - this.SYS_T) + i17;
                        sArr4[i19] = (short) (sArr4[i19] ^ sArr4[i15]);
                    }
                    i16++;
                }
            }
            i15--;
        }
        System.arraycopy(sArr4, 0, sArr, 0, i10);
        for (int i20 = 0; i20 < this.SYS_T; i20++) {
            sArr[i20] = sArr4[i20];
        }
    }

    private void bm(short[] sArr, short[] sArr2) {
        int i3;
        int i10 = this.SYS_T;
        short[] sArr3 = new short[i10 + 1];
        short[] sArr4 = new short[i10 + 1];
        short[] sArr5 = new short[i10 + 1];
        short s10 = 0;
        for (int i11 = 0; i11 < this.SYS_T + 1; i11++) {
            sArr5[i11] = 0;
            sArr4[i11] = 0;
        }
        sArr4[0] = 1;
        sArr5[1] = 1;
        short s11 = 1;
        short s12 = 0;
        short s13 = 0;
        while (s12 < this.SYS_T * 2) {
            short s14 = s10;
            short s15 = s14;
            for (int i12 = s14; i12 <= min(s12, this.SYS_T); i12++) {
                s15 = (short) (s15 ^ this.gf.gf_mul(sArr4[i12], sArr2[s12 - i12]));
            }
            short s16 = (short) (((short) (((short) (((short) (s15 - 1)) >> 15)) & 1)) - 1);
            short s17 = (short) (((short) (((short) (((short) (((short) (s12 - (s13 * 2))) >> 15)) & 1)) - 1)) & s16);
            for (int i13 = s10; i13 <= this.SYS_T; i13++) {
                sArr3[i13] = sArr4[i13];
            }
            short gf_frac = this.gf.gf_frac(s11, s15);
            int i14 = s10;
            short s18 = s10;
            while (i14 <= this.SYS_T) {
                sArr4[i14] = (short) ((this.gf.gf_mul(gf_frac, sArr5[i14]) & s16) ^ sArr4[i14]);
                i14++;
                s18 = s18;
            }
            short s19 = s18;
            int i15 = ~s17;
            int i16 = s12 + 1;
            s13 = (short) (((i16 - s13) & s17) | (s13 & i15));
            int i17 = s19;
            while (true) {
                i3 = this.SYS_T;
                if (i17 > i3) {
                    break;
                }
                sArr5[i17] = (short) ((sArr5[i17] & i15) | (sArr3[i17] & s17));
                i17++;
            }
            s11 = (short) ((i15 & s11) | (s15 & s17));
            while (i3 >= 1) {
                sArr5[i3] = sArr5[i3 - 1];
                i3--;
            }
            sArr5[s19] = s19;
            s12 = (short) i16;
            s10 = s19;
        }
        int i18 = s10;
        while (true) {
            int i19 = this.SYS_T;
            if (i18 > i19) {
                return;
            }
            sArr[i18] = sArr4[i19 - i18];
            i18++;
        }
    }

    public static void cbrecursion(byte[] bArr, long j, long j3, short[] sArr, int i3, long j10, long j11, int[] iArr) {
        long j12;
        int i10;
        int i11;
        int i12;
        char c10;
        long j13;
        long j14;
        long j15;
        long j16 = j11;
        long j17 = 1;
        long j18 = 7;
        char c11 = 3;
        if (j10 == 1) {
            int i13 = (int) (j >> 3);
            bArr[i13] = (byte) ((get_q_short(iArr, i3) << ((int) (j & 7))) ^ bArr[i13]);
            return;
        }
        if (sArr != null) {
            long j19 = 0;
            while (j19 < j16) {
                int i14 = (int) j19;
                long j20 = j17;
                iArr[i14] = sArr[(int) (j19 ^ j20)] | ((sArr[i14] ^ 1) << 16);
                j19 += j20;
                j17 = j20;
            }
            j12 = j17;
        } else {
            j12 = 1;
            long j21 = 0;
            while (j21 < j16) {
                long j22 = i3;
                iArr[(int) j21] = ((get_q_short(iArr, (int) (j22 + j21)) ^ 1) << 16) | get_q_short(iArr, (int) (j22 + (j21 ^ 1)));
                j21++;
                j18 = j18;
            }
        }
        long j23 = j18;
        int i15 = (int) j16;
        sort32(iArr, 0, i15);
        long j24 = 0;
        while (true) {
            i10 = Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
            if (j24 >= j16) {
                break;
            }
            int i16 = (int) j24;
            int i17 = 65535 & iArr[i16];
            if (j24 >= i17) {
                i16 = i17;
            }
            iArr[(int) (j16 + j24)] = i16 | (i17 << 16);
            j24 += j12;
        }
        for (long j25 = 0; j25 < j16; j25 += j12) {
            iArr[(int) j25] = (int) ((iArr[r7] << 16) | j25);
        }
        sort32(iArr, 0, i15);
        long j26 = 0;
        while (j26 < j16) {
            int i18 = (int) j26;
            iArr[i18] = (iArr[i18] << 16) + (iArr[(int) (j16 + j26)] >> 16);
            j26 += j12;
            c11 = c11;
        }
        char c12 = c11;
        sort32(iArr, 0, i15);
        if (j10 <= 10) {
            for (long j27 = 0; j27 < j16; j27 += j12) {
                int i19 = (int) (j16 + j27);
                iArr[i19] = ((iArr[(int) j27] & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) << 10) | (iArr[i19] & 1023);
            }
            long j28 = j12;
            while (j28 < j10 - j12) {
                long j29 = 0;
                while (j29 < j16) {
                    iArr[(int) j29] = (int) (((iArr[(int) (j16 + j29)] & (-1024)) << 6) | j29);
                    j29 += j12;
                    j28 = j28;
                }
                long j30 = j28;
                sort32(iArr, 0, i15);
                for (long j31 = 0; j31 < j16; j31 += j12) {
                    int i20 = (int) j31;
                    iArr[i20] = (iArr[i20] << 20) | iArr[(int) (j16 + j31)];
                }
                sort32(iArr, 0, i15);
                for (long j32 = 0; j32 < j16; j32 += j12) {
                    int i21 = iArr[(int) j32];
                    int i22 = 1048575 & i21;
                    int i23 = (int) (j16 + j32);
                    int i24 = (i21 & 1047552) | (iArr[i23] & 1023);
                    if (i22 >= i24) {
                        i22 = i24;
                    }
                    iArr[i23] = i22;
                }
                j28 = j30 + j12;
            }
            for (long j33 = 0; j33 < j16; j33 += j12) {
                int i25 = (int) (j16 + j33);
                iArr[i25] = iArr[i25] & 1023;
            }
            i11 = 65535;
            i12 = -65536;
            c10 = c12;
            j13 = j12;
        } else {
            int i26 = -65536;
            for (long j34 = 0; j34 < j16; j34 += j12) {
                int i27 = (int) (j16 + j34);
                iArr[i27] = (iArr[(int) j34] << 16) | (iArr[i27] & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            }
            long j35 = j12;
            while (j35 < j10 - j12) {
                long j36 = 0;
                while (j36 < j16) {
                    iArr[(int) j36] = (int) ((iArr[(int) (j16 + j36)] & r23) | j36);
                    j36 += j12;
                    i10 = i10;
                    i26 = i26;
                }
                int i28 = i10;
                int i29 = i26;
                sort32(iArr, 0, i15);
                long j37 = 0;
                while (j37 < j16) {
                    int i30 = (int) j37;
                    long j38 = j12;
                    iArr[i30] = (iArr[i30] << 16) | (iArr[(int) (j16 + j37)] & i28);
                    j37 += j38;
                    c12 = c12;
                    j12 = j38;
                }
                char c13 = c12;
                long j39 = j12;
                if (j35 < j10 - 2) {
                    for (long j40 = 0; j40 < j16; j40 += j39) {
                        int i31 = (int) (j16 + j40);
                        iArr[i31] = (iArr[(int) j40] & i29) | (iArr[i31] >> 16);
                    }
                    sort32(iArr, i15, (int) (j16 * 2));
                    for (long j41 = 0; j41 < j16; j41 += j39) {
                        int i32 = (int) (j16 + j41);
                        iArr[i32] = (iArr[i32] << 16) | (iArr[(int) j41] & i28);
                    }
                }
                sort32(iArr, 0, i15);
                for (long j42 = 0; j42 < j16; j42 += j39) {
                    int i33 = (int) (j16 + j42);
                    int i34 = iArr[i33];
                    int i35 = (i34 & i29) | (iArr[(int) j42] & i28);
                    if (i35 < i34) {
                        iArr[i33] = i35;
                    }
                }
                j35 += j39;
                i10 = i28;
                c12 = c13;
                i26 = i29;
                j12 = j39;
            }
            i11 = i10;
            i12 = i26;
            c10 = c12;
            j13 = j12;
            for (long j43 = 0; j43 < j16; j43 += j13) {
                int i36 = (int) (j16 + j43);
                iArr[i36] = iArr[i36] & i11;
            }
        }
        long j44 = 0;
        if (sArr != null) {
            while (j44 < j16) {
                iArr[(int) j44] = (int) ((sArr[r0] << 16) + j44);
                j44 += j13;
            }
        } else {
            while (j44 < j16) {
                iArr[(int) j44] = (int) ((get_q_short(iArr, (int) (i3 + j44)) << 16) + j44);
                j44 += j13;
            }
        }
        sort32(iArr, 0, i15);
        long j45 = j;
        int i37 = i11;
        long j46 = 0;
        while (true) {
            j14 = j16 / 2;
            if (j46 >= j14) {
                break;
            }
            long j47 = j46 * 2;
            long j48 = j16 + j47;
            int i38 = (int) j48;
            int i39 = i37;
            int i40 = iArr[i38] & 1;
            char c14 = c10;
            int i41 = (int) (i40 + j47);
            long j49 = j45;
            int i42 = (int) (j49 >> c14);
            bArr[i42] = (byte) ((i40 << ((int) (j49 & j23))) ^ bArr[i42]);
            j45 = j49 + j3;
            iArr[i38] = (iArr[(int) j47] << 16) | i41;
            iArr[(int) (j48 + j13)] = (iArr[(int) (j47 + j13)] << 16) | (i41 ^ 1);
            j46 += j13;
            i37 = i39;
            j16 = j11;
            c10 = c14;
        }
        int i43 = i37;
        char c15 = c10;
        long j50 = j11 * 2;
        sort32(iArr, i15, (int) j50);
        long j51 = j10 * 2;
        long j52 = ((j51 - 3) * j3 * j14) + j45;
        long j53 = 0;
        while (true) {
            j15 = j50;
            if (j53 >= j14) {
                break;
            }
            long j54 = j53 * 2;
            long j55 = j51;
            long j56 = j11 + j54;
            int i44 = iArr[(int) j56];
            int i45 = i44 & 1;
            int i46 = (int) (i45 + j54);
            int i47 = i46 ^ 1;
            int i48 = (int) (j52 >> c15);
            bArr[i48] = (byte) (bArr[i48] ^ (i45 << ((int) (j52 & j23))));
            j52 += j3;
            iArr[(int) j54] = (i44 & i43) | (i46 << 16);
            iArr[(int) (j54 + j13)] = (i47 << 16) | (iArr[(int) (j56 + j13)] & i43);
            j53 += j13;
            j50 = j15;
            j51 = j55;
        }
        sort32(iArr, 0, i15);
        long j57 = j52 - (((j51 - 2) * j3) * j14);
        short[] sArr2 = new short[i15 * 4];
        for (long j58 = 0; j58 < j15; j58 += j13) {
            long j59 = j58 * 2;
            int i49 = iArr[(int) j58];
            sArr2[(int) j59] = (short) i49;
            sArr2[(int) (j59 + j13)] = (short) ((i49 & i12) >> 16);
        }
        for (long j60 = 0; j60 < j14; j60 += j13) {
            long j61 = j60 * 2;
            sArr2[(int) j60] = (short) ((iArr[(int) j61] & i43) >>> 1);
            sArr2[(int) (j60 + j14)] = (short) ((iArr[(int) (j61 + j13)] & i43) >>> 1);
        }
        for (long j62 = 0; j62 < j14; j62 += j13) {
            long j63 = j62 * 2;
            iArr[(int) ((j11 / 4) + j11 + j62)] = sArr2[(int) j63] | (sArr2[(int) (j63 + j13)] << 16);
        }
        long j64 = j3 * 2;
        long j65 = (j11 / 4) + j11;
        long j66 = j10 - j13;
        cbrecursion(bArr, j57, j64, null, ((int) j65) * 2, j66, j14, iArr);
        cbrecursion(bArr, j57 + j3, j64, null, (int) ((j65 * 2) + j14), j66, j14, iArr);
    }

    private static void controlbitsfrompermutation(byte[] bArr, short[] sArr, long j, long j3) {
        long j10 = j3;
        int[] iArr = new int[(int) (j10 * 2)];
        int i3 = (int) j10;
        short[] sArr2 = new short[i3];
        while (true) {
            short s10 = 0;
            for (int i10 = 0; i10 < (((((j * 2) - 1) * j10) / 2) + 7) / 8; i10++) {
                bArr[i10] = 0;
            }
            cbrecursion(bArr, 0L, 1L, sArr, 0, j, j10, iArr);
            for (int i11 = 0; i11 < j3; i11++) {
                sArr2[i11] = (short) i11;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < j; i13++) {
                layer(sArr2, bArr, i12, i13, i3);
                i12 = (int) (i12 + (j3 >> 4));
            }
            for (int i14 = (int) (j - 2); i14 >= 0; i14--) {
                layer(sArr2, bArr, i12, i14, i3);
                i12 = (int) (i12 + (j3 >> 4));
            }
            int i15 = 0;
            while (i15 < j3) {
                short s11 = (short) (s10 | (sArr[i15] ^ sArr2[i15]));
                i15++;
                s10 = s11;
            }
            if (s10 == 0) {
                return;
            } else {
                j10 = j3;
            }
        }
    }

    private static int ctz(long j) {
        int i3 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < 64; i11++) {
            int i12 = (int) ((j >> i11) & 1);
            i10 |= i12;
            i3 += (i12 ^ 1) & (i10 ^ 1);
        }
        return i3;
    }

    private int decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i3;
        int i10;
        int i11 = this.SYS_T;
        short[] sArr = new short[i11 + 1];
        int i12 = this.SYS_N;
        short[] sArr2 = new short[i12];
        short[] sArr3 = new short[i11 * 2];
        short[] sArr4 = new short[i11 * 2];
        short[] sArr5 = new short[i11 + 1];
        short[] sArr6 = new short[i12];
        byte[] bArr4 = new byte[i12 / 8];
        int i13 = 0;
        while (true) {
            i3 = this.SYND_BYTES;
            if (i13 >= i3) {
                break;
            }
            bArr4[i13] = bArr3[i13];
            i13++;
        }
        while (i3 < this.SYS_N / 8) {
            bArr4[i3] = 0;
            i3++;
        }
        int i14 = 0;
        while (true) {
            i10 = this.SYS_T;
            if (i14 >= i10) {
                break;
            }
            sArr[i14] = Utils.load_gf(bArr2, (i14 * 2) + 40, this.GFMASK);
            i14++;
        }
        sArr[i10] = 1;
        this.benes.support_gen(sArr2, bArr2);
        synd(sArr3, sArr, sArr2, bArr4);
        bm(sArr5, sArr3);
        root(sArr6, sArr5, sArr2);
        for (int i15 = 0; i15 < this.SYS_N / 8; i15++) {
            bArr[i15] = 0;
        }
        int i16 = 0;
        for (int i17 = 0; i17 < this.SYS_N; i17++) {
            short gf_iszero = (short) (this.gf.gf_iszero(sArr6[i17]) & 1);
            int i18 = i17 / 8;
            bArr[i18] = (byte) (bArr[i18] | (gf_iszero << (i17 % 8)));
            i16 += gf_iszero;
        }
        synd(sArr4, sArr, sArr2, bArr);
        int i19 = this.SYS_T ^ i16;
        for (int i20 = 0; i20 < this.SYS_T * 2; i20++) {
            i19 |= sArr3[i20] ^ sArr4[i20];
        }
        return (((i19 - 1) >> 15) & 1) ^ 1;
    }

    private void encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, SecureRandom secureRandom) {
        generate_error_vector(bArr3, secureRandom);
        syndrome(bArr, bArr2, bArr3);
    }

    private short eval(short[] sArr, short s10) {
        int i3 = this.SYS_T;
        short s11 = sArr[i3];
        for (int i10 = i3 - 1; i10 >= 0; i10--) {
            s11 = this.gf.gf_add(this.gf.gf_mul(s11, s10), sArr[i10]);
        }
        return s11;
    }

    private void generate_error_vector(byte[] bArr, SecureRandom secureRandom) {
        int i3;
        int i10 = this.SYS_T;
        short[] sArr = new short[i10 * 2];
        short[] sArr2 = new short[i10];
        byte[] bArr2 = new byte[i10];
        while (true) {
            if (this.countErrorIndices) {
                byte[] bArr3 = new byte[this.SYS_T * 4];
                secureRandom.nextBytes(bArr3);
                for (int i11 = 0; i11 < this.SYS_T * 2; i11++) {
                    sArr[i11] = Utils.load_gf(bArr3, i11 * 2, this.GFMASK);
                }
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    i3 = this.SYS_T;
                    if (i12 >= i3 * 2 || i13 >= i3) {
                        break;
                    }
                    short s10 = sArr[i12];
                    if (s10 < this.SYS_N) {
                        sArr2[i13] = s10;
                        i13++;
                    }
                    i12++;
                }
                if (i13 < i3) {
                    continue;
                }
            } else {
                byte[] bArr4 = new byte[this.SYS_T * 2];
                secureRandom.nextBytes(bArr4);
                for (int i14 = 0; i14 < this.SYS_T; i14++) {
                    sArr2[i14] = Utils.load_gf(bArr4, i14 * 2, this.GFMASK);
                }
            }
            boolean z2 = false;
            for (int i15 = 1; i15 < this.SYS_T && !z2; i15++) {
                int i16 = 0;
                while (true) {
                    if (i16 >= i15) {
                        break;
                    }
                    if (sArr2[i15] == sArr2[i16]) {
                        z2 = true;
                        break;
                    }
                    i16++;
                }
            }
            if (!z2) {
                break;
            }
        }
        for (int i17 = 0; i17 < this.SYS_T; i17++) {
            bArr2[i17] = (byte) (1 << (sArr2[i17] & 7));
        }
        for (short s11 = 0; s11 < this.SYS_N / 8; s11 = (short) (s11 + 1)) {
            bArr[s11] = 0;
            for (int i18 = 0; i18 < this.SYS_T; i18++) {
                bArr[s11] = (byte) ((((short) (same_mask32(s11, (short) (sArr2[i18] >> 3)) & 255)) & bArr2[i18]) | bArr[s11]);
            }
        }
    }

    private int generate_irr_poly(short[] sArr) {
        int i3 = this.SYS_T;
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i3 + 1, i3);
        sArr2[0][0] = 1;
        for (int i10 = 1; i10 < this.SYS_T; i10++) {
            sArr2[0][i10] = 0;
        }
        for (int i11 = 0; i11 < this.SYS_T; i11++) {
            sArr2[1][i11] = sArr[i11];
        }
        for (int i12 = 2; i12 <= this.SYS_T; i12++) {
            GF_mul(sArr2[i12], sArr2[i12 - 1], sArr);
        }
        int i13 = 0;
        while (i13 < this.SYS_T) {
            int i14 = i13 + 1;
            for (int i15 = i14; i15 < this.SYS_T; i15++) {
                short gf_iszero = this.gf.gf_iszero(sArr2[i13][i13]);
                for (int i16 = i13; i16 < this.SYS_T + 1; i16++) {
                    short[] sArr3 = sArr2[i16];
                    sArr3[i13] = (short) (sArr3[i13] ^ (sArr3[i15] & gf_iszero));
                }
            }
            short s10 = sArr2[i13][i13];
            if (s10 == 0) {
                return -1;
            }
            short gf_inv = this.gf.gf_inv(s10);
            for (int i17 = i13; i17 < this.SYS_T + 1; i17++) {
                short[] sArr4 = sArr2[i17];
                sArr4[i13] = this.gf.gf_mul(sArr4[i13], gf_inv);
            }
            for (int i18 = 0; i18 < this.SYS_T; i18++) {
                if (i18 != i13) {
                    short s11 = sArr2[i13][i18];
                    for (int i19 = i13; i19 < this.SYS_T + 1; i19++) {
                        short[] sArr5 = sArr2[i19];
                        sArr5[i18] = (short) (sArr5[i18] ^ this.gf.gf_mul(sArr5[i13], s11));
                    }
                }
            }
            i13 = i14;
        }
        int i20 = 0;
        while (true) {
            int i21 = this.SYS_T;
            if (i20 >= i21) {
                return 0;
            }
            sArr[i20] = sArr2[i21][i20];
            i20++;
        }
    }

    public static short get_q_short(int[] iArr, int i3) {
        int i10 = i3 / 2;
        return (short) (i3 % 2 == 0 ? iArr[i10] : (iArr[i10] & (-65536)) >> 16);
    }

    private static void layer(short[] sArr, byte[] bArr, int i3, int i10, int i11) {
        int i12 = 1 << i10;
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14 += i12 * 2) {
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = i14 + i15;
                short s10 = sArr[i16];
                int i17 = i16 + i12;
                int i18 = (sArr[i17] ^ s10) & (-((bArr[(i13 >> 3) + i3] >> (i13 & 7)) & 1));
                sArr[i16] = (short) (s10 ^ i18);
                sArr[i17] = (short) (sArr[i17] ^ i18);
                i13++;
            }
        }
    }

    private static int min(short s10, int i3) {
        return s10 < i3 ? s10 : i3;
    }

    private int mov_columns(byte[][] bArr, short[] sArr, long[] jArr) {
        long load8;
        int i3 = 64;
        long[] jArr2 = new long[64];
        int i10 = 32;
        long[] jArr3 = new long[32];
        byte[] bArr2 = new byte[9];
        int i11 = this.PK_NROWS - 32;
        int i12 = i11 / 8;
        int i13 = i11 % 8;
        boolean z2 = false;
        if (this.usePadding) {
            for (int i14 = 0; i14 < 32; i14++) {
                for (int i15 = 0; i15 < 9; i15++) {
                    bArr2[i15] = bArr[i11 + i14][i12 + i15];
                }
                int i16 = 0;
                while (i16 < 8) {
                    int i17 = i16 + 1;
                    bArr2[i16] = (byte) (((bArr2[i16] & UByte.MAX_VALUE) >> i13) | (bArr2[i17] << (8 - i13)));
                    i16 = i17;
                }
                jArr2[i14] = Utils.load8(bArr2, 0);
            }
        } else {
            for (int i18 = 0; i18 < 32; i18++) {
                jArr2[i18] = Utils.load8(bArr[i11 + i18], i12);
            }
        }
        long j = 0;
        jArr[0] = 0;
        int i19 = 0;
        while (true) {
            long j3 = 1;
            if (i19 >= 32) {
                int i20 = 0;
                while (i20 < i10) {
                    int i21 = i20 + 1;
                    int i22 = i21;
                    while (i22 < i3) {
                        long same_mask64 = (sArr[r11] ^ sArr[r15]) & same_mask64((short) i22, (short) r19[i20]);
                        sArr[i11 + i20] = (short) (sArr[r11] ^ same_mask64);
                        sArr[i11 + i22] = (short) (same_mask64 ^ sArr[r15]);
                        i22++;
                        i21 = i21;
                        jArr3 = jArr3;
                        i3 = 64;
                        i10 = 32;
                    }
                    i20 = i21;
                }
                long[] jArr4 = jArr3;
                for (int i23 = 0; i23 < this.PK_NROWS; i23++) {
                    if (this.usePadding) {
                        for (int i24 = 0; i24 < 9; i24++) {
                            bArr2[i24] = bArr[i23][i12 + i24];
                        }
                        int i25 = 0;
                        while (i25 < 8) {
                            int i26 = i25 + 1;
                            bArr2[i25] = (byte) (((bArr2[i25] & UByte.MAX_VALUE) >> i13) | (bArr2[i26] << (8 - i13)));
                            i25 = i26;
                        }
                        load8 = Utils.load8(bArr2, 0);
                    } else {
                        load8 = Utils.load8(bArr[i23], i12);
                    }
                    for (int i27 = 0; i27 < 32; i27++) {
                        long j10 = jArr4[i27];
                        long j11 = ((load8 >> i27) ^ (load8 >> ((int) j10))) & 1;
                        load8 = (load8 ^ (j11 << ((int) j10))) ^ (j11 << i27);
                    }
                    if (this.usePadding) {
                        Utils.store8(bArr2, 0, load8);
                        byte[] bArr3 = bArr[i23];
                        int i28 = i12 + 8;
                        int i29 = 8 - i13;
                        bArr3[i28] = (byte) ((((bArr3[i28] & UByte.MAX_VALUE) >>> i13) << i13) | ((bArr2[7] & UByte.MAX_VALUE) >>> i29));
                        bArr3[i12] = (byte) (((bArr2[0] & UByte.MAX_VALUE) << i13) | (((bArr3[i12] & UByte.MAX_VALUE) << i29) >>> i29));
                        for (int i30 = 7; i30 >= 1; i30--) {
                            bArr[i23][i12 + i30] = (byte) (((bArr2[i30] & UByte.MAX_VALUE) << i13) | ((bArr2[i30 - 1] & UByte.MAX_VALUE) >>> i29));
                        }
                    } else {
                        Utils.store8(bArr[i23], i12, load8);
                    }
                }
                return 0;
            }
            long j12 = jArr2[i19];
            int i31 = i19 + 1;
            long j13 = j;
            for (int i32 = i31; i32 < 32; i32++) {
                j12 |= jArr2[i32];
            }
            if (j12 == j13) {
                return -1;
            }
            int ctz = ctz(j12);
            boolean z10 = z2;
            long j14 = ctz;
            jArr3[i19] = j14;
            jArr[z10 ? 1 : 0] = jArr[z10 ? 1 : 0] | (1 << ((int) j14));
            for (int i33 = i31; i33 < 32; i33++) {
                long j15 = jArr2[i19];
                jArr2[i19] = j15 ^ (jArr2[i33] & (((j15 >> ctz) & 1) - 1));
            }
            int i34 = i31;
            while (i34 < 32) {
                long j16 = jArr2[i34];
                long j17 = j3;
                jArr2[i34] = j16 ^ (jArr2[i19] & (-((j16 >> ctz) & j17)));
                i34++;
                j3 = j17;
                z10 = false;
            }
            z2 = z10;
            i19 = i31;
            j = j13;
        }
    }

    private int pk_gen(byte[] bArr, byte[] bArr2, int[] iArr, short[] sArr, long[] jArr) {
        int i3;
        int i10;
        int i11 = this.SYS_T;
        short[] sArr2 = new short[i11 + 1];
        sArr2[i11] = 1;
        for (int i12 = 0; i12 < this.SYS_T; i12++) {
            sArr2[i12] = Utils.load_gf(bArr2, (i12 * 2) + 40, this.GFMASK);
        }
        int i13 = 1 << this.GFBITS;
        long[] jArr2 = new long[i13];
        for (int i14 = 0; i14 < (1 << this.GFBITS); i14++) {
            long j = iArr[i14];
            jArr2[i14] = j;
            long j3 = j << 31;
            jArr2[i14] = j3;
            long j10 = j3 | i14;
            jArr2[i14] = j10;
            jArr2[i14] = j10 & LongCompanionObject.MAX_VALUE;
        }
        sort64(jArr2, 0, i13);
        for (int i15 = 1; i15 < (1 << this.GFBITS); i15++) {
            if ((jArr2[i15 - 1] >> 31) == (jArr2[i15] >> 31)) {
                return -1;
            }
        }
        short[] sArr3 = new short[this.SYS_N];
        for (int i16 = 0; i16 < (1 << this.GFBITS); i16++) {
            sArr[i16] = (short) (jArr2[i16] & this.GFMASK);
        }
        int i17 = 0;
        while (true) {
            i3 = this.SYS_N;
            if (i17 >= i3) {
                break;
            }
            sArr3[i17] = Utils.bitrev(sArr[i17], this.GFBITS);
            i17++;
        }
        short[] sArr4 = new short[i3];
        root(sArr4, sArr2, sArr3);
        int i18 = 0;
        while (true) {
            i10 = this.SYS_N;
            if (i18 >= i10) {
                break;
            }
            sArr4[i18] = this.gf.gf_inv(sArr4[i18]);
            i18++;
        }
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.PK_NROWS, i10 / 8);
        for (int i19 = 0; i19 < this.PK_NROWS; i19++) {
            for (int i20 = 0; i20 < this.SYS_N / 8; i20++) {
                bArr3[i19][i20] = 0;
            }
        }
        for (int i21 = 0; i21 < this.SYS_T; i21++) {
            for (int i22 = 0; i22 < this.SYS_N; i22 += 8) {
                int i23 = 0;
                while (true) {
                    int i24 = this.GFBITS;
                    if (i23 < i24) {
                        bArr3[(i24 * i21) + i23][i22 / 8] = (byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) ((sArr4[i22 + 7] >>> i23) & 1)) << 1)) | ((sArr4[i22 + 6] >>> i23) & 1))) << 1)) | ((sArr4[i22 + 5] >>> i23) & 1))) << 1)) | ((sArr4[i22 + 4] >>> i23) & 1))) << 1)) | ((sArr4[i22 + 3] >>> i23) & 1))) << 1)) | ((sArr4[i22 + 2] >>> i23) & 1))) << 1)) | ((sArr4[i22 + 1] >>> i23) & 1))) << 1)) | ((sArr4[i22] >>> i23) & 1));
                        i23++;
                    }
                }
            }
            for (int i25 = 0; i25 < this.SYS_N; i25++) {
                sArr4[i25] = this.gf.gf_mul(sArr4[i25], sArr3[i25]);
            }
        }
        int i26 = 0;
        while (true) {
            int i27 = this.PK_NROWS;
            if (i26 >= (i27 + 7) / 8) {
                if (bArr != null) {
                    if (this.usePadding) {
                        int i28 = i27 % 8;
                        int i29 = 0;
                        int i30 = 0;
                        while (true) {
                            int i31 = this.PK_NROWS;
                            if (i29 >= i31) {
                                break;
                            }
                            int i32 = (i31 - 1) / 8;
                            while (i32 < (this.SYS_N / 8) - 1) {
                                byte[] bArr4 = bArr3[i29];
                                int i33 = (bArr4[i32] & UByte.MAX_VALUE) >>> i28;
                                i32++;
                                bArr[i30] = (byte) ((bArr4[i32] << (8 - i28)) | i33);
                                i30++;
                            }
                            bArr[i30] = (byte) ((bArr3[i29][i32] & UByte.MAX_VALUE) >>> i28);
                            i29++;
                            i30++;
                        }
                    } else {
                        for (int i34 = 0; i34 < this.PK_NROWS; i34++) {
                            int i35 = 0;
                            int i36 = 0;
                            while (true) {
                                int i37 = this.SYS_N;
                                int i38 = this.PK_NROWS;
                                if (i35 < ((i37 - i38) + 7) / 8) {
                                    bArr[((((i37 - i38) + 7) / 8) * i34) + i36] = bArr3[i34][(i38 / 8) + i35];
                                    i36++;
                                    i35++;
                                }
                            }
                        }
                    }
                }
                return 0;
            }
            for (int i39 = 0; i39 < 8; i39++) {
                int i40 = (i26 * 8) + i39;
                int i41 = this.PK_NROWS;
                if (i40 >= i41) {
                    break;
                }
                if (this.usePivots && i40 == i41 - 32) {
                    if (mov_columns(bArr3, sArr, jArr) != 0) {
                        return -1;
                    }
                }
                for (int i42 = i40 + 1; i42 < this.PK_NROWS; i42++) {
                    byte b2 = (byte) (-((byte) (((byte) (((byte) (bArr3[i40][i26] ^ bArr3[i42][i26])) >> i39)) & 1)));
                    for (int i43 = 0; i43 < this.SYS_N / 8; i43++) {
                        byte[] bArr5 = bArr3[i40];
                        bArr5[i43] = (byte) (bArr5[i43] ^ (bArr3[i42][i43] & b2));
                    }
                }
                if (((bArr3[i40][i26] >> i39) & 1) == 0) {
                    return -1;
                }
                for (int i44 = 0; i44 < this.PK_NROWS; i44++) {
                    if (i44 != i40) {
                        byte b10 = (byte) (-((byte) (((byte) (bArr3[i44][i26] >> i39)) & 1)));
                        for (int i45 = 0; i45 < this.SYS_N / 8; i45++) {
                            byte[] bArr6 = bArr3[i44];
                            bArr6[i45] = (byte) (bArr6[i45] ^ (bArr3[i40][i45] & b10));
                        }
                    }
                }
            }
            i26++;
        }
    }

    private void root(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i3 = 0; i3 < this.SYS_N; i3++) {
            sArr[i3] = eval(sArr2, sArr3[i3]);
        }
    }

    private static byte same_mask32(short s10, short s11) {
        return (byte) ((-(((s10 ^ s11) - 1) >>> 31)) & 255);
    }

    private static long same_mask64(short s10, short s11) {
        return -(((s10 ^ s11) - 1) >>> 63);
    }

    private static void sort32(int[] iArr, int i3, int i10) {
        int i11 = i10 - i3;
        if (i11 < 2) {
            return;
        }
        int i12 = 1;
        while (i12 < i11 - i12) {
            i12 += i12;
        }
        for (int i13 = i12; i13 > 0; i13 >>>= 1) {
            int i14 = 0;
            for (int i15 = 0; i15 < i11 - i13; i15++) {
                if ((i15 & i13) == 0) {
                    int i16 = i3 + i15;
                    int i17 = i16 + i13;
                    int i18 = iArr[i17];
                    int i19 = iArr[i16];
                    int i20 = i18 ^ i19;
                    int i21 = i18 - i19;
                    int i22 = ((((i18 ^ i21) & i20) ^ i21) >> 31) & i20;
                    iArr[i16] = i19 ^ i22;
                    iArr[i17] = iArr[i17] ^ i22;
                }
            }
            for (int i23 = i12; i23 > i13; i23 >>>= 1) {
                while (i14 < i11 - i23) {
                    if ((i14 & i13) == 0) {
                        int i24 = i3 + i14;
                        int i25 = i24 + i13;
                        int i26 = iArr[i25];
                        for (int i27 = i23; i27 > i13; i27 >>>= 1) {
                            int i28 = i24 + i27;
                            int i29 = iArr[i28];
                            int i30 = i29 ^ i26;
                            int i31 = i29 - i26;
                            int i32 = i30 & ((i31 ^ ((i31 ^ i29) & i30)) >> 31);
                            i26 ^= i32;
                            iArr[i28] = i29 ^ i32;
                        }
                        iArr[i25] = i26;
                    }
                    i14++;
                }
            }
        }
    }

    private static void sort64(long[] jArr, int i3, int i10) {
        int i11 = i10 - i3;
        if (i11 < 2) {
            return;
        }
        int i12 = 1;
        while (i12 < i11 - i12) {
            i12 += i12;
        }
        for (int i13 = i12; i13 > 0; i13 >>>= 1) {
            int i14 = 0;
            for (int i15 = 0; i15 < i11 - i13; i15++) {
                if ((i15 & i13) == 0) {
                    int i16 = i3 + i15;
                    int i17 = i16 + i13;
                    long j = jArr[i17];
                    long j3 = jArr[i16];
                    long j10 = (j ^ j3) & (-((j - j3) >>> 63));
                    jArr[i16] = j3 ^ j10;
                    jArr[i17] = jArr[i17] ^ j10;
                }
            }
            for (int i18 = i12; i18 > i13; i18 >>>= 1) {
                while (i14 < i11 - i18) {
                    if ((i14 & i13) == 0) {
                        int i19 = i3 + i14;
                        int i20 = i19 + i13;
                        long j11 = jArr[i20];
                        for (int i21 = i18; i21 > i13; i21 >>>= 1) {
                            int i22 = i19 + i21;
                            long j12 = jArr[i22];
                            long j13 = (-((j12 - j11) >>> 63)) & (j11 ^ j12);
                            j11 ^= j13;
                            jArr[i22] = j12 ^ j13;
                        }
                        jArr[i20] = j11;
                    }
                    i14++;
                }
            }
        }
    }

    private void synd(short[] sArr, short[] sArr2, short[] sArr3, byte[] bArr) {
        for (int i3 = 0; i3 < this.SYS_T * 2; i3++) {
            sArr[i3] = 0;
        }
        for (int i10 = 0; i10 < this.SYS_N; i10++) {
            short s10 = (short) ((bArr[i10 / 8] >> (i10 % 8)) & 1);
            short eval = eval(sArr2, sArr3[i10]);
            GF gf = this.gf;
            short gf_inv = gf.gf_inv(gf.gf_mul(eval, eval));
            for (int i11 = 0; i11 < this.SYS_T * 2; i11++) {
                GF gf2 = this.gf;
                sArr[i11] = gf2.gf_add(sArr[i11], gf2.gf_mul(gf_inv, s10));
                gf_inv = this.gf.gf_mul(gf_inv, sArr3[i10]);
            }
        }
    }

    private void syndrome(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        short[] sArr = new short[this.SYS_N / 8];
        int i3 = this.PK_NROWS % 8;
        for (int i10 = 0; i10 < this.SYND_BYTES; i10++) {
            bArr[i10] = 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.PK_NROWS; i12++) {
            for (int i13 = 0; i13 < this.SYS_N / 8; i13++) {
                sArr[i13] = 0;
            }
            int i14 = 0;
            while (true) {
                int i15 = this.PK_ROW_BYTES;
                if (i14 >= i15) {
                    break;
                }
                sArr[((this.SYS_N / 8) - i15) + i14] = bArr2[i11 + i14];
                i14++;
            }
            if (this.usePadding) {
                for (int i16 = (this.SYS_N / 8) - 1; i16 >= (this.SYS_N / 8) - this.PK_ROW_BYTES; i16--) {
                    sArr[i16] = (short) ((((sArr[i16] & 255) << i3) | ((sArr[i16 - 1] & 255) >>> (8 - i3))) & 255);
                }
            }
            int i17 = i12 / 8;
            int i18 = i12 % 8;
            sArr[i17] = (short) (sArr[i17] | (1 << i18));
            byte b2 = 0;
            for (int i19 = 0; i19 < this.SYS_N / 8; i19++) {
                b2 = (byte) (b2 ^ (sArr[i19] & bArr3[i19]));
            }
            byte b10 = (byte) ((b2 >>> 4) ^ b2);
            byte b11 = (byte) (b10 ^ (b10 >>> 2));
            bArr[i17] = (byte) ((((byte) (1 & ((byte) (b11 ^ (b11 >>> 1))))) << i18) | bArr[i17]);
            i11 += this.PK_ROW_BYTES;
        }
    }

    public int check_c_padding(byte[] bArr) {
        return ((byte) ((((byte) (((byte) ((bArr[this.SYND_BYTES - 1] & UByte.MAX_VALUE) >>> (this.PK_NROWS % 8))) - 1)) & UByte.MAX_VALUE) >>> 7)) - 1;
    }

    public int check_pk_padding(byte[] bArr) {
        byte b2 = 0;
        for (int i3 = 0; i3 < this.PK_NROWS; i3++) {
            int i10 = this.PK_ROW_BYTES;
            b2 = (byte) (b2 | bArr[((i3 * i10) + i10) - 1]);
        }
        return ((byte) ((((byte) (((byte) ((b2 & UByte.MAX_VALUE) >>> (this.PK_NCOLS % 8))) - 1)) & UByte.MAX_VALUE) >>> 7)) - 1;
    }

    public byte[] decompress_private_key(byte[] bArr) {
        int i3;
        short[] sArr;
        byte[] bArr2 = new byte[getPrivateKeySize()];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        int i10 = ((1 << this.GFBITS) * 4) + (this.SYS_N / 8) + this.IRR_BYTES;
        int i11 = i10 + 32;
        byte[] bArr3 = new byte[i11];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update((byte) 64);
        sHAKEDigest.update(bArr, 0, 32);
        sHAKEDigest.doFinal(bArr3, 0, i11);
        if (bArr.length <= 40) {
            short[] sArr2 = new short[this.SYS_T];
            int i12 = this.IRR_BYTES;
            byte[] bArr4 = new byte[i12];
            int i13 = i10 - i12;
            for (int i14 = 0; i14 < this.SYS_T; i14++) {
                sArr2[i14] = Utils.load_gf(bArr3, (i14 * 2) + i13, this.GFMASK);
            }
            generate_irr_poly(sArr2);
            for (int i15 = 0; i15 < this.SYS_T; i15++) {
                Utils.store_gf(bArr4, i15 * 2, sArr2[i15]);
            }
            System.arraycopy(bArr4, 0, bArr2, 40, this.IRR_BYTES);
        }
        int length = bArr.length;
        int i16 = this.IRR_BYTES;
        if (length <= i16 + 40) {
            int i17 = this.GFBITS;
            int[] iArr = new int[1 << i17];
            short[] sArr3 = new short[1 << i17];
            int i18 = (i10 - i16) - ((1 << i17) * 4);
            int i19 = 0;
            while (true) {
                i3 = this.GFBITS;
                if (i19 >= (1 << i3)) {
                    break;
                }
                iArr[i19] = Utils.load4(bArr3, (i19 * 4) + i18);
                i19++;
            }
            if (this.usePivots) {
                sArr = sArr3;
                pk_gen(null, bArr2, iArr, sArr, new long[]{0});
            } else {
                sArr = sArr3;
                int i20 = 1 << i3;
                long[] jArr = new long[i20];
                for (int i21 = 0; i21 < (1 << this.GFBITS); i21++) {
                    long j = iArr[i21];
                    jArr[i21] = j;
                    long j3 = j << 31;
                    jArr[i21] = j3;
                    long j10 = j3 | i21;
                    jArr[i21] = j10;
                    jArr[i21] = j10 & LongCompanionObject.MAX_VALUE;
                }
                sort64(jArr, 0, i20);
                for (int i22 = 0; i22 < (1 << this.GFBITS); i22++) {
                    sArr[i22] = (short) (jArr[i22] & this.GFMASK);
                }
            }
            int i23 = this.COND_BYTES;
            byte[] bArr5 = new byte[i23];
            controlbitsfrompermutation(bArr5, sArr, this.GFBITS, 1 << r3);
            System.arraycopy(bArr5, 0, bArr2, this.IRR_BYTES + 40, i23);
        }
        int privateKeySize = getPrivateKeySize();
        int i24 = this.SYS_N;
        System.arraycopy(bArr3, 0, bArr2, privateKeySize - (i24 / 8), i24 / 8);
        return bArr2;
    }

    public byte[] generate_public_key_from_private_key(byte[] bArr) {
        byte[] bArr2 = new byte[getPublicKeySize()];
        int i3 = this.GFBITS;
        short[] sArr = new short[1 << i3];
        long[] jArr = {0};
        int[] iArr = new int[1 << i3];
        int i10 = ((1 << i3) * 4) + (this.SYS_N / 8);
        byte[] bArr3 = new byte[i10];
        int i11 = ((i10 - 32) - this.IRR_BYTES) - ((1 << i3) * 4);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update((byte) 64);
        sHAKEDigest.update(bArr, 0, 32);
        sHAKEDigest.doFinal(bArr3, 0, i10);
        for (int i12 = 0; i12 < (1 << this.GFBITS); i12++) {
            iArr[i12] = Utils.load4(bArr3, (i12 * 4) + i11);
        }
        pk_gen(bArr2, bArr, iArr, sArr, jArr);
        return bArr2;
    }

    public int getCipherTextSize() {
        return this.SYND_BYTES + 32;
    }

    public int getCondBytes() {
        return this.COND_BYTES;
    }

    public int getDefaultSessionKeySize() {
        return this.defaultKeySize;
    }

    public int getIrrBytes() {
        return this.IRR_BYTES;
    }

    public int getPrivateKeySize() {
        return (this.SYS_N / 8) + this.COND_BYTES + this.IRR_BYTES + 40;
    }

    public int getPublicKeySize() {
        if (!this.usePadding) {
            return (this.PK_NROWS * this.PK_NCOLS) / 8;
        }
        int i3 = this.PK_NROWS;
        return ((this.SYS_N / 8) - ((i3 - 1) / 8)) * i3;
    }

    public int kem_dec(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        char c10 = ' ';
        byte[] bArr4 = new byte[32];
        int i3 = this.SYS_N / 8;
        byte[] bArr5 = new byte[i3];
        int check_c_padding = this.usePadding ? check_c_padding(bArr2) : 0;
        byte decrypt = (byte) decrypt(bArr5, bArr3, bArr2);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update((byte) 2);
        sHAKEDigest.update(bArr5, 0, i3);
        sHAKEDigest.doFinal(bArr4, 0, 32);
        byte b2 = 0;
        for (int i10 = 0; i10 < 32; i10++) {
            b2 = (byte) (b2 | (bArr4[i10] ^ bArr2[this.SYND_BYTES + i10]));
        }
        short s10 = (short) (((short) (((short) (((short) (decrypt | b2)) - 1)) >> 8)) & 255);
        int i11 = this.SYND_BYTES + 32 + (this.SYS_N / 8) + 1;
        byte[] bArr6 = new byte[i11];
        bArr6[0] = (byte) (s10 & 1);
        int i12 = 0;
        while (i12 < this.SYS_N / 8) {
            int i13 = i12 + 1;
            bArr6[i13] = (byte) ((bArr3[i12 + 40 + this.IRR_BYTES + this.COND_BYTES] & (~s10)) | (bArr5[i12] & s10));
            i12 = i13;
            c10 = c10;
        }
        for (int i14 = 0; i14 < this.SYND_BYTES + 32; i14++) {
            bArr6[(this.SYS_N / 8) + 1 + i14] = bArr2[i14];
        }
        SHAKEDigest sHAKEDigest2 = new SHAKEDigest(256);
        sHAKEDigest2.update(bArr6, 0, i11);
        sHAKEDigest2.doFinal(bArr, 0, bArr.length);
        if (!this.usePadding) {
            return 0;
        }
        byte b10 = (byte) check_c_padding;
        for (int i15 = 0; i15 < bArr.length; i15++) {
            bArr[i15] = (byte) (bArr[i15] | b10);
        }
        return check_c_padding;
    }

    public int kem_enc(byte[] bArr, byte[] bArr2, byte[] bArr3, SecureRandom secureRandom) {
        int i3 = this.SYS_N / 8;
        byte[] bArr4 = new byte[i3];
        int check_pk_padding = this.usePadding ? check_pk_padding(bArr3) : 0;
        encrypt(bArr, bArr3, bArr4, secureRandom);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update((byte) 2);
        sHAKEDigest.update(bArr4, 0, i3);
        sHAKEDigest.doFinal(bArr, this.SYND_BYTES, 32);
        sHAKEDigest.update((byte) 1);
        sHAKEDigest.update(bArr4, 0, i3);
        sHAKEDigest.update(bArr, 0, bArr.length);
        sHAKEDigest.doFinal(bArr2, 0, bArr2.length);
        if (!this.usePadding) {
            return 0;
        }
        byte b2 = (byte) (((byte) check_pk_padding) ^ UByte.MAX_VALUE);
        for (int i10 = 0; i10 < this.SYND_BYTES + 32; i10++) {
            bArr[i10] = (byte) (bArr[i10] & b2);
        }
        for (int i11 = 0; i11 < 32; i11++) {
            bArr2[i11] = (byte) (bArr2[i11] & b2);
        }
        return check_pk_padding;
    }

    public void kem_keypair(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        int i3;
        int i10;
        int i11;
        short[] sArr;
        int i12;
        long j;
        int i13 = 32;
        byte[] bArr3 = new byte[32];
        int i14 = 1;
        int i15 = 0;
        byte[] bArr4 = {64};
        secureRandom.nextBytes(bArr3);
        int i16 = (this.SYS_T * 2) + ((1 << this.GFBITS) * 4) + (this.SYS_N / 8);
        int i17 = i16 + 32;
        byte[] bArr5 = new byte[i17];
        long[] jArr = {0};
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        byte[] bArr6 = bArr3;
        while (true) {
            sHAKEDigest.update(bArr4, i15, i14);
            sHAKEDigest.update(bArr3, i15, bArr3.length);
            sHAKEDigest.doFinal(bArr5, i15, i17);
            byte[] copyOfRange = Arrays.copyOfRange(bArr5, i16, i16 + 32);
            System.arraycopy(bArr6, i15, bArr2, i15, i13);
            byte[] copyOfRange2 = Arrays.copyOfRange(copyOfRange, i15, i13);
            int i18 = this.SYS_T;
            short[] sArr2 = new short[i18];
            int i19 = i16 - (i18 * 2);
            i3 = i14;
            for (int i20 = i15; i20 < this.SYS_T; i20++) {
                sArr2[i20] = Utils.load_gf(bArr5, (i20 * 2) + i19, this.GFMASK);
            }
            if (generate_irr_poly(sArr2) != -1) {
                for (int i21 = i15; i21 < this.SYS_T; i21++) {
                    Utils.store_gf(bArr2, (i21 * 2) + 40, sArr2[i21]);
                }
                int i22 = this.GFBITS;
                int[] iArr = new int[i3 << i22];
                i10 = i19 - ((i3 << i22) * 4);
                int i23 = 0;
                while (true) {
                    i11 = this.GFBITS;
                    if (i23 >= (i3 << i11)) {
                        break;
                    }
                    iArr[i23] = Utils.load4(bArr5, (i23 * 4) + i10);
                    i23++;
                }
                sArr = new short[i3 << i11];
                if (pk_gen(bArr, bArr2, iArr, sArr, jArr) != -1) {
                    break;
                }
            }
            bArr3 = copyOfRange;
            bArr6 = copyOfRange2;
            i14 = i3;
            i13 = 32;
            i15 = 0;
        }
        int i24 = this.COND_BYTES;
        byte[] bArr7 = new byte[i24];
        controlbitsfrompermutation(bArr7, sArr, this.GFBITS, i3 << r6);
        System.arraycopy(bArr7, 0, bArr2, this.IRR_BYTES + 40, i24);
        int i25 = this.SYS_N;
        System.arraycopy(bArr5, i10 - (i25 / 8), bArr2, bArr2.length - (i25 / 8), i25 / 8);
        if (this.usePivots) {
            i12 = 32;
            j = jArr[0];
        } else {
            j = BodyPartID.bodyIdMax;
            i12 = 32;
        }
        Utils.store8(bArr2, i12, j);
    }
}
