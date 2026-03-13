package org.bouncycastle.crypto.agreement;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.params.DHMQVPrivateParameters;
import org.bouncycastle.crypto.params.DHMQVPublicParameters;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class MQVBasicAgreement implements BasicAgreement {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    DHMQVPrivateParameters privParams;

    private BigInteger calculateDHMQVAgreement(DHParameters dHParameters, DHPrivateKeyParameters dHPrivateKeyParameters, DHPublicKeyParameters dHPublicKeyParameters, DHPrivateKeyParameters dHPrivateKeyParameters2, DHPublicKeyParameters dHPublicKeyParameters2, DHPublicKeyParameters dHPublicKeyParameters3) {
        BigInteger q10 = dHParameters.getQ();
        BigInteger pow = BigInteger.valueOf(2L).pow((q10.bitLength() + 1) / 2);
        return dHPublicKeyParameters3.getY().multiply(dHPublicKeyParameters.getY().modPow(dHPublicKeyParameters3.getY().mod(pow).add(pow), dHParameters.getP())).modPow(dHPrivateKeyParameters2.getX().add(dHPublicKeyParameters2.getY().mod(pow).add(pow).multiply(dHPrivateKeyParameters.getX())).mod(q10), dHParameters.getP());
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public BigInteger calculateAgreement(CipherParameters cipherParameters) {
        DHMQVPublicParameters dHMQVPublicParameters = (DHMQVPublicParameters) cipherParameters;
        DHPrivateKeyParameters staticPrivateKey = this.privParams.getStaticPrivateKey();
        if (!this.privParams.getStaticPrivateKey().getParameters().equals(dHMQVPublicParameters.getStaticPublicKey().getParameters())) {
            throw new IllegalStateException(StubApp.getString2(28384));
        }
        if (this.privParams.getStaticPrivateKey().getParameters().getQ() == null) {
            throw new IllegalStateException(StubApp.getString2(28383));
        }
        BigInteger calculateDHMQVAgreement = calculateDHMQVAgreement(staticPrivateKey.getParameters(), staticPrivateKey, dHMQVPublicParameters.getStaticPublicKey(), this.privParams.getEphemeralPrivateKey(), this.privParams.getEphemeralPublicKey(), dHMQVPublicParameters.getEphemeralPublicKey());
        if (calculateDHMQVAgreement.equals(ONE)) {
            throw new IllegalStateException(StubApp.getString2(28382));
        }
        return calculateDHMQVAgreement;
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public int getFieldSize() {
        return (this.privParams.getStaticPrivateKey().getParameters().getP().bitLength() + 7) / 8;
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public void init(CipherParameters cipherParameters) {
        DHMQVPrivateParameters dHMQVPrivateParameters = (DHMQVPrivateParameters) cipherParameters;
        this.privParams = dHMQVPrivateParameters;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(StubApp.getString2(28385), dHMQVPrivateParameters.getStaticPrivateKey()));
    }
}
