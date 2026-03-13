package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.DirectionsAdapterFactory;
import com.mapbox.api.directions.v5.models.AutoValue_DirectionsWaypoint;
import com.mapbox.api.directions.v5.models.C$AutoValue_DirectionsWaypoint;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;
import com.mapbox.geojson.Point;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class DirectionsWaypoint extends DirectionsJsonObject {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract DirectionsWaypoint build();

        public abstract Builder distance(Double d8);

        public abstract Builder name(String str);

        public abstract Builder rawLocation(double[] dArr);
    }

    public static Builder builder() {
        return new C$AutoValue_DirectionsWaypoint.Builder();
    }

    public static DirectionsWaypoint fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(DirectionsAdapterFactory.a());
        return (DirectionsWaypoint) gsonBuilder.create().fromJson(str, DirectionsWaypoint.class);
    }

    public static TypeAdapter<DirectionsWaypoint> typeAdapter(Gson gson) {
        return new AutoValue_DirectionsWaypoint.GsonTypeAdapter(gson);
    }

    public abstract Double distance();

    public Point location() {
        return Point.fromLngLat(rawLocation()[0], rawLocation()[1]);
    }

    public abstract String name();

    @SerializedName("location")
    public abstract double[] rawLocation();
}
