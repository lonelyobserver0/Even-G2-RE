package org.bouncycastle.pqc.crypto.falcon;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class FalconKeyGenerationParameters extends KeyGenerationParameters {
    private final FalconParameters params;

    public FalconKeyGenerationParameters(SecureRandom secureRandom, FalconParameters falconParameters) {
        super(secureRandom, DilithiumEngine.DilithiumPolyT1PackedBytes);
        this.params = falconParameters;
    }

    public FalconParameters getParameters() {
        return this.params;
    }
}
