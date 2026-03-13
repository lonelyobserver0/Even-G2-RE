package com.mapbox.geojson;

import androidx.annotation.Keep;
import com.google.gson.TypeAdapterFactory;
import com.mapbox.geojson.internal.typeadapters.RuntimeTypeAdapterFactory;
import com.stub.StubApp;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class GeometryAdapterFactory implements TypeAdapterFactory {
    private static TypeAdapterFactory geometryTypeFactory;

    public static TypeAdapterFactory create() {
        if (geometryTypeFactory == null) {
            geometryTypeFactory = RuntimeTypeAdapterFactory.of(Geometry.class, StubApp.getString2(660), true).registerSubtype(GeometryCollection.class, StubApp.getString2(13865)).registerSubtype(Point.class, StubApp.getString2(13859)).registerSubtype(MultiPoint.class, StubApp.getString2(13866)).registerSubtype(LineString.class, StubApp.getString2(13867)).registerSubtype(MultiLineString.class, StubApp.getString2(13868)).registerSubtype(Polygon.class, StubApp.getString2(2210)).registerSubtype(MultiPolygon.class, StubApp.getString2(13869));
        }
        return geometryTypeFactory;
    }
}
