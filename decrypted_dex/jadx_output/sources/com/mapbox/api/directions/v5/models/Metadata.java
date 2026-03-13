package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.models.AutoValue_Metadata;
import com.mapbox.api.directions.v5.models.C$AutoValue_Metadata;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;
import java.util.Map;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class Metadata extends DirectionsJsonObject {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract Metadata build();

        public abstract Builder infoMap(Map<String, String> map);
    }

    public static Builder builder() {
        return new C$AutoValue_Metadata.Builder();
    }

    public static TypeAdapter<Metadata> typeAdapter(Gson gson) {
        return new AutoValue_Metadata.GsonTypeAdapter(gson);
    }

    @SerializedName("map")
    public abstract Map<String, String> infoMap();
}
