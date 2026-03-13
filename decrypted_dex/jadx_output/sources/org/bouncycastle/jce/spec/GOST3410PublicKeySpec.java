package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GOST3410PublicKeySpec implements KeySpec {

    /* renamed from: a, reason: collision with root package name */
    private BigInteger f19175a;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f19176p;

    /* renamed from: q, reason: collision with root package name */
    private BigInteger f19177q;

    /* renamed from: y, reason: collision with root package name */
    private BigInteger f19178y;

    public GOST3410PublicKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f19178y = bigInteger;
        this.f19176p = bigInteger2;
        this.f19177q = bigInteger3;
        this.f19175a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f19175a;
    }

    public BigInteger getP() {
        return this.f19176p;
    }

    public BigInteger getQ() {
        return this.f19177q;
    }

    public BigInteger getY() {
        return this.f19178y;
    }
}
