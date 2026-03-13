package com.mapbox.api.directions.v5.models;

import E1.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.VoiceInstructions;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_VoiceInstructions extends C$AutoValue_VoiceInstructions {

    public static final class GsonTypeAdapter extends TypeAdapter<VoiceInstructions> {
        private volatile TypeAdapter<Double> double__adapter;
        private final Gson gson;
        private volatile TypeAdapter<String> string_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(13135);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public VoiceInstructions read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            VoiceInstructions.Builder builder = VoiceInstructions.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.getClass();
                    if (StubApp.getString2(12955).equals(nextName)) {
                        TypeAdapter<Double> typeAdapter = this.double__adapter;
                        if (typeAdapter == null) {
                            typeAdapter = this.gson.getAdapter(Double.class);
                            this.double__adapter = typeAdapter;
                        }
                        builder.distanceAlongGeometry(typeAdapter.read2(jsonReader));
                    } else if (StubApp.getString2(1303).equals(nextName)) {
                        TypeAdapter<String> typeAdapter2 = this.string_adapter;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.gson.getAdapter(String.class);
                            this.string_adapter = typeAdapter2;
                        }
                        builder.announcement(typeAdapter2.read2(jsonReader));
                    } else if (StubApp.getString2(13134).equals(nextName)) {
                        TypeAdapter<String> typeAdapter3 = this.string_adapter;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.gson.getAdapter(String.class);
                            this.string_adapter = typeAdapter3;
                        }
                        builder.ssmlAnnouncement(typeAdapter3.read2(jsonReader));
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
        public void write(JsonWriter jsonWriter, VoiceInstructions voiceInstructions) throws IOException {
            if (voiceInstructions == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (voiceInstructions.unrecognized() != null) {
                for (Map.Entry<String, b> entry : voiceInstructions.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(12955));
            if (voiceInstructions.distanceAlongGeometry() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter = this.double__adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(Double.class);
                    this.double__adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, voiceInstructions.distanceAlongGeometry());
            }
            jsonWriter.name(StubApp.getString2(1303));
            if (voiceInstructions.announcement() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter2 = this.string_adapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, voiceInstructions.announcement());
            }
            jsonWriter.name(StubApp.getString2(13134));
            if (voiceInstructions.ssmlAnnouncement() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter3 = this.string_adapter;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, voiceInstructions.ssmlAnnouncement());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_VoiceInstructions(final Map<String, b> map, final Double d8, final String str, final String str2) {
        new VoiceInstructions(map, d8, str, str2) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_VoiceInstructions
            private final String announcement;
            private final Double distanceAlongGeometry;
            private final String ssmlAnnouncement;
            private final Map<String, b> unrecognized;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_VoiceInstructions$Builder */
            public static class Builder extends VoiceInstructions.Builder {
                private String announcement;
                private Double distanceAlongGeometry;
                private String ssmlAnnouncement;
                private Map<String, b> unrecognized;

                @Override // com.mapbox.api.directions.v5.models.VoiceInstructions.Builder
                public VoiceInstructions.Builder announcement(String str) {
                    this.announcement = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.VoiceInstructions.Builder
                public VoiceInstructions build() {
                    return new AutoValue_VoiceInstructions(this.unrecognized, this.distanceAlongGeometry, this.announcement, this.ssmlAnnouncement);
                }

                @Override // com.mapbox.api.directions.v5.models.VoiceInstructions.Builder
                public VoiceInstructions.Builder distanceAlongGeometry(Double d8) {
                    this.distanceAlongGeometry = d8;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.VoiceInstructions.Builder
                public VoiceInstructions.Builder ssmlAnnouncement(String str) {
                    this.ssmlAnnouncement = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ VoiceInstructions.Builder unrecognized(Map map) {
                    return unrecognized2((Map<String, b>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                /* renamed from: unrecognized, reason: avoid collision after fix types in other method */
                public VoiceInstructions.Builder unrecognized2(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }
            }

            {
                this.unrecognized = map;
                this.distanceAlongGeometry = d8;
                this.announcement = str;
                this.ssmlAnnouncement = str2;
            }

            @Override // com.mapbox.api.directions.v5.models.VoiceInstructions
            public String announcement() {
                return this.announcement;
            }

            @Override // com.mapbox.api.directions.v5.models.VoiceInstructions
            public Double distanceAlongGeometry() {
                return this.distanceAlongGeometry;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof VoiceInstructions) {
                    VoiceInstructions voiceInstructions = (VoiceInstructions) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(voiceInstructions.unrecognized()) : voiceInstructions.unrecognized() == null) {
                        Double d10 = this.distanceAlongGeometry;
                        if (d10 != null ? d10.equals(voiceInstructions.distanceAlongGeometry()) : voiceInstructions.distanceAlongGeometry() == null) {
                            String str3 = this.announcement;
                            if (str3 != null ? str3.equals(voiceInstructions.announcement()) : voiceInstructions.announcement() == null) {
                                String str4 = this.ssmlAnnouncement;
                                if (str4 != null ? str4.equals(voiceInstructions.ssmlAnnouncement()) : voiceInstructions.ssmlAnnouncement() == null) {
                                    return true;
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
                Double d10 = this.distanceAlongGeometry;
                int hashCode2 = (hashCode ^ (d10 == null ? 0 : d10.hashCode())) * 1000003;
                String str3 = this.announcement;
                int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.ssmlAnnouncement;
                return hashCode3 ^ (str4 != null ? str4.hashCode() : 0);
            }

            @Override // com.mapbox.api.directions.v5.models.VoiceInstructions
            public String ssmlAnnouncement() {
                return this.ssmlAnnouncement;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(12941));
                sb2.append(this.unrecognized);
                sb2.append(StubApp.getString2(12705));
                sb2.append(this.distanceAlongGeometry);
                sb2.append(StubApp.getString2(2191));
                sb2.append(this.announcement);
                sb2.append(StubApp.getString2(12942));
                return AbstractC1482f.k(sb2, this.ssmlAnnouncement, StubApp.getString2(265));
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, b> unrecognized() {
                return this.unrecognized;
            }
        };
    }
}
