package org.bouncycastle.crypto.agreement;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECPoint;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ECDHBasicAgreement implements BasicAgreement {
    private ECPrivateKeyParameters key;

    @Override // org.bouncycastle.crypto.BasicAgreement
    public BigInteger calculateAgreement(CipherParameters cipherParameters) {
        ECPublicKeyParameters eCPublicKeyParameters = (ECPublicKeyParameters) cipherParameters;
        ECDomainParameters parameters = this.key.getParameters();
        if (!parameters.equals(eCPublicKeyParameters.getParameters())) {
            throw new IllegalStateException(StubApp.getString2(28367));
        }
        BigInteger d8 = this.key.getD();
        ECPoint cleanPoint = ECAlgorithms.cleanPoint(parameters.getCurve(), eCPublicKeyParameters.getQ());
        if (cleanPoint.isInfinity()) {
            throw new IllegalStateException(StubApp.getString2(28366));
        }
        BigInteger h2 = parameters.getH();
        if (!h2.equals(ECConstants.ONE)) {
            d8 = parameters.getHInv().multiply(d8).mod(parameters.getN());
            cleanPoint = ECAlgorithms.referenceMultiply(cleanPoint, h2);
        }
        ECPoint normalize = cleanPoint.multiply(d8).normalize();
        if (normalize.isInfinity()) {
            throw new IllegalStateException(StubApp.getString2(28365));
        }
        return normalize.getAffineXCoord().toBigInteger();
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public int getFieldSize() {
        return (this.key.getParameters().getCurve().getFieldSize() + 7) / 8;
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public void init(CipherParameters cipherParameters) {
        ECPrivateKeyParameters eCPrivateKeyParameters = (ECPrivateKeyParameters) cipherParameters;
        this.key = eCPrivateKeyParameters;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(StubApp.getString2(28368), eCPrivateKeyParameters));
    }
}
