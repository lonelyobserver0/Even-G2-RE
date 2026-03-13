package org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CMCEKeyParameters extends AsymmetricKeyParameter {
    private CMCEParameters params;

    public CMCEKeyParameters(boolean z2, CMCEParameters cMCEParameters) {
        super(z2);
        this.params = cMCEParameters;
    }

    public CMCEParameters getParameters() {
        return this.params;
    }
}
