package com.mapbox.common.location;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class GetLocationCallbackNative implements GetLocationCallback {
    private long peer;

    public static class GetLocationCallbackPeerCleaner implements Runnable {
        private long peer;

        public GetLocationCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            GetLocationCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private GetLocationCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new GetLocationCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.location.GetLocationCallback
    public native void run(Location location);
}
