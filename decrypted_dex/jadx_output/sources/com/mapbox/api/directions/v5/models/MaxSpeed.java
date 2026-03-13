package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.mapbox.api.directions.v5.models.AutoValue_MaxSpeed;
import com.mapbox.api.directions.v5.models.C$AutoValue_MaxSpeed;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class MaxSpeed extends DirectionsJsonObject {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract MaxSpeed build();

        public abstract Builder none(Boolean bool);

        public abstract Builder speed(Integer num);

        public abstract Builder unit(String str);

        public abstract Builder unknown(Boolean bool);
    }

    public static Builder builder() {
        return new C$AutoValue_MaxSpeed.Builder();
    }

    public static TypeAdapter<MaxSpeed> typeAdapter(Gson gson) {
        return new AutoValue_MaxSpeed.GsonTypeAdapter(gson);
    }

    public abstract Boolean none();

    public abstract Integer speed();

    public abstract String unit();

    public abstract Boolean unknown();
}
