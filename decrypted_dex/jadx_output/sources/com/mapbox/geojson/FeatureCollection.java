package com.mapbox.geojson;

import E1.a;
import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.gson.BoundingBoxTypeAdapter;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import com.stub.StubApp;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class FeatureCollection implements GeoJson {
    private static final String TYPE = StubApp.getString2(2267);

    @JsonAdapter(BoundingBoxTypeAdapter.class)
    private final BoundingBox bbox;
    private final List<Feature> features;
    private final String type;

    public static final class GsonTypeAdapter extends TypeAdapter<FeatureCollection> {
        private volatile TypeAdapter<BoundingBox> boundingBoxAdapter;
        private final Gson gson;
        private volatile TypeAdapter<List<Feature>> listFeatureAdapter;
        private volatile TypeAdapter<String> stringAdapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public FeatureCollection read2(JsonReader jsonReader) throws IOException {
            String str = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            BoundingBox boundingBox = null;
            List<Feature> list = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    nextName.getClass();
                    char c10 = 65535;
                    switch (nextName.hashCode()) {
                        case -290659267:
                            if (nextName.equals(StubApp.getString2(2045))) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 3017257:
                            if (nextName.equals(StubApp.getString2(2302))) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 3575610:
                            if (nextName.equals(StubApp.getString2(660))) {
                                c10 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            TypeAdapter<List<Feature>> typeAdapter = this.listFeatureAdapter;
                            if (typeAdapter == null) {
                                typeAdapter = this.gson.getAdapter(TypeToken.getParameterized(List.class, Feature.class));
                                this.listFeatureAdapter = typeAdapter;
                            }
                            list = typeAdapter.read2(jsonReader);
                            break;
                        case 1:
                            TypeAdapter<BoundingBox> typeAdapter2 = this.boundingBoxAdapter;
                            if (typeAdapter2 == null) {
                                typeAdapter2 = this.gson.getAdapter(BoundingBox.class);
                                this.boundingBoxAdapter = typeAdapter2;
                            }
                            boundingBox = typeAdapter2.read2(jsonReader);
                            break;
                        case 2:
                            TypeAdapter<String> typeAdapter3 = this.stringAdapter;
                            if (typeAdapter3 == null) {
                                typeAdapter3 = this.gson.getAdapter(String.class);
                                this.stringAdapter = typeAdapter3;
                            }
                            str = typeAdapter3.read2(jsonReader);
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
            return new FeatureCollection(str, boundingBox, list);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, FeatureCollection featureCollection) throws IOException {
            if (featureCollection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name(StubApp.getString2(660));
            if (featureCollection.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.stringAdapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(String.class);
                    this.stringAdapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, featureCollection.type());
            }
            jsonWriter.name(StubApp.getString2(2302));
            if (featureCollection.bbox() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<BoundingBox> typeAdapter2 = this.boundingBoxAdapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(BoundingBox.class);
                    this.boundingBoxAdapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, featureCollection.bbox());
            }
            jsonWriter.name(StubApp.getString2(2045));
            if (featureCollection.features() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Feature>> typeAdapter3 = this.listFeatureAdapter;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Feature.class));
                    this.listFeatureAdapter = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, featureCollection.features());
            }
            jsonWriter.endObject();
        }
    }

    public FeatureCollection(String str, BoundingBox boundingBox, List<Feature> list) {
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(2257));
        }
        this.type = str;
        this.bbox = boundingBox;
        this.features = list;
    }

    public static FeatureCollection fromFeature(Feature feature) {
        return new FeatureCollection(StubApp.getString2(2267), null, Arrays.asList(feature));
    }

    public static FeatureCollection fromFeatures(Feature[] featureArr) {
        return new FeatureCollection(StubApp.getString2(2267), null, Arrays.asList(featureArr));
    }

    public static FeatureCollection fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        gsonBuilder.registerTypeAdapterFactory(GeometryAdapterFactory.create());
        return (FeatureCollection) gsonBuilder.create().fromJson(str, FeatureCollection.class);
    }

    public static TypeAdapter<FeatureCollection> typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    @Override // com.mapbox.geojson.GeoJson
    public BoundingBox bbox() {
        return this.bbox;
    }

    public boolean equals(Object obj) {
        BoundingBox boundingBox;
        List<Feature> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof FeatureCollection) {
            FeatureCollection featureCollection = (FeatureCollection) obj;
            if (this.type.equals(featureCollection.type()) && ((boundingBox = this.bbox) != null ? boundingBox.equals(featureCollection.bbox()) : featureCollection.bbox() == null) && ((list = this.features) != null ? list.equals(featureCollection.features()) : featureCollection.features() == null)) {
                return true;
            }
        }
        return false;
    }

    public List<Feature> features() {
        return this.features;
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        BoundingBox boundingBox = this.bbox;
        int hashCode2 = (hashCode ^ (boundingBox == null ? 0 : boundingBox.hashCode())) * 1000003;
        List<Feature> list = this.features;
        return hashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // com.mapbox.geojson.GeoJson
    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        gsonBuilder.registerTypeAdapterFactory(GeometryAdapterFactory.create());
        return gsonBuilder.create().toJson(this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(13863));
        sb2.append(this.type);
        sb2.append(StubApp.getString2(2325));
        sb2.append(this.bbox);
        sb2.append(StubApp.getString2(13864));
        return a.l(StubApp.getString2(265), sb2, this.features);
    }

    @Override // com.mapbox.geojson.GeoJson
    public String type() {
        return this.type;
    }

    public static FeatureCollection fromFeatures(List<Feature> list) {
        return new FeatureCollection(StubApp.getString2(2267), null, list);
    }

    public static FeatureCollection fromFeature(Feature feature, BoundingBox boundingBox) {
        return new FeatureCollection(StubApp.getString2(2267), boundingBox, Arrays.asList(feature));
    }

    public static FeatureCollection fromFeatures(Feature[] featureArr, BoundingBox boundingBox) {
        return new FeatureCollection(StubApp.getString2(2267), boundingBox, Arrays.asList(featureArr));
    }

    public static FeatureCollection fromFeatures(List<Feature> list, BoundingBox boundingBox) {
        return new FeatureCollection(StubApp.getString2(2267), boundingBox, list);
    }
}
