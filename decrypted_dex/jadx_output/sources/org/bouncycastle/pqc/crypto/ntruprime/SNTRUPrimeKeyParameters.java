package org.bouncycastle.pqc.crypto.ntruprime;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SNTRUPrimeKeyParameters extends AsymmetricKeyParameter {
    private final SNTRUPrimeParameters params;

    public SNTRUPrimeKeyParameters(boolean z2, SNTRUPrimeParameters sNTRUPrimeParameters) {
        super(z2);
        this.params = sNTRUPrimeParameters;
    }

    public SNTRUPrimeParameters getParameters() {
        return this.params;
    }
}
