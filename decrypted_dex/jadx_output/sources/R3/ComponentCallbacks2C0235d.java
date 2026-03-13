package R3;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: R3.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ComponentCallbacks2C0235d implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e, reason: collision with root package name */
    public static final ComponentCallbacks2C0235d f6114e = new ComponentCallbacks2C0235d();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f6115a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f6116b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6117c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f6118d = false;

    public static void a(Application application) {
        ComponentCallbacks2C0235d componentCallbacks2C0235d = f6114e;
        synchronized (componentCallbacks2C0235d) {
            try {
                if (!componentCallbacks2C0235d.f6118d) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C0235d);
                    application.registerComponentCallbacks(componentCallbacks2C0235d);
                    componentCallbacks2C0235d.f6118d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(boolean z2) {
        synchronized (f6114e) {
            try {
                Iterator it = this.f6117c.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0234c) it.next()).a(z2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f6116b;
        boolean compareAndSet = this.f6115a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f6116b;
        boolean compareAndSet = this.f6115a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            b(false);
        }
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

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        if (i3 == 20 && this.f6115a.compareAndSet(false, true)) {
            this.f6116b.set(true);
            b(true);
        }
    }
}
