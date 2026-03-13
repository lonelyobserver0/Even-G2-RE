package org.bouncycastle.pqc.crypto.ntru;

import org.bouncycastle.pqc.math.ntru.Polynomial;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class PolynomialPair {

    /* renamed from: a, reason: collision with root package name */
    private final Polynomial f19451a;

    /* renamed from: b, reason: collision with root package name */
    private final Polynomial f19452b;

    public PolynomialPair(Polynomial polynomial, Polynomial polynomial2) {
        this.f19451a = polynomial;
        this.f19452b = polynomial2;
    }

    public Polynomial f() {
        return this.f19451a;
    }

    public Polynomial g() {
        return this.f19452b;
    }

    public Polynomial m() {
        return this.f19452b;
    }

    public Polynomial r() {
        return this.f19451a;
    }
}
