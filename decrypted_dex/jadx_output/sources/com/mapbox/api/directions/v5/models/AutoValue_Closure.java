package com.mapbox.api.directions.v5.models;

import E1.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.Closure;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_Closure extends C$AutoValue_Closure {

    public static final class GsonTypeAdapter extends TypeAdapter<Closure> {
        private final Gson gson;
        private volatile TypeAdapter<Integer> integer_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(12970);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public Closure read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            Closure.Builder builder = Closure.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.getClass();
                    if (nextName.equals(StubApp.getString2(12968))) {
                        TypeAdapter<Integer> typeAdapter = this.integer_adapter;
                        if (typeAdapter == null) {
                            typeAdapter = this.gson.getAdapter(Integer.class);
                            this.integer_adapter = typeAdapter;
                        }
                        builder.geometryIndexStart(typeAdapter.read2(jsonReader));
                    } else if (nextName.equals(StubApp.getString2(12969))) {
                        TypeAdapter<Integer> typeAdapter2 = this.integer_adapter;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.gson.getAdapter(Integer.class);
                            this.integer_adapter = typeAdapter2;
                        }
                        builder.geometryIndexEnd(typeAdapter2.read2(jsonReader));
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
        public void write(JsonWriter jsonWriter, Closure closure) throws IOException {
            if (closure == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (closure.unrecognized() != null) {
                for (Map.Entry<String, b> entry : closure.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(12968));
            if (closure.geometryIndexStart() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter = this.integer_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, closure.geometryIndexStart());
            }
            jsonWriter.name(StubApp.getString2(12969));
            if (closure.geometryIndexEnd() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter2 = this.integer_adapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, closure.geometryIndexEnd());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_Closure(Map<String, b> map, Integer num, Integer num2) {
        new Closure(map, num, num2) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_Closure
            private final Integer geometryIndexEnd;
            private final Integer geometryIndexStart;
            private final Map<String, b> unrecognized;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_Closure$1, reason: invalid class name */
            public static /* synthetic */ class AnonymousClass1 {
            }

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_Closure$Builder */
            public static class Builder extends Closure.Builder {
                private Integer geometryIndexEnd;
                private Integer geometryIndexStart;
                private Map<String, b> unrecognized;

                public /* synthetic */ Builder(Closure closure, AnonymousClass1 anonymousClass1) {
                    this(closure);
                }

                @Override // com.mapbox.api.directions.v5.models.Closure.Builder
                public Closure build() {
                    String string2 = this.geometryIndexStart == null ? StubApp.getString2(12713) : "";
                    if (this.geometryIndexEnd == null) {
                        string2 = AbstractC1482f.g(string2, StubApp.getString2(12714));
                    }
                    if (string2.isEmpty()) {
                        return new AutoValue_Closure(this.unrecognized, this.geometryIndexStart, this.geometryIndexEnd);
                    }
                    throw new IllegalStateException(StubApp.getString2(555).concat(string2));
                }

                @Override // com.mapbox.api.directions.v5.models.Closure.Builder
                public Closure.Builder geometryIndexEnd(Integer num) {
                    if (num == null) {
                        throw new NullPointerException(StubApp.getString2(12715));
                    }
                    this.geometryIndexEnd = num;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Closure.Builder
                public Closure.Builder geometryIndexStart(Integer num) {
                    if (num == null) {
                        throw new NullPointerException(StubApp.getString2(12716));
                    }
                    this.geometryIndexStart = num;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ Closure.Builder unrecognized(Map map) {
                    return unrecognized((Map<String, b>) map);
                }

                public Builder() {
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public Closure.Builder unrecognized(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }

                private Builder(Closure closure) {
                    this.unrecognized = closure.unrecognized();
                    this.geometryIndexStart = closure.geometryIndexStart();
                    this.geometryIndexEnd = closure.geometryIndexEnd();
                }
            }

            {
                this.unrecognized = map;
                if (num == null) {
                    throw new NullPointerException(StubApp.getString2(12716));
                }
                this.geometryIndexStart = num;
                if (num2 == null) {
                    throw new NullPointerException(StubApp.getString2(12715));
                }
                this.geometryIndexEnd = num2;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Closure) {
                    Closure closure = (Closure) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(closure.unrecognized()) : closure.unrecognized() == null) {
                        if (this.geometryIndexStart.equals(closure.geometryIndexStart()) && this.geometryIndexEnd.equals(closure.geometryIndexEnd())) {
                            return true;
                        }
                    }
                }
                return false;
            }

            @Override // com.mapbox.api.directions.v5.models.Closure
            @SerializedName("geometry_index_end")
            public Integer geometryIndexEnd() {
                return this.geometryIndexEnd;
            }

            @Override // com.mapbox.api.directions.v5.models.Closure
            @SerializedName("geometry_index_start")
            public Integer geometryIndexStart() {
                return this.geometryIndexStart;
            }

            public int hashCode() {
                Map<String, b> map2 = this.unrecognized;
                return (((((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003) ^ this.geometryIndexStart.hashCode()) * 1000003) ^ this.geometryIndexEnd.hashCode();
            }

            @Override // com.mapbox.api.directions.v5.models.Closure
            public Closure.Builder toBuilder() {
                return new Builder(this, null);
            }

            public String toString() {
                return StubApp.getString2(12717) + this.unrecognized + StubApp.getString2(12718) + this.geometryIndexStart + StubApp.getString2(12719) + this.geometryIndexEnd + StubApp.getString2(265);
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, b> unrecognized() {
                return this.unrecognized;
            }
        };
    }
}
