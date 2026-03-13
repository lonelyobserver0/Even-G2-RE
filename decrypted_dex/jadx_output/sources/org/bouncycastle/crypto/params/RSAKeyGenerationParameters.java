package org.bouncycastle.crypto.params;

import com.stub.StubApp;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RSAKeyGenerationParameters extends KeyGenerationParameters {
    private int certainty;
    private BigInteger publicExponent;

    public RSAKeyGenerationParameters(BigInteger bigInteger, SecureRandom secureRandom, int i3, int i10) {
        super(secureRandom, i3);
        if (i3 < 12) {
            throw new IllegalArgumentException(StubApp.getString2(29225));
        }
        if (!bigInteger.testBit(0)) {
            throw new IllegalArgumentException(StubApp.getString2(29224));
        }
        this.publicExponent = bigInteger;
        this.certainty = i10;
    }

    public int getCertainty() {
        return this.certainty;
    }

    public BigInteger getPublicExponent() {
        return this.publicExponent;
    }
}
