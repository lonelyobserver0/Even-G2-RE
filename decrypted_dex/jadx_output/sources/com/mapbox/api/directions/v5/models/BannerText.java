package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.models.AutoValue_BannerText;
import com.mapbox.api.directions.v5.models.C$AutoValue_BannerText;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;
import java.util.List;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class BannerText extends DirectionsJsonObject {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract BannerText build();

        public abstract Builder components(List<BannerComponents> list);

        public abstract Builder degrees(Double d8);

        public abstract Builder drivingSide(String str);

        public abstract Builder modifier(String str);

        public abstract Builder text(String str);

        public abstract Builder type(String str);
    }

    public static Builder builder() {
        return new C$AutoValue_BannerText.Builder();
    }

    public static TypeAdapter<BannerText> typeAdapter(Gson gson) {
        return new AutoValue_BannerText.GsonTypeAdapter(gson);
    }

    public abstract List<BannerComponents> components();

    public abstract Double degrees();

    @SerializedName("driving_side")
    public abstract String drivingSide();

    public abstract String modifier();

    public abstract String text();

    public abstract String type();
}
