package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class FeatureStateOperationCallbackNative implements FeatureStateOperationCallback {
    private long peer;

    public static class FeatureStateOperationCallbackPeerCleaner implements Runnable {
        private long peer;

        public FeatureStateOperationCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            FeatureStateOperationCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private FeatureStateOperationCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new FeatureStateOperationCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.FeatureStateOperationCallback
    public native void run(Expected<String, None> expected);
}
