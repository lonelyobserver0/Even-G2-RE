package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.mapbox.api.directions.v5.models.AutoValue_ShieldSprite;
import com.mapbox.api.directions.v5.models.C$AutoValue_ShieldSprite;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;
import java.io.Serializable;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class ShieldSprite extends DirectionsJsonObject implements Serializable {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract ShieldSprite build();

        public abstract Builder spriteAttributes(ShieldSpriteAttribute shieldSpriteAttribute);

        public abstract Builder spriteName(String str);
    }

    public static Builder builder() {
        return new C$AutoValue_ShieldSprite.Builder();
    }

    public static TypeAdapter<ShieldSprite> typeAdapter(Gson gson) {
        return new AutoValue_ShieldSprite.GsonTypeAdapter(gson);
    }

    public abstract ShieldSpriteAttribute spriteAttributes();

    public abstract String spriteName();
}
