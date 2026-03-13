package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.DerivationParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class MGFParameters implements DerivationParameters {
    byte[] seed;

    public MGFParameters(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public byte[] getSeed() {
        return this.seed;
    }

    public MGFParameters(byte[] bArr, int i3, int i10) {
        byte[] bArr2 = new byte[i10];
        this.seed = bArr2;
        System.arraycopy(bArr, i3, bArr2, 0, i10);
    }
}
