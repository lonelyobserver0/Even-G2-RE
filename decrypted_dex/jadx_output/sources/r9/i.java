package r9;

import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import com.mapbox.navigation.ui.maps.route.line.model.MapboxRouteLineApiOptions;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineColorResources;
import com.stub.StubApp;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import q8.AbstractC1526a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class i extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20433a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapboxRouteLineApiOptions f20434b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f20435c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20436d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(MapboxRouteLineApiOptions mapboxRouteLineApiOptions, List list, int i3, int i10) {
        super(1);
        this.f20433a = i10;
        this.f20434b = mapboxRouteLineApiOptions;
        this.f20435c = list;
        this.f20436d = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String string2 = StubApp.getString2(22759);
        List list = this.f20435c;
        int i3 = this.f20436d;
        MapboxRouteLineApiOptions mapboxRouteLineApiOptions = this.f20434b;
        String string22 = StubApp.getString2(345);
        switch (this.f20433a) {
            case 0:
                RouteLineViewOptionsData routeLineViewOptionsData = (RouteLineViewOptionsData) obj;
                Intrinsics.checkNotNullParameter(routeLineViewOptionsData, string22);
                RouteLineColorResources routeLineColorResources = routeLineViewOptionsData.getRouteLineColorResources();
                int inactiveRouteLegRestrictedRoadColor = mapboxRouteLineApiOptions.getStyleInactiveRouteLegsIndependently() ? routeLineColorResources.getInactiveRouteLegRestrictedRoadColor() : routeLineColorResources.getRestrictedRoadColor();
                r rVar = r.f20461a;
                return AbstractC1526a.M(r.a(list, i3, mapboxRouteLineApiOptions.getCalculateRestrictedRoadSections(), routeLineColorResources.getRestrictedRoadColor(), inactiveRouteLegRestrictedRoadColor));
            case 1:
                RouteLineViewOptionsData routeLineViewOptionsData2 = (RouteLineViewOptionsData) obj;
                Intrinsics.checkNotNullParameter(routeLineViewOptionsData2, string22);
                if (mapboxRouteLineApiOptions.getStyleInactiveRouteLegsIndependently() && mapboxRouteLineApiOptions.getVanishingRouteLineEnabled()) {
                    r rVar2 = r.f20461a;
                    int routeLineTraveledCasingColor = routeLineViewOptionsData2.getRouteLineColorResources().getRouteLineTraveledCasingColor();
                    List list2 = this.f20435c;
                    Intrinsics.checkNotNullParameter(list2, string2);
                    return r.k(0.0d, list2, routeLineTraveledCasingColor, routeLineTraveledCasingColor, 0, new h(i3, 1));
                }
                if (mapboxRouteLineApiOptions.getStyleInactiveRouteLegsIndependently()) {
                    r rVar3 = r.f20461a;
                    return r.e(0.0d, this.f20435c, routeLineViewOptionsData2.getRouteLineColorResources().getRouteLineTraveledCasingColor(), routeLineViewOptionsData2.getRouteLineColorResources().getRouteLineTraveledCasingColor(), 0, this.f20436d);
                }
                r rVar4 = r.f20461a;
                return r.m(routeLineViewOptionsData2.getRouteLineColorResources().getRouteLineTraveledCasingColor());
            case 2:
                RouteLineViewOptionsData routeLineViewOptionsData3 = (RouteLineViewOptionsData) obj;
                Intrinsics.checkNotNullParameter(routeLineViewOptionsData3, string22);
                if (mapboxRouteLineApiOptions.getStyleInactiveRouteLegsIndependently() && mapboxRouteLineApiOptions.getVanishingRouteLineEnabled()) {
                    r rVar5 = r.f20461a;
                    int routeLineTraveledColor = routeLineViewOptionsData3.getRouteLineColorResources().getRouteLineTraveledColor();
                    List list3 = this.f20435c;
                    Intrinsics.checkNotNullParameter(list3, string2);
                    return r.k(0.0d, list3, routeLineTraveledColor, routeLineTraveledColor, 0, new h(i3, 1));
                }
                if (mapboxRouteLineApiOptions.getStyleInactiveRouteLegsIndependently()) {
                    r rVar6 = r.f20461a;
                    return r.e(0.0d, this.f20435c, routeLineViewOptionsData3.getRouteLineColorResources().getRouteLineTraveledColor(), routeLineViewOptionsData3.getRouteLineColorResources().getRouteLineTraveledColor(), 0, this.f20436d);
                }
                r rVar7 = r.f20461a;
                return r.m(routeLineViewOptionsData3.getRouteLineColorResources().getRouteLineTraveledColor());
            default:
                RouteLineViewOptionsData routeLineViewOptionsData4 = (RouteLineViewOptionsData) obj;
                Intrinsics.checkNotNullParameter(routeLineViewOptionsData4, string22);
                r rVar8 = r.f20461a;
                return AbstractC1526a.M(r.a(list, i3, mapboxRouteLineApiOptions.getCalculateRestrictedRoadSections(), routeLineViewOptionsData4.getRouteLineColorResources().getRestrictedRoadColor(), y9.u.f23607A.a(routeLineViewOptionsData4)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(List list, int i3, MapboxRouteLineApiOptions mapboxRouteLineApiOptions) {
        super(1);
        this.f20433a = 3;
        this.f20435c = list;
        this.f20436d = i3;
        this.f20434b = mapboxRouteLineApiOptions;
    }
}
