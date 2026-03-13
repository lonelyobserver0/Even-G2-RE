package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.models.AutoValue_IntersectionLaneAccess;
import com.mapbox.api.directions.v5.models.C$AutoValue_IntersectionLaneAccess;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;
import java.util.List;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class IntersectionLaneAccess extends DirectionsJsonObject {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract IntersectionLaneAccess build();

        public abstract Builder designated(List<String> list);
    }

    public static Builder builder() {
        return new C$AutoValue_IntersectionLaneAccess.Builder();
    }

    public static TypeAdapter<IntersectionLaneAccess> typeAdapter(Gson gson) {
        return new AutoValue_IntersectionLaneAccess.GsonTypeAdapter(gson.newBuilder().registerTypeAdapter(String.class, new InterningStringAdapter()).create());
    }

    @SerializedName("designated")
    public abstract List<String> designated();
}
