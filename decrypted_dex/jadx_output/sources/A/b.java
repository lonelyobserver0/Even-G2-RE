package A;

import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class b {
    public boolean a(View view) {
        return false;
    }

    public void b(View view) {
    }

    public void c(e eVar) {
    }

    public boolean d(View view, View view2) {
        return false;
    }

    public void e() {
    }

    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        return false;
    }

    public boolean h(CoordinatorLayout coordinatorLayout, View view) {
        return false;
    }

    public boolean i(View view) {
        return false;
    }

    public void j(View view, View view2, int i3, int[] iArr, int i10) {
    }

    public void k(View view, int i3) {
    }

    public void l(CoordinatorLayout coordinatorLayout, View view, View view2, int i3, int i10, int i11, int i12, int i13, int[] iArr) {
        iArr[0] = iArr[0] + i11;
        iArr[1] = iArr[1] + i12;
        if (i13 == 0) {
            k(view, i10);
        }
    }

    public void m(CoordinatorLayout coordinatorLayout, View view) {
    }

    public void n(View view, Parcelable parcelable) {
    }

    public Parcelable o(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean p(int i3) {
        return false;
    }

    public boolean q(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i3, int i10) {
        if (i10 == 0) {
            return p(i3);
        }
        return false;
    }

    public void r(View view, View view2, int i3) {
    }

    public boolean s(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }
}
