package kc;

import Xa.AbstractActivityC0364d;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kc.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C1129f implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0364d f15575a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1126c f15576b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1126c f15577c;

    public C1129f(AbstractActivityC0364d abstractActivityC0364d, C1126c c1126c, C1126c c1126c2) {
        this.f15575a = abstractActivityC0364d;
        this.f15576b = c1126c;
        this.f15577c = c1126c2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity p02, Bundle bundle) {
        Intrinsics.checkNotNullParameter(p02, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        if (Intrinsics.areEqual(p02, this.f15575a)) {
            this.f15576b.invoke();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        if (Intrinsics.areEqual(p02, this.f15575a)) {
            this.f15577c.invoke();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity p02, Bundle p1) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
    }
}
