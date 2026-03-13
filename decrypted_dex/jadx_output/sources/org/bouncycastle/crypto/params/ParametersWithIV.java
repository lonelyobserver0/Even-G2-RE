package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ParametersWithIV implements CipherParameters {
    private byte[] iv;
    private CipherParameters parameters;

    public ParametersWithIV(CipherParameters cipherParameters, byte[] bArr) {
        this(cipherParameters, bArr, 0, bArr.length);
    }

    public byte[] getIV() {
        return this.iv;
    }

    public CipherParameters getParameters() {
        return this.parameters;
    }

    public ParametersWithIV(CipherParameters cipherParameters, byte[] bArr, int i3, int i10) {
        byte[] bArr2 = new byte[i10];
        this.iv = bArr2;
        this.parameters = cipherParameters;
        System.arraycopy(bArr, i3, bArr2, 0, i10);
    }
}
