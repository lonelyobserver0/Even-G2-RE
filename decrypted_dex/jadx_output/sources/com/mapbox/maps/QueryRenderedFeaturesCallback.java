package com.mapbox.maps;

import com.mapbox.bindgen.Expected;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface QueryRenderedFeaturesCallback {
    void run(Expected<String, List<QueriedRenderedFeature>> expected);
}
