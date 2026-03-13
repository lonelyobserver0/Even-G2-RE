package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class HQCKeyParameters extends AsymmetricKeyParameter {
    private HQCParameters params;

    public HQCKeyParameters(boolean z2, HQCParameters hQCParameters) {
        super(z2);
        this.params = hQCParameters;
    }

    public HQCParameters getParameters() {
        return this.params;
    }
}
