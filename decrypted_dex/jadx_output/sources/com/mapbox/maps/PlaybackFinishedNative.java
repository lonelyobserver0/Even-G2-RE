package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class PlaybackFinishedNative implements PlaybackFinished {
    private long peer;

    public static class PlaybackFinishedPeerCleaner implements Runnable {
        private long peer;

        public PlaybackFinishedPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            PlaybackFinishedNative.cleanNativePeer(this.peer);
        }
    }

    private PlaybackFinishedNative(long j) {
        this.peer = j;
        CleanerService.register(this, new PlaybackFinishedPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.PlaybackFinished
    public native void run();
}
