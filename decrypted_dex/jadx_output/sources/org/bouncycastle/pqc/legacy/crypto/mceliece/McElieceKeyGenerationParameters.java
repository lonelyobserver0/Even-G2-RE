package org.bouncycastle.pqc.legacy.crypto.mceliece;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class McElieceKeyGenerationParameters extends KeyGenerationParameters {
    private McElieceParameters params;

    public McElieceKeyGenerationParameters(SecureRandom secureRandom, McElieceParameters mcElieceParameters) {
        super(secureRandom, 256);
        this.params = mcElieceParameters;
    }

    public McElieceParameters getParameters() {
        return this.params;
    }
}
