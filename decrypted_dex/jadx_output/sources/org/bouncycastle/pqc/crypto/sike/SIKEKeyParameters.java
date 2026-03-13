package org.bouncycastle.pqc.crypto.sike;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SIKEKeyParameters extends AsymmetricKeyParameter {
    private SIKEParameters params;

    public SIKEKeyParameters(boolean z2, SIKEParameters sIKEParameters) {
        super(z2);
        this.params = sIKEParameters;
    }

    public SIKEParameters getParameters() {
        return this.params;
    }
}
