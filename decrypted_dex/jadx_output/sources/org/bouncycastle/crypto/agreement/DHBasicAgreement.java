package org.bouncycastle.crypto.agreement;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DHBasicAgreement implements BasicAgreement {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private DHParameters dhParams;
    private DHPrivateKeyParameters key;

    @Override // org.bouncycastle.crypto.BasicAgreement
    public BigInteger calculateAgreement(CipherParameters cipherParameters) {
        DHPublicKeyParameters dHPublicKeyParameters = (DHPublicKeyParameters) cipherParameters;
        if (!dHPublicKeyParameters.getParameters().equals(this.dhParams)) {
            throw new IllegalArgumentException(StubApp.getString2(28347));
        }
        BigInteger p8 = this.dhParams.getP();
        BigInteger y10 = dHPublicKeyParameters.getY();
        if (y10 != null) {
            BigInteger bigInteger = ONE;
            if (y10.compareTo(bigInteger) > 0 && y10.compareTo(p8.subtract(bigInteger)) < 0) {
                BigInteger modPow = y10.modPow(this.key.getX(), p8);
                if (modPow.equals(bigInteger)) {
                    throw new IllegalStateException(StubApp.getString2(28345));
                }
                return modPow;
            }
        }
        throw new IllegalArgumentException(StubApp.getString2(28346));
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public int getFieldSize() {
        return (this.key.getParameters().getP().bitLength() + 7) / 8;
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public void init(CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        AsymmetricKeyParameter asymmetricKeyParameter = (AsymmetricKeyParameter) cipherParameters;
        if (!(asymmetricKeyParameter instanceof DHPrivateKeyParameters)) {
            throw new IllegalArgumentException(StubApp.getString2(28349));
        }
        DHPrivateKeyParameters dHPrivateKeyParameters = (DHPrivateKeyParameters) asymmetricKeyParameter;
        this.key = dHPrivateKeyParameters;
        this.dhParams = dHPrivateKeyParameters.getParameters();
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(StubApp.getString2(28350), this.key));
    }
}
