package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.models.AutoValue_IntersectionLanes;
import com.mapbox.api.directions.v5.models.C$AutoValue_IntersectionLanes;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;
import java.util.List;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class IntersectionLanes extends DirectionsJsonObject {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract Builder access(IntersectionLaneAccess intersectionLaneAccess);

        public abstract Builder active(Boolean bool);

        public abstract IntersectionLanes build();

        public abstract Builder indications(List<String> list);

        public abstract Builder paymentMethods(List<String> list);

        public abstract Builder valid(Boolean bool);

        public abstract Builder validIndication(String str);
    }

    public static Builder builder() {
        return new C$AutoValue_IntersectionLanes.Builder();
    }

    public static TypeAdapter<IntersectionLanes> typeAdapter(Gson gson) {
        return new AutoValue_IntersectionLanes.GsonTypeAdapter(gson.newBuilder().registerTypeAdapter(String.class, new InterningStringAdapter()).create());
    }

    @SerializedName("access")
    public abstract IntersectionLaneAccess access();

    public abstract Boolean active();

    public abstract List<String> indications();

    @SerializedName("payment_methods")
    public abstract List<String> paymentMethods();

    public abstract Boolean valid();

    @SerializedName("valid_indication")
    public abstract String validIndication();
}
