package org.bouncycastle.crypto.modes;

import Xa.h;
import com.stub.StubApp;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CFBBlockCipher extends StreamBlockCipher implements CFBModeCipher {
    private byte[] IV;
    private int blockSize;
    private int byteCount;
    private byte[] cfbOutV;
    private byte[] cfbV;
    private BlockCipher cipher;
    private boolean encrypting;
    private byte[] inBuf;

    public CFBBlockCipher(BlockCipher blockCipher, int i3) {
        super(blockCipher);
        this.cipher = null;
        if (i3 > blockCipher.getBlockSize() * 8 || i3 < 8 || i3 % 8 != 0) {
            throw new IllegalArgumentException(h.g(i3, StubApp.getString2(29076), StubApp.getString2(17458)));
        }
        this.cipher = blockCipher;
        this.blockSize = i3 / 8;
        this.IV = new byte[blockCipher.getBlockSize()];
        this.cfbV = new byte[blockCipher.getBlockSize()];
        this.cfbOutV = new byte[blockCipher.getBlockSize()];
        this.inBuf = new byte[this.blockSize];
    }

    private byte decryptByte(byte b2) {
        if (this.byteCount == 0) {
            this.cipher.processBlock(this.cfbV, 0, this.cfbOutV, 0);
        }
        byte[] bArr = this.inBuf;
        int i3 = this.byteCount;
        bArr[i3] = b2;
        byte[] bArr2 = this.cfbOutV;
        int i10 = i3 + 1;
        this.byteCount = i10;
        byte b10 = (byte) (b2 ^ bArr2[i3]);
        int i11 = this.blockSize;
        if (i10 == i11) {
            this.byteCount = 0;
            byte[] bArr3 = this.cfbV;
            System.arraycopy(bArr3, i11, bArr3, 0, bArr3.length - i11);
            byte[] bArr4 = this.inBuf;
            byte[] bArr5 = this.cfbV;
            int length = bArr5.length;
            int i12 = this.blockSize;
            System.arraycopy(bArr4, 0, bArr5, length - i12, i12);
        }
        return b10;
    }

    private byte encryptByte(byte b2) {
        if (this.byteCount == 0) {
            this.cipher.processBlock(this.cfbV, 0, this.cfbOutV, 0);
        }
        byte[] bArr = this.cfbOutV;
        int i3 = this.byteCount;
        byte b10 = (byte) (b2 ^ bArr[i3]);
        byte[] bArr2 = this.inBuf;
        int i10 = i3 + 1;
        this.byteCount = i10;
        bArr2[i3] = b10;
        int i11 = this.blockSize;
        if (i10 == i11) {
            this.byteCount = 0;
            byte[] bArr3 = this.cfbV;
            System.arraycopy(bArr3, i11, bArr3, 0, bArr3.length - i11);
            byte[] bArr4 = this.inBuf;
            byte[] bArr5 = this.cfbV;
            int length = bArr5.length;
            int i12 = this.blockSize;
            System.arraycopy(bArr4, 0, bArr5, length - i12, i12);
        }
        return b10;
    }

    public static CFBModeCipher newInstance(BlockCipher blockCipher, int i3) {
        return new CFBBlockCipher(blockCipher, i3);
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b2) throws DataLengthException, IllegalStateException {
        return this.encrypting ? encryptByte(b2) : decryptByte(b2);
    }

    public int decryptBlock(byte[] bArr, int i3, byte[] bArr2, int i10) throws DataLengthException, IllegalStateException {
        processBytes(bArr, i3, this.blockSize, bArr2, i10);
        return this.blockSize;
    }

    public int encryptBlock(byte[] bArr, int i3, byte[] bArr2, int i10) throws DataLengthException, IllegalStateException {
        processBytes(bArr, i3, this.blockSize, bArr2, i10);
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + StubApp.getString2(29042) + (this.blockSize * 8);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blockSize;
    }

    public byte[] getCurrentIV() {
        return Arrays.clone(this.cfbV);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        BlockCipher blockCipher;
        this.encrypting = z2;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv = parametersWithIV.getIV();
            int length = iv.length;
            byte[] bArr = this.IV;
            if (length < bArr.length) {
                System.arraycopy(iv, 0, bArr, bArr.length - iv.length, iv.length);
                int i3 = 0;
                while (true) {
                    byte[] bArr2 = this.IV;
                    if (i3 >= bArr2.length - iv.length) {
                        break;
                    }
                    bArr2[i3] = 0;
                    i3++;
                }
            } else {
                System.arraycopy(iv, 0, bArr, 0, bArr.length);
            }
            reset();
            if (parametersWithIV.getParameters() == null) {
                return;
            }
            blockCipher = this.cipher;
            cipherParameters = parametersWithIV.getParameters();
        } else {
            reset();
            if (cipherParameters == null) {
                return;
            } else {
                blockCipher = this.cipher;
            }
        }
        blockCipher.init(true, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i3, byte[] bArr2, int i10) throws DataLengthException, IllegalStateException {
        processBytes(bArr, i3, this.blockSize, bArr2, i10);
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        byte[] bArr = this.IV;
        System.arraycopy(bArr, 0, this.cfbV, 0, bArr.length);
        Arrays.fill(this.inBuf, (byte) 0);
        this.byteCount = 0;
        this.cipher.reset();
    }
}
