package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.mapbox.api.directions.v5.models.AutoValue_Bearing;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class Bearing extends DirectionsJsonObject {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract Builder angle(double d8);

        public abstract Bearing build();

        public abstract Builder degrees(double d8);
    }

    public static Builder builder() {
        return new AutoValue_Bearing.Builder().angle(45.0d).degrees(90.0d);
    }

    public abstract double angle();

    public abstract double degrees();
}
