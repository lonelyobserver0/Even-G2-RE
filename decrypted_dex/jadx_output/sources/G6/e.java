package G6;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.DirectionsWaypoint;
import com.mapbox.geojson.Geometry;
import com.stub.StubApp;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e extends TypeAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2405a;

    /* renamed from: b, reason: collision with root package name */
    public volatile TypeAdapter f2406b;

    /* renamed from: c, reason: collision with root package name */
    public volatile TypeAdapter f2407c;

    /* renamed from: d, reason: collision with root package name */
    public volatile TypeAdapter f2408d;

    /* renamed from: e, reason: collision with root package name */
    public final Gson f2409e;

    public /* synthetic */ e(Gson gson, int i3) {
        this.f2405a = i3;
        this.f2409e = gson;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:520:0x07ed. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r11v20 */
    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final Object read2(JsonReader jsonReader) {
        char c10;
        char c11;
        ?? r11;
        char c12;
        char c13;
        String string2 = StubApp.getString2(2256);
        String string22 = StubApp.getString2(2257);
        String string23 = StubApp.getString2(660);
        String string24 = StubApp.getString2(2054);
        String string25 = StubApp.getString2(2052);
        String string26 = StubApp.getString2(ModuleDescriptor.MODULE_VERSION);
        String string27 = StubApp.getString2(662);
        String string28 = StubApp.getString2(2258);
        String string29 = StubApp.getString2(1052);
        String string210 = StubApp.getString2(555);
        Integer num = null;
        switch (this.f2405a) {
            case 0:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                Double d8 = null;
                Double d10 = null;
                String str = null;
                List list = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    if (jsonReader.peek() != JsonToken.NULL) {
                        nextName.getClass();
                        switch (nextName.hashCode()) {
                            case -2131707655:
                                if (nextName.equals(StubApp.getString2(1106))) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1439978388:
                                if (nextName.equals(StubApp.getString2(2044))) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 137365935:
                                if (nextName.equals(StubApp.getString2(2043))) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1335332940:
                                if (nextName.equals(StubApp.getString2(2286))) {
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
                                TypeAdapter typeAdapter = this.f2407c;
                                if (typeAdapter == null) {
                                    typeAdapter = this.f2409e.getAdapter(String.class);
                                    this.f2407c = typeAdapter;
                                }
                                str = (String) typeAdapter.read2(jsonReader);
                                break;
                            case 1:
                                TypeAdapter typeAdapter2 = this.f2406b;
                                if (typeAdapter2 == null) {
                                    typeAdapter2 = this.f2409e.getAdapter(Double.class);
                                    this.f2406b = typeAdapter2;
                                }
                                d10 = (Double) typeAdapter2.read2(jsonReader);
                                break;
                            case 2:
                                TypeAdapter typeAdapter3 = this.f2406b;
                                if (typeAdapter3 == null) {
                                    typeAdapter3 = this.f2409e.getAdapter(Double.class);
                                    this.f2406b = typeAdapter3;
                                }
                                d8 = (Double) typeAdapter3.read2(jsonReader);
                                break;
                            case 3:
                                TypeAdapter typeAdapter4 = this.f2408d;
                                if (typeAdapter4 == null) {
                                    typeAdapter4 = this.f2409e.getAdapter(TypeToken.getParameterized(List.class, l.class));
                                    this.f2408d = typeAdapter4;
                                }
                                list = (List) typeAdapter4.read2(jsonReader);
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
                return new f(d8, d10, str, list);
            case 1:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                LinkedHashMap linkedHashMap = null;
                String str2 = null;
                String str3 = null;
                Geometry geometry = null;
                j jVar = null;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (jsonReader.peek() != JsonToken.NULL) {
                        nextName2.getClass();
                        switch (nextName2.hashCode()) {
                            case -926053069:
                                if (nextName2.equals(StubApp.getString2(2279))) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3355:
                                if (nextName2.equals(StubApp.getString2(290))) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3575610:
                                if (nextName2.equals(string23)) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1846020210:
                                if (nextName2.equals(StubApp.getString2(2092))) {
                                    c11 = 3;
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
                                TypeAdapter typeAdapter5 = this.f2408d;
                                if (typeAdapter5 == null) {
                                    typeAdapter5 = this.f2409e.getAdapter(j.class);
                                    this.f2408d = typeAdapter5;
                                }
                                jVar = (j) typeAdapter5.read2(jsonReader);
                                if (jVar == null) {
                                    throw new NullPointerException(StubApp.getString2(2282));
                                }
                                break;
                            case 1:
                                TypeAdapter typeAdapter6 = this.f2406b;
                                if (typeAdapter6 == null) {
                                    typeAdapter6 = this.f2409e.getAdapter(String.class);
                                    this.f2406b = typeAdapter6;
                                }
                                str2 = (String) typeAdapter6.read2(jsonReader);
                                if (str2 == null) {
                                    throw new NullPointerException(StubApp.getString2(2281));
                                }
                                break;
                            case 2:
                                TypeAdapter typeAdapter7 = this.f2406b;
                                if (typeAdapter7 == null) {
                                    typeAdapter7 = this.f2409e.getAdapter(String.class);
                                    this.f2406b = typeAdapter7;
                                }
                                str3 = (String) typeAdapter7.read2(jsonReader);
                                if (str3 == null) {
                                    throw new NullPointerException(string22);
                                }
                                break;
                            case 3:
                                TypeAdapter typeAdapter8 = this.f2407c;
                                if (typeAdapter8 == null) {
                                    typeAdapter8 = this.f2409e.getAdapter(Geometry.class);
                                    this.f2407c = typeAdapter8;
                                }
                                geometry = (Geometry) typeAdapter8.read2(jsonReader);
                                if (geometry == null) {
                                    throw new NullPointerException(StubApp.getString2(2280));
                                }
                                break;
                            default:
                                if (num == null) {
                                    linkedHashMap = new LinkedHashMap();
                                    r11 = linkedHashMap;
                                } else {
                                    r11 = num;
                                }
                                E1.a.t((JsonElement) this.f2409e.fromJson(jsonReader, JsonElement.class), r11, nextName2);
                                num = r11;
                                break;
                        }
                    } else {
                        jsonReader.nextNull();
                    }
                }
                jsonReader.endObject();
                String string211 = str2 == null ? StubApp.getString2(2283) : "";
                if (str3 == null) {
                    string211 = string211.concat(string2);
                }
                if (geometry == null) {
                    string211 = AbstractC1482f.g(string211, StubApp.getString2(2284));
                }
                if (jVar == null) {
                    string211 = AbstractC1482f.g(string211, StubApp.getString2(2285));
                }
                if (string211.isEmpty()) {
                    return new g(linkedHashMap, str2, str3, geometry, jVar);
                }
                throw new IllegalStateException(string210.concat(string211));
            case 2:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                String str4 = null;
                List list2 = null;
                List list3 = null;
                List list4 = null;
                List list5 = null;
                while (jsonReader.hasNext()) {
                    String nextName3 = jsonReader.nextName();
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                    } else {
                        nextName3.getClass();
                        if (string29.equals(nextName3)) {
                            TypeAdapter typeAdapter9 = this.f2406b;
                            if (typeAdapter9 == null) {
                                typeAdapter9 = this.f2409e.getAdapter(String.class);
                                this.f2406b = typeAdapter9;
                            }
                            str4 = (String) typeAdapter9.read2(jsonReader);
                            if (str4 == null) {
                                throw new NullPointerException(string25);
                            }
                        } else if (StubApp.getString2(2275).equals(nextName3)) {
                            TypeAdapter typeAdapter10 = this.f2407c;
                            if (typeAdapter10 == null) {
                                typeAdapter10 = this.f2409e.getAdapter(TypeToken.getParameterized(List.class, DirectionsWaypoint.class));
                                this.f2407c = typeAdapter10;
                            }
                            list2 = (List) typeAdapter10.read2(jsonReader);
                        } else if (StubApp.getString2(2276).equals(nextName3)) {
                            TypeAdapter typeAdapter11 = this.f2407c;
                            if (typeAdapter11 == null) {
                                typeAdapter11 = this.f2409e.getAdapter(TypeToken.getParameterized(List.class, DirectionsWaypoint.class));
                                this.f2407c = typeAdapter11;
                            }
                            list3 = (List) typeAdapter11.read2(jsonReader);
                        } else if (StubApp.getString2(2277).equals(nextName3)) {
                            TypeAdapter typeAdapter12 = this.f2408d;
                            if (typeAdapter12 == null) {
                                typeAdapter12 = this.f2409e.getAdapter(TypeToken.getParameterized(List.class, Double[].class));
                                this.f2408d = typeAdapter12;
                            }
                            list4 = (List) typeAdapter12.read2(jsonReader);
                        } else if (StubApp.getString2(2278).equals(nextName3)) {
                            TypeAdapter typeAdapter13 = this.f2408d;
                            if (typeAdapter13 == null) {
                                typeAdapter13 = this.f2409e.getAdapter(TypeToken.getParameterized(List.class, Double[].class));
                                this.f2408d = typeAdapter13;
                            }
                            list5 = (List) typeAdapter13.read2(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                }
                jsonReader.endObject();
                String str5 = str4 == null ? string24 : "";
                if (str5.isEmpty()) {
                    return new H6.a(str4, list2, list3, list4, list5);
                }
                throw new IllegalStateException(string210.concat(str5));
            case 3:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                String string212 = StubApp.getString2(2267);
                List list6 = null;
                List list7 = null;
                String str6 = null;
                while (jsonReader.hasNext()) {
                    String nextName4 = jsonReader.nextName();
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                    } else {
                        nextName4.getClass();
                        if (string23.equals(nextName4)) {
                            TypeAdapter typeAdapter14 = this.f2406b;
                            if (typeAdapter14 == null) {
                                typeAdapter14 = this.f2409e.getAdapter(String.class);
                                this.f2406b = typeAdapter14;
                            }
                            string212 = (String) typeAdapter14.read2(jsonReader);
                            if (string212 == null) {
                                throw new NullPointerException(string22);
                            }
                        } else if (StubApp.getString2(2268).equals(nextName4)) {
                            TypeAdapter typeAdapter15 = this.f2407c;
                            if (typeAdapter15 == null) {
                                typeAdapter15 = this.f2409e.getAdapter(TypeToken.getParameterized(List.class, String.class));
                                this.f2407c = typeAdapter15;
                            }
                            list6 = (List) typeAdapter15.read2(jsonReader);
                            if (list6 == null) {
                                throw new NullPointerException(StubApp.getString2(2269));
                            }
                        } else if (StubApp.getString2(2045).equals(nextName4)) {
                            TypeAdapter typeAdapter16 = this.f2408d;
                            if (typeAdapter16 == null) {
                                typeAdapter16 = this.f2409e.getAdapter(TypeToken.getParameterized(List.class, com.mapbox.api.geocoding.v5.models.c.class));
                                this.f2408d = typeAdapter16;
                            }
                            list7 = (List) typeAdapter16.read2(jsonReader);
                            if (list7 == null) {
                                throw new NullPointerException(StubApp.getString2(2270));
                            }
                        } else if (StubApp.getString2(2046).equals(nextName4)) {
                            TypeAdapter typeAdapter17 = this.f2406b;
                            if (typeAdapter17 == null) {
                                typeAdapter17 = this.f2409e.getAdapter(String.class);
                                this.f2406b = typeAdapter17;
                            }
                            str6 = (String) typeAdapter17.read2(jsonReader);
                            if (str6 == null) {
                                throw new NullPointerException(StubApp.getString2(2271));
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                }
                jsonReader.endObject();
                if (string212 != null) {
                    string2 = "";
                }
                if (list6 == null) {
                    string2 = string2.concat(StubApp.getString2(2272));
                }
                if (list7 == null) {
                    string2 = AbstractC1482f.g(string2, StubApp.getString2(2273));
                }
                if (str6 == null) {
                    string2 = AbstractC1482f.g(string2, StubApp.getString2(2274));
                }
                if (string2.isEmpty()) {
                    return new com.mapbox.api.geocoding.v5.models.d(string212, str6, list6, list7);
                }
                throw new IllegalStateException(string210.concat(string2));
            case 4:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                String str7 = null;
                String str8 = null;
                List list8 = null;
                List list9 = null;
                while (jsonReader.hasNext()) {
                    String nextName5 = jsonReader.nextName();
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                    } else {
                        nextName5.getClass();
                        if (string29.equals(nextName5)) {
                            TypeAdapter typeAdapter18 = this.f2406b;
                            if (typeAdapter18 == null) {
                                typeAdapter18 = this.f2409e.getAdapter(String.class);
                                this.f2406b = typeAdapter18;
                            }
                            str7 = (String) typeAdapter18.read2(jsonReader);
                            if (str7 == null) {
                                throw new NullPointerException(string25);
                            }
                        } else if (StubApp.getString2(1905).equals(nextName5)) {
                            TypeAdapter typeAdapter19 = this.f2406b;
                            if (typeAdapter19 == null) {
                                typeAdapter19 = this.f2409e.getAdapter(String.class);
                                this.f2406b = typeAdapter19;
                            }
                            str8 = (String) typeAdapter19.read2(jsonReader);
                        } else if (StubApp.getString2(2265).equals(nextName5)) {
                            TypeAdapter typeAdapter20 = this.f2407c;
                            if (typeAdapter20 == null) {
                                typeAdapter20 = this.f2409e.getAdapter(TypeToken.getParameterized(List.class, com.mapbox.api.matching.v5.models.e.class));
                                this.f2407c = typeAdapter20;
                            }
                            list8 = (List) typeAdapter20.read2(jsonReader);
                        } else if (StubApp.getString2(2266).equals(nextName5)) {
                            TypeAdapter typeAdapter21 = this.f2408d;
                            if (typeAdapter21 == null) {
                                typeAdapter21 = this.f2409e.getAdapter(TypeToken.getParameterized(List.class, com.mapbox.api.matching.v5.models.d.class));
                                this.f2408d = typeAdapter21;
                            }
                            list9 = (List) typeAdapter21.read2(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                }
                jsonReader.endObject();
                String str9 = str7 == null ? string24 : "";
                if (str9.isEmpty()) {
                    return new com.mapbox.api.matching.v5.models.c(str7, str8, list8, list9);
                }
                throw new IllegalStateException(string210.concat(str9));
            case 5:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                Integer num2 = null;
                Integer num3 = null;
                Integer num4 = null;
                String str10 = null;
                double[] dArr = null;
                while (jsonReader.hasNext()) {
                    String nextName6 = jsonReader.nextName();
                    if (jsonReader.peek() != JsonToken.NULL) {
                        nextName6.getClass();
                        switch (nextName6.hashCode()) {
                            case -2146142359:
                                if (nextName6.equals(StubApp.getString2(2264))) {
                                    c12 = 0;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -1874027018:
                                if (nextName6.equals(StubApp.getString2(2263))) {
                                    c12 = 1;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 601411348:
                                if (nextName6.equals(string28)) {
                                    c12 = 2;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 1901043637:
                                if (nextName6.equals(string27)) {
                                    c12 = 3;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            default:
                                c12 = 65535;
                                break;
                        }
                        switch (c12) {
                            case 0:
                                TypeAdapter typeAdapter22 = this.f2406b;
                                if (typeAdapter22 == null) {
                                    typeAdapter22 = this.f2409e.getAdapter(Integer.class);
                                    this.f2406b = typeAdapter22;
                                }
                                num2 = (Integer) typeAdapter22.read2(jsonReader);
                                break;
                            case 1:
                                TypeAdapter typeAdapter23 = this.f2406b;
                                if (typeAdapter23 == null) {
                                    typeAdapter23 = this.f2409e.getAdapter(Integer.class);
                                    this.f2406b = typeAdapter23;
                                }
                                num3 = (Integer) typeAdapter23.read2(jsonReader);
                                break;
                            case 2:
                                TypeAdapter typeAdapter24 = this.f2406b;
                                if (typeAdapter24 == null) {
                                    typeAdapter24 = this.f2409e.getAdapter(Integer.class);
                                    this.f2406b = typeAdapter24;
                                }
                                num4 = (Integer) typeAdapter24.read2(jsonReader);
                                break;
                            case 3:
                                TypeAdapter typeAdapter25 = this.f2408d;
                                if (typeAdapter25 == null) {
                                    typeAdapter25 = this.f2409e.getAdapter(double[].class);
                                    this.f2408d = typeAdapter25;
                                }
                                dArr = (double[]) typeAdapter25.read2(jsonReader);
                                break;
                            default:
                                if (!string26.equals(nextName6)) {
                                    jsonReader.skipValue();
                                    break;
                                } else {
                                    TypeAdapter typeAdapter26 = this.f2407c;
                                    if (typeAdapter26 == null) {
                                        typeAdapter26 = this.f2409e.getAdapter(String.class);
                                        this.f2407c = typeAdapter26;
                                    }
                                    str10 = (String) typeAdapter26.read2(jsonReader);
                                    break;
                                }
                        }
                    } else {
                        jsonReader.nextNull();
                    }
                }
                jsonReader.endObject();
                return new com.mapbox.api.matching.v5.models.d(num2, num3, num4, str10, dArr);
            case 6:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                String str11 = null;
                List list10 = null;
                List list11 = null;
                while (jsonReader.hasNext()) {
                    String nextName7 = jsonReader.nextName();
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                    } else {
                        nextName7.getClass();
                        if (string29.equals(nextName7)) {
                            TypeAdapter typeAdapter27 = this.f2406b;
                            if (typeAdapter27 == null) {
                                typeAdapter27 = this.f2409e.getAdapter(String.class);
                                this.f2406b = typeAdapter27;
                            }
                            str11 = (String) typeAdapter27.read2(jsonReader);
                        } else if (StubApp.getString2(1913).equals(nextName7)) {
                            TypeAdapter typeAdapter28 = this.f2407c;
                            if (typeAdapter28 == null) {
                                typeAdapter28 = this.f2409e.getAdapter(TypeToken.getParameterized(List.class, com.mapbox.api.optimization.v1.models.b.class));
                                this.f2407c = typeAdapter28;
                            }
                            list10 = (List) typeAdapter28.read2(jsonReader);
                        } else if (StubApp.getString2(2262).equals(nextName7)) {
                            TypeAdapter typeAdapter29 = this.f2408d;
                            if (typeAdapter29 == null) {
                                typeAdapter29 = this.f2409e.getAdapter(TypeToken.getParameterized(List.class, DirectionsRoute.class));
                                this.f2408d = typeAdapter29;
                            }
                            list11 = (List) typeAdapter29.read2(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                }
                jsonReader.endObject();
                return new com.mapbox.api.optimization.v1.models.a(str11, list10, list11);
            default:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                Integer num5 = null;
                String str12 = null;
                double[] dArr2 = null;
                while (jsonReader.hasNext()) {
                    String nextName8 = jsonReader.nextName();
                    if (jsonReader.peek() != JsonToken.NULL) {
                        nextName8.getClass();
                        switch (nextName8.hashCode()) {
                            case -294735295:
                                if (nextName8.equals(StubApp.getString2(2259))) {
                                    c13 = 0;
                                    break;
                                }
                                c13 = 65535;
                                break;
                            case 601411348:
                                if (nextName8.equals(string28)) {
                                    c13 = 1;
                                    break;
                                }
                                c13 = 65535;
                                break;
                            case 1901043637:
                                if (nextName8.equals(string27)) {
                                    c13 = 2;
                                    break;
                                }
                                c13 = 65535;
                                break;
                            default:
                                c13 = 65535;
                                break;
                        }
                        switch (c13) {
                            case 0:
                                TypeAdapter typeAdapter30 = this.f2406b;
                                if (typeAdapter30 == null) {
                                    typeAdapter30 = this.f2409e.getAdapter(Integer.class);
                                    this.f2406b = typeAdapter30;
                                }
                                num5 = (Integer) typeAdapter30.read2(jsonReader);
                                num5.getClass();
                                break;
                            case 1:
                                TypeAdapter typeAdapter31 = this.f2406b;
                                if (typeAdapter31 == null) {
                                    typeAdapter31 = this.f2409e.getAdapter(Integer.class);
                                    this.f2406b = typeAdapter31;
                                }
                                Integer num6 = (Integer) typeAdapter31.read2(jsonReader);
                                num6.getClass();
                                num = num6;
                                break;
                            case 2:
                                TypeAdapter typeAdapter32 = this.f2408d;
                                if (typeAdapter32 == null) {
                                    typeAdapter32 = this.f2409e.getAdapter(double[].class);
                                    this.f2408d = typeAdapter32;
                                }
                                dArr2 = (double[]) typeAdapter32.read2(jsonReader);
                                break;
                            default:
                                if (!string26.equals(nextName8)) {
                                    jsonReader.skipValue();
                                    break;
                                } else {
                                    TypeAdapter typeAdapter33 = this.f2407c;
                                    if (typeAdapter33 == null) {
                                        typeAdapter33 = this.f2409e.getAdapter(String.class);
                                        this.f2407c = typeAdapter33;
                                    }
                                    str12 = (String) typeAdapter33.read2(jsonReader);
                                    break;
                                }
                        }
                    } else {
                        jsonReader.nextNull();
                    }
                }
                jsonReader.endObject();
                String string213 = num == null ? StubApp.getString2(2260) : "";
                if (num5 == null) {
                    string213 = string213.concat(StubApp.getString2(2261));
                }
                if (string213.isEmpty()) {
                    return new com.mapbox.api.optimization.v1.models.b(num.intValue(), num5.intValue(), str12, dArr2);
                }
                throw new IllegalStateException(string210.concat(string213));
        }
    }

    public final String toString() {
        switch (this.f2405a) {
            case 0:
                return StubApp.getString2(2294);
            case 1:
                return StubApp.getString2(2293);
            case 2:
                return StubApp.getString2(2292);
            case 3:
                return StubApp.getString2(2291);
            case 4:
                return StubApp.getString2(2290);
            case 5:
                return StubApp.getString2(2289);
            case 6:
                return StubApp.getString2(2288);
            default:
                return StubApp.getString2(2287);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) {
        String string2 = StubApp.getString2(660);
        String string22 = StubApp.getString2(662);
        String string23 = StubApp.getString2(ModuleDescriptor.MODULE_VERSION);
        String string24 = StubApp.getString2(2258);
        String string25 = StubApp.getString2(1052);
        switch (this.f2405a) {
            case 0:
                f fVar = (f) obj;
                if (fVar == null) {
                    jsonWriter.nullValue();
                    break;
                } else {
                    jsonWriter.beginObject();
                    jsonWriter.name(StubApp.getString2(2043));
                    if (fVar.f2410a == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter = this.f2406b;
                        if (typeAdapter == null) {
                            typeAdapter = this.f2409e.getAdapter(Double.class);
                            this.f2406b = typeAdapter;
                        }
                        typeAdapter.write(jsonWriter, fVar.f2410a);
                    }
                    jsonWriter.name(StubApp.getString2(2044));
                    if (fVar.f2411b == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter2 = this.f2406b;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.f2409e.getAdapter(Double.class);
                            this.f2406b = typeAdapter2;
                        }
                        typeAdapter2.write(jsonWriter, fVar.f2411b);
                    }
                    jsonWriter.name(StubApp.getString2(1106));
                    if (fVar.f2412c == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter3 = this.f2407c;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.f2409e.getAdapter(String.class);
                            this.f2407c = typeAdapter3;
                        }
                        typeAdapter3.write(jsonWriter, fVar.f2412c);
                    }
                    jsonWriter.name(StubApp.getString2(2286));
                    if (fVar.f2413d == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter4 = this.f2408d;
                        if (typeAdapter4 == null) {
                            typeAdapter4 = this.f2409e.getAdapter(TypeToken.getParameterized(List.class, l.class));
                            this.f2408d = typeAdapter4;
                        }
                        typeAdapter4.write(jsonWriter, fVar.f2413d);
                    }
                    jsonWriter.endObject();
                    break;
                }
            case 1:
                g gVar = (g) obj;
                if (gVar == null) {
                    jsonWriter.nullValue();
                    break;
                } else {
                    jsonWriter.beginObject();
                    LinkedHashMap linkedHashMap = gVar.f2414a;
                    if (linkedHashMap != null) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            JsonElement jsonElement = ((com.mapbox.auto.value.gson.b) entry.getValue()).f12374a;
                            E1.a.s(jsonElement, this.f2409e, jsonWriter, jsonElement);
                        }
                    }
                    jsonWriter.name(StubApp.getString2(290));
                    if (gVar.f2415b == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter5 = this.f2406b;
                        if (typeAdapter5 == null) {
                            typeAdapter5 = this.f2409e.getAdapter(String.class);
                            this.f2406b = typeAdapter5;
                        }
                        typeAdapter5.write(jsonWriter, gVar.f2415b);
                    }
                    jsonWriter.name(string2);
                    if (gVar.f2416c == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter6 = this.f2406b;
                        if (typeAdapter6 == null) {
                            typeAdapter6 = this.f2409e.getAdapter(String.class);
                            this.f2406b = typeAdapter6;
                        }
                        typeAdapter6.write(jsonWriter, gVar.f2416c);
                    }
                    jsonWriter.name(StubApp.getString2(2092));
                    if (gVar.f2417d == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter7 = this.f2407c;
                        if (typeAdapter7 == null) {
                            typeAdapter7 = this.f2409e.getAdapter(Geometry.class);
                            this.f2407c = typeAdapter7;
                        }
                        typeAdapter7.write(jsonWriter, gVar.f2417d);
                    }
                    jsonWriter.name(StubApp.getString2(2279));
                    if (gVar.f2418e == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter8 = this.f2408d;
                        if (typeAdapter8 == null) {
                            typeAdapter8 = this.f2409e.getAdapter(j.class);
                            this.f2408d = typeAdapter8;
                        }
                        typeAdapter8.write(jsonWriter, gVar.f2418e);
                    }
                    jsonWriter.endObject();
                    break;
                }
            case 2:
                H6.a aVar = (H6.a) obj;
                if (aVar == null) {
                    jsonWriter.nullValue();
                    break;
                } else {
                    jsonWriter.beginObject();
                    jsonWriter.name(string25);
                    if (aVar.f2925a == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter9 = this.f2406b;
                        if (typeAdapter9 == null) {
                            typeAdapter9 = this.f2409e.getAdapter(String.class);
                            this.f2406b = typeAdapter9;
                        }
                        typeAdapter9.write(jsonWriter, aVar.f2925a);
                    }
                    jsonWriter.name(StubApp.getString2(2275));
                    if (aVar.f2926b == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter10 = this.f2407c;
                        if (typeAdapter10 == null) {
                            typeAdapter10 = this.f2409e.getAdapter(TypeToken.getParameterized(List.class, DirectionsWaypoint.class));
                            this.f2407c = typeAdapter10;
                        }
                        typeAdapter10.write(jsonWriter, aVar.f2926b);
                    }
                    jsonWriter.name(StubApp.getString2(2276));
                    if (aVar.f2927c == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter11 = this.f2407c;
                        if (typeAdapter11 == null) {
                            typeAdapter11 = this.f2409e.getAdapter(TypeToken.getParameterized(List.class, DirectionsWaypoint.class));
                            this.f2407c = typeAdapter11;
                        }
                        typeAdapter11.write(jsonWriter, aVar.f2927c);
                    }
                    jsonWriter.name(StubApp.getString2(2277));
                    if (aVar.f2928d == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter12 = this.f2408d;
                        if (typeAdapter12 == null) {
                            typeAdapter12 = this.f2409e.getAdapter(TypeToken.getParameterized(List.class, Double[].class));
                            this.f2408d = typeAdapter12;
                        }
                        typeAdapter12.write(jsonWriter, aVar.f2928d);
                    }
                    jsonWriter.name(StubApp.getString2(2278));
                    if (aVar.f2929e == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter13 = this.f2408d;
                        if (typeAdapter13 == null) {
                            typeAdapter13 = this.f2409e.getAdapter(TypeToken.getParameterized(List.class, Double[].class));
                            this.f2408d = typeAdapter13;
                        }
                        typeAdapter13.write(jsonWriter, aVar.f2929e);
                    }
                    jsonWriter.endObject();
                    break;
                }
            case 3:
                com.mapbox.api.geocoding.v5.models.d dVar = (com.mapbox.api.geocoding.v5.models.d) obj;
                if (dVar == null) {
                    jsonWriter.nullValue();
                    break;
                } else {
                    jsonWriter.beginObject();
                    jsonWriter.name(string2);
                    if (dVar.f12312a == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter14 = this.f2406b;
                        if (typeAdapter14 == null) {
                            typeAdapter14 = this.f2409e.getAdapter(String.class);
                            this.f2406b = typeAdapter14;
                        }
                        typeAdapter14.write(jsonWriter, dVar.f12312a);
                    }
                    jsonWriter.name(StubApp.getString2(2268));
                    if (dVar.f12313b == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter15 = this.f2407c;
                        if (typeAdapter15 == null) {
                            typeAdapter15 = this.f2409e.getAdapter(TypeToken.getParameterized(List.class, String.class));
                            this.f2407c = typeAdapter15;
                        }
                        typeAdapter15.write(jsonWriter, dVar.f12313b);
                    }
                    jsonWriter.name(StubApp.getString2(2045));
                    if (dVar.f12314c == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter16 = this.f2408d;
                        if (typeAdapter16 == null) {
                            typeAdapter16 = this.f2409e.getAdapter(TypeToken.getParameterized(List.class, com.mapbox.api.geocoding.v5.models.c.class));
                            this.f2408d = typeAdapter16;
                        }
                        typeAdapter16.write(jsonWriter, dVar.f12314c);
                    }
                    jsonWriter.name(StubApp.getString2(2046));
                    if (dVar.f12315d == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter17 = this.f2406b;
                        if (typeAdapter17 == null) {
                            typeAdapter17 = this.f2409e.getAdapter(String.class);
                            this.f2406b = typeAdapter17;
                        }
                        typeAdapter17.write(jsonWriter, dVar.f12315d);
                    }
                    jsonWriter.endObject();
                    break;
                }
            case 4:
                com.mapbox.api.matching.v5.models.c cVar = (com.mapbox.api.matching.v5.models.c) obj;
                if (cVar == null) {
                    jsonWriter.nullValue();
                    break;
                } else {
                    jsonWriter.beginObject();
                    jsonWriter.name(string25);
                    if (cVar.f12355a == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter18 = this.f2406b;
                        if (typeAdapter18 == null) {
                            typeAdapter18 = this.f2409e.getAdapter(String.class);
                            this.f2406b = typeAdapter18;
                        }
                        typeAdapter18.write(jsonWriter, cVar.f12355a);
                    }
                    jsonWriter.name(StubApp.getString2(1905));
                    if (cVar.f12356b == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter19 = this.f2406b;
                        if (typeAdapter19 == null) {
                            typeAdapter19 = this.f2409e.getAdapter(String.class);
                            this.f2406b = typeAdapter19;
                        }
                        typeAdapter19.write(jsonWriter, cVar.f12356b);
                    }
                    jsonWriter.name(StubApp.getString2(2265));
                    if (cVar.f12357c == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter20 = this.f2407c;
                        if (typeAdapter20 == null) {
                            typeAdapter20 = this.f2409e.getAdapter(TypeToken.getParameterized(List.class, com.mapbox.api.matching.v5.models.e.class));
                            this.f2407c = typeAdapter20;
                        }
                        typeAdapter20.write(jsonWriter, cVar.f12357c);
                    }
                    jsonWriter.name(StubApp.getString2(2266));
                    if (cVar.f12358d == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter21 = this.f2408d;
                        if (typeAdapter21 == null) {
                            typeAdapter21 = this.f2409e.getAdapter(TypeToken.getParameterized(List.class, com.mapbox.api.matching.v5.models.d.class));
                            this.f2408d = typeAdapter21;
                        }
                        typeAdapter21.write(jsonWriter, cVar.f12358d);
                    }
                    jsonWriter.endObject();
                    break;
                }
            case 5:
                com.mapbox.api.matching.v5.models.d dVar2 = (com.mapbox.api.matching.v5.models.d) obj;
                if (dVar2 == null) {
                    jsonWriter.nullValue();
                    break;
                } else {
                    jsonWriter.beginObject();
                    jsonWriter.name(StubApp.getString2(2264));
                    if (dVar2.f12359a == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter22 = this.f2406b;
                        if (typeAdapter22 == null) {
                            typeAdapter22 = this.f2409e.getAdapter(Integer.class);
                            this.f2406b = typeAdapter22;
                        }
                        typeAdapter22.write(jsonWriter, dVar2.f12359a);
                    }
                    jsonWriter.name(StubApp.getString2(2263));
                    if (dVar2.f12360b == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter23 = this.f2406b;
                        if (typeAdapter23 == null) {
                            typeAdapter23 = this.f2409e.getAdapter(Integer.class);
                            this.f2406b = typeAdapter23;
                        }
                        typeAdapter23.write(jsonWriter, dVar2.f12360b);
                    }
                    jsonWriter.name(string24);
                    if (dVar2.f12361c == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter24 = this.f2406b;
                        if (typeAdapter24 == null) {
                            typeAdapter24 = this.f2409e.getAdapter(Integer.class);
                            this.f2406b = typeAdapter24;
                        }
                        typeAdapter24.write(jsonWriter, dVar2.f12361c);
                    }
                    jsonWriter.name(string23);
                    if (dVar2.f12362d == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter25 = this.f2407c;
                        if (typeAdapter25 == null) {
                            typeAdapter25 = this.f2409e.getAdapter(String.class);
                            this.f2407c = typeAdapter25;
                        }
                        typeAdapter25.write(jsonWriter, dVar2.f12362d);
                    }
                    jsonWriter.name(string22);
                    if (dVar2.f12363e == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter26 = this.f2408d;
                        if (typeAdapter26 == null) {
                            typeAdapter26 = this.f2409e.getAdapter(double[].class);
                            this.f2408d = typeAdapter26;
                        }
                        typeAdapter26.write(jsonWriter, dVar2.f12363e);
                    }
                    jsonWriter.endObject();
                    break;
                }
            case 6:
                com.mapbox.api.optimization.v1.models.a aVar2 = (com.mapbox.api.optimization.v1.models.a) obj;
                if (aVar2 == null) {
                    jsonWriter.nullValue();
                    break;
                } else {
                    jsonWriter.beginObject();
                    jsonWriter.name(string25);
                    if (aVar2.f12364a == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter27 = this.f2406b;
                        if (typeAdapter27 == null) {
                            typeAdapter27 = this.f2409e.getAdapter(String.class);
                            this.f2406b = typeAdapter27;
                        }
                        typeAdapter27.write(jsonWriter, aVar2.f12364a);
                    }
                    jsonWriter.name(StubApp.getString2(1913));
                    if (aVar2.f12365b == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter28 = this.f2407c;
                        if (typeAdapter28 == null) {
                            typeAdapter28 = this.f2409e.getAdapter(TypeToken.getParameterized(List.class, com.mapbox.api.optimization.v1.models.b.class));
                            this.f2407c = typeAdapter28;
                        }
                        typeAdapter28.write(jsonWriter, aVar2.f12365b);
                    }
                    jsonWriter.name(StubApp.getString2(2262));
                    if (aVar2.f12366c == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter29 = this.f2408d;
                        if (typeAdapter29 == null) {
                            typeAdapter29 = this.f2409e.getAdapter(TypeToken.getParameterized(List.class, DirectionsRoute.class));
                            this.f2408d = typeAdapter29;
                        }
                        typeAdapter29.write(jsonWriter, aVar2.f12366c);
                    }
                    jsonWriter.endObject();
                    break;
                }
            default:
                com.mapbox.api.optimization.v1.models.b bVar = (com.mapbox.api.optimization.v1.models.b) obj;
                if (bVar == null) {
                    jsonWriter.nullValue();
                    break;
                } else {
                    jsonWriter.beginObject();
                    jsonWriter.name(string24);
                    TypeAdapter typeAdapter30 = this.f2406b;
                    if (typeAdapter30 == null) {
                        typeAdapter30 = this.f2409e.getAdapter(Integer.class);
                        this.f2406b = typeAdapter30;
                    }
                    typeAdapter30.write(jsonWriter, Integer.valueOf(bVar.f12367a));
                    jsonWriter.name(StubApp.getString2(2259));
                    TypeAdapter typeAdapter31 = this.f2406b;
                    if (typeAdapter31 == null) {
                        typeAdapter31 = this.f2409e.getAdapter(Integer.class);
                        this.f2406b = typeAdapter31;
                    }
                    typeAdapter31.write(jsonWriter, Integer.valueOf(bVar.f12368b));
                    jsonWriter.name(string23);
                    if (bVar.f12369c == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter32 = this.f2407c;
                        if (typeAdapter32 == null) {
                            typeAdapter32 = this.f2409e.getAdapter(String.class);
                            this.f2407c = typeAdapter32;
                        }
                        typeAdapter32.write(jsonWriter, bVar.f12369c);
                    }
                    jsonWriter.name(string22);
                    if (bVar.f12370d == null) {
                        jsonWriter.nullValue();
                    } else {
                        TypeAdapter typeAdapter33 = this.f2408d;
                        if (typeAdapter33 == null) {
                            typeAdapter33 = this.f2409e.getAdapter(double[].class);
                            this.f2408d = typeAdapter33;
                        }
                        typeAdapter33.write(jsonWriter, bVar.f12370d);
                    }
                    jsonWriter.endObject();
                    break;
                }
        }
    }
}
