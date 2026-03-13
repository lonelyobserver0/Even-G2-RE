package com.mapbox.api.directions.v5.models;

import E1.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.PaymentMethods;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_PaymentMethods extends C$AutoValue_PaymentMethods {

    public static final class GsonTypeAdapter extends TypeAdapter<PaymentMethods> {
        private volatile TypeAdapter<CostPerVehicleSize> costPerVehicleSize_adapter;
        private final Gson gson;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(13043);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public PaymentMethods read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            PaymentMethods.Builder builder = PaymentMethods.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.getClass();
                    if (StubApp.getString2(13040).equals(nextName)) {
                        TypeAdapter<CostPerVehicleSize> typeAdapter = this.costPerVehicleSize_adapter;
                        if (typeAdapter == null) {
                            typeAdapter = this.gson.getAdapter(CostPerVehicleSize.class);
                            this.costPerVehicleSize_adapter = typeAdapter;
                        }
                        builder.etc(typeAdapter.read2(jsonReader));
                    } else if (StubApp.getString2(13041).equals(nextName)) {
                        TypeAdapter<CostPerVehicleSize> typeAdapter2 = this.costPerVehicleSize_adapter;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.gson.getAdapter(CostPerVehicleSize.class);
                            this.costPerVehicleSize_adapter = typeAdapter2;
                        }
                        builder.etc2(typeAdapter2.read2(jsonReader));
                    } else if (StubApp.getString2(13042).equals(nextName)) {
                        TypeAdapter<CostPerVehicleSize> typeAdapter3 = this.costPerVehicleSize_adapter;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.gson.getAdapter(CostPerVehicleSize.class);
                            this.costPerVehicleSize_adapter = typeAdapter3;
                        }
                        builder.cash(typeAdapter3.read2(jsonReader));
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
        public void write(JsonWriter jsonWriter, PaymentMethods paymentMethods) throws IOException {
            if (paymentMethods == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (paymentMethods.unrecognized() != null) {
                for (Map.Entry<String, b> entry : paymentMethods.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(13040));
            if (paymentMethods.etc() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<CostPerVehicleSize> typeAdapter = this.costPerVehicleSize_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(CostPerVehicleSize.class);
                    this.costPerVehicleSize_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, paymentMethods.etc());
            }
            jsonWriter.name(StubApp.getString2(13041));
            if (paymentMethods.etc2() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<CostPerVehicleSize> typeAdapter2 = this.costPerVehicleSize_adapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(CostPerVehicleSize.class);
                    this.costPerVehicleSize_adapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, paymentMethods.etc2());
            }
            jsonWriter.name(StubApp.getString2(13042));
            if (paymentMethods.cash() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<CostPerVehicleSize> typeAdapter3 = this.costPerVehicleSize_adapter;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.gson.getAdapter(CostPerVehicleSize.class);
                    this.costPerVehicleSize_adapter = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, paymentMethods.cash());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_PaymentMethods(final Map<String, b> map, final CostPerVehicleSize costPerVehicleSize, final CostPerVehicleSize costPerVehicleSize2, final CostPerVehicleSize costPerVehicleSize3) {
        new PaymentMethods(map, costPerVehicleSize, costPerVehicleSize2, costPerVehicleSize3) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_PaymentMethods
            private final CostPerVehicleSize cash;
            private final CostPerVehicleSize etc;
            private final CostPerVehicleSize etc2;
            private final Map<String, b> unrecognized;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_PaymentMethods$Builder */
            public static class Builder extends PaymentMethods.Builder {
                private CostPerVehicleSize cash;
                private CostPerVehicleSize etc;
                private CostPerVehicleSize etc2;
                private Map<String, b> unrecognized;

                @Override // com.mapbox.api.directions.v5.models.PaymentMethods.Builder
                public PaymentMethods build() {
                    return new AutoValue_PaymentMethods(this.unrecognized, this.etc, this.etc2, this.cash);
                }

                @Override // com.mapbox.api.directions.v5.models.PaymentMethods.Builder
                public PaymentMethods.Builder cash(CostPerVehicleSize costPerVehicleSize) {
                    this.cash = costPerVehicleSize;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.PaymentMethods.Builder
                public PaymentMethods.Builder etc(CostPerVehicleSize costPerVehicleSize) {
                    this.etc = costPerVehicleSize;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.PaymentMethods.Builder
                public PaymentMethods.Builder etc2(CostPerVehicleSize costPerVehicleSize) {
                    this.etc2 = costPerVehicleSize;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ PaymentMethods.Builder unrecognized(Map map) {
                    return unrecognized2((Map<String, b>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                /* renamed from: unrecognized, reason: avoid collision after fix types in other method */
                public PaymentMethods.Builder unrecognized2(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }
            }

            {
                this.unrecognized = map;
                this.etc = costPerVehicleSize;
                this.etc2 = costPerVehicleSize2;
                this.cash = costPerVehicleSize3;
            }

            @Override // com.mapbox.api.directions.v5.models.PaymentMethods
            public CostPerVehicleSize cash() {
                return this.cash;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof PaymentMethods) {
                    PaymentMethods paymentMethods = (PaymentMethods) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(paymentMethods.unrecognized()) : paymentMethods.unrecognized() == null) {
                        CostPerVehicleSize costPerVehicleSize4 = this.etc;
                        if (costPerVehicleSize4 != null ? costPerVehicleSize4.equals(paymentMethods.etc()) : paymentMethods.etc() == null) {
                            CostPerVehicleSize costPerVehicleSize5 = this.etc2;
                            if (costPerVehicleSize5 != null ? costPerVehicleSize5.equals(paymentMethods.etc2()) : paymentMethods.etc2() == null) {
                                CostPerVehicleSize costPerVehicleSize6 = this.cash;
                                if (costPerVehicleSize6 != null ? costPerVehicleSize6.equals(paymentMethods.cash()) : paymentMethods.cash() == null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            }

            @Override // com.mapbox.api.directions.v5.models.PaymentMethods
            public CostPerVehicleSize etc() {
                return this.etc;
            }

            @Override // com.mapbox.api.directions.v5.models.PaymentMethods
            public CostPerVehicleSize etc2() {
                return this.etc2;
            }

            public int hashCode() {
                Map<String, b> map2 = this.unrecognized;
                int hashCode = ((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003;
                CostPerVehicleSize costPerVehicleSize4 = this.etc;
                int hashCode2 = (hashCode ^ (costPerVehicleSize4 == null ? 0 : costPerVehicleSize4.hashCode())) * 1000003;
                CostPerVehicleSize costPerVehicleSize5 = this.etc2;
                int hashCode3 = (hashCode2 ^ (costPerVehicleSize5 == null ? 0 : costPerVehicleSize5.hashCode())) * 1000003;
                CostPerVehicleSize costPerVehicleSize6 = this.cash;
                return hashCode3 ^ (costPerVehicleSize6 != null ? costPerVehicleSize6.hashCode() : 0);
            }

            public String toString() {
                return StubApp.getString2(12815) + this.unrecognized + StubApp.getString2(12816) + this.etc + StubApp.getString2(12817) + this.etc2 + StubApp.getString2(12818) + this.cash + StubApp.getString2(265);
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, b> unrecognized() {
                return this.unrecognized;
            }
        };
    }
}
