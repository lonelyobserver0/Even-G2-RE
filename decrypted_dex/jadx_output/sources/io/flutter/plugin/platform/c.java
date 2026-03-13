package io.flutter.plugin.platform;

import android.view.View;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class c implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15075a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15076b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PlatformViewsAccessibilityDelegate f15077c;

    public /* synthetic */ c(PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate, int i3, int i10) {
        this.f15075a = i10;
        this.f15077c = platformViewsAccessibilityDelegate;
        this.f15076b = i3;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        switch (this.f15075a) {
            case 0:
                ((PlatformViewsController) this.f15077c).lambda$initializePlatformViewIfNeeded$2(this.f15076b, view, z2);
                break;
            default:
                ((PlatformViewsController2) this.f15077c).lambda$initializePlatformViewIfNeeded$0(this.f15076b, view, z2);
                break;
        }
    }
}
