package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.DerivationParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ISO18033KDFParameters implements DerivationParameters {
    byte[] seed;

    public ISO18033KDFParameters(byte[] bArr) {
        this.seed = bArr;
    }

    public byte[] getSeed() {
        return this.seed;
    }
}
