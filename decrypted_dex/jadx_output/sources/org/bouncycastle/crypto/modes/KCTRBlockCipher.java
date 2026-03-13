package org.bouncycastle.crypto.modes;

import com.stub.StubApp;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KCTRBlockCipher extends StreamBlockCipher {
    private int byteCount;
    private BlockCipher engine;
    private boolean initialised;
    private byte[] iv;
    private byte[] ofbOutV;
    private byte[] ofbV;

    public KCTRBlockCipher(BlockCipher blockCipher) {
        super(blockCipher);
        this.engine = blockCipher;
        this.iv = new byte[blockCipher.getBlockSize()];
        this.ofbV = new byte[blockCipher.getBlockSize()];
        this.ofbOutV = new byte[blockCipher.getBlockSize()];
    }

    private void checkCounter() {
    }

    private void incrementCounterAt(int i3) {
        while (true) {
            byte[] bArr = this.ofbV;
            if (i3 >= bArr.length) {
                return;
            }
            int i10 = i3 + 1;
            byte b2 = (byte) (bArr[i3] + 1);
            bArr[i3] = b2;
            if (b2 != 0) {
                return;
            } else {
                i3 = i10;
            }
        }
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b2) {
        int i3 = this.byteCount;
        if (i3 == 0) {
            incrementCounterAt(0);
            checkCounter();
            this.engine.processBlock(this.ofbV, 0, this.ofbOutV, 0);
            byte[] bArr = this.ofbOutV;
            int i10 = this.byteCount;
            this.byteCount = i10 + 1;
            return (byte) (b2 ^ bArr[i10]);
        }
        byte[] bArr2 = this.ofbOutV;
        int i11 = i3 + 1;
        this.byteCount = i11;
        byte b10 = (byte) (b2 ^ bArr2[i3]);
        if (i11 == this.ofbV.length) {
            this.byteCount = 0;
        }
        return b10;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.engine.getAlgorithmName() + StubApp.getString2(29140);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.engine.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        this.initialised = true;
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException(StubApp.getString2(29141));
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        byte[] bArr = this.iv;
        int length = bArr.length - iv.length;
        Arrays.fill(bArr, (byte) 0);
        System.arraycopy(iv, 0, this.iv, length, iv.length);
        CipherParameters parameters = parametersWithIV.getParameters();
        if (parameters != null) {
            this.engine.init(true, parameters);
        }
        reset();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i3, byte[] bArr2, int i10) throws DataLengthException, IllegalStateException {
        if (bArr.length - i3 < getBlockSize()) {
            throw new DataLengthException(StubApp.getString2(28553));
        }
        if (bArr2.length - i10 < getBlockSize()) {
            throw new OutputLengthException(StubApp.getString2(28306));
        }
        processBytes(bArr, i3, getBlockSize(), bArr2, i10);
        return getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        if (this.initialised) {
            this.engine.processBlock(this.iv, 0, this.ofbV, 0);
        }
        this.engine.reset();
        this.byteCount = 0;
    }
}
