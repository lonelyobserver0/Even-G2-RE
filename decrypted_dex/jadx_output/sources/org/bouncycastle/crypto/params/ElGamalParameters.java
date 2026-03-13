package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ElGamalParameters implements CipherParameters {

    /* renamed from: g, reason: collision with root package name */
    private BigInteger f19087g;

    /* renamed from: l, reason: collision with root package name */
    private int f19088l;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f19089p;

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ElGamalParameters)) {
            return false;
        }
        ElGamalParameters elGamalParameters = (ElGamalParameters) obj;
        return elGamalParameters.getP().equals(this.f19089p) && elGamalParameters.getG().equals(this.f19087g) && elGamalParameters.getL() == this.f19088l;
    }

    public BigInteger getG() {
        return this.f19087g;
    }

    public int getL() {
        return this.f19088l;
    }

    public BigInteger getP() {
        return this.f19089p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) + this.f19088l;
    }

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2, int i3) {
        this.f19087g = bigInteger2;
        this.f19089p = bigInteger;
        this.f19088l = i3;
    }
}
