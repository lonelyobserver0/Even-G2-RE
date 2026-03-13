package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.models.AutoValue_RestStop;
import com.mapbox.api.directions.v5.models.C$AutoValue_RestStop;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;
import java.util.List;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class RestStop extends DirectionsJsonObject {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract Builder amenities(List<Amenity> list);

        public abstract RestStop build();

        public abstract Builder guideMap(String str);

        public abstract Builder name(String str);

        public abstract Builder type(String str);
    }

    public static Builder builder() {
        return new C$AutoValue_RestStop.Builder();
    }

    public static TypeAdapter<RestStop> typeAdapter(Gson gson) {
        return new AutoValue_RestStop.GsonTypeAdapter(gson);
    }

    public abstract List<Amenity> amenities();

    @SerializedName("guidemap")
    public abstract String guideMap();

    public abstract String name();

    public abstract String type();
}
