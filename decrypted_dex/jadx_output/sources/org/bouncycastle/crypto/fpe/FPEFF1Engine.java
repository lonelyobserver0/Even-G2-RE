package org.bouncycastle.crypto.fpe;

import com.stub.StubApp;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.params.FPEParameters;
import org.bouncycastle.util.Properties;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class FPEFF1Engine extends FPEEngine {
    public FPEFF1Engine() {
        this(new AESEngine());
    }

    @Override // org.bouncycastle.crypto.fpe.FPEEngine
    public int decryptBlock(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) {
        int i12;
        byte[] decryptFF1;
        if (this.fpeParameters.getRadix() > 256) {
            decryptFF1 = FPEEngine.toByteArray(SP80038G.decryptFF1w(this.baseCipher, this.fpeParameters.getRadixConverter(), this.fpeParameters.getTweak(), FPEEngine.toShortArray(bArr), i3, i10 / 2));
            i12 = i10;
        } else {
            i12 = i10;
            decryptFF1 = SP80038G.decryptFF1(this.baseCipher, this.fpeParameters.getRadixConverter(), this.fpeParameters.getTweak(), bArr, i3, i12);
        }
        System.arraycopy(decryptFF1, 0, bArr2, i11, i12);
        return i12;
    }

    @Override // org.bouncycastle.crypto.fpe.FPEEngine
    public int encryptBlock(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) {
        int i12;
        byte[] encryptFF1;
        if (this.fpeParameters.getRadix() > 256) {
            encryptFF1 = FPEEngine.toByteArray(SP80038G.encryptFF1w(this.baseCipher, this.fpeParameters.getRadixConverter(), this.fpeParameters.getTweak(), FPEEngine.toShortArray(bArr), i3, i10 / 2));
            i12 = i10;
        } else {
            i12 = i10;
            encryptFF1 = SP80038G.encryptFF1(this.baseCipher, this.fpeParameters.getRadixConverter(), this.fpeParameters.getTweak(), bArr, i3, i12);
        }
        System.arraycopy(encryptFF1, 0, bArr2, i11, i12);
        return i12;
    }

    @Override // org.bouncycastle.crypto.fpe.FPEEngine
    public String getAlgorithmName() {
        return StubApp.getString2(28871);
    }

    @Override // org.bouncycastle.crypto.fpe.FPEEngine
    public void init(boolean z2, CipherParameters cipherParameters) {
        this.forEncryption = z2;
        this.fpeParameters = (FPEParameters) cipherParameters;
        this.baseCipher.init(!r3.isUsingInverseFunction(), this.fpeParameters.getKey());
    }

    public FPEFF1Engine(BlockCipher blockCipher) {
        super(blockCipher);
        if (blockCipher.getBlockSize() != 16) {
            throw new IllegalArgumentException(StubApp.getString2(28870));
        }
        if (Properties.isOverrideSet(StubApp.getString2(28867)) || Properties.isOverrideSet(StubApp.getString2(28868))) {
            throw new UnsupportedOperationException(StubApp.getString2(28869));
        }
    }
}
