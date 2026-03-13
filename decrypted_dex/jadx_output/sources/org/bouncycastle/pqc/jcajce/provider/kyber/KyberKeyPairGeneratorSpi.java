package org.bouncycastle.pqc.jcajce.provider.kyber;

import com.stub.StubApp;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberKeyPairGenerator;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.provider.util.SpecUtil;
import org.bouncycastle.pqc.jcajce.spec.KyberParameterSpec;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KyberKeyPairGeneratorSpi extends KeyPairGenerator {
    private static Map parameters;
    KyberKeyPairGenerator engine;
    boolean initialised;
    KyberKeyGenerationParameters param;
    SecureRandom random;

    static {
        HashMap hashMap = new HashMap();
        parameters = hashMap;
        hashMap.put(KyberParameterSpec.kyber512.getName(), KyberParameters.kyber512);
        parameters.put(KyberParameterSpec.kyber768.getName(), KyberParameters.kyber768);
        parameters.put(KyberParameterSpec.kyber1024.getName(), KyberParameters.kyber1024);
        parameters.put(KyberParameterSpec.kyber512_aes.getName(), KyberParameters.kyber512_aes);
        parameters.put(KyberParameterSpec.kyber768_aes.getName(), KyberParameters.kyber768_aes);
        parameters.put(KyberParameterSpec.kyber1024_aes.getName(), KyberParameters.kyber1024_aes);
    }

    public KyberKeyPairGeneratorSpi() {
        super(StubApp.getString2(34406));
        this.engine = new KyberKeyPairGenerator();
        this.random = CryptoServicesRegistrar.getSecureRandom();
        this.initialised = false;
    }

    private static String getNameFromParams(AlgorithmParameterSpec algorithmParameterSpec) {
        return algorithmParameterSpec instanceof KyberParameterSpec ? ((KyberParameterSpec) algorithmParameterSpec).getName() : Strings.toLowerCase(SpecUtil.getNameFrom(algorithmParameterSpec));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            KyberKeyGenerationParameters kyberKeyGenerationParameters = new KyberKeyGenerationParameters(this.random, KyberParameters.kyber1024);
            this.param = kyberKeyGenerationParameters;
            this.engine.init(kyberKeyGenerationParameters);
            this.initialised = true;
        }
        AsymmetricCipherKeyPair generateKeyPair = this.engine.generateKeyPair();
        return new KeyPair(new BCKyberPublicKey((KyberPublicKeyParameters) generateKeyPair.getPublic()), new BCKyberPrivateKey((KyberPrivateKeyParameters) generateKeyPair.getPrivate()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i3, SecureRandom secureRandom) {
        throw new IllegalArgumentException(StubApp.getString2(34638));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (getNameFromParams(algorithmParameterSpec) == null) {
            throw new InvalidAlgorithmParameterException(StubApp.getString2(34639) + algorithmParameterSpec);
        }
        KyberKeyGenerationParameters kyberKeyGenerationParameters = new KyberKeyGenerationParameters(secureRandom, (KyberParameters) parameters.get(getNameFromParams(algorithmParameterSpec)));
        this.param = kyberKeyGenerationParameters;
        this.engine.init(kyberKeyGenerationParameters);
        this.initialised = true;
    }
}
