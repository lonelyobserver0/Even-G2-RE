package G6;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.stub.StubApp;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i extends TypeAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2427a;

    /* renamed from: b, reason: collision with root package name */
    public volatile TypeAdapter f2428b;

    /* renamed from: c, reason: collision with root package name */
    public volatile TypeAdapter f2429c;

    /* renamed from: d, reason: collision with root package name */
    public volatile TypeAdapter f2430d;

    /* renamed from: e, reason: collision with root package name */
    public volatile TypeAdapter f2431e;

    /* renamed from: f, reason: collision with root package name */
    public volatile TypeAdapter f2432f;

    /* renamed from: g, reason: collision with root package name */
    public final Gson f2433g;

    public /* synthetic */ i(Gson gson, int i3) {
        this.f2427a = i3;
        this.f2433g = gson;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final Object read2(JsonReader jsonReader) {
        char c10;
        char c11;
        String string2 = StubApp.getString2(2302);
        LinkedHashMap linkedHashMap = null;
        switch (this.f2427a) {
            case 0:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                LinkedHashMap linkedHashMap2 = null;
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                b bVar = null;
                f fVar = null;
                List list = null;
                h hVar = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    if (jsonReader.peek() != JsonToken.NULL) {
                        nextName.getClass();
                        switch (nextName.hashCode()) {
                            case -1000462460:
                                if (nextName.equals(StubApp.getString2(2311))) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -873459763:
                                if (nextName.equals(StubApp.getString2(2310))) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3017257:
                                if (nextName.equals(string2)) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3373707:
                                if (nextName.equals(StubApp.getString2(ModuleDescriptor.MODULE_VERSION))) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 21980740:
                                if (nextName.equals(StubApp.getString2(2309))) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 951530927:
                                if (nextName.equals(StubApp.getString2(354))) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1209218787:
                                if (nextName.equals(StubApp.getString2(2308))) {
                                    c10 = 6;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1337871467:
                                if (nextName.equals(StubApp.getString2(2063))) {
                                    c10 = 7;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1864753191:
                                if (nextName.equals(StubApp.getString2(2307))) {
                                    c10 = '\b';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1871919611:
                                if (nextName.equals(StubApp.getString2(2042))) {
                                    c10 = '\t';
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
                                TypeAdapter typeAdapter = this.f2428b;
                                if (typeAdapter == null) {
                                    typeAdapter = this.f2433g.getAdapter(String.class);
                                    this.f2428b = typeAdapter;
                                }
                                str5 = (String) typeAdapter.read2(jsonReader);
                                break;
                            case 1:
                                TypeAdapter typeAdapter2 = this.f2428b;
                                if (typeAdapter2 == null) {
                                    typeAdapter2 = this.f2433g.getAdapter(String.class);
                                    this.f2428b = typeAdapter2;
                                }
                                str4 = (String) typeAdapter2.read2(jsonReader);
                                break;
                            case 2:
                                TypeAdapter typeAdapter3 = this.f2431e;
                                if (typeAdapter3 == null) {
                                    typeAdapter3 = this.f2433g.getAdapter(TypeToken.getParameterized(List.class, Double.class));
                                    this.f2431e = typeAdapter3;
                                }
                                list = (List) typeAdapter3.read2(jsonReader);
                                break;
                            case 3:
                                TypeAdapter typeAdapter4 = this.f2428b;
                                if (typeAdapter4 == null) {
                                    typeAdapter4 = this.f2433g.getAdapter(String.class);
                                    this.f2428b = typeAdapter4;
                                }
                                str3 = (String) typeAdapter4.read2(jsonReader);
                                break;
                            case 4:
                                TypeAdapter typeAdapter5 = this.f2428b;
                                if (typeAdapter5 == null) {
                                    typeAdapter5 = this.f2433g.getAdapter(String.class);
                                    this.f2428b = typeAdapter5;
                                }
                                str6 = (String) typeAdapter5.read2(jsonReader);
                                break;
                            case 5:
                                TypeAdapter typeAdapter6 = this.f2429c;
                                if (typeAdapter6 == null) {
                                    typeAdapter6 = this.f2433g.getAdapter(b.class);
                                    this.f2429c = typeAdapter6;
                                }
                                bVar = (b) typeAdapter6.read2(jsonReader);
                                break;
                            case 6:
                                TypeAdapter typeAdapter7 = this.f2428b;
                                if (typeAdapter7 == null) {
                                    typeAdapter7 = this.f2433g.getAdapter(String.class);
                                    this.f2428b = typeAdapter7;
                                }
                                str2 = (String) typeAdapter7.read2(jsonReader);
                                if (str2 == null) {
                                    throw new NullPointerException(StubApp.getString2(2313));
                                }
                                break;
                            case 7:
                                TypeAdapter typeAdapter8 = this.f2428b;
                                if (typeAdapter8 == null) {
                                    typeAdapter8 = this.f2433g.getAdapter(String.class);
                                    this.f2428b = typeAdapter8;
                                }
                                str = (String) typeAdapter8.read2(jsonReader);
                                if (str == null) {
                                    throw new NullPointerException(StubApp.getString2(2312));
                                }
                                break;
                            case '\b':
                                TypeAdapter typeAdapter9 = this.f2432f;
                                if (typeAdapter9 == null) {
                                    typeAdapter9 = this.f2433g.getAdapter(h.class);
                                    this.f2432f = typeAdapter9;
                                }
                                hVar = (h) typeAdapter9.read2(jsonReader);
                                break;
                            case '\t':
                                TypeAdapter typeAdapter10 = this.f2430d;
                                if (typeAdapter10 == null) {
                                    typeAdapter10 = this.f2433g.getAdapter(f.class);
                                    this.f2430d = typeAdapter10;
                                }
                                fVar = (f) typeAdapter10.read2(jsonReader);
                                break;
                            default:
                                if (linkedHashMap == null) {
                                    linkedHashMap = new LinkedHashMap();
                                    linkedHashMap2 = linkedHashMap;
                                }
                                E1.a.t((JsonElement) this.f2433g.fromJson(jsonReader, JsonElement.class), linkedHashMap, nextName);
                                break;
                        }
                    } else {
                        jsonReader.nextNull();
                    }
                }
                jsonReader.endObject();
                String string22 = str == null ? StubApp.getString2(2314) : "";
                if (str2 == null) {
                    string22 = string22.concat(StubApp.getString2(2315));
                }
                if (string22.isEmpty()) {
                    return new j(linkedHashMap2, str, str2, str3, str4, str5, str6, bVar, fVar, list, hVar);
                }
                throw new IllegalStateException(StubApp.getString2(555).concat(string22));
            default:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                Boolean bool = null;
                List list2 = null;
                String str17 = null;
                String str18 = null;
                Integer num = null;
                String str19 = null;
                List list3 = null;
                String str20 = null;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (jsonReader.peek() != JsonToken.NULL) {
                        nextName2.getClass();
                        switch (nextName2.hashCode()) {
                            case -1613589672:
                                if (nextName2.equals(StubApp.getString2(1142))) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -934795532:
                                if (nextName2.equals(StubApp.getString2(2051))) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -891990013:
                                if (nextName2.equals(StubApp.getString2(2050))) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -837947416:
                                if (nextName2.equals(StubApp.getString2(2306))) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -490041217:
                                if (nextName2.equals(StubApp.getString2(2305))) {
                                    c11 = 4;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -404257102:
                                if (nextName2.equals(StubApp.getString2(2304))) {
                                    c11 = 5;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 113:
                                if (nextName2.equals(StubApp.getString2(1573))) {
                                    c11 = 6;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3017257:
                                if (nextName2.equals(string2)) {
                                    c11 = 7;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 93832333:
                                if (nextName2.equals(StubApp.getString2(2303))) {
                                    c11 = '\b';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 102976443:
                                if (nextName2.equals(StubApp.getString2(2106))) {
                                    c11 = '\t';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 106748167:
                                if (nextName2.equals(StubApp.getString2(2049))) {
                                    c11 = '\n';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 110844025:
                                if (nextName2.equals(StubApp.getString2(2105))) {
                                    c11 = 11;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 421241332:
                                if (nextName2.equals(StubApp.getString2(2064))) {
                                    c11 = '\f';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 498460430:
                                if (nextName2.equals(StubApp.getString2(2048))) {
                                    c11 = '\r';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 757462669:
                                if (nextName2.equals(StubApp.getString2(2047))) {
                                    c11 = 14;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 957831062:
                                if (nextName2.equals(StubApp.getString2(223))) {
                                    c11 = 15;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1123826999:
                                if (nextName2.equals(StubApp.getString2(2104))) {
                                    c11 = 16;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1900805475:
                                if (nextName2.equals(StubApp.getString2(2071))) {
                                    c11 = 17;
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
                                TypeAdapter typeAdapter11 = this.f2428b;
                                if (typeAdapter11 == null) {
                                    typeAdapter11 = this.f2433g.getAdapter(String.class);
                                    this.f2428b = typeAdapter11;
                                }
                                str18 = (String) typeAdapter11.read2(jsonReader);
                                break;
                            case 1:
                                TypeAdapter typeAdapter12 = this.f2428b;
                                if (typeAdapter12 == null) {
                                    typeAdapter12 = this.f2433g.getAdapter(String.class);
                                    this.f2428b = typeAdapter12;
                                }
                                str13 = (String) typeAdapter12.read2(jsonReader);
                                break;
                            case 2:
                                TypeAdapter typeAdapter13 = this.f2428b;
                                if (typeAdapter13 == null) {
                                    typeAdapter13 = this.f2433g.getAdapter(String.class);
                                    this.f2428b = typeAdapter13;
                                }
                                str10 = (String) typeAdapter13.read2(jsonReader);
                                break;
                            case 3:
                                TypeAdapter typeAdapter14 = this.f2429c;
                                if (typeAdapter14 == null) {
                                    typeAdapter14 = this.f2433g.getAdapter(Boolean.class);
                                    this.f2429c = typeAdapter14;
                                }
                                bool = (Boolean) typeAdapter14.read2(jsonReader);
                                break;
                            case 4:
                                TypeAdapter typeAdapter15 = this.f2428b;
                                if (typeAdapter15 == null) {
                                    typeAdapter15 = this.f2433g.getAdapter(String.class);
                                    this.f2428b = typeAdapter15;
                                }
                                str19 = (String) typeAdapter15.read2(jsonReader);
                                break;
                            case 5:
                                TypeAdapter typeAdapter16 = this.f2428b;
                                if (typeAdapter16 == null) {
                                    typeAdapter16 = this.f2433g.getAdapter(String.class);
                                    this.f2428b = typeAdapter16;
                                }
                                str8 = (String) typeAdapter16.read2(jsonReader);
                                break;
                            case 6:
                                TypeAdapter typeAdapter17 = this.f2428b;
                                if (typeAdapter17 == null) {
                                    typeAdapter17 = this.f2433g.getAdapter(String.class);
                                    this.f2428b = typeAdapter17;
                                }
                                str7 = (String) typeAdapter17.read2(jsonReader);
                                break;
                            case 7:
                                TypeAdapter typeAdapter18 = this.f2430d;
                                if (typeAdapter18 == null) {
                                    typeAdapter18 = this.f2433g.getAdapter(TypeToken.getParameterized(List.class, Double.class));
                                    this.f2430d = typeAdapter18;
                                }
                                list2 = (List) typeAdapter18.read2(jsonReader);
                                break;
                            case '\b':
                                TypeAdapter typeAdapter19 = this.f2428b;
                                if (typeAdapter19 == null) {
                                    typeAdapter19 = this.f2433g.getAdapter(String.class);
                                    this.f2428b = typeAdapter19;
                                }
                                str11 = (String) typeAdapter19.read2(jsonReader);
                                break;
                            case '\t':
                                TypeAdapter typeAdapter20 = this.f2431e;
                                if (typeAdapter20 == null) {
                                    typeAdapter20 = this.f2433g.getAdapter(Integer.class);
                                    this.f2431e = typeAdapter20;
                                }
                                num = (Integer) typeAdapter20.read2(jsonReader);
                                break;
                            case '\n':
                                TypeAdapter typeAdapter21 = this.f2428b;
                                if (typeAdapter21 == null) {
                                    typeAdapter21 = this.f2433g.getAdapter(String.class);
                                    this.f2428b = typeAdapter21;
                                }
                                str12 = (String) typeAdapter21.read2(jsonReader);
                                break;
                            case 11:
                                TypeAdapter typeAdapter22 = this.f2432f;
                                if (typeAdapter22 == null) {
                                    typeAdapter22 = this.f2433g.getAdapter(TypeToken.getParameterized(List.class, String.class));
                                    this.f2432f = typeAdapter22;
                                }
                                list3 = (List) typeAdapter22.read2(jsonReader);
                                break;
                            case '\f':
                                TypeAdapter typeAdapter23 = this.f2428b;
                                if (typeAdapter23 == null) {
                                    typeAdapter23 = this.f2433g.getAdapter(String.class);
                                    this.f2428b = typeAdapter23;
                                }
                                str9 = (String) typeAdapter23.read2(jsonReader);
                                break;
                            case '\r':
                                TypeAdapter typeAdapter24 = this.f2428b;
                                if (typeAdapter24 == null) {
                                    typeAdapter24 = this.f2433g.getAdapter(String.class);
                                    this.f2428b = typeAdapter24;
                                }
                                str16 = (String) typeAdapter24.read2(jsonReader);
                                break;
                            case 14:
                                TypeAdapter typeAdapter25 = this.f2428b;
                                if (typeAdapter25 == null) {
                                    typeAdapter25 = this.f2433g.getAdapter(String.class);
                                    this.f2428b = typeAdapter25;
                                }
                                str14 = (String) typeAdapter25.read2(jsonReader);
                                break;
                            case 15:
                                TypeAdapter typeAdapter26 = this.f2428b;
                                if (typeAdapter26 == null) {
                                    typeAdapter26 = this.f2433g.getAdapter(String.class);
                                    this.f2428b = typeAdapter26;
                                }
                                str17 = (String) typeAdapter26.read2(jsonReader);
                                break;
                            case 16:
                                TypeAdapter typeAdapter27 = this.f2428b;
                                if (typeAdapter27 == null) {
                                    typeAdapter27 = this.f2433g.getAdapter(String.class);
                                    this.f2428b = typeAdapter27;
                                }
                                str20 = (String) typeAdapter27.read2(jsonReader);
                                break;
                            case 17:
                                TypeAdapter typeAdapter28 = this.f2428b;
                                if (typeAdapter28 == null) {
                                    typeAdapter28 = this.f2433g.getAdapter(String.class);
                                    this.f2428b = typeAdapter28;
                                }
                                str15 = (String) typeAdapter28.read2(jsonReader);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    } else {
                        jsonReader.nextNull();
                    }
                }
                jsonReader.endObject();
                return new com.mapbox.api.geocoding.v6.a(str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, bool, list2, str17, str18, num, str19, list3, str20);
        }
    }

    public final String toString() {
        switch (this.f2427a) {
            case 0:
                return StubApp.getString2(2317);
            default:
                return StubApp.getString2(2316);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) {
        String string2 = StubApp.getString2(2302);
        switch (this.f2427a) {
            case 0:
                j jVar = (j) obj;
                if (jVar == null) {
                    jsonWriter.nullValue();
                    break;
                } else {
                    jsonWriter.beginObject();
                    LinkedHashMap linkedHashMap = jVar.f2434a;
                    if (linkedHashMap != null) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            JsonElement jsonElement = ((com.mapbox.auto.value.gson.b) entry.getValue()).f12374a;
                            E1.a.s(jsonElement, this.f2433g, jsonWriter, jsonElement);
                        }
                    }
                    jsonWriter.name(StubApp.getString2(2063));
                    if (jVar.f2435b == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter = this.f2428b;
                        if (typeAdapter == null) {
                            typeAdapter = this.f2433g.getAdapter(String.class);
                            this.f2428b = typeAdapter;
                        }
                        typeAdapter.write(jsonWriter, jVar.f2435b);
                    }
                    jsonWriter.name(StubApp.getString2(2308));
                    if (jVar.f2436c == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter2 = this.f2428b;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.f2433g.getAdapter(String.class);
                            this.f2428b = typeAdapter2;
                        }
                        typeAdapter2.write(jsonWriter, jVar.f2436c);
                    }
                    jsonWriter.name(StubApp.getString2(ModuleDescriptor.MODULE_VERSION));
                    if (jVar.f2437d == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter3 = this.f2428b;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.f2433g.getAdapter(String.class);
                            this.f2428b = typeAdapter3;
                        }
                        typeAdapter3.write(jsonWriter, jVar.f2437d);
                    }
                    jsonWriter.name(StubApp.getString2(2310));
                    if (jVar.f2438e == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter4 = this.f2428b;
                        if (typeAdapter4 == null) {
                            typeAdapter4 = this.f2433g.getAdapter(String.class);
                            this.f2428b = typeAdapter4;
                        }
                        typeAdapter4.write(jsonWriter, jVar.f2438e);
                    }
                    jsonWriter.name(StubApp.getString2(2311));
                    if (jVar.f2439f == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter5 = this.f2428b;
                        if (typeAdapter5 == null) {
                            typeAdapter5 = this.f2433g.getAdapter(String.class);
                            this.f2428b = typeAdapter5;
                        }
                        typeAdapter5.write(jsonWriter, jVar.f2439f);
                    }
                    jsonWriter.name(StubApp.getString2(2309));
                    if (jVar.f2440g == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter6 = this.f2428b;
                        if (typeAdapter6 == null) {
                            typeAdapter6 = this.f2433g.getAdapter(String.class);
                            this.f2428b = typeAdapter6;
                        }
                        typeAdapter6.write(jsonWriter, jVar.f2440g);
                    }
                    jsonWriter.name(StubApp.getString2(354));
                    if (jVar.f2441h == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter7 = this.f2429c;
                        if (typeAdapter7 == null) {
                            typeAdapter7 = this.f2433g.getAdapter(b.class);
                            this.f2429c = typeAdapter7;
                        }
                        typeAdapter7.write(jsonWriter, jVar.f2441h);
                    }
                    jsonWriter.name(StubApp.getString2(2042));
                    if (jVar.j == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter8 = this.f2430d;
                        if (typeAdapter8 == null) {
                            typeAdapter8 = this.f2433g.getAdapter(f.class);
                            this.f2430d = typeAdapter8;
                        }
                        typeAdapter8.write(jsonWriter, jVar.j);
                    }
                    jsonWriter.name(string2);
                    if (jVar.f2442k == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter9 = this.f2431e;
                        if (typeAdapter9 == null) {
                            typeAdapter9 = this.f2433g.getAdapter(TypeToken.getParameterized(List.class, Double.class));
                            this.f2431e = typeAdapter9;
                        }
                        typeAdapter9.write(jsonWriter, jVar.f2442k);
                    }
                    jsonWriter.name(StubApp.getString2(2307));
                    if (jVar.f2443l == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter10 = this.f2432f;
                        if (typeAdapter10 == null) {
                            typeAdapter10 = this.f2433g.getAdapter(h.class);
                            this.f2432f = typeAdapter10;
                        }
                        typeAdapter10.write(jsonWriter, jVar.f2443l);
                    }
                    jsonWriter.endObject();
                    break;
                }
            default:
                com.mapbox.api.geocoding.v6.a aVar = (com.mapbox.api.geocoding.v6.a) obj;
                if (aVar == null) {
                    jsonWriter.nullValue();
                    break;
                } else {
                    jsonWriter.beginObject();
                    jsonWriter.name(StubApp.getString2(1573));
                    if (aVar.f12319a == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter11 = this.f2428b;
                        if (typeAdapter11 == null) {
                            typeAdapter11 = this.f2433g.getAdapter(String.class);
                            this.f2428b = typeAdapter11;
                        }
                        typeAdapter11.write(jsonWriter, aVar.f12319a);
                    }
                    jsonWriter.name(StubApp.getString2(2304));
                    if (aVar.f12320b == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter12 = this.f2428b;
                        if (typeAdapter12 == null) {
                            typeAdapter12 = this.f2433g.getAdapter(String.class);
                            this.f2428b = typeAdapter12;
                        }
                        typeAdapter12.write(jsonWriter, aVar.f12320b);
                    }
                    jsonWriter.name(StubApp.getString2(2064));
                    if (aVar.f12321c == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter13 = this.f2428b;
                        if (typeAdapter13 == null) {
                            typeAdapter13 = this.f2433g.getAdapter(String.class);
                            this.f2428b = typeAdapter13;
                        }
                        typeAdapter13.write(jsonWriter, aVar.f12321c);
                    }
                    jsonWriter.name(StubApp.getString2(2050));
                    if (aVar.f12322d == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter14 = this.f2428b;
                        if (typeAdapter14 == null) {
                            typeAdapter14 = this.f2433g.getAdapter(String.class);
                            this.f2428b = typeAdapter14;
                        }
                        typeAdapter14.write(jsonWriter, aVar.f12322d);
                    }
                    jsonWriter.name(StubApp.getString2(2303));
                    if (aVar.f12323e == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter15 = this.f2428b;
                        if (typeAdapter15 == null) {
                            typeAdapter15 = this.f2433g.getAdapter(String.class);
                            this.f2428b = typeAdapter15;
                        }
                        typeAdapter15.write(jsonWriter, aVar.f12323e);
                    }
                    jsonWriter.name(StubApp.getString2(2049));
                    if (aVar.f12324f == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter16 = this.f2428b;
                        if (typeAdapter16 == null) {
                            typeAdapter16 = this.f2433g.getAdapter(String.class);
                            this.f2428b = typeAdapter16;
                        }
                        typeAdapter16.write(jsonWriter, aVar.f12324f);
                    }
                    jsonWriter.name(StubApp.getString2(2051));
                    if (aVar.f12325g == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter17 = this.f2428b;
                        if (typeAdapter17 == null) {
                            typeAdapter17 = this.f2433g.getAdapter(String.class);
                            this.f2428b = typeAdapter17;
                        }
                        typeAdapter17.write(jsonWriter, aVar.f12325g);
                    }
                    jsonWriter.name(StubApp.getString2(2047));
                    if (aVar.f12326h == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter18 = this.f2428b;
                        if (typeAdapter18 == null) {
                            typeAdapter18 = this.f2433g.getAdapter(String.class);
                            this.f2428b = typeAdapter18;
                        }
                        typeAdapter18.write(jsonWriter, aVar.f12326h);
                    }
                    jsonWriter.name(StubApp.getString2(2071));
                    if (aVar.f12327i == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter19 = this.f2428b;
                        if (typeAdapter19 == null) {
                            typeAdapter19 = this.f2433g.getAdapter(String.class);
                            this.f2428b = typeAdapter19;
                        }
                        typeAdapter19.write(jsonWriter, aVar.f12327i);
                    }
                    jsonWriter.name(StubApp.getString2(2048));
                    if (aVar.j == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter20 = this.f2428b;
                        if (typeAdapter20 == null) {
                            typeAdapter20 = this.f2433g.getAdapter(String.class);
                            this.f2428b = typeAdapter20;
                        }
                        typeAdapter20.write(jsonWriter, aVar.j);
                    }
                    jsonWriter.name(StubApp.getString2(2306));
                    if (aVar.f12328k == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter21 = this.f2429c;
                        if (typeAdapter21 == null) {
                            typeAdapter21 = this.f2433g.getAdapter(Boolean.class);
                            this.f2429c = typeAdapter21;
                        }
                        typeAdapter21.write(jsonWriter, aVar.f12328k);
                    }
                    jsonWriter.name(string2);
                    if (aVar.f12329l == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter22 = this.f2430d;
                        if (typeAdapter22 == null) {
                            typeAdapter22 = this.f2433g.getAdapter(TypeToken.getParameterized(List.class, Double.class));
                            this.f2430d = typeAdapter22;
                        }
                        typeAdapter22.write(jsonWriter, aVar.f12329l);
                    }
                    jsonWriter.name(StubApp.getString2(223));
                    if (aVar.f12330m == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter23 = this.f2428b;
                        if (typeAdapter23 == null) {
                            typeAdapter23 = this.f2433g.getAdapter(String.class);
                            this.f2428b = typeAdapter23;
                        }
                        typeAdapter23.write(jsonWriter, aVar.f12330m);
                    }
                    jsonWriter.name(StubApp.getString2(1142));
                    if (aVar.f12331n == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter24 = this.f2428b;
                        if (typeAdapter24 == null) {
                            typeAdapter24 = this.f2433g.getAdapter(String.class);
                            this.f2428b = typeAdapter24;
                        }
                        typeAdapter24.write(jsonWriter, aVar.f12331n);
                    }
                    jsonWriter.name(StubApp.getString2(2106));
                    if (aVar.f12332o == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter25 = this.f2431e;
                        if (typeAdapter25 == null) {
                            typeAdapter25 = this.f2433g.getAdapter(Integer.class);
                            this.f2431e = typeAdapter25;
                        }
                        typeAdapter25.write(jsonWriter, aVar.f12332o);
                    }
                    jsonWriter.name(StubApp.getString2(2305));
                    if (aVar.f12333p == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter26 = this.f2428b;
                        if (typeAdapter26 == null) {
                            typeAdapter26 = this.f2433g.getAdapter(String.class);
                            this.f2428b = typeAdapter26;
                        }
                        typeAdapter26.write(jsonWriter, aVar.f12333p);
                    }
                    jsonWriter.name(StubApp.getString2(2105));
                    if (aVar.f12334q == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter27 = this.f2432f;
                        if (typeAdapter27 == null) {
                            typeAdapter27 = this.f2433g.getAdapter(TypeToken.getParameterized(List.class, String.class));
                            this.f2432f = typeAdapter27;
                        }
                        typeAdapter27.write(jsonWriter, aVar.f12334q);
                    }
                    jsonWriter.name(StubApp.getString2(2104));
                    if (aVar.f12335r == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter28 = this.f2428b;
                        if (typeAdapter28 == null) {
                            typeAdapter28 = this.f2433g.getAdapter(String.class);
                            this.f2428b = typeAdapter28;
                        }
                        typeAdapter28.write(jsonWriter, aVar.f12335r);
                    }
                    jsonWriter.endObject();
                    break;
                }
        }
    }
}
