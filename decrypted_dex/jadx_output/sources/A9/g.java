package A9;

import android.util.LruCache;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l4.E0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f233a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final E0 f234b;

    public g(r9.d dVar) {
        this.f234b = new E0(dVar, new LruCache(1));
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f233a) {
            case 0:
                return this.f234b.E(new b(obj));
            default:
                com.mapbox.navigation.base.route.g route = (com.mapbox.navigation.base.route.g) obj;
                Intrinsics.checkNotNullParameter(route, "route");
                return this.f234b.E(new d(route));
        }
    }

    public g(r9.d dVar, LruCache lruCache) {
        this.f234b = new E0(dVar, lruCache);
    }
}
