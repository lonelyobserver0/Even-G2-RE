package n;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import m.ViewTreeObserverOnGlobalLayoutListenerC1261d;

/* renamed from: n.M, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1312M implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1261d f17433a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1313N f17434b;

    public C1312M(C1313N c1313n, ViewTreeObserverOnGlobalLayoutListenerC1261d viewTreeObserverOnGlobalLayoutListenerC1261d) {
        this.f17434b = c1313n;
        this.f17433a = viewTreeObserverOnGlobalLayoutListenerC1261d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f17434b.f17439I.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f17433a);
        }
    }
}
