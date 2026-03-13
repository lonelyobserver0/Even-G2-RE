package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class MovementMonitorInterfaceNative implements MovementMonitorInterface {
    protected long peer;

    public static class MovementMonitorInterfacePeerCleaner implements Runnable {
        private long peer;

        public MovementMonitorInterfacePeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            MovementMonitorInterfaceNative.cleanNativePeer(this.peer);
        }
    }

    public MovementMonitorInterfaceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new MovementMonitorInterfacePeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.MovementMonitorInterface
    public native void getMovementInfo(MovementInfoCallback movementInfoCallback);

    @Override // com.mapbox.common.MovementMonitorInterface
    public native void registerObserver(MovementModeObserver movementModeObserver);

    @Override // com.mapbox.common.MovementMonitorInterface
    public native void setMovementInfo(MovementInfo movementInfo);

    @Override // com.mapbox.common.MovementMonitorInterface
    public native void unregisterObserver(MovementModeObserver movementModeObserver);
}
