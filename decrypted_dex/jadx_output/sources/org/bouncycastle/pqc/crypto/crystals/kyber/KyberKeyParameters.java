package org.bouncycastle.pqc.crypto.crystals.kyber;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KyberKeyParameters extends AsymmetricKeyParameter {
    private KyberParameters params;

    public KyberKeyParameters(boolean z2, KyberParameters kyberParameters) {
        super(z2);
        this.params = kyberParameters;
    }

    public KyberParameters getParameters() {
        return this.params;
    }
}
