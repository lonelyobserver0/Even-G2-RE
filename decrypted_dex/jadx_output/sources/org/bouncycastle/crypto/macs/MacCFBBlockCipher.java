package org.bouncycastle.crypto.macs;

import com.stub.StubApp;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class MacCFBBlockCipher {
    private byte[] IV;
    private int blockSize;
    private byte[] cfbOutV;
    private byte[] cfbV;
    private BlockCipher cipher;

    public MacCFBBlockCipher(BlockCipher blockCipher, int i3) {
        this.cipher = blockCipher;
        this.blockSize = i3 / 8;
        this.IV = new byte[blockCipher.getBlockSize()];
        this.cfbV = new byte[blockCipher.getBlockSize()];
        this.cfbOutV = new byte[blockCipher.getBlockSize()];
    }

    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + StubApp.getString2(29042) + (this.blockSize * 8);
    }

    public int getBlockSize() {
        return this.blockSize;
    }

    public void getMacBlock(byte[] bArr) {
        this.cipher.processBlock(this.cfbV, 0, bArr, 0);
    }

    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        BlockCipher blockCipher;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv = parametersWithIV.getIV();
            int length = iv.length;
            byte[] bArr = this.IV;
            if (length < bArr.length) {
                System.arraycopy(iv, 0, bArr, bArr.length - iv.length, iv.length);
            } else {
                System.arraycopy(iv, 0, bArr, 0, bArr.length);
            }
            reset();
            blockCipher = this.cipher;
            cipherParameters = parametersWithIV.getParameters();
        } else {
            reset();
            blockCipher = this.cipher;
        }
        blockCipher.init(true, cipherParameters);
    }

    public int processBlock(byte[] bArr, int i3, byte[] bArr2, int i10) throws DataLengthException, IllegalStateException {
        int i11 = this.blockSize;
        if (i3 + i11 > bArr.length) {
            throw new DataLengthException(StubApp.getString2(28553));
        }
        if (i11 + i10 > bArr2.length) {
            throw new OutputLengthException(StubApp.getString2(28306));
        }
        this.cipher.processBlock(this.cfbV, 0, this.cfbOutV, 0);
        int i12 = 0;
        while (true) {
            int i13 = this.blockSize;
            if (i12 >= i13) {
                byte[] bArr3 = this.cfbV;
                System.arraycopy(bArr3, i13, bArr3, 0, bArr3.length - i13);
                byte[] bArr4 = this.cfbV;
                int length = bArr4.length;
                int i14 = this.blockSize;
                System.arraycopy(bArr2, i10, bArr4, length - i14, i14);
                return this.blockSize;
            }
            bArr2[i10 + i12] = (byte) (this.cfbOutV[i12] ^ bArr[i3 + i12]);
            i12++;
        }
    }

    public void reset() {
        byte[] bArr = this.IV;
        System.arraycopy(bArr, 0, this.cfbV, 0, bArr.length);
        this.cipher.reset();
    }
}
