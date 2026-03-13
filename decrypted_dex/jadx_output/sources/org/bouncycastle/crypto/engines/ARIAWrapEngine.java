package org.bouncycastle.crypto.engines;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ARIAWrapEngine extends RFC3394WrapEngine {
    public ARIAWrapEngine() {
        super(new ARIAEngine());
    }

    public ARIAWrapEngine(boolean z2) {
        super(new ARIAEngine(), z2);
    }
}
