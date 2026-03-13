package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.macs.GOST28147Mac;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.ParametersWithUKM;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GOST28147WrapEngine implements Wrapper {
    private GOST28147Engine cipher = new GOST28147Engine();
    private GOST28147Mac mac = new GOST28147Mac();

    @Override // org.bouncycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return StubApp.getString2(28639);
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        ParametersWithUKM parametersWithUKM = (ParametersWithUKM) cipherParameters;
        this.cipher.init(z2, parametersWithUKM.getParameters());
        this.mac.init(new ParametersWithIV(parametersWithUKM.getParameters(), parametersWithUKM.getUKM()));
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i3, int i10) throws InvalidCipherTextException {
        int macSize = i10 - this.mac.getMacSize();
        byte[] bArr2 = new byte[macSize];
        this.cipher.processBlock(bArr, i3, bArr2, 0);
        this.cipher.processBlock(bArr, i3 + 8, bArr2, 8);
        this.cipher.processBlock(bArr, i3 + 16, bArr2, 16);
        this.cipher.processBlock(bArr, i3 + 24, bArr2, 24);
        byte[] bArr3 = new byte[this.mac.getMacSize()];
        this.mac.update(bArr2, 0, macSize);
        this.mac.doFinal(bArr3, 0);
        byte[] bArr4 = new byte[this.mac.getMacSize()];
        System.arraycopy(bArr, (i3 + i10) - 4, bArr4, 0, this.mac.getMacSize());
        if (Arrays.constantTimeAreEqual(bArr3, bArr4)) {
            return bArr2;
        }
        throw new IllegalStateException(StubApp.getString2(28640));
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i3, int i10) {
        this.mac.update(bArr, i3, i10);
        byte[] bArr2 = new byte[this.mac.getMacSize() + i10];
        this.cipher.processBlock(bArr, i3, bArr2, 0);
        this.cipher.processBlock(bArr, i3 + 8, bArr2, 8);
        this.cipher.processBlock(bArr, i3 + 16, bArr2, 16);
        this.cipher.processBlock(bArr, i3 + 24, bArr2, 24);
        this.mac.doFinal(bArr2, i10);
        return bArr2;
    }
}
