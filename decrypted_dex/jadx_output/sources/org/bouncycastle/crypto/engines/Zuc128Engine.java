package org.bouncycastle.crypto.engines;

import org.bouncycastle.util.Memoable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class Zuc128Engine extends Zuc128CoreEngine {
    public Zuc128Engine() {
    }

    @Override // org.bouncycastle.crypto.engines.Zuc128CoreEngine, org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new Zuc128Engine(this);
    }

    private Zuc128Engine(Zuc128Engine zuc128Engine) {
        super(zuc128Engine);
    }
}
