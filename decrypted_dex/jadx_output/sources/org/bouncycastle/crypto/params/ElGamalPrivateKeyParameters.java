package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ElGamalPrivateKeyParameters extends ElGamalKeyParameters {

    /* renamed from: x, reason: collision with root package name */
    private BigInteger f19090x;

    public ElGamalPrivateKeyParameters(BigInteger bigInteger, ElGamalParameters elGamalParameters) {
        super(true, elGamalParameters);
        this.f19090x = bigInteger;
    }

    @Override // org.bouncycastle.crypto.params.ElGamalKeyParameters
    public boolean equals(Object obj) {
        if ((obj instanceof ElGamalPrivateKeyParameters) && ((ElGamalPrivateKeyParameters) obj).getX().equals(this.f19090x)) {
            return super.equals(obj);
        }
        return false;
    }

    public BigInteger getX() {
        return this.f19090x;
    }

    @Override // org.bouncycastle.crypto.params.ElGamalKeyParameters
    public int hashCode() {
        return getX().hashCode();
    }
}
