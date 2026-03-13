package org.bouncycastle.crypto;

import com.stub.StubApp;
import java.security.SecureRandom;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CipherKeyGenerator {
    protected SecureRandom random;
    protected int strength;

    public byte[] generateKey() {
        byte[] bArr = new byte[this.strength];
        this.random.nextBytes(bArr);
        return bArr;
    }

    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.random = keyGenerationParameters.getRandom();
        this.strength = (keyGenerationParameters.getStrength() + 7) / 8;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(StubApp.getString2(28307), keyGenerationParameters.getStrength()));
    }
}
