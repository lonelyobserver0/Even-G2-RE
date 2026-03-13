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
import com.mapbox.api.directions.v5.models.StepIntersection;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_StepIntersection extends C$AutoValue_StepIntersection {

    public static final class GsonTypeAdapter extends TypeAdapter<StepIntersection> {
        private volatile TypeAdapter<double[]> array__double_adapter;
        private volatile TypeAdapter<Boolean> boolean__adapter;
        private volatile TypeAdapter<Double> double__adapter;
        private final Gson gson;
        private volatile TypeAdapter<Integer> integer_adapter;
        private volatile TypeAdapter<Interchange> interchange_adapter;
        private volatile TypeAdapter<Junction> junction_adapter;
        private volatile TypeAdapter<List<Boolean>> list__boolean_adapter;
        private volatile TypeAdapter<List<Integer>> list__integer_adapter;
        private volatile TypeAdapter<List<IntersectionLanes>> list__intersectionLanes_adapter;
        private volatile TypeAdapter<List<String>> list__string_adapter;
        private volatile TypeAdapter<MapboxStreetsV8> mapboxStreetsV8_adapter;
        private volatile TypeAdapter<MergingArea> mergingArea_adapter;
        private volatile TypeAdapter<RestStop> restStop_adapter;
        private volatile TypeAdapter<String> string_adapter;
        private volatile TypeAdapter<TollCollection> tollCollection_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(13123);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public StepIntersection read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            StepIntersection.Builder builder = StepIntersection.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    nextName.getClass();
                    char c10 = 65535;
                    switch (nextName.hashCode()) {
                        case -2138077289:
                            if (nextName.equals(StubApp.getString2(13118))) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case -1992012396:
                            if (nextName.equals(StubApp.getString2(2091))) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case -1990884566:
                            if (nextName.equals(StubApp.getString2(13117))) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case -1860195955:
                            if (nextName.equals(StubApp.getString2(13116))) {
                                c10 = 3;
                                break;
                            }
                            break;
                        case -1635827807:
                            if (nextName.equals(StubApp.getString2(13115))) {
                                c10 = 4;
                                break;
                            }
                            break;
                        case -1423461020:
                            if (nextName.equals(StubApp.getString2(13003))) {
                                c10 = 5;
                                break;
                            }
                            break;
                        case -1153639548:
                            if (nextName.equals(StubApp.getString2(13114))) {
                                c10 = 6;
                                break;
                            }
                            break;
                        case -453701534:
                            if (nextName.equals(StubApp.getString2(13113))) {
                                c10 = 7;
                                break;
                            }
                            break;
                        case -153380894:
                            if (nextName.equals(StubApp.getString2(13112))) {
                                c10 = '\b';
                                break;
                            }
                            break;
                        case -141398:
                            if (nextName.equals(StubApp.getString2(13111))) {
                                c10 = '\t';
                                break;
                            }
                            break;
                        case 3354:
                            if (nextName.equals(StubApp.getString2(13110))) {
                                c10 = '\n';
                                break;
                            }
                            break;
                        case 105051:
                            if (nextName.equals(StubApp.getString2(13109))) {
                                c10 = 11;
                                break;
                            }
                            break;
                        case 126514429:
                            if (nextName.equals(StubApp.getString2(13108))) {
                                c10 = '\f';
                                break;
                            }
                            break;
                        case 144821770:
                            if (nextName.equals(StubApp.getString2(13107))) {
                                c10 = '\r';
                                break;
                            }
                            break;
                        case 203916432:
                            if (nextName.equals(StubApp.getString2(13084))) {
                                c10 = 14;
                                break;
                            }
                            break;
                        case 300524546:
                            if (nextName.equals(StubApp.getString2(13106))) {
                                c10 = 15;
                                break;
                            }
                            break;
                        case 813692613:
                            if (nextName.equals(StubApp.getString2(13032))) {
                                c10 = 16;
                                break;
                            }
                            break;
                        case 1138026287:
                            if (nextName.equals(StubApp.getString2(13105))) {
                                c10 = 17;
                                break;
                            }
                            break;
                        case 1575163938:
                            if (nextName.equals(StubApp.getString2(13104))) {
                                c10 = 18;
                                break;
                            }
                            break;
                        case 1630093274:
                            if (nextName.equals(StubApp.getString2(13103))) {
                                c10 = 19;
                                break;
                            }
                            break;
                        case 1901043637:
                            if (nextName.equals(StubApp.getString2(662))) {
                                c10 = 20;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            TypeAdapter<MergingArea> typeAdapter = this.mergingArea_adapter;
                            if (typeAdapter == null) {
                                typeAdapter = this.gson.getAdapter(MergingArea.class);
                                this.mergingArea_adapter = typeAdapter;
                            }
                            builder.mergingArea(typeAdapter.read2(jsonReader));
                            break;
                        case 1:
                            TypeAdapter<Double> typeAdapter2 = this.double__adapter;
                            if (typeAdapter2 == null) {
                                typeAdapter2 = this.gson.getAdapter(Double.class);
                                this.double__adapter = typeAdapter2;
                            }
                            builder.duration(typeAdapter2.read2(jsonReader));
                            break;
                        case 2:
                            TypeAdapter<Boolean> typeAdapter3 = this.boolean__adapter;
                            if (typeAdapter3 == null) {
                                typeAdapter3 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = typeAdapter3;
                            }
                            builder.trafficSignal(typeAdapter3.read2(jsonReader));
                            break;
                        case 3:
                            TypeAdapter<RestStop> typeAdapter4 = this.restStop_adapter;
                            if (typeAdapter4 == null) {
                                typeAdapter4 = this.gson.getAdapter(RestStop.class);
                                this.restStop_adapter = typeAdapter4;
                            }
                            builder.restStop(typeAdapter4.read2(jsonReader));
                            break;
                        case 4:
                            TypeAdapter<MapboxStreetsV8> typeAdapter5 = this.mapboxStreetsV8_adapter;
                            if (typeAdapter5 == null) {
                                typeAdapter5 = this.gson.getAdapter(MapboxStreetsV8.class);
                                this.mapboxStreetsV8_adapter = typeAdapter5;
                            }
                            builder.mapboxStreetsV8(typeAdapter5.read2(jsonReader));
                            break;
                        case 5:
                            TypeAdapter<List<Integer>> typeAdapter6 = this.list__integer_adapter;
                            if (typeAdapter6 == null) {
                                typeAdapter6 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
                                this.list__integer_adapter = typeAdapter6;
                            }
                            builder.access(typeAdapter6.read2(jsonReader));
                            break;
                        case 6:
                            TypeAdapter<Boolean> typeAdapter7 = this.boolean__adapter;
                            if (typeAdapter7 == null) {
                                typeAdapter7 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = typeAdapter7;
                            }
                            builder.railwayCrossing(typeAdapter7.read2(jsonReader));
                            break;
                        case 7:
                            TypeAdapter<List<String>> typeAdapter8 = this.list__string_adapter;
                            if (typeAdapter8 == null) {
                                typeAdapter8 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                                this.list__string_adapter = typeAdapter8;
                            }
                            builder.formOfWay(typeAdapter8.read2(jsonReader));
                            break;
                        case '\b':
                            TypeAdapter<Integer> typeAdapter9 = this.integer_adapter;
                            if (typeAdapter9 == null) {
                                typeAdapter9 = this.gson.getAdapter(Integer.class);
                                this.integer_adapter = typeAdapter9;
                            }
                            builder.adminIndex(typeAdapter9.read2(jsonReader));
                            break;
                        case '\t':
                            TypeAdapter<List<Boolean>> typeAdapter10 = this.list__boolean_adapter;
                            if (typeAdapter10 == null) {
                                typeAdapter10 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Boolean.class));
                                this.list__boolean_adapter = typeAdapter10;
                            }
                            builder.elevated(typeAdapter10.read2(jsonReader));
                            break;
                        case '\n':
                            TypeAdapter<Interchange> typeAdapter11 = this.interchange_adapter;
                            if (typeAdapter11 == null) {
                                typeAdapter11 = this.gson.getAdapter(Interchange.class);
                                this.interchange_adapter = typeAdapter11;
                            }
                            builder.interchange(typeAdapter11.read2(jsonReader));
                            break;
                        case 11:
                            TypeAdapter<Junction> typeAdapter12 = this.junction_adapter;
                            if (typeAdapter12 == null) {
                                typeAdapter12 = this.gson.getAdapter(Junction.class);
                                this.junction_adapter = typeAdapter12;
                            }
                            builder.junction(typeAdapter12.read2(jsonReader));
                            break;
                        case '\f':
                            TypeAdapter<Boolean> typeAdapter13 = this.boolean__adapter;
                            if (typeAdapter13 == null) {
                                typeAdapter13 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = typeAdapter13;
                            }
                            builder.isUrban(typeAdapter13.read2(jsonReader));
                            break;
                        case '\r':
                            TypeAdapter<List<Boolean>> typeAdapter14 = this.list__boolean_adapter;
                            if (typeAdapter14 == null) {
                                typeAdapter14 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Boolean.class));
                                this.list__boolean_adapter = typeAdapter14;
                            }
                            builder.bridges(typeAdapter14.read2(jsonReader));
                            break;
                        case 14:
                            TypeAdapter<List<String>> typeAdapter15 = this.list__string_adapter;
                            if (typeAdapter15 == null) {
                                typeAdapter15 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                                this.list__string_adapter = typeAdapter15;
                            }
                            builder.geometries(typeAdapter15.read2(jsonReader));
                            break;
                        case 15:
                            TypeAdapter<String> typeAdapter16 = this.string_adapter;
                            if (typeAdapter16 == null) {
                                typeAdapter16 = this.gson.getAdapter(String.class);
                                this.string_adapter = typeAdapter16;
                            }
                            builder.tunnelName(typeAdapter16.read2(jsonReader));
                            break;
                        case 16:
                            TypeAdapter<Integer> typeAdapter17 = this.integer_adapter;
                            if (typeAdapter17 == null) {
                                typeAdapter17 = this.gson.getAdapter(Integer.class);
                                this.integer_adapter = typeAdapter17;
                            }
                            builder.geometryIndex(typeAdapter17.read2(jsonReader));
                            break;
                        case 17:
                            TypeAdapter<Boolean> typeAdapter18 = this.boolean__adapter;
                            if (typeAdapter18 == null) {
                                typeAdapter18 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = typeAdapter18;
                            }
                            builder.yieldSign(typeAdapter18.read2(jsonReader));
                            break;
                        case 18:
                            TypeAdapter<TollCollection> typeAdapter19 = this.tollCollection_adapter;
                            if (typeAdapter19 == null) {
                                typeAdapter19 = this.gson.getAdapter(TollCollection.class);
                                this.tollCollection_adapter = typeAdapter19;
                            }
                            builder.tollCollection(typeAdapter19.read2(jsonReader));
                            break;
                        case 19:
                            TypeAdapter<Boolean> typeAdapter20 = this.boolean__adapter;
                            if (typeAdapter20 == null) {
                                typeAdapter20 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = typeAdapter20;
                            }
                            builder.stopSign(typeAdapter20.read2(jsonReader));
                            break;
                        case 20:
                            TypeAdapter<double[]> typeAdapter21 = this.array__double_adapter;
                            if (typeAdapter21 == null) {
                                typeAdapter21 = this.gson.getAdapter(double[].class);
                                this.array__double_adapter = typeAdapter21;
                            }
                            builder.rawLocation(typeAdapter21.read2(jsonReader));
                            break;
                        default:
                            if (!StubApp.getString2(13082).equals(nextName)) {
                                if (!StubApp.getString2(13119).equals(nextName)) {
                                    if (!StubApp.getString2(13120).equals(nextName)) {
                                        if (!StubApp.getString2(13121).equals(nextName)) {
                                            if (!StubApp.getString2(12656).equals(nextName)) {
                                                if (!StubApp.getString2(13122).equals(nextName)) {
                                                    if (linkedHashMap == null) {
                                                        linkedHashMap = new LinkedHashMap();
                                                        builder.unrecognized(linkedHashMap);
                                                    }
                                                    a.t((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, nextName);
                                                    break;
                                                } else {
                                                    TypeAdapter<List<IntersectionLanes>> typeAdapter22 = this.list__intersectionLanes_adapter;
                                                    if (typeAdapter22 == null) {
                                                        typeAdapter22 = this.gson.getAdapter(TypeToken.getParameterized(List.class, IntersectionLanes.class));
                                                        this.list__intersectionLanes_adapter = typeAdapter22;
                                                    }
                                                    builder.lanes(typeAdapter22.read2(jsonReader));
                                                    break;
                                                }
                                            } else {
                                                TypeAdapter<Integer> typeAdapter23 = this.integer_adapter;
                                                if (typeAdapter23 == null) {
                                                    typeAdapter23 = this.gson.getAdapter(Integer.class);
                                                    this.integer_adapter = typeAdapter23;
                                                }
                                                builder.out(typeAdapter23.read2(jsonReader));
                                                break;
                                            }
                                        } else {
                                            TypeAdapter<Integer> typeAdapter24 = this.integer_adapter;
                                            if (typeAdapter24 == null) {
                                                typeAdapter24 = this.gson.getAdapter(Integer.class);
                                                this.integer_adapter = typeAdapter24;
                                            }
                                            builder.in(typeAdapter24.read2(jsonReader));
                                            break;
                                        }
                                    } else {
                                        TypeAdapter<List<Boolean>> typeAdapter25 = this.list__boolean_adapter;
                                        if (typeAdapter25 == null) {
                                            typeAdapter25 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Boolean.class));
                                            this.list__boolean_adapter = typeAdapter25;
                                        }
                                        builder.entry(typeAdapter25.read2(jsonReader));
                                        break;
                                    }
                                } else {
                                    TypeAdapter<List<String>> typeAdapter26 = this.list__string_adapter;
                                    if (typeAdapter26 == null) {
                                        typeAdapter26 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                                        this.list__string_adapter = typeAdapter26;
                                    }
                                    builder.classes(typeAdapter26.read2(jsonReader));
                                    break;
                                }
                            } else {
                                TypeAdapter<List<Integer>> typeAdapter27 = this.list__integer_adapter;
                                if (typeAdapter27 == null) {
                                    typeAdapter27 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
                                    this.list__integer_adapter = typeAdapter27;
                                }
                                builder.bearings(typeAdapter27.read2(jsonReader));
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
        public void write(JsonWriter jsonWriter, StepIntersection stepIntersection) throws IOException {
            if (stepIntersection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (stepIntersection.unrecognized() != null) {
                for (Map.Entry<String, b> entry : stepIntersection.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(662));
            if (stepIntersection.rawLocation() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<double[]> typeAdapter = this.array__double_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(double[].class);
                    this.array__double_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, stepIntersection.rawLocation());
            }
            jsonWriter.name(StubApp.getString2(13082));
            if (stepIntersection.bearings() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Integer>> typeAdapter2 = this.list__integer_adapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
                    this.list__integer_adapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, stepIntersection.bearings());
            }
            jsonWriter.name(StubApp.getString2(13119));
            if (stepIntersection.classes() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<String>> typeAdapter3 = this.list__string_adapter;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.list__string_adapter = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, stepIntersection.classes());
            }
            jsonWriter.name(StubApp.getString2(13120));
            if (stepIntersection.entry() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Boolean>> typeAdapter4 = this.list__boolean_adapter;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Boolean.class));
                    this.list__boolean_adapter = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, stepIntersection.entry());
            }
            jsonWriter.name(StubApp.getString2(13113));
            if (stepIntersection.formOfWay() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<String>> typeAdapter5 = this.list__string_adapter;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.list__string_adapter = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, stepIntersection.formOfWay());
            }
            jsonWriter.name(StubApp.getString2(13084));
            if (stepIntersection.geometries() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<String>> typeAdapter6 = this.list__string_adapter;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.list__string_adapter = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, stepIntersection.geometries());
            }
            jsonWriter.name(StubApp.getString2(13003));
            if (stepIntersection.access() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Integer>> typeAdapter7 = this.list__integer_adapter;
                if (typeAdapter7 == null) {
                    typeAdapter7 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
                    this.list__integer_adapter = typeAdapter7;
                }
                typeAdapter7.write(jsonWriter, stepIntersection.access());
            }
            jsonWriter.name(StubApp.getString2(13111));
            if (stepIntersection.elevated() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Boolean>> typeAdapter8 = this.list__boolean_adapter;
                if (typeAdapter8 == null) {
                    typeAdapter8 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Boolean.class));
                    this.list__boolean_adapter = typeAdapter8;
                }
                typeAdapter8.write(jsonWriter, stepIntersection.elevated());
            }
            jsonWriter.name(StubApp.getString2(13107));
            if (stepIntersection.bridges() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Boolean>> typeAdapter9 = this.list__boolean_adapter;
                if (typeAdapter9 == null) {
                    typeAdapter9 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Boolean.class));
                    this.list__boolean_adapter = typeAdapter9;
                }
                typeAdapter9.write(jsonWriter, stepIntersection.bridges());
            }
            jsonWriter.name(StubApp.getString2(13121));
            if (stepIntersection.in() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter10 = this.integer_adapter;
                if (typeAdapter10 == null) {
                    typeAdapter10 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = typeAdapter10;
                }
                typeAdapter10.write(jsonWriter, stepIntersection.in());
            }
            jsonWriter.name(StubApp.getString2(12656));
            if (stepIntersection.out() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter11 = this.integer_adapter;
                if (typeAdapter11 == null) {
                    typeAdapter11 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = typeAdapter11;
                }
                typeAdapter11.write(jsonWriter, stepIntersection.out());
            }
            jsonWriter.name(StubApp.getString2(13122));
            if (stepIntersection.lanes() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<IntersectionLanes>> typeAdapter12 = this.list__intersectionLanes_adapter;
                if (typeAdapter12 == null) {
                    typeAdapter12 = this.gson.getAdapter(TypeToken.getParameterized(List.class, IntersectionLanes.class));
                    this.list__intersectionLanes_adapter = typeAdapter12;
                }
                typeAdapter12.write(jsonWriter, stepIntersection.lanes());
            }
            jsonWriter.name(StubApp.getString2(13032));
            if (stepIntersection.geometryIndex() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter13 = this.integer_adapter;
                if (typeAdapter13 == null) {
                    typeAdapter13 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = typeAdapter13;
                }
                typeAdapter13.write(jsonWriter, stepIntersection.geometryIndex());
            }
            jsonWriter.name(StubApp.getString2(13108));
            if (stepIntersection.isUrban() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter14 = this.boolean__adapter;
                if (typeAdapter14 == null) {
                    typeAdapter14 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = typeAdapter14;
                }
                typeAdapter14.write(jsonWriter, stepIntersection.isUrban());
            }
            jsonWriter.name(StubApp.getString2(13112));
            if (stepIntersection.adminIndex() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter15 = this.integer_adapter;
                if (typeAdapter15 == null) {
                    typeAdapter15 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = typeAdapter15;
                }
                typeAdapter15.write(jsonWriter, stepIntersection.adminIndex());
            }
            jsonWriter.name(StubApp.getString2(13116));
            if (stepIntersection.restStop() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<RestStop> typeAdapter16 = this.restStop_adapter;
                if (typeAdapter16 == null) {
                    typeAdapter16 = this.gson.getAdapter(RestStop.class);
                    this.restStop_adapter = typeAdapter16;
                }
                typeAdapter16.write(jsonWriter, stepIntersection.restStop());
            }
            jsonWriter.name(StubApp.getString2(13104));
            if (stepIntersection.tollCollection() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<TollCollection> typeAdapter17 = this.tollCollection_adapter;
                if (typeAdapter17 == null) {
                    typeAdapter17 = this.gson.getAdapter(TollCollection.class);
                    this.tollCollection_adapter = typeAdapter17;
                }
                typeAdapter17.write(jsonWriter, stepIntersection.tollCollection());
            }
            jsonWriter.name(StubApp.getString2(13115));
            if (stepIntersection.mapboxStreetsV8() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<MapboxStreetsV8> typeAdapter18 = this.mapboxStreetsV8_adapter;
                if (typeAdapter18 == null) {
                    typeAdapter18 = this.gson.getAdapter(MapboxStreetsV8.class);
                    this.mapboxStreetsV8_adapter = typeAdapter18;
                }
                typeAdapter18.write(jsonWriter, stepIntersection.mapboxStreetsV8());
            }
            jsonWriter.name(StubApp.getString2(13106));
            if (stepIntersection.tunnelName() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter19 = this.string_adapter;
                if (typeAdapter19 == null) {
                    typeAdapter19 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter19;
                }
                typeAdapter19.write(jsonWriter, stepIntersection.tunnelName());
            }
            jsonWriter.name(StubApp.getString2(13114));
            if (stepIntersection.railwayCrossing() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter20 = this.boolean__adapter;
                if (typeAdapter20 == null) {
                    typeAdapter20 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = typeAdapter20;
                }
                typeAdapter20.write(jsonWriter, stepIntersection.railwayCrossing());
            }
            jsonWriter.name(StubApp.getString2(13117));
            if (stepIntersection.trafficSignal() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter21 = this.boolean__adapter;
                if (typeAdapter21 == null) {
                    typeAdapter21 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = typeAdapter21;
                }
                typeAdapter21.write(jsonWriter, stepIntersection.trafficSignal());
            }
            jsonWriter.name(StubApp.getString2(13103));
            if (stepIntersection.stopSign() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter22 = this.boolean__adapter;
                if (typeAdapter22 == null) {
                    typeAdapter22 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = typeAdapter22;
                }
                typeAdapter22.write(jsonWriter, stepIntersection.stopSign());
            }
            jsonWriter.name(StubApp.getString2(13105));
            if (stepIntersection.yieldSign() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter23 = this.boolean__adapter;
                if (typeAdapter23 == null) {
                    typeAdapter23 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = typeAdapter23;
                }
                typeAdapter23.write(jsonWriter, stepIntersection.yieldSign());
            }
            jsonWriter.name(StubApp.getString2(13110));
            if (stepIntersection.interchange() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Interchange> typeAdapter24 = this.interchange_adapter;
                if (typeAdapter24 == null) {
                    typeAdapter24 = this.gson.getAdapter(Interchange.class);
                    this.interchange_adapter = typeAdapter24;
                }
                typeAdapter24.write(jsonWriter, stepIntersection.interchange());
            }
            jsonWriter.name(StubApp.getString2(13109));
            if (stepIntersection.junction() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Junction> typeAdapter25 = this.junction_adapter;
                if (typeAdapter25 == null) {
                    typeAdapter25 = this.gson.getAdapter(Junction.class);
                    this.junction_adapter = typeAdapter25;
                }
                typeAdapter25.write(jsonWriter, stepIntersection.junction());
            }
            jsonWriter.name(StubApp.getString2(13118));
            if (stepIntersection.mergingArea() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<MergingArea> typeAdapter26 = this.mergingArea_adapter;
                if (typeAdapter26 == null) {
                    typeAdapter26 = this.gson.getAdapter(MergingArea.class);
                    this.mergingArea_adapter = typeAdapter26;
                }
                typeAdapter26.write(jsonWriter, stepIntersection.mergingArea());
            }
            jsonWriter.name(StubApp.getString2(2091));
            if (stepIntersection.duration() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter27 = this.double__adapter;
                if (typeAdapter27 == null) {
                    typeAdapter27 = this.gson.getAdapter(Double.class);
                    this.double__adapter = typeAdapter27;
                }
                typeAdapter27.write(jsonWriter, stepIntersection.duration());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_StepIntersection(final Map<String, b> map, final double[] dArr, final List<Integer> list, final List<String> list2, final List<Boolean> list3, final List<String> list4, final List<String> list5, final List<Integer> list6, final List<Boolean> list7, final List<Boolean> list8, final Integer num, final Integer num2, final List<IntersectionLanes> list9, final Integer num3, final Boolean bool, final Integer num4, final RestStop restStop, final TollCollection tollCollection, final MapboxStreetsV8 mapboxStreetsV8, final String str, final Boolean bool2, final Boolean bool3, final Boolean bool4, final Boolean bool5, final Interchange interchange, final Junction junction, final MergingArea mergingArea, final Double d8) {
        new StepIntersection(map, dArr, list, list2, list3, list4, list5, list6, list7, list8, num, num2, list9, num3, bool, num4, restStop, tollCollection, mapboxStreetsV8, str, bool2, bool3, bool4, bool5, interchange, junction, mergingArea, d8) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_StepIntersection
            private final List<Integer> access;
            private final Integer adminIndex;
            private final List<Integer> bearings;
            private final List<Boolean> bridges;
            private final List<String> classes;
            private final Double duration;
            private final List<Boolean> elevated;
            private final List<Boolean> entry;
            private final List<String> formOfWay;
            private final List<String> geometries;
            private final Integer geometryIndex;
            private final Integer in;
            private final Interchange interchange;
            private final Boolean isUrban;
            private final Junction junction;
            private final List<IntersectionLanes> lanes;
            private final MapboxStreetsV8 mapboxStreetsV8;
            private final MergingArea mergingArea;
            private final Integer out;
            private final Boolean railwayCrossing;
            private final double[] rawLocation;
            private final RestStop restStop;
            private final Boolean stopSign;
            private final TollCollection tollCollection;
            private final Boolean trafficSignal;
            private final String tunnelName;
            private final Map<String, b> unrecognized;
            private final Boolean yieldSign;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_StepIntersection$Builder */
            public static class Builder extends StepIntersection.Builder {
                private List<Integer> access;
                private Integer adminIndex;
                private List<Integer> bearings;
                private List<Boolean> bridges;
                private List<String> classes;
                private Double duration;
                private List<Boolean> elevated;
                private List<Boolean> entry;
                private List<String> formOfWay;
                private List<String> geometries;
                private Integer geometryIndex;
                private Integer in;
                private Interchange interchange;
                private Boolean isUrban;
                private Junction junction;
                private List<IntersectionLanes> lanes;
                private MapboxStreetsV8 mapboxStreetsV8;
                private MergingArea mergingArea;
                private Integer out;
                private Boolean railwayCrossing;
                private double[] rawLocation;
                private RestStop restStop;
                private Boolean stopSign;
                private TollCollection tollCollection;
                private Boolean trafficSignal;
                private String tunnelName;
                private Map<String, b> unrecognized;
                private Boolean yieldSign;

                @Override // com.mapbox.api.directions.v5.models.StepIntersection.Builder
                public StepIntersection.Builder access(List<Integer> list) {
                    this.access = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepIntersection.Builder
                public StepIntersection.Builder adminIndex(Integer num) {
                    this.adminIndex = num;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepIntersection.Builder
                public StepIntersection.Builder bearings(List<Integer> list) {
                    this.bearings = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepIntersection.Builder
                public StepIntersection.Builder bridges(List<Boolean> list) {
                    this.bridges = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepIntersection.Builder
                public StepIntersection build() {
                    String string2 = this.rawLocation == null ? StubApp.getString2(12748) : "";
                    if (string2.isEmpty()) {
                        return new AutoValue_StepIntersection(this.unrecognized, this.rawLocation, this.bearings, this.classes, this.entry, this.formOfWay, this.geometries, this.access, this.elevated, this.bridges, this.in, this.out, this.lanes, this.geometryIndex, this.isUrban, this.adminIndex, this.restStop, this.tollCollection, this.mapboxStreetsV8, this.tunnelName, this.railwayCrossing, this.trafficSignal, this.stopSign, this.yieldSign, this.interchange, this.junction, this.mergingArea, this.duration);
                    }
                    throw new IllegalStateException(StubApp.getString2(555).concat(string2));
                }

                @Override // com.mapbox.api.directions.v5.models.StepIntersection.Builder
                public StepIntersection.Builder classes(List<String> list) {
                    this.classes = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepIntersection.Builder
                public StepIntersection.Builder duration(Double d8) {
                    this.duration = d8;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepIntersection.Builder
                public StepIntersection.Builder elevated(List<Boolean> list) {
                    this.elevated = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepIntersection.Builder
                public StepIntersection.Builder entry(List<Boolean> list) {
                    this.entry = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepIntersection.Builder
                public StepIntersection.Builder formOfWay(List<String> list) {
                    this.formOfWay = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepIntersection.Builder
                public StepIntersection.Builder geometries(List<String> list) {
                    this.geometries = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepIntersection.Builder
                public StepIntersection.Builder geometryIndex(Integer num) {
                    this.geometryIndex = num;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepIntersection.Builder
                public StepIntersection.Builder in(Integer num) {
                    this.in = num;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepIntersection.Builder
                public StepIntersection.Builder interchange(Interchange interchange) {
                    this.interchange = interchange;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepIntersection.Builder
                public StepIntersection.Builder isUrban(Boolean bool) {
                    this.isUrban = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepIntersection.Builder
                public StepIntersection.Builder junction(Junction junction) {
                    this.junction = junction;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepIntersection.Builder
                public StepIntersection.Builder lanes(List<IntersectionLanes> list) {
                    this.lanes = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepIntersection.Builder
                public StepIntersection.Builder mapboxStreetsV8(MapboxStreetsV8 mapboxStreetsV8) {
                    this.mapboxStreetsV8 = mapboxStreetsV8;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepIntersection.Builder
                public StepIntersection.Builder mergingArea(MergingArea mergingArea) {
                    this.mergingArea = mergingArea;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepIntersection.Builder
                public StepIntersection.Builder out(Integer num) {
                    this.out = num;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepIntersection.Builder
                public StepIntersection.Builder railwayCrossing(Boolean bool) {
                    this.railwayCrossing = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepIntersection.Builder
                public StepIntersection.Builder rawLocation(double[] dArr) {
                    if (dArr == null) {
                        throw new NullPointerException(StubApp.getString2(12749));
                    }
                    this.rawLocation = dArr;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepIntersection.Builder
                public StepIntersection.Builder restStop(RestStop restStop) {
                    this.restStop = restStop;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepIntersection.Builder
                public StepIntersection.Builder stopSign(Boolean bool) {
                    this.stopSign = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepIntersection.Builder
                public StepIntersection.Builder tollCollection(TollCollection tollCollection) {
                    this.tollCollection = tollCollection;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepIntersection.Builder
                public StepIntersection.Builder trafficSignal(Boolean bool) {
                    this.trafficSignal = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepIntersection.Builder
                public StepIntersection.Builder tunnelName(String str) {
                    this.tunnelName = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ StepIntersection.Builder unrecognized(Map map) {
                    return unrecognized2((Map<String, b>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.StepIntersection.Builder
                public StepIntersection.Builder yieldSign(Boolean bool) {
                    this.yieldSign = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                /* renamed from: unrecognized, reason: avoid collision after fix types in other method */
                public StepIntersection.Builder unrecognized2(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }
            }

            {
                this.unrecognized = map;
                if (dArr == null) {
                    throw new NullPointerException(StubApp.getString2(12749));
                }
                this.rawLocation = dArr;
                this.bearings = list;
                this.classes = list2;
                this.entry = list3;
                this.formOfWay = list4;
                this.geometries = list5;
                this.access = list6;
                this.elevated = list7;
                this.bridges = list8;
                this.in = num;
                this.out = num2;
                this.lanes = list9;
                this.geometryIndex = num3;
                this.isUrban = bool;
                this.adminIndex = num4;
                this.restStop = restStop;
                this.tollCollection = tollCollection;
                this.mapboxStreetsV8 = mapboxStreetsV8;
                this.tunnelName = str;
                this.railwayCrossing = bool2;
                this.trafficSignal = bool3;
                this.stopSign = bool4;
                this.yieldSign = bool5;
                this.interchange = interchange;
                this.junction = junction;
                this.mergingArea = mergingArea;
                this.duration = d8;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("access")
            public List<Integer> access() {
                return this.access;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("admin_index")
            public Integer adminIndex() {
                return this.adminIndex;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            public List<Integer> bearings() {
                return this.bearings;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("bridges")
            public List<Boolean> bridges() {
                return this.bridges;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            public List<String> classes() {
                return this.classes;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("duration")
            public Double duration() {
                return this.duration;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("elevated")
            public List<Boolean> elevated() {
                return this.elevated;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            public List<Boolean> entry() {
                return this.entry;
            }

            public boolean equals(Object obj) {
                List<Integer> list10;
                List<String> list11;
                List<Boolean> list12;
                List<String> list13;
                List<String> list14;
                List<Integer> list15;
                List<Boolean> list16;
                List<Boolean> list17;
                Integer num5;
                Integer num6;
                List<IntersectionLanes> list18;
                Integer num7;
                Boolean bool6;
                Integer num8;
                RestStop restStop2;
                TollCollection tollCollection2;
                MapboxStreetsV8 mapboxStreetsV82;
                String str2;
                Boolean bool7;
                Boolean bool8;
                Boolean bool9;
                Boolean bool10;
                Interchange interchange2;
                Junction junction2;
                MergingArea mergingArea2;
                Double d10;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof StepIntersection) {
                    StepIntersection stepIntersection = (StepIntersection) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(stepIntersection.unrecognized()) : stepIntersection.unrecognized() == null) {
                        if (Arrays.equals(this.rawLocation, stepIntersection instanceof C$AutoValue_StepIntersection ? ((C$AutoValue_StepIntersection) stepIntersection).rawLocation : stepIntersection.rawLocation()) && ((list10 = this.bearings) != null ? list10.equals(stepIntersection.bearings()) : stepIntersection.bearings() == null) && ((list11 = this.classes) != null ? list11.equals(stepIntersection.classes()) : stepIntersection.classes() == null) && ((list12 = this.entry) != null ? list12.equals(stepIntersection.entry()) : stepIntersection.entry() == null) && ((list13 = this.formOfWay) != null ? list13.equals(stepIntersection.formOfWay()) : stepIntersection.formOfWay() == null) && ((list14 = this.geometries) != null ? list14.equals(stepIntersection.geometries()) : stepIntersection.geometries() == null) && ((list15 = this.access) != null ? list15.equals(stepIntersection.access()) : stepIntersection.access() == null) && ((list16 = this.elevated) != null ? list16.equals(stepIntersection.elevated()) : stepIntersection.elevated() == null) && ((list17 = this.bridges) != null ? list17.equals(stepIntersection.bridges()) : stepIntersection.bridges() == null) && ((num5 = this.in) != null ? num5.equals(stepIntersection.in()) : stepIntersection.in() == null) && ((num6 = this.out) != null ? num6.equals(stepIntersection.out()) : stepIntersection.out() == null) && ((list18 = this.lanes) != null ? list18.equals(stepIntersection.lanes()) : stepIntersection.lanes() == null) && ((num7 = this.geometryIndex) != null ? num7.equals(stepIntersection.geometryIndex()) : stepIntersection.geometryIndex() == null) && ((bool6 = this.isUrban) != null ? bool6.equals(stepIntersection.isUrban()) : stepIntersection.isUrban() == null) && ((num8 = this.adminIndex) != null ? num8.equals(stepIntersection.adminIndex()) : stepIntersection.adminIndex() == null) && ((restStop2 = this.restStop) != null ? restStop2.equals(stepIntersection.restStop()) : stepIntersection.restStop() == null) && ((tollCollection2 = this.tollCollection) != null ? tollCollection2.equals(stepIntersection.tollCollection()) : stepIntersection.tollCollection() == null) && ((mapboxStreetsV82 = this.mapboxStreetsV8) != null ? mapboxStreetsV82.equals(stepIntersection.mapboxStreetsV8()) : stepIntersection.mapboxStreetsV8() == null) && ((str2 = this.tunnelName) != null ? str2.equals(stepIntersection.tunnelName()) : stepIntersection.tunnelName() == null) && ((bool7 = this.railwayCrossing) != null ? bool7.equals(stepIntersection.railwayCrossing()) : stepIntersection.railwayCrossing() == null) && ((bool8 = this.trafficSignal) != null ? bool8.equals(stepIntersection.trafficSignal()) : stepIntersection.trafficSignal() == null) && ((bool9 = this.stopSign) != null ? bool9.equals(stepIntersection.stopSign()) : stepIntersection.stopSign() == null) && ((bool10 = this.yieldSign) != null ? bool10.equals(stepIntersection.yieldSign()) : stepIntersection.yieldSign() == null) && ((interchange2 = this.interchange) != null ? interchange2.equals(stepIntersection.interchange()) : stepIntersection.interchange() == null) && ((junction2 = this.junction) != null ? junction2.equals(stepIntersection.junction()) : stepIntersection.junction() == null) && ((mergingArea2 = this.mergingArea) != null ? mergingArea2.equals(stepIntersection.mergingArea()) : stepIntersection.mergingArea() == null) && ((d10 = this.duration) != null ? d10.equals(stepIntersection.duration()) : stepIntersection.duration() == null)) {
                            return true;
                        }
                    }
                }
                return false;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("form_of_way")
            public List<String> formOfWay() {
                return this.formOfWay;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("geometries")
            public List<String> geometries() {
                return this.geometries;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("geometry_index")
            public Integer geometryIndex() {
                return this.geometryIndex;
            }

            public int hashCode() {
                Map<String, b> map2 = this.unrecognized;
                int hashCode = ((((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.rawLocation)) * 1000003;
                List<Integer> list10 = this.bearings;
                int hashCode2 = (hashCode ^ (list10 == null ? 0 : list10.hashCode())) * 1000003;
                List<String> list11 = this.classes;
                int hashCode3 = (hashCode2 ^ (list11 == null ? 0 : list11.hashCode())) * 1000003;
                List<Boolean> list12 = this.entry;
                int hashCode4 = (hashCode3 ^ (list12 == null ? 0 : list12.hashCode())) * 1000003;
                List<String> list13 = this.formOfWay;
                int hashCode5 = (hashCode4 ^ (list13 == null ? 0 : list13.hashCode())) * 1000003;
                List<String> list14 = this.geometries;
                int hashCode6 = (hashCode5 ^ (list14 == null ? 0 : list14.hashCode())) * 1000003;
                List<Integer> list15 = this.access;
                int hashCode7 = (hashCode6 ^ (list15 == null ? 0 : list15.hashCode())) * 1000003;
                List<Boolean> list16 = this.elevated;
                int hashCode8 = (hashCode7 ^ (list16 == null ? 0 : list16.hashCode())) * 1000003;
                List<Boolean> list17 = this.bridges;
                int hashCode9 = (hashCode8 ^ (list17 == null ? 0 : list17.hashCode())) * 1000003;
                Integer num5 = this.in;
                int hashCode10 = (hashCode9 ^ (num5 == null ? 0 : num5.hashCode())) * 1000003;
                Integer num6 = this.out;
                int hashCode11 = (hashCode10 ^ (num6 == null ? 0 : num6.hashCode())) * 1000003;
                List<IntersectionLanes> list18 = this.lanes;
                int hashCode12 = (hashCode11 ^ (list18 == null ? 0 : list18.hashCode())) * 1000003;
                Integer num7 = this.geometryIndex;
                int hashCode13 = (hashCode12 ^ (num7 == null ? 0 : num7.hashCode())) * 1000003;
                Boolean bool6 = this.isUrban;
                int hashCode14 = (hashCode13 ^ (bool6 == null ? 0 : bool6.hashCode())) * 1000003;
                Integer num8 = this.adminIndex;
                int hashCode15 = (hashCode14 ^ (num8 == null ? 0 : num8.hashCode())) * 1000003;
                RestStop restStop2 = this.restStop;
                int hashCode16 = (hashCode15 ^ (restStop2 == null ? 0 : restStop2.hashCode())) * 1000003;
                TollCollection tollCollection2 = this.tollCollection;
                int hashCode17 = (hashCode16 ^ (tollCollection2 == null ? 0 : tollCollection2.hashCode())) * 1000003;
                MapboxStreetsV8 mapboxStreetsV82 = this.mapboxStreetsV8;
                int hashCode18 = (hashCode17 ^ (mapboxStreetsV82 == null ? 0 : mapboxStreetsV82.hashCode())) * 1000003;
                String str2 = this.tunnelName;
                int hashCode19 = (hashCode18 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                Boolean bool7 = this.railwayCrossing;
                int hashCode20 = (hashCode19 ^ (bool7 == null ? 0 : bool7.hashCode())) * 1000003;
                Boolean bool8 = this.trafficSignal;
                int hashCode21 = (hashCode20 ^ (bool8 == null ? 0 : bool8.hashCode())) * 1000003;
                Boolean bool9 = this.stopSign;
                int hashCode22 = (hashCode21 ^ (bool9 == null ? 0 : bool9.hashCode())) * 1000003;
                Boolean bool10 = this.yieldSign;
                int hashCode23 = (hashCode22 ^ (bool10 == null ? 0 : bool10.hashCode())) * 1000003;
                Interchange interchange2 = this.interchange;
                int hashCode24 = (hashCode23 ^ (interchange2 == null ? 0 : interchange2.hashCode())) * 1000003;
                Junction junction2 = this.junction;
                int hashCode25 = (hashCode24 ^ (junction2 == null ? 0 : junction2.hashCode())) * 1000003;
                MergingArea mergingArea2 = this.mergingArea;
                int hashCode26 = (hashCode25 ^ (mergingArea2 == null ? 0 : mergingArea2.hashCode())) * 1000003;
                Double d10 = this.duration;
                return hashCode26 ^ (d10 != null ? d10.hashCode() : 0);
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            public Integer in() {
                return this.in;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("ic")
            public Interchange interchange() {
                return this.interchange;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("is_urban")
            public Boolean isUrban() {
                return this.isUrban;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("jct")
            public Junction junction() {
                return this.junction;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            public List<IntersectionLanes> lanes() {
                return this.lanes;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("mapbox_streets_v8")
            public MapboxStreetsV8 mapboxStreetsV8() {
                return this.mapboxStreetsV8;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("merging_area")
            public MergingArea mergingArea() {
                return this.mergingArea;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            public Integer out() {
                return this.out;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("railway_crossing")
            public Boolean railwayCrossing() {
                return this.railwayCrossing;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("location")
            public double[] rawLocation() {
                return this.rawLocation;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("rest_stop")
            public RestStop restStop() {
                return this.restStop;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("stop_sign")
            public Boolean stopSign() {
                return this.stopSign;
            }

            public String toString() {
                return StubApp.getString2(12910) + this.unrecognized + StubApp.getString2(12751) + Arrays.toString(this.rawLocation) + StubApp.getString2(12838) + this.bearings + StubApp.getString2(12911) + this.classes + StubApp.getString2(12912) + this.entry + StubApp.getString2(12913) + this.formOfWay + StubApp.getString2(12843) + this.geometries + StubApp.getString2(12764) + this.access + StubApp.getString2(12914) + this.elevated + StubApp.getString2(12915) + this.bridges + StubApp.getString2(12916) + this.in + StubApp.getString2(5303) + this.out + StubApp.getString2(12917) + this.lanes + StubApp.getString2(4994) + this.geometryIndex + StubApp.getString2(5747) + this.isUrban + StubApp.getString2(12918) + this.adminIndex + StubApp.getString2(12919) + this.restStop + StubApp.getString2(12920) + this.tollCollection + StubApp.getString2(12921) + this.mapboxStreetsV8 + StubApp.getString2(12922) + this.tunnelName + StubApp.getString2(12923) + this.railwayCrossing + StubApp.getString2(12924) + this.trafficSignal + StubApp.getString2(12925) + this.stopSign + StubApp.getString2(12926) + this.yieldSign + StubApp.getString2(12927) + this.interchange + StubApp.getString2(12928) + this.junction + StubApp.getString2(12929) + this.mergingArea + StubApp.getString2(5021) + this.duration + StubApp.getString2(265);
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("toll_collection")
            public TollCollection tollCollection() {
                return this.tollCollection;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("traffic_signal")
            public Boolean trafficSignal() {
                return this.trafficSignal;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("tunnel_name")
            public String tunnelName() {
                return this.tunnelName;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, b> unrecognized() {
                return this.unrecognized;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("yield_sign")
            public Boolean yieldSign() {
                return this.yieldSign;
            }
        };
    }
}
