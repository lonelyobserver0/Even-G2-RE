package com.mapbox.api.geocoding.v5.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.mapbox.geojson.BoundingBox;
import com.mapbox.geojson.GeoJson;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.GeometryAdapterFactory;
import com.mapbox.geojson.gson.BoundingBoxTypeAdapter;
import com.stub.StubApp;
import java.util.Arrays;
import java.util.List;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements GeoJson {

    /* renamed from: a, reason: collision with root package name */
    public final String f12297a;

    /* renamed from: b, reason: collision with root package name */
    public final BoundingBox f12298b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12299c;

    /* renamed from: d, reason: collision with root package name */
    public final Geometry f12300d;

    /* renamed from: e, reason: collision with root package name */
    public final JsonObject f12301e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12302f;

    /* renamed from: g, reason: collision with root package name */
    public final String f12303g;

    /* renamed from: h, reason: collision with root package name */
    public final List f12304h;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final double[] f12305k;

    /* renamed from: l, reason: collision with root package name */
    public final List f12306l;

    /* renamed from: m, reason: collision with root package name */
    public final Double f12307m;

    /* renamed from: n, reason: collision with root package name */
    public final String f12308n;

    /* renamed from: p, reason: collision with root package name */
    public final String f12309p;

    /* renamed from: q, reason: collision with root package name */
    public final f f12310q;

    /* renamed from: r, reason: collision with root package name */
    public final String f12311r;

    public c(String str, BoundingBox boundingBox, String str2, Geometry geometry, JsonObject jsonObject, String str3, String str4, List list, String str5, double[] dArr, List list2, Double d8, String str6, String str7, f fVar, String str8) {
        this.f12297a = str;
        this.f12298b = boundingBox;
        this.f12299c = str2;
        this.f12300d = geometry;
        this.f12301e = jsonObject;
        this.f12302f = str3;
        this.f12303g = str4;
        this.f12304h = list;
        this.j = str5;
        this.f12305k = dArr;
        this.f12306l = list2;
        this.f12307m = d8;
        this.f12308n = str6;
        this.f12309p = str7;
        this.f12310q = fVar;
        this.f12311r = str8;
    }

    @Override // com.mapbox.geojson.GeoJson
    public final BoundingBox bbox() {
        return this.f12298b;
    }

    public final boolean equals(Object obj) {
        BoundingBox boundingBox;
        String str;
        Geometry geometry;
        JsonObject jsonObject;
        String str2;
        String str3;
        List list;
        String str4;
        List list2;
        Double d8;
        String str5;
        String str6;
        f fVar;
        String str7;
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f12297a.equals(cVar.f12297a) && ((boundingBox = this.f12298b) != null ? boundingBox.equals(cVar.f12298b) : cVar.f12298b == null) && ((str = this.f12299c) != null ? str.equals(cVar.f12299c) : cVar.f12299c == null) && ((geometry = this.f12300d) != null ? geometry.equals(cVar.f12300d) : cVar.f12300d == null) && ((jsonObject = this.f12301e) != null ? jsonObject.equals(cVar.f12301e) : cVar.f12301e == null) && ((str2 = this.f12302f) != null ? str2.equals(cVar.f12302f) : cVar.f12302f == null) && ((str3 = this.f12303g) != null ? str3.equals(cVar.f12303g) : cVar.f12303g == null) && ((list = this.f12304h) != null ? list.equals(cVar.f12304h) : cVar.f12304h == null) && ((str4 = this.j) != null ? str4.equals(cVar.j) : cVar.j == null)) {
                boolean z2 = cVar instanceof c;
                if (Arrays.equals(this.f12305k, cVar.f12305k) && ((list2 = this.f12306l) != null ? list2.equals(cVar.f12306l) : cVar.f12306l == null) && ((d8 = this.f12307m) != null ? d8.equals(cVar.f12307m) : cVar.f12307m == null) && ((str5 = this.f12308n) != null ? str5.equals(cVar.f12308n) : cVar.f12308n == null) && ((str6 = this.f12309p) != null ? str6.equals(cVar.f12309p) : cVar.f12309p == null) && ((fVar = this.f12310q) != null ? fVar.equals(cVar.f12310q) : cVar.f12310q == null) && ((str7 = this.f12311r) != null ? str7.equals(cVar.f12311r) : cVar.f12311r == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f12297a.hashCode() ^ 1000003) * 1000003;
        BoundingBox boundingBox = this.f12298b;
        int hashCode2 = (hashCode ^ (boundingBox == null ? 0 : boundingBox.hashCode())) * 1000003;
        String str = this.f12299c;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Geometry geometry = this.f12300d;
        int hashCode4 = (hashCode3 ^ (geometry == null ? 0 : geometry.hashCode())) * 1000003;
        JsonObject jsonObject = this.f12301e;
        int hashCode5 = (hashCode4 ^ (jsonObject == null ? 0 : jsonObject.hashCode())) * 1000003;
        String str2 = this.f12302f;
        int hashCode6 = (hashCode5 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f12303g;
        int hashCode7 = (hashCode6 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        List list = this.f12304h;
        int hashCode8 = (hashCode7 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        String str4 = this.j;
        int hashCode9 = (((hashCode8 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003) ^ Arrays.hashCode(this.f12305k)) * 1000003;
        List list2 = this.f12306l;
        int hashCode10 = (hashCode9 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Double d8 = this.f12307m;
        int hashCode11 = (hashCode10 ^ (d8 == null ? 0 : d8.hashCode())) * 1000003;
        String str5 = this.f12308n;
        int hashCode12 = (hashCode11 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f12309p;
        int hashCode13 = (hashCode12 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        f fVar = this.f12310q;
        int hashCode14 = (hashCode13 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        String str7 = this.f12311r;
        return hashCode14 ^ (str7 != null ? str7.hashCode() : 0);
    }

    @Override // com.mapbox.geojson.GeoJson
    public final String toJson() {
        c cVar;
        Gson create = new GsonBuilder().registerTypeAdapterFactory(GeometryAdapterFactory.create()).registerTypeAdapter(BoundingBox.class, new BoundingBoxTypeAdapter()).registerTypeAdapterFactory(new AutoValueGson_GeocodingAdapterFactory()).create();
        JsonObject jsonObject = this.f12301e;
        if (jsonObject == null || jsonObject.size() != 0) {
            cVar = this;
        } else {
            String str = this.f12297a;
            String string2 = str == null ? StubApp.getString2(2256) : "";
            if (!string2.isEmpty()) {
                throw new IllegalStateException(StubApp.getString2(555).concat(string2));
            }
            cVar = new c(str, this.f12298b, this.f12299c, this.f12300d, null, this.f12302f, this.f12303g, this.f12304h, this.j, this.f12305k, this.f12306l, this.f12307m, this.f12308n, this.f12309p, this.f12310q, this.f12311r);
        }
        return create.toJson(cVar, c.class);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(13152));
        sb2.append(this.f12297a);
        sb2.append(StubApp.getString2(2325));
        sb2.append(this.f12298b);
        sb2.append(StubApp.getString2(2296));
        sb2.append(this.f12299c);
        sb2.append(StubApp.getString2(2297));
        sb2.append(this.f12300d);
        sb2.append(StubApp.getString2(2298));
        sb2.append(this.f12301e);
        sb2.append(StubApp.getString2(12693));
        sb2.append(this.f12302f);
        sb2.append(StubApp.getString2(13153));
        sb2.append(this.f12303g);
        sb2.append(StubApp.getString2(13154));
        sb2.append(this.f12304h);
        sb2.append(StubApp.getString2(2245));
        sb2.append(this.j);
        sb2.append(StubApp.getString2(13155));
        sb2.append(Arrays.toString(this.f12305k));
        sb2.append(StubApp.getString2(2323));
        sb2.append(this.f12306l);
        sb2.append(StubApp.getString2(13156));
        sb2.append(this.f12307m);
        sb2.append(StubApp.getString2(13157));
        sb2.append(this.f12308n);
        sb2.append(StubApp.getString2(13158));
        sb2.append(this.f12309p);
        sb2.append(StubApp.getString2(13159));
        sb2.append(this.f12310q);
        sb2.append(StubApp.getString2(6716));
        return AbstractC1482f.k(sb2, this.f12311r, StubApp.getString2(265));
    }

    @Override // com.mapbox.geojson.GeoJson
    public final String type() {
        return this.f12297a;
    }
}
