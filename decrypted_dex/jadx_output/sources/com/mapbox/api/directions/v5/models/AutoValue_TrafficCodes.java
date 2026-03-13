package com.mapbox.api.directions.v5.models;

import E1.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.TrafficCodes;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_TrafficCodes extends C$AutoValue_TrafficCodes {

    public static final class GsonTypeAdapter extends TypeAdapter<TrafficCodes> {
        private final Gson gson;
        private volatile TypeAdapter<Integer> integer_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(13133);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public TrafficCodes read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            TrafficCodes.Builder builder = TrafficCodes.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.getClass();
                    if (nextName.equals(StubApp.getString2(13131))) {
                        TypeAdapter<Integer> typeAdapter = this.integer_adapter;
                        if (typeAdapter == null) {
                            typeAdapter = this.gson.getAdapter(Integer.class);
                            this.integer_adapter = typeAdapter;
                        }
                        builder.jarticRegulationCode(typeAdapter.read2(jsonReader));
                    } else if (nextName.equals(StubApp.getString2(13132))) {
                        TypeAdapter<Integer> typeAdapter2 = this.integer_adapter;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.gson.getAdapter(Integer.class);
                            this.integer_adapter = typeAdapter2;
                        }
                        builder.jarticCauseCode(typeAdapter2.read2(jsonReader));
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
        public void write(JsonWriter jsonWriter, TrafficCodes trafficCodes) throws IOException {
            if (trafficCodes == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (trafficCodes.unrecognized() != null) {
                for (Map.Entry<String, b> entry : trafficCodes.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(13132));
            if (trafficCodes.jarticCauseCode() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter = this.integer_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, trafficCodes.jarticCauseCode());
            }
            jsonWriter.name(StubApp.getString2(13131));
            if (trafficCodes.jarticRegulationCode() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter2 = this.integer_adapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, trafficCodes.jarticRegulationCode());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_TrafficCodes(final Map<String, b> map, final Integer num, final Integer num2) {
        new TrafficCodes(map, num, num2) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_TrafficCodes
            private final Integer jarticCauseCode;
            private final Integer jarticRegulationCode;
            private final Map<String, b> unrecognized;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_TrafficCodes$Builder */
            public static class Builder extends TrafficCodes.Builder {
                private Integer jarticCauseCode;
                private Integer jarticRegulationCode;
                private Map<String, b> unrecognized;

                @Override // com.mapbox.api.directions.v5.models.TrafficCodes.Builder
                public TrafficCodes build() {
                    return new AutoValue_TrafficCodes(this.unrecognized, this.jarticCauseCode, this.jarticRegulationCode);
                }

                @Override // com.mapbox.api.directions.v5.models.TrafficCodes.Builder
                public TrafficCodes.Builder jarticCauseCode(Integer num) {
                    this.jarticCauseCode = num;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.TrafficCodes.Builder
                public TrafficCodes.Builder jarticRegulationCode(Integer num) {
                    this.jarticRegulationCode = num;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ TrafficCodes.Builder unrecognized(Map map) {
                    return unrecognized2((Map<String, b>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                /* renamed from: unrecognized, reason: avoid collision after fix types in other method */
                public TrafficCodes.Builder unrecognized2(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }
            }

            {
                this.unrecognized = map;
                this.jarticCauseCode = num;
                this.jarticRegulationCode = num2;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof TrafficCodes) {
                    TrafficCodes trafficCodes = (TrafficCodes) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(trafficCodes.unrecognized()) : trafficCodes.unrecognized() == null) {
                        Integer num3 = this.jarticCauseCode;
                        if (num3 != null ? num3.equals(trafficCodes.jarticCauseCode()) : trafficCodes.jarticCauseCode() == null) {
                            Integer num4 = this.jarticRegulationCode;
                            if (num4 != null ? num4.equals(trafficCodes.jarticRegulationCode()) : trafficCodes.jarticRegulationCode() == null) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                Map<String, b> map2 = this.unrecognized;
                int hashCode = ((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003;
                Integer num3 = this.jarticCauseCode;
                int hashCode2 = (hashCode ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.jarticRegulationCode;
                return hashCode2 ^ (num4 != null ? num4.hashCode() : 0);
            }

            @Override // com.mapbox.api.directions.v5.models.TrafficCodes
            @SerializedName("jartic_cause_code")
            public Integer jarticCauseCode() {
                return this.jarticCauseCode;
            }

            @Override // com.mapbox.api.directions.v5.models.TrafficCodes
            @SerializedName("jartic_regulation_code")
            public Integer jarticRegulationCode() {
                return this.jarticRegulationCode;
            }

            public String toString() {
                return StubApp.getString2(12938) + this.unrecognized + StubApp.getString2(12939) + this.jarticCauseCode + StubApp.getString2(12940) + this.jarticRegulationCode + StubApp.getString2(265);
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, b> unrecognized() {
                return this.unrecognized;
            }
        };
    }
}
