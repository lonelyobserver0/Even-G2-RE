package d0;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d0.z, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class ViewOnAttachStateChangeListenerC0795z implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13405a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13406b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13407c;

    public ViewOnAttachStateChangeListenerC0795z(LayoutInflaterFactory2C0763A layoutInflaterFactory2C0763A, U u2) {
        this.f13407c = layoutInflaterFactory2C0763A;
        this.f13406b = u2;
    }

    private final void a(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        switch (this.f13405a) {
            case 0:
                U u2 = (U) this.f13406b;
                u2.k();
                e0.m((ViewGroup) u2.f13216c.f13354I.getParent(), ((LayoutInflaterFactory2C0763A) this.f13407c).f13123a).l();
                break;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnAttachStateChangeListener(this);
                Activity activity = (Activity) ((WeakReference) this.f13407c).get();
                IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                if (activity != null && iBinder != null) {
                    ((f2.i) this.f13406b).c(iBinder, activity);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f13405a) {
            case 0:
                break;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                break;
        }
    }

    public ViewOnAttachStateChangeListenerC0795z(f2.i sidecarCompat, Activity activity) {
        Intrinsics.checkNotNullParameter(sidecarCompat, "sidecarCompat");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f13406b = sidecarCompat;
        this.f13407c = new WeakReference(activity);
    }
}
