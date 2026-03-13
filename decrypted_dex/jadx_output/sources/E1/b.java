package E1;

import E9.r;
import Qb.K0;
import Qb.P;
import Rb.d;
import Y6.j;
import Y6.t;
import Zb.e;
import android.media.AudioFocusRequest;
import android.os.CancellationSignal;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.Style;
import com.mapbox.navigation.base.route.g;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import com.mapbox.navigation.ui.maps.route.line.model.MapboxRouteLineApiOptions;
import com.stub.StubApp;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import q8.AbstractC1526a;
import v.C1795h;
import v.C1797j;
import y9.h;
import y9.n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1864a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1865b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1866c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i3, Object obj, Object obj2) {
        super(1);
        this.f1864a = i3;
        this.f1865b = obj;
        this.f1866c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String string2 = StubApp.getString2(345);
        Object obj2 = this.f1866c;
        Object obj3 = this.f1865b;
        switch (this.f1864a) {
            case 0:
                Throwable th = (Throwable) obj;
                C1795h c1795h = (C1795h) obj3;
                if (th == null) {
                    Object e10 = ((P) obj2).e();
                    c1795h.f21516d = true;
                    C1797j c1797j = c1795h.f21514b;
                    if (c1797j != null && c1797j.f21519b.j(e10)) {
                        c1795h.f21513a = null;
                        c1795h.f21514b = null;
                        c1795h.f21515c = null;
                    }
                } else if (th instanceof CancellationException) {
                    c1795h.f21516d = true;
                    C1797j c1797j2 = c1795h.f21514b;
                    if (c1797j2 != null && c1797j2.f21519b.cancel(true)) {
                        c1795h.f21513a = null;
                        c1795h.f21514b = null;
                        c1795h.f21515c = null;
                    }
                } else {
                    c1795h.f21516d = true;
                    C1797j c1797j3 = c1795h.f21514b;
                    if (c1797j3 != null && c1797j3.f21519b.k(th)) {
                        c1795h.f21513a = null;
                        c1795h.f21514b = null;
                        c1795h.f21515c = null;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                AudioFocusRequest.Builder builder = (AudioFocusRequest.Builder) obj;
                Intrinsics.checkNotNullParameter(builder, "$this$null");
                builder.setAudioAttributes(((r) obj3).a((F9.a) obj2));
                return Unit.INSTANCE;
            case 2:
                CancellationSignal cancellationSignal = (CancellationSignal) obj3;
                Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
                cancellationSignal.cancel();
                ((K0) obj2).d(null);
                return Unit.INSTANCE;
            case 3:
                ((d) obj3).f6357a.removeCallbacks((Q4.b) obj2);
                return Unit.INSTANCE;
            case 4:
                Y6.a cameraAnimationsPlugin = (Y6.a) obj;
                Intrinsics.checkNotNullParameter(cameraAnimationsPlugin, "$this$cameraAnimationsPlugin");
                return ((j) cameraAnimationsPlugin).h((CameraOptions) obj3, (t) obj2);
            case 5:
                ((e) obj3).g(obj2);
                return Unit.INSTANCE;
            case 6:
                N6.a stop = (N6.a) obj;
                Intrinsics.checkNotNullParameter(stop, "$this$stop");
                n nVar = (n) obj3;
                stop.e(nVar.f23549a);
                stop.c(nVar.f23591d.a((RouteLineViewOptionsData) obj2));
                return Unit.INSTANCE;
            case 7:
                RouteLineViewOptionsData routeLineViewOptionsData = (RouteLineViewOptionsData) obj;
                Intrinsics.checkNotNullParameter(routeLineViewOptionsData, string2);
                r9.r rVar = r9.r.f20461a;
                x9.t tVar = (x9.t) obj2;
                MapboxRouteLineApiOptions mapboxRouteLineApiOptions = tVar.f23063a;
                CopyOnWriteArrayList copyOnWriteArrayList = tVar.f23076o;
                g gVar = (g) obj3;
                Double d8 = (Double) tVar.f23077p.get(gVar.f12506i);
                return AbstractC1526a.M(r9.r.o(gVar, mapboxRouteLineApiOptions, routeLineViewOptionsData, copyOnWriteArrayList, d8 != null ? d8.doubleValue() : 0.0d));
            case 8:
                RouteLineViewOptionsData routeLineViewOptionsData2 = (RouteLineViewOptionsData) obj;
                Intrinsics.checkNotNullParameter(routeLineViewOptionsData2, string2);
                r9.r rVar2 = r9.r.f20461a;
                h hVar = (h) obj3;
                Intrinsics.checkNotNull(hVar);
                g gVar2 = hVar.f23574a;
                x9.t tVar2 = (x9.t) obj2;
                MapboxRouteLineApiOptions mapboxRouteLineApiOptions2 = tVar2.f23063a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = tVar2.f23076o;
                Double d10 = (Double) tVar2.f23077p.get(gVar2.f12506i);
                return AbstractC1526a.M(r9.r.o(gVar2, mapboxRouteLineApiOptions2, routeLineViewOptionsData2, copyOnWriteArrayList2, d10 != null ? d10.doubleValue() : 0.0d));
            default:
                Style style = (Style) obj;
                Intrinsics.checkNotNullParameter(style, "style");
                Value value = (Value) obj3;
                if (value != null) {
                    style.setStyleLayerProperty((String) obj2, StubApp.getString2(1791), value);
                }
                return Unit.INSTANCE;
        }
    }
}
