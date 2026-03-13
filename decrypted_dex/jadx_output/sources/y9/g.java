package y9;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineColorResources;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineScaleExpressions;
import com.stub.StubApp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23565a;

    /* renamed from: b, reason: collision with root package name */
    public final RouteLineColorResources f23566b;

    /* renamed from: c, reason: collision with root package name */
    public final RouteLineScaleExpressions f23567c;

    /* renamed from: d, reason: collision with root package name */
    public final List f23568d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23569e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f23570f;

    /* renamed from: g, reason: collision with root package name */
    public final int f23571g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f23572h;

    /* renamed from: i, reason: collision with root package name */
    public final List f23573i;

    public g(Context context, RouteLineColorResources routeLineColorResources, RouteLineScaleExpressions routeLineScaleExpressions, List list, int i3, Drawable drawable, int i10, Drawable drawable2, List list2) {
        this.f23565a = context;
        this.f23566b = routeLineColorResources;
        this.f23567c = routeLineScaleExpressions;
        this.f23568d = list;
        this.f23569e = i3;
        this.f23570f = drawable;
        this.f23571g = i10;
        this.f23572h = drawable2;
        this.f23573i = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(g.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.ui.maps.route.line.model.MapboxRouteLineViewOptions");
        g gVar = (g) obj;
        if (!Intrinsics.areEqual(this.f23565a, gVar.f23565a) || !Intrinsics.areEqual(this.f23566b, gVar.f23566b) || !Intrinsics.areEqual(this.f23567c, gVar.f23567c) || !Intrinsics.areEqual(this.f23568d, gVar.f23568d) || this.f23569e != gVar.f23569e || !Intrinsics.areEqual(this.f23570f, gVar.f23570f) || this.f23571g != gVar.f23571g || !Intrinsics.areEqual(this.f23572h, gVar.f23572h) || !Intrinsics.areEqual(this.f23573i, gVar.f23573i)) {
            return false;
        }
        S6.a aVar = S6.a.f6593a;
        if (!Intrinsics.areEqual(aVar, aVar)) {
            return false;
        }
        S6.b bVar = S6.b.f6594a;
        return Intrinsics.areEqual(bVar, bVar) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual("middle", "middle") && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        return Double.hashCode(0.4d) + i2.u.e(i2.u.e(E1.a.d(5.0d, (((Double.hashCode(0.0d) + i2.u.e(E1.a.d(0.375d, i2.u.e((((((this.f23573i.hashCode() + ((this.f23572h.hashCode() + ((((this.f23570f.hashCode() + ((E1.a.d(30.0d, i2.u.e(E1.a.d(7.0d, E1.a.d(1.0d, E1.a.g((this.f23567c.hashCode() + ((this.f23566b.hashCode() + (this.f23565a.hashCode() * 31)) * 31)) * 31, 31, this.f23568d), 31), 31), 31, false), 31) + this.f23569e) * 31)) * 31) + this.f23571g) * 31)) * 31)) * 31) - 1364013995) * 31) + 107868) * 31, 961, false), 31), 31, false)) * 31) - 1074341483) * 961, 31), 31, false), 31, false);
    }

    public final String toString() {
        return StubApp.getString2(24685) + this.f23565a + StubApp.getString2(24686) + this.f23566b + StubApp.getString2(14776) + this.f23567c + StubApp.getString2(14777) + this.f23568d + StubApp.getString2(24687) + this.f23569e + StubApp.getString2(24688) + this.f23570f + StubApp.getString2(14783) + this.f23571g + StubApp.getString2(24689) + this.f23572h + StubApp.getString2(14784) + this.f23573i + StubApp.getString2(14785) + S6.a.f6593a + StubApp.getString2(14786) + S6.b.f6594a + StubApp.getString2(24690);
    }
}
