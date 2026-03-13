package L0;

import java.util.List;
import o0.C1417N;
import o0.C1438m;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class H implements O0.s {

    /* renamed from: a, reason: collision with root package name */
    public final O0.s f3897a;

    /* renamed from: b, reason: collision with root package name */
    public final C1417N f3898b;

    public H(O0.s sVar, C1417N c1417n) {
        this.f3897a = sVar;
        this.f3898b = c1417n;
    }

    @Override // O0.s
    public final boolean a(int i3, long j) {
        return this.f3897a.a(i3, j);
    }

    @Override // O0.s
    public final void b(long j, long j3, long j10, List list, M0.m[] mVarArr) {
        this.f3897a.b(j, j3, j10, list, mVarArr);
    }

    @Override // O0.s
    public final C1417N c() {
        return this.f3898b;
    }

    @Override // O0.s
    public final boolean d(long j, M0.e eVar, List list) {
        return this.f3897a.d(j, eVar, list);
    }

    @Override // O0.s
    public final int e() {
        return this.f3897a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h2 = (H) obj;
        return this.f3897a.equals(h2.f3897a) && this.f3898b.equals(h2.f3898b);
    }

    @Override // O0.s
    public final void f(boolean z2) {
        this.f3897a.f(z2);
    }

    @Override // O0.s
    public final C1438m g(int i3) {
        return this.f3898b.f18070d[this.f3897a.i(i3)];
    }

    @Override // O0.s
    public final void h() {
        this.f3897a.h();
    }

    public final int hashCode() {
        return this.f3897a.hashCode() + ((this.f3898b.hashCode() + 527) * 31);
    }

    @Override // O0.s
    public final int i(int i3) {
        return this.f3897a.i(i3);
    }

    @Override // O0.s
    public final int j(long j, List list) {
        return this.f3897a.j(j, list);
    }

    @Override // O0.s
    public final void k() {
        this.f3897a.k();
    }

    @Override // O0.s
    public final int l() {
        return this.f3897a.l();
    }

    @Override // O0.s
    public final int length() {
        return this.f3897a.length();
    }

    @Override // O0.s
    public final int m(C1438m c1438m) {
        return this.f3897a.u(this.f3898b.a(c1438m));
    }

    @Override // O0.s
    public final C1438m n() {
        return this.f3898b.f18070d[this.f3897a.l()];
    }

    @Override // O0.s
    public final int o() {
        return this.f3897a.o();
    }

    @Override // O0.s
    public final boolean p(int i3, long j) {
        return this.f3897a.p(i3, j);
    }

    @Override // O0.s
    public final void q(float f10) {
        this.f3897a.q(f10);
    }

    @Override // O0.s
    public final Object r() {
        return this.f3897a.r();
    }

    @Override // O0.s
    public final void s() {
        this.f3897a.s();
    }

    @Override // O0.s
    public final void t() {
        this.f3897a.t();
    }

    @Override // O0.s
    public final int u(int i3) {
        return this.f3897a.u(i3);
    }
}
