package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.mapbox.api.directions.v5.models.AutoValue_Interchange;
import com.mapbox.api.directions.v5.models.C$AutoValue_Interchange;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class Interchange extends DirectionsJsonObject {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract Interchange build();

        public abstract Builder name(String str);
    }

    public static Builder builder() {
        return new C$AutoValue_Interchange.Builder();
    }

    public static TypeAdapter<Interchange> typeAdapter(Gson gson) {
        return new AutoValue_Interchange.GsonTypeAdapter(gson);
    }

    public abstract String name();
}
