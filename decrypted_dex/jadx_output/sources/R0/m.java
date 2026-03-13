package R0;

import M4.Z;
import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import com.stub.StubApp;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArraySet;
import l4.E0;
import o0.AbstractC1405B;
import o0.C1425W;
import o0.C1437l;
import o0.C1438m;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1555p;
import r0.C1557r;
import v0.C1828x;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class m {

    /* renamed from: o, reason: collision with root package name */
    public static final G1.c f6002o = new G1.c(1);

    /* renamed from: a, reason: collision with root package name */
    public final j f6003a;

    /* renamed from: b, reason: collision with root package name */
    public final n f6004b;

    /* renamed from: c, reason: collision with root package name */
    public final r f6005c;

    /* renamed from: d, reason: collision with root package name */
    public final l f6006d;

    /* renamed from: e, reason: collision with root package name */
    public final Z f6007e;

    /* renamed from: f, reason: collision with root package name */
    public final E0 f6008f;

    /* renamed from: g, reason: collision with root package name */
    public final C1555p f6009g;

    /* renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArraySet f6010h;

    /* renamed from: i, reason: collision with root package name */
    public C1438m f6011i;
    public C1828x j;

    /* renamed from: k, reason: collision with root package name */
    public C1557r f6012k;

    /* renamed from: l, reason: collision with root package name */
    public Pair f6013l;

    /* renamed from: m, reason: collision with root package name */
    public int f6014m;

    /* renamed from: n, reason: collision with root package name */
    public int f6015n;

    public m(K2.c cVar) {
        j jVar = new j(this, (Context) cVar.f3639c);
        this.f6003a = jVar;
        C1555p c1555p = (C1555p) cVar.f3644h;
        this.f6009g = c1555p;
        n nVar = (n) cVar.f3640d;
        this.f6004b = nVar;
        nVar.f6025k = c1555p;
        r rVar = new r(new A0.c(this), nVar);
        this.f6005c = rVar;
        l lVar = (l) cVar.f3642f;
        AbstractC1550k.h(lVar);
        this.f6006d = lVar;
        this.f6007e = (Z) cVar.f3643g;
        this.f6008f = new E0(nVar, rVar);
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.f6010h = copyOnWriteArraySet;
        this.f6015n = 0;
        copyOnWriteArraySet.add(jVar);
    }

    public static void a(m mVar, long j, long j3) {
        r rVar = mVar.f6005c;
        Ab.g gVar = rVar.f6055f;
        int i3 = gVar.f276c;
        if (i3 == 0) {
            return;
        }
        if (i3 == 0) {
            throw new NoSuchElementException();
        }
        long j10 = ((long[]) gVar.f278e)[gVar.f275b];
        Long l9 = (Long) rVar.f6054e.e(j10);
        n nVar = rVar.f6051b;
        if (l9 != null && l9.longValue() != rVar.f6058i) {
            rVar.f6058i = l9.longValue();
            nVar.d(2);
        }
        int a3 = rVar.f6051b.a(j10, j, j3, rVar.f6058i, false, rVar.f6052c);
        m mVar2 = (m) rVar.f6050a.f29a;
        if (a3 != 0 && a3 != 1) {
            if (a3 != 2 && a3 != 3 && a3 != 4) {
                if (a3 != 5) {
                    throw new IllegalStateException(String.valueOf(a3));
                }
                return;
            }
            rVar.j = j10;
            gVar.P();
            Iterator it = mVar2.f6010h.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                jVar.f5999m.execute(new i(jVar, jVar.f5998l, 2));
            }
            AbstractC1550k.h(null);
            throw null;
        }
        rVar.j = j10;
        C1425W c1425w = (C1425W) rVar.f6053d.e(gVar.P());
        if (c1425w != null && !c1425w.equals(C1425W.f18113d) && !c1425w.equals(rVar.f6057h)) {
            rVar.f6057h = c1425w;
            C1437l c1437l = new C1437l();
            c1437l.f18184t = c1425w.f18114a;
            c1437l.f18185u = c1425w.f18115b;
            c1437l.f18177m = AbstractC1405B.m(StubApp.getString2(5589));
            mVar2.f6011i = new C1438m(c1437l);
            Iterator it2 = mVar2.f6010h.iterator();
            while (it2.hasNext()) {
                j jVar2 = (j) it2.next();
                jVar2.f5999m.execute(new i(jVar2, jVar2.f5998l, c1425w));
            }
        }
        boolean z2 = nVar.f6019d != 3;
        nVar.f6019d = 3;
        nVar.f6025k.getClass();
        nVar.f6021f = AbstractC1560u.J(SystemClock.elapsedRealtime());
        if (z2 && mVar2.f6013l != null) {
            Iterator it3 = mVar2.f6010h.iterator();
            while (it3.hasNext()) {
                j jVar3 = (j) it3.next();
                jVar3.f5999m.execute(new i(jVar3, jVar3.f5998l, 1));
            }
        }
        if (mVar2.j != null) {
            if (mVar2.f6011i == null) {
                new C1437l().a();
            }
            C1828x c1828x = mVar2.j;
            mVar2.f6009g.getClass();
            System.nanoTime();
            c1828x.c();
        }
        AbstractC1550k.h(null);
        throw null;
    }
}
