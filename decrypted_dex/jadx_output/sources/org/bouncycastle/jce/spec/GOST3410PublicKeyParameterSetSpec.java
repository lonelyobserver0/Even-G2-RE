package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GOST3410PublicKeyParameterSetSpec {

    /* renamed from: a, reason: collision with root package name */
    private BigInteger f19172a;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f19173p;

    /* renamed from: q, reason: collision with root package name */
    private BigInteger f19174q;

    public GOST3410PublicKeyParameterSetSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f19173p = bigInteger;
        this.f19174q = bigInteger2;
        this.f19172a = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof GOST3410PublicKeyParameterSetSpec) {
            GOST3410PublicKeyParameterSetSpec gOST3410PublicKeyParameterSetSpec = (GOST3410PublicKeyParameterSetSpec) obj;
            if (this.f19172a.equals(gOST3410PublicKeyParameterSetSpec.f19172a) && this.f19173p.equals(gOST3410PublicKeyParameterSetSpec.f19173p) && this.f19174q.equals(gOST3410PublicKeyParameterSetSpec.f19174q)) {
                return true;
            }
        }
        return false;
    }

    public BigInteger getA() {
        return this.f19172a;
    }

    public BigInteger getP() {
        return this.f19173p;
    }

    public BigInteger getQ() {
        return this.f19174q;
    }

    public int hashCode() {
        return (this.f19172a.hashCode() ^ this.f19173p.hashCode()) ^ this.f19174q.hashCode();
    }
}
