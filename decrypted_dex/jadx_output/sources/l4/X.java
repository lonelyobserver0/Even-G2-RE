package l4;

import android.text.TextUtils;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class X {

    /* renamed from: A, reason: collision with root package name */
    public Long f16273A;

    /* renamed from: B, reason: collision with root package name */
    public long f16274B;

    /* renamed from: C, reason: collision with root package name */
    public String f16275C;

    /* renamed from: D, reason: collision with root package name */
    public int f16276D;

    /* renamed from: E, reason: collision with root package name */
    public int f16277E;

    /* renamed from: F, reason: collision with root package name */
    public long f16278F;

    /* renamed from: G, reason: collision with root package name */
    public String f16279G;

    /* renamed from: H, reason: collision with root package name */
    public byte[] f16280H;

    /* renamed from: I, reason: collision with root package name */
    public int f16281I;

    /* renamed from: J, reason: collision with root package name */
    public long f16282J;

    /* renamed from: K, reason: collision with root package name */
    public long f16283K;

    /* renamed from: L, reason: collision with root package name */
    public long f16284L;

    /* renamed from: M, reason: collision with root package name */
    public long f16285M;

    /* renamed from: N, reason: collision with root package name */
    public long f16286N;

    /* renamed from: O, reason: collision with root package name */
    public long f16287O;

    /* renamed from: P, reason: collision with root package name */
    public String f16288P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f16289Q;

    /* renamed from: R, reason: collision with root package name */
    public long f16290R;

    /* renamed from: S, reason: collision with root package name */
    public long f16291S;

    /* renamed from: a, reason: collision with root package name */
    public final C1200n0 f16292a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16293b;

    /* renamed from: c, reason: collision with root package name */
    public String f16294c;

    /* renamed from: d, reason: collision with root package name */
    public String f16295d;

    /* renamed from: e, reason: collision with root package name */
    public String f16296e;

    /* renamed from: f, reason: collision with root package name */
    public String f16297f;

    /* renamed from: g, reason: collision with root package name */
    public long f16298g;

    /* renamed from: h, reason: collision with root package name */
    public long f16299h;

    /* renamed from: i, reason: collision with root package name */
    public long f16300i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public long f16301k;

    /* renamed from: l, reason: collision with root package name */
    public String f16302l;

    /* renamed from: m, reason: collision with root package name */
    public long f16303m;

    /* renamed from: n, reason: collision with root package name */
    public long f16304n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f16305o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f16306p;

    /* renamed from: q, reason: collision with root package name */
    public Boolean f16307q;

    /* renamed from: r, reason: collision with root package name */
    public long f16308r;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f16309s;

    /* renamed from: t, reason: collision with root package name */
    public String f16310t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f16311u;

    /* renamed from: v, reason: collision with root package name */
    public long f16312v;

    /* renamed from: w, reason: collision with root package name */
    public long f16313w;

    /* renamed from: x, reason: collision with root package name */
    public int f16314x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f16315y;

    /* renamed from: z, reason: collision with root package name */
    public Long f16316z;

    public X(C1200n0 c1200n0, String str) {
        S3.D.h(c1200n0);
        S3.D.e(str);
        this.f16292a = c1200n0;
        this.f16293b = str;
        C1191k0 c1191k0 = c1200n0.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
    }

    public final void A(long j) {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        this.f16289Q |= this.f16313w != j;
        this.f16313w = j;
    }

    public final void B(long j) {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        this.f16289Q |= this.f16274B != j;
        this.f16274B = j;
    }

    public final String C() {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        return this.f16275C;
    }

    public final String D() {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        return this.f16293b;
    }

    public final String E() {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        return this.f16294c;
    }

    public final void F(String str) {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        this.f16289Q |= !Objects.equals(this.f16294c, str);
        this.f16294c = str;
    }

    public final String G() {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        return this.f16295d;
    }

    public final void H(String str) {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f16289Q |= true ^ Objects.equals(this.f16295d, str);
        this.f16295d = str;
    }

    public final void I(String str) {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        this.f16289Q |= !Objects.equals(this.f16296e, str);
        this.f16296e = str;
    }

    public final String J() {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        return this.f16297f;
    }

    public final void K(String str) {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        this.f16289Q |= !Objects.equals(this.f16297f, str);
        this.f16297f = str;
    }

    public final void L(long j) {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        this.f16289Q |= this.f16299h != j;
        this.f16299h = j;
    }

    public final void M(long j) {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        this.f16289Q |= this.f16300i != j;
        this.f16300i = j;
    }

    public final String N() {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        return this.j;
    }

    public final void O(String str) {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        this.f16289Q |= !Objects.equals(this.j, str);
        this.j = str;
    }

    public final long P() {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        return this.f16301k;
    }

    public final void Q(long j) {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        this.f16289Q |= this.f16301k != j;
        this.f16301k = j;
    }

    public final void R(String str) {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        this.f16289Q |= !Objects.equals(this.f16302l, str);
        this.f16302l = str;
    }

    public final void S(long j) {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        this.f16289Q |= this.f16303m != j;
        this.f16303m = j;
    }

    public final void a(long j) {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        this.f16289Q |= this.f16304n != j;
        this.f16304n = j;
    }

    public final long b() {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        return this.f16308r;
    }

    public final void c(long j) {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        this.f16289Q |= this.f16308r != j;
        this.f16308r = j;
    }

    public final void d(boolean z2) {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        this.f16289Q |= this.f16305o != z2;
        this.f16305o = z2;
    }

    public final void e(long j) {
        S3.D.b(j >= 0);
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        this.f16289Q |= this.f16298g != j;
        this.f16298g = j;
    }

    public final void f(long j) {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        this.f16289Q |= this.f16290R != j;
        this.f16290R = j;
    }

    public final void g(long j) {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        this.f16289Q |= this.f16291S != j;
        this.f16291S = j;
    }

    public final void h(long j) {
        C1200n0 c1200n0 = this.f16292a;
        C1191k0 c1191k0 = c1200n0.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        long j3 = this.f16298g + j;
        String str = this.f16293b;
        T t3 = c1200n0.f16541f;
        if (j3 > 2147483647L) {
            C1200n0.l(t3);
            t3.j.c(T.s(str), StubApp.getString2(20317));
            j3 = (-1) + j;
        }
        long j10 = this.f16278F + 1;
        if (j10 > 2147483647L) {
            C1200n0.l(t3);
            t3.j.c(T.s(str), StubApp.getString2(20318));
            j10 = 0;
        }
        this.f16289Q = true;
        this.f16298g = j3;
        this.f16278F = j10;
    }

    public final void i(long j) {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        this.f16289Q |= this.f16282J != j;
        this.f16282J = j;
    }

    public final void j(long j) {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        this.f16289Q |= this.f16283K != j;
        this.f16283K = j;
    }

    public final void k(long j) {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        this.f16289Q |= this.f16284L != j;
        this.f16284L = j;
    }

    public final void l(long j) {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        this.f16289Q |= this.f16285M != j;
        this.f16285M = j;
    }

    public final void m(long j) {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        this.f16289Q |= this.f16287O != j;
        this.f16287O = j;
    }

    public final void n(long j) {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        this.f16289Q |= this.f16286N != j;
        this.f16286N = j;
    }

    public final boolean o() {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        return this.f16289Q;
    }

    public final void p(int i3) {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        this.f16289Q |= this.f16276D != i3;
        this.f16276D = i3;
    }

    public final void q(int i3) {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        this.f16289Q |= this.f16277E != i3;
        this.f16277E = i3;
    }

    public final void r(long j) {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        this.f16289Q |= this.f16278F != j;
        this.f16278F = j;
    }

    public final String s() {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        return this.f16279G;
    }

    public final int t() {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        return this.f16281I;
    }

    public final String u() {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        String str = this.f16288P;
        v(null);
        return str;
    }

    public final void v(String str) {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        this.f16289Q |= !Objects.equals(this.f16288P, str);
        this.f16288P = str;
    }

    public final Boolean w() {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        return this.f16307q;
    }

    public final void x(List list) {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        if (Objects.equals(this.f16309s, list)) {
            return;
        }
        this.f16289Q = true;
        this.f16309s = list != null ? new ArrayList(list) : null;
    }

    public final boolean y() {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        return this.f16311u;
    }

    public final void z(long j) {
        C1191k0 c1191k0 = this.f16292a.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        this.f16289Q |= this.f16312v != j;
        this.f16312v = j;
    }
}
