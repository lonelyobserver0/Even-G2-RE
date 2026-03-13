package com.mapbox.maps;

import com.mapbox.geojson.Geometry;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AnnotatedFeature {
    private Type type;
    private Object value;

    public enum Type {
        GEOMETRY,
        ANNOTATED_LAYER_FEATURE
    }

    public AnnotatedFeature(Geometry geometry) {
        this.type = Type.GEOMETRY;
        this.value = geometry;
    }

    public static AnnotatedFeature valueOf(Geometry geometry) {
        return new AnnotatedFeature(geometry);
    }

    public AnnotatedLayerFeature getAnnotatedLayerFeature() {
        if (isAnnotatedLayerFeature()) {
            return (AnnotatedLayerFeature) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(13883));
    }

    public Geometry getGeometry() {
        if (isGeometry()) {
            return (Geometry) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(13884));
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public boolean isAnnotatedLayerFeature() {
        return this.type == Type.ANNOTATED_LAYER_FEATURE;
    }

    public boolean isGeometry() {
        return this.type == Type.GEOMETRY;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public static AnnotatedFeature valueOf(AnnotatedLayerFeature annotatedLayerFeature) {
        return new AnnotatedFeature(annotatedLayerFeature);
    }

    public AnnotatedFeature(AnnotatedLayerFeature annotatedLayerFeature) {
        this.type = Type.ANNOTATED_LAYER_FEATURE;
        this.value = annotatedLayerFeature;
    }
}
