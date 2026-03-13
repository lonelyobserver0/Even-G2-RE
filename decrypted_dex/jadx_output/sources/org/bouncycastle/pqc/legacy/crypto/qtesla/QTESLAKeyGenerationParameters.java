package org.bouncycastle.pqc.legacy.crypto.qtesla;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class QTESLAKeyGenerationParameters extends KeyGenerationParameters {
    private final int securityCategory;

    public QTESLAKeyGenerationParameters(int i3, SecureRandom secureRandom) {
        super(secureRandom, -1);
        QTESLASecurityCategory.getPrivateSize(i3);
        this.securityCategory = i3;
    }

    public int getSecurityCategory() {
        return this.securityCategory;
    }
}
