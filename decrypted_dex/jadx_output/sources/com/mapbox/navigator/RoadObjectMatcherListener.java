package com.mapbox.navigator;

import com.mapbox.bindgen.Expected;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface RoadObjectMatcherListener {
    void onMatchingCancelled(String str);

    void onRoadObjectMatched(Expected<RoadObjectMatcherError, RoadObject> expected);
}
