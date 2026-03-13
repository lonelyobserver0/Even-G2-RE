package com.mapbox.api.directions.v5.models;

import E1.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.ShieldSvg;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_ShieldSvg extends C$AutoValue_ShieldSvg {

    public static final class GsonTypeAdapter extends TypeAdapter<ShieldSvg> {
        private final Gson gson;
        private volatile TypeAdapter<String> string_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(13100);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public ShieldSvg read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            ShieldSvg.Builder builder = ShieldSvg.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.getClass();
                    if (StubApp.getString2(13099).equals(nextName)) {
                        TypeAdapter<String> typeAdapter = this.string_adapter;
                        if (typeAdapter == null) {
                            typeAdapter = this.gson.getAdapter(String.class);
                            this.string_adapter = typeAdapter;
                        }
                        builder.svg(typeAdapter.read2(jsonReader));
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
        public void write(JsonWriter jsonWriter, ShieldSvg shieldSvg) throws IOException {
            if (shieldSvg == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (shieldSvg.unrecognized() != null) {
                for (Map.Entry<String, b> entry : shieldSvg.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(13099));
            if (shieldSvg.svg() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.string_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, shieldSvg.svg());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_ShieldSvg(final Map<String, b> map, final String str) {
        new ShieldSvg(map, str) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_ShieldSvg
            private final String svg;
            private final Map<String, b> unrecognized;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_ShieldSvg$Builder */
            public static class Builder extends ShieldSvg.Builder {
                private String svg;
                private Map<String, b> unrecognized;

                @Override // com.mapbox.api.directions.v5.models.ShieldSvg.Builder
                public ShieldSvg build() {
                    String string2 = this.svg == null ? StubApp.getString2(12901) : "";
                    if (string2.isEmpty()) {
                        return new AutoValue_ShieldSvg(this.unrecognized, this.svg);
                    }
                    throw new IllegalStateException(StubApp.getString2(555).concat(string2));
                }

                @Override // com.mapbox.api.directions.v5.models.ShieldSvg.Builder
                public ShieldSvg.Builder svg(String str) {
                    if (str == null) {
                        throw new NullPointerException(StubApp.getString2(12902));
                    }
                    this.svg = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ ShieldSvg.Builder unrecognized(Map map) {
                    return unrecognized2((Map<String, b>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                /* renamed from: unrecognized, reason: avoid collision after fix types in other method */
                public ShieldSvg.Builder unrecognized2(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }
            }

            {
                this.unrecognized = map;
                if (str == null) {
                    throw new NullPointerException(StubApp.getString2(12902));
                }
                this.svg = str;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof ShieldSvg) {
                    ShieldSvg shieldSvg = (ShieldSvg) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(shieldSvg.unrecognized()) : shieldSvg.unrecognized() == null) {
                        if (this.svg.equals(shieldSvg.svg())) {
                            return true;
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                Map<String, b> map2 = this.unrecognized;
                return (((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003) ^ this.svg.hashCode();
            }

            @Override // com.mapbox.api.directions.v5.models.ShieldSvg
            public String svg() {
                return this.svg;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(12903));
                sb2.append(this.unrecognized);
                sb2.append(StubApp.getString2(12904));
                return AbstractC1482f.k(sb2, this.svg, StubApp.getString2(265));
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, b> unrecognized() {
                return this.unrecognized;
            }
        };
    }
}
