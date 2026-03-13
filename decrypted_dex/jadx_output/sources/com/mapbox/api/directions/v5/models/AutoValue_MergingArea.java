package com.mapbox.api.directions.v5.models;

import E1.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.MergingArea;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_MergingArea extends C$AutoValue_MergingArea {

    public static final class GsonTypeAdapter extends TypeAdapter<MergingArea> {
        private final Gson gson;
        private volatile TypeAdapter<String> string_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(13030);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public MergingArea read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            MergingArea.Builder builder = MergingArea.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.getClass();
                    if (StubApp.getString2(660).equals(nextName)) {
                        TypeAdapter<String> typeAdapter = this.string_adapter;
                        if (typeAdapter == null) {
                            typeAdapter = this.gson.getAdapter(String.class);
                            this.string_adapter = typeAdapter;
                        }
                        builder.type(typeAdapter.read2(jsonReader));
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
        public void write(JsonWriter jsonWriter, MergingArea mergingArea) throws IOException {
            if (mergingArea == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (mergingArea.unrecognized() != null) {
                for (Map.Entry<String, b> entry : mergingArea.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(660));
            if (mergingArea.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.string_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, mergingArea.type());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_MergingArea(final Map<String, b> map, final String str) {
        new MergingArea(map, str) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_MergingArea
            private final String type;
            private final Map<String, b> unrecognized;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_MergingArea$Builder */
            public static class Builder extends MergingArea.Builder {
                private String type;
                private Map<String, b> unrecognized;

                @Override // com.mapbox.api.directions.v5.models.MergingArea.Builder
                public MergingArea build() {
                    return new AutoValue_MergingArea(this.unrecognized, this.type);
                }

                @Override // com.mapbox.api.directions.v5.models.MergingArea.Builder
                public MergingArea.Builder type(String str) {
                    this.type = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ MergingArea.Builder unrecognized(Map map) {
                    return unrecognized2((Map<String, b>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                /* renamed from: unrecognized, reason: avoid collision after fix types in other method */
                public MergingArea.Builder unrecognized2(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }
            }

            {
                this.unrecognized = map;
                this.type = str;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof MergingArea) {
                    MergingArea mergingArea = (MergingArea) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(mergingArea.unrecognized()) : mergingArea.unrecognized() == null) {
                        String str2 = this.type;
                        if (str2 != null ? str2.equals(mergingArea.type()) : mergingArea.type() == null) {
                            return true;
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                Map<String, b> map2 = this.unrecognized;
                int hashCode = ((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003;
                String str2 = this.type;
                return hashCode ^ (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(12802));
                sb2.append(this.unrecognized);
                sb2.append(StubApp.getString2(2148));
                return AbstractC1482f.k(sb2, this.type, StubApp.getString2(265));
            }

            @Override // com.mapbox.api.directions.v5.models.MergingArea
            public String type() {
                return this.type;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, b> unrecognized() {
                return this.unrecognized;
            }
        };
    }
}
