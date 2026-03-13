package o0;

import M4.Z;
import M4.e0;
import r0.AbstractC1560u;

/* renamed from: o0.Q, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class C1420Q {

    /* renamed from: a, reason: collision with root package name */
    public final int f18089a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18090b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18091c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18092d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18093e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18094f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f18095g;

    /* renamed from: h, reason: collision with root package name */
    public final Z f18096h;

    /* renamed from: i, reason: collision with root package name */
    public final Z f18097i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f18098k;

    /* renamed from: l, reason: collision with root package name */
    public final Z f18099l;

    /* renamed from: m, reason: collision with root package name */
    public final C1418O f18100m;

    /* renamed from: n, reason: collision with root package name */
    public final Z f18101n;

    /* renamed from: o, reason: collision with root package name */
    public final int f18102o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f18103p;

    /* renamed from: q, reason: collision with root package name */
    public final M4.M f18104q;

    static {
        new C1420Q(new C1419P());
        AbstractC1560u.E(1);
        AbstractC1560u.E(2);
        AbstractC1560u.E(3);
        AbstractC1560u.E(4);
        i2.u.A(5, 6, 7, 8, 9);
        i2.u.A(10, 11, 12, 13, 14);
        i2.u.A(15, 16, 17, 18, 19);
        i2.u.A(20, 21, 22, 23, 24);
        i2.u.A(25, 26, 27, 28, 29);
        AbstractC1560u.E(30);
        AbstractC1560u.E(31);
    }

    public C1420Q(C1419P c1419p) {
        this.f18089a = c1419p.f18073a;
        this.f18090b = c1419p.f18074b;
        this.f18091c = c1419p.f18075c;
        this.f18092d = c1419p.f18076d;
        this.f18093e = c1419p.f18077e;
        this.f18094f = c1419p.f18078f;
        this.f18095g = c1419p.f18079g;
        this.f18096h = c1419p.f18080h;
        this.f18097i = c1419p.f18081i;
        this.j = c1419p.j;
        this.f18098k = c1419p.f18082k;
        this.f18099l = c1419p.f18083l;
        this.f18100m = c1419p.f18084m;
        this.f18101n = c1419p.f18085n;
        this.f18102o = c1419p.f18086o;
        this.f18103p = e0.a(c1419p.f18087p);
        this.f18104q = M4.M.m(c1419p.f18088q);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1420Q c1420q = (C1420Q) obj;
        if (this.f18089a != c1420q.f18089a || this.f18090b != c1420q.f18090b || this.f18091c != c1420q.f18091c || this.f18092d != c1420q.f18092d || this.f18095g != c1420q.f18095g || this.f18093e != c1420q.f18093e || this.f18094f != c1420q.f18094f || !this.f18096h.equals(c1420q.f18096h) || !this.f18097i.equals(c1420q.f18097i) || this.j != c1420q.j || this.f18098k != c1420q.f18098k || !this.f18099l.equals(c1420q.f18099l) || !this.f18100m.equals(c1420q.f18100m) || !this.f18101n.equals(c1420q.f18101n) || this.f18102o != c1420q.f18102o) {
            return false;
        }
        e0 e0Var = this.f18103p;
        e0Var.getClass();
        return M4.r.f(e0Var, c1420q.f18103p) && this.f18104q.equals(c1420q.f18104q);
    }

    public int hashCode() {
        int hashCode = (this.f18099l.hashCode() + ((((((this.f18097i.hashCode() + ((this.f18096h.hashCode() + ((((((((((((((this.f18089a + 31) * 31) + this.f18090b) * 31) + this.f18091c) * 31) + this.f18092d) * 28629151) + (this.f18095g ? 1 : 0)) * 31) + this.f18093e) * 31) + this.f18094f) * 31)) * 961)) * 961) + this.j) * 31) + this.f18098k) * 31)) * 31;
        this.f18100m.getClass();
        return this.f18104q.hashCode() + ((this.f18103p.hashCode() + ((((this.f18101n.hashCode() + ((hashCode + 29791) * 31)) * 31) + this.f18102o) * 887503681)) * 31);
    }
}
