package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.models.AutoValue_Closure;
import com.mapbox.api.directions.v5.models.C$AutoValue_Closure;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class Closure extends DirectionsJsonObject {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract Closure build();

        public abstract Builder geometryIndexEnd(Integer num);

        public abstract Builder geometryIndexStart(Integer num);
    }

    public static Builder builder() {
        return new C$AutoValue_Closure.Builder();
    }

    public static TypeAdapter<Closure> typeAdapter(Gson gson) {
        return new AutoValue_Closure.GsonTypeAdapter(gson);
    }

    @SerializedName("geometry_index_end")
    public abstract Integer geometryIndexEnd();

    @SerializedName("geometry_index_start")
    public abstract Integer geometryIndexStart();

    public abstract Builder toBuilder();
}
