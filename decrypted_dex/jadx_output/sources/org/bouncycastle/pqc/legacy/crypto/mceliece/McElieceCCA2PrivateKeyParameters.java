package org.bouncycastle.pqc.legacy.crypto.mceliece;

import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Matrix;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2mField;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GoppaCode;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Permutation;
import org.bouncycastle.pqc.legacy.math.linearalgebra.PolynomialGF2mSmallM;
import org.bouncycastle.pqc.legacy.math.linearalgebra.PolynomialRingGF2m;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class McElieceCCA2PrivateKeyParameters extends McElieceCCA2KeyParameters {
    private GF2mField field;
    private PolynomialGF2mSmallM goppaPoly;

    /* renamed from: h, reason: collision with root package name */
    private GF2Matrix f19519h;

    /* renamed from: k, reason: collision with root package name */
    private int f19520k;

    /* renamed from: n, reason: collision with root package name */
    private int f19521n;

    /* renamed from: p, reason: collision with root package name */
    private Permutation f19522p;
    private PolynomialGF2mSmallM[] qInv;

    public McElieceCCA2PrivateKeyParameters(int i3, int i10, GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM, GF2Matrix gF2Matrix, Permutation permutation, String str) {
        super(true, str);
        this.f19521n = i3;
        this.f19520k = i10;
        this.field = gF2mField;
        this.goppaPoly = polynomialGF2mSmallM;
        this.f19519h = gF2Matrix;
        this.f19522p = permutation;
        this.qInv = new PolynomialRingGF2m(gF2mField, polynomialGF2mSmallM).getSquareRootMatrix();
    }

    public GF2mField getField() {
        return this.field;
    }

    public PolynomialGF2mSmallM getGoppaPoly() {
        return this.goppaPoly;
    }

    public GF2Matrix getH() {
        return this.f19519h;
    }

    public int getK() {
        return this.f19520k;
    }

    public int getN() {
        return this.f19521n;
    }

    public Permutation getP() {
        return this.f19522p;
    }

    public PolynomialGF2mSmallM[] getQInv() {
        return this.qInv;
    }

    public int getT() {
        return this.goppaPoly.getDegree();
    }

    public McElieceCCA2PrivateKeyParameters(int i3, int i10, GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM, Permutation permutation, String str) {
        this(i3, i10, gF2mField, polynomialGF2mSmallM, GoppaCode.createCanonicalCheckMatrix(gF2mField, polynomialGF2mSmallM), permutation, str);
    }
}
