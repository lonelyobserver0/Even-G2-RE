package N;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.WeakHashMap;

/* renamed from: N.x, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0177x implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f4808a = new WeakHashMap();

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
