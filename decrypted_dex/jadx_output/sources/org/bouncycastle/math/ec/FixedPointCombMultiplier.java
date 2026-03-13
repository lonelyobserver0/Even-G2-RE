package org.bouncycastle.math.ec;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class FixedPointCombMultiplier extends AbstractECMultiplier {
    @Override // org.bouncycastle.math.ec.AbstractECMultiplier
    public ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        ECCurve curve = eCPoint.getCurve();
        int combSize = FixedPointUtil.getCombSize(curve);
        if (bigInteger.bitLength() > combSize) {
            throw new IllegalStateException(StubApp.getString2(32890));
        }
        FixedPointPreCompInfo precompute = FixedPointUtil.precompute(eCPoint);
        ECLookupTable lookupTable = precompute.getLookupTable();
        int width = precompute.getWidth();
        int v2 = AbstractC1482f.v(combSize, width, 1, width);
        ECPoint infinity = curve.getInfinity();
        int i3 = width * v2;
        int[] fromBigInteger = Nat.fromBigInteger(i3, bigInteger);
        int i10 = i3 - 1;
        for (int i11 = 0; i11 < v2; i11++) {
            int i12 = 0;
            for (int i13 = i10 - i11; i13 >= 0; i13 -= v2) {
                int i14 = fromBigInteger[i13 >>> 5] >>> (i13 & 31);
                i12 = ((i12 ^ (i14 >>> 1)) << 1) ^ i14;
            }
            infinity = infinity.twicePlus(lookupTable.lookup(i12));
        }
        return infinity.add(precompute.getOffset());
    }
}
