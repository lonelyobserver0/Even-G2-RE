package org.bouncycastle.pqc.jcajce.provider.sike;

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
import org.bouncycastle.pqc.crypto.sike.SIKEKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.sike.SIKEKeyPairGenerator;
import org.bouncycastle.pqc.crypto.sike.SIKEParameters;
import org.bouncycastle.pqc.crypto.sike.SIKEPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.sike.SIKEPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.provider.util.SpecUtil;
import org.bouncycastle.pqc.jcajce.spec.SIKEParameterSpec;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SIKEKeyPairGeneratorSpi extends KeyPairGenerator {
    private static Map parameters;
    SIKEKeyPairGenerator engine;
    boolean initialised;
    SIKEKeyGenerationParameters param;
    SecureRandom random;

    static {
        HashMap hashMap = new HashMap();
        parameters = hashMap;
        hashMap.put(SIKEParameterSpec.sikep434.getName(), SIKEParameters.sikep434);
        parameters.put(SIKEParameterSpec.sikep503.getName(), SIKEParameters.sikep503);
        parameters.put(SIKEParameterSpec.sikep610.getName(), SIKEParameters.sikep610);
        parameters.put(SIKEParameterSpec.sikep751.getName(), SIKEParameters.sikep751);
        parameters.put(SIKEParameterSpec.sikep434_compressed.getName(), SIKEParameters.sikep434_compressed);
        parameters.put(SIKEParameterSpec.sikep503_compressed.getName(), SIKEParameters.sikep503_compressed);
        parameters.put(SIKEParameterSpec.sikep610_compressed.getName(), SIKEParameters.sikep610_compressed);
        parameters.put(SIKEParameterSpec.sikep751_compressed.getName(), SIKEParameters.sikep751_compressed);
    }

    public SIKEKeyPairGeneratorSpi() {
        super(StubApp.getString2(34574));
        this.engine = new SIKEKeyPairGenerator();
        this.random = CryptoServicesRegistrar.getSecureRandom();
        this.initialised = false;
    }

    private static String getNameFromParams(AlgorithmParameterSpec algorithmParameterSpec) {
        return algorithmParameterSpec instanceof SIKEParameterSpec ? ((SIKEParameterSpec) algorithmParameterSpec).getName() : Strings.toLowerCase(SpecUtil.getNameFrom(algorithmParameterSpec));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            SIKEKeyGenerationParameters sIKEKeyGenerationParameters = new SIKEKeyGenerationParameters(this.random, SIKEParameters.sikep751);
            this.param = sIKEKeyGenerationParameters;
            this.engine.init(sIKEKeyGenerationParameters);
            this.initialised = true;
        }
        AsymmetricCipherKeyPair generateKeyPair = this.engine.generateKeyPair();
        return new KeyPair(new BCSIKEPublicKey((SIKEPublicKeyParameters) generateKeyPair.getPublic()), new BCSIKEPrivateKey((SIKEPrivateKeyParameters) generateKeyPair.getPrivate()));
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
        SIKEKeyGenerationParameters sIKEKeyGenerationParameters = new SIKEKeyGenerationParameters(secureRandom, (SIKEParameters) parameters.get(nameFromParams));
        this.param = sIKEKeyGenerationParameters;
        this.engine.init(sIKEKeyGenerationParameters);
        this.initialised = true;
    }
}
