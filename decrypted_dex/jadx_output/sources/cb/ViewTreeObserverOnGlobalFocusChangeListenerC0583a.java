package cb;

import a4.f;
import android.view.View;
import android.view.ViewTreeObserver;
import sb.C1674t0;

/* renamed from: cb.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ViewTreeObserverOnGlobalFocusChangeListenerC0583a implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View.OnFocusChangeListener f11055a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0584b f11056b;

    public ViewTreeObserverOnGlobalFocusChangeListenerC0583a(View.OnFocusChangeListener onFocusChangeListener, C0584b c0584b) {
        this.f11055a = onFocusChangeListener;
        this.f11056b = c0584b;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        C0584b c0584b = this.f11056b;
        this.f11055a.onFocusChange(c0584b, f.w(c0584b, new C1674t0(7)));
    }
}
