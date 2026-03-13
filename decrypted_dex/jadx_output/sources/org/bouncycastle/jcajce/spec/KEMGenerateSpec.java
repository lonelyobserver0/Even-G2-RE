package org.bouncycastle.jcajce.spec;

import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KEMGenerateSpec implements AlgorithmParameterSpec {
    private final String keyAlgorithmName;
    private final PublicKey publicKey;

    public KEMGenerateSpec(PublicKey publicKey, String str) {
        this.publicKey = publicKey;
        this.keyAlgorithmName = str;
    }

    public String getKeyAlgorithmName() {
        return this.keyAlgorithmName;
    }

    public PublicKey getPublicKey() {
        return this.publicKey;
    }
}
