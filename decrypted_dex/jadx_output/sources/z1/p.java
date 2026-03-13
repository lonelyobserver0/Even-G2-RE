package z1;

import T0.H;
import T0.J;
import android.util.SparseArray;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final H f23890a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23891b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23892c;

    /* renamed from: f, reason: collision with root package name */
    public final J f23895f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f23896g;

    /* renamed from: h, reason: collision with root package name */
    public int f23897h;

    /* renamed from: i, reason: collision with root package name */
    public int f23898i;
    public long j;

    /* renamed from: l, reason: collision with root package name */
    public long f23900l;

    /* renamed from: p, reason: collision with root package name */
    public long f23904p;

    /* renamed from: q, reason: collision with root package name */
    public long f23905q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f23906r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f23907s;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f23893d = new SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f23894e = new SparseArray();

    /* renamed from: m, reason: collision with root package name */
    public o f23901m = new o();

    /* renamed from: n, reason: collision with root package name */
    public o f23902n = new o();

    /* renamed from: k, reason: collision with root package name */
    public boolean f23899k = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f23903o = false;

    public p(H h2, boolean z2, boolean z10) {
        this.f23890a = h2;
        this.f23891b = z2;
        this.f23892c = z10;
        byte[] bArr = new byte[128];
        this.f23896g = bArr;
        this.f23895f = new J(bArr, 0, 0);
        o oVar = this.f23902n;
        oVar.f23876b = false;
        oVar.f23875a = false;
    }

    public final void a() {
        boolean z2;
        int i3;
        boolean z10 = false;
        if (this.f23891b) {
            o oVar = this.f23902n;
            z2 = oVar.f23876b && ((i3 = oVar.f23879e) == 7 || i3 == 2);
        } else {
            z2 = this.f23907s;
        }
        boolean z11 = this.f23906r;
        int i10 = this.f23898i;
        if (i10 == 5 || (z2 && i10 == 1)) {
            z10 = true;
        }
        this.f23906r = z11 | z10;
    }
}
