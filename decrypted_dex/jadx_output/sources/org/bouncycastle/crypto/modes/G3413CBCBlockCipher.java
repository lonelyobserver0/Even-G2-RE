package org.bouncycastle.crypto.modes;

import com.stub.StubApp;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class G3413CBCBlockCipher implements BlockCipher {

    /* renamed from: R, reason: collision with root package name */
    private byte[] f19021R;
    private byte[] R_init;
    private int blockSize;
    private BlockCipher cipher;
    private boolean forEncryption;
    private boolean initialized = false;

    /* renamed from: m, reason: collision with root package name */
    private int f19022m;

    public G3413CBCBlockCipher(BlockCipher blockCipher) {
        this.blockSize = blockCipher.getBlockSize();
        this.cipher = blockCipher;
    }

    private int decrypt(byte[] bArr, int i3, byte[] bArr2, int i10) {
        byte[] MSB = GOST3413CipherUtil.MSB(this.f19021R, this.blockSize);
        byte[] copyFromInput = GOST3413CipherUtil.copyFromInput(bArr, this.blockSize, i3);
        byte[] bArr3 = new byte[copyFromInput.length];
        this.cipher.processBlock(copyFromInput, 0, bArr3, 0);
        byte[] sum = GOST3413CipherUtil.sum(bArr3, MSB);
        System.arraycopy(sum, 0, bArr2, i10, sum.length);
        if (bArr2.length > i10 + sum.length) {
            generateR(copyFromInput);
        }
        return sum.length;
    }

    private int encrypt(byte[] bArr, int i3, byte[] bArr2, int i10) {
        byte[] sum = GOST3413CipherUtil.sum(GOST3413CipherUtil.copyFromInput(bArr, this.blockSize, i3), GOST3413CipherUtil.MSB(this.f19021R, this.blockSize));
        int length = sum.length;
        byte[] bArr3 = new byte[length];
        this.cipher.processBlock(sum, 0, bArr3, 0);
        System.arraycopy(bArr3, 0, bArr2, i10, length);
        if (bArr2.length > i10 + sum.length) {
            generateR(bArr3);
        }
        return length;
    }

    private void generateR(byte[] bArr) {
        byte[] LSB = GOST3413CipherUtil.LSB(this.f19021R, this.f19022m - this.blockSize);
        System.arraycopy(LSB, 0, this.f19021R, 0, LSB.length);
        System.arraycopy(bArr, 0, this.f19021R, LSB.length, this.f19022m - LSB.length);
    }

    private void initArrays() {
        int i3 = this.f19022m;
        this.f19021R = new byte[i3];
        this.R_init = new byte[i3];
    }

    private void setupDefaultParams() {
        this.f19022m = this.blockSize;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + StubApp.getString2(29064);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        BlockCipher blockCipher;
        this.forEncryption = z2;
        if (!(cipherParameters instanceof ParametersWithIV)) {
            setupDefaultParams();
            initArrays();
            byte[] bArr = this.R_init;
            System.arraycopy(bArr, 0, this.f19021R, 0, bArr.length);
            if (cipherParameters != null) {
                blockCipher = this.cipher;
                blockCipher.init(z2, cipherParameters);
            }
            this.initialized = true;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        if (iv.length < this.blockSize) {
            throw new IllegalArgumentException(StubApp.getString2(29102));
        }
        this.f19022m = iv.length;
        initArrays();
        byte[] clone = Arrays.clone(iv);
        this.R_init = clone;
        System.arraycopy(clone, 0, this.f19021R, 0, clone.length);
        if (parametersWithIV.getParameters() != null) {
            blockCipher = this.cipher;
            cipherParameters = parametersWithIV.getParameters();
            blockCipher.init(z2, cipherParameters);
        }
        this.initialized = true;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i3, byte[] bArr2, int i10) throws DataLengthException, IllegalStateException {
        return this.forEncryption ? encrypt(bArr, i3, bArr2, i10) : decrypt(bArr, i3, bArr2, i10);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        if (this.initialized) {
            byte[] bArr = this.R_init;
            System.arraycopy(bArr, 0, this.f19021R, 0, bArr.length);
            this.cipher.reset();
        }
    }
}
