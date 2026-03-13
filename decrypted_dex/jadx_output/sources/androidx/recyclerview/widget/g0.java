package androidx.recyclerview.widget;

import N.C0156b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g0 extends C0156b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f10170d;

    /* renamed from: e, reason: collision with root package name */
    public final f0 f10171e;

    public g0(RecyclerView recyclerView) {
        this.f10170d = recyclerView;
        f0 f0Var = this.f10171e;
        if (f0Var != null) {
            this.f10171e = f0Var;
        } else {
            this.f10171e = new f0(this);
        }
    }

    @Override // N.C0156b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f10170d.hasPendingAdapterUpdates()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().N(accessibilityEvent);
        }
    }

    @Override // N.C0156b
    public final void d(View view, O.e eVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f4768a;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f5069a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.f10170d;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return;
        }
        M layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f10039b;
        V v2 = recyclerView2.mRecycler;
        b0 b0Var = recyclerView2.mState;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f10039b.canScrollHorizontally(-1)) {
            eVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f10039b.canScrollVertically(1) || layoutManager.f10039b.canScrollHorizontally(1)) {
            eVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.E(v2, b0Var), layoutManager.x(v2, b0Var), false, 0));
    }

    @Override // N.C0156b
    public final boolean g(View view, int i3, Bundle bundle) {
        int B7;
        int z2;
        int i10;
        int i11;
        if (super.g(view, i3, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f10170d;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        M layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f10039b;
        V v2 = recyclerView2.mRecycler;
        if (i3 == 4096) {
            B7 = recyclerView2.canScrollVertically(1) ? (layoutManager.f10051o - layoutManager.B()) - layoutManager.y() : 0;
            if (layoutManager.f10039b.canScrollHorizontally(1)) {
                z2 = (layoutManager.f10050n - layoutManager.z()) - layoutManager.A();
                i11 = z2;
                i10 = B7;
            }
            i10 = B7;
            i11 = 0;
        } else if (i3 != 8192) {
            i11 = 0;
            i10 = 0;
        } else {
            B7 = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f10051o - layoutManager.B()) - layoutManager.y()) : 0;
            if (layoutManager.f10039b.canScrollHorizontally(-1)) {
                z2 = -((layoutManager.f10050n - layoutManager.z()) - layoutManager.A());
                i11 = z2;
                i10 = B7;
            }
            i10 = B7;
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        layoutManager.f10039b.smoothScrollBy(i11, i10, null, Integer.MIN_VALUE, true);
        return true;
    }
}
