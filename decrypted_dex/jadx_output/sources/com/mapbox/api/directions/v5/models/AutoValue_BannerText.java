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
import com.mapbox.api.directions.v5.models.BannerText;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_BannerText extends C$AutoValue_BannerText {

    public static final class GsonTypeAdapter extends TypeAdapter<BannerText> {
        private volatile TypeAdapter<Double> double__adapter;
        private final Gson gson;
        private volatile TypeAdapter<List<BannerComponents>> list__bannerComponents_adapter;
        private volatile TypeAdapter<String> string_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(12962);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public BannerText read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            BannerText.Builder builder = BannerText.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.getClass();
                    if (nextName.equals(StubApp.getString2(12959))) {
                        TypeAdapter<String> typeAdapter = this.string_adapter;
                        if (typeAdapter == null) {
                            typeAdapter = this.gson.getAdapter(String.class);
                            this.string_adapter = typeAdapter;
                        }
                        builder.drivingSide(typeAdapter.read2(jsonReader));
                    } else if (StubApp.getString2(613).equals(nextName)) {
                        TypeAdapter<String> typeAdapter2 = this.string_adapter;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.gson.getAdapter(String.class);
                            this.string_adapter = typeAdapter2;
                        }
                        builder.text(typeAdapter2.read2(jsonReader));
                    } else if (StubApp.getString2(12960).equals(nextName)) {
                        TypeAdapter<List<BannerComponents>> typeAdapter3 = this.list__bannerComponents_adapter;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, BannerComponents.class));
                            this.list__bannerComponents_adapter = typeAdapter3;
                        }
                        builder.components(typeAdapter3.read2(jsonReader));
                    } else if (StubApp.getString2(660).equals(nextName)) {
                        TypeAdapter<String> typeAdapter4 = this.string_adapter;
                        if (typeAdapter4 == null) {
                            typeAdapter4 = this.gson.getAdapter(String.class);
                            this.string_adapter = typeAdapter4;
                        }
                        builder.type(typeAdapter4.read2(jsonReader));
                    } else if (StubApp.getString2(12961).equals(nextName)) {
                        TypeAdapter<String> typeAdapter5 = this.string_adapter;
                        if (typeAdapter5 == null) {
                            typeAdapter5 = this.gson.getAdapter(String.class);
                            this.string_adapter = typeAdapter5;
                        }
                        builder.modifier(typeAdapter5.read2(jsonReader));
                    } else if (StubApp.getString2(2703).equals(nextName)) {
                        TypeAdapter<Double> typeAdapter6 = this.double__adapter;
                        if (typeAdapter6 == null) {
                            typeAdapter6 = this.gson.getAdapter(Double.class);
                            this.double__adapter = typeAdapter6;
                        }
                        builder.degrees(typeAdapter6.read2(jsonReader));
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
        public void write(JsonWriter jsonWriter, BannerText bannerText) throws IOException {
            if (bannerText == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (bannerText.unrecognized() != null) {
                for (Map.Entry<String, b> entry : bannerText.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(613));
            if (bannerText.text() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.string_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, bannerText.text());
            }
            jsonWriter.name(StubApp.getString2(12960));
            if (bannerText.components() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<BannerComponents>> typeAdapter2 = this.list__bannerComponents_adapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(TypeToken.getParameterized(List.class, BannerComponents.class));
                    this.list__bannerComponents_adapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, bannerText.components());
            }
            jsonWriter.name(StubApp.getString2(660));
            if (bannerText.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter3 = this.string_adapter;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, bannerText.type());
            }
            jsonWriter.name(StubApp.getString2(12961));
            if (bannerText.modifier() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter4 = this.string_adapter;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, bannerText.modifier());
            }
            jsonWriter.name(StubApp.getString2(2703));
            if (bannerText.degrees() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter5 = this.double__adapter;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.gson.getAdapter(Double.class);
                    this.double__adapter = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, bannerText.degrees());
            }
            jsonWriter.name(StubApp.getString2(12959));
            if (bannerText.drivingSide() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter6 = this.string_adapter;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, bannerText.drivingSide());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_BannerText(final Map<String, b> map, final String str, final List<BannerComponents> list, final String str2, final String str3, final Double d8, final String str4) {
        new BannerText(map, str, list, str2, str3, d8, str4) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_BannerText
            private final List<BannerComponents> components;
            private final Double degrees;
            private final String drivingSide;
            private final String modifier;
            private final String text;
            private final String type;
            private final Map<String, b> unrecognized;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_BannerText$Builder */
            public static class Builder extends BannerText.Builder {
                private List<BannerComponents> components;
                private Double degrees;
                private String drivingSide;
                private String modifier;
                private String text;
                private String type;
                private Map<String, b> unrecognized;

                @Override // com.mapbox.api.directions.v5.models.BannerText.Builder
                public BannerText build() {
                    String string2 = this.text == null ? StubApp.getString2(12690) : "";
                    if (string2.isEmpty()) {
                        return new AutoValue_BannerText(this.unrecognized, this.text, this.components, this.type, this.modifier, this.degrees, this.drivingSide);
                    }
                    throw new IllegalStateException(StubApp.getString2(555).concat(string2));
                }

                @Override // com.mapbox.api.directions.v5.models.BannerText.Builder
                public BannerText.Builder components(List<BannerComponents> list) {
                    this.components = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.BannerText.Builder
                public BannerText.Builder degrees(Double d8) {
                    this.degrees = d8;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.BannerText.Builder
                public BannerText.Builder drivingSide(String str) {
                    this.drivingSide = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.BannerText.Builder
                public BannerText.Builder modifier(String str) {
                    this.modifier = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.BannerText.Builder
                public BannerText.Builder text(String str) {
                    if (str == null) {
                        throw new NullPointerException(StubApp.getString2(12691));
                    }
                    this.text = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.BannerText.Builder
                public BannerText.Builder type(String str) {
                    this.type = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ BannerText.Builder unrecognized(Map map) {
                    return unrecognized((Map<String, b>) map);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public BannerText.Builder unrecognized(Map<String, b> map) {
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
                this.components = list;
                this.type = str2;
                this.modifier = str3;
                this.degrees = d8;
                this.drivingSide = str4;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerText
            public List<BannerComponents> components() {
                return this.components;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerText
            public Double degrees() {
                return this.degrees;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerText
            @SerializedName("driving_side")
            public String drivingSide() {
                return this.drivingSide;
            }

            public boolean equals(Object obj) {
                List<BannerComponents> list2;
                String str5;
                String str6;
                Double d10;
                String str7;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof BannerText) {
                    BannerText bannerText = (BannerText) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(bannerText.unrecognized()) : bannerText.unrecognized() == null) {
                        if (this.text.equals(bannerText.text()) && ((list2 = this.components) != null ? list2.equals(bannerText.components()) : bannerText.components() == null) && ((str5 = this.type) != null ? str5.equals(bannerText.type()) : bannerText.type() == null) && ((str6 = this.modifier) != null ? str6.equals(bannerText.modifier()) : bannerText.modifier() == null) && ((d10 = this.degrees) != null ? d10.equals(bannerText.degrees()) : bannerText.degrees() == null) && ((str7 = this.drivingSide) != null ? str7.equals(bannerText.drivingSide()) : bannerText.drivingSide() == null)) {
                            return true;
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                Map<String, b> map2 = this.unrecognized;
                int hashCode = ((((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003) ^ this.text.hashCode()) * 1000003;
                List<BannerComponents> list2 = this.components;
                int hashCode2 = (hashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                String str5 = this.type;
                int hashCode3 = (hashCode2 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.modifier;
                int hashCode4 = (hashCode3 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                Double d10 = this.degrees;
                int hashCode5 = (hashCode4 ^ (d10 == null ? 0 : d10.hashCode())) * 1000003;
                String str7 = this.drivingSide;
                return hashCode5 ^ (str7 != null ? str7.hashCode() : 0);
            }

            @Override // com.mapbox.api.directions.v5.models.BannerText
            public String modifier() {
                return this.modifier;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerText
            public String text() {
                return this.text;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(12709));
                sb2.append(this.unrecognized);
                sb2.append(StubApp.getString2(12693));
                sb2.append(this.text);
                sb2.append(StubApp.getString2(12710));
                sb2.append(this.components);
                sb2.append(StubApp.getString2(2148));
                sb2.append(this.type);
                sb2.append(StubApp.getString2(1526));
                sb2.append(this.modifier);
                sb2.append(StubApp.getString2(12711));
                sb2.append(this.degrees);
                sb2.append(StubApp.getString2(1522));
                return AbstractC1482f.k(sb2, this.drivingSide, StubApp.getString2(265));
            }

            @Override // com.mapbox.api.directions.v5.models.BannerText
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
