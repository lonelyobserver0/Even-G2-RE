package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class ResourceRequestCallbackNative implements ResourceRequestCallback {
    private long peer;

    public static class ResourceRequestCallbackPeerCleaner implements Runnable {
        private long peer;

        public ResourceRequestCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResourceRequestCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private ResourceRequestCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ResourceRequestCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.ResourceRequestCallback
    public native void run(ResourceRequest resourceRequest);
}
