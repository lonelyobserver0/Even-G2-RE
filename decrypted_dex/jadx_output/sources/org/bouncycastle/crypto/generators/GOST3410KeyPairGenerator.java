package org.bouncycastle.crypto.generators;

import com.stub.StubApp;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.GOST3410KeyGenerationParameters;
import org.bouncycastle.crypto.params.GOST3410Parameters;
import org.bouncycastle.crypto.params.GOST3410PrivateKeyParameters;
import org.bouncycastle.crypto.params.GOST3410PublicKeyParameters;
import org.bouncycastle.math.ec.WNafUtil;
import org.bouncycastle.util.BigIntegers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GOST3410KeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private GOST3410KeyGenerationParameters param;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        GOST3410Parameters parameters = this.param.getParameters();
        SecureRandom random = this.param.getRandom();
        BigInteger q10 = parameters.getQ();
        BigInteger p8 = parameters.getP();
        BigInteger a3 = parameters.getA();
        while (true) {
            BigInteger createRandomBigInteger = BigIntegers.createRandomBigInteger(256, random);
            if (createRandomBigInteger.signum() >= 1 && createRandomBigInteger.compareTo(q10) < 0 && WNafUtil.getNafWeight(createRandomBigInteger) >= 64) {
                return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new GOST3410PublicKeyParameters(a3.modPow(createRandomBigInteger, p8), parameters), (AsymmetricKeyParameter) new GOST3410PrivateKeyParameters(createRandomBigInteger, parameters));
            }
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        GOST3410KeyGenerationParameters gOST3410KeyGenerationParameters = (GOST3410KeyGenerationParameters) keyGenerationParameters;
        this.param = gOST3410KeyGenerationParameters;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(StubApp.getString2(28912), ConstraintUtils.bitsOfSecurityFor(gOST3410KeyGenerationParameters.getParameters().getP()), this.param.getParameters(), CryptoServicePurpose.KEYGEN));
    }
}
