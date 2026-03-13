package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class RouteParserCallbackNative implements RouteParserCallback {
    private long peer;

    public static class RouteParserCallbackPeerCleaner implements Runnable {
        private long peer;

        public RouteParserCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RouteParserCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private RouteParserCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RouteParserCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.RouteParserCallback
    public native void run(Expected<String, List<RouteInterface>> expected);
}
