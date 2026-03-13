package com.mapbox.maps;

import com.mapbox.maps.renderer.RendererSetupErrorListener;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12426a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapController f12427b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RendererSetupErrorListener f12428c;

    public /* synthetic */ b(MapController mapController, RendererSetupErrorListener rendererSetupErrorListener, int i3) {
        this.f12426a = i3;
        this.f12427b = mapController;
        this.f12428c = rendererSetupErrorListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12426a) {
            case 0:
                MapController.addRendererSetupErrorListener$lambda$10(this.f12427b, this.f12428c);
                break;
            default:
                MapController.removeRendererSetupErrorListener$lambda$11(this.f12427b, this.f12428c);
                break;
        }
    }
}
