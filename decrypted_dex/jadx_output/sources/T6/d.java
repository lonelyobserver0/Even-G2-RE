package T6;

import Ac.m;
import android.util.Log;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxStyleException;
import com.mapbox.maps.MapboxStyleManager;
import com.stub.StubApp;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f7217a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f7218b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f7219c;

    /* renamed from: d, reason: collision with root package name */
    public MapboxStyleManager f7220d;

    public d(String sourceId) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        this.f7217a = sourceId;
        this.f7218b = LazyKt.lazy(new m(this, 11));
        this.f7219c = LazyKt.lazy(c.f7216a);
    }

    public Expected a(MapboxStyleManager style) {
        Intrinsics.checkNotNullParameter(style, "style");
        return style.addStyleSource(this.f7217a, c());
    }

    public void b(MapboxStyleManager delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f7220d = delegate;
        String str = (String) a(delegate).getError();
        if (str != null) {
            Log.e(StubApp.getString2(6219), c().toString());
            throw new MapboxStyleException(StubApp.getString2(6220).concat(str));
        }
        Iterator it = f().entrySet().iterator();
        while (it.hasNext()) {
            R6.a aVar = (R6.a) ((Map.Entry) it.next()).getValue();
            MapboxStyleManager mapboxStyleManager = this.f7220d;
            if (mapboxStyleManager != null) {
                String str2 = aVar.f6223a;
                String str3 = this.f7217a;
                Value value = aVar.f6225c;
                String error = mapboxStyleManager.setStyleSourceProperty(str3, str2, value).getError();
                if (error != null) {
                    StringBuilder sb2 = new StringBuilder(StubApp.getString2(6218));
                    E1.a.v(sb2, aVar.f6223a, StubApp.getString2(2968), error, StubApp.getString2(2969));
                    sb2.append(value);
                    throw new MapboxStyleException(sb2.toString());
                }
            }
        }
    }

    public final Value c() {
        HashMap hashMap = new HashMap();
        Collection<R6.a> values = d().values();
        Intrinsics.checkNotNullExpressionValue(values, "sourceProperties.values");
        for (R6.a aVar : values) {
            hashMap.put(aVar.f6223a, aVar.f6225c);
        }
        return new Value((HashMap<String, Value>) hashMap);
    }

    public final HashMap d() {
        return (HashMap) this.f7218b.getValue();
    }

    public abstract String e();

    public final HashMap f() {
        return (HashMap) this.f7219c.getValue();
    }

    public final String toString() {
        String joinToString$default;
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(6221));
        sb2.append(this.f7217a);
        sb2.append(StubApp.getString2(81));
        Collection values = d().values();
        Intrinsics.checkNotNullExpressionValue(values, "sourceProperties.values");
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(values, null, null, null, 0, null, b.f7215a, 31, null);
        return AbstractC1482f.k(sb2, joinToString$default, StubApp.getString2(4985));
    }
}
