package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.n0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0652n0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0657o0 f11627a;

    public C0652n0(C0657o0 c0657o0) {
        Objects.requireNonNull(c0657o0);
        this.f11627a = c0657o0;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f11627a.a(new C0607e0(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f11627a.a(new C0647m0(this, activity, 4));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f11627a.a(new C0647m0(this, activity, 2));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f11627a.a(new C0647m0(this, activity, 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        G g10 = new G();
        this.f11627a.a(new C0607e0(this, activity, g10));
        Bundle g11 = g10.g(50L);
        if (g11 != null) {
            bundle.putAll(g11);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f11627a.a(new C0647m0(this, activity, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f11627a.a(new C0647m0(this, activity, 3));
    }
}
