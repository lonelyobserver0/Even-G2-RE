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
import com.mapbox.api.directions.v5.models.IntersectionLaneAccess;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_IntersectionLaneAccess extends C$AutoValue_IntersectionLaneAccess {

    public static final class GsonTypeAdapter extends TypeAdapter<IntersectionLaneAccess> {
        private final Gson gson;
        private volatile TypeAdapter<List<String>> list__string_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(13001);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public IntersectionLaneAccess read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            IntersectionLaneAccess.Builder builder = IntersectionLaneAccess.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.getClass();
                    if (nextName.equals(StubApp.getString2(13000))) {
                        TypeAdapter<List<String>> typeAdapter = this.list__string_adapter;
                        if (typeAdapter == null) {
                            typeAdapter = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                            this.list__string_adapter = typeAdapter;
                        }
                        builder.designated(typeAdapter.read2(jsonReader));
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
        public void write(JsonWriter jsonWriter, IntersectionLaneAccess intersectionLaneAccess) throws IOException {
            if (intersectionLaneAccess == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (intersectionLaneAccess.unrecognized() != null) {
                for (Map.Entry<String, b> entry : intersectionLaneAccess.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(13000));
            if (intersectionLaneAccess.designated() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<String>> typeAdapter = this.list__string_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.list__string_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, intersectionLaneAccess.designated());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_IntersectionLaneAccess(final Map<String, b> map, final List<String> list) {
        new IntersectionLaneAccess(map, list) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_IntersectionLaneAccess
            private final List<String> designated;
            private final Map<String, b> unrecognized;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_IntersectionLaneAccess$Builder */
            public static class Builder extends IntersectionLaneAccess.Builder {
                private List<String> designated;
                private Map<String, b> unrecognized;

                @Override // com.mapbox.api.directions.v5.models.IntersectionLaneAccess.Builder
                public IntersectionLaneAccess build() {
                    return new AutoValue_IntersectionLaneAccess(this.unrecognized, this.designated);
                }

                @Override // com.mapbox.api.directions.v5.models.IntersectionLaneAccess.Builder
                public IntersectionLaneAccess.Builder designated(List<String> list) {
                    this.designated = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ IntersectionLaneAccess.Builder unrecognized(Map map) {
                    return unrecognized2((Map<String, b>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                /* renamed from: unrecognized, reason: avoid collision after fix types in other method */
                public IntersectionLaneAccess.Builder unrecognized2(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }
            }

            {
                this.unrecognized = map;
                this.designated = list;
            }

            @Override // com.mapbox.api.directions.v5.models.IntersectionLaneAccess
            @SerializedName("designated")
            public List<String> designated() {
                return this.designated;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof IntersectionLaneAccess) {
                    IntersectionLaneAccess intersectionLaneAccess = (IntersectionLaneAccess) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(intersectionLaneAccess.unrecognized()) : intersectionLaneAccess.unrecognized() == null) {
                        List<String> list2 = this.designated;
                        if (list2 != null ? list2.equals(intersectionLaneAccess.designated()) : intersectionLaneAccess.designated() == null) {
                            return true;
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                Map<String, b> map2 = this.unrecognized;
                int hashCode = ((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003;
                List<String> list2 = this.designated;
                return hashCode ^ (list2 != null ? list2.hashCode() : 0);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(12757));
                sb2.append(this.unrecognized);
                sb2.append(StubApp.getString2(12758));
                return a.l(StubApp.getString2(265), sb2, this.designated);
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, b> unrecognized() {
                return this.unrecognized;
            }
        };
    }
}
