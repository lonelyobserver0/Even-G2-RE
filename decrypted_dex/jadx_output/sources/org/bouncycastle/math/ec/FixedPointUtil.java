package org.bouncycastle.math.ec;

import com.stub.StubApp;
import java.math.BigInteger;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class FixedPointUtil {
    public static final String PRECOMP_NAME = StubApp.getString2(32925);

    public static int getCombSize(ECCurve eCCurve) {
        BigInteger order = eCCurve.getOrder();
        return order == null ? eCCurve.getFieldSize() + 1 : order.bitLength();
    }

    public static FixedPointPreCompInfo getFixedPointPreCompInfo(PreCompInfo preCompInfo) {
        if (preCompInfo instanceof FixedPointPreCompInfo) {
            return (FixedPointPreCompInfo) preCompInfo;
        }
        return null;
    }

    public static FixedPointPreCompInfo precompute(final ECPoint eCPoint) {
        final ECCurve curve = eCPoint.getCurve();
        return (FixedPointPreCompInfo) curve.precompute(eCPoint, StubApp.getString2(32925), new PreCompCallback() { // from class: org.bouncycastle.math.ec.FixedPointUtil.1
            private boolean checkExisting(FixedPointPreCompInfo fixedPointPreCompInfo, int i3) {
                return fixedPointPreCompInfo != null && checkTable(fixedPointPreCompInfo.getLookupTable(), i3);
            }

            private boolean checkTable(ECLookupTable eCLookupTable, int i3) {
                return eCLookupTable != null && eCLookupTable.getSize() >= i3;
            }

            @Override // org.bouncycastle.math.ec.PreCompCallback
            public PreCompInfo precompute(PreCompInfo preCompInfo) {
                FixedPointPreCompInfo fixedPointPreCompInfo = preCompInfo instanceof FixedPointPreCompInfo ? (FixedPointPreCompInfo) preCompInfo : null;
                int combSize = FixedPointUtil.getCombSize(ECCurve.this);
                int i3 = combSize > 250 ? 6 : 5;
                int i10 = 1 << i3;
                if (checkExisting(fixedPointPreCompInfo, i10)) {
                    return fixedPointPreCompInfo;
                }
                int v2 = AbstractC1482f.v(combSize, i3, 1, i3);
                ECPoint[] eCPointArr = new ECPoint[i3 + 1];
                eCPointArr[0] = eCPoint;
                for (int i11 = 1; i11 < i3; i11++) {
                    eCPointArr[i11] = eCPointArr[i11 - 1].timesPow2(v2);
                }
                eCPointArr[i3] = eCPointArr[0].subtract(eCPointArr[1]);
                ECCurve.this.normalizeAll(eCPointArr);
                ECPoint[] eCPointArr2 = new ECPoint[i10];
                eCPointArr2[0] = eCPointArr[0];
                for (int i12 = i3 - 1; i12 >= 0; i12--) {
                    ECPoint eCPoint2 = eCPointArr[i12];
                    int i13 = 1 << i12;
                    for (int i14 = i13; i14 < i10; i14 += i13 << 1) {
                        eCPointArr2[i14] = eCPointArr2[i14 - i13].add(eCPoint2);
                    }
                }
                ECCurve.this.normalizeAll(eCPointArr2);
                FixedPointPreCompInfo fixedPointPreCompInfo2 = new FixedPointPreCompInfo();
                fixedPointPreCompInfo2.setLookupTable(ECCurve.this.createCacheSafeLookupTable(eCPointArr2, 0, i10));
                fixedPointPreCompInfo2.setOffset(eCPointArr[i3]);
                fixedPointPreCompInfo2.setWidth(i3);
                return fixedPointPreCompInfo2;
            }
        });
    }
}
