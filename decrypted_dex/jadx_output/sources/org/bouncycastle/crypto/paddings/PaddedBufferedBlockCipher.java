package org.bouncycastle.crypto.paddings;

import com.stub.StubApp;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.ParametersWithRandom;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PaddedBufferedBlockCipher extends BufferedBlockCipher {
    BlockCipherPadding padding;

    public PaddedBufferedBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, new PKCS7Padding());
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i3) throws DataLengthException, IllegalStateException, InvalidCipherTextException {
        int i10;
        int blockSize = this.cipher.getBlockSize();
        if (this.forEncryption) {
            if (this.bufOff != blockSize) {
                i10 = 0;
            } else {
                if ((blockSize * 2) + i3 > bArr.length) {
                    reset();
                    throw new OutputLengthException(StubApp.getString2(28306));
                }
                i10 = this.cipher.processBlock(this.buf, 0, bArr, i3);
                this.bufOff = 0;
            }
            this.padding.addPadding(this.buf, this.bufOff);
            return this.cipher.processBlock(this.buf, 0, bArr, i3 + i10) + i10;
        }
        if (this.bufOff != blockSize) {
            reset();
            throw new DataLengthException(StubApp.getString2(29166));
        }
        BlockCipher blockCipher = this.cipher;
        byte[] bArr2 = this.buf;
        int processBlock = blockCipher.processBlock(bArr2, 0, bArr2, 0);
        this.bufOff = 0;
        try {
            int padCount = processBlock - this.padding.padCount(this.buf);
            System.arraycopy(this.buf, 0, bArr, i3, padCount);
            return padCount;
        } finally {
            reset();
        }
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i3) {
        int i10 = i3 + this.bufOff;
        byte[] bArr = this.buf;
        int length = i10 % bArr.length;
        if (length != 0) {
            i10 -= length;
        } else if (!this.forEncryption) {
            return i10;
        }
        return i10 + bArr.length;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i3) {
        int i10 = i3 + this.bufOff;
        byte[] bArr = this.buf;
        int length = i10 % bArr.length;
        return length == 0 ? Math.max(0, i10 - bArr.length) : i10 - length;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        BlockCipher blockCipher;
        this.forEncryption = z2;
        reset();
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.padding.init(parametersWithRandom.getRandom());
            blockCipher = this.cipher;
            cipherParameters = parametersWithRandom.getParameters();
        } else {
            this.padding.init(null);
            blockCipher = this.cipher;
        }
        blockCipher.init(z2, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processByte(byte b2, byte[] bArr, int i3) throws DataLengthException, IllegalStateException {
        int i10 = this.bufOff;
        byte[] bArr2 = this.buf;
        int i11 = 0;
        if (i10 == bArr2.length) {
            int processBlock = this.cipher.processBlock(bArr2, 0, bArr, i3);
            this.bufOff = 0;
            i11 = processBlock;
        }
        byte[] bArr3 = this.buf;
        int i12 = this.bufOff;
        this.bufOff = i12 + 1;
        bArr3[i12] = b2;
        return i11;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processBytes(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) throws DataLengthException, IllegalStateException {
        if (i10 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(28301));
        }
        int blockSize = getBlockSize();
        int updateOutputSize = getUpdateOutputSize(i10);
        if (updateOutputSize > 0 && updateOutputSize + i11 > bArr2.length) {
            throw new OutputLengthException(StubApp.getString2(28306));
        }
        byte[] bArr3 = this.buf;
        int length = bArr3.length;
        int i12 = this.bufOff;
        int i13 = length - i12;
        int i14 = 0;
        if (i10 > i13) {
            System.arraycopy(bArr, i3, bArr3, i12, i13);
            int processBlock = this.cipher.processBlock(this.buf, 0, bArr2, i11);
            this.bufOff = 0;
            i10 -= i13;
            i3 += i13;
            i14 = processBlock;
            while (i10 > this.buf.length) {
                i14 += this.cipher.processBlock(bArr, i3, bArr2, i11 + i14);
                i10 -= blockSize;
                i3 += blockSize;
            }
        }
        System.arraycopy(bArr, i3, this.buf, this.bufOff, i10);
        this.bufOff += i10;
        return i14;
    }

    public PaddedBufferedBlockCipher(BlockCipher blockCipher, BlockCipherPadding blockCipherPadding) {
        this.cipher = blockCipher;
        this.padding = blockCipherPadding;
        this.buf = new byte[blockCipher.getBlockSize()];
        this.bufOff = 0;
    }
}
