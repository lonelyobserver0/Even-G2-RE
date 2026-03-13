package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class CameraChangedCoalescedCallbackNative implements CameraChangedCoalescedCallback {
    private long peer;

    public static class CameraChangedCoalescedCallbackPeerCleaner implements Runnable {
        private long peer;

        public CameraChangedCoalescedCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            CameraChangedCoalescedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private CameraChangedCoalescedCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new CameraChangedCoalescedCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.CameraChangedCoalescedCallback
    public native void run(CameraChangedCoalesced cameraChangedCoalesced);
}
