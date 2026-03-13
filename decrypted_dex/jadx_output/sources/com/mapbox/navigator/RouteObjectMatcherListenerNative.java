package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class RouteObjectMatcherListenerNative implements RouteObjectMatcherListener {
    protected long peer;

    public static class RouteObjectMatcherListenerPeerCleaner implements Runnable {
        private long peer;

        public RouteObjectMatcherListenerPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RouteObjectMatcherListenerNative.cleanNativePeer(this.peer);
        }
    }

    public RouteObjectMatcherListenerNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RouteObjectMatcherListenerPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.RouteObjectMatcherListener
    public native void onMatchingCancelled(String str);

    @Override // com.mapbox.navigator.RouteObjectMatcherListener
    public native void onRouteObjectMatched(Expected<RouteObjectMatcherError, MatchedRouteObject> expected);
}
