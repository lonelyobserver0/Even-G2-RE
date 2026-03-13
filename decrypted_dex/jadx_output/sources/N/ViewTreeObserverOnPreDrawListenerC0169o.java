package N;

import android.view.View;
import android.view.ViewTreeObserver;
import com.stub.StubApp;

/* renamed from: N.o, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ViewTreeObserverOnPreDrawListenerC0169o implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f4796a;

    /* renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f4797b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f4798c;

    public ViewTreeObserverOnPreDrawListenerC0169o(View view, Runnable runnable) {
        this.f4796a = view;
        this.f4797b = view.getViewTreeObserver();
        this.f4798c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException(StubApp.getString2(3653));
        }
        ViewTreeObserverOnPreDrawListenerC0169o viewTreeObserverOnPreDrawListenerC0169o = new ViewTreeObserverOnPreDrawListenerC0169o(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0169o);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0169o);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f4797b.isAlive();
        View view = this.f4796a;
        if (isAlive) {
            this.f4797b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f4798c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f4797b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f4797b.isAlive();
        View view2 = this.f4796a;
        if (isAlive) {
            this.f4797b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
