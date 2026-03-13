package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class DumpHistoryCallbackNative implements DumpHistoryCallback {
    private long peer;

    public static class DumpHistoryCallbackPeerCleaner implements Runnable {
        private long peer;

        public DumpHistoryCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            DumpHistoryCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private DumpHistoryCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new DumpHistoryCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.DumpHistoryCallback
    public native void run(String str);
}
