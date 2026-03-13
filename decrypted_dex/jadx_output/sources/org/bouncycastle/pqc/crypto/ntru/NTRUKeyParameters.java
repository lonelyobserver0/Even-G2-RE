package org.bouncycastle.pqc.crypto.ntru;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class NTRUKeyParameters extends AsymmetricKeyParameter {
    private final NTRUParameters params;

    public NTRUKeyParameters(boolean z2, NTRUParameters nTRUParameters) {
        super(z2);
        this.params = nTRUParameters;
    }

    public NTRUParameters getParameters() {
        return this.params;
    }
}
