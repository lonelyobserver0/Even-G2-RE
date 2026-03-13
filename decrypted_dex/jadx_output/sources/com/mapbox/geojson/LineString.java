package com.mapbox.geojson;

import E1.a;
import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import com.mapbox.geojson.utils.PolylineUtils;
import com.stub.StubApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class LineString implements CoordinateContainer<List<Point>> {
    private static final String TYPE = StubApp.getString2(13867);
    private final BoundingBox bbox;
    private final List<Point> coordinates;
    private final String type;

    public static final class GsonTypeAdapter extends BaseGeometryTypeAdapter<LineString, List<Point>> {
        public GsonTypeAdapter(Gson gson) {
            super(gson, new ListOfPointCoordinatesTypeAdapter());
        }

        @Override // com.mapbox.geojson.BaseGeometryTypeAdapter
        public CoordinateContainer<List<Point>> createCoordinateContainer(String str, BoundingBox boundingBox, List<Point> list) {
            if (str == null) {
                str = StubApp.getString2(13867);
            }
            return new LineString(str, boundingBox, list);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public LineString read2(JsonReader jsonReader) throws IOException {
            return (LineString) readCoordinateContainer(jsonReader);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, LineString lineString) throws IOException {
            writeCoordinateContainer(jsonWriter, lineString);
        }
    }

    public LineString(String str, BoundingBox boundingBox, List<Point> list) {
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

    public static LineString fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        return (LineString) gsonBuilder.create().fromJson(str, LineString.class);
    }

    public static LineString fromLngLats(MultiPoint multiPoint) {
        return new LineString(StubApp.getString2(13867), null, multiPoint.coordinates());
    }

    public static LineString fromPolyline(String str, int i3) {
        return fromLngLats(PolylineUtils.decode(str, i3), (BoundingBox) null);
    }

    public static TypeAdapter<LineString> typeAdapter(Gson gson) {
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
        if (obj instanceof LineString) {
            LineString lineString = (LineString) obj;
            if (this.type.equals(lineString.type()) && ((boundingBox = this.bbox) != null ? boundingBox.equals(lineString.bbox()) : lineString.bbox() == null) && this.coordinates.equals(lineString.coordinates())) {
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

    public String toPolyline(int i3) {
        return PolylineUtils.encode(coordinates(), i3);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(13871));
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

    public static LineString fromLngLats(List<Point> list) {
        return new LineString(StubApp.getString2(13867), null, list);
    }

    @Override // com.mapbox.geojson.CoordinateContainer
    public List<Point> coordinates() {
        return this.coordinates;
    }

    public static LineString fromLngLats(List<Point> list, BoundingBox boundingBox) {
        return new LineString(StubApp.getString2(13867), boundingBox, list);
    }

    public static LineString fromLngLats(MultiPoint multiPoint, BoundingBox boundingBox) {
        return new LineString(StubApp.getString2(13867), boundingBox, multiPoint.coordinates());
    }

    public static LineString fromLngLats(double[][] dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double[] dArr2 : dArr) {
            arrayList.add(Point.fromLngLat(dArr2));
        }
        return fromLngLats(arrayList);
    }
}
