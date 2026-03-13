package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class LifecycleMonitorInterfaceNative implements LifecycleMonitorInterface {
    protected long peer;

    public static class LifecycleMonitorInterfacePeerCleaner implements Runnable {
        private long peer;

        public LifecycleMonitorInterfacePeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            LifecycleMonitorInterfaceNative.cleanNativePeer(this.peer);
        }
    }

    public LifecycleMonitorInterfaceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new LifecycleMonitorInterfacePeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.LifecycleMonitorInterface
    public native void getLifecycleState(GetLifecycleStateCallback getLifecycleStateCallback);

    @Override // com.mapbox.common.LifecycleMonitorInterface
    public native void getMonitoringState(GetLifecycleMonitoringStateCallback getLifecycleMonitoringStateCallback);

    @Override // com.mapbox.common.LifecycleMonitorInterface
    public native void registerObserver(LifecycleObserver lifecycleObserver);

    @Override // com.mapbox.common.LifecycleMonitorInterface
    public native void unregisterObserver(LifecycleObserver lifecycleObserver);
}
