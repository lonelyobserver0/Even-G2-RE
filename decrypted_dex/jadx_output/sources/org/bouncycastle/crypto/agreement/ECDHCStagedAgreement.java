package org.bouncycastle.crypto.agreement;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.StagedAgreement;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECPoint;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ECDHCStagedAgreement implements StagedAgreement {
    ECPrivateKeyParameters key;

    private ECPoint calculateNextPoint(ECPublicKeyParameters eCPublicKeyParameters) {
        ECDomainParameters parameters = this.key.getParameters();
        if (!parameters.equals(eCPublicKeyParameters.getParameters())) {
            throw new IllegalStateException(StubApp.getString2(28371));
        }
        BigInteger mod = parameters.getH().multiply(this.key.getD()).mod(parameters.getN());
        ECPoint cleanPoint = ECAlgorithms.cleanPoint(parameters.getCurve(), eCPublicKeyParameters.getQ());
        if (cleanPoint.isInfinity()) {
            throw new IllegalStateException(StubApp.getString2(28370));
        }
        ECPoint normalize = cleanPoint.multiply(mod).normalize();
        if (normalize.isInfinity()) {
            throw new IllegalStateException(StubApp.getString2(28369));
        }
        return normalize;
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public BigInteger calculateAgreement(CipherParameters cipherParameters) {
        return calculateNextPoint((ECPublicKeyParameters) cipherParameters).getAffineXCoord().toBigInteger();
    }

    @Override // org.bouncycastle.crypto.StagedAgreement
    public AsymmetricKeyParameter calculateStage(CipherParameters cipherParameters) {
        return new ECPublicKeyParameters(calculateNextPoint((ECPublicKeyParameters) cipherParameters), this.key.getParameters());
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public int getFieldSize() {
        return (this.key.getParameters().getCurve().getFieldSize() + 7) / 8;
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public void init(CipherParameters cipherParameters) {
        ECPrivateKeyParameters eCPrivateKeyParameters = (ECPrivateKeyParameters) cipherParameters;
        this.key = eCPrivateKeyParameters;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(StubApp.getString2(28372), eCPrivateKeyParameters));
    }
}
