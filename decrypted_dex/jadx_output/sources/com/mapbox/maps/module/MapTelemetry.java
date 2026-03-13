package com.mapbox.maps.module;

import android.os.Bundle;
import com.mapbox.common.TelemetryUtils;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface MapTelemetry {
    void disableTelemetrySession();

    default boolean getUserTelemetryRequestState() {
        return TelemetryUtils.getEventsCollectionState();
    }

    void onAppUserTurnstileEvent();

    void onPerformanceEvent(Bundle bundle);

    void setUserTelemetryRequestState(boolean z2);
}
