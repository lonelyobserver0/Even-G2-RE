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
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MultiPolygon implements CoordinateContainer<List<List<List<Point>>>> {
    private static final String TYPE = StubApp.getString2(13869);
    private final BoundingBox bbox;
    private final List<List<List<Point>>> coordinates;
    private final String type;

    public static final class GsonTypeAdapter extends BaseGeometryTypeAdapter<MultiPolygon, List<List<List<Point>>>> {
        public GsonTypeAdapter(Gson gson) {
            super(gson, new ListofListofListOfPointCoordinatesTypeAdapter());
        }

        @Override // com.mapbox.geojson.BaseGeometryTypeAdapter
        public CoordinateContainer<List<List<List<Point>>>> createCoordinateContainer(String str, BoundingBox boundingBox, List<List<List<Point>>> list) {
            if (str == null) {
                str = StubApp.getString2(13869);
            }
            return new MultiPolygon(str, boundingBox, list);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public MultiPolygon read2(JsonReader jsonReader) throws IOException {
            return (MultiPolygon) readCoordinateContainer(jsonReader);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, MultiPolygon multiPolygon) throws IOException {
            writeCoordinateContainer(jsonWriter, multiPolygon);
        }
    }

    public MultiPolygon(String str, BoundingBox boundingBox, List<List<List<Point>>> list) {
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

    public static MultiPolygon fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        return (MultiPolygon) gsonBuilder.create().fromJson(str, MultiPolygon.class);
    }

    public static MultiPolygon fromLngLats(List<List<List<Point>>> list) {
        return new MultiPolygon(StubApp.getString2(13869), null, list);
    }

    public static MultiPolygon fromPolygon(Polygon polygon) {
        return new MultiPolygon(StubApp.getString2(13869), null, Arrays.asList(polygon.coordinates()));
    }

    public static MultiPolygon fromPolygons(List<Polygon> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Polygon> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().coordinates());
        }
        return new MultiPolygon(StubApp.getString2(13869), null, arrayList);
    }

    public static TypeAdapter<MultiPolygon> typeAdapter(Gson gson) {
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
        if (obj instanceof MultiPolygon) {
            MultiPolygon multiPolygon = (MultiPolygon) obj;
            if (this.type.equals(multiPolygon.type()) && ((boundingBox = this.bbox) != null ? boundingBox.equals(multiPolygon.bbox()) : multiPolygon.bbox() == null) && this.coordinates.equals(multiPolygon.coordinates())) {
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

    public List<Polygon> polygons() {
        List<List<List<Point>>> coordinates = coordinates();
        ArrayList arrayList = new ArrayList(coordinates.size());
        Iterator<List<List<Point>>> it = coordinates.iterator();
        while (it.hasNext()) {
            arrayList.add(Polygon.fromLngLats(it.next()));
        }
        return arrayList;
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

    public static MultiPolygon fromLngLats(List<List<List<Point>>> list, BoundingBox boundingBox) {
        return new MultiPolygon(StubApp.getString2(13869), boundingBox, list);
    }

    @Override // com.mapbox.geojson.CoordinateContainer
    public List<List<List<Point>>> coordinates() {
        return this.coordinates;
    }

    public static MultiPolygon fromLngLats(double[][][][] dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        for (int i3 = 0; i3 < dArr.length; i3++) {
            ArrayList arrayList2 = new ArrayList(dArr[i3].length);
            for (int i10 = 0; i10 < dArr[i3].length; i10++) {
                ArrayList arrayList3 = new ArrayList(dArr[i3][i10].length);
                int i11 = 0;
                while (true) {
                    double[][] dArr2 = dArr[i3][i10];
                    if (i11 < dArr2.length) {
                        arrayList3.add(Point.fromLngLat(dArr2[i11]));
                        i11++;
                    }
                }
                arrayList2.add(arrayList3);
            }
            arrayList.add(arrayList2);
        }
        return new MultiPolygon(StubApp.getString2(13869), null, arrayList);
    }

    public static MultiPolygon fromPolygon(Polygon polygon, BoundingBox boundingBox) {
        return new MultiPolygon(StubApp.getString2(13869), boundingBox, Arrays.asList(polygon.coordinates()));
    }

    public static MultiPolygon fromPolygons(List<Polygon> list, BoundingBox boundingBox) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Polygon> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().coordinates());
        }
        return new MultiPolygon(StubApp.getString2(13869), boundingBox, arrayList);
    }
}
