package org.bouncycastle.crypto.prng.drbg;

import com.stub.StubApp;
import org.bouncycastle.math.ec.ECPoint;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DualECPoints {
    private final int cofactor;

    /* renamed from: p, reason: collision with root package name */
    private final ECPoint f19115p;

    /* renamed from: q, reason: collision with root package name */
    private final ECPoint f19116q;
    private final int securityStrength;

    public DualECPoints(int i3, ECPoint eCPoint, ECPoint eCPoint2, int i10) {
        if (!eCPoint.getCurve().equals(eCPoint2.getCurve())) {
            throw new IllegalArgumentException(StubApp.getString2(29265));
        }
        this.securityStrength = i3;
        this.f19115p = eCPoint;
        this.f19116q = eCPoint2;
        this.cofactor = i10;
    }

    private static int log2(int i3) {
        int i10 = 0;
        while (true) {
            i3 >>= 1;
            if (i3 == 0) {
                return i10;
            }
            i10++;
        }
    }

    public int getCofactor() {
        return this.cofactor;
    }

    public int getMaxOutlen() {
        return ((this.f19115p.getCurve().getFieldSize() - (log2(this.cofactor) + 13)) / 8) * 8;
    }

    public ECPoint getP() {
        return this.f19115p;
    }

    public ECPoint getQ() {
        return this.f19116q;
    }

    public int getSecurityStrength() {
        return this.securityStrength;
    }

    public int getSeedLen() {
        return this.f19115p.getCurve().getFieldSize();
    }
}
