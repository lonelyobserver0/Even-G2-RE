package J0;

import A1.g;
import E0.x;
import L0.C0106b;
import M0.e;
import M0.f;
import M0.i;
import M0.j;
import M0.l;
import M0.m;
import M4.Z;
import O0.s;
import P0.p;
import aa.C0398e;
import android.net.Uri;
import android.os.SystemClock;
import com.stub.StubApp;
import f5.u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import l4.C1145A;
import n1.h;
import n1.o;
import o0.C1438m;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import t0.C1711k;
import t0.InterfaceC1708h;
import v0.I;
import v0.c0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements i {

    /* renamed from: a, reason: collision with root package name */
    public final p f3261a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3262b;

    /* renamed from: c, reason: collision with root package name */
    public final f[] f3263c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1708h f3264d;

    /* renamed from: e, reason: collision with root package name */
    public s f3265e;

    /* renamed from: f, reason: collision with root package name */
    public K0.c f3266f;

    /* renamed from: g, reason: collision with root package name */
    public int f3267g;

    /* renamed from: h, reason: collision with root package name */
    public C0106b f3268h;

    public b(p pVar, K0.c cVar, int i3, s sVar, InterfaceC1708h interfaceC1708h, C1145A c1145a, boolean z2) {
        n1.p[] pVarArr;
        this.f3261a = pVar;
        this.f3266f = cVar;
        this.f3262b = i3;
        this.f3265e = sVar;
        this.f3264d = interfaceC1708h;
        K0.b bVar = cVar.f3597f[i3];
        this.f3263c = new f[sVar.length()];
        for (int i10 = 0; i10 < this.f3263c.length; i10++) {
            int i11 = sVar.i(i10);
            C1438m c1438m = bVar.j[i11];
            if (c1438m.f18220r != null) {
                K0.a aVar = cVar.f3596e;
                aVar.getClass();
                pVarArr = aVar.f3576c;
            } else {
                pVarArr = null;
            }
            n1.p[] pVarArr2 = pVarArr;
            int i12 = bVar.f3577a;
            int i13 = i12 == 2 ? 4 : 0;
            long j = cVar.f3598g;
            this.f3263c[i10] = new M0.d(new h(c1145a, !z2 ? 35 : 3, null, new o(i11, i12, bVar.f3579c, -9223372036854775807L, j, j, c1438m, 0, pVarArr2, i13, null, null), Z.f4578e, null), bVar.f3577a, c1438m);
        }
    }

    @Override // M0.i
    public final void a() {
        C0106b c0106b = this.f3268h;
        if (c0106b != null) {
            throw c0106b;
        }
        this.f3261a.a();
    }

    @Override // M0.i
    public final long b(long j, c0 c0Var) {
        K0.b bVar = this.f3266f.f3597f[this.f3262b];
        int e10 = AbstractC1560u.e(bVar.f3590o, j, true);
        long[] jArr = bVar.f3590o;
        long j3 = jArr[e10];
        return c0Var.a(j, j3, (j3 >= j || e10 >= bVar.f3586k - 1) ? j3 : jArr[e10 + 1]);
    }

    @Override // M0.i
    public final void c(I i3, long j, List list, C0398e c0398e) {
        List list2;
        int a3;
        long b2;
        if (this.f3268h != null) {
            return;
        }
        K0.b[] bVarArr = this.f3266f.f3597f;
        int i10 = this.f3262b;
        K0.b bVar = bVarArr[i10];
        if (bVar.f3586k == 0) {
            c0398e.f9343a = !r4.f3595d;
            return;
        }
        boolean isEmpty = list.isEmpty();
        long[] jArr = bVar.f3590o;
        if (isEmpty) {
            a3 = AbstractC1560u.e(jArr, j, true);
            list2 = list;
        } else {
            list2 = list;
            a3 = (int) (((l) list2.get(list.size() - 1)).a() - this.f3267g);
            if (a3 < 0) {
                this.f3268h = new C0106b();
                return;
            }
        }
        if (a3 >= bVar.f3586k) {
            c0398e.f9343a = !this.f3266f.f3595d;
            return;
        }
        long j3 = i3.f21589a;
        long j10 = j - j3;
        K0.c cVar = this.f3266f;
        if (cVar.f3595d) {
            K0.b bVar2 = cVar.f3597f[i10];
            int i11 = bVar2.f3586k - 1;
            b2 = (bVar2.b(i11) + bVar2.f3590o[i11]) - j3;
        } else {
            b2 = -9223372036854775807L;
        }
        int length = this.f3265e.length();
        m[] mVarArr = new m[length];
        for (int i12 = 0; i12 < length; i12++) {
            this.f3265e.i(i12);
            mVarArr[i12] = new a(bVar, a3);
        }
        this.f3265e.b(j3, j10, b2, list2, mVarArr);
        long j11 = jArr[a3];
        long b10 = bVar.b(a3) + j11;
        long j12 = list.isEmpty() ? j : -9223372036854775807L;
        int i13 = this.f3267g + a3;
        int e10 = this.f3265e.e();
        f fVar = this.f3263c[e10];
        int i14 = this.f3265e.i(e10);
        C1438m[] c1438mArr = bVar.j;
        AbstractC1550k.g(c1438mArr != null);
        ArrayList arrayList = bVar.f3589n;
        AbstractC1550k.g(arrayList != null);
        AbstractC1550k.g(a3 < arrayList.size());
        String num = Integer.toString(c1438mArr[i14].j);
        String l9 = ((Long) arrayList.get(a3)).toString();
        Uri u2 = AbstractC1550k.u(bVar.f3587l, bVar.f3588m.replace(StubApp.getString2(2898), num).replace(StubApp.getString2(2899), num).replace(StubApp.getString2(2900), l9).replace(StubApp.getString2(2901), l9));
        SystemClock.elapsedRealtime();
        C1438m n10 = this.f3265e.n();
        int o5 = this.f3265e.o();
        Object r8 = this.f3265e.r();
        Map map = Collections.EMPTY_MAP;
        AbstractC1550k.i(u2, StubApp.getString2(505));
        c0398e.f9344b = new j(this.f3264d, new C1711k(u2, 1, null, map, 0L, -1L, null, 0), n10, o5, r8, j11, b10, j12, -9223372036854775807L, i13, 1, j11, fVar);
    }

    @Override // M0.i
    public final boolean d(long j, e eVar, List list) {
        if (this.f3268h != null) {
            return false;
        }
        return this.f3265e.d(j, eVar, list);
    }

    @Override // M0.i
    public final boolean e(e eVar, boolean z2, x xVar, I4.e eVar2) {
        P0.i h2 = u0.h(this.f3265e);
        eVar2.getClass();
        g s10 = I4.e.s(h2, xVar);
        if (!z2 || s10 == null || s10.f72a != 2) {
            return false;
        }
        s sVar = this.f3265e;
        return sVar.p(sVar.m(eVar.f4458d), s10.f73b);
    }

    @Override // M0.i
    public final int f(long j, List list) {
        return (this.f3268h != null || this.f3265e.length() < 2) ? list.size() : this.f3265e.j(j, list);
    }

    @Override // M0.i
    public final void g(e eVar) {
    }

    @Override // M0.i
    public final void release() {
        for (f fVar : this.f3263c) {
            ((M0.d) fVar).f4447a.release();
        }
    }
}
