package B0;

import L0.AbstractC0105a;
import L0.B;
import L0.C0123t;
import L0.InterfaceC0129z;
import M4.I;
import android.net.Uri;
import android.os.Looper;
import com.stub.StubApp;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import o0.AbstractC1448w;
import o0.C1443r;
import o0.C1444s;
import o0.C1447v;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import t0.InterfaceC1707g;
import t0.InterfaceC1726z;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l extends AbstractC0105a {

    /* renamed from: h, reason: collision with root package name */
    public final c f492h;
    public final Z9.q j;

    /* renamed from: k, reason: collision with root package name */
    public final I4.e f493k;

    /* renamed from: l, reason: collision with root package name */
    public final A0.j f494l;

    /* renamed from: m, reason: collision with root package name */
    public final I4.e f495m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f496n;

    /* renamed from: p, reason: collision with root package name */
    public final int f497p;

    /* renamed from: q, reason: collision with root package name */
    public final C0.c f498q;

    /* renamed from: r, reason: collision with root package name */
    public final long f499r;

    /* renamed from: s, reason: collision with root package name */
    public C1443r f500s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC1726z f501t;

    /* renamed from: v, reason: collision with root package name */
    public C1447v f502v;

    static {
        AbstractC1448w.a(StubApp.getString2(480));
    }

    public l(C1447v c1447v, Z9.q qVar, c cVar, I4.e eVar, A0.j jVar, I4.e eVar2, C0.c cVar2, long j, boolean z2, int i3) {
        this.f502v = c1447v;
        this.f500s = c1447v.f18250c;
        this.j = qVar;
        this.f492h = cVar;
        this.f493k = eVar;
        this.f494l = jVar;
        this.f495m = eVar2;
        this.f498q = cVar2;
        this.f499r = j;
        this.f496n = z2;
        this.f497p = i3;
    }

    public static C0.d w(long j, I i3) {
        C0.d dVar = null;
        for (int i10 = 0; i10 < i3.size(); i10++) {
            C0.d dVar2 = (C0.d) i3.get(i10);
            long j3 = dVar2.f932e;
            if (j3 > j || !dVar2.f921m) {
                if (j3 > j) {
                    break;
                }
            } else {
                dVar = dVar2;
            }
        }
        return dVar;
    }

    @Override // L0.AbstractC0105a
    public final InterfaceC0129z b(B b2, P0.e eVar, long j) {
        A0.f a3 = a(b2);
        A0.f fVar = new A0.f(this.f4042d.f34c, 0, b2);
        InterfaceC1726z interfaceC1726z = this.f501t;
        w0.j jVar = this.f4045g;
        AbstractC1550k.h(jVar);
        return new k(this.f492h, this.f498q, this.j, interfaceC1726z, this.f494l, fVar, this.f495m, a3, eVar, this.f493k, this.f496n, this.f497p, jVar);
    }

    @Override // L0.AbstractC0105a
    public final synchronized C1447v h() {
        return this.f502v;
    }

    @Override // L0.AbstractC0105a
    public final void j() {
        C0.c cVar = this.f498q;
        P0.o oVar = cVar.f914g;
        if (oVar != null) {
            oVar.a();
        }
        Uri uri = cVar.f917l;
        if (uri != null) {
            C0.b bVar = (C0.b) cVar.f911d.get(uri);
            bVar.f897b.a();
            IOException iOException = bVar.f904k;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // L0.AbstractC0105a
    public final void l(InterfaceC1726z interfaceC1726z) {
        this.f501t = interfaceC1726z;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        w0.j jVar = this.f4045g;
        AbstractC1550k.h(jVar);
        A0.j jVar2 = this.f494l;
        jVar2.c(myLooper, jVar);
        jVar2.prepare();
        A0.f a3 = a(null);
        C1444s c1444s = h().f18249b;
        c1444s.getClass();
        C0.c cVar = this.f498q;
        cVar.getClass();
        cVar.f915h = AbstractC1560u.m(null);
        cVar.f913f = a3;
        cVar.j = this;
        P0.r rVar = new P0.r(((InterfaceC1707g) cVar.f908a.f9143b).g(), c1444s.f18242a, 4, cVar.f909b.o());
        AbstractC1550k.g(cVar.f914g == null);
        P0.o oVar = new P0.o(StubApp.getString2(481));
        cVar.f914g = oVar;
        I4.e eVar = cVar.f910c;
        int i3 = rVar.f5437c;
        oVar.f(rVar, cVar, eVar.t(i3));
        a3.h(new C0123t(rVar.f5436b), i3, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // L0.AbstractC0105a
    public final void n(InterfaceC0129z interfaceC0129z) {
        k kVar = (k) interfaceC0129z;
        kVar.f471b.f912e.remove(kVar);
        for (r rVar : kVar.f488w) {
            if (rVar.f526G) {
                for (q qVar : rVar.f566y) {
                    qVar.g();
                    Z9.q qVar2 = qVar.f4021h;
                    if (qVar2 != null) {
                        qVar2.I(qVar.f4018e);
                        qVar.f4021h = null;
                        qVar.f4020g = null;
                    }
                }
            }
            i iVar = rVar.f541d;
            C0.b bVar = (C0.b) iVar.f430g.f911d.get(iVar.f428e[iVar.f439q.l()]);
            if (bVar != null) {
                bVar.f905l = false;
            }
            iVar.f436n = null;
            rVar.f546k.e(rVar);
            rVar.f562t.removeCallbacksAndMessages(null);
            rVar.f530L = true;
            rVar.f563v.clear();
        }
        kVar.f485s = null;
    }

    @Override // L0.AbstractC0105a
    public final void q() {
        C0.c cVar = this.f498q;
        cVar.f917l = null;
        cVar.f918m = null;
        cVar.f916k = null;
        cVar.f920p = -9223372036854775807L;
        cVar.f914g.e(null);
        cVar.f914g = null;
        HashMap hashMap = cVar.f911d;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((C0.b) it.next()).f897b.e(null);
        }
        cVar.f915h.removeCallbacksAndMessages(null);
        cVar.f915h = null;
        hashMap.clear();
        this.f494l.release();
    }

    @Override // L0.AbstractC0105a
    public final synchronized void v(C1447v c1447v) {
        this.f502v = c1447v;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(C0.i r39) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.l.x(C0.i):void");
    }
}
