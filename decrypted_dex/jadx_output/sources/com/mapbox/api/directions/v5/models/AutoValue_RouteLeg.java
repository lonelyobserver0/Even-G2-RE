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
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_RouteLeg extends C$AutoValue_RouteLeg {

    public static final class GsonTypeAdapter extends TypeAdapter<RouteLeg> {
        private volatile TypeAdapter<Double> double__adapter;
        private final Gson gson;
        private volatile TypeAdapter<LegAnnotation> legAnnotation_adapter;
        private volatile TypeAdapter<List<Admin>> list__admin_adapter;
        private volatile TypeAdapter<List<Closure>> list__closure_adapter;
        private volatile TypeAdapter<List<Incident>> list__incident_adapter;
        private volatile TypeAdapter<List<LegStep>> list__legStep_adapter;
        private volatile TypeAdapter<List<Notification>> list__notification_adapter;
        private volatile TypeAdapter<List<SilentWaypoint>> list__silentWaypoint_adapter;
        private volatile TypeAdapter<String> string_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(13051);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public RouteLeg read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            RouteLeg.Builder builder = RouteLeg.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.getClass();
                    if (nextName.equals(StubApp.getString2(12982))) {
                        TypeAdapter<Double> typeAdapter = this.double__adapter;
                        if (typeAdapter == null) {
                            typeAdapter = this.gson.getAdapter(Double.class);
                            this.double__adapter = typeAdapter;
                        }
                        builder.durationTypical(typeAdapter.read2(jsonReader));
                    } else if (nextName.equals(StubApp.getString2(13047))) {
                        TypeAdapter<List<SilentWaypoint>> typeAdapter2 = this.list__silentWaypoint_adapter;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.gson.getAdapter(TypeToken.getParameterized(List.class, SilentWaypoint.class));
                            this.list__silentWaypoint_adapter = typeAdapter2;
                        }
                        builder.viaWaypoints(typeAdapter2.read2(jsonReader));
                    } else if (StubApp.getString2(2090).equals(nextName)) {
                        TypeAdapter<Double> typeAdapter3 = this.double__adapter;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.gson.getAdapter(Double.class);
                            this.double__adapter = typeAdapter3;
                        }
                        builder.distance(typeAdapter3.read2(jsonReader));
                    } else if (StubApp.getString2(2091).equals(nextName)) {
                        TypeAdapter<Double> typeAdapter4 = this.double__adapter;
                        if (typeAdapter4 == null) {
                            typeAdapter4 = this.gson.getAdapter(Double.class);
                            this.double__adapter = typeAdapter4;
                        }
                        builder.duration(typeAdapter4.read2(jsonReader));
                    } else if (StubApp.getString2(13048).equals(nextName)) {
                        TypeAdapter<String> typeAdapter5 = this.string_adapter;
                        if (typeAdapter5 == null) {
                            typeAdapter5 = this.gson.getAdapter(String.class);
                            this.string_adapter = typeAdapter5;
                        }
                        builder.summary(typeAdapter5.read2(jsonReader));
                    } else if (StubApp.getString2(13049).equals(nextName)) {
                        TypeAdapter<List<Admin>> typeAdapter6 = this.list__admin_adapter;
                        if (typeAdapter6 == null) {
                            typeAdapter6 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Admin.class));
                            this.list__admin_adapter = typeAdapter6;
                        }
                        builder.admins(typeAdapter6.read2(jsonReader));
                    } else if (StubApp.getString2(13050).equals(nextName)) {
                        TypeAdapter<List<LegStep>> typeAdapter7 = this.list__legStep_adapter;
                        if (typeAdapter7 == null) {
                            typeAdapter7 = this.gson.getAdapter(TypeToken.getParameterized(List.class, LegStep.class));
                            this.list__legStep_adapter = typeAdapter7;
                        }
                        builder.steps(typeAdapter7.read2(jsonReader));
                    } else if (StubApp.getString2(2111).equals(nextName)) {
                        TypeAdapter<List<Incident>> typeAdapter8 = this.list__incident_adapter;
                        if (typeAdapter8 == null) {
                            typeAdapter8 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Incident.class));
                            this.list__incident_adapter = typeAdapter8;
                        }
                        builder.incidents(typeAdapter8.read2(jsonReader));
                    } else if (StubApp.getString2(2112).equals(nextName)) {
                        TypeAdapter<LegAnnotation> typeAdapter9 = this.legAnnotation_adapter;
                        if (typeAdapter9 == null) {
                            typeAdapter9 = this.gson.getAdapter(LegAnnotation.class);
                            this.legAnnotation_adapter = typeAdapter9;
                        }
                        builder.annotation(typeAdapter9.read2(jsonReader));
                    } else if (StubApp.getString2(2113).equals(nextName)) {
                        TypeAdapter<List<Closure>> typeAdapter10 = this.list__closure_adapter;
                        if (typeAdapter10 == null) {
                            typeAdapter10 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Closure.class));
                            this.list__closure_adapter = typeAdapter10;
                        }
                        builder.closures(typeAdapter10.read2(jsonReader));
                    } else if (StubApp.getString2(2114).equals(nextName)) {
                        TypeAdapter<List<Notification>> typeAdapter11 = this.list__notification_adapter;
                        if (typeAdapter11 == null) {
                            typeAdapter11 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Notification.class));
                            this.list__notification_adapter = typeAdapter11;
                        }
                        builder.notifications(typeAdapter11.read2(jsonReader));
                    } else {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                            builder.unrecognized(linkedHashMap);
                        }
                        a.t((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, nextName);
                    }
                }
            }
            jsonReader.endObject();
            return builder.build();
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, RouteLeg routeLeg) throws IOException {
            if (routeLeg == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (routeLeg.unrecognized() != null) {
                for (Map.Entry<String, b> entry : routeLeg.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(13047));
            if (routeLeg.viaWaypoints() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<SilentWaypoint>> typeAdapter = this.list__silentWaypoint_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(TypeToken.getParameterized(List.class, SilentWaypoint.class));
                    this.list__silentWaypoint_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, routeLeg.viaWaypoints());
            }
            jsonWriter.name(StubApp.getString2(2090));
            if (routeLeg.distance() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter2 = this.double__adapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(Double.class);
                    this.double__adapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, routeLeg.distance());
            }
            jsonWriter.name(StubApp.getString2(2091));
            if (routeLeg.duration() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter3 = this.double__adapter;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.gson.getAdapter(Double.class);
                    this.double__adapter = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, routeLeg.duration());
            }
            jsonWriter.name(StubApp.getString2(12982));
            if (routeLeg.durationTypical() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter4 = this.double__adapter;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.gson.getAdapter(Double.class);
                    this.double__adapter = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, routeLeg.durationTypical());
            }
            jsonWriter.name(StubApp.getString2(13048));
            if (routeLeg.summary() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter5 = this.string_adapter;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, routeLeg.summary());
            }
            jsonWriter.name(StubApp.getString2(13049));
            if (routeLeg.admins() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Admin>> typeAdapter6 = this.list__admin_adapter;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Admin.class));
                    this.list__admin_adapter = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, routeLeg.admins());
            }
            jsonWriter.name(StubApp.getString2(13050));
            if (routeLeg.steps() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<LegStep>> typeAdapter7 = this.list__legStep_adapter;
                if (typeAdapter7 == null) {
                    typeAdapter7 = this.gson.getAdapter(TypeToken.getParameterized(List.class, LegStep.class));
                    this.list__legStep_adapter = typeAdapter7;
                }
                typeAdapter7.write(jsonWriter, routeLeg.steps());
            }
            jsonWriter.name(StubApp.getString2(2111));
            if (routeLeg.incidents() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Incident>> typeAdapter8 = this.list__incident_adapter;
                if (typeAdapter8 == null) {
                    typeAdapter8 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Incident.class));
                    this.list__incident_adapter = typeAdapter8;
                }
                typeAdapter8.write(jsonWriter, routeLeg.incidents());
            }
            jsonWriter.name(StubApp.getString2(2112));
            if (routeLeg.annotation() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<LegAnnotation> typeAdapter9 = this.legAnnotation_adapter;
                if (typeAdapter9 == null) {
                    typeAdapter9 = this.gson.getAdapter(LegAnnotation.class);
                    this.legAnnotation_adapter = typeAdapter9;
                }
                typeAdapter9.write(jsonWriter, routeLeg.annotation());
            }
            jsonWriter.name(StubApp.getString2(2113));
            if (routeLeg.closures() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Closure>> typeAdapter10 = this.list__closure_adapter;
                if (typeAdapter10 == null) {
                    typeAdapter10 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Closure.class));
                    this.list__closure_adapter = typeAdapter10;
                }
                typeAdapter10.write(jsonWriter, routeLeg.closures());
            }
            jsonWriter.name(StubApp.getString2(2114));
            if (routeLeg.notifications() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Notification>> typeAdapter11 = this.list__notification_adapter;
                if (typeAdapter11 == null) {
                    typeAdapter11 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Notification.class));
                    this.list__notification_adapter = typeAdapter11;
                }
                typeAdapter11.write(jsonWriter, routeLeg.notifications());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_RouteLeg(Map<String, b> map, List<SilentWaypoint> list, Double d8, Double d10, Double d11, String str, List<Admin> list2, List<LegStep> list3, List<Incident> list4, LegAnnotation legAnnotation, List<Closure> list5, List<Notification> list6) {
        new RouteLeg(map, list, d8, d10, d11, str, list2, list3, list4, legAnnotation, list5, list6) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_RouteLeg
            private final List<Admin> admins;
            private final LegAnnotation annotation;
            private final List<Closure> closures;
            private final Double distance;
            private final Double duration;
            private final Double durationTypical;
            private final List<Incident> incidents;
            private final List<Notification> notifications;
            private final List<LegStep> steps;
            private final String summary;
            private final Map<String, b> unrecognized;
            private final List<SilentWaypoint> viaWaypoints;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_RouteLeg$1, reason: invalid class name */
            public static /* synthetic */ class AnonymousClass1 {
            }

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_RouteLeg$Builder */
            public static class Builder extends RouteLeg.Builder {
                private List<Admin> admins;
                private LegAnnotation annotation;
                private List<Closure> closures;
                private Double distance;
                private Double duration;
                private Double durationTypical;
                private List<Incident> incidents;
                private List<Notification> notifications;
                private List<LegStep> steps;
                private String summary;
                private Map<String, b> unrecognized;
                private List<SilentWaypoint> viaWaypoints;

                public /* synthetic */ Builder(RouteLeg routeLeg, AnonymousClass1 anonymousClass1) {
                    this(routeLeg);
                }

                @Override // com.mapbox.api.directions.v5.models.RouteLeg.Builder
                public RouteLeg.Builder admins(List<Admin> list) {
                    this.admins = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteLeg.Builder
                public RouteLeg.Builder annotation(LegAnnotation legAnnotation) {
                    this.annotation = legAnnotation;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteLeg.Builder
                public RouteLeg build() {
                    return new AutoValue_RouteLeg(this.unrecognized, this.viaWaypoints, this.distance, this.duration, this.durationTypical, this.summary, this.admins, this.steps, this.incidents, this.annotation, this.closures, this.notifications);
                }

                @Override // com.mapbox.api.directions.v5.models.RouteLeg.Builder
                public RouteLeg.Builder closures(List<Closure> list) {
                    this.closures = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteLeg.Builder
                public RouteLeg.Builder distance(Double d8) {
                    this.distance = d8;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteLeg.Builder
                public RouteLeg.Builder duration(Double d8) {
                    this.duration = d8;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteLeg.Builder
                public RouteLeg.Builder durationTypical(Double d8) {
                    this.durationTypical = d8;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteLeg.Builder
                public RouteLeg.Builder incidents(List<Incident> list) {
                    this.incidents = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteLeg.Builder
                public RouteLeg.Builder notifications(List<Notification> list) {
                    this.notifications = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteLeg.Builder
                public RouteLeg.Builder steps(List<LegStep> list) {
                    this.steps = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteLeg.Builder
                public RouteLeg.Builder summary(String str) {
                    this.summary = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ RouteLeg.Builder unrecognized(Map map) {
                    return unrecognized2((Map<String, b>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.RouteLeg.Builder
                public RouteLeg.Builder viaWaypoints(List<SilentWaypoint> list) {
                    this.viaWaypoints = list;
                    return this;
                }

                public Builder() {
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                /* renamed from: unrecognized, reason: avoid collision after fix types in other method */
                public RouteLeg.Builder unrecognized2(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }

                private Builder(RouteLeg routeLeg) {
                    this.unrecognized = routeLeg.unrecognized();
                    this.viaWaypoints = routeLeg.viaWaypoints();
                    this.distance = routeLeg.distance();
                    this.duration = routeLeg.duration();
                    this.durationTypical = routeLeg.durationTypical();
                    this.summary = routeLeg.summary();
                    this.admins = routeLeg.admins();
                    this.steps = routeLeg.steps();
                    this.incidents = routeLeg.incidents();
                    this.annotation = routeLeg.annotation();
                    this.closures = routeLeg.closures();
                    this.notifications = routeLeg.notifications();
                }
            }

            {
                this.unrecognized = map;
                this.viaWaypoints = list;
                this.distance = d8;
                this.duration = d10;
                this.durationTypical = d11;
                this.summary = str;
                this.admins = list2;
                this.steps = list3;
                this.incidents = list4;
                this.annotation = legAnnotation;
                this.closures = list5;
                this.notifications = list6;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteLeg
            public List<Admin> admins() {
                return this.admins;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteLeg
            public LegAnnotation annotation() {
                return this.annotation;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteLeg
            public List<Closure> closures() {
                return this.closures;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteLeg
            public Double distance() {
                return this.distance;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteLeg
            public Double duration() {
                return this.duration;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteLeg
            @SerializedName("duration_typical")
            public Double durationTypical() {
                return this.durationTypical;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof RouteLeg) {
                    RouteLeg routeLeg = (RouteLeg) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(routeLeg.unrecognized()) : routeLeg.unrecognized() == null) {
                        List<SilentWaypoint> list7 = this.viaWaypoints;
                        if (list7 != null ? list7.equals(routeLeg.viaWaypoints()) : routeLeg.viaWaypoints() == null) {
                            Double d12 = this.distance;
                            if (d12 != null ? d12.equals(routeLeg.distance()) : routeLeg.distance() == null) {
                                Double d13 = this.duration;
                                if (d13 != null ? d13.equals(routeLeg.duration()) : routeLeg.duration() == null) {
                                    Double d14 = this.durationTypical;
                                    if (d14 != null ? d14.equals(routeLeg.durationTypical()) : routeLeg.durationTypical() == null) {
                                        String str2 = this.summary;
                                        if (str2 != null ? str2.equals(routeLeg.summary()) : routeLeg.summary() == null) {
                                            List<Admin> list8 = this.admins;
                                            if (list8 != null ? list8.equals(routeLeg.admins()) : routeLeg.admins() == null) {
                                                List<LegStep> list9 = this.steps;
                                                if (list9 != null ? list9.equals(routeLeg.steps()) : routeLeg.steps() == null) {
                                                    List<Incident> list10 = this.incidents;
                                                    if (list10 != null ? list10.equals(routeLeg.incidents()) : routeLeg.incidents() == null) {
                                                        LegAnnotation legAnnotation2 = this.annotation;
                                                        if (legAnnotation2 != null ? legAnnotation2.equals(routeLeg.annotation()) : routeLeg.annotation() == null) {
                                                            List<Closure> list11 = this.closures;
                                                            if (list11 != null ? list11.equals(routeLeg.closures()) : routeLeg.closures() == null) {
                                                                List<Notification> list12 = this.notifications;
                                                                if (list12 != null ? list12.equals(routeLeg.notifications()) : routeLeg.notifications() == null) {
                                                                    return true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                Map<String, b> map2 = this.unrecognized;
                int hashCode = ((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003;
                List<SilentWaypoint> list7 = this.viaWaypoints;
                int hashCode2 = (hashCode ^ (list7 == null ? 0 : list7.hashCode())) * 1000003;
                Double d12 = this.distance;
                int hashCode3 = (hashCode2 ^ (d12 == null ? 0 : d12.hashCode())) * 1000003;
                Double d13 = this.duration;
                int hashCode4 = (hashCode3 ^ (d13 == null ? 0 : d13.hashCode())) * 1000003;
                Double d14 = this.durationTypical;
                int hashCode5 = (hashCode4 ^ (d14 == null ? 0 : d14.hashCode())) * 1000003;
                String str2 = this.summary;
                int hashCode6 = (hashCode5 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                List<Admin> list8 = this.admins;
                int hashCode7 = (hashCode6 ^ (list8 == null ? 0 : list8.hashCode())) * 1000003;
                List<LegStep> list9 = this.steps;
                int hashCode8 = (hashCode7 ^ (list9 == null ? 0 : list9.hashCode())) * 1000003;
                List<Incident> list10 = this.incidents;
                int hashCode9 = (hashCode8 ^ (list10 == null ? 0 : list10.hashCode())) * 1000003;
                LegAnnotation legAnnotation2 = this.annotation;
                int hashCode10 = (hashCode9 ^ (legAnnotation2 == null ? 0 : legAnnotation2.hashCode())) * 1000003;
                List<Closure> list11 = this.closures;
                int hashCode11 = (hashCode10 ^ (list11 == null ? 0 : list11.hashCode())) * 1000003;
                List<Notification> list12 = this.notifications;
                return hashCode11 ^ (list12 != null ? list12.hashCode() : 0);
            }

            @Override // com.mapbox.api.directions.v5.models.RouteLeg
            public List<Incident> incidents() {
                return this.incidents;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteLeg
            public List<Notification> notifications() {
                return this.notifications;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteLeg
            public List<LegStep> steps() {
                return this.steps;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteLeg
            public String summary() {
                return this.summary;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteLeg
            public RouteLeg.Builder toBuilder() {
                return new Builder(this, null);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(12822));
                sb2.append(this.unrecognized);
                sb2.append(StubApp.getString2(12823));
                sb2.append(this.viaWaypoints);
                sb2.append(StubApp.getString2(6624));
                sb2.append(this.distance);
                sb2.append(StubApp.getString2(5021));
                sb2.append(this.duration);
                sb2.append(StubApp.getString2(12740));
                sb2.append(this.durationTypical);
                sb2.append(StubApp.getString2(12824));
                sb2.append(this.summary);
                sb2.append(StubApp.getString2(12825));
                sb2.append(this.admins);
                sb2.append(StubApp.getString2(12826));
                sb2.append(this.steps);
                sb2.append(StubApp.getString2(2119));
                sb2.append(this.incidents);
                sb2.append(StubApp.getString2(2120));
                sb2.append(this.annotation);
                sb2.append(StubApp.getString2(2121));
                sb2.append(this.closures);
                sb2.append(StubApp.getString2(2122));
                return a.l(StubApp.getString2(265), sb2, this.notifications);
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, b> unrecognized() {
                return this.unrecognized;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteLeg
            @SerializedName("via_waypoints")
            public List<SilentWaypoint> viaWaypoints() {
                return this.viaWaypoints;
            }
        };
    }
}
