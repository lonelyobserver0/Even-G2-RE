package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.models.AutoValue_SilentWaypoint;
import com.mapbox.api.directions.v5.models.C$AutoValue_SilentWaypoint;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class SilentWaypoint extends DirectionsJsonObject {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract SilentWaypoint build();

        public abstract Builder distanceFromStart(double d8);

        public abstract Builder geometryIndex(int i3);

        public abstract Builder waypointIndex(int i3);
    }

    public static Builder builder() {
        return new C$AutoValue_SilentWaypoint.Builder();
    }

    public static TypeAdapter<SilentWaypoint> typeAdapter(Gson gson) {
        return new AutoValue_SilentWaypoint.GsonTypeAdapter(gson);
    }

    @SerializedName("distance_from_start")
    public abstract double distanceFromStart();

    @SerializedName("geometry_index")
    public abstract int geometryIndex();

    @SerializedName("waypoint_index")
    public abstract int waypointIndex();
}
