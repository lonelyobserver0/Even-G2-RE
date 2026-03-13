package com.mapbox.navigator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface Telemetry {
    void postOuterDeviceEvent(OuterDeviceAction outerDeviceAction);

    void postTelemetryCustomEvent(String str, String str2, String str3);

    void postUserFeedback(UserFeedbackMetadata userFeedbackMetadata, UserFeedback userFeedback, UserFeedbackCallback userFeedbackCallback);

    UserFeedbackHandle startBuildUserFeedbackMetadata();
}
