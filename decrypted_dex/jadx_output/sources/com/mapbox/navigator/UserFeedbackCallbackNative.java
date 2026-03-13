package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.geojson.Point;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class UserFeedbackCallbackNative implements UserFeedbackCallback {
    private long peer;

    public static class UserFeedbackCallbackPeerCleaner implements Runnable {
        private long peer;

        public UserFeedbackCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            UserFeedbackCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private UserFeedbackCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new UserFeedbackCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.UserFeedbackCallback
    public native void run(Expected<String, Point> expected);
}
