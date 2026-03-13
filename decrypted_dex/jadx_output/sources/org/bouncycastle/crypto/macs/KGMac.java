package org.bouncycastle.crypto.macs;

import com.stub.StubApp;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.modes.KGCMBlockCipher;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KGMac implements Mac {
    private final KGCMBlockCipher cipher;
    private final int macSizeBits;

    public KGMac(KGCMBlockCipher kGCMBlockCipher) {
        this.cipher = kGCMBlockCipher;
        this.macSizeBits = kGCMBlockCipher.getUnderlyingCipher().getBlockSize() * 8;
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
        return this.cipher.getUnderlyingCipher().getAlgorithmName() + StubApp.getString2(29038);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.macSizeBits / 8;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException(StubApp.getString2(29039));
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

    public KGMac(KGCMBlockCipher kGCMBlockCipher, int i3) {
        this.cipher = kGCMBlockCipher;
        this.macSizeBits = i3;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i3, int i10) throws DataLengthException, IllegalStateException {
        this.cipher.processAADBytes(bArr, i3, i10);
    }
}
