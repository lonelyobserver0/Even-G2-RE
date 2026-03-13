package org.bouncycastle.pqc.jcajce.provider.bike;

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
import org.bouncycastle.pqc.crypto.bike.BIKEKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.bike.BIKEKeyPairGenerator;
import org.bouncycastle.pqc.crypto.bike.BIKEParameters;
import org.bouncycastle.pqc.crypto.bike.BIKEPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.bike.BIKEPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.provider.util.SpecUtil;
import org.bouncycastle.pqc.jcajce.spec.BIKEParameterSpec;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BIKEKeyPairGeneratorSpi extends KeyPairGenerator {
    private static Map parameters;
    BIKEKeyPairGenerator engine;
    boolean initialised;
    BIKEKeyGenerationParameters param;
    SecureRandom random;

    static {
        HashMap hashMap = new HashMap();
        parameters = hashMap;
        BIKEParameters bIKEParameters = BIKEParameters.bike128;
        hashMap.put(StubApp.getString2(33956), bIKEParameters);
        Map map = parameters;
        BIKEParameters bIKEParameters2 = BIKEParameters.bike192;
        map.put(StubApp.getString2(33957), bIKEParameters2);
        Map map2 = parameters;
        BIKEParameters bIKEParameters3 = BIKEParameters.bike256;
        map2.put(StubApp.getString2(33958), bIKEParameters3);
        parameters.put(BIKEParameterSpec.bike128.getName(), bIKEParameters);
        parameters.put(BIKEParameterSpec.bike192.getName(), bIKEParameters2);
        parameters.put(BIKEParameterSpec.bike256.getName(), bIKEParameters3);
    }

    public BIKEKeyPairGeneratorSpi() {
        super(StubApp.getString2(34396));
        this.engine = new BIKEKeyPairGenerator();
        this.random = CryptoServicesRegistrar.getSecureRandom();
        this.initialised = false;
    }

    private static String getNameFromParams(AlgorithmParameterSpec algorithmParameterSpec) {
        return algorithmParameterSpec instanceof BIKEParameterSpec ? ((BIKEParameterSpec) algorithmParameterSpec).getName() : Strings.toLowerCase(SpecUtil.getNameFrom(algorithmParameterSpec));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            BIKEKeyGenerationParameters bIKEKeyGenerationParameters = new BIKEKeyGenerationParameters(this.random, BIKEParameters.bike128);
            this.param = bIKEKeyGenerationParameters;
            this.engine.init(bIKEKeyGenerationParameters);
            this.initialised = true;
        }
        AsymmetricCipherKeyPair generateKeyPair = this.engine.generateKeyPair();
        return new KeyPair(new BCBIKEPublicKey((BIKEPublicKeyParameters) generateKeyPair.getPublic()), new BCBIKEPrivateKey((BIKEPrivateKeyParameters) generateKeyPair.getPrivate()));
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
        BIKEKeyGenerationParameters bIKEKeyGenerationParameters = new BIKEKeyGenerationParameters(secureRandom, (BIKEParameters) parameters.get(nameFromParams));
        this.param = bIKEKeyGenerationParameters;
        this.engine.init(bIKEKeyGenerationParameters);
        this.initialised = true;
    }
}
