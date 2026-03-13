package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class RenderFrameFinishedCallbackNative implements RenderFrameFinishedCallback {
    private long peer;

    public static class RenderFrameFinishedCallbackPeerCleaner implements Runnable {
        private long peer;

        public RenderFrameFinishedCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RenderFrameFinishedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private RenderFrameFinishedCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RenderFrameFinishedCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.RenderFrameFinishedCallback
    public native void run(RenderFrameFinished renderFrameFinished);
}
