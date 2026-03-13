package com.mapbox.api.directions.v5.models;

import E1.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.SilentWaypoint;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_SilentWaypoint extends C$AutoValue_SilentWaypoint {

    public static final class GsonTypeAdapter extends TypeAdapter<SilentWaypoint> {
        private volatile TypeAdapter<Double> double__adapter;
        private final Gson gson;
        private volatile TypeAdapter<Integer> int__adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(13102);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public SilentWaypoint read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            SilentWaypoint.Builder builder = SilentWaypoint.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    nextName.getClass();
                    char c10 = 65535;
                    switch (nextName.hashCode()) {
                        case -1645705705:
                            if (nextName.equals(StubApp.getString2(13101))) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 601411348:
                            if (nextName.equals(StubApp.getString2(2258))) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 813692613:
                            if (nextName.equals(StubApp.getString2(13032))) {
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
                            builder.distanceFromStart(typeAdapter.read2(jsonReader).doubleValue());
                            break;
                        case 1:
                            TypeAdapter<Integer> typeAdapter2 = this.int__adapter;
                            if (typeAdapter2 == null) {
                                typeAdapter2 = this.gson.getAdapter(Integer.class);
                                this.int__adapter = typeAdapter2;
                            }
                            builder.waypointIndex(typeAdapter2.read2(jsonReader).intValue());
                            break;
                        case 2:
                            TypeAdapter<Integer> typeAdapter3 = this.int__adapter;
                            if (typeAdapter3 == null) {
                                typeAdapter3 = this.gson.getAdapter(Integer.class);
                                this.int__adapter = typeAdapter3;
                            }
                            builder.geometryIndex(typeAdapter3.read2(jsonReader).intValue());
                            break;
                        default:
                            if (linkedHashMap == null) {
                                linkedHashMap = new LinkedHashMap();
                                builder.unrecognized(linkedHashMap);
                            }
                            a.t((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, nextName);
                            break;
                    }
                } else {
                    jsonReader.nextNull();
                }
            }
            jsonReader.endObject();
            return builder.build();
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, SilentWaypoint silentWaypoint) throws IOException {
            if (silentWaypoint == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (silentWaypoint.unrecognized() != null) {
                for (Map.Entry<String, b> entry : silentWaypoint.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(2258));
            TypeAdapter<Integer> typeAdapter = this.int__adapter;
            if (typeAdapter == null) {
                typeAdapter = this.gson.getAdapter(Integer.class);
                this.int__adapter = typeAdapter;
            }
            typeAdapter.write(jsonWriter, Integer.valueOf(silentWaypoint.waypointIndex()));
            jsonWriter.name(StubApp.getString2(13101));
            TypeAdapter<Double> typeAdapter2 = this.double__adapter;
            if (typeAdapter2 == null) {
                typeAdapter2 = this.gson.getAdapter(Double.class);
                this.double__adapter = typeAdapter2;
            }
            typeAdapter2.write(jsonWriter, Double.valueOf(silentWaypoint.distanceFromStart()));
            jsonWriter.name(StubApp.getString2(13032));
            TypeAdapter<Integer> typeAdapter3 = this.int__adapter;
            if (typeAdapter3 == null) {
                typeAdapter3 = this.gson.getAdapter(Integer.class);
                this.int__adapter = typeAdapter3;
            }
            typeAdapter3.write(jsonWriter, Integer.valueOf(silentWaypoint.geometryIndex()));
            jsonWriter.endObject();
        }
    }

    public AutoValue_SilentWaypoint(final Map<String, b> map, final int i3, final double d8, final int i10) {
        new SilentWaypoint(map, i3, d8, i10) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_SilentWaypoint
            private final double distanceFromStart;
            private final int geometryIndex;
            private final Map<String, b> unrecognized;
            private final int waypointIndex;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_SilentWaypoint$Builder */
            public static class Builder extends SilentWaypoint.Builder {
                private Double distanceFromStart;
                private Integer geometryIndex;
                private Map<String, b> unrecognized;
                private Integer waypointIndex;

                @Override // com.mapbox.api.directions.v5.models.SilentWaypoint.Builder
                public SilentWaypoint build() {
                    String string2 = this.waypointIndex == null ? StubApp.getString2(2260) : "";
                    if (this.distanceFromStart == null) {
                        string2 = AbstractC1482f.g(string2, StubApp.getString2(12905));
                    }
                    if (this.geometryIndex == null) {
                        string2 = AbstractC1482f.g(string2, StubApp.getString2(12906));
                    }
                    if (string2.isEmpty()) {
                        return new AutoValue_SilentWaypoint(this.unrecognized, this.waypointIndex.intValue(), this.distanceFromStart.doubleValue(), this.geometryIndex.intValue());
                    }
                    throw new IllegalStateException(StubApp.getString2(555).concat(string2));
                }

                @Override // com.mapbox.api.directions.v5.models.SilentWaypoint.Builder
                public SilentWaypoint.Builder distanceFromStart(double d8) {
                    this.distanceFromStart = Double.valueOf(d8);
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.SilentWaypoint.Builder
                public SilentWaypoint.Builder geometryIndex(int i3) {
                    this.geometryIndex = Integer.valueOf(i3);
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ SilentWaypoint.Builder unrecognized(Map map) {
                    return unrecognized2((Map<String, b>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.SilentWaypoint.Builder
                public SilentWaypoint.Builder waypointIndex(int i3) {
                    this.waypointIndex = Integer.valueOf(i3);
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                /* renamed from: unrecognized, reason: avoid collision after fix types in other method */
                public SilentWaypoint.Builder unrecognized2(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }
            }

            {
                this.unrecognized = map;
                this.waypointIndex = i3;
                this.distanceFromStart = d8;
                this.geometryIndex = i10;
            }

            @Override // com.mapbox.api.directions.v5.models.SilentWaypoint
            @SerializedName("distance_from_start")
            public double distanceFromStart() {
                return this.distanceFromStart;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof SilentWaypoint) {
                    SilentWaypoint silentWaypoint = (SilentWaypoint) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(silentWaypoint.unrecognized()) : silentWaypoint.unrecognized() == null) {
                        if (this.waypointIndex == silentWaypoint.waypointIndex() && Double.doubleToLongBits(this.distanceFromStart) == Double.doubleToLongBits(silentWaypoint.distanceFromStart()) && this.geometryIndex == silentWaypoint.geometryIndex()) {
                            return true;
                        }
                    }
                }
                return false;
            }

            @Override // com.mapbox.api.directions.v5.models.SilentWaypoint
            @SerializedName("geometry_index")
            public int geometryIndex() {
                return this.geometryIndex;
            }

            public int hashCode() {
                Map<String, b> map2 = this.unrecognized;
                return (((((((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003) ^ this.waypointIndex) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.distanceFromStart) >>> 32) ^ Double.doubleToLongBits(this.distanceFromStart)))) * 1000003) ^ this.geometryIndex;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(12907));
                sb2.append(this.unrecognized);
                sb2.append(StubApp.getString2(12908));
                sb2.append(this.waypointIndex);
                sb2.append(StubApp.getString2(12909));
                sb2.append(this.distanceFromStart);
                sb2.append(StubApp.getString2(4994));
                return AbstractC1482f.f(this.geometryIndex, StubApp.getString2(265), sb2);
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, b> unrecognized() {
                return this.unrecognized;
            }

            @Override // com.mapbox.api.directions.v5.models.SilentWaypoint
            @SerializedName("waypoint_index")
            public int waypointIndex() {
                return this.waypointIndex;
            }
        };
    }
}
