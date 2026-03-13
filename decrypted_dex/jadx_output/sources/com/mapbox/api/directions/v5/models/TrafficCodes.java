package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.models.AutoValue_TrafficCodes;
import com.mapbox.api.directions.v5.models.C$AutoValue_TrafficCodes;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class TrafficCodes extends DirectionsJsonObject {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract TrafficCodes build();

        public abstract Builder jarticCauseCode(Integer num);

        public abstract Builder jarticRegulationCode(Integer num);
    }

    public static Builder builder() {
        return new C$AutoValue_TrafficCodes.Builder();
    }

    public static TypeAdapter<TrafficCodes> typeAdapter(Gson gson) {
        return new AutoValue_TrafficCodes.GsonTypeAdapter(gson);
    }

    @SerializedName("jartic_cause_code")
    public abstract Integer jarticCauseCode();

    @SerializedName("jartic_regulation_code")
    public abstract Integer jarticRegulationCode();
}
