package P6;

import Ac.m;
import N6.d;
import a4.f;
import android.util.Log;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.MapboxStyleException;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.Style;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public String f5549a;

    /* renamed from: b, reason: collision with root package name */
    public MapboxStyleManager f5550b;

    /* renamed from: c, reason: collision with root package name */
    public Value f5551c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f5552d = LazyKt.lazy(new m(this, 8));

    public static final Object a(c cVar) {
        String string2 = StubApp.getString2(1338);
        MapboxStyleManager mapboxStyleManager = cVar.f5550b;
        if (mapboxStyleManager == null) {
            throw new MapboxStyleException(StubApp.getString2(4983));
        }
        try {
            return f.x(mapboxStyleManager.getStyleLayerProperty(cVar.f(), string2));
        } catch (RuntimeException e10) {
            if (Intrinsics.areEqual(String.class, d.class)) {
                return null;
            }
            Log.e(StubApp.getString2(4982), StubApp.getString2(4979) + cVar.f() + StubApp.getString2(4980) + e10.getMessage() + StubApp.getString2(4981) + mapboxStyleManager.getStyleLayerProperty(cVar.f(), string2));
            return null;
        }
    }

    public Expected b(Style delegate, Value propertiesValue, LayerPosition layerPosition) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(propertiesValue, "propertiesValue");
        return delegate.addStyleLayer(propertiesValue, layerPosition);
    }

    public Expected c(MapboxStyleManager delegate, LayerPosition layerPosition) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return delegate.addPersistentStyleLayer(e(), layerPosition);
    }

    public final void d(Style delegate, LayerPosition layerPosition) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f5550b = delegate;
        Value value = this.f5551c;
        if (value == null) {
            value = e();
        }
        String str = (String) b(delegate, value, layerPosition).getError();
        if (str != null) {
            throw new MapboxStyleException(StubApp.getString2(2966).concat(str));
        }
        if (this.f5551c != null) {
            Collection values = ((HashMap) this.f5552d.getValue()).values();
            Intrinsics.checkNotNullExpressionValue(values, "layerProperties.values");
            ArrayList arrayList = new ArrayList();
            for (Object obj : values) {
                R6.a aVar = (R6.a) obj;
                if (!Intrinsics.areEqual(aVar.f6223a, "id")) {
                    String str2 = aVar.f6223a;
                    if (!Intrinsics.areEqual(str2, "type") && !Intrinsics.areEqual(str2, "source")) {
                        arrayList.add(obj);
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                R6.a aVar2 = (R6.a) it.next();
                delegate.setStyleLayerProperty(f(), aVar2.f6223a, aVar2.f6225c);
            }
        }
    }

    public final Value e() {
        HashMap hashMap = new HashMap();
        Collection<R6.a> values = ((HashMap) this.f5552d.getValue()).values();
        Intrinsics.checkNotNullExpressionValue(values, "layerProperties.values");
        for (R6.a aVar : values) {
            hashMap.put(aVar.f6223a, aVar.f6225c);
        }
        return new Value((HashMap<String, Value>) hashMap);
    }

    public abstract String f();

    public abstract String g();

    public abstract S6.f h();

    public final void i(R6.a property) {
        Intrinsics.checkNotNullParameter(property, "property");
        HashMap hashMap = (HashMap) this.f5552d.getValue();
        String str = property.f6223a;
        hashMap.put(str, property);
        MapboxStyleManager mapboxStyleManager = this.f5550b;
        if (mapboxStyleManager != null) {
            String f10 = f();
            Value value = property.f6225c;
            String error = mapboxStyleManager.setStyleLayerProperty(f10, str, value).getError();
            if (error == null) {
                return;
            }
            throw new MapboxStyleException(StubApp.getString2(2967) + str + StubApp.getString2(4984) + error + '\n' + value);
        }
    }

    public abstract c j(S6.f fVar);

    public final String toString() {
        String joinToString$default;
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(1557));
        Collection values = ((HashMap) this.f5552d.getValue()).values();
        Intrinsics.checkNotNullExpressionValue(values, "layerProperties.values");
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(values, null, null, null, 0, null, b.f5548a, 31, null);
        return AbstractC1482f.k(sb2, joinToString$default, StubApp.getString2(4985));
    }
}
