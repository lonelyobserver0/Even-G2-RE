package A9;

import com.stub.StubApp;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final com.mapbox.navigation.base.route.g f225a;

    public d(com.mapbox.navigation.base.route.g route) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.f225a = route;
    }

    @Override // A9.a
    public final Object a(Function function) {
        Function1 f10 = (Function1) function;
        Intrinsics.checkNotNullParameter(f10, "f");
        return f10.invoke(this.f225a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.ui.maps.util.CacheResultUtils.CacheResultKeyRoute<*>");
        return Intrinsics.areEqual(this.f225a.f12506i, ((d) obj).f225a.f12506i);
    }

    public final int hashCode() {
        return this.f225a.f12506i.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(369) + this.f225a + ')';
    }
}
