package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class DownloadStatusCallbackNative implements DownloadStatusCallback {
    private long peer;

    public static class DownloadStatusCallbackPeerCleaner implements Runnable {
        private long peer;

        public DownloadStatusCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadStatusCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private DownloadStatusCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new DownloadStatusCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.DownloadStatusCallback
    public native void run(DownloadStatus downloadStatus);
}
