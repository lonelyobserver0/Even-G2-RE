package org.bouncycastle.pqc.legacy.crypto.rainbow;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RainbowKeyGenerationParameters extends KeyGenerationParameters {
    private RainbowParameters params;

    public RainbowKeyGenerationParameters(SecureRandom secureRandom, RainbowParameters rainbowParameters) {
        super(secureRandom, rainbowParameters.getVi()[rainbowParameters.getVi().length - 1] - rainbowParameters.getVi()[0]);
        this.params = rainbowParameters;
    }

    public RainbowParameters getParameters() {
        return this.params;
    }
}
