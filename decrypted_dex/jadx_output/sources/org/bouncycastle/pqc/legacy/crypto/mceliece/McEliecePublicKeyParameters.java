package org.bouncycastle.pqc.legacy.crypto.mceliece;

import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Matrix;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class McEliecePublicKeyParameters extends McElieceKeyParameters {

    /* renamed from: g, reason: collision with root package name */
    private GF2Matrix f19547g;

    /* renamed from: n, reason: collision with root package name */
    private int f19548n;

    /* renamed from: t, reason: collision with root package name */
    private int f19549t;

    public McEliecePublicKeyParameters(int i3, int i10, GF2Matrix gF2Matrix) {
        super(false, null);
        this.f19548n = i3;
        this.f19549t = i10;
        this.f19547g = new GF2Matrix(gF2Matrix);
    }

    public GF2Matrix getG() {
        return this.f19547g;
    }

    public int getK() {
        return this.f19547g.getNumRows();
    }

    public int getN() {
        return this.f19548n;
    }

    public int getT() {
        return this.f19549t;
    }
}
