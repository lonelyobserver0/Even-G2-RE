package r9;

import com.mapbox.maps.StylePropertyValue;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import com.mapbox.navigation.ui.maps.route.line.model.MapboxRouteLineApiOptions;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class j extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f20437a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapboxRouteLineApiOptions f20438b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f20439c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f20440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20441e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, MapboxRouteLineApiOptions mapboxRouteLineApiOptions, double d8, List list, int i3) {
        super(1);
        this.f20437a = lVar;
        this.f20438b = mapboxRouteLineApiOptions;
        this.f20439c = d8;
        this.f20440d = list;
        this.f20441e = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RouteLineViewOptionsData options = (RouteLineViewOptionsData) obj;
        Intrinsics.checkNotNullParameter(options, "options");
        if (!options.getRouteLineBlurEnabled()) {
            r rVar = r.f20461a;
            return r.m(0);
        }
        if (options.getApplyTrafficColorsToRouteLineBlur()) {
            return (StylePropertyValue) this.f20437a.invoke(options);
        }
        if (!this.f20438b.getStyleInactiveRouteLegsIndependently()) {
            r rVar2 = r.f20461a;
            return r.m(options.getRouteLineColorResources().getBlurColor());
        }
        r rVar3 = r.f20461a;
        return r.e(this.f20439c, this.f20440d, options.getRouteLineColorResources().getBlurColor(), options.getRouteLineColorResources().getBlurColor(), 0, this.f20441e);
    }
}
