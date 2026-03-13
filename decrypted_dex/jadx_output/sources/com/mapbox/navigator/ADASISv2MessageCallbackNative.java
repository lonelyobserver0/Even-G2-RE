package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class ADASISv2MessageCallbackNative implements ADASISv2MessageCallback {
    private long peer;

    public static class ADASISv2MessageCallbackPeerCleaner implements Runnable {
        private long peer;

        public ADASISv2MessageCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            ADASISv2MessageCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private ADASISv2MessageCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ADASISv2MessageCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.ADASISv2MessageCallback
    public native void run(List<Byte> list);
}
