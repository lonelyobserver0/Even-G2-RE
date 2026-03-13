package x9;

import com.mapbox.geojson.FeatureCollection;
import com.mapbox.maps.Style;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineClearValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class E extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f22913a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Style f22914b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f22915c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ RouteLineClearValue f22916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22917e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f22918f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f22919g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(I i3, Style style, String str, RouteLineClearValue routeLineClearValue, int i10, String str2, String str3) {
        super(0);
        this.f22913a = i3;
        this.f22914b = style;
        this.f22915c = str;
        this.f22916d = routeLineClearValue;
        this.f22917e = i10;
        this.f22918f = str2;
        this.f22919g = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        FeatureCollection primaryRouteSource = this.f22916d.getPrimaryRouteSource();
        Integer valueOf = Integer.valueOf(this.f22917e);
        Style style = this.f22914b;
        String str = this.f22915c;
        I i3 = this.f22913a;
        i3.getClass();
        I.k(style, str, primaryRouteSource, valueOf);
        i3.f22958n.put(new y9.r(this.f22918f), new y9.o(this.f22919g));
        return Unit.INSTANCE;
    }
}
