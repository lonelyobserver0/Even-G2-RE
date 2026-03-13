package J1;

import com.mapbox.bindgen.Value;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.MapboxLocationComponentException;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxStyleManager;
import com.stub.StubApp;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3392a;

    /* renamed from: b, reason: collision with root package name */
    public final Serializable f3393b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3394c;

    public x(String layerId) {
        Intrinsics.checkNotNullParameter(layerId, "layerId");
        this.f3392a = layerId;
        this.f3393b = new HashMap();
    }

    public P1.k a() {
        r rVar = (r) this.f3392a;
        rVar.a();
        if (((AtomicBoolean) this.f3393b).compareAndSet(false, true)) {
            return (P1.k) ((Lazy) this.f3394c).getValue();
        }
        String sql = c();
        rVar.getClass();
        Intrinsics.checkNotNullParameter(sql, "sql");
        rVar.a();
        rVar.b();
        return rVar.g().s().e(sql);
    }

    public void b(MapboxStyleManager style, LayerPosition layerPosition) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f3394c = style;
        String error = style.addPersistentStyleLayer(new Value((HashMap<String, Value>) this.f3393b), layerPosition).getError();
        if (error != null) {
            throw new MapboxLocationComponentException(StubApp.getString2(2966).concat(error));
        }
    }

    public abstract String c();

    public void d(P1.k statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        if (statement == ((P1.k) ((Lazy) this.f3394c).getValue())) {
            ((AtomicBoolean) this.f3393b).set(false);
        }
    }

    public void e(String propertyName, Value value) {
        String error;
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        Intrinsics.checkNotNullParameter(value, "value");
        ((HashMap) this.f3393b).put(propertyName, value);
        MapboxStyleManager mapboxStyleManager = (MapboxStyleManager) this.f3394c;
        if (mapboxStyleManager == null || (error = mapboxStyleManager.setStyleLayerProperty((String) this.f3392a, propertyName, value).getError()) == null) {
            return;
        }
        StringBuilder t3 = i2.u.t(StubApp.getString2(2967), propertyName, StubApp.getString2(2968), error, StubApp.getString2(2969));
        t3.append(value);
        MapboxLogger.logE(StubApp.getString2(2970), t3.toString());
    }

    public x(r database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.f3392a = database;
        this.f3393b = new AtomicBoolean(false);
        this.f3394c = LazyKt.lazy(new Ac.m(this, 4));
    }
}
