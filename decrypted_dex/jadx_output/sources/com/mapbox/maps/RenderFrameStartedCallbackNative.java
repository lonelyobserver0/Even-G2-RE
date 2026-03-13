package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class RenderFrameStartedCallbackNative implements RenderFrameStartedCallback {
    private long peer;

    public static class RenderFrameStartedCallbackPeerCleaner implements Runnable {
        private long peer;

        public RenderFrameStartedCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RenderFrameStartedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private RenderFrameStartedCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RenderFrameStartedCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.RenderFrameStartedCallback
    public native void run(RenderFrameStarted renderFrameStarted);
}
