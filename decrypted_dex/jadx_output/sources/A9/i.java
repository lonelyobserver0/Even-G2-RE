package A9;

import android.util.LruCache;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l4.E0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final E0 f236a;

    public i(r9.f fVar, LruCache lruCache) {
        this.f236a = new E0(fVar, lruCache);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        com.mapbox.navigation.base.route.g route = (com.mapbox.navigation.base.route.g) obj;
        Function1 trafficProvider = (Function1) obj2;
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(trafficProvider, "trafficProvider");
        return this.f236a.E(new f(route, trafficProvider));
    }
}
