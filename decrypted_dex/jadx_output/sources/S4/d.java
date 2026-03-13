package S4;

import com.google.android.gms.internal.measurement.C0617g0;
import com.google.android.gms.internal.measurement.C0657o0;
import com.google.android.gms.internal.measurement.G;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6590a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseAnalytics f6591b;

    public /* synthetic */ d(FirebaseAnalytics firebaseAnalytics, int i3) {
        this.f6590a = i3;
        this.f6591b = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f6590a) {
            case 0:
                C0657o0 c0657o0 = this.f6591b.f12042a;
                c0657o0.getClass();
                G g10 = new G();
                c0657o0.a(new C0617g0(c0657o0, g10, 5));
                return g10.f(120000L);
            default:
                C0657o0 c0657o02 = this.f6591b.f12042a;
                c0657o02.getClass();
                G g11 = new G();
                c0657o02.a(new C0617g0(c0657o02, g11, 6));
                return (Long) G.K(g11.g(120000L), Long.class);
        }
    }
}
