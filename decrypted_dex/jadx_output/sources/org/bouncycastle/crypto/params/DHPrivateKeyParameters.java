package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DHPrivateKeyParameters extends DHKeyParameters {

    /* renamed from: x, reason: collision with root package name */
    private BigInteger f19073x;

    public DHPrivateKeyParameters(BigInteger bigInteger, DHParameters dHParameters) {
        super(true, dHParameters);
        this.f19073x = bigInteger;
    }

    @Override // org.bouncycastle.crypto.params.DHKeyParameters
    public boolean equals(Object obj) {
        return (obj instanceof DHPrivateKeyParameters) && ((DHPrivateKeyParameters) obj).getX().equals(this.f19073x) && super.equals(obj);
    }

    public BigInteger getX() {
        return this.f19073x;
    }

    @Override // org.bouncycastle.crypto.params.DHKeyParameters
    public int hashCode() {
        return this.f19073x.hashCode() ^ super.hashCode();
    }
}
