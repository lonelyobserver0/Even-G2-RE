package L0;

import android.content.Context;
import android.net.Uri;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import l4.C1145A;
import l4.C1221y;
import o0.AbstractC1405B;
import o0.C1437l;
import o0.C1438m;
import o0.C1441p;
import o0.C1442q;
import o0.C1443r;
import o0.C1444s;
import o0.C1445t;
import o0.C1446u;
import o0.C1447v;
import r0.AbstractC1560u;
import t0.InterfaceC1707g;

/* renamed from: L0.p, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0120p implements A {

    /* renamed from: a, reason: collision with root package name */
    public final Ac.e f4115a;

    /* renamed from: b, reason: collision with root package name */
    public Y.m f4116b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4117c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4118d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4119e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4120f;

    /* renamed from: g, reason: collision with root package name */
    public final float f4121g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4122h;

    public C0120p(Context context) {
        this(new Y.m(context), new T0.m());
    }

    public static A d(Class cls, Y.m mVar) {
        try {
            return (A) cls.getConstructor(InterfaceC1707g.class).newInstance(mVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // L0.A
    public final void a(C1145A c1145a) {
        Ac.e eVar = this.f4115a;
        eVar.f319f = c1145a;
        T0.m mVar = (T0.m) eVar.f315b;
        synchronized (mVar) {
            mVar.f7039c = c1145a;
        }
        Iterator it = ((HashMap) eVar.f317d).values().iterator();
        while (it.hasNext()) {
            ((A) it.next()).a(c1145a);
        }
    }

    @Override // L0.A
    public final void b(boolean z2) {
        this.f4122h = z2;
        Ac.e eVar = this.f4115a;
        eVar.f314a = z2;
        T0.m mVar = (T0.m) eVar.f315b;
        synchronized (mVar) {
            mVar.f7038b = z2;
        }
        Iterator it = ((HashMap) eVar.f317d).values().iterator();
        while (it.hasNext()) {
            ((A) it.next()).b(z2);
        }
    }

    @Override // L0.A
    public final AbstractC0105a c(C1447v c1447v) {
        C1447v c1447v2;
        List list;
        Uri uri;
        String str;
        long j;
        c1447v.f18249b.getClass();
        String scheme = c1447v.f18249b.f18242a.getScheme();
        if (scheme != null && scheme.equals(StubApp.getString2(3316))) {
            throw null;
        }
        if (Objects.equals(c1447v.f18249b.f18243b, StubApp.getString2(3317))) {
            long j3 = c1447v.f18249b.f18246e;
            int i3 = AbstractC1560u.f20190a;
            throw null;
        }
        C1444s c1444s = c1447v.f18249b;
        int D6 = AbstractC1560u.D(c1444s.f18242a, c1444s.f18243b);
        if (c1447v.f18249b.f18246e != -9223372036854775807L) {
            T0.m mVar = (T0.m) this.f4115a.f315b;
            synchronized (mVar) {
                mVar.f7040d = 1;
            }
        }
        try {
            Ac.e eVar = this.f4115a;
            HashMap hashMap = (HashMap) eVar.f317d;
            A a3 = (A) hashMap.get(Integer.valueOf(D6));
            if (a3 == null) {
                a3 = (A) eVar.d(D6).get();
                a3.a((C1145A) eVar.f319f);
                a3.b(eVar.f314a);
                hashMap.put(Integer.valueOf(D6), a3);
            }
            C1442q a9 = c1447v.f18250c.a();
            C1443r c1443r = c1447v.f18250c;
            if (c1443r.f18237a == -9223372036854775807L) {
                a9.f18232a = this.f4117c;
            }
            if (c1443r.f18240d == -3.4028235E38f) {
                a9.f18235d = this.f4120f;
            }
            if (c1443r.f18241e == -3.4028235E38f) {
                a9.f18236e = this.f4121g;
            }
            if (c1443r.f18238b == -9223372036854775807L) {
                a9.f18233b = this.f4118d;
            }
            if (c1443r.f18239c == -9223372036854775807L) {
                a9.f18234c = this.f4119e;
            }
            C1443r c1443r2 = new C1443r(a9);
            if (c1443r2.equals(c1447v.f18250c)) {
                c1447v2 = c1447v;
            } else {
                new C1221y();
                List list2 = Collections.EMPTY_LIST;
                M4.I i10 = M4.Z.f4578e;
                C1445t c1445t = C1445t.f18247a;
                C1441p c1441p = c1447v.f18252e;
                T0.s sVar = new T0.s();
                sVar.f7043a = c1441p.f18231a;
                String str2 = c1447v.f18248a;
                o0.y yVar = c1447v.f18251d;
                c1447v.f18250c.a();
                C1445t c1445t2 = c1447v.f18253f;
                C1444s c1444s2 = c1447v.f18249b;
                if (c1444s2 != null) {
                    String str3 = c1444s2.f18243b;
                    Uri uri2 = c1444s2.f18242a;
                    List list3 = c1444s2.f18244c;
                    i10 = c1444s2.f18245d;
                    M4.G g10 = M4.I.f4549b;
                    M4.Z z2 = M4.Z.f4578e;
                    str = str3;
                    uri = uri2;
                    list = list3;
                    j = c1444s2.f18246e;
                } else {
                    list = list2;
                    uri = null;
                    str = null;
                    j = -9223372036854775807L;
                }
                M4.I i11 = i10;
                C1442q a10 = c1443r2.a();
                C1444s c1444s3 = uri != null ? new C1444s(uri, str, null, list, i11, j) : null;
                if (str2 == null) {
                    str2 = "";
                }
                String str4 = str2;
                C1441p c1441p2 = new C1441p(sVar);
                C1443r c1443r3 = new C1443r(a10);
                if (yVar == null) {
                    yVar = o0.y.f18281B;
                }
                c1447v2 = new C1447v(str4, c1441p2, c1444s3, c1443r3, yVar, c1445t2);
            }
            AbstractC0105a c10 = a3.c(c1447v2);
            M4.I i12 = c1447v2.f18249b.f18245d;
            if (!i12.isEmpty()) {
                AbstractC0105a[] abstractC0105aArr = new AbstractC0105a[i12.size() + 1];
                abstractC0105aArr[0] = c10;
                if (i12.size() > 0) {
                    if (!this.f4122h) {
                        this.f4116b.getClass();
                        C1446u c1446u = (C1446u) i12.get(0);
                        new ArrayList(1);
                        new HashSet(1);
                        new CopyOnWriteArrayList();
                        new CopyOnWriteArrayList();
                        M4.G g11 = M4.I.f4549b;
                        M4.Z z10 = M4.Z.f4578e;
                        List list4 = Collections.EMPTY_LIST;
                        M4.Z z11 = M4.Z.f4578e;
                        C1445t c1445t3 = C1445t.f18247a;
                        Uri uri3 = Uri.EMPTY;
                        c1446u.getClass();
                        throw null;
                    }
                    C1437l c1437l = new C1437l();
                    ((C1446u) i12.get(0)).getClass();
                    ArrayList arrayList = AbstractC1405B.f18019a;
                    c1437l.f18177m = null;
                    ((C1446u) i12.get(0)).getClass();
                    c1437l.f18169d = null;
                    ((C1446u) i12.get(0)).getClass();
                    c1437l.f18170e = 0;
                    ((C1446u) i12.get(0)).getClass();
                    c1437l.f18171f = 0;
                    ((C1446u) i12.get(0)).getClass();
                    c1437l.f18167b = null;
                    ((C1446u) i12.get(0)).getClass();
                    c1437l.f18166a = null;
                    new C1438m(c1437l);
                    ((C1446u) i12.get(0)).getClass();
                    throw null;
                }
                c10 = new K(abstractC0105aArr);
            }
            long j10 = c1447v2.f18252e.f18231a;
            if (j10 != Long.MIN_VALUE) {
                c10 = new C0111g(c10, j10, true);
            }
            c1447v2.f18249b.getClass();
            c1447v2.f18249b.getClass();
            return c10;
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public C0120p(Y.m mVar, T0.m mVar2) {
        this.f4116b = mVar;
        Ac.e eVar = new Ac.e(mVar2, new C1145A(22));
        this.f4115a = eVar;
        if (mVar != ((Y.m) eVar.f318e)) {
            eVar.f318e = mVar;
            ((HashMap) eVar.f316c).clear();
            ((HashMap) eVar.f317d).clear();
        }
        this.f4117c = -9223372036854775807L;
        this.f4118d = -9223372036854775807L;
        this.f4119e = -9223372036854775807L;
        this.f4120f = -3.4028235E38f;
        this.f4121g = -3.4028235E38f;
        this.f4122h = true;
    }
}
