package z1;

import T0.H;
import T0.J;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class v implements InterfaceC2004i {

    /* renamed from: e, reason: collision with root package name */
    public String f23984e;

    /* renamed from: f, reason: collision with root package name */
    public H f23985f;

    /* renamed from: i, reason: collision with root package name */
    public boolean f23988i;

    /* renamed from: k, reason: collision with root package name */
    public int f23989k;

    /* renamed from: l, reason: collision with root package name */
    public int f23990l;

    /* renamed from: n, reason: collision with root package name */
    public int f23992n;

    /* renamed from: o, reason: collision with root package name */
    public int f23993o;

    /* renamed from: s, reason: collision with root package name */
    public int f23997s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f23999u;

    /* renamed from: d, reason: collision with root package name */
    public int f23983d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final C1553n f23980a = new C1553n(new byte[15], 2);

    /* renamed from: b, reason: collision with root package name */
    public final J f23981b = new J();

    /* renamed from: c, reason: collision with root package name */
    public final C1553n f23982c = new C1553n();

    /* renamed from: p, reason: collision with root package name */
    public final w f23994p = new w();

    /* renamed from: q, reason: collision with root package name */
    public int f23995q = -2147483647;

    /* renamed from: r, reason: collision with root package name */
    public int f23996r = -1;

    /* renamed from: t, reason: collision with root package name */
    public long f23998t = -1;
    public boolean j = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f23991m = true;

    /* renamed from: g, reason: collision with root package name */
    public double f23986g = -9.223372036854776E18d;

    /* renamed from: h, reason: collision with root package name */
    public double f23987h = -9.223372036854776E18d;

    @Override // z1.InterfaceC2004i
    public final void a() {
        this.f23983d = 0;
        this.f23990l = 0;
        this.f23980a.D(2);
        this.f23992n = 0;
        this.f23993o = 0;
        this.f23995q = -2147483647;
        this.f23996r = -1;
        this.f23997s = 0;
        this.f23998t = -1L;
        this.f23999u = false;
        this.f23988i = false;
        this.f23991m = true;
        this.j = true;
        this.f23986g = -9.223372036854776E18d;
        this.f23987h = -9.223372036854776E18d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x04aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0491 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0433  */
    @Override // z1.InterfaceC2004i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(r0.C1553n r24) {
        /*
            Method dump skipped, instructions count: 1414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.v.c(r0.n):void");
    }

    @Override // z1.InterfaceC2004i
    public final void d(boolean z2) {
    }

    @Override // z1.InterfaceC2004i
    public final void e(int i3, long j) {
        this.f23989k = i3;
        if (!this.j && (this.f23993o != 0 || !this.f23991m)) {
            this.f23988i = true;
        }
        if (j != -9223372036854775807L) {
            if (this.f23988i) {
                this.f23987h = j;
            } else {
                this.f23986g = j;
            }
        }
    }

    @Override // z1.InterfaceC2004i
    public final void f(T0.q qVar, C1994F c1994f) {
        c1994f.a();
        c1994f.b();
        this.f23984e = c1994f.f23755e;
        c1994f.b();
        this.f23985f = qVar.w(c1994f.f23754d, 1);
    }
}
