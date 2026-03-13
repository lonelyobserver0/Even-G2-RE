package com.mapbox.api.directions.v5.models;

import E1.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.Admin;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_Admin extends C$AutoValue_Admin {

    public static final class GsonTypeAdapter extends TypeAdapter<Admin> {
        private final Gson gson;
        private volatile TypeAdapter<String> string_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(12945);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public Admin read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            Admin.Builder builder = Admin.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.getClass();
                    if (nextName.equals(StubApp.getString2(12943))) {
                        TypeAdapter<String> typeAdapter = this.string_adapter;
                        if (typeAdapter == null) {
                            typeAdapter = this.gson.getAdapter(String.class);
                            this.string_adapter = typeAdapter;
                        }
                        builder.countryCode(typeAdapter.read2(jsonReader));
                    } else if (nextName.equals(StubApp.getString2(12944))) {
                        TypeAdapter<String> typeAdapter2 = this.string_adapter;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.gson.getAdapter(String.class);
                            this.string_adapter = typeAdapter2;
                        }
                        builder.countryCodeAlpha3(typeAdapter2.read2(jsonReader));
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
        public void write(JsonWriter jsonWriter, Admin admin) throws IOException {
            if (admin == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (admin.unrecognized() != null) {
                for (Map.Entry<String, b> entry : admin.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(12943));
            if (admin.countryCode() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.string_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, admin.countryCode());
            }
            jsonWriter.name(StubApp.getString2(12944));
            if (admin.countryCodeAlpha3() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter2 = this.string_adapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, admin.countryCodeAlpha3());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_Admin(final Map<String, b> map, final String str, final String str2) {
        new Admin(map, str, str2) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_Admin
            private final String countryCode;
            private final String countryCodeAlpha3;
            private final Map<String, b> unrecognized;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_Admin$Builder */
            public static class Builder extends Admin.Builder {
                private String countryCode;
                private String countryCodeAlpha3;
                private Map<String, b> unrecognized;

                @Override // com.mapbox.api.directions.v5.models.Admin.Builder
                public Admin build() {
                    return new AutoValue_Admin(this.unrecognized, this.countryCode, this.countryCodeAlpha3);
                }

                @Override // com.mapbox.api.directions.v5.models.Admin.Builder
                public Admin.Builder countryCode(String str) {
                    this.countryCode = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Admin.Builder
                public Admin.Builder countryCodeAlpha3(String str) {
                    this.countryCodeAlpha3 = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ Admin.Builder unrecognized(Map map) {
                    return unrecognized((Map<String, b>) map);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public Admin.Builder unrecognized(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }
            }

            {
                this.unrecognized = map;
                this.countryCode = str;
                this.countryCodeAlpha3 = str2;
            }

            @Override // com.mapbox.api.directions.v5.models.Admin
            @SerializedName("iso_3166_1")
            public String countryCode() {
                return this.countryCode;
            }

            @Override // com.mapbox.api.directions.v5.models.Admin
            @SerializedName("iso_3166_1_alpha3")
            public String countryCodeAlpha3() {
                return this.countryCodeAlpha3;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Admin) {
                    Admin admin = (Admin) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(admin.unrecognized()) : admin.unrecognized() == null) {
                        String str3 = this.countryCode;
                        if (str3 != null ? str3.equals(admin.countryCode()) : admin.countryCode() == null) {
                            String str4 = this.countryCodeAlpha3;
                            if (str4 != null ? str4.equals(admin.countryCodeAlpha3()) : admin.countryCodeAlpha3() == null) {
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
                String str3 = this.countryCode;
                int hashCode2 = (hashCode ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.countryCodeAlpha3;
                return hashCode2 ^ (str4 != null ? str4.hashCode() : 0);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(12686));
                sb2.append(this.unrecognized);
                sb2.append(StubApp.getString2(12687));
                sb2.append(this.countryCode);
                sb2.append(StubApp.getString2(7306));
                return AbstractC1482f.k(sb2, this.countryCodeAlpha3, StubApp.getString2(265));
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, b> unrecognized() {
                return this.unrecognized;
            }
        };
    }
}
