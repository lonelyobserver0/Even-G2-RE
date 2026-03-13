package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.mapbox.api.directions.v5.models.AutoValue_Amenity;
import com.mapbox.api.directions.v5.models.C$AutoValue_Amenity;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class Amenity extends DirectionsJsonObject {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract Builder brand(String str);

        public abstract Amenity build();

        public abstract Builder name(String str);

        public abstract Builder type(String str);
    }

    public static Builder builder() {
        return new C$AutoValue_Amenity.Builder();
    }

    public static TypeAdapter<Amenity> typeAdapter(Gson gson) {
        return new AutoValue_Amenity.GsonTypeAdapter(gson);
    }

    public abstract String brand();

    public abstract String name();

    public abstract String type();
}
