package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.mapbox.api.directions.v5.models.AutoValue_BannerInstructions;
import com.mapbox.api.directions.v5.models.C$AutoValue_BannerInstructions;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class BannerInstructions extends DirectionsJsonObject {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract BannerInstructions build();

        public abstract Builder distanceAlongGeometry(double d8);

        public abstract Builder primary(BannerText bannerText);

        public abstract Builder secondary(BannerText bannerText);

        public abstract Builder sub(BannerText bannerText);

        public abstract Builder view(BannerView bannerView);
    }

    public static Builder builder() {
        return new C$AutoValue_BannerInstructions.Builder();
    }

    public static TypeAdapter<BannerInstructions> typeAdapter(Gson gson) {
        return new AutoValue_BannerInstructions.GsonTypeAdapter(gson);
    }

    public abstract double distanceAlongGeometry();

    public abstract BannerText primary();

    public abstract BannerText secondary();

    public abstract BannerText sub();

    public abstract Builder toBuilder();

    public abstract BannerView view();
}
