package x9;

import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import com.stub.StubApp;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class m extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23030a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f23031b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23032c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i3, int i10, List list) {
        super(1);
        this.f23030a = i10;
        this.f23031b = list;
        this.f23032c = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String string2 = StubApp.getString2(345);
        switch (this.f23030a) {
            case 0:
                RouteLineViewOptionsData routeLineViewOptionsData = (RouteLineViewOptionsData) obj;
                Intrinsics.checkNotNullParameter(routeLineViewOptionsData, string2);
                r9.r rVar = r9.r.f20461a;
                return r9.r.e(0.0d, this.f23031b, 0, routeLineViewOptionsData.getRouteLineColorResources().getRouteCasingColor(), 0, this.f23032c);
            case 1:
                RouteLineViewOptionsData routeLineViewOptionsData2 = (RouteLineViewOptionsData) obj;
                Intrinsics.checkNotNullParameter(routeLineViewOptionsData2, string2);
                r9.r rVar2 = r9.r.f20461a;
                return r9.r.e(0.0d, this.f23031b, 0, routeLineViewOptionsData2.getRouteLineColorResources().getRouteDefaultColor(), 0, this.f23032c);
            case 2:
                RouteLineViewOptionsData routeLineViewOptionsData3 = (RouteLineViewOptionsData) obj;
                Intrinsics.checkNotNullParameter(routeLineViewOptionsData3, string2);
                r9.r rVar3 = r9.r.f20461a;
                return r9.r.e(0.0d, this.f23031b, 0, routeLineViewOptionsData3.getRouteLineColorResources().getRouteLineTraveledCasingColor(), 0, this.f23032c);
            default:
                RouteLineViewOptionsData routeLineViewOptionsData4 = (RouteLineViewOptionsData) obj;
                Intrinsics.checkNotNullParameter(routeLineViewOptionsData4, string2);
                r9.r rVar4 = r9.r.f20461a;
                return r9.r.e(0.0d, this.f23031b, 0, routeLineViewOptionsData4.getRouteLineColorResources().getRouteLineTraveledColor(), 0, this.f23032c);
        }
    }
}
