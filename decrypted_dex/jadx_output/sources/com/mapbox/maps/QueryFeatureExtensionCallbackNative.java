package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class QueryFeatureExtensionCallbackNative implements QueryFeatureExtensionCallback {
    private long peer;

    public static class QueryFeatureExtensionCallbackPeerCleaner implements Runnable {
        private long peer;

        public QueryFeatureExtensionCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            QueryFeatureExtensionCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private QueryFeatureExtensionCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new QueryFeatureExtensionCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.QueryFeatureExtensionCallback
    public native void run(Expected<String, FeatureExtensionValue> expected);
}
