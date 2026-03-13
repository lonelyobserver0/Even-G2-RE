package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class CustomLayerMapProjectionNative implements CustomLayerMapProjection {
    protected long peer;

    public static class CustomLayerMapProjectionPeerCleaner implements Runnable {
        private long peer;

        public CustomLayerMapProjectionPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            CustomLayerMapProjectionNative.cleanNativePeer(this.peer);
        }
    }

    public CustomLayerMapProjectionNative(long j) {
        this.peer = j;
        CleanerService.register(this, new CustomLayerMapProjectionPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.CustomLayerMapProjection
    public native List<Double> convertMercatorModelMatrix(List<Double> list, boolean z2);

    @Override // com.mapbox.maps.CustomLayerMapProjection
    public native List<Double> getModelMatrix();

    @Override // com.mapbox.maps.CustomLayerMapProjection
    public native List<Double> getTransitionMatrix();

    @Override // com.mapbox.maps.CustomLayerMapProjection
    public native float getTransitionPhase();
}
