package com.mapbox.navigator;

import java.util.HashMap;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface RoadObjectsStoreInterface {
    void addCustomRoadObject(RoadObject roadObject);

    void addObserver(RoadObjectsStoreObserver roadObjectsStoreObserver);

    HashMap<String, RoadObjectEdgeLocation> get(long j);

    RoadObject getRoadObject(String str);

    List<String> getRoadObjectIdsByEdgeIds(List<Long> list);

    boolean hasObservers();

    void removeAllCustomRoadObjects();

    void removeCustomRoadObject(String str);

    void removeCustomRoadObjects(List<String> list);

    void removeObserver(RoadObjectsStoreObserver roadObjectsStoreObserver);
}
