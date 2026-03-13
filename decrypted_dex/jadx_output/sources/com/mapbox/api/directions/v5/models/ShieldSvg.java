package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.mapbox.api.directions.v5.models.AutoValue_ShieldSvg;
import com.mapbox.api.directions.v5.models.C$AutoValue_ShieldSvg;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;
import java.io.Serializable;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class ShieldSvg extends DirectionsJsonObject implements Serializable {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract ShieldSvg build();

        public abstract Builder svg(String str);
    }

    public static Builder builder() {
        return new C$AutoValue_ShieldSvg.Builder();
    }

    public static TypeAdapter<ShieldSvg> typeAdapter(Gson gson) {
        return new AutoValue_ShieldSvg.GsonTypeAdapter(gson);
    }

    public abstract String svg();
}
