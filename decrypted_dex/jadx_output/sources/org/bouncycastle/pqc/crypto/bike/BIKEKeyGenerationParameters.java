package org.bouncycastle.pqc.crypto.bike;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BIKEKeyGenerationParameters extends KeyGenerationParameters {
    private BIKEParameters params;

    public BIKEKeyGenerationParameters(SecureRandom secureRandom, BIKEParameters bIKEParameters) {
        super(secureRandom, 256);
        this.params = bIKEParameters;
    }

    public BIKEParameters getParameters() {
        return this.params;
    }
}
