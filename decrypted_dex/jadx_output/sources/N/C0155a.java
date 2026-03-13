package N;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.stub.StubApp;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: N.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0155a extends View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final C0156b f4766a;

    public C0155a(C0156b c0156b) {
        this.f4766a = c0156b;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f4766a.a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        Z9.q b2 = this.f4766a.b(view);
        if (b2 != null) {
            return (AccessibilityNodeProvider) b2.f9143b;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f4766a.c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        O.e eVar = new O.e(accessibilityNodeInfo);
        WeakHashMap weakHashMap = I.f4732a;
        accessibilityNodeInfo.setScreenReaderFocusable(Boolean.valueOf(E.c(view)).booleanValue());
        accessibilityNodeInfo.setHeading(Boolean.valueOf(E.b(view)).booleanValue());
        accessibilityNodeInfo.setPaneTitle(E.a(view));
        if (Build.VERSION.SDK_INT >= 30) {
            tag = G.b(view);
        } else {
            tag = view.getTag(2131231108);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag;
        if (Build.VERSION.SDK_INT >= 30) {
            G.a.g(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence(StubApp.getString2(3623), charSequence);
        }
        this.f4766a.d(view, eVar);
        accessibilityNodeInfo.getText();
        List list = (List) view.getTag(2131231099);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            eVar.b((O.d) list.get(i3));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f4766a.e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f4766a.f(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i3, Bundle bundle) {
        return this.f4766a.g(view, i3, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i3) {
        this.f4766a.h(view, i3);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f4766a.i(view, accessibilityEvent);
    }
}
