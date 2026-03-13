package com.mapbox.api.directions.v5.models;

import E1.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_DirectionsRoute extends C$AutoValue_DirectionsRoute {

    public static final class GsonTypeAdapter extends TypeAdapter<DirectionsRoute> {
        private volatile TypeAdapter<Double> double__adapter;
        private final Gson gson;
        private volatile TypeAdapter<List<DirectionsWaypoint>> list__directionsWaypoint_adapter;
        private volatile TypeAdapter<List<RouteLeg>> list__routeLeg_adapter;
        private volatile TypeAdapter<List<TollCost>> list__tollCost_adapter;
        private volatile TypeAdapter<RouteOptions> routeOptions_adapter;
        private volatile TypeAdapter<String> string_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(12983);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public DirectionsRoute read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            DirectionsRoute.Builder builder = DirectionsRoute.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    nextName.getClass();
                    char c10 = 65535;
                    switch (nextName.hashCode()) {
                        case -1410342875:
                            if (nextName.equals(StubApp.getString2(12982))) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case -958988734:
                            if (nextName.equals(StubApp.getString2(12981))) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case -264720852:
                            if (nextName.equals(StubApp.getString2(2087))) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 2077998066:
                            if (nextName.equals(StubApp.getString2(2088))) {
                                c10 = 3;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            TypeAdapter<Double> typeAdapter = this.double__adapter;
                            if (typeAdapter == null) {
                                typeAdapter = this.gson.getAdapter(Double.class);
                                this.double__adapter = typeAdapter;
                            }
                            builder.durationTypical(typeAdapter.read2(jsonReader));
                            break;
                        case 1:
                            TypeAdapter<List<TollCost>> typeAdapter2 = this.list__tollCost_adapter;
                            if (typeAdapter2 == null) {
                                typeAdapter2 = this.gson.getAdapter(TypeToken.getParameterized(List.class, TollCost.class));
                                this.list__tollCost_adapter = typeAdapter2;
                            }
                            builder.tollCosts(typeAdapter2.read2(jsonReader));
                            break;
                        case 2:
                            TypeAdapter<String> typeAdapter3 = this.string_adapter;
                            if (typeAdapter3 == null) {
                                typeAdapter3 = this.gson.getAdapter(String.class);
                                this.string_adapter = typeAdapter3;
                            }
                            builder.voiceLanguage(typeAdapter3.read2(jsonReader));
                            break;
                        case 3:
                            TypeAdapter<String> typeAdapter4 = this.string_adapter;
                            if (typeAdapter4 == null) {
                                typeAdapter4 = this.gson.getAdapter(String.class);
                                this.string_adapter = typeAdapter4;
                            }
                            builder.weightName(typeAdapter4.read2(jsonReader));
                            break;
                        default:
                            if (!StubApp.getString2(2089).equals(nextName)) {
                                if (!StubApp.getString2(2090).equals(nextName)) {
                                    if (!StubApp.getString2(2091).equals(nextName)) {
                                        if (!StubApp.getString2(2092).equals(nextName)) {
                                            if (!StubApp.getString2(2093).equals(nextName)) {
                                                if (!StubApp.getString2(2075).equals(nextName)) {
                                                    if (!StubApp.getString2(1913).equals(nextName)) {
                                                        if (!StubApp.getString2(2095).equals(nextName)) {
                                                            if (!StubApp.getString2(2096).equals(nextName)) {
                                                                if (linkedHashMap == null) {
                                                                    linkedHashMap = new LinkedHashMap();
                                                                    builder.unrecognized(linkedHashMap);
                                                                }
                                                                a.t((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, nextName);
                                                                break;
                                                            } else {
                                                                TypeAdapter<String> typeAdapter5 = this.string_adapter;
                                                                if (typeAdapter5 == null) {
                                                                    typeAdapter5 = this.gson.getAdapter(String.class);
                                                                    this.string_adapter = typeAdapter5;
                                                                }
                                                                builder.requestUuid(typeAdapter5.read2(jsonReader));
                                                                break;
                                                            }
                                                        } else {
                                                            TypeAdapter<RouteOptions> typeAdapter6 = this.routeOptions_adapter;
                                                            if (typeAdapter6 == null) {
                                                                typeAdapter6 = this.gson.getAdapter(RouteOptions.class);
                                                                this.routeOptions_adapter = typeAdapter6;
                                                            }
                                                            builder.routeOptions(typeAdapter6.read2(jsonReader));
                                                            break;
                                                        }
                                                    } else {
                                                        TypeAdapter<List<DirectionsWaypoint>> typeAdapter7 = this.list__directionsWaypoint_adapter;
                                                        if (typeAdapter7 == null) {
                                                            typeAdapter7 = this.gson.getAdapter(TypeToken.getParameterized(List.class, DirectionsWaypoint.class));
                                                            this.list__directionsWaypoint_adapter = typeAdapter7;
                                                        }
                                                        builder.waypoints(typeAdapter7.read2(jsonReader));
                                                        break;
                                                    }
                                                } else {
                                                    TypeAdapter<List<RouteLeg>> typeAdapter8 = this.list__routeLeg_adapter;
                                                    if (typeAdapter8 == null) {
                                                        typeAdapter8 = this.gson.getAdapter(TypeToken.getParameterized(List.class, RouteLeg.class));
                                                        this.list__routeLeg_adapter = typeAdapter8;
                                                    }
                                                    builder.legs(typeAdapter8.read2(jsonReader));
                                                    break;
                                                }
                                            } else {
                                                TypeAdapter<Double> typeAdapter9 = this.double__adapter;
                                                if (typeAdapter9 == null) {
                                                    typeAdapter9 = this.gson.getAdapter(Double.class);
                                                    this.double__adapter = typeAdapter9;
                                                }
                                                builder.weight(typeAdapter9.read2(jsonReader));
                                                break;
                                            }
                                        } else {
                                            TypeAdapter<String> typeAdapter10 = this.string_adapter;
                                            if (typeAdapter10 == null) {
                                                typeAdapter10 = this.gson.getAdapter(String.class);
                                                this.string_adapter = typeAdapter10;
                                            }
                                            builder.geometry(typeAdapter10.read2(jsonReader));
                                            break;
                                        }
                                    } else {
                                        TypeAdapter<Double> typeAdapter11 = this.double__adapter;
                                        if (typeAdapter11 == null) {
                                            typeAdapter11 = this.gson.getAdapter(Double.class);
                                            this.double__adapter = typeAdapter11;
                                        }
                                        builder.duration(typeAdapter11.read2(jsonReader));
                                        break;
                                    }
                                } else {
                                    TypeAdapter<Double> typeAdapter12 = this.double__adapter;
                                    if (typeAdapter12 == null) {
                                        typeAdapter12 = this.gson.getAdapter(Double.class);
                                        this.double__adapter = typeAdapter12;
                                    }
                                    builder.distance(typeAdapter12.read2(jsonReader));
                                    break;
                                }
                            } else {
                                TypeAdapter<String> typeAdapter13 = this.string_adapter;
                                if (typeAdapter13 == null) {
                                    typeAdapter13 = this.gson.getAdapter(String.class);
                                    this.string_adapter = typeAdapter13;
                                }
                                builder.routeIndex(typeAdapter13.read2(jsonReader));
                                break;
                            }
                    }
                } else {
                    jsonReader.nextNull();
                }
            }
            jsonReader.endObject();
            return builder.build();
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, DirectionsRoute directionsRoute) throws IOException {
            if (directionsRoute == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (directionsRoute.unrecognized() != null) {
                for (Map.Entry<String, b> entry : directionsRoute.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(2089));
            if (directionsRoute.routeIndex() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.string_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, directionsRoute.routeIndex());
            }
            jsonWriter.name(StubApp.getString2(2090));
            if (directionsRoute.distance() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter2 = this.double__adapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(Double.class);
                    this.double__adapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, directionsRoute.distance());
            }
            jsonWriter.name(StubApp.getString2(2091));
            if (directionsRoute.duration() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter3 = this.double__adapter;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.gson.getAdapter(Double.class);
                    this.double__adapter = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, directionsRoute.duration());
            }
            jsonWriter.name(StubApp.getString2(12982));
            if (directionsRoute.durationTypical() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter4 = this.double__adapter;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.gson.getAdapter(Double.class);
                    this.double__adapter = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, directionsRoute.durationTypical());
            }
            jsonWriter.name(StubApp.getString2(2092));
            if (directionsRoute.geometry() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter5 = this.string_adapter;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, directionsRoute.geometry());
            }
            jsonWriter.name(StubApp.getString2(2093));
            if (directionsRoute.weight() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter6 = this.double__adapter;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.gson.getAdapter(Double.class);
                    this.double__adapter = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, directionsRoute.weight());
            }
            jsonWriter.name(StubApp.getString2(2088));
            if (directionsRoute.weightName() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter7 = this.string_adapter;
                if (typeAdapter7 == null) {
                    typeAdapter7 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter7;
                }
                typeAdapter7.write(jsonWriter, directionsRoute.weightName());
            }
            jsonWriter.name(StubApp.getString2(2075));
            if (directionsRoute.legs() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<RouteLeg>> typeAdapter8 = this.list__routeLeg_adapter;
                if (typeAdapter8 == null) {
                    typeAdapter8 = this.gson.getAdapter(TypeToken.getParameterized(List.class, RouteLeg.class));
                    this.list__routeLeg_adapter = typeAdapter8;
                }
                typeAdapter8.write(jsonWriter, directionsRoute.legs());
            }
            jsonWriter.name(StubApp.getString2(1913));
            if (directionsRoute.waypoints() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<DirectionsWaypoint>> typeAdapter9 = this.list__directionsWaypoint_adapter;
                if (typeAdapter9 == null) {
                    typeAdapter9 = this.gson.getAdapter(TypeToken.getParameterized(List.class, DirectionsWaypoint.class));
                    this.list__directionsWaypoint_adapter = typeAdapter9;
                }
                typeAdapter9.write(jsonWriter, directionsRoute.waypoints());
            }
            jsonWriter.name(StubApp.getString2(2095));
            if (directionsRoute.routeOptions() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<RouteOptions> typeAdapter10 = this.routeOptions_adapter;
                if (typeAdapter10 == null) {
                    typeAdapter10 = this.gson.getAdapter(RouteOptions.class);
                    this.routeOptions_adapter = typeAdapter10;
                }
                typeAdapter10.write(jsonWriter, directionsRoute.routeOptions());
            }
            jsonWriter.name(StubApp.getString2(2087));
            if (directionsRoute.voiceLanguage() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter11 = this.string_adapter;
                if (typeAdapter11 == null) {
                    typeAdapter11 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter11;
                }
                typeAdapter11.write(jsonWriter, directionsRoute.voiceLanguage());
            }
            jsonWriter.name(StubApp.getString2(2096));
            if (directionsRoute.requestUuid() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter12 = this.string_adapter;
                if (typeAdapter12 == null) {
                    typeAdapter12 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter12;
                }
                typeAdapter12.write(jsonWriter, directionsRoute.requestUuid());
            }
            jsonWriter.name(StubApp.getString2(12981));
            if (directionsRoute.tollCosts() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<TollCost>> typeAdapter13 = this.list__tollCost_adapter;
                if (typeAdapter13 == null) {
                    typeAdapter13 = this.gson.getAdapter(TypeToken.getParameterized(List.class, TollCost.class));
                    this.list__tollCost_adapter = typeAdapter13;
                }
                typeAdapter13.write(jsonWriter, directionsRoute.tollCosts());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_DirectionsRoute(Map<String, b> map, String str, Double d8, Double d10, Double d11, String str2, Double d12, String str3, List<RouteLeg> list, List<DirectionsWaypoint> list2, RouteOptions routeOptions, String str4, String str5, List<TollCost> list3) {
        new DirectionsRoute(map, str, d8, d10, d11, str2, d12, str3, list, list2, routeOptions, str4, str5, list3) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_DirectionsRoute
            private final Double distance;
            private final Double duration;
            private final Double durationTypical;
            private final String geometry;
            private final List<RouteLeg> legs;
            private final String requestUuid;
            private final String routeIndex;
            private final RouteOptions routeOptions;
            private final List<TollCost> tollCosts;
            private final Map<String, b> unrecognized;
            private final String voiceLanguage;
            private final List<DirectionsWaypoint> waypoints;
            private final Double weight;
            private final String weightName;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_DirectionsRoute$1, reason: invalid class name */
            public static /* synthetic */ class AnonymousClass1 {
            }

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_DirectionsRoute$Builder */
            public static class Builder extends DirectionsRoute.Builder {
                private Double distance;
                private Double duration;
                private Double durationTypical;
                private String geometry;
                private List<RouteLeg> legs;
                private String requestUuid;
                private String routeIndex;
                private RouteOptions routeOptions;
                private List<TollCost> tollCosts;
                private Map<String, b> unrecognized;
                private String voiceLanguage;
                private List<DirectionsWaypoint> waypoints;
                private Double weight;
                private String weightName;

                public /* synthetic */ Builder(DirectionsRoute directionsRoute, AnonymousClass1 anonymousClass1) {
                    this(directionsRoute);
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsRoute.Builder
                public DirectionsRoute build() {
                    String string2 = this.distance == null ? StubApp.getString2(2098) : "";
                    if (this.duration == null) {
                        string2 = AbstractC1482f.g(string2, StubApp.getString2(2099));
                    }
                    if (string2.isEmpty()) {
                        return new AutoValue_DirectionsRoute(this.unrecognized, this.routeIndex, this.distance, this.duration, this.durationTypical, this.geometry, this.weight, this.weightName, this.legs, this.waypoints, this.routeOptions, this.voiceLanguage, this.requestUuid, this.tollCosts);
                    }
                    throw new IllegalStateException(StubApp.getString2(555).concat(string2));
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsRoute.Builder
                public DirectionsRoute.Builder distance(Double d8) {
                    if (d8 == null) {
                        throw new NullPointerException(StubApp.getString2(12736));
                    }
                    this.distance = d8;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsRoute.Builder
                public DirectionsRoute.Builder duration(Double d8) {
                    if (d8 == null) {
                        throw new NullPointerException(StubApp.getString2(12737));
                    }
                    this.duration = d8;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsRoute.Builder
                public DirectionsRoute.Builder durationTypical(Double d8) {
                    this.durationTypical = d8;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsRoute.Builder
                public DirectionsRoute.Builder geometry(String str) {
                    this.geometry = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsRoute.Builder
                public DirectionsRoute.Builder legs(List<RouteLeg> list) {
                    this.legs = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsRoute.Builder
                public DirectionsRoute.Builder requestUuid(String str) {
                    this.requestUuid = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsRoute.Builder
                public DirectionsRoute.Builder routeIndex(String str) {
                    this.routeIndex = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsRoute.Builder
                public DirectionsRoute.Builder routeOptions(RouteOptions routeOptions) {
                    this.routeOptions = routeOptions;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsRoute.Builder
                public DirectionsRoute.Builder tollCosts(List<TollCost> list) {
                    this.tollCosts = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ DirectionsRoute.Builder unrecognized(Map map) {
                    return unrecognized2((Map<String, b>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsRoute.Builder
                public DirectionsRoute.Builder voiceLanguage(String str) {
                    this.voiceLanguage = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsRoute.Builder
                public DirectionsRoute.Builder waypoints(List<DirectionsWaypoint> list) {
                    this.waypoints = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsRoute.Builder
                public DirectionsRoute.Builder weight(Double d8) {
                    this.weight = d8;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsRoute.Builder
                public DirectionsRoute.Builder weightName(String str) {
                    this.weightName = str;
                    return this;
                }

                public Builder() {
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                /* renamed from: unrecognized, reason: avoid collision after fix types in other method */
                public DirectionsRoute.Builder unrecognized2(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }

                private Builder(DirectionsRoute directionsRoute) {
                    this.unrecognized = directionsRoute.unrecognized();
                    this.routeIndex = directionsRoute.routeIndex();
                    this.distance = directionsRoute.distance();
                    this.duration = directionsRoute.duration();
                    this.durationTypical = directionsRoute.durationTypical();
                    this.geometry = directionsRoute.geometry();
                    this.weight = directionsRoute.weight();
                    this.weightName = directionsRoute.weightName();
                    this.legs = directionsRoute.legs();
                    this.waypoints = directionsRoute.waypoints();
                    this.routeOptions = directionsRoute.routeOptions();
                    this.voiceLanguage = directionsRoute.voiceLanguage();
                    this.requestUuid = directionsRoute.requestUuid();
                    this.tollCosts = directionsRoute.tollCosts();
                }
            }

            {
                this.unrecognized = map;
                this.routeIndex = str;
                if (d8 == null) {
                    throw new NullPointerException(StubApp.getString2(12736));
                }
                this.distance = d8;
                if (d10 == null) {
                    throw new NullPointerException(StubApp.getString2(12737));
                }
                this.duration = d10;
                this.durationTypical = d11;
                this.geometry = str2;
                this.weight = d12;
                this.weightName = str3;
                this.legs = list;
                this.waypoints = list2;
                this.routeOptions = routeOptions;
                this.voiceLanguage = str4;
                this.requestUuid = str5;
                this.tollCosts = list3;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsRoute
            public Double distance() {
                return this.distance;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsRoute
            public Double duration() {
                return this.duration;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsRoute
            @SerializedName("duration_typical")
            public Double durationTypical() {
                return this.durationTypical;
            }

            public boolean equals(Object obj) {
                Double d13;
                String str6;
                Double d14;
                String str7;
                List<RouteLeg> list4;
                List<DirectionsWaypoint> list5;
                RouteOptions routeOptions2;
                String str8;
                String str9;
                List<TollCost> list6;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof DirectionsRoute) {
                    DirectionsRoute directionsRoute = (DirectionsRoute) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(directionsRoute.unrecognized()) : directionsRoute.unrecognized() == null) {
                        String str10 = this.routeIndex;
                        if (str10 != null ? str10.equals(directionsRoute.routeIndex()) : directionsRoute.routeIndex() == null) {
                            if (this.distance.equals(directionsRoute.distance()) && this.duration.equals(directionsRoute.duration()) && ((d13 = this.durationTypical) != null ? d13.equals(directionsRoute.durationTypical()) : directionsRoute.durationTypical() == null) && ((str6 = this.geometry) != null ? str6.equals(directionsRoute.geometry()) : directionsRoute.geometry() == null) && ((d14 = this.weight) != null ? d14.equals(directionsRoute.weight()) : directionsRoute.weight() == null) && ((str7 = this.weightName) != null ? str7.equals(directionsRoute.weightName()) : directionsRoute.weightName() == null) && ((list4 = this.legs) != null ? list4.equals(directionsRoute.legs()) : directionsRoute.legs() == null) && ((list5 = this.waypoints) != null ? list5.equals(directionsRoute.waypoints()) : directionsRoute.waypoints() == null) && ((routeOptions2 = this.routeOptions) != null ? routeOptions2.equals(directionsRoute.routeOptions()) : directionsRoute.routeOptions() == null) && ((str8 = this.voiceLanguage) != null ? str8.equals(directionsRoute.voiceLanguage()) : directionsRoute.voiceLanguage() == null) && ((str9 = this.requestUuid) != null ? str9.equals(directionsRoute.requestUuid()) : directionsRoute.requestUuid() == null) && ((list6 = this.tollCosts) != null ? list6.equals(directionsRoute.tollCosts()) : directionsRoute.tollCosts() == null)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsRoute
            public String geometry() {
                return this.geometry;
            }

            public int hashCode() {
                Map<String, b> map2 = this.unrecognized;
                int hashCode = ((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003;
                String str6 = this.routeIndex;
                int hashCode2 = (((((hashCode ^ (str6 == null ? 0 : str6.hashCode())) * 1000003) ^ this.distance.hashCode()) * 1000003) ^ this.duration.hashCode()) * 1000003;
                Double d13 = this.durationTypical;
                int hashCode3 = (hashCode2 ^ (d13 == null ? 0 : d13.hashCode())) * 1000003;
                String str7 = this.geometry;
                int hashCode4 = (hashCode3 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                Double d14 = this.weight;
                int hashCode5 = (hashCode4 ^ (d14 == null ? 0 : d14.hashCode())) * 1000003;
                String str8 = this.weightName;
                int hashCode6 = (hashCode5 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                List<RouteLeg> list4 = this.legs;
                int hashCode7 = (hashCode6 ^ (list4 == null ? 0 : list4.hashCode())) * 1000003;
                List<DirectionsWaypoint> list5 = this.waypoints;
                int hashCode8 = (hashCode7 ^ (list5 == null ? 0 : list5.hashCode())) * 1000003;
                RouteOptions routeOptions2 = this.routeOptions;
                int hashCode9 = (hashCode8 ^ (routeOptions2 == null ? 0 : routeOptions2.hashCode())) * 1000003;
                String str9 = this.voiceLanguage;
                int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.requestUuid;
                int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                List<TollCost> list6 = this.tollCosts;
                return hashCode11 ^ (list6 != null ? list6.hashCode() : 0);
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsRoute
            public List<RouteLeg> legs() {
                return this.legs;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsRoute
            public String requestUuid() {
                return this.requestUuid;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsRoute
            public String routeIndex() {
                return this.routeIndex;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsRoute
            public RouteOptions routeOptions() {
                return this.routeOptions;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsRoute
            public DirectionsRoute.Builder toBuilder() {
                return new Builder(this, null);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(12738));
                sb2.append(this.unrecognized);
                sb2.append(StubApp.getString2(12739));
                sb2.append(this.routeIndex);
                sb2.append(StubApp.getString2(6624));
                sb2.append(this.distance);
                sb2.append(StubApp.getString2(5021));
                sb2.append(this.duration);
                sb2.append(StubApp.getString2(12740));
                sb2.append(this.durationTypical);
                sb2.append(StubApp.getString2(2297));
                sb2.append(this.geometry);
                sb2.append(StubApp.getString2(12741));
                sb2.append(this.weight);
                sb2.append(StubApp.getString2(12742));
                sb2.append(this.weightName);
                sb2.append(StubApp.getString2(2086));
                sb2.append(this.legs);
                sb2.append(StubApp.getString2(12734));
                sb2.append(this.waypoints);
                sb2.append(StubApp.getString2(12743));
                sb2.append(this.routeOptions);
                sb2.append(StubApp.getString2(12744));
                sb2.append(this.voiceLanguage);
                sb2.append(StubApp.getString2(12745));
                sb2.append(this.requestUuid);
                sb2.append(StubApp.getString2(12746));
                return a.l(StubApp.getString2(265), sb2, this.tollCosts);
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsRoute
            @SerializedName("toll_costs")
            public List<TollCost> tollCosts() {
                return this.tollCosts;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, b> unrecognized() {
                return this.unrecognized;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsRoute
            @SerializedName("voiceLocale")
            public String voiceLanguage() {
                return this.voiceLanguage;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsRoute
            public List<DirectionsWaypoint> waypoints() {
                return this.waypoints;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsRoute
            public Double weight() {
                return this.weight;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsRoute
            @SerializedName("weight_name")
            public String weightName() {
                return this.weightName;
            }
        };
    }
}
