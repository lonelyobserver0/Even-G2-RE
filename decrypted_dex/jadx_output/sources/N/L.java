package N;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f4740a;

    public L(View view) {
        this.f4740a = new WeakReference(view);
    }

    public final void a(float f10) {
        View view = (View) this.f4740a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
    }

    public final void b() {
        View view = (View) this.f4740a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.f4740a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(M m4) {
        View view = (View) this.f4740a.get();
        if (view != null) {
            if (m4 != null) {
                view.animate().setListener(new K4.m(m4, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f10) {
        View view = (View) this.f4740a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
    }
}
