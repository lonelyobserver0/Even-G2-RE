package com.mapbox.navigator;

import com.mapbox.bindgen.Expected;
import com.mapbox.geojson.Point;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface UserFeedbackCallback {
    void run(Expected<String, Point> expected);
}
