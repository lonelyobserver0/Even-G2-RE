package org.bouncycastle.crypto.fpe;

import com.stub.StubApp;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.params.FPEParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Properties;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class FPEFF3_1Engine extends FPEEngine {
    public FPEFF3_1Engine() {
        this(new AESEngine());
    }

    @Override // org.bouncycastle.crypto.fpe.FPEEngine
    public int decryptBlock(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) {
        int i12;
        byte[] decryptFF3_1;
        if (this.fpeParameters.getRadix() > 256) {
            decryptFF3_1 = FPEEngine.toByteArray(SP80038G.decryptFF3_1w(this.baseCipher, this.fpeParameters.getRadixConverter(), this.fpeParameters.getTweak(), FPEEngine.toShortArray(bArr), i3, i10 / 2));
            i12 = i10;
        } else {
            i12 = i10;
            decryptFF3_1 = SP80038G.decryptFF3_1(this.baseCipher, this.fpeParameters.getRadixConverter(), this.fpeParameters.getTweak(), bArr, i3, i12);
        }
        System.arraycopy(decryptFF3_1, 0, bArr2, i11, i12);
        return i12;
    }

    @Override // org.bouncycastle.crypto.fpe.FPEEngine
    public int encryptBlock(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) {
        int i12;
        byte[] encryptFF3_1;
        if (this.fpeParameters.getRadix() > 256) {
            encryptFF3_1 = FPEEngine.toByteArray(SP80038G.encryptFF3_1w(this.baseCipher, this.fpeParameters.getRadixConverter(), this.fpeParameters.getTweak(), FPEEngine.toShortArray(bArr), i3, i10 / 2));
            i12 = i10;
        } else {
            i12 = i10;
            encryptFF3_1 = SP80038G.encryptFF3_1(this.baseCipher, this.fpeParameters.getRadixConverter(), this.fpeParameters.getTweak(), bArr, i3, i12);
        }
        System.arraycopy(encryptFF3_1, 0, bArr2, i11, i12);
        return i12;
    }

    @Override // org.bouncycastle.crypto.fpe.FPEEngine
    public String getAlgorithmName() {
        return StubApp.getString2(28873);
    }

    @Override // org.bouncycastle.crypto.fpe.FPEEngine
    public void init(boolean z2, CipherParameters cipherParameters) {
        this.forEncryption = z2;
        this.fpeParameters = (FPEParameters) cipherParameters;
        this.baseCipher.init(!r4.isUsingInverseFunction(), new KeyParameter(Arrays.reverse(this.fpeParameters.getKey().getKey())));
        if (this.fpeParameters.getTweak().length != 7) {
            throw new IllegalArgumentException(StubApp.getString2(28874));
        }
    }

    public FPEFF3_1Engine(BlockCipher blockCipher) {
        super(blockCipher);
        if (blockCipher.getBlockSize() != 16) {
            throw new IllegalArgumentException(StubApp.getString2(28870));
        }
        if (Properties.isOverrideSet(StubApp.getString2(28867))) {
            throw new UnsupportedOperationException(StubApp.getString2(28872));
        }
    }
}
