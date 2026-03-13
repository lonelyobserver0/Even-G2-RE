package com.google.android.gms.measurement.internal;

import N9.c;
import Q4.b;
import S3.D;
import Z3.a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import cb.C0585c;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.I;
import com.google.android.gms.internal.measurement.L;
import com.google.android.gms.internal.measurement.N;
import com.google.android.gms.internal.measurement.Q;
import com.google.android.gms.internal.measurement.U;
import com.google.android.gms.internal.measurement.W;
import com.stub.StubApp;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import l4.A0;
import l4.B0;
import l4.C1156L;
import l4.C1162a1;
import l4.C1191k0;
import l4.C1200n0;
import l4.C1213u;
import l4.C1215v;
import l4.C1219x;
import l4.F0;
import l4.G0;
import l4.H0;
import l4.J0;
import l4.K0;
import l4.K1;
import l4.L1;
import l4.O0;
import l4.P0;
import l4.RunnableC1194l0;
import l4.T;
import l4.T0;
import l4.V;
import l4.V0;
import l4.X0;
import l4.x1;
import l4.z1;
import t.C1692e;

@DynamiteApi
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AppMeasurementDynamiteService extends I {

    /* renamed from: e, reason: collision with root package name */
    public C1200n0 f11804e;

    /* renamed from: f, reason: collision with root package name */
    public final C1692e f11805f;

    public AppMeasurementDynamiteService() {
        super(StubApp.getString2(11682));
        this.f11804e = null;
        this.f11805f = new C1692e(0);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void beginAdUnitExposure(String str, long j) throws RemoteException {
        f();
        C1219x c1219x = this.f11804e.f16548p;
        C1200n0.i(c1219x);
        c1219x.l(j, str);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        f();
        P0 p02 = this.f11804e.f16547n;
        C1200n0.k(p02);
        p02.y(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void clearMeasurementEnabled(long j) throws RemoteException {
        f();
        P0 p02 = this.f11804e.f16547n;
        C1200n0.k(p02);
        p02.l();
        C1191k0 c1191k0 = ((C1200n0) p02.f4728a).f16542g;
        C1200n0.l(c1191k0);
        c1191k0.t(new b(p02, (Boolean) null));
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void endAdUnitExposure(String str, long j) throws RemoteException {
        f();
        C1219x c1219x = this.f11804e.f16548p;
        C1200n0.i(c1219x);
        c1219x.m(j, str);
    }

    public final void f() {
        if (this.f11804e == null) {
            throw new IllegalStateException(StubApp.getString2(12392));
        }
    }

    public final void g(String str, L l9) {
        f();
        K1 k12 = this.f11804e.j;
        C1200n0.j(k12);
        k12.S(str, l9);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void generateEventId(L l9) throws RemoteException {
        f();
        K1 k12 = this.f11804e.j;
        C1200n0.j(k12);
        long g02 = k12.g0();
        f();
        K1 k13 = this.f11804e.j;
        C1200n0.j(k13);
        k13.T(l9, g02);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void getAppInstanceId(L l9) throws RemoteException {
        f();
        C1191k0 c1191k0 = this.f11804e.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.t(new RunnableC1194l0(this, l9, 0));
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void getCachedAppInstanceId(L l9) throws RemoteException {
        f();
        P0 p02 = this.f11804e.f16547n;
        C1200n0.k(p02);
        g((String) p02.f16210g.get(), l9);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void getConditionalUserProperties(String str, String str2, L l9) throws RemoteException {
        f();
        C1191k0 c1191k0 = this.f11804e.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.t(new c(this, l9, str, str2, 5));
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void getCurrentScreenClass(L l9) throws RemoteException {
        f();
        P0 p02 = this.f11804e.f16547n;
        C1200n0.k(p02);
        C1162a1 c1162a1 = ((C1200n0) p02.f4728a).f16546m;
        C1200n0.k(c1162a1);
        X0 x02 = c1162a1.f16347c;
        g(x02 != null ? x02.f16318b : null, l9);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void getCurrentScreenName(L l9) throws RemoteException {
        f();
        P0 p02 = this.f11804e.f16547n;
        C1200n0.k(p02);
        C1162a1 c1162a1 = ((C1200n0) p02.f4728a).f16546m;
        C1200n0.k(c1162a1);
        X0 x02 = c1162a1.f16347c;
        g(x02 != null ? x02.f16317a : null, l9);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void getGmpAppId(L l9) throws RemoteException {
        String str;
        f();
        P0 p02 = this.f11804e.f16547n;
        C1200n0.k(p02);
        C1200n0 c1200n0 = (C1200n0) p02.f4728a;
        try {
            str = A0.b(c1200n0.f16536a, c1200n0.f16550r);
        } catch (IllegalStateException e10) {
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            t3.f16242f.c(e10, StubApp.getString2(12393));
            str = null;
        }
        g(str, l9);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void getMaxUserProperties(String str, L l9) throws RemoteException {
        f();
        P0 p02 = this.f11804e.f16547n;
        C1200n0.k(p02);
        D.e(str);
        ((C1200n0) p02.f4728a).getClass();
        f();
        K1 k12 = this.f11804e.j;
        C1200n0.j(k12);
        k12.U(l9, 25);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void getSessionId(L l9) throws RemoteException {
        f();
        P0 p02 = this.f11804e.f16547n;
        C1200n0.k(p02);
        C1191k0 c1191k0 = ((C1200n0) p02.f4728a).f16542g;
        C1200n0.l(c1191k0);
        c1191k0.t(new b(p02, l9));
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void getTestFlag(L l9, int i3) throws RemoteException {
        f();
        if (i3 == 0) {
            K1 k12 = this.f11804e.j;
            C1200n0.j(k12);
            P0 p02 = this.f11804e.f16547n;
            C1200n0.k(p02);
            AtomicReference atomicReference = new AtomicReference();
            C1191k0 c1191k0 = ((C1200n0) p02.f4728a).f16542g;
            C1200n0.l(c1191k0);
            k12.S((String) c1191k0.u(atomicReference, 15000L, StubApp.getString2(12399), new J0(p02, atomicReference, 1)), l9);
            return;
        }
        if (i3 == 1) {
            K1 k13 = this.f11804e.j;
            C1200n0.j(k13);
            P0 p03 = this.f11804e.f16547n;
            C1200n0.k(p03);
            AtomicReference atomicReference2 = new AtomicReference();
            C1191k0 c1191k02 = ((C1200n0) p03.f4728a).f16542g;
            C1200n0.l(c1191k02);
            k13.T(l9, ((Long) c1191k02.u(atomicReference2, 15000L, StubApp.getString2(12398), new J0(p03, atomicReference2, 2))).longValue());
            return;
        }
        if (i3 == 2) {
            K1 k14 = this.f11804e.j;
            C1200n0.j(k14);
            P0 p04 = this.f11804e.f16547n;
            C1200n0.k(p04);
            AtomicReference atomicReference3 = new AtomicReference();
            C1191k0 c1191k03 = ((C1200n0) p04.f4728a).f16542g;
            C1200n0.l(c1191k03);
            double doubleValue = ((Double) c1191k03.u(atomicReference3, 15000L, StubApp.getString2(12396), new J0(p04, atomicReference3, 4))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble(StubApp.getString2(1269), doubleValue);
            try {
                l9.y(bundle);
                return;
            } catch (RemoteException e10) {
                T t3 = ((C1200n0) k14.f4728a).f16541f;
                C1200n0.l(t3);
                t3.j.c(e10, StubApp.getString2(12397));
                return;
            }
        }
        if (i3 == 3) {
            K1 k15 = this.f11804e.j;
            C1200n0.j(k15);
            P0 p05 = this.f11804e.f16547n;
            C1200n0.k(p05);
            AtomicReference atomicReference4 = new AtomicReference();
            C1191k0 c1191k04 = ((C1200n0) p05.f4728a).f16542g;
            C1200n0.l(c1191k04);
            k15.U(l9, ((Integer) c1191k04.u(atomicReference4, 15000L, StubApp.getString2(12395), new J0(p05, atomicReference4, 3))).intValue());
            return;
        }
        if (i3 != 4) {
            return;
        }
        K1 k16 = this.f11804e.j;
        C1200n0.j(k16);
        P0 p06 = this.f11804e.f16547n;
        C1200n0.k(p06);
        AtomicReference atomicReference5 = new AtomicReference();
        C1191k0 c1191k05 = ((C1200n0) p06.f4728a).f16542g;
        C1200n0.l(c1191k05);
        k16.W(l9, ((Boolean) c1191k05.u(atomicReference5, 15000L, StubApp.getString2(12394), new J0(p06, atomicReference5, 0))).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void getUserProperties(String str, String str2, boolean z2, L l9) throws RemoteException {
        f();
        C1191k0 c1191k0 = this.f11804e.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.t(new H0(this, l9, str, str2, z2));
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void initForTests(Map map) throws RemoteException {
        f();
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void initialize(a aVar, U u2, long j) throws RemoteException {
        C1200n0 c1200n0 = this.f11804e;
        if (c1200n0 == null) {
            Context context = (Context) Z3.b.O(aVar);
            D.h(context);
            this.f11804e = C1200n0.r(context, u2, Long.valueOf(j));
        } else {
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            t3.j.b(StubApp.getString2(12400));
        }
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void isDataCollectionEnabled(L l9) throws RemoteException {
        f();
        C1191k0 c1191k0 = this.f11804e.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.t(new RunnableC1194l0(this, l9, 1));
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void logEvent(String str, String str2, Bundle bundle, boolean z2, boolean z10, long j) throws RemoteException {
        f();
        P0 p02 = this.f11804e.f16547n;
        C1200n0.k(p02);
        p02.p(str, str2, bundle, z2, z10, j);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void logEventAndBundle(String str, String str2, Bundle bundle, L l9, long j) throws RemoteException {
        f();
        D.e(str2);
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        String string2 = StubApp.getString2(6519);
        String string22 = StubApp.getString2(4849);
        bundle2.putString(string2, string22);
        C1215v c1215v = new C1215v(str2, new C1213u(bundle), string22, j);
        C1191k0 c1191k0 = this.f11804e.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.t(new c(this, l9, c1215v, str));
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void logHealthData(int i3, String str, a aVar, a aVar2, a aVar3) throws RemoteException {
        f();
        Object O7 = aVar == null ? null : Z3.b.O(aVar);
        Object O10 = aVar2 == null ? null : Z3.b.O(aVar2);
        Object O11 = aVar3 != null ? Z3.b.O(aVar3) : null;
        T t3 = this.f11804e.f16541f;
        C1200n0.l(t3);
        t3.t(i3, true, false, str, O7, O10, O11);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityCreated(a aVar, Bundle bundle, long j) throws RemoteException {
        f();
        Activity activity = (Activity) Z3.b.O(aVar);
        D.h(activity);
        onActivityCreatedByScionActivityInfo(W.d(activity), bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityCreatedByScionActivityInfo(W w10, Bundle bundle, long j) {
        f();
        P0 p02 = this.f11804e.f16547n;
        C1200n0.k(p02);
        C8.a aVar = p02.f16206c;
        if (aVar != null) {
            P0 p03 = this.f11804e.f16547n;
            C1200n0.k(p03);
            p03.C();
            aVar.i(w10, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityDestroyed(a aVar, long j) throws RemoteException {
        f();
        Activity activity = (Activity) Z3.b.O(aVar);
        D.h(activity);
        onActivityDestroyedByScionActivityInfo(W.d(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityDestroyedByScionActivityInfo(W w10, long j) throws RemoteException {
        f();
        P0 p02 = this.f11804e.f16547n;
        C1200n0.k(p02);
        C8.a aVar = p02.f16206c;
        if (aVar != null) {
            P0 p03 = this.f11804e.f16547n;
            C1200n0.k(p03);
            p03.C();
            aVar.j(w10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityPaused(a aVar, long j) throws RemoteException {
        f();
        Activity activity = (Activity) Z3.b.O(aVar);
        D.h(activity);
        onActivityPausedByScionActivityInfo(W.d(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityPausedByScionActivityInfo(W w10, long j) throws RemoteException {
        f();
        P0 p02 = this.f11804e.f16547n;
        C1200n0.k(p02);
        C8.a aVar = p02.f16206c;
        if (aVar != null) {
            P0 p03 = this.f11804e.f16547n;
            C1200n0.k(p03);
            p03.C();
            aVar.k(w10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityResumed(a aVar, long j) throws RemoteException {
        f();
        Activity activity = (Activity) Z3.b.O(aVar);
        D.h(activity);
        onActivityResumedByScionActivityInfo(W.d(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityResumedByScionActivityInfo(W w10, long j) throws RemoteException {
        f();
        P0 p02 = this.f11804e.f16547n;
        C1200n0.k(p02);
        C8.a aVar = p02.f16206c;
        if (aVar != null) {
            P0 p03 = this.f11804e.f16547n;
            C1200n0.k(p03);
            p03.C();
            aVar.l(w10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void onActivitySaveInstanceState(a aVar, L l9, long j) throws RemoteException {
        f();
        Activity activity = (Activity) Z3.b.O(aVar);
        D.h(activity);
        onActivitySaveInstanceStateByScionActivityInfo(W.d(activity), l9, j);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void onActivitySaveInstanceStateByScionActivityInfo(W w10, L l9, long j) throws RemoteException {
        f();
        P0 p02 = this.f11804e.f16547n;
        C1200n0.k(p02);
        C8.a aVar = p02.f16206c;
        Bundle bundle = new Bundle();
        if (aVar != null) {
            P0 p03 = this.f11804e.f16547n;
            C1200n0.k(p03);
            p03.C();
            aVar.m(w10, bundle);
        }
        try {
            l9.y(bundle);
        } catch (RemoteException e10) {
            T t3 = this.f11804e.f16541f;
            C1200n0.l(t3);
            t3.j.c(e10, StubApp.getString2(12401));
        }
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityStarted(a aVar, long j) throws RemoteException {
        f();
        Activity activity = (Activity) Z3.b.O(aVar);
        D.h(activity);
        onActivityStartedByScionActivityInfo(W.d(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityStartedByScionActivityInfo(W w10, long j) throws RemoteException {
        f();
        P0 p02 = this.f11804e.f16547n;
        C1200n0.k(p02);
        if (p02.f16206c != null) {
            P0 p03 = this.f11804e.f16547n;
            C1200n0.k(p03);
            p03.C();
        }
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityStopped(a aVar, long j) throws RemoteException {
        f();
        Activity activity = (Activity) Z3.b.O(aVar);
        D.h(activity);
        onActivityStoppedByScionActivityInfo(W.d(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityStoppedByScionActivityInfo(W w10, long j) throws RemoteException {
        f();
        P0 p02 = this.f11804e.f16547n;
        C1200n0.k(p02);
        if (p02.f16206c != null) {
            P0 p03 = this.f11804e.f16547n;
            C1200n0.k(p03);
            p03.C();
        }
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void performAction(Bundle bundle, L l9, long j) throws RemoteException {
        f();
        l9.y(null);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void registerOnMeasurementEventListener(Q q10) throws RemoteException {
        Object obj;
        f();
        C1692e c1692e = this.f11805f;
        synchronized (c1692e) {
            try {
                obj = (B0) c1692e.get(Integer.valueOf(q10.c()));
                if (obj == null) {
                    obj = new L1(this, q10);
                    c1692e.put(Integer.valueOf(q10.c()), obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        P0 p02 = this.f11804e.f16547n;
        C1200n0.k(p02);
        p02.l();
        if (p02.f16208e.add(obj)) {
            return;
        }
        T t3 = ((C1200n0) p02.f4728a).f16541f;
        C1200n0.l(t3);
        t3.j.b(StubApp.getString2(12402));
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void resetAnalyticsData(long j) throws RemoteException {
        f();
        P0 p02 = this.f11804e.f16547n;
        C1200n0.k(p02);
        p02.f16210g.set(null);
        C1191k0 c1191k0 = ((C1200n0) p02.f4728a).f16542g;
        C1200n0.l(c1191k0);
        c1191k0.t(new G0(p02, j, 1));
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void retrieveAndUploadBatches(N n10) {
        V0 v02;
        f();
        P0 p02 = this.f11804e.f16547n;
        C1200n0.k(p02);
        p02.l();
        C1200n0 c1200n0 = (C1200n0) p02.f4728a;
        C1191k0 c1191k0 = c1200n0.f16542g;
        C1200n0.l(c1191k0);
        if (c1191k0.q()) {
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            t3.f16242f.b(StubApp.getString2(12415));
            return;
        }
        C1191k0 c1191k02 = c1200n0.f16542g;
        C1200n0.l(c1191k02);
        if (Thread.currentThread() == c1191k02.f16492d) {
            T t10 = c1200n0.f16541f;
            C1200n0.l(t10);
            t10.f16242f.b(StubApp.getString2(12403));
            return;
        }
        if (C0585c.g()) {
            T t11 = c1200n0.f16541f;
            C1200n0.l(t11);
            t11.f16242f.b(StubApp.getString2(12414));
            return;
        }
        T t12 = c1200n0.f16541f;
        C1200n0.l(t12);
        t12.f16249p.b(StubApp.getString2(12404));
        boolean z2 = false;
        int i3 = 0;
        int i10 = 0;
        while (!z2) {
            T t13 = c1200n0.f16541f;
            C1200n0.l(t13);
            t13.f16249p.b(StubApp.getString2(12405));
            AtomicReference atomicReference = new AtomicReference();
            C1191k0 c1191k03 = c1200n0.f16542g;
            C1200n0.l(c1191k03);
            c1191k03.u(atomicReference, 10000L, StubApp.getString2(12406), new J0(p02, atomicReference, 6, false));
            z1 z1Var = (z1) atomicReference.get();
            if (z1Var == null) {
                break;
            }
            ArrayList arrayList = z1Var.f16712a;
            if (arrayList.isEmpty()) {
                break;
            }
            T t14 = c1200n0.f16541f;
            C1200n0.l(t14);
            t14.f16249p.c(Integer.valueOf(arrayList.size()), StubApp.getString2(12407));
            i3 += arrayList.size();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                x1 x1Var = (x1) it.next();
                try {
                    URL url = new URI(x1Var.f16661c).toURL();
                    AtomicReference atomicReference2 = new AtomicReference();
                    C1156L q10 = ((C1200n0) p02.f4728a).q();
                    q10.l();
                    D.h(q10.f16136g);
                    String str = q10.f16136g;
                    C1200n0 c1200n02 = (C1200n0) p02.f4728a;
                    T t15 = c1200n02.f16541f;
                    C1200n0.l(t15);
                    Ac.b bVar = t15.f16249p;
                    Long valueOf = Long.valueOf(x1Var.f16659a);
                    bVar.e(StubApp.getString2(12408), valueOf, x1Var.f16661c, Integer.valueOf(x1Var.f16660b.length));
                    if (!TextUtils.isEmpty(x1Var.f16665g)) {
                        T t16 = c1200n02.f16541f;
                        C1200n0.l(t16);
                        t16.f16249p.d(StubApp.getString2(12409), valueOf, x1Var.f16665g);
                    }
                    HashMap hashMap = new HashMap();
                    Bundle bundle = x1Var.f16662d;
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            hashMap.put(str2, string);
                        }
                    }
                    T0 t02 = c1200n02.f16549q;
                    C1200n0.l(t02);
                    byte[] bArr = x1Var.f16660b;
                    a5.c cVar = new a5.c(p02, atomicReference2, x1Var, 15);
                    t02.m();
                    D.h(url);
                    D.h(bArr);
                    C1191k0 c1191k04 = ((C1200n0) t02.f4728a).f16542g;
                    C1200n0.l(c1191k04);
                    c1191k04.w(new V(t02, str, url, bArr, hashMap, cVar));
                    try {
                        K1 k12 = c1200n02.j;
                        C1200n0.j(k12);
                        C1200n0 c1200n03 = (C1200n0) k12.f4728a;
                        c1200n03.f16545l.getClass();
                        long currentTimeMillis = System.currentTimeMillis() + 60000;
                        synchronized (atomicReference2) {
                            for (long j = 60000; atomicReference2.get() == null && j > 0; j = currentTimeMillis - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(j);
                                    c1200n03.f16545l.getClass();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        T t17 = ((C1200n0) p02.f4728a).f16541f;
                        C1200n0.l(t17);
                        t17.j.b(StubApp.getString2(12410));
                    }
                    v02 = atomicReference2.get() == null ? V0.f16258b : (V0) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e10) {
                    T t18 = ((C1200n0) p02.f4728a).f16541f;
                    C1200n0.l(t18);
                    t18.f16242f.e(StubApp.getString2(12411), x1Var.f16661c, Long.valueOf(x1Var.f16659a), e10);
                    v02 = V0.f16260d;
                }
                if (v02 != V0.f16259c) {
                    if (v02 == V0.f16261e) {
                        z2 = true;
                        break;
                    }
                } else {
                    i10++;
                }
            }
        }
        T t19 = c1200n0.f16541f;
        C1200n0.l(t19);
        t19.f16249p.d(StubApp.getString2(12412), Integer.valueOf(i3), Integer.valueOf(i10));
        try {
            n10.a();
        } catch (RemoteException e11) {
            C1200n0 c1200n04 = this.f11804e;
            D.h(c1200n04);
            T t20 = c1200n04.f16541f;
            C1200n0.l(t20);
            t20.j.c(e11, StubApp.getString2(12413));
        }
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        f();
        if (bundle != null) {
            P0 p02 = this.f11804e.f16547n;
            C1200n0.k(p02);
            p02.x(bundle, j);
        } else {
            T t3 = this.f11804e.f16541f;
            C1200n0.l(t3);
            t3.f16242f.b(StubApp.getString2(12416));
        }
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void setConsent(Bundle bundle, long j) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        f();
        P0 p02 = this.f11804e.f16547n;
        C1200n0.k(p02);
        p02.D(bundle, -20, j);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void setCurrentScreen(a aVar, String str, String str2, long j) throws RemoteException {
        f();
        Activity activity = (Activity) Z3.b.O(aVar);
        D.h(activity);
        setCurrentScreenByScionActivityInfo(W.d(activity), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009c, code lost:
    
        if (r3 <= 500) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ca, code lost:
    
        if (r3 <= 500) goto L39;
     */
    @Override // com.google.android.gms.internal.measurement.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.W r6, java.lang.String r7, java.lang.String r8, long r9) throws android.os.RemoteException {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.W, java.lang.String, java.lang.String, long):void");
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void setDataCollectionEnabled(boolean z2) throws RemoteException {
        f();
        P0 p02 = this.f11804e.f16547n;
        C1200n0.k(p02);
        p02.l();
        C1191k0 c1191k0 = ((C1200n0) p02.f4728a).f16542g;
        C1200n0.l(c1191k0);
        c1191k0.t(new F0(p02, z2));
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void setDefaultEventParameters(Bundle bundle) {
        f();
        P0 p02 = this.f11804e.f16547n;
        C1200n0.k(p02);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        C1191k0 c1191k0 = ((C1200n0) p02.f4728a).f16542g;
        C1200n0.l(c1191k0);
        c1191k0.t(new K0(p02, bundle2, 2));
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void setEventInterceptor(Q q10) throws RemoteException {
        f();
        V6.b bVar = new V6.b(this, q10);
        C1191k0 c1191k0 = this.f11804e.f16542g;
        C1200n0.l(c1191k0);
        if (!c1191k0.q()) {
            C1191k0 c1191k02 = this.f11804e.f16542g;
            C1200n0.l(c1191k02);
            c1191k02.t(new b(this, bVar));
            return;
        }
        P0 p02 = this.f11804e.f16547n;
        C1200n0.k(p02);
        p02.k();
        p02.l();
        V6.b bVar2 = p02.f16207d;
        if (bVar != bVar2) {
            D.j(StubApp.getString2(5229), bVar2 == null);
        }
        p02.f16207d = bVar;
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.T t3) throws RemoteException {
        f();
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void setMeasurementEnabled(boolean z2, long j) throws RemoteException {
        f();
        P0 p02 = this.f11804e.f16547n;
        C1200n0.k(p02);
        Boolean valueOf = Boolean.valueOf(z2);
        p02.l();
        C1191k0 c1191k0 = ((C1200n0) p02.f4728a).f16542g;
        C1200n0.l(c1191k0);
        c1191k0.t(new b(p02, valueOf));
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void setMinimumSessionDuration(long j) throws RemoteException {
        f();
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        f();
        P0 p02 = this.f11804e.f16547n;
        C1200n0.k(p02);
        C1191k0 c1191k0 = ((C1200n0) p02.f4728a).f16542g;
        C1200n0.l(c1191k0);
        c1191k0.t(new G0(p02, j, 0));
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void setSgtmDebugInfo(Intent intent) throws RemoteException {
        f();
        P0 p02 = this.f11804e.f16547n;
        C1200n0.k(p02);
        Uri data = intent.getData();
        C1200n0 c1200n0 = (C1200n0) p02.f4728a;
        if (data == null) {
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            t3.f16247m.b(StubApp.getString2(12424));
            return;
        }
        String queryParameter = data.getQueryParameter(StubApp.getString2(12425));
        if (queryParameter == null || !queryParameter.equals(StubApp.getString2(878))) {
            T t10 = c1200n0.f16541f;
            C1200n0.l(t10);
            t10.f16247m.b(StubApp.getString2(12428));
            c1200n0.f16539d.f16430c = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter(StubApp.getString2(12426));
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        T t11 = c1200n0.f16541f;
        C1200n0.l(t11);
        t11.f16247m.c(queryParameter2, StubApp.getString2(12427));
        c1200n0.f16539d.f16430c = queryParameter2;
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void setUserId(String str, long j) throws RemoteException {
        f();
        P0 p02 = this.f11804e.f16547n;
        C1200n0.k(p02);
        C1200n0 c1200n0 = (C1200n0) p02.f4728a;
        if (str == null || !TextUtils.isEmpty(str)) {
            C1191k0 c1191k0 = c1200n0.f16542g;
            C1200n0.l(c1191k0);
            c1191k0.t(new O0(0, p02, str));
            p02.u(null, StubApp.getString2(2829), str, true, j);
            return;
        }
        T t3 = c1200n0.f16541f;
        C1200n0.l(t3);
        t3.j.b(StubApp.getString2(12429));
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void setUserProperty(String str, String str2, a aVar, boolean z2, long j) throws RemoteException {
        f();
        Object O7 = Z3.b.O(aVar);
        P0 p02 = this.f11804e.f16547n;
        C1200n0.k(p02);
        p02.u(str, str2, O7, z2, j);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void unregisterOnMeasurementEventListener(Q q10) throws RemoteException {
        Object obj;
        f();
        C1692e c1692e = this.f11805f;
        synchronized (c1692e) {
            obj = (B0) c1692e.remove(Integer.valueOf(q10.c()));
        }
        if (obj == null) {
            obj = new L1(this, q10);
        }
        P0 p02 = this.f11804e.f16547n;
        C1200n0.k(p02);
        p02.l();
        if (p02.f16208e.remove(obj)) {
            return;
        }
        T t3 = ((C1200n0) p02.f4728a).f16541f;
        C1200n0.l(t3);
        t3.j.b(StubApp.getString2(12430));
    }
}
