package org.bouncycastle.pqc.legacy.crypto.mceliece;

import com.stub.StubApp;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.legacy.math.linearalgebra.PolynomialRingGF2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class McElieceParameters implements CipherParameters {
    public static final int DEFAULT_M = 11;
    public static final int DEFAULT_T = 50;
    private Digest digest;
    private int fieldPoly;

    /* renamed from: m, reason: collision with root package name */
    private int f19537m;

    /* renamed from: n, reason: collision with root package name */
    private int f19538n;

    /* renamed from: t, reason: collision with root package name */
    private int f19539t;

    public McElieceParameters() {
        this(11, 50);
    }

    public int getFieldPoly() {
        return this.fieldPoly;
    }

    public int getM() {
        return this.f19537m;
    }

    public int getN() {
        return this.f19538n;
    }

    public int getT() {
        return this.f19539t;
    }

    public McElieceParameters(int i3) {
        this(i3, (Digest) null);
    }

    public McElieceParameters(int i3, int i10) {
        this(i3, i10, (Digest) null);
    }

    public McElieceParameters(int i3, int i10, int i11) {
        this(i3, i10, i11, null);
    }

    public McElieceParameters(int i3, int i10, int i11, Digest digest) {
        this.f19537m = i3;
        if (i3 < 1) {
            throw new IllegalArgumentException(StubApp.getString2(34747));
        }
        if (i3 > 32) {
            throw new IllegalArgumentException(StubApp.getString2(34746));
        }
        int i12 = 1 << i3;
        this.f19538n = i12;
        this.f19539t = i10;
        if (i10 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(34745));
        }
        if (i10 > i12) {
            throw new IllegalArgumentException(StubApp.getString2(34744));
        }
        if (PolynomialRingGF2.degree(i11) != i3 || !PolynomialRingGF2.isIrreducible(i11)) {
            throw new IllegalArgumentException(StubApp.getString2(34743));
        }
        this.fieldPoly = i11;
        this.digest = digest;
    }

    public McElieceParameters(int i3, int i10, Digest digest) {
        if (i3 < 1) {
            throw new IllegalArgumentException(StubApp.getString2(34747));
        }
        if (i3 > 32) {
            throw new IllegalArgumentException(StubApp.getString2(34748));
        }
        this.f19537m = i3;
        int i11 = 1 << i3;
        this.f19538n = i11;
        if (i10 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(34745));
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(StubApp.getString2(34744));
        }
        this.f19539t = i10;
        this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i3);
        this.digest = digest;
    }

    public McElieceParameters(int i3, Digest digest) {
        if (i3 < 1) {
            throw new IllegalArgumentException(StubApp.getString2(34749));
        }
        this.f19537m = 0;
        this.f19538n = 1;
        while (true) {
            int i10 = this.f19538n;
            if (i10 >= i3) {
                int i11 = i10 >>> 1;
                this.f19539t = i11;
                int i12 = this.f19537m;
                this.f19539t = i11 / i12;
                this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i12);
                this.digest = digest;
                return;
            }
            this.f19538n = i10 << 1;
            this.f19537m++;
        }
    }

    public McElieceParameters(Digest digest) {
        this(11, 50, digest);
    }
}
