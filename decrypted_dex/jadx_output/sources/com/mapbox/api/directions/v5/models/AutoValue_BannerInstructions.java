package com.mapbox.api.directions.v5.models;

import E1.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.BannerInstructions;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_BannerInstructions extends C$AutoValue_BannerInstructions {

    public static final class GsonTypeAdapter extends TypeAdapter<BannerInstructions> {
        private volatile TypeAdapter<BannerText> bannerText_adapter;
        private volatile TypeAdapter<BannerView> bannerView_adapter;
        private volatile TypeAdapter<Double> double__adapter;
        private final Gson gson;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(12958);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public BannerInstructions read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            BannerInstructions.Builder builder = BannerInstructions.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.getClass();
                    if (StubApp.getString2(12955).equals(nextName)) {
                        TypeAdapter<Double> typeAdapter = this.double__adapter;
                        if (typeAdapter == null) {
                            typeAdapter = this.gson.getAdapter(Double.class);
                            this.double__adapter = typeAdapter;
                        }
                        builder.distanceAlongGeometry(typeAdapter.read2(jsonReader).doubleValue());
                    } else if (StubApp.getString2(5265).equals(nextName)) {
                        TypeAdapter<BannerText> typeAdapter2 = this.bannerText_adapter;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.gson.getAdapter(BannerText.class);
                            this.bannerText_adapter = typeAdapter2;
                        }
                        builder.primary(typeAdapter2.read2(jsonReader));
                    } else if (StubApp.getString2(12956).equals(nextName)) {
                        TypeAdapter<BannerText> typeAdapter3 = this.bannerText_adapter;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.gson.getAdapter(BannerText.class);
                            this.bannerText_adapter = typeAdapter3;
                        }
                        builder.secondary(typeAdapter3.read2(jsonReader));
                    } else if (StubApp.getString2(8102).equals(nextName)) {
                        TypeAdapter<BannerText> typeAdapter4 = this.bannerText_adapter;
                        if (typeAdapter4 == null) {
                            typeAdapter4 = this.gson.getAdapter(BannerText.class);
                            this.bannerText_adapter = typeAdapter4;
                        }
                        builder.sub(typeAdapter4.read2(jsonReader));
                    } else if (StubApp.getString2(12957).equals(nextName)) {
                        TypeAdapter<BannerView> typeAdapter5 = this.bannerView_adapter;
                        if (typeAdapter5 == null) {
                            typeAdapter5 = this.gson.getAdapter(BannerView.class);
                            this.bannerView_adapter = typeAdapter5;
                        }
                        builder.view(typeAdapter5.read2(jsonReader));
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
        public void write(JsonWriter jsonWriter, BannerInstructions bannerInstructions) throws IOException {
            if (bannerInstructions == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (bannerInstructions.unrecognized() != null) {
                for (Map.Entry<String, b> entry : bannerInstructions.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(12955));
            TypeAdapter<Double> typeAdapter = this.double__adapter;
            if (typeAdapter == null) {
                typeAdapter = this.gson.getAdapter(Double.class);
                this.double__adapter = typeAdapter;
            }
            typeAdapter.write(jsonWriter, Double.valueOf(bannerInstructions.distanceAlongGeometry()));
            jsonWriter.name(StubApp.getString2(5265));
            if (bannerInstructions.primary() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<BannerText> typeAdapter2 = this.bannerText_adapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(BannerText.class);
                    this.bannerText_adapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, bannerInstructions.primary());
            }
            jsonWriter.name(StubApp.getString2(12956));
            if (bannerInstructions.secondary() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<BannerText> typeAdapter3 = this.bannerText_adapter;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.gson.getAdapter(BannerText.class);
                    this.bannerText_adapter = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, bannerInstructions.secondary());
            }
            jsonWriter.name(StubApp.getString2(8102));
            if (bannerInstructions.sub() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<BannerText> typeAdapter4 = this.bannerText_adapter;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.gson.getAdapter(BannerText.class);
                    this.bannerText_adapter = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, bannerInstructions.sub());
            }
            jsonWriter.name(StubApp.getString2(12957));
            if (bannerInstructions.view() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<BannerView> typeAdapter5 = this.bannerView_adapter;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.gson.getAdapter(BannerView.class);
                    this.bannerView_adapter = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, bannerInstructions.view());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_BannerInstructions(Map<String, b> map, double d8, BannerText bannerText, BannerText bannerText2, BannerText bannerText3, BannerView bannerView) {
        new BannerInstructions(map, d8, bannerText, bannerText2, bannerText3, bannerView) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_BannerInstructions
            private final double distanceAlongGeometry;
            private final BannerText primary;
            private final BannerText secondary;
            private final BannerText sub;
            private final Map<String, b> unrecognized;
            private final BannerView view;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_BannerInstructions$1, reason: invalid class name */
            public static /* synthetic */ class AnonymousClass1 {
            }

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_BannerInstructions$Builder */
            public static class Builder extends BannerInstructions.Builder {
                private Double distanceAlongGeometry;
                private BannerText primary;
                private BannerText secondary;
                private BannerText sub;
                private Map<String, b> unrecognized;
                private BannerView view;

                public /* synthetic */ Builder(BannerInstructions bannerInstructions, AnonymousClass1 anonymousClass1) {
                    this(bannerInstructions);
                }

                @Override // com.mapbox.api.directions.v5.models.BannerInstructions.Builder
                public BannerInstructions build() {
                    String string2 = this.distanceAlongGeometry == null ? StubApp.getString2(12701) : "";
                    if (this.primary == null) {
                        string2 = AbstractC1482f.g(string2, StubApp.getString2(12702));
                    }
                    if (string2.isEmpty()) {
                        return new AutoValue_BannerInstructions(this.unrecognized, this.distanceAlongGeometry.doubleValue(), this.primary, this.secondary, this.sub, this.view);
                    }
                    throw new IllegalStateException(StubApp.getString2(555).concat(string2));
                }

                @Override // com.mapbox.api.directions.v5.models.BannerInstructions.Builder
                public BannerInstructions.Builder distanceAlongGeometry(double d8) {
                    this.distanceAlongGeometry = Double.valueOf(d8);
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.BannerInstructions.Builder
                public BannerInstructions.Builder primary(BannerText bannerText) {
                    if (bannerText == null) {
                        throw new NullPointerException(StubApp.getString2(12703));
                    }
                    this.primary = bannerText;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.BannerInstructions.Builder
                public BannerInstructions.Builder secondary(BannerText bannerText) {
                    this.secondary = bannerText;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.BannerInstructions.Builder
                public BannerInstructions.Builder sub(BannerText bannerText) {
                    this.sub = bannerText;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ BannerInstructions.Builder unrecognized(Map map) {
                    return unrecognized((Map<String, b>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.BannerInstructions.Builder
                public BannerInstructions.Builder view(BannerView bannerView) {
                    this.view = bannerView;
                    return this;
                }

                public Builder() {
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public BannerInstructions.Builder unrecognized(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }

                private Builder(BannerInstructions bannerInstructions) {
                    this.unrecognized = bannerInstructions.unrecognized();
                    this.distanceAlongGeometry = Double.valueOf(bannerInstructions.distanceAlongGeometry());
                    this.primary = bannerInstructions.primary();
                    this.secondary = bannerInstructions.secondary();
                    this.sub = bannerInstructions.sub();
                    this.view = bannerInstructions.view();
                }
            }

            {
                this.unrecognized = map;
                this.distanceAlongGeometry = d8;
                if (bannerText == null) {
                    throw new NullPointerException(StubApp.getString2(12703));
                }
                this.primary = bannerText;
                this.secondary = bannerText2;
                this.sub = bannerText3;
                this.view = bannerView;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerInstructions
            public double distanceAlongGeometry() {
                return this.distanceAlongGeometry;
            }

            public boolean equals(Object obj) {
                BannerText bannerText4;
                BannerText bannerText5;
                BannerView bannerView2;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof BannerInstructions) {
                    BannerInstructions bannerInstructions = (BannerInstructions) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(bannerInstructions.unrecognized()) : bannerInstructions.unrecognized() == null) {
                        if (Double.doubleToLongBits(this.distanceAlongGeometry) == Double.doubleToLongBits(bannerInstructions.distanceAlongGeometry()) && this.primary.equals(bannerInstructions.primary()) && ((bannerText4 = this.secondary) != null ? bannerText4.equals(bannerInstructions.secondary()) : bannerInstructions.secondary() == null) && ((bannerText5 = this.sub) != null ? bannerText5.equals(bannerInstructions.sub()) : bannerInstructions.sub() == null) && ((bannerView2 = this.view) != null ? bannerView2.equals(bannerInstructions.view()) : bannerInstructions.view() == null)) {
                            return true;
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                Map<String, b> map2 = this.unrecognized;
                int hashCode = ((((((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.distanceAlongGeometry) >>> 32) ^ Double.doubleToLongBits(this.distanceAlongGeometry)))) * 1000003) ^ this.primary.hashCode()) * 1000003;
                BannerText bannerText4 = this.secondary;
                int hashCode2 = (hashCode ^ (bannerText4 == null ? 0 : bannerText4.hashCode())) * 1000003;
                BannerText bannerText5 = this.sub;
                int hashCode3 = (hashCode2 ^ (bannerText5 == null ? 0 : bannerText5.hashCode())) * 1000003;
                BannerView bannerView2 = this.view;
                return hashCode3 ^ (bannerView2 != null ? bannerView2.hashCode() : 0);
            }

            @Override // com.mapbox.api.directions.v5.models.BannerInstructions
            public BannerText primary() {
                return this.primary;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerInstructions
            public BannerText secondary() {
                return this.secondary;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerInstructions
            public BannerText sub() {
                return this.sub;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerInstructions
            public BannerInstructions.Builder toBuilder() {
                return new Builder(this, null);
            }

            public String toString() {
                return StubApp.getString2(12704) + this.unrecognized + StubApp.getString2(12705) + this.distanceAlongGeometry + StubApp.getString2(12706) + this.primary + StubApp.getString2(12707) + this.secondary + StubApp.getString2(12708) + this.sub + StubApp.getString2(3608) + this.view + StubApp.getString2(265);
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, b> unrecognized() {
                return this.unrecognized;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerInstructions
            public BannerView view() {
                return this.view;
            }
        };
    }
}
