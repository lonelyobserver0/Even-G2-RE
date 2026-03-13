package com.mapbox.api.directions.v5.models;

import E1.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.TollCollection;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_TollCollection extends C$AutoValue_TollCollection {

    public static final class GsonTypeAdapter extends TypeAdapter<TollCollection> {
        private final Gson gson;
        private volatile TypeAdapter<String> string_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(13129);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public TollCollection read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            TollCollection.Builder builder = TollCollection.builder();
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
                    } else if (StubApp.getString2(ModuleDescriptor.MODULE_VERSION).equals(nextName)) {
                        TypeAdapter<String> typeAdapter2 = this.string_adapter;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.gson.getAdapter(String.class);
                            this.string_adapter = typeAdapter2;
                        }
                        builder.name(typeAdapter2.read2(jsonReader));
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
        public void write(JsonWriter jsonWriter, TollCollection tollCollection) throws IOException {
            if (tollCollection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (tollCollection.unrecognized() != null) {
                for (Map.Entry<String, b> entry : tollCollection.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(660));
            if (tollCollection.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.string_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, tollCollection.type());
            }
            jsonWriter.name(StubApp.getString2(ModuleDescriptor.MODULE_VERSION));
            if (tollCollection.name() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter2 = this.string_adapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, tollCollection.name());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_TollCollection(final Map<String, b> map, final String str, final String str2) {
        new TollCollection(map, str, str2) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_TollCollection
            private final String name;
            private final String type;
            private final Map<String, b> unrecognized;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_TollCollection$Builder */
            public static class Builder extends TollCollection.Builder {
                private String name;
                private String type;
                private Map<String, b> unrecognized;

                @Override // com.mapbox.api.directions.v5.models.TollCollection.Builder
                public TollCollection build() {
                    return new AutoValue_TollCollection(this.unrecognized, this.type, this.name);
                }

                @Override // com.mapbox.api.directions.v5.models.TollCollection.Builder
                public TollCollection.Builder name(String str) {
                    this.name = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.TollCollection.Builder
                public TollCollection.Builder type(String str) {
                    this.type = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ TollCollection.Builder unrecognized(Map map) {
                    return unrecognized2((Map<String, b>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                /* renamed from: unrecognized, reason: avoid collision after fix types in other method */
                public TollCollection.Builder unrecognized2(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }
            }

            {
                this.unrecognized = map;
                this.type = str;
                this.name = str2;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof TollCollection) {
                    TollCollection tollCollection = (TollCollection) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(tollCollection.unrecognized()) : tollCollection.unrecognized() == null) {
                        String str3 = this.type;
                        if (str3 != null ? str3.equals(tollCollection.type()) : tollCollection.type() == null) {
                            String str4 = this.name;
                            if (str4 != null ? str4.equals(tollCollection.name()) : tollCollection.name() == null) {
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
                String str3 = this.type;
                int hashCode2 = (hashCode ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.name;
                return hashCode2 ^ (str4 != null ? str4.hashCode() : 0);
            }

            @Override // com.mapbox.api.directions.v5.models.TollCollection
            public String name() {
                return this.name;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(12935));
                sb2.append(this.unrecognized);
                sb2.append(StubApp.getString2(2148));
                sb2.append(this.type);
                sb2.append(StubApp.getString2(1065));
                return AbstractC1482f.k(sb2, this.name, StubApp.getString2(265));
            }

            @Override // com.mapbox.api.directions.v5.models.TollCollection
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
