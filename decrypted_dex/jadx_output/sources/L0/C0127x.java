package L0;

import o0.AbstractC1416M;
import o0.C1414K;
import o0.C1415L;
import o0.C1447v;
import r0.AbstractC1550k;

/* renamed from: L0.x, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0127x extends i0 {

    /* renamed from: m, reason: collision with root package name */
    public final boolean f4143m;

    /* renamed from: n, reason: collision with root package name */
    public final C1415L f4144n;

    /* renamed from: p, reason: collision with root package name */
    public final C1414K f4145p;

    /* renamed from: q, reason: collision with root package name */
    public C0125v f4146q;

    /* renamed from: r, reason: collision with root package name */
    public C0124u f4147r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4148s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4149t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4150v;

    public C0127x(AbstractC0105a abstractC0105a, boolean z2) {
        super(abstractC0105a);
        this.f4143m = z2 && abstractC0105a.i();
        this.f4144n = new C1415L();
        this.f4145p = new C1414K();
        AbstractC1416M g10 = abstractC0105a.g();
        if (g10 == null) {
            this.f4146q = new C0125v(new C0126w(abstractC0105a.h()), C1415L.f18049q, C0125v.f4139e);
        } else {
            this.f4146q = new C0125v(g10, null, null);
            this.f4150v = true;
        }
    }

    @Override // L0.i0
    public final B B(B b2) {
        Object obj = b2.f3881a;
        Object obj2 = this.f4146q.f4141d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = C0125v.f4139e;
        }
        return b2.a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00cc  */
    @Override // L0.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(o0.AbstractC1416M r15) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.C0127x.C(o0.M):void");
    }

    @Override // L0.i0
    public final void E() {
        if (this.f4143m) {
            return;
        }
        this.f4148s = true;
        D();
    }

    @Override // L0.AbstractC0105a
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final C0124u b(B b2, P0.e eVar, long j) {
        C0124u c0124u = new C0124u(b2, eVar, j);
        AbstractC1550k.g(c0124u.f4135d == null);
        c0124u.f4135d = this.f4100l;
        if (!this.f4149t) {
            this.f4147r = c0124u;
            if (!this.f4148s) {
                this.f4148s = true;
                D();
            }
            return c0124u;
        }
        Object obj = this.f4146q.f4141d;
        Object obj2 = b2.f3881a;
        if (obj != null && obj2.equals(C0125v.f4139e)) {
            obj2 = this.f4146q.f4141d;
        }
        c0124u.d(b2.a(obj2));
        return c0124u;
    }

    public final boolean G(long j) {
        C0124u c0124u = this.f4147r;
        int b2 = this.f4146q.b(c0124u.f4132a.f3881a);
        if (b2 == -1) {
            return false;
        }
        C0125v c0125v = this.f4146q;
        C1414K c1414k = this.f4145p;
        c0125v.f(b2, c1414k, false);
        long j3 = c1414k.f18045d;
        if (j3 != -9223372036854775807L && j >= j3) {
            j = Math.max(0L, j3 - 1);
        }
        c0124u.f4138g = j;
        return true;
    }

    @Override // L0.AbstractC0115k, L0.AbstractC0105a
    public final void j() {
    }

    @Override // L0.AbstractC0105a
    public final void n(InterfaceC0129z interfaceC0129z) {
        C0124u c0124u = (C0124u) interfaceC0129z;
        if (c0124u.f4136e != null) {
            AbstractC0105a abstractC0105a = c0124u.f4135d;
            abstractC0105a.getClass();
            abstractC0105a.n(c0124u.f4136e);
        }
        if (interfaceC0129z == this.f4147r) {
            this.f4147r = null;
        }
    }

    @Override // L0.AbstractC0115k, L0.AbstractC0105a
    public final void q() {
        this.f4149t = false;
        this.f4148s = false;
        super.q();
    }

    @Override // L0.i0, L0.AbstractC0105a
    public final void v(C1447v c1447v) {
        if (this.f4150v) {
            C0125v c0125v = this.f4146q;
            this.f4146q = new C0125v(new g0(this.f4146q.f4123b, c1447v), c0125v.f4140c, c0125v.f4141d);
        } else {
            this.f4146q = new C0125v(new C0126w(c1447v), C1415L.f18049q, C0125v.f4139e);
        }
        this.f4100l.v(c1447v);
    }
}
