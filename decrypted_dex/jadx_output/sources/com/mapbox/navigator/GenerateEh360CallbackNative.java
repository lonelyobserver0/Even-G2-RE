package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class GenerateEh360CallbackNative implements GenerateEh360Callback {
    private long peer;

    public static class GenerateEh360CallbackPeerCleaner implements Runnable {
        private long peer;

        public GenerateEh360CallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            GenerateEh360CallbackNative.cleanNativePeer(this.peer);
        }
    }

    private GenerateEh360CallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new GenerateEh360CallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.GenerateEh360Callback
    public native void run(ElectronicHorizon360Graph electronicHorizon360Graph);
}
