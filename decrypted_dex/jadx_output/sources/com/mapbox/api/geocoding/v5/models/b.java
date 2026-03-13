package com.mapbox.api.geocoding.v5.models;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.BoundingBox;
import com.mapbox.geojson.Geometry;
import com.stub.StubApp;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends TypeAdapter {

    /* renamed from: a, reason: collision with root package name */
    public volatile TypeAdapter f12288a;

    /* renamed from: b, reason: collision with root package name */
    public volatile TypeAdapter f12289b;

    /* renamed from: c, reason: collision with root package name */
    public volatile TypeAdapter f12290c;

    /* renamed from: d, reason: collision with root package name */
    public volatile TypeAdapter f12291d;

    /* renamed from: e, reason: collision with root package name */
    public volatile TypeAdapter f12292e;

    /* renamed from: f, reason: collision with root package name */
    public volatile TypeAdapter f12293f;

    /* renamed from: g, reason: collision with root package name */
    public volatile TypeAdapter f12294g;

    /* renamed from: h, reason: collision with root package name */
    public volatile TypeAdapter f12295h;

    /* renamed from: i, reason: collision with root package name */
    public volatile TypeAdapter f12296i;
    public final Gson j;

    public b(Gson gson) {
        this.j = gson;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final Object read2(JsonReader jsonReader) {
        char c10;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        jsonReader.beginObject();
        JsonObject jsonObject = new JsonObject();
        String string2 = StubApp.getString2(13145);
        BoundingBox boundingBox = null;
        String str = null;
        Geometry geometry = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        String str4 = null;
        double[] dArr = null;
        List list2 = null;
        Double d8 = null;
        String str5 = null;
        String str6 = null;
        f fVar = null;
        String str7 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (jsonReader.peek() != JsonToken.NULL) {
                nextName.getClass();
                char c11 = 65535;
                switch (nextName.hashCode()) {
                    case -1364013995:
                        c10 = 0;
                        if (nextName.equals(StubApp.getString2(6013))) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case -1351923665:
                        c10 = 0;
                        if (nextName.equals(StubApp.getString2(13149))) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case -1072291771:
                        c10 = 0;
                        if (nextName.equals(StubApp.getString2(13148))) {
                            c11 = 2;
                            break;
                        }
                        break;
                    case -266148157:
                        c10 = 0;
                        if (nextName.equals(StubApp.getString2(13147))) {
                            c11 = 3;
                            break;
                        }
                        break;
                    case -265946254:
                        c10 = 0;
                        if (nextName.equals(StubApp.getString2(13146))) {
                            c11 = 4;
                            break;
                        }
                        break;
                    case 3575610:
                        c10 = 0;
                        if (nextName.equals(StubApp.getString2(660))) {
                            c11 = 5;
                            break;
                        }
                        break;
                    case 1335332940:
                        c10 = 0;
                        if (nextName.equals(StubApp.getString2(2286))) {
                            c11 = 6;
                            break;
                        }
                        break;
                    default:
                        c10 = 0;
                        break;
                }
                switch (c11) {
                    case 0:
                        TypeAdapter typeAdapter = this.f12293f;
                        if (typeAdapter == null) {
                            typeAdapter = this.j.getAdapter(double[].class);
                            this.f12293f = typeAdapter;
                        }
                        dArr = (double[]) typeAdapter.read2(jsonReader);
                        break;
                    case 1:
                        TypeAdapter typeAdapter2 = this.f12288a;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.j.getAdapter(String.class);
                            this.f12288a = typeAdapter2;
                        }
                        str5 = (String) typeAdapter2.read2(jsonReader);
                        break;
                    case 2:
                        TypeAdapter typeAdapter3 = this.f12288a;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.j.getAdapter(String.class);
                            this.f12288a = typeAdapter3;
                        }
                        str6 = (String) typeAdapter3.read2(jsonReader);
                        break;
                    case 3:
                        TypeAdapter typeAdapter4 = this.f12288a;
                        if (typeAdapter4 == null) {
                            typeAdapter4 = this.j.getAdapter(String.class);
                            this.f12288a = typeAdapter4;
                        }
                        str3 = (String) typeAdapter4.read2(jsonReader);
                        break;
                    case 4:
                        TypeAdapter typeAdapter5 = this.f12292e;
                        if (typeAdapter5 == null) {
                            Gson gson = this.j;
                            Type[] typeArr = new Type[1];
                            typeArr[c10] = String.class;
                            typeAdapter5 = gson.getAdapter(TypeToken.getParameterized(List.class, typeArr));
                            this.f12292e = typeAdapter5;
                        }
                        list = (List) typeAdapter5.read2(jsonReader);
                        break;
                    case 5:
                        TypeAdapter typeAdapter6 = this.f12288a;
                        if (typeAdapter6 == null) {
                            typeAdapter6 = this.j.getAdapter(String.class);
                            this.f12288a = typeAdapter6;
                        }
                        String str8 = (String) typeAdapter6.read2(jsonReader);
                        if (str8 == null) {
                            throw new NullPointerException(StubApp.getString2(2257));
                        }
                        string2 = str8;
                        break;
                    case 6:
                        TypeAdapter typeAdapter7 = this.f12296i;
                        if (typeAdapter7 == null) {
                            typeAdapter7 = this.j.getAdapter(f.class);
                            this.f12296i = typeAdapter7;
                        }
                        fVar = (f) typeAdapter7.read2(jsonReader);
                        break;
                    default:
                        if (!StubApp.getString2(2302).equals(nextName)) {
                            if (!StubApp.getString2(290).equals(nextName)) {
                                if (!StubApp.getString2(2092).equals(nextName)) {
                                    if (!StubApp.getString2(2279).equals(nextName)) {
                                        if (!StubApp.getString2(613).equals(nextName)) {
                                            if (!StubApp.getString2(661).equals(nextName)) {
                                                if (!StubApp.getString2(354).equals(nextName)) {
                                                    if (!StubApp.getString2(13150).equals(nextName)) {
                                                        if (!StubApp.getString2(1142).equals(nextName)) {
                                                            jsonReader.skipValue();
                                                            break;
                                                        } else {
                                                            TypeAdapter typeAdapter8 = this.f12288a;
                                                            if (typeAdapter8 == null) {
                                                                typeAdapter8 = this.j.getAdapter(String.class);
                                                                this.f12288a = typeAdapter8;
                                                            }
                                                            str7 = (String) typeAdapter8.read2(jsonReader);
                                                            break;
                                                        }
                                                    } else {
                                                        TypeAdapter typeAdapter9 = this.f12295h;
                                                        if (typeAdapter9 == null) {
                                                            typeAdapter9 = this.j.getAdapter(Double.class);
                                                            this.f12295h = typeAdapter9;
                                                        }
                                                        d8 = (Double) typeAdapter9.read2(jsonReader);
                                                        break;
                                                    }
                                                } else {
                                                    TypeAdapter typeAdapter10 = this.f12294g;
                                                    if (typeAdapter10 == null) {
                                                        Gson gson2 = this.j;
                                                        Type[] typeArr2 = new Type[1];
                                                        typeArr2[c10] = a.class;
                                                        typeAdapter10 = gson2.getAdapter(TypeToken.getParameterized(List.class, typeArr2));
                                                        this.f12294g = typeAdapter10;
                                                    }
                                                    list2 = (List) typeAdapter10.read2(jsonReader);
                                                    break;
                                                }
                                            } else {
                                                TypeAdapter typeAdapter11 = this.f12288a;
                                                if (typeAdapter11 == null) {
                                                    typeAdapter11 = this.j.getAdapter(String.class);
                                                    this.f12288a = typeAdapter11;
                                                }
                                                str4 = (String) typeAdapter11.read2(jsonReader);
                                                break;
                                            }
                                        } else {
                                            TypeAdapter typeAdapter12 = this.f12288a;
                                            if (typeAdapter12 == null) {
                                                typeAdapter12 = this.j.getAdapter(String.class);
                                                this.f12288a = typeAdapter12;
                                            }
                                            str2 = (String) typeAdapter12.read2(jsonReader);
                                            break;
                                        }
                                    } else {
                                        TypeAdapter typeAdapter13 = this.f12291d;
                                        if (typeAdapter13 == null) {
                                            typeAdapter13 = this.j.getAdapter(JsonObject.class);
                                            this.f12291d = typeAdapter13;
                                        }
                                        jsonObject = (JsonObject) typeAdapter13.read2(jsonReader);
                                        break;
                                    }
                                } else {
                                    TypeAdapter typeAdapter14 = this.f12290c;
                                    if (typeAdapter14 == null) {
                                        typeAdapter14 = this.j.getAdapter(Geometry.class);
                                        this.f12290c = typeAdapter14;
                                    }
                                    geometry = (Geometry) typeAdapter14.read2(jsonReader);
                                    break;
                                }
                            } else {
                                TypeAdapter typeAdapter15 = this.f12288a;
                                if (typeAdapter15 == null) {
                                    typeAdapter15 = this.j.getAdapter(String.class);
                                    this.f12288a = typeAdapter15;
                                }
                                str = (String) typeAdapter15.read2(jsonReader);
                                break;
                            }
                        } else {
                            TypeAdapter typeAdapter16 = this.f12289b;
                            if (typeAdapter16 == null) {
                                typeAdapter16 = this.j.getAdapter(BoundingBox.class);
                                this.f12289b = typeAdapter16;
                            }
                            boundingBox = (BoundingBox) typeAdapter16.read2(jsonReader);
                            break;
                        }
                }
            } else {
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        String string22 = string2 == null ? StubApp.getString2(2256) : "";
        if (string22.isEmpty()) {
            return new c(string2, boundingBox, str, geometry, jsonObject, str2, str3, list, str4, dArr, list2, d8, str5, str6, fVar, str7);
        }
        throw new IllegalStateException(StubApp.getString2(555).concat(string22));
    }

    public final String toString() {
        return StubApp.getString2(13151);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) {
        c cVar = (c) obj;
        if (cVar == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(StubApp.getString2(660));
        if (cVar.f12297a == null) {
            jsonWriter.nullValue();
        } else {
            TypeAdapter typeAdapter = this.f12288a;
            if (typeAdapter == null) {
                typeAdapter = this.j.getAdapter(String.class);
                this.f12288a = typeAdapter;
            }
            typeAdapter.write(jsonWriter, cVar.f12297a);
        }
        jsonWriter.name(StubApp.getString2(2302));
        if (cVar.f12298b == null) {
            jsonWriter.nullValue();
        } else {
            TypeAdapter typeAdapter2 = this.f12289b;
            if (typeAdapter2 == null) {
                typeAdapter2 = this.j.getAdapter(BoundingBox.class);
                this.f12289b = typeAdapter2;
            }
            typeAdapter2.write(jsonWriter, cVar.f12298b);
        }
        jsonWriter.name(StubApp.getString2(290));
        if (cVar.f12299c == null) {
            jsonWriter.nullValue();
        } else {
            TypeAdapter typeAdapter3 = this.f12288a;
            if (typeAdapter3 == null) {
                typeAdapter3 = this.j.getAdapter(String.class);
                this.f12288a = typeAdapter3;
            }
            typeAdapter3.write(jsonWriter, cVar.f12299c);
        }
        jsonWriter.name(StubApp.getString2(2092));
        if (cVar.f12300d == null) {
            jsonWriter.nullValue();
        } else {
            TypeAdapter typeAdapter4 = this.f12290c;
            if (typeAdapter4 == null) {
                typeAdapter4 = this.j.getAdapter(Geometry.class);
                this.f12290c = typeAdapter4;
            }
            typeAdapter4.write(jsonWriter, cVar.f12300d);
        }
        jsonWriter.name(StubApp.getString2(2279));
        if (cVar.f12301e == null) {
            jsonWriter.nullValue();
        } else {
            TypeAdapter typeAdapter5 = this.f12291d;
            if (typeAdapter5 == null) {
                typeAdapter5 = this.j.getAdapter(JsonObject.class);
                this.f12291d = typeAdapter5;
            }
            typeAdapter5.write(jsonWriter, cVar.f12301e);
        }
        jsonWriter.name(StubApp.getString2(613));
        if (cVar.f12302f == null) {
            jsonWriter.nullValue();
        } else {
            TypeAdapter typeAdapter6 = this.f12288a;
            if (typeAdapter6 == null) {
                typeAdapter6 = this.j.getAdapter(String.class);
                this.f12288a = typeAdapter6;
            }
            typeAdapter6.write(jsonWriter, cVar.f12302f);
        }
        jsonWriter.name(StubApp.getString2(13147));
        if (cVar.f12303g == null) {
            jsonWriter.nullValue();
        } else {
            TypeAdapter typeAdapter7 = this.f12288a;
            if (typeAdapter7 == null) {
                typeAdapter7 = this.j.getAdapter(String.class);
                this.f12288a = typeAdapter7;
            }
            typeAdapter7.write(jsonWriter, cVar.f12303g);
        }
        jsonWriter.name(StubApp.getString2(13146));
        if (cVar.f12304h == null) {
            jsonWriter.nullValue();
        } else {
            TypeAdapter typeAdapter8 = this.f12292e;
            if (typeAdapter8 == null) {
                typeAdapter8 = this.j.getAdapter(TypeToken.getParameterized(List.class, String.class));
                this.f12292e = typeAdapter8;
            }
            typeAdapter8.write(jsonWriter, cVar.f12304h);
        }
        jsonWriter.name(StubApp.getString2(661));
        if (cVar.j == null) {
            jsonWriter.nullValue();
        } else {
            TypeAdapter typeAdapter9 = this.f12288a;
            if (typeAdapter9 == null) {
                typeAdapter9 = this.j.getAdapter(String.class);
                this.f12288a = typeAdapter9;
            }
            typeAdapter9.write(jsonWriter, cVar.j);
        }
        jsonWriter.name(StubApp.getString2(6013));
        if (cVar.f12305k == null) {
            jsonWriter.nullValue();
        } else {
            TypeAdapter typeAdapter10 = this.f12293f;
            if (typeAdapter10 == null) {
                typeAdapter10 = this.j.getAdapter(double[].class);
                this.f12293f = typeAdapter10;
            }
            typeAdapter10.write(jsonWriter, cVar.f12305k);
        }
        jsonWriter.name(StubApp.getString2(354));
        if (cVar.f12306l == null) {
            jsonWriter.nullValue();
        } else {
            TypeAdapter typeAdapter11 = this.f12294g;
            if (typeAdapter11 == null) {
                typeAdapter11 = this.j.getAdapter(TypeToken.getParameterized(List.class, a.class));
                this.f12294g = typeAdapter11;
            }
            typeAdapter11.write(jsonWriter, cVar.f12306l);
        }
        jsonWriter.name(StubApp.getString2(13150));
        if (cVar.f12307m == null) {
            jsonWriter.nullValue();
        } else {
            TypeAdapter typeAdapter12 = this.f12295h;
            if (typeAdapter12 == null) {
                typeAdapter12 = this.j.getAdapter(Double.class);
                this.f12295h = typeAdapter12;
            }
            typeAdapter12.write(jsonWriter, cVar.f12307m);
        }
        jsonWriter.name(StubApp.getString2(13149));
        if (cVar.f12308n == null) {
            jsonWriter.nullValue();
        } else {
            TypeAdapter typeAdapter13 = this.f12288a;
            if (typeAdapter13 == null) {
                typeAdapter13 = this.j.getAdapter(String.class);
                this.f12288a = typeAdapter13;
            }
            typeAdapter13.write(jsonWriter, cVar.f12308n);
        }
        jsonWriter.name(StubApp.getString2(13148));
        if (cVar.f12309p == null) {
            jsonWriter.nullValue();
        } else {
            TypeAdapter typeAdapter14 = this.f12288a;
            if (typeAdapter14 == null) {
                typeAdapter14 = this.j.getAdapter(String.class);
                this.f12288a = typeAdapter14;
            }
            typeAdapter14.write(jsonWriter, cVar.f12309p);
        }
        jsonWriter.name(StubApp.getString2(2286));
        if (cVar.f12310q == null) {
            jsonWriter.nullValue();
        } else {
            TypeAdapter typeAdapter15 = this.f12296i;
            if (typeAdapter15 == null) {
                typeAdapter15 = this.j.getAdapter(f.class);
                this.f12296i = typeAdapter15;
            }
            typeAdapter15.write(jsonWriter, cVar.f12310q);
        }
        jsonWriter.name(StubApp.getString2(1142));
        if (cVar.f12311r == null) {
            jsonWriter.nullValue();
        } else {
            TypeAdapter typeAdapter16 = this.f12288a;
            if (typeAdapter16 == null) {
                typeAdapter16 = this.j.getAdapter(String.class);
                this.f12288a = typeAdapter16;
            }
            typeAdapter16.write(jsonWriter, cVar.f12311r);
        }
        jsonWriter.endObject();
    }
}
