package F6;

import G6.h;
import G6.k;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.stub.StubApp;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends TypeAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2247a;

    /* renamed from: b, reason: collision with root package name */
    public volatile TypeAdapter f2248b;

    /* renamed from: c, reason: collision with root package name */
    public final Gson f2249c;

    public /* synthetic */ c(Gson gson, int i3) {
        this.f2247a = i3;
        this.f2249c = gson;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final Object read2(JsonReader jsonReader) {
        char c10;
        char c11;
        String string2 = StubApp.getString2(2063);
        String string22 = StubApp.getString2(ModuleDescriptor.MODULE_VERSION);
        String string23 = StubApp.getString2(2064);
        LinkedHashMap linkedHashMap = null;
        List list = null;
        String str = null;
        List list2 = null;
        LinkedHashMap linkedHashMap2 = null;
        LinkedHashMap linkedHashMap3 = null;
        LinkedHashMap linkedHashMap4 = null;
        List list3 = null;
        switch (this.f2247a) {
            case 0:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                LinkedHashMap linkedHashMap5 = null;
                List list4 = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                    } else {
                        nextName.getClass();
                        if (StubApp.getString2(2075).equals(nextName)) {
                            TypeAdapter typeAdapter = this.f2248b;
                            if (typeAdapter == null) {
                                typeAdapter = this.f2249c.getAdapter(TypeToken.getParameterized(List.class, f.class));
                                this.f2248b = typeAdapter;
                            }
                            list4 = (List) typeAdapter.read2(jsonReader);
                        } else {
                            if (linkedHashMap == null) {
                                linkedHashMap5 = new LinkedHashMap();
                                linkedHashMap = linkedHashMap5;
                            }
                            E1.a.t((JsonElement) this.f2249c.fromJson(jsonReader, JsonElement.class), linkedHashMap, nextName);
                        }
                    }
                }
                jsonReader.endObject();
                return new d(linkedHashMap5, list4);
            case 1:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                    } else {
                        nextName2.getClass();
                        if (nextName2.equals(StubApp.getString2(2074))) {
                            TypeAdapter typeAdapter2 = this.f2248b;
                            if (typeAdapter2 == null) {
                                typeAdapter2 = this.f2249c.getAdapter(TypeToken.getParameterized(List.class, k.class));
                                this.f2248b = typeAdapter2;
                            }
                            list3 = (List) typeAdapter2.read2(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                }
                jsonReader.endObject();
                return new G6.a(list3);
            case 2:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                LinkedHashMap linkedHashMap6 = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                while (jsonReader.hasNext()) {
                    String nextName3 = jsonReader.nextName();
                    if (jsonReader.peek() != JsonToken.NULL) {
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case 3373707:
                                if (nextName3.equals(string22)) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 421241332:
                                if (nextName3.equals(string23)) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1082748231:
                                if (nextName3.equals(StubApp.getString2(2073))) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1337871467:
                                if (nextName3.equals(string2)) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
                            case 0:
                                TypeAdapter typeAdapter3 = this.f2248b;
                                if (typeAdapter3 == null) {
                                    typeAdapter3 = this.f2249c.getAdapter(String.class);
                                    this.f2248b = typeAdapter3;
                                }
                                str3 = (String) typeAdapter3.read2(jsonReader);
                                break;
                            case 1:
                                TypeAdapter typeAdapter4 = this.f2248b;
                                if (typeAdapter4 == null) {
                                    typeAdapter4 = this.f2249c.getAdapter(String.class);
                                    this.f2248b = typeAdapter4;
                                }
                                str4 = (String) typeAdapter4.read2(jsonReader);
                                break;
                            case 2:
                                TypeAdapter typeAdapter5 = this.f2248b;
                                if (typeAdapter5 == null) {
                                    typeAdapter5 = this.f2249c.getAdapter(String.class);
                                    this.f2248b = typeAdapter5;
                                }
                                str5 = (String) typeAdapter5.read2(jsonReader);
                                break;
                            case 3:
                                TypeAdapter typeAdapter6 = this.f2248b;
                                if (typeAdapter6 == null) {
                                    typeAdapter6 = this.f2249c.getAdapter(String.class);
                                    this.f2248b = typeAdapter6;
                                }
                                str2 = (String) typeAdapter6.read2(jsonReader);
                                break;
                            default:
                                if (linkedHashMap4 == null) {
                                    linkedHashMap4 = new LinkedHashMap();
                                    linkedHashMap6 = linkedHashMap4;
                                }
                                E1.a.t((JsonElement) this.f2249c.fromJson(jsonReader, JsonElement.class), linkedHashMap4, nextName3);
                                break;
                        }
                    } else {
                        jsonReader.nextNull();
                    }
                }
                jsonReader.endObject();
                return new G6.c(linkedHashMap6, str2, str3, str4, str5);
            case 3:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                LinkedHashMap linkedHashMap7 = null;
                String str6 = null;
                String str7 = null;
                while (jsonReader.hasNext()) {
                    String nextName4 = jsonReader.nextName();
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                    } else {
                        nextName4.getClass();
                        if (nextName4.equals(string22)) {
                            TypeAdapter typeAdapter7 = this.f2248b;
                            if (typeAdapter7 == null) {
                                typeAdapter7 = this.f2249c.getAdapter(String.class);
                                this.f2248b = typeAdapter7;
                            }
                            str7 = (String) typeAdapter7.read2(jsonReader);
                        } else if (nextName4.equals(string2)) {
                            TypeAdapter typeAdapter8 = this.f2248b;
                            if (typeAdapter8 == null) {
                                typeAdapter8 = this.f2249c.getAdapter(String.class);
                                this.f2248b = typeAdapter8;
                            }
                            str6 = (String) typeAdapter8.read2(jsonReader);
                        } else {
                            if (linkedHashMap3 == null) {
                                linkedHashMap7 = new LinkedHashMap();
                                linkedHashMap3 = linkedHashMap7;
                            }
                            E1.a.t((JsonElement) this.f2249c.fromJson(jsonReader, JsonElement.class), linkedHashMap3, nextName4);
                        }
                    }
                }
                jsonReader.endObject();
                return new G6.d(linkedHashMap7, str6, str7);
            case 4:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                LinkedHashMap linkedHashMap8 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                while (jsonReader.hasNext()) {
                    String nextName5 = jsonReader.nextName();
                    if (jsonReader.peek() != JsonToken.NULL) {
                        nextName5.getClass();
                        switch (nextName5.hashCode()) {
                            case -934795532:
                                if (nextName5.equals(StubApp.getString2(2051))) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -891990013:
                                if (nextName5.equals(StubApp.getString2(2050))) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 106748167:
                                if (nextName5.equals(StubApp.getString2(2049))) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 421241332:
                                if (nextName5.equals(string23)) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 757462669:
                                if (nextName5.equals(StubApp.getString2(2047))) {
                                    c11 = 4;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 829251210:
                                if (nextName5.equals(StubApp.getString2(2072))) {
                                    c11 = 5;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 957831062:
                                if (nextName5.equals(StubApp.getString2(223))) {
                                    c11 = 6;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1900805475:
                                if (nextName5.equals(StubApp.getString2(2071))) {
                                    c11 = 7;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        switch (c11) {
                            case 0:
                                TypeAdapter typeAdapter9 = this.f2248b;
                                if (typeAdapter9 == null) {
                                    typeAdapter9 = this.f2249c.getAdapter(String.class);
                                    this.f2248b = typeAdapter9;
                                }
                                str13 = (String) typeAdapter9.read2(jsonReader);
                                break;
                            case 1:
                                TypeAdapter typeAdapter10 = this.f2248b;
                                if (typeAdapter10 == null) {
                                    typeAdapter10 = this.f2249c.getAdapter(String.class);
                                    this.f2248b = typeAdapter10;
                                }
                                str9 = (String) typeAdapter10.read2(jsonReader);
                                break;
                            case 2:
                                TypeAdapter typeAdapter11 = this.f2248b;
                                if (typeAdapter11 == null) {
                                    typeAdapter11 = this.f2249c.getAdapter(String.class);
                                    this.f2248b = typeAdapter11;
                                }
                                str11 = (String) typeAdapter11.read2(jsonReader);
                                break;
                            case 3:
                                TypeAdapter typeAdapter12 = this.f2248b;
                                if (typeAdapter12 == null) {
                                    typeAdapter12 = this.f2249c.getAdapter(String.class);
                                    this.f2248b = typeAdapter12;
                                }
                                str8 = (String) typeAdapter12.read2(jsonReader);
                                break;
                            case 4:
                                TypeAdapter typeAdapter13 = this.f2248b;
                                if (typeAdapter13 == null) {
                                    typeAdapter13 = this.f2249c.getAdapter(String.class);
                                    this.f2248b = typeAdapter13;
                                }
                                str12 = (String) typeAdapter13.read2(jsonReader);
                                break;
                            case 5:
                                TypeAdapter typeAdapter14 = this.f2248b;
                                if (typeAdapter14 == null) {
                                    typeAdapter14 = this.f2249c.getAdapter(String.class);
                                    this.f2248b = typeAdapter14;
                                }
                                str15 = (String) typeAdapter14.read2(jsonReader);
                                break;
                            case 6:
                                TypeAdapter typeAdapter15 = this.f2248b;
                                if (typeAdapter15 == null) {
                                    typeAdapter15 = this.f2249c.getAdapter(String.class);
                                    this.f2248b = typeAdapter15;
                                }
                                str14 = (String) typeAdapter15.read2(jsonReader);
                                break;
                            case 7:
                                TypeAdapter typeAdapter16 = this.f2248b;
                                if (typeAdapter16 == null) {
                                    typeAdapter16 = this.f2249c.getAdapter(String.class);
                                    this.f2248b = typeAdapter16;
                                }
                                str10 = (String) typeAdapter16.read2(jsonReader);
                                break;
                            default:
                                if (linkedHashMap2 == null) {
                                    linkedHashMap2 = new LinkedHashMap();
                                    linkedHashMap8 = linkedHashMap2;
                                }
                                E1.a.t((JsonElement) this.f2249c.fromJson(jsonReader, JsonElement.class), linkedHashMap2, nextName5);
                                break;
                        }
                    } else {
                        jsonReader.nextNull();
                    }
                }
                jsonReader.endObject();
                return new h(linkedHashMap8, str8, str9, str10, str11, str12, str13, str14, str15);
            case 5:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                while (jsonReader.hasNext()) {
                    String nextName6 = jsonReader.nextName();
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                    } else {
                        nextName6.getClass();
                        if (nextName6.equals(StubApp.getString2(2067))) {
                            TypeAdapter typeAdapter17 = this.f2248b;
                            if (typeAdapter17 == null) {
                                typeAdapter17 = this.f2249c.getAdapter(String.class);
                                this.f2248b = typeAdapter17;
                            }
                            str18 = (String) typeAdapter17.read2(jsonReader);
                        } else if (StubApp.getString2(290).equals(nextName6)) {
                            TypeAdapter typeAdapter18 = this.f2248b;
                            if (typeAdapter18 == null) {
                                typeAdapter18 = this.f2249c.getAdapter(String.class);
                                this.f2248b = typeAdapter18;
                            }
                            str16 = (String) typeAdapter18.read2(jsonReader);
                        } else if (StubApp.getString2(613).equals(nextName6)) {
                            TypeAdapter typeAdapter19 = this.f2248b;
                            if (typeAdapter19 == null) {
                                typeAdapter19 = this.f2249c.getAdapter(String.class);
                                this.f2248b = typeAdapter19;
                            }
                            str17 = (String) typeAdapter19.read2(jsonReader);
                        } else if (StubApp.getString2(2068).equals(nextName6)) {
                            TypeAdapter typeAdapter20 = this.f2248b;
                            if (typeAdapter20 == null) {
                                typeAdapter20 = this.f2249c.getAdapter(String.class);
                                this.f2248b = typeAdapter20;
                            }
                            str19 = (String) typeAdapter20.read2(jsonReader);
                        } else if (StubApp.getString2(2069).equals(nextName6)) {
                            TypeAdapter typeAdapter21 = this.f2248b;
                            if (typeAdapter21 == null) {
                                typeAdapter21 = this.f2249c.getAdapter(String.class);
                                this.f2248b = typeAdapter21;
                            }
                            str20 = (String) typeAdapter21.read2(jsonReader);
                        } else if (StubApp.getString2(2070).equals(nextName6)) {
                            TypeAdapter typeAdapter22 = this.f2248b;
                            if (typeAdapter22 == null) {
                                typeAdapter22 = this.f2249c.getAdapter(String.class);
                                this.f2248b = typeAdapter22;
                            }
                            str21 = (String) typeAdapter22.read2(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                }
                jsonReader.endObject();
                return new com.mapbox.api.geocoding.v5.models.a(str16, str17, str18, str19, str20, str21);
            case 6:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName7 = jsonReader.nextName();
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                    } else {
                        nextName7.getClass();
                        if (nextName7.equals(StubApp.getString2(2066))) {
                            TypeAdapter typeAdapter23 = this.f2248b;
                            if (typeAdapter23 == null) {
                                typeAdapter23 = this.f2249c.getAdapter(TypeToken.getParameterized(List.class, com.mapbox.api.geocoding.v5.models.e.class));
                                this.f2248b = typeAdapter23;
                            }
                            list2 = (List) typeAdapter23.read2(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                }
                jsonReader.endObject();
                return new com.mapbox.api.geocoding.v5.models.f(list2);
            case 7:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                String str22 = null;
                while (jsonReader.hasNext()) {
                    String nextName8 = jsonReader.nextName();
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                    } else {
                        nextName8.getClass();
                        if (StubApp.getString2(1052).equals(nextName8)) {
                            TypeAdapter typeAdapter24 = this.f2248b;
                            if (typeAdapter24 == null) {
                                typeAdapter24 = this.f2249c.getAdapter(String.class);
                                this.f2248b = typeAdapter24;
                            }
                            str = (String) typeAdapter24.read2(jsonReader);
                        } else if (StubApp.getString2(1905).equals(nextName8)) {
                            TypeAdapter typeAdapter25 = this.f2248b;
                            if (typeAdapter25 == null) {
                                typeAdapter25 = this.f2249c.getAdapter(String.class);
                                this.f2248b = typeAdapter25;
                            }
                            str22 = (String) typeAdapter25.read2(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                }
                jsonReader.endObject();
                return new com.mapbox.api.matching.v5.models.a(str, str22);
            default:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName9 = jsonReader.nextName();
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                    } else {
                        nextName9.getClass();
                        if (StubApp.getString2(2065).equals(nextName9)) {
                            TypeAdapter typeAdapter26 = this.f2248b;
                            if (typeAdapter26 == null) {
                                typeAdapter26 = this.f2249c.getAdapter(TypeToken.getParameterized(List.class, String.class));
                                this.f2248b = typeAdapter26;
                            }
                            list = (List) typeAdapter26.read2(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                }
                jsonReader.endObject();
                return new com.mapbox.api.routetiles.v1.versions.models.a(list);
        }
    }

    public final String toString() {
        switch (this.f2247a) {
            case 0:
                return StubApp.getString2(2084);
            case 1:
                return StubApp.getString2(2083);
            case 2:
                return StubApp.getString2(2082);
            case 3:
                return StubApp.getString2(2081);
            case 4:
                return StubApp.getString2(2080);
            case 5:
                return StubApp.getString2(2079);
            case 6:
                return StubApp.getString2(2078);
            case 7:
                return StubApp.getString2(2077);
            default:
                return StubApp.getString2(2076);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) {
        String string2 = StubApp.getString2(ModuleDescriptor.MODULE_VERSION);
        String string22 = StubApp.getString2(2063);
        String string23 = StubApp.getString2(2064);
        switch (this.f2247a) {
            case 0:
                d dVar = (d) obj;
                if (dVar == null) {
                    jsonWriter.nullValue();
                    break;
                } else {
                    jsonWriter.beginObject();
                    HashMap hashMap = dVar.f2250a;
                    if (hashMap != null) {
                        for (Map.Entry entry : hashMap.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            JsonElement jsonElement = ((com.mapbox.auto.value.gson.b) entry.getValue()).f12374a;
                            E1.a.s(jsonElement, this.f2249c, jsonWriter, jsonElement);
                        }
                    }
                    jsonWriter.name(StubApp.getString2(2075));
                    if (dVar.f2251b == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter = this.f2248b;
                        if (typeAdapter == null) {
                            typeAdapter = this.f2249c.getAdapter(TypeToken.getParameterized(List.class, f.class));
                            this.f2248b = typeAdapter;
                        }
                        typeAdapter.write(jsonWriter, dVar.f2251b);
                    }
                    jsonWriter.endObject();
                    break;
                }
            case 1:
                G6.a aVar = (G6.a) obj;
                if (aVar == null) {
                    jsonWriter.nullValue();
                    break;
                } else {
                    jsonWriter.beginObject();
                    jsonWriter.name(StubApp.getString2(2074));
                    if (aVar.f2388a == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter2 = this.f2248b;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.f2249c.getAdapter(TypeToken.getParameterized(List.class, k.class));
                            this.f2248b = typeAdapter2;
                        }
                        typeAdapter2.write(jsonWriter, aVar.f2388a);
                    }
                    jsonWriter.endObject();
                    break;
                }
            case 2:
                G6.c cVar = (G6.c) obj;
                if (cVar == null) {
                    jsonWriter.nullValue();
                    break;
                } else {
                    jsonWriter.beginObject();
                    LinkedHashMap linkedHashMap = cVar.f2397a;
                    if (linkedHashMap != null) {
                        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                            jsonWriter.name((String) entry2.getKey());
                            JsonElement jsonElement2 = ((com.mapbox.auto.value.gson.b) entry2.getValue()).f12374a;
                            E1.a.s(jsonElement2, this.f2249c, jsonWriter, jsonElement2);
                        }
                    }
                    jsonWriter.name(string22);
                    if (cVar.f2398b == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter3 = this.f2248b;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.f2249c.getAdapter(String.class);
                            this.f2248b = typeAdapter3;
                        }
                        typeAdapter3.write(jsonWriter, cVar.f2398b);
                    }
                    jsonWriter.name(string2);
                    if (cVar.f2399c == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter4 = this.f2248b;
                        if (typeAdapter4 == null) {
                            typeAdapter4 = this.f2249c.getAdapter(String.class);
                            this.f2248b = typeAdapter4;
                        }
                        typeAdapter4.write(jsonWriter, cVar.f2399c);
                    }
                    jsonWriter.name(string23);
                    if (cVar.f2400d == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter5 = this.f2248b;
                        if (typeAdapter5 == null) {
                            typeAdapter5 = this.f2249c.getAdapter(String.class);
                            this.f2248b = typeAdapter5;
                        }
                        typeAdapter5.write(jsonWriter, cVar.f2400d);
                    }
                    jsonWriter.name(StubApp.getString2(2073));
                    if (cVar.f2401e == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter6 = this.f2248b;
                        if (typeAdapter6 == null) {
                            typeAdapter6 = this.f2249c.getAdapter(String.class);
                            this.f2248b = typeAdapter6;
                        }
                        typeAdapter6.write(jsonWriter, cVar.f2401e);
                    }
                    jsonWriter.endObject();
                    break;
                }
            case 3:
                G6.d dVar2 = (G6.d) obj;
                if (dVar2 == null) {
                    jsonWriter.nullValue();
                    break;
                } else {
                    jsonWriter.beginObject();
                    LinkedHashMap linkedHashMap2 = dVar2.f2402a;
                    if (linkedHashMap2 != null) {
                        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                            jsonWriter.name((String) entry3.getKey());
                            JsonElement jsonElement3 = ((com.mapbox.auto.value.gson.b) entry3.getValue()).f12374a;
                            E1.a.s(jsonElement3, this.f2249c, jsonWriter, jsonElement3);
                        }
                    }
                    jsonWriter.name(string22);
                    if (dVar2.f2403b == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter7 = this.f2248b;
                        if (typeAdapter7 == null) {
                            typeAdapter7 = this.f2249c.getAdapter(String.class);
                            this.f2248b = typeAdapter7;
                        }
                        typeAdapter7.write(jsonWriter, dVar2.f2403b);
                    }
                    jsonWriter.name(string2);
                    if (dVar2.f2404c == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter8 = this.f2248b;
                        if (typeAdapter8 == null) {
                            typeAdapter8 = this.f2249c.getAdapter(String.class);
                            this.f2248b = typeAdapter8;
                        }
                        typeAdapter8.write(jsonWriter, dVar2.f2404c);
                    }
                    jsonWriter.endObject();
                    break;
                }
            case 4:
                h hVar = (h) obj;
                if (hVar == null) {
                    jsonWriter.nullValue();
                    break;
                } else {
                    jsonWriter.beginObject();
                    LinkedHashMap linkedHashMap3 = hVar.f2419a;
                    if (linkedHashMap3 != null) {
                        for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
                            jsonWriter.name((String) entry4.getKey());
                            JsonElement jsonElement4 = ((com.mapbox.auto.value.gson.b) entry4.getValue()).f12374a;
                            E1.a.s(jsonElement4, this.f2249c, jsonWriter, jsonElement4);
                        }
                    }
                    jsonWriter.name(string23);
                    if (hVar.f2420b == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter9 = this.f2248b;
                        if (typeAdapter9 == null) {
                            typeAdapter9 = this.f2249c.getAdapter(String.class);
                            this.f2248b = typeAdapter9;
                        }
                        typeAdapter9.write(jsonWriter, hVar.f2420b);
                    }
                    jsonWriter.name(StubApp.getString2(2050));
                    if (hVar.f2421c == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter10 = this.f2248b;
                        if (typeAdapter10 == null) {
                            typeAdapter10 = this.f2249c.getAdapter(String.class);
                            this.f2248b = typeAdapter10;
                        }
                        typeAdapter10.write(jsonWriter, hVar.f2421c);
                    }
                    jsonWriter.name(StubApp.getString2(2071));
                    if (hVar.f2422d == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter11 = this.f2248b;
                        if (typeAdapter11 == null) {
                            typeAdapter11 = this.f2249c.getAdapter(String.class);
                            this.f2248b = typeAdapter11;
                        }
                        typeAdapter11.write(jsonWriter, hVar.f2422d);
                    }
                    jsonWriter.name(StubApp.getString2(2049));
                    if (hVar.f2423e == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter12 = this.f2248b;
                        if (typeAdapter12 == null) {
                            typeAdapter12 = this.f2249c.getAdapter(String.class);
                            this.f2248b = typeAdapter12;
                        }
                        typeAdapter12.write(jsonWriter, hVar.f2423e);
                    }
                    jsonWriter.name(StubApp.getString2(2047));
                    if (hVar.f2424f == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter13 = this.f2248b;
                        if (typeAdapter13 == null) {
                            typeAdapter13 = this.f2249c.getAdapter(String.class);
                            this.f2248b = typeAdapter13;
                        }
                        typeAdapter13.write(jsonWriter, hVar.f2424f);
                    }
                    jsonWriter.name(StubApp.getString2(2051));
                    if (hVar.f2425g == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter14 = this.f2248b;
                        if (typeAdapter14 == null) {
                            typeAdapter14 = this.f2249c.getAdapter(String.class);
                            this.f2248b = typeAdapter14;
                        }
                        typeAdapter14.write(jsonWriter, hVar.f2425g);
                    }
                    jsonWriter.name(StubApp.getString2(223));
                    if (hVar.f2426h == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter15 = this.f2248b;
                        if (typeAdapter15 == null) {
                            typeAdapter15 = this.f2249c.getAdapter(String.class);
                            this.f2248b = typeAdapter15;
                        }
                        typeAdapter15.write(jsonWriter, hVar.f2426h);
                    }
                    jsonWriter.name(StubApp.getString2(2072));
                    if (hVar.j == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter16 = this.f2248b;
                        if (typeAdapter16 == null) {
                            typeAdapter16 = this.f2249c.getAdapter(String.class);
                            this.f2248b = typeAdapter16;
                        }
                        typeAdapter16.write(jsonWriter, hVar.j);
                    }
                    jsonWriter.endObject();
                    break;
                }
            case 5:
                com.mapbox.api.geocoding.v5.models.a aVar2 = (com.mapbox.api.geocoding.v5.models.a) obj;
                if (aVar2 == null) {
                    jsonWriter.nullValue();
                    break;
                } else {
                    jsonWriter.beginObject();
                    jsonWriter.name(StubApp.getString2(290));
                    if (aVar2.f12282a == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter17 = this.f2248b;
                        if (typeAdapter17 == null) {
                            typeAdapter17 = this.f2249c.getAdapter(String.class);
                            this.f2248b = typeAdapter17;
                        }
                        typeAdapter17.write(jsonWriter, aVar2.f12282a);
                    }
                    jsonWriter.name(StubApp.getString2(613));
                    if (aVar2.f12283b == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter18 = this.f2248b;
                        if (typeAdapter18 == null) {
                            typeAdapter18 = this.f2249c.getAdapter(String.class);
                            this.f2248b = typeAdapter18;
                        }
                        typeAdapter18.write(jsonWriter, aVar2.f12283b);
                    }
                    jsonWriter.name(StubApp.getString2(2067));
                    if (aVar2.f12284c == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter19 = this.f2248b;
                        if (typeAdapter19 == null) {
                            typeAdapter19 = this.f2249c.getAdapter(String.class);
                            this.f2248b = typeAdapter19;
                        }
                        typeAdapter19.write(jsonWriter, aVar2.f12284c);
                    }
                    jsonWriter.name(StubApp.getString2(2068));
                    if (aVar2.f12285d == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter20 = this.f2248b;
                        if (typeAdapter20 == null) {
                            typeAdapter20 = this.f2249c.getAdapter(String.class);
                            this.f2248b = typeAdapter20;
                        }
                        typeAdapter20.write(jsonWriter, aVar2.f12285d);
                    }
                    jsonWriter.name(StubApp.getString2(2069));
                    if (aVar2.f12286e == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter21 = this.f2248b;
                        if (typeAdapter21 == null) {
                            typeAdapter21 = this.f2249c.getAdapter(String.class);
                            this.f2248b = typeAdapter21;
                        }
                        typeAdapter21.write(jsonWriter, aVar2.f12286e);
                    }
                    jsonWriter.name(StubApp.getString2(2070));
                    if (aVar2.f12287f == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter22 = this.f2248b;
                        if (typeAdapter22 == null) {
                            typeAdapter22 = this.f2249c.getAdapter(String.class);
                            this.f2248b = typeAdapter22;
                        }
                        typeAdapter22.write(jsonWriter, aVar2.f12287f);
                    }
                    jsonWriter.endObject();
                    break;
                }
            case 6:
                com.mapbox.api.geocoding.v5.models.f fVar = (com.mapbox.api.geocoding.v5.models.f) obj;
                if (fVar == null) {
                    jsonWriter.nullValue();
                    break;
                } else {
                    jsonWriter.beginObject();
                    jsonWriter.name(StubApp.getString2(2066));
                    if (fVar.f12318a == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter23 = this.f2248b;
                        if (typeAdapter23 == null) {
                            typeAdapter23 = this.f2249c.getAdapter(TypeToken.getParameterized(List.class, com.mapbox.api.geocoding.v5.models.e.class));
                            this.f2248b = typeAdapter23;
                        }
                        typeAdapter23.write(jsonWriter, fVar.f12318a);
                    }
                    jsonWriter.endObject();
                    break;
                }
            case 7:
                com.mapbox.api.matching.v5.models.a aVar3 = (com.mapbox.api.matching.v5.models.a) obj;
                if (aVar3 == null) {
                    jsonWriter.nullValue();
                    break;
                } else {
                    jsonWriter.beginObject();
                    jsonWriter.name(StubApp.getString2(1052));
                    if (aVar3.f12343a == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter24 = this.f2248b;
                        if (typeAdapter24 == null) {
                            typeAdapter24 = this.f2249c.getAdapter(String.class);
                            this.f2248b = typeAdapter24;
                        }
                        typeAdapter24.write(jsonWriter, aVar3.f12343a);
                    }
                    jsonWriter.name(StubApp.getString2(1905));
                    if (aVar3.f12344b == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter25 = this.f2248b;
                        if (typeAdapter25 == null) {
                            typeAdapter25 = this.f2249c.getAdapter(String.class);
                            this.f2248b = typeAdapter25;
                        }
                        typeAdapter25.write(jsonWriter, aVar3.f12344b);
                    }
                    jsonWriter.endObject();
                    break;
                }
            default:
                com.mapbox.api.routetiles.v1.versions.models.a aVar4 = (com.mapbox.api.routetiles.v1.versions.models.a) obj;
                if (aVar4 == null) {
                    jsonWriter.nullValue();
                    break;
                } else {
                    jsonWriter.beginObject();
                    jsonWriter.name(StubApp.getString2(2065));
                    if (aVar4.f12371a == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter26 = this.f2248b;
                        if (typeAdapter26 == null) {
                            typeAdapter26 = this.f2249c.getAdapter(TypeToken.getParameterized(List.class, String.class));
                            this.f2248b = typeAdapter26;
                        }
                        typeAdapter26.write(jsonWriter, aVar4.f12371a);
                    }
                    jsonWriter.endObject();
                    break;
                }
        }
    }
}
