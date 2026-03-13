package org.bouncycastle.crypto.engines;

import org.bouncycastle.util.Memoable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class Zuc256Engine extends Zuc256CoreEngine {
    public Zuc256Engine() {
    }

    @Override // org.bouncycastle.crypto.engines.Zuc256CoreEngine, org.bouncycastle.crypto.engines.Zuc128CoreEngine, org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new Zuc256Engine(this);
    }

    public Zuc256Engine(int i3) {
        super(i3);
    }

    private Zuc256Engine(Zuc256Engine zuc256Engine) {
        super(zuc256Engine);
    }
}
