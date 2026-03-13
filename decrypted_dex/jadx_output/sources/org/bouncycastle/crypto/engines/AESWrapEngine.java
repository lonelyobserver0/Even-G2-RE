package org.bouncycastle.crypto.engines;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class AESWrapEngine extends RFC3394WrapEngine {
    public AESWrapEngine() {
        super(new AESEngine());
    }

    public AESWrapEngine(boolean z2) {
        super(new AESEngine(), z2);
    }
}
