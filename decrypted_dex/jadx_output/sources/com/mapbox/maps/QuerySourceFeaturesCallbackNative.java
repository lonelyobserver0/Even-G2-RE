package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class QuerySourceFeaturesCallbackNative implements QuerySourceFeaturesCallback {
    private long peer;

    public static class QuerySourceFeaturesCallbackPeerCleaner implements Runnable {
        private long peer;

        public QuerySourceFeaturesCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            QuerySourceFeaturesCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private QuerySourceFeaturesCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new QuerySourceFeaturesCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.QuerySourceFeaturesCallback
    public native void run(Expected<String, List<QueriedSourceFeature>> expected);
}
