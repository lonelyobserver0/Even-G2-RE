package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class RouteObjectMatcherNative implements RouteObjectMatcher {
    protected long peer;

    public static class RouteObjectMatcherPeerCleaner implements Runnable {
        private long peer;

        public RouteObjectMatcherPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RouteObjectMatcherNative.cleanNativePeer(this.peer);
        }
    }

    public RouteObjectMatcherNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RouteObjectMatcherPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.RouteObjectMatcher
    public native void cancel(List<String> list);

    @Override // com.mapbox.navigator.RouteObjectMatcher
    public native void cancelAll();

    @Override // com.mapbox.navigator.RouteObjectMatcher
    public native void matchRouteObjects(List<MatchableRouteObject> list);

    @Override // com.mapbox.navigator.RouteObjectMatcher
    public native void setListener(RouteObjectMatcherListener routeObjectMatcherListener);
}
