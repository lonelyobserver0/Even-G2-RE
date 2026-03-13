package org.bouncycastle.crypto.params;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GOST3410KeyParameters extends AsymmetricKeyParameter {
    private GOST3410Parameters params;

    public GOST3410KeyParameters(boolean z2, GOST3410Parameters gOST3410Parameters) {
        super(z2);
        this.params = gOST3410Parameters;
    }

    public GOST3410Parameters getParameters() {
        return this.params;
    }
}
