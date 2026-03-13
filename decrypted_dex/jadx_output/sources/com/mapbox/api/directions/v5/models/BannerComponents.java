package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.models.AutoValue_BannerComponents;
import com.mapbox.api.directions.v5.models.C$AutoValue_BannerComponents;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;
import java.util.List;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class BannerComponents extends DirectionsJsonObject implements Comparable<BannerComponents> {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract Builder abbreviation(String str);

        public abstract Builder abbreviationPriority(Integer num);

        public abstract Builder active(Boolean bool);

        public abstract Builder activeDirection(String str);

        public abstract BannerComponents build();

        public abstract Builder directions(List<String> list);

        public abstract Builder imageBaseUrl(String str);

        public abstract Builder imageUrl(String str);

        public abstract Builder mapboxShield(MapboxShield mapboxShield);

        public abstract Builder subType(String str);

        public abstract Builder text(String str);

        public abstract Builder type(String str);
    }

    public static Builder builder() {
        return new C$AutoValue_BannerComponents.Builder();
    }

    public static TypeAdapter<BannerComponents> typeAdapter(Gson gson) {
        return new AutoValue_BannerComponents.GsonTypeAdapter(gson);
    }

    @SerializedName("abbr")
    public abstract String abbreviation();

    @SerializedName("abbr_priority")
    public abstract Integer abbreviationPriority();

    public abstract Boolean active();

    @SerializedName("active_direction")
    public abstract String activeDirection();

    public abstract List<String> directions();

    @SerializedName("imageBaseURL")
    public abstract String imageBaseUrl();

    @SerializedName("imageURL")
    public abstract String imageUrl();

    @SerializedName("mapbox_shield")
    public abstract MapboxShield mapboxShield();

    public abstract String subType();

    public abstract String text();

    public abstract String type();

    @Override // java.lang.Comparable
    public int compareTo(BannerComponents bannerComponents) {
        Integer abbreviationPriority = abbreviationPriority();
        Integer abbreviationPriority2 = bannerComponents.abbreviationPriority();
        if (abbreviationPriority == null && abbreviationPriority2 == null) {
            return 0;
        }
        if (abbreviationPriority == null) {
            return 1;
        }
        if (abbreviationPriority2 == null) {
            return -1;
        }
        return abbreviationPriority.compareTo(abbreviationPriority2);
    }
}
