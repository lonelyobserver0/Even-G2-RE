package a7;

import A3.s;
import D5.A;
import android.graphics.Bitmap;
import android.os.HandlerThread;
import com.google.android.gms.internal.measurement.F1;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.Point;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.MapController;
import com.mapbox.maps.MapInteraction;
import com.mapbox.maps.MapboxAnnotationException;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import com.stub.StubApp;
import i7.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class f implements a {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f9300t = 0;

    /* renamed from: a, reason: collision with root package name */
    public final s f9301a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f9302b;

    /* renamed from: c, reason: collision with root package name */
    public final MapboxMap f9303c;

    /* renamed from: d, reason: collision with root package name */
    public b7.a f9304d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f9305e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f9306f;

    /* renamed from: g, reason: collision with root package name */
    public final JsonObject f9307g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashSet f9308h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f9309i;
    public final ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public final B6.d f9310k;

    /* renamed from: l, reason: collision with root package name */
    public final P6.c f9311l;

    /* renamed from: m, reason: collision with root package name */
    public final U6.c f9312m;

    /* renamed from: n, reason: collision with root package name */
    public final P6.c f9313n;

    /* renamed from: o, reason: collision with root package name */
    public final U6.c f9314o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f9315p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f9316q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f9317r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f9318s;

    static {
        String value = StubApp.getString2(8510);
        Intrinsics.checkNotNullParameter(value, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        N6.d[] expressions = {new N6.d(value)};
        Intrinsics.checkNotNullParameter(expressions, "expressions");
        N6.a aVar = new N6.a(StubApp.getString2(6443));
        aVar.a(expressions[0]);
        aVar.b();
    }

    public f(s delegateProvider, long j, String typeName, Function2 createLayerFunction) {
        Intrinsics.checkNotNullParameter(delegateProvider, "delegateProvider");
        Intrinsics.checkNotNullParameter(typeName, "typeName");
        Intrinsics.checkNotNullParameter(createLayerFunction, "createLayerFunction");
        this.f9301a = delegateProvider;
        this.f9302b = new LinkedHashMap();
        delegateProvider.getClass();
        MapboxMap mapboxMap = (MapboxMap) delegateProvider.f197i;
        this.f9303c = mapboxMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f9305e = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        this.f9306f = linkedHashMap2;
        this.f9307g = new JsonObject();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f9308h = linkedHashSet;
        ArrayList arrayList = new ArrayList();
        this.f9309i = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.j = arrayList2;
        i7.c cVar = (i7.c) ((MapController) delegateProvider.f194f).getPlugin(StubApp.getString2(8511));
        if (cVar == null) {
            String exceptionMessage = StubApp.getString2(8517);
            Intrinsics.checkNotNullParameter(exceptionMessage, "exceptionMessage");
            throw new A(exceptionMessage, 2);
        }
        B6.a aVar = ((o) cVar).f14902f;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gesturesManager");
            aVar = null;
        }
        this.f9310k = (B6.d) aVar.f674h;
        this.f9315p = new ArrayList();
        this.f9316q = new ArrayList();
        this.f9317r = new ArrayList();
        this.f9318s = new ArrayList();
        String string2 = StubApp.getString2(8512);
        String str = string2 + typeName + StubApp.getString2(8513) + j;
        String id = string2 + typeName + StubApp.getString2(8514) + j;
        b block = new b(1, 1);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(block, "block");
        U6.a aVar2 = new U6.a(id);
        block.invoke(aVar2);
        U6.c a3 = aVar2.a();
        this.f9312m = a3;
        P6.c cVar2 = (P6.c) createLayerFunction.invoke(str, id);
        this.f9311l = cVar2;
        String str2 = string2 + typeName + StubApp.getString2(8515) + j;
        String id2 = string2 + typeName + StubApp.getString2(8516) + j;
        b block2 = new b(1, 0);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(block2, "block");
        U6.a aVar3 = new U6.a(id2);
        block2.invoke(aVar3);
        U6.c a9 = aVar3.a();
        this.f9314o = a9;
        P6.c cVar3 = (P6.c) createLayerFunction.invoke(str2, id2);
        this.f9313n = cVar3;
        MapboxMap mapboxMap2 = (MapboxMap) delegateProvider.f196h;
        String str3 = a3.f7217a;
        if (!mapboxMap2.styleSourceExists(str3)) {
            F1.e(mapboxMap2, a3);
            arrayList2.add(str3);
        }
        if (!mapboxMap2.styleLayerExists(cVar2.f())) {
            F1.d(mapboxMap2, cVar2, null);
            arrayList.add(cVar2.f());
        }
        String str4 = a9.f7217a;
        if (!mapboxMap2.styleSourceExists(str4)) {
            F1.e(mapboxMap2, a9);
            arrayList2.add(str4);
        }
        if (!mapboxMap2.styleLayerExists(cVar3.f())) {
            F1.d(mapboxMap2, cVar3, new LayerPosition(cVar2.f(), null, null));
            arrayList.add(cVar3.f());
        }
        if (!(cVar2 instanceof Q6.c)) {
            boolean z2 = cVar2 instanceof Q6.b;
        }
        m();
        d dVar = new d(this, 0);
        linkedHashSet.add(mapboxMap.addInteraction((MapInteraction) dVar.invoke(cVar2.f(), linkedHashMap)));
        linkedHashSet.add(mapboxMap.addInteraction((MapInteraction) dVar.invoke(cVar3.f(), linkedHashMap2)));
        d dVar2 = new d(this, 2);
        linkedHashSet.add(mapboxMap.addInteraction((MapInteraction) dVar2.invoke(cVar2.f(), linkedHashMap)));
        linkedHashSet.add(mapboxMap.addInteraction((MapInteraction) dVar2.invoke(cVar3.f(), linkedHashMap2)));
        d dVar3 = new d(this, 1);
        linkedHashSet.add(mapboxMap.addInteraction((MapInteraction) dVar3.invoke(cVar2.f(), linkedHashMap)));
        linkedHashSet.add(mapboxMap.addInteraction((MapInteraction) dVar3.invoke(cVar3.f(), linkedHashMap2)));
    }

    public static void c(MapboxMap mapboxMap, Collection collection) {
        String imageId;
        Bitmap bitmap;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b7.a aVar = (b7.a) it.next();
            if (!(aVar instanceof b7.a)) {
                aVar = null;
            }
            if (aVar != null && (imageId = aVar.a()) != null && StringsKt.O(imageId, StubApp.getString2(8518)) && !mapboxMap.hasStyleImage(imageId) && (bitmap = aVar.f10714f) != null) {
                Intrinsics.checkNotNullParameter(imageId, "imageId");
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                O6.c block = O6.c.f5220a;
                Intrinsics.checkNotNullParameter(block, "block");
                O6.a aVar2 = new O6.a(bitmap, imageId);
                block.invoke(aVar2);
                if (aVar2.f5216b == null) {
                    throw new IllegalStateException(StubApp.getString2(8519));
                }
                O6.b image = new O6.b(aVar2);
                Intrinsics.checkNotNullParameter(mapboxMap, "<this>");
                Intrinsics.checkNotNullParameter(image, "image");
                image.a(mapboxMap);
            }
        }
    }

    public final ArrayList d(Collection collection) {
        ArrayList arrayList = new ArrayList(CollectionsKt.f(collection));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b7.a aVar = (b7.a) it.next();
            JsonObject jsonObject = aVar.f10710b;
            String string2 = StubApp.getString2(8520);
            JsonElement jsonElement = jsonObject.get(string2);
            f fVar = aVar.f10713e;
            if (jsonElement != null) {
                fVar.g(string2);
            }
            String string22 = StubApp.getString2(8521);
            if (jsonObject.get(string22) != null) {
                fVar.g(string22);
            }
            String string23 = StubApp.getString2(8522);
            if (jsonObject.get(string23) != null) {
                fVar.g(string23);
            }
            String string24 = StubApp.getString2(117);
            if (jsonObject.get(string24) != null) {
                fVar.g(string24);
            }
            String string25 = StubApp.getString2(8523);
            if (jsonObject.get(string25) != null) {
                fVar.g(string25);
            }
            String string26 = StubApp.getString2(8524);
            if (jsonObject.get(string26) != null) {
                fVar.g(string26);
            }
            String string27 = StubApp.getString2(8525);
            if (jsonObject.get(string27) != null) {
                fVar.g(string27);
            }
            String string28 = StubApp.getString2(8526);
            if (jsonObject.get(string28) != null) {
                fVar.g(string28);
            }
            String string29 = StubApp.getString2(8527);
            if (jsonObject.get(string29) != null) {
                fVar.g(string29);
            }
            String string210 = StubApp.getString2(8528);
            if (jsonObject.get(string210) != null) {
                fVar.g(string210);
            }
            String string211 = StubApp.getString2(8529);
            if (jsonObject.get(string211) != null) {
                fVar.g(string211);
            }
            String string212 = StubApp.getString2(8530);
            if (jsonObject.get(string212) != null) {
                fVar.g(string212);
            }
            String string213 = StubApp.getString2(8531);
            if (jsonObject.get(string213) != null) {
                fVar.g(string213);
            }
            String string214 = StubApp.getString2(8532);
            if (jsonObject.get(string214) != null) {
                fVar.g(string214);
            }
            String string215 = StubApp.getString2(8533);
            if (jsonObject.get(string215) != null) {
                fVar.g(string215);
            }
            String string216 = StubApp.getString2(8534);
            if (jsonObject.get(string216) != null) {
                fVar.g(string216);
            }
            String string217 = StubApp.getString2(8535);
            if (jsonObject.get(string217) != null) {
                fVar.g(string217);
            }
            String string218 = StubApp.getString2(8536);
            if (jsonObject.get(string218) != null) {
                fVar.g(string218);
            }
            String string219 = StubApp.getString2(8537);
            if (jsonObject.get(string219) != null) {
                fVar.g(string219);
            }
            String string220 = StubApp.getString2(8538);
            if (jsonObject.get(string220) != null) {
                fVar.g(string220);
            }
            String string221 = StubApp.getString2(8539);
            if (jsonObject.get(string221) != null) {
                fVar.g(string221);
            }
            String string222 = StubApp.getString2(8540);
            if (jsonObject.get(string222) != null) {
                fVar.g(string222);
            }
            String string223 = StubApp.getString2(8541);
            if (jsonObject.get(string223) != null) {
                fVar.g(string223);
            }
            String string224 = StubApp.getString2(8542);
            if (jsonObject.get(string224) != null) {
                fVar.g(string224);
            }
            String string225 = StubApp.getString2(8543);
            if (jsonObject.get(string225) != null) {
                fVar.g(string225);
            }
            String string226 = StubApp.getString2(8544);
            if (jsonObject.get(string226) != null) {
                fVar.g(string226);
            }
            String string227 = StubApp.getString2(8545);
            if (jsonObject.get(string227) != null) {
                fVar.g(string227);
            }
            String string228 = StubApp.getString2(8546);
            if (jsonObject.get(string228) != null) {
                fVar.g(string228);
            }
            String string229 = StubApp.getString2(8547);
            if (jsonObject.get(string229) != null) {
                fVar.g(string229);
            }
            String string230 = StubApp.getString2(8548);
            if (jsonObject.get(string230) != null) {
                fVar.g(string230);
            }
            String string231 = StubApp.getString2(8549);
            if (jsonObject.get(string231) != null) {
                fVar.g(string231);
            }
            String string232 = StubApp.getString2(8550);
            if (jsonObject.get(string232) != null) {
                fVar.g(string232);
            }
            String string233 = StubApp.getString2(8551);
            if (jsonObject.get(string233) != null) {
                fVar.g(string233);
            }
            String string234 = StubApp.getString2(8552);
            if (jsonObject.get(string234) != null) {
                fVar.g(string234);
            }
            String string235 = StubApp.getString2(8553);
            if (jsonObject.get(string235) != null) {
                fVar.g(string235);
            }
            String string236 = StubApp.getString2(8554);
            if (jsonObject.get(string236) != null) {
                fVar.g(string236);
            }
            String string237 = StubApp.getString2(8555);
            if (jsonObject.get(string237) != null) {
                fVar.g(string237);
            }
            String string238 = StubApp.getString2(8556);
            if (jsonObject.get(string238) != null) {
                fVar.g(string238);
            }
            Point point = aVar.f10711c;
            JsonObject deepCopy = aVar.f10710b.deepCopy();
            Intrinsics.checkNotNullExpressionValue(deepCopy, "jsonObject.deepCopy()");
            Set<Map.Entry<String, JsonElement>> entrySet = this.f9307g.entrySet();
            Intrinsics.checkNotNullExpressionValue(entrySet, "dataDrivenPropertyDefaultValues.entrySet()");
            Iterator<T> it2 = entrySet.iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!deepCopy.has((String) entry.getKey())) {
                    deepCopy.add((String) entry.getKey(), (JsonElement) entry.getValue());
                }
            }
            arrayList.add(Feature.fromGeometry(point, deepCopy, aVar.f10709a));
        }
        return arrayList;
    }

    public final void e(ArrayList options) {
        Intrinsics.checkNotNullParameter(options, "options");
        ArrayList arrayList = new ArrayList(CollectionsKt.f(options));
        Iterator it = options.iterator();
        while (it.hasNext()) {
            b7.d dVar = (b7.d) it.next();
            String id = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(id, "randomUUID().toString()");
            dVar.getClass();
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(this, "annotationManager");
            if (dVar.f10720b == null) {
                throw new MapboxAnnotationException(StubApp.getString2(8558));
            }
            JsonObject jsonObject = new JsonObject();
            Double d8 = dVar.f10722d;
            if (d8 != null) {
                jsonObject.addProperty(StubApp.getString2(8523), Double.valueOf(d8.doubleValue()));
            }
            Point point = dVar.f10720b;
            Intrinsics.checkNotNull(point);
            b7.a aVar = new b7.a(id, this, jsonObject, point);
            Bitmap bitmap = dVar.f10721c;
            if (bitmap != null && !Intrinsics.areEqual(aVar.f10714f, bitmap)) {
                aVar.f10714f = bitmap;
                String a3 = aVar.a();
                String string2 = StubApp.getString2(8518);
                if (a3 != null) {
                    String a9 = aVar.a();
                    Intrinsics.checkNotNull(a9);
                    if (!StringsKt.O(a9, string2)) {
                    }
                }
                String str = string2 + bitmap.hashCode();
                String string22 = StubApp.getString2(8521);
                if (str != null) {
                    jsonObject.addProperty(string22, str);
                } else {
                    jsonObject.remove(string22);
                }
            }
            jsonObject.add(StubApp.getString2(8557), dVar.f10719a);
            this.f9305e.put(id, aVar);
            arrayList.add(aVar);
        }
        m();
    }

    public final void f() {
        LinkedHashMap linkedHashMap = this.f9305e;
        if (!linkedHashMap.isEmpty()) {
            linkedHashMap.clear();
            m();
        }
        LinkedHashMap linkedHashMap2 = this.f9306f;
        if (linkedHashMap2.isEmpty()) {
            return;
        }
        linkedHashMap2.clear();
        l();
    }

    public final void g(String property) {
        Intrinsics.checkNotNullParameter(property, "property");
        LinkedHashMap linkedHashMap = this.f9302b;
        if (Intrinsics.areEqual(linkedHashMap.get(property), Boolean.FALSE)) {
            linkedHashMap.put(property, Boolean.TRUE);
            i(property);
        }
    }

    public abstract String h();

    public abstract void i(String str);

    public final void j(String propertyName, Value value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        try {
            MapboxMap mapboxMap = (MapboxMap) this.f9301a.f196h;
            mapboxMap.setStyleLayerProperty(this.f9311l.f(), propertyName, value);
            mapboxMap.setStyleLayerProperty(this.f9313n.f(), propertyName, value);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(Xa.h.l(e10, com.mapbox.common.b.l(StubApp.getString2(5740), propertyName, StubApp.getString2(994))), e10.getCause());
        }
    }

    public final void k() {
        if (this.f9304d != null) {
            Iterator it = this.f9315p.iterator();
            if (it.hasNext()) {
                throw com.mapbox.common.b.e(it);
            }
            this.f9304d = null;
        }
    }

    public final void l() {
        MapboxMap mapboxMap = (MapboxMap) this.f9301a.f196h;
        U6.c cVar = this.f9314o;
        if (!mapboxMap.styleSourceExists(cVar.f7217a) || !mapboxMap.styleLayerExists(this.f9313n.f())) {
            MapboxLogger.logE(StubApp.getString2(8509), StubApp.getString2(8559));
            return;
        }
        LinkedHashMap linkedHashMap = this.f9306f;
        Collection values = linkedHashMap.values();
        Intrinsics.checkNotNullExpressionValue(values, "dragAnnotationMap.values");
        c(mapboxMap, values);
        Collection values2 = linkedHashMap.values();
        Intrinsics.checkNotNullExpressionValue(values2, "dragAnnotationMap.values");
        FeatureCollection value = FeatureCollection.fromFeatures(d(values2));
        Intrinsics.checkNotNullExpressionValue(value, "fromFeatures(features)");
        HandlerThread handlerThread = U6.c.j;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter("", "dataId");
        cVar.h(value, "");
    }

    public final void m() {
        MapboxMap mapboxMap = (MapboxMap) this.f9301a.f196h;
        U6.c cVar = this.f9312m;
        if (!mapboxMap.styleSourceExists(cVar.f7217a) || !mapboxMap.styleLayerExists(this.f9311l.f())) {
            MapboxLogger.logE(StubApp.getString2(8509), StubApp.getString2(8560));
            return;
        }
        LinkedHashMap linkedHashMap = this.f9305e;
        Collection values = linkedHashMap.values();
        Intrinsics.checkNotNullExpressionValue(values, "annotationMap.values");
        c(mapboxMap, values);
        Collection values2 = linkedHashMap.values();
        Intrinsics.checkNotNullExpressionValue(values2, "annotationMap.values");
        FeatureCollection value = FeatureCollection.fromFeatures(d(values2));
        Intrinsics.checkNotNullExpressionValue(value, "fromFeatures(features)");
        HandlerThread handlerThread = U6.c.j;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter("", "dataId");
        cVar.h(value, "");
    }
}
