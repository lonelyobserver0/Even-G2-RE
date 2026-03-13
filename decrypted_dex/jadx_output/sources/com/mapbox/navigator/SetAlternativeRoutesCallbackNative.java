package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class SetAlternativeRoutesCallbackNative implements SetAlternativeRoutesCallback {
    private long peer;

    public static class SetAlternativeRoutesCallbackPeerCleaner implements Runnable {
        private long peer;

        public SetAlternativeRoutesCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            SetAlternativeRoutesCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private SetAlternativeRoutesCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new SetAlternativeRoutesCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.SetAlternativeRoutesCallback
    public native void run(Expected<String, List<RouteAlternative>> expected);
}
