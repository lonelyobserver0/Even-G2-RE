package o0;

import android.util.Pair;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* renamed from: o0.M, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1416M {

    /* renamed from: a, reason: collision with root package name */
    public static final C1413J f18066a = new C1413J();

    static {
        AbstractC1560u.E(0);
        AbstractC1560u.E(1);
        AbstractC1560u.E(2);
    }

    public int a(boolean z2) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z2) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i3, C1414K c1414k, C1415L c1415l, int i10, boolean z2) {
        int i11 = f(i3, c1414k, false).f18044c;
        if (m(i11, c1415l, 0L).f18064o != i3) {
            return i3 + 1;
        }
        int e10 = e(i11, i10, z2);
        if (e10 == -1) {
            return -1;
        }
        return m(e10, c1415l, 0L).f18063n;
    }

    public int e(int i3, int i10, boolean z2) {
        if (i10 == 0) {
            if (i3 == c(z2)) {
                return -1;
            }
            return i3 + 1;
        }
        if (i10 == 1) {
            return i3;
        }
        if (i10 == 2) {
            return i3 == c(z2) ? a(z2) : i3 + 1;
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        int c10;
        if (this != obj) {
            if (obj instanceof AbstractC1416M) {
                AbstractC1416M abstractC1416M = (AbstractC1416M) obj;
                if (abstractC1416M.o() == o() && abstractC1416M.h() == h()) {
                    C1415L c1415l = new C1415L();
                    C1414K c1414k = new C1414K();
                    C1415L c1415l2 = new C1415L();
                    C1414K c1414k2 = new C1414K();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= o()) {
                            int i10 = 0;
                            while (true) {
                                if (i10 >= h()) {
                                    int a3 = a(true);
                                    if (a3 == abstractC1416M.a(true) && (c10 = c(true)) == abstractC1416M.c(true)) {
                                        while (a3 != c10) {
                                            int e10 = e(a3, 0, true);
                                            if (e10 == abstractC1416M.e(a3, 0, true)) {
                                                a3 = e10;
                                            }
                                        }
                                    }
                                } else {
                                    if (!f(i10, c1414k, true).equals(abstractC1416M.f(i10, c1414k2, true))) {
                                        break;
                                    }
                                    i10++;
                                }
                            }
                        } else {
                            if (!m(i3, c1415l, 0L).equals(abstractC1416M.m(i3, c1415l2, 0L))) {
                                break;
                            }
                            i3++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract C1414K f(int i3, C1414K c1414k, boolean z2);

    public C1414K g(Object obj, C1414K c1414k) {
        return f(b(obj), c1414k, true);
    }

    public abstract int h();

    public final int hashCode() {
        C1415L c1415l = new C1415L();
        C1414K c1414k = new C1414K();
        int o5 = o() + 217;
        for (int i3 = 0; i3 < o(); i3++) {
            o5 = (o5 * 31) + m(i3, c1415l, 0L).hashCode();
        }
        int h2 = h() + (o5 * 31);
        for (int i10 = 0; i10 < h(); i10++) {
            h2 = (h2 * 31) + f(i10, c1414k, true).hashCode();
        }
        int a3 = a(true);
        while (a3 != -1) {
            h2 = (h2 * 31) + a3;
            a3 = e(a3, 0, true);
        }
        return h2;
    }

    public final Pair i(C1415L c1415l, C1414K c1414k, int i3, long j) {
        Pair j3 = j(c1415l, c1414k, i3, j, 0L);
        j3.getClass();
        return j3;
    }

    public final Pair j(C1415L c1415l, C1414K c1414k, int i3, long j, long j3) {
        AbstractC1550k.e(i3, o());
        m(i3, c1415l, j3);
        if (j == -9223372036854775807L) {
            j = c1415l.f18061l;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i10 = c1415l.f18063n;
        f(i10, c1414k, false);
        while (i10 < c1415l.f18064o && c1414k.f18046e != j) {
            int i11 = i10 + 1;
            if (f(i11, c1414k, false).f18046e > j) {
                break;
            }
            i10 = i11;
        }
        f(i10, c1414k, true);
        long j10 = j - c1414k.f18046e;
        long j11 = c1414k.f18045d;
        if (j11 != -9223372036854775807L) {
            j10 = Math.min(j10, j11 - 1);
        }
        long max = Math.max(0L, j10);
        Object obj = c1414k.f18043b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int k(int i3, int i10) {
        if (i10 == 0) {
            if (i3 == a(false)) {
                return -1;
            }
            return i3 - 1;
        }
        if (i10 == 1) {
            return i3;
        }
        if (i10 == 2) {
            return i3 == a(false) ? c(false) : i3 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object l(int i3);

    public abstract C1415L m(int i3, C1415L c1415l, long j);

    public final void n(int i3, C1415L c1415l) {
        m(i3, c1415l, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
