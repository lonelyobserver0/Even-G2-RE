package com.mapbox.api.directions.v5.models;

import E1.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.NotificationDetails;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_NotificationDetails extends C$AutoValue_NotificationDetails {

    public static final class GsonTypeAdapter extends TypeAdapter<NotificationDetails> {
        private final Gson gson;
        private volatile TypeAdapter<String> string_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(13039);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public NotificationDetails read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            NotificationDetails.Builder builder = NotificationDetails.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.getClass();
                    if (nextName.equals(StubApp.getString2(13037))) {
                        TypeAdapter<String> typeAdapter = this.string_adapter;
                        if (typeAdapter == null) {
                            typeAdapter = this.gson.getAdapter(String.class);
                            this.string_adapter = typeAdapter;
                        }
                        builder.requestedValue(typeAdapter.read2(jsonReader));
                    } else if (nextName.equals(StubApp.getString2(13038))) {
                        TypeAdapter<String> typeAdapter2 = this.string_adapter;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.gson.getAdapter(String.class);
                            this.string_adapter = typeAdapter2;
                        }
                        builder.actualValue(typeAdapter2.read2(jsonReader));
                    } else if (StubApp.getString2(13028).equals(nextName)) {
                        TypeAdapter<String> typeAdapter3 = this.string_adapter;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.gson.getAdapter(String.class);
                            this.string_adapter = typeAdapter3;
                        }
                        builder.unit(typeAdapter3.read2(jsonReader));
                    } else if (StubApp.getString2(1905).equals(nextName)) {
                        TypeAdapter<String> typeAdapter4 = this.string_adapter;
                        if (typeAdapter4 == null) {
                            typeAdapter4 = this.gson.getAdapter(String.class);
                            this.string_adapter = typeAdapter4;
                        }
                        builder.message(typeAdapter4.read2(jsonReader));
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
        public void write(JsonWriter jsonWriter, NotificationDetails notificationDetails) throws IOException {
            if (notificationDetails == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (notificationDetails.unrecognized() != null) {
                for (Map.Entry<String, b> entry : notificationDetails.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(13037));
            if (notificationDetails.requestedValue() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.string_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, notificationDetails.requestedValue());
            }
            jsonWriter.name(StubApp.getString2(13038));
            if (notificationDetails.actualValue() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter2 = this.string_adapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, notificationDetails.actualValue());
            }
            jsonWriter.name(StubApp.getString2(13028));
            if (notificationDetails.unit() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter3 = this.string_adapter;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, notificationDetails.unit());
            }
            jsonWriter.name(StubApp.getString2(1905));
            if (notificationDetails.message() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter4 = this.string_adapter;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, notificationDetails.message());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_NotificationDetails(final Map<String, b> map, final String str, final String str2, final String str3, final String str4) {
        new NotificationDetails(map, str, str2, str3, str4) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_NotificationDetails
            private final String actualValue;
            private final String message;
            private final String requestedValue;
            private final String unit;
            private final Map<String, b> unrecognized;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_NotificationDetails$Builder */
            public static class Builder extends NotificationDetails.Builder {
                private String actualValue;
                private String message;
                private String requestedValue;
                private String unit;
                private Map<String, b> unrecognized;

                @Override // com.mapbox.api.directions.v5.models.NotificationDetails.Builder
                public NotificationDetails.Builder actualValue(String str) {
                    this.actualValue = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.NotificationDetails.Builder
                public NotificationDetails build() {
                    return new AutoValue_NotificationDetails(this.unrecognized, this.requestedValue, this.actualValue, this.unit, this.message);
                }

                @Override // com.mapbox.api.directions.v5.models.NotificationDetails.Builder
                public NotificationDetails.Builder message(String str) {
                    this.message = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.NotificationDetails.Builder
                public NotificationDetails.Builder requestedValue(String str) {
                    this.requestedValue = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.NotificationDetails.Builder
                public NotificationDetails.Builder unit(String str) {
                    this.unit = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ NotificationDetails.Builder unrecognized(Map map) {
                    return unrecognized2((Map<String, b>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                /* renamed from: unrecognized, reason: avoid collision after fix types in other method */
                public NotificationDetails.Builder unrecognized2(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }
            }

            {
                this.unrecognized = map;
                this.requestedValue = str;
                this.actualValue = str2;
                this.unit = str3;
                this.message = str4;
            }

            @Override // com.mapbox.api.directions.v5.models.NotificationDetails
            @SerializedName("actual_value")
            public String actualValue() {
                return this.actualValue;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof NotificationDetails) {
                    NotificationDetails notificationDetails = (NotificationDetails) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(notificationDetails.unrecognized()) : notificationDetails.unrecognized() == null) {
                        String str5 = this.requestedValue;
                        if (str5 != null ? str5.equals(notificationDetails.requestedValue()) : notificationDetails.requestedValue() == null) {
                            String str6 = this.actualValue;
                            if (str6 != null ? str6.equals(notificationDetails.actualValue()) : notificationDetails.actualValue() == null) {
                                String str7 = this.unit;
                                if (str7 != null ? str7.equals(notificationDetails.unit()) : notificationDetails.unit() == null) {
                                    String str8 = this.message;
                                    if (str8 != null ? str8.equals(notificationDetails.message()) : notificationDetails.message() == null) {
                                        return true;
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
                String str5 = this.requestedValue;
                int hashCode2 = (hashCode ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.actualValue;
                int hashCode3 = (hashCode2 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.unit;
                int hashCode4 = (hashCode3 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.message;
                return hashCode4 ^ (str8 != null ? str8.hashCode() : 0);
            }

            @Override // com.mapbox.api.directions.v5.models.NotificationDetails
            public String message() {
                return this.message;
            }

            @Override // com.mapbox.api.directions.v5.models.NotificationDetails
            @SerializedName("requested_value")
            public String requestedValue() {
                return this.requestedValue;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(12812));
                sb2.append(this.unrecognized);
                sb2.append(StubApp.getString2(12813));
                sb2.append(this.requestedValue);
                sb2.append(StubApp.getString2(12814));
                sb2.append(this.actualValue);
                sb2.append(StubApp.getString2(3781));
                sb2.append(this.unit);
                sb2.append(StubApp.getString2(2061));
                return AbstractC1482f.k(sb2, this.message, StubApp.getString2(265));
            }

            @Override // com.mapbox.api.directions.v5.models.NotificationDetails
            public String unit() {
                return this.unit;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, b> unrecognized() {
                return this.unrecognized;
            }
        };
    }
}
