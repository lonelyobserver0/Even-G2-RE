package org.bouncycastle.pqc.legacy.crypto.gmss;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GMSSKeyParameters extends AsymmetricKeyParameter {
    private GMSSParameters params;

    public GMSSKeyParameters(boolean z2, GMSSParameters gMSSParameters) {
        super(z2);
        this.params = gMSSParameters;
    }

    public GMSSParameters getParameters() {
        return this.params;
    }
}
