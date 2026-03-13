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
import com.mapbox.api.directions.v5.models.Incident;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_Incident extends C$AutoValue_Incident {

    public static final class GsonTypeAdapter extends TypeAdapter<Incident> {
        private volatile TypeAdapter<Boolean> boolean__adapter;
        private volatile TypeAdapter<Congestion> congestion_adapter;
        private final Gson gson;
        private volatile TypeAdapter<Integer> integer_adapter;
        private volatile TypeAdapter<List<Integer>> list__integer_adapter;
        private volatile TypeAdapter<List<String>> list__string_adapter;
        private volatile TypeAdapter<String> string_adapter;
        private volatile TypeAdapter<TrafficCodes> trafficCodes_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(12998);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public Incident read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            Incident.Builder builder = Incident.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    nextName.getClass();
                    char c10 = 65535;
                    switch (nextName.hashCode()) {
                        case -2079559207:
                            if (nextName.equals(StubApp.getString2(12996))) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case -1758333932:
                            if (nextName.equals(StubApp.getString2(12995))) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case -1747792199:
                            if (nextName.equals(StubApp.getString2(12994))) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case -1573145462:
                            if (nextName.equals(StubApp.getString2(12993))) {
                                c10 = 3;
                                break;
                            }
                            break;
                        case -549644101:
                            if (nextName.equals(StubApp.getString2(12992))) {
                                c10 = 4;
                                break;
                            }
                            break;
                        case 182140340:
                            if (nextName.equals(StubApp.getString2(12991))) {
                                c10 = 5;
                                break;
                            }
                            break;
                        case 198271844:
                            if (nextName.equals(StubApp.getString2(12990))) {
                                c10 = 6;
                                break;
                            }
                            break;
                        case 805451368:
                            if (nextName.equals(StubApp.getString2(12968))) {
                                c10 = 7;
                                break;
                            }
                            break;
                        case 1226659478:
                            if (nextName.equals(StubApp.getString2(12989))) {
                                c10 = '\b';
                                break;
                            }
                            break;
                        case 1360188526:
                            if (nextName.equals(StubApp.getString2(12988))) {
                                c10 = '\t';
                                break;
                            }
                            break;
                        case 1393910185:
                            if (nextName.equals(StubApp.getString2(12987))) {
                                c10 = '\n';
                                break;
                            }
                            break;
                        case 1393910186:
                            if (nextName.equals(StubApp.getString2(12944))) {
                                c10 = 11;
                                break;
                            }
                            break;
                        case 1725551537:
                            if (nextName.equals(StubApp.getString2(12986))) {
                                c10 = '\f';
                                break;
                            }
                            break;
                        case 1855571041:
                            if (nextName.equals(StubApp.getString2(12969))) {
                                c10 = '\r';
                                break;
                            }
                            break;
                        case 1932333101:
                            if (nextName.equals(StubApp.getString2(12985))) {
                                c10 = 14;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            TypeAdapter<String> typeAdapter = this.string_adapter;
                            if (typeAdapter == null) {
                                typeAdapter = this.gson.getAdapter(String.class);
                                this.string_adapter = typeAdapter;
                            }
                            builder.subType(typeAdapter.read2(jsonReader));
                            break;
                        case 1:
                            TypeAdapter<List<String>> typeAdapter2 = this.list__string_adapter;
                            if (typeAdapter2 == null) {
                                typeAdapter2 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                                this.list__string_adapter = typeAdapter2;
                            }
                            builder.affectedRoadNames(typeAdapter2.read2(jsonReader));
                            break;
                        case 2:
                            TypeAdapter<String> typeAdapter3 = this.string_adapter;
                            if (typeAdapter3 == null) {
                                typeAdapter3 = this.gson.getAdapter(String.class);
                                this.string_adapter = typeAdapter3;
                            }
                            builder.longDescription(typeAdapter3.read2(jsonReader));
                            break;
                        case 3:
                            TypeAdapter<String> typeAdapter4 = this.string_adapter;
                            if (typeAdapter4 == null) {
                                typeAdapter4 = this.gson.getAdapter(String.class);
                                this.string_adapter = typeAdapter4;
                            }
                            builder.startTime(typeAdapter4.read2(jsonReader));
                            break;
                        case 4:
                            TypeAdapter<Integer> typeAdapter5 = this.integer_adapter;
                            if (typeAdapter5 == null) {
                                typeAdapter5 = this.gson.getAdapter(Integer.class);
                                this.integer_adapter = typeAdapter5;
                            }
                            builder.numLanesBlocked(typeAdapter5.read2(jsonReader));
                            break;
                        case 5:
                            TypeAdapter<List<String>> typeAdapter6 = this.list__string_adapter;
                            if (typeAdapter6 == null) {
                                typeAdapter6 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                                this.list__string_adapter = typeAdapter6;
                            }
                            builder.lanesBlocked(typeAdapter6.read2(jsonReader));
                            break;
                        case 6:
                            TypeAdapter<TrafficCodes> typeAdapter7 = this.trafficCodes_adapter;
                            if (typeAdapter7 == null) {
                                typeAdapter7 = this.gson.getAdapter(TrafficCodes.class);
                                this.trafficCodes_adapter = typeAdapter7;
                            }
                            builder.trafficCodes(typeAdapter7.read2(jsonReader));
                            break;
                        case 7:
                            TypeAdapter<Integer> typeAdapter8 = this.integer_adapter;
                            if (typeAdapter8 == null) {
                                typeAdapter8 = this.gson.getAdapter(Integer.class);
                                this.integer_adapter = typeAdapter8;
                            }
                            builder.geometryIndexStart(typeAdapter8.read2(jsonReader));
                            break;
                        case '\b':
                            TypeAdapter<String> typeAdapter9 = this.string_adapter;
                            if (typeAdapter9 == null) {
                                typeAdapter9 = this.gson.getAdapter(String.class);
                                this.string_adapter = typeAdapter9;
                            }
                            builder.subTypeDescription(typeAdapter9.read2(jsonReader));
                            break;
                        case '\t':
                            TypeAdapter<List<Integer>> typeAdapter10 = this.list__integer_adapter;
                            if (typeAdapter10 == null) {
                                typeAdapter10 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
                                this.list__integer_adapter = typeAdapter10;
                            }
                            builder.alertcCodes(typeAdapter10.read2(jsonReader));
                            break;
                        case '\n':
                            TypeAdapter<String> typeAdapter11 = this.string_adapter;
                            if (typeAdapter11 == null) {
                                typeAdapter11 = this.gson.getAdapter(String.class);
                                this.string_adapter = typeAdapter11;
                            }
                            builder.countryCodeAlpha2(typeAdapter11.read2(jsonReader));
                            break;
                        case 11:
                            TypeAdapter<String> typeAdapter12 = this.string_adapter;
                            if (typeAdapter12 == null) {
                                typeAdapter12 = this.gson.getAdapter(String.class);
                                this.string_adapter = typeAdapter12;
                            }
                            builder.countryCodeAlpha3(typeAdapter12.read2(jsonReader));
                            break;
                        case '\f':
                            TypeAdapter<String> typeAdapter13 = this.string_adapter;
                            if (typeAdapter13 == null) {
                                typeAdapter13 = this.gson.getAdapter(String.class);
                                this.string_adapter = typeAdapter13;
                            }
                            builder.endTime(typeAdapter13.read2(jsonReader));
                            break;
                        case '\r':
                            TypeAdapter<Integer> typeAdapter14 = this.integer_adapter;
                            if (typeAdapter14 == null) {
                                typeAdapter14 = this.gson.getAdapter(Integer.class);
                                this.integer_adapter = typeAdapter14;
                            }
                            builder.geometryIndexEnd(typeAdapter14.read2(jsonReader));
                            break;
                        case 14:
                            TypeAdapter<String> typeAdapter15 = this.string_adapter;
                            if (typeAdapter15 == null) {
                                typeAdapter15 = this.gson.getAdapter(String.class);
                                this.string_adapter = typeAdapter15;
                            }
                            builder.creationTime(typeAdapter15.read2(jsonReader));
                            break;
                        default:
                            if (!StubApp.getString2(290).equals(nextName)) {
                                if (!StubApp.getString2(660).equals(nextName)) {
                                    if (!StubApp.getString2(1551).equals(nextName)) {
                                        if (!StubApp.getString2(5812).equals(nextName)) {
                                            if (!StubApp.getString2(659).equals(nextName)) {
                                                if (!StubApp.getString2(12997).equals(nextName)) {
                                                    if (linkedHashMap == null) {
                                                        linkedHashMap = new LinkedHashMap();
                                                        builder.unrecognized(linkedHashMap);
                                                    }
                                                    a.t((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, nextName);
                                                    break;
                                                } else {
                                                    TypeAdapter<String> typeAdapter16 = this.string_adapter;
                                                    if (typeAdapter16 == null) {
                                                        typeAdapter16 = this.gson.getAdapter(String.class);
                                                        this.string_adapter = typeAdapter16;
                                                    }
                                                    builder.impact(typeAdapter16.read2(jsonReader));
                                                    break;
                                                }
                                            } else {
                                                TypeAdapter<String> typeAdapter17 = this.string_adapter;
                                                if (typeAdapter17 == null) {
                                                    typeAdapter17 = this.gson.getAdapter(String.class);
                                                    this.string_adapter = typeAdapter17;
                                                }
                                                builder.description(typeAdapter17.read2(jsonReader));
                                                break;
                                            }
                                        } else {
                                            TypeAdapter<Congestion> typeAdapter18 = this.congestion_adapter;
                                            if (typeAdapter18 == null) {
                                                typeAdapter18 = this.gson.getAdapter(Congestion.class);
                                                this.congestion_adapter = typeAdapter18;
                                            }
                                            builder.congestion(typeAdapter18.read2(jsonReader));
                                            break;
                                        }
                                    } else {
                                        TypeAdapter<Boolean> typeAdapter19 = this.boolean__adapter;
                                        if (typeAdapter19 == null) {
                                            typeAdapter19 = this.gson.getAdapter(Boolean.class);
                                            this.boolean__adapter = typeAdapter19;
                                        }
                                        builder.closed(typeAdapter19.read2(jsonReader));
                                        break;
                                    }
                                } else {
                                    TypeAdapter<String> typeAdapter20 = this.string_adapter;
                                    if (typeAdapter20 == null) {
                                        typeAdapter20 = this.gson.getAdapter(String.class);
                                        this.string_adapter = typeAdapter20;
                                    }
                                    builder.type(typeAdapter20.read2(jsonReader));
                                    break;
                                }
                            } else {
                                TypeAdapter<String> typeAdapter21 = this.string_adapter;
                                if (typeAdapter21 == null) {
                                    typeAdapter21 = this.gson.getAdapter(String.class);
                                    this.string_adapter = typeAdapter21;
                                }
                                builder.id(typeAdapter21.read2(jsonReader));
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
        public void write(JsonWriter jsonWriter, Incident incident) throws IOException {
            if (incident == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (incident.unrecognized() != null) {
                for (Map.Entry<String, b> entry : incident.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(290));
            if (incident.id() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.string_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, incident.id());
            }
            jsonWriter.name(StubApp.getString2(660));
            if (incident.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter2 = this.string_adapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, incident.type());
            }
            jsonWriter.name(StubApp.getString2(1551));
            if (incident.closed() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter3 = this.boolean__adapter;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, incident.closed());
            }
            jsonWriter.name(StubApp.getString2(5812));
            if (incident.congestion() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Congestion> typeAdapter4 = this.congestion_adapter;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.gson.getAdapter(Congestion.class);
                    this.congestion_adapter = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, incident.congestion());
            }
            jsonWriter.name(StubApp.getString2(659));
            if (incident.description() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter5 = this.string_adapter;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, incident.description());
            }
            jsonWriter.name(StubApp.getString2(12994));
            if (incident.longDescription() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter6 = this.string_adapter;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, incident.longDescription());
            }
            jsonWriter.name(StubApp.getString2(12997));
            if (incident.impact() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter7 = this.string_adapter;
                if (typeAdapter7 == null) {
                    typeAdapter7 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter7;
                }
                typeAdapter7.write(jsonWriter, incident.impact());
            }
            jsonWriter.name(StubApp.getString2(12996));
            if (incident.subType() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter8 = this.string_adapter;
                if (typeAdapter8 == null) {
                    typeAdapter8 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter8;
                }
                typeAdapter8.write(jsonWriter, incident.subType());
            }
            jsonWriter.name(StubApp.getString2(12989));
            if (incident.subTypeDescription() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter9 = this.string_adapter;
                if (typeAdapter9 == null) {
                    typeAdapter9 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter9;
                }
                typeAdapter9.write(jsonWriter, incident.subTypeDescription());
            }
            jsonWriter.name(StubApp.getString2(12988));
            if (incident.alertcCodes() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Integer>> typeAdapter10 = this.list__integer_adapter;
                if (typeAdapter10 == null) {
                    typeAdapter10 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
                    this.list__integer_adapter = typeAdapter10;
                }
                typeAdapter10.write(jsonWriter, incident.alertcCodes());
            }
            jsonWriter.name(StubApp.getString2(12990));
            if (incident.trafficCodes() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<TrafficCodes> typeAdapter11 = this.trafficCodes_adapter;
                if (typeAdapter11 == null) {
                    typeAdapter11 = this.gson.getAdapter(TrafficCodes.class);
                    this.trafficCodes_adapter = typeAdapter11;
                }
                typeAdapter11.write(jsonWriter, incident.trafficCodes());
            }
            jsonWriter.name(StubApp.getString2(12968));
            if (incident.geometryIndexStart() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter12 = this.integer_adapter;
                if (typeAdapter12 == null) {
                    typeAdapter12 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = typeAdapter12;
                }
                typeAdapter12.write(jsonWriter, incident.geometryIndexStart());
            }
            jsonWriter.name(StubApp.getString2(12969));
            if (incident.geometryIndexEnd() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter13 = this.integer_adapter;
                if (typeAdapter13 == null) {
                    typeAdapter13 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = typeAdapter13;
                }
                typeAdapter13.write(jsonWriter, incident.geometryIndexEnd());
            }
            jsonWriter.name(StubApp.getString2(12985));
            if (incident.creationTime() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter14 = this.string_adapter;
                if (typeAdapter14 == null) {
                    typeAdapter14 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter14;
                }
                typeAdapter14.write(jsonWriter, incident.creationTime());
            }
            jsonWriter.name(StubApp.getString2(12993));
            if (incident.startTime() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter15 = this.string_adapter;
                if (typeAdapter15 == null) {
                    typeAdapter15 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter15;
                }
                typeAdapter15.write(jsonWriter, incident.startTime());
            }
            jsonWriter.name(StubApp.getString2(12986));
            if (incident.endTime() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter16 = this.string_adapter;
                if (typeAdapter16 == null) {
                    typeAdapter16 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter16;
                }
                typeAdapter16.write(jsonWriter, incident.endTime());
            }
            jsonWriter.name(StubApp.getString2(12987));
            if (incident.countryCodeAlpha2() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter17 = this.string_adapter;
                if (typeAdapter17 == null) {
                    typeAdapter17 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter17;
                }
                typeAdapter17.write(jsonWriter, incident.countryCodeAlpha2());
            }
            jsonWriter.name(StubApp.getString2(12944));
            if (incident.countryCodeAlpha3() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter18 = this.string_adapter;
                if (typeAdapter18 == null) {
                    typeAdapter18 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter18;
                }
                typeAdapter18.write(jsonWriter, incident.countryCodeAlpha3());
            }
            jsonWriter.name(StubApp.getString2(12991));
            if (incident.lanesBlocked() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<String>> typeAdapter19 = this.list__string_adapter;
                if (typeAdapter19 == null) {
                    typeAdapter19 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.list__string_adapter = typeAdapter19;
                }
                typeAdapter19.write(jsonWriter, incident.lanesBlocked());
            }
            jsonWriter.name(StubApp.getString2(12992));
            if (incident.numLanesBlocked() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter20 = this.integer_adapter;
                if (typeAdapter20 == null) {
                    typeAdapter20 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = typeAdapter20;
                }
                typeAdapter20.write(jsonWriter, incident.numLanesBlocked());
            }
            jsonWriter.name(StubApp.getString2(12995));
            if (incident.affectedRoadNames() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<String>> typeAdapter21 = this.list__string_adapter;
                if (typeAdapter21 == null) {
                    typeAdapter21 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.list__string_adapter = typeAdapter21;
                }
                typeAdapter21.write(jsonWriter, incident.affectedRoadNames());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_Incident(Map<String, b> map, String str, String str2, Boolean bool, Congestion congestion, String str3, String str4, String str5, String str6, String str7, List<Integer> list, TrafficCodes trafficCodes, Integer num, Integer num2, String str8, String str9, String str10, String str11, String str12, List<String> list2, Integer num3, List<String> list3) {
        new Incident(map, str, str2, bool, congestion, str3, str4, str5, str6, str7, list, trafficCodes, num, num2, str8, str9, str10, str11, str12, list2, num3, list3) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_Incident
            private final List<String> affectedRoadNames;
            private final List<Integer> alertcCodes;
            private final Boolean closed;
            private final Congestion congestion;
            private final String countryCodeAlpha2;
            private final String countryCodeAlpha3;
            private final String creationTime;
            private final String description;
            private final String endTime;
            private final Integer geometryIndexEnd;
            private final Integer geometryIndexStart;
            private final String id;
            private final String impact;
            private final List<String> lanesBlocked;
            private final String longDescription;
            private final Integer numLanesBlocked;
            private final String startTime;
            private final String subType;
            private final String subTypeDescription;
            private final TrafficCodes trafficCodes;
            private final String type;
            private final Map<String, b> unrecognized;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_Incident$1, reason: invalid class name */
            public static /* synthetic */ class AnonymousClass1 {
            }

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_Incident$Builder */
            public static class Builder extends Incident.Builder {
                private List<String> affectedRoadNames;
                private List<Integer> alertcCodes;
                private Boolean closed;
                private Congestion congestion;
                private String countryCodeAlpha2;
                private String countryCodeAlpha3;
                private String creationTime;
                private String description;
                private String endTime;
                private Integer geometryIndexEnd;
                private Integer geometryIndexStart;
                private String id;
                private String impact;
                private List<String> lanesBlocked;
                private String longDescription;
                private Integer numLanesBlocked;
                private String startTime;
                private String subType;
                private String subTypeDescription;
                private TrafficCodes trafficCodes;
                private String type;
                private Map<String, b> unrecognized;

                public /* synthetic */ Builder(Incident incident, AnonymousClass1 anonymousClass1) {
                    this(incident);
                }

                @Override // com.mapbox.api.directions.v5.models.Incident.Builder
                public Incident.Builder affectedRoadNames(List<String> list) {
                    this.affectedRoadNames = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Incident.Builder
                public Incident.Builder alertcCodes(List<Integer> list) {
                    this.alertcCodes = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Incident.Builder
                public Incident build() {
                    String string2 = this.id == null ? StubApp.getString2(2283) : "";
                    if (string2.isEmpty()) {
                        return new AutoValue_Incident(this.unrecognized, this.id, this.type, this.closed, this.congestion, this.description, this.longDescription, this.impact, this.subType, this.subTypeDescription, this.alertcCodes, this.trafficCodes, this.geometryIndexStart, this.geometryIndexEnd, this.creationTime, this.startTime, this.endTime, this.countryCodeAlpha2, this.countryCodeAlpha3, this.lanesBlocked, this.numLanesBlocked, this.affectedRoadNames);
                    }
                    throw new IllegalStateException(StubApp.getString2(555).concat(string2));
                }

                @Override // com.mapbox.api.directions.v5.models.Incident.Builder
                public Incident.Builder closed(Boolean bool) {
                    this.closed = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Incident.Builder
                public Incident.Builder congestion(Congestion congestion) {
                    this.congestion = congestion;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Incident.Builder
                public Incident.Builder countryCodeAlpha2(String str) {
                    this.countryCodeAlpha2 = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Incident.Builder
                public Incident.Builder countryCodeAlpha3(String str) {
                    this.countryCodeAlpha3 = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Incident.Builder
                public Incident.Builder creationTime(String str) {
                    this.creationTime = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Incident.Builder
                public Incident.Builder description(String str) {
                    this.description = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Incident.Builder
                public Incident.Builder endTime(String str) {
                    this.endTime = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Incident.Builder
                public Incident.Builder geometryIndexEnd(Integer num) {
                    this.geometryIndexEnd = num;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Incident.Builder
                public Incident.Builder geometryIndexStart(Integer num) {
                    this.geometryIndexStart = num;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Incident.Builder
                public Incident.Builder id(String str) {
                    if (str == null) {
                        throw new NullPointerException(StubApp.getString2(2281));
                    }
                    this.id = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Incident.Builder
                public Incident.Builder impact(String str) {
                    this.impact = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Incident.Builder
                public Incident.Builder lanesBlocked(List<String> list) {
                    this.lanesBlocked = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Incident.Builder
                public Incident.Builder longDescription(String str) {
                    this.longDescription = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Incident.Builder
                public Incident.Builder numLanesBlocked(Integer num) {
                    this.numLanesBlocked = num;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Incident.Builder
                public Incident.Builder startTime(String str) {
                    this.startTime = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Incident.Builder
                public Incident.Builder subType(String str) {
                    this.subType = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Incident.Builder
                public Incident.Builder subTypeDescription(String str) {
                    this.subTypeDescription = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Incident.Builder
                public Incident.Builder trafficCodes(TrafficCodes trafficCodes) {
                    this.trafficCodes = trafficCodes;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Incident.Builder
                public Incident.Builder type(String str) {
                    this.type = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ Incident.Builder unrecognized(Map map) {
                    return unrecognized2((Map<String, b>) map);
                }

                public Builder() {
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                /* renamed from: unrecognized, reason: avoid collision after fix types in other method */
                public Incident.Builder unrecognized2(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }

                private Builder(Incident incident) {
                    this.unrecognized = incident.unrecognized();
                    this.id = incident.id();
                    this.type = incident.type();
                    this.closed = incident.closed();
                    this.congestion = incident.congestion();
                    this.description = incident.description();
                    this.longDescription = incident.longDescription();
                    this.impact = incident.impact();
                    this.subType = incident.subType();
                    this.subTypeDescription = incident.subTypeDescription();
                    this.alertcCodes = incident.alertcCodes();
                    this.trafficCodes = incident.trafficCodes();
                    this.geometryIndexStart = incident.geometryIndexStart();
                    this.geometryIndexEnd = incident.geometryIndexEnd();
                    this.creationTime = incident.creationTime();
                    this.startTime = incident.startTime();
                    this.endTime = incident.endTime();
                    this.countryCodeAlpha2 = incident.countryCodeAlpha2();
                    this.countryCodeAlpha3 = incident.countryCodeAlpha3();
                    this.lanesBlocked = incident.lanesBlocked();
                    this.numLanesBlocked = incident.numLanesBlocked();
                    this.affectedRoadNames = incident.affectedRoadNames();
                }
            }

            {
                this.unrecognized = map;
                if (str == null) {
                    throw new NullPointerException(StubApp.getString2(2281));
                }
                this.id = str;
                this.type = str2;
                this.closed = bool;
                this.congestion = congestion;
                this.description = str3;
                this.longDescription = str4;
                this.impact = str5;
                this.subType = str6;
                this.subTypeDescription = str7;
                this.alertcCodes = list;
                this.trafficCodes = trafficCodes;
                this.geometryIndexStart = num;
                this.geometryIndexEnd = num2;
                this.creationTime = str8;
                this.startTime = str9;
                this.endTime = str10;
                this.countryCodeAlpha2 = str11;
                this.countryCodeAlpha3 = str12;
                this.lanesBlocked = list2;
                this.numLanesBlocked = num3;
                this.affectedRoadNames = list3;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            @SerializedName("affected_road_names")
            public List<String> affectedRoadNames() {
                return this.affectedRoadNames;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            @SerializedName("alertc_codes")
            public List<Integer> alertcCodes() {
                return this.alertcCodes;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            public Boolean closed() {
                return this.closed;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            public Congestion congestion() {
                return this.congestion;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            @SerializedName("iso_3166_1_alpha2")
            public String countryCodeAlpha2() {
                return this.countryCodeAlpha2;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            @SerializedName("iso_3166_1_alpha3")
            public String countryCodeAlpha3() {
                return this.countryCodeAlpha3;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            @SerializedName("creation_time")
            public String creationTime() {
                return this.creationTime;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            public String description() {
                return this.description;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            @SerializedName("end_time")
            public String endTime() {
                return this.endTime;
            }

            public boolean equals(Object obj) {
                String str13;
                Boolean bool2;
                Congestion congestion2;
                String str14;
                String str15;
                String str16;
                String str17;
                String str18;
                List<Integer> list4;
                TrafficCodes trafficCodes2;
                Integer num4;
                Integer num5;
                String str19;
                String str20;
                String str21;
                String str22;
                String str23;
                List<String> list5;
                Integer num6;
                List<String> list6;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Incident) {
                    Incident incident = (Incident) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(incident.unrecognized()) : incident.unrecognized() == null) {
                        if (this.id.equals(incident.id()) && ((str13 = this.type) != null ? str13.equals(incident.type()) : incident.type() == null) && ((bool2 = this.closed) != null ? bool2.equals(incident.closed()) : incident.closed() == null) && ((congestion2 = this.congestion) != null ? congestion2.equals(incident.congestion()) : incident.congestion() == null) && ((str14 = this.description) != null ? str14.equals(incident.description()) : incident.description() == null) && ((str15 = this.longDescription) != null ? str15.equals(incident.longDescription()) : incident.longDescription() == null) && ((str16 = this.impact) != null ? str16.equals(incident.impact()) : incident.impact() == null) && ((str17 = this.subType) != null ? str17.equals(incident.subType()) : incident.subType() == null) && ((str18 = this.subTypeDescription) != null ? str18.equals(incident.subTypeDescription()) : incident.subTypeDescription() == null) && ((list4 = this.alertcCodes) != null ? list4.equals(incident.alertcCodes()) : incident.alertcCodes() == null) && ((trafficCodes2 = this.trafficCodes) != null ? trafficCodes2.equals(incident.trafficCodes()) : incident.trafficCodes() == null) && ((num4 = this.geometryIndexStart) != null ? num4.equals(incident.geometryIndexStart()) : incident.geometryIndexStart() == null) && ((num5 = this.geometryIndexEnd) != null ? num5.equals(incident.geometryIndexEnd()) : incident.geometryIndexEnd() == null) && ((str19 = this.creationTime) != null ? str19.equals(incident.creationTime()) : incident.creationTime() == null) && ((str20 = this.startTime) != null ? str20.equals(incident.startTime()) : incident.startTime() == null) && ((str21 = this.endTime) != null ? str21.equals(incident.endTime()) : incident.endTime() == null) && ((str22 = this.countryCodeAlpha2) != null ? str22.equals(incident.countryCodeAlpha2()) : incident.countryCodeAlpha2() == null) && ((str23 = this.countryCodeAlpha3) != null ? str23.equals(incident.countryCodeAlpha3()) : incident.countryCodeAlpha3() == null) && ((list5 = this.lanesBlocked) != null ? list5.equals(incident.lanesBlocked()) : incident.lanesBlocked() == null) && ((num6 = this.numLanesBlocked) != null ? num6.equals(incident.numLanesBlocked()) : incident.numLanesBlocked() == null) && ((list6 = this.affectedRoadNames) != null ? list6.equals(incident.affectedRoadNames()) : incident.affectedRoadNames() == null)) {
                            return true;
                        }
                    }
                }
                return false;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            @SerializedName("geometry_index_end")
            public Integer geometryIndexEnd() {
                return this.geometryIndexEnd;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            @SerializedName("geometry_index_start")
            public Integer geometryIndexStart() {
                return this.geometryIndexStart;
            }

            public int hashCode() {
                Map<String, b> map2 = this.unrecognized;
                int hashCode = ((((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003;
                String str13 = this.type;
                int hashCode2 = (hashCode ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                Boolean bool2 = this.closed;
                int hashCode3 = (hashCode2 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                Congestion congestion2 = this.congestion;
                int hashCode4 = (hashCode3 ^ (congestion2 == null ? 0 : congestion2.hashCode())) * 1000003;
                String str14 = this.description;
                int hashCode5 = (hashCode4 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.longDescription;
                int hashCode6 = (hashCode5 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.impact;
                int hashCode7 = (hashCode6 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.subType;
                int hashCode8 = (hashCode7 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.subTypeDescription;
                int hashCode9 = (hashCode8 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                List<Integer> list4 = this.alertcCodes;
                int hashCode10 = (hashCode9 ^ (list4 == null ? 0 : list4.hashCode())) * 1000003;
                TrafficCodes trafficCodes2 = this.trafficCodes;
                int hashCode11 = (hashCode10 ^ (trafficCodes2 == null ? 0 : trafficCodes2.hashCode())) * 1000003;
                Integer num4 = this.geometryIndexStart;
                int hashCode12 = (hashCode11 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Integer num5 = this.geometryIndexEnd;
                int hashCode13 = (hashCode12 ^ (num5 == null ? 0 : num5.hashCode())) * 1000003;
                String str19 = this.creationTime;
                int hashCode14 = (hashCode13 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                String str20 = this.startTime;
                int hashCode15 = (hashCode14 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
                String str21 = this.endTime;
                int hashCode16 = (hashCode15 ^ (str21 == null ? 0 : str21.hashCode())) * 1000003;
                String str22 = this.countryCodeAlpha2;
                int hashCode17 = (hashCode16 ^ (str22 == null ? 0 : str22.hashCode())) * 1000003;
                String str23 = this.countryCodeAlpha3;
                int hashCode18 = (hashCode17 ^ (str23 == null ? 0 : str23.hashCode())) * 1000003;
                List<String> list5 = this.lanesBlocked;
                int hashCode19 = (hashCode18 ^ (list5 == null ? 0 : list5.hashCode())) * 1000003;
                Integer num6 = this.numLanesBlocked;
                int hashCode20 = (hashCode19 ^ (num6 == null ? 0 : num6.hashCode())) * 1000003;
                List<String> list6 = this.affectedRoadNames;
                return hashCode20 ^ (list6 != null ? list6.hashCode() : 0);
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            public String id() {
                return this.id;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            public String impact() {
                return this.impact;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            @SerializedName("lanes_blocked")
            public List<String> lanesBlocked() {
                return this.lanesBlocked;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            @SerializedName("long_description")
            public String longDescription() {
                return this.longDescription;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            @SerializedName("num_lanes_blocked")
            public Integer numLanesBlocked() {
                return this.numLanesBlocked;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            @SerializedName("start_time")
            public String startTime() {
                return this.startTime;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            @SerializedName("sub_type")
            public String subType() {
                return this.subType;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            @SerializedName("sub_type_description")
            public String subTypeDescription() {
                return this.subTypeDescription;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            public Incident.Builder toBuilder() {
                return new Builder(this, null);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(12752));
                sb2.append(this.unrecognized);
                sb2.append(StubApp.getString2(2296));
                sb2.append(this.id);
                sb2.append(StubApp.getString2(2148));
                sb2.append(this.type);
                sb2.append(StubApp.getString2(12753));
                sb2.append(this.closed);
                sb2.append(StubApp.getString2(12754));
                sb2.append(this.congestion);
                sb2.append(StubApp.getString2(7300));
                sb2.append(this.description);
                sb2.append(StubApp.getString2(7308));
                sb2.append(this.longDescription);
                sb2.append(StubApp.getString2(12755));
                sb2.append(this.impact);
                sb2.append(StubApp.getString2(7301));
                sb2.append(this.subType);
                sb2.append(StubApp.getString2(7302));
                sb2.append(this.subTypeDescription);
                sb2.append(StubApp.getString2(7303));
                sb2.append(this.alertcCodes);
                sb2.append(StubApp.getString2(7304));
                sb2.append(this.trafficCodes);
                sb2.append(StubApp.getString2(12718));
                sb2.append(this.geometryIndexStart);
                sb2.append(StubApp.getString2(12719));
                sb2.append(this.geometryIndexEnd);
                sb2.append(StubApp.getString2(7297));
                sb2.append(this.creationTime);
                sb2.append(StubApp.getString2(7298));
                sb2.append(this.startTime);
                sb2.append(StubApp.getString2(7299));
                sb2.append(this.endTime);
                sb2.append(StubApp.getString2(7305));
                sb2.append(this.countryCodeAlpha2);
                sb2.append(StubApp.getString2(7306));
                sb2.append(this.countryCodeAlpha3);
                sb2.append(StubApp.getString2(7307));
                sb2.append(this.lanesBlocked);
                sb2.append(StubApp.getString2(7310));
                sb2.append(this.numLanesBlocked);
                sb2.append(StubApp.getString2(7311));
                return a.l(StubApp.getString2(265), sb2, this.affectedRoadNames);
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            @SerializedName("traffic_codes")
            public TrafficCodes trafficCodes() {
                return this.trafficCodes;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            public String type() {
                return this.type;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, b> unrecognized() {
                return this.unrecognized;
            }
        };
    }
}
