package org.bouncycastle.crypto.ec;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ECFixedTransform implements ECPairFactorTransform {

    /* renamed from: k, reason: collision with root package name */
    private BigInteger f18896k;
    private ECPublicKeyParameters key;

    public ECFixedTransform(BigInteger bigInteger) {
        this.f18896k = bigInteger;
    }

    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.bouncycastle.crypto.ec.ECPairFactorTransform
    public BigInteger getTransformValue() {
        return this.f18896k;
    }

    @Override // org.bouncycastle.crypto.ec.ECPairTransform
    public void init(CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ECPublicKeyParameters)) {
            throw new IllegalArgumentException(StubApp.getString2(28531));
        }
        this.key = (ECPublicKeyParameters) cipherParameters;
    }

    @Override // org.bouncycastle.crypto.ec.ECPairTransform
    public ECPair transform(ECPair eCPair) {
        ECPublicKeyParameters eCPublicKeyParameters = this.key;
        if (eCPublicKeyParameters == null) {
            throw new IllegalStateException(StubApp.getString2(28532));
        }
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        BigInteger n10 = parameters.getN();
        ECMultiplier createBasePointMultiplier = createBasePointMultiplier();
        BigInteger mod = this.f18896k.mod(n10);
        ECPoint[] eCPointArr = {createBasePointMultiplier.multiply(parameters.getG(), mod).add(ECAlgorithms.cleanPoint(parameters.getCurve(), eCPair.getX())), this.key.getQ().multiply(mod).add(ECAlgorithms.cleanPoint(parameters.getCurve(), eCPair.getY()))};
        parameters.getCurve().normalizeAll(eCPointArr);
        return new ECPair(eCPointArr[0], eCPointArr[1]);
    }
}
