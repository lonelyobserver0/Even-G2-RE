package E8;

import com.mapbox.api.directions.v5.models.RouteOptions;
import com.stub.StubApp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.time.Duration;
import kotlin.time.TimeSource;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class t extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f2033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.mapbox.navigation.base.route.j f2034b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RouteOptions f2035c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(long j, com.mapbox.navigation.base.route.j jVar, RouteOptions routeOptions) {
        super(0);
        this.f2033a = j;
        this.f2034b = jVar;
        this.f2035c = routeOptions;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        E7.a aVar = E7.a.f1927a;
        Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(this.f2033a));
        E7.a.b(StubApp.getString2(1928));
        this.f2034b.g(this.f2035c, StubApp.getString2(1933));
        return Unit.INSTANCE;
    }
}
