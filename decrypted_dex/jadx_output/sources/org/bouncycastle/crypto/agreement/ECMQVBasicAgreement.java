package org.bouncycastle.crypto.agreement;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.MQVPrivateParameters;
import org.bouncycastle.crypto.params.MQVPublicParameters;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Properties;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ECMQVBasicAgreement implements BasicAgreement {
    MQVPrivateParameters privParams;

    private ECPoint calculateMqvAgreement(ECDomainParameters eCDomainParameters, ECPrivateKeyParameters eCPrivateKeyParameters, ECPrivateKeyParameters eCPrivateKeyParameters2, ECPublicKeyParameters eCPublicKeyParameters, ECPublicKeyParameters eCPublicKeyParameters2, ECPublicKeyParameters eCPublicKeyParameters3) {
        BigInteger n10 = eCDomainParameters.getN();
        int bitLength = (n10.bitLength() + 1) / 2;
        BigInteger shiftLeft = ECConstants.ONE.shiftLeft(bitLength);
        ECCurve curve = eCDomainParameters.getCurve();
        ECPoint cleanPoint = ECAlgorithms.cleanPoint(curve, eCPublicKeyParameters.getQ());
        ECPoint cleanPoint2 = ECAlgorithms.cleanPoint(curve, eCPublicKeyParameters2.getQ());
        ECPoint cleanPoint3 = ECAlgorithms.cleanPoint(curve, eCPublicKeyParameters3.getQ());
        BigInteger mod = eCPrivateKeyParameters.getD().multiply(cleanPoint.getAffineXCoord().toBigInteger().mod(shiftLeft).setBit(bitLength)).add(eCPrivateKeyParameters2.getD()).mod(n10);
        BigInteger bit = cleanPoint3.getAffineXCoord().toBigInteger().mod(shiftLeft).setBit(bitLength);
        BigInteger mod2 = eCDomainParameters.getH().multiply(mod).mod(n10);
        return ECAlgorithms.sumOfTwoMultiplies(cleanPoint2, bit.multiply(mod2).mod(n10), cleanPoint3, mod2);
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public BigInteger calculateAgreement(CipherParameters cipherParameters) {
        if (Properties.isOverrideSet(StubApp.getString2(28374))) {
            throw new IllegalStateException(StubApp.getString2(28377));
        }
        MQVPublicParameters mQVPublicParameters = (MQVPublicParameters) cipherParameters;
        ECPrivateKeyParameters staticPrivateKey = this.privParams.getStaticPrivateKey();
        ECDomainParameters parameters = staticPrivateKey.getParameters();
        if (!parameters.equals(mQVPublicParameters.getStaticPublicKey().getParameters())) {
            throw new IllegalStateException(StubApp.getString2(28376));
        }
        ECPoint normalize = calculateMqvAgreement(parameters, staticPrivateKey, this.privParams.getEphemeralPrivateKey(), this.privParams.getEphemeralPublicKey(), mQVPublicParameters.getStaticPublicKey(), mQVPublicParameters.getEphemeralPublicKey()).normalize();
        if (normalize.isInfinity()) {
            throw new IllegalStateException(StubApp.getString2(28375));
        }
        return normalize.getAffineXCoord().toBigInteger();
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public int getFieldSize() {
        return (this.privParams.getStaticPrivateKey().getParameters().getCurve().getFieldSize() + 7) / 8;
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public void init(CipherParameters cipherParameters) {
        MQVPrivateParameters mQVPrivateParameters = (MQVPrivateParameters) cipherParameters;
        this.privParams = mQVPrivateParameters;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(StubApp.getString2(28378), mQVPrivateParameters.getStaticPrivateKey()));
    }
}
