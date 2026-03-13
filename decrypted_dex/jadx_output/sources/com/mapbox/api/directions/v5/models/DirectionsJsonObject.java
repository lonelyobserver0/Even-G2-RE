package com.mapbox.api.directions.v5.models;

import E6.c;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.mapbox.api.directions.v5.DirectionsAdapterFactory;
import com.mapbox.auto.value.gson.b;
import com.mapbox.geojson.Point;
import com.mapbox.geojson.PointAsCoordinatesTypeAdapter;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class DirectionsJsonObject implements Serializable {

    public static abstract class Builder<T extends Builder> {
        public abstract T unrecognized(Map<String, b> map);

        public T unrecognizedJsonProperties(Map<String, JsonElement> map) {
            return unrecognized(c.f(map));
        }
    }

    public final Map<String, JsonElement> getUnrecognizedJsonProperties() {
        return c.c(unrecognized());
    }

    public final Set<String> getUnrecognizedPropertiesNames() {
        Map<String, b> unrecognized = unrecognized();
        return unrecognized != null ? unrecognized.keySet() : Collections.EMPTY_SET;
    }

    public final JsonElement getUnrecognizedProperty(String str) {
        b bVar;
        Map<String, b> unrecognized = unrecognized();
        if (unrecognized == null || (bVar = unrecognized.get(str)) == null) {
            return null;
        }
        return bVar.f12374a;
    }

    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(DirectionsAdapterFactory.a());
        gsonBuilder.registerTypeAdapter(Point.class, new PointAsCoordinatesTypeAdapter());
        return gsonBuilder.create().toJson(this);
    }

    public abstract Map<String, b> unrecognized();
}
