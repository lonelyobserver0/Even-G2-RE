package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.H;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class F {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC0438m event) {
        C0446v i3;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(event, "event");
        if (!(activity instanceof InterfaceC0444t) || (i3 = ((InterfaceC0444t) activity).i()) == null) {
            return;
        }
        i3.e(event);
    }

    public static void b(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            H.a.Companion.getClass();
            Intrinsics.checkNotNullParameter(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new H.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new H(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
