package v0;

import android.util.Pair;
import java.util.HashMap;
import o0.AbstractC1416M;
import o0.C1414K;
import o0.C1415L;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class a0 extends AbstractC1416M {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f21689k = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f21690b;

    /* renamed from: c, reason: collision with root package name */
    public final L0.c0 f21691c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21692d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21693e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f21694f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f21695g;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC1416M[] f21696h;

    /* renamed from: i, reason: collision with root package name */
    public final Object[] f21697i;
    public final HashMap j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a0(java.util.List r7, L0.c0 r8) {
        /*
            r6 = this;
            int r0 = r7.size()
            o0.M[] r0 = new o0.AbstractC1416M[r0]
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            r3 = r2
        Lc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L22
            java.lang.Object r4 = r1.next()
            v0.N r4 = (v0.N) r4
            int r5 = r3 + 1
            o0.M r4 = r4.b()
            r0[r3] = r4
            r3 = r5
            goto Lc
        L22:
            int r1 = r7.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.Iterator r7 = r7.iterator()
        L2c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r7.next()
            v0.N r3 = (v0.N) r3
            int r4 = r2 + 1
            java.lang.Object r3 = r3.a()
            r1[r2] = r3
            r2 = r4
            goto L2c
        L42:
            r6.<init>(r0, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.a0.<init>(java.util.List, L0.c0):void");
    }

    @Override // o0.AbstractC1416M
    public final int a(boolean z2) {
        if (this.f21690b != 0) {
            int i3 = 0;
            if (z2) {
                int[] iArr = this.f21691c.f4050b;
                i3 = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                AbstractC1416M[] abstractC1416MArr = this.f21696h;
                if (!abstractC1416MArr[i3].p()) {
                    return abstractC1416MArr[i3].a(z2) + this.f21695g[i3];
                }
                i3 = q(i3, z2);
            } while (i3 != -1);
        }
        return -1;
    }

    @Override // o0.AbstractC1416M
    public final int b(Object obj) {
        int b2;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.j.get(obj2);
            int intValue = num == null ? -1 : num.intValue();
            if (intValue != -1 && (b2 = this.f21696h[intValue].b(obj3)) != -1) {
                return this.f21694f[intValue] + b2;
            }
        }
        return -1;
    }

    @Override // o0.AbstractC1416M
    public final int c(boolean z2) {
        int i3;
        int i10 = this.f21690b;
        if (i10 != 0) {
            if (z2) {
                int[] iArr = this.f21691c.f4050b;
                i3 = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                i3 = i10 - 1;
            }
            do {
                AbstractC1416M[] abstractC1416MArr = this.f21696h;
                if (!abstractC1416MArr[i3].p()) {
                    return abstractC1416MArr[i3].c(z2) + this.f21695g[i3];
                }
                i3 = r(i3, z2);
            } while (i3 != -1);
        }
        return -1;
    }

    @Override // o0.AbstractC1416M
    public final int e(int i3, int i10, boolean z2) {
        int[] iArr = this.f21695g;
        int d8 = AbstractC1560u.d(iArr, i3 + 1, false, false);
        int i11 = iArr[d8];
        AbstractC1416M[] abstractC1416MArr = this.f21696h;
        int e10 = abstractC1416MArr[d8].e(i3 - i11, i10 != 2 ? i10 : 0, z2);
        if (e10 != -1) {
            return i11 + e10;
        }
        int q10 = q(d8, z2);
        while (q10 != -1 && abstractC1416MArr[q10].p()) {
            q10 = q(q10, z2);
        }
        if (q10 != -1) {
            return abstractC1416MArr[q10].a(z2) + iArr[q10];
        }
        if (i10 == 2) {
            return a(z2);
        }
        return -1;
    }

    @Override // o0.AbstractC1416M
    public final C1414K f(int i3, C1414K c1414k, boolean z2) {
        int[] iArr = this.f21694f;
        int d8 = AbstractC1560u.d(iArr, i3 + 1, false, false);
        int i10 = this.f21695g[d8];
        this.f21696h[d8].f(i3 - iArr[d8], c1414k, z2);
        c1414k.f18044c += i10;
        if (z2) {
            Object obj = this.f21697i[d8];
            Object obj2 = c1414k.f18043b;
            obj2.getClass();
            c1414k.f18043b = Pair.create(obj, obj2);
        }
        return c1414k;
    }

    @Override // o0.AbstractC1416M
    public final C1414K g(Object obj, C1414K c1414k) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.j.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        int i3 = this.f21695g[intValue];
        this.f21696h[intValue].g(obj3, c1414k);
        c1414k.f18044c += i3;
        c1414k.f18043b = obj;
        return c1414k;
    }

    @Override // o0.AbstractC1416M
    public final int h() {
        return this.f21693e;
    }

    @Override // o0.AbstractC1416M
    public final int k(int i3, int i10) {
        int[] iArr = this.f21695g;
        int d8 = AbstractC1560u.d(iArr, i3 + 1, false, false);
        int i11 = iArr[d8];
        AbstractC1416M[] abstractC1416MArr = this.f21696h;
        int k3 = abstractC1416MArr[d8].k(i3 - i11, i10 == 2 ? 0 : i10);
        if (k3 != -1) {
            return i11 + k3;
        }
        int r8 = r(d8, false);
        while (r8 != -1 && abstractC1416MArr[r8].p()) {
            r8 = r(r8, false);
        }
        if (r8 != -1) {
            return abstractC1416MArr[r8].c(false) + iArr[r8];
        }
        if (i10 == 2) {
            return c(false);
        }
        return -1;
    }

    @Override // o0.AbstractC1416M
    public final Object l(int i3) {
        int[] iArr = this.f21694f;
        int d8 = AbstractC1560u.d(iArr, i3 + 1, false, false);
        return Pair.create(this.f21697i[d8], this.f21696h[d8].l(i3 - iArr[d8]));
    }

    @Override // o0.AbstractC1416M
    public final C1415L m(int i3, C1415L c1415l, long j) {
        int[] iArr = this.f21695g;
        int d8 = AbstractC1560u.d(iArr, i3 + 1, false, false);
        int i10 = iArr[d8];
        int i11 = this.f21694f[d8];
        this.f21696h[d8].m(i3 - i10, c1415l, j);
        Object obj = this.f21697i[d8];
        if (!C1415L.f18049q.equals(c1415l.f18051a)) {
            obj = Pair.create(obj, c1415l.f18051a);
        }
        c1415l.f18051a = obj;
        c1415l.f18063n += i11;
        c1415l.f18064o += i11;
        return c1415l;
    }

    @Override // o0.AbstractC1416M
    public final int o() {
        return this.f21692d;
    }

    public final int q(int i3, boolean z2) {
        if (!z2) {
            if (i3 < this.f21690b - 1) {
                return i3 + 1;
            }
            return -1;
        }
        L0.c0 c0Var = this.f21691c;
        int i10 = c0Var.f4051c[i3] + 1;
        int[] iArr = c0Var.f4050b;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    public final int r(int i3, boolean z2) {
        if (!z2) {
            if (i3 > 0) {
                return i3 - 1;
            }
            return -1;
        }
        L0.c0 c0Var = this.f21691c;
        int i10 = c0Var.f4051c[i3] - 1;
        if (i10 >= 0) {
            return c0Var.f4050b[i10];
        }
        return -1;
    }

    public a0(AbstractC1416M[] abstractC1416MArr, Object[] objArr, L0.c0 c0Var) {
        this.f21691c = c0Var;
        this.f21690b = c0Var.f4050b.length;
        int length = abstractC1416MArr.length;
        this.f21696h = abstractC1416MArr;
        this.f21694f = new int[length];
        this.f21695g = new int[length];
        this.f21697i = objArr;
        this.j = new HashMap();
        int length2 = abstractC1416MArr.length;
        int i3 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i3 < length2) {
            AbstractC1416M abstractC1416M = abstractC1416MArr[i3];
            this.f21696h[i12] = abstractC1416M;
            this.f21695g[i12] = i10;
            this.f21694f[i12] = i11;
            i10 += abstractC1416M.o();
            i11 += this.f21696h[i12].h();
            this.j.put(objArr[i12], Integer.valueOf(i12));
            i3++;
            i12++;
        }
        this.f21692d = i10;
        this.f21693e = i11;
    }
}
