package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class ResourceLoadResultCallbackNative implements ResourceLoadResultCallback {
    private long peer;

    public static class ResourceLoadResultCallbackPeerCleaner implements Runnable {
        private long peer;

        public ResourceLoadResultCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResourceLoadResultCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private ResourceLoadResultCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ResourceLoadResultCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.ResourceLoadResultCallback
    public native void run(Expected<ResourceLoadError, ResourceLoadResult> expected);
}
