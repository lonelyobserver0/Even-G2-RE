package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.stub.StubApp;
import f4.C0882f;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.measurement.o0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0657o0 {

    /* renamed from: g, reason: collision with root package name */
    public static volatile C0657o0 f11634g;

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f11635a;

    /* renamed from: b, reason: collision with root package name */
    public final C0882f f11636b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f11637c;

    /* renamed from: d, reason: collision with root package name */
    public int f11638d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11639e;

    /* renamed from: f, reason: collision with root package name */
    public volatile J f11640f;

    public C0657o0(Context context, Bundle bundle) {
        String string2 = StubApp.getString2(11932);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0627i0(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f11635a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f11636b = new C0882f(this, 5);
        this.f11637c = new ArrayList();
        try {
            if (l4.A0.b(context, l4.A0.a(context)) != null) {
                try {
                    Class.forName(StubApp.getString2("12177"), false, C0657o0.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f11639e = true;
                    Log.w(string2, StubApp.getString2(12178));
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        a(new C0607e0(this, context, bundle));
        Application application = (Application) StubApp.getOrigApplicationContext(context.getApplicationContext());
        if (application == null) {
            Log.w(string2, StubApp.getString2(12179));
        } else {
            application.registerActivityLifecycleCallbacks(new C0652n0(this));
        }
    }

    public static C0657o0 c(Context context, Bundle bundle) {
        S3.D.h(context);
        if (f11634g == null) {
            synchronized (C0657o0.class) {
                try {
                    if (f11634g == null) {
                        f11634g = new C0657o0(context, bundle);
                    }
                } finally {
                }
            }
        }
        return f11634g;
    }

    public final void a(AbstractRunnableC0637k0 abstractRunnableC0637k0) {
        this.f11635a.execute(abstractRunnableC0637k0);
    }

    public final void b(Exception exc, boolean z2, boolean z10) {
        this.f11639e |= z2;
        String string2 = StubApp.getString2(11932);
        if (z2) {
            Log.w(string2, StubApp.getString2(12180), exc);
            return;
        }
        String string22 = StubApp.getString2(12181);
        if (z10) {
            a(new C0607e0(this, string22, exc));
        }
        Log.w(string2, string22, exc);
    }
}
