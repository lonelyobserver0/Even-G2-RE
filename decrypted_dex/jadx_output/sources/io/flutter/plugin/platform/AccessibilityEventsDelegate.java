package io.flutter.plugin.platform;

import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import io.flutter.view.l;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
class AccessibilityEventsDelegate {
    private l accessibilityBridge;

    public boolean onAccessibilityHoverEvent(MotionEvent motionEvent, boolean z2) {
        l lVar = this.accessibilityBridge;
        if (lVar == null) {
            return false;
        }
        return lVar.e(motionEvent, z2);
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        l lVar = this.accessibilityBridge;
        if (lVar == null) {
            return false;
        }
        return lVar.a(view, view2, accessibilityEvent);
    }

    public void setAccessibilityBridge(l lVar) {
        this.accessibilityBridge = lVar;
    }
}
