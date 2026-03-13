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
public final class MultiLineString implements CoordinateContainer<List<List<Point>>> {
    private static final String TYPE = StubApp.getString2(13868);
    private final BoundingBox bbox;
    private final List<List<Point>> coordinates;
    private final String type;

    public static final class GsonTypeAdapter extends BaseGeometryTypeAdapter<MultiLineString, List<List<Point>>> {
        public GsonTypeAdapter(Gson gson) {
            super(gson, new ListOfListOfPointCoordinatesTypeAdapter());
        }

        @Override // com.mapbox.geojson.BaseGeometryTypeAdapter
        public CoordinateContainer<List<List<Point>>> createCoordinateContainer(String str, BoundingBox boundingBox, List<List<Point>> list) {
            if (str == null) {
                str = StubApp.getString2(13868);
            }
            return new MultiLineString(str, boundingBox, list);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public MultiLineString read2(JsonReader jsonReader) throws IOException {
            return (MultiLineString) readCoordinateContainer(jsonReader);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, MultiLineString multiLineString) throws IOException {
            writeCoordinateContainer(jsonWriter, multiLineString);
        }
    }

    public MultiLineString(String str, BoundingBox boundingBox, List<List<Point>> list) {
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

    public static MultiLineString fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        return (MultiLineString) gsonBuilder.create().fromJson(str, MultiLineString.class);
    }

    public static MultiLineString fromLineString(LineString lineString) {
        return new MultiLineString(StubApp.getString2(13868), null, Arrays.asList(lineString.coordinates()));
    }

    public static MultiLineString fromLineStrings(List<LineString> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<LineString> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().coordinates());
        }
        return new MultiLineString(StubApp.getString2(13868), null, arrayList);
    }

    public static MultiLineString fromLngLats(List<List<Point>> list) {
        return new MultiLineString(StubApp.getString2(13868), null, list);
    }

    public static TypeAdapter<MultiLineString> typeAdapter(Gson gson) {
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
        if (obj instanceof MultiLineString) {
            MultiLineString multiLineString = (MultiLineString) obj;
            if (this.type.equals(multiLineString.type()) && ((boundingBox = this.bbox) != null ? boundingBox.equals(multiLineString.bbox()) : multiLineString.bbox() == null) && this.coordinates.equals(multiLineString.coordinates())) {
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

    public List<LineString> lineStrings() {
        List<List<Point>> coordinates = coordinates();
        ArrayList arrayList = new ArrayList(coordinates.size());
        Iterator<List<Point>> it = coordinates.iterator();
        while (it.hasNext()) {
            arrayList.add(LineString.fromLngLats(it.next()));
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
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(13874));
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

    public static MultiLineString fromLngLats(List<List<Point>> list, BoundingBox boundingBox) {
        return new MultiLineString(StubApp.getString2(13868), boundingBox, list);
    }

    @Override // com.mapbox.geojson.CoordinateContainer
    public List<List<Point>> coordinates() {
        return this.coordinates;
    }

    public static MultiLineString fromLineString(LineString lineString, BoundingBox boundingBox) {
        return new MultiLineString(StubApp.getString2(13868), boundingBox, Arrays.asList(lineString.coordinates()));
    }

    public static MultiLineString fromLngLats(double[][][] dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        for (int i3 = 0; i3 < dArr.length; i3++) {
            ArrayList arrayList2 = new ArrayList(dArr[i3].length);
            int i10 = 0;
            while (true) {
                double[][] dArr2 = dArr[i3];
                if (i10 < dArr2.length) {
                    arrayList2.add(Point.fromLngLat(dArr2[i10]));
                    i10++;
                }
            }
            arrayList.add(arrayList2);
        }
        return new MultiLineString(StubApp.getString2(13868), null, arrayList);
    }

    public static MultiLineString fromLineStrings(List<LineString> list, BoundingBox boundingBox) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<LineString> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().coordinates());
        }
        return new MultiLineString(StubApp.getString2(13868), boundingBox, arrayList);
    }
}
