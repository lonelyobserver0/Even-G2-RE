package com.mapbox.api.directions.v5.models;

import E1.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.BannerView;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_BannerView extends C$AutoValue_BannerView {

    public static final class GsonTypeAdapter extends TypeAdapter<BannerView> {
        private final Gson gson;
        private volatile TypeAdapter<List<BannerComponents>> list__bannerComponents_adapter;
        private volatile TypeAdapter<String> string_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(12963);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public BannerView read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            BannerView.Builder builder = BannerView.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.getClass();
                    if (StubApp.getString2(613).equals(nextName)) {
                        TypeAdapter<String> typeAdapter = this.string_adapter;
                        if (typeAdapter == null) {
                            typeAdapter = this.gson.getAdapter(String.class);
                            this.string_adapter = typeAdapter;
                        }
                        builder.text(typeAdapter.read2(jsonReader));
                    } else if (StubApp.getString2(12960).equals(nextName)) {
                        TypeAdapter<List<BannerComponents>> typeAdapter2 = this.list__bannerComponents_adapter;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.gson.getAdapter(TypeToken.getParameterized(List.class, BannerComponents.class));
                            this.list__bannerComponents_adapter = typeAdapter2;
                        }
                        builder.components(typeAdapter2.read2(jsonReader));
                    } else if (StubApp.getString2(660).equals(nextName)) {
                        TypeAdapter<String> typeAdapter3 = this.string_adapter;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.gson.getAdapter(String.class);
                            this.string_adapter = typeAdapter3;
                        }
                        builder.type(typeAdapter3.read2(jsonReader));
                    } else if (StubApp.getString2(12961).equals(nextName)) {
                        TypeAdapter<String> typeAdapter4 = this.string_adapter;
                        if (typeAdapter4 == null) {
                            typeAdapter4 = this.gson.getAdapter(String.class);
                            this.string_adapter = typeAdapter4;
                        }
                        builder.modifier(typeAdapter4.read2(jsonReader));
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
        public void write(JsonWriter jsonWriter, BannerView bannerView) throws IOException {
            if (bannerView == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (bannerView.unrecognized() != null) {
                for (Map.Entry<String, b> entry : bannerView.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(613));
            if (bannerView.text() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.string_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, bannerView.text());
            }
            jsonWriter.name(StubApp.getString2(12960));
            if (bannerView.components() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<BannerComponents>> typeAdapter2 = this.list__bannerComponents_adapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(TypeToken.getParameterized(List.class, BannerComponents.class));
                    this.list__bannerComponents_adapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, bannerView.components());
            }
            jsonWriter.name(StubApp.getString2(660));
            if (bannerView.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter3 = this.string_adapter;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, bannerView.type());
            }
            jsonWriter.name(StubApp.getString2(12961));
            if (bannerView.modifier() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter4 = this.string_adapter;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, bannerView.modifier());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_BannerView(final Map<String, b> map, final String str, final List<BannerComponents> list, final String str2, final String str3) {
        new BannerView(map, str, list, str2, str3) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_BannerView
            private final List<BannerComponents> components;
            private final String modifier;
            private final String text;
            private final String type;
            private final Map<String, b> unrecognized;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_BannerView$Builder */
            public static class Builder extends BannerView.Builder {
                private List<BannerComponents> components;
                private String modifier;
                private String text;
                private String type;
                private Map<String, b> unrecognized;

                @Override // com.mapbox.api.directions.v5.models.BannerView.Builder
                public BannerView build() {
                    String string2 = this.text == null ? StubApp.getString2(12690) : "";
                    if (string2.isEmpty()) {
                        return new AutoValue_BannerView(this.unrecognized, this.text, this.components, this.type, this.modifier);
                    }
                    throw new IllegalStateException(StubApp.getString2(555).concat(string2));
                }

                @Override // com.mapbox.api.directions.v5.models.BannerView.Builder
                public BannerView.Builder components(List<BannerComponents> list) {
                    this.components = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.BannerView.Builder
                public BannerView.Builder modifier(String str) {
                    this.modifier = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.BannerView.Builder
                public BannerView.Builder text(String str) {
                    if (str == null) {
                        throw new NullPointerException(StubApp.getString2(12691));
                    }
                    this.text = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.BannerView.Builder
                public BannerView.Builder type(String str) {
                    this.type = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ BannerView.Builder unrecognized(Map map) {
                    return unrecognized((Map<String, b>) map);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public BannerView.Builder unrecognized(Map<String, b> map) {
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
            }

            @Override // com.mapbox.api.directions.v5.models.BannerView
            public List<BannerComponents> components() {
                return this.components;
            }

            public boolean equals(Object obj) {
                List<BannerComponents> list2;
                String str4;
                String str5;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof BannerView) {
                    BannerView bannerView = (BannerView) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(bannerView.unrecognized()) : bannerView.unrecognized() == null) {
                        if (this.text.equals(bannerView.text()) && ((list2 = this.components) != null ? list2.equals(bannerView.components()) : bannerView.components() == null) && ((str4 = this.type) != null ? str4.equals(bannerView.type()) : bannerView.type() == null) && ((str5 = this.modifier) != null ? str5.equals(bannerView.modifier()) : bannerView.modifier() == null)) {
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
                String str4 = this.type;
                int hashCode3 = (hashCode2 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.modifier;
                return hashCode3 ^ (str5 != null ? str5.hashCode() : 0);
            }

            @Override // com.mapbox.api.directions.v5.models.BannerView
            public String modifier() {
                return this.modifier;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerView
            public String text() {
                return this.text;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(12712));
                sb2.append(this.unrecognized);
                sb2.append(StubApp.getString2(12693));
                sb2.append(this.text);
                sb2.append(StubApp.getString2(12710));
                sb2.append(this.components);
                sb2.append(StubApp.getString2(2148));
                sb2.append(this.type);
                sb2.append(StubApp.getString2(1526));
                return AbstractC1482f.k(sb2, this.modifier, StubApp.getString2(265));
            }

            @Override // com.mapbox.api.directions.v5.models.BannerView
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
