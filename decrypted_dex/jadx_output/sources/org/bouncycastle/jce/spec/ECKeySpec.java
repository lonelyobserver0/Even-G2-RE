package org.bouncycastle.jce.spec;

import java.security.spec.KeySpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ECKeySpec implements KeySpec {
    private ECParameterSpec spec;

    public ECKeySpec(ECParameterSpec eCParameterSpec) {
        this.spec = eCParameterSpec;
    }

    public ECParameterSpec getParams() {
        return this.spec;
    }
}
