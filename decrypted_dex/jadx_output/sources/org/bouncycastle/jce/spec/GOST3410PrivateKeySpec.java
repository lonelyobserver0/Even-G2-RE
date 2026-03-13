package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GOST3410PrivateKeySpec implements KeySpec {

    /* renamed from: a, reason: collision with root package name */
    private BigInteger f19168a;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f19169p;

    /* renamed from: q, reason: collision with root package name */
    private BigInteger f19170q;

    /* renamed from: x, reason: collision with root package name */
    private BigInteger f19171x;

    public GOST3410PrivateKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f19171x = bigInteger;
        this.f19169p = bigInteger2;
        this.f19170q = bigInteger3;
        this.f19168a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f19168a;
    }

    public BigInteger getP() {
        return this.f19169p;
    }

    public BigInteger getQ() {
        return this.f19170q;
    }

    public BigInteger getX() {
        return this.f19171x;
    }
}
