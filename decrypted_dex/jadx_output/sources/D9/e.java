package D9;

import com.mapbox.common.NetworkStatus;
import com.mapbox.common.ReachabilityChanged;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e implements ReachabilityChanged {

    /* renamed from: a, reason: collision with root package name */
    public final Sb.e f1511a;

    public e(Sb.e networkStatusChannel) {
        Intrinsics.checkNotNullParameter(networkStatusChannel, "networkStatusChannel");
        this.f1511a = networkStatusChannel;
    }

    @Override // com.mapbox.common.ReachabilityChanged
    public final void run(NetworkStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        int i3 = d.f1510a[status.ordinal()];
        Sb.e eVar = this.f1511a;
        String string2 = StubApp.getString2(1553);
        String string22 = StubApp.getString2(1554);
        if (i3 == 1) {
            l.d(string22 + status, string2);
            boolean z2 = eVar.j(Boolean.FALSE) instanceof Sb.l;
            return;
        }
        if (i3 == 2 || i3 == 3 || i3 == 4) {
            l.d(string22 + status, string2);
            boolean z10 = eVar.j(Boolean.TRUE) instanceof Sb.l;
        }
    }
}
