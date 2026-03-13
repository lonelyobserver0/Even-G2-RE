package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.mapbox.api.directions.v5.models.AutoValue_CostPerVehicleSize;
import com.mapbox.api.directions.v5.models.C$AutoValue_CostPerVehicleSize;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class CostPerVehicleSize extends DirectionsJsonObject {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract CostPerVehicleSize build();

        public abstract Builder jumbo(Double d8);

        public abstract Builder large(Double d8);

        public abstract Builder middle(Double d8);

        public abstract Builder small(Double d8);

        public abstract Builder standard(Double d8);
    }

    public static Builder builder() {
        return new C$AutoValue_CostPerVehicleSize.Builder();
    }

    public static TypeAdapter<CostPerVehicleSize> typeAdapter(Gson gson) {
        return new AutoValue_CostPerVehicleSize.GsonTypeAdapter(gson);
    }

    public abstract Double jumbo();

    public abstract Double large();

    public abstract Double middle();

    public abstract Double small();

    public abstract Double standard();
}
