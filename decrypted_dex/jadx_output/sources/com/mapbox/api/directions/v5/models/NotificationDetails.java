package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.models.AutoValue_NotificationDetails;
import com.mapbox.api.directions.v5.models.C$AutoValue_NotificationDetails;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class NotificationDetails extends DirectionsJsonObject {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        @SerializedName("actual_value")
        public abstract Builder actualValue(String str);

        public abstract NotificationDetails build();

        public abstract Builder message(String str);

        @SerializedName("requested_value")
        public abstract Builder requestedValue(String str);

        public abstract Builder unit(String str);
    }

    public static Builder builder() {
        return new C$AutoValue_NotificationDetails.Builder();
    }

    public static TypeAdapter<NotificationDetails> typeAdapter(Gson gson) {
        return new AutoValue_NotificationDetails.GsonTypeAdapter(gson);
    }

    @SerializedName("actual_value")
    public abstract String actualValue();

    public abstract String message();

    @SerializedName("requested_value")
    public abstract String requestedValue();

    public abstract String unit();
}
