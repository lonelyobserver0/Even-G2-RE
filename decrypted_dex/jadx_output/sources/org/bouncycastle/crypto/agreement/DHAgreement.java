package org.bouncycastle.crypto.agreement;

import com.stub.StubApp;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.generators.DHKeyPairGenerator;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHKeyGenerationParameters;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DHAgreement {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private DHParameters dhParams;
    private DHPrivateKeyParameters key;
    private BigInteger privateValue;
    private SecureRandom random;

    public BigInteger calculateAgreement(DHPublicKeyParameters dHPublicKeyParameters, BigInteger bigInteger) {
        if (!dHPublicKeyParameters.getParameters().equals(this.dhParams)) {
            throw new IllegalArgumentException(StubApp.getString2(28347));
        }
        BigInteger p8 = this.dhParams.getP();
        BigInteger y10 = dHPublicKeyParameters.getY();
        if (y10 != null) {
            BigInteger bigInteger2 = ONE;
            if (y10.compareTo(bigInteger2) > 0 && y10.compareTo(p8.subtract(bigInteger2)) < 0) {
                BigInteger modPow = y10.modPow(this.privateValue, p8);
                if (modPow.equals(bigInteger2)) {
                    throw new IllegalStateException(StubApp.getString2(28345));
                }
                return bigInteger.modPow(this.key.getX(), p8).multiply(modPow).mod(p8);
            }
        }
        throw new IllegalArgumentException(StubApp.getString2(28346));
    }

    public BigInteger calculateMessage() {
        DHKeyPairGenerator dHKeyPairGenerator = new DHKeyPairGenerator();
        dHKeyPairGenerator.init(new DHKeyGenerationParameters(this.random, this.dhParams));
        AsymmetricCipherKeyPair generateKeyPair = dHKeyPairGenerator.generateKeyPair();
        this.privateValue = ((DHPrivateKeyParameters) generateKeyPair.getPrivate()).getX();
        return ((DHPublicKeyParameters) generateKeyPair.getPublic()).getY();
    }

    public void init(CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.random = parametersWithRandom.getRandom();
            cipherParameters = parametersWithRandom.getParameters();
        } else {
            this.random = CryptoServicesRegistrar.getSecureRandom();
        }
        AsymmetricKeyParameter asymmetricKeyParameter = (AsymmetricKeyParameter) cipherParameters;
        if (!(asymmetricKeyParameter instanceof DHPrivateKeyParameters)) {
            throw new IllegalArgumentException(StubApp.getString2(28349));
        }
        DHPrivateKeyParameters dHPrivateKeyParameters = (DHPrivateKeyParameters) asymmetricKeyParameter;
        this.key = dHPrivateKeyParameters;
        this.dhParams = dHPrivateKeyParameters.getParameters();
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(StubApp.getString2(28348), this.key));
    }
}
