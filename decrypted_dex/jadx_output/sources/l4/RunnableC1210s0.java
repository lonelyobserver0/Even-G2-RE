package l4;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import q2.C1506a;
import t2.C1728a;

/* renamed from: l4.s0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class RunnableC1210s0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16619a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16620b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16621c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16623e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16624f;

    public /* synthetic */ RunnableC1210s0(BinderC1212t0 binderC1212t0, M1 m12, Bundle bundle, InterfaceC1153I interfaceC1153I, String str) {
        this.f16622d = binderC1212t0;
        this.f16621c = m12;
        this.f16623e = bundle;
        this.f16624f = interfaceC1153I;
        this.f16620b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C1189j1 c1189j1;
        InterfaceC1151G interfaceC1151G;
        K1 k12;
        InterfaceC1151G interfaceC1151G2;
        switch (this.f16619a) {
            case 0:
                InterfaceC1153I interfaceC1153I = (InterfaceC1153I) this.f16624f;
                F1 f12 = ((BinderC1212t0) this.f16622d).f16629e;
                f12.A();
                try {
                    interfaceC1153I.F(f12.b0((Bundle) this.f16623e, (M1) this.f16621c));
                    return;
                } catch (RemoteException e10) {
                    f12.a().f16242f.d(StubApp.getString2(20886), (String) this.f16620b, e10);
                    return;
                }
            case 1:
                AtomicReference atomicReference2 = (AtomicReference) this.f16622d;
                synchronized (atomicReference2) {
                    try {
                        try {
                            c1189j1 = (C1189j1) this.f16624f;
                            interfaceC1151G = c1189j1.f16480d;
                        } catch (RemoteException e11) {
                            T t3 = ((C1200n0) ((C1189j1) this.f16624f).f4728a).f16541f;
                            C1200n0.l(t3);
                            t3.f16242f.e(StubApp.getString2("20885"), null, (String) this.f16620b, e11);
                            ((AtomicReference) this.f16622d).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.f16622d;
                        }
                        if (interfaceC1151G == null) {
                            T t10 = ((C1200n0) c1189j1.f4728a).f16541f;
                            C1200n0.l(t10);
                            t10.f16242f.e(StubApp.getString2("20884"), null, (String) this.f16620b, (String) this.f16623e);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(interfaceC1151G.x((String) this.f16620b, (String) this.f16623e, (M1) this.f16621c));
                        } else {
                            atomicReference2.set(interfaceC1151G.q(null, (String) this.f16620b, (String) this.f16623e));
                        }
                        c1189j1.x();
                        atomicReference = (AtomicReference) this.f16622d;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th) {
                        ((AtomicReference) this.f16622d).notify();
                        throw th;
                    }
                }
            case 2:
                com.google.android.gms.internal.measurement.L l9 = (com.google.android.gms.internal.measurement.L) this.f16623e;
                String str = (String) this.f16622d;
                String str2 = (String) this.f16620b;
                C1189j1 c1189j12 = (C1189j1) this.f16624f;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        interfaceC1151G2 = c1189j12.f16480d;
                    } catch (RemoteException e12) {
                        T t11 = ((C1200n0) c1189j12.f4728a).f16541f;
                        C1200n0.l(t11);
                        t11.f16242f.e(StubApp.getString2("20883"), str2, str, e12);
                    }
                    if (interfaceC1151G2 != null) {
                        arrayList = K1.Z(interfaceC1151G2.x(str2, str, (M1) this.f16621c));
                        c1189j12.x();
                        k12 = ((C1200n0) c1189j12.f4728a).j;
                        C1200n0.j(k12);
                        k12.Y(l9, arrayList);
                        return;
                    }
                    C1200n0 c1200n0 = (C1200n0) c1189j12.f4728a;
                    T t12 = c1200n0.f16541f;
                    C1200n0.l(t12);
                    t12.f16242f.d(StubApp.getString2("20882"), str2, str);
                    k12 = c1200n0.j;
                    C1200n0.j(k12);
                    k12.Y(l9, arrayList);
                    return;
                } catch (Throwable th2) {
                    K1 k13 = ((C1200n0) c1189j12.f4728a).j;
                    C1200n0.j(k13);
                    k13.Y(l9, arrayList);
                    throw th2;
                }
            default:
                try {
                    if (!(((t2.j) this.f16622d).f21159a instanceof C1728a)) {
                        String uuid = ((UUID) this.f16621c).toString();
                        int i3 = ((s2.l) this.f16620b).f20737c.i(uuid);
                        if (i3 == 0 || i2.u.a(i3)) {
                            throw new IllegalStateException(StubApp.getString2("20881"));
                        }
                        ((s2.l) this.f16620b).f20736b.f(uuid, (i2.h) this.f16623e);
                        ((Context) this.f16624f).startService(C1506a.a((Context) this.f16624f, uuid, (i2.h) this.f16623e));
                    }
                    ((t2.j) this.f16622d).j(null);
                    return;
                } catch (Throwable th3) {
                    ((t2.j) this.f16622d).k(th3);
                    return;
                }
        }
    }

    public RunnableC1210s0(C1189j1 c1189j1, String str, String str2, M1 m12, com.google.android.gms.internal.measurement.L l9) {
        this.f16620b = str;
        this.f16622d = str2;
        this.f16621c = m12;
        this.f16623e = l9;
        this.f16624f = c1189j1;
    }

    public RunnableC1210s0(C1189j1 c1189j1, AtomicReference atomicReference, String str, String str2, M1 m12) {
        this.f16622d = atomicReference;
        this.f16620b = str;
        this.f16623e = str2;
        this.f16621c = m12;
        this.f16624f = c1189j1;
    }

    public RunnableC1210s0(s2.l lVar, t2.j jVar, UUID uuid, i2.h hVar, Context context) {
        this.f16620b = lVar;
        this.f16622d = jVar;
        this.f16621c = uuid;
        this.f16623e = hVar;
        this.f16624f = context;
    }
}
