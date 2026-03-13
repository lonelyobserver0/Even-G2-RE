package org.bouncycastle.pqc.crypto.falcon;

import com.stub.StubApp;
import java.security.SecureRandom;
import org.bouncycastle.util.Arrays;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class FalconNIST {
    int CRYPTO_BYTES;
    private int CRYPTO_PUBLICKEYBYTES;
    private int CRYPTO_SECRETKEYBYTES;
    int LOGN;

    /* renamed from: N, reason: collision with root package name */
    private int f19384N;
    int NONCELEN;
    private FalconCodec codec = new FalconCodec();
    private SecureRandom rand;

    public FalconNIST(int i3, int i10, SecureRandom secureRandom) {
        this.rand = secureRandom;
        this.LOGN = i3;
        this.NONCELEN = i10;
        int i11 = 1 << i3;
        this.f19384N = i11;
        this.CRYPTO_PUBLICKEYBYTES = ((i11 * 14) / 8) + 1;
        if (i3 == 10) {
            this.CRYPTO_SECRETKEYBYTES = 2305;
            this.CRYPTO_BYTES = 1330;
            return;
        }
        if (i3 == 9 || i3 == 8) {
            this.CRYPTO_SECRETKEYBYTES = ((i11 * 12) / 8) + 1 + i11;
            this.CRYPTO_BYTES = 690;
        } else if (i3 == 7 || i3 == 6) {
            this.CRYPTO_SECRETKEYBYTES = ((i11 * 14) / 8) + 1 + i11;
            this.CRYPTO_BYTES = 690;
        } else {
            this.CRYPTO_SECRETKEYBYTES = AbstractC1482f.c(i11, 2, 1, i11);
            this.CRYPTO_BYTES = 690;
        }
    }

    public byte[] crypto_sign(byte[] bArr, byte[] bArr2, int i3, int i10, byte[] bArr3, int i11) {
        int i12 = this.f19384N;
        byte[] bArr4 = new byte[i12];
        byte[] bArr5 = new byte[i12];
        byte[] bArr6 = new byte[i12];
        byte[] bArr7 = new byte[i12];
        short[] sArr = new short[i12];
        short[] sArr2 = new short[i12];
        byte[] bArr8 = new byte[48];
        int i13 = this.NONCELEN;
        byte[] bArr9 = new byte[i13];
        int i14 = (this.CRYPTO_BYTES - 2) - i13;
        byte[] bArr10 = new byte[i14];
        SHAKE256 shake256 = new SHAKE256();
        FalconSign falconSign = new FalconSign();
        FalconVrfy falconVrfy = new FalconVrfy();
        FalconCommon falconCommon = new FalconCommon();
        FalconCodec falconCodec = this.codec;
        int i15 = this.LOGN;
        int trim_i8_decode = falconCodec.trim_i8_decode(bArr4, 0, i15, falconCodec.max_fg_bits[i15], bArr3, i11, this.CRYPTO_SECRETKEYBYTES);
        if (trim_i8_decode == 0) {
            throw new IllegalStateException(StubApp.getString2(34005));
        }
        FalconCodec falconCodec2 = this.codec;
        int i16 = this.LOGN;
        int trim_i8_decode2 = falconCodec2.trim_i8_decode(bArr5, 0, i16, falconCodec2.max_fg_bits[i16], bArr3, i11 + trim_i8_decode, this.CRYPTO_SECRETKEYBYTES - trim_i8_decode);
        if (trim_i8_decode2 == 0) {
            throw new IllegalStateException(StubApp.getString2(34004));
        }
        int i17 = trim_i8_decode + trim_i8_decode2;
        FalconCodec falconCodec3 = this.codec;
        int i18 = this.LOGN;
        int trim_i8_decode3 = falconCodec3.trim_i8_decode(bArr6, 0, i18, falconCodec3.max_FG_bits[i18], bArr3, i11 + i17, this.CRYPTO_SECRETKEYBYTES - i17);
        if (trim_i8_decode3 == 0) {
            throw new IllegalArgumentException(StubApp.getString2(34003));
        }
        if (i17 + trim_i8_decode3 != this.CRYPTO_SECRETKEYBYTES - 1) {
            throw new IllegalStateException(StubApp.getString2(34002));
        }
        if (falconVrfy.complete_private(bArr7, 0, bArr4, 0, bArr5, 0, bArr6, 0, this.LOGN, new short[this.f19384N * 2], 0) == 0) {
            throw new IllegalStateException(StubApp.getString2(34001));
        }
        this.rand.nextBytes(bArr9);
        shake256.inner_shake256_init();
        shake256.inner_shake256_inject(bArr9, 0, this.NONCELEN);
        shake256.inner_shake256_inject(bArr2, i3, i10);
        shake256.i_shake256_flip();
        falconCommon.hash_to_point_vartime(shake256, sArr2, 0, this.LOGN);
        this.rand.nextBytes(bArr8);
        shake256.inner_shake256_init();
        shake256.inner_shake256_inject(bArr8, 0, 48);
        shake256.i_shake256_flip();
        falconSign.sign_dyn(sArr, 0, shake256, bArr4, 0, bArr5, 0, bArr6, 0, bArr7, 0, sArr2, 0, this.LOGN, new FalconFPR[this.f19384N * 10], 0);
        int i19 = this.LOGN;
        bArr10[0] = (byte) (i19 + 32);
        int comp_encode = this.codec.comp_encode(bArr10, 1, i14 - 1, sArr, 0, i19);
        if (comp_encode == 0) {
            throw new IllegalStateException(StubApp.getString2(34000));
        }
        int i20 = comp_encode + 1;
        bArr[0] = (byte) (this.LOGN + 48);
        System.arraycopy(bArr9, 0, bArr, 1, this.NONCELEN);
        System.arraycopy(bArr10, 0, bArr, this.NONCELEN + 1, i20);
        return Arrays.copyOfRange(bArr, 0, this.NONCELEN + 1 + i20);
    }

    public byte[][] crypto_sign_keypair(byte[] bArr, int i3, byte[] bArr2, int i10) {
        int i11 = this.f19384N;
        byte[] bArr3 = new byte[i11];
        byte[] bArr4 = new byte[i11];
        byte[] bArr5 = new byte[i11];
        short[] sArr = new short[i11];
        byte[] bArr6 = new byte[48];
        SHAKE256 shake256 = new SHAKE256();
        FalconKeyGen falconKeyGen = new FalconKeyGen();
        this.rand.nextBytes(bArr6);
        shake256.inner_shake256_init();
        shake256.inner_shake256_inject(bArr6, 0, 48);
        shake256.i_shake256_flip();
        falconKeyGen.keygen(shake256, bArr3, 0, bArr4, 0, bArr5, 0, null, 0, sArr, 0, this.LOGN);
        int i12 = this.LOGN;
        bArr2[i10] = (byte) (i12 + 80);
        FalconCodec falconCodec = this.codec;
        int i13 = i10 + 1;
        int trim_i8_encode = falconCodec.trim_i8_encode(bArr2, i13, this.CRYPTO_SECRETKEYBYTES - 1, bArr3, 0, i12, falconCodec.max_fg_bits[i12]);
        if (trim_i8_encode == 0) {
            throw new IllegalStateException(StubApp.getString2(34010));
        }
        int i14 = trim_i8_encode + 1;
        byte[] copyOfRange = Arrays.copyOfRange(bArr2, i13, i14);
        FalconCodec falconCodec2 = this.codec;
        int i15 = i10 + i14;
        int i16 = this.CRYPTO_SECRETKEYBYTES - i14;
        int i17 = this.LOGN;
        int trim_i8_encode2 = falconCodec2.trim_i8_encode(bArr2, i15, i16, bArr4, 0, i17, falconCodec2.max_fg_bits[i17]);
        if (trim_i8_encode2 == 0) {
            throw new IllegalStateException(StubApp.getString2(34009));
        }
        int i18 = i14 + trim_i8_encode2;
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr2, i15, i18);
        FalconCodec falconCodec3 = this.codec;
        int i19 = i10 + i18;
        int i20 = this.CRYPTO_SECRETKEYBYTES - i18;
        int i21 = this.LOGN;
        int trim_i8_encode3 = falconCodec3.trim_i8_encode(bArr2, i19, i20, bArr5, 0, i21, falconCodec3.max_FG_bits[i21]);
        if (trim_i8_encode3 == 0) {
            throw new IllegalStateException(StubApp.getString2(34008));
        }
        int i22 = i18 + trim_i8_encode3;
        byte[] copyOfRange3 = Arrays.copyOfRange(bArr2, i19, i22);
        if (i22 != this.CRYPTO_SECRETKEYBYTES) {
            throw new IllegalStateException(StubApp.getString2(34007));
        }
        int i23 = this.LOGN;
        bArr[i3] = (byte) i23;
        if (this.codec.modq_encode(bArr, i3 + 1, this.CRYPTO_PUBLICKEYBYTES - 1, sArr, 0, i23) == this.CRYPTO_PUBLICKEYBYTES - 1) {
            return new byte[][]{Arrays.copyOfRange(bArr, 1, bArr.length), copyOfRange, copyOfRange2, copyOfRange3};
        }
        throw new IllegalStateException(StubApp.getString2(34006));
    }

    public int crypto_sign_open(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i3) {
        int i10 = this.f19384N;
        short[] sArr = new short[i10];
        short[] sArr2 = new short[i10];
        short[] sArr3 = new short[i10];
        SHAKE256 shake256 = new SHAKE256();
        FalconVrfy falconVrfy = new FalconVrfy();
        FalconCommon falconCommon = new FalconCommon();
        if (this.codec.modq_decode(sArr, 0, this.LOGN, bArr4, i3, this.CRYPTO_PUBLICKEYBYTES - 1) != this.CRYPTO_PUBLICKEYBYTES - 1) {
            return -1;
        }
        falconVrfy.to_ntt_monty(sArr, 0, this.LOGN);
        int length = bArr.length;
        int length2 = bArr3.length;
        if (length >= 1) {
            byte b2 = bArr[0];
            int i11 = this.LOGN;
            if (b2 == ((byte) (i11 + 32))) {
                int i12 = length - 1;
                if (this.codec.comp_decode(sArr3, 0, i11, bArr, 1, i12) != i12) {
                    return -1;
                }
                shake256.inner_shake256_init();
                shake256.inner_shake256_inject(bArr2, 0, this.NONCELEN);
                shake256.inner_shake256_inject(bArr3, 0, length2);
                shake256.i_shake256_flip();
                falconCommon.hash_to_point_vartime(shake256, sArr2, 0, this.LOGN);
                return falconVrfy.verify_raw(sArr2, 0, sArr3, 0, sArr, 0, this.LOGN, new short[this.f19384N], 0) == 0 ? -1 : 0;
            }
        }
        return -1;
    }
}
