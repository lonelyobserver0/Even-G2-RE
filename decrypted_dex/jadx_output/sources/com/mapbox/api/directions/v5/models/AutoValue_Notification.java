package com.mapbox.api.directions.v5.models;

import E1.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.Notification;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_Notification extends C$AutoValue_Notification {

    public static final class GsonTypeAdapter extends TypeAdapter<Notification> {
        private final Gson gson;
        private volatile TypeAdapter<Integer> integer_adapter;
        private volatile TypeAdapter<NotificationDetails> notificationDetails_adapter;
        private volatile TypeAdapter<String> string_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(13036);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public Notification read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            Notification.Builder builder = Notification.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    nextName.getClass();
                    char c10 = 65535;
                    switch (nextName.hashCode()) {
                        case -98470906:
                            if (nextName.equals(StubApp.getString2(13034))) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case -46184930:
                            if (nextName.equals(StubApp.getString2(13033))) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 805451368:
                            if (nextName.equals(StubApp.getString2(12968))) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 813692613:
                            if (nextName.equals(StubApp.getString2(13032))) {
                                c10 = 3;
                                break;
                            }
                            break;
                        case 1855571041:
                            if (nextName.equals(StubApp.getString2(12969))) {
                                c10 = 4;
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
                            builder.chargingStationId(typeAdapter.read2(jsonReader));
                            break;
                        case 1:
                            TypeAdapter<String> typeAdapter2 = this.string_adapter;
                            if (typeAdapter2 == null) {
                                typeAdapter2 = this.gson.getAdapter(String.class);
                                this.string_adapter = typeAdapter2;
                            }
                            builder.refreshType(typeAdapter2.read2(jsonReader));
                            break;
                        case 2:
                            TypeAdapter<Integer> typeAdapter3 = this.integer_adapter;
                            if (typeAdapter3 == null) {
                                typeAdapter3 = this.gson.getAdapter(Integer.class);
                                this.integer_adapter = typeAdapter3;
                            }
                            builder.geometryIndexStart(typeAdapter3.read2(jsonReader));
                            break;
                        case 3:
                            TypeAdapter<Integer> typeAdapter4 = this.integer_adapter;
                            if (typeAdapter4 == null) {
                                typeAdapter4 = this.gson.getAdapter(Integer.class);
                                this.integer_adapter = typeAdapter4;
                            }
                            builder.geometryIndex(typeAdapter4.read2(jsonReader));
                            break;
                        case 4:
                            TypeAdapter<Integer> typeAdapter5 = this.integer_adapter;
                            if (typeAdapter5 == null) {
                                typeAdapter5 = this.gson.getAdapter(Integer.class);
                                this.integer_adapter = typeAdapter5;
                            }
                            builder.geometryIndexEnd(typeAdapter5.read2(jsonReader));
                            break;
                        default:
                            if (!StubApp.getString2(660).equals(nextName)) {
                                if (!StubApp.getString2(5772).equals(nextName)) {
                                    if (!StubApp.getString2(13035).equals(nextName)) {
                                        if (!StubApp.getString2(532).equals(nextName)) {
                                            if (linkedHashMap == null) {
                                                linkedHashMap = new LinkedHashMap();
                                                builder.unrecognized(linkedHashMap);
                                            }
                                            a.t((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, nextName);
                                            break;
                                        } else {
                                            TypeAdapter<String> typeAdapter6 = this.string_adapter;
                                            if (typeAdapter6 == null) {
                                                typeAdapter6 = this.gson.getAdapter(String.class);
                                                this.string_adapter = typeAdapter6;
                                            }
                                            builder.reason(typeAdapter6.read2(jsonReader));
                                            break;
                                        }
                                    } else {
                                        TypeAdapter<NotificationDetails> typeAdapter7 = this.notificationDetails_adapter;
                                        if (typeAdapter7 == null) {
                                            typeAdapter7 = this.gson.getAdapter(NotificationDetails.class);
                                            this.notificationDetails_adapter = typeAdapter7;
                                        }
                                        builder.details(typeAdapter7.read2(jsonReader));
                                        break;
                                    }
                                } else {
                                    TypeAdapter<String> typeAdapter8 = this.string_adapter;
                                    if (typeAdapter8 == null) {
                                        typeAdapter8 = this.gson.getAdapter(String.class);
                                        this.string_adapter = typeAdapter8;
                                    }
                                    builder.subtype(typeAdapter8.read2(jsonReader));
                                    break;
                                }
                            } else {
                                TypeAdapter<String> typeAdapter9 = this.string_adapter;
                                if (typeAdapter9 == null) {
                                    typeAdapter9 = this.gson.getAdapter(String.class);
                                    this.string_adapter = typeAdapter9;
                                }
                                builder.type(typeAdapter9.read2(jsonReader));
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
        public void write(JsonWriter jsonWriter, Notification notification) throws IOException {
            if (notification == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (notification.unrecognized() != null) {
                for (Map.Entry<String, b> entry : notification.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(660));
            if (notification.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.string_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, notification.type());
            }
            jsonWriter.name(StubApp.getString2(13033));
            if (notification.refreshType() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter2 = this.string_adapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, notification.refreshType());
            }
            jsonWriter.name(StubApp.getString2(5772));
            if (notification.subtype() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter3 = this.string_adapter;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, notification.subtype());
            }
            jsonWriter.name(StubApp.getString2(12968));
            if (notification.geometryIndexStart() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter4 = this.integer_adapter;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, notification.geometryIndexStart());
            }
            jsonWriter.name(StubApp.getString2(13032));
            if (notification.geometryIndex() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter5 = this.integer_adapter;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, notification.geometryIndex());
            }
            jsonWriter.name(StubApp.getString2(12969));
            if (notification.geometryIndexEnd() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter6 = this.integer_adapter;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, notification.geometryIndexEnd());
            }
            jsonWriter.name(StubApp.getString2(13035));
            if (notification.details() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<NotificationDetails> typeAdapter7 = this.notificationDetails_adapter;
                if (typeAdapter7 == null) {
                    typeAdapter7 = this.gson.getAdapter(NotificationDetails.class);
                    this.notificationDetails_adapter = typeAdapter7;
                }
                typeAdapter7.write(jsonWriter, notification.details());
            }
            jsonWriter.name(StubApp.getString2(532));
            if (notification.reason() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter8 = this.string_adapter;
                if (typeAdapter8 == null) {
                    typeAdapter8 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter8;
                }
                typeAdapter8.write(jsonWriter, notification.reason());
            }
            jsonWriter.name(StubApp.getString2(13034));
            if (notification.chargingStationId() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter9 = this.string_adapter;
                if (typeAdapter9 == null) {
                    typeAdapter9 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter9;
                }
                typeAdapter9.write(jsonWriter, notification.chargingStationId());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_Notification(final Map<String, b> map, final String str, final String str2, final String str3, final Integer num, final Integer num2, final Integer num3, final NotificationDetails notificationDetails, final String str4, final String str5) {
        new Notification(map, str, str2, str3, num, num2, num3, notificationDetails, str4, str5) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_Notification
            private final String chargingStationId;
            private final NotificationDetails details;
            private final Integer geometryIndex;
            private final Integer geometryIndexEnd;
            private final Integer geometryIndexStart;
            private final String reason;
            private final String refreshType;
            private final String subtype;
            private final String type;
            private final Map<String, b> unrecognized;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_Notification$1, reason: invalid class name */
            public static /* synthetic */ class AnonymousClass1 {
            }

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_Notification$Builder */
            public static class Builder extends Notification.Builder {
                private String chargingStationId;
                private NotificationDetails details;
                private Integer geometryIndex;
                private Integer geometryIndexEnd;
                private Integer geometryIndexStart;
                private String reason;
                private String refreshType;
                private String subtype;
                private String type;
                private Map<String, b> unrecognized;

                public /* synthetic */ Builder(Notification notification, AnonymousClass1 anonymousClass1) {
                    this(notification);
                }

                @Override // com.mapbox.api.directions.v5.models.Notification.Builder
                public Notification build() {
                    String string2 = this.type == null ? StubApp.getString2(2256) : "";
                    if (this.refreshType == null) {
                        string2 = AbstractC1482f.g(string2, StubApp.getString2(12805));
                    }
                    if (string2.isEmpty()) {
                        return new AutoValue_Notification(this.unrecognized, this.type, this.refreshType, this.subtype, this.geometryIndexStart, this.geometryIndex, this.geometryIndexEnd, this.details, this.reason, this.chargingStationId);
                    }
                    throw new IllegalStateException(StubApp.getString2(555).concat(string2));
                }

                @Override // com.mapbox.api.directions.v5.models.Notification.Builder
                public Notification.Builder chargingStationId(String str) {
                    this.chargingStationId = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Notification.Builder
                public Notification.Builder details(NotificationDetails notificationDetails) {
                    this.details = notificationDetails;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Notification.Builder
                public Notification.Builder geometryIndex(Integer num) {
                    this.geometryIndex = num;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Notification.Builder
                public Notification.Builder geometryIndexEnd(Integer num) {
                    this.geometryIndexEnd = num;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Notification.Builder
                public Notification.Builder geometryIndexStart(Integer num) {
                    this.geometryIndexStart = num;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Notification.Builder
                public Notification.Builder reason(String str) {
                    this.reason = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Notification.Builder
                public Notification.Builder refreshType(String str) {
                    if (str == null) {
                        throw new NullPointerException(StubApp.getString2(12806));
                    }
                    this.refreshType = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Notification.Builder
                public Notification.Builder subtype(String str) {
                    this.subtype = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Notification.Builder
                public Notification.Builder type(String str) {
                    if (str == null) {
                        throw new NullPointerException(StubApp.getString2(2257));
                    }
                    this.type = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ Notification.Builder unrecognized(Map map) {
                    return unrecognized2((Map<String, b>) map);
                }

                public Builder() {
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                /* renamed from: unrecognized, reason: avoid collision after fix types in other method */
                public Notification.Builder unrecognized2(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }

                private Builder(Notification notification) {
                    this.unrecognized = notification.unrecognized();
                    this.type = notification.type();
                    this.refreshType = notification.refreshType();
                    this.subtype = notification.subtype();
                    this.geometryIndexStart = notification.geometryIndexStart();
                    this.geometryIndex = notification.geometryIndex();
                    this.geometryIndexEnd = notification.geometryIndexEnd();
                    this.details = notification.details();
                    this.reason = notification.reason();
                    this.chargingStationId = notification.chargingStationId();
                }
            }

            {
                this.unrecognized = map;
                if (str == null) {
                    throw new NullPointerException(StubApp.getString2(2257));
                }
                this.type = str;
                if (str2 == null) {
                    throw new NullPointerException(StubApp.getString2(12806));
                }
                this.refreshType = str2;
                this.subtype = str3;
                this.geometryIndexStart = num;
                this.geometryIndex = num2;
                this.geometryIndexEnd = num3;
                this.details = notificationDetails;
                this.reason = str4;
                this.chargingStationId = str5;
            }

            @Override // com.mapbox.api.directions.v5.models.Notification
            @SerializedName("station_id")
            public String chargingStationId() {
                return this.chargingStationId;
            }

            @Override // com.mapbox.api.directions.v5.models.Notification
            public NotificationDetails details() {
                return this.details;
            }

            public boolean equals(Object obj) {
                String str6;
                Integer num4;
                Integer num5;
                Integer num6;
                NotificationDetails notificationDetails2;
                String str7;
                String str8;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Notification) {
                    Notification notification = (Notification) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(notification.unrecognized()) : notification.unrecognized() == null) {
                        if (this.type.equals(notification.type()) && this.refreshType.equals(notification.refreshType()) && ((str6 = this.subtype) != null ? str6.equals(notification.subtype()) : notification.subtype() == null) && ((num4 = this.geometryIndexStart) != null ? num4.equals(notification.geometryIndexStart()) : notification.geometryIndexStart() == null) && ((num5 = this.geometryIndex) != null ? num5.equals(notification.geometryIndex()) : notification.geometryIndex() == null) && ((num6 = this.geometryIndexEnd) != null ? num6.equals(notification.geometryIndexEnd()) : notification.geometryIndexEnd() == null) && ((notificationDetails2 = this.details) != null ? notificationDetails2.equals(notification.details()) : notification.details() == null) && ((str7 = this.reason) != null ? str7.equals(notification.reason()) : notification.reason() == null) && ((str8 = this.chargingStationId) != null ? str8.equals(notification.chargingStationId()) : notification.chargingStationId() == null)) {
                            return true;
                        }
                    }
                }
                return false;
            }

            @Override // com.mapbox.api.directions.v5.models.Notification
            @SerializedName("geometry_index")
            public Integer geometryIndex() {
                return this.geometryIndex;
            }

            @Override // com.mapbox.api.directions.v5.models.Notification
            @SerializedName("geometry_index_end")
            public Integer geometryIndexEnd() {
                return this.geometryIndexEnd;
            }

            @Override // com.mapbox.api.directions.v5.models.Notification
            @SerializedName("geometry_index_start")
            public Integer geometryIndexStart() {
                return this.geometryIndexStart;
            }

            public int hashCode() {
                Map<String, b> map2 = this.unrecognized;
                int hashCode = ((((((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003) ^ this.type.hashCode()) * 1000003) ^ this.refreshType.hashCode()) * 1000003;
                String str6 = this.subtype;
                int hashCode2 = (hashCode ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                Integer num4 = this.geometryIndexStart;
                int hashCode3 = (hashCode2 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Integer num5 = this.geometryIndex;
                int hashCode4 = (hashCode3 ^ (num5 == null ? 0 : num5.hashCode())) * 1000003;
                Integer num6 = this.geometryIndexEnd;
                int hashCode5 = (hashCode4 ^ (num6 == null ? 0 : num6.hashCode())) * 1000003;
                NotificationDetails notificationDetails2 = this.details;
                int hashCode6 = (hashCode5 ^ (notificationDetails2 == null ? 0 : notificationDetails2.hashCode())) * 1000003;
                String str7 = this.reason;
                int hashCode7 = (hashCode6 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.chargingStationId;
                return hashCode7 ^ (str8 != null ? str8.hashCode() : 0);
            }

            @Override // com.mapbox.api.directions.v5.models.Notification
            public String reason() {
                return this.reason;
            }

            @Override // com.mapbox.api.directions.v5.models.Notification
            @SerializedName("refresh_type")
            public String refreshType() {
                return this.refreshType;
            }

            @Override // com.mapbox.api.directions.v5.models.Notification
            public String subtype() {
                return this.subtype;
            }

            @Override // com.mapbox.api.directions.v5.models.Notification
            public Notification.Builder toBuilder() {
                return new Builder(this, null);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(12807));
                sb2.append(this.unrecognized);
                sb2.append(StubApp.getString2(2148));
                sb2.append(this.type);
                sb2.append(StubApp.getString2(12808));
                sb2.append(this.refreshType);
                sb2.append(StubApp.getString2(12809));
                sb2.append(this.subtype);
                sb2.append(StubApp.getString2(12718));
                sb2.append(this.geometryIndexStart);
                sb2.append(StubApp.getString2(4994));
                sb2.append(this.geometryIndex);
                sb2.append(StubApp.getString2(12719));
                sb2.append(this.geometryIndexEnd);
                sb2.append(StubApp.getString2(12810));
                sb2.append(this.details);
                sb2.append(StubApp.getString2(5317));
                sb2.append(this.reason);
                sb2.append(StubApp.getString2(12811));
                return AbstractC1482f.k(sb2, this.chargingStationId, StubApp.getString2(265));
            }

            @Override // com.mapbox.api.directions.v5.models.Notification
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
