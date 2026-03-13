package com.mapbox.api.directions.v5.models;

import E6.c;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.DirectionsAdapterFactory;
import com.mapbox.api.directions.v5.models.AutoValue_RouteOptions;
import com.mapbox.api.directions.v5.models.C$AutoValue_RouteOptions;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;
import com.mapbox.auto.value.gson.b;
import com.mapbox.geojson.Point;
import com.stub.StubApp;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class RouteOptions extends DirectionsJsonObject {
    private static final Set<String> DEPRECATED_SERIALIZED_FIELDS = Collections.unmodifiableSet(new HashSet<String>() { // from class: com.mapbox.api.directions.v5.models.RouteOptions.1
        {
            add(StubApp.getString2(5151));
            add(StubApp.getString2(11240));
        }
    });

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract Builder alleyBias(Double d8);

        public abstract Builder alternatives(Boolean bool);

        public abstract Builder annotations(String str);

        public Builder annotationsList(List<String> list) {
            annotations(c.d(StubApp.getString2(321), list));
            return this;
        }

        public abstract Builder approaches(String str);

        public Builder approachesList(List<String> list) {
            approaches(c.d(StubApp.getString2(1262), list));
            return this;
        }

        public abstract Builder arriveBy(String str);

        public abstract Builder avoidManeuverRadius(Double d8);

        public abstract Builder bannerInstructions(Boolean bool);

        public abstract Builder baseUrl(String str);

        public abstract Builder bearings(String str);

        public Builder bearingsList(List<Bearing> list) {
            String str = null;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Bearing bearing : list) {
                    if (bearing == null) {
                        arrayList.add(null);
                    } else {
                        double angle = bearing.angle();
                        double degrees = bearing.degrees();
                        Locale locale = Locale.US;
                        arrayList.add(c.a(angle) + StubApp.getString2(321) + c.a(degrees));
                    }
                }
                str = c.d(StubApp.getString2(1262), arrayList);
            }
            bearings(str);
            return this;
        }

        public abstract RouteOptions build();

        public abstract Builder computeTollCost(Boolean bool);

        public abstract Builder continueStraight(Boolean bool);

        public abstract Builder coordinates(String str);

        public Builder coordinatesList(List<Point> list) {
            String b2 = c.b(list);
            if (b2 == null) {
                b2 = "";
            }
            coordinates(b2);
            return this;
        }

        public abstract Builder departAt(String str);

        public abstract Builder enableRefresh(Boolean bool);

        public abstract Builder exclude(String str);

        public abstract Builder geometries(String str);

        public abstract Builder include(String str);

        public abstract Builder intersectionLinkAccess(Boolean bool);

        public abstract Builder intersectionLinkBridge(Boolean bool);

        public abstract Builder intersectionLinkElevated(Boolean bool);

        public abstract Builder intersectionLinkFormOfWay(Boolean bool);

        public abstract Builder intersectionLinkGeometry(String str);

        public abstract Builder language(String str);

        public abstract Builder layers(String str);

        public Builder layersList(List<Integer> list) {
            String str = null;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Integer num : list) {
                    if (num == null) {
                        arrayList.add(null);
                    } else {
                        arrayList.add(Integer.toString(num.intValue()));
                    }
                }
                str = c.d(StubApp.getString2(1262), arrayList);
            }
            layers(str);
            return this;
        }

        public abstract Builder maxHeight(Double d8);

        public abstract Builder maxWeight(Double d8);

        public abstract Builder maxWidth(Double d8);

        public abstract Builder metadata(Boolean bool);

        public abstract Builder notifications(String str);

        public abstract Builder overview(String str);

        public abstract Builder paymentMethods(String str);

        public abstract Builder profile(String str);

        public abstract Builder radiuses(String str);

        public Builder radiusesList(List<Double> list) {
            String str = null;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Double d8 : list) {
                    if (d8 == null) {
                        arrayList.add(null);
                    } else if (d8.doubleValue() == Double.POSITIVE_INFINITY) {
                        arrayList.add(StubApp.getString2(2866));
                    } else {
                        Locale locale = Locale.US;
                        arrayList.add(c.a(d8.doubleValue()));
                    }
                }
                str = c.d(StubApp.getString2(1262), arrayList);
            }
            radiuses(str);
            return this;
        }

        public abstract Builder roundaboutExits(Boolean bool);

        public abstract Builder snappingIncludeClosures(String str);

        public Builder snappingIncludeClosuresList(List<Boolean> list) {
            snappingIncludeClosures(c.d(StubApp.getString2(1262), list));
            return this;
        }

        public abstract Builder snappingIncludeStaticClosures(String str);

        public Builder snappingIncludeStaticClosuresList(List<Boolean> list) {
            snappingIncludeStaticClosures(c.d(StubApp.getString2(1262), list));
            return this;
        }

        public abstract Builder steps(Boolean bool);

        public abstract Builder suppressVoiceInstructionLocalNames(Boolean bool);

        public abstract Builder user(String str);

        public abstract Builder voiceInstructions(Boolean bool);

        public abstract Builder voiceUnits(String str);

        public abstract Builder walkingSpeed(Double d8);

        public abstract Builder walkwayBias(Double d8);

        public abstract Builder waypointIndices(String str);

        public Builder waypointIndicesList(List<Integer> list) {
            waypointIndices(c.d(StubApp.getString2(1262), list));
            return this;
        }

        public abstract Builder waypointNames(String str);

        public Builder waypointNamesList(List<String> list) {
            waypointNames(c.d(StubApp.getString2(1262), list));
            return this;
        }

        public abstract Builder waypointTargets(String str);

        public Builder waypointTargetsList(List<Point> list) {
            waypointTargets(c.b(list));
            return this;
        }

        public abstract Builder waypointsPerRoute(Boolean bool);
    }

    private static void appendQueryParameter(StringBuilder sb2, String str, Number number) {
        if (number != null) {
            appendQueryParameter(sb2, str, String.valueOf(number));
        }
    }

    public static Builder builder() {
        return new C$AutoValue_RouteOptions.Builder().baseUrl(StubApp.getString2(2971)).user(StubApp.getString2(13136)).geometries(StubApp.getString2(13137));
    }

    private static String escape(String str) {
        try {
            return URLEncoder.encode(str, StubApp.getString2("640"));
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static RouteOptions fromJsonString(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(DirectionsAdapterFactory.a());
        return (RouteOptions) gsonBuilder.create().fromJson(str, RouteOptions.class);
    }

    public static RouteOptions fromUrl(URL url) {
        String string2 = StubApp.getString2(640);
        JsonObject jsonObject = new JsonObject();
        String str = url.getProtocol() + StubApp.getString2(13138) + url.getHost();
        int port = url.getPort();
        if (port != -1) {
            str = str + StubApp.getString2(478) + port;
        }
        jsonObject.addProperty(StubApp.getString2(13079), str);
        try {
            String[] split = url.getPath().split(StubApp.getString2("601"));
            jsonObject.addProperty(StubApp.getString2("11522"), URLDecoder.decode(split[3], string2));
            jsonObject.addProperty(StubApp.getString2("5556"), URLDecoder.decode(split[4], string2));
            jsonObject.addProperty(StubApp.getString2("2042"), URLDecoder.decode(split[5], string2));
            for (String str2 : url.getQuery().split(StubApp.getString2("4965"))) {
                int indexOf = str2.indexOf(StubApp.getString2("2359"));
                String decode = URLDecoder.decode(str2.substring(0, indexOf), string2);
                String decode2 = URLDecoder.decode(str2.substring(indexOf + 1), string2);
                if (!decode.equals(StubApp.getString2("5151"))) {
                    jsonObject.addProperty(decode, decode2);
                }
            }
            return fromJsonString(jsonObject.toString());
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static TypeAdapter<RouteOptions> typeAdapter(Gson gson) {
        return new AutoValue_RouteOptions.GsonTypeAdapter(gson);
    }

    @SerializedName("alley_bias")
    public abstract Double alleyBias();

    public abstract Boolean alternatives();

    public abstract String annotations();

    public List<String> annotationsList() {
        String annotations = annotations();
        if (annotations == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : annotations.split(StubApp.getString2(321), -1)) {
            if (str.isEmpty()) {
                arrayList.add(null);
            } else {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public abstract String approaches();

    public List<String> approachesList() {
        String approaches = approaches();
        if (approaches == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : approaches.split(StubApp.getString2(1262), -1)) {
            if (str.isEmpty()) {
                arrayList.add(null);
            } else {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @SerializedName("arrive_by")
    public abstract String arriveBy();

    @SerializedName("avoid_maneuver_radius")
    public abstract Double avoidManeuverRadius();

    @SerializedName("banner_instructions")
    public abstract Boolean bannerInstructions();

    public abstract String baseUrl();

    public abstract String bearings();

    public List<Bearing> bearingsList() {
        return c.e(bearings(), c.f1926c);
    }

    @SerializedName("compute_toll_cost")
    public abstract Boolean computeTollCost();

    @SerializedName("continue_straight")
    public abstract Boolean continueStraight();

    public abstract String coordinates();

    public List<Point> coordinatesList() {
        return c.e(coordinates(), c.f1924a);
    }

    @SerializedName("depart_at")
    public abstract String departAt();

    @SerializedName("enable_refresh")
    public abstract Boolean enableRefresh();

    public abstract String exclude();

    public abstract String geometries();

    public abstract String include();

    @SerializedName("intersection_link_access")
    public abstract Boolean intersectionLinkAccess();

    @SerializedName("intersection_link_bridge")
    public abstract Boolean intersectionLinkBridge();

    @SerializedName("intersection_link_elevated")
    public abstract Boolean intersectionLinkElevated();

    @SerializedName("intersection_link_form_of_way")
    public abstract Boolean intersectionLinkFormOfWay();

    @SerializedName("intersection_link_geometry")
    public abstract String intersectionLinkGeometry();

    public abstract String language();

    public abstract String layers();

    public List<Integer> layersList() {
        String layers = layers();
        if (layers == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : layers.split(StubApp.getString2(1262), -1)) {
            if (str.isEmpty()) {
                arrayList.add(null);
            } else {
                arrayList.add(Integer.valueOf(str));
            }
        }
        return arrayList;
    }

    @SerializedName("max_height")
    public abstract Double maxHeight();

    @SerializedName("max_weight")
    public abstract Double maxWeight();

    @SerializedName("max_width")
    public abstract Double maxWidth();

    @SerializedName("metadata")
    public abstract Boolean metadata();

    public abstract String notifications();

    public abstract String overview();

    @SerializedName("payment_methods")
    public abstract String paymentMethods();

    public abstract String profile();

    public abstract String radiuses();

    public List<Double> radiusesList() {
        String radiuses = radiuses();
        if (radiuses == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : radiuses.split(StubApp.getString2(1262), -1)) {
            if (str.isEmpty()) {
                arrayList.add(null);
            } else {
                arrayList.add(str.equals(StubApp.getString2(2866)) ? Double.valueOf(Double.POSITIVE_INFINITY) : Double.valueOf(str));
            }
        }
        return arrayList;
    }

    @SerializedName("roundabout_exits")
    public abstract Boolean roundaboutExits();

    @SerializedName("snapping_include_closures")
    public abstract String snappingIncludeClosures();

    public List<Boolean> snappingIncludeClosuresList() {
        return c.e(snappingIncludeClosures(), c.f1925b);
    }

    @SerializedName("snapping_include_static_closures")
    public abstract String snappingIncludeStaticClosures();

    public List<Boolean> snappingIncludeStaticClosuresList() {
        return c.e(snappingIncludeStaticClosures(), c.f1925b);
    }

    public abstract Boolean steps();

    @SerializedName("suppress_voice_instruction_local_names")
    public abstract Boolean suppressVoiceInstructionLocalNames();

    public abstract Builder toBuilder();

    public URL toUrl(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(baseUrl());
        if (!Character.valueOf(baseUrl().charAt(baseUrl().length() - 1)).equals('/')) {
            sb2.append('/');
        }
        sb2.append(StubApp.getString2(13139));
        String user = user();
        String string2 = StubApp.getString2(601);
        sb2.append(string2 + user);
        sb2.append(string2 + profile());
        sb2.append(string2 + coordinates());
        sb2.append(StubApp.getString2(13140) + str);
        sb2.append(StubApp.getString2(13141) + geometries());
        appendQueryParameter(sb2, StubApp.getString2(13080), alternatives());
        appendQueryParameter(sb2, StubApp.getString2(13085), overview());
        appendQueryParameter(sb2, StubApp.getString2(13081), radiuses());
        appendQueryParameter(sb2, StubApp.getString2(13050), steps());
        appendQueryParameter(sb2, StubApp.getString2(13073), avoidManeuverRadius());
        appendQueryParameter(sb2, StubApp.getString2(13082), bearings());
        appendQueryParameter(sb2, StubApp.getString2(13083), layers());
        appendQueryParameter(sb2, StubApp.getString2(13067), continueStraight());
        appendQueryParameter(sb2, StubApp.getString2(13086), annotations());
        appendQueryParameter(sb2, StubApp.getString2(1142), language());
        appendQueryParameter(sb2, StubApp.getString2(13052), roundaboutExits());
        appendQueryParameter(sb2, StubApp.getString2(13076), voiceInstructions());
        appendQueryParameter(sb2, StubApp.getString2(13078), bannerInstructions());
        appendQueryParameter(sb2, StubApp.getString2(13065), voiceUnits());
        appendQueryParameter(sb2, StubApp.getString2(13087), exclude());
        appendQueryParameter(sb2, StubApp.getString2(13088), include());
        appendQueryParameter(sb2, StubApp.getString2(13089), approaches());
        appendQueryParameter(sb2, StubApp.getString2(1913), waypointIndices());
        appendQueryParameter(sb2, StubApp.getString2(13062), waypointNames());
        appendQueryParameter(sb2, StubApp.getString2(13072), waypointTargets());
        appendQueryParameter(sb2, StubApp.getString2(13069), enableRefresh());
        appendQueryParameter(sb2, StubApp.getString2(13063), walkingSpeed());
        appendQueryParameter(sb2, StubApp.getString2(13061), walkwayBias());
        appendQueryParameter(sb2, StubApp.getString2(13077), alleyBias());
        appendQueryParameter(sb2, StubApp.getString2(13066), snappingIncludeClosures());
        appendQueryParameter(sb2, StubApp.getString2(13053), snappingIncludeStaticClosures());
        appendQueryParameter(sb2, StubApp.getString2(13074), arriveBy());
        appendQueryParameter(sb2, StubApp.getString2(13075), departAt());
        appendQueryParameter(sb2, StubApp.getString2(13058), maxHeight());
        appendQueryParameter(sb2, StubApp.getString2(13068), maxWidth());
        appendQueryParameter(sb2, StubApp.getString2(13054), maxWeight());
        appendQueryParameter(sb2, StubApp.getString2(13056), computeTollCost());
        appendQueryParameter(sb2, StubApp.getString2(13064), waypointsPerRoute());
        appendQueryParameter(sb2, StubApp.getString2(2127), metadata());
        appendQueryParameter(sb2, StubApp.getString2(13004), paymentMethods());
        appendQueryParameter(sb2, StubApp.getString2(2114), notifications());
        appendQueryParameter(sb2, StubApp.getString2(13070), suppressVoiceInstructionLocalNames());
        appendQueryParameter(sb2, StubApp.getString2(13055), intersectionLinkFormOfWay());
        appendQueryParameter(sb2, StubApp.getString2(13060), intersectionLinkGeometry());
        appendQueryParameter(sb2, StubApp.getString2(13059), intersectionLinkAccess());
        appendQueryParameter(sb2, StubApp.getString2(13071), intersectionLinkElevated());
        appendQueryParameter(sb2, StubApp.getString2(13057), intersectionLinkBridge());
        Map<String, b> unrecognized = unrecognized();
        if (unrecognized != null) {
            for (Map.Entry<String, b> entry : unrecognized.entrySet()) {
                JsonElement jsonElement = entry.getValue().f12374a;
                if (!DEPRECATED_SERIALIZED_FIELDS.contains(entry.getKey())) {
                    if (!jsonElement.isJsonPrimitive()) {
                        throw new IllegalStateException(String.format(StubApp.getString2(13142), entry.getKey()));
                    }
                    appendQueryParameter(sb2, entry.getKey(), jsonElement.getAsString());
                }
            }
        }
        try {
            return new URL(sb2.toString());
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public abstract String user();

    @SerializedName("voice_instructions")
    public abstract Boolean voiceInstructions();

    @SerializedName("voice_units")
    public abstract String voiceUnits();

    @SerializedName("walking_speed")
    public abstract Double walkingSpeed();

    @SerializedName("walkway_bias")
    public abstract Double walkwayBias();

    @SerializedName("waypoints")
    public abstract String waypointIndices();

    public List<Integer> waypointIndicesList() {
        String waypointIndices = waypointIndices();
        if (waypointIndices == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : waypointIndices.split(StubApp.getString2(1262), -1)) {
            if (str.isEmpty()) {
                arrayList.add(null);
            } else {
                arrayList.add(Integer.valueOf(str));
            }
        }
        return arrayList;
    }

    @SerializedName("waypoint_names")
    public abstract String waypointNames();

    public List<String> waypointNamesList() {
        String waypointNames = waypointNames();
        if (waypointNames == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : waypointNames.split(StubApp.getString2(1262), -1)) {
            if (str.isEmpty()) {
                arrayList.add(null);
            } else {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @SerializedName("waypoint_targets")
    public abstract String waypointTargets();

    public List<Point> waypointTargetsList() {
        return c.e(waypointTargets(), c.f1924a);
    }

    @SerializedName("waypoints_per_route")
    public abstract Boolean waypointsPerRoute();

    private static void appendQueryParameter(StringBuilder sb2, String str, Boolean bool) {
        if (bool != null) {
            appendQueryParameter(sb2, str, String.valueOf(bool));
        }
    }

    private static void appendQueryParameter(StringBuilder sb2, String str, String str2) {
        if (str2 != null) {
            sb2.append(StubApp.getString2(4965));
            sb2.append(str);
            sb2.append(StubApp.getString2(2359));
            sb2.append(escape(str2));
        }
    }
}
