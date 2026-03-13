package com.mapbox.geojson;

import E1.a;
import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import com.stub.StubApp;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class GeometryCollection implements Geometry {
    private static final String TYPE = StubApp.getString2(13865);
    private final BoundingBox bbox;
    private final List<Geometry> geometries;
    private final String type;

    public static final class GsonTypeAdapter extends TypeAdapter<GeometryCollection> {
        private volatile TypeAdapter<BoundingBox> boundingBoxTypeAdapter;
        private final Gson gson;
        private volatile TypeAdapter<List<Geometry>> listGeometryAdapter;
        private volatile TypeAdapter<String> stringTypeAdapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public GeometryCollection read2(JsonReader jsonReader) throws IOException {
            String str = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            BoundingBox boundingBox = null;
            List<Geometry> list = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    nextName.getClass();
                    char c10 = 65535;
                    switch (nextName.hashCode()) {
                        case 3017257:
                            if (nextName.equals(StubApp.getString2(2302))) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 3575610:
                            if (nextName.equals(StubApp.getString2(660))) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 203916432:
                            if (nextName.equals(StubApp.getString2(13084))) {
                                c10 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            TypeAdapter<BoundingBox> typeAdapter = this.boundingBoxTypeAdapter;
                            if (typeAdapter == null) {
                                typeAdapter = this.gson.getAdapter(BoundingBox.class);
                                this.boundingBoxTypeAdapter = typeAdapter;
                            }
                            boundingBox = typeAdapter.read2(jsonReader);
                            break;
                        case 1:
                            TypeAdapter<String> typeAdapter2 = this.stringTypeAdapter;
                            if (typeAdapter2 == null) {
                                typeAdapter2 = this.gson.getAdapter(String.class);
                                this.stringTypeAdapter = typeAdapter2;
                            }
                            str = typeAdapter2.read2(jsonReader);
                            break;
                        case 2:
                            TypeAdapter<List<Geometry>> typeAdapter3 = this.listGeometryAdapter;
                            if (typeAdapter3 == null) {
                                typeAdapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Geometry.class));
                                this.listGeometryAdapter = typeAdapter3;
                            }
                            list = typeAdapter3.read2(jsonReader);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                } else {
                    jsonReader.nextNull();
                }
            }
            jsonReader.endObject();
            if (str == null) {
                str = StubApp.getString2(13865);
            }
            return new GeometryCollection(str, boundingBox, list);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, GeometryCollection geometryCollection) throws IOException {
            if (geometryCollection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name(StubApp.getString2(660));
            if (geometryCollection.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.stringTypeAdapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(String.class);
                    this.stringTypeAdapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, geometryCollection.type());
            }
            jsonWriter.name(StubApp.getString2(2302));
            if (geometryCollection.bbox() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<BoundingBox> typeAdapter2 = this.boundingBoxTypeAdapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(BoundingBox.class);
                    this.boundingBoxTypeAdapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, geometryCollection.bbox());
            }
            jsonWriter.name(StubApp.getString2(13084));
            if (geometryCollection.geometries() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Geometry>> typeAdapter3 = this.listGeometryAdapter;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Geometry.class));
                    this.listGeometryAdapter = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, geometryCollection.geometries());
            }
            jsonWriter.endObject();
        }
    }

    public GeometryCollection(String str, BoundingBox boundingBox, List<Geometry> list) {
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(2257));
        }
        this.type = str;
        this.bbox = boundingBox;
        if (list == null) {
            throw new NullPointerException(StubApp.getString2(12831));
        }
        this.geometries = list;
    }

    public static GeometryCollection fromGeometries(List<Geometry> list) {
        return new GeometryCollection(StubApp.getString2(13865), null, list);
    }

    public static GeometryCollection fromGeometry(Geometry geometry) {
        return new GeometryCollection(StubApp.getString2(13865), null, Arrays.asList(geometry));
    }

    public static GeometryCollection fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        gsonBuilder.registerTypeAdapterFactory(GeometryAdapterFactory.create());
        return (GeometryCollection) gsonBuilder.create().fromJson(str, GeometryCollection.class);
    }

    public static TypeAdapter<GeometryCollection> typeAdapter(Gson gson) {
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
        if (obj instanceof GeometryCollection) {
            GeometryCollection geometryCollection = (GeometryCollection) obj;
            if (this.type.equals(geometryCollection.type()) && ((boundingBox = this.bbox) != null ? boundingBox.equals(geometryCollection.bbox()) : geometryCollection.bbox() == null) && this.geometries.equals(geometryCollection.geometries())) {
                return true;
            }
        }
        return false;
    }

    public List<Geometry> geometries() {
        return this.geometries;
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        BoundingBox boundingBox = this.bbox;
        return ((hashCode ^ (boundingBox == null ? 0 : boundingBox.hashCode())) * 1000003) ^ this.geometries.hashCode();
    }

    @Override // com.mapbox.geojson.GeoJson
    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        gsonBuilder.registerTypeAdapterFactory(GeometryAdapterFactory.create());
        return gsonBuilder.create().toJson(this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(13870));
        sb2.append(this.type);
        sb2.append(StubApp.getString2(2325));
        sb2.append(this.bbox);
        sb2.append(StubApp.getString2(12843));
        return a.l(StubApp.getString2(265), sb2, this.geometries);
    }

    @Override // com.mapbox.geojson.GeoJson
    public String type() {
        return this.type;
    }

    public static GeometryCollection fromGeometries(List<Geometry> list, BoundingBox boundingBox) {
        return new GeometryCollection(StubApp.getString2(13865), boundingBox, list);
    }

    public static GeometryCollection fromGeometry(Geometry geometry, BoundingBox boundingBox) {
        return new GeometryCollection(StubApp.getString2(13865), boundingBox, Arrays.asList(geometry));
    }
}
