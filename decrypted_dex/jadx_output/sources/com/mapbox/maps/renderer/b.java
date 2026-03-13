package com.mapbox.maps.renderer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12455a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapboxRenderThread f12456b;

    public /* synthetic */ b(MapboxRenderThread mapboxRenderThread, int i3) {
        this.f12455a = i3;
        this.f12456b = mapboxRenderThread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12455a) {
            case 0:
                MapboxRenderThread.prepareRenderFrameRunnable$lambda$4(this.f12456b);
                break;
            case 1:
                MapboxRenderThread.destroy$lambda$29$lambda$28$lambda$27(this.f12456b);
                break;
            case 2:
                MapboxRenderThread.onSurfaceDestroyed$lambda$14$lambda$13$lambda$12(this.f12456b);
                break;
            default:
                MapboxRenderThread.scheduleThreadServiceTypeReset$lambda$24(this.f12456b);
                break;
        }
    }
}
