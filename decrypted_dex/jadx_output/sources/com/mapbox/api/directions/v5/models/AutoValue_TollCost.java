package com.mapbox.api.directions.v5.models;

import E1.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.TollCost;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_TollCost extends C$AutoValue_TollCost {

    public static final class GsonTypeAdapter extends TypeAdapter<TollCost> {
        private final Gson gson;
        private volatile TypeAdapter<PaymentMethods> paymentMethods_adapter;
        private volatile TypeAdapter<String> string_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(13130);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public TollCost read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            TollCost.Builder builder = TollCost.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.getClass();
                    if (nextName.equals(StubApp.getString2(13004))) {
                        TypeAdapter<PaymentMethods> typeAdapter = this.paymentMethods_adapter;
                        if (typeAdapter == null) {
                            typeAdapter = this.gson.getAdapter(PaymentMethods.class);
                            this.paymentMethods_adapter = typeAdapter;
                        }
                        builder.paymentMethods(typeAdapter.read2(jsonReader));
                    } else if (StubApp.getString2(7787).equals(nextName)) {
                        TypeAdapter<String> typeAdapter2 = this.string_adapter;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.gson.getAdapter(String.class);
                            this.string_adapter = typeAdapter2;
                        }
                        builder.currency(typeAdapter2.read2(jsonReader));
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
        public void write(JsonWriter jsonWriter, TollCost tollCost) throws IOException {
            if (tollCost == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (tollCost.unrecognized() != null) {
                for (Map.Entry<String, b> entry : tollCost.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(7787));
            if (tollCost.currency() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.string_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, tollCost.currency());
            }
            jsonWriter.name(StubApp.getString2(13004));
            if (tollCost.paymentMethods() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<PaymentMethods> typeAdapter2 = this.paymentMethods_adapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(PaymentMethods.class);
                    this.paymentMethods_adapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, tollCost.paymentMethods());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_TollCost(final Map<String, b> map, final String str, final PaymentMethods paymentMethods) {
        new TollCost(map, str, paymentMethods) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_TollCost
            private final String currency;
            private final PaymentMethods paymentMethods;
            private final Map<String, b> unrecognized;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_TollCost$Builder */
            public static class Builder extends TollCost.Builder {
                private String currency;
                private PaymentMethods paymentMethods;
                private Map<String, b> unrecognized;

                @Override // com.mapbox.api.directions.v5.models.TollCost.Builder
                public TollCost build() {
                    return new AutoValue_TollCost(this.unrecognized, this.currency, this.paymentMethods);
                }

                @Override // com.mapbox.api.directions.v5.models.TollCost.Builder
                public TollCost.Builder currency(String str) {
                    this.currency = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.TollCost.Builder
                public TollCost.Builder paymentMethods(PaymentMethods paymentMethods) {
                    this.paymentMethods = paymentMethods;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ TollCost.Builder unrecognized(Map map) {
                    return unrecognized2((Map<String, b>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                /* renamed from: unrecognized, reason: avoid collision after fix types in other method */
                public TollCost.Builder unrecognized2(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }
            }

            {
                this.unrecognized = map;
                this.currency = str;
                this.paymentMethods = paymentMethods;
            }

            @Override // com.mapbox.api.directions.v5.models.TollCost
            public String currency() {
                return this.currency;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof TollCost) {
                    TollCost tollCost = (TollCost) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(tollCost.unrecognized()) : tollCost.unrecognized() == null) {
                        String str2 = this.currency;
                        if (str2 != null ? str2.equals(tollCost.currency()) : tollCost.currency() == null) {
                            PaymentMethods paymentMethods2 = this.paymentMethods;
                            if (paymentMethods2 != null ? paymentMethods2.equals(tollCost.paymentMethods()) : tollCost.paymentMethods() == null) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                Map<String, b> map2 = this.unrecognized;
                int hashCode = ((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003;
                String str2 = this.currency;
                int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                PaymentMethods paymentMethods2 = this.paymentMethods;
                return hashCode2 ^ (paymentMethods2 != null ? paymentMethods2.hashCode() : 0);
            }

            @Override // com.mapbox.api.directions.v5.models.TollCost
            @SerializedName("payment_methods")
            public PaymentMethods paymentMethods() {
                return this.paymentMethods;
            }

            public String toString() {
                return StubApp.getString2(12936) + this.unrecognized + StubApp.getString2(12937) + this.currency + StubApp.getString2(12763) + this.paymentMethods + StubApp.getString2(265);
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, b> unrecognized() {
                return this.unrecognized;
            }
        };
    }
}
