package org.bouncycastle.crypto.modes;

import com.stub.StubApp;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class G3413CTRBlockCipher extends StreamBlockCipher {
    private byte[] CTR;
    private byte[] IV;
    private final int blockSize;
    private byte[] buf;
    private int byteCount;
    private final BlockCipher cipher;
    private boolean initialized;

    /* renamed from: s, reason: collision with root package name */
    private final int f19026s;

    public G3413CTRBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, blockCipher.getBlockSize() * 8);
    }

    private byte[] generateBuf() {
        byte[] bArr = this.CTR;
        byte[] bArr2 = new byte[bArr.length];
        this.cipher.processBlock(bArr, 0, bArr2, 0);
        return GOST3413CipherUtil.MSB(bArr2, this.f19026s);
    }

    private void generateCRT() {
        byte[] bArr = this.CTR;
        int length = bArr.length - 1;
        bArr[length] = (byte) (bArr[length] + 1);
    }

    private void initArrays() {
        int i3 = this.blockSize;
        this.IV = new byte[i3 / 2];
        this.CTR = new byte[i3];
        this.buf = new byte[this.f19026s];
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b2) {
        if (this.byteCount == 0) {
            this.buf = generateBuf();
        }
        byte[] bArr = this.buf;
        int i3 = this.byteCount;
        byte b10 = (byte) (b2 ^ bArr[i3]);
        int i10 = i3 + 1;
        this.byteCount = i10;
        if (i10 == this.f19026s) {
            this.byteCount = 0;
            generateCRT();
        }
        return b10;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + StubApp.getString2(29104);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.f19026s;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        BlockCipher blockCipher;
        if (!(cipherParameters instanceof ParametersWithIV)) {
            initArrays();
            if (cipherParameters != null) {
                blockCipher = this.cipher;
                blockCipher.init(true, cipherParameters);
            }
            this.initialized = true;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        initArrays();
        byte[] clone = Arrays.clone(parametersWithIV.getIV());
        this.IV = clone;
        if (clone.length != this.blockSize / 2) {
            throw new IllegalArgumentException(StubApp.getString2(29105));
        }
        System.arraycopy(clone, 0, this.CTR, 0, clone.length);
        for (int length = this.IV.length; length < this.blockSize; length++) {
            this.CTR[length] = 0;
        }
        if (parametersWithIV.getParameters() != null) {
            blockCipher = this.cipher;
            cipherParameters = parametersWithIV.getParameters();
            blockCipher.init(true, cipherParameters);
        }
        this.initialized = true;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i3, byte[] bArr2, int i10) throws DataLengthException, IllegalStateException {
        processBytes(bArr, i3, this.f19026s, bArr2, i10);
        return this.f19026s;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        if (this.initialized) {
            byte[] bArr = this.IV;
            System.arraycopy(bArr, 0, this.CTR, 0, bArr.length);
            for (int length = this.IV.length; length < this.blockSize; length++) {
                this.CTR[length] = 0;
            }
            this.byteCount = 0;
            this.cipher.reset();
        }
    }

    public G3413CTRBlockCipher(BlockCipher blockCipher, int i3) {
        super(blockCipher);
        this.byteCount = 0;
        if (i3 < 0 || i3 > blockCipher.getBlockSize() * 8) {
            throw new IllegalArgumentException(StubApp.getString2(29103) + (blockCipher.getBlockSize() * 8));
        }
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.f19026s = i3 / 8;
        this.CTR = new byte[blockSize];
    }
}
