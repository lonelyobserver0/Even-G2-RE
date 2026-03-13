package com.mapbox.api.directions.v5.models;

import E1.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.ShieldSpriteAttribute;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_ShieldSpriteAttribute extends C$AutoValue_ShieldSpriteAttribute {

    public static final class GsonTypeAdapter extends TypeAdapter<ShieldSpriteAttribute> {
        private volatile TypeAdapter<Boolean> boolean__adapter;
        private final Gson gson;
        private volatile TypeAdapter<Integer> integer_adapter;
        private volatile TypeAdapter<List<Double>> list__double_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(13096);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public ShieldSpriteAttribute read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            ShieldSpriteAttribute.Builder builder = ShieldSpriteAttribute.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.getClass();
                    if (StubApp.getString2(1650).equals(nextName)) {
                        TypeAdapter<Integer> typeAdapter = this.integer_adapter;
                        if (typeAdapter == null) {
                            typeAdapter = this.gson.getAdapter(Integer.class);
                            this.integer_adapter = typeAdapter;
                        }
                        builder.width(typeAdapter.read2(jsonReader));
                    } else if (StubApp.getString2(1651).equals(nextName)) {
                        TypeAdapter<Integer> typeAdapter2 = this.integer_adapter;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.gson.getAdapter(Integer.class);
                            this.integer_adapter = typeAdapter2;
                        }
                        builder.height(typeAdapter2.read2(jsonReader));
                    } else if (StubApp.getString2(925).equals(nextName)) {
                        TypeAdapter<Integer> typeAdapter3 = this.integer_adapter;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.gson.getAdapter(Integer.class);
                            this.integer_adapter = typeAdapter3;
                        }
                        builder.x(typeAdapter3.read2(jsonReader));
                    } else if (StubApp.getString2(4935).equals(nextName)) {
                        TypeAdapter<Integer> typeAdapter4 = this.integer_adapter;
                        if (typeAdapter4 == null) {
                            typeAdapter4 = this.gson.getAdapter(Integer.class);
                            this.integer_adapter = typeAdapter4;
                        }
                        builder.y(typeAdapter4.read2(jsonReader));
                    } else if (StubApp.getString2(13094).equals(nextName)) {
                        TypeAdapter<Integer> typeAdapter5 = this.integer_adapter;
                        if (typeAdapter5 == null) {
                            typeAdapter5 = this.gson.getAdapter(Integer.class);
                            this.integer_adapter = typeAdapter5;
                        }
                        builder.pixelRatio(typeAdapter5.read2(jsonReader));
                    } else if (StubApp.getString2(13095).equals(nextName)) {
                        TypeAdapter<List<Double>> typeAdapter6 = this.list__double_adapter;
                        if (typeAdapter6 == null) {
                            typeAdapter6 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Double.class));
                            this.list__double_adapter = typeAdapter6;
                        }
                        builder.placeholder(typeAdapter6.read2(jsonReader));
                    } else if (StubApp.getString2(1342).equals(nextName)) {
                        TypeAdapter<Boolean> typeAdapter7 = this.boolean__adapter;
                        if (typeAdapter7 == null) {
                            typeAdapter7 = this.gson.getAdapter(Boolean.class);
                            this.boolean__adapter = typeAdapter7;
                        }
                        builder.visible(typeAdapter7.read2(jsonReader));
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
        public void write(JsonWriter jsonWriter, ShieldSpriteAttribute shieldSpriteAttribute) throws IOException {
            if (shieldSpriteAttribute == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (shieldSpriteAttribute.unrecognized() != null) {
                for (Map.Entry<String, b> entry : shieldSpriteAttribute.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(1650));
            if (shieldSpriteAttribute.width() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter = this.integer_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, shieldSpriteAttribute.width());
            }
            jsonWriter.name(StubApp.getString2(1651));
            if (shieldSpriteAttribute.height() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter2 = this.integer_adapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, shieldSpriteAttribute.height());
            }
            jsonWriter.name(StubApp.getString2(925));
            if (shieldSpriteAttribute.x() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter3 = this.integer_adapter;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, shieldSpriteAttribute.x());
            }
            jsonWriter.name(StubApp.getString2(4935));
            if (shieldSpriteAttribute.y() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter4 = this.integer_adapter;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, shieldSpriteAttribute.y());
            }
            jsonWriter.name(StubApp.getString2(13094));
            if (shieldSpriteAttribute.pixelRatio() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter5 = this.integer_adapter;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, shieldSpriteAttribute.pixelRatio());
            }
            jsonWriter.name(StubApp.getString2(13095));
            if (shieldSpriteAttribute.placeholder() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Double>> typeAdapter6 = this.list__double_adapter;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Double.class));
                    this.list__double_adapter = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, shieldSpriteAttribute.placeholder());
            }
            jsonWriter.name(StubApp.getString2(1342));
            if (shieldSpriteAttribute.visible() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter7 = this.boolean__adapter;
                if (typeAdapter7 == null) {
                    typeAdapter7 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = typeAdapter7;
                }
                typeAdapter7.write(jsonWriter, shieldSpriteAttribute.visible());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_ShieldSpriteAttribute(final Map<String, b> map, final Integer num, final Integer num2, final Integer num3, final Integer num4, final Integer num5, final List<Double> list, final Boolean bool) {
        new ShieldSpriteAttribute(map, num, num2, num3, num4, num5, list, bool) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_ShieldSpriteAttribute
            private final Integer height;
            private final Integer pixelRatio;
            private final List<Double> placeholder;
            private final Map<String, b> unrecognized;
            private final Boolean visible;
            private final Integer width;

            /* renamed from: x, reason: collision with root package name */
            private final Integer f12276x;

            /* renamed from: y, reason: collision with root package name */
            private final Integer f12277y;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_ShieldSpriteAttribute$Builder */
            public static class Builder extends ShieldSpriteAttribute.Builder {
                private Integer height;
                private Integer pixelRatio;
                private List<Double> placeholder;
                private Map<String, b> unrecognized;
                private Boolean visible;
                private Integer width;

                /* renamed from: x, reason: collision with root package name */
                private Integer f12278x;

                /* renamed from: y, reason: collision with root package name */
                private Integer f12279y;

                @Override // com.mapbox.api.directions.v5.models.ShieldSpriteAttribute.Builder
                public ShieldSpriteAttribute build() {
                    String string2 = this.width == null ? StubApp.getString2(12879) : "";
                    if (this.height == null) {
                        string2 = AbstractC1482f.g(string2, StubApp.getString2(12880));
                    }
                    if (this.f12278x == null) {
                        string2 = AbstractC1482f.g(string2, StubApp.getString2(12881));
                    }
                    if (this.f12279y == null) {
                        string2 = AbstractC1482f.g(string2, StubApp.getString2(12882));
                    }
                    if (this.pixelRatio == null) {
                        string2 = AbstractC1482f.g(string2, StubApp.getString2(12883));
                    }
                    if (this.visible == null) {
                        string2 = AbstractC1482f.g(string2, StubApp.getString2(12884));
                    }
                    if (string2.isEmpty()) {
                        return new AutoValue_ShieldSpriteAttribute(this.unrecognized, this.width, this.height, this.f12278x, this.f12279y, this.pixelRatio, this.placeholder, this.visible);
                    }
                    throw new IllegalStateException(StubApp.getString2(555).concat(string2));
                }

                @Override // com.mapbox.api.directions.v5.models.ShieldSpriteAttribute.Builder
                public ShieldSpriteAttribute.Builder height(Integer num) {
                    if (num == null) {
                        throw new NullPointerException(StubApp.getString2(12885));
                    }
                    this.height = num;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.ShieldSpriteAttribute.Builder
                public ShieldSpriteAttribute.Builder pixelRatio(Integer num) {
                    if (num == null) {
                        throw new NullPointerException(StubApp.getString2(12886));
                    }
                    this.pixelRatio = num;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.ShieldSpriteAttribute.Builder
                public ShieldSpriteAttribute.Builder placeholder(List<Double> list) {
                    this.placeholder = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ ShieldSpriteAttribute.Builder unrecognized(Map map) {
                    return unrecognized2((Map<String, b>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.ShieldSpriteAttribute.Builder
                public ShieldSpriteAttribute.Builder visible(Boolean bool) {
                    if (bool == null) {
                        throw new NullPointerException(StubApp.getString2(12887));
                    }
                    this.visible = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.ShieldSpriteAttribute.Builder
                public ShieldSpriteAttribute.Builder width(Integer num) {
                    if (num == null) {
                        throw new NullPointerException(StubApp.getString2(12888));
                    }
                    this.width = num;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.ShieldSpriteAttribute.Builder
                public ShieldSpriteAttribute.Builder x(Integer num) {
                    if (num == null) {
                        throw new NullPointerException(StubApp.getString2(12889));
                    }
                    this.f12278x = num;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.ShieldSpriteAttribute.Builder
                public ShieldSpriteAttribute.Builder y(Integer num) {
                    if (num == null) {
                        throw new NullPointerException(StubApp.getString2(12890));
                    }
                    this.f12279y = num;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                /* renamed from: unrecognized, reason: avoid collision after fix types in other method */
                public ShieldSpriteAttribute.Builder unrecognized2(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }
            }

            {
                this.unrecognized = map;
                if (num == null) {
                    throw new NullPointerException(StubApp.getString2(12888));
                }
                this.width = num;
                if (num2 == null) {
                    throw new NullPointerException(StubApp.getString2(12885));
                }
                this.height = num2;
                if (num3 == null) {
                    throw new NullPointerException(StubApp.getString2(12889));
                }
                this.f12276x = num3;
                if (num4 == null) {
                    throw new NullPointerException(StubApp.getString2(12890));
                }
                this.f12277y = num4;
                if (num5 == null) {
                    throw new NullPointerException(StubApp.getString2(12886));
                }
                this.pixelRatio = num5;
                this.placeholder = list;
                if (bool == null) {
                    throw new NullPointerException(StubApp.getString2(12887));
                }
                this.visible = bool;
            }

            public boolean equals(Object obj) {
                List<Double> list2;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof ShieldSpriteAttribute) {
                    ShieldSpriteAttribute shieldSpriteAttribute = (ShieldSpriteAttribute) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(shieldSpriteAttribute.unrecognized()) : shieldSpriteAttribute.unrecognized() == null) {
                        if (this.width.equals(shieldSpriteAttribute.width()) && this.height.equals(shieldSpriteAttribute.height()) && this.f12276x.equals(shieldSpriteAttribute.x()) && this.f12277y.equals(shieldSpriteAttribute.y()) && this.pixelRatio.equals(shieldSpriteAttribute.pixelRatio()) && ((list2 = this.placeholder) != null ? list2.equals(shieldSpriteAttribute.placeholder()) : shieldSpriteAttribute.placeholder() == null) && this.visible.equals(shieldSpriteAttribute.visible())) {
                            return true;
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                Map<String, b> map2 = this.unrecognized;
                int hashCode = ((((((((((((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003) ^ this.width.hashCode()) * 1000003) ^ this.height.hashCode()) * 1000003) ^ this.f12276x.hashCode()) * 1000003) ^ this.f12277y.hashCode()) * 1000003) ^ this.pixelRatio.hashCode()) * 1000003;
                List<Double> list2 = this.placeholder;
                return ((hashCode ^ (list2 != null ? list2.hashCode() : 0)) * 1000003) ^ this.visible.hashCode();
            }

            @Override // com.mapbox.api.directions.v5.models.ShieldSpriteAttribute
            public Integer height() {
                return this.height;
            }

            @Override // com.mapbox.api.directions.v5.models.ShieldSpriteAttribute
            public Integer pixelRatio() {
                return this.pixelRatio;
            }

            @Override // com.mapbox.api.directions.v5.models.ShieldSpriteAttribute
            public List<Double> placeholder() {
                return this.placeholder;
            }

            public String toString() {
                return StubApp.getString2(12891) + this.unrecognized + StubApp.getString2(12892) + this.width + StubApp.getString2(12893) + this.height + StubApp.getString2(3422) + this.f12276x + StubApp.getString2(3423) + this.f12277y + StubApp.getString2(12894) + this.pixelRatio + StubApp.getString2(12895) + this.placeholder + StubApp.getString2(12896) + this.visible + StubApp.getString2(265);
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, b> unrecognized() {
                return this.unrecognized;
            }

            @Override // com.mapbox.api.directions.v5.models.ShieldSpriteAttribute
            public Boolean visible() {
                return this.visible;
            }

            @Override // com.mapbox.api.directions.v5.models.ShieldSpriteAttribute
            public Integer width() {
                return this.width;
            }

            @Override // com.mapbox.api.directions.v5.models.ShieldSpriteAttribute
            public Integer x() {
                return this.f12276x;
            }

            @Override // com.mapbox.api.directions.v5.models.ShieldSpriteAttribute
            public Integer y() {
                return this.f12277y;
            }
        };
    }
}
