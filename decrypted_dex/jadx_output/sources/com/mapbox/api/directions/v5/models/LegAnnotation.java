package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.models.AutoValue_LegAnnotation;
import com.mapbox.api.directions.v5.models.C$AutoValue_LegAnnotation;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;
import java.util.List;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class LegAnnotation extends DirectionsJsonObject {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract LegAnnotation build();

        public abstract Builder congestion(List<String> list);

        public abstract Builder congestionNumeric(List<Integer> list);

        public abstract Builder currentSpeed(List<Integer> list);

        public abstract Builder distance(List<Double> list);

        public abstract Builder duration(List<Double> list);

        public abstract Builder freeflowSpeed(List<Integer> list);

        public abstract Builder maxspeed(List<MaxSpeed> list);

        public abstract Builder speed(List<Double> list);

        public abstract Builder trafficTendency(List<Integer> list);
    }

    public static Builder builder() {
        return new C$AutoValue_LegAnnotation.Builder();
    }

    public static TypeAdapter<LegAnnotation> typeAdapter(Gson gson) {
        return new AutoValue_LegAnnotation.GsonTypeAdapter(gson);
    }

    public abstract List<String> congestion();

    @SerializedName("congestion_numeric")
    public abstract List<Integer> congestionNumeric();

    @SerializedName("current_speed")
    public abstract List<Integer> currentSpeed();

    public abstract List<Double> distance();

    public abstract List<Double> duration();

    @SerializedName("freeflow_speed")
    public abstract List<Integer> freeflowSpeed();

    public abstract List<MaxSpeed> maxspeed();

    public abstract List<Double> speed();

    public abstract Builder toBuilder();

    @SerializedName("traffic_tendency")
    public abstract List<Integer> trafficTendency();
}
