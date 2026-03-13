package A;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f7a;

    public d(CoordinatorLayout coordinatorLayout) {
        this.f7a = coordinatorLayout;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f7a.f9652s;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        CoordinatorLayout coordinatorLayout = this.f7a;
        coordinatorLayout.p(2);
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.f9652s;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
