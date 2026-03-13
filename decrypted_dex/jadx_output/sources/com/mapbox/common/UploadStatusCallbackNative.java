package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class UploadStatusCallbackNative implements UploadStatusCallback {
    private long peer;

    public static class UploadStatusCallbackPeerCleaner implements Runnable {
        private long peer;

        public UploadStatusCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            UploadStatusCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private UploadStatusCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new UploadStatusCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.UploadStatusCallback
    public native void run(UploadStatus uploadStatus);
}
