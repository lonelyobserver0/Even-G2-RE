package org.bouncycastle.crypto.params;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DSAKeyParameters extends AsymmetricKeyParameter {
    private DSAParameters params;

    public DSAKeyParameters(boolean z2, DSAParameters dSAParameters) {
        super(z2);
        this.params = dSAParameters;
    }

    public DSAParameters getParameters() {
        return this.params;
    }
}
