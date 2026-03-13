package S8;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final long f6605a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f6606b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6607c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicInteger f6608d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f6609e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f6610f;

    public a(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f6605a = System.currentTimeMillis();
        this.f6606b = new ArrayList();
        this.f6607c = new ArrayList();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.f6608d = atomicInteger;
        AtomicLong atomicLong = new AtomicLong(0L);
        this.f6609e = atomicLong;
        this.f6610f = new AtomicReference(Double.valueOf(0.0d));
        application.registerActivityLifecycleCallbacks(this);
        atomicInteger.set(application.getResources().getConfiguration().orientation);
        if (atomicInteger.get() == 1) {
            atomicLong.set(System.currentTimeMillis());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity.isFinishing()) {
            activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f6607c.add(Long.valueOf(System.currentTimeMillis()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f6606b.add(Long.valueOf(System.currentTimeMillis()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i3 = activity.getResources().getConfiguration().orientation;
        AtomicInteger atomicInteger = this.f6608d;
        if (atomicInteger.compareAndSet(i3, i3)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i10 = atomicInteger.get();
        AtomicLong atomicLong = this.f6609e;
        if (i10 == 1) {
            atomicLong.set(currentTimeMillis);
        } else {
            if (i10 != 2) {
                return;
            }
            AtomicReference atomicReference = this.f6610f;
            atomicReference.set(Double.valueOf(((Double) atomicReference.get()).doubleValue() + (currentTimeMillis - atomicLong.get())));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
