package org.bouncycastle.math.ec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class WNafPreCompInfo implements PreCompInfo {
    volatile int promotionCountdown = 4;
    protected int confWidth = -1;
    protected ECPoint[] preComp = null;
    protected ECPoint[] preCompNeg = null;
    protected ECPoint twice = null;
    protected int width = -1;

    public int decrementPromotionCountdown() {
        int i3 = this.promotionCountdown;
        if (i3 <= 0) {
            return i3;
        }
        int i10 = i3 - 1;
        this.promotionCountdown = i10;
        return i10;
    }

    public int getConfWidth() {
        return this.confWidth;
    }

    public ECPoint[] getPreComp() {
        return this.preComp;
    }

    public ECPoint[] getPreCompNeg() {
        return this.preCompNeg;
    }

    public int getPromotionCountdown() {
        return this.promotionCountdown;
    }

    public ECPoint getTwice() {
        return this.twice;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isPromoted() {
        return this.promotionCountdown <= 0;
    }

    public void setConfWidth(int i3) {
        this.confWidth = i3;
    }

    public void setPreComp(ECPoint[] eCPointArr) {
        this.preComp = eCPointArr;
    }

    public void setPreCompNeg(ECPoint[] eCPointArr) {
        this.preCompNeg = eCPointArr;
    }

    public void setPromotionCountdown(int i3) {
        this.promotionCountdown = i3;
    }

    public void setTwice(ECPoint eCPoint) {
        this.twice = eCPoint;
    }

    public void setWidth(int i3) {
        this.width = i3;
    }
}
