package org.bouncycastle.crypto.ec;

import com.stub.StubApp;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ECElGamalEncryptor implements ECEncryptor {
    private ECPublicKeyParameters key;
    private SecureRandom random;

    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.bouncycastle.crypto.ec.ECEncryptor
    public ECPair encrypt(ECPoint eCPoint) {
        ECPublicKeyParameters eCPublicKeyParameters = this.key;
        if (eCPublicKeyParameters == null) {
            throw new IllegalStateException(StubApp.getString2(28529));
        }
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        BigInteger generateK = ECUtil.generateK(parameters.getN(), this.random);
        ECPoint[] eCPointArr = {createBasePointMultiplier().multiply(parameters.getG(), generateK), this.key.getQ().multiply(generateK).add(ECAlgorithms.cleanPoint(parameters.getCurve(), eCPoint))};
        parameters.getCurve().normalizeAll(eCPointArr);
        return new ECPair(eCPointArr[0], eCPointArr[1]);
    }

    @Override // org.bouncycastle.crypto.ec.ECEncryptor
    public void init(CipherParameters cipherParameters) {
        SecureRandom secureRandom;
        boolean z2 = cipherParameters instanceof ParametersWithRandom;
        String string2 = StubApp.getString2(28530);
        if (z2) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            if (!(parametersWithRandom.getParameters() instanceof ECPublicKeyParameters)) {
                throw new IllegalArgumentException(string2);
            }
            this.key = (ECPublicKeyParameters) parametersWithRandom.getParameters();
            secureRandom = parametersWithRandom.getRandom();
        } else {
            if (!(cipherParameters instanceof ECPublicKeyParameters)) {
                throw new IllegalArgumentException(string2);
            }
            this.key = (ECPublicKeyParameters) cipherParameters;
            secureRandom = CryptoServicesRegistrar.getSecureRandom();
        }
        this.random = secureRandom;
    }
}
