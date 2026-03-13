package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Memoable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CramerShoupParameters implements CipherParameters {

    /* renamed from: H, reason: collision with root package name */
    private Digest f19056H;

    /* renamed from: g1, reason: collision with root package name */
    private BigInteger f19057g1;

    /* renamed from: g2, reason: collision with root package name */
    private BigInteger f19058g2;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f19059p;

    public CramerShoupParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, Digest digest) {
        this.f19059p = bigInteger;
        this.f19057g1 = bigInteger2;
        this.f19058g2 = bigInteger3;
        Digest digest2 = (Digest) ((Memoable) digest).copy();
        this.f19056H = digest2;
        digest2.reset();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupParameters)) {
            return false;
        }
        CramerShoupParameters cramerShoupParameters = (CramerShoupParameters) obj;
        return cramerShoupParameters.getP().equals(this.f19059p) && cramerShoupParameters.getG1().equals(this.f19057g1) && cramerShoupParameters.getG2().equals(this.f19058g2);
    }

    public BigInteger getG1() {
        return this.f19057g1;
    }

    public BigInteger getG2() {
        return this.f19058g2;
    }

    public Digest getH() {
        return (Digest) ((Memoable) this.f19056H).copy();
    }

    public BigInteger getP() {
        return this.f19059p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG1().hashCode()) ^ getG2().hashCode();
    }
}
