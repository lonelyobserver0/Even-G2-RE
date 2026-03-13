package com.mapbox.common;

import com.mapbox.bindgen.Expected;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface TileRegionsCallback {
    void run(Expected<TileRegionError, List<TileRegion>> expected);
}
