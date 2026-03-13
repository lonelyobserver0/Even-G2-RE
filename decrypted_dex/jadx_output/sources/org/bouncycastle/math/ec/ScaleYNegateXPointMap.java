package org.bouncycastle.math.ec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ScaleYNegateXPointMap implements ECPointMap {
    protected final ECFieldElement scale;

    public ScaleYNegateXPointMap(ECFieldElement eCFieldElement) {
        this.scale = eCFieldElement;
    }

    @Override // org.bouncycastle.math.ec.ECPointMap
    public ECPoint map(ECPoint eCPoint) {
        return eCPoint.scaleYNegateX(this.scale);
    }
}
