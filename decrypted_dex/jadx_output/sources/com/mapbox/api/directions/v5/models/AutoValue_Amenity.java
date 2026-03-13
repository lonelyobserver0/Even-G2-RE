package com.mapbox.api.directions.v5.models;

import E1.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.Amenity;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_Amenity extends C$AutoValue_Amenity {

    public static final class GsonTypeAdapter extends TypeAdapter<Amenity> {
        private final Gson gson;
        private volatile TypeAdapter<String> string_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(12946);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public Amenity read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            Amenity.Builder builder = Amenity.builder();
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
                    } else if (StubApp.getString2(5872).equals(nextName)) {
                        TypeAdapter<String> typeAdapter3 = this.string_adapter;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.gson.getAdapter(String.class);
                            this.string_adapter = typeAdapter3;
                        }
                        builder.brand(typeAdapter3.read2(jsonReader));
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
        public void write(JsonWriter jsonWriter, Amenity amenity) throws IOException {
            if (amenity == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (amenity.unrecognized() != null) {
                for (Map.Entry<String, b> entry : amenity.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(660));
            if (amenity.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.string_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, amenity.type());
            }
            jsonWriter.name(StubApp.getString2(ModuleDescriptor.MODULE_VERSION));
            if (amenity.name() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter2 = this.string_adapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, amenity.name());
            }
            jsonWriter.name(StubApp.getString2(5872));
            if (amenity.brand() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter3 = this.string_adapter;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, amenity.brand());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_Amenity(final Map<String, b> map, final String str, final String str2, final String str3) {
        new Amenity(map, str, str2, str3) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_Amenity
            private final String brand;
            private final String name;
            private final String type;
            private final Map<String, b> unrecognized;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_Amenity$Builder */
            public static class Builder extends Amenity.Builder {
                private String brand;
                private String name;
                private String type;
                private Map<String, b> unrecognized;

                @Override // com.mapbox.api.directions.v5.models.Amenity.Builder
                public Amenity.Builder brand(String str) {
                    this.brand = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Amenity.Builder
                public Amenity build() {
                    String string2 = this.type == null ? StubApp.getString2(2256) : "";
                    if (string2.isEmpty()) {
                        return new AutoValue_Amenity(this.unrecognized, this.type, this.name, this.brand);
                    }
                    throw new IllegalStateException(StubApp.getString2(555).concat(string2));
                }

                @Override // com.mapbox.api.directions.v5.models.Amenity.Builder
                public Amenity.Builder name(String str) {
                    this.name = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Amenity.Builder
                public Amenity.Builder type(String str) {
                    if (str == null) {
                        throw new NullPointerException(StubApp.getString2(2257));
                    }
                    this.type = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ Amenity.Builder unrecognized(Map map) {
                    return unrecognized((Map<String, b>) map);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public Amenity.Builder unrecognized(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }
            }

            {
                this.unrecognized = map;
                if (str == null) {
                    throw new NullPointerException(StubApp.getString2(2257));
                }
                this.type = str;
                this.name = str2;
                this.brand = str3;
            }

            @Override // com.mapbox.api.directions.v5.models.Amenity
            public String brand() {
                return this.brand;
            }

            public boolean equals(Object obj) {
                String str4;
                String str5;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Amenity) {
                    Amenity amenity = (Amenity) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(amenity.unrecognized()) : amenity.unrecognized() == null) {
                        if (this.type.equals(amenity.type()) && ((str4 = this.name) != null ? str4.equals(amenity.name()) : amenity.name() == null) && ((str5 = this.brand) != null ? str5.equals(amenity.brand()) : amenity.brand() == null)) {
                            return true;
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                Map<String, b> map2 = this.unrecognized;
                int hashCode = ((((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003) ^ this.type.hashCode()) * 1000003;
                String str4 = this.name;
                int hashCode2 = (hashCode ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.brand;
                return hashCode2 ^ (str5 != null ? str5.hashCode() : 0);
            }

            @Override // com.mapbox.api.directions.v5.models.Amenity
            public String name() {
                return this.name;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(12688));
                sb2.append(this.unrecognized);
                sb2.append(StubApp.getString2(2148));
                sb2.append(this.type);
                sb2.append(StubApp.getString2(1065));
                sb2.append(this.name);
                sb2.append(StubApp.getString2(12689));
                return AbstractC1482f.k(sb2, this.brand, StubApp.getString2(265));
            }

            @Override // com.mapbox.api.directions.v5.models.Amenity
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
