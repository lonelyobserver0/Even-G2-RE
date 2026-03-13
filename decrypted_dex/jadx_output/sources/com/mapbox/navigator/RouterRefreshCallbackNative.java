package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import java.util.HashMap;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class RouterRefreshCallbackNative implements RouterRefreshCallback {
    private long peer;

    public static class RouterRefreshCallbackPeerCleaner implements Runnable {
        private long peer;

        public RouterRefreshCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RouterRefreshCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private RouterRefreshCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RouterRefreshCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.RouterRefreshCallback
    public native void run(Expected<List<RouterError>, DataRef> expected, RouterOrigin routerOrigin, HashMap<String, String> hashMap);
}
