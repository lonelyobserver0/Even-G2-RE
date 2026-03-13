package org.bouncycastle.crypto.ec;

import org.bouncycastle.math.ec.ECPoint;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ECPair {

    /* renamed from: x, reason: collision with root package name */
    private final ECPoint f18897x;

    /* renamed from: y, reason: collision with root package name */
    private final ECPoint f18898y;

    public ECPair(ECPoint eCPoint, ECPoint eCPoint2) {
        this.f18897x = eCPoint;
        this.f18898y = eCPoint2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ECPair) {
            return equals((ECPair) obj);
        }
        return false;
    }

    public ECPoint getX() {
        return this.f18897x;
    }

    public ECPoint getY() {
        return this.f18898y;
    }

    public int hashCode() {
        return (this.f18898y.hashCode() * 37) + this.f18897x.hashCode();
    }

    public boolean equals(ECPair eCPair) {
        return eCPair.getX().equals(getX()) && eCPair.getY().equals(getY());
    }
}
