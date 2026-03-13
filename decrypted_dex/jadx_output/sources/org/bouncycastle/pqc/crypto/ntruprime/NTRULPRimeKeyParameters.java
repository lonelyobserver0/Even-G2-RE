package org.bouncycastle.pqc.crypto.ntruprime;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class NTRULPRimeKeyParameters extends AsymmetricKeyParameter {
    private final NTRULPRimeParameters params;

    public NTRULPRimeKeyParameters(boolean z2, NTRULPRimeParameters nTRULPRimeParameters) {
        super(z2);
        this.params = nTRULPRimeParameters;
    }

    public NTRULPRimeParameters getParameters() {
        return this.params;
    }
}
