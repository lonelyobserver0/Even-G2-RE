package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.mapbox.api.directions.v5.models.AutoValue_DirectionsError;
import com.mapbox.api.directions.v5.models.C$AutoValue_DirectionsError;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;
import java.io.Serializable;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class DirectionsError extends DirectionsJsonObject implements Serializable {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract DirectionsError build();

        public abstract Builder code(String str);

        public abstract Builder message(String str);
    }

    public static Builder builder() {
        return new C$AutoValue_DirectionsError.Builder();
    }

    public static TypeAdapter<DirectionsError> typeAdapter(Gson gson) {
        return new AutoValue_DirectionsError.GsonTypeAdapter(gson);
    }

    public abstract String code();

    public abstract String message();
}
