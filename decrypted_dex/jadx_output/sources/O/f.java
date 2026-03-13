package O;

import Z9.q;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final q f5071a;

    public f(q qVar) {
        this.f5071a = qVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i3, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.f5071a.getClass();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i3) {
        e g10 = this.f5071a.g(i3);
        if (g10 == null) {
            return null;
        }
        return g10.f5069a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i3) {
        this.f5071a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i3) {
        e k3 = this.f5071a.k(i3);
        if (k3 == null) {
            return null;
        }
        return k3.f5069a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i3, int i10, Bundle bundle) {
        return this.f5071a.D(i3, i10, bundle);
    }
}
