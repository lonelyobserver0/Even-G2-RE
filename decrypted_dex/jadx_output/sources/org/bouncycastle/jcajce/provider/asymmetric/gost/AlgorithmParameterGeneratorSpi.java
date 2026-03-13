package org.bouncycastle.jcajce.provider.asymmetric.gost;

import com.stub.StubApp;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.generators.GOST3410ParametersGenerator;
import org.bouncycastle.crypto.params.GOST3410Parameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi;
import org.bouncycastle.jce.spec.GOST3410ParameterSpec;
import org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class AlgorithmParameterGeneratorSpi extends BaseAlgorithmParameterGeneratorSpi {
    protected SecureRandom random;
    protected int strength = 1024;

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public AlgorithmParameters engineGenerateParameters() {
        GOST3410ParametersGenerator gOST3410ParametersGenerator = new GOST3410ParametersGenerator();
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            gOST3410ParametersGenerator.init(this.strength, 2, secureRandom);
        } else {
            gOST3410ParametersGenerator.init(this.strength, 2, CryptoServicesRegistrar.getSecureRandom());
        }
        GOST3410Parameters generateParameters = gOST3410ParametersGenerator.generateParameters();
        try {
            AlgorithmParameters createParametersInstance = createParametersInstance(StubApp.getString2("28165"));
            createParametersInstance.init(new GOST3410ParameterSpec(new GOST3410PublicKeyParameterSetSpec(generateParameters.getP(), generateParameters.getQ(), generateParameters.getA())));
            return createParametersInstance;
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage());
        }
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public void engineInit(int i3, SecureRandom secureRandom) {
        this.strength = i3;
        this.random = secureRandom;
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException(StubApp.getString2(30760));
    }
}
