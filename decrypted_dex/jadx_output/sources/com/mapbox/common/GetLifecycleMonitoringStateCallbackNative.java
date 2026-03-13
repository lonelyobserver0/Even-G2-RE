package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class GetLifecycleMonitoringStateCallbackNative implements GetLifecycleMonitoringStateCallback {
    private long peer;

    public static class GetLifecycleMonitoringStateCallbackPeerCleaner implements Runnable {
        private long peer;

        public GetLifecycleMonitoringStateCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            GetLifecycleMonitoringStateCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private GetLifecycleMonitoringStateCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new GetLifecycleMonitoringStateCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.GetLifecycleMonitoringStateCallback
    public native void run(Expected<String, LifecycleMonitoringState> expected);
}
