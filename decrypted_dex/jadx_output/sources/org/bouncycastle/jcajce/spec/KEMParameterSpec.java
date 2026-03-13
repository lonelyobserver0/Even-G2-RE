package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KEMParameterSpec implements AlgorithmParameterSpec {
    private final String keyAlgorithmName;
    private final int keySizeInBits;

    public KEMParameterSpec(String str) {
        this(str, -1);
    }

    public String getKeyAlgorithmName() {
        return this.keyAlgorithmName;
    }

    public int getKeySizeInBits() {
        return this.keySizeInBits;
    }

    public KEMParameterSpec(String str, int i3) {
        this.keyAlgorithmName = str;
        this.keySizeInBits = i3;
    }
}
