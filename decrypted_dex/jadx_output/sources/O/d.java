package O;

import E0.x;
import N.AbstractC0172s;
import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import com.stub.StubApp;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final d f5058e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f5059f;

    /* renamed from: g, reason: collision with root package name */
    public static final d f5060g;

    /* renamed from: h, reason: collision with root package name */
    public static final d f5061h;

    /* renamed from: i, reason: collision with root package name */
    public static final d f5062i;
    public static final d j;

    /* renamed from: k, reason: collision with root package name */
    public static final d f5063k;

    /* renamed from: l, reason: collision with root package name */
    public static final d f5064l;

    /* renamed from: a, reason: collision with root package name */
    public final Object f5065a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5066b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f5067c;

    /* renamed from: d, reason: collision with root package name */
    public final x f5068d;

    static {
        new d(null, 1, null, null);
        new d(null, 2, null, null);
        new d(null, 4, null, null);
        new d(null, 8, null, null);
        f5058e = new d(null, 16, null, null);
        new d(null, 32, null, null);
        new d(null, 64, null, null);
        new d(null, 128, null, null);
        new d(null, 256, null, g.class);
        new d(null, 512, null, g.class);
        new d(null, 1024, null, h.class);
        new d(null, 2048, null, h.class);
        f5059f = new d(null, 4096, null, null);
        f5060g = new d(null, 8192, null, null);
        new d(null, 16384, null, null);
        new d(null, 32768, null, null);
        new d(null, PKIFailureInfo.notAuthorized, null, null);
        new d(null, PKIFailureInfo.unsupportedVersion, null, l.class);
        f5061h = new d(null, PKIFailureInfo.transactionIdInUse, null, null);
        f5062i = new d(null, PKIFailureInfo.signerNotTrusted, null, null);
        j = new d(null, PKIFailureInfo.badCertTemplate, null, null);
        new d(null, PKIFailureInfo.badSenderNonce, null, m.class);
        int i3 = Build.VERSION.SDK_INT;
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, j.class);
        f5063k = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null);
        f5064l = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null);
        new d(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null);
        new d(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null);
        new d(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null);
        new d(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, k.class);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, i.class);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null);
        new d(i3 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null);
        new d(i3 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null);
        new d(i3 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null);
        new d(i3 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null);
        new d(i3 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null);
        new d(i3 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null);
        new d(i3 >= 34 ? AbstractC0172s.a() : null, R.id.accessibilityActionScrollInDirection, null, null);
    }

    public d(Object obj, int i3, x xVar, Class cls) {
        this.f5066b = i3;
        this.f5068d = xVar;
        if (obj == null) {
            this.f5065a = new AccessibilityNodeInfo.AccessibilityAction(i3, null);
        } else {
            this.f5065a = obj;
        }
        this.f5067c = cls;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        Object obj2 = ((d) obj).f5065a;
        Object obj3 = this.f5065a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f5065a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(3867));
        String d8 = e.d(this.f5066b);
        if (d8.equals(StubApp.getString2(3868))) {
            Object obj = this.f5065a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d8 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb2.append(d8);
        return sb2.toString();
    }
}
