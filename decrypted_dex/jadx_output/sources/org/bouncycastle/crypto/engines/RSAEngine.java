package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RSAEngine implements AsymmetricBlockCipher {
    private RSACoreEngine core;

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        return this.core.getInputBlockSize();
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        return this.core.getOutputBlockSize();
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (this.core == null) {
            this.core = new RSACoreEngine();
        }
        this.core.init(z2, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i3, int i10) {
        RSACoreEngine rSACoreEngine = this.core;
        if (rSACoreEngine != null) {
            return rSACoreEngine.convertOutput(rSACoreEngine.processBlock(rSACoreEngine.convertInput(bArr, i3, i10)));
        }
        throw new IllegalStateException(StubApp.getString2(28735));
    }
}
