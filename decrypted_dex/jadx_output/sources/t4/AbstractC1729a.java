package t4;

import A.b;
import Dc.B;
import N.I;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;

/* renamed from: t4.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1729a extends b {

    /* renamed from: a, reason: collision with root package name */
    public B f21164a;

    @Override // A.b
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        t(coordinatorLayout, view, i3);
        if (this.f21164a == null) {
            B b2 = new B();
            b2.f1541c = view;
            this.f21164a = b2;
        }
        B b10 = this.f21164a;
        View view2 = (View) b10.f1541c;
        b10.f1539a = view2.getTop();
        b10.f1540b = view2.getLeft();
        B b11 = this.f21164a;
        View view3 = (View) b11.f1541c;
        int top = 0 - (view3.getTop() - b11.f1539a);
        WeakHashMap weakHashMap = I.f4732a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - b11.f1540b));
        return true;
    }

    public void t(CoordinatorLayout coordinatorLayout, View view, int i3) {
        coordinatorLayout.q(view, i3);
    }
}
