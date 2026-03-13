package r9;

import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import com.stub.StubApp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class o extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20454a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f20455b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(double d8, int i3) {
        super(1);
        this.f20454a = i3;
        this.f20455b = d8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String string2 = StubApp.getString2(345);
        double d8 = this.f20455b;
        switch (this.f20454a) {
            case 0:
                N6.a stop = (N6.a) obj;
                Intrinsics.checkNotNullParameter(stop, "$this$stop");
                stop.e(1.0d - d8);
                stop.c(0);
                return Unit.INSTANCE;
            case 1:
                RouteLineViewOptionsData routeLineViewOptionsData = (RouteLineViewOptionsData) obj;
                Intrinsics.checkNotNullParameter(routeLineViewOptionsData, string2);
                r rVar = r.f20461a;
                return r.l(d8, routeLineViewOptionsData.getRouteLineColorResources().getAlternativeRouteDefaultColor());
            case 2:
                RouteLineViewOptionsData routeLineViewOptionsData2 = (RouteLineViewOptionsData) obj;
                Intrinsics.checkNotNullParameter(routeLineViewOptionsData2, string2);
                r rVar2 = r.f20461a;
                return r.l(d8, routeLineViewOptionsData2.getRouteLineColorResources().getAlternativeRouteCasingColor());
            case 3:
                RouteLineViewOptionsData routeLineViewOptionsData3 = (RouteLineViewOptionsData) obj;
                Intrinsics.checkNotNullParameter(routeLineViewOptionsData3, string2);
                r rVar3 = r.f20461a;
                return r.l(d8, routeLineViewOptionsData3.getRouteLineColorResources().getAlternativeRouteDefaultColor());
            default:
                RouteLineViewOptionsData routeLineViewOptionsData4 = (RouteLineViewOptionsData) obj;
                Intrinsics.checkNotNullParameter(routeLineViewOptionsData4, string2);
                r rVar4 = r.f20461a;
                return r.l(d8, routeLineViewOptionsData4.getRouteLineColorResources().getAlternativeRouteCasingColor());
        }
    }
}
