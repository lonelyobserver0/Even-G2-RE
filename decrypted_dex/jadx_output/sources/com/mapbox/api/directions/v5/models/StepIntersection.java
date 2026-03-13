package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.models.AutoValue_StepIntersection;
import com.mapbox.api.directions.v5.models.C$AutoValue_StepIntersection;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;
import com.mapbox.geojson.Point;
import java.util.List;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class StepIntersection extends DirectionsJsonObject {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract Builder access(List<Integer> list);

        public abstract Builder adminIndex(Integer num);

        public abstract Builder bearings(List<Integer> list);

        public abstract Builder bridges(List<Boolean> list);

        public abstract StepIntersection build();

        public abstract Builder classes(List<String> list);

        public abstract Builder duration(Double d8);

        public abstract Builder elevated(List<Boolean> list);

        public abstract Builder entry(List<Boolean> list);

        public abstract Builder formOfWay(List<String> list);

        public abstract Builder geometries(List<String> list);

        public abstract Builder geometryIndex(Integer num);

        public abstract Builder in(Integer num);

        public abstract Builder interchange(Interchange interchange);

        public abstract Builder isUrban(Boolean bool);

        public abstract Builder junction(Junction junction);

        public abstract Builder lanes(List<IntersectionLanes> list);

        public abstract Builder mapboxStreetsV8(MapboxStreetsV8 mapboxStreetsV8);

        public abstract Builder mergingArea(MergingArea mergingArea);

        public abstract Builder out(Integer num);

        public abstract Builder railwayCrossing(Boolean bool);

        public abstract Builder rawLocation(double[] dArr);

        public abstract Builder restStop(RestStop restStop);

        public abstract Builder stopSign(Boolean bool);

        public abstract Builder tollCollection(TollCollection tollCollection);

        public abstract Builder trafficSignal(Boolean bool);

        public abstract Builder tunnelName(String str);

        public abstract Builder yieldSign(Boolean bool);
    }

    public static Builder builder() {
        return new C$AutoValue_StepIntersection.Builder();
    }

    public static TypeAdapter<StepIntersection> typeAdapter(Gson gson) {
        return new AutoValue_StepIntersection.GsonTypeAdapter(gson);
    }

    @SerializedName("access")
    public abstract List<Integer> access();

    @SerializedName("admin_index")
    public abstract Integer adminIndex();

    public abstract List<Integer> bearings();

    @SerializedName("bridges")
    public abstract List<Boolean> bridges();

    public abstract List<String> classes();

    @SerializedName("duration")
    public abstract Double duration();

    @SerializedName("elevated")
    public abstract List<Boolean> elevated();

    public abstract List<Boolean> entry();

    @SerializedName("form_of_way")
    public abstract List<String> formOfWay();

    @SerializedName("geometries")
    public abstract List<String> geometries();

    @SerializedName("geometry_index")
    public abstract Integer geometryIndex();

    public abstract Integer in();

    @SerializedName("ic")
    public abstract Interchange interchange();

    @SerializedName("is_urban")
    public abstract Boolean isUrban();

    @SerializedName("jct")
    public abstract Junction junction();

    public abstract List<IntersectionLanes> lanes();

    public Point location() {
        return Point.fromLngLat(rawLocation()[0], rawLocation()[1]);
    }

    @SerializedName("mapbox_streets_v8")
    public abstract MapboxStreetsV8 mapboxStreetsV8();

    @SerializedName("merging_area")
    public abstract MergingArea mergingArea();

    public abstract Integer out();

    @SerializedName("railway_crossing")
    public abstract Boolean railwayCrossing();

    @SerializedName("location")
    public abstract double[] rawLocation();

    @SerializedName("rest_stop")
    public abstract RestStop restStop();

    @SerializedName("stop_sign")
    public abstract Boolean stopSign();

    @SerializedName("toll_collection")
    public abstract TollCollection tollCollection();

    @SerializedName("traffic_signal")
    public abstract Boolean trafficSignal();

    @SerializedName("tunnel_name")
    public abstract String tunnelName();

    @SerializedName("yield_sign")
    public abstract Boolean yieldSign();
}
