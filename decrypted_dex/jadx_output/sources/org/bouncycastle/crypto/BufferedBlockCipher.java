package org.bouncycastle.crypto;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BufferedBlockCipher {
    protected byte[] buf;
    protected int bufOff;
    protected BlockCipher cipher;
    protected boolean forEncryption;
    protected MultiBlockCipher mbCipher;
    protected boolean partialBlockOkay;
    protected boolean pgpCFB;

    public BufferedBlockCipher() {
    }

    public int doFinal(byte[] bArr, int i3) throws DataLengthException, IllegalStateException, InvalidCipherTextException {
        try {
            int i10 = this.bufOff;
            if (i3 + i10 > bArr.length) {
                throw new OutputLengthException(StubApp.getString2("28305"));
            }
            int i11 = 0;
            if (i10 != 0) {
                if (!this.partialBlockOkay) {
                    throw new DataLengthException(StubApp.getString2("28304"));
                }
                BlockCipher blockCipher = this.cipher;
                byte[] bArr2 = this.buf;
                blockCipher.processBlock(bArr2, 0, bArr2, 0);
                int i12 = this.bufOff;
                this.bufOff = 0;
                System.arraycopy(this.buf, 0, bArr, i3, i12);
                i11 = i12;
            }
            reset();
            return i11;
        } catch (Throwable th) {
            reset();
            throw th;
        }
    }

    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    public int getOutputSize(int i3) {
        if (!this.pgpCFB || !this.forEncryption) {
            return i3 + this.bufOff;
        }
        return this.cipher.getBlockSize() + 2 + i3 + this.bufOff;
    }

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    public int getUpdateOutputSize(int i3) {
        int length;
        int i10;
        int i11 = i3 + this.bufOff;
        if (!this.pgpCFB) {
            length = this.buf.length;
        } else {
            if (this.forEncryption) {
                i10 = (i11 % this.buf.length) - (this.cipher.getBlockSize() + 2);
                return i11 - i10;
            }
            length = this.buf.length;
        }
        i10 = i11 % length;
        return i11 - i10;
    }

    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        this.forEncryption = z2;
        reset();
        this.cipher.init(z2, cipherParameters);
    }

    public int processByte(byte b2, byte[] bArr, int i3) throws DataLengthException, IllegalStateException {
        byte[] bArr2 = this.buf;
        int i10 = this.bufOff;
        int i11 = i10 + 1;
        this.bufOff = i11;
        bArr2[i10] = b2;
        if (i11 != bArr2.length) {
            return 0;
        }
        int processBlock = this.cipher.processBlock(bArr2, 0, bArr, i3);
        this.bufOff = 0;
        return processBlock;
    }

    public int processBytes(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) throws DataLengthException, IllegalStateException {
        int i12;
        int i13;
        int i14;
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
        int i15 = this.bufOff;
        int i16 = length - i15;
        if (i10 > i16) {
            System.arraycopy(bArr, i3, bArr3, i15, i16);
            i14 = this.cipher.processBlock(this.buf, 0, bArr2, i11);
            this.bufOff = 0;
            i13 = i10 - i16;
            i12 = i3 + i16;
            MultiBlockCipher multiBlockCipher = this.mbCipher;
            if (multiBlockCipher != null) {
                int multiBlockSize = i13 / multiBlockCipher.getMultiBlockSize();
                if (multiBlockSize > 0) {
                    i14 += this.mbCipher.processBlocks(bArr, i12, multiBlockSize, bArr2, i11 + i14);
                    int multiBlockSize2 = this.mbCipher.getMultiBlockSize() * multiBlockSize;
                    i13 -= multiBlockSize2;
                    i12 += multiBlockSize2;
                }
            } else {
                while (i13 > this.buf.length) {
                    i14 += this.cipher.processBlock(bArr, i12, bArr2, i11 + i14);
                    i13 -= blockSize;
                    i12 += blockSize;
                }
            }
        } else {
            i12 = i3;
            i13 = i10;
            i14 = 0;
        }
        System.arraycopy(bArr, i12, this.buf, this.bufOff, i13);
        int i17 = this.bufOff + i13;
        this.bufOff = i17;
        byte[] bArr4 = this.buf;
        if (i17 != bArr4.length) {
            return i14;
        }
        int processBlock = this.cipher.processBlock(bArr4, 0, bArr2, i11 + i14) + i14;
        this.bufOff = 0;
        return processBlock;
    }

    public void reset() {
        int i3 = 0;
        while (true) {
            byte[] bArr = this.buf;
            if (i3 >= bArr.length) {
                this.bufOff = 0;
                this.cipher.reset();
                return;
            } else {
                bArr[i3] = 0;
                i3++;
            }
        }
    }

    public BufferedBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        if (blockCipher instanceof MultiBlockCipher) {
            MultiBlockCipher multiBlockCipher = (MultiBlockCipher) blockCipher;
            this.mbCipher = multiBlockCipher;
            this.buf = new byte[multiBlockCipher.getMultiBlockSize()];
        } else {
            this.mbCipher = null;
            this.buf = new byte[blockCipher.getBlockSize()];
        }
        boolean z2 = false;
        this.bufOff = 0;
        String algorithmName = blockCipher.getAlgorithmName();
        int indexOf = algorithmName.indexOf(47) + 1;
        boolean z10 = indexOf > 0 && algorithmName.startsWith(StubApp.getString2(28302), indexOf);
        this.pgpCFB = z10;
        if (z10 || (blockCipher instanceof StreamCipher)) {
            this.partialBlockOkay = true;
            return;
        }
        if (indexOf > 0 && algorithmName.startsWith(StubApp.getString2(28303), indexOf)) {
            z2 = true;
        }
        this.partialBlockOkay = z2;
    }
}
