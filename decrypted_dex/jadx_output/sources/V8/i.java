package V8;

import com.mapbox.common.LoggingLevel;
import com.mapbox.navigator.NavigationStatus;
import com.mapbox.navigator.NavigationStatusOrigin;
import com.mapbox.navigator.NavigatorObserver;
import com.mapbox.navigator.RoutesChangeInfo;
import com.stub.StubApp;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.TimeSource;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i implements NavigatorObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f7831a;

    public i(q qVar) {
        this.f7831a = qVar;
    }

    @Override // com.mapbox.navigator.NavigatorObserver
    public final void onRoutesChanged(RoutesChangeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
    }

    @Override // com.mapbox.navigator.NavigatorObserver
    public final void onStatus(NavigationStatusOrigin origin, NavigationStatus status) {
        q qVar = this.f7831a;
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(status, "status");
        try {
            E7.a aVar = E7.a.f1927a;
            String string2 = StubApp.getString2("6670");
            if (!E7.a.a()) {
                q.a(qVar, status);
                return;
            }
            E7.a.c(string2);
            try {
                long m1480markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
                q.a(qVar, status);
                Unit unit = Unit.INSTANCE;
                Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto));
            } finally {
                E7.a.b(string2);
            }
        } catch (Throwable cause) {
            if (D9.l.a(D9.l.g(), LoggingLevel.ERROR)) {
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(6671));
                sb2.append(origin);
                sb2.append(StubApp.getString2(5757));
                sb2.append(status);
                sb2.append(StubApp.getString2(6672));
                sb2.append(cause);
                sb2.append(StubApp.getString2(6673));
                sb2.append(qVar.f7874e);
                sb2.append(StubApp.getString2(6674));
                com.mapbox.navigation.base.route.g gVar = qVar.f7876g;
                sb2.append(gVar != null ? gVar.f12506i : null);
                D9.l.e(sb2.toString(), StubApp.getString2(6675));
            }
            Intrinsics.checkNotNullParameter(cause, "cause");
            throw new u(StubApp.getString2(6676), cause);
        }
    }
}
