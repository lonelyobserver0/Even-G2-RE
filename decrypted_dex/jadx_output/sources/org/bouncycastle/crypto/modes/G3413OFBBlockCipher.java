package org.bouncycastle.crypto.modes;

import com.stub.StubApp;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class G3413OFBBlockCipher extends StreamBlockCipher {

    /* renamed from: R, reason: collision with root package name */
    private byte[] f19027R;
    private byte[] R_init;

    /* renamed from: Y, reason: collision with root package name */
    private byte[] f19028Y;
    private int blockSize;
    private int byteCount;
    private BlockCipher cipher;
    private boolean initialized;

    /* renamed from: m, reason: collision with root package name */
    private int f19029m;

    public G3413OFBBlockCipher(BlockCipher blockCipher) {
        super(blockCipher);
        this.initialized = false;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.cipher = blockCipher;
        this.f19028Y = new byte[blockSize];
    }

    private void generateR() {
        byte[] LSB = GOST3413CipherUtil.LSB(this.f19027R, this.f19029m - this.blockSize);
        System.arraycopy(LSB, 0, this.f19027R, 0, LSB.length);
        System.arraycopy(this.f19028Y, 0, this.f19027R, LSB.length, this.f19029m - LSB.length);
    }

    private void generateY() {
        this.cipher.processBlock(GOST3413CipherUtil.MSB(this.f19027R, this.blockSize), 0, this.f19028Y, 0);
    }

    private void initArrays() {
        int i3 = this.f19029m;
        this.f19027R = new byte[i3];
        this.R_init = new byte[i3];
    }

    private void setupDefaultParams() {
        this.f19029m = this.blockSize * 2;
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b2) {
        if (this.byteCount == 0) {
            generateY();
        }
        byte[] bArr = this.f19028Y;
        int i3 = this.byteCount;
        byte b10 = (byte) (b2 ^ bArr[i3]);
        int i10 = i3 + 1;
        this.byteCount = i10;
        if (i10 == getBlockSize()) {
            this.byteCount = 0;
            generateR();
        }
        return b10;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + StubApp.getString2(29106);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        BlockCipher blockCipher;
        if (!(cipherParameters instanceof ParametersWithIV)) {
            setupDefaultParams();
            initArrays();
            byte[] bArr = this.R_init;
            System.arraycopy(bArr, 0, this.f19027R, 0, bArr.length);
            if (cipherParameters != null) {
                blockCipher = this.cipher;
                blockCipher.init(true, cipherParameters);
            }
            this.initialized = true;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        if (iv.length < this.blockSize) {
            throw new IllegalArgumentException(StubApp.getString2(29102));
        }
        this.f19029m = iv.length;
        initArrays();
        byte[] clone = Arrays.clone(iv);
        this.R_init = clone;
        System.arraycopy(clone, 0, this.f19027R, 0, clone.length);
        if (parametersWithIV.getParameters() != null) {
            blockCipher = this.cipher;
            cipherParameters = parametersWithIV.getParameters();
            blockCipher.init(true, cipherParameters);
        }
        this.initialized = true;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i3, byte[] bArr2, int i10) throws DataLengthException, IllegalStateException {
        processBytes(bArr, i3, this.blockSize, bArr2, i10);
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        if (this.initialized) {
            byte[] bArr = this.R_init;
            System.arraycopy(bArr, 0, this.f19027R, 0, bArr.length);
            Arrays.clear(this.f19028Y);
            this.byteCount = 0;
            this.cipher.reset();
        }
    }
}
