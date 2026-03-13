package com.mapbox.geojson;

import E1.a;
import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.exception.GeoJsonException;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import com.stub.StubApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Polygon implements CoordinateContainer<List<List<Point>>> {
    private static final String TYPE = StubApp.getString2(2210);
    private final BoundingBox bbox;
    private final List<List<Point>> coordinates;
    private final String type;

    public static final class GsonTypeAdapter extends BaseGeometryTypeAdapter<Polygon, List<List<Point>>> {
        public GsonTypeAdapter(Gson gson) {
            super(gson, new ListOfListOfPointCoordinatesTypeAdapter());
        }

        @Override // com.mapbox.geojson.BaseGeometryTypeAdapter
        public CoordinateContainer<List<List<Point>>> createCoordinateContainer(String str, BoundingBox boundingBox, List<List<Point>> list) {
            if (str == null) {
                str = StubApp.getString2(2210);
            }
            return new Polygon(str, boundingBox, list);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public Polygon read2(JsonReader jsonReader) throws IOException {
            return (Polygon) readCoordinateContainer(jsonReader);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Polygon polygon) throws IOException {
            writeCoordinateContainer(jsonWriter, polygon);
        }
    }

    public Polygon(String str, BoundingBox boundingBox, List<List<Point>> list) {
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

    public static Polygon fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        return (Polygon) gsonBuilder.create().fromJson(str, Polygon.class);
    }

    public static Polygon fromLngLats(List<List<Point>> list) {
        return new Polygon(StubApp.getString2(2210), null, list);
    }

    public static Polygon fromOuterInner(LineString lineString, LineString... lineStringArr) {
        isLinearRing(lineString);
        ArrayList arrayList = new ArrayList();
        arrayList.add(lineString.coordinates());
        String string2 = StubApp.getString2(2210);
        if (lineStringArr == null) {
            return new Polygon(string2, null, arrayList);
        }
        for (LineString lineString2 : lineStringArr) {
            isLinearRing(lineString2);
            arrayList.add(lineString2.coordinates());
        }
        return new Polygon(string2, null, arrayList);
    }

    private static boolean isLinearRing(LineString lineString) {
        if (lineString.coordinates().size() < 4) {
            throw new GeoJsonException(StubApp.getString2(13879));
        }
        if (lineString.coordinates().get(0).equals(lineString.coordinates().get(lineString.coordinates().size() - 1))) {
            return true;
        }
        throw new GeoJsonException(StubApp.getString2(13878));
    }

    public static TypeAdapter<Polygon> typeAdapter(Gson gson) {
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
        if (obj instanceof Polygon) {
            Polygon polygon = (Polygon) obj;
            if (this.type.equals(polygon.type()) && ((boundingBox = this.bbox) != null ? boundingBox.equals(polygon.bbox()) : polygon.bbox() == null) && this.coordinates.equals(polygon.coordinates())) {
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

    public List<LineString> inner() {
        List<List<Point>> coordinates = coordinates();
        if (coordinates.size() <= 1) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(coordinates.size() - 1);
        Iterator<List<Point>> it = coordinates.subList(1, coordinates.size()).iterator();
        while (it.hasNext()) {
            arrayList.add(LineString.fromLngLats(it.next()));
        }
        return arrayList;
    }

    public LineString outer() {
        return LineString.fromLngLats(coordinates().get(0));
    }

    @Override // com.mapbox.geojson.GeoJson
    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        return gsonBuilder.create().toJson(this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(13876));
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

    public static Polygon fromLngLats(List<List<Point>> list, BoundingBox boundingBox) {
        return new Polygon(StubApp.getString2(2210), boundingBox, list);
    }

    @Override // com.mapbox.geojson.CoordinateContainer
    public List<List<Point>> coordinates() {
        return this.coordinates;
    }

    public static Polygon fromLngLats(double[][][] dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double[][] dArr2 : dArr) {
            ArrayList arrayList2 = new ArrayList(dArr2.length);
            for (double[] dArr3 : dArr2) {
                arrayList2.add(Point.fromLngLat(dArr3));
            }
            arrayList.add(arrayList2);
        }
        return new Polygon(StubApp.getString2(2210), null, arrayList);
    }

    public static Polygon fromOuterInner(LineString lineString, BoundingBox boundingBox, LineString... lineStringArr) {
        isLinearRing(lineString);
        ArrayList arrayList = new ArrayList();
        arrayList.add(lineString.coordinates());
        String string2 = StubApp.getString2(2210);
        if (lineStringArr == null) {
            return new Polygon(string2, boundingBox, arrayList);
        }
        for (LineString lineString2 : lineStringArr) {
            isLinearRing(lineString2);
            arrayList.add(lineString2.coordinates());
        }
        return new Polygon(string2, boundingBox, arrayList);
    }

    public static Polygon fromOuterInner(LineString lineString, List<LineString> list) {
        isLinearRing(lineString);
        ArrayList arrayList = new ArrayList();
        arrayList.add(lineString.coordinates());
        String string2 = StubApp.getString2(2210);
        if (list != null && !list.isEmpty()) {
            for (LineString lineString2 : list) {
                isLinearRing(lineString2);
                arrayList.add(lineString2.coordinates());
            }
            return new Polygon(string2, null, arrayList);
        }
        return new Polygon(string2, null, arrayList);
    }

    public static Polygon fromOuterInner(LineString lineString, BoundingBox boundingBox, List<LineString> list) {
        isLinearRing(lineString);
        ArrayList arrayList = new ArrayList();
        arrayList.add(lineString.coordinates());
        String string2 = StubApp.getString2(2210);
        if (list == null) {
            return new Polygon(string2, boundingBox, arrayList);
        }
        for (LineString lineString2 : list) {
            isLinearRing(lineString2);
            arrayList.add(lineString2.coordinates());
        }
        return new Polygon(string2, boundingBox, arrayList);
    }
}
