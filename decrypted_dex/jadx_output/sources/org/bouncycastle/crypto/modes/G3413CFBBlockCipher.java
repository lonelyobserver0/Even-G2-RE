package org.bouncycastle.crypto.modes;

import com.stub.StubApp;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class G3413CFBBlockCipher extends StreamBlockCipher {

    /* renamed from: R, reason: collision with root package name */
    private byte[] f19023R;
    private byte[] R_init;
    private int blockSize;
    private int byteCount;
    private BlockCipher cipher;
    private boolean forEncryption;
    private byte[] gamma;
    private byte[] inBuf;
    private boolean initialized;

    /* renamed from: m, reason: collision with root package name */
    private int f19024m;

    /* renamed from: s, reason: collision with root package name */
    private final int f19025s;

    public G3413CFBBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, blockCipher.getBlockSize() * 8);
    }

    private void initArrays() {
        int i3 = this.f19024m;
        this.f19023R = new byte[i3];
        this.R_init = new byte[i3];
    }

    private void setupDefaultParams() {
        this.f19024m = this.blockSize * 2;
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b2) {
        if (this.byteCount == 0) {
            this.gamma = createGamma();
        }
        byte[] bArr = this.gamma;
        int i3 = this.byteCount;
        byte b10 = (byte) (bArr[i3] ^ b2);
        byte[] bArr2 = this.inBuf;
        int i10 = i3 + 1;
        this.byteCount = i10;
        if (this.forEncryption) {
            b2 = b10;
        }
        bArr2[i3] = b2;
        if (i10 == getBlockSize()) {
            this.byteCount = 0;
            generateR(this.inBuf);
        }
        return b10;
    }

    public byte[] createGamma() {
        byte[] MSB = GOST3413CipherUtil.MSB(this.f19023R, this.blockSize);
        byte[] bArr = new byte[MSB.length];
        this.cipher.processBlock(MSB, 0, bArr, 0);
        return GOST3413CipherUtil.MSB(bArr, this.f19025s);
    }

    public void generateR(byte[] bArr) {
        byte[] LSB = GOST3413CipherUtil.LSB(this.f19023R, this.f19024m - this.f19025s);
        System.arraycopy(LSB, 0, this.f19023R, 0, LSB.length);
        System.arraycopy(bArr, 0, this.f19023R, LSB.length, this.f19024m - LSB.length);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + StubApp.getString2(29042) + (this.blockSize * 8);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.f19025s;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        BlockCipher blockCipher;
        this.forEncryption = z2;
        if (!(cipherParameters instanceof ParametersWithIV)) {
            setupDefaultParams();
            initArrays();
            byte[] bArr = this.R_init;
            System.arraycopy(bArr, 0, this.f19023R, 0, bArr.length);
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
        this.f19024m = iv.length;
        initArrays();
        byte[] clone = Arrays.clone(iv);
        this.R_init = clone;
        System.arraycopy(clone, 0, this.f19023R, 0, clone.length);
        if (parametersWithIV.getParameters() != null) {
            blockCipher = this.cipher;
            cipherParameters = parametersWithIV.getParameters();
            blockCipher.init(true, cipherParameters);
        }
        this.initialized = true;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i3, byte[] bArr2, int i10) throws DataLengthException, IllegalStateException {
        processBytes(bArr, i3, getBlockSize(), bArr2, i10);
        return getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        this.byteCount = 0;
        Arrays.clear(this.inBuf);
        Arrays.clear(this.gamma);
        if (this.initialized) {
            byte[] bArr = this.R_init;
            System.arraycopy(bArr, 0, this.f19023R, 0, bArr.length);
            this.cipher.reset();
        }
    }

    public G3413CFBBlockCipher(BlockCipher blockCipher, int i3) {
        super(blockCipher);
        this.initialized = false;
        if (i3 < 0 || i3 > blockCipher.getBlockSize() * 8) {
            throw new IllegalArgumentException(StubApp.getString2(29103) + (blockCipher.getBlockSize() * 8));
        }
        this.blockSize = blockCipher.getBlockSize();
        this.cipher = blockCipher;
        this.f19025s = i3 / 8;
        this.inBuf = new byte[getBlockSize()];
    }
}
