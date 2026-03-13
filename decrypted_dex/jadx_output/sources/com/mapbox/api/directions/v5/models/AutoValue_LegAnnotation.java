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
import com.mapbox.api.directions.v5.models.LegAnnotation;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_LegAnnotation extends C$AutoValue_LegAnnotation {

    public static final class GsonTypeAdapter extends TypeAdapter<LegAnnotation> {
        private final Gson gson;
        private volatile TypeAdapter<List<Double>> list__double_adapter;
        private volatile TypeAdapter<List<Integer>> list__integer_adapter;
        private volatile TypeAdapter<List<MaxSpeed>> list__maxSpeed_adapter;
        private volatile TypeAdapter<List<String>> list__string_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(13011);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public LegAnnotation read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            LegAnnotation.Builder builder = LegAnnotation.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    nextName.getClass();
                    char c10 = 65535;
                    switch (nextName.hashCode()) {
                        case -1740438795:
                            if (nextName.equals(StubApp.getString2(370))) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case -1709088255:
                            if (nextName.equals(StubApp.getString2(5815))) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 678906210:
                            if (nextName.equals(StubApp.getString2(5816))) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 699434824:
                            if (nextName.equals(StubApp.getString2(13009))) {
                                c10 = 3;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            TypeAdapter<List<Integer>> typeAdapter = this.list__integer_adapter;
                            if (typeAdapter == null) {
                                typeAdapter = this.gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
                                this.list__integer_adapter = typeAdapter;
                            }
                            builder.congestionNumeric(typeAdapter.read2(jsonReader));
                            break;
                        case 1:
                            TypeAdapter<List<Integer>> typeAdapter2 = this.list__integer_adapter;
                            if (typeAdapter2 == null) {
                                typeAdapter2 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
                                this.list__integer_adapter = typeAdapter2;
                            }
                            builder.currentSpeed(typeAdapter2.read2(jsonReader));
                            break;
                        case 2:
                            TypeAdapter<List<Integer>> typeAdapter3 = this.list__integer_adapter;
                            if (typeAdapter3 == null) {
                                typeAdapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
                                this.list__integer_adapter = typeAdapter3;
                            }
                            builder.freeflowSpeed(typeAdapter3.read2(jsonReader));
                            break;
                        case 3:
                            TypeAdapter<List<Integer>> typeAdapter4 = this.list__integer_adapter;
                            if (typeAdapter4 == null) {
                                typeAdapter4 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
                                this.list__integer_adapter = typeAdapter4;
                            }
                            builder.trafficTendency(typeAdapter4.read2(jsonReader));
                            break;
                        default:
                            if (!StubApp.getString2(2090).equals(nextName)) {
                                if (!StubApp.getString2(2091).equals(nextName)) {
                                    if (!StubApp.getString2(2029).equals(nextName)) {
                                        if (!StubApp.getString2(13010).equals(nextName)) {
                                            if (!StubApp.getString2(5812).equals(nextName)) {
                                                if (linkedHashMap == null) {
                                                    linkedHashMap = new LinkedHashMap();
                                                    builder.unrecognized(linkedHashMap);
                                                }
                                                a.t((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, nextName);
                                                break;
                                            } else {
                                                TypeAdapter<List<String>> typeAdapter5 = this.list__string_adapter;
                                                if (typeAdapter5 == null) {
                                                    typeAdapter5 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                                                    this.list__string_adapter = typeAdapter5;
                                                }
                                                builder.congestion(typeAdapter5.read2(jsonReader));
                                                break;
                                            }
                                        } else {
                                            TypeAdapter<List<MaxSpeed>> typeAdapter6 = this.list__maxSpeed_adapter;
                                            if (typeAdapter6 == null) {
                                                typeAdapter6 = this.gson.getAdapter(TypeToken.getParameterized(List.class, MaxSpeed.class));
                                                this.list__maxSpeed_adapter = typeAdapter6;
                                            }
                                            builder.maxspeed(typeAdapter6.read2(jsonReader));
                                            break;
                                        }
                                    } else {
                                        TypeAdapter<List<Double>> typeAdapter7 = this.list__double_adapter;
                                        if (typeAdapter7 == null) {
                                            typeAdapter7 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Double.class));
                                            this.list__double_adapter = typeAdapter7;
                                        }
                                        builder.speed(typeAdapter7.read2(jsonReader));
                                        break;
                                    }
                                } else {
                                    TypeAdapter<List<Double>> typeAdapter8 = this.list__double_adapter;
                                    if (typeAdapter8 == null) {
                                        typeAdapter8 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Double.class));
                                        this.list__double_adapter = typeAdapter8;
                                    }
                                    builder.duration(typeAdapter8.read2(jsonReader));
                                    break;
                                }
                            } else {
                                TypeAdapter<List<Double>> typeAdapter9 = this.list__double_adapter;
                                if (typeAdapter9 == null) {
                                    typeAdapter9 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Double.class));
                                    this.list__double_adapter = typeAdapter9;
                                }
                                builder.distance(typeAdapter9.read2(jsonReader));
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
        public void write(JsonWriter jsonWriter, LegAnnotation legAnnotation) throws IOException {
            if (legAnnotation == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (legAnnotation.unrecognized() != null) {
                for (Map.Entry<String, b> entry : legAnnotation.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(2090));
            if (legAnnotation.distance() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Double>> typeAdapter = this.list__double_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(TypeToken.getParameterized(List.class, Double.class));
                    this.list__double_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, legAnnotation.distance());
            }
            jsonWriter.name(StubApp.getString2(2091));
            if (legAnnotation.duration() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Double>> typeAdapter2 = this.list__double_adapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Double.class));
                    this.list__double_adapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, legAnnotation.duration());
            }
            jsonWriter.name(StubApp.getString2(2029));
            if (legAnnotation.speed() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Double>> typeAdapter3 = this.list__double_adapter;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Double.class));
                    this.list__double_adapter = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, legAnnotation.speed());
            }
            jsonWriter.name(StubApp.getString2(13010));
            if (legAnnotation.maxspeed() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<MaxSpeed>> typeAdapter4 = this.list__maxSpeed_adapter;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.gson.getAdapter(TypeToken.getParameterized(List.class, MaxSpeed.class));
                    this.list__maxSpeed_adapter = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, legAnnotation.maxspeed());
            }
            jsonWriter.name(StubApp.getString2(5812));
            if (legAnnotation.congestion() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<String>> typeAdapter5 = this.list__string_adapter;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.list__string_adapter = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, legAnnotation.congestion());
            }
            jsonWriter.name(StubApp.getString2(370));
            if (legAnnotation.congestionNumeric() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Integer>> typeAdapter6 = this.list__integer_adapter;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
                    this.list__integer_adapter = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, legAnnotation.congestionNumeric());
            }
            jsonWriter.name(StubApp.getString2(13009));
            if (legAnnotation.trafficTendency() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Integer>> typeAdapter7 = this.list__integer_adapter;
                if (typeAdapter7 == null) {
                    typeAdapter7 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
                    this.list__integer_adapter = typeAdapter7;
                }
                typeAdapter7.write(jsonWriter, legAnnotation.trafficTendency());
            }
            jsonWriter.name(StubApp.getString2(5816));
            if (legAnnotation.freeflowSpeed() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Integer>> typeAdapter8 = this.list__integer_adapter;
                if (typeAdapter8 == null) {
                    typeAdapter8 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
                    this.list__integer_adapter = typeAdapter8;
                }
                typeAdapter8.write(jsonWriter, legAnnotation.freeflowSpeed());
            }
            jsonWriter.name(StubApp.getString2(5815));
            if (legAnnotation.currentSpeed() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Integer>> typeAdapter9 = this.list__integer_adapter;
                if (typeAdapter9 == null) {
                    typeAdapter9 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
                    this.list__integer_adapter = typeAdapter9;
                }
                typeAdapter9.write(jsonWriter, legAnnotation.currentSpeed());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_LegAnnotation(Map<String, b> map, List<Double> list, List<Double> list2, List<Double> list3, List<MaxSpeed> list4, List<String> list5, List<Integer> list6, List<Integer> list7, List<Integer> list8, List<Integer> list9) {
        new LegAnnotation(map, list, list2, list3, list4, list5, list6, list7, list8, list9) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_LegAnnotation
            private final List<String> congestion;
            private final List<Integer> congestionNumeric;
            private final List<Integer> currentSpeed;
            private final List<Double> distance;
            private final List<Double> duration;
            private final List<Integer> freeflowSpeed;
            private final List<MaxSpeed> maxspeed;
            private final List<Double> speed;
            private final List<Integer> trafficTendency;
            private final Map<String, b> unrecognized;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_LegAnnotation$1, reason: invalid class name */
            public static /* synthetic */ class AnonymousClass1 {
            }

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_LegAnnotation$Builder */
            public static class Builder extends LegAnnotation.Builder {
                private List<String> congestion;
                private List<Integer> congestionNumeric;
                private List<Integer> currentSpeed;
                private List<Double> distance;
                private List<Double> duration;
                private List<Integer> freeflowSpeed;
                private List<MaxSpeed> maxspeed;
                private List<Double> speed;
                private List<Integer> trafficTendency;
                private Map<String, b> unrecognized;

                public /* synthetic */ Builder(LegAnnotation legAnnotation, AnonymousClass1 anonymousClass1) {
                    this(legAnnotation);
                }

                @Override // com.mapbox.api.directions.v5.models.LegAnnotation.Builder
                public LegAnnotation build() {
                    return new AutoValue_LegAnnotation(this.unrecognized, this.distance, this.duration, this.speed, this.maxspeed, this.congestion, this.congestionNumeric, this.trafficTendency, this.freeflowSpeed, this.currentSpeed);
                }

                @Override // com.mapbox.api.directions.v5.models.LegAnnotation.Builder
                public LegAnnotation.Builder congestion(List<String> list) {
                    this.congestion = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.LegAnnotation.Builder
                public LegAnnotation.Builder congestionNumeric(List<Integer> list) {
                    this.congestionNumeric = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.LegAnnotation.Builder
                public LegAnnotation.Builder currentSpeed(List<Integer> list) {
                    this.currentSpeed = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.LegAnnotation.Builder
                public LegAnnotation.Builder distance(List<Double> list) {
                    this.distance = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.LegAnnotation.Builder
                public LegAnnotation.Builder duration(List<Double> list) {
                    this.duration = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.LegAnnotation.Builder
                public LegAnnotation.Builder freeflowSpeed(List<Integer> list) {
                    this.freeflowSpeed = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.LegAnnotation.Builder
                public LegAnnotation.Builder maxspeed(List<MaxSpeed> list) {
                    this.maxspeed = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.LegAnnotation.Builder
                public LegAnnotation.Builder speed(List<Double> list) {
                    this.speed = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.LegAnnotation.Builder
                public LegAnnotation.Builder trafficTendency(List<Integer> list) {
                    this.trafficTendency = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ LegAnnotation.Builder unrecognized(Map map) {
                    return unrecognized2((Map<String, b>) map);
                }

                public Builder() {
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                /* renamed from: unrecognized, reason: avoid collision after fix types in other method */
                public LegAnnotation.Builder unrecognized2(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }

                private Builder(LegAnnotation legAnnotation) {
                    this.unrecognized = legAnnotation.unrecognized();
                    this.distance = legAnnotation.distance();
                    this.duration = legAnnotation.duration();
                    this.speed = legAnnotation.speed();
                    this.maxspeed = legAnnotation.maxspeed();
                    this.congestion = legAnnotation.congestion();
                    this.congestionNumeric = legAnnotation.congestionNumeric();
                    this.trafficTendency = legAnnotation.trafficTendency();
                    this.freeflowSpeed = legAnnotation.freeflowSpeed();
                    this.currentSpeed = legAnnotation.currentSpeed();
                }
            }

            {
                this.unrecognized = map;
                this.distance = list;
                this.duration = list2;
                this.speed = list3;
                this.maxspeed = list4;
                this.congestion = list5;
                this.congestionNumeric = list6;
                this.trafficTendency = list7;
                this.freeflowSpeed = list8;
                this.currentSpeed = list9;
            }

            @Override // com.mapbox.api.directions.v5.models.LegAnnotation
            public List<String> congestion() {
                return this.congestion;
            }

            @Override // com.mapbox.api.directions.v5.models.LegAnnotation
            @SerializedName("congestion_numeric")
            public List<Integer> congestionNumeric() {
                return this.congestionNumeric;
            }

            @Override // com.mapbox.api.directions.v5.models.LegAnnotation
            @SerializedName("current_speed")
            public List<Integer> currentSpeed() {
                return this.currentSpeed;
            }

            @Override // com.mapbox.api.directions.v5.models.LegAnnotation
            public List<Double> distance() {
                return this.distance;
            }

            @Override // com.mapbox.api.directions.v5.models.LegAnnotation
            public List<Double> duration() {
                return this.duration;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof LegAnnotation) {
                    LegAnnotation legAnnotation = (LegAnnotation) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(legAnnotation.unrecognized()) : legAnnotation.unrecognized() == null) {
                        List<Double> list10 = this.distance;
                        if (list10 != null ? list10.equals(legAnnotation.distance()) : legAnnotation.distance() == null) {
                            List<Double> list11 = this.duration;
                            if (list11 != null ? list11.equals(legAnnotation.duration()) : legAnnotation.duration() == null) {
                                List<Double> list12 = this.speed;
                                if (list12 != null ? list12.equals(legAnnotation.speed()) : legAnnotation.speed() == null) {
                                    List<MaxSpeed> list13 = this.maxspeed;
                                    if (list13 != null ? list13.equals(legAnnotation.maxspeed()) : legAnnotation.maxspeed() == null) {
                                        List<String> list14 = this.congestion;
                                        if (list14 != null ? list14.equals(legAnnotation.congestion()) : legAnnotation.congestion() == null) {
                                            List<Integer> list15 = this.congestionNumeric;
                                            if (list15 != null ? list15.equals(legAnnotation.congestionNumeric()) : legAnnotation.congestionNumeric() == null) {
                                                List<Integer> list16 = this.trafficTendency;
                                                if (list16 != null ? list16.equals(legAnnotation.trafficTendency()) : legAnnotation.trafficTendency() == null) {
                                                    List<Integer> list17 = this.freeflowSpeed;
                                                    if (list17 != null ? list17.equals(legAnnotation.freeflowSpeed()) : legAnnotation.freeflowSpeed() == null) {
                                                        List<Integer> list18 = this.currentSpeed;
                                                        if (list18 != null ? list18.equals(legAnnotation.currentSpeed()) : legAnnotation.currentSpeed() == null) {
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
                return false;
            }

            @Override // com.mapbox.api.directions.v5.models.LegAnnotation
            @SerializedName("freeflow_speed")
            public List<Integer> freeflowSpeed() {
                return this.freeflowSpeed;
            }

            public int hashCode() {
                Map<String, b> map2 = this.unrecognized;
                int hashCode = ((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003;
                List<Double> list10 = this.distance;
                int hashCode2 = (hashCode ^ (list10 == null ? 0 : list10.hashCode())) * 1000003;
                List<Double> list11 = this.duration;
                int hashCode3 = (hashCode2 ^ (list11 == null ? 0 : list11.hashCode())) * 1000003;
                List<Double> list12 = this.speed;
                int hashCode4 = (hashCode3 ^ (list12 == null ? 0 : list12.hashCode())) * 1000003;
                List<MaxSpeed> list13 = this.maxspeed;
                int hashCode5 = (hashCode4 ^ (list13 == null ? 0 : list13.hashCode())) * 1000003;
                List<String> list14 = this.congestion;
                int hashCode6 = (hashCode5 ^ (list14 == null ? 0 : list14.hashCode())) * 1000003;
                List<Integer> list15 = this.congestionNumeric;
                int hashCode7 = (hashCode6 ^ (list15 == null ? 0 : list15.hashCode())) * 1000003;
                List<Integer> list16 = this.trafficTendency;
                int hashCode8 = (hashCode7 ^ (list16 == null ? 0 : list16.hashCode())) * 1000003;
                List<Integer> list17 = this.freeflowSpeed;
                int hashCode9 = (hashCode8 ^ (list17 == null ? 0 : list17.hashCode())) * 1000003;
                List<Integer> list18 = this.currentSpeed;
                return hashCode9 ^ (list18 != null ? list18.hashCode() : 0);
            }

            @Override // com.mapbox.api.directions.v5.models.LegAnnotation
            public List<MaxSpeed> maxspeed() {
                return this.maxspeed;
            }

            @Override // com.mapbox.api.directions.v5.models.LegAnnotation
            public List<Double> speed() {
                return this.speed;
            }

            @Override // com.mapbox.api.directions.v5.models.LegAnnotation
            public LegAnnotation.Builder toBuilder() {
                return new Builder(this, null);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(12766));
                sb2.append(this.unrecognized);
                sb2.append(StubApp.getString2(6624));
                sb2.append(this.distance);
                sb2.append(StubApp.getString2(5021));
                sb2.append(this.duration);
                sb2.append(StubApp.getString2(6639));
                sb2.append(this.speed);
                sb2.append(StubApp.getString2(12767));
                sb2.append(this.maxspeed);
                sb2.append(StubApp.getString2(12754));
                sb2.append(this.congestion);
                sb2.append(StubApp.getString2(12768));
                sb2.append(this.congestionNumeric);
                sb2.append(StubApp.getString2(12769));
                sb2.append(this.trafficTendency);
                sb2.append(StubApp.getString2(12770));
                sb2.append(this.freeflowSpeed);
                sb2.append(StubApp.getString2(12771));
                return a.l(StubApp.getString2(265), sb2, this.currentSpeed);
            }

            @Override // com.mapbox.api.directions.v5.models.LegAnnotation
            @SerializedName("traffic_tendency")
            public List<Integer> trafficTendency() {
                return this.trafficTendency;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, b> unrecognized() {
                return this.unrecognized;
            }
        };
    }
}
