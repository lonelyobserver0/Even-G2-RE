package org.bouncycastle.crypto;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BufferedAsymmetricBlockCipher {
    protected byte[] buf;
    protected int bufOff;
    private final AsymmetricBlockCipher cipher;

    public BufferedAsymmetricBlockCipher(AsymmetricBlockCipher asymmetricBlockCipher) {
        this.cipher = asymmetricBlockCipher;
    }

    public byte[] doFinal() throws InvalidCipherTextException {
        byte[] processBlock = this.cipher.processBlock(this.buf, 0, this.bufOff);
        reset();
        return processBlock;
    }

    public int getBufferPosition() {
        return this.bufOff;
    }

    public int getInputBlockSize() {
        return this.cipher.getInputBlockSize();
    }

    public int getOutputBlockSize() {
        return this.cipher.getOutputBlockSize();
    }

    public AsymmetricBlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    public void init(boolean z2, CipherParameters cipherParameters) {
        reset();
        this.cipher.init(z2, cipherParameters);
        this.buf = new byte[this.cipher.getInputBlockSize() + (z2 ? 1 : 0)];
        this.bufOff = 0;
    }

    public void processByte(byte b2) {
        int i3 = this.bufOff;
        byte[] bArr = this.buf;
        if (i3 >= bArr.length) {
            throw new DataLengthException(StubApp.getString2(28300));
        }
        this.bufOff = i3 + 1;
        bArr[i3] = b2;
    }

    public void processBytes(byte[] bArr, int i3, int i10) {
        if (i10 == 0) {
            return;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(28301));
        }
        int i11 = this.bufOff;
        int i12 = i11 + i10;
        byte[] bArr2 = this.buf;
        if (i12 > bArr2.length) {
            throw new DataLengthException(StubApp.getString2(28300));
        }
        System.arraycopy(bArr, i3, bArr2, i11, i10);
        this.bufOff += i10;
    }

    public void reset() {
        if (this.buf != null) {
            int i3 = 0;
            while (true) {
                byte[] bArr = this.buf;
                if (i3 >= bArr.length) {
                    break;
                }
                bArr[i3] = 0;
                i3++;
            }
        }
        this.bufOff = 0;
    }
}
