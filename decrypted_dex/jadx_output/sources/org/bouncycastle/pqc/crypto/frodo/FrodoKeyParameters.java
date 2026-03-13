package org.bouncycastle.pqc.crypto.frodo;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class FrodoKeyParameters extends AsymmetricKeyParameter {
    private FrodoParameters params;

    public FrodoKeyParameters(boolean z2, FrodoParameters frodoParameters) {
        super(z2);
        this.params = frodoParameters;
    }

    public FrodoParameters getParameters() {
        return this.params;
    }
}
