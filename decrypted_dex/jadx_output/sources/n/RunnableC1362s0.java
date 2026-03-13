package n;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: n.s0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class RunnableC1362s0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC1364t0 f17603b;

    public /* synthetic */ RunnableC1362s0(AbstractViewOnTouchListenerC1364t0 abstractViewOnTouchListenerC1364t0, int i3) {
        this.f17602a = i3;
        this.f17603b = abstractViewOnTouchListenerC1364t0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17602a) {
            case 0:
                ViewParent parent = this.f17603b.f17613d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC1364t0 abstractViewOnTouchListenerC1364t0 = this.f17603b;
                abstractViewOnTouchListenerC1364t0.a();
                View view = abstractViewOnTouchListenerC1364t0.f17613d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC1364t0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC1364t0.f17616g = true;
                    break;
                }
                break;
        }
    }
}
