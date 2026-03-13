package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.mapbox.api.directions.v5.models.AutoValue_VoiceInstructions;
import com.mapbox.api.directions.v5.models.C$AutoValue_VoiceInstructions;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class VoiceInstructions extends DirectionsJsonObject {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract Builder announcement(String str);

        public abstract VoiceInstructions build();

        public abstract Builder distanceAlongGeometry(Double d8);

        public abstract Builder ssmlAnnouncement(String str);
    }

    public static Builder builder() {
        return new C$AutoValue_VoiceInstructions.Builder();
    }

    public static TypeAdapter<VoiceInstructions> typeAdapter(Gson gson) {
        return new AutoValue_VoiceInstructions.GsonTypeAdapter(gson);
    }

    public abstract String announcement();

    public abstract Double distanceAlongGeometry();

    public abstract String ssmlAnnouncement();
}
