package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class NullEngine implements BlockCipher {
    protected static final int DEFAULT_BLOCK_SIZE = 1;
    private final int blockSize;
    private boolean initialised;

    public NullEngine() {
        this(1);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return StubApp.getString2(28711);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        this.initialised = true;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i3, byte[] bArr2, int i10) throws DataLengthException, IllegalStateException {
        if (!this.initialised) {
            throw new IllegalStateException(StubApp.getString2(28712));
        }
        int i11 = this.blockSize;
        if (i3 + i11 > bArr.length) {
            throw new DataLengthException(StubApp.getString2(28553));
        }
        if (i11 + i10 > bArr2.length) {
            throw new OutputLengthException(StubApp.getString2(28306));
        }
        int i12 = 0;
        while (true) {
            int i13 = this.blockSize;
            if (i12 >= i13) {
                return i13;
            }
            bArr2[i10 + i12] = bArr[i3 + i12];
            i12++;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    public NullEngine(int i3) {
        this.blockSize = i3;
    }
}
