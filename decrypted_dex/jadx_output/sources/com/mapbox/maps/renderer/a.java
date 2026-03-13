package com.mapbox.maps.renderer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12452a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapboxRenderThread f12453b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12454c;

    public /* synthetic */ a(MapboxRenderThread mapboxRenderThread, int i3, int i10) {
        this.f12452a = i10;
        this.f12453b = mapboxRenderThread;
        this.f12454c = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12452a) {
            case 0:
                MapboxRenderThread.setUserRefreshRate$lambda$19(this.f12453b, this.f12454c);
                break;
            default:
                MapboxRenderThread.setScreenRefreshRate$lambda$15(this.f12453b, this.f12454c);
                break;
        }
    }
}
