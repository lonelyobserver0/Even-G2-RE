package x9;

import com.mapbox.geojson.FeatureCollection;
import com.mapbox.maps.Style;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineClearValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class D extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f22906a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Style f22907b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f22908c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ RouteLineClearValue f22909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22910e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f22911f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f22912g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(I i3, Style style, String str, RouteLineClearValue routeLineClearValue, int i10, int i11, String str2) {
        super(0);
        this.f22906a = i3;
        this.f22907b = style;
        this.f22908c = str;
        this.f22909d = routeLineClearValue;
        this.f22910e = i10;
        this.f22911f = i11;
        this.f22912g = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        FeatureCollection featureCollection = this.f22909d.getAlternativeRoutesSources$ui_maps_release().get(this.f22910e);
        Integer valueOf = Integer.valueOf(this.f22911f);
        Style style = this.f22907b;
        I i3 = this.f22906a;
        i3.getClass();
        String str = this.f22908c;
        I.k(style, str, featureCollection, valueOf);
        i3.f22958n.put(new y9.r(str), new y9.o(this.f22912g));
        return Unit.INSTANCE;
    }
}
