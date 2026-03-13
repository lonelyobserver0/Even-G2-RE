package com.mapbox.api.directions.v5.models;

import E1.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.Congestion;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_Congestion extends C$AutoValue_Congestion {

    public static final class GsonTypeAdapter extends TypeAdapter<Congestion> {
        private final Gson gson;
        private volatile TypeAdapter<Integer> int__adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(12971);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public Congestion read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            Congestion.Builder builder = Congestion.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.getClass();
                    if (StubApp.getString2(1061).equals(nextName)) {
                        TypeAdapter<Integer> typeAdapter = this.int__adapter;
                        if (typeAdapter == null) {
                            typeAdapter = this.gson.getAdapter(Integer.class);
                            this.int__adapter = typeAdapter;
                        }
                        builder.value(typeAdapter.read2(jsonReader).intValue());
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
        public void write(JsonWriter jsonWriter, Congestion congestion) throws IOException {
            if (congestion == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (congestion.unrecognized() != null) {
                for (Map.Entry<String, b> entry : congestion.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(1061));
            TypeAdapter<Integer> typeAdapter = this.int__adapter;
            if (typeAdapter == null) {
                typeAdapter = this.gson.getAdapter(Integer.class);
                this.int__adapter = typeAdapter;
            }
            typeAdapter.write(jsonWriter, Integer.valueOf(congestion.value()));
            jsonWriter.endObject();
        }
    }

    public AutoValue_Congestion(final Map<String, b> map, final int i3) {
        new Congestion(map, i3) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_Congestion
            private final Map<String, b> unrecognized;
            private final int value;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_Congestion$Builder */
            public static class Builder extends Congestion.Builder {
                private Map<String, b> unrecognized;
                private Integer value;

                @Override // com.mapbox.api.directions.v5.models.Congestion.Builder
                public Congestion build() {
                    String string2 = this.value == null ? StubApp.getString2(12720) : "";
                    if (string2.isEmpty()) {
                        return new AutoValue_Congestion(this.unrecognized, this.value.intValue());
                    }
                    throw new IllegalStateException(StubApp.getString2(555).concat(string2));
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ Congestion.Builder unrecognized(Map map) {
                    return unrecognized((Map<String, b>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.Congestion.Builder
                public Congestion.Builder value(int i3) {
                    this.value = Integer.valueOf(i3);
                    return this;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public Congestion.Builder unrecognized(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }
            }

            {
                this.unrecognized = map;
                this.value = i3;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Congestion) {
                    Congestion congestion = (Congestion) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(congestion.unrecognized()) : congestion.unrecognized() == null) {
                        if (this.value == congestion.value()) {
                            return true;
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                Map<String, b> map2 = this.unrecognized;
                return (((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003) ^ this.value;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(12721));
                sb2.append(this.unrecognized);
                sb2.append(StubApp.getString2(12722));
                return AbstractC1482f.f(this.value, StubApp.getString2(265), sb2);
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, b> unrecognized() {
                return this.unrecognized;
            }

            @Override // com.mapbox.api.directions.v5.models.Congestion
            public int value() {
                return this.value;
            }
        };
    }
}
