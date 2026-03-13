package A;

import android.graphics.Matrix;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f27a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f28b = new ThreadLocal();

    public static void a(CoordinatorLayout coordinatorLayout, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != coordinatorLayout) {
            a(coordinatorLayout, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
