package com.mapbox.navigator;

import com.mapbox.geojson.Point;

@Deprecated
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface IMUService {
    int registerAltimeterUpdateCallback(AltimeterUpdateCallback altimeterUpdateCallback);

    int registerCompassUpdateCallback(CompassUpdateCallback compassUpdateCallback);

    int registerIMUUpdateCallback(IMUUpdateCallback iMUUpdateCallback);

    void unregisterCallback(int i3);

    void update(Point point, Float f10);
}
