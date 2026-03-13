package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ElGamalParameterSpec implements AlgorithmParameterSpec {

    /* renamed from: g, reason: collision with root package name */
    private BigInteger f19164g;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f19165p;

    public ElGamalParameterSpec(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f19165p = bigInteger;
        this.f19164g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f19164g;
    }

    public BigInteger getP() {
        return this.f19165p;
    }
}
