package org.bouncycastle.math.ec;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.math.ec.endo.EndoUtil;
import org.bouncycastle.math.ec.endo.GLVEndomorphism;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GLVMultiplier extends AbstractECMultiplier {
    protected final ECCurve curve;
    protected final GLVEndomorphism glvEndomorphism;

    public GLVMultiplier(ECCurve eCCurve, GLVEndomorphism gLVEndomorphism) {
        if (eCCurve == null || eCCurve.getOrder() == null) {
            throw new IllegalArgumentException(StubApp.getString2(32926));
        }
        this.curve = eCCurve;
        this.glvEndomorphism = gLVEndomorphism;
    }

    @Override // org.bouncycastle.math.ec.AbstractECMultiplier
    public ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        if (!this.curve.equals(eCPoint.getCurve())) {
            throw new IllegalStateException();
        }
        BigInteger[] decomposeScalar = this.glvEndomorphism.decomposeScalar(bigInteger.mod(eCPoint.getCurve().getOrder()));
        BigInteger bigInteger2 = decomposeScalar[0];
        BigInteger bigInteger3 = decomposeScalar[1];
        return this.glvEndomorphism.hasEfficientPointMap() ? ECAlgorithms.implShamirsTrickWNaf(this.glvEndomorphism, eCPoint, bigInteger2, bigInteger3) : ECAlgorithms.implShamirsTrickWNaf(eCPoint, bigInteger2, EndoUtil.mapPoint(this.glvEndomorphism, eCPoint), bigInteger3);
    }
}
