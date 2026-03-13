package O8;

import Qb.C0203k;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.bindgen.Expected;
import com.mapbox.navigator.SetRouteCallback;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e implements com.mapbox.navigation.base.route.j, SetRouteCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0203k f5232a;

    public /* synthetic */ e(C0203k c0203k) {
        this.f5232a = c0203k;
    }

    public void a(E8.d error) {
        Intrinsics.checkNotNullParameter(error, "error");
        C0203k c0203k = this.f5232a;
        if (c0203k.w()) {
            Result.Companion companion = Result.INSTANCE;
            c0203k.resumeWith(Result.m40constructorimpl(new R8.n(error)));
        }
    }

    @Override // com.mapbox.navigation.base.route.j
    public void d(ArrayList routes, String routerOrigin) {
        Intrinsics.checkNotNullParameter(routes, "routes");
        Intrinsics.checkNotNullParameter(routerOrigin, "routerOrigin");
        C0203k c0203k = this.f5232a;
        if (c0203k.w()) {
            Result.Companion companion = Result.INSTANCE;
            c0203k.resumeWith(Result.m40constructorimpl(new B(routes, routerOrigin)));
        }
    }

    @Override // com.mapbox.navigation.base.route.j
    public void g(RouteOptions routeOptions, String routerOrigin) {
        Intrinsics.checkNotNullParameter(routeOptions, "routeOptions");
        Intrinsics.checkNotNullParameter(routerOrigin, "routerOrigin");
        C0203k c0203k = this.f5232a;
        if (c0203k.w()) {
            Result.Companion companion = Result.INSTANCE;
            c0203k.resumeWith(Result.m40constructorimpl(z.f5286a));
        }
    }

    @Override // com.mapbox.navigation.base.route.j
    public void q(List reasons, RouteOptions routeOptions) {
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        Intrinsics.checkNotNullParameter(routeOptions, "routeOptions");
        C0203k c0203k = this.f5232a;
        if (c0203k.w()) {
            Result.Companion companion = Result.INSTANCE;
            c0203k.resumeWith(Result.m40constructorimpl(new A(reasons)));
        }
    }

    @Override // com.mapbox.navigator.SetRouteCallback
    public void run(Expected result) {
        Intrinsics.checkNotNullParameter(result, "result");
        result.onError(Z8.d.f9046c);
        this.f5232a.resumeWith(Result.m40constructorimpl(result));
    }
}
