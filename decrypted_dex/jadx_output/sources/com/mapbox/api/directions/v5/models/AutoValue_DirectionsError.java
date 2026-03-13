package com.mapbox.api.directions.v5.models;

import E1.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.DirectionsError;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_DirectionsError extends C$AutoValue_DirectionsError {

    public static final class GsonTypeAdapter extends TypeAdapter<DirectionsError> {
        private final Gson gson;
        private volatile TypeAdapter<String> string_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(12978);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public DirectionsError read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            DirectionsError.Builder builder = DirectionsError.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.getClass();
                    if (StubApp.getString2(1052).equals(nextName)) {
                        TypeAdapter<String> typeAdapter = this.string_adapter;
                        if (typeAdapter == null) {
                            typeAdapter = this.gson.getAdapter(String.class);
                            this.string_adapter = typeAdapter;
                        }
                        builder.code(typeAdapter.read2(jsonReader));
                    } else if (StubApp.getString2(1905).equals(nextName)) {
                        TypeAdapter<String> typeAdapter2 = this.string_adapter;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.gson.getAdapter(String.class);
                            this.string_adapter = typeAdapter2;
                        }
                        builder.message(typeAdapter2.read2(jsonReader));
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
        public void write(JsonWriter jsonWriter, DirectionsError directionsError) throws IOException {
            if (directionsError == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (directionsError.unrecognized() != null) {
                for (Map.Entry<String, b> entry : directionsError.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(1052));
            if (directionsError.code() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.string_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, directionsError.code());
            }
            jsonWriter.name(StubApp.getString2(1905));
            if (directionsError.message() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter2 = this.string_adapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, directionsError.message());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_DirectionsError(final Map<String, b> map, final String str, final String str2) {
        new DirectionsError(map, str, str2) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_DirectionsError
            private final String code;
            private final String message;
            private final Map<String, b> unrecognized;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_DirectionsError$Builder */
            public static class Builder extends DirectionsError.Builder {
                private String code;
                private String message;
                private Map<String, b> unrecognized;

                @Override // com.mapbox.api.directions.v5.models.DirectionsError.Builder
                public DirectionsError build() {
                    return new AutoValue_DirectionsError(this.unrecognized, this.code, this.message);
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsError.Builder
                public DirectionsError.Builder code(String str) {
                    this.code = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsError.Builder
                public DirectionsError.Builder message(String str) {
                    this.message = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ DirectionsError.Builder unrecognized(Map map) {
                    return unrecognized((Map<String, b>) map);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public DirectionsError.Builder unrecognized(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }
            }

            {
                this.unrecognized = map;
                this.code = str;
                this.message = str2;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsError
            public String code() {
                return this.code;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof DirectionsError) {
                    DirectionsError directionsError = (DirectionsError) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(directionsError.unrecognized()) : directionsError.unrecognized() == null) {
                        String str3 = this.code;
                        if (str3 != null ? str3.equals(directionsError.code()) : directionsError.code() == null) {
                            String str4 = this.message;
                            if (str4 != null ? str4.equals(directionsError.message()) : directionsError.message() == null) {
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
                String str3 = this.code;
                int hashCode2 = (hashCode ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.message;
                return hashCode2 ^ (str4 != null ? str4.hashCode() : 0);
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsError
            public String message() {
                return this.message;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(12729));
                sb2.append(this.unrecognized);
                sb2.append(StubApp.getString2(573));
                sb2.append(this.code);
                sb2.append(StubApp.getString2(2061));
                return AbstractC1482f.k(sb2, this.message, StubApp.getString2(265));
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, b> unrecognized() {
                return this.unrecognized;
            }
        };
    }
}
