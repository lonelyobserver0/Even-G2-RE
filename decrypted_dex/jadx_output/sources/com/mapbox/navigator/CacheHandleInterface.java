package com.mapbox.navigator;

import com.mapbox.common.Cancelable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface CacheHandleInterface {
    Cancelable getCurrentRoadGraphVersionInfo(RoadGraphVersionInfoCallback roadGraphVersionInfoCallback);

    @Deprecated
    void getCurrentRoadGraphVersionInfo(RoadGraphVersionInfoCallback roadGraphVersionInfoCallback, Integer num);

    Cancelable isRoadGraphDataUpdateAvailable(RoadGraphUpdateAvailabilityCallback roadGraphUpdateAvailabilityCallback);
}
