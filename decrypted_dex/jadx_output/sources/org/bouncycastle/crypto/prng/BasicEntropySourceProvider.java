package org.bouncycastle.crypto.prng;

import java.security.SecureRandom;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BasicEntropySourceProvider implements EntropySourceProvider {
    private final boolean _predictionResistant;
    private final SecureRandom _sr;

    public BasicEntropySourceProvider(SecureRandom secureRandom, boolean z2) {
        this._sr = secureRandom;
        this._predictionResistant = z2;
    }

    @Override // org.bouncycastle.crypto.prng.EntropySourceProvider
    public EntropySource get(final int i3) {
        return new EntropySource() { // from class: org.bouncycastle.crypto.prng.BasicEntropySourceProvider.1
            @Override // org.bouncycastle.crypto.prng.EntropySource
            public int entropySize() {
                return i3;
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public byte[] getEntropy() {
                if (!(BasicEntropySourceProvider.this._sr instanceof SP800SecureRandom) && !(BasicEntropySourceProvider.this._sr instanceof X931SecureRandom)) {
                    return BasicEntropySourceProvider.this._sr.generateSeed((i3 + 7) / 8);
                }
                byte[] bArr = new byte[(i3 + 7) / 8];
                BasicEntropySourceProvider.this._sr.nextBytes(bArr);
                return bArr;
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public boolean isPredictionResistant() {
                return BasicEntropySourceProvider.this._predictionResistant;
            }
        };
    }
}
