package com.mapbox.api.directions.v5.models;

import E1.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.CostPerVehicleSize;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_CostPerVehicleSize extends C$AutoValue_CostPerVehicleSize {

    public static final class GsonTypeAdapter extends TypeAdapter<CostPerVehicleSize> {
        private volatile TypeAdapter<Double> double__adapter;
        private final Gson gson;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(12977);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public CostPerVehicleSize read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            CostPerVehicleSize.Builder builder = CostPerVehicleSize.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.getClass();
                    if (StubApp.getString2(12972).equals(nextName)) {
                        TypeAdapter<Double> typeAdapter = this.double__adapter;
                        if (typeAdapter == null) {
                            typeAdapter = this.gson.getAdapter(Double.class);
                            this.double__adapter = typeAdapter;
                        }
                        builder.small(typeAdapter.read2(jsonReader));
                    } else if (StubApp.getString2(12973).equals(nextName)) {
                        TypeAdapter<Double> typeAdapter2 = this.double__adapter;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.gson.getAdapter(Double.class);
                            this.double__adapter = typeAdapter2;
                        }
                        builder.standard(typeAdapter2.read2(jsonReader));
                    } else if (StubApp.getString2(12974).equals(nextName)) {
                        TypeAdapter<Double> typeAdapter3 = this.double__adapter;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.gson.getAdapter(Double.class);
                            this.double__adapter = typeAdapter3;
                        }
                        builder.middle(typeAdapter3.read2(jsonReader));
                    } else if (StubApp.getString2(12975).equals(nextName)) {
                        TypeAdapter<Double> typeAdapter4 = this.double__adapter;
                        if (typeAdapter4 == null) {
                            typeAdapter4 = this.gson.getAdapter(Double.class);
                            this.double__adapter = typeAdapter4;
                        }
                        builder.large(typeAdapter4.read2(jsonReader));
                    } else if (StubApp.getString2(12976).equals(nextName)) {
                        TypeAdapter<Double> typeAdapter5 = this.double__adapter;
                        if (typeAdapter5 == null) {
                            typeAdapter5 = this.gson.getAdapter(Double.class);
                            this.double__adapter = typeAdapter5;
                        }
                        builder.jumbo(typeAdapter5.read2(jsonReader));
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
        public void write(JsonWriter jsonWriter, CostPerVehicleSize costPerVehicleSize) throws IOException {
            if (costPerVehicleSize == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (costPerVehicleSize.unrecognized() != null) {
                for (Map.Entry<String, b> entry : costPerVehicleSize.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(12972));
            if (costPerVehicleSize.small() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter = this.double__adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(Double.class);
                    this.double__adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, costPerVehicleSize.small());
            }
            jsonWriter.name(StubApp.getString2(12973));
            if (costPerVehicleSize.standard() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter2 = this.double__adapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(Double.class);
                    this.double__adapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, costPerVehicleSize.standard());
            }
            jsonWriter.name(StubApp.getString2(12974));
            if (costPerVehicleSize.middle() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter3 = this.double__adapter;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.gson.getAdapter(Double.class);
                    this.double__adapter = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, costPerVehicleSize.middle());
            }
            jsonWriter.name(StubApp.getString2(12975));
            if (costPerVehicleSize.large() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter4 = this.double__adapter;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.gson.getAdapter(Double.class);
                    this.double__adapter = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, costPerVehicleSize.large());
            }
            jsonWriter.name(StubApp.getString2(12976));
            if (costPerVehicleSize.jumbo() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter5 = this.double__adapter;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.gson.getAdapter(Double.class);
                    this.double__adapter = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, costPerVehicleSize.jumbo());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_CostPerVehicleSize(final Map<String, b> map, final Double d8, final Double d10, final Double d11, final Double d12, final Double d13) {
        new CostPerVehicleSize(map, d8, d10, d11, d12, d13) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_CostPerVehicleSize
            private final Double jumbo;
            private final Double large;
            private final Double middle;
            private final Double small;
            private final Double standard;
            private final Map<String, b> unrecognized;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_CostPerVehicleSize$Builder */
            public static class Builder extends CostPerVehicleSize.Builder {
                private Double jumbo;
                private Double large;
                private Double middle;
                private Double small;
                private Double standard;
                private Map<String, b> unrecognized;

                @Override // com.mapbox.api.directions.v5.models.CostPerVehicleSize.Builder
                public CostPerVehicleSize build() {
                    return new AutoValue_CostPerVehicleSize(this.unrecognized, this.small, this.standard, this.middle, this.large, this.jumbo);
                }

                @Override // com.mapbox.api.directions.v5.models.CostPerVehicleSize.Builder
                public CostPerVehicleSize.Builder jumbo(Double d8) {
                    this.jumbo = d8;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.CostPerVehicleSize.Builder
                public CostPerVehicleSize.Builder large(Double d8) {
                    this.large = d8;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.CostPerVehicleSize.Builder
                public CostPerVehicleSize.Builder middle(Double d8) {
                    this.middle = d8;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.CostPerVehicleSize.Builder
                public CostPerVehicleSize.Builder small(Double d8) {
                    this.small = d8;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.CostPerVehicleSize.Builder
                public CostPerVehicleSize.Builder standard(Double d8) {
                    this.standard = d8;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ CostPerVehicleSize.Builder unrecognized(Map map) {
                    return unrecognized((Map<String, b>) map);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public CostPerVehicleSize.Builder unrecognized(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }
            }

            {
                this.unrecognized = map;
                this.small = d8;
                this.standard = d10;
                this.middle = d11;
                this.large = d12;
                this.jumbo = d13;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof CostPerVehicleSize) {
                    CostPerVehicleSize costPerVehicleSize = (CostPerVehicleSize) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(costPerVehicleSize.unrecognized()) : costPerVehicleSize.unrecognized() == null) {
                        Double d14 = this.small;
                        if (d14 != null ? d14.equals(costPerVehicleSize.small()) : costPerVehicleSize.small() == null) {
                            Double d15 = this.standard;
                            if (d15 != null ? d15.equals(costPerVehicleSize.standard()) : costPerVehicleSize.standard() == null) {
                                Double d16 = this.middle;
                                if (d16 != null ? d16.equals(costPerVehicleSize.middle()) : costPerVehicleSize.middle() == null) {
                                    Double d17 = this.large;
                                    if (d17 != null ? d17.equals(costPerVehicleSize.large()) : costPerVehicleSize.large() == null) {
                                        Double d18 = this.jumbo;
                                        if (d18 != null ? d18.equals(costPerVehicleSize.jumbo()) : costPerVehicleSize.jumbo() == null) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                Map<String, b> map2 = this.unrecognized;
                int hashCode = ((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003;
                Double d14 = this.small;
                int hashCode2 = (hashCode ^ (d14 == null ? 0 : d14.hashCode())) * 1000003;
                Double d15 = this.standard;
                int hashCode3 = (hashCode2 ^ (d15 == null ? 0 : d15.hashCode())) * 1000003;
                Double d16 = this.middle;
                int hashCode4 = (hashCode3 ^ (d16 == null ? 0 : d16.hashCode())) * 1000003;
                Double d17 = this.large;
                int hashCode5 = (hashCode4 ^ (d17 == null ? 0 : d17.hashCode())) * 1000003;
                Double d18 = this.jumbo;
                return hashCode5 ^ (d18 != null ? d18.hashCode() : 0);
            }

            @Override // com.mapbox.api.directions.v5.models.CostPerVehicleSize
            public Double jumbo() {
                return this.jumbo;
            }

            @Override // com.mapbox.api.directions.v5.models.CostPerVehicleSize
            public Double large() {
                return this.large;
            }

            @Override // com.mapbox.api.directions.v5.models.CostPerVehicleSize
            public Double middle() {
                return this.middle;
            }

            @Override // com.mapbox.api.directions.v5.models.CostPerVehicleSize
            public Double small() {
                return this.small;
            }

            @Override // com.mapbox.api.directions.v5.models.CostPerVehicleSize
            public Double standard() {
                return this.standard;
            }

            public String toString() {
                return StubApp.getString2(12723) + this.unrecognized + StubApp.getString2(12724) + this.small + StubApp.getString2(12725) + this.standard + StubApp.getString2(12726) + this.middle + StubApp.getString2(12727) + this.large + StubApp.getString2(12728) + this.jumbo + StubApp.getString2(265);
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, b> unrecognized() {
                return this.unrecognized;
            }
        };
    }
}
