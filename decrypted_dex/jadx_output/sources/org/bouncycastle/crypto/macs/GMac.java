package org.bouncycastle.crypto.macs;

import com.stub.StubApp;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GMac implements Mac {
    private final GCMBlockCipher cipher;
    private final int macSizeBits;

    public GMac(GCMBlockCipher gCMBlockCipher) {
        this.cipher = gCMBlockCipher;
        this.macSizeBits = 128;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i3) throws DataLengthException, IllegalStateException {
        try {
            return this.cipher.doFinal(bArr, i3);
        } catch (InvalidCipherTextException e10) {
            throw new IllegalStateException(e10.toString());
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return this.cipher.getUnderlyingCipher().getAlgorithmName() + StubApp.getString2(29029);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.macSizeBits / 8;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException(StubApp.getString2(29030));
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        this.cipher.init(true, new AEADParameters((KeyParameter) parametersWithIV.getParameters(), this.macSizeBits, iv));
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        this.cipher.reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b2) throws IllegalStateException {
        this.cipher.processAADByte(b2);
    }

    public GMac(GCMBlockCipher gCMBlockCipher, int i3) {
        this.cipher = gCMBlockCipher;
        this.macSizeBits = i3;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i3, int i10) throws DataLengthException, IllegalStateException {
        this.cipher.processAADBytes(bArr, i3, i10);
    }
}
