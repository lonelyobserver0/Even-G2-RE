package org.bouncycastle.pqc.crypto.sike;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SIKEKeyGenerationParameters extends KeyGenerationParameters {
    private SIKEParameters params;

    public SIKEKeyGenerationParameters(SecureRandom secureRandom, SIKEParameters sIKEParameters) {
        super(secureRandom, 256);
        this.params = sIKEParameters;
    }

    public SIKEParameters getParameters() {
        return this.params;
    }
}
