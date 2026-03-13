package com.mapbox.common.location;

import com.mapbox.bindgen.Expected;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface DeviceLocationProviderFactory {
    Expected<LocationError, DeviceLocationProvider> build(LocationProviderRequest locationProviderRequest);
}
