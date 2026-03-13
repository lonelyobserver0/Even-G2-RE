package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.mapbox.api.directions.v5.models.AutoValue_MergingArea;
import com.mapbox.api.directions.v5.models.C$AutoValue_MergingArea;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class MergingArea extends DirectionsJsonObject {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract MergingArea build();

        public abstract Builder type(String str);
    }

    public static Builder builder() {
        return new C$AutoValue_MergingArea.Builder();
    }

    public static TypeAdapter<MergingArea> typeAdapter(Gson gson) {
        return new AutoValue_MergingArea.GsonTypeAdapter(gson);
    }

    public abstract String type();
}
