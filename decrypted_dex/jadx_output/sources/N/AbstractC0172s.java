package N;

import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import android.window.BackEvent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: N.s, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0172s {
    public static AccessibilityNodeInfo.AccessibilityAction a() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float b(VelocityTracker velocityTracker, int i3) {
        return velocityTracker.getAxisVelocity(i3);
    }

    public static void c(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int e(ViewConfiguration viewConfiguration, int i3, int i10, int i11) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i3, i10, i11);
    }

    public static int f(ViewConfiguration viewConfiguration, int i3, int i10, int i11) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i3, i10, i11);
    }

    public static boolean g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static float h(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public static void i(TextView textView, int i3, float f10) {
        textView.setLineHeight(i3, f10);
    }

    public static int j(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public static float k(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public static float l(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
