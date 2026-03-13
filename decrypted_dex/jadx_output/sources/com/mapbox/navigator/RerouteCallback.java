package com.mapbox.navigator;

import com.mapbox.bindgen.Expected;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface RerouteCallback {
    void run(Expected<RerouteError, RerouteInfo> expected);
}
