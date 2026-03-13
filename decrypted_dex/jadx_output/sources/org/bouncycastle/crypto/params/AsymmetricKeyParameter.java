package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class AsymmetricKeyParameter implements CipherParameters {
    boolean privateKey;

    public AsymmetricKeyParameter(boolean z2) {
        this.privateKey = z2;
    }

    public boolean isPrivate() {
        return this.privateKey;
    }
}
