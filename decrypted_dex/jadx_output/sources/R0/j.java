package R0;

import M4.Z;
import Tb.U;
import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import l4.E0;
import o0.C1423U;
import o0.C1425W;
import o0.C1431f;
import o0.C1437l;
import o0.C1438m;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1554o;
import r0.C1557r;
import v0.C1817l;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5988a;

    /* renamed from: b, reason: collision with root package name */
    public final Lc.e f5989b;

    /* renamed from: c, reason: collision with root package name */
    public C1438m f5990c;

    /* renamed from: d, reason: collision with root package name */
    public long f5991d;

    /* renamed from: e, reason: collision with root package name */
    public long f5992e;

    /* renamed from: f, reason: collision with root package name */
    public long f5993f;

    /* renamed from: g, reason: collision with root package name */
    public long f5994g;

    /* renamed from: h, reason: collision with root package name */
    public long f5995h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5996i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public long f5997k;

    /* renamed from: l, reason: collision with root package name */
    public u f5998l;

    /* renamed from: m, reason: collision with root package name */
    public Executor f5999m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m f6000n;

    public j(m mVar, Context context) {
        this.f6000n = mVar;
        AbstractC1560u.G(context);
        this.f5988a = new ArrayList();
        this.f5989b = new Lc.e();
        this.f5995h = -9223372036854775807L;
        this.f5998l = u.f6065J;
        this.f5999m = m.f6002o;
    }

    public final void a(boolean z2) {
        this.f5996i = false;
        this.f5995h = -9223372036854775807L;
        m mVar = this.f6000n;
        if (mVar.f6015n == 1) {
            mVar.f6014m++;
            E0 e02 = mVar.f6008f;
            if (z2) {
                n nVar = (n) e02.f16037b;
                q qVar = nVar.f6017b;
                qVar.f6045m = 0L;
                qVar.f6048p = -1L;
                qVar.f6046n = -1L;
                nVar.f6022g = -9223372036854775807L;
                nVar.f6020e = -9223372036854775807L;
                nVar.d(1);
                nVar.f6023h = -9223372036854775807L;
            }
            r rVar = (r) e02.f16038c;
            Ab.g gVar = rVar.f6055f;
            gVar.f275b = 0;
            gVar.f276c = 0;
            rVar.j = -9223372036854775807L;
            U u2 = rVar.f6054e;
            if (u2.g() > 0) {
                AbstractC1550k.c(u2.g() > 0);
                while (u2.g() > 1) {
                    u2.d();
                }
                Object d8 = u2.d();
                d8.getClass();
                u2.a(0L, (Long) d8);
            }
            C1425W c1425w = rVar.f6056g;
            U u10 = rVar.f6053d;
            if (c1425w != null) {
                u10.b();
            } else if (u10.g() > 0) {
                AbstractC1550k.c(u10.g() > 0);
                while (u10.g() > 1) {
                    u10.d();
                }
                Object d10 = u10.d();
                d10.getClass();
                rVar.f6056g = (C1425W) d10;
            }
            C1557r c1557r = mVar.f6012k;
            AbstractC1550k.h(c1557r);
            c1557r.c(new B0.o(mVar, 9));
        }
        this.f5997k = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r8 >= r4) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(long r18, boolean r20, long r21, long r23, Bc.i r25) {
        /*
            r17 = this;
            r1 = r17
            r0 = r25
            R0.m r2 = r1.f6000n
            r3 = 0
            r0.AbstractC1550k.g(r3)
            long r4 = r1.f5993f
            long r7 = r18 - r4
            R0.n r6 = r2.f6004b     // Catch: v0.C1817l -> L6e
            long r13 = r1.f5991d     // Catch: v0.C1817l -> L6e
            Lc.e r4 = r1.f5989b     // Catch: v0.C1817l -> L6e
            r15 = r20
            r9 = r21
            r11 = r23
            r16 = r4
            int r4 = r6.a(r7, r9, r11, r13, r15, r16)     // Catch: v0.C1817l -> L6e
            r5 = 4
            if (r4 != r5) goto L24
            return r3
        L24:
            long r4 = r1.f5994g
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 >= 0) goto L3b
            if (r20 != 0) goto L3b
            java.lang.Object r2 = r0.f768d
            R0.f r2 = (R0.f) r2
            java.lang.Object r3 = r0.f767c
            E0.m r3 = (E0.m) r3
            int r0 = r0.f766b
            r2.G0(r3, r0)
            r0 = 1
            return r0
        L3b:
            r9 = r21
            r11 = r23
            r1.f(r9, r11)
            boolean r0 = r1.j
            if (r0 == 0) goto L69
            long r4 = r1.f5997k
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L62
            int r0 = r2.f6014m
            if (r0 != 0) goto L61
            R0.r r0 = r2.f6005c
            long r8 = r0.j
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 == 0) goto L61
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 >= 0) goto L62
        L61:
            return r3
        L62:
            r1.e()
            r1.j = r3
            r1.f5997k = r6
        L69:
            r0 = 0
            r0.AbstractC1550k.h(r0)
            throw r0
        L6e:
            r0 = move-exception
            R0.v r2 = new R0.v
            o0.m r3 = r1.f5990c
            r0.AbstractC1550k.h(r3)
            r2.<init>(r0, r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.j.b(long, boolean, long, long, Bc.i):boolean");
    }

    public final void c(C1438m c1438m) {
        m mVar = this.f6000n;
        AbstractC1550k.g(mVar.f6015n == 0);
        C1431f c1431f = c1438m.f18192B;
        if (c1431f == null || !c1431f.d()) {
            c1431f = C1431f.f18135h;
        }
        if (c1431f.f18138c != 7 || AbstractC1560u.f20190a < 34) {
        }
        Looper myLooper = Looper.myLooper();
        AbstractC1550k.h(myLooper);
        mVar.f6012k = mVar.f6009g.a(myLooper, null);
        try {
            l lVar = mVar.f6006d;
            Z z2 = Z.f4578e;
            lVar.a();
            Pair pair = mVar.f6013l;
            if (pair == null) {
                throw null;
            }
            int i3 = ((C1554o) pair.second).f20180a;
            throw null;
        } catch (C1423U e10) {
            throw new v(e10, c1438m);
        }
    }

    public final void d(boolean z2) {
        ((n) this.f6000n.f6008f.f16037b).c(z2);
    }

    public final void e() {
        if (this.f5990c == null) {
            return;
        }
        new ArrayList(this.f5988a);
        C1438m c1438m = this.f5990c;
        c1438m.getClass();
        AbstractC1550k.h(null);
        C1431f c1431f = c1438m.f18192B;
        if (c1431f == null || !c1431f.d()) {
            C1431f c1431f2 = C1431f.f18135h;
        }
        int i3 = c1438m.f18223u;
        AbstractC1550k.b(StubApp.getString2(5586) + i3, i3 > 0);
        int i10 = c1438m.f18224v;
        AbstractC1550k.b(StubApp.getString2(5587) + i10, i10 > 0);
        throw null;
    }

    public final void f(long j, long j3) {
        try {
            m.a(this.f6000n, j, j3);
        } catch (C1817l e10) {
            C1438m c1438m = this.f5990c;
            if (c1438m == null) {
                c1438m = new C1438m(new C1437l());
            }
            throw new v(e10, c1438m);
        }
    }

    public final void g(int i3) {
        q qVar = ((n) this.f6000n.f6008f.f16037b).f6017b;
        if (qVar.j == i3) {
            return;
        }
        qVar.j = i3;
        qVar.d(true);
    }

    public final void h(Surface surface, C1554o c1554o) {
        m mVar = this.f6000n;
        Pair pair = mVar.f6013l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((C1554o) mVar.f6013l.second).equals(c1554o)) {
            return;
        }
        mVar.f6013l = Pair.create(surface, c1554o);
        int i3 = c1554o.f20180a;
    }

    public final void i(float f10) {
        ((n) this.f6000n.f6008f.f16037b).h(f10);
    }

    public final void j(long j, long j3, long j10, long j11) {
        if (this.f5992e == j3) {
            int i3 = (this.f5993f > j10 ? 1 : (this.f5993f == j10 ? 0 : -1));
        }
        this.f5991d = j;
        this.f5992e = j3;
        this.f5993f = j10;
        this.f5994g = j11;
    }

    public final void k(List list) {
        ArrayList arrayList = this.f5988a;
        if (arrayList.equals(list)) {
            return;
        }
        arrayList.clear();
        arrayList.addAll(list);
        arrayList.addAll(this.f6000n.f6007e);
        e();
    }
}
