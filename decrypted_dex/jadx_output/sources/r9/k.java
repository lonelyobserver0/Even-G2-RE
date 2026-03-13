package r9;

import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import com.mapbox.navigation.ui.maps.route.line.model.MapboxRouteLineApiOptions;
import com.stub.StubApp;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class k extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20442a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapboxRouteLineApiOptions f20443b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f20444c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f20445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20446e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(MapboxRouteLineApiOptions mapboxRouteLineApiOptions, double d8, List list, int i3, int i10) {
        super(1);
        this.f20442a = i10;
        this.f20443b = mapboxRouteLineApiOptions;
        this.f20444c = d8;
        this.f20445d = list;
        this.f20446e = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MapboxRouteLineApiOptions mapboxRouteLineApiOptions = this.f20443b;
        String string2 = StubApp.getString2(345);
        switch (this.f20442a) {
            case 0:
                RouteLineViewOptionsData routeLineViewOptionsData = (RouteLineViewOptionsData) obj;
                Intrinsics.checkNotNullParameter(routeLineViewOptionsData, string2);
                if (!mapboxRouteLineApiOptions.getStyleInactiveRouteLegsIndependently()) {
                    r rVar = r.f20461a;
                    return r.m(routeLineViewOptionsData.getRouteLineColorResources().getRouteDefaultColor());
                }
                r rVar2 = r.f20461a;
                int routeLineTraveledColor = routeLineViewOptionsData.getRouteLineColorResources().getRouteLineTraveledColor();
                int routeDefaultColor = routeLineViewOptionsData.getRouteLineColorResources().getRouteDefaultColor();
                int inActiveRouteLegsColor = routeLineViewOptionsData.getRouteLineColorResources().getInActiveRouteLegsColor();
                return r.e(this.f20444c, this.f20445d, routeLineTraveledColor, routeDefaultColor, inActiveRouteLegsColor, this.f20446e);
            default:
                RouteLineViewOptionsData routeLineViewOptionsData2 = (RouteLineViewOptionsData) obj;
                Intrinsics.checkNotNullParameter(routeLineViewOptionsData2, string2);
                if (!mapboxRouteLineApiOptions.getStyleInactiveRouteLegsIndependently()) {
                    r rVar3 = r.f20461a;
                    return r.m(routeLineViewOptionsData2.getRouteLineColorResources().getRouteCasingColor());
                }
                r rVar4 = r.f20461a;
                int routeLineTraveledCasingColor = routeLineViewOptionsData2.getRouteLineColorResources().getRouteLineTraveledCasingColor();
                int routeCasingColor = routeLineViewOptionsData2.getRouteLineColorResources().getRouteCasingColor();
                int inactiveRouteLegCasingColor = routeLineViewOptionsData2.getRouteLineColorResources().getInactiveRouteLegCasingColor();
                return r.e(this.f20444c, this.f20445d, routeLineTraveledCasingColor, routeCasingColor, inactiveRouteLegCasingColor, this.f20446e);
        }
    }
}
