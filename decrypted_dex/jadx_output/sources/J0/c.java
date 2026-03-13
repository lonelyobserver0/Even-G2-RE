package J0;

import A0.f;
import A0.j;
import I4.e;
import L0.C0117m;
import L0.InterfaceC0128y;
import L0.InterfaceC0129z;
import L0.a0;
import L0.b0;
import L0.h0;
import M0.h;
import M4.G;
import M4.I;
import M4.Z;
import M4.r;
import O0.s;
import P0.p;
import com.google.android.gms.internal.measurement.K1;
import com.stub.StubApp;
import java.util.AbstractList;
import java.util.ArrayList;
import kotlin.jvm.internal.LongCompanionObject;
import l4.C1145A;
import o0.AbstractC1405B;
import o0.C1417N;
import o0.C1437l;
import o0.C1438m;
import t0.InterfaceC1707g;
import t0.InterfaceC1708h;
import t0.InterfaceC1726z;
import v0.c0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements InterfaceC0129z, a0 {

    /* renamed from: a, reason: collision with root package name */
    public final K1 f3269a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1726z f3270b;

    /* renamed from: c, reason: collision with root package name */
    public final p f3271c;

    /* renamed from: d, reason: collision with root package name */
    public final j f3272d;

    /* renamed from: e, reason: collision with root package name */
    public final f f3273e;

    /* renamed from: f, reason: collision with root package name */
    public final e f3274f;

    /* renamed from: g, reason: collision with root package name */
    public final f f3275g;

    /* renamed from: h, reason: collision with root package name */
    public final P0.e f3276h;
    public final h0 j;

    /* renamed from: k, reason: collision with root package name */
    public final e f3277k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC0128y f3278l;

    /* renamed from: m, reason: collision with root package name */
    public K0.c f3279m;

    /* renamed from: n, reason: collision with root package name */
    public h[] f3280n;

    /* renamed from: p, reason: collision with root package name */
    public C0117m f3281p;

    public c(K0.c cVar, K1 k12, InterfaceC1726z interfaceC1726z, e eVar, j jVar, f fVar, e eVar2, f fVar2, p pVar, P0.e eVar3) {
        this.f3279m = cVar;
        this.f3269a = k12;
        this.f3270b = interfaceC1726z;
        this.f3271c = pVar;
        this.f3272d = jVar;
        this.f3273e = fVar;
        this.f3274f = eVar2;
        this.f3275g = fVar2;
        this.f3276h = eVar3;
        this.f3277k = eVar;
        C1417N[] c1417nArr = new C1417N[cVar.f3597f.length];
        int i3 = 0;
        while (true) {
            K0.b[] bVarArr = cVar.f3597f;
            if (i3 >= bVarArr.length) {
                this.j = new h0(c1417nArr);
                this.f3280n = new h[0];
                eVar.getClass();
                G g10 = I.f4549b;
                Z z2 = Z.f4578e;
                this.f3281p = new C0117m(z2, z2);
                return;
            }
            C1438m[] c1438mArr = bVarArr[i3].j;
            C1438m[] c1438mArr2 = new C1438m[c1438mArr.length];
            for (int i10 = 0; i10 < c1438mArr.length; i10++) {
                C1438m c1438m = c1438mArr[i10];
                C1437l a3 = c1438m.a();
                a3.f18165K = jVar.a(c1438m);
                C1438m c1438m2 = new C1438m(a3);
                if (k12.f11298a && ((C1145A) k12.f11300c).c(c1438m2)) {
                    C1437l a9 = c1438m2.a();
                    a9.f18177m = AbstractC1405B.m(StubApp.getString2(462));
                    a9.f18162H = ((C1145A) k12.f11300c).b(c1438m2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(c1438m2.f18216n);
                    String str = c1438m2.f18213k;
                    sb2.append(str != null ? StubApp.getString2(397).concat(str) : "");
                    a9.j = sb2.toString();
                    a9.f18182r = LongCompanionObject.MAX_VALUE;
                    c1438m2 = new C1438m(a9);
                }
                c1438mArr2[i10] = c1438m2;
            }
            c1417nArr[i3] = new C1417N(Integer.toString(i3), c1438mArr2);
            i3++;
        }
    }

    @Override // L0.InterfaceC0129z
    public final long b(long j, c0 c0Var) {
        for (h hVar : this.f3280n) {
            if (hVar.f4470a == 2) {
                return hVar.f4474e.b(j, c0Var);
            }
        }
        return j;
    }

    @Override // L0.InterfaceC0129z
    public final long c(s[] sVarArr, boolean[] zArr, L0.Z[] zArr2, boolean[] zArr3, long j) {
        int i3;
        s sVar;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < sVarArr.length) {
            L0.Z z2 = zArr2[i10];
            if (z2 != null) {
                h hVar = (h) z2;
                s sVar2 = sVarArr[i10];
                if (sVar2 == null || !zArr[i10]) {
                    hVar.B(null);
                    zArr2[i10] = null;
                } else {
                    ((b) hVar.f4474e).f3265e = sVar2;
                    arrayList.add(hVar);
                }
            }
            if (zArr2[i10] != null || (sVar = sVarArr[i10]) == null) {
                i3 = i10;
            } else {
                int b2 = this.j.b(sVar.c());
                K0.c cVar = this.f3279m;
                K1 k12 = this.f3269a;
                InterfaceC1708h g10 = ((InterfaceC1707g) k12.f11299b).g();
                InterfaceC1726z interfaceC1726z = this.f3270b;
                if (interfaceC1726z != null) {
                    g10.y(interfaceC1726z);
                }
                b bVar = new b(this.f3271c, cVar, b2, sVar, g10, (C1145A) k12.f11300c, k12.f11298a);
                i3 = i10;
                h hVar2 = new h(this.f3279m.f3597f[b2].f3577a, null, null, bVar, this, this.f3276h, j, this.f3272d, this.f3273e, this.f3274f, this.f3275g, false);
                arrayList.add(hVar2);
                zArr2[i3] = hVar2;
                zArr3[i3] = true;
            }
            i10 = i3 + 1;
        }
        h[] hVarArr = new h[arrayList.size()];
        this.f3280n = hVarArr;
        arrayList.toArray(hVarArr);
        AbstractList u2 = r.u(arrayList, new A1.a(17));
        this.f3277k.getClass();
        this.f3281p = new C0117m(arrayList, u2);
        return j;
    }

    @Override // L0.InterfaceC0129z
    public final void e(InterfaceC0128y interfaceC0128y, long j) {
        this.f3278l = interfaceC0128y;
        interfaceC0128y.a(this);
    }

    @Override // L0.b0
    public final long f() {
        return this.f3281p.f();
    }

    @Override // L0.b0
    public final boolean g(v0.I i3) {
        return this.f3281p.g(i3);
    }

    @Override // L0.a0
    public final void h(b0 b0Var) {
        InterfaceC0128y interfaceC0128y = this.f3278l;
        interfaceC0128y.getClass();
        interfaceC0128y.h(this);
    }

    @Override // L0.InterfaceC0129z
    public final void j() {
        this.f3271c.a();
    }

    @Override // L0.InterfaceC0129z
    public final long k(long j) {
        for (h hVar : this.f3280n) {
            hVar.C(j);
        }
        return j;
    }

    @Override // L0.InterfaceC0129z
    public final void l(long j) {
        for (h hVar : this.f3280n) {
            hVar.l(j);
        }
    }

    @Override // L0.b0
    public final boolean n() {
        return this.f3281p.n();
    }

    @Override // L0.InterfaceC0129z
    public final long p() {
        return -9223372036854775807L;
    }

    @Override // L0.InterfaceC0129z
    public final h0 s() {
        return this.j;
    }

    @Override // L0.b0
    public final long u() {
        return this.f3281p.u();
    }

    @Override // L0.b0
    public final void v(long j) {
        this.f3281p.v(j);
    }
}
