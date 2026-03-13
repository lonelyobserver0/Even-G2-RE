package com.mapbox.maps;

import com.mapbox.maps.renderer.MapboxRenderThread;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12429a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12430b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12431c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12432d;

    public /* synthetic */ c(Object obj, int i3, int i10, int i11) {
        this.f12429a = i11;
        this.f12432d = obj;
        this.f12430b = i3;
        this.f12431c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12429a) {
            case 0:
                MapController.onSizeChanged$lambda$9((MapController) this.f12432d, this.f12430b, this.f12431c);
                break;
            default:
                MapboxRenderThread.onSurfaceSizeChanged$lambda$10((MapboxRenderThread) this.f12432d, this.f12430b, this.f12431c);
                break;
        }
    }
}
