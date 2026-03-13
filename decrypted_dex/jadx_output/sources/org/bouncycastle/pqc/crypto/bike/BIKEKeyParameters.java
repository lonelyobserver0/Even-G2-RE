package org.bouncycastle.pqc.crypto.bike;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BIKEKeyParameters extends AsymmetricKeyParameter {
    private BIKEParameters params;

    public BIKEKeyParameters(boolean z2, BIKEParameters bIKEParameters) {
        super(z2);
        this.params = bIKEParameters;
    }

    public BIKEParameters getParameters() {
        return this.params;
    }
}
