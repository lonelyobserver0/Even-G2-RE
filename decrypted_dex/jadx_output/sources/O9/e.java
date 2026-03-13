package O9;

import Xa.AbstractActivityC0364d;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC0444t;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractActivityC0364d f5306a;

    public e(AbstractActivityC0364d abstractActivityC0364d) {
        this.f5306a = abstractActivityC0364d;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void A(InterfaceC0444t interfaceC0444t) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void d(InterfaceC0444t interfaceC0444t) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void e(InterfaceC0444t interfaceC0444t) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void k(InterfaceC0444t interfaceC0444t) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f5306a != activity || StubApp.getOrigApplicationContext(activity.getApplicationContext()) == null) {
            return;
        }
        ((Application) StubApp.getOrigApplicationContext(activity.getApplicationContext())).unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void p(InterfaceC0444t interfaceC0444t) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void v(InterfaceC0444t interfaceC0444t) {
        onActivityDestroyed(this.f5306a);
    }
}
