package org.bouncycastle.math.ec;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class WTauNafMultiplier extends AbstractECMultiplier {
    static final String PRECOMP_NAME = StubApp.getString2(32941);

    private static ECPoint.AbstractF2m multiplyFromWTnaf(final ECPoint.AbstractF2m abstractF2m, byte[] bArr) {
        ECCurve.AbstractF2m abstractF2m2 = (ECCurve.AbstractF2m) abstractF2m.getCurve();
        final byte byteValue = abstractF2m2.getA().toBigInteger().byteValue();
        ECPoint.AbstractF2m[] preComp = ((WTauNafPreCompInfo) abstractF2m2.precompute(abstractF2m, StubApp.getString2(32941), new PreCompCallback() { // from class: org.bouncycastle.math.ec.WTauNafMultiplier.1
            @Override // org.bouncycastle.math.ec.PreCompCallback
            public PreCompInfo precompute(PreCompInfo preCompInfo) {
                if (preCompInfo instanceof WTauNafPreCompInfo) {
                    return preCompInfo;
                }
                WTauNafPreCompInfo wTauNafPreCompInfo = new WTauNafPreCompInfo();
                wTauNafPreCompInfo.setPreComp(Tnaf.getPreComp(ECPoint.AbstractF2m.this, byteValue));
                return wTauNafPreCompInfo;
            }
        })).getPreComp();
        ECPoint.AbstractF2m[] abstractF2mArr = new ECPoint.AbstractF2m[preComp.length];
        for (int i3 = 0; i3 < preComp.length; i3++) {
            abstractF2mArr[i3] = (ECPoint.AbstractF2m) preComp[i3].negate();
        }
        ECPoint.AbstractF2m abstractF2m3 = (ECPoint.AbstractF2m) abstractF2m.getCurve().getInfinity();
        int i10 = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            i10++;
            byte b2 = bArr[length];
            if (b2 != 0) {
                abstractF2m3 = (ECPoint.AbstractF2m) abstractF2m3.tauPow(i10).add(b2 > 0 ? preComp[b2 >>> 1] : abstractF2mArr[(-b2) >>> 1]);
                i10 = 0;
            }
        }
        return i10 > 0 ? abstractF2m3.tauPow(i10) : abstractF2m3;
    }

    private ECPoint.AbstractF2m multiplyWTnaf(ECPoint.AbstractF2m abstractF2m, ZTauElement zTauElement, byte b2, byte b10) {
        return multiplyFromWTnaf(abstractF2m, Tnaf.tauAdicWNaf(b10, zTauElement, (byte) 4, BigInteger.valueOf(16L), Tnaf.getTw(b10, 4), b2 == 0 ? Tnaf.alpha0 : Tnaf.alpha1));
    }

    @Override // org.bouncycastle.math.ec.AbstractECMultiplier
    public ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        if (!(eCPoint instanceof ECPoint.AbstractF2m)) {
            throw new IllegalArgumentException(StubApp.getString2(32942));
        }
        ECPoint.AbstractF2m abstractF2m = (ECPoint.AbstractF2m) eCPoint;
        ECCurve.AbstractF2m abstractF2m2 = (ECCurve.AbstractF2m) abstractF2m.getCurve();
        int fieldSize = abstractF2m2.getFieldSize();
        byte byteValue = abstractF2m2.getA().toBigInteger().byteValue();
        byte mu = Tnaf.getMu(byteValue);
        return multiplyWTnaf(abstractF2m, Tnaf.partModReduction(bigInteger, fieldSize, byteValue, abstractF2m2.getSi(), mu, (byte) 10), byteValue, mu);
    }
}
