package androidx.work;

import Q4.c;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import t2.j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class ListenableWorker {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10355a;

    /* renamed from: b, reason: collision with root package name */
    public final WorkerParameters f10356b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f10357c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10358d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10359e;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f10355a = context;
        this.f10356b = workerParameters;
    }

    public c a() {
        j jVar = new j();
        jVar.k(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return jVar;
    }

    public boolean b() {
        return this.f10359e;
    }

    public void c() {
    }

    public abstract j d();

    public final void g() {
        this.f10357c = true;
        c();
    }
}
