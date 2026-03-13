package com.mapbox.api.directions.v5.models;

import E1.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.MapboxShield;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_MapboxShield extends C$AutoValue_MapboxShield {

    public static final class GsonTypeAdapter extends TypeAdapter<MapboxShield> {
        private final Gson gson;
        private volatile TypeAdapter<String> string_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(13026);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public MapboxShield read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            MapboxShield.Builder builder = MapboxShield.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    nextName.getClass();
                    char c10 = 65535;
                    switch (nextName.hashCode()) {
                        case -2115337775:
                            if (nextName.equals(StubApp.getString2(13025))) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case -1721160959:
                            if (nextName.equals(StubApp.getString2(13024))) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 1714671510:
                            if (nextName.equals(StubApp.getString2(13023))) {
                                c10 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            TypeAdapter<String> typeAdapter = this.string_adapter;
                            if (typeAdapter == null) {
                                typeAdapter = this.gson.getAdapter(String.class);
                                this.string_adapter = typeAdapter;
                            }
                            builder.textColor(typeAdapter.read2(jsonReader));
                            break;
                        case 1:
                            TypeAdapter<String> typeAdapter2 = this.string_adapter;
                            if (typeAdapter2 == null) {
                                typeAdapter2 = this.gson.getAdapter(String.class);
                                this.string_adapter = typeAdapter2;
                            }
                            builder.baseUrl(typeAdapter2.read2(jsonReader));
                            break;
                        case 2:
                            TypeAdapter<String> typeAdapter3 = this.string_adapter;
                            if (typeAdapter3 == null) {
                                typeAdapter3 = this.gson.getAdapter(String.class);
                                this.string_adapter = typeAdapter3;
                            }
                            builder.displayRef(typeAdapter3.read2(jsonReader));
                            break;
                        default:
                            if (!StubApp.getString2(ModuleDescriptor.MODULE_VERSION).equals(nextName)) {
                                if (linkedHashMap == null) {
                                    linkedHashMap = new LinkedHashMap();
                                    builder.unrecognized(linkedHashMap);
                                }
                                a.t((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, nextName);
                                break;
                            } else {
                                TypeAdapter<String> typeAdapter4 = this.string_adapter;
                                if (typeAdapter4 == null) {
                                    typeAdapter4 = this.gson.getAdapter(String.class);
                                    this.string_adapter = typeAdapter4;
                                }
                                builder.name(typeAdapter4.read2(jsonReader));
                                break;
                            }
                    }
                } else {
                    jsonReader.nextNull();
                }
            }
            jsonReader.endObject();
            return builder.build();
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, MapboxShield mapboxShield) throws IOException {
            if (mapboxShield == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (mapboxShield.unrecognized() != null) {
                for (Map.Entry<String, b> entry : mapboxShield.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(13024));
            if (mapboxShield.baseUrl() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.string_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, mapboxShield.baseUrl());
            }
            jsonWriter.name(StubApp.getString2(ModuleDescriptor.MODULE_VERSION));
            if (mapboxShield.name() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter2 = this.string_adapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, mapboxShield.name());
            }
            jsonWriter.name(StubApp.getString2(13025));
            if (mapboxShield.textColor() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter3 = this.string_adapter;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, mapboxShield.textColor());
            }
            jsonWriter.name(StubApp.getString2(13023));
            if (mapboxShield.displayRef() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter4 = this.string_adapter;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, mapboxShield.displayRef());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_MapboxShield(Map<String, b> map, String str, String str2, String str3, String str4) {
        new MapboxShield(map, str, str2, str3, str4) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_MapboxShield
            private final String baseUrl;
            private final String displayRef;
            private final String name;
            private final String textColor;
            private final Map<String, b> unrecognized;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_MapboxShield$Builder */
            public static class Builder extends MapboxShield.Builder {
                private String baseUrl;
                private String displayRef;
                private String name;
                private String textColor;
                private Map<String, b> unrecognized;

                @Override // com.mapbox.api.directions.v5.models.MapboxShield.Builder
                public MapboxShield.Builder baseUrl(String str) {
                    if (str == null) {
                        throw new NullPointerException(StubApp.getString2(12787));
                    }
                    this.baseUrl = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.MapboxShield.Builder
                public MapboxShield build() {
                    String string2 = this.baseUrl == null ? StubApp.getString2(12788) : "";
                    if (this.name == null) {
                        string2 = AbstractC1482f.g(string2, StubApp.getString2(12747));
                    }
                    if (this.textColor == null) {
                        string2 = AbstractC1482f.g(string2, StubApp.getString2(12789));
                    }
                    if (this.displayRef == null) {
                        string2 = AbstractC1482f.g(string2, StubApp.getString2(12790));
                    }
                    if (string2.isEmpty()) {
                        return new AutoValue_MapboxShield(this.unrecognized, this.baseUrl, this.name, this.textColor, this.displayRef);
                    }
                    throw new IllegalStateException(StubApp.getString2(555).concat(string2));
                }

                @Override // com.mapbox.api.directions.v5.models.MapboxShield.Builder
                public MapboxShield.Builder displayRef(String str) {
                    if (str == null) {
                        throw new NullPointerException(StubApp.getString2(12791));
                    }
                    this.displayRef = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.MapboxShield.Builder
                public MapboxShield.Builder name(String str) {
                    if (str == null) {
                        throw new NullPointerException(StubApp.getString2(9576));
                    }
                    this.name = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.MapboxShield.Builder
                public MapboxShield.Builder textColor(String str) {
                    if (str == null) {
                        throw new NullPointerException(StubApp.getString2(12792));
                    }
                    this.textColor = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ MapboxShield.Builder unrecognized(Map map) {
                    return unrecognized2((Map<String, b>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                /* renamed from: unrecognized, reason: avoid collision after fix types in other method */
                public MapboxShield.Builder unrecognized2(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }
            }

            {
                this.unrecognized = map;
                if (str == null) {
                    throw new NullPointerException(StubApp.getString2(12787));
                }
                this.baseUrl = str;
                if (str2 == null) {
                    throw new NullPointerException(StubApp.getString2(9576));
                }
                this.name = str2;
                if (str3 == null) {
                    throw new NullPointerException(StubApp.getString2(12792));
                }
                this.textColor = str3;
                if (str4 == null) {
                    throw new NullPointerException(StubApp.getString2(12791));
                }
                this.displayRef = str4;
            }

            @Override // com.mapbox.api.directions.v5.models.MapboxShield
            @SerializedName("base_url")
            public String baseUrl() {
                return this.baseUrl;
            }

            @Override // com.mapbox.api.directions.v5.models.MapboxShield
            @SerializedName("display_ref")
            public String displayRef() {
                return this.displayRef;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof MapboxShield) {
                    MapboxShield mapboxShield = (MapboxShield) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(mapboxShield.unrecognized()) : mapboxShield.unrecognized() == null) {
                        if (this.baseUrl.equals(mapboxShield.baseUrl()) && this.name.equals(mapboxShield.name()) && this.textColor.equals(mapboxShield.textColor()) && this.displayRef.equals(mapboxShield.displayRef())) {
                            return true;
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                Map<String, b> map2 = this.unrecognized;
                return (((((((((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003) ^ this.baseUrl.hashCode()) * 1000003) ^ this.name.hashCode()) * 1000003) ^ this.textColor.hashCode()) * 1000003) ^ this.displayRef.hashCode();
            }

            @Override // com.mapbox.api.directions.v5.models.MapboxShield
            public String name() {
                return this.name;
            }

            @Override // com.mapbox.api.directions.v5.models.MapboxShield
            @SerializedName("text_color")
            public String textColor() {
                return this.textColor;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(12793));
                sb2.append(this.unrecognized);
                sb2.append(StubApp.getString2(12794));
                sb2.append(this.baseUrl);
                sb2.append(StubApp.getString2(1065));
                sb2.append(this.name);
                sb2.append(StubApp.getString2(12795));
                sb2.append(this.textColor);
                sb2.append(StubApp.getString2(12796));
                return AbstractC1482f.k(sb2, this.displayRef, StubApp.getString2(265));
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, b> unrecognized() {
                return this.unrecognized;
            }
        };
    }
}
