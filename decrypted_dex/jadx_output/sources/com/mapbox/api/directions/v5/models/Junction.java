package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.mapbox.api.directions.v5.models.AutoValue_Junction;
import com.mapbox.api.directions.v5.models.C$AutoValue_Junction;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class Junction extends DirectionsJsonObject {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract Junction build();

        public abstract Builder name(String str);
    }

    public static Builder builder() {
        return new C$AutoValue_Junction.Builder();
    }

    public static TypeAdapter<Junction> typeAdapter(Gson gson) {
        return new AutoValue_Junction.GsonTypeAdapter(gson);
    }

    public abstract String name();
}
