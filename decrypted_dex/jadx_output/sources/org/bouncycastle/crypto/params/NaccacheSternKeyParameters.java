package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class NaccacheSternKeyParameters extends AsymmetricKeyParameter {

    /* renamed from: g, reason: collision with root package name */
    private BigInteger f19102g;
    int lowerSigmaBound;

    /* renamed from: n, reason: collision with root package name */
    private BigInteger f19103n;

    public NaccacheSternKeyParameters(boolean z2, BigInteger bigInteger, BigInteger bigInteger2, int i3) {
        super(z2);
        this.f19102g = bigInteger;
        this.f19103n = bigInteger2;
        this.lowerSigmaBound = i3;
    }

    public BigInteger getG() {
        return this.f19102g;
    }

    public int getLowerSigmaBound() {
        return this.lowerSigmaBound;
    }

    public BigInteger getModulus() {
        return this.f19103n;
    }
}
