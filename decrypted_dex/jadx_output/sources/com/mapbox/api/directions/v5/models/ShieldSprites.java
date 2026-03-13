package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.mapbox.api.directions.v5.models.AutoValue_ShieldSprites;
import com.mapbox.api.directions.v5.models.C$AutoValue_ShieldSprites;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;
import java.io.Serializable;
import java.util.List;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class ShieldSprites extends DirectionsJsonObject implements Serializable {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract ShieldSprites build();

        public abstract Builder sprites(List<ShieldSprite> list);
    }

    public static Builder builder() {
        return new C$AutoValue_ShieldSprites.Builder();
    }

    public static TypeAdapter<ShieldSprites> typeAdapter(Gson gson) {
        return new AutoValue_ShieldSprites.GsonTypeAdapter(gson);
    }

    public abstract List<ShieldSprite> sprites();
}
