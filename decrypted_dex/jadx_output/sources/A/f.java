package A;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f22a;

    public f(CoordinatorLayout coordinatorLayout) {
        this.f22a = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f22a.p(0);
        return true;
    }
}
