package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class CameraChangedCallbackNative implements CameraChangedCallback {
    private long peer;

    public static class CameraChangedCallbackPeerCleaner implements Runnable {
        private long peer;

        public CameraChangedCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            CameraChangedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private CameraChangedCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new CameraChangedCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.CameraChangedCallback
    public native void run(CameraChanged cameraChanged);
}
