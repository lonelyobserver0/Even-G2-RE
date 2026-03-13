package org.bouncycastle.jcajce.provider.symmetric.util;

import com.stub.StubApp;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BaseKeyGenerator extends KeyGeneratorSpi {
    protected String algName;
    protected int defaultKeySize;
    protected CipherKeyGenerator engine;
    protected int keySize;
    protected boolean uninitialised = true;

    public BaseKeyGenerator(String str, int i3, CipherKeyGenerator cipherKeyGenerator) {
        this.algName = str;
        this.defaultKeySize = i3;
        this.keySize = i3;
        this.engine = cipherKeyGenerator;
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public SecretKey engineGenerateKey() {
        if (this.uninitialised) {
            this.engine.init(new KeyGenerationParameters(CryptoServicesRegistrar.getSecureRandom(), this.defaultKeySize));
            this.uninitialised = false;
        }
        return new SecretKeySpec(this.engine.generateKey(), this.algName);
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(int i3, SecureRandom secureRandom) {
        if (secureRandom == null) {
            try {
                secureRandom = CryptoServicesRegistrar.getSecureRandom();
            } catch (IllegalArgumentException e10) {
                throw new InvalidParameterException(e10.getMessage());
            }
        }
        this.engine.init(new KeyGenerationParameters(secureRandom, i3));
        this.uninitialised = false;
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(SecureRandom secureRandom) {
        if (secureRandom != null) {
            this.engine.init(new KeyGenerationParameters(secureRandom, this.defaultKeySize));
            this.uninitialised = false;
        }
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException(StubApp.getString2(32409));
    }
}
