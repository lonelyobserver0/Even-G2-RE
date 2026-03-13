package org.bouncycastle.crypto.prng.drbg;

import com.stub.StubApp;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.prng.EntropySource;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CTRSP800DRBG implements SP80090DRBG {
    private static final int AES_MAX_BITS_REQUEST = 262144;
    private static final long AES_RESEED_MAX = 140737488355328L;
    private static final byte[] K_BITS = Hex.decodeStrict(StubApp.getString2(29259));
    private static final int TDEA_MAX_BITS_REQUEST = 4096;
    private static final long TDEA_RESEED_MAX = 2147483648L;
    private byte[] _Key;
    private byte[] _V;
    private BlockCipher _engine;
    private EntropySource _entropySource;
    private boolean _isTDEA;
    private int _keySizeInBits;
    private long _reseedCounter = 0;
    private int _securityStrength;
    private int _seedLength;

    public CTRSP800DRBG(BlockCipher blockCipher, int i3, int i10, EntropySource entropySource, byte[] bArr, byte[] bArr2) {
        this._isTDEA = false;
        this._entropySource = entropySource;
        this._engine = blockCipher;
        this._keySizeInBits = i3;
        this._securityStrength = i10;
        this._seedLength = (blockCipher.getBlockSize() * 8) + i3;
        this._isTDEA = isTDEA(blockCipher);
        if (i10 > 256) {
            throw new IllegalArgumentException(StubApp.getString2(29262));
        }
        if (getMaxSecurityStrength(blockCipher, i3) < i10) {
            throw new IllegalArgumentException(StubApp.getString2(29261));
        }
        if (entropySource.entropySize() < i10) {
            throw new IllegalArgumentException(StubApp.getString2(29260));
        }
        CTR_DRBG_Instantiate_algorithm(getEntropy(), bArr2, bArr);
    }

    private void BCC(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int blockSize = this._engine.getBlockSize();
        byte[] bArr5 = new byte[blockSize];
        int length = bArr4.length / blockSize;
        byte[] bArr6 = new byte[blockSize];
        this._engine.init(true, new KeyParameter(expandKey(bArr2)));
        this._engine.processBlock(bArr3, 0, bArr5, 0);
        for (int i3 = 0; i3 < length; i3++) {
            XOR(bArr6, bArr5, bArr4, i3 * blockSize);
            this._engine.processBlock(bArr6, 0, bArr5, 0);
        }
        System.arraycopy(bArr5, 0, bArr, 0, bArr.length);
    }

    private byte[] Block_Cipher_df(byte[] bArr, int i3) {
        int blockSize = this._engine.getBlockSize();
        int length = bArr.length;
        int i10 = i3 / 8;
        byte[] bArr2 = new byte[((((length + 9) + blockSize) - 1) / blockSize) * blockSize];
        copyIntToByteArray(bArr2, length, 0);
        copyIntToByteArray(bArr2, i10, 4);
        System.arraycopy(bArr, 0, bArr2, 8, length);
        bArr2[length + 8] = ByteCompanionObject.MIN_VALUE;
        int i11 = this._keySizeInBits;
        int i12 = (i11 / 8) + blockSize;
        byte[] bArr3 = new byte[i12];
        byte[] bArr4 = new byte[blockSize];
        byte[] bArr5 = new byte[blockSize];
        int i13 = i11 / 8;
        byte[] bArr6 = new byte[i13];
        System.arraycopy(K_BITS, 0, bArr6, 0, i13);
        int i14 = 0;
        while (true) {
            int i15 = i14 * blockSize;
            if (i15 * 8 >= (blockSize * 8) + this._keySizeInBits) {
                break;
            }
            copyIntToByteArray(bArr5, i14, 0);
            BCC(bArr4, bArr6, bArr5, bArr2);
            int i16 = i12 - i15;
            if (i16 > blockSize) {
                i16 = blockSize;
            }
            System.arraycopy(bArr4, 0, bArr3, i15, i16);
            i14++;
        }
        byte[] bArr7 = new byte[blockSize];
        System.arraycopy(bArr3, 0, bArr6, 0, i13);
        System.arraycopy(bArr3, i13, bArr7, 0, blockSize);
        byte[] bArr8 = new byte[i10];
        this._engine.init(true, new KeyParameter(expandKey(bArr6)));
        int i17 = 0;
        while (true) {
            int i18 = i17 * blockSize;
            if (i18 >= i10) {
                return bArr8;
            }
            this._engine.processBlock(bArr7, 0, bArr7, 0);
            int i19 = i10 - i18;
            if (i19 > blockSize) {
                i19 = blockSize;
            }
            System.arraycopy(bArr7, 0, bArr8, i18, i19);
            i17++;
        }
    }

    private void CTR_DRBG_Instantiate_algorithm(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] Block_Cipher_df = Block_Cipher_df(Arrays.concatenate(bArr, bArr2, bArr3), this._seedLength);
        int blockSize = this._engine.getBlockSize();
        byte[] bArr4 = new byte[(this._keySizeInBits + 7) / 8];
        this._Key = bArr4;
        byte[] bArr5 = new byte[blockSize];
        this._V = bArr5;
        CTR_DRBG_Update(Block_Cipher_df, bArr4, bArr5);
        this._reseedCounter = 1L;
    }

    private void CTR_DRBG_Reseed_algorithm(byte[] bArr) {
        CTR_DRBG_Update(Block_Cipher_df(Arrays.concatenate(getEntropy(), bArr), this._seedLength), this._Key, this._V);
        this._reseedCounter = 1L;
    }

    private void CTR_DRBG_Update(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int length = bArr.length;
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[this._engine.getBlockSize()];
        int blockSize = this._engine.getBlockSize();
        this._engine.init(true, new KeyParameter(expandKey(bArr2)));
        int i3 = 0;
        while (true) {
            int i10 = i3 * blockSize;
            if (i10 >= bArr.length) {
                XOR(bArr4, bArr, bArr4, 0);
                System.arraycopy(bArr4, 0, bArr2, 0, bArr2.length);
                System.arraycopy(bArr4, bArr2.length, bArr3, 0, bArr3.length);
                return;
            } else {
                addOneTo(bArr3);
                this._engine.processBlock(bArr3, 0, bArr5, 0);
                int i11 = length - i10;
                if (i11 > blockSize) {
                    i11 = blockSize;
                }
                System.arraycopy(bArr5, 0, bArr4, i10, i11);
                i3++;
            }
        }
    }

    private void XOR(byte[] bArr, byte[] bArr2, byte[] bArr3, int i3) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr[i10] = (byte) (bArr2[i10] ^ bArr3[i10 + i3]);
        }
    }

    private void addOneTo(byte[] bArr) {
        int i3 = 1;
        for (int i10 = 1; i10 <= bArr.length; i10++) {
            int i11 = (bArr[bArr.length - i10] & UByte.MAX_VALUE) + i3;
            i3 = i11 > 255 ? 1 : 0;
            bArr[bArr.length - i10] = (byte) i11;
        }
    }

    private void copyIntToByteArray(byte[] bArr, int i3, int i10) {
        bArr[i10] = (byte) (i3 >> 24);
        bArr[i10 + 1] = (byte) (i3 >> 16);
        bArr[i10 + 2] = (byte) (i3 >> 8);
        bArr[i10 + 3] = (byte) i3;
    }

    private byte[] getEntropy() {
        byte[] entropy = this._entropySource.getEntropy();
        if (entropy.length >= (this._securityStrength + 7) / 8) {
            return entropy;
        }
        throw new IllegalStateException(StubApp.getString2(29263));
    }

    private int getMaxSecurityStrength(BlockCipher blockCipher, int i3) {
        if (isTDEA(blockCipher) && i3 == 168) {
            return 112;
        }
        if (blockCipher.getAlgorithmName().equals(StubApp.getString2(461))) {
            return i3;
        }
        return -1;
    }

    private boolean isTDEA(BlockCipher blockCipher) {
        return blockCipher.getAlgorithmName().equals(StubApp.getString2(28590)) || blockCipher.getAlgorithmName().equals(StubApp.getString2(29264));
    }

    private void padKey(byte[] bArr, int i3, byte[] bArr2, int i10) {
        bArr2[i10] = (byte) (bArr[i3] & 254);
        int i11 = i3 + 1;
        bArr2[i10 + 1] = (byte) ((bArr[i3] << 7) | ((bArr[i11] & 252) >>> 1));
        int i12 = bArr[i11] << 6;
        int i13 = i3 + 2;
        bArr2[i10 + 2] = (byte) (i12 | ((bArr[i13] & 248) >>> 2));
        int i14 = bArr[i13] << 5;
        int i15 = i3 + 3;
        bArr2[i10 + 3] = (byte) (i14 | ((bArr[i15] & 240) >>> 3));
        int i16 = bArr[i15] << 4;
        int i17 = i3 + 4;
        bArr2[i10 + 4] = (byte) (i16 | ((bArr[i17] & 224) >>> 4));
        int i18 = bArr[i17] << 3;
        int i19 = i3 + 5;
        bArr2[i10 + 5] = (byte) (i18 | ((bArr[i19] & 192) >>> 5));
        int i20 = i3 + 6;
        bArr2[i10 + 6] = (byte) ((bArr[i19] << 2) | ((bArr[i20] & ByteCompanionObject.MIN_VALUE) >>> 6));
        int i21 = i10 + 7;
        bArr2[i21] = (byte) (bArr[i20] << 1);
        while (i10 <= i21) {
            byte b2 = bArr2[i10];
            bArr2[i10] = (byte) (((((b2 >> 7) ^ ((((((b2 >> 1) ^ (b2 >> 2)) ^ (b2 >> 3)) ^ (b2 >> 4)) ^ (b2 >> 5)) ^ (b2 >> 6))) ^ 1) & 1) | (b2 & 254));
            i10++;
        }
    }

    public byte[] expandKey(byte[] bArr) {
        if (!this._isTDEA) {
            return bArr;
        }
        byte[] bArr2 = new byte[24];
        padKey(bArr, 0, bArr2, 0);
        padKey(bArr, 7, bArr2, 8);
        padKey(bArr, 14, bArr2, 16);
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public int generate(byte[] bArr, byte[] bArr2, boolean z2) {
        byte[] bArr3;
        boolean z10 = this._isTDEA;
        long j = this._reseedCounter;
        if (z10) {
            if (j > TDEA_RESEED_MAX) {
                return -1;
            }
            if (Utils.isTooLarge(bArr, 512)) {
                throw new IllegalArgumentException(StubApp.getString2(29256));
            }
        } else {
            if (j > AES_RESEED_MAX) {
                return -1;
            }
            if (Utils.isTooLarge(bArr, 32768)) {
                throw new IllegalArgumentException(StubApp.getString2(29258));
            }
        }
        if (z2) {
            CTR_DRBG_Reseed_algorithm(bArr2);
            bArr2 = null;
        }
        if (bArr2 != null) {
            bArr3 = Block_Cipher_df(bArr2, this._seedLength);
            CTR_DRBG_Update(bArr3, this._Key, this._V);
        } else {
            bArr3 = new byte[this._seedLength / 8];
        }
        int length = this._V.length;
        byte[] bArr4 = new byte[length];
        this._engine.init(true, new KeyParameter(expandKey(this._Key)));
        for (int i3 = 0; i3 <= bArr.length / length; i3++) {
            int i10 = i3 * length;
            int length2 = bArr.length - i10 > length ? length : bArr.length - (this._V.length * i3);
            if (length2 != 0) {
                addOneTo(this._V);
                this._engine.processBlock(this._V, 0, bArr4, 0);
                System.arraycopy(bArr4, 0, bArr, i10, length2);
            }
        }
        CTR_DRBG_Update(bArr3, this._Key, this._V);
        this._reseedCounter++;
        return bArr.length * 8;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public int getBlockSize() {
        return this._V.length * 8;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public void reseed(byte[] bArr) {
        CTR_DRBG_Reseed_algorithm(bArr);
    }
}
