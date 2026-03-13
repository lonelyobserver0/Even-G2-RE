package com.mapbox.common.geofencing;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH'¨\u0006\u000e"}, d2 = {"Lcom/mapbox/common/geofencing/GeofencingObserver;", "", "onDwell", "", "event", "Lcom/mapbox/common/geofencing/GeofencingEvent;", "onEntry", "onError", "error", "Lcom/mapbox/common/geofencing/GeofencingError;", "onExit", "onUserConsentChanged", "isConsentGiven", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface GeofencingObserver {
    void onDwell(GeofencingEvent event);

    void onEntry(GeofencingEvent event);

    void onError(GeofencingError error);

    void onExit(GeofencingEvent event);

    void onUserConsentChanged(boolean isConsentGiven);
}
