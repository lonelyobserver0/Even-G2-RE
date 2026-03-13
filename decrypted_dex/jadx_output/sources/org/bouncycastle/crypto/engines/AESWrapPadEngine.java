package org.bouncycastle.crypto.engines;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class AESWrapPadEngine extends RFC5649WrapEngine {
    public AESWrapPadEngine() {
        super(new AESEngine());
    }
}
