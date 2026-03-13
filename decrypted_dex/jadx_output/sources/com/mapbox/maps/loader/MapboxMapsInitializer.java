package com.mapbox.maps.loader;

import R1.b;
import com.mapbox.common.BaseMapboxInitializer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class MapboxMapsInitializer extends BaseMapboxInitializer<MapboxMaps> {
    @Override // com.mapbox.common.BaseMapboxInitializer
    public Class<? extends b> getInitializerClass() {
        return MapboxMapsInitializerImpl.class;
    }
}
