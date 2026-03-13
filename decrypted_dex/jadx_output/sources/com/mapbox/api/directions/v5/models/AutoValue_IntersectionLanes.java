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
import com.mapbox.api.directions.v5.models.IntersectionLanes;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_IntersectionLanes extends C$AutoValue_IntersectionLanes {

    public static final class GsonTypeAdapter extends TypeAdapter<IntersectionLanes> {
        private volatile TypeAdapter<Boolean> boolean__adapter;
        private final Gson gson;
        private volatile TypeAdapter<IntersectionLaneAccess> intersectionLaneAccess_adapter;
        private volatile TypeAdapter<List<String>> list__string_adapter;
        private volatile TypeAdapter<String> string_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        public String toString() {
            return StubApp.getString2(13007);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public IntersectionLanes read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            IntersectionLanes.Builder builder = IntersectionLanes.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    nextName.getClass();
                    char c10 = 65535;
                    switch (nextName.hashCode()) {
                        case -1847017863:
                            if (nextName.equals(StubApp.getString2(13004))) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case -1423461020:
                            if (nextName.equals(StubApp.getString2(13003))) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 1096359295:
                            if (nextName.equals(StubApp.getString2(13002))) {
                                c10 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            TypeAdapter<List<String>> typeAdapter = this.list__string_adapter;
                            if (typeAdapter == null) {
                                typeAdapter = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                                this.list__string_adapter = typeAdapter;
                            }
                            builder.paymentMethods(typeAdapter.read2(jsonReader));
                            break;
                        case 1:
                            TypeAdapter<IntersectionLaneAccess> typeAdapter2 = this.intersectionLaneAccess_adapter;
                            if (typeAdapter2 == null) {
                                typeAdapter2 = this.gson.getAdapter(IntersectionLaneAccess.class);
                                this.intersectionLaneAccess_adapter = typeAdapter2;
                            }
                            builder.access(typeAdapter2.read2(jsonReader));
                            break;
                        case 2:
                            TypeAdapter<String> typeAdapter3 = this.string_adapter;
                            if (typeAdapter3 == null) {
                                typeAdapter3 = this.gson.getAdapter(String.class);
                                this.string_adapter = typeAdapter3;
                            }
                            builder.validIndication(typeAdapter3.read2(jsonReader));
                            break;
                        default:
                            if (!StubApp.getString2(13005).equals(nextName)) {
                                if (!StubApp.getString2(12365).equals(nextName)) {
                                    if (!StubApp.getString2(13006).equals(nextName)) {
                                        if (linkedHashMap == null) {
                                            linkedHashMap = new LinkedHashMap();
                                            builder.unrecognized(linkedHashMap);
                                        }
                                        a.t((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, nextName);
                                        break;
                                    } else {
                                        TypeAdapter<List<String>> typeAdapter4 = this.list__string_adapter;
                                        if (typeAdapter4 == null) {
                                            typeAdapter4 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                                            this.list__string_adapter = typeAdapter4;
                                        }
                                        builder.indications(typeAdapter4.read2(jsonReader));
                                        break;
                                    }
                                } else {
                                    TypeAdapter<Boolean> typeAdapter5 = this.boolean__adapter;
                                    if (typeAdapter5 == null) {
                                        typeAdapter5 = this.gson.getAdapter(Boolean.class);
                                        this.boolean__adapter = typeAdapter5;
                                    }
                                    builder.active(typeAdapter5.read2(jsonReader));
                                    break;
                                }
                            } else {
                                TypeAdapter<Boolean> typeAdapter6 = this.boolean__adapter;
                                if (typeAdapter6 == null) {
                                    typeAdapter6 = this.gson.getAdapter(Boolean.class);
                                    this.boolean__adapter = typeAdapter6;
                                }
                                builder.valid(typeAdapter6.read2(jsonReader));
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
        public void write(JsonWriter jsonWriter, IntersectionLanes intersectionLanes) throws IOException {
            if (intersectionLanes == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (intersectionLanes.unrecognized() != null) {
                for (Map.Entry<String, b> entry : intersectionLanes.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().f12374a;
                    a.s(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(StubApp.getString2(13005));
            if (intersectionLanes.valid() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter = this.boolean__adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, intersectionLanes.valid());
            }
            jsonWriter.name(StubApp.getString2(12365));
            if (intersectionLanes.active() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter2 = this.boolean__adapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, intersectionLanes.active());
            }
            jsonWriter.name(StubApp.getString2(13002));
            if (intersectionLanes.validIndication() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter3 = this.string_adapter;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, intersectionLanes.validIndication());
            }
            jsonWriter.name(StubApp.getString2(13006));
            if (intersectionLanes.indications() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<String>> typeAdapter4 = this.list__string_adapter;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.list__string_adapter = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, intersectionLanes.indications());
            }
            jsonWriter.name(StubApp.getString2(13004));
            if (intersectionLanes.paymentMethods() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<String>> typeAdapter5 = this.list__string_adapter;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.list__string_adapter = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, intersectionLanes.paymentMethods());
            }
            jsonWriter.name(StubApp.getString2(13003));
            if (intersectionLanes.access() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<IntersectionLaneAccess> typeAdapter6 = this.intersectionLaneAccess_adapter;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.gson.getAdapter(IntersectionLaneAccess.class);
                    this.intersectionLaneAccess_adapter = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, intersectionLanes.access());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_IntersectionLanes(final Map<String, b> map, final Boolean bool, final Boolean bool2, final String str, final List<String> list, final List<String> list2, final IntersectionLaneAccess intersectionLaneAccess) {
        new IntersectionLanes(map, bool, bool2, str, list, list2, intersectionLaneAccess) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_IntersectionLanes
            private final IntersectionLaneAccess access;
            private final Boolean active;
            private final List<String> indications;
            private final List<String> paymentMethods;
            private final Map<String, b> unrecognized;
            private final Boolean valid;
            private final String validIndication;

            /* renamed from: com.mapbox.api.directions.v5.models.$AutoValue_IntersectionLanes$Builder */
            public static class Builder extends IntersectionLanes.Builder {
                private IntersectionLaneAccess access;
                private Boolean active;
                private List<String> indications;
                private List<String> paymentMethods;
                private Map<String, b> unrecognized;
                private Boolean valid;
                private String validIndication;

                @Override // com.mapbox.api.directions.v5.models.IntersectionLanes.Builder
                public IntersectionLanes.Builder access(IntersectionLaneAccess intersectionLaneAccess) {
                    this.access = intersectionLaneAccess;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.IntersectionLanes.Builder
                public IntersectionLanes.Builder active(Boolean bool) {
                    this.active = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.IntersectionLanes.Builder
                public IntersectionLanes build() {
                    return new AutoValue_IntersectionLanes(this.unrecognized, this.valid, this.active, this.validIndication, this.indications, this.paymentMethods, this.access);
                }

                @Override // com.mapbox.api.directions.v5.models.IntersectionLanes.Builder
                public IntersectionLanes.Builder indications(List<String> list) {
                    this.indications = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.IntersectionLanes.Builder
                public IntersectionLanes.Builder paymentMethods(List<String> list) {
                    this.paymentMethods = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ IntersectionLanes.Builder unrecognized(Map map) {
                    return unrecognized2((Map<String, b>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.IntersectionLanes.Builder
                public IntersectionLanes.Builder valid(Boolean bool) {
                    this.valid = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.IntersectionLanes.Builder
                public IntersectionLanes.Builder validIndication(String str) {
                    this.validIndication = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                /* renamed from: unrecognized, reason: avoid collision after fix types in other method */
                public IntersectionLanes.Builder unrecognized2(Map<String, b> map) {
                    this.unrecognized = map;
                    return this;
                }
            }

            {
                this.unrecognized = map;
                this.valid = bool;
                this.active = bool2;
                this.validIndication = str;
                this.indications = list;
                this.paymentMethods = list2;
                this.access = intersectionLaneAccess;
            }

            @Override // com.mapbox.api.directions.v5.models.IntersectionLanes
            @SerializedName("access")
            public IntersectionLaneAccess access() {
                return this.access;
            }

            @Override // com.mapbox.api.directions.v5.models.IntersectionLanes
            public Boolean active() {
                return this.active;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof IntersectionLanes) {
                    IntersectionLanes intersectionLanes = (IntersectionLanes) obj;
                    Map<String, b> map2 = this.unrecognized;
                    if (map2 != null ? map2.equals(intersectionLanes.unrecognized()) : intersectionLanes.unrecognized() == null) {
                        Boolean bool3 = this.valid;
                        if (bool3 != null ? bool3.equals(intersectionLanes.valid()) : intersectionLanes.valid() == null) {
                            Boolean bool4 = this.active;
                            if (bool4 != null ? bool4.equals(intersectionLanes.active()) : intersectionLanes.active() == null) {
                                String str2 = this.validIndication;
                                if (str2 != null ? str2.equals(intersectionLanes.validIndication()) : intersectionLanes.validIndication() == null) {
                                    List<String> list3 = this.indications;
                                    if (list3 != null ? list3.equals(intersectionLanes.indications()) : intersectionLanes.indications() == null) {
                                        List<String> list4 = this.paymentMethods;
                                        if (list4 != null ? list4.equals(intersectionLanes.paymentMethods()) : intersectionLanes.paymentMethods() == null) {
                                            IntersectionLaneAccess intersectionLaneAccess2 = this.access;
                                            if (intersectionLaneAccess2 != null ? intersectionLaneAccess2.equals(intersectionLanes.access()) : intersectionLanes.access() == null) {
                                                return true;
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

            public int hashCode() {
                Map<String, b> map2 = this.unrecognized;
                int hashCode = ((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003;
                Boolean bool3 = this.valid;
                int hashCode2 = (hashCode ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
                Boolean bool4 = this.active;
                int hashCode3 = (hashCode2 ^ (bool4 == null ? 0 : bool4.hashCode())) * 1000003;
                String str2 = this.validIndication;
                int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                List<String> list3 = this.indications;
                int hashCode5 = (hashCode4 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                List<String> list4 = this.paymentMethods;
                int hashCode6 = (hashCode5 ^ (list4 == null ? 0 : list4.hashCode())) * 1000003;
                IntersectionLaneAccess intersectionLaneAccess2 = this.access;
                return hashCode6 ^ (intersectionLaneAccess2 != null ? intersectionLaneAccess2.hashCode() : 0);
            }

            @Override // com.mapbox.api.directions.v5.models.IntersectionLanes
            public List<String> indications() {
                return this.indications;
            }

            @Override // com.mapbox.api.directions.v5.models.IntersectionLanes
            @SerializedName("payment_methods")
            public List<String> paymentMethods() {
                return this.paymentMethods;
            }

            public String toString() {
                return StubApp.getString2(12759) + this.unrecognized + StubApp.getString2(12760) + this.valid + StubApp.getString2(12699) + this.active + StubApp.getString2(12761) + this.validIndication + StubApp.getString2(12762) + this.indications + StubApp.getString2(12763) + this.paymentMethods + StubApp.getString2(12764) + this.access + StubApp.getString2(265);
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, b> unrecognized() {
                return this.unrecognized;
            }

            @Override // com.mapbox.api.directions.v5.models.IntersectionLanes
            public Boolean valid() {
                return this.valid;
            }

            @Override // com.mapbox.api.directions.v5.models.IntersectionLanes
            @SerializedName("valid_indication")
            public String validIndication() {
                return this.validIndication;
            }
        };
    }
}
