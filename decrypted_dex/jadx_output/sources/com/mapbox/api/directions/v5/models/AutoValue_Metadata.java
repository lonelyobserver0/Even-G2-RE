package com.mapbox.api.directions.v5.models;

import E1.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.Metadata;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_Metadata extends C$AutoValue_Metadata {

    public static final class GsonTypeAdapter extends TypeAdapter<Metadata> {
        private final Gson gson;
        private volatile TypeAdapter<Map<String, String>> map__string_string_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(13031);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public Metadata read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            Metadata.Builder builder = Metadata.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.getClass();
                    if (nextName.equals(StubApp.getString2(6015))) {
                        TypeAdapter<Map<String, String>> typeAdapter = this.map__string_string_adapter;
                        if (typeAdapter == null) {
                            typeAdapter = this.gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, String.class));
                            this.map__string_string_adapter = typeAdapter;
                        }
                        builder.infoMap(typeAdapter.read2(jsonReader));
                    } else {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                            builder.unrecognized(linkedHashMap);
                        }
                        a.t((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, nextName);
                    }
                }
            }
            jsonReader.endObject();
            return builder.build();
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Metadata metadata) throws IOException {
            if (metadata == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (metadata.unrecognized() != null) {
                for (Map.Entry<String, b> entry : metadata.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(6015));
            if (metadata.infoMap() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Map<String, String>> typeAdapter = this.map__string_string_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, String.class));
                    this.map__string_string_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, metadata.infoMap());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_Metadata(final Map<String, b> map, final Map<String, String> map2) {
        new Metadata(map, map2) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_Metadata
            private final Map<String, String> infoMap;
            private final Map<String, b> unrecognized;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_Metadata$Builder */
            public static class Builder extends Metadata.Builder {
                private Map<String, String> infoMap;
                private Map<String, b> unrecognized;

                @Override // com.mapbox.api.directions.v5.models.Metadata.Builder
                public Metadata build() {
                    return new AutoValue_Metadata(this.unrecognized, this.infoMap);
                }

                @Override // com.mapbox.api.directions.v5.models.Metadata.Builder
                public Metadata.Builder infoMap(Map<String, String> map) {
                    this.infoMap = map;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ Metadata.Builder unrecognized(Map map) {
                    return unrecognized2((Map<String, b>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                /* renamed from: unrecognized, reason: avoid collision after fix types in other method */
                public Metadata.Builder unrecognized2(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }
            }

            {
                this.unrecognized = map;
                this.infoMap = map2;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Metadata) {
                    Metadata metadata = (Metadata) obj;
                    Map<String, b> map3 = this.unrecognized;
                    if (map3 != null ? map3.equals(metadata.unrecognized()) : metadata.unrecognized() == null) {
                        Map<String, String> map4 = this.infoMap;
                        if (map4 != null ? map4.equals(metadata.infoMap()) : metadata.infoMap() == null) {
                            return true;
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                Map<String, b> map3 = this.unrecognized;
                int hashCode = ((map3 == null ? 0 : map3.hashCode()) ^ 1000003) * 1000003;
                Map<String, String> map4 = this.infoMap;
                return hashCode ^ (map4 != null ? map4.hashCode() : 0);
            }

            @Override // com.mapbox.api.directions.v5.models.Metadata
            @SerializedName("map")
            public Map<String, String> infoMap() {
                return this.infoMap;
            }

            public String toString() {
                return StubApp.getString2(12803) + this.unrecognized + StubApp.getString2(12804) + this.infoMap + StubApp.getString2(265);
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, b> unrecognized() {
                return this.unrecognized;
            }
        };
    }
}
