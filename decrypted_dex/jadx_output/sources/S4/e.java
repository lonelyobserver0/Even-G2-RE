package S4;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C0587a0;
import com.google.android.gms.internal.measurement.C0607e0;
import com.google.android.gms.internal.measurement.C0617g0;
import com.google.android.gms.internal.measurement.C0657o0;
import com.google.android.gms.internal.measurement.G;
import com.google.android.gms.internal.measurement.X;
import com.google.android.gms.internal.measurement.Y;
import com.google.android.gms.internal.measurement.Z;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import l4.Q0;
import no.nordicsemi.android.dfu.DfuServiceInitiator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0657o0 f6592a;

    public e(C0657o0 c0657o0) {
        this.f6592a = c0657o0;
    }

    @Override // l4.Q0
    public final void a(String str, String str2, Bundle bundle) {
        C0657o0 c0657o0 = this.f6592a;
        c0657o0.a(new X(c0657o0, str, str2, bundle, true));
    }

    @Override // l4.Q0
    public final String b() {
        C0657o0 c0657o0 = this.f6592a;
        G g10 = new G();
        c0657o0.a(new C0617g0(c0657o0, g10, 3, false));
        return g10.f(500L);
    }

    @Override // l4.Q0
    public final String c() {
        C0657o0 c0657o0 = this.f6592a;
        G g10 = new G();
        c0657o0.a(new C0617g0(c0657o0, g10, 4, false));
        return g10.f(500L);
    }

    @Override // l4.Q0
    public final void d(Bundle bundle) {
        C0657o0 c0657o0 = this.f6592a;
        c0657o0.a(new Y(c0657o0, bundle, 0));
    }

    @Override // l4.Q0
    public final void e(String str) {
        C0657o0 c0657o0 = this.f6592a;
        c0657o0.a(new C0587a0(c0657o0, str, 2));
    }

    @Override // l4.Q0
    public final void f(String str) {
        C0657o0 c0657o0 = this.f6592a;
        c0657o0.a(new C0587a0(c0657o0, str, 1));
    }

    @Override // l4.Q0
    public final long g() {
        C0657o0 c0657o0 = this.f6592a;
        G g10 = new G();
        c0657o0.a(new C0617g0(c0657o0, g10, 2, false));
        Long l9 = (Long) G.K(g10.g(500L), Long.class);
        if (l9 != null) {
            return l9.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i3 = c0657o0.f11638d + 1;
        c0657o0.f11638d = i3;
        return nextLong + i3;
    }

    @Override // l4.Q0
    public final void h(String str, String str2, Bundle bundle) {
        C0657o0 c0657o0 = this.f6592a;
        c0657o0.a(new Z(c0657o0, str, str2, bundle, 0));
    }

    @Override // l4.Q0
    public final List i(String str, String str2) {
        C0657o0 c0657o0 = this.f6592a;
        G g10 = new G();
        c0657o0.a(new Z(c0657o0, str, str2, g10, 1));
        List list = (List) G.K(g10.g(DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    @Override // l4.Q0
    public final int j(String str) {
        C0657o0 c0657o0 = this.f6592a;
        G g10 = new G();
        c0657o0.a(new C0607e0(c0657o0, str, g10));
        Integer num = (Integer) G.K(g10.g(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @Override // l4.Q0
    public final String k() {
        C0657o0 c0657o0 = this.f6592a;
        G g10 = new G();
        c0657o0.a(new C0617g0(c0657o0, g10, 1, false));
        return g10.f(50L);
    }

    @Override // l4.Q0
    public final String l() {
        C0657o0 c0657o0 = this.f6592a;
        G g10 = new G();
        c0657o0.a(new C0617g0(c0657o0, g10, 0, false));
        return g10.f(500L);
    }

    @Override // l4.Q0
    public final Map m(String str, String str2, boolean z2) {
        C0657o0 c0657o0 = this.f6592a;
        G g10 = new G();
        c0657o0.a(new X(c0657o0, str, str2, z2, g10));
        Bundle g11 = g10.g(DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT);
        if (g11 == null || g11.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap(g11.size());
        for (String str3 : g11.keySet()) {
            Object obj = g11.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }
}
