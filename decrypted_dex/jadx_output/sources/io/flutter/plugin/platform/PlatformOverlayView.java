package io.flutter.plugin.platform;

import Xa.i;
import Xa.j;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class PlatformOverlayView extends j {
    private AccessibilityEventsDelegate accessibilityDelegate;

    public PlatformOverlayView(Context context, int i3, int i10, AccessibilityEventsDelegate accessibilityEventsDelegate) {
        super(context, i3, i10, i.f8546b);
        this.accessibilityDelegate = accessibilityEventsDelegate;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        AccessibilityEventsDelegate accessibilityEventsDelegate = this.accessibilityDelegate;
        if (accessibilityEventsDelegate == null || !accessibilityEventsDelegate.onAccessibilityHoverEvent(motionEvent, true)) {
            return super.onHoverEvent(motionEvent);
        }
        return true;
    }

    public PlatformOverlayView(Context context) {
        this(context, 1, 1, null);
    }

    public PlatformOverlayView(Context context, AttributeSet attributeSet) {
        this(context, 1, 1, null);
    }
}
