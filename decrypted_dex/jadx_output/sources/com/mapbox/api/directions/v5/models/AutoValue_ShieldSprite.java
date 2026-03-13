package com.mapbox.api.directions.v5.models;

import E1.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.ShieldSprite;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_ShieldSprite extends C$AutoValue_ShieldSprite {

    public static final class GsonTypeAdapter extends TypeAdapter<ShieldSprite> {
        private final Gson gson;
        private volatile TypeAdapter<ShieldSpriteAttribute> shieldSpriteAttribute_adapter;
        private volatile TypeAdapter<String> string_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(13093);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public ShieldSprite read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            ShieldSprite.Builder builder = ShieldSprite.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.getClass();
                    if (StubApp.getString2(13091).equals(nextName)) {
                        TypeAdapter<String> typeAdapter = this.string_adapter;
                        if (typeAdapter == null) {
                            typeAdapter = this.gson.getAdapter(String.class);
                            this.string_adapter = typeAdapter;
                        }
                        builder.spriteName(typeAdapter.read2(jsonReader));
                    } else if (StubApp.getString2(13092).equals(nextName)) {
                        TypeAdapter<ShieldSpriteAttribute> typeAdapter2 = this.shieldSpriteAttribute_adapter;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.gson.getAdapter(ShieldSpriteAttribute.class);
                            this.shieldSpriteAttribute_adapter = typeAdapter2;
                        }
                        builder.spriteAttributes(typeAdapter2.read2(jsonReader));
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
        public void write(JsonWriter jsonWriter, ShieldSprite shieldSprite) throws IOException {
            if (shieldSprite == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (shieldSprite.unrecognized() != null) {
                for (Map.Entry<String, b> entry : shieldSprite.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(13091));
            if (shieldSprite.spriteName() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.string_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, shieldSprite.spriteName());
            }
            jsonWriter.name(StubApp.getString2(13092));
            if (shieldSprite.spriteAttributes() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<ShieldSpriteAttribute> typeAdapter2 = this.shieldSpriteAttribute_adapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(ShieldSpriteAttribute.class);
                    this.shieldSpriteAttribute_adapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, shieldSprite.spriteAttributes());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_ShieldSprite(final Map<String, b> map, final String str, final ShieldSpriteAttribute shieldSpriteAttribute) {
        new ShieldSprite(map, str, shieldSpriteAttribute) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_ShieldSprite
            private final ShieldSpriteAttribute spriteAttributes;
            private final String spriteName;
            private final Map<String, b> unrecognized;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_ShieldSprite$Builder */
            public static class Builder extends ShieldSprite.Builder {
                private ShieldSpriteAttribute spriteAttributes;
                private String spriteName;
                private Map<String, b> unrecognized;

                @Override // com.mapbox.api.directions.v5.models.ShieldSprite.Builder
                public ShieldSprite build() {
                    String string2 = this.spriteName == null ? StubApp.getString2(12872) : "";
                    if (this.spriteAttributes == null) {
                        string2 = AbstractC1482f.g(string2, StubApp.getString2(12873));
                    }
                    if (string2.isEmpty()) {
                        return new AutoValue_ShieldSprite(this.unrecognized, this.spriteName, this.spriteAttributes);
                    }
                    throw new IllegalStateException(StubApp.getString2(555).concat(string2));
                }

                @Override // com.mapbox.api.directions.v5.models.ShieldSprite.Builder
                public ShieldSprite.Builder spriteAttributes(ShieldSpriteAttribute shieldSpriteAttribute) {
                    if (shieldSpriteAttribute == null) {
                        throw new NullPointerException(StubApp.getString2(12874));
                    }
                    this.spriteAttributes = shieldSpriteAttribute;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.ShieldSprite.Builder
                public ShieldSprite.Builder spriteName(String str) {
                    if (str == null) {
                        throw new NullPointerException(StubApp.getString2(12875));
                    }
                    this.spriteName = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ ShieldSprite.Builder unrecognized(Map map) {
                    return unrecognized2((Map<String, b>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                /* renamed from: unrecognized, reason: avoid collision after fix types in other method */
                public ShieldSprite.Builder unrecognized2(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }
            }

            {
                this.unrecognized = map;
                if (str == null) {
                    throw new NullPointerException(StubApp.getString2(12875));
                }
                this.spriteName = str;
                if (shieldSpriteAttribute == null) {
                    throw new NullPointerException(StubApp.getString2(12874));
                }
                this.spriteAttributes = shieldSpriteAttribute;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof ShieldSprite) {
                    ShieldSprite shieldSprite = (ShieldSprite) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(shieldSprite.unrecognized()) : shieldSprite.unrecognized() == null) {
                        if (this.spriteName.equals(shieldSprite.spriteName()) && this.spriteAttributes.equals(shieldSprite.spriteAttributes())) {
                            return true;
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                Map<String, b> map2 = this.unrecognized;
                return (((((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003) ^ this.spriteName.hashCode()) * 1000003) ^ this.spriteAttributes.hashCode();
            }

            @Override // com.mapbox.api.directions.v5.models.ShieldSprite
            public ShieldSpriteAttribute spriteAttributes() {
                return this.spriteAttributes;
            }

            @Override // com.mapbox.api.directions.v5.models.ShieldSprite
            public String spriteName() {
                return this.spriteName;
            }

            public String toString() {
                return StubApp.getString2(12876) + this.unrecognized + StubApp.getString2(12877) + this.spriteName + StubApp.getString2(12878) + this.spriteAttributes + StubApp.getString2(265);
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, b> unrecognized() {
                return this.unrecognized;
            }
        };
    }
}
