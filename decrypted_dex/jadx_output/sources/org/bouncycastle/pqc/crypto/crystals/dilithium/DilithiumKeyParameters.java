package org.bouncycastle.pqc.crypto.crystals.dilithium;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DilithiumKeyParameters extends AsymmetricKeyParameter {
    private final DilithiumParameters params;

    public DilithiumKeyParameters(boolean z2, DilithiumParameters dilithiumParameters) {
        super(z2);
        this.params = dilithiumParameters;
    }

    public DilithiumParameters getParameters() {
        return this.params;
    }
}
