package org.bouncycastle.pqc.jcajce.provider.rainbow;

import com.stub.StubApp;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.pqc.jcajce.spec.RainbowParameterSpec;
import org.bouncycastle.pqc.legacy.crypto.rainbow.RainbowKeyGenerationParameters;
import org.bouncycastle.pqc.legacy.crypto.rainbow.RainbowKeyPairGenerator;
import org.bouncycastle.pqc.legacy.crypto.rainbow.RainbowParameters;
import org.bouncycastle.pqc.legacy.crypto.rainbow.RainbowPrivateKeyParameters;
import org.bouncycastle.pqc.legacy.crypto.rainbow.RainbowPublicKeyParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RainbowKeyPairGeneratorSpi extends KeyPairGenerator {
    RainbowKeyPairGenerator engine;
    boolean initialised;
    RainbowKeyGenerationParameters param;
    SecureRandom random;
    int strength;

    public RainbowKeyPairGeneratorSpi() {
        super(StubApp.getString2(34552));
        this.engine = new RainbowKeyPairGenerator();
        this.strength = 1024;
        this.random = CryptoServicesRegistrar.getSecureRandom();
        this.initialised = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            RainbowKeyGenerationParameters rainbowKeyGenerationParameters = new RainbowKeyGenerationParameters(this.random, new RainbowParameters(new RainbowParameterSpec().getVi()));
            this.param = rainbowKeyGenerationParameters;
            this.engine.init(rainbowKeyGenerationParameters);
            this.initialised = true;
        }
        AsymmetricCipherKeyPair generateKeyPair = this.engine.generateKeyPair();
        return new KeyPair(new BCRainbowPublicKey((RainbowPublicKeyParameters) generateKeyPair.getPublic()), new BCRainbowPrivateKey((RainbowPrivateKeyParameters) generateKeyPair.getPrivate()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i3, SecureRandom secureRandom) {
        this.strength = i3;
        this.random = secureRandom;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof RainbowParameterSpec)) {
            throw new InvalidAlgorithmParameterException(StubApp.getString2(34705));
        }
        RainbowKeyGenerationParameters rainbowKeyGenerationParameters = new RainbowKeyGenerationParameters(secureRandom, new RainbowParameters(((RainbowParameterSpec) algorithmParameterSpec).getVi()));
        this.param = rainbowKeyGenerationParameters;
        this.engine.init(rainbowKeyGenerationParameters);
        this.initialised = true;
    }
}
