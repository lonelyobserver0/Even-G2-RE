package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SRP6GroupParameters {

    /* renamed from: N, reason: collision with root package name */
    private BigInteger f19107N;

    /* renamed from: g, reason: collision with root package name */
    private BigInteger f19108g;

    public SRP6GroupParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f19107N = bigInteger;
        this.f19108g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f19108g;
    }

    public BigInteger getN() {
        return this.f19107N;
    }
}
