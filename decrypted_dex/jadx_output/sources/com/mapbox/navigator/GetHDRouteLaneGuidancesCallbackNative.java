package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class GetHDRouteLaneGuidancesCallbackNative implements GetHDRouteLaneGuidancesCallback {
    private long peer;

    public static class GetHDRouteLaneGuidancesCallbackPeerCleaner implements Runnable {
        private long peer;

        public GetHDRouteLaneGuidancesCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            GetHDRouteLaneGuidancesCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private GetHDRouteLaneGuidancesCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new GetHDRouteLaneGuidancesCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.GetHDRouteLaneGuidancesCallback
    public native void run(Expected<GetHDRouteLaneGuidancesErrorType, List<RouteLaneGuidance>> expected);
}
