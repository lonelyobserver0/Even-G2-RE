package org.bouncycastle.pqc.crypto.frodo;

import java.security.SecureRandom;
import kotlin.UByte;
import kotlin.UShort;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class FrodoEngine {
    private static final int len_chi = 16;
    private static final int len_chi_bytes = 2;
    private static final int len_seedA = 128;
    private static final int len_seedA_bytes = 16;
    private static final int len_z = 128;
    private static final int len_z_bytes = 16;
    private static final int mbar = 8;
    static final int nbar = 8;

    /* renamed from: B, reason: collision with root package name */
    private final int f19397B;

    /* renamed from: D, reason: collision with root package name */
    private final int f19398D;
    private final short[] T_chi;
    private final Xof digest;
    private final FrodoMatrixGenerator gen;
    private final int len_ct_bytes;
    private final int len_k;
    private final int len_k_bytes;
    private final int len_mu;
    private final int len_mu_bytes;
    private final int len_pk_bytes;
    private final int len_pkh;
    private final int len_pkh_bytes;
    private final int len_s;
    private final int len_s_bytes;
    private final int len_seedSE;
    private final int len_seedSE_bytes;
    private final int len_sk_bytes;
    private final int len_ss;
    private final int len_ss_bytes;

    /* renamed from: n, reason: collision with root package name */
    private final int f19399n;

    /* renamed from: q, reason: collision with root package name */
    private final int f19400q;

    public FrodoEngine(int i3, int i10, int i11, short[] sArr, Xof xof, FrodoMatrixGenerator frodoMatrixGenerator) {
        this.f19399n = i3;
        this.f19398D = i10;
        this.f19400q = 1 << i10;
        this.f19397B = i11;
        int i12 = i11 * 64;
        this.len_mu = i12;
        this.len_seedSE = i12;
        this.len_s = i12;
        this.len_k = i12;
        this.len_pkh = i12;
        this.len_ss = i12;
        this.len_mu_bytes = i12 / 8;
        this.len_seedSE_bytes = i12 / 8;
        int i13 = i12 / 8;
        this.len_s_bytes = i13;
        this.len_k_bytes = i12 / 8;
        int i14 = i12 / 8;
        this.len_pkh_bytes = i14;
        this.len_ss_bytes = i12 / 8;
        int i15 = ((i10 * i3) * 8) / 8;
        this.len_ct_bytes = ((i10 * 64) / 8) + i15;
        int i16 = i15 + 16;
        this.len_pk_bytes = i16;
        this.len_sk_bytes = AbstractC1482f.c(i3, 16, i14, i13 + i16);
        this.T_chi = sArr;
        this.digest = xof;
        this.gen = frodoMatrixGenerator;
    }

    private byte[] ctselect(byte[] bArr, byte[] bArr2, short s10) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i3 = 0; i3 < bArr.length; i3++) {
            bArr3[i3] = (byte) (((~s10) & bArr[i3] & 255) | (bArr2[i3] & s10 & 255));
        }
        return bArr3;
    }

    private short ctverify(short[] sArr, short[] sArr2, short[] sArr3, short[] sArr4) {
        short s10 = 0;
        for (short s11 = 0; s11 < sArr.length; s11 = (short) (s11 + 1)) {
            s10 = (short) (s10 | (sArr[s11] ^ sArr3[s11]));
        }
        for (short s12 = 0; s12 < sArr2.length; s12 = (short) (s12 + 1)) {
            s10 = (short) ((sArr2[s12] ^ sArr4[s12]) | s10);
        }
        return s10 == 0 ? (short) 0 : (short) -1;
    }

    private byte[] decode(short[] sArr) {
        int i3 = this.f19397B;
        short s10 = (short) ((1 << i3) - 1);
        short s11 = (short) ((1 << this.f19398D) - 1);
        byte[] bArr = new byte[i3 * 8];
        int i10 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            long j = 0;
            for (int i12 = 0; i12 < 8; i12++) {
                int i13 = sArr[i10] & s11;
                int i14 = this.f19398D;
                j |= (((short) ((i13 + (1 << ((i14 - r14) - 1))) >> (i14 - r14))) & s10) << (this.f19397B * i12);
                i10++;
            }
            int i15 = 0;
            while (true) {
                int i16 = this.f19397B;
                if (i15 < i16) {
                    bArr[(i16 * i11) + i15] = (byte) ((j >> (i15 * 8)) & 255);
                    i15++;
                }
            }
        }
        return bArr;
    }

    private short[] encode(byte[] bArr) {
        int i3;
        short[] sArr = new short[64];
        int i10 = 0;
        byte b2 = 1;
        for (int i11 = 0; i11 < 8; i11++) {
            for (int i12 = 0; i12 < 8; i12++) {
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    i3 = this.f19397B;
                    if (i13 < i3) {
                        if ((bArr[i10] & b2) == b2) {
                            i14 += 1 << i13;
                        }
                        b2 = (byte) (b2 << 1);
                        if (b2 == 0) {
                            i10++;
                            b2 = 1;
                        }
                        i13++;
                    }
                }
                sArr[(i11 * 8) + i12] = (short) ((this.f19400q / (1 << i3)) * i14);
            }
        }
        return sArr;
    }

    private short[] matrix_add(short[] sArr, short[] sArr2, int i3, int i10) {
        short[] sArr3 = new short[i3 * i10];
        for (int i11 = 0; i11 < i3; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = (i11 * i10) + i12;
                sArr3[i13] = (short) (((sArr[i13] & UShort.MAX_VALUE) + (65535 & sArr2[i13])) % this.f19400q);
            }
        }
        return sArr3;
    }

    private short[] matrix_mul(short[] sArr, int i3, int i10, short[] sArr2, int i11, int i12) {
        short[] sArr3 = new short[i3 * i12];
        for (int i13 = 0; i13 < i3; i13++) {
            for (int i14 = 0; i14 < i12; i14++) {
                for (int i15 = 0; i15 < i10; i15++) {
                    int i16 = (i13 * i12) + i14;
                    sArr3[i16] = (short) (65535 & (((sArr[(i13 * i10) + i15] & UShort.MAX_VALUE) * (sArr2[(i15 * i12) + i14] & UShort.MAX_VALUE)) + (sArr3[i16] & UShort.MAX_VALUE)));
                }
                int i17 = (i13 * i12) + i14;
                sArr3[i17] = (short) (65535 & ((sArr3[i17] & UShort.MAX_VALUE) % this.f19400q));
            }
        }
        return sArr3;
    }

    private short[] matrix_sub(short[] sArr, short[] sArr2, int i3, int i10) {
        short[] sArr3 = new short[i3 * i10];
        for (int i11 = 0; i11 < i3; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = (i11 * i10) + i12;
                sArr3[i13] = (short) (((sArr[i13] - sArr2[i13]) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) % this.f19400q);
            }
        }
        return sArr3;
    }

    private short[] matrix_transpose(short[] sArr, int i3, int i10) {
        short[] sArr2 = new short[i3 * i10];
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i3; i12++) {
                sArr2[(i11 * i3) + i12] = sArr[(i12 * i10) + i11];
            }
        }
        return sArr2;
    }

    private byte[] pack(short[] sArr) {
        int length = sArr.length;
        int i3 = (this.f19398D * length) / 8;
        byte[] bArr = new byte[i3];
        short s10 = 0;
        short s11 = 0;
        byte b2 = 0;
        short s12 = 0;
        while (s10 < i3 && (s11 < length || (s11 == length && b2 > 0))) {
            byte b10 = 0;
            while (b10 < 8) {
                int i10 = 8 - b10;
                int min = Math.min(i10, (int) b2);
                int i11 = b2 - min;
                bArr[s10] = (byte) (bArr[s10] + (((byte) (((short) ((1 << min) - 1)) & (s12 >> i11))) << (i10 - min)));
                b10 = (byte) (b10 + min);
                b2 = (byte) i11;
                if (b2 == 0) {
                    if (s11 >= length) {
                        break;
                    }
                    short s13 = sArr[s11];
                    s11 = (short) (s11 + 1);
                    s12 = s13;
                    b2 = (byte) this.f19398D;
                }
            }
            if (b10 == 8) {
                s10 = (short) (s10 + 1);
            }
        }
        return bArr;
    }

    private short sample(short s10) {
        int i3 = s10 & UShort.MAX_VALUE;
        short s11 = (short) (i3 >>> 1);
        int i10 = 0;
        short s12 = 0;
        while (true) {
            short[] sArr = this.T_chi;
            if (i10 >= sArr.length) {
                break;
            }
            if (s11 > sArr[i10]) {
                s12 = (short) (s12 + 1);
            }
            i10++;
        }
        return i3 % 2 == 1 ? (short) ((s12 * (-1)) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) : s12;
    }

    private short[] sample_matrix(short[] sArr, int i3, int i10, int i11) {
        short[] sArr2 = new short[i10 * i11];
        for (int i12 = 0; i12 < i10; i12++) {
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = (i12 * i11) + i13;
                sArr2[i14] = sample(sArr[i14 + i3]);
            }
        }
        return sArr2;
    }

    private short[] unpack(byte[] bArr, int i3, int i10) {
        int i11 = i3 * i10;
        short[] sArr = new short[i11];
        short s10 = 0;
        short s11 = 0;
        byte b2 = 0;
        byte b10 = 0;
        while (s10 < i11 && (s11 < bArr.length || (s11 == bArr.length && b2 > 0))) {
            byte b11 = 0;
            while (true) {
                int i12 = this.f19398D;
                if (b11 >= i12) {
                    break;
                }
                int min = Math.min(i12 - b11, (int) b2);
                short s12 = (short) (((1 << min) - 1) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                sArr[s10] = (short) (((sArr[s10] & UShort.MAX_VALUE) + ((((byte) ((((b10 & UByte.MAX_VALUE) >>> ((b2 & UByte.MAX_VALUE) - min)) & (s12 & UShort.MAX_VALUE)) & 255)) & UByte.MAX_VALUE) << ((this.f19398D - (b11 & UByte.MAX_VALUE)) - min))) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                b11 = (byte) (b11 + min);
                byte b12 = (byte) (b2 - min);
                byte b13 = (byte) ((~(s12 << b12)) & b10);
                if (b12 != 0) {
                    b10 = b13;
                    b2 = b12;
                } else {
                    if (s11 >= bArr.length) {
                        b10 = b13;
                        b2 = b12;
                        break;
                    }
                    byte b14 = bArr[s11];
                    s11 = (short) (s11 + 1);
                    b2 = 8;
                    b10 = b14;
                }
            }
            if (b11 == this.f19398D) {
                s10 = (short) (s10 + 1);
            }
        }
        return sArr;
    }

    public int getCipherTextSize() {
        return this.len_ct_bytes;
    }

    public int getPrivateKeySize() {
        return this.len_sk_bytes;
    }

    public int getPublicKeySize() {
        return this.len_pk_bytes;
    }

    public int getSessionKeySize() {
        return this.len_ss_bytes;
    }

    public void kem_dec(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i3 = ((this.f19399n * 8) * this.f19398D) / 8;
        byte[] copyOfRange = Arrays.copyOfRange(bArr2, 0, i3);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr2, i3, ((this.f19398D * 64) / 8) + i3);
        int i10 = this.len_s_bytes;
        byte[] copyOfRange3 = Arrays.copyOfRange(bArr3, 0, i10);
        int i11 = i10 + 16;
        byte[] copyOfRange4 = Arrays.copyOfRange(bArr3, i10, i11);
        int i12 = (((this.f19398D * this.f19399n) * 8) / 8) + i11;
        byte[] copyOfRange5 = Arrays.copyOfRange(bArr3, i11, i12);
        int i13 = ((this.f19399n * 128) / 8) + i12;
        byte[] copyOfRange6 = Arrays.copyOfRange(bArr3, i12, i13);
        short[] sArr = new short[this.f19399n * 8];
        for (int i14 = 0; i14 < 8; i14++) {
            int i15 = 0;
            while (true) {
                int i16 = this.f19399n;
                if (i15 < i16) {
                    sArr[(i14 * i16) + i15] = Pack.littleEndianToShort(copyOfRange6, (i15 * 2) + (i16 * i14 * 2));
                    i15++;
                }
            }
        }
        short[] matrix_transpose = matrix_transpose(sArr, 8, this.f19399n);
        byte[] copyOfRange7 = Arrays.copyOfRange(bArr3, i13, this.len_pkh_bytes + i13);
        short[] unpack = unpack(copyOfRange, 8, this.f19399n);
        short[] unpack2 = unpack(copyOfRange2, 8, 8);
        int i17 = this.f19399n;
        byte[] decode = decode(matrix_sub(unpack2, matrix_mul(unpack, 8, i17, matrix_transpose, i17, 8), 8, 8));
        byte[] bArr4 = new byte[this.len_seedSE_bytes + this.len_k_bytes];
        this.digest.update(copyOfRange7, 0, this.len_pkh_bytes);
        this.digest.update(decode, 0, this.len_mu_bytes);
        this.digest.doFinal(bArr4, 0, this.len_seedSE_bytes + this.len_k_bytes);
        int i18 = this.len_seedSE_bytes;
        byte[] copyOfRange8 = Arrays.copyOfRange(bArr4, i18, this.len_k_bytes + i18);
        int i19 = ((this.f19399n * 16) + 64) * 2;
        byte[] bArr5 = new byte[i19];
        this.digest.update((byte) -106);
        this.digest.update(bArr4, 0, this.len_seedSE_bytes);
        this.digest.doFinal(bArr5, 0, i19);
        int i20 = (this.f19399n * 16) + 64;
        short[] sArr2 = new short[i20];
        for (int i21 = 0; i21 < i20; i21++) {
            sArr2[i21] = Pack.littleEndianToShort(bArr5, i21 * 2);
        }
        short[] sample_matrix = sample_matrix(sArr2, 0, 8, this.f19399n);
        int i22 = this.f19399n;
        short[] sample_matrix2 = sample_matrix(sArr2, i22 * 8, 8, i22);
        short[] genMatrix = this.gen.genMatrix(copyOfRange4);
        int i23 = this.f19399n;
        short[] matrix_add = matrix_add(matrix_mul(sample_matrix, 8, i23, genMatrix, i23, i23), sample_matrix2, 8, this.f19399n);
        short[] sample_matrix3 = sample_matrix(sArr2, this.f19399n * 16, 8, 8);
        short[] unpack3 = unpack(copyOfRange5, this.f19399n, 8);
        int i24 = this.f19399n;
        byte[] ctselect = ctselect(copyOfRange8, copyOfRange3, ctverify(unpack, unpack2, matrix_add, matrix_add(matrix_add(matrix_mul(sample_matrix, 8, i24, unpack3, i24, 8), sample_matrix3, 8, 8), encode(decode), 8, 8)));
        this.digest.update(copyOfRange, 0, copyOfRange.length);
        this.digest.update(copyOfRange2, 0, copyOfRange2.length);
        this.digest.update(ctselect, 0, ctselect.length);
        this.digest.doFinal(bArr, 0, this.len_ss_bytes);
    }

    public void kem_enc(byte[] bArr, byte[] bArr2, byte[] bArr3, SecureRandom secureRandom) {
        byte[] copyOfRange = Arrays.copyOfRange(bArr3, 0, 16);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr3, 16, this.len_pk_bytes);
        byte[] bArr4 = new byte[this.len_mu_bytes];
        secureRandom.nextBytes(bArr4);
        byte[] bArr5 = new byte[this.len_pkh_bytes];
        this.digest.update(bArr3, 0, this.len_pk_bytes);
        this.digest.doFinal(bArr5, 0, this.len_pkh_bytes);
        byte[] bArr6 = new byte[this.len_seedSE + this.len_k];
        this.digest.update(bArr5, 0, this.len_pkh_bytes);
        this.digest.update(bArr4, 0, this.len_mu_bytes);
        this.digest.doFinal(bArr6, 0, this.len_seedSE_bytes + this.len_k_bytes);
        byte[] copyOfRange3 = Arrays.copyOfRange(bArr6, 0, this.len_seedSE_bytes);
        int i3 = this.len_seedSE_bytes;
        byte[] copyOfRange4 = Arrays.copyOfRange(bArr6, i3, this.len_k_bytes + i3);
        int i10 = ((this.f19399n * 16) + 64) * 2;
        byte[] bArr7 = new byte[i10];
        this.digest.update((byte) -106);
        this.digest.update(copyOfRange3, 0, copyOfRange3.length);
        this.digest.doFinal(bArr7, 0, i10);
        int i11 = i10 / 2;
        short[] sArr = new short[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            sArr[i12] = Pack.littleEndianToShort(bArr7, i12 * 2);
        }
        short[] sample_matrix = sample_matrix(sArr, 0, 8, this.f19399n);
        int i13 = this.f19399n;
        short[] sample_matrix2 = sample_matrix(sArr, i13 * 8, 8, i13);
        short[] genMatrix = this.gen.genMatrix(copyOfRange);
        int i14 = this.f19399n;
        byte[] pack = pack(matrix_add(matrix_mul(sample_matrix, 8, i14, genMatrix, i14, i14), sample_matrix2, 8, this.f19399n));
        short[] sample_matrix3 = sample_matrix(sArr, this.f19399n * 16, 8, 8);
        short[] unpack = unpack(copyOfRange2, this.f19399n, 8);
        int i15 = this.f19399n;
        byte[] pack2 = pack(matrix_add(matrix_add(matrix_mul(sample_matrix, 8, i15, unpack, i15, 8), sample_matrix3, 8, 8), encode(bArr4), 8, 8));
        System.arraycopy(Arrays.concatenate(pack, pack2), 0, bArr, 0, this.len_ct_bytes);
        this.digest.update(pack, 0, pack.length);
        this.digest.update(pack2, 0, pack2.length);
        this.digest.update(copyOfRange4, 0, this.len_k_bytes);
        this.digest.doFinal(bArr2, 0, this.len_s_bytes);
    }

    public void kem_keypair(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        byte[] bArr3 = new byte[this.len_s_bytes + this.len_seedSE_bytes + 16];
        secureRandom.nextBytes(bArr3);
        byte[] copyOfRange = Arrays.copyOfRange(bArr3, 0, this.len_s_bytes);
        int i3 = this.len_s_bytes;
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr3, i3, this.len_seedSE_bytes + i3);
        int i10 = this.len_s_bytes;
        int i11 = this.len_seedSE_bytes;
        byte[] copyOfRange3 = Arrays.copyOfRange(bArr3, i10 + i11, i10 + i11 + 16);
        byte[] bArr4 = new byte[16];
        this.digest.update(copyOfRange3, 0, copyOfRange3.length);
        this.digest.doFinal(bArr4, 0, 16);
        short[] genMatrix = this.gen.genMatrix(bArr4);
        int i12 = this.f19399n * 32;
        byte[] bArr5 = new byte[i12];
        this.digest.update((byte) 95);
        this.digest.update(copyOfRange2, 0, copyOfRange2.length);
        this.digest.doFinal(bArr5, 0, i12);
        int i13 = this.f19399n * 16;
        short[] sArr = new short[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            sArr[i14] = Pack.littleEndianToShort(bArr5, i14 * 2);
        }
        short[] sample_matrix = sample_matrix(sArr, 0, 8, this.f19399n);
        short[] matrix_transpose = matrix_transpose(sample_matrix, 8, this.f19399n);
        int i15 = this.f19399n;
        short[] sample_matrix2 = sample_matrix(sArr, i15 * 8, i15, 8);
        int i16 = this.f19399n;
        System.arraycopy(Arrays.concatenate(bArr4, pack(matrix_add(matrix_mul(genMatrix, i16, i16, matrix_transpose, i16, 8), sample_matrix2, this.f19399n, 8))), 0, bArr, 0, this.len_pk_bytes);
        int i17 = this.len_pkh_bytes;
        byte[] bArr6 = new byte[i17];
        this.digest.update(bArr, 0, bArr.length);
        this.digest.doFinal(bArr6, 0, i17);
        System.arraycopy(Arrays.concatenate(copyOfRange, bArr), 0, bArr2, 0, this.len_s_bytes + this.len_pk_bytes);
        for (int i18 = 0; i18 < 8; i18++) {
            int i19 = 0;
            while (true) {
                int i20 = this.f19399n;
                if (i19 < i20) {
                    System.arraycopy(Pack.shortToLittleEndian(sample_matrix[(i20 * i18) + i19]), 0, bArr2, (i19 * 2) + (this.f19399n * i18 * 2) + this.len_s_bytes + this.len_pk_bytes, 2);
                    i19++;
                }
            }
        }
        int i21 = this.len_sk_bytes;
        int i22 = this.len_pkh_bytes;
        System.arraycopy(bArr6, 0, bArr2, i21 - i22, i22);
    }
}
