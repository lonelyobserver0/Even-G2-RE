package org.bouncycastle.pqc.crypto.cmce;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CMCEKeyGenerationParameters extends KeyGenerationParameters {
    private CMCEParameters params;

    public CMCEKeyGenerationParameters(SecureRandom secureRandom, CMCEParameters cMCEParameters) {
        super(secureRandom, 256);
        this.params = cMCEParameters;
    }

    public CMCEParameters getParameters() {
        return this.params;
    }
}
