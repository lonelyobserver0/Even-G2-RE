package f9;

import com.mapbox.common.ReachabilityFactory;
import com.mapbox.common.ReachabilityInterface;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: f9.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0933a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0933a f14182a = new C0933a(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ReachabilityInterface reachability = ReachabilityFactory.reachability(null);
        Intrinsics.checkNotNullExpressionValue(reachability, "reachability(null)");
        return new C9.b(reachability);
    }
}
