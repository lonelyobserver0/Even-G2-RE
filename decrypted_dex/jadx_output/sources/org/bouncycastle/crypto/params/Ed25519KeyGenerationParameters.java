package org.bouncycastle.crypto.params;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Ed25519KeyGenerationParameters extends KeyGenerationParameters {
    public Ed25519KeyGenerationParameters(SecureRandom secureRandom) {
        super(secureRandom, 256);
    }
}
