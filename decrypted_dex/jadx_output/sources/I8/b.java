package I8;

import com.mapbox.common.MapboxOptionsImpl;
import com.stub.StubApp;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f3235a = new b(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String service = StubApp.getString2(2878);
        Intrinsics.checkNotNullParameter(service, "service");
        String tokenForService = MapboxOptionsImpl.getTokenForService(service);
        Intrinsics.checkNotNullExpressionValue(tokenForService, "getTokenForService(service)");
        return tokenForService;
    }
}
