package com.mapbox.geojson;

import E1.a;
import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import com.stub.StubApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MultiPoint implements CoordinateContainer<List<Point>> {
    private static final String TYPE = StubApp.getString2(13866);
    private final BoundingBox bbox;
    private final List<Point> coordinates;
    private final String type;

    public static final class GsonTypeAdapter extends BaseGeometryTypeAdapter<MultiPoint, List<Point>> {
        public GsonTypeAdapter(Gson gson) {
            super(gson, new ListOfPointCoordinatesTypeAdapter());
        }

        @Override // com.mapbox.geojson.BaseGeometryTypeAdapter
        public CoordinateContainer<List<Point>> createCoordinateContainer(String str, BoundingBox boundingBox, List<Point> list) {
            if (str == null) {
                str = StubApp.getString2(13866);
            }
            return new MultiPoint(str, boundingBox, list);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public MultiPoint read2(JsonReader jsonReader) throws IOException {
            return (MultiPoint) readCoordinateContainer(jsonReader);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, MultiPoint multiPoint) throws IOException {
            writeCoordinateContainer(jsonWriter, multiPoint);
        }
    }

    public MultiPoint(String str, BoundingBox boundingBox, List<Point> list) {
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(2257));
        }
        this.type = str;
        this.bbox = boundingBox;
        if (list == null) {
            throw new NullPointerException(StubApp.getString2(12830));
        }
        this.coordinates = list;
    }

    public static MultiPoint fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        return (MultiPoint) gsonBuilder.create().fromJson(str, MultiPoint.class);
    }

    public static MultiPoint fromLngLats(List<Point> list) {
        return new MultiPoint(StubApp.getString2(13866), null, list);
    }

    public static TypeAdapter<MultiPoint> typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
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
        if (obj instanceof MultiPoint) {
            MultiPoint multiPoint = (MultiPoint) obj;
            if (this.type.equals(multiPoint.type()) && ((boundingBox = this.bbox) != null ? boundingBox.equals(multiPoint.bbox()) : multiPoint.bbox() == null) && this.coordinates.equals(multiPoint.coordinates())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        BoundingBox boundingBox = this.bbox;
        return ((hashCode ^ (boundingBox == null ? 0 : boundingBox.hashCode())) * 1000003) ^ this.coordinates.hashCode();
    }

    @Override // com.mapbox.geojson.GeoJson
    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        return gsonBuilder.create().toJson(this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(13875));
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

    public static MultiPoint fromLngLats(List<Point> list, BoundingBox boundingBox) {
        return new MultiPoint(StubApp.getString2(13866), boundingBox, list);
    }

    @Override // com.mapbox.geojson.CoordinateContainer
    public List<Point> coordinates() {
        return this.coordinates;
    }

    public static MultiPoint fromLngLats(double[][] dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double[] dArr2 : dArr) {
            arrayList.add(Point.fromLngLat(dArr2));
        }
        return new MultiPoint(StubApp.getString2(13866), null, arrayList);
    }
}
