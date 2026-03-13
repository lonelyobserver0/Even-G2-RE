package com.mapbox.api.directions.v5.models;

import E1.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.BannerComponents;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_BannerComponents extends C$AutoValue_BannerComponents {

    public static final class GsonTypeAdapter extends TypeAdapter<BannerComponents> {
        private volatile TypeAdapter<Boolean> boolean__adapter;
        private final Gson gson;
        private volatile TypeAdapter<Integer> integer_adapter;
        private volatile TypeAdapter<List<String>> list__string_adapter;
        private volatile TypeAdapter<MapboxShield> mapboxShield_adapter;
        private volatile TypeAdapter<String> string_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(12954);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public BannerComponents read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            BannerComponents.Builder builder = BannerComponents.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    nextName.getClass();
                    char c10 = 65535;
                    switch (nextName.hashCode()) {
                        case -2028587335:
                            if (nextName.equals(StubApp.getString2(12952))) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case -859611628:
                            if (nextName.equals(StubApp.getString2(12951))) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case -640336398:
                            if (nextName.equals(StubApp.getString2(12950))) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 2987057:
                            if (nextName.equals(StubApp.getString2(12949))) {
                                c10 = 3;
                                break;
                            }
                            break;
                        case 265635587:
                            if (nextName.equals(StubApp.getString2(12948))) {
                                c10 = 4;
                                break;
                            }
                            break;
                        case 475656582:
                            if (nextName.equals(StubApp.getString2(12947))) {
                                c10 = 5;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            TypeAdapter<MapboxShield> typeAdapter = this.mapboxShield_adapter;
                            if (typeAdapter == null) {
                                typeAdapter = this.gson.getAdapter(MapboxShield.class);
                                this.mapboxShield_adapter = typeAdapter;
                            }
                            builder.mapboxShield(typeAdapter.read2(jsonReader));
                            break;
                        case 1:
                            TypeAdapter<String> typeAdapter2 = this.string_adapter;
                            if (typeAdapter2 == null) {
                                typeAdapter2 = this.gson.getAdapter(String.class);
                                this.string_adapter = typeAdapter2;
                            }
                            builder.imageUrl(typeAdapter2.read2(jsonReader));
                            break;
                        case 2:
                            TypeAdapter<Integer> typeAdapter3 = this.integer_adapter;
                            if (typeAdapter3 == null) {
                                typeAdapter3 = this.gson.getAdapter(Integer.class);
                                this.integer_adapter = typeAdapter3;
                            }
                            builder.abbreviationPriority(typeAdapter3.read2(jsonReader));
                            break;
                        case 3:
                            TypeAdapter<String> typeAdapter4 = this.string_adapter;
                            if (typeAdapter4 == null) {
                                typeAdapter4 = this.gson.getAdapter(String.class);
                                this.string_adapter = typeAdapter4;
                            }
                            builder.abbreviation(typeAdapter4.read2(jsonReader));
                            break;
                        case 4:
                            TypeAdapter<String> typeAdapter5 = this.string_adapter;
                            if (typeAdapter5 == null) {
                                typeAdapter5 = this.gson.getAdapter(String.class);
                                this.string_adapter = typeAdapter5;
                            }
                            builder.imageBaseUrl(typeAdapter5.read2(jsonReader));
                            break;
                        case 5:
                            TypeAdapter<String> typeAdapter6 = this.string_adapter;
                            if (typeAdapter6 == null) {
                                typeAdapter6 = this.gson.getAdapter(String.class);
                                this.string_adapter = typeAdapter6;
                            }
                            builder.activeDirection(typeAdapter6.read2(jsonReader));
                            break;
                        default:
                            if (!StubApp.getString2(613).equals(nextName)) {
                                if (!StubApp.getString2(660).equals(nextName)) {
                                    if (!StubApp.getString2(12953).equals(nextName)) {
                                        if (!StubApp.getString2(2878).equals(nextName)) {
                                            if (!StubApp.getString2(12365).equals(nextName)) {
                                                if (linkedHashMap == null) {
                                                    linkedHashMap = new LinkedHashMap();
                                                    builder.unrecognized(linkedHashMap);
                                                }
                                                a.t((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, nextName);
                                                break;
                                            } else {
                                                TypeAdapter<Boolean> typeAdapter7 = this.boolean__adapter;
                                                if (typeAdapter7 == null) {
                                                    typeAdapter7 = this.gson.getAdapter(Boolean.class);
                                                    this.boolean__adapter = typeAdapter7;
                                                }
                                                builder.active(typeAdapter7.read2(jsonReader));
                                                break;
                                            }
                                        } else {
                                            TypeAdapter<List<String>> typeAdapter8 = this.list__string_adapter;
                                            if (typeAdapter8 == null) {
                                                typeAdapter8 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                                                this.list__string_adapter = typeAdapter8;
                                            }
                                            builder.directions(typeAdapter8.read2(jsonReader));
                                            break;
                                        }
                                    } else {
                                        TypeAdapter<String> typeAdapter9 = this.string_adapter;
                                        if (typeAdapter9 == null) {
                                            typeAdapter9 = this.gson.getAdapter(String.class);
                                            this.string_adapter = typeAdapter9;
                                        }
                                        builder.subType(typeAdapter9.read2(jsonReader));
                                        break;
                                    }
                                } else {
                                    TypeAdapter<String> typeAdapter10 = this.string_adapter;
                                    if (typeAdapter10 == null) {
                                        typeAdapter10 = this.gson.getAdapter(String.class);
                                        this.string_adapter = typeAdapter10;
                                    }
                                    builder.type(typeAdapter10.read2(jsonReader));
                                    break;
                                }
                            } else {
                                TypeAdapter<String> typeAdapter11 = this.string_adapter;
                                if (typeAdapter11 == null) {
                                    typeAdapter11 = this.gson.getAdapter(String.class);
                                    this.string_adapter = typeAdapter11;
                                }
                                builder.text(typeAdapter11.read2(jsonReader));
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
        public void write(JsonWriter jsonWriter, BannerComponents bannerComponents) throws IOException {
            if (bannerComponents == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (bannerComponents.unrecognized() != null) {
                for (Map.Entry<String, b> entry : bannerComponents.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(613));
            if (bannerComponents.text() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.string_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, bannerComponents.text());
            }
            jsonWriter.name(StubApp.getString2(660));
            if (bannerComponents.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter2 = this.string_adapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, bannerComponents.type());
            }
            jsonWriter.name(StubApp.getString2(12953));
            if (bannerComponents.subType() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter3 = this.string_adapter;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, bannerComponents.subType());
            }
            jsonWriter.name(StubApp.getString2(12949));
            if (bannerComponents.abbreviation() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter4 = this.string_adapter;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, bannerComponents.abbreviation());
            }
            jsonWriter.name(StubApp.getString2(12950));
            if (bannerComponents.abbreviationPriority() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter5 = this.integer_adapter;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, bannerComponents.abbreviationPriority());
            }
            jsonWriter.name(StubApp.getString2(12948));
            if (bannerComponents.imageBaseUrl() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter6 = this.string_adapter;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, bannerComponents.imageBaseUrl());
            }
            jsonWriter.name(StubApp.getString2(12952));
            if (bannerComponents.mapboxShield() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<MapboxShield> typeAdapter7 = this.mapboxShield_adapter;
                if (typeAdapter7 == null) {
                    typeAdapter7 = this.gson.getAdapter(MapboxShield.class);
                    this.mapboxShield_adapter = typeAdapter7;
                }
                typeAdapter7.write(jsonWriter, bannerComponents.mapboxShield());
            }
            jsonWriter.name(StubApp.getString2(12951));
            if (bannerComponents.imageUrl() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter8 = this.string_adapter;
                if (typeAdapter8 == null) {
                    typeAdapter8 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter8;
                }
                typeAdapter8.write(jsonWriter, bannerComponents.imageUrl());
            }
            jsonWriter.name(StubApp.getString2(2878));
            if (bannerComponents.directions() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<String>> typeAdapter9 = this.list__string_adapter;
                if (typeAdapter9 == null) {
                    typeAdapter9 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.list__string_adapter = typeAdapter9;
                }
                typeAdapter9.write(jsonWriter, bannerComponents.directions());
            }
            jsonWriter.name(StubApp.getString2(12365));
            if (bannerComponents.active() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter10 = this.boolean__adapter;
                if (typeAdapter10 == null) {
                    typeAdapter10 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = typeAdapter10;
                }
                typeAdapter10.write(jsonWriter, bannerComponents.active());
            }
            jsonWriter.name(StubApp.getString2(12947));
            if (bannerComponents.activeDirection() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter11 = this.string_adapter;
                if (typeAdapter11 == null) {
                    typeAdapter11 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter11;
                }
                typeAdapter11.write(jsonWriter, bannerComponents.activeDirection());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_BannerComponents(final Map<String, b> map, final String str, final String str2, final String str3, final String str4, final Integer num, final String str5, final MapboxShield mapboxShield, final String str6, final List<String> list, final Boolean bool, final String str7) {
        new BannerComponents(map, str, str2, str3, str4, num, str5, mapboxShield, str6, list, bool, str7) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_BannerComponents
            private final String abbreviation;
            private final Integer abbreviationPriority;
            private final Boolean active;
            private final String activeDirection;
            private final List<String> directions;
            private final String imageBaseUrl;
            private final String imageUrl;
            private final MapboxShield mapboxShield;
            private final String subType;
            private final String text;
            private final String type;
            private final Map<String, b> unrecognized;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_BannerComponents$Builder */
            public static class Builder extends BannerComponents.Builder {
                private String abbreviation;
                private Integer abbreviationPriority;
                private Boolean active;
                private String activeDirection;
                private List<String> directions;
                private String imageBaseUrl;
                private String imageUrl;
                private MapboxShield mapboxShield;
                private String subType;
                private String text;
                private String type;
                private Map<String, b> unrecognized;

                @Override // com.mapbox.api.directions.v5.models.BannerComponents.Builder
                public BannerComponents.Builder abbreviation(String str) {
                    this.abbreviation = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.BannerComponents.Builder
                public BannerComponents.Builder abbreviationPriority(Integer num) {
                    this.abbreviationPriority = num;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.BannerComponents.Builder
                public BannerComponents.Builder active(Boolean bool) {
                    this.active = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.BannerComponents.Builder
                public BannerComponents.Builder activeDirection(String str) {
                    this.activeDirection = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.BannerComponents.Builder
                public BannerComponents build() {
                    String string2 = this.text == null ? StubApp.getString2(12690) : "";
                    if (this.type == null) {
                        string2 = AbstractC1482f.g(string2, StubApp.getString2(2256));
                    }
                    if (string2.isEmpty()) {
                        return new AutoValue_BannerComponents(this.unrecognized, this.text, this.type, this.subType, this.abbreviation, this.abbreviationPriority, this.imageBaseUrl, this.mapboxShield, this.imageUrl, this.directions, this.active, this.activeDirection);
                    }
                    throw new IllegalStateException(StubApp.getString2(555).concat(string2));
                }

                @Override // com.mapbox.api.directions.v5.models.BannerComponents.Builder
                public BannerComponents.Builder directions(List<String> list) {
                    this.directions = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.BannerComponents.Builder
                public BannerComponents.Builder imageBaseUrl(String str) {
                    this.imageBaseUrl = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.BannerComponents.Builder
                public BannerComponents.Builder imageUrl(String str) {
                    this.imageUrl = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.BannerComponents.Builder
                public BannerComponents.Builder mapboxShield(MapboxShield mapboxShield) {
                    this.mapboxShield = mapboxShield;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.BannerComponents.Builder
                public BannerComponents.Builder subType(String str) {
                    this.subType = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.BannerComponents.Builder
                public BannerComponents.Builder text(String str) {
                    if (str == null) {
                        throw new NullPointerException(StubApp.getString2(12691));
                    }
                    this.text = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.BannerComponents.Builder
                public BannerComponents.Builder type(String str) {
                    if (str == null) {
                        throw new NullPointerException(StubApp.getString2(2257));
                    }
                    this.type = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ BannerComponents.Builder unrecognized(Map map) {
                    return unrecognized((Map<String, b>) map);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public BannerComponents.Builder unrecognized(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }
            }

            {
                this.unrecognized = map;
                if (str == null) {
                    throw new NullPointerException(StubApp.getString2(12691));
                }
                this.text = str;
                if (str2 == null) {
                    throw new NullPointerException(StubApp.getString2(2257));
                }
                this.type = str2;
                this.subType = str3;
                this.abbreviation = str4;
                this.abbreviationPriority = num;
                this.imageBaseUrl = str5;
                this.mapboxShield = mapboxShield;
                this.imageUrl = str6;
                this.directions = list;
                this.active = bool;
                this.activeDirection = str7;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerComponents
            @SerializedName("abbr")
            public String abbreviation() {
                return this.abbreviation;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerComponents
            @SerializedName("abbr_priority")
            public Integer abbreviationPriority() {
                return this.abbreviationPriority;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerComponents
            public Boolean active() {
                return this.active;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerComponents
            @SerializedName("active_direction")
            public String activeDirection() {
                return this.activeDirection;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerComponents
            public List<String> directions() {
                return this.directions;
            }

            public boolean equals(Object obj) {
                String str8;
                String str9;
                Integer num2;
                String str10;
                MapboxShield mapboxShield2;
                String str11;
                List<String> list2;
                Boolean bool2;
                String str12;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof BannerComponents) {
                    BannerComponents bannerComponents = (BannerComponents) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(bannerComponents.unrecognized()) : bannerComponents.unrecognized() == null) {
                        if (this.text.equals(bannerComponents.text()) && this.type.equals(bannerComponents.type()) && ((str8 = this.subType) != null ? str8.equals(bannerComponents.subType()) : bannerComponents.subType() == null) && ((str9 = this.abbreviation) != null ? str9.equals(bannerComponents.abbreviation()) : bannerComponents.abbreviation() == null) && ((num2 = this.abbreviationPriority) != null ? num2.equals(bannerComponents.abbreviationPriority()) : bannerComponents.abbreviationPriority() == null) && ((str10 = this.imageBaseUrl) != null ? str10.equals(bannerComponents.imageBaseUrl()) : bannerComponents.imageBaseUrl() == null) && ((mapboxShield2 = this.mapboxShield) != null ? mapboxShield2.equals(bannerComponents.mapboxShield()) : bannerComponents.mapboxShield() == null) && ((str11 = this.imageUrl) != null ? str11.equals(bannerComponents.imageUrl()) : bannerComponents.imageUrl() == null) && ((list2 = this.directions) != null ? list2.equals(bannerComponents.directions()) : bannerComponents.directions() == null) && ((bool2 = this.active) != null ? bool2.equals(bannerComponents.active()) : bannerComponents.active() == null) && ((str12 = this.activeDirection) != null ? str12.equals(bannerComponents.activeDirection()) : bannerComponents.activeDirection() == null)) {
                            return true;
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                Map<String, b> map2 = this.unrecognized;
                int hashCode = ((((((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003) ^ this.text.hashCode()) * 1000003) ^ this.type.hashCode()) * 1000003;
                String str8 = this.subType;
                int hashCode2 = (hashCode ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.abbreviation;
                int hashCode3 = (hashCode2 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                Integer num2 = this.abbreviationPriority;
                int hashCode4 = (hashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                String str10 = this.imageBaseUrl;
                int hashCode5 = (hashCode4 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                MapboxShield mapboxShield2 = this.mapboxShield;
                int hashCode6 = (hashCode5 ^ (mapboxShield2 == null ? 0 : mapboxShield2.hashCode())) * 1000003;
                String str11 = this.imageUrl;
                int hashCode7 = (hashCode6 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                List<String> list2 = this.directions;
                int hashCode8 = (hashCode7 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                Boolean bool2 = this.active;
                int hashCode9 = (hashCode8 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str12 = this.activeDirection;
                return hashCode9 ^ (str12 != null ? str12.hashCode() : 0);
            }

            @Override // com.mapbox.api.directions.v5.models.BannerComponents
            @SerializedName("imageBaseURL")
            public String imageBaseUrl() {
                return this.imageBaseUrl;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerComponents
            @SerializedName("imageURL")
            public String imageUrl() {
                return this.imageUrl;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerComponents
            @SerializedName("mapbox_shield")
            public MapboxShield mapboxShield() {
                return this.mapboxShield;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerComponents
            public String subType() {
                return this.subType;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerComponents
            public String text() {
                return this.text;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(12692));
                sb2.append(this.unrecognized);
                sb2.append(StubApp.getString2(12693));
                sb2.append(this.text);
                sb2.append(StubApp.getString2(2148));
                sb2.append(this.type);
                sb2.append(StubApp.getString2(7301));
                sb2.append(this.subType);
                sb2.append(StubApp.getString2(12694));
                sb2.append(this.abbreviation);
                sb2.append(StubApp.getString2(12695));
                sb2.append(this.abbreviationPriority);
                sb2.append(StubApp.getString2(3564));
                sb2.append(this.imageBaseUrl);
                sb2.append(StubApp.getString2(12696));
                sb2.append(this.mapboxShield);
                sb2.append(StubApp.getString2(12697));
                sb2.append(this.imageUrl);
                sb2.append(StubApp.getString2(12698));
                sb2.append(this.directions);
                sb2.append(StubApp.getString2(12699));
                sb2.append(this.active);
                sb2.append(StubApp.getString2(12700));
                return AbstractC1482f.k(sb2, this.activeDirection, StubApp.getString2(265));
            }

            @Override // com.mapbox.api.directions.v5.models.BannerComponents
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
