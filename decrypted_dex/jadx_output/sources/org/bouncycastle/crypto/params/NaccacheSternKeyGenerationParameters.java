package org.bouncycastle.crypto.params;

import com.stub.StubApp;
import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class NaccacheSternKeyGenerationParameters extends KeyGenerationParameters {
    private int certainty;
    private int cntSmallPrimes;
    private boolean debug;

    public NaccacheSternKeyGenerationParameters(SecureRandom secureRandom, int i3, int i10, int i11) {
        this(secureRandom, i3, i10, i11, false);
    }

    public int getCertainty() {
        return this.certainty;
    }

    public int getCntSmallPrimes() {
        return this.cntSmallPrimes;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public NaccacheSternKeyGenerationParameters(SecureRandom secureRandom, int i3, int i10, int i11, boolean z2) {
        super(secureRandom, i3);
        this.debug = false;
        this.certainty = i10;
        if (i11 % 2 == 1) {
            throw new IllegalArgumentException(StubApp.getString2(29221));
        }
        if (i11 < 30) {
            throw new IllegalArgumentException(StubApp.getString2(29220));
        }
        this.cntSmallPrimes = i11;
        this.debug = z2;
    }
}
