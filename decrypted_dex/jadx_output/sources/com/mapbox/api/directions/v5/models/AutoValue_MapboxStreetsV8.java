package com.mapbox.api.directions.v5.models;

import E1.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.MapboxStreetsV8;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_MapboxStreetsV8 extends C$AutoValue_MapboxStreetsV8 {

    public static final class GsonTypeAdapter extends TypeAdapter<MapboxStreetsV8> {
        private final Gson gson;
        private volatile TypeAdapter<String> string_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(13027);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public MapboxStreetsV8 read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            MapboxStreetsV8.Builder builder = MapboxStreetsV8.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.getClass();
                    if (nextName.equals(StubApp.getString2(11020))) {
                        TypeAdapter<String> typeAdapter = this.string_adapter;
                        if (typeAdapter == null) {
                            typeAdapter = this.gson.getAdapter(String.class);
                            this.string_adapter = typeAdapter;
                        }
                        builder.roadClass(typeAdapter.read2(jsonReader));
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
        public void write(JsonWriter jsonWriter, MapboxStreetsV8 mapboxStreetsV8) throws IOException {
            if (mapboxStreetsV8 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (mapboxStreetsV8.unrecognized() != null) {
                for (Map.Entry<String, b> entry : mapboxStreetsV8.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(11020));
            if (mapboxStreetsV8.roadClass() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.string_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, mapboxStreetsV8.roadClass());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_MapboxStreetsV8(final Map<String, b> map, final String str) {
        new MapboxStreetsV8(map, str) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_MapboxStreetsV8
            private final String roadClass;
            private final Map<String, b> unrecognized;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_MapboxStreetsV8$Builder */
            public static class Builder extends MapboxStreetsV8.Builder {
                private String roadClass;
                private Map<String, b> unrecognized;

                @Override // com.mapbox.api.directions.v5.models.MapboxStreetsV8.Builder
                public MapboxStreetsV8 build() {
                    return new AutoValue_MapboxStreetsV8(this.unrecognized, this.roadClass);
                }

                @Override // com.mapbox.api.directions.v5.models.MapboxStreetsV8.Builder
                public MapboxStreetsV8.Builder roadClass(String str) {
                    this.roadClass = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ MapboxStreetsV8.Builder unrecognized(Map map) {
                    return unrecognized2((Map<String, b>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                /* renamed from: unrecognized, reason: avoid collision after fix types in other method */
                public MapboxStreetsV8.Builder unrecognized2(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }
            }

            {
                this.unrecognized = map;
                this.roadClass = str;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof MapboxStreetsV8) {
                    MapboxStreetsV8 mapboxStreetsV8 = (MapboxStreetsV8) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(mapboxStreetsV8.unrecognized()) : mapboxStreetsV8.unrecognized() == null) {
                        String str2 = this.roadClass;
                        if (str2 != null ? str2.equals(mapboxStreetsV8.roadClass()) : mapboxStreetsV8.roadClass() == null) {
                            return true;
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                Map<String, b> map2 = this.unrecognized;
                int hashCode = ((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003;
                String str2 = this.roadClass;
                return hashCode ^ (str2 != null ? str2.hashCode() : 0);
            }

            @Override // com.mapbox.api.directions.v5.models.MapboxStreetsV8
            @SerializedName("class")
            public String roadClass() {
                return this.roadClass;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(12797));
                sb2.append(this.unrecognized);
                sb2.append(StubApp.getString2(12798));
                return AbstractC1482f.k(sb2, this.roadClass, StubApp.getString2(265));
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, b> unrecognized() {
                return this.unrecognized;
            }
        };
    }
}
