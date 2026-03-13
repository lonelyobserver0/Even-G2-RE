package org.bouncycastle.pqc.crypto.saber;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class SABEREngine {
    public static final int SABER_EP = 10;
    public static final int SABER_EQ = 13;
    private static final int SABER_HASHBYTES = 32;
    private static final int SABER_KEYBYTES = 32;
    public static final int SABER_N = 256;
    private static final int SABER_NOISE_SEEDBYTES = 32;
    private static final int SABER_SEEDBYTES = 32;
    private final int SABER_BYTES_CCA_DEC;
    private final int SABER_ET;
    private final int SABER_INDCPA_PUBLICKEYBYTES;
    private final int SABER_INDCPA_SECRETKEYBYTES;
    private final int SABER_L;
    private final int SABER_MU;
    private final int SABER_POLYBYTES;
    private final int SABER_POLYCOINBYTES;
    private final int SABER_POLYCOMPRESSEDBYTES;
    private final int SABER_POLYVECBYTES;
    private final int SABER_POLYVECCOMPRESSEDBYTES;
    private final int SABER_PUBLICKEYBYTES;
    private final int SABER_SCALEBYTES_KEM;
    private final int SABER_SECRETKEYBYTES;
    private final int defaultKeySize;

    /* renamed from: h1, reason: collision with root package name */
    private final int f19461h1;
    private final int h2;
    private final Poly poly;
    private final Utils utils;

    public SABEREngine(int i3, int i10) {
        this.defaultKeySize = i10;
        this.SABER_L = i3;
        if (i3 == 2) {
            this.SABER_MU = 10;
            this.SABER_ET = 3;
        } else if (i3 == 3) {
            this.SABER_MU = 8;
            this.SABER_ET = 4;
        } else {
            this.SABER_MU = 6;
            this.SABER_ET = 6;
        }
        this.SABER_POLYCOINBYTES = (this.SABER_MU * 256) / 8;
        this.SABER_POLYBYTES = DilithiumEngine.DilithiumPolyT0PackedBytes;
        int i11 = i3 * DilithiumEngine.DilithiumPolyT0PackedBytes;
        this.SABER_POLYVECBYTES = i11;
        this.SABER_POLYCOMPRESSEDBYTES = DilithiumEngine.DilithiumPolyT1PackedBytes;
        int i12 = i3 * DilithiumEngine.DilithiumPolyT1PackedBytes;
        this.SABER_POLYVECCOMPRESSEDBYTES = i12;
        int i13 = this.SABER_ET;
        int i14 = (i13 * 256) / 8;
        this.SABER_SCALEBYTES_KEM = i14;
        int i15 = i12 + 32;
        this.SABER_INDCPA_PUBLICKEYBYTES = i15;
        this.SABER_INDCPA_SECRETKEYBYTES = i11;
        this.SABER_PUBLICKEYBYTES = i15;
        this.SABER_SECRETKEYBYTES = i11 + i15 + 64;
        this.SABER_BYTES_CCA_DEC = i12 + i14;
        this.f19461h1 = 4;
        this.h2 = 260 - (1 << (9 - i13));
        this.utils = new Utils(this);
        this.poly = new Poly(this);
    }

    public static void cmov(byte[] bArr, byte[] bArr2, int i3, int i10, byte b2) {
        byte b10 = (byte) (-b2);
        for (int i11 = 0; i11 < i10; i11++) {
            byte b11 = bArr[i11];
            bArr[i11] = (byte) (b11 ^ ((bArr2[i11 + i3] ^ b11) & b10));
        }
    }

    private void indcpa_kem_dec(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int[] iArr = {this.SABER_L, 256};
        Class cls = Short.TYPE;
        short[][] sArr = (short[][]) Array.newInstance((Class<?>) cls, iArr);
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) cls, this.SABER_L, 256);
        short[] sArr3 = new short[256];
        short[] sArr4 = new short[256];
        this.utils.BS2POLVECq(bArr, 0, sArr);
        this.utils.BS2POLVECp(bArr2, sArr2);
        this.poly.InnerProd(sArr2, sArr, sArr3);
        this.utils.BS2POLT(bArr2, this.SABER_POLYVECCOMPRESSEDBYTES, sArr4);
        for (int i3 = 0; i3 < 256; i3++) {
            sArr3[i3] = (short) ((((sArr3[i3] + this.h2) - (sArr4[i3] << (10 - this.SABER_ET))) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) >> 9);
        }
        this.utils.POLmsg2BS(bArr3, sArr3);
    }

    private void indcpa_kem_enc(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int i3 = this.SABER_L;
        char c10 = 3;
        int[] iArr = {i3, i3, 256};
        Class cls = Short.TYPE;
        short[][][] sArr = (short[][][]) Array.newInstance((Class<?>) cls, iArr);
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) cls, this.SABER_L, 256);
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) cls, this.SABER_L, 256);
        short[][] sArr4 = (short[][]) Array.newInstance((Class<?>) cls, this.SABER_L, 256);
        short[] sArr5 = new short[256];
        short[] sArr6 = new short[256];
        this.poly.GenMatrix(sArr, Arrays.copyOfRange(bArr3, this.SABER_POLYVECCOMPRESSEDBYTES, bArr3.length));
        this.poly.GenSecret(sArr2, bArr2);
        this.poly.MatrixVectorMul(sArr, sArr2, sArr3, 0);
        for (int i10 = 0; i10 < this.SABER_L; i10++) {
            int i11 = 0;
            while (i11 < 256) {
                short[] sArr7 = sArr3[i10];
                sArr7[i11] = (short) (((sArr7[i11] + this.f19461h1) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) >>> 3);
                i11++;
                c10 = c10;
            }
        }
        this.utils.POLVECp2BS(bArr4, sArr3);
        this.utils.BS2POLVECp(bArr3, sArr4);
        this.poly.InnerProd(sArr4, sArr2, sArr6);
        this.utils.BS2POLmsg(bArr, sArr5);
        for (int i12 = 0; i12 < 256; i12++) {
            sArr6[i12] = (short) ((((sArr6[i12] - (sArr5[i12] << 9)) + this.f19461h1) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) >>> (10 - this.SABER_ET));
        }
        this.utils.POLT2BS(bArr4, this.SABER_POLYVECCOMPRESSEDBYTES, sArr6);
    }

    private void indcpa_kem_keypair(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        int i3 = this.SABER_L;
        int[] iArr = {i3, i3, 256};
        Class cls = Short.TYPE;
        short[][][] sArr = (short[][][]) Array.newInstance((Class<?>) cls, iArr);
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) cls, this.SABER_L, 256);
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) cls, this.SABER_L, 256);
        byte[] bArr3 = new byte[32];
        byte[] bArr4 = new byte[32];
        secureRandom.nextBytes(bArr3);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(128);
        sHAKEDigest.update(bArr3, 0, 32);
        sHAKEDigest.doFinal(bArr3, 0, 32);
        secureRandom.nextBytes(bArr4);
        this.poly.GenMatrix(sArr, bArr3);
        this.poly.GenSecret(sArr2, bArr4);
        this.poly.MatrixVectorMul(sArr, sArr2, sArr3, 1);
        for (int i10 = 0; i10 < this.SABER_L; i10++) {
            for (int i11 = 0; i11 < 256; i11++) {
                short[] sArr4 = sArr3[i10];
                sArr4[i11] = (short) (((sArr4[i11] + this.f19461h1) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) >>> 3);
            }
        }
        this.utils.POLVECq2BS(bArr2, sArr2);
        this.utils.POLVECp2BS(bArr, sArr3);
        System.arraycopy(bArr3, 0, bArr, this.SABER_POLYVECCOMPRESSEDBYTES, 32);
    }

    public static int verify(byte[] bArr, byte[] bArr2, int i3) {
        long j = 0;
        for (int i10 = 0; i10 < i3; i10++) {
            j |= bArr[i10] ^ bArr2[i10];
        }
        return (int) ((-j) >>> 63);
    }

    public int crypto_kem_dec(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[this.SABER_BYTES_CCA_DEC];
        byte[] bArr5 = new byte[64];
        byte[] bArr6 = new byte[64];
        byte[] copyOfRange = Arrays.copyOfRange(bArr3, this.SABER_INDCPA_SECRETKEYBYTES, bArr3.length);
        indcpa_kem_dec(bArr3, bArr2, bArr5);
        for (int i3 = 0; i3 < 32; i3++) {
            bArr5[i3 + 32] = bArr3[(this.SABER_SECRETKEYBYTES - 64) + i3];
        }
        SHA3Digest sHA3Digest = new SHA3Digest(256);
        SHA3Digest sHA3Digest2 = new SHA3Digest(512);
        sHA3Digest2.update(bArr5, 0, 64);
        sHA3Digest2.doFinal(bArr6, 0);
        indcpa_kem_enc(bArr5, Arrays.copyOfRange(bArr6, 32, 64), copyOfRange, bArr4);
        int verify = verify(bArr2, bArr4, this.SABER_BYTES_CCA_DEC);
        sHA3Digest.update(bArr2, 0, this.SABER_BYTES_CCA_DEC);
        sHA3Digest.doFinal(bArr6, 32);
        cmov(bArr6, bArr3, this.SABER_SECRETKEYBYTES - 32, 32, (byte) verify);
        byte[] bArr7 = new byte[32];
        sHA3Digest.update(bArr6, 0, 64);
        sHA3Digest.doFinal(bArr7, 0);
        System.arraycopy(bArr7, 0, bArr, 0, this.defaultKeySize / 8);
        return 0;
    }

    public int crypto_kem_enc(byte[] bArr, byte[] bArr2, byte[] bArr3, SecureRandom secureRandom) {
        byte[] bArr4 = new byte[64];
        byte[] bArr5 = new byte[64];
        byte[] bArr6 = new byte[32];
        secureRandom.nextBytes(bArr6);
        SHA3Digest sHA3Digest = new SHA3Digest(256);
        SHA3Digest sHA3Digest2 = new SHA3Digest(512);
        sHA3Digest.update(bArr6, 0, 32);
        sHA3Digest.doFinal(bArr6, 0);
        System.arraycopy(bArr6, 0, bArr5, 0, 32);
        sHA3Digest.update(bArr3, 0, this.SABER_INDCPA_PUBLICKEYBYTES);
        sHA3Digest.doFinal(bArr5, 32);
        sHA3Digest2.update(bArr5, 0, 64);
        sHA3Digest2.doFinal(bArr4, 0);
        indcpa_kem_enc(bArr5, Arrays.copyOfRange(bArr4, 32, 64), bArr3, bArr);
        sHA3Digest.update(bArr, 0, this.SABER_BYTES_CCA_DEC);
        sHA3Digest.doFinal(bArr4, 32);
        byte[] bArr7 = new byte[32];
        sHA3Digest.update(bArr4, 0, 64);
        sHA3Digest.doFinal(bArr7, 0);
        System.arraycopy(bArr7, 0, bArr2, 0, this.defaultKeySize / 8);
        return 0;
    }

    public int crypto_kem_keypair(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        indcpa_kem_keypair(bArr, bArr2, secureRandom);
        for (int i3 = 0; i3 < this.SABER_INDCPA_PUBLICKEYBYTES; i3++) {
            bArr2[this.SABER_INDCPA_SECRETKEYBYTES + i3] = bArr[i3];
        }
        SHA3Digest sHA3Digest = new SHA3Digest(256);
        sHA3Digest.update(bArr, 0, this.SABER_INDCPA_PUBLICKEYBYTES);
        sHA3Digest.doFinal(bArr2, this.SABER_SECRETKEYBYTES - 64);
        byte[] bArr3 = new byte[32];
        secureRandom.nextBytes(bArr3);
        System.arraycopy(bArr3, 0, bArr2, this.SABER_SECRETKEYBYTES - 32, 32);
        return 0;
    }

    public int getCipherTextSize() {
        return this.SABER_BYTES_CCA_DEC;
    }

    public int getPrivateKeySize() {
        return this.SABER_SECRETKEYBYTES;
    }

    public int getPublicKeySize() {
        return this.SABER_PUBLICKEYBYTES;
    }

    public int getSABER_EP() {
        return 10;
    }

    public int getSABER_ET() {
        return this.SABER_ET;
    }

    public int getSABER_KEYBYTES() {
        return 32;
    }

    public int getSABER_L() {
        return this.SABER_L;
    }

    public int getSABER_MU() {
        return this.SABER_MU;
    }

    public int getSABER_N() {
        return 256;
    }

    public int getSABER_NOISE_SEEDBYTES() {
        return 32;
    }

    public int getSABER_POLYBYTES() {
        return this.SABER_POLYBYTES;
    }

    public int getSABER_POLYCOINBYTES() {
        return this.SABER_POLYCOINBYTES;
    }

    public int getSABER_POLYVECBYTES() {
        return this.SABER_POLYVECBYTES;
    }

    public int getSABER_SEEDBYTES() {
        return 32;
    }

    public int getSessionKeySize() {
        return this.defaultKeySize / 8;
    }

    public Utils getUtils() {
        return this.utils;
    }
}
