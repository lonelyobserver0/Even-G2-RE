package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class LifecycleObserverNative implements LifecycleObserver {
    protected long peer;

    public static class LifecycleObserverPeerCleaner implements Runnable {
        private long peer;

        public LifecycleObserverPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            LifecycleObserverNative.cleanNativePeer(this.peer);
        }
    }

    public LifecycleObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new LifecycleObserverPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.LifecycleObserver
    public native void onLifecycleStateChanged(LifecycleState lifecycleState);

    @Override // com.mapbox.common.LifecycleObserver
    public native void onMonitoringStateChanged(LifecycleMonitoringState lifecycleMonitoringState, String str);
}
