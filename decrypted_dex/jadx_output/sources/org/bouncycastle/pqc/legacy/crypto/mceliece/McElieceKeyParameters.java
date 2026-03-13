package org.bouncycastle.pqc.legacy.crypto.mceliece;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class McElieceKeyParameters extends AsymmetricKeyParameter {
    private McElieceParameters params;

    public McElieceKeyParameters(boolean z2, McElieceParameters mcElieceParameters) {
        super(z2);
        this.params = mcElieceParameters;
    }

    public McElieceParameters getParameters() {
        return this.params;
    }
}
