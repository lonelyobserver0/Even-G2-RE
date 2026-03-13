package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class RoadObjectMatcherListenerNative implements RoadObjectMatcherListener {
    protected long peer;

    public static class RoadObjectMatcherListenerPeerCleaner implements Runnable {
        private long peer;

        public RoadObjectMatcherListenerPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RoadObjectMatcherListenerNative.cleanNativePeer(this.peer);
        }
    }

    public RoadObjectMatcherListenerNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RoadObjectMatcherListenerPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.RoadObjectMatcherListener
    public native void onMatchingCancelled(String str);

    @Override // com.mapbox.navigator.RoadObjectMatcherListener
    public native void onRoadObjectMatched(Expected<RoadObjectMatcherError, RoadObject> expected);
}
