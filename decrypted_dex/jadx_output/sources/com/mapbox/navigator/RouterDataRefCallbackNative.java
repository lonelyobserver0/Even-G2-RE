package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class RouterDataRefCallbackNative implements RouterDataRefCallback {
    private long peer;

    public static class RouterDataRefCallbackPeerCleaner implements Runnable {
        private long peer;

        public RouterDataRefCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RouterDataRefCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private RouterDataRefCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RouterDataRefCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.RouterDataRefCallback
    public native void run(Expected<List<RouterError>, DataRef> expected, RouterOrigin routerOrigin);
}
