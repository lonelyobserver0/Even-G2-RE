package com.mapbox.api.directions.v5.models;

import E1.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.DirectionsWaypoint;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_DirectionsWaypoint extends C$AutoValue_DirectionsWaypoint {

    public static final class GsonTypeAdapter extends TypeAdapter<DirectionsWaypoint> {
        private volatile TypeAdapter<double[]> array__double_adapter;
        private volatile TypeAdapter<Double> double__adapter;
        private final Gson gson;
        private volatile TypeAdapter<String> string_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(12984);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public DirectionsWaypoint read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            DirectionsWaypoint.Builder builder = DirectionsWaypoint.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.getClass();
                    if (nextName.equals(StubApp.getString2(662))) {
                        TypeAdapter<double[]> typeAdapter = this.array__double_adapter;
                        if (typeAdapter == null) {
                            typeAdapter = this.gson.getAdapter(double[].class);
                            this.array__double_adapter = typeAdapter;
                        }
                        builder.rawLocation(typeAdapter.read2(jsonReader));
                    } else if (StubApp.getString2(ModuleDescriptor.MODULE_VERSION).equals(nextName)) {
                        TypeAdapter<String> typeAdapter2 = this.string_adapter;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.gson.getAdapter(String.class);
                            this.string_adapter = typeAdapter2;
                        }
                        builder.name(typeAdapter2.read2(jsonReader));
                    } else if (StubApp.getString2(2090).equals(nextName)) {
                        TypeAdapter<Double> typeAdapter3 = this.double__adapter;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.gson.getAdapter(Double.class);
                            this.double__adapter = typeAdapter3;
                        }
                        builder.distance(typeAdapter3.read2(jsonReader));
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
        public void write(JsonWriter jsonWriter, DirectionsWaypoint directionsWaypoint) throws IOException {
            if (directionsWaypoint == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (directionsWaypoint.unrecognized() != null) {
                for (Map.Entry<String, b> entry : directionsWaypoint.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(ModuleDescriptor.MODULE_VERSION));
            if (directionsWaypoint.name() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.string_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, directionsWaypoint.name());
            }
            jsonWriter.name(StubApp.getString2(662));
            if (directionsWaypoint.rawLocation() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<double[]> typeAdapter2 = this.array__double_adapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(double[].class);
                    this.array__double_adapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, directionsWaypoint.rawLocation());
            }
            jsonWriter.name(StubApp.getString2(2090));
            if (directionsWaypoint.distance() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter3 = this.double__adapter;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.gson.getAdapter(Double.class);
                    this.double__adapter = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, directionsWaypoint.distance());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_DirectionsWaypoint(Map<String, b> map, String str, double[] dArr, Double d8) {
        new DirectionsWaypoint(map, str, dArr, d8) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_DirectionsWaypoint
            private final Double distance;
            private final String name;
            private final double[] rawLocation;
            private final Map<String, b> unrecognized;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_DirectionsWaypoint$Builder */
            public static class Builder extends DirectionsWaypoint.Builder {
                private Double distance;
                private String name;
                private double[] rawLocation;
                private Map<String, b> unrecognized;

                @Override // com.mapbox.api.directions.v5.models.DirectionsWaypoint.Builder
                public DirectionsWaypoint build() {
                    String string2 = this.name == null ? StubApp.getString2(12747) : "";
                    if (this.rawLocation == null) {
                        string2 = AbstractC1482f.g(string2, StubApp.getString2(12748));
                    }
                    if (string2.isEmpty()) {
                        return new AutoValue_DirectionsWaypoint(this.unrecognized, this.name, this.rawLocation, this.distance);
                    }
                    throw new IllegalStateException(StubApp.getString2(555).concat(string2));
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsWaypoint.Builder
                public DirectionsWaypoint.Builder distance(Double d8) {
                    this.distance = d8;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsWaypoint.Builder
                public DirectionsWaypoint.Builder name(String str) {
                    if (str == null) {
                        throw new NullPointerException(StubApp.getString2(9576));
                    }
                    this.name = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsWaypoint.Builder
                public DirectionsWaypoint.Builder rawLocation(double[] dArr) {
                    if (dArr == null) {
                        throw new NullPointerException(StubApp.getString2(12749));
                    }
                    this.rawLocation = dArr;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ DirectionsWaypoint.Builder unrecognized(Map map) {
                    return unrecognized2((Map<String, b>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                /* renamed from: unrecognized, reason: avoid collision after fix types in other method */
                public DirectionsWaypoint.Builder unrecognized2(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }
            }

            {
                this.unrecognized = map;
                if (str == null) {
                    throw new NullPointerException(StubApp.getString2(9576));
                }
                this.name = str;
                if (dArr == null) {
                    throw new NullPointerException(StubApp.getString2(12749));
                }
                this.rawLocation = dArr;
                this.distance = d8;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsWaypoint
            public Double distance() {
                return this.distance;
            }

            public boolean equals(Object obj) {
                Double d10;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof DirectionsWaypoint) {
                    DirectionsWaypoint directionsWaypoint = (DirectionsWaypoint) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(directionsWaypoint.unrecognized()) : directionsWaypoint.unrecognized() == null) {
                        if (this.name.equals(directionsWaypoint.name())) {
                            if (Arrays.equals(this.rawLocation, directionsWaypoint instanceof C$AutoValue_DirectionsWaypoint ? ((C$AutoValue_DirectionsWaypoint) directionsWaypoint).rawLocation : directionsWaypoint.rawLocation()) && ((d10 = this.distance) != null ? d10.equals(directionsWaypoint.distance()) : directionsWaypoint.distance() == null)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                Map<String, b> map2 = this.unrecognized;
                int hashCode = ((((((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003) ^ this.name.hashCode()) * 1000003) ^ Arrays.hashCode(this.rawLocation)) * 1000003;
                Double d10 = this.distance;
                return hashCode ^ (d10 != null ? d10.hashCode() : 0);
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsWaypoint
            public String name() {
                return this.name;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsWaypoint
            @SerializedName("location")
            public double[] rawLocation() {
                return this.rawLocation;
            }

            public String toString() {
                return StubApp.getString2(12750) + this.unrecognized + StubApp.getString2(1065) + this.name + StubApp.getString2(12751) + Arrays.toString(this.rawLocation) + StubApp.getString2(6624) + this.distance + StubApp.getString2(265);
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, b> unrecognized() {
                return this.unrecognized;
            }
        };
    }
}
