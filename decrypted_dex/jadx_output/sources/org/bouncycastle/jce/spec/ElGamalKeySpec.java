package org.bouncycastle.jce.spec;

import java.security.spec.KeySpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ElGamalKeySpec implements KeySpec {
    private ElGamalParameterSpec spec;

    public ElGamalKeySpec(ElGamalParameterSpec elGamalParameterSpec) {
        this.spec = elGamalParameterSpec;
    }

    public ElGamalParameterSpec getParams() {
        return this.spec;
    }
}
