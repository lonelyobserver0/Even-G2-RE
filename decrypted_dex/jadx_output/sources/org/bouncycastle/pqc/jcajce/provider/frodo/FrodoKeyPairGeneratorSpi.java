package org.bouncycastle.pqc.jcajce.provider.frodo;

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
import org.bouncycastle.pqc.crypto.frodo.FrodoKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.frodo.FrodoKeyPairGenerator;
import org.bouncycastle.pqc.crypto.frodo.FrodoParameters;
import org.bouncycastle.pqc.crypto.frodo.FrodoPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.frodo.FrodoPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.provider.util.SpecUtil;
import org.bouncycastle.pqc.jcajce.spec.FrodoParameterSpec;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class FrodoKeyPairGeneratorSpi extends KeyPairGenerator {
    private static Map parameters;
    FrodoKeyPairGenerator engine;
    boolean initialised;
    FrodoKeyGenerationParameters param;
    SecureRandom random;

    static {
        HashMap hashMap = new HashMap();
        parameters = hashMap;
        FrodoParameters frodoParameters = FrodoParameters.frodokem640aes;
        hashMap.put(StubApp.getString2(34646), frodoParameters);
        Map map = parameters;
        FrodoParameters frodoParameters2 = FrodoParameters.frodokem640shake;
        map.put(StubApp.getString2(34647), frodoParameters2);
        Map map2 = parameters;
        FrodoParameters frodoParameters3 = FrodoParameters.frodokem976aes;
        map2.put(StubApp.getString2(34648), frodoParameters3);
        Map map3 = parameters;
        FrodoParameters frodoParameters4 = FrodoParameters.frodokem976shake;
        map3.put(StubApp.getString2(34649), frodoParameters4);
        Map map4 = parameters;
        FrodoParameters frodoParameters5 = FrodoParameters.frodokem1344aes;
        map4.put(StubApp.getString2(34650), frodoParameters5);
        Map map5 = parameters;
        FrodoParameters frodoParameters6 = FrodoParameters.frodokem1344shake;
        map5.put(StubApp.getString2(34651), frodoParameters6);
        parameters.put(FrodoParameterSpec.frodokem640aes.getName(), frodoParameters);
        parameters.put(FrodoParameterSpec.frodokem640shake.getName(), frodoParameters2);
        parameters.put(FrodoParameterSpec.frodokem976aes.getName(), frodoParameters3);
        parameters.put(FrodoParameterSpec.frodokem976shake.getName(), frodoParameters4);
        parameters.put(FrodoParameterSpec.frodokem1344aes.getName(), frodoParameters5);
        parameters.put(FrodoParameterSpec.frodokem1344shake.getName(), frodoParameters6);
    }

    public FrodoKeyPairGeneratorSpi() {
        super(StubApp.getString2(34402));
        this.engine = new FrodoKeyPairGenerator();
        this.random = CryptoServicesRegistrar.getSecureRandom();
        this.initialised = false;
    }

    private static String getNameFromParams(AlgorithmParameterSpec algorithmParameterSpec) {
        return algorithmParameterSpec instanceof FrodoParameterSpec ? ((FrodoParameterSpec) algorithmParameterSpec).getName() : Strings.toLowerCase(SpecUtil.getNameFrom(algorithmParameterSpec));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            FrodoKeyGenerationParameters frodoKeyGenerationParameters = new FrodoKeyGenerationParameters(this.random, FrodoParameters.frodokem1344shake);
            this.param = frodoKeyGenerationParameters;
            this.engine.init(frodoKeyGenerationParameters);
            this.initialised = true;
        }
        AsymmetricCipherKeyPair generateKeyPair = this.engine.generateKeyPair();
        return new KeyPair(new BCFrodoPublicKey((FrodoPublicKeyParameters) generateKeyPair.getPublic()), new BCFrodoPrivateKey((FrodoPrivateKeyParameters) generateKeyPair.getPrivate()));
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
        FrodoKeyGenerationParameters frodoKeyGenerationParameters = new FrodoKeyGenerationParameters(secureRandom, (FrodoParameters) parameters.get(nameFromParams));
        this.param = frodoKeyGenerationParameters;
        this.engine.init(frodoKeyGenerationParameters);
        this.initialised = true;
    }
}
