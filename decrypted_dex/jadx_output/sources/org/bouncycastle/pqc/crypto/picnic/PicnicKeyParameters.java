package org.bouncycastle.pqc.crypto.picnic;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PicnicKeyParameters extends AsymmetricKeyParameter {
    final PicnicParameters parameters;

    public PicnicKeyParameters(boolean z2, PicnicParameters picnicParameters) {
        super(z2);
        this.parameters = picnicParameters;
    }

    public PicnicParameters getParameters() {
        return this.parameters;
    }
}
