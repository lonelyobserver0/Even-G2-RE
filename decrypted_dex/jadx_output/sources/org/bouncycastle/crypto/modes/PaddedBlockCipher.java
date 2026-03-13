package org.bouncycastle.crypto.modes;

import com.stub.StubApp;
import kotlin.UByte;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PaddedBlockCipher extends BufferedBlockCipher {
    public PaddedBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        this.buf = new byte[blockCipher.getBlockSize()];
        this.bufOff = 0;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i3) throws DataLengthException, IllegalStateException, InvalidCipherTextException {
        int i10;
        int i11;
        int blockSize = this.cipher.getBlockSize();
        if (this.forEncryption) {
            if (this.bufOff != blockSize) {
                i11 = 0;
            } else {
                if ((blockSize * 2) + i3 > bArr.length) {
                    throw new OutputLengthException(StubApp.getString2(28306));
                }
                i11 = this.cipher.processBlock(this.buf, 0, bArr, i3);
                this.bufOff = 0;
            }
            byte b2 = (byte) (blockSize - this.bufOff);
            while (true) {
                int i12 = this.bufOff;
                if (i12 >= blockSize) {
                    break;
                }
                this.buf[i12] = b2;
                this.bufOff = i12 + 1;
            }
            i10 = this.cipher.processBlock(this.buf, 0, bArr, i3 + i11) + i11;
        } else {
            if (this.bufOff != blockSize) {
                throw new DataLengthException(StubApp.getString2(29166));
            }
            BlockCipher blockCipher = this.cipher;
            byte[] bArr2 = this.buf;
            int processBlock = blockCipher.processBlock(bArr2, 0, bArr2, 0);
            this.bufOff = 0;
            byte[] bArr3 = this.buf;
            int i13 = bArr3[blockSize - 1] & UByte.MAX_VALUE;
            if (i13 > blockSize) {
                throw new InvalidCipherTextException(StubApp.getString2(29165));
            }
            int i14 = processBlock - i13;
            System.arraycopy(bArr3, 0, bArr, i3, i14);
            i10 = i14;
        }
        reset();
        return i10;
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
        return length == 0 ? i10 - bArr.length : i10 - length;
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
}
