package z4;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f24105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChipGroup f24106b;

    public h(ChipGroup chipGroup) {
        this.f24106b = chipGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ChipGroup chipGroup = this.f24106b;
        if (view == chipGroup && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                view2.setId(View.generateViewId());
            }
            ((Chip) view2).setOnCheckedChangeListenerInternal(chipGroup.f11889g);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f24105a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        if (view == this.f24106b && (view2 instanceof Chip)) {
            ((Chip) view2).setOnCheckedChangeListenerInternal(null);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f24105a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
