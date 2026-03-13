package org.bouncycastle.crypto;

import java.security.SecureRandom;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KeyGenerationParameters {
    private SecureRandom random;
    private int strength;

    public KeyGenerationParameters(SecureRandom secureRandom, int i3) {
        this.random = CryptoServicesRegistrar.getSecureRandom(secureRandom);
        this.strength = i3;
    }

    public SecureRandom getRandom() {
        return this.random;
    }

    public int getStrength() {
        return this.strength;
    }
}
