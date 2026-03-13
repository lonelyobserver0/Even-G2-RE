package org.bouncycastle.pqc.legacy.crypto.mceliece;

import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Matrix;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2mField;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GoppaCode;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Permutation;
import org.bouncycastle.pqc.legacy.math.linearalgebra.PolynomialGF2mSmallM;
import org.bouncycastle.pqc.legacy.math.linearalgebra.PolynomialRingGF2m;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class McEliecePrivateKeyParameters extends McElieceKeyParameters {
    private GF2mField field;
    private PolynomialGF2mSmallM goppaPoly;

    /* renamed from: h, reason: collision with root package name */
    private GF2Matrix f19543h;

    /* renamed from: k, reason: collision with root package name */
    private int f19544k;

    /* renamed from: n, reason: collision with root package name */
    private int f19545n;
    private String oid;
    private Permutation p1;

    /* renamed from: p2, reason: collision with root package name */
    private Permutation f19546p2;
    private PolynomialGF2mSmallM[] qInv;
    private GF2Matrix sInv;

    public McEliecePrivateKeyParameters(int i3, int i10, GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM, Permutation permutation, Permutation permutation2, GF2Matrix gF2Matrix) {
        super(true, null);
        this.f19544k = i10;
        this.f19545n = i3;
        this.field = gF2mField;
        this.goppaPoly = polynomialGF2mSmallM;
        this.sInv = gF2Matrix;
        this.p1 = permutation;
        this.f19546p2 = permutation2;
        this.f19543h = GoppaCode.createCanonicalCheckMatrix(gF2mField, polynomialGF2mSmallM);
        this.qInv = new PolynomialRingGF2m(gF2mField, polynomialGF2mSmallM).getSquareRootMatrix();
    }

    public GF2mField getField() {
        return this.field;
    }

    public PolynomialGF2mSmallM getGoppaPoly() {
        return this.goppaPoly;
    }

    public GF2Matrix getH() {
        return this.f19543h;
    }

    public int getK() {
        return this.f19544k;
    }

    public int getN() {
        return this.f19545n;
    }

    public Permutation getP1() {
        return this.p1;
    }

    public Permutation getP2() {
        return this.f19546p2;
    }

    public PolynomialGF2mSmallM[] getQInv() {
        return this.qInv;
    }

    public GF2Matrix getSInv() {
        return this.sInv;
    }

    public McEliecePrivateKeyParameters(int i3, int i10, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[][] bArr7) {
        super(true, null);
        this.f19545n = i3;
        this.f19544k = i10;
        GF2mField gF2mField = new GF2mField(bArr);
        this.field = gF2mField;
        this.goppaPoly = new PolynomialGF2mSmallM(gF2mField, bArr2);
        this.sInv = new GF2Matrix(bArr3);
        this.p1 = new Permutation(bArr4);
        this.f19546p2 = new Permutation(bArr5);
        this.f19543h = new GF2Matrix(bArr6);
        this.qInv = new PolynomialGF2mSmallM[bArr7.length];
        for (int i11 = 0; i11 < bArr7.length; i11++) {
            this.qInv[i11] = new PolynomialGF2mSmallM(this.field, bArr7[i11]);
        }
    }
}
