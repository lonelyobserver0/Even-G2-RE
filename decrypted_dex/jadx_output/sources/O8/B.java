package O8;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class B extends C {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5222a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5223b;

    public B(ArrayList routes, String routerOrigin) {
        Intrinsics.checkNotNullParameter(routes, "routes");
        Intrinsics.checkNotNullParameter(routerOrigin, "routerOrigin");
        this.f5222a = routes;
        this.f5223b = routerOrigin;
    }
}
