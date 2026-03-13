package io.flutter.view;

import android.view.accessibility.AccessibilityManager;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f15101a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f15102b;

    public d(l lVar, AccessibilityManager accessibilityManager) {
        this.f15102b = lVar;
        this.f15101a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        l lVar = this.f15102b;
        if (lVar.f15207u) {
            return;
        }
        boolean z10 = false;
        if (!z2) {
            lVar.i(false);
            h hVar = lVar.f15201o;
            if (hVar != null) {
                lVar.g(hVar.f15159b, 256);
                lVar.f15201o = null;
            }
        }
        s2.d dVar = lVar.f15205s;
        if (dVar != null) {
            boolean isEnabled = this.f15101a.isEnabled();
            Xa.r rVar = (Xa.r) dVar.f20712b;
            if (rVar.f8575h.f8862b.f15057a.getIsSoftwareRenderingEnabled()) {
                rVar.setWillNotDraw(false);
                return;
            }
            if (!isEnabled && !z2) {
                z10 = true;
            }
            rVar.setWillNotDraw(z10);
        }
    }
}
