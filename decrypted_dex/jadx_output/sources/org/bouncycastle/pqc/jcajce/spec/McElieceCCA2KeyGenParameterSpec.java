package org.bouncycastle.pqc.jcajce.spec;

import com.stub.StubApp;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.pqc.legacy.math.linearalgebra.PolynomialRingGF2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class McElieceCCA2KeyGenParameterSpec implements AlgorithmParameterSpec {
    public static final int DEFAULT_M = 11;
    public static final int DEFAULT_T = 50;
    public static final String SHA1 = StubApp.getString2(5778);
    public static final String SHA224 = StubApp.getString2(28501);
    public static final String SHA256 = StubApp.getString2(1488);
    public static final String SHA384 = StubApp.getString2(23704);
    public static final String SHA512 = StubApp.getString2(23705);
    private final String digest;
    private int fieldPoly;

    /* renamed from: m, reason: collision with root package name */
    private final int f19498m;

    /* renamed from: n, reason: collision with root package name */
    private final int f19499n;

    /* renamed from: t, reason: collision with root package name */
    private final int f19500t;

    public McElieceCCA2KeyGenParameterSpec() {
        this(11, 50, StubApp.getString2(1488));
    }

    public String getDigest() {
        return this.digest;
    }

    public int getFieldPoly() {
        return this.fieldPoly;
    }

    public int getM() {
        return this.f19498m;
    }

    public int getN() {
        return this.f19499n;
    }

    public int getT() {
        return this.f19500t;
    }

    public McElieceCCA2KeyGenParameterSpec(int i3) {
        this(i3, StubApp.getString2(1488));
    }

    public McElieceCCA2KeyGenParameterSpec(int i3, int i10) {
        this(i3, i10, StubApp.getString2(1488));
    }

    public McElieceCCA2KeyGenParameterSpec(int i3, int i10, int i11) {
        this(i3, i10, i11, StubApp.getString2(1488));
    }

    public McElieceCCA2KeyGenParameterSpec(int i3, int i10, int i11, String str) {
        this.f19498m = i3;
        if (i3 < 1) {
            throw new IllegalArgumentException(StubApp.getString2(34747));
        }
        if (i3 > 32) {
            throw new IllegalArgumentException(StubApp.getString2(34746));
        }
        int i12 = 1 << i3;
        this.f19499n = i12;
        this.f19500t = i10;
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
        this.digest = str;
    }

    public McElieceCCA2KeyGenParameterSpec(int i3, int i10, String str) {
        if (i3 < 1) {
            throw new IllegalArgumentException(StubApp.getString2(34747));
        }
        if (i3 > 32) {
            throw new IllegalArgumentException(StubApp.getString2(34748));
        }
        this.f19498m = i3;
        int i11 = 1 << i3;
        this.f19499n = i11;
        if (i10 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(34745));
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(StubApp.getString2(34744));
        }
        this.f19500t = i10;
        this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i3);
        this.digest = str;
    }

    public McElieceCCA2KeyGenParameterSpec(int i3, String str) {
        int i10 = 1;
        if (i3 < 1) {
            throw new IllegalArgumentException(StubApp.getString2(34749));
        }
        int i11 = 0;
        while (i10 < i3) {
            i10 <<= 1;
            i11++;
        }
        this.f19500t = (i10 >>> 1) / i11;
        this.f19498m = i11;
        this.f19499n = i10;
        this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i11);
        this.digest = str;
    }
}
