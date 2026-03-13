package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.models.AutoValue_MapboxStreetsV8;
import com.mapbox.api.directions.v5.models.C$AutoValue_MapboxStreetsV8;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class MapboxStreetsV8 extends DirectionsJsonObject {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract MapboxStreetsV8 build();

        public abstract Builder roadClass(String str);
    }

    public static Builder builder() {
        return new C$AutoValue_MapboxStreetsV8.Builder();
    }

    public static TypeAdapter<MapboxStreetsV8> typeAdapter(Gson gson) {
        return new AutoValue_MapboxStreetsV8.GsonTypeAdapter(gson);
    }

    @SerializedName("class")
    public abstract String roadClass();
}
