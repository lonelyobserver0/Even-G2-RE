package com.mapbox.api.directions.v5.models;

import E1.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.StepManeuver;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_StepManeuver extends C$AutoValue_StepManeuver {

    public static final class GsonTypeAdapter extends TypeAdapter<StepManeuver> {
        private volatile TypeAdapter<double[]> array__double_adapter;
        private volatile TypeAdapter<Double> double__adapter;
        private final Gson gson;
        private volatile TypeAdapter<Integer> integer_adapter;
        private volatile TypeAdapter<String> string_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(13128);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public StepManeuver read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            StepManeuver.Builder builder = StepManeuver.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    nextName.getClass();
                    char c10 = 65535;
                    switch (nextName.hashCode()) {
                        case -901094096:
                            if (nextName.equals(StubApp.getString2(13125))) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case -307042805:
                            if (nextName.equals(StubApp.getString2(13124))) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 1901043637:
                            if (nextName.equals(StubApp.getString2(662))) {
                                c10 = 2;
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
                            builder.bearingBefore(typeAdapter.read2(jsonReader));
                            break;
                        case 1:
                            TypeAdapter<Double> typeAdapter2 = this.double__adapter;
                            if (typeAdapter2 == null) {
                                typeAdapter2 = this.gson.getAdapter(Double.class);
                                this.double__adapter = typeAdapter2;
                            }
                            builder.bearingAfter(typeAdapter2.read2(jsonReader));
                            break;
                        case 2:
                            TypeAdapter<double[]> typeAdapter3 = this.array__double_adapter;
                            if (typeAdapter3 == null) {
                                typeAdapter3 = this.gson.getAdapter(double[].class);
                                this.array__double_adapter = typeAdapter3;
                            }
                            builder.rawLocation(typeAdapter3.read2(jsonReader));
                            break;
                        default:
                            if (!StubApp.getString2(13126).equals(nextName)) {
                                if (!StubApp.getString2(660).equals(nextName)) {
                                    if (!StubApp.getString2(12961).equals(nextName)) {
                                        if (!StubApp.getString2(13127).equals(nextName)) {
                                            if (linkedHashMap == null) {
                                                linkedHashMap = new LinkedHashMap();
                                                builder.unrecognized(linkedHashMap);
                                            }
                                            a.t((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, nextName);
                                            break;
                                        } else {
                                            TypeAdapter<Integer> typeAdapter4 = this.integer_adapter;
                                            if (typeAdapter4 == null) {
                                                typeAdapter4 = this.gson.getAdapter(Integer.class);
                                                this.integer_adapter = typeAdapter4;
                                            }
                                            builder.exit(typeAdapter4.read2(jsonReader));
                                            break;
                                        }
                                    } else {
                                        TypeAdapter<String> typeAdapter5 = this.string_adapter;
                                        if (typeAdapter5 == null) {
                                            typeAdapter5 = this.gson.getAdapter(String.class);
                                            this.string_adapter = typeAdapter5;
                                        }
                                        builder.modifier(typeAdapter5.read2(jsonReader));
                                        break;
                                    }
                                } else {
                                    TypeAdapter<String> typeAdapter6 = this.string_adapter;
                                    if (typeAdapter6 == null) {
                                        typeAdapter6 = this.gson.getAdapter(String.class);
                                        this.string_adapter = typeAdapter6;
                                    }
                                    builder.type(typeAdapter6.read2(jsonReader));
                                    break;
                                }
                            } else {
                                TypeAdapter<String> typeAdapter7 = this.string_adapter;
                                if (typeAdapter7 == null) {
                                    typeAdapter7 = this.gson.getAdapter(String.class);
                                    this.string_adapter = typeAdapter7;
                                }
                                builder.instruction(typeAdapter7.read2(jsonReader));
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
        public void write(JsonWriter jsonWriter, StepManeuver stepManeuver) throws IOException {
            if (stepManeuver == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (stepManeuver.unrecognized() != null) {
                for (Map.Entry<String, b> entry : stepManeuver.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(662));
            if (stepManeuver.rawLocation() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<double[]> typeAdapter = this.array__double_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(double[].class);
                    this.array__double_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, stepManeuver.rawLocation());
            }
            jsonWriter.name(StubApp.getString2(13125));
            if (stepManeuver.bearingBefore() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter2 = this.double__adapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(Double.class);
                    this.double__adapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, stepManeuver.bearingBefore());
            }
            jsonWriter.name(StubApp.getString2(13124));
            if (stepManeuver.bearingAfter() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter3 = this.double__adapter;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.gson.getAdapter(Double.class);
                    this.double__adapter = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, stepManeuver.bearingAfter());
            }
            jsonWriter.name(StubApp.getString2(13126));
            if (stepManeuver.instruction() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter4 = this.string_adapter;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, stepManeuver.instruction());
            }
            jsonWriter.name(StubApp.getString2(660));
            if (stepManeuver.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter5 = this.string_adapter;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, stepManeuver.type());
            }
            jsonWriter.name(StubApp.getString2(12961));
            if (stepManeuver.modifier() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter6 = this.string_adapter;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, stepManeuver.modifier());
            }
            jsonWriter.name(StubApp.getString2(13127));
            if (stepManeuver.exit() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter7 = this.integer_adapter;
                if (typeAdapter7 == null) {
                    typeAdapter7 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = typeAdapter7;
                }
                typeAdapter7.write(jsonWriter, stepManeuver.exit());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_StepManeuver(Map<String, b> map, double[] dArr, Double d8, Double d10, String str, String str2, String str3, Integer num) {
        new StepManeuver(map, dArr, d8, d10, str, str2, str3, num) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_StepManeuver
            private final Double bearingAfter;
            private final Double bearingBefore;
            private final Integer exit;
            private final String instruction;
            private final String modifier;
            private final double[] rawLocation;
            private final String type;
            private final Map<String, b> unrecognized;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_StepManeuver$Builder */
            public static class Builder extends StepManeuver.Builder {
                private Double bearingAfter;
                private Double bearingBefore;
                private Integer exit;
                private String instruction;
                private String modifier;
                private double[] rawLocation;
                private String type;
                private Map<String, b> unrecognized;

                @Override // com.mapbox.api.directions.v5.models.StepManeuver.Builder
                public StepManeuver.Builder bearingAfter(Double d8) {
                    this.bearingAfter = d8;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepManeuver.Builder
                public StepManeuver.Builder bearingBefore(Double d8) {
                    this.bearingBefore = d8;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepManeuver.Builder
                public StepManeuver build() {
                    String string2 = this.rawLocation == null ? StubApp.getString2(12748) : "";
                    if (string2.isEmpty()) {
                        return new AutoValue_StepManeuver(this.unrecognized, this.rawLocation, this.bearingBefore, this.bearingAfter, this.instruction, this.type, this.modifier, this.exit);
                    }
                    throw new IllegalStateException(StubApp.getString2(555).concat(string2));
                }

                @Override // com.mapbox.api.directions.v5.models.StepManeuver.Builder
                public StepManeuver.Builder exit(Integer num) {
                    this.exit = num;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepManeuver.Builder
                public StepManeuver.Builder instruction(String str) {
                    this.instruction = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepManeuver.Builder
                public StepManeuver.Builder modifier(String str) {
                    this.modifier = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepManeuver.Builder
                public StepManeuver.Builder rawLocation(double[] dArr) {
                    if (dArr == null) {
                        throw new NullPointerException(StubApp.getString2(12749));
                    }
                    this.rawLocation = dArr;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepManeuver.Builder
                public StepManeuver.Builder type(String str) {
                    this.type = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ StepManeuver.Builder unrecognized(Map map) {
                    return unrecognized2((Map<String, b>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                /* renamed from: unrecognized, reason: avoid collision after fix types in other method */
                public StepManeuver.Builder unrecognized2(Map<String, b> map) {
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
                this.bearingBefore = d8;
                this.bearingAfter = d10;
                this.instruction = str;
                this.type = str2;
                this.modifier = str3;
                this.exit = num;
            }

            @Override // com.mapbox.api.directions.v5.models.StepManeuver
            @SerializedName("bearing_after")
            public Double bearingAfter() {
                return this.bearingAfter;
            }

            @Override // com.mapbox.api.directions.v5.models.StepManeuver
            @SerializedName("bearing_before")
            public Double bearingBefore() {
                return this.bearingBefore;
            }

            public boolean equals(Object obj) {
                Double d11;
                Double d12;
                String str4;
                String str5;
                String str6;
                Integer num2;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof StepManeuver) {
                    StepManeuver stepManeuver = (StepManeuver) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(stepManeuver.unrecognized()) : stepManeuver.unrecognized() == null) {
                        if (Arrays.equals(this.rawLocation, stepManeuver instanceof C$AutoValue_StepManeuver ? ((C$AutoValue_StepManeuver) stepManeuver).rawLocation : stepManeuver.rawLocation()) && ((d11 = this.bearingBefore) != null ? d11.equals(stepManeuver.bearingBefore()) : stepManeuver.bearingBefore() == null) && ((d12 = this.bearingAfter) != null ? d12.equals(stepManeuver.bearingAfter()) : stepManeuver.bearingAfter() == null) && ((str4 = this.instruction) != null ? str4.equals(stepManeuver.instruction()) : stepManeuver.instruction() == null) && ((str5 = this.type) != null ? str5.equals(stepManeuver.type()) : stepManeuver.type() == null) && ((str6 = this.modifier) != null ? str6.equals(stepManeuver.modifier()) : stepManeuver.modifier() == null) && ((num2 = this.exit) != null ? num2.equals(stepManeuver.exit()) : stepManeuver.exit() == null)) {
                            return true;
                        }
                    }
                }
                return false;
            }

            @Override // com.mapbox.api.directions.v5.models.StepManeuver
            public Integer exit() {
                return this.exit;
            }

            public int hashCode() {
                Map<String, b> map2 = this.unrecognized;
                int hashCode = ((((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.rawLocation)) * 1000003;
                Double d11 = this.bearingBefore;
                int hashCode2 = (hashCode ^ (d11 == null ? 0 : d11.hashCode())) * 1000003;
                Double d12 = this.bearingAfter;
                int hashCode3 = (hashCode2 ^ (d12 == null ? 0 : d12.hashCode())) * 1000003;
                String str4 = this.instruction;
                int hashCode4 = (hashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.type;
                int hashCode5 = (hashCode4 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.modifier;
                int hashCode6 = (hashCode5 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                Integer num2 = this.exit;
                return hashCode6 ^ (num2 != null ? num2.hashCode() : 0);
            }

            @Override // com.mapbox.api.directions.v5.models.StepManeuver
            public String instruction() {
                return this.instruction;
            }

            @Override // com.mapbox.api.directions.v5.models.StepManeuver
            public String modifier() {
                return this.modifier;
            }

            @Override // com.mapbox.api.directions.v5.models.StepManeuver
            @SerializedName("location")
            public double[] rawLocation() {
                return this.rawLocation;
            }

            public String toString() {
                return StubApp.getString2(12930) + this.unrecognized + StubApp.getString2(12751) + Arrays.toString(this.rawLocation) + StubApp.getString2(12931) + this.bearingBefore + StubApp.getString2(12932) + this.bearingAfter + StubApp.getString2(12933) + this.instruction + StubApp.getString2(2148) + this.type + StubApp.getString2(1526) + this.modifier + StubApp.getString2(12934) + this.exit + StubApp.getString2(265);
            }

            @Override // com.mapbox.api.directions.v5.models.StepManeuver
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
