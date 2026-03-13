package v0;

import android.util.Pair;
import java.util.ArrayList;
import o0.AbstractC1416M;
import o0.C1414K;
import o0.C1415L;
import o0.C1427b;
import r0.AbstractC1550k;
import r0.C1557r;
import sb.C1644e0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class M {

    /* renamed from: c, reason: collision with root package name */
    public final w0.c f21618c;

    /* renamed from: d, reason: collision with root package name */
    public final C1557r f21619d;

    /* renamed from: e, reason: collision with root package name */
    public final C1644e0 f21620e;

    /* renamed from: f, reason: collision with root package name */
    public long f21621f;

    /* renamed from: g, reason: collision with root package name */
    public int f21622g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21623h;

    /* renamed from: i, reason: collision with root package name */
    public K f21624i;
    public K j;

    /* renamed from: k, reason: collision with root package name */
    public K f21625k;

    /* renamed from: l, reason: collision with root package name */
    public K f21626l;

    /* renamed from: m, reason: collision with root package name */
    public int f21627m;

    /* renamed from: n, reason: collision with root package name */
    public Object f21628n;

    /* renamed from: o, reason: collision with root package name */
    public long f21629o;

    /* renamed from: a, reason: collision with root package name */
    public final C1414K f21616a = new C1414K();

    /* renamed from: b, reason: collision with root package name */
    public final C1415L f21617b = new C1415L();

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f21630p = new ArrayList();

    public M(w0.c cVar, C1557r c1557r, C1644e0 c1644e0, C1819n c1819n) {
        this.f21618c = cVar;
        this.f21619d = c1557r;
        this.f21620e = c1644e0;
    }

    public static L0.B m(AbstractC1416M abstractC1416M, Object obj, long j, long j3, C1415L c1415l, C1414K c1414k) {
        abstractC1416M.g(obj, c1414k);
        abstractC1416M.n(c1414k.f18044c, c1415l);
        abstractC1416M.b(obj);
        int i3 = c1414k.f18048g.f18125a;
        if (i3 != 0) {
            if (i3 == 1) {
                c1414k.f(0);
            }
            c1414k.f18048g.getClass();
            c1414k.g(0);
        }
        abstractC1416M.g(obj, c1414k);
        int c10 = c1414k.c(j);
        return c10 == -1 ? new L0.B(obj, j3, c1414k.b(j)) : new L0.B(obj, c10, c1414k.e(c10), j3, -1);
    }

    public final K a() {
        K k3 = this.f21624i;
        if (k3 == null) {
            return null;
        }
        if (k3 == this.j) {
            this.j = k3.f21603m;
        }
        k3.i();
        int i3 = this.f21627m - 1;
        this.f21627m = i3;
        if (i3 == 0) {
            this.f21625k = null;
            K k4 = this.f21624i;
            this.f21628n = k4.f21593b;
            this.f21629o = k4.f21598g.f21607a.f3884d;
        }
        this.f21624i = this.f21624i.f21603m;
        k();
        return this.f21624i;
    }

    public final void b() {
        if (this.f21627m == 0) {
            return;
        }
        K k3 = this.f21624i;
        AbstractC1550k.h(k3);
        this.f21628n = k3.f21593b;
        this.f21629o = k3.f21598g.f21607a.f3884d;
        while (k3 != null) {
            k3.i();
            k3 = k3.f21603m;
        }
        this.f21624i = null;
        this.f21625k = null;
        this.j = null;
        this.f21627m = 0;
        k();
    }

    public final L c(AbstractC1416M abstractC1416M, K k3, long j) {
        AbstractC1416M abstractC1416M2;
        C1414K c1414k;
        Object obj;
        long j3;
        long j10;
        long j11;
        long o5;
        L l9 = k3.f21598g;
        long j12 = (k3.f21606p + l9.f21611e) - j;
        if (l9.f21613g) {
            L l10 = k3.f21598g;
            L0.B b2 = l10.f21607a;
            int d8 = abstractC1416M.d(abstractC1416M.b(b2.f3881a), this.f21616a, this.f21617b, this.f21622g, this.f21623h);
            if (d8 != -1) {
                C1414K c1414k2 = this.f21616a;
                int i3 = abstractC1416M.f(d8, c1414k2, true).f18044c;
                Object obj2 = c1414k2.f18043b;
                obj2.getClass();
                long j13 = b2.f3884d;
                if (abstractC1416M.m(i3, this.f21617b, 0L).f18063n == d8) {
                    Pair j14 = abstractC1416M.j(this.f21617b, this.f21616a, i3, -9223372036854775807L, Math.max(0L, j12));
                    if (j14 != null) {
                        Object obj3 = j14.first;
                        long longValue = ((Long) j14.second).longValue();
                        K k4 = k3.f21603m;
                        if (k4 == null || !k4.f21593b.equals(obj3)) {
                            o5 = o(obj3);
                            if (o5 == -1) {
                                o5 = this.f21621f;
                                this.f21621f = 1 + o5;
                            }
                        } else {
                            o5 = k4.f21598g.f21607a.f3884d;
                        }
                        obj = obj3;
                        j3 = longValue;
                        j11 = o5;
                        j10 = -9223372036854775807L;
                    }
                } else {
                    obj = obj2;
                    j3 = 0;
                    j10 = 0;
                    j11 = j13;
                }
                L0.B m4 = m(abstractC1416M, obj, j3, j11, this.f21617b, this.f21616a);
                if (j10 != -9223372036854775807L && l10.f21609c != -9223372036854775807L) {
                    int i10 = abstractC1416M.g(b2.f3881a, c1414k2).f18048g.f18125a;
                    c1414k2.f18048g.getClass();
                    if (i10 > 0) {
                        c1414k2.g(0);
                    }
                }
                return d(abstractC1416M, m4, j10, j3);
            }
            return null;
        }
        L0.B b10 = l9.f21607a;
        Object obj4 = b10.f3881a;
        C1414K c1414k3 = this.f21616a;
        abstractC1416M.g(obj4, c1414k3);
        boolean b11 = b10.b();
        Object obj5 = b10.f3881a;
        if (!b11) {
            int i11 = b10.f3885e;
            if (i11 != -1) {
                c1414k3.f(i11);
            }
            int e10 = c1414k3.e(i11);
            c1414k3.g(i11);
            if (e10 != c1414k3.f18048g.a(i11).f18117a) {
                return e(abstractC1416M, b10.f3881a, b10.f3885e, e10, l9.f21611e, b10.f3884d);
            }
            abstractC1416M.g(obj5, c1414k3);
            c1414k3.d(i11);
            c1414k3.f18048g.a(i11).getClass();
            return f(abstractC1416M, b10.f3881a, 0L, l9.f21611e, b10.f3884d);
        }
        C1427b c1427b = c1414k3.f18048g;
        int i12 = b10.f3882b;
        int i13 = c1427b.a(i12).f18117a;
        if (i13 == -1) {
            return null;
        }
        int a3 = c1414k3.f18048g.a(i12).a(b10.f3883c);
        if (a3 < i13) {
            return e(abstractC1416M, b10.f3881a, i12, a3, l9.f21609c, b10.f3884d);
        }
        long j15 = l9.f21609c;
        if (j15 == -9223372036854775807L) {
            c1414k = c1414k3;
            abstractC1416M2 = abstractC1416M;
            Pair j16 = abstractC1416M2.j(this.f21617b, c1414k, c1414k.f18044c, -9223372036854775807L, Math.max(0L, j12));
            if (j16 == null) {
                return null;
            }
            j15 = ((Long) j16.second).longValue();
        } else {
            abstractC1416M2 = abstractC1416M;
            c1414k = c1414k3;
        }
        abstractC1416M2.g(obj5, c1414k);
        int i14 = b10.f3882b;
        c1414k.d(i14);
        c1414k.f18048g.a(i14).getClass();
        return f(abstractC1416M2, b10.f3881a, Math.max(0L, j15), l9.f21609c, b10.f3884d);
    }

    public final L d(AbstractC1416M abstractC1416M, L0.B b2, long j, long j3) {
        abstractC1416M.g(b2.f3881a, this.f21616a);
        if (!b2.b()) {
            return f(abstractC1416M, b2.f3881a, j3, j, b2.f3884d);
        }
        return e(abstractC1416M, b2.f3881a, b2.f3882b, b2.f3883c, j, b2.f3884d);
    }

    public final L e(AbstractC1416M abstractC1416M, Object obj, int i3, int i10, long j, long j3) {
        L0.B b2 = new L0.B(obj, i3, i10, j3, -1);
        C1414K c1414k = this.f21616a;
        long a3 = abstractC1416M.g(obj, c1414k).a(i3, i10);
        if (i10 == c1414k.e(i3)) {
            c1414k.f18048g.getClass();
        }
        c1414k.g(i3);
        long j10 = 0;
        if (a3 != -9223372036854775807L && 0 >= a3) {
            j10 = Math.max(0L, a3 - 1);
        }
        return new L(b2, j10, j, -9223372036854775807L, a3, false, false, false, false);
    }

    public final L f(AbstractC1416M abstractC1416M, Object obj, long j, long j3, long j10) {
        long j11;
        C1414K c1414k = this.f21616a;
        abstractC1416M.g(obj, c1414k);
        int b2 = c1414k.b(j);
        if (b2 != -1) {
            c1414k.f(b2);
        }
        boolean z2 = false;
        if (b2 != -1) {
            c1414k.g(b2);
        } else if (c1414k.f18048g.f18125a > 0) {
            c1414k.g(0);
        }
        L0.B b10 = new L0.B(obj, j10, b2);
        if (!b10.b() && b2 == -1) {
            z2 = true;
        }
        boolean i3 = i(abstractC1416M, b10);
        boolean h2 = h(abstractC1416M, b10, z2);
        if (b2 != -1) {
            c1414k.g(b2);
        }
        if (b2 != -1) {
            c1414k.d(b2);
            j11 = 0;
        } else {
            j11 = -9223372036854775807L;
        }
        long j12 = (j11 == -9223372036854775807L || j11 == Long.MIN_VALUE) ? c1414k.f18045d : j11;
        return new L(b10, (j12 == -9223372036854775807L || j < j12) ? j : Math.max(0L, j12 - 1), j3, j11, j12, false, z2, i3, h2);
    }

    public final L g(AbstractC1416M abstractC1416M, L l9) {
        long j;
        L0.B b2 = l9.f21607a;
        boolean b10 = b2.b();
        int i3 = b2.f3885e;
        boolean z2 = !b10 && i3 == -1;
        boolean i10 = i(abstractC1416M, b2);
        boolean h2 = h(abstractC1416M, b2, z2);
        Object obj = b2.f3881a;
        C1414K c1414k = this.f21616a;
        abstractC1416M.g(obj, c1414k);
        if (b2.b() || i3 == -1) {
            j = -9223372036854775807L;
        } else {
            c1414k.d(i3);
            j = 0;
        }
        boolean b11 = b2.b();
        int i11 = b2.f3882b;
        long a3 = b11 ? c1414k.a(i11, b2.f3883c) : (j == -9223372036854775807L || j == Long.MIN_VALUE) ? c1414k.f18045d : j;
        if (b2.b()) {
            c1414k.g(i11);
        } else if (i3 != -1) {
            c1414k.g(i3);
        }
        return new L(b2, l9.f21608b, l9.f21609c, j, a3, false, z2, i10, h2);
    }

    public final boolean h(AbstractC1416M abstractC1416M, L0.B b2, boolean z2) {
        int b10 = abstractC1416M.b(b2.f3881a);
        if (!abstractC1416M.m(abstractC1416M.f(b10, this.f21616a, false).f18044c, this.f21617b, 0L).f18059i) {
            if (abstractC1416M.d(b10, this.f21616a, this.f21617b, this.f21622g, this.f21623h) == -1 && z2) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(AbstractC1416M abstractC1416M, L0.B b2) {
        if (!b2.b() && b2.f3885e == -1) {
            Object obj = b2.f3881a;
            if (abstractC1416M.m(abstractC1416M.g(obj, this.f21616a).f18044c, this.f21617b, 0L).f18064o == abstractC1416M.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        K k3 = this.f21626l;
        if (k3 == null || k3.h()) {
            this.f21626l = null;
            for (int i3 = 0; i3 < this.f21630p.size(); i3++) {
                K k4 = (K) this.f21630p.get(i3);
                if (!k4.h()) {
                    this.f21626l = k4;
                    return;
                }
            }
        }
    }

    public final void k() {
        M4.F l9 = M4.I.l();
        for (K k3 = this.f21624i; k3 != null; k3 = k3.f21603m) {
            l9.a(k3.f21598g.f21607a);
        }
        K k4 = this.j;
        this.f21619d.c(new Ab.c(this, l9, k4 == null ? null : k4.f21598g.f21607a, 17));
    }

    public final boolean l(K k3) {
        AbstractC1550k.h(k3);
        boolean z2 = false;
        if (k3.equals(this.f21625k)) {
            return false;
        }
        this.f21625k = k3;
        while (true) {
            k3 = k3.f21603m;
            if (k3 == null) {
                break;
            }
            if (k3 == this.j) {
                this.j = this.f21624i;
                z2 = true;
            }
            k3.i();
            this.f21627m--;
        }
        K k4 = this.f21625k;
        k4.getClass();
        if (k4.f21603m != null) {
            k4.b();
            k4.f21603m = null;
            k4.c();
        }
        k();
        return z2;
    }

    public final L0.B n(AbstractC1416M abstractC1416M, Object obj, long j) {
        long o5;
        int b2;
        Object obj2 = obj;
        C1414K c1414k = this.f21616a;
        int i3 = abstractC1416M.g(obj2, c1414k).f18044c;
        Object obj3 = this.f21628n;
        if (obj3 == null || (b2 = abstractC1416M.b(obj3)) == -1 || abstractC1416M.f(b2, c1414k, false).f18044c != i3) {
            K k3 = this.f21624i;
            while (true) {
                if (k3 == null) {
                    K k4 = this.f21624i;
                    while (true) {
                        if (k4 != null) {
                            int b10 = abstractC1416M.b(k4.f21593b);
                            if (b10 != -1 && abstractC1416M.f(b10, c1414k, false).f18044c == i3) {
                                o5 = k4.f21598g.f21607a.f3884d;
                                break;
                            }
                            k4 = k4.f21603m;
                        } else {
                            o5 = o(obj2);
                            if (o5 == -1) {
                                o5 = this.f21621f;
                                this.f21621f = 1 + o5;
                                if (this.f21624i == null) {
                                    this.f21628n = obj2;
                                    this.f21629o = o5;
                                }
                            }
                        }
                    }
                } else {
                    if (k3.f21593b.equals(obj2)) {
                        o5 = k3.f21598g.f21607a.f3884d;
                        break;
                    }
                    k3 = k3.f21603m;
                }
            }
        } else {
            o5 = this.f21629o;
        }
        abstractC1416M.g(obj2, c1414k);
        int i10 = c1414k.f18044c;
        C1415L c1415l = this.f21617b;
        abstractC1416M.n(i10, c1415l);
        boolean z2 = false;
        for (int b11 = abstractC1416M.b(obj); b11 >= c1415l.f18063n; b11--) {
            abstractC1416M.f(b11, c1414k, true);
            boolean z10 = c1414k.f18048g.f18125a > 0;
            z2 |= z10;
            if (c1414k.c(c1414k.f18045d) != -1) {
                obj2 = c1414k.f18043b;
                obj2.getClass();
            }
            if (z2 && (!z10 || c1414k.f18045d != 0)) {
                break;
            }
        }
        return m(abstractC1416M, obj2, j, o5, this.f21617b, this.f21616a);
    }

    public final long o(Object obj) {
        for (int i3 = 0; i3 < this.f21630p.size(); i3++) {
            K k3 = (K) this.f21630p.get(i3);
            if (k3.f21593b.equals(obj)) {
                return k3.f21598g.f21607a.f3884d;
            }
        }
        return -1L;
    }

    public final boolean p(AbstractC1416M abstractC1416M) {
        AbstractC1416M abstractC1416M2;
        K k3;
        K k4 = this.f21624i;
        if (k4 == null) {
            return true;
        }
        int b2 = abstractC1416M.b(k4.f21593b);
        while (true) {
            abstractC1416M2 = abstractC1416M;
            b2 = abstractC1416M2.d(b2, this.f21616a, this.f21617b, this.f21622g, this.f21623h);
            while (true) {
                k4.getClass();
                k3 = k4.f21603m;
                if (k3 == null || k4.f21598g.f21613g) {
                    break;
                }
                k4 = k3;
            }
            if (b2 == -1 || k3 == null || abstractC1416M2.b(k3.f21593b) != b2) {
                break;
            }
            k4 = k3;
            abstractC1416M = abstractC1416M2;
        }
        boolean l9 = l(k4);
        k4.f21598g = g(abstractC1416M2, k4.f21598g);
        return !l9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0085, code lost:
    
        return !l(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(o0.AbstractC1416M r11, long r12, long r14) {
        /*
            r10 = this;
            v0.K r0 = r10.f21624i
            r1 = 0
        L3:
            r2 = 1
            if (r0 == 0) goto L86
            v0.L r3 = r0.f21598g
            if (r1 != 0) goto Lf
            v0.L r1 = r10.g(r11, r3)
            goto L2e
        Lf:
            v0.L r4 = r10.c(r11, r1, r12)
            if (r4 != 0) goto L1b
            boolean r11 = r10.l(r1)
            r11 = r11 ^ r2
            return r11
        L1b:
            long r5 = r3.f21608b
            long r7 = r4.f21608b
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L80
            L0.B r5 = r3.f21607a
            L0.B r6 = r4.f21607a
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L80
            r1 = r4
        L2e:
            long r4 = r3.f21609c
            v0.L r4 = r1.a(r4)
            r0.f21598g = r4
            long r3 = r3.f21611e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L7a
            long r7 = r1.f21611e
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 != 0) goto L48
            goto L7a
        L48:
            r0.k()
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 != 0) goto L55
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L58
        L55:
            long r11 = r0.f21606p
            long r11 = r11 + r7
        L58:
            v0.K r13 = r10.j
            r1 = 0
            if (r0 != r13) goto L6f
            v0.L r13 = r0.f21598g
            boolean r13 = r13.f21612f
            if (r13 != 0) goto L6f
            r3 = -9223372036854775808
            int r13 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r13 == 0) goto L6d
            int r11 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r11 < 0) goto L6f
        L6d:
            r11 = r2
            goto L70
        L6f:
            r11 = r1
        L70:
            boolean r12 = r10.l(r0)
            if (r12 != 0) goto L79
            if (r11 != 0) goto L79
            goto L86
        L79:
            return r1
        L7a:
            v0.K r1 = r0.f21603m
            r9 = r1
            r1 = r0
            r0 = r9
            goto L3
        L80:
            boolean r11 = r10.l(r1)
            r11 = r11 ^ r2
            return r11
        L86:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.M.q(o0.M, long, long):boolean");
    }
}
