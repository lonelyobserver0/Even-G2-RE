package org.bouncycastle.pqc.crypto.sike;

import java.security.SecureRandom;
import org.bouncycastle.crypto.digests.SHAKEDigest;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class SIKEEngine {
    protected Fpx fpx;
    private boolean isCompressed;
    protected Isogeny isogeny;
    protected Internal params;
    private SIDH sidh;
    private SIDH_Compressed sidhCompressed;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SIKEEngine(int r2, boolean r3) {
        /*
            r1 = this;
            r1.<init>()
            r1.isCompressed = r3
            r0 = 434(0x1b2, float:6.08E-43)
            if (r2 == r0) goto L2a
            r0 = 503(0x1f7, float:7.05E-43)
            if (r2 == r0) goto L24
            r0 = 610(0x262, float:8.55E-43)
            if (r2 == r0) goto L1e
            r0 = 751(0x2ef, float:1.052E-42)
            if (r2 == r0) goto L16
            goto L30
        L16:
            org.bouncycastle.pqc.crypto.sike.P751 r2 = new org.bouncycastle.pqc.crypto.sike.P751
            r2.<init>(r3)
        L1b:
            r1.params = r2
            goto L30
        L1e:
            org.bouncycastle.pqc.crypto.sike.P610 r2 = new org.bouncycastle.pqc.crypto.sike.P610
            r2.<init>(r3)
            goto L1b
        L24:
            org.bouncycastle.pqc.crypto.sike.P503 r2 = new org.bouncycastle.pqc.crypto.sike.P503
            r2.<init>(r3)
            goto L1b
        L2a:
            org.bouncycastle.pqc.crypto.sike.P434 r2 = new org.bouncycastle.pqc.crypto.sike.P434
            r2.<init>(r3)
            goto L1b
        L30:
            org.bouncycastle.pqc.crypto.sike.Fpx r2 = new org.bouncycastle.pqc.crypto.sike.Fpx
            r2.<init>(r1)
            r1.fpx = r2
            org.bouncycastle.pqc.crypto.sike.Isogeny r2 = new org.bouncycastle.pqc.crypto.sike.Isogeny
            r2.<init>(r1)
            r1.isogeny = r2
            if (r3 == 0) goto L47
            org.bouncycastle.pqc.crypto.sike.SIDH_Compressed r2 = new org.bouncycastle.pqc.crypto.sike.SIDH_Compressed
            r2.<init>(r1)
            r1.sidhCompressed = r2
        L47:
            org.bouncycastle.pqc.crypto.sike.SIDH r2 = new org.bouncycastle.pqc.crypto.sike.SIDH
            r2.<init>(r1)
            r1.sidh = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.crypto.sike.SIKEEngine.<init>(int, boolean):void");
    }

    public int crypto_kem_dec(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (this.isCompressed) {
            Internal internal = this.params;
            byte[] bArr4 = new byte[internal.SECRETKEY_B_BYTES];
            int i3 = internal.FP2_ENCODED_BYTES;
            byte[] bArr5 = new byte[(i3 * 2) + i3 + internal.SECRETKEY_A_BYTES];
            int i10 = internal.MSG_BYTES;
            byte[] bArr6 = new byte[i10];
            byte[] bArr7 = new byte[internal.CRYPTO_CIPHERTEXTBYTES + i10];
            this.sidhCompressed.EphemeralSecretAgreement_A_extended(bArr3, i10, bArr2, bArr5, 1);
            SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
            sHAKEDigest.update(bArr5, 0, this.params.FP2_ENCODED_BYTES);
            sHAKEDigest.doFinal(bArr6, 0, this.params.MSG_BYTES);
            int i11 = 0;
            while (true) {
                Internal internal2 = this.params;
                int i12 = internal2.MSG_BYTES;
                if (i11 >= i12) {
                    System.arraycopy(bArr3, internal2.SECRETKEY_A_BYTES + i12, bArr7, i12, internal2.CRYPTO_PUBLICKEYBYTES);
                    Internal internal3 = this.params;
                    sHAKEDigest.update(bArr7, 0, internal3.CRYPTO_PUBLICKEYBYTES + internal3.MSG_BYTES);
                    sHAKEDigest.doFinal(bArr4, 0, this.params.SECRETKEY_B_BYTES);
                    this.sidhCompressed.FormatPrivKey_B(bArr4);
                    SIDH_Compressed sIDH_Compressed = this.sidhCompressed;
                    Internal internal4 = this.params;
                    this.fpx.ct_cmov(bArr7, bArr3, this.params.MSG_BYTES, sIDH_Compressed.validate_ciphertext(bArr4, bArr2, bArr3, internal4.MSG_BYTES + internal4.SECRETKEY_A_BYTES + internal4.CRYPTO_PUBLICKEYBYTES, bArr5, internal4.FP2_ENCODED_BYTES));
                    Internal internal5 = this.params;
                    System.arraycopy(bArr2, 0, bArr7, internal5.MSG_BYTES, internal5.CRYPTO_CIPHERTEXTBYTES);
                    Internal internal6 = this.params;
                    sHAKEDigest.update(bArr7, 0, internal6.CRYPTO_CIPHERTEXTBYTES + internal6.MSG_BYTES);
                    sHAKEDigest.doFinal(bArr, 0, this.params.CRYPTO_BYTES);
                    return 0;
                }
                bArr7[i11] = (byte) (bArr2[internal2.PARTIALLY_COMPRESSED_CHUNK_CT + i11] ^ bArr6[i11]);
                i11++;
            }
        } else {
            Internal internal7 = this.params;
            byte[] bArr8 = new byte[internal7.SECRETKEY_A_BYTES];
            byte[] bArr9 = new byte[internal7.FP2_ENCODED_BYTES];
            int i13 = internal7.MSG_BYTES;
            byte[] bArr10 = new byte[i13];
            byte[] bArr11 = new byte[internal7.CRYPTO_PUBLICKEYBYTES];
            byte[] bArr12 = new byte[internal7.CRYPTO_CIPHERTEXTBYTES + i13];
            this.sidh.EphemeralSecretAgreement_B(bArr3, bArr2, bArr9);
            SHAKEDigest sHAKEDigest2 = new SHAKEDigest(256);
            sHAKEDigest2.update(bArr9, 0, this.params.FP2_ENCODED_BYTES);
            sHAKEDigest2.doFinal(bArr10, 0, this.params.MSG_BYTES);
            int i14 = 0;
            while (true) {
                Internal internal8 = this.params;
                int i15 = internal8.MSG_BYTES;
                if (i14 >= i15) {
                    System.arraycopy(bArr3, internal8.SECRETKEY_B_BYTES + i15, bArr12, i15, internal8.CRYPTO_PUBLICKEYBYTES);
                    Internal internal9 = this.params;
                    sHAKEDigest2.update(bArr12, 0, internal9.CRYPTO_PUBLICKEYBYTES + internal9.MSG_BYTES);
                    sHAKEDigest2.doFinal(bArr8, 0, this.params.SECRETKEY_A_BYTES);
                    Internal internal10 = this.params;
                    int i16 = internal10.SECRETKEY_A_BYTES - 1;
                    bArr8[i16] = (byte) (internal10.MASK_ALICE & bArr8[i16]);
                    this.sidh.EphemeralKeyGeneration_A(bArr8, bArr11);
                    this.fpx.ct_cmov(bArr12, bArr3, this.params.MSG_BYTES, this.fpx.ct_compare(bArr11, bArr2, this.params.CRYPTO_PUBLICKEYBYTES));
                    Internal internal11 = this.params;
                    System.arraycopy(bArr2, 0, bArr12, internal11.MSG_BYTES, internal11.CRYPTO_CIPHERTEXTBYTES);
                    Internal internal12 = this.params;
                    sHAKEDigest2.update(bArr12, 0, internal12.CRYPTO_CIPHERTEXTBYTES + internal12.MSG_BYTES);
                    sHAKEDigest2.doFinal(bArr, 0, this.params.CRYPTO_BYTES);
                    return 0;
                }
                bArr12[i14] = (byte) (bArr2[internal8.CRYPTO_PUBLICKEYBYTES + i14] ^ bArr10[i14]);
                i14++;
            }
        }
    }

    public int crypto_kem_enc(byte[] bArr, byte[] bArr2, byte[] bArr3, SecureRandom secureRandom) {
        SHAKEDigest sHAKEDigest;
        Internal internal;
        int i3;
        Internal internal2;
        int i10;
        if (this.isCompressed) {
            Internal internal3 = this.params;
            byte[] bArr4 = new byte[internal3.SECRETKEY_B_BYTES];
            byte[] bArr5 = new byte[internal3.FP2_ENCODED_BYTES];
            int i11 = internal3.MSG_BYTES;
            byte[] bArr6 = new byte[i11];
            byte[] bArr7 = new byte[internal3.CRYPTO_CIPHERTEXTBYTES + i11];
            byte[] bArr8 = new byte[i11];
            secureRandom.nextBytes(bArr8);
            System.arraycopy(bArr8, 0, bArr7, 0, this.params.MSG_BYTES);
            Internal internal4 = this.params;
            System.arraycopy(bArr3, 0, bArr7, internal4.MSG_BYTES, internal4.CRYPTO_PUBLICKEYBYTES);
            sHAKEDigest = new SHAKEDigest(256);
            Internal internal5 = this.params;
            sHAKEDigest.update(bArr7, 0, internal5.CRYPTO_PUBLICKEYBYTES + internal5.MSG_BYTES);
            sHAKEDigest.doFinal(bArr4, 0, this.params.SECRETKEY_B_BYTES);
            this.sidhCompressed.FormatPrivKey_B(bArr4);
            this.sidhCompressed.EphemeralKeyGeneration_B_extended(bArr4, bArr, 1);
            this.sidhCompressed.EphemeralSecretAgreement_B(bArr4, bArr3, bArr5);
            sHAKEDigest.update(bArr5, 0, this.params.FP2_ENCODED_BYTES);
            sHAKEDigest.doFinal(bArr6, 0, this.params.MSG_BYTES);
            int i12 = 0;
            while (true) {
                internal2 = this.params;
                i10 = internal2.MSG_BYTES;
                if (i12 >= i10) {
                    break;
                }
                bArr[internal2.PARTIALLY_COMPRESSED_CHUNK_CT + i12] = (byte) (bArr7[i12] ^ bArr6[i12]);
                i12++;
            }
            System.arraycopy(bArr, 0, bArr7, i10, internal2.CRYPTO_CIPHERTEXTBYTES);
            Internal internal6 = this.params;
            sHAKEDigest.update(bArr7, 0, internal6.CRYPTO_CIPHERTEXTBYTES + internal6.MSG_BYTES);
        } else {
            Internal internal7 = this.params;
            byte[] bArr9 = new byte[internal7.SECRETKEY_A_BYTES];
            byte[] bArr10 = new byte[internal7.FP2_ENCODED_BYTES];
            int i13 = internal7.MSG_BYTES;
            byte[] bArr11 = new byte[i13];
            byte[] bArr12 = new byte[internal7.CRYPTO_CIPHERTEXTBYTES + i13];
            byte[] bArr13 = new byte[i13];
            secureRandom.nextBytes(bArr13);
            System.arraycopy(bArr13, 0, bArr12, 0, this.params.MSG_BYTES);
            Internal internal8 = this.params;
            System.arraycopy(bArr3, 0, bArr12, internal8.MSG_BYTES, internal8.CRYPTO_PUBLICKEYBYTES);
            sHAKEDigest = new SHAKEDigest(256);
            Internal internal9 = this.params;
            sHAKEDigest.update(bArr12, 0, internal9.CRYPTO_PUBLICKEYBYTES + internal9.MSG_BYTES);
            sHAKEDigest.doFinal(bArr9, 0, this.params.SECRETKEY_A_BYTES);
            Internal internal10 = this.params;
            int i14 = internal10.SECRETKEY_A_BYTES - 1;
            bArr9[i14] = (byte) (internal10.MASK_ALICE & bArr9[i14]);
            this.sidh.EphemeralKeyGeneration_A(bArr9, bArr);
            this.sidh.EphemeralSecretAgreement_A(bArr9, bArr3, bArr10);
            sHAKEDigest.update(bArr10, 0, this.params.FP2_ENCODED_BYTES);
            sHAKEDigest.doFinal(bArr11, 0, this.params.MSG_BYTES);
            int i15 = 0;
            while (true) {
                internal = this.params;
                i3 = internal.MSG_BYTES;
                if (i15 >= i3) {
                    break;
                }
                bArr[internal.CRYPTO_PUBLICKEYBYTES + i15] = (byte) (bArr12[i15] ^ bArr11[i15]);
                i15++;
            }
            System.arraycopy(bArr, 0, bArr12, i3, internal.CRYPTO_CIPHERTEXTBYTES);
            Internal internal11 = this.params;
            sHAKEDigest.update(bArr12, 0, internal11.CRYPTO_CIPHERTEXTBYTES + internal11.MSG_BYTES);
        }
        sHAKEDigest.doFinal(bArr2, 0, this.params.CRYPTO_BYTES);
        return 0;
    }

    public int crypto_kem_keypair(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        Internal internal;
        int i3;
        int i10;
        byte[] bArr3 = new byte[this.params.MSG_BYTES];
        secureRandom.nextBytes(bArr3);
        if (this.isCompressed) {
            byte[] bArr4 = new byte[this.params.SECRETKEY_A_BYTES];
            secureRandom.nextBytes(bArr4);
            bArr4[0] = (byte) (bArr4[0] & 254);
            Internal internal2 = this.params;
            int i11 = internal2.SECRETKEY_A_BYTES - 1;
            bArr4[i11] = (byte) (bArr4[i11] & internal2.MASK_ALICE);
            System.arraycopy(bArr3, 0, bArr2, 0, internal2.MSG_BYTES);
            Internal internal3 = this.params;
            System.arraycopy(bArr4, 0, bArr2, internal3.MSG_BYTES, internal3.SECRETKEY_A_BYTES);
            this.sidhCompressed.EphemeralKeyGeneration_A_extended(bArr2, bArr);
            internal = this.params;
            i3 = internal.MSG_BYTES;
            i10 = internal.SECRETKEY_A_BYTES;
        } else {
            byte[] bArr5 = new byte[this.params.SECRETKEY_B_BYTES];
            secureRandom.nextBytes(bArr5);
            Internal internal4 = this.params;
            int i12 = internal4.SECRETKEY_B_BYTES - 1;
            bArr5[i12] = (byte) (bArr5[i12] & internal4.MASK_BOB);
            System.arraycopy(bArr3, 0, bArr2, 0, internal4.MSG_BYTES);
            Internal internal5 = this.params;
            System.arraycopy(bArr5, 0, bArr2, internal5.MSG_BYTES, internal5.SECRETKEY_B_BYTES);
            this.sidh.EphemeralKeyGeneration_B(bArr2, bArr);
            internal = this.params;
            i3 = internal.MSG_BYTES;
            i10 = internal.SECRETKEY_B_BYTES;
        }
        System.arraycopy(bArr, 0, bArr2, i3 + i10, internal.CRYPTO_PUBLICKEYBYTES);
        return 0;
    }

    public int getCipherTextSize() {
        return this.params.CRYPTO_CIPHERTEXTBYTES;
    }

    public int getDefaultSessionKeySize() {
        return this.params.MSG_BYTES * 8;
    }

    public int getPrivateKeySize() {
        return this.params.CRYPTO_SECRETKEYBYTES;
    }

    public int getPublicKeySize() {
        return this.params.CRYPTO_PUBLICKEYBYTES;
    }
}
