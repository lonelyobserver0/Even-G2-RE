package z1;

import T0.H;
import androidx.recyclerview.widget.C0466t;
import r0.AbstractC1550k;
import r0.C1553n;
import v0.C1803F;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class k implements InterfaceC2004i {

    /* renamed from: q, reason: collision with root package name */
    public static final double[] f23834q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f23835a;

    /* renamed from: b, reason: collision with root package name */
    public H f23836b;

    /* renamed from: c, reason: collision with root package name */
    public final C1803F f23837c;

    /* renamed from: d, reason: collision with root package name */
    public final C1553n f23838d;

    /* renamed from: e, reason: collision with root package name */
    public final C0466t f23839e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f23840f = new boolean[4];

    /* renamed from: g, reason: collision with root package name */
    public final j f23841g;

    /* renamed from: h, reason: collision with root package name */
    public long f23842h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f23843i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public long f23844k;

    /* renamed from: l, reason: collision with root package name */
    public long f23845l;

    /* renamed from: m, reason: collision with root package name */
    public long f23846m;

    /* renamed from: n, reason: collision with root package name */
    public long f23847n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f23848o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f23849p;

    public k(C1803F c1803f) {
        this.f23837c = c1803f;
        j jVar = new j();
        jVar.f23833d = new byte[128];
        this.f23841g = jVar;
        if (c1803f != null) {
            this.f23839e = new C0466t(178);
            this.f23838d = new C1553n();
        } else {
            this.f23839e = null;
            this.f23838d = null;
        }
        this.f23845l = -9223372036854775807L;
        this.f23847n = -9223372036854775807L;
    }

    @Override // z1.InterfaceC2004i
    public final void a() {
        s0.n.a(this.f23840f);
        j jVar = this.f23841g;
        jVar.f23830a = false;
        jVar.f23831b = 0;
        jVar.f23832c = 0;
        C0466t c0466t = this.f23839e;
        if (c0466t != null) {
            c0466t.g();
        }
        this.f23842h = 0L;
        this.f23843i = false;
        this.f23845l = -9223372036854775807L;
        this.f23847n = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fd  */
    @Override // z1.InterfaceC2004i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(r0.C1553n r31) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.k.c(r0.n):void");
    }

    @Override // z1.InterfaceC2004i
    public final void d(boolean z2) {
        AbstractC1550k.h(this.f23836b);
        if (z2) {
            boolean z10 = this.f23848o;
            this.f23836b.c(this.f23847n, z10 ? 1 : 0, (int) (this.f23842h - this.f23846m), 0, null);
        }
    }

    @Override // z1.InterfaceC2004i
    public final void e(int i3, long j) {
        this.f23845l = j;
    }

    @Override // z1.InterfaceC2004i
    public final void f(T0.q qVar, C1994F c1994f) {
        c1994f.a();
        c1994f.b();
        this.f23835a = c1994f.f23755e;
        c1994f.b();
        this.f23836b = qVar.w(c1994f.f23754d, 2);
        C1803F c1803f = this.f23837c;
        if (c1803f != null) {
            c1803f.f(qVar, c1994f);
        }
    }
}
