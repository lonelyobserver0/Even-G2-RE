package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class QueryFeatureStateCallbackNative implements QueryFeatureStateCallback {
    private long peer;

    public static class QueryFeatureStateCallbackPeerCleaner implements Runnable {
        private long peer;

        public QueryFeatureStateCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            QueryFeatureStateCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private QueryFeatureStateCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new QueryFeatureStateCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.QueryFeatureStateCallback
    public native void run(Expected<String, Value> expected);
}
