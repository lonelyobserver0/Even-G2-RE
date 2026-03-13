package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class FallbackVersionsObserverNative implements FallbackVersionsObserver {
    protected long peer;

    public static class FallbackVersionsObserverPeerCleaner implements Runnable {
        private long peer;

        public FallbackVersionsObserverPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            FallbackVersionsObserverNative.cleanNativePeer(this.peer);
        }
    }

    public FallbackVersionsObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new FallbackVersionsObserverPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.FallbackVersionsObserver
    public native void onCanReturnToLatest(String str);

    @Override // com.mapbox.navigator.FallbackVersionsObserver
    public native void onFallbackVersionsFound(List<String> list);
}
