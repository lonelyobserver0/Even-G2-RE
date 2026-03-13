package org.bouncycastle.pqc.crypto.sphincs;

import kotlin.UByte;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Horst {
    static final int HORST_K = 32;
    static final int HORST_LOGT = 16;
    static final int HORST_SIGBYTES = 13312;
    static final int HORST_SKBYTES = 32;
    static final int HORST_T = 65536;
    static final int N_MASKS = 32;

    public static void expand_seed(byte[] bArr, byte[] bArr2) {
        Seed.prg(bArr, 0, 2097152L, bArr2, 0);
    }

    public static int horst_sign(HashFunctions hashFunctions, byte[] bArr, int i3, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        byte[] bArr6 = new byte[PKIFailureInfo.badSenderNonce];
        byte[] bArr7 = new byte[4194272];
        expand_seed(bArr6, bArr3);
        for (int i10 = 0; i10 < 65536; i10++) {
            hashFunctions.hash_n_n(bArr7, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH + i10) * 32, bArr6, i10 * 32);
        }
        for (int i11 = 0; i11 < 16; i11++) {
            long j = (1 << (16 - i11)) - 1;
            int i12 = 1 << (15 - i11);
            long j3 = i12 - 1;
            int i13 = 0;
            while (i13 < i12) {
                hashFunctions.hash_2n_n_mask(bArr7, (int) ((i13 + j3) * 32), bArr7, (int) (((i13 * 2) + j) * 32), bArr4, i11 * 64);
                i13++;
                j3 = j3;
            }
        }
        int i14 = 2016;
        int i15 = i3;
        while (i14 < 4064) {
            bArr[i15] = bArr7[i14];
            i14++;
            i15++;
        }
        for (int i16 = 0; i16 < 32; i16++) {
            int i17 = i16 * 2;
            int i18 = (bArr5[i17] & UByte.MAX_VALUE) + ((bArr5[i17 + 1] & UByte.MAX_VALUE) << 8);
            int i19 = 0;
            while (i19 < 32) {
                bArr[i15] = bArr6[(i18 * 32) + i19];
                i19++;
                i15++;
            }
            int i20 = i18 + Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
            for (int i21 = 0; i21 < 10; i21++) {
                int i22 = (i20 & 1) != 0 ? i20 + 1 : i20 - 1;
                int i23 = 0;
                while (i23 < 32) {
                    bArr[i15] = bArr7[(i22 * 32) + i23];
                    i23++;
                    i15++;
                }
                i20 = (i22 - 1) / 2;
            }
        }
        for (int i24 = 0; i24 < 32; i24++) {
            bArr2[i24] = bArr7[i24];
        }
        return HORST_SIGBYTES;
    }

    public static int horst_verify(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2, int i3, byte[] bArr3, byte[] bArr4) {
        byte[] bArr5 = bArr2;
        byte[] bArr6 = new byte[1024];
        int i10 = i3 + 2048;
        int i11 = 0;
        while (i11 < 32) {
            int i12 = i11 * 2;
            int i13 = (bArr4[i12] & UByte.MAX_VALUE) + ((bArr4[i12 + 1] & UByte.MAX_VALUE) << 8);
            if ((i13 & 1) == 0) {
                hashFunctions.hash_n_n(bArr6, 0, bArr5, i10);
                for (int i14 = 0; i14 < 32; i14++) {
                    bArr6[i14 + 32] = bArr5[i10 + 32 + i14];
                }
            } else {
                hashFunctions.hash_n_n(bArr6, 32, bArr5, i10);
                for (int i15 = 0; i15 < 32; i15++) {
                    bArr6[i15] = bArr5[i10 + 32 + i15];
                }
            }
            int i16 = i10 + 64;
            int i17 = 1;
            while (i17 < 10) {
                int i18 = i13 >>> 1;
                if ((i18 & 1) == 0) {
                    hashFunctions.hash_2n_n_mask(bArr6, 0, bArr6, 0, bArr3, (i17 - 1) * 64);
                    for (int i19 = 0; i19 < 32; i19++) {
                        bArr6[i19 + 32] = bArr5[i16 + i19];
                    }
                } else {
                    hashFunctions.hash_2n_n_mask(bArr6, 32, bArr6, 0, bArr3, (i17 - 1) * 64);
                    for (int i20 = 0; i20 < 32; i20++) {
                        bArr6[i20] = bArr5[i16 + i20];
                    }
                }
                i16 += 32;
                i17++;
                i13 = i18;
            }
            int i21 = i13 >>> 1;
            hashFunctions.hash_2n_n_mask(bArr6, 0, bArr6, 0, bArr3, 576);
            for (int i22 = 0; i22 < 32; i22++) {
                if (bArr5[AbstractC1482f.c(i21, 32, i3, i22)] != bArr6[i22]) {
                    for (int i23 = 0; i23 < 32; i23++) {
                        bArr[i23] = 0;
                    }
                    return -1;
                }
            }
            i11++;
            i10 = i16;
        }
        int i24 = 0;
        while (i24 < 32) {
            hashFunctions.hash_2n_n_mask(bArr6, i24 * 32, bArr5, (i24 * 64) + i3, bArr3, 640);
            i24++;
            bArr5 = bArr2;
        }
        for (int i25 = 0; i25 < 16; i25++) {
            hashFunctions.hash_2n_n_mask(bArr6, i25 * 32, bArr6, i25 * 64, bArr3, 704);
        }
        for (int i26 = 0; i26 < 8; i26++) {
            hashFunctions.hash_2n_n_mask(bArr6, i26 * 32, bArr6, i26 * 64, bArr3, 768);
        }
        for (int i27 = 0; i27 < 4; i27++) {
            hashFunctions.hash_2n_n_mask(bArr6, i27 * 32, bArr6, i27 * 64, bArr3, 832);
        }
        for (int i28 = 0; i28 < 2; i28++) {
            hashFunctions.hash_2n_n_mask(bArr6, i28 * 32, bArr6, i28 * 64, bArr3, 896);
        }
        hashFunctions.hash_2n_n_mask(bArr, 0, bArr6, 0, bArr3, 960);
        return 0;
    }
}
