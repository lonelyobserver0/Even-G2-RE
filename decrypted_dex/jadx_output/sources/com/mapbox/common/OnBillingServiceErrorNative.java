package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class OnBillingServiceErrorNative implements OnBillingServiceError {
    private long peer;

    public static class OnBillingServiceErrorPeerCleaner implements Runnable {
        private long peer;

        public OnBillingServiceErrorPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            OnBillingServiceErrorNative.cleanNativePeer(this.peer);
        }
    }

    private OnBillingServiceErrorNative(long j) {
        this.peer = j;
        CleanerService.register(this, new OnBillingServiceErrorPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.OnBillingServiceError
    public native void run(BillingServiceError billingServiceError);
}
