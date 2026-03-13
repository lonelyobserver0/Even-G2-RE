package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.mapbox.api.directions.v5.models.AutoValue_PaymentMethods;
import com.mapbox.api.directions.v5.models.C$AutoValue_PaymentMethods;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class PaymentMethods extends DirectionsJsonObject {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract PaymentMethods build();

        public abstract Builder cash(CostPerVehicleSize costPerVehicleSize);

        public abstract Builder etc(CostPerVehicleSize costPerVehicleSize);

        public abstract Builder etc2(CostPerVehicleSize costPerVehicleSize);
    }

    public static Builder builder() {
        return new C$AutoValue_PaymentMethods.Builder();
    }

    public static TypeAdapter<PaymentMethods> typeAdapter(Gson gson) {
        return new AutoValue_PaymentMethods.GsonTypeAdapter(gson);
    }

    public abstract CostPerVehicleSize cash();

    public abstract CostPerVehicleSize etc();

    public abstract CostPerVehicleSize etc2();
}
