package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class ResourceLoadProgressCallbackNative implements ResourceLoadProgressCallback {
    private long peer;

    public static class ResourceLoadProgressCallbackPeerCleaner implements Runnable {
        private long peer;

        public ResourceLoadProgressCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResourceLoadProgressCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private ResourceLoadProgressCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ResourceLoadProgressCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.ResourceLoadProgressCallback
    public native void run(ResourceLoadProgress resourceLoadProgress);
}
