package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class RouteOptionsAdapterNative implements RouteOptionsAdapter {
    protected long peer;

    public static class RouteOptionsAdapterPeerCleaner implements Runnable {
        private long peer;

        public RouteOptionsAdapterPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RouteOptionsAdapterNative.cleanNativePeer(this.peer);
        }
    }

    public RouteOptionsAdapterNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RouteOptionsAdapterPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.RouteOptionsAdapter
    public native String modifyRouteRequestOptions(String str);
}
