package o0;

import java.util.Objects;
import r0.AbstractC1560u;

/* renamed from: o0.K, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1414K {

    /* renamed from: a, reason: collision with root package name */
    public Object f18042a;

    /* renamed from: b, reason: collision with root package name */
    public Object f18043b;

    /* renamed from: c, reason: collision with root package name */
    public int f18044c;

    /* renamed from: d, reason: collision with root package name */
    public long f18045d;

    /* renamed from: e, reason: collision with root package name */
    public long f18046e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18047f;

    /* renamed from: g, reason: collision with root package name */
    public C1427b f18048g = C1427b.f18123c;

    static {
        i2.u.A(0, 1, 2, 3, 4);
    }

    public final long a(int i3, int i10) {
        C1426a a3 = this.f18048g.a(i3);
        if (a3.f18117a != -1) {
            return a3.f18122f[i10];
        }
        return -9223372036854775807L;
    }

    public final int b(long j) {
        int i3;
        C1426a a3;
        int i10;
        C1427b c1427b = this.f18048g;
        long j3 = this.f18045d;
        c1427b.getClass();
        if (j != Long.MIN_VALUE && (j3 == -9223372036854775807L || j < j3)) {
            int i11 = 0;
            while (true) {
                i3 = c1427b.f18125a;
                if (i11 >= i3) {
                    break;
                }
                c1427b.a(i11).getClass();
                c1427b.a(i11).getClass();
                if (0 > j && ((i10 = (a3 = c1427b.a(i11)).f18117a) == -1 || a3.a(-1) < i10)) {
                    break;
                }
                i11++;
            }
            if (i11 < i3) {
                return i11;
            }
        }
        return -1;
    }

    public final int c(long j) {
        int i3;
        C1427b c1427b = this.f18048g;
        int i10 = c1427b.f18125a - 1;
        c1427b.b(i10);
        while (i10 >= 0 && j != Long.MIN_VALUE) {
            c1427b.a(i10).getClass();
            if (j >= 0) {
                break;
            }
            i10--;
        }
        if (i10 >= 0) {
            C1426a a3 = c1427b.a(i10);
            int i11 = a3.f18117a;
            if (i11 != -1) {
                while (i3 < i11) {
                    int i12 = a3.f18121e[i3];
                    i3 = (i12 == 0 || i12 == 1) ? 0 : i3 + 1;
                }
            }
            return i10;
        }
        return -1;
    }

    public final long d(int i3) {
        this.f18048g.a(i3).getClass();
        return 0L;
    }

    public final int e(int i3) {
        return this.f18048g.a(i3).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C1414K.class.equals(obj.getClass())) {
            return false;
        }
        C1414K c1414k = (C1414K) obj;
        Object obj2 = this.f18042a;
        Object obj3 = c1414k.f18042a;
        int i3 = AbstractC1560u.f20190a;
        return Objects.equals(obj2, obj3) && Objects.equals(this.f18043b, c1414k.f18043b) && this.f18044c == c1414k.f18044c && this.f18045d == c1414k.f18045d && this.f18046e == c1414k.f18046e && this.f18047f == c1414k.f18047f && Objects.equals(this.f18048g, c1414k.f18048g);
    }

    public final boolean f(int i3) {
        C1427b c1427b = this.f18048g;
        if (i3 != c1427b.f18125a - 1) {
            return false;
        }
        c1427b.b(i3);
        return false;
    }

    public final boolean g(int i3) {
        this.f18048g.a(i3).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i3, long j, long j3, C1427b c1427b, boolean z2) {
        this.f18042a = obj;
        this.f18043b = obj2;
        this.f18044c = i3;
        this.f18045d = j;
        this.f18046e = j3;
        this.f18048g = c1427b;
        this.f18047f = z2;
    }

    public final int hashCode() {
        Object obj = this.f18042a;
        int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f18043b;
        int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f18044c) * 31;
        long j = this.f18045d;
        int i3 = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j3 = this.f18046e;
        return this.f18048g.hashCode() + ((((i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f18047f ? 1 : 0)) * 31);
    }
}
