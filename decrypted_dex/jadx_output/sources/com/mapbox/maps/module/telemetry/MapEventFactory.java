package com.mapbox.maps.module.telemetry;

import android.os.Bundle;
import com.mapbox.common.TelemetrySystemUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/mapbox/maps/module/telemetry/MapEventFactory;", "", "()V", "buildMapLoadEvent", "Lcom/mapbox/maps/module/telemetry/MapLoadEvent;", "phoneState", "Lcom/mapbox/maps/module/telemetry/PhoneState;", "buildPerformanceEvent", "Lcom/mapbox/maps/module/telemetry/PerformanceEvent;", "sessionId", "", "data", "Landroid/os/Bundle;", "module-telemetry_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapEventFactory {
    public static final MapEventFactory INSTANCE = new MapEventFactory();

    private MapEventFactory() {
    }

    public final MapLoadEvent buildMapLoadEvent(PhoneState phoneState) {
        Intrinsics.checkNotNullParameter(phoneState, "phoneState");
        return new MapLoadEvent(TelemetrySystemUtils.obtainUniversalUniqueIdentifier(), phoneState);
    }

    public final PerformanceEvent buildPerformanceEvent(PhoneState phoneState, String sessionId, Bundle data) {
        Intrinsics.checkNotNullParameter(phoneState, "phoneState");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(data, "data");
        return new PerformanceEvent(phoneState, sessionId, data);
    }
}
