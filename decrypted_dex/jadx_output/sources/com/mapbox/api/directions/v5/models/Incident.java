package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.models.AutoValue_Incident;
import com.mapbox.api.directions.v5.models.C$AutoValue_Incident;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;
import java.util.List;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class Incident extends DirectionsJsonObject {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract Builder affectedRoadNames(List<String> list);

        public abstract Builder alertcCodes(List<Integer> list);

        public abstract Incident build();

        public abstract Builder closed(Boolean bool);

        public abstract Builder congestion(Congestion congestion);

        public abstract Builder countryCodeAlpha2(String str);

        public abstract Builder countryCodeAlpha3(String str);

        public abstract Builder creationTime(String str);

        public abstract Builder description(String str);

        public abstract Builder endTime(String str);

        public abstract Builder geometryIndexEnd(Integer num);

        public abstract Builder geometryIndexStart(Integer num);

        public abstract Builder id(String str);

        public abstract Builder impact(String str);

        public abstract Builder lanesBlocked(List<String> list);

        public abstract Builder longDescription(String str);

        public abstract Builder numLanesBlocked(Integer num);

        public abstract Builder startTime(String str);

        public abstract Builder subType(String str);

        public abstract Builder subTypeDescription(String str);

        public abstract Builder trafficCodes(TrafficCodes trafficCodes);

        public abstract Builder type(String str);
    }

    public static Builder builder() {
        return new C$AutoValue_Incident.Builder();
    }

    public static TypeAdapter<Incident> typeAdapter(Gson gson) {
        return new AutoValue_Incident.GsonTypeAdapter(gson);
    }

    @SerializedName("affected_road_names")
    public abstract List<String> affectedRoadNames();

    @SerializedName("alertc_codes")
    public abstract List<Integer> alertcCodes();

    public abstract Boolean closed();

    public abstract Congestion congestion();

    @SerializedName("iso_3166_1_alpha2")
    public abstract String countryCodeAlpha2();

    @SerializedName("iso_3166_1_alpha3")
    public abstract String countryCodeAlpha3();

    @SerializedName("creation_time")
    public abstract String creationTime();

    public abstract String description();

    @SerializedName("end_time")
    public abstract String endTime();

    @SerializedName("geometry_index_end")
    public abstract Integer geometryIndexEnd();

    @SerializedName("geometry_index_start")
    public abstract Integer geometryIndexStart();

    public abstract String id();

    public abstract String impact();

    @SerializedName("lanes_blocked")
    public abstract List<String> lanesBlocked();

    @SerializedName("long_description")
    public abstract String longDescription();

    @SerializedName("num_lanes_blocked")
    public abstract Integer numLanesBlocked();

    @SerializedName("start_time")
    public abstract String startTime();

    @SerializedName("sub_type")
    public abstract String subType();

    @SerializedName("sub_type_description")
    public abstract String subTypeDescription();

    public abstract Builder toBuilder();

    @SerializedName("traffic_codes")
    public abstract TrafficCodes trafficCodes();

    public abstract String type();
}
