package H0;

import L0.InterfaceC0128y;
import L0.InterfaceC0129z;
import L0.Y;
import L0.h0;
import M4.Z;
import M4.e0;
import android.net.Uri;
import android.os.Handler;
import com.stub.StubApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.SocketFactory;
import kotlin.jvm.internal.LongCompanionObject;
import o0.C1417N;
import o0.C1438m;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import v0.c0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class t implements InterfaceC0129z {

    /* renamed from: a, reason: collision with root package name */
    public final P0.e f2626a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f2627b = AbstractC1560u.m(null);

    /* renamed from: c, reason: collision with root package name */
    public final A0.c f2628c;

    /* renamed from: d, reason: collision with root package name */
    public final o f2629d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f2630e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2631f;

    /* renamed from: g, reason: collision with root package name */
    public final Z9.q f2632g;

    /* renamed from: h, reason: collision with root package name */
    public final I4.e f2633h;
    public InterfaceC0128y j;

    /* renamed from: k, reason: collision with root package name */
    public Z f2634k;

    /* renamed from: l, reason: collision with root package name */
    public IOException f2635l;

    /* renamed from: m, reason: collision with root package name */
    public B0.v f2636m;

    /* renamed from: n, reason: collision with root package name */
    public long f2637n;

    /* renamed from: p, reason: collision with root package name */
    public long f2638p;

    /* renamed from: q, reason: collision with root package name */
    public long f2639q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2640r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2641s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2642t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2643v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2644w;

    /* renamed from: x, reason: collision with root package name */
    public int f2645x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2646y;

    public t(P0.e eVar, I4.e eVar2, Uri uri, Z9.q qVar, String str, SocketFactory socketFactory) {
        this.f2626a = eVar;
        this.f2633h = eVar2;
        this.f2632g = qVar;
        A0.c cVar = new A0.c(this);
        this.f2628c = cVar;
        this.f2629d = new o(cVar, cVar, str, uri, socketFactory);
        this.f2630e = new ArrayList();
        this.f2631f = new ArrayList();
        this.f2638p = -9223372036854775807L;
        this.f2637n = -9223372036854775807L;
        this.f2639q = -9223372036854775807L;
    }

    public static void a(t tVar) {
        tVar.f2640r = true;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = tVar.f2630e;
            if (i3 >= arrayList.size()) {
                return;
            }
            tVar.f2640r = ((s) arrayList.get(i3)).f2623d & tVar.f2640r;
            i3++;
        }
    }

    public static void d(t tVar) {
        if (tVar.f2642t || tVar.f2643v) {
            return;
        }
        int i3 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = tVar.f2630e;
            if (i10 >= arrayList.size()) {
                tVar.f2643v = true;
                M4.I m4 = M4.I.m(arrayList);
                M4.r.d(4, StubApp.getString2(2352));
                Object[] objArr = new Object[4];
                int i11 = 0;
                while (i3 < m4.size()) {
                    Y y10 = ((s) m4.get(i3)).f2622c;
                    String num = Integer.toString(i3);
                    C1438m q10 = y10.q();
                    q10.getClass();
                    C1417N c1417n = new C1417N(num, q10);
                    int i12 = i11 + 1;
                    int f10 = M4.C.f(objArr.length, i12);
                    if (f10 > objArr.length) {
                        objArr = Arrays.copyOf(objArr, f10);
                    }
                    objArr[i11] = c1417n;
                    i3++;
                    i11 = i12;
                }
                tVar.f2634k = M4.I.j(i11, objArr);
                InterfaceC0128y interfaceC0128y = tVar.j;
                interfaceC0128y.getClass();
                interfaceC0128y.a(tVar);
                return;
            }
            if (((s) arrayList.get(i10)).f2622c.q() == null) {
                return;
            } else {
                i10++;
            }
        }
    }

    public static void h(t tVar) {
        tVar.f2646y = true;
        o oVar = tVar.f2629d;
        oVar.getClass();
        try {
            oVar.close();
            A a3 = new A(new Z9.C(oVar));
            oVar.j = a3;
            a3.a(oVar.e(oVar.f2602h));
            oVar.f2604l = null;
            oVar.f2610s = false;
            oVar.f2607p = null;
        } catch (IOException e10) {
            oVar.f2596b.k(new B0.v(e10));
        }
        tVar.f2633h.getClass();
        C2.i iVar = new C2.i();
        ArrayList arrayList = tVar.f2630e;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList arrayList3 = tVar.f2631f;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            s sVar = (s) arrayList.get(i3);
            if (sVar.f2623d) {
                arrayList2.add(sVar);
            } else {
                r rVar = sVar.f2620a;
                s sVar2 = new s(tVar, rVar.f2616a, i3, iVar);
                arrayList2.add(sVar2);
                r rVar2 = sVar2.f2620a;
                sVar2.f2621b.f(rVar2.f2617b, tVar.f2628c, 0);
                if (arrayList3.contains(rVar)) {
                    arrayList4.add(rVar2);
                }
            }
        }
        M4.I m4 = M4.I.m(arrayList);
        arrayList.clear();
        arrayList.addAll(arrayList2);
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        for (int i10 = 0; i10 < m4.size(); i10++) {
            ((s) m4.get(i10)).a();
        }
    }

    @Override // L0.InterfaceC0129z
    public final long b(long j, c0 c0Var) {
        return j;
    }

    @Override // L0.InterfaceC0129z
    public final long c(O0.s[] sVarArr, boolean[] zArr, L0.Z[] zArr2, boolean[] zArr3, long j) {
        ArrayList arrayList;
        for (int i3 = 0; i3 < sVarArr.length; i3++) {
            if (zArr2[i3] != null && (sVarArr[i3] == null || !zArr[i3])) {
                zArr2[i3] = null;
            }
        }
        ArrayList arrayList2 = this.f2631f;
        arrayList2.clear();
        int i10 = 0;
        while (true) {
            int length = sVarArr.length;
            arrayList = this.f2630e;
            if (i10 >= length) {
                break;
            }
            O0.s sVar = sVarArr[i10];
            if (sVar != null) {
                C1417N c10 = sVar.c();
                Z z2 = this.f2634k;
                z2.getClass();
                int indexOf = z2.indexOf(c10);
                s sVar2 = (s) arrayList.get(indexOf);
                sVar2.getClass();
                arrayList2.add(sVar2.f2620a);
                if (this.f2634k.contains(c10) && zArr2[i10] == null) {
                    zArr2[i10] = new E0.x(this, indexOf);
                    zArr3[i10] = true;
                }
            }
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            s sVar3 = (s) arrayList.get(i11);
            if (!arrayList2.contains(sVar3.f2620a)) {
                sVar3.a();
            }
        }
        this.f2644w = true;
        if (j != 0) {
            this.f2637n = j;
            this.f2638p = j;
            this.f2639q = j;
        }
        m();
        return j;
    }

    @Override // L0.InterfaceC0129z
    public final void e(InterfaceC0128y interfaceC0128y, long j) {
        o oVar = this.f2629d;
        this.j = interfaceC0128y;
        try {
            oVar.getClass();
            try {
                oVar.j.a(oVar.e(oVar.f2602h));
                Uri uri = oVar.f2602h;
                String str = oVar.f2604l;
                Bc.i iVar = oVar.f2601g;
                iVar.t(iVar.k(4, str, e0.f4606g, uri));
            } catch (IOException e10) {
                AbstractC1560u.g(oVar.j);
                throw e10;
            }
        } catch (IOException e11) {
            this.f2635l = e11;
            AbstractC1560u.g(oVar);
        }
    }

    @Override // L0.b0
    public final long f() {
        return u();
    }

    @Override // L0.b0
    public final boolean g(v0.I i3) {
        return n();
    }

    public final boolean i() {
        return this.f2638p != -9223372036854775807L;
    }

    @Override // L0.InterfaceC0129z
    public final void j() {
        IOException iOException = this.f2635l;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // L0.InterfaceC0129z
    public final long k(long j) {
        if (u() == 0 && !this.f2646y) {
            this.f2639q = j;
            return j;
        }
        l(j);
        this.f2637n = j;
        if (i()) {
            o oVar = this.f2629d;
            int i3 = oVar.f2608q;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException();
                }
                this.f2638p = j;
                oVar.h(j);
                return j;
            }
        } else {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f2630e;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((s) arrayList.get(i10)).f2622c.A(j, false)) {
                    i10++;
                } else {
                    this.f2638p = j;
                    if (this.f2640r) {
                        for (int i11 = 0; i11 < this.f2630e.size(); i11++) {
                            s sVar = (s) this.f2630e.get(i11);
                            AbstractC1550k.g(sVar.f2623d);
                            sVar.f2623d = false;
                            a(sVar.f2625f);
                            sVar.f2621b.f(sVar.f2620a.f2617b, sVar.f2625f.f2628c, 0);
                        }
                        if (this.f2646y) {
                            this.f2629d.k(AbstractC1560u.V(j));
                        } else {
                            this.f2629d.h(j);
                        }
                    } else {
                        this.f2629d.h(j);
                    }
                    for (int i12 = 0; i12 < this.f2630e.size(); i12++) {
                        s sVar2 = (s) this.f2630e.get(i12);
                        if (!sVar2.f2623d) {
                            C0064g c0064g = sVar2.f2620a.f2617b.f2550h;
                            c0064g.getClass();
                            synchronized (c0064g.f2558e) {
                                c0064g.f2563k = true;
                            }
                            sVar2.f2622c.y(false);
                            sVar2.f2622c.f4032t = j;
                        }
                    }
                }
            }
        }
        return j;
    }

    @Override // L0.InterfaceC0129z
    public final void l(long j) {
        if (i()) {
            return;
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f2630e;
            if (i3 >= arrayList.size()) {
                return;
            }
            s sVar = (s) arrayList.get(i3);
            if (!sVar.f2623d) {
                sVar.f2622c.f(j, true);
            }
            i3++;
        }
    }

    public final void m() {
        ArrayList arrayList;
        boolean z2 = true;
        int i3 = 0;
        while (true) {
            arrayList = this.f2631f;
            if (i3 >= arrayList.size()) {
                break;
            }
            z2 &= ((r) arrayList.get(i3)).f2618c != null;
            i3++;
        }
        if (z2 && this.f2644w) {
            o oVar = this.f2629d;
            oVar.f2599e.addAll(arrayList);
            oVar.d();
        }
    }

    @Override // L0.b0
    public final boolean n() {
        if (this.f2640r) {
            return false;
        }
        int i3 = this.f2629d.f2608q;
        return i3 == 2 || i3 == 1;
    }

    @Override // L0.InterfaceC0129z
    public final long p() {
        if (!this.f2641s) {
            return -9223372036854775807L;
        }
        this.f2641s = false;
        return 0L;
    }

    @Override // L0.InterfaceC0129z
    public final h0 s() {
        AbstractC1550k.g(this.f2643v);
        Z z2 = this.f2634k;
        z2.getClass();
        return new h0((C1417N[]) z2.toArray(new C1417N[0]));
    }

    @Override // L0.b0
    public final long u() {
        if (!this.f2640r) {
            ArrayList arrayList = this.f2630e;
            if (!arrayList.isEmpty()) {
                long j = this.f2637n;
                if (j != -9223372036854775807L) {
                    return j;
                }
                boolean z2 = true;
                long j3 = LongCompanionObject.MAX_VALUE;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    s sVar = (s) arrayList.get(i3);
                    if (!sVar.f2623d) {
                        j3 = Math.min(j3, sVar.f2622c.l());
                        z2 = false;
                    }
                }
                if (z2 || j3 == Long.MIN_VALUE) {
                    return 0L;
                }
                return j3;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // L0.b0
    public final void v(long j) {
    }
}
