package org.bouncycastle.jce.spec;

import org.bouncycastle.math.ec.ECPoint;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ECPublicKeySpec extends ECKeySpec {

    /* renamed from: q, reason: collision with root package name */
    private ECPoint f19163q;

    public ECPublicKeySpec(ECPoint eCPoint, ECParameterSpec eCParameterSpec) {
        super(eCParameterSpec);
        if (eCPoint.getCurve() != null) {
            this.f19163q = eCPoint.normalize();
        } else {
            this.f19163q = eCPoint;
        }
    }

    public ECPoint getQ() {
        return this.f19163q;
    }
}
