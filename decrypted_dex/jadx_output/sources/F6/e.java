package F6;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.Closure;
import com.mapbox.api.directions.v5.models.Incident;
import com.mapbox.api.directions.v5.models.LegAnnotation;
import com.mapbox.api.directions.v5.models.Notification;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.stub.StubApp;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e extends TypeAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2252a;

    /* renamed from: b, reason: collision with root package name */
    public volatile TypeAdapter f2253b;

    /* renamed from: c, reason: collision with root package name */
    public volatile TypeAdapter f2254c;

    /* renamed from: d, reason: collision with root package name */
    public volatile TypeAdapter f2255d;

    /* renamed from: e, reason: collision with root package name */
    public volatile TypeAdapter f2256e;

    /* renamed from: f, reason: collision with root package name */
    public final Gson f2257f;

    public /* synthetic */ e(Gson gson, int i3) {
        this.f2252a = i3;
        this.f2257f = gson;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final Object read2(JsonReader jsonReader) {
        String string2;
        String string22 = StubApp.getString2(555);
        LinkedHashMap linkedHashMap = null;
        Double d8 = null;
        switch (this.f2252a) {
            case 0:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                LinkedHashMap linkedHashMap2 = null;
                List list = null;
                LegAnnotation legAnnotation = null;
                List list2 = null;
                List list3 = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                    } else {
                        nextName.getClass();
                        if (StubApp.getString2(2111).equals(nextName)) {
                            TypeAdapter typeAdapter = this.f2253b;
                            if (typeAdapter == null) {
                                typeAdapter = this.f2257f.getAdapter(TypeToken.getParameterized(List.class, Incident.class));
                                this.f2253b = typeAdapter;
                            }
                            list = (List) typeAdapter.read2(jsonReader);
                        } else if (StubApp.getString2(2112).equals(nextName)) {
                            TypeAdapter typeAdapter2 = this.f2254c;
                            if (typeAdapter2 == null) {
                                typeAdapter2 = this.f2257f.getAdapter(LegAnnotation.class);
                                this.f2254c = typeAdapter2;
                            }
                            legAnnotation = (LegAnnotation) typeAdapter2.read2(jsonReader);
                        } else if (StubApp.getString2(2113).equals(nextName)) {
                            TypeAdapter typeAdapter3 = this.f2255d;
                            if (typeAdapter3 == null) {
                                typeAdapter3 = this.f2257f.getAdapter(TypeToken.getParameterized(List.class, Closure.class));
                                this.f2255d = typeAdapter3;
                            }
                            list2 = (List) typeAdapter3.read2(jsonReader);
                        } else if (StubApp.getString2(2114).equals(nextName)) {
                            TypeAdapter typeAdapter4 = this.f2256e;
                            if (typeAdapter4 == null) {
                                typeAdapter4 = this.f2257f.getAdapter(TypeToken.getParameterized(List.class, Notification.class));
                                this.f2256e = typeAdapter4;
                            }
                            list3 = (List) typeAdapter4.read2(jsonReader);
                        } else {
                            if (linkedHashMap == null) {
                                linkedHashMap = new LinkedHashMap();
                                linkedHashMap2 = linkedHashMap;
                            }
                            E1.a.t((JsonElement) this.f2257f.fromJson(jsonReader, JsonElement.class), linkedHashMap, nextName);
                        }
                    }
                }
                jsonReader.endObject();
                return new f(linkedHashMap2, list, legAnnotation, list2, list3);
            case 1:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                Double d10 = null;
                Double d11 = null;
                String str = null;
                String str2 = null;
                Integer num = null;
                List list4 = null;
                String str3 = null;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (jsonReader.peek() != JsonToken.NULL) {
                        nextName2.getClass();
                        char c10 = 65535;
                        switch (nextName2.hashCode()) {
                            case -1613589672:
                                if (nextName2.equals(StubApp.getString2(1142))) {
                                    c10 = 0;
                                    break;
                                }
                                break;
                            case -1439978388:
                                if (nextName2.equals(StubApp.getString2(2044))) {
                                    c10 = 1;
                                    break;
                                }
                                break;
                            case 102976443:
                                if (nextName2.equals(StubApp.getString2(2106))) {
                                    c10 = 2;
                                    break;
                                }
                                break;
                            case 110844025:
                                if (nextName2.equals(StubApp.getString2(2105))) {
                                    c10 = 3;
                                    break;
                                }
                                break;
                            case 137365935:
                                if (nextName2.equals(StubApp.getString2(2043))) {
                                    c10 = 4;
                                    break;
                                }
                                break;
                            case 957831062:
                                if (nextName2.equals(StubApp.getString2(223))) {
                                    c10 = 5;
                                    break;
                                }
                                break;
                            case 1123826999:
                                if (nextName2.equals(StubApp.getString2(2104))) {
                                    c10 = 6;
                                    break;
                                }
                                break;
                        }
                        switch (c10) {
                            case 0:
                                TypeAdapter typeAdapter5 = this.f2254c;
                                if (typeAdapter5 == null) {
                                    typeAdapter5 = this.f2257f.getAdapter(String.class);
                                    this.f2254c = typeAdapter5;
                                }
                                str2 = (String) typeAdapter5.read2(jsonReader);
                                break;
                            case 1:
                                TypeAdapter typeAdapter6 = this.f2253b;
                                if (typeAdapter6 == null) {
                                    typeAdapter6 = this.f2257f.getAdapter(Double.class);
                                    this.f2253b = typeAdapter6;
                                }
                                Double d12 = (Double) typeAdapter6.read2(jsonReader);
                                if (d12 == null) {
                                    throw new NullPointerException(StubApp.getString2(2108));
                                }
                                d11 = d12;
                                break;
                            case 2:
                                TypeAdapter typeAdapter7 = this.f2255d;
                                if (typeAdapter7 == null) {
                                    typeAdapter7 = this.f2257f.getAdapter(Integer.class);
                                    this.f2255d = typeAdapter7;
                                }
                                num = (Integer) typeAdapter7.read2(jsonReader);
                                break;
                            case 3:
                                TypeAdapter typeAdapter8 = this.f2256e;
                                if (typeAdapter8 == null) {
                                    typeAdapter8 = this.f2257f.getAdapter(TypeToken.getParameterized(List.class, String.class));
                                    this.f2256e = typeAdapter8;
                                }
                                list4 = (List) typeAdapter8.read2(jsonReader);
                                break;
                            case 4:
                                TypeAdapter typeAdapter9 = this.f2253b;
                                if (typeAdapter9 == null) {
                                    typeAdapter9 = this.f2257f.getAdapter(Double.class);
                                    this.f2253b = typeAdapter9;
                                }
                                Double d13 = (Double) typeAdapter9.read2(jsonReader);
                                if (d13 == null) {
                                    throw new NullPointerException(StubApp.getString2(2107));
                                }
                                d10 = d13;
                                break;
                            case 5:
                                TypeAdapter typeAdapter10 = this.f2254c;
                                if (typeAdapter10 == null) {
                                    typeAdapter10 = this.f2257f.getAdapter(String.class);
                                    this.f2254c = typeAdapter10;
                                }
                                str = (String) typeAdapter10.read2(jsonReader);
                                break;
                            case 6:
                                TypeAdapter typeAdapter11 = this.f2254c;
                                if (typeAdapter11 == null) {
                                    typeAdapter11 = this.f2257f.getAdapter(String.class);
                                    this.f2254c = typeAdapter11;
                                }
                                str3 = (String) typeAdapter11.read2(jsonReader);
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
                string2 = d10 == null ? StubApp.getString2(2109) : "";
                if (d11 == null) {
                    string2 = string2.concat(StubApp.getString2(2110));
                }
                if (string2.isEmpty()) {
                    return new com.mapbox.api.geocoding.v6.b(d10, d11, str, str2, num, list4, str3);
                }
                throw new IllegalStateException(string22.concat(string2));
            default:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                Double d14 = null;
                Double d15 = null;
                Double d16 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                List list5 = null;
                RouteOptions routeOptions = null;
                String str7 = null;
                String str8 = null;
                while (jsonReader.hasNext()) {
                    String nextName3 = jsonReader.nextName();
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                    } else {
                        nextName3.getClass();
                        if (nextName3.equals(StubApp.getString2(2087))) {
                            TypeAdapter typeAdapter12 = this.f2253b;
                            if (typeAdapter12 == null) {
                                typeAdapter12 = this.f2257f.getAdapter(String.class);
                                this.f2253b = typeAdapter12;
                            }
                            str7 = (String) typeAdapter12.read2(jsonReader);
                        } else if (nextName3.equals(StubApp.getString2(2088))) {
                            TypeAdapter typeAdapter13 = this.f2253b;
                            if (typeAdapter13 == null) {
                                typeAdapter13 = this.f2257f.getAdapter(String.class);
                                this.f2253b = typeAdapter13;
                            }
                            String str9 = (String) typeAdapter13.read2(jsonReader);
                            if (str9 == null) {
                                throw new NullPointerException(StubApp.getString2(2097));
                            }
                            str6 = str9;
                        } else if (StubApp.getString2(2089).equals(nextName3)) {
                            TypeAdapter typeAdapter14 = this.f2253b;
                            if (typeAdapter14 == null) {
                                typeAdapter14 = this.f2257f.getAdapter(String.class);
                                this.f2253b = typeAdapter14;
                            }
                            str4 = (String) typeAdapter14.read2(jsonReader);
                        } else if (StubApp.getString2(2090).equals(nextName3)) {
                            TypeAdapter typeAdapter15 = this.f2254c;
                            if (typeAdapter15 == null) {
                                typeAdapter15 = this.f2257f.getAdapter(Double.class);
                                this.f2254c = typeAdapter15;
                            }
                            d8 = (Double) typeAdapter15.read2(jsonReader);
                            d8.getClass();
                        } else if (StubApp.getString2(2091).equals(nextName3)) {
                            TypeAdapter typeAdapter16 = this.f2254c;
                            if (typeAdapter16 == null) {
                                typeAdapter16 = this.f2257f.getAdapter(Double.class);
                                this.f2254c = typeAdapter16;
                            }
                            d14 = (Double) typeAdapter16.read2(jsonReader);
                            d14.getClass();
                        } else if (StubApp.getString2(2092).equals(nextName3)) {
                            TypeAdapter typeAdapter17 = this.f2253b;
                            if (typeAdapter17 == null) {
                                typeAdapter17 = this.f2257f.getAdapter(String.class);
                                this.f2253b = typeAdapter17;
                            }
                            str5 = (String) typeAdapter17.read2(jsonReader);
                        } else if (StubApp.getString2(2093).equals(nextName3)) {
                            TypeAdapter typeAdapter18 = this.f2254c;
                            if (typeAdapter18 == null) {
                                typeAdapter18 = this.f2257f.getAdapter(Double.class);
                                this.f2254c = typeAdapter18;
                            }
                            d15 = (Double) typeAdapter18.read2(jsonReader);
                            d15.getClass();
                        } else if (StubApp.getString2(2075).equals(nextName3)) {
                            TypeAdapter typeAdapter19 = this.f2255d;
                            if (typeAdapter19 == null) {
                                typeAdapter19 = this.f2257f.getAdapter(TypeToken.getParameterized(List.class, RouteLeg.class));
                                this.f2255d = typeAdapter19;
                            }
                            list5 = (List) typeAdapter19.read2(jsonReader);
                            if (list5 == null) {
                                throw new NullPointerException(StubApp.getString2(2094));
                            }
                        } else if (StubApp.getString2(2072).equals(nextName3)) {
                            TypeAdapter typeAdapter20 = this.f2254c;
                            if (typeAdapter20 == null) {
                                typeAdapter20 = this.f2257f.getAdapter(Double.class);
                                this.f2254c = typeAdapter20;
                            }
                            d16 = (Double) typeAdapter20.read2(jsonReader);
                            d16.getClass();
                        } else if (StubApp.getString2(2095).equals(nextName3)) {
                            TypeAdapter typeAdapter21 = this.f2256e;
                            if (typeAdapter21 == null) {
                                typeAdapter21 = this.f2257f.getAdapter(RouteOptions.class);
                                this.f2256e = typeAdapter21;
                            }
                            routeOptions = (RouteOptions) typeAdapter21.read2(jsonReader);
                        } else if (StubApp.getString2(2096).equals(nextName3)) {
                            TypeAdapter typeAdapter22 = this.f2253b;
                            if (typeAdapter22 == null) {
                                typeAdapter22 = this.f2257f.getAdapter(String.class);
                                this.f2253b = typeAdapter22;
                            }
                            str8 = (String) typeAdapter22.read2(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                }
                jsonReader.endObject();
                string2 = d8 == null ? StubApp.getString2(2098) : "";
                if (d14 == null) {
                    string2 = string2.concat(StubApp.getString2(2099));
                }
                if (d15 == null) {
                    string2 = AbstractC1482f.g(string2, StubApp.getString2(2100));
                }
                if (str6 == null) {
                    string2 = AbstractC1482f.g(string2, StubApp.getString2(2101));
                }
                if (list5 == null) {
                    string2 = AbstractC1482f.g(string2, StubApp.getString2(2102));
                }
                if (d16 == null) {
                    string2 = AbstractC1482f.g(string2, StubApp.getString2(2103));
                }
                if (string2.isEmpty()) {
                    return new com.mapbox.api.matching.v5.models.b(str4, d8.doubleValue(), d14.doubleValue(), str5, d15.doubleValue(), str6, list5, d16.doubleValue(), routeOptions, str7, str8);
                }
                throw new IllegalStateException(string22.concat(string2));
        }
    }

    public final String toString() {
        switch (this.f2252a) {
            case 0:
                return StubApp.getString2(2117);
            case 1:
                return StubApp.getString2(2116);
            default:
                return StubApp.getString2(2115);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) {
        switch (this.f2252a) {
            case 0:
                f fVar = (f) obj;
                if (fVar == null) {
                    jsonWriter.nullValue();
                    break;
                } else {
                    jsonWriter.beginObject();
                    LinkedHashMap linkedHashMap = fVar.f2258a;
                    if (linkedHashMap != null) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            JsonElement jsonElement = ((com.mapbox.auto.value.gson.b) entry.getValue()).f12374a;
                            E1.a.s(jsonElement, this.f2257f, jsonWriter, jsonElement);
                        }
                    }
                    jsonWriter.name(StubApp.getString2(2111));
                    if (fVar.f2259b == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter = this.f2253b;
                        if (typeAdapter == null) {
                            typeAdapter = this.f2257f.getAdapter(TypeToken.getParameterized(List.class, Incident.class));
                            this.f2253b = typeAdapter;
                        }
                        typeAdapter.write(jsonWriter, fVar.f2259b);
                    }
                    jsonWriter.name(StubApp.getString2(2112));
                    if (fVar.f2260c == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter2 = this.f2254c;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.f2257f.getAdapter(LegAnnotation.class);
                            this.f2254c = typeAdapter2;
                        }
                        typeAdapter2.write(jsonWriter, fVar.f2260c);
                    }
                    jsonWriter.name(StubApp.getString2(2113));
                    if (fVar.f2261d == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter3 = this.f2255d;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.f2257f.getAdapter(TypeToken.getParameterized(List.class, Closure.class));
                            this.f2255d = typeAdapter3;
                        }
                        typeAdapter3.write(jsonWriter, fVar.f2261d);
                    }
                    jsonWriter.name(StubApp.getString2(2114));
                    if (fVar.f2262e == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter4 = this.f2256e;
                        if (typeAdapter4 == null) {
                            typeAdapter4 = this.f2257f.getAdapter(TypeToken.getParameterized(List.class, Notification.class));
                            this.f2256e = typeAdapter4;
                        }
                        typeAdapter4.write(jsonWriter, fVar.f2262e);
                    }
                    jsonWriter.endObject();
                    break;
                }
            case 1:
                com.mapbox.api.geocoding.v6.b bVar = (com.mapbox.api.geocoding.v6.b) obj;
                if (bVar == null) {
                    jsonWriter.nullValue();
                    break;
                } else {
                    jsonWriter.beginObject();
                    jsonWriter.name(StubApp.getString2(2043));
                    if (bVar.f12336a == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter5 = this.f2253b;
                        if (typeAdapter5 == null) {
                            typeAdapter5 = this.f2257f.getAdapter(Double.class);
                            this.f2253b = typeAdapter5;
                        }
                        typeAdapter5.write(jsonWriter, bVar.f12336a);
                    }
                    jsonWriter.name(StubApp.getString2(2044));
                    if (bVar.f12337b == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter6 = this.f2253b;
                        if (typeAdapter6 == null) {
                            typeAdapter6 = this.f2257f.getAdapter(Double.class);
                            this.f2253b = typeAdapter6;
                        }
                        typeAdapter6.write(jsonWriter, bVar.f12337b);
                    }
                    jsonWriter.name(StubApp.getString2(223));
                    if (bVar.f12338c == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter7 = this.f2254c;
                        if (typeAdapter7 == null) {
                            typeAdapter7 = this.f2257f.getAdapter(String.class);
                            this.f2254c = typeAdapter7;
                        }
                        typeAdapter7.write(jsonWriter, bVar.f12338c);
                    }
                    jsonWriter.name(StubApp.getString2(1142));
                    if (bVar.f12339d == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter8 = this.f2254c;
                        if (typeAdapter8 == null) {
                            typeAdapter8 = this.f2257f.getAdapter(String.class);
                            this.f2254c = typeAdapter8;
                        }
                        typeAdapter8.write(jsonWriter, bVar.f12339d);
                    }
                    jsonWriter.name(StubApp.getString2(2106));
                    if (bVar.f12340e == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter9 = this.f2255d;
                        if (typeAdapter9 == null) {
                            typeAdapter9 = this.f2257f.getAdapter(Integer.class);
                            this.f2255d = typeAdapter9;
                        }
                        typeAdapter9.write(jsonWriter, bVar.f12340e);
                    }
                    jsonWriter.name(StubApp.getString2(2105));
                    if (bVar.f12341f == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter10 = this.f2256e;
                        if (typeAdapter10 == null) {
                            typeAdapter10 = this.f2257f.getAdapter(TypeToken.getParameterized(List.class, String.class));
                            this.f2256e = typeAdapter10;
                        }
                        typeAdapter10.write(jsonWriter, bVar.f12341f);
                    }
                    jsonWriter.name(StubApp.getString2(2104));
                    if (bVar.f12342g == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter11 = this.f2254c;
                        if (typeAdapter11 == null) {
                            typeAdapter11 = this.f2257f.getAdapter(String.class);
                            this.f2254c = typeAdapter11;
                        }
                        typeAdapter11.write(jsonWriter, bVar.f12342g);
                    }
                    jsonWriter.endObject();
                    break;
                }
            default:
                com.mapbox.api.matching.v5.models.e eVar = (com.mapbox.api.matching.v5.models.e) obj;
                if (eVar == null) {
                    jsonWriter.nullValue();
                    break;
                } else {
                    jsonWriter.beginObject();
                    jsonWriter.name(StubApp.getString2(2089));
                    com.mapbox.api.matching.v5.models.b bVar2 = (com.mapbox.api.matching.v5.models.b) eVar;
                    if (bVar2.f12345a == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter12 = this.f2253b;
                        if (typeAdapter12 == null) {
                            typeAdapter12 = this.f2257f.getAdapter(String.class);
                            this.f2253b = typeAdapter12;
                        }
                        typeAdapter12.write(jsonWriter, bVar2.f12345a);
                    }
                    jsonWriter.name(StubApp.getString2(2090));
                    TypeAdapter typeAdapter13 = this.f2254c;
                    if (typeAdapter13 == null) {
                        typeAdapter13 = this.f2257f.getAdapter(Double.class);
                        this.f2254c = typeAdapter13;
                    }
                    typeAdapter13.write(jsonWriter, Double.valueOf(bVar2.f12346b));
                    jsonWriter.name(StubApp.getString2(2091));
                    TypeAdapter typeAdapter14 = this.f2254c;
                    if (typeAdapter14 == null) {
                        typeAdapter14 = this.f2257f.getAdapter(Double.class);
                        this.f2254c = typeAdapter14;
                    }
                    typeAdapter14.write(jsonWriter, Double.valueOf(bVar2.f12347c));
                    jsonWriter.name(StubApp.getString2(2092));
                    if (bVar2.f12348d == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter15 = this.f2253b;
                        if (typeAdapter15 == null) {
                            typeAdapter15 = this.f2257f.getAdapter(String.class);
                            this.f2253b = typeAdapter15;
                        }
                        typeAdapter15.write(jsonWriter, bVar2.f12348d);
                    }
                    jsonWriter.name(StubApp.getString2(2093));
                    TypeAdapter typeAdapter16 = this.f2254c;
                    if (typeAdapter16 == null) {
                        typeAdapter16 = this.f2257f.getAdapter(Double.class);
                        this.f2254c = typeAdapter16;
                    }
                    typeAdapter16.write(jsonWriter, Double.valueOf(bVar2.f12349e));
                    jsonWriter.name(StubApp.getString2(2088));
                    if (bVar2.f12350f == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter17 = this.f2253b;
                        if (typeAdapter17 == null) {
                            typeAdapter17 = this.f2257f.getAdapter(String.class);
                            this.f2253b = typeAdapter17;
                        }
                        typeAdapter17.write(jsonWriter, bVar2.f12350f);
                    }
                    jsonWriter.name(StubApp.getString2(2075));
                    if (bVar2.f12351g == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter18 = this.f2255d;
                        if (typeAdapter18 == null) {
                            typeAdapter18 = this.f2257f.getAdapter(TypeToken.getParameterized(List.class, RouteLeg.class));
                            this.f2255d = typeAdapter18;
                        }
                        typeAdapter18.write(jsonWriter, bVar2.f12351g);
                    }
                    jsonWriter.name(StubApp.getString2(2072));
                    TypeAdapter typeAdapter19 = this.f2254c;
                    if (typeAdapter19 == null) {
                        typeAdapter19 = this.f2257f.getAdapter(Double.class);
                        this.f2254c = typeAdapter19;
                    }
                    typeAdapter19.write(jsonWriter, Double.valueOf(bVar2.f12352h));
                    jsonWriter.name(StubApp.getString2(2095));
                    if (bVar2.j == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter20 = this.f2256e;
                        if (typeAdapter20 == null) {
                            typeAdapter20 = this.f2257f.getAdapter(RouteOptions.class);
                            this.f2256e = typeAdapter20;
                        }
                        typeAdapter20.write(jsonWriter, bVar2.j);
                    }
                    jsonWriter.name(StubApp.getString2(2087));
                    if (bVar2.f12353k == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter21 = this.f2253b;
                        if (typeAdapter21 == null) {
                            typeAdapter21 = this.f2257f.getAdapter(String.class);
                            this.f2253b = typeAdapter21;
                        }
                        typeAdapter21.write(jsonWriter, bVar2.f12353k);
                    }
                    jsonWriter.name(StubApp.getString2(2096));
                    if (bVar2.f12354l == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter22 = this.f2253b;
                        if (typeAdapter22 == null) {
                            typeAdapter22 = this.f2257f.getAdapter(String.class);
                            this.f2253b = typeAdapter22;
                        }
                        typeAdapter22.write(jsonWriter, bVar2.f12354l);
                    }
                    jsonWriter.endObject();
                    break;
                }
        }
    }
}
