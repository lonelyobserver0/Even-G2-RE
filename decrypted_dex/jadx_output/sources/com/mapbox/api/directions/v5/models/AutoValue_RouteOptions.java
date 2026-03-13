package com.mapbox.api.directions.v5.models;

import E1.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_RouteOptions extends C$AutoValue_RouteOptions {

    public static final class GsonTypeAdapter extends TypeAdapter<RouteOptions> {
        private volatile TypeAdapter<Boolean> boolean__adapter;
        private volatile TypeAdapter<Double> double__adapter;
        private final Gson gson;
        private volatile TypeAdapter<String> string_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(13090);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public RouteOptions read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            RouteOptions.Builder builder = RouteOptions.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    nextName.getClass();
                    char c10 = 65535;
                    switch (nextName.hashCode()) {
                        case -2075945000:
                            if (nextName.equals(StubApp.getString2(13078))) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case -1847017863:
                            if (nextName.equals(StubApp.getString2(13004))) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case -1570095453:
                            if (nextName.equals(StubApp.getString2(13077))) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case -1512558702:
                            if (nextName.equals(StubApp.getString2(13076))) {
                                c10 = 3;
                                break;
                            }
                            break;
                        case -1219578786:
                            if (nextName.equals(StubApp.getString2(13075))) {
                                c10 = 4;
                                break;
                            }
                            break;
                        case -1198164289:
                            if (nextName.equals(StubApp.getString2(13074))) {
                                c10 = 5;
                                break;
                            }
                            break;
                        case -1128482578:
                            if (nextName.equals(StubApp.getString2(13073))) {
                                c10 = 6;
                                break;
                            }
                            break;
                        case -1050878268:
                            if (nextName.equals(StubApp.getString2(13072))) {
                                c10 = 7;
                                break;
                            }
                            break;
                        case -968619239:
                            if (nextName.equals(StubApp.getString2(13071))) {
                                c10 = '\b';
                                break;
                            }
                            break;
                        case -781525204:
                            if (nextName.equals(StubApp.getString2(13070))) {
                                c10 = '\t';
                                break;
                            }
                            break;
                        case -572052449:
                            if (nextName.equals(StubApp.getString2(13069))) {
                                c10 = '\n';
                                break;
                            }
                            break;
                        case -450004177:
                            if (nextName.equals(StubApp.getString2(2127))) {
                                c10 = 11;
                                break;
                            }
                            break;
                        case -230974677:
                            if (nextName.equals(StubApp.getString2(13068))) {
                                c10 = '\f';
                                break;
                            }
                            break;
                        case -197592174:
                            if (nextName.equals(StubApp.getString2(13067))) {
                                c10 = '\r';
                                break;
                            }
                            break;
                        case -115360526:
                            if (nextName.equals(StubApp.getString2(13066))) {
                                c10 = 14;
                                break;
                            }
                            break;
                        case 241170578:
                            if (nextName.equals(StubApp.getString2(1913))) {
                                c10 = 15;
                                break;
                            }
                            break;
                        case 285109794:
                            if (nextName.equals(StubApp.getString2(13065))) {
                                c10 = 16;
                                break;
                            }
                            break;
                        case 324903226:
                            if (nextName.equals(StubApp.getString2(13064))) {
                                c10 = 17;
                                break;
                            }
                            break;
                        case 411003393:
                            if (nextName.equals(StubApp.getString2(13063))) {
                                c10 = 18;
                                break;
                            }
                            break;
                        case 605650314:
                            if (nextName.equals(StubApp.getString2(13062))) {
                                c10 = 19;
                                break;
                            }
                            break;
                        case 782059218:
                            if (nextName.equals(StubApp.getString2(13061))) {
                                c10 = 20;
                                break;
                            }
                            break;
                        case 877542369:
                            if (nextName.equals(StubApp.getString2(13060))) {
                                c10 = 21;
                                break;
                            }
                            break;
                        case 988936339:
                            if (nextName.equals(StubApp.getString2(13059))) {
                                c10 = 22;
                                break;
                            }
                            break;
                        case 996724834:
                            if (nextName.equals(StubApp.getString2(13058))) {
                                c10 = 23;
                                break;
                            }
                            break;
                        case 1031595704:
                            if (nextName.equals(StubApp.getString2(13057))) {
                                c10 = 24;
                                break;
                            }
                            break;
                        case 1069250121:
                            if (nextName.equals(StubApp.getString2(13056))) {
                                c10 = 25;
                                break;
                            }
                            break;
                        case 1213231763:
                            if (nextName.equals(StubApp.getString2(13055))) {
                                c10 = 26;
                                break;
                            }
                            break;
                        case 1426162099:
                            if (nextName.equals(StubApp.getString2(13054))) {
                                c10 = 27;
                                break;
                            }
                            break;
                        case 1633706927:
                            if (nextName.equals(StubApp.getString2(13053))) {
                                c10 = 28;
                                break;
                            }
                            break;
                        case 1941421461:
                            if (nextName.equals(StubApp.getString2(13052))) {
                                c10 = 29;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            TypeAdapter<Boolean> typeAdapter = this.boolean__adapter;
                            if (typeAdapter == null) {
                                typeAdapter = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = typeAdapter;
                            }
                            builder.bannerInstructions(typeAdapter.read2(jsonReader));
                            break;
                        case 1:
                            TypeAdapter<String> typeAdapter2 = this.string_adapter;
                            if (typeAdapter2 == null) {
                                typeAdapter2 = this.gson.getAdapter(String.class);
                                this.string_adapter = typeAdapter2;
                            }
                            builder.paymentMethods(typeAdapter2.read2(jsonReader));
                            break;
                        case 2:
                            TypeAdapter<Double> typeAdapter3 = this.double__adapter;
                            if (typeAdapter3 == null) {
                                typeAdapter3 = this.gson.getAdapter(Double.class);
                                this.double__adapter = typeAdapter3;
                            }
                            builder.alleyBias(typeAdapter3.read2(jsonReader));
                            break;
                        case 3:
                            TypeAdapter<Boolean> typeAdapter4 = this.boolean__adapter;
                            if (typeAdapter4 == null) {
                                typeAdapter4 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = typeAdapter4;
                            }
                            builder.voiceInstructions(typeAdapter4.read2(jsonReader));
                            break;
                        case 4:
                            TypeAdapter<String> typeAdapter5 = this.string_adapter;
                            if (typeAdapter5 == null) {
                                typeAdapter5 = this.gson.getAdapter(String.class);
                                this.string_adapter = typeAdapter5;
                            }
                            builder.departAt(typeAdapter5.read2(jsonReader));
                            break;
                        case 5:
                            TypeAdapter<String> typeAdapter6 = this.string_adapter;
                            if (typeAdapter6 == null) {
                                typeAdapter6 = this.gson.getAdapter(String.class);
                                this.string_adapter = typeAdapter6;
                            }
                            builder.arriveBy(typeAdapter6.read2(jsonReader));
                            break;
                        case 6:
                            TypeAdapter<Double> typeAdapter7 = this.double__adapter;
                            if (typeAdapter7 == null) {
                                typeAdapter7 = this.gson.getAdapter(Double.class);
                                this.double__adapter = typeAdapter7;
                            }
                            builder.avoidManeuverRadius(typeAdapter7.read2(jsonReader));
                            break;
                        case 7:
                            TypeAdapter<String> typeAdapter8 = this.string_adapter;
                            if (typeAdapter8 == null) {
                                typeAdapter8 = this.gson.getAdapter(String.class);
                                this.string_adapter = typeAdapter8;
                            }
                            builder.waypointTargets(typeAdapter8.read2(jsonReader));
                            break;
                        case '\b':
                            TypeAdapter<Boolean> typeAdapter9 = this.boolean__adapter;
                            if (typeAdapter9 == null) {
                                typeAdapter9 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = typeAdapter9;
                            }
                            builder.intersectionLinkElevated(typeAdapter9.read2(jsonReader));
                            break;
                        case '\t':
                            TypeAdapter<Boolean> typeAdapter10 = this.boolean__adapter;
                            if (typeAdapter10 == null) {
                                typeAdapter10 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = typeAdapter10;
                            }
                            builder.suppressVoiceInstructionLocalNames(typeAdapter10.read2(jsonReader));
                            break;
                        case '\n':
                            TypeAdapter<Boolean> typeAdapter11 = this.boolean__adapter;
                            if (typeAdapter11 == null) {
                                typeAdapter11 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = typeAdapter11;
                            }
                            builder.enableRefresh(typeAdapter11.read2(jsonReader));
                            break;
                        case 11:
                            TypeAdapter<Boolean> typeAdapter12 = this.boolean__adapter;
                            if (typeAdapter12 == null) {
                                typeAdapter12 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = typeAdapter12;
                            }
                            builder.metadata(typeAdapter12.read2(jsonReader));
                            break;
                        case '\f':
                            TypeAdapter<Double> typeAdapter13 = this.double__adapter;
                            if (typeAdapter13 == null) {
                                typeAdapter13 = this.gson.getAdapter(Double.class);
                                this.double__adapter = typeAdapter13;
                            }
                            builder.maxWidth(typeAdapter13.read2(jsonReader));
                            break;
                        case '\r':
                            TypeAdapter<Boolean> typeAdapter14 = this.boolean__adapter;
                            if (typeAdapter14 == null) {
                                typeAdapter14 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = typeAdapter14;
                            }
                            builder.continueStraight(typeAdapter14.read2(jsonReader));
                            break;
                        case 14:
                            TypeAdapter<String> typeAdapter15 = this.string_adapter;
                            if (typeAdapter15 == null) {
                                typeAdapter15 = this.gson.getAdapter(String.class);
                                this.string_adapter = typeAdapter15;
                            }
                            builder.snappingIncludeClosures(typeAdapter15.read2(jsonReader));
                            break;
                        case 15:
                            TypeAdapter<String> typeAdapter16 = this.string_adapter;
                            if (typeAdapter16 == null) {
                                typeAdapter16 = this.gson.getAdapter(String.class);
                                this.string_adapter = typeAdapter16;
                            }
                            builder.waypointIndices(typeAdapter16.read2(jsonReader));
                            break;
                        case 16:
                            TypeAdapter<String> typeAdapter17 = this.string_adapter;
                            if (typeAdapter17 == null) {
                                typeAdapter17 = this.gson.getAdapter(String.class);
                                this.string_adapter = typeAdapter17;
                            }
                            builder.voiceUnits(typeAdapter17.read2(jsonReader));
                            break;
                        case 17:
                            TypeAdapter<Boolean> typeAdapter18 = this.boolean__adapter;
                            if (typeAdapter18 == null) {
                                typeAdapter18 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = typeAdapter18;
                            }
                            builder.waypointsPerRoute(typeAdapter18.read2(jsonReader));
                            break;
                        case 18:
                            TypeAdapter<Double> typeAdapter19 = this.double__adapter;
                            if (typeAdapter19 == null) {
                                typeAdapter19 = this.gson.getAdapter(Double.class);
                                this.double__adapter = typeAdapter19;
                            }
                            builder.walkingSpeed(typeAdapter19.read2(jsonReader));
                            break;
                        case 19:
                            TypeAdapter<String> typeAdapter20 = this.string_adapter;
                            if (typeAdapter20 == null) {
                                typeAdapter20 = this.gson.getAdapter(String.class);
                                this.string_adapter = typeAdapter20;
                            }
                            builder.waypointNames(typeAdapter20.read2(jsonReader));
                            break;
                        case 20:
                            TypeAdapter<Double> typeAdapter21 = this.double__adapter;
                            if (typeAdapter21 == null) {
                                typeAdapter21 = this.gson.getAdapter(Double.class);
                                this.double__adapter = typeAdapter21;
                            }
                            builder.walkwayBias(typeAdapter21.read2(jsonReader));
                            break;
                        case 21:
                            TypeAdapter<String> typeAdapter22 = this.string_adapter;
                            if (typeAdapter22 == null) {
                                typeAdapter22 = this.gson.getAdapter(String.class);
                                this.string_adapter = typeAdapter22;
                            }
                            builder.intersectionLinkGeometry(typeAdapter22.read2(jsonReader));
                            break;
                        case 22:
                            TypeAdapter<Boolean> typeAdapter23 = this.boolean__adapter;
                            if (typeAdapter23 == null) {
                                typeAdapter23 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = typeAdapter23;
                            }
                            builder.intersectionLinkAccess(typeAdapter23.read2(jsonReader));
                            break;
                        case 23:
                            TypeAdapter<Double> typeAdapter24 = this.double__adapter;
                            if (typeAdapter24 == null) {
                                typeAdapter24 = this.gson.getAdapter(Double.class);
                                this.double__adapter = typeAdapter24;
                            }
                            builder.maxHeight(typeAdapter24.read2(jsonReader));
                            break;
                        case 24:
                            TypeAdapter<Boolean> typeAdapter25 = this.boolean__adapter;
                            if (typeAdapter25 == null) {
                                typeAdapter25 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = typeAdapter25;
                            }
                            builder.intersectionLinkBridge(typeAdapter25.read2(jsonReader));
                            break;
                        case 25:
                            TypeAdapter<Boolean> typeAdapter26 = this.boolean__adapter;
                            if (typeAdapter26 == null) {
                                typeAdapter26 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = typeAdapter26;
                            }
                            builder.computeTollCost(typeAdapter26.read2(jsonReader));
                            break;
                        case 26:
                            TypeAdapter<Boolean> typeAdapter27 = this.boolean__adapter;
                            if (typeAdapter27 == null) {
                                typeAdapter27 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = typeAdapter27;
                            }
                            builder.intersectionLinkFormOfWay(typeAdapter27.read2(jsonReader));
                            break;
                        case 27:
                            TypeAdapter<Double> typeAdapter28 = this.double__adapter;
                            if (typeAdapter28 == null) {
                                typeAdapter28 = this.gson.getAdapter(Double.class);
                                this.double__adapter = typeAdapter28;
                            }
                            builder.maxWeight(typeAdapter28.read2(jsonReader));
                            break;
                        case 28:
                            TypeAdapter<String> typeAdapter29 = this.string_adapter;
                            if (typeAdapter29 == null) {
                                typeAdapter29 = this.gson.getAdapter(String.class);
                                this.string_adapter = typeAdapter29;
                            }
                            builder.snappingIncludeStaticClosures(typeAdapter29.read2(jsonReader));
                            break;
                        case 29:
                            TypeAdapter<Boolean> typeAdapter30 = this.boolean__adapter;
                            if (typeAdapter30 == null) {
                                typeAdapter30 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = typeAdapter30;
                            }
                            builder.roundaboutExits(typeAdapter30.read2(jsonReader));
                            break;
                        default:
                            if (!StubApp.getString2(13079).equals(nextName)) {
                                if (!StubApp.getString2(11522).equals(nextName)) {
                                    if (!StubApp.getString2(5556).equals(nextName)) {
                                        if (!StubApp.getString2(2042).equals(nextName)) {
                                            if (!StubApp.getString2(13080).equals(nextName)) {
                                                if (!StubApp.getString2(1142).equals(nextName)) {
                                                    if (!StubApp.getString2(13081).equals(nextName)) {
                                                        if (!StubApp.getString2(13082).equals(nextName)) {
                                                            if (!StubApp.getString2(13083).equals(nextName)) {
                                                                if (!StubApp.getString2(13084).equals(nextName)) {
                                                                    if (!StubApp.getString2(13085).equals(nextName)) {
                                                                        if (!StubApp.getString2(13050).equals(nextName)) {
                                                                            if (!StubApp.getString2(13086).equals(nextName)) {
                                                                                if (!StubApp.getString2(13087).equals(nextName)) {
                                                                                    if (!StubApp.getString2(13088).equals(nextName)) {
                                                                                        if (!StubApp.getString2(13089).equals(nextName)) {
                                                                                            if (!StubApp.getString2(2114).equals(nextName)) {
                                                                                                if (linkedHashMap == null) {
                                                                                                    linkedHashMap = new LinkedHashMap();
                                                                                                    builder.unrecognized(linkedHashMap);
                                                                                                }
                                                                                                a.t((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, nextName);
                                                                                                break;
                                                                                            } else {
                                                                                                TypeAdapter<String> typeAdapter31 = this.string_adapter;
                                                                                                if (typeAdapter31 == null) {
                                                                                                    typeAdapter31 = this.gson.getAdapter(String.class);
                                                                                                    this.string_adapter = typeAdapter31;
                                                                                                }
                                                                                                builder.notifications(typeAdapter31.read2(jsonReader));
                                                                                                break;
                                                                                            }
                                                                                        } else {
                                                                                            TypeAdapter<String> typeAdapter32 = this.string_adapter;
                                                                                            if (typeAdapter32 == null) {
                                                                                                typeAdapter32 = this.gson.getAdapter(String.class);
                                                                                                this.string_adapter = typeAdapter32;
                                                                                            }
                                                                                            builder.approaches(typeAdapter32.read2(jsonReader));
                                                                                            break;
                                                                                        }
                                                                                    } else {
                                                                                        TypeAdapter<String> typeAdapter33 = this.string_adapter;
                                                                                        if (typeAdapter33 == null) {
                                                                                            typeAdapter33 = this.gson.getAdapter(String.class);
                                                                                            this.string_adapter = typeAdapter33;
                                                                                        }
                                                                                        builder.include(typeAdapter33.read2(jsonReader));
                                                                                        break;
                                                                                    }
                                                                                } else {
                                                                                    TypeAdapter<String> typeAdapter34 = this.string_adapter;
                                                                                    if (typeAdapter34 == null) {
                                                                                        typeAdapter34 = this.gson.getAdapter(String.class);
                                                                                        this.string_adapter = typeAdapter34;
                                                                                    }
                                                                                    builder.exclude(typeAdapter34.read2(jsonReader));
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                TypeAdapter<String> typeAdapter35 = this.string_adapter;
                                                                                if (typeAdapter35 == null) {
                                                                                    typeAdapter35 = this.gson.getAdapter(String.class);
                                                                                    this.string_adapter = typeAdapter35;
                                                                                }
                                                                                builder.annotations(typeAdapter35.read2(jsonReader));
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            TypeAdapter<Boolean> typeAdapter36 = this.boolean__adapter;
                                                                            if (typeAdapter36 == null) {
                                                                                typeAdapter36 = this.gson.getAdapter(Boolean.class);
                                                                                this.boolean__adapter = typeAdapter36;
                                                                            }
                                                                            builder.steps(typeAdapter36.read2(jsonReader));
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        TypeAdapter<String> typeAdapter37 = this.string_adapter;
                                                                        if (typeAdapter37 == null) {
                                                                            typeAdapter37 = this.gson.getAdapter(String.class);
                                                                            this.string_adapter = typeAdapter37;
                                                                        }
                                                                        builder.overview(typeAdapter37.read2(jsonReader));
                                                                        break;
                                                                    }
                                                                } else {
                                                                    TypeAdapter<String> typeAdapter38 = this.string_adapter;
                                                                    if (typeAdapter38 == null) {
                                                                        typeAdapter38 = this.gson.getAdapter(String.class);
                                                                        this.string_adapter = typeAdapter38;
                                                                    }
                                                                    builder.geometries(typeAdapter38.read2(jsonReader));
                                                                    break;
                                                                }
                                                            } else {
                                                                TypeAdapter<String> typeAdapter39 = this.string_adapter;
                                                                if (typeAdapter39 == null) {
                                                                    typeAdapter39 = this.gson.getAdapter(String.class);
                                                                    this.string_adapter = typeAdapter39;
                                                                }
                                                                builder.layers(typeAdapter39.read2(jsonReader));
                                                                break;
                                                            }
                                                        } else {
                                                            TypeAdapter<String> typeAdapter40 = this.string_adapter;
                                                            if (typeAdapter40 == null) {
                                                                typeAdapter40 = this.gson.getAdapter(String.class);
                                                                this.string_adapter = typeAdapter40;
                                                            }
                                                            builder.bearings(typeAdapter40.read2(jsonReader));
                                                            break;
                                                        }
                                                    } else {
                                                        TypeAdapter<String> typeAdapter41 = this.string_adapter;
                                                        if (typeAdapter41 == null) {
                                                            typeAdapter41 = this.gson.getAdapter(String.class);
                                                            this.string_adapter = typeAdapter41;
                                                        }
                                                        builder.radiuses(typeAdapter41.read2(jsonReader));
                                                        break;
                                                    }
                                                } else {
                                                    TypeAdapter<String> typeAdapter42 = this.string_adapter;
                                                    if (typeAdapter42 == null) {
                                                        typeAdapter42 = this.gson.getAdapter(String.class);
                                                        this.string_adapter = typeAdapter42;
                                                    }
                                                    builder.language(typeAdapter42.read2(jsonReader));
                                                    break;
                                                }
                                            } else {
                                                TypeAdapter<Boolean> typeAdapter43 = this.boolean__adapter;
                                                if (typeAdapter43 == null) {
                                                    typeAdapter43 = this.gson.getAdapter(Boolean.class);
                                                    this.boolean__adapter = typeAdapter43;
                                                }
                                                builder.alternatives(typeAdapter43.read2(jsonReader));
                                                break;
                                            }
                                        } else {
                                            TypeAdapter<String> typeAdapter44 = this.string_adapter;
                                            if (typeAdapter44 == null) {
                                                typeAdapter44 = this.gson.getAdapter(String.class);
                                                this.string_adapter = typeAdapter44;
                                            }
                                            builder.coordinates(typeAdapter44.read2(jsonReader));
                                            break;
                                        }
                                    } else {
                                        TypeAdapter<String> typeAdapter45 = this.string_adapter;
                                        if (typeAdapter45 == null) {
                                            typeAdapter45 = this.gson.getAdapter(String.class);
                                            this.string_adapter = typeAdapter45;
                                        }
                                        builder.profile(typeAdapter45.read2(jsonReader));
                                        break;
                                    }
                                } else {
                                    TypeAdapter<String> typeAdapter46 = this.string_adapter;
                                    if (typeAdapter46 == null) {
                                        typeAdapter46 = this.gson.getAdapter(String.class);
                                        this.string_adapter = typeAdapter46;
                                    }
                                    builder.user(typeAdapter46.read2(jsonReader));
                                    break;
                                }
                            } else {
                                TypeAdapter<String> typeAdapter47 = this.string_adapter;
                                if (typeAdapter47 == null) {
                                    typeAdapter47 = this.gson.getAdapter(String.class);
                                    this.string_adapter = typeAdapter47;
                                }
                                builder.baseUrl(typeAdapter47.read2(jsonReader));
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
        public void write(JsonWriter jsonWriter, RouteOptions routeOptions) throws IOException {
            if (routeOptions == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (routeOptions.unrecognized() != null) {
                for (Map.Entry<String, b> entry : routeOptions.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(13079));
            if (routeOptions.baseUrl() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.string_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, routeOptions.baseUrl());
            }
            jsonWriter.name(StubApp.getString2(11522));
            if (routeOptions.user() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter2 = this.string_adapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, routeOptions.user());
            }
            jsonWriter.name(StubApp.getString2(5556));
            if (routeOptions.profile() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter3 = this.string_adapter;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, routeOptions.profile());
            }
            jsonWriter.name(StubApp.getString2(2042));
            if (routeOptions.coordinates() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter4 = this.string_adapter;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, routeOptions.coordinates());
            }
            jsonWriter.name(StubApp.getString2(13080));
            if (routeOptions.alternatives() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter5 = this.boolean__adapter;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, routeOptions.alternatives());
            }
            jsonWriter.name(StubApp.getString2(1142));
            if (routeOptions.language() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter6 = this.string_adapter;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, routeOptions.language());
            }
            jsonWriter.name(StubApp.getString2(13081));
            if (routeOptions.radiuses() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter7 = this.string_adapter;
                if (typeAdapter7 == null) {
                    typeAdapter7 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter7;
                }
                typeAdapter7.write(jsonWriter, routeOptions.radiuses());
            }
            jsonWriter.name(StubApp.getString2(13082));
            if (routeOptions.bearings() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter8 = this.string_adapter;
                if (typeAdapter8 == null) {
                    typeAdapter8 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter8;
                }
                typeAdapter8.write(jsonWriter, routeOptions.bearings());
            }
            jsonWriter.name(StubApp.getString2(13073));
            if (routeOptions.avoidManeuverRadius() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter9 = this.double__adapter;
                if (typeAdapter9 == null) {
                    typeAdapter9 = this.gson.getAdapter(Double.class);
                    this.double__adapter = typeAdapter9;
                }
                typeAdapter9.write(jsonWriter, routeOptions.avoidManeuverRadius());
            }
            jsonWriter.name(StubApp.getString2(13083));
            if (routeOptions.layers() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter10 = this.string_adapter;
                if (typeAdapter10 == null) {
                    typeAdapter10 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter10;
                }
                typeAdapter10.write(jsonWriter, routeOptions.layers());
            }
            jsonWriter.name(StubApp.getString2(13067));
            if (routeOptions.continueStraight() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter11 = this.boolean__adapter;
                if (typeAdapter11 == null) {
                    typeAdapter11 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = typeAdapter11;
                }
                typeAdapter11.write(jsonWriter, routeOptions.continueStraight());
            }
            jsonWriter.name(StubApp.getString2(13052));
            if (routeOptions.roundaboutExits() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter12 = this.boolean__adapter;
                if (typeAdapter12 == null) {
                    typeAdapter12 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = typeAdapter12;
                }
                typeAdapter12.write(jsonWriter, routeOptions.roundaboutExits());
            }
            jsonWriter.name(StubApp.getString2(13084));
            if (routeOptions.geometries() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter13 = this.string_adapter;
                if (typeAdapter13 == null) {
                    typeAdapter13 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter13;
                }
                typeAdapter13.write(jsonWriter, routeOptions.geometries());
            }
            jsonWriter.name(StubApp.getString2(13085));
            if (routeOptions.overview() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter14 = this.string_adapter;
                if (typeAdapter14 == null) {
                    typeAdapter14 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter14;
                }
                typeAdapter14.write(jsonWriter, routeOptions.overview());
            }
            jsonWriter.name(StubApp.getString2(13050));
            if (routeOptions.steps() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter15 = this.boolean__adapter;
                if (typeAdapter15 == null) {
                    typeAdapter15 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = typeAdapter15;
                }
                typeAdapter15.write(jsonWriter, routeOptions.steps());
            }
            jsonWriter.name(StubApp.getString2(13086));
            if (routeOptions.annotations() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter16 = this.string_adapter;
                if (typeAdapter16 == null) {
                    typeAdapter16 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter16;
                }
                typeAdapter16.write(jsonWriter, routeOptions.annotations());
            }
            jsonWriter.name(StubApp.getString2(13087));
            if (routeOptions.exclude() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter17 = this.string_adapter;
                if (typeAdapter17 == null) {
                    typeAdapter17 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter17;
                }
                typeAdapter17.write(jsonWriter, routeOptions.exclude());
            }
            jsonWriter.name(StubApp.getString2(13088));
            if (routeOptions.include() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter18 = this.string_adapter;
                if (typeAdapter18 == null) {
                    typeAdapter18 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter18;
                }
                typeAdapter18.write(jsonWriter, routeOptions.include());
            }
            jsonWriter.name(StubApp.getString2(13076));
            if (routeOptions.voiceInstructions() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter19 = this.boolean__adapter;
                if (typeAdapter19 == null) {
                    typeAdapter19 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = typeAdapter19;
                }
                typeAdapter19.write(jsonWriter, routeOptions.voiceInstructions());
            }
            jsonWriter.name(StubApp.getString2(13078));
            if (routeOptions.bannerInstructions() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter20 = this.boolean__adapter;
                if (typeAdapter20 == null) {
                    typeAdapter20 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = typeAdapter20;
                }
                typeAdapter20.write(jsonWriter, routeOptions.bannerInstructions());
            }
            jsonWriter.name(StubApp.getString2(13065));
            if (routeOptions.voiceUnits() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter21 = this.string_adapter;
                if (typeAdapter21 == null) {
                    typeAdapter21 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter21;
                }
                typeAdapter21.write(jsonWriter, routeOptions.voiceUnits());
            }
            jsonWriter.name(StubApp.getString2(13089));
            if (routeOptions.approaches() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter22 = this.string_adapter;
                if (typeAdapter22 == null) {
                    typeAdapter22 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter22;
                }
                typeAdapter22.write(jsonWriter, routeOptions.approaches());
            }
            jsonWriter.name(StubApp.getString2(1913));
            if (routeOptions.waypointIndices() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter23 = this.string_adapter;
                if (typeAdapter23 == null) {
                    typeAdapter23 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter23;
                }
                typeAdapter23.write(jsonWriter, routeOptions.waypointIndices());
            }
            jsonWriter.name(StubApp.getString2(13062));
            if (routeOptions.waypointNames() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter24 = this.string_adapter;
                if (typeAdapter24 == null) {
                    typeAdapter24 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter24;
                }
                typeAdapter24.write(jsonWriter, routeOptions.waypointNames());
            }
            jsonWriter.name(StubApp.getString2(13072));
            if (routeOptions.waypointTargets() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter25 = this.string_adapter;
                if (typeAdapter25 == null) {
                    typeAdapter25 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter25;
                }
                typeAdapter25.write(jsonWriter, routeOptions.waypointTargets());
            }
            jsonWriter.name(StubApp.getString2(13064));
            if (routeOptions.waypointsPerRoute() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter26 = this.boolean__adapter;
                if (typeAdapter26 == null) {
                    typeAdapter26 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = typeAdapter26;
                }
                typeAdapter26.write(jsonWriter, routeOptions.waypointsPerRoute());
            }
            jsonWriter.name(StubApp.getString2(13077));
            if (routeOptions.alleyBias() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter27 = this.double__adapter;
                if (typeAdapter27 == null) {
                    typeAdapter27 = this.gson.getAdapter(Double.class);
                    this.double__adapter = typeAdapter27;
                }
                typeAdapter27.write(jsonWriter, routeOptions.alleyBias());
            }
            jsonWriter.name(StubApp.getString2(13063));
            if (routeOptions.walkingSpeed() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter28 = this.double__adapter;
                if (typeAdapter28 == null) {
                    typeAdapter28 = this.gson.getAdapter(Double.class);
                    this.double__adapter = typeAdapter28;
                }
                typeAdapter28.write(jsonWriter, routeOptions.walkingSpeed());
            }
            jsonWriter.name(StubApp.getString2(13061));
            if (routeOptions.walkwayBias() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter29 = this.double__adapter;
                if (typeAdapter29 == null) {
                    typeAdapter29 = this.gson.getAdapter(Double.class);
                    this.double__adapter = typeAdapter29;
                }
                typeAdapter29.write(jsonWriter, routeOptions.walkwayBias());
            }
            jsonWriter.name(StubApp.getString2(13066));
            if (routeOptions.snappingIncludeClosures() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter30 = this.string_adapter;
                if (typeAdapter30 == null) {
                    typeAdapter30 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter30;
                }
                typeAdapter30.write(jsonWriter, routeOptions.snappingIncludeClosures());
            }
            jsonWriter.name(StubApp.getString2(13053));
            if (routeOptions.snappingIncludeStaticClosures() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter31 = this.string_adapter;
                if (typeAdapter31 == null) {
                    typeAdapter31 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter31;
                }
                typeAdapter31.write(jsonWriter, routeOptions.snappingIncludeStaticClosures());
            }
            jsonWriter.name(StubApp.getString2(13074));
            if (routeOptions.arriveBy() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter32 = this.string_adapter;
                if (typeAdapter32 == null) {
                    typeAdapter32 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter32;
                }
                typeAdapter32.write(jsonWriter, routeOptions.arriveBy());
            }
            jsonWriter.name(StubApp.getString2(13075));
            if (routeOptions.departAt() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter33 = this.string_adapter;
                if (typeAdapter33 == null) {
                    typeAdapter33 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter33;
                }
                typeAdapter33.write(jsonWriter, routeOptions.departAt());
            }
            jsonWriter.name(StubApp.getString2(13058));
            if (routeOptions.maxHeight() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter34 = this.double__adapter;
                if (typeAdapter34 == null) {
                    typeAdapter34 = this.gson.getAdapter(Double.class);
                    this.double__adapter = typeAdapter34;
                }
                typeAdapter34.write(jsonWriter, routeOptions.maxHeight());
            }
            jsonWriter.name(StubApp.getString2(13068));
            if (routeOptions.maxWidth() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter35 = this.double__adapter;
                if (typeAdapter35 == null) {
                    typeAdapter35 = this.gson.getAdapter(Double.class);
                    this.double__adapter = typeAdapter35;
                }
                typeAdapter35.write(jsonWriter, routeOptions.maxWidth());
            }
            jsonWriter.name(StubApp.getString2(13054));
            if (routeOptions.maxWeight() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter36 = this.double__adapter;
                if (typeAdapter36 == null) {
                    typeAdapter36 = this.gson.getAdapter(Double.class);
                    this.double__adapter = typeAdapter36;
                }
                typeAdapter36.write(jsonWriter, routeOptions.maxWeight());
            }
            jsonWriter.name(StubApp.getString2(13069));
            if (routeOptions.enableRefresh() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter37 = this.boolean__adapter;
                if (typeAdapter37 == null) {
                    typeAdapter37 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = typeAdapter37;
                }
                typeAdapter37.write(jsonWriter, routeOptions.enableRefresh());
            }
            jsonWriter.name(StubApp.getString2(13056));
            if (routeOptions.computeTollCost() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter38 = this.boolean__adapter;
                if (typeAdapter38 == null) {
                    typeAdapter38 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = typeAdapter38;
                }
                typeAdapter38.write(jsonWriter, routeOptions.computeTollCost());
            }
            jsonWriter.name(StubApp.getString2(2127));
            if (routeOptions.metadata() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter39 = this.boolean__adapter;
                if (typeAdapter39 == null) {
                    typeAdapter39 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = typeAdapter39;
                }
                typeAdapter39.write(jsonWriter, routeOptions.metadata());
            }
            jsonWriter.name(StubApp.getString2(13004));
            if (routeOptions.paymentMethods() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter40 = this.string_adapter;
                if (typeAdapter40 == null) {
                    typeAdapter40 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter40;
                }
                typeAdapter40.write(jsonWriter, routeOptions.paymentMethods());
            }
            jsonWriter.name(StubApp.getString2(13070));
            if (routeOptions.suppressVoiceInstructionLocalNames() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter41 = this.boolean__adapter;
                if (typeAdapter41 == null) {
                    typeAdapter41 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = typeAdapter41;
                }
                typeAdapter41.write(jsonWriter, routeOptions.suppressVoiceInstructionLocalNames());
            }
            jsonWriter.name(StubApp.getString2(13055));
            if (routeOptions.intersectionLinkFormOfWay() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter42 = this.boolean__adapter;
                if (typeAdapter42 == null) {
                    typeAdapter42 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = typeAdapter42;
                }
                typeAdapter42.write(jsonWriter, routeOptions.intersectionLinkFormOfWay());
            }
            jsonWriter.name(StubApp.getString2(13060));
            if (routeOptions.intersectionLinkGeometry() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter43 = this.string_adapter;
                if (typeAdapter43 == null) {
                    typeAdapter43 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter43;
                }
                typeAdapter43.write(jsonWriter, routeOptions.intersectionLinkGeometry());
            }
            jsonWriter.name(StubApp.getString2(13059));
            if (routeOptions.intersectionLinkAccess() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter44 = this.boolean__adapter;
                if (typeAdapter44 == null) {
                    typeAdapter44 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = typeAdapter44;
                }
                typeAdapter44.write(jsonWriter, routeOptions.intersectionLinkAccess());
            }
            jsonWriter.name(StubApp.getString2(13071));
            if (routeOptions.intersectionLinkElevated() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter45 = this.boolean__adapter;
                if (typeAdapter45 == null) {
                    typeAdapter45 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = typeAdapter45;
                }
                typeAdapter45.write(jsonWriter, routeOptions.intersectionLinkElevated());
            }
            jsonWriter.name(StubApp.getString2(13057));
            if (routeOptions.intersectionLinkBridge() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter46 = this.boolean__adapter;
                if (typeAdapter46 == null) {
                    typeAdapter46 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = typeAdapter46;
                }
                typeAdapter46.write(jsonWriter, routeOptions.intersectionLinkBridge());
            }
            jsonWriter.name(StubApp.getString2(2114));
            if (routeOptions.notifications() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter47 = this.string_adapter;
                if (typeAdapter47 == null) {
                    typeAdapter47 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter47;
                }
                typeAdapter47.write(jsonWriter, routeOptions.notifications());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_RouteOptions(Map<String, b> map, String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, Double d8, String str8, Boolean bool2, Boolean bool3, String str9, String str10, Boolean bool4, String str11, String str12, String str13, Boolean bool5, Boolean bool6, String str14, String str15, String str16, String str17, String str18, Boolean bool7, Double d10, Double d11, Double d12, String str19, String str20, String str21, String str22, Double d13, Double d14, Double d15, Boolean bool8, Boolean bool9, Boolean bool10, String str23, Boolean bool11, Boolean bool12, String str24, Boolean bool13, Boolean bool14, Boolean bool15, String str25) {
        new RouteOptions(map, str, str2, str3, str4, bool, str5, str6, str7, d8, str8, bool2, bool3, str9, str10, bool4, str11, str12, str13, bool5, bool6, str14, str15, str16, str17, str18, bool7, d10, d11, d12, str19, str20, str21, str22, d13, d14, d15, bool8, bool9, bool10, str23, bool11, bool12, str24, bool13, bool14, bool15, str25) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_RouteOptions
            private final Double alleyBias;
            private final Boolean alternatives;
            private final String annotations;
            private final String approaches;
            private final String arriveBy;
            private final Double avoidManeuverRadius;
            private final Boolean bannerInstructions;
            private final String baseUrl;
            private final String bearings;
            private final Boolean computeTollCost;
            private final Boolean continueStraight;
            private final String coordinates;
            private final String departAt;
            private final Boolean enableRefresh;
            private final String exclude;
            private final String geometries;
            private final String include;
            private final Boolean intersectionLinkAccess;
            private final Boolean intersectionLinkBridge;
            private final Boolean intersectionLinkElevated;
            private final Boolean intersectionLinkFormOfWay;
            private final String intersectionLinkGeometry;
            private final String language;
            private final String layers;
            private final Double maxHeight;
            private final Double maxWeight;
            private final Double maxWidth;
            private final Boolean metadata;
            private final String notifications;
            private final String overview;
            private final String paymentMethods;
            private final String profile;
            private final String radiuses;
            private final Boolean roundaboutExits;
            private final String snappingIncludeClosures;
            private final String snappingIncludeStaticClosures;
            private final Boolean steps;
            private final Boolean suppressVoiceInstructionLocalNames;
            private final Map<String, b> unrecognized;
            private final String user;
            private final Boolean voiceInstructions;
            private final String voiceUnits;
            private final Double walkingSpeed;
            private final Double walkwayBias;
            private final String waypointIndices;
            private final String waypointNames;
            private final String waypointTargets;
            private final Boolean waypointsPerRoute;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_RouteOptions$1, reason: invalid class name */
            public static /* synthetic */ class AnonymousClass1 {
            }

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_RouteOptions$Builder */
            public static class Builder extends RouteOptions.Builder {
                private Double alleyBias;
                private Boolean alternatives;
                private String annotations;
                private String approaches;
                private String arriveBy;
                private Double avoidManeuverRadius;
                private Boolean bannerInstructions;
                private String baseUrl;
                private String bearings;
                private Boolean computeTollCost;
                private Boolean continueStraight;
                private String coordinates;
                private String departAt;
                private Boolean enableRefresh;
                private String exclude;
                private String geometries;
                private String include;
                private Boolean intersectionLinkAccess;
                private Boolean intersectionLinkBridge;
                private Boolean intersectionLinkElevated;
                private Boolean intersectionLinkFormOfWay;
                private String intersectionLinkGeometry;
                private String language;
                private String layers;
                private Double maxHeight;
                private Double maxWeight;
                private Double maxWidth;
                private Boolean metadata;
                private String notifications;
                private String overview;
                private String paymentMethods;
                private String profile;
                private String radiuses;
                private Boolean roundaboutExits;
                private String snappingIncludeClosures;
                private String snappingIncludeStaticClosures;
                private Boolean steps;
                private Boolean suppressVoiceInstructionLocalNames;
                private Map<String, b> unrecognized;
                private String user;
                private Boolean voiceInstructions;
                private String voiceUnits;
                private Double walkingSpeed;
                private Double walkwayBias;
                private String waypointIndices;
                private String waypointNames;
                private String waypointTargets;
                private Boolean waypointsPerRoute;

                public /* synthetic */ Builder(RouteOptions routeOptions, AnonymousClass1 anonymousClass1) {
                    this(routeOptions);
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder alleyBias(Double d8) {
                    this.alleyBias = d8;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder alternatives(Boolean bool) {
                    this.alternatives = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder annotations(String str) {
                    this.annotations = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder approaches(String str) {
                    this.approaches = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder arriveBy(String str) {
                    this.arriveBy = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder avoidManeuverRadius(Double d8) {
                    this.avoidManeuverRadius = d8;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder bannerInstructions(Boolean bool) {
                    this.bannerInstructions = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder baseUrl(String str) {
                    if (str == null) {
                        throw new NullPointerException(StubApp.getString2(12787));
                    }
                    this.baseUrl = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder bearings(String str) {
                    this.bearings = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions build() {
                    String string2 = this.baseUrl == null ? StubApp.getString2(12788) : "";
                    if (this.user == null) {
                        string2 = AbstractC1482f.g(string2, StubApp.getString2(12827));
                    }
                    if (this.profile == null) {
                        string2 = AbstractC1482f.g(string2, StubApp.getString2(12828));
                    }
                    if (this.coordinates == null) {
                        string2 = AbstractC1482f.g(string2, StubApp.getString2(111));
                    }
                    if (this.geometries == null) {
                        string2 = AbstractC1482f.g(string2, StubApp.getString2(12829));
                    }
                    if (string2.isEmpty()) {
                        return new AutoValue_RouteOptions(this.unrecognized, this.baseUrl, this.user, this.profile, this.coordinates, this.alternatives, this.language, this.radiuses, this.bearings, this.avoidManeuverRadius, this.layers, this.continueStraight, this.roundaboutExits, this.geometries, this.overview, this.steps, this.annotations, this.exclude, this.include, this.voiceInstructions, this.bannerInstructions, this.voiceUnits, this.approaches, this.waypointIndices, this.waypointNames, this.waypointTargets, this.waypointsPerRoute, this.alleyBias, this.walkingSpeed, this.walkwayBias, this.snappingIncludeClosures, this.snappingIncludeStaticClosures, this.arriveBy, this.departAt, this.maxHeight, this.maxWidth, this.maxWeight, this.enableRefresh, this.computeTollCost, this.metadata, this.paymentMethods, this.suppressVoiceInstructionLocalNames, this.intersectionLinkFormOfWay, this.intersectionLinkGeometry, this.intersectionLinkAccess, this.intersectionLinkElevated, this.intersectionLinkBridge, this.notifications);
                    }
                    throw new IllegalStateException(StubApp.getString2(555).concat(string2));
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder computeTollCost(Boolean bool) {
                    this.computeTollCost = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder continueStraight(Boolean bool) {
                    this.continueStraight = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder coordinates(String str) {
                    if (str == null) {
                        throw new NullPointerException(StubApp.getString2(12830));
                    }
                    this.coordinates = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder departAt(String str) {
                    this.departAt = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder enableRefresh(Boolean bool) {
                    this.enableRefresh = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder exclude(String str) {
                    this.exclude = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder geometries(String str) {
                    if (str == null) {
                        throw new NullPointerException(StubApp.getString2(12831));
                    }
                    this.geometries = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder include(String str) {
                    this.include = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder intersectionLinkAccess(Boolean bool) {
                    this.intersectionLinkAccess = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder intersectionLinkBridge(Boolean bool) {
                    this.intersectionLinkBridge = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder intersectionLinkElevated(Boolean bool) {
                    this.intersectionLinkElevated = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder intersectionLinkFormOfWay(Boolean bool) {
                    this.intersectionLinkFormOfWay = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder intersectionLinkGeometry(String str) {
                    this.intersectionLinkGeometry = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder language(String str) {
                    this.language = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder layers(String str) {
                    this.layers = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder maxHeight(Double d8) {
                    this.maxHeight = d8;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder maxWeight(Double d8) {
                    this.maxWeight = d8;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder maxWidth(Double d8) {
                    this.maxWidth = d8;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder metadata(Boolean bool) {
                    this.metadata = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder notifications(String str) {
                    this.notifications = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder overview(String str) {
                    this.overview = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder paymentMethods(String str) {
                    this.paymentMethods = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder profile(String str) {
                    if (str == null) {
                        throw new NullPointerException(StubApp.getString2(12832));
                    }
                    this.profile = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder radiuses(String str) {
                    this.radiuses = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder roundaboutExits(Boolean bool) {
                    this.roundaboutExits = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder snappingIncludeClosures(String str) {
                    this.snappingIncludeClosures = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder snappingIncludeStaticClosures(String str) {
                    this.snappingIncludeStaticClosures = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder steps(Boolean bool) {
                    this.steps = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder suppressVoiceInstructionLocalNames(Boolean bool) {
                    this.suppressVoiceInstructionLocalNames = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ RouteOptions.Builder unrecognized(Map map) {
                    return unrecognized2((Map<String, b>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder user(String str) {
                    if (str == null) {
                        throw new NullPointerException(StubApp.getString2(12833));
                    }
                    this.user = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder voiceInstructions(Boolean bool) {
                    this.voiceInstructions = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder voiceUnits(String str) {
                    this.voiceUnits = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder walkingSpeed(Double d8) {
                    this.walkingSpeed = d8;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder walkwayBias(Double d8) {
                    this.walkwayBias = d8;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder waypointIndices(String str) {
                    this.waypointIndices = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder waypointNames(String str) {
                    this.waypointNames = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder waypointTargets(String str) {
                    this.waypointTargets = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder waypointsPerRoute(Boolean bool) {
                    this.waypointsPerRoute = bool;
                    return this;
                }

                public Builder() {
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                /* renamed from: unrecognized, reason: avoid collision after fix types in other method */
                public RouteOptions.Builder unrecognized2(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }

                private Builder(RouteOptions routeOptions) {
                    this.unrecognized = routeOptions.unrecognized();
                    this.baseUrl = routeOptions.baseUrl();
                    this.user = routeOptions.user();
                    this.profile = routeOptions.profile();
                    this.coordinates = routeOptions.coordinates();
                    this.alternatives = routeOptions.alternatives();
                    this.language = routeOptions.language();
                    this.radiuses = routeOptions.radiuses();
                    this.bearings = routeOptions.bearings();
                    this.avoidManeuverRadius = routeOptions.avoidManeuverRadius();
                    this.layers = routeOptions.layers();
                    this.continueStraight = routeOptions.continueStraight();
                    this.roundaboutExits = routeOptions.roundaboutExits();
                    this.geometries = routeOptions.geometries();
                    this.overview = routeOptions.overview();
                    this.steps = routeOptions.steps();
                    this.annotations = routeOptions.annotations();
                    this.exclude = routeOptions.exclude();
                    this.include = routeOptions.include();
                    this.voiceInstructions = routeOptions.voiceInstructions();
                    this.bannerInstructions = routeOptions.bannerInstructions();
                    this.voiceUnits = routeOptions.voiceUnits();
                    this.approaches = routeOptions.approaches();
                    this.waypointIndices = routeOptions.waypointIndices();
                    this.waypointNames = routeOptions.waypointNames();
                    this.waypointTargets = routeOptions.waypointTargets();
                    this.waypointsPerRoute = routeOptions.waypointsPerRoute();
                    this.alleyBias = routeOptions.alleyBias();
                    this.walkingSpeed = routeOptions.walkingSpeed();
                    this.walkwayBias = routeOptions.walkwayBias();
                    this.snappingIncludeClosures = routeOptions.snappingIncludeClosures();
                    this.snappingIncludeStaticClosures = routeOptions.snappingIncludeStaticClosures();
                    this.arriveBy = routeOptions.arriveBy();
                    this.departAt = routeOptions.departAt();
                    this.maxHeight = routeOptions.maxHeight();
                    this.maxWidth = routeOptions.maxWidth();
                    this.maxWeight = routeOptions.maxWeight();
                    this.enableRefresh = routeOptions.enableRefresh();
                    this.computeTollCost = routeOptions.computeTollCost();
                    this.metadata = routeOptions.metadata();
                    this.paymentMethods = routeOptions.paymentMethods();
                    this.suppressVoiceInstructionLocalNames = routeOptions.suppressVoiceInstructionLocalNames();
                    this.intersectionLinkFormOfWay = routeOptions.intersectionLinkFormOfWay();
                    this.intersectionLinkGeometry = routeOptions.intersectionLinkGeometry();
                    this.intersectionLinkAccess = routeOptions.intersectionLinkAccess();
                    this.intersectionLinkElevated = routeOptions.intersectionLinkElevated();
                    this.intersectionLinkBridge = routeOptions.intersectionLinkBridge();
                    this.notifications = routeOptions.notifications();
                }
            }

            {
                this.unrecognized = map;
                if (str == null) {
                    throw new NullPointerException(StubApp.getString2(12787));
                }
                this.baseUrl = str;
                if (str2 == null) {
                    throw new NullPointerException(StubApp.getString2(12833));
                }
                this.user = str2;
                if (str3 == null) {
                    throw new NullPointerException(StubApp.getString2(12832));
                }
                this.profile = str3;
                if (str4 == null) {
                    throw new NullPointerException(StubApp.getString2(12830));
                }
                this.coordinates = str4;
                this.alternatives = bool;
                this.language = str5;
                this.radiuses = str6;
                this.bearings = str7;
                this.avoidManeuverRadius = d8;
                this.layers = str8;
                this.continueStraight = bool2;
                this.roundaboutExits = bool3;
                if (str9 == null) {
                    throw new NullPointerException(StubApp.getString2(12831));
                }
                this.geometries = str9;
                this.overview = str10;
                this.steps = bool4;
                this.annotations = str11;
                this.exclude = str12;
                this.include = str13;
                this.voiceInstructions = bool5;
                this.bannerInstructions = bool6;
                this.voiceUnits = str14;
                this.approaches = str15;
                this.waypointIndices = str16;
                this.waypointNames = str17;
                this.waypointTargets = str18;
                this.waypointsPerRoute = bool7;
                this.alleyBias = d10;
                this.walkingSpeed = d11;
                this.walkwayBias = d12;
                this.snappingIncludeClosures = str19;
                this.snappingIncludeStaticClosures = str20;
                this.arriveBy = str21;
                this.departAt = str22;
                this.maxHeight = d13;
                this.maxWidth = d14;
                this.maxWeight = d15;
                this.enableRefresh = bool8;
                this.computeTollCost = bool9;
                this.metadata = bool10;
                this.paymentMethods = str23;
                this.suppressVoiceInstructionLocalNames = bool11;
                this.intersectionLinkFormOfWay = bool12;
                this.intersectionLinkGeometry = str24;
                this.intersectionLinkAccess = bool13;
                this.intersectionLinkElevated = bool14;
                this.intersectionLinkBridge = bool15;
                this.notifications = str25;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("alley_bias")
            public Double alleyBias() {
                return this.alleyBias;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            public Boolean alternatives() {
                return this.alternatives;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            public String annotations() {
                return this.annotations;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            public String approaches() {
                return this.approaches;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("arrive_by")
            public String arriveBy() {
                return this.arriveBy;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("avoid_maneuver_radius")
            public Double avoidManeuverRadius() {
                return this.avoidManeuverRadius;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("banner_instructions")
            public Boolean bannerInstructions() {
                return this.bannerInstructions;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            public String baseUrl() {
                return this.baseUrl;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            public String bearings() {
                return this.bearings;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("compute_toll_cost")
            public Boolean computeTollCost() {
                return this.computeTollCost;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("continue_straight")
            public Boolean continueStraight() {
                return this.continueStraight;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            public String coordinates() {
                return this.coordinates;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("depart_at")
            public String departAt() {
                return this.departAt;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("enable_refresh")
            public Boolean enableRefresh() {
                return this.enableRefresh;
            }

            public boolean equals(Object obj) {
                Boolean bool16;
                String str26;
                String str27;
                String str28;
                Double d16;
                String str29;
                Boolean bool17;
                Boolean bool18;
                String str30;
                Boolean bool19;
                String str31;
                String str32;
                String str33;
                Boolean bool20;
                Boolean bool21;
                String str34;
                String str35;
                String str36;
                String str37;
                String str38;
                Boolean bool22;
                Double d17;
                Double d18;
                Double d19;
                String str39;
                String str40;
                String str41;
                String str42;
                Double d20;
                Double d21;
                Double d22;
                Boolean bool23;
                Boolean bool24;
                Boolean bool25;
                String str43;
                Boolean bool26;
                Boolean bool27;
                String str44;
                Boolean bool28;
                Boolean bool29;
                Boolean bool30;
                String str45;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof RouteOptions) {
                    RouteOptions routeOptions = (RouteOptions) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(routeOptions.unrecognized()) : routeOptions.unrecognized() == null) {
                        if (this.baseUrl.equals(routeOptions.baseUrl()) && this.user.equals(routeOptions.user()) && this.profile.equals(routeOptions.profile()) && this.coordinates.equals(routeOptions.coordinates()) && ((bool16 = this.alternatives) != null ? bool16.equals(routeOptions.alternatives()) : routeOptions.alternatives() == null) && ((str26 = this.language) != null ? str26.equals(routeOptions.language()) : routeOptions.language() == null) && ((str27 = this.radiuses) != null ? str27.equals(routeOptions.radiuses()) : routeOptions.radiuses() == null) && ((str28 = this.bearings) != null ? str28.equals(routeOptions.bearings()) : routeOptions.bearings() == null) && ((d16 = this.avoidManeuverRadius) != null ? d16.equals(routeOptions.avoidManeuverRadius()) : routeOptions.avoidManeuverRadius() == null) && ((str29 = this.layers) != null ? str29.equals(routeOptions.layers()) : routeOptions.layers() == null) && ((bool17 = this.continueStraight) != null ? bool17.equals(routeOptions.continueStraight()) : routeOptions.continueStraight() == null) && ((bool18 = this.roundaboutExits) != null ? bool18.equals(routeOptions.roundaboutExits()) : routeOptions.roundaboutExits() == null) && this.geometries.equals(routeOptions.geometries()) && ((str30 = this.overview) != null ? str30.equals(routeOptions.overview()) : routeOptions.overview() == null) && ((bool19 = this.steps) != null ? bool19.equals(routeOptions.steps()) : routeOptions.steps() == null) && ((str31 = this.annotations) != null ? str31.equals(routeOptions.annotations()) : routeOptions.annotations() == null) && ((str32 = this.exclude) != null ? str32.equals(routeOptions.exclude()) : routeOptions.exclude() == null) && ((str33 = this.include) != null ? str33.equals(routeOptions.include()) : routeOptions.include() == null) && ((bool20 = this.voiceInstructions) != null ? bool20.equals(routeOptions.voiceInstructions()) : routeOptions.voiceInstructions() == null) && ((bool21 = this.bannerInstructions) != null ? bool21.equals(routeOptions.bannerInstructions()) : routeOptions.bannerInstructions() == null) && ((str34 = this.voiceUnits) != null ? str34.equals(routeOptions.voiceUnits()) : routeOptions.voiceUnits() == null) && ((str35 = this.approaches) != null ? str35.equals(routeOptions.approaches()) : routeOptions.approaches() == null) && ((str36 = this.waypointIndices) != null ? str36.equals(routeOptions.waypointIndices()) : routeOptions.waypointIndices() == null) && ((str37 = this.waypointNames) != null ? str37.equals(routeOptions.waypointNames()) : routeOptions.waypointNames() == null) && ((str38 = this.waypointTargets) != null ? str38.equals(routeOptions.waypointTargets()) : routeOptions.waypointTargets() == null) && ((bool22 = this.waypointsPerRoute) != null ? bool22.equals(routeOptions.waypointsPerRoute()) : routeOptions.waypointsPerRoute() == null) && ((d17 = this.alleyBias) != null ? d17.equals(routeOptions.alleyBias()) : routeOptions.alleyBias() == null) && ((d18 = this.walkingSpeed) != null ? d18.equals(routeOptions.walkingSpeed()) : routeOptions.walkingSpeed() == null) && ((d19 = this.walkwayBias) != null ? d19.equals(routeOptions.walkwayBias()) : routeOptions.walkwayBias() == null) && ((str39 = this.snappingIncludeClosures) != null ? str39.equals(routeOptions.snappingIncludeClosures()) : routeOptions.snappingIncludeClosures() == null) && ((str40 = this.snappingIncludeStaticClosures) != null ? str40.equals(routeOptions.snappingIncludeStaticClosures()) : routeOptions.snappingIncludeStaticClosures() == null) && ((str41 = this.arriveBy) != null ? str41.equals(routeOptions.arriveBy()) : routeOptions.arriveBy() == null) && ((str42 = this.departAt) != null ? str42.equals(routeOptions.departAt()) : routeOptions.departAt() == null) && ((d20 = this.maxHeight) != null ? d20.equals(routeOptions.maxHeight()) : routeOptions.maxHeight() == null) && ((d21 = this.maxWidth) != null ? d21.equals(routeOptions.maxWidth()) : routeOptions.maxWidth() == null) && ((d22 = this.maxWeight) != null ? d22.equals(routeOptions.maxWeight()) : routeOptions.maxWeight() == null) && ((bool23 = this.enableRefresh) != null ? bool23.equals(routeOptions.enableRefresh()) : routeOptions.enableRefresh() == null) && ((bool24 = this.computeTollCost) != null ? bool24.equals(routeOptions.computeTollCost()) : routeOptions.computeTollCost() == null) && ((bool25 = this.metadata) != null ? bool25.equals(routeOptions.metadata()) : routeOptions.metadata() == null) && ((str43 = this.paymentMethods) != null ? str43.equals(routeOptions.paymentMethods()) : routeOptions.paymentMethods() == null) && ((bool26 = this.suppressVoiceInstructionLocalNames) != null ? bool26.equals(routeOptions.suppressVoiceInstructionLocalNames()) : routeOptions.suppressVoiceInstructionLocalNames() == null) && ((bool27 = this.intersectionLinkFormOfWay) != null ? bool27.equals(routeOptions.intersectionLinkFormOfWay()) : routeOptions.intersectionLinkFormOfWay() == null) && ((str44 = this.intersectionLinkGeometry) != null ? str44.equals(routeOptions.intersectionLinkGeometry()) : routeOptions.intersectionLinkGeometry() == null) && ((bool28 = this.intersectionLinkAccess) != null ? bool28.equals(routeOptions.intersectionLinkAccess()) : routeOptions.intersectionLinkAccess() == null) && ((bool29 = this.intersectionLinkElevated) != null ? bool29.equals(routeOptions.intersectionLinkElevated()) : routeOptions.intersectionLinkElevated() == null) && ((bool30 = this.intersectionLinkBridge) != null ? bool30.equals(routeOptions.intersectionLinkBridge()) : routeOptions.intersectionLinkBridge() == null) && ((str45 = this.notifications) != null ? str45.equals(routeOptions.notifications()) : routeOptions.notifications() == null)) {
                            return true;
                        }
                    }
                }
                return false;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            public String exclude() {
                return this.exclude;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            public String geometries() {
                return this.geometries;
            }

            public int hashCode() {
                Map<String, b> map2 = this.unrecognized;
                int hashCode = ((((((((((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003) ^ this.baseUrl.hashCode()) * 1000003) ^ this.user.hashCode()) * 1000003) ^ this.profile.hashCode()) * 1000003) ^ this.coordinates.hashCode()) * 1000003;
                Boolean bool16 = this.alternatives;
                int hashCode2 = (hashCode ^ (bool16 == null ? 0 : bool16.hashCode())) * 1000003;
                String str26 = this.language;
                int hashCode3 = (hashCode2 ^ (str26 == null ? 0 : str26.hashCode())) * 1000003;
                String str27 = this.radiuses;
                int hashCode4 = (hashCode3 ^ (str27 == null ? 0 : str27.hashCode())) * 1000003;
                String str28 = this.bearings;
                int hashCode5 = (hashCode4 ^ (str28 == null ? 0 : str28.hashCode())) * 1000003;
                Double d16 = this.avoidManeuverRadius;
                int hashCode6 = (hashCode5 ^ (d16 == null ? 0 : d16.hashCode())) * 1000003;
                String str29 = this.layers;
                int hashCode7 = (hashCode6 ^ (str29 == null ? 0 : str29.hashCode())) * 1000003;
                Boolean bool17 = this.continueStraight;
                int hashCode8 = (hashCode7 ^ (bool17 == null ? 0 : bool17.hashCode())) * 1000003;
                Boolean bool18 = this.roundaboutExits;
                int hashCode9 = (((hashCode8 ^ (bool18 == null ? 0 : bool18.hashCode())) * 1000003) ^ this.geometries.hashCode()) * 1000003;
                String str30 = this.overview;
                int hashCode10 = (hashCode9 ^ (str30 == null ? 0 : str30.hashCode())) * 1000003;
                Boolean bool19 = this.steps;
                int hashCode11 = (hashCode10 ^ (bool19 == null ? 0 : bool19.hashCode())) * 1000003;
                String str31 = this.annotations;
                int hashCode12 = (hashCode11 ^ (str31 == null ? 0 : str31.hashCode())) * 1000003;
                String str32 = this.exclude;
                int hashCode13 = (hashCode12 ^ (str32 == null ? 0 : str32.hashCode())) * 1000003;
                String str33 = this.include;
                int hashCode14 = (hashCode13 ^ (str33 == null ? 0 : str33.hashCode())) * 1000003;
                Boolean bool20 = this.voiceInstructions;
                int hashCode15 = (hashCode14 ^ (bool20 == null ? 0 : bool20.hashCode())) * 1000003;
                Boolean bool21 = this.bannerInstructions;
                int hashCode16 = (hashCode15 ^ (bool21 == null ? 0 : bool21.hashCode())) * 1000003;
                String str34 = this.voiceUnits;
                int hashCode17 = (hashCode16 ^ (str34 == null ? 0 : str34.hashCode())) * 1000003;
                String str35 = this.approaches;
                int hashCode18 = (hashCode17 ^ (str35 == null ? 0 : str35.hashCode())) * 1000003;
                String str36 = this.waypointIndices;
                int hashCode19 = (hashCode18 ^ (str36 == null ? 0 : str36.hashCode())) * 1000003;
                String str37 = this.waypointNames;
                int hashCode20 = (hashCode19 ^ (str37 == null ? 0 : str37.hashCode())) * 1000003;
                String str38 = this.waypointTargets;
                int hashCode21 = (hashCode20 ^ (str38 == null ? 0 : str38.hashCode())) * 1000003;
                Boolean bool22 = this.waypointsPerRoute;
                int hashCode22 = (hashCode21 ^ (bool22 == null ? 0 : bool22.hashCode())) * 1000003;
                Double d17 = this.alleyBias;
                int hashCode23 = (hashCode22 ^ (d17 == null ? 0 : d17.hashCode())) * 1000003;
                Double d18 = this.walkingSpeed;
                int hashCode24 = (hashCode23 ^ (d18 == null ? 0 : d18.hashCode())) * 1000003;
                Double d19 = this.walkwayBias;
                int hashCode25 = (hashCode24 ^ (d19 == null ? 0 : d19.hashCode())) * 1000003;
                String str39 = this.snappingIncludeClosures;
                int hashCode26 = (hashCode25 ^ (str39 == null ? 0 : str39.hashCode())) * 1000003;
                String str40 = this.snappingIncludeStaticClosures;
                int hashCode27 = (hashCode26 ^ (str40 == null ? 0 : str40.hashCode())) * 1000003;
                String str41 = this.arriveBy;
                int hashCode28 = (hashCode27 ^ (str41 == null ? 0 : str41.hashCode())) * 1000003;
                String str42 = this.departAt;
                int hashCode29 = (hashCode28 ^ (str42 == null ? 0 : str42.hashCode())) * 1000003;
                Double d20 = this.maxHeight;
                int hashCode30 = (hashCode29 ^ (d20 == null ? 0 : d20.hashCode())) * 1000003;
                Double d21 = this.maxWidth;
                int hashCode31 = (hashCode30 ^ (d21 == null ? 0 : d21.hashCode())) * 1000003;
                Double d22 = this.maxWeight;
                int hashCode32 = (hashCode31 ^ (d22 == null ? 0 : d22.hashCode())) * 1000003;
                Boolean bool23 = this.enableRefresh;
                int hashCode33 = (hashCode32 ^ (bool23 == null ? 0 : bool23.hashCode())) * 1000003;
                Boolean bool24 = this.computeTollCost;
                int hashCode34 = (hashCode33 ^ (bool24 == null ? 0 : bool24.hashCode())) * 1000003;
                Boolean bool25 = this.metadata;
                int hashCode35 = (hashCode34 ^ (bool25 == null ? 0 : bool25.hashCode())) * 1000003;
                String str43 = this.paymentMethods;
                int hashCode36 = (hashCode35 ^ (str43 == null ? 0 : str43.hashCode())) * 1000003;
                Boolean bool26 = this.suppressVoiceInstructionLocalNames;
                int hashCode37 = (hashCode36 ^ (bool26 == null ? 0 : bool26.hashCode())) * 1000003;
                Boolean bool27 = this.intersectionLinkFormOfWay;
                int hashCode38 = (hashCode37 ^ (bool27 == null ? 0 : bool27.hashCode())) * 1000003;
                String str44 = this.intersectionLinkGeometry;
                int hashCode39 = (hashCode38 ^ (str44 == null ? 0 : str44.hashCode())) * 1000003;
                Boolean bool28 = this.intersectionLinkAccess;
                int hashCode40 = (hashCode39 ^ (bool28 == null ? 0 : bool28.hashCode())) * 1000003;
                Boolean bool29 = this.intersectionLinkElevated;
                int hashCode41 = (hashCode40 ^ (bool29 == null ? 0 : bool29.hashCode())) * 1000003;
                Boolean bool30 = this.intersectionLinkBridge;
                int hashCode42 = (hashCode41 ^ (bool30 == null ? 0 : bool30.hashCode())) * 1000003;
                String str45 = this.notifications;
                return hashCode42 ^ (str45 != null ? str45.hashCode() : 0);
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            public String include() {
                return this.include;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("intersection_link_access")
            public Boolean intersectionLinkAccess() {
                return this.intersectionLinkAccess;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("intersection_link_bridge")
            public Boolean intersectionLinkBridge() {
                return this.intersectionLinkBridge;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("intersection_link_elevated")
            public Boolean intersectionLinkElevated() {
                return this.intersectionLinkElevated;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("intersection_link_form_of_way")
            public Boolean intersectionLinkFormOfWay() {
                return this.intersectionLinkFormOfWay;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("intersection_link_geometry")
            public String intersectionLinkGeometry() {
                return this.intersectionLinkGeometry;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            public String language() {
                return this.language;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            public String layers() {
                return this.layers;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("max_height")
            public Double maxHeight() {
                return this.maxHeight;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("max_weight")
            public Double maxWeight() {
                return this.maxWeight;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("max_width")
            public Double maxWidth() {
                return this.maxWidth;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("metadata")
            public Boolean metadata() {
                return this.metadata;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            public String notifications() {
                return this.notifications;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            public String overview() {
                return this.overview;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("payment_methods")
            public String paymentMethods() {
                return this.paymentMethods;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            public String profile() {
                return this.profile;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            public String radiuses() {
                return this.radiuses;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("roundabout_exits")
            public Boolean roundaboutExits() {
                return this.roundaboutExits;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("snapping_include_closures")
            public String snappingIncludeClosures() {
                return this.snappingIncludeClosures;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("snapping_include_static_closures")
            public String snappingIncludeStaticClosures() {
                return this.snappingIncludeStaticClosures;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            public Boolean steps() {
                return this.steps;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("suppress_voice_instruction_local_names")
            public Boolean suppressVoiceInstructionLocalNames() {
                return this.suppressVoiceInstructionLocalNames;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            public RouteOptions.Builder toBuilder() {
                return new Builder(this, null);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(12834));
                sb2.append(this.unrecognized);
                sb2.append(StubApp.getString2(12794));
                sb2.append(this.baseUrl);
                sb2.append(StubApp.getString2(12835));
                sb2.append(this.user);
                sb2.append(StubApp.getString2(9036));
                sb2.append(this.profile);
                sb2.append(StubApp.getString2(2324));
                sb2.append(this.coordinates);
                sb2.append(StubApp.getString2(12836));
                sb2.append(this.alternatives);
                sb2.append(StubApp.getString2(6716));
                sb2.append(this.language);
                sb2.append(StubApp.getString2(12837));
                sb2.append(this.radiuses);
                sb2.append(StubApp.getString2(12838));
                sb2.append(this.bearings);
                sb2.append(StubApp.getString2(12839));
                sb2.append(this.avoidManeuverRadius);
                sb2.append(StubApp.getString2(12840));
                sb2.append(this.layers);
                sb2.append(StubApp.getString2(12841));
                sb2.append(this.continueStraight);
                sb2.append(StubApp.getString2(12842));
                sb2.append(this.roundaboutExits);
                sb2.append(StubApp.getString2(12843));
                sb2.append(this.geometries);
                sb2.append(StubApp.getString2(12844));
                sb2.append(this.overview);
                sb2.append(StubApp.getString2(12826));
                sb2.append(this.steps);
                sb2.append(StubApp.getString2(12845));
                sb2.append(this.annotations);
                sb2.append(StubApp.getString2(12846));
                sb2.append(this.exclude);
                sb2.append(StubApp.getString2(12847));
                sb2.append(this.include);
                sb2.append(StubApp.getString2(5004));
                sb2.append(this.voiceInstructions);
                sb2.append(StubApp.getString2(5003));
                sb2.append(this.bannerInstructions);
                sb2.append(StubApp.getString2(12848));
                sb2.append(this.voiceUnits);
                sb2.append(StubApp.getString2(12849));
                sb2.append(this.approaches);
                sb2.append(StubApp.getString2(12850));
                sb2.append(this.waypointIndices);
                sb2.append(StubApp.getString2(12851));
                sb2.append(this.waypointNames);
                sb2.append(StubApp.getString2(12852));
                sb2.append(this.waypointTargets);
                sb2.append(StubApp.getString2(12853));
                sb2.append(this.waypointsPerRoute);
                sb2.append(StubApp.getString2(12854));
                sb2.append(this.alleyBias);
                sb2.append(StubApp.getString2(12855));
                sb2.append(this.walkingSpeed);
                sb2.append(StubApp.getString2(12856));
                sb2.append(this.walkwayBias);
                sb2.append(StubApp.getString2(12857));
                sb2.append(this.snappingIncludeClosures);
                sb2.append(StubApp.getString2(12858));
                sb2.append(this.snappingIncludeStaticClosures);
                sb2.append(StubApp.getString2(12859));
                sb2.append(this.arriveBy);
                sb2.append(StubApp.getString2(12860));
                sb2.append(this.departAt);
                sb2.append(StubApp.getString2(12861));
                sb2.append(this.maxHeight);
                sb2.append(StubApp.getString2(12862));
                sb2.append(this.maxWidth);
                sb2.append(StubApp.getString2(12863));
                sb2.append(this.maxWeight);
                sb2.append(StubApp.getString2(12864));
                sb2.append(this.enableRefresh);
                sb2.append(StubApp.getString2(12865));
                sb2.append(this.computeTollCost);
                sb2.append(StubApp.getString2(2151));
                sb2.append(this.metadata);
                sb2.append(StubApp.getString2(12763));
                sb2.append(this.paymentMethods);
                sb2.append(StubApp.getString2(12866));
                sb2.append(this.suppressVoiceInstructionLocalNames);
                sb2.append(StubApp.getString2(12867));
                sb2.append(this.intersectionLinkFormOfWay);
                sb2.append(StubApp.getString2(12868));
                sb2.append(this.intersectionLinkGeometry);
                sb2.append(StubApp.getString2(12869));
                sb2.append(this.intersectionLinkAccess);
                sb2.append(StubApp.getString2(12870));
                sb2.append(this.intersectionLinkElevated);
                sb2.append(StubApp.getString2(12871));
                sb2.append(this.intersectionLinkBridge);
                sb2.append(StubApp.getString2(2122));
                return AbstractC1482f.k(sb2, this.notifications, StubApp.getString2(265));
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, b> unrecognized() {
                return this.unrecognized;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            public String user() {
                return this.user;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("voice_instructions")
            public Boolean voiceInstructions() {
                return this.voiceInstructions;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("voice_units")
            public String voiceUnits() {
                return this.voiceUnits;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("walking_speed")
            public Double walkingSpeed() {
                return this.walkingSpeed;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("walkway_bias")
            public Double walkwayBias() {
                return this.walkwayBias;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("waypoints")
            public String waypointIndices() {
                return this.waypointIndices;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("waypoint_names")
            public String waypointNames() {
                return this.waypointNames;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("waypoint_targets")
            public String waypointTargets() {
                return this.waypointTargets;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("waypoints_per_route")
            public Boolean waypointsPerRoute() {
                return this.waypointsPerRoute;
            }
        };
    }
}
