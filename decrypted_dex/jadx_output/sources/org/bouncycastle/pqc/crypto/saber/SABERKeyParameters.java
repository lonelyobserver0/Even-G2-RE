package org.bouncycastle.pqc.crypto.saber;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SABERKeyParameters extends AsymmetricKeyParameter {
    private SABERParameters params;

    public SABERKeyParameters(boolean z2, SABERParameters sABERParameters) {
        super(z2);
        this.params = sABERParameters;
    }

    public SABERParameters getParameters() {
        return this.params;
    }
}
