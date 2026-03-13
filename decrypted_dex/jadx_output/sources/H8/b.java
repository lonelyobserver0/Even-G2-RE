package H8;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import m8.r;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Lazy f2941a = LazyKt.lazy(a.f2937c);

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f2942b = LazyKt.lazy(a.f2936b);

    public static c a() {
        return (c) f2941a.getValue();
    }

    public static final void b(d mapboxNavigationObserver) {
        r rVar;
        Intrinsics.checkNotNullParameter(mapboxNavigationObserver, "mapboxNavigationObserver");
        c a3 = a();
        a3.getClass();
        Intrinsics.checkNotNullParameter(mapboxNavigationObserver, "mapboxNavigationObserver");
        f a9 = a3.a();
        a9.getClass();
        Intrinsics.checkNotNullParameter(mapboxNavigationObserver, "mapboxNavigationObserver");
        if (!a9.f2949b.add(mapboxNavigationObserver) || (rVar = a9.f2950c) == null) {
            return;
        }
        mapboxNavigationObserver.b(rVar);
    }

    public static final void c(d mapboxNavigationObserver) {
        r rVar;
        Intrinsics.checkNotNullParameter(mapboxNavigationObserver, "mapboxNavigationObserver");
        c a3 = a();
        a3.getClass();
        Intrinsics.checkNotNullParameter(mapboxNavigationObserver, "mapboxNavigationObserver");
        f a9 = a3.a();
        a9.getClass();
        Intrinsics.checkNotNullParameter(mapboxNavigationObserver, "mapboxNavigationObserver");
        if (!a9.f2949b.remove(mapboxNavigationObserver) || (rVar = a9.f2950c) == null) {
            return;
        }
        mapboxNavigationObserver.a(rVar);
    }
}
