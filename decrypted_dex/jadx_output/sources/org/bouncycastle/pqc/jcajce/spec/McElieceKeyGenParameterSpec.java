package org.bouncycastle.pqc.jcajce.spec;

import com.stub.StubApp;
import java.security.InvalidParameterException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.pqc.legacy.math.linearalgebra.PolynomialRingGF2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class McElieceKeyGenParameterSpec implements AlgorithmParameterSpec {
    public static final int DEFAULT_M = 11;
    public static final int DEFAULT_T = 50;
    private int fieldPoly;

    /* renamed from: m, reason: collision with root package name */
    private int f19501m;

    /* renamed from: n, reason: collision with root package name */
    private int f19502n;

    /* renamed from: t, reason: collision with root package name */
    private int f19503t;

    public McElieceKeyGenParameterSpec() {
        this(11, 50);
    }

    public int getFieldPoly() {
        return this.fieldPoly;
    }

    public int getM() {
        return this.f19501m;
    }

    public int getN() {
        return this.f19502n;
    }

    public int getT() {
        return this.f19503t;
    }

    public McElieceKeyGenParameterSpec(int i3) {
        if (i3 < 1) {
            throw new IllegalArgumentException(StubApp.getString2(34749));
        }
        this.f19501m = 0;
        this.f19502n = 1;
        while (true) {
            int i10 = this.f19502n;
            if (i10 >= i3) {
                int i11 = i10 >>> 1;
                this.f19503t = i11;
                int i12 = this.f19501m;
                this.f19503t = i11 / i12;
                this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i12);
                return;
            }
            this.f19502n = i10 << 1;
            this.f19501m++;
        }
    }

    public McElieceKeyGenParameterSpec(int i3, int i10) throws InvalidParameterException {
        if (i3 < 1) {
            throw new IllegalArgumentException(StubApp.getString2(34747));
        }
        if (i3 > 32) {
            throw new IllegalArgumentException(StubApp.getString2(34748));
        }
        this.f19501m = i3;
        int i11 = 1 << i3;
        this.f19502n = i11;
        if (i10 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(34745));
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(StubApp.getString2(34744));
        }
        this.f19503t = i10;
        this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i3);
    }

    public McElieceKeyGenParameterSpec(int i3, int i10, int i11) {
        this.f19501m = i3;
        if (i3 < 1) {
            throw new IllegalArgumentException(StubApp.getString2(34747));
        }
        if (i3 > 32) {
            throw new IllegalArgumentException(StubApp.getString2(34746));
        }
        int i12 = 1 << i3;
        this.f19502n = i12;
        this.f19503t = i10;
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
    }
}
