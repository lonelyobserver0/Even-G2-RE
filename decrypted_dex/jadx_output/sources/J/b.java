package J;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import f.C0861a;
import i.AbstractActivityC1027h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class b {
    public static OnBackInvokedDispatcher a(AbstractActivityC1027h activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
        return onBackInvokedDispatcher;
    }

    public static Object b(String str, Bundle bundle) {
        return bundle.getParcelable(str, C0861a.class);
    }

    public static String c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static void e(Object dispatcher, Object callback) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(0, (OnBackInvokedCallback) callback);
    }

    public static void f(Object dispatcher, Object callback) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
    }
}
