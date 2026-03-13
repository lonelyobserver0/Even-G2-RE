package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.models.AutoValue_StepManeuver;
import com.mapbox.api.directions.v5.models.C$AutoValue_StepManeuver;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class StepManeuver extends DirectionsJsonObject {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract Builder bearingAfter(Double d8);

        public abstract Builder bearingBefore(Double d8);

        public abstract StepManeuver build();

        public abstract Builder exit(Integer num);

        public abstract Builder instruction(String str);

        public abstract Builder modifier(String str);

        public abstract Builder rawLocation(double[] dArr);

        public abstract Builder type(String str);
    }

    public static Builder builder() {
        return new C$AutoValue_StepManeuver.Builder();
    }

    public static TypeAdapter<StepManeuver> typeAdapter(Gson gson) {
        return new StepManeuverTypeAdapter(new AutoValue_StepManeuver.GsonTypeAdapter(gson));
    }

    @SerializedName("bearing_after")
    public abstract Double bearingAfter();

    @SerializedName("bearing_before")
    public abstract Double bearingBefore();

    public abstract Integer exit();

    public abstract String instruction();

    public abstract String modifier();

    @SerializedName("location")
    public abstract double[] rawLocation();

    public abstract String type();
}
