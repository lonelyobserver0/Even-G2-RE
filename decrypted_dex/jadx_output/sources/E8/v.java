package E8;

import com.stub.StubApp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.time.Duration;
import kotlin.time.TimeSource;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class v extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f2045a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O8.e f2046b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(long j, O8.e eVar) {
        super(0);
        this.f2045a = j;
        this.f2046b = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        E7.a aVar = E7.a.f1927a;
        Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(this.f2045a));
        E7.a.b(StubApp.getString2(1934));
        this.f2046b.a(new d(StubApp.getString2(1937), null, null, 14));
        return Unit.INSTANCE;
    }
}
