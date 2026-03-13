package org.bouncycastle.pqc.legacy.crypto.mceliece;

import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Matrix;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class McElieceCCA2PublicKeyParameters extends McElieceCCA2KeyParameters {
    private GF2Matrix matrixG;

    /* renamed from: n, reason: collision with root package name */
    private int f19523n;

    /* renamed from: t, reason: collision with root package name */
    private int f19524t;

    public McElieceCCA2PublicKeyParameters(int i3, int i10, GF2Matrix gF2Matrix, String str) {
        super(false, str);
        this.f19523n = i3;
        this.f19524t = i10;
        this.matrixG = new GF2Matrix(gF2Matrix);
    }

    public GF2Matrix getG() {
        return this.matrixG;
    }

    public int getK() {
        return this.matrixG.getNumRows();
    }

    public int getN() {
        return this.f19523n;
    }

    public int getT() {
        return this.f19524t;
    }
}
