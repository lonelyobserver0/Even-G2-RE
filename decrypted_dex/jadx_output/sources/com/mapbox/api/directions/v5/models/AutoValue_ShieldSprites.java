package com.mapbox.api.directions.v5.models;

import E1.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.ShieldSprites;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_ShieldSprites extends C$AutoValue_ShieldSprites {

    public static final class GsonTypeAdapter extends TypeAdapter<ShieldSprites> {
        private final Gson gson;
        private volatile TypeAdapter<List<ShieldSprite>> list__shieldSprite_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(13098);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public ShieldSprites read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            ShieldSprites.Builder builder = ShieldSprites.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.getClass();
                    if (StubApp.getString2(13097).equals(nextName)) {
                        TypeAdapter<List<ShieldSprite>> typeAdapter = this.list__shieldSprite_adapter;
                        if (typeAdapter == null) {
                            typeAdapter = this.gson.getAdapter(TypeToken.getParameterized(List.class, ShieldSprite.class));
                            this.list__shieldSprite_adapter = typeAdapter;
                        }
                        builder.sprites(typeAdapter.read2(jsonReader));
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
        public void write(JsonWriter jsonWriter, ShieldSprites shieldSprites) throws IOException {
            if (shieldSprites == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (shieldSprites.unrecognized() != null) {
                for (Map.Entry<String, b> entry : shieldSprites.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(13097));
            if (shieldSprites.sprites() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<ShieldSprite>> typeAdapter = this.list__shieldSprite_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(TypeToken.getParameterized(List.class, ShieldSprite.class));
                    this.list__shieldSprite_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, shieldSprites.sprites());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_ShieldSprites(final Map<String, b> map, final List<ShieldSprite> list) {
        new ShieldSprites(map, list) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_ShieldSprites
            private final List<ShieldSprite> sprites;
            private final Map<String, b> unrecognized;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_ShieldSprites$Builder */
            public static class Builder extends ShieldSprites.Builder {
                private List<ShieldSprite> sprites;
                private Map<String, b> unrecognized;

                @Override // com.mapbox.api.directions.v5.models.ShieldSprites.Builder
                public ShieldSprites build() {
                    String string2 = this.sprites == null ? StubApp.getString2(12897) : "";
                    if (string2.isEmpty()) {
                        return new AutoValue_ShieldSprites(this.unrecognized, this.sprites);
                    }
                    throw new IllegalStateException(StubApp.getString2(555).concat(string2));
                }

                @Override // com.mapbox.api.directions.v5.models.ShieldSprites.Builder
                public ShieldSprites.Builder sprites(List<ShieldSprite> list) {
                    if (list == null) {
                        throw new NullPointerException(StubApp.getString2(12898));
                    }
                    this.sprites = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ ShieldSprites.Builder unrecognized(Map map) {
                    return unrecognized2((Map<String, b>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                /* renamed from: unrecognized, reason: avoid collision after fix types in other method */
                public ShieldSprites.Builder unrecognized2(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }
            }

            {
                this.unrecognized = map;
                if (list == null) {
                    throw new NullPointerException(StubApp.getString2(12898));
                }
                this.sprites = list;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof ShieldSprites) {
                    ShieldSprites shieldSprites = (ShieldSprites) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(shieldSprites.unrecognized()) : shieldSprites.unrecognized() == null) {
                        if (this.sprites.equals(shieldSprites.sprites())) {
                            return true;
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                Map<String, b> map2 = this.unrecognized;
                return (((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003) ^ this.sprites.hashCode();
            }

            @Override // com.mapbox.api.directions.v5.models.ShieldSprites
            public List<ShieldSprite> sprites() {
                return this.sprites;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(12899));
                sb2.append(this.unrecognized);
                sb2.append(StubApp.getString2(12900));
                return a.l(StubApp.getString2(265), sb2, this.sprites);
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, b> unrecognized() {
                return this.unrecognized;
            }
        };
    }
}
