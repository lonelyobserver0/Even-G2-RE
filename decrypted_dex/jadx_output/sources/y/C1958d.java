package y;

import android.view.ViewGroup;
import x.C1897d;
import x.C1900g;

/* renamed from: y.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1958d extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public float f23193A;

    /* renamed from: B, reason: collision with root package name */
    public String f23194B;

    /* renamed from: C, reason: collision with root package name */
    public int f23195C;

    /* renamed from: D, reason: collision with root package name */
    public float f23196D;

    /* renamed from: E, reason: collision with root package name */
    public float f23197E;

    /* renamed from: F, reason: collision with root package name */
    public int f23198F;

    /* renamed from: G, reason: collision with root package name */
    public int f23199G;

    /* renamed from: H, reason: collision with root package name */
    public int f23200H;

    /* renamed from: I, reason: collision with root package name */
    public int f23201I;

    /* renamed from: J, reason: collision with root package name */
    public int f23202J;

    /* renamed from: K, reason: collision with root package name */
    public int f23203K;

    /* renamed from: L, reason: collision with root package name */
    public int f23204L;

    /* renamed from: M, reason: collision with root package name */
    public int f23205M;

    /* renamed from: N, reason: collision with root package name */
    public float f23206N;

    /* renamed from: O, reason: collision with root package name */
    public float f23207O;

    /* renamed from: P, reason: collision with root package name */
    public int f23208P;

    /* renamed from: Q, reason: collision with root package name */
    public int f23209Q;

    /* renamed from: R, reason: collision with root package name */
    public int f23210R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f23211S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f23212T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f23213U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f23214V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f23215W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f23216X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f23217Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f23218Z;

    /* renamed from: a, reason: collision with root package name */
    public int f23219a;

    /* renamed from: a0, reason: collision with root package name */
    public int f23220a0;

    /* renamed from: b, reason: collision with root package name */
    public int f23221b;

    /* renamed from: b0, reason: collision with root package name */
    public int f23222b0;

    /* renamed from: c, reason: collision with root package name */
    public float f23223c;

    /* renamed from: c0, reason: collision with root package name */
    public int f23224c0;

    /* renamed from: d, reason: collision with root package name */
    public int f23225d;

    /* renamed from: d0, reason: collision with root package name */
    public int f23226d0;

    /* renamed from: e, reason: collision with root package name */
    public int f23227e;

    /* renamed from: e0, reason: collision with root package name */
    public int f23228e0;

    /* renamed from: f, reason: collision with root package name */
    public int f23229f;

    /* renamed from: f0, reason: collision with root package name */
    public float f23230f0;

    /* renamed from: g, reason: collision with root package name */
    public int f23231g;

    /* renamed from: g0, reason: collision with root package name */
    public int f23232g0;

    /* renamed from: h, reason: collision with root package name */
    public int f23233h;
    public int h0;

    /* renamed from: i, reason: collision with root package name */
    public int f23234i;

    /* renamed from: i0, reason: collision with root package name */
    public float f23235i0;
    public int j;

    /* renamed from: j0, reason: collision with root package name */
    public C1897d f23236j0;

    /* renamed from: k, reason: collision with root package name */
    public int f23237k;

    /* renamed from: l, reason: collision with root package name */
    public int f23238l;

    /* renamed from: m, reason: collision with root package name */
    public int f23239m;

    /* renamed from: n, reason: collision with root package name */
    public int f23240n;

    /* renamed from: o, reason: collision with root package name */
    public float f23241o;

    /* renamed from: p, reason: collision with root package name */
    public int f23242p;

    /* renamed from: q, reason: collision with root package name */
    public int f23243q;

    /* renamed from: r, reason: collision with root package name */
    public int f23244r;

    /* renamed from: s, reason: collision with root package name */
    public int f23245s;

    /* renamed from: t, reason: collision with root package name */
    public int f23246t;

    /* renamed from: u, reason: collision with root package name */
    public int f23247u;

    /* renamed from: v, reason: collision with root package name */
    public int f23248v;

    /* renamed from: w, reason: collision with root package name */
    public int f23249w;

    /* renamed from: x, reason: collision with root package name */
    public int f23250x;

    /* renamed from: y, reason: collision with root package name */
    public int f23251y;

    /* renamed from: z, reason: collision with root package name */
    public float f23252z;

    public final void a() {
        this.f23216X = false;
        this.f23213U = true;
        this.f23214V = true;
        int i3 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i3 == -2 && this.f23211S) {
            this.f23213U = false;
            this.f23200H = 1;
        }
        int i10 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i10 == -2 && this.f23212T) {
            this.f23214V = false;
            this.f23201I = 1;
        }
        if (i3 == 0 || i3 == -1) {
            this.f23213U = false;
            if (i3 == 0 && this.f23200H == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f23211S = true;
            }
        }
        if (i10 == 0 || i10 == -1) {
            this.f23214V = false;
            if (i10 == 0 && this.f23201I == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f23212T = true;
            }
        }
        if (this.f23223c == -1.0f && this.f23219a == -1 && this.f23221b == -1) {
            return;
        }
        this.f23216X = true;
        this.f23213U = true;
        this.f23214V = true;
        if (!(this.f23236j0 instanceof C1900g)) {
            this.f23236j0 = new C1900g();
        }
        ((C1900g) this.f23236j0).A(this.f23210R);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0043  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void resolveLayoutDirection(int r7) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y.C1958d.resolveLayoutDirection(int):void");
    }
}
