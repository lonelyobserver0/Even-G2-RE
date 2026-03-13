package org.bouncycastle.pqc.jcajce.provider.dilithium;

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
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumKeyPairGenerator;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.provider.util.SpecUtil;
import org.bouncycastle.pqc.jcajce.spec.DilithiumParameterSpec;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DilithiumKeyPairGeneratorSpi extends KeyPairGenerator {
    private static Map parameters;
    DilithiumKeyPairGenerator engine;
    boolean initialised;
    DilithiumKeyGenerationParameters param;
    SecureRandom random;

    static {
        HashMap hashMap = new HashMap();
        parameters = hashMap;
        hashMap.put(DilithiumParameterSpec.dilithium2.getName(), DilithiumParameters.dilithium2);
        parameters.put(DilithiumParameterSpec.dilithium3.getName(), DilithiumParameters.dilithium3);
        parameters.put(DilithiumParameterSpec.dilithium5.getName(), DilithiumParameters.dilithium5);
        parameters.put(DilithiumParameterSpec.dilithium2_aes.getName(), DilithiumParameters.dilithium2_aes);
        parameters.put(DilithiumParameterSpec.dilithium3_aes.getName(), DilithiumParameters.dilithium3_aes);
        parameters.put(DilithiumParameterSpec.dilithium5_aes.getName(), DilithiumParameters.dilithium5_aes);
    }

    public DilithiumKeyPairGeneratorSpi() {
        super(StubApp.getString2(34407));
        this.engine = new DilithiumKeyPairGenerator();
        this.random = CryptoServicesRegistrar.getSecureRandom();
        this.initialised = false;
    }

    private static String getNameFromParams(AlgorithmParameterSpec algorithmParameterSpec) {
        return algorithmParameterSpec instanceof DilithiumParameterSpec ? ((DilithiumParameterSpec) algorithmParameterSpec).getName() : Strings.toLowerCase(SpecUtil.getNameFrom(algorithmParameterSpec));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            DilithiumKeyGenerationParameters dilithiumKeyGenerationParameters = new DilithiumKeyGenerationParameters(this.random, DilithiumParameters.dilithium3);
            this.param = dilithiumKeyGenerationParameters;
            this.engine.init(dilithiumKeyGenerationParameters);
            this.initialised = true;
        }
        AsymmetricCipherKeyPair generateKeyPair = this.engine.generateKeyPair();
        return new KeyPair(new BCDilithiumPublicKey((DilithiumPublicKeyParameters) generateKeyPair.getPublic()), new BCDilithiumPrivateKey((DilithiumPrivateKeyParameters) generateKeyPair.getPrivate()));
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
        DilithiumKeyGenerationParameters dilithiumKeyGenerationParameters = new DilithiumKeyGenerationParameters(secureRandom, (DilithiumParameters) parameters.get(getNameFromParams(algorithmParameterSpec)));
        this.param = dilithiumKeyGenerationParameters;
        this.engine.init(dilithiumKeyGenerationParameters);
        this.initialised = true;
    }
}
