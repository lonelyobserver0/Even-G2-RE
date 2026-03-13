package com.google.firebase.messaging;

import C2.e;
import D5.C;
import D5.C0043g;
import D5.C0047k;
import D5.C0048l;
import D5.C0050n;
import D5.E;
import D5.I;
import D5.q;
import D5.r;
import D5.u;
import D5.z;
import F5.c;
import P3.d;
import P3.l;
import P3.m;
import R4.h;
import R8.C0250h;
import S3.D;
import W4.k;
import X3.a;
import a4.f;
import android.app.Application;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.messaging.FirebaseMessaging;
import com.stub.StubApp;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import q4.j;
import q4.s;
import q8.AbstractC1526a;
import t.C1692e;
import t5.InterfaceC1733d;
import w5.b;
import x5.InterfaceC1913d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class FirebaseMessaging {

    /* renamed from: l, reason: collision with root package name */
    public static c f12055l;

    /* renamed from: n, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f12057n;

    /* renamed from: a, reason: collision with root package name */
    public final h f12058a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f12059b;

    /* renamed from: c, reason: collision with root package name */
    public final C0250h f12060c;

    /* renamed from: d, reason: collision with root package name */
    public final C0047k f12061d;

    /* renamed from: e, reason: collision with root package name */
    public final r f12062e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f12063f;

    /* renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f12064g;

    /* renamed from: h, reason: collision with root package name */
    public final s f12065h;

    /* renamed from: i, reason: collision with root package name */
    public final u f12066i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f12054k = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: m, reason: collision with root package name */
    public static b f12056m = new C0048l(0);

    public FirebaseMessaging(h hVar, b bVar, b bVar2, InterfaceC1913d interfaceC1913d, b bVar3, InterfaceC1733d interfaceC1733d) {
        final int i3 = 1;
        final int i10 = 0;
        hVar.a();
        Context context = hVar.f6193a;
        final u uVar = new u();
        uVar.f1458b = 0;
        uVar.f1459c = context;
        final C0250h c0250h = new C0250h(hVar, uVar, bVar, bVar2, interfaceC1913d);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new a(StubApp.getString2(12564)));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new a(StubApp.getString2(12565)));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a(StubApp.getString2(12566)));
        this.j = false;
        f12056m = bVar3;
        this.f12058a = hVar;
        this.f12062e = new r(this, interfaceC1733d);
        hVar.a();
        final Context context2 = hVar.f6193a;
        this.f12059b = context2;
        C8.a aVar = new C8.a();
        this.f12066i = uVar;
        this.f12060c = c0250h;
        this.f12061d = new C0047k(newSingleThreadExecutor);
        this.f12063f = scheduledThreadPoolExecutor;
        this.f12064g = threadPoolExecutor;
        hVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(aVar);
        } else {
            Log.w(StubApp.getString2(493), StubApp.getString2(12567) + context + StubApp.getString2(12568));
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: D5.m

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f1438b;

            {
                this.f1438b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f1438b;
                        if (firebaseMessaging.f12062e.b()) {
                            firebaseMessaging.k();
                            break;
                        }
                        break;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f1438b;
                        Context context3 = firebaseMessaging2.f12059b;
                        AbstractC1526a.A(context3);
                        Ec.d.E(context3, firebaseMessaging2.f12060c, firebaseMessaging2.j());
                        if (firebaseMessaging2.j()) {
                            firebaseMessaging2.g();
                            break;
                        }
                        break;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new a(StubApp.getString2(12569)));
        int i11 = I.j;
        s e10 = f.e(scheduledThreadPoolExecutor2, new Callable() { // from class: D5.H
            @Override // java.util.concurrent.Callable
            public final Object call() {
                G g10;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                u uVar2 = uVar;
                C0250h c0250h2 = c0250h;
                synchronized (G.class) {
                    try {
                        WeakReference weakReference = G.f1359b;
                        g10 = weakReference != null ? (G) weakReference.get() : null;
                        if (g10 == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences(StubApp.getString2("1376"), 0);
                            G g11 = new G();
                            synchronized (g11) {
                                g11.f1360a = B3.s.h(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            G.f1359b = new WeakReference(g11);
                            g10 = g11;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new I(firebaseMessaging, uVar2, g10, c0250h2, context3, scheduledThreadPoolExecutor3);
            }
        });
        this.f12065h = e10;
        e10.addOnSuccessListener(scheduledThreadPoolExecutor, new C0050n(this, i10));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: D5.m

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f1438b;

            {
                this.f1438b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f1438b;
                        if (firebaseMessaging.f12062e.b()) {
                            firebaseMessaging.k();
                            break;
                        }
                        break;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f1438b;
                        Context context3 = firebaseMessaging2.f12059b;
                        AbstractC1526a.A(context3);
                        Ec.d.E(context3, firebaseMessaging2.f12060c, firebaseMessaging2.j());
                        if (firebaseMessaging2.j()) {
                            firebaseMessaging2.g();
                            break;
                        }
                        break;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f12057n == null) {
                    f12057n = new ScheduledThreadPoolExecutor(1, new a(StubApp.getString2("12570")));
                }
                f12057n.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized FirebaseMessaging c() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(h.e());
        }
        return firebaseMessaging;
    }

    public static synchronized c d(Context context) {
        c cVar;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f12055l == null) {
                    f12055l = new c(context);
                }
                cVar = f12055l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(h hVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) hVar.c(FirebaseMessaging.class);
            D.i(firebaseMessaging, StubApp.getString2("12571"));
        }
        return firebaseMessaging;
    }

    public final String a() {
        j jVar;
        C f10 = f();
        if (!m(f10)) {
            return f10.f1345a;
        }
        String b2 = u.b(this.f12058a);
        C0047k c0047k = this.f12061d;
        String string2 = StubApp.getString2(12572);
        String string22 = StubApp.getString2(12573);
        synchronized (c0047k) {
            jVar = (j) ((C1692e) c0047k.f1435b).get(b2);
            if (jVar == null) {
                if (Log.isLoggable(StubApp.getString2("493"), 3)) {
                    Log.d(StubApp.getString2("493"), string2 + b2);
                }
                C0250h c0250h = this.f12060c;
                jVar = c0250h.d(c0250h.k(u.b((h) c0250h.f6296a), StubApp.getString2("602"), new Bundle())).onSuccessTask(this.f12064g, new e(this, b2, f10, 1)).continueWithTask((ExecutorService) c0047k.f1434a, new C0043g(1, c0047k, b2));
                ((C1692e) c0047k.f1435b).put(b2, jVar);
            } else if (Log.isLoggable(StubApp.getString2("493"), 3)) {
                Log.d(StubApp.getString2("493"), string22 + b2);
            }
        }
        try {
            return (String) f.b(jVar);
        } catch (InterruptedException | ExecutionException e10) {
            throw new IOException(e10);
        }
    }

    public final String e() {
        h hVar = this.f12058a;
        hVar.a();
        return StubApp.getString2(429).equals(hVar.f6194b) ? "" : hVar.g();
    }

    public final C f() {
        C b2;
        c d8 = d(this.f12059b);
        String e10 = e();
        String b10 = u.b(this.f12058a);
        synchronized (d8) {
            b2 = C.b(((SharedPreferences) d8.f2238b).getString(c.j(e10, b10), null));
        }
        return b2;
    }

    public final void g() {
        j l9;
        int i3;
        P3.b bVar = (P3.b) this.f12060c.f6298c;
        if (bVar.f5493c.j() >= 241100000) {
            m d8 = m.d(bVar.f5492b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (d8) {
                i3 = d8.f5528b;
                d8.f5528b = i3 + 1;
            }
            l9 = d8.e(new l(i3, 5, bundle, 1)).continueWith(P3.h.f5506c, d.f5500c);
        } else {
            l9 = f.l(new IOException(StubApp.getString2(964)));
        }
        l9.addOnSuccessListener(this.f12063f, new C0050n(this, 1));
    }

    public final void h(z zVar) {
        if (TextUtils.isEmpty(zVar.f1486a.getString(StubApp.getString2(12574)))) {
            throw new IllegalArgumentException(StubApp.getString2(12577));
        }
        Intent intent = new Intent(StubApp.getString2(12575));
        Intent intent2 = new Intent();
        intent2.setPackage(StubApp.getString2(4848));
        Context context = this.f12059b;
        intent.putExtra(StubApp.getString2(4849), PendingIntent.getBroadcast(context, 0, intent2, 67108864));
        intent.setPackage(StubApp.getString2(0));
        intent.putExtras(zVar.f1486a);
        context.sendOrderedBroadcast(intent, StubApp.getString2(12576));
    }

    public final void i(boolean z2) {
        r rVar = this.f12062e;
        synchronized (rVar) {
            rVar.a();
            q qVar = (q) rVar.f1449c;
            if (qVar != null) {
                ((k) ((InterfaceC1733d) rVar.f1448b)).c(qVar);
                rVar.f1449c = null;
            }
            h hVar = ((FirebaseMessaging) rVar.f1451e).f12058a;
            hVar.a();
            SharedPreferences.Editor edit = hVar.f6193a.getSharedPreferences(StubApp.getString2("1466"), 0).edit();
            edit.putBoolean(StubApp.getString2("1467"), z2);
            edit.apply();
            if (z2) {
                ((FirebaseMessaging) rVar.f1451e).k();
            }
            rVar.f1450d = Boolean.valueOf(z2);
        }
    }

    public final boolean j() {
        String notificationDelegate;
        Context context = this.f12059b;
        AbstractC1526a.A(context);
        boolean z2 = Build.VERSION.SDK_INT >= 29;
        String string2 = StubApp.getString2(493);
        if (z2) {
            if (!(Binder.getCallingUid() == context.getApplicationInfo().uid)) {
                Log.e(string2, StubApp.getString2(12579) + context.getPackageName());
                return false;
            }
            notificationDelegate = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate();
            if (StubApp.getString2(0).equals(notificationDelegate)) {
                if (Log.isLoggable(string2, 3)) {
                    Log.d(string2, StubApp.getString2(12580));
                }
                if (this.f12058a.c(T4.a.class) != null || (hc.b.t() && f12056m != null)) {
                    return true;
                }
            }
        } else if (Log.isLoggable(string2, 3)) {
            Log.d(string2, StubApp.getString2(12578));
            return false;
        }
        return false;
    }

    public final void k() {
        if (m(f())) {
            synchronized (this) {
                if (!this.j) {
                    l(0L);
                }
            }
        }
    }

    public final synchronized void l(long j) {
        b(new E(this, Math.min(Math.max(30L, 2 * j), f12054k)), j);
        this.j = true;
    }

    public final boolean m(C c10) {
        if (c10 != null) {
            return System.currentTimeMillis() > c10.f1347c + C.f1344d || !this.f12066i.a().equals(c10.f1346b);
        }
        return true;
    }
}
