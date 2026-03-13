package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.models.AutoValue_Notification;
import com.mapbox.api.directions.v5.models.C$AutoValue_Notification;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class Notification extends DirectionsJsonObject {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract Notification build();

        @SerializedName("station_id")
        public abstract Builder chargingStationId(String str);

        public abstract Builder details(NotificationDetails notificationDetails);

        @SerializedName("geometry_index")
        public abstract Builder geometryIndex(Integer num);

        @SerializedName("geometry_index_end")
        public abstract Builder geometryIndexEnd(Integer num);

        @SerializedName("geometry_index_start")
        public abstract Builder geometryIndexStart(Integer num);

        public abstract Builder reason(String str);

        @SerializedName("refresh_type")
        public abstract Builder refreshType(String str);

        public abstract Builder subtype(String str);

        public abstract Builder type(String str);
    }

    public static Builder builder() {
        return new C$AutoValue_Notification.Builder();
    }

    public static TypeAdapter<Notification> typeAdapter(Gson gson) {
        return new AutoValue_Notification.GsonTypeAdapter(gson);
    }

    @SerializedName("station_id")
    public abstract String chargingStationId();

    public abstract NotificationDetails details();

    @SerializedName("geometry_index")
    public abstract Integer geometryIndex();

    @SerializedName("geometry_index_end")
    public abstract Integer geometryIndexEnd();

    @SerializedName("geometry_index_start")
    public abstract Integer geometryIndexStart();

    public abstract String reason();

    @SerializedName("refresh_type")
    public abstract String refreshType();

    public abstract String subtype();

    public abstract Builder toBuilder();

    public abstract String type();
}
