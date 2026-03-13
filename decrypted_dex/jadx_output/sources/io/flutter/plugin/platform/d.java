package io.flutter.plugin.platform;

import android.view.View;
import gb.D;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class d implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15078a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlatformViewsController f15079b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D f15080c;

    public /* synthetic */ d(PlatformViewsController platformViewsController, D d8, int i3) {
        this.f15078a = i3;
        this.f15079b = platformViewsController;
        this.f15080c = d8;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        switch (this.f15078a) {
            case 0:
                this.f15079b.lambda$configureForTextureLayerComposition$1(this.f15080c, view, z2);
                break;
            default:
                this.f15079b.lambda$configureForVirtualDisplay$0(this.f15080c, view, z2);
                break;
        }
    }
}
