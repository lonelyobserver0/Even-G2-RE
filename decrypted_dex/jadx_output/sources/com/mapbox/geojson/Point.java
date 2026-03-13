package com.mapbox.geojson;

import E1.a;
import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import com.mapbox.geojson.shifter.CoordinateShifterManager;
import com.stub.StubApp;
import java.io.IOException;
import java.util.List;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Point implements CoordinateContainer<List<Double>> {
    private static final String TYPE = StubApp.getString2(13859);
    private final BoundingBox bbox;
    private final List<Double> coordinates;
    private final String type;

    public static final class GsonTypeAdapter extends BaseGeometryTypeAdapter<Point, List<Double>> {
        public GsonTypeAdapter(Gson gson) {
            super(gson, new ListOfDoublesCoordinatesTypeAdapter());
        }

        @Override // com.mapbox.geojson.BaseGeometryTypeAdapter
        public CoordinateContainer<List<Double>> createCoordinateContainer(String str, BoundingBox boundingBox, List<Double> list) {
            if (str == null) {
                str = StubApp.getString2(13859);
            }
            return new Point(str, boundingBox, list);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public Point read2(JsonReader jsonReader) throws IOException {
            return (Point) readCoordinateContainer(jsonReader);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Point point) throws IOException {
            writeCoordinateContainer(jsonWriter, point);
        }
    }

    public Point(String str, BoundingBox boundingBox, List<Double> list) {
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(2257));
        }
        this.type = str;
        this.bbox = boundingBox;
        if (list == null || list.size() == 0) {
            throw new NullPointerException(StubApp.getString2(12830));
        }
        this.coordinates = list;
    }

    public static Point fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        return (Point) gsonBuilder.create().fromJson(str, Point.class);
    }

    public static Point fromLngLat(double d8, double d10) {
        return new Point(StubApp.getString2(13859), null, CoordinateShifterManager.getCoordinateShifter().shiftLonLat(d8, d10));
    }

    public static TypeAdapter<Point> typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public double altitude() {
        if (coordinates().size() < 3) {
            return Double.NaN;
        }
        return coordinates().get(2).doubleValue();
    }

    @Override // com.mapbox.geojson.GeoJson
    public BoundingBox bbox() {
        return this.bbox;
    }

    public boolean equals(Object obj) {
        BoundingBox boundingBox;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Point) {
            Point point = (Point) obj;
            if (this.type.equals(point.type()) && ((boundingBox = this.bbox) != null ? boundingBox.equals(point.bbox()) : point.bbox() == null) && this.coordinates.equals(point.coordinates())) {
                return true;
            }
        }
        return false;
    }

    public boolean hasAltitude() {
        return !Double.isNaN(altitude());
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        BoundingBox boundingBox = this.bbox;
        return ((hashCode ^ (boundingBox == null ? 0 : boundingBox.hashCode())) * 1000003) ^ this.coordinates.hashCode();
    }

    public double latitude() {
        return coordinates().get(1).doubleValue();
    }

    public double longitude() {
        return coordinates().get(0).doubleValue();
    }

    @Override // com.mapbox.geojson.GeoJson
    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        return gsonBuilder.create().toJson(this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(13877));
        sb2.append(this.type);
        sb2.append(StubApp.getString2(2325));
        sb2.append(this.bbox);
        sb2.append(StubApp.getString2(2324));
        return a.l(StubApp.getString2(265), sb2, this.coordinates);
    }

    @Override // com.mapbox.geojson.GeoJson
    public String type() {
        return this.type;
    }

    @Override // com.mapbox.geojson.CoordinateContainer
    public List<Double> coordinates() {
        return this.coordinates;
    }

    public static Point fromLngLat(double d8, double d10, BoundingBox boundingBox) {
        return new Point(StubApp.getString2(13859), boundingBox, CoordinateShifterManager.getCoordinateShifter().shiftLonLat(d8, d10));
    }

    public static Point fromLngLat(double d8, double d10, double d11) {
        return new Point(StubApp.getString2(13859), null, CoordinateShifterManager.getCoordinateShifter().shiftLonLatAlt(d8, d10, d11));
    }

    public static Point fromLngLat(double d8, double d10, double d11, BoundingBox boundingBox) {
        return new Point(StubApp.getString2(13859), boundingBox, CoordinateShifterManager.getCoordinateShifter().shiftLonLatAlt(d8, d10, d11));
    }

    public static Point fromLngLat(double[] dArr) {
        if (dArr.length == 2) {
            return fromLngLat(dArr[0], dArr[1]);
        }
        if (dArr.length > 2) {
            return fromLngLat(dArr[0], dArr[1], dArr[2]);
        }
        return null;
    }
}
