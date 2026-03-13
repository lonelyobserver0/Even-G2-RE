package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.models.AutoValue_Admin;
import com.mapbox.api.directions.v5.models.C$AutoValue_Admin;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class Admin extends DirectionsJsonObject {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract Admin build();

        public abstract Builder countryCode(String str);

        public abstract Builder countryCodeAlpha3(String str);
    }

    public static Builder builder() {
        return new C$AutoValue_Admin.Builder();
    }

    public static TypeAdapter<Admin> typeAdapter(Gson gson) {
        return new AutoValue_Admin.GsonTypeAdapter(gson);
    }

    @SerializedName("iso_3166_1")
    public abstract String countryCode();

    @SerializedName("iso_3166_1_alpha3")
    public abstract String countryCodeAlpha3();
}
