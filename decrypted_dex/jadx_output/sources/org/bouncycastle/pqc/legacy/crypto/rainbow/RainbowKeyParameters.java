package org.bouncycastle.pqc.legacy.crypto.rainbow;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RainbowKeyParameters extends AsymmetricKeyParameter {
    private int docLength;

    public RainbowKeyParameters(boolean z2, int i3) {
        super(z2);
        this.docLength = i3;
    }

    public int getDocLength() {
        return this.docLength;
    }
}
