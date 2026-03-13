package androidx.recyclerview.widget;

import N.C0156b;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f0 extends C0156b {

    /* renamed from: d, reason: collision with root package name */
    public final g0 f10163d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f10164e = new WeakHashMap();

    public f0(g0 g0Var) {
        this.f10163d = g0Var;
    }

    @Override // N.C0156b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C0156b c0156b = (C0156b) this.f10164e.get(view);
        return c0156b != null ? c0156b.a(view, accessibilityEvent) : this.f4768a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // N.C0156b
    public final Z9.q b(View view) {
        C0156b c0156b = (C0156b) this.f10164e.get(view);
        return c0156b != null ? c0156b.b(view) : super.b(view);
    }

    @Override // N.C0156b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C0156b c0156b = (C0156b) this.f10164e.get(view);
        if (c0156b != null) {
            c0156b.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // N.C0156b
    public final void d(View view, O.e eVar) {
        g0 g0Var = this.f10163d;
        boolean hasPendingAdapterUpdates = g0Var.f10170d.hasPendingAdapterUpdates();
        View.AccessibilityDelegate accessibilityDelegate = this.f4768a;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f5069a;
        if (!hasPendingAdapterUpdates) {
            RecyclerView recyclerView = g0Var.f10170d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().O(view, eVar);
                C0156b c0156b = (C0156b) this.f10164e.get(view);
                if (c0156b != null) {
                    c0156b.d(view, eVar);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // N.C0156b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C0156b c0156b = (C0156b) this.f10164e.get(view);
        if (c0156b != null) {
            c0156b.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // N.C0156b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0156b c0156b = (C0156b) this.f10164e.get(viewGroup);
        return c0156b != null ? c0156b.f(viewGroup, view, accessibilityEvent) : this.f4768a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // N.C0156b
    public final boolean g(View view, int i3, Bundle bundle) {
        g0 g0Var = this.f10163d;
        if (!g0Var.f10170d.hasPendingAdapterUpdates()) {
            RecyclerView recyclerView = g0Var.f10170d;
            if (recyclerView.getLayoutManager() != null) {
                C0156b c0156b = (C0156b) this.f10164e.get(view);
                if (c0156b != null) {
                    if (c0156b.g(view, i3, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i3, bundle)) {
                    return true;
                }
                V v2 = recyclerView.getLayoutManager().f10039b.mRecycler;
                return false;
            }
        }
        return super.g(view, i3, bundle);
    }

    @Override // N.C0156b
    public final void h(View view, int i3) {
        C0156b c0156b = (C0156b) this.f10164e.get(view);
        if (c0156b != null) {
            c0156b.h(view, i3);
        } else {
            super.h(view, i3);
        }
    }

    @Override // N.C0156b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C0156b c0156b = (C0156b) this.f10164e.get(view);
        if (c0156b != null) {
            c0156b.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
