package R3;

import S3.AbstractC0271e;
import S3.C0280n;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Status;
import com.stub.StubApp;
import i5.C1059c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import l4.E0;
import n4.C1383a;
import no.nordicsemi.android.dfu.DfuServiceInitiator;
import o4.C1458a;
import r0.C1552m;
import t.C1692e;
import t.C1693f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class r implements Q3.i, Q3.j {

    /* renamed from: f, reason: collision with root package name */
    public final Q3.c f6149f;

    /* renamed from: g, reason: collision with root package name */
    public final C0233b f6150g;

    /* renamed from: h, reason: collision with root package name */
    public final E0 f6151h;

    /* renamed from: k, reason: collision with root package name */
    public final int f6153k;

    /* renamed from: l, reason: collision with root package name */
    public final C f6154l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6155m;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0236e f6159q;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedList f6148e = new LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final HashSet f6152i = new HashSet();
    public final HashMap j = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f6156n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public com.google.android.gms.common.b f6157o = null;

    /* renamed from: p, reason: collision with root package name */
    public int f6158p = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public r(C0236e c0236e, Q3.h hVar) {
        this.f6159q = c0236e;
        Looper looper = c0236e.f6135p.getLooper();
        Q2.g a3 = hVar.a();
        C1059c c1059c = new C1059c((String) a3.f5712c, (String) a3.f5713d, (C1693f) a3.f5711b);
        Ec.d dVar = hVar.f5723c.f5715a;
        S3.D.h(dVar);
        Q3.c n10 = dVar.n(hVar.f5721a, looper, c1059c, hVar.f5724d, this, this);
        String str = hVar.f5722b;
        if (str != null && (n10 instanceof AbstractC0271e)) {
            ((AbstractC0271e) n10).f6508v = str;
        }
        if (str != null && (n10 instanceof m)) {
            Xa.h.x(n10);
            throw null;
        }
        this.f6149f = n10;
        this.f6150g = hVar.f5725e;
        this.f6151h = new E0(19);
        this.f6153k = hVar.f5726f;
        if (!n10.m()) {
            this.f6154l = null;
            return;
        }
        Context context = c0236e.f6127e;
        c4.h hVar2 = c0236e.f6135p;
        Q2.g a9 = hVar.a();
        this.f6154l = new C(context, hVar2, new C1059c((String) a9.f5712c, (String) a9.f5713d, (C1693f) a9.f5711b));
    }

    public final void a(com.google.android.gms.common.b bVar) {
        String str;
        HashSet hashSet = this.f6152i;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            F f10 = (F) it.next();
            if (S3.D.k(bVar, com.google.android.gms.common.b.f11174e)) {
                this.f6149f.g();
                str = StubApp.getString2(0);
            } else {
                str = null;
            }
            f10.a(this.f6150g, bVar, str);
        }
        hashSet.clear();
    }

    public final void b(Status status) {
        S3.D.d(this.f6159q.f6135p);
        c(status, null, false);
    }

    public final void c(Status status, RuntimeException runtimeException, boolean z2) {
        S3.D.d(this.f6159q.f6135p);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException(StubApp.getString2(5646));
        }
        Iterator it = this.f6148e.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            if (!z2 || wVar.f6164a == 2) {
                if (status != null) {
                    wVar.c(status);
                } else {
                    wVar.d(runtimeException);
                }
                it.remove();
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.f6148e;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            w wVar = (w) arrayList.get(i3);
            if (!this.f6149f.i()) {
                return;
            }
            if (k(wVar)) {
                linkedList.remove(wVar);
            }
        }
    }

    @Override // Q3.i
    public final void e(int i3) {
        Looper myLooper = Looper.myLooper();
        C0236e c0236e = this.f6159q;
        if (myLooper == c0236e.f6135p.getLooper()) {
            i(i3);
        } else {
            c0236e.f6135p.post(new K.a(i3, 1, this));
        }
    }

    @Override // Q3.i
    public final void f() {
        Looper myLooper = Looper.myLooper();
        C0236e c0236e = this.f6159q;
        if (myLooper == c0236e.f6135p.getLooper()) {
            h();
        } else {
            c0236e.f6135p.post(new L9.n(this, 16));
        }
    }

    @Override // Q3.j
    public final void g(com.google.android.gms.common.b bVar) {
        o(bVar, null);
    }

    public final void h() {
        Q3.c cVar = this.f6149f;
        C0236e c0236e = this.f6159q;
        S3.D.d(c0236e.f6135p);
        this.f6157o = null;
        a(com.google.android.gms.common.b.f11174e);
        if (this.f6155m) {
            c4.h hVar = c0236e.f6135p;
            C0233b c0233b = this.f6150g;
            hVar.removeMessages(11, c0233b);
            c0236e.f6135p.removeMessages(9, c0233b);
            this.f6155m = false;
        }
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            Bc.i iVar = ((A) it.next()).f6077a;
            try {
                ((n) ((C1552m) iVar.f768d).f20170b).accept(cVar, new q4.k());
            } catch (DeadObjectException unused) {
                e(3);
                cVar.d(StubApp.getString2(5647));
            } catch (RemoteException unused2) {
                it.remove();
            }
        }
        d();
        j();
    }

    public final void i(int i3) {
        C0236e c0236e = this.f6159q;
        S3.D.d(c0236e.f6135p);
        this.f6157o = null;
        this.f6155m = true;
        String l9 = this.f6149f.l();
        E0 e02 = this.f6151h;
        e02.getClass();
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(5648));
        if (i3 == 1) {
            sb2.append(StubApp.getString2(5649));
        } else if (i3 == 3) {
            sb2.append(StubApp.getString2(5650));
        }
        if (l9 != null) {
            sb2.append(StubApp.getString2(5651));
            sb2.append(l9);
        }
        e02.N(true, new Status(20, sb2.toString(), null, null));
        c4.h hVar = c0236e.f6135p;
        C0233b c0233b = this.f6150g;
        hVar.sendMessageDelayed(Message.obtain(hVar, 9, c0233b), DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT);
        c4.h hVar2 = c0236e.f6135p;
        hVar2.sendMessageDelayed(Message.obtain(hVar2, 11, c0233b), 120000L);
        ((SparseIntArray) c0236e.f6129g.f9077b).clear();
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            ((A) it.next()).getClass();
        }
    }

    public final void j() {
        C0236e c0236e = this.f6159q;
        c4.h hVar = c0236e.f6135p;
        C0233b c0233b = this.f6150g;
        hVar.removeMessages(12, c0233b);
        c4.h hVar2 = c0236e.f6135p;
        hVar2.sendMessageDelayed(hVar2.obtainMessage(12, c0233b), c0236e.f6123a);
    }

    public final boolean k(w wVar) {
        com.google.android.gms.common.d dVar;
        String string2 = StubApp.getString2(5652);
        if (wVar == null) {
            Q3.c cVar = this.f6149f;
            wVar.f(this.f6151h, cVar.m());
            try {
                wVar.e(this);
                return true;
            } catch (DeadObjectException unused) {
                e(1);
                cVar.d(string2);
            }
        } else {
            com.google.android.gms.common.d[] b2 = wVar.b(this);
            if (b2 != null && b2.length != 0) {
                com.google.android.gms.common.d[] k3 = this.f6149f.k();
                if (k3 == null) {
                    k3 = new com.google.android.gms.common.d[0];
                }
                C1692e c1692e = new C1692e(k3.length);
                for (com.google.android.gms.common.d dVar2 : k3) {
                    c1692e.put(dVar2.f11182a, Long.valueOf(dVar2.d()));
                }
                int length = b2.length;
                for (int i3 = 0; i3 < length; i3++) {
                    dVar = b2[i3];
                    Long l9 = (Long) c1692e.get(dVar.f11182a);
                    if (l9 == null || l9.longValue() < dVar.d()) {
                        break;
                    }
                }
            }
            dVar = null;
            if (dVar != null) {
                Log.w(StubApp.getString2(5245), this.f6149f.getClass().getName() + StubApp.getString2(5653) + dVar.f11182a + StubApp.getString2(81) + dVar.d() + StubApp.getString2(1920));
                if (!this.f6159q.f6136q || !wVar.a(this)) {
                    wVar.d(new Q3.n(dVar));
                    return true;
                }
                s sVar = new s(this.f6150g, dVar);
                int indexOf = this.f6156n.indexOf(sVar);
                if (indexOf >= 0) {
                    s sVar2 = (s) this.f6156n.get(indexOf);
                    this.f6159q.f6135p.removeMessages(15, sVar2);
                    c4.h hVar = this.f6159q.f6135p;
                    hVar.sendMessageDelayed(Message.obtain(hVar, 15, sVar2), DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT);
                } else {
                    this.f6156n.add(sVar);
                    c4.h hVar2 = this.f6159q.f6135p;
                    hVar2.sendMessageDelayed(Message.obtain(hVar2, 15, sVar), DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT);
                    c4.h hVar3 = this.f6159q.f6135p;
                    hVar3.sendMessageDelayed(Message.obtain(hVar3, 16, sVar), 120000L);
                    com.google.android.gms.common.b bVar = new com.google.android.gms.common.b(2, null);
                    if (!l(bVar)) {
                        C0236e c0236e = this.f6159q;
                        c0236e.f6128f.zah(c0236e.f6127e, bVar, this.f6153k);
                    }
                }
                return false;
            }
            Q3.c cVar2 = this.f6149f;
            wVar.f(this.f6151h, cVar2.m());
            try {
                wVar.e(this);
                return true;
            } catch (DeadObjectException unused2) {
                e(1);
                cVar2.d(string2);
            }
        }
        return true;
    }

    public final boolean l(com.google.android.gms.common.b bVar) {
        synchronized (C0236e.f6121t) {
            try {
                C0236e c0236e = this.f6159q;
                if (c0236e.f6132l == null || !c0236e.f6133m.contains(this.f6150g)) {
                    return false;
                }
                this.f6159q.f6132l.l(bVar, this.f6153k);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m() {
        C0236e c0236e = this.f6159q;
        S3.D.d(c0236e.f6135p);
        Q3.c cVar = this.f6149f;
        if (cVar.i() || cVar.f()) {
            return;
        }
        try {
            Z9.C c10 = c0236e.f6129g;
            Context context = c0236e.f6127e;
            c10.getClass();
            S3.D.h(context);
            int j = cVar.j();
            SparseIntArray sparseIntArray = (SparseIntArray) c10.f9077b;
            int i3 = sparseIntArray.get(j, -1);
            if (i3 == -1) {
                i3 = 0;
                int i10 = 0;
                while (true) {
                    if (i10 >= sparseIntArray.size()) {
                        i3 = -1;
                        break;
                    }
                    int keyAt = sparseIntArray.keyAt(i10);
                    if (keyAt > j && sparseIntArray.get(keyAt) == 0) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i3 == -1) {
                    i3 = ((GoogleApiAvailability) c10.f9078c).isGooglePlayServicesAvailable(context, j);
                }
                sparseIntArray.put(j, i3);
            }
            if (i3 != 0) {
                com.google.android.gms.common.b bVar = new com.google.android.gms.common.b(i3, null);
                Log.w(StubApp.getString2("5245"), StubApp.getString2("5654") + cVar.getClass().getName() + StubApp.getString2("5655") + bVar.toString());
                o(bVar, null);
                return;
            }
            Ac.e eVar = new Ac.e(c0236e, cVar, this.f6150g);
            if (cVar.m()) {
                C c11 = this.f6154l;
                S3.D.h(c11);
                C1458a c1458a = c11.f6085k;
                if (c1458a != null) {
                    c1458a.h();
                }
                Integer valueOf = Integer.valueOf(System.identityHashCode(c11));
                C1059c c1059c = c11.j;
                c1059c.f14848g = valueOf;
                c4.h hVar = c11.f6082g;
                c11.f6085k = (C1458a) c11.f6083h.n(c11.f6081f, hVar.getLooper(), c1059c, (C1383a) c1059c.f14847f, c11, c11);
                c11.f6086l = eVar;
                Set set = c11.f6084i;
                if (set == null || set.isEmpty()) {
                    hVar.post(new L9.n(c11, 18));
                } else {
                    C1458a c1458a2 = c11.f6085k;
                    c1458a2.getClass();
                    c1458a2.c(new C0280n(c1458a2));
                }
            }
            try {
                cVar.c(eVar);
            } catch (SecurityException e10) {
                o(new com.google.android.gms.common.b(10), e10);
            }
        } catch (IllegalStateException e11) {
            o(new com.google.android.gms.common.b(10), e11);
        }
    }

    public final void n(w wVar) {
        S3.D.d(this.f6159q.f6135p);
        boolean i3 = this.f6149f.i();
        LinkedList linkedList = this.f6148e;
        if (i3) {
            if (k(wVar)) {
                j();
                return;
            } else {
                linkedList.add(wVar);
                return;
            }
        }
        linkedList.add(wVar);
        com.google.android.gms.common.b bVar = this.f6157o;
        if (bVar == null || bVar.f11176b == 0 || bVar.f11177c == null) {
            m();
        } else {
            o(bVar, null);
        }
    }

    public final void o(com.google.android.gms.common.b bVar, RuntimeException runtimeException) {
        C1458a c1458a;
        S3.D.d(this.f6159q.f6135p);
        C c10 = this.f6154l;
        if (c10 != null && (c1458a = c10.f6085k) != null) {
            c1458a.h();
        }
        S3.D.d(this.f6159q.f6135p);
        this.f6157o = null;
        ((SparseIntArray) this.f6159q.f6129g.f9077b).clear();
        a(bVar);
        if ((this.f6149f instanceof U3.d) && bVar.f11176b != 24) {
            C0236e c0236e = this.f6159q;
            c0236e.f6124b = true;
            c4.h hVar = c0236e.f6135p;
            hVar.sendMessageDelayed(hVar.obtainMessage(19), 300000L);
        }
        if (bVar.f11176b == 4) {
            b(C0236e.f6120s);
            return;
        }
        if (this.f6148e.isEmpty()) {
            this.f6157o = bVar;
            return;
        }
        if (runtimeException != null) {
            S3.D.d(this.f6159q.f6135p);
            c(null, runtimeException, false);
            return;
        }
        if (!this.f6159q.f6136q) {
            b(C0236e.c(this.f6150g, bVar));
            return;
        }
        c(C0236e.c(this.f6150g, bVar), null, true);
        if (this.f6148e.isEmpty() || l(bVar)) {
            return;
        }
        C0236e c0236e2 = this.f6159q;
        if (c0236e2.f6128f.zah(c0236e2.f6127e, bVar, this.f6153k)) {
            return;
        }
        if (bVar.f11176b == 18) {
            this.f6155m = true;
        }
        if (!this.f6155m) {
            b(C0236e.c(this.f6150g, bVar));
            return;
        }
        C0236e c0236e3 = this.f6159q;
        C0233b c0233b = this.f6150g;
        c4.h hVar2 = c0236e3.f6135p;
        hVar2.sendMessageDelayed(Message.obtain(hVar2, 9, c0233b), DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT);
    }

    public final void p(com.google.android.gms.common.b bVar) {
        S3.D.d(this.f6159q.f6135p);
        Q3.c cVar = this.f6149f;
        cVar.d(StubApp.getString2(5656) + cVar.getClass().getName() + StubApp.getString2(52) + String.valueOf(bVar));
        o(bVar, null);
    }

    public final void q() {
        S3.D.d(this.f6159q.f6135p);
        Status status = C0236e.f6119r;
        b(status);
        this.f6151h.N(false, status);
        for (C0241j c0241j : (C0241j[]) this.j.keySet().toArray(new C0241j[0])) {
            n(new D(c0241j, new q4.k()));
        }
        a(new com.google.android.gms.common.b(4));
        Q3.c cVar = this.f6149f;
        if (cVar.i()) {
            cVar.a(new Z9.q(this, 18));
        }
    }
}
