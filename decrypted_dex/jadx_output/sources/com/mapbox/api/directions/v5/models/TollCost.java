package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.models.AutoValue_TollCost;
import com.mapbox.api.directions.v5.models.C$AutoValue_TollCost;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class TollCost extends DirectionsJsonObject {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract TollCost build();

        public abstract Builder currency(String str);

        public abstract Builder paymentMethods(PaymentMethods paymentMethods);
    }

    public static Builder builder() {
        return new C$AutoValue_TollCost.Builder();
    }

    public static TypeAdapter<TollCost> typeAdapter(Gson gson) {
        return new AutoValue_TollCost.GsonTypeAdapter(gson);
    }

    public abstract String currency();

    @SerializedName("payment_methods")
    public abstract PaymentMethods paymentMethods();
}
