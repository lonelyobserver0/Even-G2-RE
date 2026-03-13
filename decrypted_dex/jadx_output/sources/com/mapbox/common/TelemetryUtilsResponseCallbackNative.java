package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class TelemetryUtilsResponseCallbackNative implements TelemetryUtilsResponseCallback {
    private long peer;

    public static class TelemetryUtilsResponseCallbackPeerCleaner implements Runnable {
        private long peer;

        public TelemetryUtilsResponseCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            TelemetryUtilsResponseCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private TelemetryUtilsResponseCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TelemetryUtilsResponseCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.TelemetryUtilsResponseCallback
    public native void run(Expected<EventsServiceError, None> expected);
}
