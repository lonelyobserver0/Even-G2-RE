package org.bouncycastle.pqc.legacy.crypto.mceliece;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class McElieceCCA2KeyParameters extends AsymmetricKeyParameter {
    private String params;

    public McElieceCCA2KeyParameters(boolean z2, String str) {
        super(z2);
        this.params = str;
    }

    public String getDigest() {
        return this.params;
    }
}
