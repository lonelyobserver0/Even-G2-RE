package com.google.firebase.analytics;

import R4.h;
import S3.D;
import S4.a;
import S4.b;
import S4.c;
import S4.e;
import a4.f;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.C0657o0;
import com.google.android.gms.internal.measurement.W;
import com.google.android.gms.internal.measurement.Y;
import com.google.android.gms.internal.measurement.Z;
import com.stub.StubApp;
import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l4.Q0;
import x5.C1912c;
import x5.InterfaceC1913d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class FirebaseAnalytics {

    /* renamed from: c, reason: collision with root package name */
    public static volatile FirebaseAnalytics f12041c;

    /* renamed from: a, reason: collision with root package name */
    public final C0657o0 f12042a;

    /* renamed from: b, reason: collision with root package name */
    public c f12043b;

    public FirebaseAnalytics(C0657o0 c0657o0) {
        D.h(c0657o0);
        this.f12042a = c0657o0;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f12041c == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f12041c == null) {
                        f12041c = new FirebaseAnalytics(C0657o0.c(context, null));
                    }
                } finally {
                }
            }
        }
        return f12041c;
    }

    @Keep
    public static Q0 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C0657o0 c10 = C0657o0.c(context, bundle);
        if (c10 == null) {
            return null;
        }
        return new e(c10);
    }

    public final void a(HashMap hashMap) {
        Bundle bundle = new Bundle();
        a aVar = (a) hashMap.get(b.f6585a);
        String string2 = StubApp.getString2(12542);
        String string22 = StubApp.getString2(12543);
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            String string23 = StubApp.getString2(12544);
            if (ordinal == 0) {
                bundle.putString(string23, string2);
            } else if (ordinal == 1) {
                bundle.putString(string23, string22);
            }
        }
        a aVar2 = (a) hashMap.get(b.f6586b);
        if (aVar2 != null) {
            int ordinal2 = aVar2.ordinal();
            String string24 = StubApp.getString2(12545);
            if (ordinal2 == 0) {
                bundle.putString(string24, string2);
            } else if (ordinal2 == 1) {
                bundle.putString(string24, string22);
            }
        }
        a aVar3 = (a) hashMap.get(b.f6587c);
        if (aVar3 != null) {
            int ordinal3 = aVar3.ordinal();
            String string25 = StubApp.getString2(12546);
            if (ordinal3 == 0) {
                bundle.putString(string25, string2);
            } else if (ordinal3 == 1) {
                bundle.putString(string25, string22);
            }
        }
        a aVar4 = (a) hashMap.get(b.f6588d);
        if (aVar4 != null) {
            int ordinal4 = aVar4.ordinal();
            String string26 = StubApp.getString2(12547);
            if (ordinal4 == 0) {
                bundle.putString(string26, string2);
            } else if (ordinal4 == 1) {
                bundle.putString(string26, string22);
            }
        }
        C0657o0 c0657o0 = this.f12042a;
        c0657o0.getClass();
        c0657o0.a(new Y(c0657o0, bundle, 1));
    }

    public final ExecutorService b() {
        c cVar;
        synchronized (FirebaseAnalytics.class) {
            try {
                if (this.f12043b == null) {
                    this.f12043b = new c(0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                }
                cVar = this.f12043b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = C1912c.f22871m;
            return (String) f.c(((C1912c) h.e().c(InterfaceC1913d.class)).c(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException(StubApp.getString2(12548));
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        W d8 = W.d(activity);
        C0657o0 c0657o0 = this.f12042a;
        c0657o0.getClass();
        c0657o0.a(new Z(c0657o0, d8, str, str2));
    }
}
