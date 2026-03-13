package n8;

import D9.l;
import E8.n;
import V8.w;
import V8.x;
import V8.y;
import V8.z;
import Z9.C0366a;
import com.google.android.gms.internal.measurement.L1;
import com.mapbox.common.BillingService;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.SdkInformation;
import com.mapbox.common.SessionSKUIdentifier;
import com.mapbox.common.UserSKUIdentifier;
import com.stub.StubApp;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B6.a f17880a;

    public /* synthetic */ b(B6.a aVar) {
        this.f17880a = aVar;
    }

    public final void a(z navigationSessionState) {
        B6.a this$0 = this.f17880a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(navigationSessionState, "navigationSessionState");
        if (!Intrinsics.areEqual(navigationSessionState, y.f7905a)) {
            C0366a c0366a = (C0366a) this$0.f672f;
            ((BillingService) c0366a.f9105b).triggerUserBillingEvent((SdkInformation) this$0.f671e, UserSKUIdentifier.NAV3_CORE_MAU, new C1394a(this$0, 1));
        }
        if (navigationSessionState instanceof y) {
            SessionSKUIdentifier i3 = this$0.i();
            if (i3 != null) {
                ((BillingService) ((C0366a) this$0.f672f).f9105b).pauseBillingSession(i3);
                if (l.a(l.g(), LoggingLevel.INFO)) {
                    l.f(L1.h(i3).concat(StubApp.getString2(21460)), StubApp.getString2(647));
                    return;
                }
                return;
            }
            return;
        }
        if (navigationSessionState instanceof x) {
            Object obj = this$0.f670d;
            SessionSKUIdentifier sessionSKUIdentifier = SessionSKUIdentifier.NAV3_SES_CORE_FDTRIP;
            long millis = TimeUnit.HOURS.toMillis(1L);
            SessionSKUIdentifier i10 = this$0.i();
            String string2 = StubApp.getString2(21461);
            if (i10 != sessionSKUIdentifier) {
                this$0.b(sessionSKUIdentifier, millis, string2);
                return;
            } else {
                ((BillingService) ((C0366a) this$0.f672f).f9105b).resumeBillingSession(i10, new n(this$0, sessionSKUIdentifier, millis, string2, 4));
                return;
            }
        }
        if (navigationSessionState instanceof w) {
            Object obj2 = this$0.f670d;
            SessionSKUIdentifier sessionSKUIdentifier2 = SessionSKUIdentifier.NAV3_SES_CORE_AGTRIP;
            SessionSKUIdentifier i11 = this$0.i();
            long j = 0;
            String string22 = StubApp.getString2(21462);
            if (i11 != sessionSKUIdentifier2) {
                this$0.b(sessionSKUIdentifier2, 0L, string22);
            } else {
                ((BillingService) ((C0366a) this$0.f672f).f9105b).resumeBillingSession(i11, new n(this$0, sessionSKUIdentifier2, j, string22, 4));
            }
        }
    }
}
