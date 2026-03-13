package org.bouncycastle.pqc.jcajce.provider.falcon;

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
import org.bouncycastle.pqc.crypto.falcon.FalconKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconKeyPairGenerator;
import org.bouncycastle.pqc.crypto.falcon.FalconParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.provider.util.SpecUtil;
import org.bouncycastle.pqc.jcajce.spec.FalconParameterSpec;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class FalconKeyPairGeneratorSpi extends KeyPairGenerator {
    private static Map parameters;
    FalconKeyPairGenerator engine;
    boolean initialised;
    FalconKeyGenerationParameters param;
    SecureRandom random;

    static {
        HashMap hashMap = new HashMap();
        parameters = hashMap;
        hashMap.put(FalconParameterSpec.falcon_512.getName(), FalconParameters.falcon_512);
        parameters.put(FalconParameterSpec.falcon_1024.getName(), FalconParameters.falcon_1024);
    }

    public FalconKeyPairGeneratorSpi() {
        super(StubApp.getString2(34405));
        this.engine = new FalconKeyPairGenerator();
        this.random = CryptoServicesRegistrar.getSecureRandom();
        this.initialised = false;
    }

    private static String getNameFromParams(AlgorithmParameterSpec algorithmParameterSpec) {
        return algorithmParameterSpec instanceof FalconParameterSpec ? ((FalconParameterSpec) algorithmParameterSpec).getName() : Strings.toLowerCase(SpecUtil.getNameFrom(algorithmParameterSpec));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            FalconKeyGenerationParameters falconKeyGenerationParameters = new FalconKeyGenerationParameters(this.random, FalconParameters.falcon_512);
            this.param = falconKeyGenerationParameters;
            this.engine.init(falconKeyGenerationParameters);
            this.initialised = true;
        }
        AsymmetricCipherKeyPair generateKeyPair = this.engine.generateKeyPair();
        return new KeyPair(new BCFalconPublicKey((FalconPublicKeyParameters) generateKeyPair.getPublic()), new BCFalconPrivateKey((FalconPrivateKeyParameters) generateKeyPair.getPrivate()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i3, SecureRandom secureRandom) {
        throw new IllegalArgumentException(StubApp.getString2(34638));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        String nameFromParams = getNameFromParams(algorithmParameterSpec);
        if (nameFromParams == null) {
            throw new InvalidAlgorithmParameterException(StubApp.getString2(34639) + algorithmParameterSpec);
        }
        FalconKeyGenerationParameters falconKeyGenerationParameters = new FalconKeyGenerationParameters(secureRandom, (FalconParameters) parameters.get(nameFromParams));
        this.param = falconKeyGenerationParameters;
        this.engine.init(falconKeyGenerationParameters);
        this.initialised = true;
    }
}
