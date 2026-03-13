package org.bouncycastle.pqc.jcajce.provider.hqc;

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
import org.bouncycastle.pqc.crypto.hqc.HQCKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.hqc.HQCKeyPairGenerator;
import org.bouncycastle.pqc.crypto.hqc.HQCParameters;
import org.bouncycastle.pqc.crypto.hqc.HQCPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.hqc.HQCPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.provider.util.SpecUtil;
import org.bouncycastle.pqc.jcajce.spec.HQCParameterSpec;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class HQCKeyPairGeneratorSpi extends KeyPairGenerator {
    private static Map parameters;
    HQCKeyPairGenerator engine;
    boolean initialised;
    HQCKeyGenerationParameters param;
    SecureRandom random;

    static {
        HashMap hashMap = new HashMap();
        parameters = hashMap;
        HQCParameters hQCParameters = HQCParameters.hqc128;
        hashMap.put(StubApp.getString2(34020), hQCParameters);
        Map map = parameters;
        HQCParameters hQCParameters2 = HQCParameters.hqc192;
        map.put(StubApp.getString2(34021), hQCParameters2);
        Map map2 = parameters;
        HQCParameters hQCParameters3 = HQCParameters.hqc256;
        map2.put(StubApp.getString2(34022), hQCParameters3);
        parameters.put(HQCParameterSpec.hqc128.getName(), hQCParameters);
        parameters.put(HQCParameterSpec.hqc192.getName(), hQCParameters2);
        parameters.put(HQCParameterSpec.hqc256.getName(), hQCParameters3);
    }

    public HQCKeyPairGeneratorSpi() {
        super(StubApp.getString2(34398));
        this.engine = new HQCKeyPairGenerator();
        this.random = CryptoServicesRegistrar.getSecureRandom();
        this.initialised = false;
    }

    private static String getNameFromParams(AlgorithmParameterSpec algorithmParameterSpec) {
        return algorithmParameterSpec instanceof HQCParameterSpec ? ((HQCParameterSpec) algorithmParameterSpec).getName() : Strings.toLowerCase(SpecUtil.getNameFrom(algorithmParameterSpec));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            HQCKeyGenerationParameters hQCKeyGenerationParameters = new HQCKeyGenerationParameters(this.random, HQCParameters.hqc128);
            this.param = hQCKeyGenerationParameters;
            this.engine.init(hQCKeyGenerationParameters);
            this.initialised = true;
        }
        AsymmetricCipherKeyPair generateKeyPair = this.engine.generateKeyPair();
        return new KeyPair(new BCHQCPublicKey((HQCPublicKeyParameters) generateKeyPair.getPublic()), new BCHQCPrivateKey((HQCPrivateKeyParameters) generateKeyPair.getPrivate()));
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
        HQCKeyGenerationParameters hQCKeyGenerationParameters = new HQCKeyGenerationParameters(secureRandom, (HQCParameters) parameters.get(nameFromParams));
        this.param = hQCKeyGenerationParameters;
        this.engine.init(hQCKeyGenerationParameters);
        this.initialised = true;
    }
}
