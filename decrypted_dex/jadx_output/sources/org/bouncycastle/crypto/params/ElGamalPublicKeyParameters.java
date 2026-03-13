package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ElGamalPublicKeyParameters extends ElGamalKeyParameters {

    /* renamed from: y, reason: collision with root package name */
    private BigInteger f19091y;

    public ElGamalPublicKeyParameters(BigInteger bigInteger, ElGamalParameters elGamalParameters) {
        super(false, elGamalParameters);
        this.f19091y = bigInteger;
    }

    @Override // org.bouncycastle.crypto.params.ElGamalKeyParameters
    public boolean equals(Object obj) {
        return (obj instanceof ElGamalPublicKeyParameters) && ((ElGamalPublicKeyParameters) obj).getY().equals(this.f19091y) && super.equals(obj);
    }

    public BigInteger getY() {
        return this.f19091y;
    }

    @Override // org.bouncycastle.crypto.params.ElGamalKeyParameters
    public int hashCode() {
        return this.f19091y.hashCode() ^ super.hashCode();
    }
}
