package io.flutter.view;

import android.view.accessibility.AccessibilityManager;
import gb.C0973b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f15100a;

    public c(l lVar) {
        this.f15100a = lVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z2) {
        l lVar = this.f15100a;
        if (lVar.f15207u) {
            return;
        }
        boolean z10 = false;
        C0973b c0973b = lVar.f15189b;
        if (z2) {
            b bVar = lVar.f15208v;
            c0973b.f14325c = bVar;
            c0973b.f14324b.setAccessibilityDelegate(bVar);
            c0973b.f14324b.setSemanticsEnabled(true);
        } else {
            lVar.i(false);
            c0973b.f14325c = null;
            c0973b.f14324b.setAccessibilityDelegate(null);
            c0973b.f14324b.setSemanticsEnabled(false);
        }
        s2.d dVar = lVar.f15205s;
        if (dVar != null) {
            boolean isTouchExplorationEnabled = lVar.f15190c.isTouchExplorationEnabled();
            Xa.r rVar = (Xa.r) dVar.f20712b;
            if (rVar.f8575h.f8862b.f15057a.getIsSoftwareRenderingEnabled()) {
                rVar.setWillNotDraw(false);
                return;
            }
            if (!z2 && !isTouchExplorationEnabled) {
                z10 = true;
            }
            rVar.setWillNotDraw(z10);
        }
    }
}
