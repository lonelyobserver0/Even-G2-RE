package org.bouncycastle.pqc.crypto.hqc;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class HQCKeyGenerationParameters extends KeyGenerationParameters {
    private HQCParameters params;

    public HQCKeyGenerationParameters(SecureRandom secureRandom, HQCParameters hQCParameters) {
        super(secureRandom, 256);
        this.params = hQCParameters;
    }

    public HQCParameters getParameters() {
        return this.params;
    }
}
