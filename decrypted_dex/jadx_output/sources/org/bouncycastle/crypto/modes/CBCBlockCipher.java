package org.bouncycastle.crypto.modes;

import com.stub.StubApp;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DefaultMultiBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CBCBlockCipher extends DefaultMultiBlockCipher implements CBCModeCipher {
    private byte[] IV;
    private int blockSize;
    private byte[] cbcNextV;
    private byte[] cbcV;
    private BlockCipher cipher;
    private boolean encrypting;

    public CBCBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.IV = new byte[blockSize];
        this.cbcV = new byte[blockSize];
        this.cbcNextV = new byte[blockSize];
    }

    private int decryptBlock(byte[] bArr, int i3, byte[] bArr2, int i10) throws DataLengthException, IllegalStateException {
        int i11 = this.blockSize;
        if (i3 + i11 > bArr.length) {
            throw new DataLengthException(StubApp.getString2(28553));
        }
        System.arraycopy(bArr, i3, this.cbcNextV, 0, i11);
        int processBlock = this.cipher.processBlock(bArr, i3, bArr2, i10);
        for (int i12 = 0; i12 < this.blockSize; i12++) {
            int i13 = i10 + i12;
            bArr2[i13] = (byte) (bArr2[i13] ^ this.cbcV[i12]);
        }
        byte[] bArr3 = this.cbcV;
        this.cbcV = this.cbcNextV;
        this.cbcNextV = bArr3;
        return processBlock;
    }

    private int encryptBlock(byte[] bArr, int i3, byte[] bArr2, int i10) throws DataLengthException, IllegalStateException {
        if (this.blockSize + i3 > bArr.length) {
            throw new DataLengthException(StubApp.getString2(28553));
        }
        for (int i11 = 0; i11 < this.blockSize; i11++) {
            byte[] bArr3 = this.cbcV;
            bArr3[i11] = (byte) (bArr3[i11] ^ bArr[i3 + i11]);
        }
        int processBlock = this.cipher.processBlock(this.cbcV, 0, bArr2, i10);
        byte[] bArr4 = this.cbcV;
        System.arraycopy(bArr2, i10, bArr4, 0, bArr4.length);
        return processBlock;
    }

    public static CBCModeCipher newInstance(BlockCipher blockCipher) {
        return new CBCBlockCipher(blockCipher);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + StubApp.getString2(29064);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        BlockCipher blockCipher;
        boolean z10 = this.encrypting;
        this.encrypting = z2;
        boolean z11 = cipherParameters instanceof ParametersWithIV;
        String string2 = StubApp.getString2(29065);
        if (z11) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv = parametersWithIV.getIV();
            if (iv.length != this.blockSize) {
                throw new IllegalArgumentException(StubApp.getString2(29066));
            }
            System.arraycopy(iv, 0, this.IV, 0, iv.length);
            reset();
            if (parametersWithIV.getParameters() == null) {
                if (z10 != z2) {
                    throw new IllegalArgumentException(string2);
                }
                return;
            } else {
                blockCipher = this.cipher;
                cipherParameters = parametersWithIV.getParameters();
            }
        } else {
            reset();
            if (cipherParameters == null) {
                if (z10 != z2) {
                    throw new IllegalArgumentException(string2);
                }
                return;
            }
            blockCipher = this.cipher;
        }
        blockCipher.init(z2, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i3, byte[] bArr2, int i10) throws DataLengthException, IllegalStateException {
        return this.encrypting ? encryptBlock(bArr, i3, bArr2, i10) : decryptBlock(bArr, i3, bArr2, i10);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        byte[] bArr = this.IV;
        System.arraycopy(bArr, 0, this.cbcV, 0, bArr.length);
        Arrays.fill(this.cbcNextV, (byte) 0);
        this.cipher.reset();
    }
}
