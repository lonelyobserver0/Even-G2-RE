package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class CancelableNative implements Cancelable {
    protected long peer;

    public static class CancelablePeerCleaner implements Runnable {
        private long peer;

        public CancelablePeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            CancelableNative.cleanNativePeer(this.peer);
        }
    }

    public CancelableNative(long j) {
        this.peer = j;
        CleanerService.register(this, new CancelablePeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.Cancelable
    public native void cancel();
}
