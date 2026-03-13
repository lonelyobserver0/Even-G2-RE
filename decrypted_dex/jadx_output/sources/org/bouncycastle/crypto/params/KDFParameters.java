package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.DerivationParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KDFParameters implements DerivationParameters {
    byte[] iv;
    byte[] shared;

    public KDFParameters(byte[] bArr, byte[] bArr2) {
        this.shared = bArr;
        this.iv = bArr2;
    }

    public byte[] getIV() {
        return this.iv;
    }

    public byte[] getSharedSecret() {
        return this.shared;
    }
}
