package org.bouncycastle.jce.spec;

import java.security.spec.AlgorithmParameterSpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ElGamalGenParameterSpec implements AlgorithmParameterSpec {
    private int primeSize;

    public ElGamalGenParameterSpec(int i3) {
        this.primeSize = i3;
    }

    public int getPrimeSize() {
        return this.primeSize;
    }
}
