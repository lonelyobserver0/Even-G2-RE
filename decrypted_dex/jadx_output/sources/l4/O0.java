package l4;

import Z9.C0366a;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.gms.net.CronetProviderInstaller;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.stub.StubApp;
import i.RunnableC1018B;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import o2.AbstractC1455b;
import q3.C1514g;
import q3.HandlerC1519l;
import r3.C1566a;
import u3.C1773b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class O0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16203a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16204b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f16205c;

    public /* synthetic */ O0(int i3, Object obj, Object obj2) {
        this.f16203a = i3;
        this.f16204b = obj;
        this.f16205c = obj2;
    }

    private final void a() {
        synchronized (((q4.p) this.f16205c).f20069c) {
            try {
                q4.e eVar = (q4.e) ((q4.p) this.f16205c).f20070d;
                if (eVar != null) {
                    Exception exception = ((q4.j) this.f16204b).getException();
                    S3.D.h(exception);
                    eVar.C(exception);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        synchronized (((q4.p) this.f16205c).f20069c) {
            try {
                q4.f fVar = (q4.f) ((q4.p) this.f16205c).f20070d;
                if (fVar != null) {
                    fVar.i(((q4.j) this.f16204b).getResult());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16203a) {
            case 0:
                C1200n0 c1200n0 = (C1200n0) ((P0) this.f16204b).f4728a;
                C1156L q10 = c1200n0.q();
                String str = q10.f16145s;
                String str2 = (String) this.f16205c;
                boolean z2 = (str == null || str.equals(str2)) ? false : true;
                q10.f16145s = str2;
                if (z2) {
                    c1200n0.q().p();
                    return;
                }
                return;
            case 1:
                C1189j1 c1189j1 = (C1189j1) this.f16205c;
                InterfaceC1151G interfaceC1151G = c1189j1.f16480d;
                C1200n0 c1200n02 = (C1200n0) c1189j1.f4728a;
                if (interfaceC1151G == null) {
                    T t3 = c1200n02.f16541f;
                    C1200n0.l(t3);
                    t3.f16242f.b(StubApp.getString2(20050));
                    return;
                }
                try {
                    X0 x02 = (X0) this.f16204b;
                    if (x02 == null) {
                        interfaceC1151G.m(0L, null, null, c1200n02.f16536a.getPackageName());
                    } else {
                        interfaceC1151G.m(x02.f16319c, x02.f16317a, x02.f16318b, c1200n02.f16536a.getPackageName());
                    }
                    c1189j1.x();
                    return;
                } catch (RemoteException e10) {
                    T t10 = ((C1200n0) c1189j1.f4728a).f16541f;
                    C1200n0.l(t10);
                    t10.f16242f.c(e10, StubApp.getString2(20051));
                    return;
                }
            case 2:
                ((ServiceConnectionC1186i1) this.f16205c).f16467c.v((ComponentName) this.f16204b);
                return;
            case 3:
                C1189j1 c1189j12 = ((ServiceConnectionC1186i1) this.f16205c).f16467c;
                c1189j12.f16480d = null;
                if (((com.google.android.gms.common.b) this.f16204b).f11176b != 7777) {
                    c1189j12.z();
                    return;
                }
                if (c1189j12.f16483g == null) {
                    c1189j12.f16483g = Executors.newScheduledThreadPool(1);
                }
                c1189j12.f16483g.schedule(new RunnableC1018B(this, 7), ((Long) AbstractC1148D.f15971Z.a(null)).longValue(), TimeUnit.MILLISECONDS);
                return;
            case 4:
                F1 f12 = (F1) this.f16204b;
                f12.A();
                f12.b().k();
                if (f12.f16073r == null) {
                    f12.f16073r = new ArrayList();
                }
                f12.f16073r.add((Runnable) this.f16205c);
                f12.q();
                return;
            case 5:
                C0366a c0366a = (C0366a) this.f16204b;
                Log.v(StubApp.getString2(11932), StubApp.getString2(20049));
                ((InterfaceC1198m1) ((Service) c0366a.f9105b)).c((JobParameters) this.f16205c);
                return;
            case 6:
                Context context = (Context) this.f16204b;
                q4.k kVar = (q4.k) this.f16205c;
                try {
                    CronetProviderInstaller.zzc(context);
                    kVar.b(null);
                    return;
                } catch (Exception e11) {
                    kVar.a(e11);
                    return;
                }
            case 7:
                Iterator it = ((ArrayList) this.f16204b).iterator();
                while (it.hasNext()) {
                    AbstractC1455b abstractC1455b = (AbstractC1455b) it.next();
                    Object obj = ((p2.d) this.f16205c).f19664e;
                    abstractC1455b.f18359b = obj;
                    abstractC1455b.d(abstractC1455b.f18361d, obj);
                }
                return;
            case 8:
                C1514g c1514g = ((HandlerC1519l) this.f16205c).f20046a;
                C1773b c1773b = (C1773b) this.f16204b;
                if (c1514g.h0 == 2) {
                    c1514g.h0 = 3;
                    B3.s sVar = c1514g.f20000s;
                    int i3 = c1514g.f19991g.f20023c;
                    F5.c cVar = (F5.c) sVar.f652d;
                    if (cVar != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put(StubApp.getString2(20047), Integer.valueOf(i3));
                        ((Va.a) cVar.f2238b).f7914b.invokeMethod(StubApp.getString2(20048), hashMap);
                    }
                }
                if (c1773b.f21436d) {
                    D5.B b2 = c1514g.f19988d;
                    synchronized (((ArrayList) b2.f1342c)) {
                        while (((ArrayList) b2.f1342c).size() >= 8) {
                            try {
                                ((C1773b) ((ArrayList) b2.f1342c).remove(0)).f21434b.recycle();
                            } finally {
                            }
                        }
                        ArrayList arrayList = (ArrayList) b2.f1342c;
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                arrayList.add(c1773b);
                            } else if (((C1773b) it2.next()).equals(c1773b)) {
                                c1773b.f21434b.recycle();
                            }
                        }
                    }
                } else {
                    D5.B b10 = c1514g.f19988d;
                    synchronized (b10.f1343d) {
                        b10.H();
                        ((PriorityQueue) b10.f1341b).offer(c1773b);
                    }
                }
                c1514g.invalidate();
                return;
            case 9:
                B3.s sVar2 = ((HandlerC1519l) this.f16205c).f20046a.f20000s;
                C1566a c1566a = (C1566a) this.f16204b;
                int i10 = c1566a.f20321a;
                Throwable cause = c1566a.getCause();
                A0.c cVar2 = (A0.c) sVar2.f650b;
                if (cVar2 == null) {
                    Log.e(StubApp.getString2(4932), StubApp.getString2(20046) + c1566a.f20321a, c1566a.getCause());
                    return;
                } else {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(StubApp.getString2(6765), Integer.valueOf(i10));
                    hashMap2.put(StubApp.getString2(435), cause.toString());
                    ((Va.a) cVar2.f29a).f7914b.invokeMethod(StubApp.getString2(20045), hashMap2);
                    return;
                }
            case 10:
                q4.j jVar = (q4.j) this.f16204b;
                boolean isCanceled = jVar.isCanceled();
                q4.o oVar = (q4.o) this.f16205c;
                if (isCanceled) {
                    oVar.f20066d.c();
                    return;
                }
                try {
                    oVar.f20066d.b(oVar.f20065c.e(jVar));
                    return;
                } catch (q4.h e12) {
                    if (e12.getCause() instanceof Exception) {
                        oVar.f20066d.a((Exception) e12.getCause());
                        return;
                    } else {
                        oVar.f20066d.a(e12);
                        return;
                    }
                } catch (Exception e13) {
                    oVar.f20066d.a(e13);
                    return;
                }
            case 11:
                q4.o oVar2 = (q4.o) this.f16205c;
                try {
                    q4.j jVar2 = (q4.j) oVar2.f20065c.e((q4.j) this.f16204b);
                    if (jVar2 == null) {
                        oVar2.C(new NullPointerException(StubApp.getString2(20044)));
                        return;
                    }
                    T4.d dVar = q4.l.f20053b;
                    jVar2.addOnSuccessListener(dVar, oVar2);
                    jVar2.addOnFailureListener(dVar, oVar2);
                    jVar2.addOnCanceledListener(dVar, oVar2);
                    return;
                } catch (q4.h e14) {
                    if (e14.getCause() instanceof Exception) {
                        oVar2.f20066d.a((Exception) e14.getCause());
                        return;
                    } else {
                        oVar2.f20066d.a(e14);
                        return;
                    }
                } catch (Exception e15) {
                    oVar2.f20066d.a(e15);
                    return;
                }
            case 12:
                synchronized (((q4.p) this.f16205c).f20069c) {
                    try {
                        q4.d dVar2 = (q4.d) ((q4.p) this.f16205c).f20070d;
                        if (dVar2 != null) {
                            dVar2.j((q4.j) this.f16204b);
                        }
                    } finally {
                    }
                }
                return;
            case 13:
                a();
                return;
            case 14:
                b();
                return;
            case 15:
                q4.p pVar = (q4.p) this.f16205c;
                try {
                    q4.j k3 = ((q4.i) pVar.f20069c).k(((q4.j) this.f16204b).getResult());
                    if (k3 == null) {
                        pVar.C(new NullPointerException(StubApp.getString2(20044)));
                        return;
                    }
                    T4.d dVar3 = q4.l.f20053b;
                    k3.addOnSuccessListener(dVar3, pVar);
                    k3.addOnFailureListener(dVar3, pVar);
                    k3.addOnCanceledListener(dVar3, pVar);
                    return;
                } catch (CancellationException unused) {
                    pVar.c();
                    return;
                } catch (q4.h e16) {
                    if (e16.getCause() instanceof Exception) {
                        pVar.C((Exception) e16.getCause());
                        return;
                    } else {
                        pVar.C(e16);
                        return;
                    }
                } catch (Exception e17) {
                    pVar.C(e17);
                    return;
                }
            case 16:
                q4.s sVar3 = (q4.s) this.f16204b;
                try {
                    sVar3.b(((Callable) this.f16205c).call());
                    return;
                } catch (Exception e18) {
                    sVar3.a(e18);
                    return;
                } catch (Throwable th) {
                    sVar3.a(new RuntimeException(th));
                    return;
                }
            case 17:
                s2.g gVar = (s2.g) this.f16204b;
                try {
                    ((Runnable) this.f16205c).run();
                    return;
                } finally {
                    gVar.a();
                }
            case 18:
                S.e eVar = ((SwipeDismissBehavior) this.f16205c).f11815a;
                if (eVar == null || !eVar.f()) {
                    return;
                }
                WeakHashMap weakHashMap = N.I.f4732a;
                ((View) this.f16204b).postOnAnimation(this);
                return;
            default:
                synchronized (((ConstraintTrackingWorker) this.f16205c).f10395g) {
                    if (((ConstraintTrackingWorker) this.f16205c).f10396h) {
                        ((ConstraintTrackingWorker) this.f16205c).j.j(new i2.l());
                    } else {
                        ((ConstraintTrackingWorker) this.f16205c).j.l((Q4.c) this.f16204b);
                    }
                }
                return;
        }
    }

    public /* synthetic */ O0(Object obj, Object obj2, int i3, boolean z2) {
        this.f16203a = i3;
        this.f16204b = obj2;
        this.f16205c = obj;
    }

    public O0(C0366a c0366a, F1 f12, Runnable runnable) {
        this.f16203a = 4;
        this.f16204b = f12;
        this.f16205c = runnable;
        Objects.requireNonNull(c0366a);
    }

    public O0(ServiceConnectionC1186i1 serviceConnectionC1186i1, com.google.android.gms.common.b bVar) {
        this.f16203a = 3;
        this.f16204b = bVar;
        Objects.requireNonNull(serviceConnectionC1186i1);
        this.f16205c = serviceConnectionC1186i1;
    }

    public O0(C1189j1 c1189j1, X0 x02) {
        this.f16203a = 1;
        this.f16204b = x02;
        Objects.requireNonNull(c1189j1);
        this.f16205c = c1189j1;
    }

    public O0(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z2) {
        this.f16203a = 18;
        this.f16205c = swipeDismissBehavior;
        this.f16204b = view;
    }
}
