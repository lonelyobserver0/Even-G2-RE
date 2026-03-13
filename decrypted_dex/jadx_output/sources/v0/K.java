package v0;

import L0.C0108d;
import L0.C0121q;
import L0.C0124u;
import L0.h0;
import android.util.Pair;
import com.stub.StubApp;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import o0.AbstractC1416M;
import r0.AbstractC1550k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final Object f21592a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21593b;

    /* renamed from: c, reason: collision with root package name */
    public final L0.Z[] f21594c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21595d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21596e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21597f;

    /* renamed from: g, reason: collision with root package name */
    public L f21598g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21599h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f21600i;
    public final AbstractC1810e[] j;

    /* renamed from: k, reason: collision with root package name */
    public final O0.v f21601k;

    /* renamed from: l, reason: collision with root package name */
    public final P8.i f21602l;

    /* renamed from: m, reason: collision with root package name */
    public K f21603m;

    /* renamed from: n, reason: collision with root package name */
    public h0 f21604n;

    /* renamed from: o, reason: collision with root package name */
    public O0.w f21605o;

    /* renamed from: p, reason: collision with root package name */
    public long f21606p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [L0.d] */
    public K(AbstractC1810e[] abstractC1810eArr, long j, O0.v vVar, P0.e eVar, P8.i iVar, L l9, O0.w wVar) {
        this.j = abstractC1810eArr;
        this.f21606p = j;
        this.f21601k = vVar;
        this.f21602l = iVar;
        L0.B b2 = l9.f21607a;
        this.f21593b = b2.f3881a;
        this.f21598g = l9;
        this.f21604n = h0.f4092d;
        this.f21605o = wVar;
        this.f21594c = new L0.Z[abstractC1810eArr.length];
        this.f21600i = new boolean[abstractC1810eArr.length];
        iVar.getClass();
        int i3 = a0.f21689k;
        Pair pair = (Pair) b2.f3881a;
        Object obj = pair.first;
        L0.B a3 = b2.a(pair.second);
        V v2 = (V) ((HashMap) iVar.f5632e).get(obj);
        v2.getClass();
        ((HashSet) iVar.f5635h).add(v2);
        U u2 = (U) ((HashMap) iVar.f5634g).get(v2);
        if (u2 != null) {
            u2.f21649a.e(u2.f21650b);
        }
        v2.f21654c.add(a3);
        C0124u b10 = v2.f21652a.b(a3, eVar, l9.f21608b);
        ((IdentityHashMap) iVar.f5631d).put(b10, v2);
        iVar.c();
        long j3 = l9.f21610d;
        this.f21592a = j3 != -9223372036854775807L ? new C0108d(b10, true, 0L, j3) : b10;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [L0.z, java.lang.Object] */
    public final long a(O0.w wVar, long j, boolean z2, boolean[] zArr) {
        AbstractC1810e[] abstractC1810eArr;
        L0.Z[] zArr2;
        int i3 = 0;
        while (true) {
            boolean z10 = true;
            if (i3 >= wVar.f5189a) {
                break;
            }
            if (z2 || !wVar.a(this.f21605o, i3)) {
                z10 = false;
            }
            this.f21600i[i3] = z10;
            i3++;
        }
        int i10 = 0;
        while (true) {
            abstractC1810eArr = this.j;
            int length = abstractC1810eArr.length;
            zArr2 = this.f21594c;
            if (i10 >= length) {
                break;
            }
            if (abstractC1810eArr[i10].f21717b == -2) {
                zArr2[i10] = null;
            }
            i10++;
        }
        b();
        this.f21605o = wVar;
        c();
        long c10 = this.f21592a.c(wVar.f5191c, this.f21600i, this.f21594c, zArr, j);
        for (int i11 = 0; i11 < abstractC1810eArr.length; i11++) {
            if (abstractC1810eArr[i11].f21717b == -2 && this.f21605o.b(i11)) {
                zArr2[i11] = new C0121q();
            }
        }
        this.f21597f = false;
        for (int i12 = 0; i12 < zArr2.length; i12++) {
            if (zArr2[i12] != null) {
                AbstractC1550k.g(wVar.b(i12));
                if (abstractC1810eArr[i12].f21717b != -2) {
                    this.f21597f = true;
                }
            } else {
                AbstractC1550k.g(wVar.f5191c[i12] == null);
            }
        }
        return c10;
    }

    public final void b() {
        if (this.f21603m != null) {
            return;
        }
        int i3 = 0;
        while (true) {
            O0.w wVar = this.f21605o;
            if (i3 >= wVar.f5189a) {
                return;
            }
            boolean b2 = wVar.b(i3);
            O0.s sVar = this.f21605o.f5191c[i3];
            if (b2 && sVar != null) {
                sVar.k();
            }
            i3++;
        }
    }

    public final void c() {
        if (this.f21603m != null) {
            return;
        }
        int i3 = 0;
        while (true) {
            O0.w wVar = this.f21605o;
            if (i3 >= wVar.f5189a) {
                return;
            }
            boolean b2 = wVar.b(i3);
            O0.s sVar = this.f21605o.f5191c[i3];
            if (b2 && sVar != null) {
                sVar.h();
            }
            i3++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [L0.b0, java.lang.Object] */
    public final long d() {
        if (!this.f21596e) {
            return this.f21598g.f21608b;
        }
        long u2 = this.f21597f ? this.f21592a.u() : Long.MIN_VALUE;
        return u2 == Long.MIN_VALUE ? this.f21598g.f21611e : u2;
    }

    public final long e() {
        return this.f21598g.f21608b + this.f21606p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [L0.z, java.lang.Object] */
    public final void f(float f10, AbstractC1416M abstractC1416M, boolean z2) {
        this.f21596e = true;
        this.f21604n = this.f21592a.s();
        O0.w j = j(f10, abstractC1416M, z2);
        L l9 = this.f21598g;
        long j3 = l9.f21611e;
        long j10 = l9.f21608b;
        if (j3 != -9223372036854775807L && j10 >= j3) {
            j10 = Math.max(0L, j3 - 1);
        }
        long a3 = a(j, j10, false, new boolean[this.j.length]);
        long j11 = this.f21606p;
        L l10 = this.f21598g;
        this.f21606p = (l10.f21608b - a3) + j11;
        this.f21598g = l10.b(a3);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [L0.b0, java.lang.Object] */
    public final boolean g() {
        if (this.f21596e) {
            return !this.f21597f || this.f21592a.u() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean h() {
        if (this.f21596e) {
            return g() || d() - this.f21598g.f21608b >= -9223372036854775807L;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [L0.z, java.lang.Object] */
    public final void i() {
        b();
        ?? r02 = this.f21592a;
        try {
            boolean z2 = r02 instanceof C0108d;
            P8.i iVar = this.f21602l;
            if (z2) {
                iVar.g(((C0108d) r02).f4052a);
            } else {
                iVar.g(r02);
            }
        } catch (RuntimeException e10) {
            AbstractC1550k.l(StubApp.getString2(23614), StubApp.getString2(23615), e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x02c0, code lost:
    
        if (M4.AbstractC0154z.f4667a.c(r6.f5121b, r0.f5121b).c(r6.f5120a, r0.f5120a).e() > 0) goto L114;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final O0.w j(float r38, o0.AbstractC1416M r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 2110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.K.j(float, o0.M, boolean):O0.w");
    }

    public final void k() {
        Object obj = this.f21592a;
        if (obj instanceof C0108d) {
            long j = this.f21598g.f21610d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            C0108d c0108d = (C0108d) obj;
            c0108d.f4056e = 0L;
            c0108d.f4057f = j;
        }
    }
}
