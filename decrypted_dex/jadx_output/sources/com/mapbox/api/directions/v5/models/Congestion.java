package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.mapbox.api.directions.v5.models.AutoValue_Congestion;
import com.mapbox.api.directions.v5.models.C$AutoValue_Congestion;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class Congestion extends DirectionsJsonObject {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract Congestion build();

        public abstract Builder value(int i3);
    }

    public static Builder builder() {
        return new C$AutoValue_Congestion.Builder();
    }

    public static TypeAdapter<Congestion> typeAdapter(Gson gson) {
        return new AutoValue_Congestion.GsonTypeAdapter(gson);
    }

    public abstract int value();
}
