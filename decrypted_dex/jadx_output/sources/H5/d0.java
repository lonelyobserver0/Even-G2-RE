package H5;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f2855a = new d0();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f2856b;

    /* renamed from: c, reason: collision with root package name */
    public static p2.h f2857c;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        p2.h hVar = f2857c;
        if (hVar != null) {
            hVar.j(2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Unit unit;
        Intrinsics.checkNotNullParameter(activity, "activity");
        p2.h hVar = f2857c;
        if (hVar != null) {
            hVar.j(1);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            f2856b = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
