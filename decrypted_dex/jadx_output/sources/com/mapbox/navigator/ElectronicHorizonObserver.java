package com.mapbox.navigator;

import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface ElectronicHorizonObserver {
    void onPositionUpdated(ElectronicHorizonPosition electronicHorizonPosition, List<RoadObjectDistance> list);

    void onRoadObjectEnter(RoadObjectEnterExitInfo roadObjectEnterExitInfo);

    void onRoadObjectExit(RoadObjectEnterExitInfo roadObjectEnterExitInfo);

    void onRoadObjectPassed(RoadObjectPassInfo roadObjectPassInfo);
}
