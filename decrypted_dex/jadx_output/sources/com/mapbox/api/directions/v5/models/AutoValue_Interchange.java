package com.mapbox.api.directions.v5.models;

import E1.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.Interchange;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_Interchange extends C$AutoValue_Interchange {

    public static final class GsonTypeAdapter extends TypeAdapter<Interchange> {
        private final Gson gson;
        private volatile TypeAdapter<String> string_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(12999);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public Interchange read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            Interchange.Builder builder = Interchange.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.getClass();
                    if (StubApp.getString2(ModuleDescriptor.MODULE_VERSION).equals(nextName)) {
                        TypeAdapter<String> typeAdapter = this.string_adapter;
                        if (typeAdapter == null) {
                            typeAdapter = this.gson.getAdapter(String.class);
                            this.string_adapter = typeAdapter;
                        }
                        builder.name(typeAdapter.read2(jsonReader));
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
        public void write(JsonWriter jsonWriter, Interchange interchange) throws IOException {
            if (interchange == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (interchange.unrecognized() != null) {
                for (Map.Entry<String, b> entry : interchange.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(ModuleDescriptor.MODULE_VERSION));
            if (interchange.name() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.string_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, interchange.name());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_Interchange(final Map<String, b> map, final String str) {
        new Interchange(map, str) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_Interchange
            private final String name;
            private final Map<String, b> unrecognized;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_Interchange$Builder */
            public static class Builder extends Interchange.Builder {
                private String name;
                private Map<String, b> unrecognized;

                @Override // com.mapbox.api.directions.v5.models.Interchange.Builder
                public Interchange build() {
                    return new AutoValue_Interchange(this.unrecognized, this.name);
                }

                @Override // com.mapbox.api.directions.v5.models.Interchange.Builder
                public Interchange.Builder name(String str) {
                    this.name = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ Interchange.Builder unrecognized(Map map) {
                    return unrecognized2((Map<String, b>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                /* renamed from: unrecognized, reason: avoid collision after fix types in other method */
                public Interchange.Builder unrecognized2(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }
            }

            {
                this.unrecognized = map;
                this.name = str;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Interchange) {
                    Interchange interchange = (Interchange) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(interchange.unrecognized()) : interchange.unrecognized() == null) {
                        String str2 = this.name;
                        if (str2 != null ? str2.equals(interchange.name()) : interchange.name() == null) {
                            return true;
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                Map<String, b> map2 = this.unrecognized;
                int hashCode = ((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003;
                String str2 = this.name;
                return hashCode ^ (str2 != null ? str2.hashCode() : 0);
            }

            @Override // com.mapbox.api.directions.v5.models.Interchange
            public String name() {
                return this.name;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(12756));
                sb2.append(this.unrecognized);
                sb2.append(StubApp.getString2(1065));
                return AbstractC1482f.k(sb2, this.name, StubApp.getString2(265));
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, b> unrecognized() {
                return this.unrecognized;
            }
        };
    }
}
