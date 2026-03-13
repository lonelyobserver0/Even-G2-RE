package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class QueryRenderedFeaturesCallbackNative implements QueryRenderedFeaturesCallback {
    private long peer;

    public static class QueryRenderedFeaturesCallbackPeerCleaner implements Runnable {
        private long peer;

        public QueryRenderedFeaturesCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            QueryRenderedFeaturesCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private QueryRenderedFeaturesCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new QueryRenderedFeaturesCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.QueryRenderedFeaturesCallback
    public native void run(Expected<String, List<QueriedRenderedFeature>> expected);
}
