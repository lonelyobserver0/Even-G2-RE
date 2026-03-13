package com.mapbox.geojson;

import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.mapbox.geojson.gson.BoundingBoxTypeAdapter;
import java.io.Serializable;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class BoundingBox implements Serializable {
    private final Point northeast;
    private final Point southwest;

    public BoundingBox(Point point, Point point2) {
        if (point == null) {
            throw new NullPointerException("Null southwest");
        }
        this.southwest = point;
        if (point2 == null) {
            throw new NullPointerException("Null northeast");
        }
        this.northeast = point2;
    }

    @Deprecated
    public static BoundingBox fromCoordinates(double d8, double d10, double d11, double d12) {
        return fromLngLats(d8, d10, d11, d12);
    }

    public static BoundingBox fromJson(String str) {
        return (BoundingBox) new GsonBuilder().registerTypeAdapter(BoundingBox.class, new BoundingBoxTypeAdapter()).create().fromJson(str, BoundingBox.class);
    }

    public static BoundingBox fromLngLats(double d8, double d10, double d11, double d12) {
        return new BoundingBox(Point.fromLngLat(d8, d10), Point.fromLngLat(d11, d12));
    }

    public static BoundingBox fromPoints(Point point, Point point2) {
        return new BoundingBox(point, point2);
    }

    public static TypeAdapter<BoundingBox> typeAdapter(Gson gson) {
        return new BoundingBoxTypeAdapter();
    }

    public final double east() {
        return northeast().longitude();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BoundingBox) {
            BoundingBox boundingBox = (BoundingBox) obj;
            if (this.southwest.equals(boundingBox.southwest()) && this.northeast.equals(boundingBox.northeast())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.southwest.hashCode() ^ 1000003) * 1000003) ^ this.northeast.hashCode();
    }

    public final double north() {
        return northeast().latitude();
    }

    public Point northeast() {
        return this.northeast;
    }

    public final double south() {
        return southwest().latitude();
    }

    public Point southwest() {
        return this.southwest;
    }

    public final String toJson() {
        return new GsonBuilder().registerTypeAdapter(BoundingBox.class, new BoundingBoxTypeAdapter()).create().toJson(this, BoundingBox.class);
    }

    public String toString() {
        return "BoundingBox{southwest=" + this.southwest + ", northeast=" + this.northeast + "}";
    }

    public final double west() {
        return southwest().longitude();
    }

    @Deprecated
    public static BoundingBox fromCoordinates(double d8, double d10, double d11, double d12, double d13, double d14) {
        return fromLngLats(d8, d10, d11, d12, d13, d14);
    }

    public static BoundingBox fromLngLats(double d8, double d10, double d11, double d12, double d13, double d14) {
        return new BoundingBox(Point.fromLngLat(d8, d10, d11), Point.fromLngLat(d12, d13, d14));
    }
}
