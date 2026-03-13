package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class TelemetryNative implements Telemetry {
    protected long peer;

    public static class TelemetryPeerCleaner implements Runnable {
        private long peer;

        public TelemetryPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            TelemetryNative.cleanNativePeer(this.peer);
        }
    }

    public TelemetryNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TelemetryPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.Telemetry
    public native void postOuterDeviceEvent(OuterDeviceAction outerDeviceAction);

    @Override // com.mapbox.navigator.Telemetry
    public native void postTelemetryCustomEvent(String str, String str2, String str3);

    @Override // com.mapbox.navigator.Telemetry
    public native void postUserFeedback(UserFeedbackMetadata userFeedbackMetadata, UserFeedback userFeedback, UserFeedbackCallback userFeedbackCallback);

    @Override // com.mapbox.navigator.Telemetry
    public native UserFeedbackHandle startBuildUserFeedbackMetadata();
}
