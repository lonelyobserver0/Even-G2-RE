package org.bouncycastle.crypto.generators;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHKeyGenerationParameters;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DHBasicKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private DHKeyGenerationParameters param;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        DHKeyGeneratorHelper dHKeyGeneratorHelper = DHKeyGeneratorHelper.INSTANCE;
        DHParameters parameters = this.param.getParameters();
        BigInteger calculatePrivate = dHKeyGeneratorHelper.calculatePrivate(parameters, this.param.getRandom());
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new DHPublicKeyParameters(dHKeyGeneratorHelper.calculatePublic(parameters, calculatePrivate), parameters), (AsymmetricKeyParameter) new DHPrivateKeyParameters(calculatePrivate, parameters));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        DHKeyGenerationParameters dHKeyGenerationParameters = (DHKeyGenerationParameters) keyGenerationParameters;
        this.param = dHKeyGenerationParameters;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(StubApp.getString2(28898), ConstraintUtils.bitsOfSecurityFor(dHKeyGenerationParameters.getParameters().getP()), this.param.getParameters(), CryptoServicePurpose.KEYGEN));
    }
}
