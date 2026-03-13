package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class MovementModeObserverNative implements MovementModeObserver {
    protected long peer;

    public static class MovementModeObserverPeerCleaner implements Runnable {
        private long peer;

        public MovementModeObserverPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            MovementModeObserverNative.cleanNativePeer(this.peer);
        }
    }

    public MovementModeObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new MovementModeObserverPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.MovementModeObserver
    public native void onMovementModeChanged(MovementInfo movementInfo);

    @Override // com.mapbox.common.MovementModeObserver
    public native void onMovementModeError(String str);
}
