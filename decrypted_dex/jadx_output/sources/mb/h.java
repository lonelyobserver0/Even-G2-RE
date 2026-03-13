package mb;

import Xa.AbstractActivityC0364d;
import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC0444t;
import com.stub.StubApp;
import f4.C0882f;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractActivityC0364d f17320a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f17321b;

    public h(i iVar, AbstractActivityC0364d abstractActivityC0364d) {
        this.f17321b = iVar;
        this.f17320a = abstractActivityC0364d;
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
        if (this.f17320a != activity || StubApp.getOrigApplicationContext(activity.getApplicationContext()) == null) {
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
        if (this.f17320a == activity) {
            f fVar = this.f17321b.f17323b.f17315c;
            synchronized (fVar.f17312m) {
                try {
                    a5.c cVar = fVar.f17311l;
                    if (cVar == null) {
                        return;
                    }
                    t tVar = (t) cVar.f9282b;
                    C0882f c0882f = fVar.f17305d;
                    int i3 = tVar != null ? 1 : 2;
                    c0882f.getClass();
                    int c10 = AbstractC1856e.c(i3);
                    if (c10 == 0) {
                        ((Activity) c0882f.f13748b).getSharedPreferences(StubApp.getString2(17487), 0).edit().putString(StubApp.getString2(21197), StubApp.getString2(1483)).apply();
                    } else if (c10 == 1) {
                        ((Activity) c0882f.f13748b).getSharedPreferences(StubApp.getString2(17487), 0).edit().putString(StubApp.getString2(21197), StubApp.getString2(3235)).apply();
                    }
                    if (tVar != null) {
                        SharedPreferences.Editor edit = ((Activity) fVar.f17305d.f13748b).getSharedPreferences(StubApp.getString2(17487), 0).edit();
                        Double d8 = tVar.f17345a;
                        if (d8 != null) {
                            edit.putLong(StubApp.getString2(21198), Double.doubleToRawLongBits(d8.doubleValue()));
                        }
                        Double d10 = tVar.f17346b;
                        if (d10 != null) {
                            edit.putLong(StubApp.getString2(21199), Double.doubleToRawLongBits(d10.doubleValue()));
                        }
                        edit.putInt(StubApp.getString2(21200), tVar.f17347c.intValue());
                        edit.apply();
                    }
                    Uri uri = fVar.f17310k;
                    if (uri != null) {
                        ((Activity) fVar.f17305d.f13748b).getSharedPreferences(StubApp.getString2(17487), 0).edit().putString(StubApp.getString2(21182), uri.getPath()).apply();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void p(InterfaceC0444t interfaceC0444t) {
        onActivityStopped(this.f17320a);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void v(InterfaceC0444t interfaceC0444t) {
        onActivityDestroyed(this.f17320a);
    }
}
