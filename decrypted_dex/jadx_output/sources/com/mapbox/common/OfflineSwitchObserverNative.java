package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class OfflineSwitchObserverNative implements OfflineSwitchObserver {
    protected long peer;

    public static class OfflineSwitchObserverPeerCleaner implements Runnable {
        private long peer;

        public OfflineSwitchObserverPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            OfflineSwitchObserverNative.cleanNativePeer(this.peer);
        }
    }

    public OfflineSwitchObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new OfflineSwitchObserverPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.OfflineSwitchObserver
    public native void statusChanged(boolean z2);
}
