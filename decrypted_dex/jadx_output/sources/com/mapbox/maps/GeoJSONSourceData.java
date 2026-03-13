package com.mapbox.maps;

import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Geometry;
import com.stub.StubApp;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class GeoJSONSourceData {
    private Type type;
    private Object value;

    public enum Type {
        GEOMETRY,
        FEATURE,
        LIST,
        STRING
    }

    public GeoJSONSourceData(Geometry geometry) {
        this.type = Type.GEOMETRY;
        this.value = geometry;
    }

    public static GeoJSONSourceData valueOf(Geometry geometry) {
        return new GeoJSONSourceData(geometry);
    }

    public Feature getFeature() {
        if (isFeature()) {
            return (Feature) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(13918));
    }

    public Geometry getGeometry() {
        if (isGeometry()) {
            return (Geometry) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(13884));
    }

    public List<Feature> getList() {
        if (isList()) {
            return (List) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(13919));
    }

    public String getString() {
        if (isString()) {
            return (String) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(13567));
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public boolean isFeature() {
        return this.type == Type.FEATURE;
    }

    public boolean isGeometry() {
        return this.type == Type.GEOMETRY;
    }

    public boolean isList() {
        return this.type == Type.LIST;
    }

    public boolean isString() {
        return this.type == Type.STRING;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public static GeoJSONSourceData valueOf(Feature feature) {
        return new GeoJSONSourceData(feature);
    }

    public static GeoJSONSourceData valueOf(List<Feature> list) {
        return new GeoJSONSourceData(list);
    }

    public GeoJSONSourceData(Feature feature) {
        this.type = Type.FEATURE;
        this.value = feature;
    }

    public static GeoJSONSourceData valueOf(String str) {
        return new GeoJSONSourceData(str);
    }

    public GeoJSONSourceData(List<Feature> list) {
        this.type = Type.LIST;
        this.value = list;
    }

    public GeoJSONSourceData(String str) {
        this.type = Type.STRING;
        this.value = str;
    }
}
