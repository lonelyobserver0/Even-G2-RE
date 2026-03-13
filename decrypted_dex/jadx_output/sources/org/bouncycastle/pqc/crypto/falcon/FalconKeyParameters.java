package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class FalconKeyParameters extends AsymmetricKeyParameter {
    private final FalconParameters params;

    public FalconKeyParameters(boolean z2, FalconParameters falconParameters) {
        super(z2);
        this.params = falconParameters;
    }

    public FalconParameters getParameters() {
        return this.params;
    }
}
