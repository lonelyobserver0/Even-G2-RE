package com.mapbox.api.directions.v5.models;

import E1.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.MaxSpeed;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_MaxSpeed extends C$AutoValue_MaxSpeed {

    public static final class GsonTypeAdapter extends TypeAdapter<MaxSpeed> {
        private volatile TypeAdapter<Boolean> boolean__adapter;
        private final Gson gson;
        private volatile TypeAdapter<Integer> integer_adapter;
        private volatile TypeAdapter<String> string_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(13029);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public MaxSpeed read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            MaxSpeed.Builder builder = MaxSpeed.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.getClass();
                    if (StubApp.getString2(2029).equals(nextName)) {
                        TypeAdapter<Integer> typeAdapter = this.integer_adapter;
                        if (typeAdapter == null) {
                            typeAdapter = this.gson.getAdapter(Integer.class);
                            this.integer_adapter = typeAdapter;
                        }
                        builder.speed(typeAdapter.read2(jsonReader));
                    } else if (StubApp.getString2(13028).equals(nextName)) {
                        TypeAdapter<String> typeAdapter2 = this.string_adapter;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.gson.getAdapter(String.class);
                            this.string_adapter = typeAdapter2;
                        }
                        builder.unit(typeAdapter2.read2(jsonReader));
                    } else if (StubApp.getString2(351).equals(nextName)) {
                        TypeAdapter<Boolean> typeAdapter3 = this.boolean__adapter;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.gson.getAdapter(Boolean.class);
                            this.boolean__adapter = typeAdapter3;
                        }
                        builder.unknown(typeAdapter3.read2(jsonReader));
                    } else if (StubApp.getString2(1337).equals(nextName)) {
                        TypeAdapter<Boolean> typeAdapter4 = this.boolean__adapter;
                        if (typeAdapter4 == null) {
                            typeAdapter4 = this.gson.getAdapter(Boolean.class);
                            this.boolean__adapter = typeAdapter4;
                        }
                        builder.none(typeAdapter4.read2(jsonReader));
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
        public void write(JsonWriter jsonWriter, MaxSpeed maxSpeed) throws IOException {
            if (maxSpeed == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (maxSpeed.unrecognized() != null) {
                for (Map.Entry<String, b> entry : maxSpeed.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(2029));
            if (maxSpeed.speed() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter = this.integer_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, maxSpeed.speed());
            }
            jsonWriter.name(StubApp.getString2(13028));
            if (maxSpeed.unit() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter2 = this.string_adapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, maxSpeed.unit());
            }
            jsonWriter.name(StubApp.getString2(351));
            if (maxSpeed.unknown() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter3 = this.boolean__adapter;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, maxSpeed.unknown());
            }
            jsonWriter.name(StubApp.getString2(1337));
            if (maxSpeed.none() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter4 = this.boolean__adapter;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, maxSpeed.none());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_MaxSpeed(Map<String, b> map, Integer num, String str, Boolean bool, Boolean bool2) {
        new MaxSpeed(map, num, str, bool, bool2) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_MaxSpeed
            private final Boolean none;
            private final Integer speed;
            private final String unit;
            private final Boolean unknown;
            private final Map<String, b> unrecognized;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_MaxSpeed$Builder */
            public static class Builder extends MaxSpeed.Builder {
                private Boolean none;
                private Integer speed;
                private String unit;
                private Boolean unknown;
                private Map<String, b> unrecognized;

                @Override // com.mapbox.api.directions.v5.models.MaxSpeed.Builder
                public MaxSpeed build() {
                    return new AutoValue_MaxSpeed(this.unrecognized, this.speed, this.unit, this.unknown, this.none);
                }

                @Override // com.mapbox.api.directions.v5.models.MaxSpeed.Builder
                public MaxSpeed.Builder none(Boolean bool) {
                    this.none = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.MaxSpeed.Builder
                public MaxSpeed.Builder speed(Integer num) {
                    this.speed = num;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.MaxSpeed.Builder
                public MaxSpeed.Builder unit(String str) {
                    this.unit = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.MaxSpeed.Builder
                public MaxSpeed.Builder unknown(Boolean bool) {
                    this.unknown = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ MaxSpeed.Builder unrecognized(Map map) {
                    return unrecognized2((Map<String, b>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                /* renamed from: unrecognized, reason: avoid collision after fix types in other method */
                public MaxSpeed.Builder unrecognized2(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }
            }

            {
                this.unrecognized = map;
                this.speed = num;
                this.unit = str;
                this.unknown = bool;
                this.none = bool2;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof MaxSpeed) {
                    MaxSpeed maxSpeed = (MaxSpeed) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(maxSpeed.unrecognized()) : maxSpeed.unrecognized() == null) {
                        Integer num2 = this.speed;
                        if (num2 != null ? num2.equals(maxSpeed.speed()) : maxSpeed.speed() == null) {
                            String str2 = this.unit;
                            if (str2 != null ? str2.equals(maxSpeed.unit()) : maxSpeed.unit() == null) {
                                Boolean bool3 = this.unknown;
                                if (bool3 != null ? bool3.equals(maxSpeed.unknown()) : maxSpeed.unknown() == null) {
                                    Boolean bool4 = this.none;
                                    if (bool4 != null ? bool4.equals(maxSpeed.none()) : maxSpeed.none() == null) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                Map<String, b> map2 = this.unrecognized;
                int hashCode = ((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003;
                Integer num2 = this.speed;
                int hashCode2 = (hashCode ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                String str2 = this.unit;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                Boolean bool3 = this.unknown;
                int hashCode4 = (hashCode3 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
                Boolean bool4 = this.none;
                return hashCode4 ^ (bool4 != null ? bool4.hashCode() : 0);
            }

            @Override // com.mapbox.api.directions.v5.models.MaxSpeed
            public Boolean none() {
                return this.none;
            }

            @Override // com.mapbox.api.directions.v5.models.MaxSpeed
            public Integer speed() {
                return this.speed;
            }

            public String toString() {
                return StubApp.getString2(12799) + this.unrecognized + StubApp.getString2(6639) + this.speed + StubApp.getString2(3781) + this.unit + StubApp.getString2(12800) + this.unknown + StubApp.getString2(12801) + this.none + StubApp.getString2(265);
            }

            @Override // com.mapbox.api.directions.v5.models.MaxSpeed
            public String unit() {
                return this.unit;
            }

            @Override // com.mapbox.api.directions.v5.models.MaxSpeed
            public Boolean unknown() {
                return this.unknown;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, b> unrecognized() {
                return this.unrecognized;
            }
        };
    }
}
