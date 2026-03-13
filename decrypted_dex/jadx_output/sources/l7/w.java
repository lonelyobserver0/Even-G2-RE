package l7;

import android.util.Log;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Point;
import com.mapbox.maps.MapboxLocationComponentException;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.Style;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class w implements t {

    /* renamed from: a, reason: collision with root package name */
    public final X6.e f16814a;

    /* renamed from: b, reason: collision with root package name */
    public MapboxStyleManager f16815b;

    /* renamed from: c, reason: collision with root package name */
    public Point f16816c;

    /* renamed from: d, reason: collision with root package name */
    public double f16817d;

    /* renamed from: e, reason: collision with root package name */
    public final s f16818e;

    /* renamed from: f, reason: collision with root package name */
    public final a5.c f16819f;

    public w(X6.e locationModelLayerOptions) {
        Value value;
        Value value2;
        Value value3;
        Value value4;
        Value value5;
        Value value6;
        String sourceId;
        Value value7;
        Value value8;
        n layerSourceProvider = n.f16772a;
        Intrinsics.checkNotNullParameter(layerSourceProvider, "layerSourceProvider");
        String str = "locationModelLayerOptions";
        Intrinsics.checkNotNullParameter(locationModelLayerOptions, "locationModelLayerOptions");
        this.f16814a = locationModelLayerOptions;
        Intrinsics.checkNotNullParameter(locationModelLayerOptions, "locationModelLayerOptions");
        List list = locationModelLayerOptions.f8432d;
        ArrayList modelScale = new ArrayList(CollectionsKt.f(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            modelScale.add(Double.valueOf(((Number) it.next()).floatValue()));
        }
        List list2 = locationModelLayerOptions.f8435g;
        ArrayList modelRotation = new ArrayList(CollectionsKt.f(list2));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            modelRotation.add(Double.valueOf(((Number) it2.next()).floatValue()));
        }
        String str2 = locationModelLayerOptions.f8441p;
        String string2 = StubApp.getString2(20949);
        String string22 = StubApp.getString2(20950);
        if (str2 != null) {
            Expected<String, Value> fromJson = Value.fromJson(str2);
            Intrinsics.checkNotNullExpressionValue(fromJson, string22);
            String error = fromJson.getError();
            if (error != null) {
                throw new MapboxLocationComponentException(error);
            }
            Value value9 = fromJson.getValue();
            if (value9 == null) {
                throw new MapboxLocationComponentException(string2);
            }
            value = value9;
        } else {
            value = null;
        }
        List list3 = locationModelLayerOptions.f8434f;
        ArrayList modelTranslation = new ArrayList(CollectionsKt.f(list3));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            modelTranslation.add(Double.valueOf(((Number) it3.next()).floatValue()));
        }
        double d8 = locationModelLayerOptions.f8431c;
        String str3 = locationModelLayerOptions.f8440n;
        if (str3 != null) {
            Expected<String, Value> fromJson2 = Value.fromJson(str3);
            Intrinsics.checkNotNullExpressionValue(fromJson2, string22);
            String error2 = fromJson2.getError();
            if (error2 != null) {
                throw new MapboxLocationComponentException(error2);
            }
            Value value10 = fromJson2.getValue();
            if (value10 == null) {
                throw new MapboxLocationComponentException(string2);
            }
            value2 = value10;
        } else {
            value2 = null;
        }
        double d10 = locationModelLayerOptions.f8438l;
        String str4 = locationModelLayerOptions.f8439m;
        if (str4 != null) {
            Expected<String, Value> fromJson3 = Value.fromJson(str4);
            Intrinsics.checkNotNullExpressionValue(fromJson3, string22);
            String error3 = fromJson3.getError();
            if (error3 != null) {
                throw new MapboxLocationComponentException(error3);
            }
            Value value11 = fromJson3.getValue();
            if (value11 == null) {
                throw new MapboxLocationComponentException(string2);
            }
            value3 = value11;
        } else {
            value3 = null;
        }
        String str5 = locationModelLayerOptions.f8443r;
        if (str5 != null) {
            Expected<String, Value> fromJson4 = Value.fromJson(str5);
            Intrinsics.checkNotNullExpressionValue(fromJson4, string22);
            value4 = value;
            String error4 = fromJson4.getError();
            if (error4 != null) {
                throw new MapboxLocationComponentException(error4);
            }
            Value value12 = fromJson4.getValue();
            if (value12 == null) {
                throw new MapboxLocationComponentException(string2);
            }
            value5 = value12;
        } else {
            value4 = value;
            value5 = null;
        }
        Value value13 = value5;
        Value value14 = value3;
        double d11 = locationModelLayerOptions.f8444s;
        String str6 = locationModelLayerOptions.f8445t;
        if (str6 != null) {
            Expected<String, Value> fromJson5 = Value.fromJson(str6);
            Intrinsics.checkNotNullExpressionValue(fromJson5, string22);
            String error5 = fromJson5.getError();
            if (error5 != null) {
                throw new MapboxLocationComponentException(error5);
            }
            Value value15 = fromJson5.getValue();
            if (value15 == null) {
                throw new MapboxLocationComponentException(string2);
            }
            value6 = value15;
        } else {
            value6 = null;
        }
        Intrinsics.checkNotNullParameter("mapbox-location-model-layer", StubApp.getString2(20941));
        String sourceId2 = StubApp.getString2(20951);
        Value value16 = value2;
        Intrinsics.checkNotNullParameter(sourceId2, "sourceId");
        Intrinsics.checkNotNullParameter(modelScale, "modelScale");
        Intrinsics.checkNotNullParameter(modelRotation, "modelRotation");
        Intrinsics.checkNotNullParameter(modelTranslation, "modelTranslation");
        X6.o modelScaleMode = locationModelLayerOptions.f8437k;
        Intrinsics.checkNotNullParameter(modelScaleMode, "modelScaleMode");
        X6.n modelElevationReference = locationModelLayerOptions.f8448x;
        Intrinsics.checkNotNullParameter(modelElevationReference, "modelElevationReference");
        s sVar = new s("mapbox-location-model-layer");
        ((HashMap) sVar.f3393b).put(StubApp.getString2(290), new Value("mapbox-location-model-layer"));
        HashMap hashMap = (HashMap) sVar.f3393b;
        String string23 = StubApp.getString2(215);
        Value value17 = new Value(string23);
        String string24 = StubApp.getString2(660);
        hashMap.put(string24, value17);
        ((HashMap) sVar.f3393b).put(StubApp.getString2(376), new Value(sourceId2));
        ((HashMap) sVar.f3393b).put(StubApp.getString2(20952), new Value(StubApp.getString2(5280)));
        HashMap hashMap2 = (HashMap) sVar.f3393b;
        ArrayList arrayList = new ArrayList(CollectionsKt.f(modelScale));
        Iterator it4 = modelScale.iterator();
        while (it4.hasNext()) {
            arrayList.add(new Value(((Number) it4.next()).doubleValue()));
            it4 = it4;
            str = str;
            modelElevationReference = modelElevationReference;
        }
        String str7 = str;
        X6.n nVar = modelElevationReference;
        hashMap2.put(StubApp.getString2(20953), new Value((List<Value>) arrayList));
        HashMap hashMap3 = (HashMap) sVar.f3393b;
        if (value4 == null) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt.f(modelRotation));
            for (Iterator it5 = modelRotation.iterator(); it5.hasNext(); it5 = it5) {
                arrayList2.add(new Value(((Number) it5.next()).doubleValue()));
                sourceId2 = sourceId2;
            }
            sourceId = sourceId2;
            value7 = new Value((List<Value>) arrayList2);
        } else {
            sourceId = sourceId2;
            value7 = value4;
        }
        hashMap3.put(StubApp.getString2(20954), value7);
        HashMap hashMap4 = (HashMap) sVar.f3393b;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.f(modelTranslation));
        for (Iterator it6 = modelTranslation.iterator(); it6.hasNext(); it6 = it6) {
            arrayList3.add(new Value(((Number) it6.next()).doubleValue()));
        }
        hashMap4.put(StubApp.getString2(20955), new Value((List<Value>) arrayList3));
        ((HashMap) sVar.f3393b).put(StubApp.getString2(20956), new Value(locationModelLayerOptions.f8436h));
        ((HashMap) sVar.f3393b).put(StubApp.getString2(20957), new Value(locationModelLayerOptions.j));
        ((HashMap) sVar.f3393b).put(StubApp.getString2(20958), value16 == null ? new Value(d8) : value16);
        ((HashMap) sVar.f3393b).put(StubApp.getString2(20959), new Value(modelScaleMode.f8469a));
        ((HashMap) sVar.f3393b).put(StubApp.getString2(20960), s.g());
        ((HashMap) sVar.f3393b).put(StubApp.getString2(20961), s.g());
        ((HashMap) sVar.f3393b).put(StubApp.getString2(20962), value14 == null ? new Value(d10) : value14);
        HashMap hashMap5 = (HashMap) sVar.f3393b;
        if (value13 == null) {
            W6.a block = new W6.a(locationModelLayerOptions.f8442q, ((r1 >> 24) & 255) / 255.0d);
            Intrinsics.checkNotNullParameter(block, "block");
            Intrinsics.checkNotNullParameter(block, "block");
            N6.a aVar = new N6.a(StubApp.getString2(5289));
            block.invoke(aVar);
            value8 = aVar.b();
        } else {
            value8 = value13;
        }
        hashMap5.put(StubApp.getString2(20963), value8);
        ((HashMap) sVar.f3393b).put(StubApp.getString2(20964), value6 == null ? new Value(d11) : value6);
        ((HashMap) sVar.f3393b).put(StubApp.getString2(20965), new Value(nVar.f8467a));
        this.f16818e = sVar;
        X6.e eVar = this.f16814a;
        Intrinsics.checkNotNullParameter(eVar, str7);
        if (eVar.f8429a.length() == 0) {
            throw new IllegalArgumentException(StubApp.getString2(20968));
        }
        List list4 = eVar.f8430b;
        ArrayList position = new ArrayList(CollectionsKt.f(list4));
        Iterator it7 = list4.iterator();
        while (it7.hasNext()) {
            position.add(Double.valueOf(((Number) it7.next()).floatValue()));
        }
        List materialOverrides = eVar.f8446v;
        List nodeOverrides = eVar.f8447w;
        String url = eVar.f8429a;
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(materialOverrides, "materialOverrides");
        Intrinsics.checkNotNullParameter(nodeOverrides, "nodeOverrides");
        a5.c cVar = new a5.c(19, false);
        cVar.f9282b = url;
        cVar.f9283c = new HashMap();
        HashMap hashMap6 = new HashMap();
        hashMap6.put(StubApp.getString2(614), new Value(url));
        ArrayList arrayList4 = new ArrayList(CollectionsKt.f(position));
        Iterator it8 = position.iterator();
        while (it8.hasNext()) {
            arrayList4.add(new Value(((Number) it8.next()).doubleValue()));
        }
        hashMap6.put("position", new Value((List<Value>) arrayList4));
        List listOf = CollectionsKt.listOf((Object[]) new Double[]{Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d)});
        ArrayList arrayList5 = new ArrayList(CollectionsKt.f(listOf));
        Iterator it9 = listOf.iterator();
        while (it9.hasNext()) {
            arrayList5.add(new Value(((Number) it9.next()).doubleValue()));
        }
        hashMap6.put(StubApp.getString2(666), new Value((List<Value>) arrayList5));
        ArrayList arrayList6 = new ArrayList(CollectionsKt.f(materialOverrides));
        Iterator it10 = materialOverrides.iterator();
        while (it10.hasNext()) {
            arrayList6.add(new Value((String) it10.next()));
        }
        hashMap6.put("materialOverrides", new Value((List<Value>) arrayList6));
        ArrayList arrayList7 = new ArrayList(CollectionsKt.f(nodeOverrides));
        Iterator it11 = nodeOverrides.iterator();
        while (it11.hasNext()) {
            arrayList7.add(new Value((String) it11.next()));
        }
        hashMap6.put("nodeOverrides", new Value((List<Value>) arrayList7));
        HashMap hashMap7 = new HashMap();
        hashMap7.put(StubApp.getString2(20966), new Value((HashMap<String, Value>) hashMap6));
        ((HashMap) cVar.f9283c).put(string24, new Value(string23));
        ((HashMap) cVar.f9283c).put(StubApp.getString2(20967), new Value((HashMap<String, Value>) hashMap7));
        this.f16819f = cVar;
    }

    @Override // l7.t
    public final void a(int i3, int i10) {
    }

    @Override // l7.t
    public final void b(Value scaleExpression) {
        Intrinsics.checkNotNullParameter(scaleExpression, "scaleExpression");
        s sVar = this.f16818e;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(scaleExpression, "scaleExpression");
        sVar.e(StubApp.getString2(20953), scaleExpression);
    }

    @Override // l7.t
    public final boolean c() {
        MapboxStyleManager mapboxStyleManager = this.f16815b;
        if (mapboxStyleManager != null ? mapboxStyleManager.styleLayerExists(StubApp.getString2(20969)) : false) {
            MapboxStyleManager mapboxStyleManager2 = this.f16815b;
            if (mapboxStyleManager2 != null ? mapboxStyleManager2.styleSourceExists(StubApp.getString2(20951)) : false) {
                return true;
            }
        }
        return false;
    }

    public final void d() {
        String error;
        Point point = this.f16816c;
        if (point != null) {
            List lngLat = CollectionsKt.listOf((Object[]) new Double[]{Double.valueOf(point.longitude()), Double.valueOf(point.latitude())});
            List orientation = CollectionsKt.listOf((Object[]) new Double[]{Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(this.f16817d)});
            a5.c cVar = this.f16819f;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(lngLat, "lngLat");
            Intrinsics.checkNotNullParameter(orientation, "orientation");
            ArrayList arrayList = new ArrayList(CollectionsKt.f(lngLat));
            Iterator it = lngLat.iterator();
            while (it.hasNext()) {
                arrayList.add(new Value(((Number) it.next()).doubleValue()));
            }
            Pair pair = TuplesKt.to(StubApp.getString2(665), new Value((List<Value>) arrayList));
            ArrayList arrayList2 = new ArrayList(CollectionsKt.f(orientation));
            Iterator it2 = orientation.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new Value(((Number) it2.next()).doubleValue()));
            }
            Value value = new Value((HashMap<String, Value>) MapsKt.hashMapOf(TuplesKt.to(StubApp.getString2(20966), new Value((HashMap<String, Value>) MapsKt.hashMapOf(pair, TuplesKt.to("orientation", new Value((List<Value>) arrayList2)), TuplesKt.to(StubApp.getString2(614), new Value((String) cVar.f9282b)))))));
            HashMap hashMap = (HashMap) cVar.f9283c;
            String string2 = StubApp.getString2(20967);
            hashMap.put(string2, value);
            MapboxStyleManager mapboxStyleManager = (MapboxStyleManager) cVar.f9284d;
            if (mapboxStyleManager == null || (error = mapboxStyleManager.setStyleSourceProperty(StubApp.getString2(20951), string2, value).getError()) == null) {
                return;
            }
            MapboxLogger.logE(StubApp.getString2(20971), StubApp.getString2(20970) + error + StubApp.getString2(2969) + value);
        }
    }

    @Override // l7.t
    public final void e(int i3, float f10, Float f11) {
    }

    @Override // l7.t
    public final void f(double d8) {
        this.f16817d = d8;
        d();
    }

    @Override // l7.t
    public final void h(MapboxMap style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f16815b = style;
        a5.c cVar = this.f16819f;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(style, "style");
        cVar.f9284d = style;
        HashMap hashMap = (HashMap) cVar.f9283c;
        String error = style.addStyleSource(StubApp.getString2(20951), new Value((HashMap<String, Value>) hashMap)).getError();
        if (error == null) {
            return;
        }
        Log.e(StubApp.getString2(20971), hashMap.toString());
        throw new MapboxLocationComponentException(StubApp.getString2(6220).concat(error));
    }

    @Override // l7.t
    public final void hide() {
        s sVar = this.f16818e;
        sVar.getClass();
        sVar.e(StubApp.getString2(1338), new Value(StubApp.getString2(1337)));
    }

    @Override // l7.t
    public final void i(Point latLng) {
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        this.f16816c = latLng;
        d();
    }

    @Override // l7.t
    public final void j(String str) {
        s sVar = this.f16818e;
        sVar.getClass();
        if (str == null) {
            str = "";
        }
        sVar.e(StubApp.getString2(1339), new Value(str));
    }

    @Override // l7.t
    public final void k() {
        MapboxStyleManager mapboxStyleManager = this.f16815b;
        if (mapboxStyleManager != null) {
            mapboxStyleManager.removeStyleLayer((String) this.f16818e.f3392a);
        }
        MapboxStyleManager mapboxStyleManager2 = this.f16815b;
        if (mapboxStyleManager2 != null) {
            this.f16819f.getClass();
            mapboxStyleManager2.removeStyleSource(StubApp.getString2(20951));
        }
    }

    @Override // l7.t
    public final void l(Style style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f16815b = style;
        s sVar = this.f16818e;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(style, "style");
        sVar.f3394c = style;
        a5.c cVar = this.f16819f;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(style, "style");
        cVar.f9284d = style;
    }

    @Override // l7.t
    public final void o() {
    }

    @Override // l7.t
    public final void q(float f10) {
    }

    @Override // l7.t
    public final void r(a5.c positionManager) {
        Intrinsics.checkNotNullParameter(positionManager, "positionManager");
        positionManager.f(this.f16818e);
    }

    @Override // l7.t
    public final void show() {
        s sVar = this.f16818e;
        sVar.getClass();
        sVar.e(StubApp.getString2(1338), new Value(StubApp.getString2(1342)));
    }
}
