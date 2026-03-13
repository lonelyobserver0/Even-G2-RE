package com.mapbox.maps.renderer;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxRenderThread$fpsChangedListener$2$1 implements Runnable {
    final /* synthetic */ OnFpsChangedListener $new;
    final /* synthetic */ MapboxRenderThread this$0;

    public MapboxRenderThread$fpsChangedListener$2$1(MapboxRenderThread mapboxRenderThread, OnFpsChangedListener onFpsChangedListener) {
        this.this$0 = mapboxRenderThread;
        this.$new = onFpsChangedListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FpsManager fpsManager;
        fpsManager = this.this$0.fpsManager;
        fpsManager.setFpsChangedListener$maps_sdk_release(this.$new);
    }
}
