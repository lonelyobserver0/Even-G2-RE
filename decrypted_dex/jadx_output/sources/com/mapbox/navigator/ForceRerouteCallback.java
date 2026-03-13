package com.mapbox.navigator;

import com.mapbox.bindgen.Expected;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface ForceRerouteCallback {
    void run(Expected<RerouteError, RerouteInfo> expected);
}
