package F6;

import G6.k;
import G6.l;
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
public final class a extends TypeAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2239a;

    /* renamed from: b, reason: collision with root package name */
    public volatile TypeAdapter f2240b;

    /* renamed from: c, reason: collision with root package name */
    public volatile TypeAdapter f2241c;

    /* renamed from: d, reason: collision with root package name */
    public final Gson f2242d;

    public /* synthetic */ a(Gson gson, int i3) {
        this.f2239a = i3;
        this.f2242d = gson;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v9 */
    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final Object read2(JsonReader jsonReader) {
        char c10;
        ?? r11;
        String string2 = StubApp.getString2(ModuleDescriptor.MODULE_VERSION);
        LinkedHashMap linkedHashMap = null;
        String str = null;
        Double d8 = null;
        String str2 = null;
        LinkedHashMap linkedHashMap2 = null;
        switch (this.f2239a) {
            case 0:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                String str3 = null;
                LinkedHashMap linkedHashMap3 = null;
                String str4 = null;
                d dVar = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                    } else {
                        nextName.getClass();
                        if (StubApp.getString2(1052).equals(nextName)) {
                            TypeAdapter typeAdapter = this.f2240b;
                            if (typeAdapter == null) {
                                typeAdapter = this.f2242d.getAdapter(String.class);
                                this.f2240b = typeAdapter;
                            }
                            str3 = (String) typeAdapter.read2(jsonReader);
                            if (str3 == null) {
                                throw new NullPointerException(StubApp.getString2(2052));
                            }
                        } else if (StubApp.getString2(1905).equals(nextName)) {
                            TypeAdapter typeAdapter2 = this.f2240b;
                            if (typeAdapter2 == null) {
                                typeAdapter2 = this.f2242d.getAdapter(String.class);
                                this.f2240b = typeAdapter2;
                            }
                            str4 = (String) typeAdapter2.read2(jsonReader);
                        } else if (StubApp.getString2(2053).equals(nextName)) {
                            TypeAdapter typeAdapter3 = this.f2241c;
                            if (typeAdapter3 == null) {
                                typeAdapter3 = this.f2242d.getAdapter(d.class);
                                this.f2241c = typeAdapter3;
                            }
                            dVar = (d) typeAdapter3.read2(jsonReader);
                        } else {
                            if (linkedHashMap == null) {
                                linkedHashMap3 = new LinkedHashMap();
                                linkedHashMap = linkedHashMap3;
                            }
                            E1.a.t((JsonElement) this.f2242d.fromJson(jsonReader, JsonElement.class), linkedHashMap, nextName);
                        }
                    }
                }
                jsonReader.endObject();
                String string22 = str3 == null ? StubApp.getString2(2054) : "";
                if (string22.isEmpty()) {
                    return new b(linkedHashMap3, str3, str4, dVar);
                }
                throw new IllegalStateException(StubApp.getString2(555).concat(string22));
            case 1:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                LinkedHashMap linkedHashMap4 = null;
                G6.c cVar = null;
                G6.d dVar2 = null;
                G6.d dVar3 = null;
                G6.d dVar4 = null;
                G6.d dVar5 = null;
                G6.d dVar6 = null;
                G6.d dVar7 = null;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (jsonReader.peek() != JsonToken.NULL) {
                        nextName2.getClass();
                        switch (nextName2.hashCode()) {
                            case -1147692044:
                                if (nextName2.equals(StubApp.getString2(661))) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -934795532:
                                if (nextName2.equals(StubApp.getString2(2051))) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -891990013:
                                if (nextName2.equals(StubApp.getString2(2050))) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 106748167:
                                if (nextName2.equals(StubApp.getString2(2049))) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 498460430:
                                if (nextName2.equals(StubApp.getString2(2048))) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 757462669:
                                if (nextName2.equals(StubApp.getString2(2047))) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 957831062:
                                if (nextName2.equals(StubApp.getString2(223))) {
                                    c10 = 6;
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
                                TypeAdapter typeAdapter4 = this.f2240b;
                                if (typeAdapter4 == null) {
                                    typeAdapter4 = this.f2242d.getAdapter(G6.c.class);
                                    this.f2240b = typeAdapter4;
                                }
                                cVar = (G6.c) typeAdapter4.read2(jsonReader);
                                break;
                            case 1:
                                TypeAdapter typeAdapter5 = this.f2241c;
                                if (typeAdapter5 == null) {
                                    typeAdapter5 = this.f2242d.getAdapter(G6.d.class);
                                    this.f2241c = typeAdapter5;
                                }
                                dVar6 = (G6.d) typeAdapter5.read2(jsonReader);
                                break;
                            case 2:
                                TypeAdapter typeAdapter6 = this.f2241c;
                                if (typeAdapter6 == null) {
                                    typeAdapter6 = this.f2242d.getAdapter(G6.d.class);
                                    this.f2241c = typeAdapter6;
                                }
                                dVar2 = (G6.d) typeAdapter6.read2(jsonReader);
                                break;
                            case 3:
                                TypeAdapter typeAdapter7 = this.f2241c;
                                if (typeAdapter7 == null) {
                                    typeAdapter7 = this.f2242d.getAdapter(G6.d.class);
                                    this.f2241c = typeAdapter7;
                                }
                                dVar4 = (G6.d) typeAdapter7.read2(jsonReader);
                                break;
                            case 4:
                                TypeAdapter typeAdapter8 = this.f2241c;
                                if (typeAdapter8 == null) {
                                    typeAdapter8 = this.f2242d.getAdapter(G6.d.class);
                                    this.f2241c = typeAdapter8;
                                }
                                dVar3 = (G6.d) typeAdapter8.read2(jsonReader);
                                break;
                            case 5:
                                TypeAdapter typeAdapter9 = this.f2241c;
                                if (typeAdapter9 == null) {
                                    typeAdapter9 = this.f2242d.getAdapter(G6.d.class);
                                    this.f2241c = typeAdapter9;
                                }
                                dVar5 = (G6.d) typeAdapter9.read2(jsonReader);
                                break;
                            case 6:
                                TypeAdapter typeAdapter10 = this.f2241c;
                                if (typeAdapter10 == null) {
                                    typeAdapter10 = this.f2242d.getAdapter(G6.d.class);
                                    this.f2241c = typeAdapter10;
                                }
                                dVar7 = (G6.d) typeAdapter10.read2(jsonReader);
                                break;
                            default:
                                if (linkedHashMap2 == null) {
                                    linkedHashMap2 = new LinkedHashMap();
                                    linkedHashMap4 = linkedHashMap2;
                                }
                                E1.a.t((JsonElement) this.f2242d.fromJson(jsonReader, JsonElement.class), linkedHashMap2, nextName2);
                                break;
                        }
                    } else {
                        jsonReader.nextNull();
                    }
                }
                jsonReader.endObject();
                return new G6.b(linkedHashMap4, cVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7);
            case 2:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                List list = null;
                String str5 = null;
                while (jsonReader.hasNext()) {
                    String nextName3 = jsonReader.nextName();
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                    } else {
                        nextName3.getClass();
                        if (StubApp.getString2(660).equals(nextName3)) {
                            TypeAdapter typeAdapter11 = this.f2240b;
                            if (typeAdapter11 == null) {
                                typeAdapter11 = this.f2242d.getAdapter(String.class);
                                this.f2240b = typeAdapter11;
                            }
                            str2 = (String) typeAdapter11.read2(jsonReader);
                        } else if (StubApp.getString2(2045).equals(nextName3)) {
                            TypeAdapter typeAdapter12 = this.f2241c;
                            if (typeAdapter12 == null) {
                                typeAdapter12 = this.f2242d.getAdapter(TypeToken.getParameterized(List.class, G6.g.class));
                                this.f2241c = typeAdapter12;
                            }
                            list = (List) typeAdapter12.read2(jsonReader);
                        } else if (StubApp.getString2(2046).equals(nextName3)) {
                            TypeAdapter typeAdapter13 = this.f2240b;
                            if (typeAdapter13 == null) {
                                typeAdapter13 = this.f2242d.getAdapter(String.class);
                                this.f2240b = typeAdapter13;
                            }
                            str5 = (String) typeAdapter13.read2(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                }
                jsonReader.endObject();
                return new k(str2, str5, list);
            case 3:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                Double d10 = null;
                String str6 = null;
                while (jsonReader.hasNext()) {
                    String nextName4 = jsonReader.nextName();
                    if (jsonReader.peek() != JsonToken.NULL) {
                        nextName4.getClass();
                        switch (nextName4.hashCode()) {
                            case -1439978388:
                                if (nextName4.equals(StubApp.getString2(2044))) {
                                    r11 = false;
                                    break;
                                }
                                r11 = -1;
                                break;
                            case 3373707:
                                if (nextName4.equals(string2)) {
                                    r11 = true;
                                    break;
                                }
                                r11 = -1;
                                break;
                            case 137365935:
                                if (nextName4.equals(StubApp.getString2(2043))) {
                                    r11 = 2;
                                    break;
                                }
                                r11 = -1;
                                break;
                            default:
                                r11 = -1;
                                break;
                        }
                        switch (r11) {
                            case 0:
                                TypeAdapter typeAdapter14 = this.f2240b;
                                if (typeAdapter14 == null) {
                                    typeAdapter14 = this.f2242d.getAdapter(Double.class);
                                    this.f2240b = typeAdapter14;
                                }
                                d10 = (Double) typeAdapter14.read2(jsonReader);
                                break;
                            case 1:
                                TypeAdapter typeAdapter15 = this.f2241c;
                                if (typeAdapter15 == null) {
                                    typeAdapter15 = this.f2242d.getAdapter(String.class);
                                    this.f2241c = typeAdapter15;
                                }
                                str6 = (String) typeAdapter15.read2(jsonReader);
                                break;
                            case 2:
                                TypeAdapter typeAdapter16 = this.f2240b;
                                if (typeAdapter16 == null) {
                                    typeAdapter16 = this.f2242d.getAdapter(Double.class);
                                    this.f2240b = typeAdapter16;
                                }
                                d8 = (Double) typeAdapter16.read2(jsonReader);
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
                return new l(d8, d10, str6);
            default:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                double[] dArr = null;
                while (jsonReader.hasNext()) {
                    String nextName5 = jsonReader.nextName();
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                    } else {
                        nextName5.getClass();
                        if (nextName5.equals(string2)) {
                            TypeAdapter typeAdapter17 = this.f2240b;
                            if (typeAdapter17 == null) {
                                typeAdapter17 = this.f2242d.getAdapter(String.class);
                                this.f2240b = typeAdapter17;
                            }
                            str = (String) typeAdapter17.read2(jsonReader);
                        } else if (nextName5.equals(StubApp.getString2(2042))) {
                            TypeAdapter typeAdapter18 = this.f2241c;
                            if (typeAdapter18 == null) {
                                typeAdapter18 = this.f2242d.getAdapter(double[].class);
                                this.f2241c = typeAdapter18;
                            }
                            dArr = (double[]) typeAdapter18.read2(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                }
                jsonReader.endObject();
                return new com.mapbox.api.geocoding.v5.models.e(str, dArr);
        }
    }

    public final String toString() {
        switch (this.f2239a) {
            case 0:
                return StubApp.getString2(2059);
            case 1:
                return StubApp.getString2(2058);
            case 2:
                return StubApp.getString2(2057);
            case 3:
                return StubApp.getString2(2056);
            default:
                return StubApp.getString2(2055);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) {
        String string2 = StubApp.getString2(ModuleDescriptor.MODULE_VERSION);
        switch (this.f2239a) {
            case 0:
                b bVar = (b) obj;
                if (bVar == null) {
                    jsonWriter.nullValue();
                    break;
                } else {
                    jsonWriter.beginObject();
                    LinkedHashMap linkedHashMap = bVar.f2243a;
                    if (linkedHashMap != null) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            JsonElement jsonElement = ((com.mapbox.auto.value.gson.b) entry.getValue()).f12374a;
                            E1.a.s(jsonElement, this.f2242d, jsonWriter, jsonElement);
                        }
                    }
                    jsonWriter.name(StubApp.getString2(1052));
                    if (bVar.f2244b == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter = this.f2240b;
                        if (typeAdapter == null) {
                            typeAdapter = this.f2242d.getAdapter(String.class);
                            this.f2240b = typeAdapter;
                        }
                        typeAdapter.write(jsonWriter, bVar.f2244b);
                    }
                    jsonWriter.name(StubApp.getString2(1905));
                    if (bVar.f2245c == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter2 = this.f2240b;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.f2242d.getAdapter(String.class);
                            this.f2240b = typeAdapter2;
                        }
                        typeAdapter2.write(jsonWriter, bVar.f2245c);
                    }
                    jsonWriter.name(StubApp.getString2(2053));
                    if (bVar.f2246d == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter3 = this.f2241c;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.f2242d.getAdapter(d.class);
                            this.f2241c = typeAdapter3;
                        }
                        typeAdapter3.write(jsonWriter, bVar.f2246d);
                    }
                    jsonWriter.endObject();
                    break;
                }
            case 1:
                G6.b bVar2 = (G6.b) obj;
                if (bVar2 == null) {
                    jsonWriter.nullValue();
                    break;
                } else {
                    jsonWriter.beginObject();
                    LinkedHashMap linkedHashMap2 = bVar2.f2389a;
                    if (linkedHashMap2 != null) {
                        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                            jsonWriter.name((String) entry2.getKey());
                            JsonElement jsonElement2 = ((com.mapbox.auto.value.gson.b) entry2.getValue()).f12374a;
                            E1.a.s(jsonElement2, this.f2242d, jsonWriter, jsonElement2);
                        }
                    }
                    jsonWriter.name(StubApp.getString2(661));
                    if (bVar2.f2390b == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter4 = this.f2240b;
                        if (typeAdapter4 == null) {
                            typeAdapter4 = this.f2242d.getAdapter(G6.c.class);
                            this.f2240b = typeAdapter4;
                        }
                        typeAdapter4.write(jsonWriter, bVar2.f2390b);
                    }
                    jsonWriter.name(StubApp.getString2(2050));
                    if (bVar2.f2391c == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter5 = this.f2241c;
                        if (typeAdapter5 == null) {
                            typeAdapter5 = this.f2242d.getAdapter(G6.d.class);
                            this.f2241c = typeAdapter5;
                        }
                        typeAdapter5.write(jsonWriter, bVar2.f2391c);
                    }
                    jsonWriter.name(StubApp.getString2(2048));
                    if (bVar2.f2392d == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter6 = this.f2241c;
                        if (typeAdapter6 == null) {
                            typeAdapter6 = this.f2242d.getAdapter(G6.d.class);
                            this.f2241c = typeAdapter6;
                        }
                        typeAdapter6.write(jsonWriter, bVar2.f2392d);
                    }
                    jsonWriter.name(StubApp.getString2(2049));
                    if (bVar2.f2393e == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter7 = this.f2241c;
                        if (typeAdapter7 == null) {
                            typeAdapter7 = this.f2242d.getAdapter(G6.d.class);
                            this.f2241c = typeAdapter7;
                        }
                        typeAdapter7.write(jsonWriter, bVar2.f2393e);
                    }
                    jsonWriter.name(StubApp.getString2(2047));
                    if (bVar2.f2394f == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter8 = this.f2241c;
                        if (typeAdapter8 == null) {
                            typeAdapter8 = this.f2242d.getAdapter(G6.d.class);
                            this.f2241c = typeAdapter8;
                        }
                        typeAdapter8.write(jsonWriter, bVar2.f2394f);
                    }
                    jsonWriter.name(StubApp.getString2(2051));
                    if (bVar2.f2395g == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter9 = this.f2241c;
                        if (typeAdapter9 == null) {
                            typeAdapter9 = this.f2242d.getAdapter(G6.d.class);
                            this.f2241c = typeAdapter9;
                        }
                        typeAdapter9.write(jsonWriter, bVar2.f2395g);
                    }
                    jsonWriter.name(StubApp.getString2(223));
                    if (bVar2.f2396h == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter10 = this.f2241c;
                        if (typeAdapter10 == null) {
                            typeAdapter10 = this.f2242d.getAdapter(G6.d.class);
                            this.f2241c = typeAdapter10;
                        }
                        typeAdapter10.write(jsonWriter, bVar2.f2396h);
                    }
                    jsonWriter.endObject();
                    break;
                }
            case 2:
                k kVar = (k) obj;
                if (kVar == null) {
                    jsonWriter.nullValue();
                    break;
                } else {
                    jsonWriter.beginObject();
                    jsonWriter.name(StubApp.getString2(660));
                    if (kVar.f2444a == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter11 = this.f2240b;
                        if (typeAdapter11 == null) {
                            typeAdapter11 = this.f2242d.getAdapter(String.class);
                            this.f2240b = typeAdapter11;
                        }
                        typeAdapter11.write(jsonWriter, kVar.f2444a);
                    }
                    jsonWriter.name(StubApp.getString2(2045));
                    if (kVar.f2445b == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter12 = this.f2241c;
                        if (typeAdapter12 == null) {
                            typeAdapter12 = this.f2242d.getAdapter(TypeToken.getParameterized(List.class, G6.g.class));
                            this.f2241c = typeAdapter12;
                        }
                        typeAdapter12.write(jsonWriter, kVar.f2445b);
                    }
                    jsonWriter.name(StubApp.getString2(2046));
                    if (kVar.f2446c == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter13 = this.f2240b;
                        if (typeAdapter13 == null) {
                            typeAdapter13 = this.f2242d.getAdapter(String.class);
                            this.f2240b = typeAdapter13;
                        }
                        typeAdapter13.write(jsonWriter, kVar.f2446c);
                    }
                    jsonWriter.endObject();
                    break;
                }
            case 3:
                l lVar = (l) obj;
                if (lVar == null) {
                    jsonWriter.nullValue();
                    break;
                } else {
                    jsonWriter.beginObject();
                    jsonWriter.name(StubApp.getString2(2043));
                    if (lVar.f2447a == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter14 = this.f2240b;
                        if (typeAdapter14 == null) {
                            typeAdapter14 = this.f2242d.getAdapter(Double.class);
                            this.f2240b = typeAdapter14;
                        }
                        typeAdapter14.write(jsonWriter, lVar.f2447a);
                    }
                    jsonWriter.name(StubApp.getString2(2044));
                    if (lVar.f2448b == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter15 = this.f2240b;
                        if (typeAdapter15 == null) {
                            typeAdapter15 = this.f2242d.getAdapter(Double.class);
                            this.f2240b = typeAdapter15;
                        }
                        typeAdapter15.write(jsonWriter, lVar.f2448b);
                    }
                    jsonWriter.name(string2);
                    if (lVar.f2449c == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter16 = this.f2241c;
                        if (typeAdapter16 == null) {
                            typeAdapter16 = this.f2242d.getAdapter(String.class);
                            this.f2241c = typeAdapter16;
                        }
                        typeAdapter16.write(jsonWriter, lVar.f2449c);
                    }
                    jsonWriter.endObject();
                    break;
                }
            default:
                com.mapbox.api.geocoding.v5.models.e eVar = (com.mapbox.api.geocoding.v5.models.e) obj;
                if (eVar == null) {
                    jsonWriter.nullValue();
                    break;
                } else {
                    jsonWriter.beginObject();
                    jsonWriter.name(string2);
                    if (eVar.f12316a == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter17 = this.f2240b;
                        if (typeAdapter17 == null) {
                            typeAdapter17 = this.f2242d.getAdapter(String.class);
                            this.f2240b = typeAdapter17;
                        }
                        typeAdapter17.write(jsonWriter, eVar.f12316a);
                    }
                    jsonWriter.name(StubApp.getString2(2042));
                    if (eVar.f12317b == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter18 = this.f2241c;
                        if (typeAdapter18 == null) {
                            typeAdapter18 = this.f2242d.getAdapter(double[].class);
                            this.f2241c = typeAdapter18;
                        }
                        typeAdapter18.write(jsonWriter, eVar.f12317b);
                    }
                    jsonWriter.endObject();
                    break;
                }
        }
    }
}
