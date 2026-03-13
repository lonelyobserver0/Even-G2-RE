package org.bouncycastle.crypto.prng;

import java.security.SecureRandom;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class X931SecureRandomBuilder {
    private byte[] dateTimeVector;
    private EntropySourceProvider entropySourceProvider;
    private SecureRandom random;

    public X931SecureRandomBuilder() {
        this(CryptoServicesRegistrar.getSecureRandom(), false);
    }

    public X931SecureRandom build(BlockCipher blockCipher, KeyParameter keyParameter, boolean z2) {
        if (this.dateTimeVector == null) {
            this.dateTimeVector = new byte[blockCipher.getBlockSize()];
            Pack.longToBigEndian(System.currentTimeMillis(), this.dateTimeVector, 0);
        }
        blockCipher.init(true, keyParameter);
        return new X931SecureRandom(this.random, new X931RNG(blockCipher, this.dateTimeVector, this.entropySourceProvider.get(blockCipher.getBlockSize() * 8)), z2);
    }

    public X931SecureRandomBuilder setDateTimeVector(byte[] bArr) {
        this.dateTimeVector = Arrays.clone(bArr);
        return this;
    }

    public X931SecureRandomBuilder(SecureRandom secureRandom, boolean z2) {
        this.random = secureRandom;
        this.entropySourceProvider = new BasicEntropySourceProvider(secureRandom, z2);
    }

    public X931SecureRandomBuilder(EntropySourceProvider entropySourceProvider) {
        this.random = null;
        this.entropySourceProvider = entropySourceProvider;
    }
}
