package R0;

import Z9.C;
import com.google.android.gms.internal.measurement.C0602d0;
import com.google.android.gms.internal.measurement.C0657o0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.common.HttpRequestError;
import com.mapbox.common.http_backend.RequestObserver;
import com.mapbox.common.module.MapboxHttpClient;
import kotlin.jvm.internal.Intrinsics;
import r0.AbstractC1560u;
import sb.C1674t0;
import v0.C1830z;
import v0.SurfaceHolderCallbackC1827w;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6061a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f6062b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6063c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6064d;

    public /* synthetic */ t(C c10, Object obj, long j) {
        this.f6061a = 0;
        this.f6063c = c10;
        this.f6064d = obj;
        this.f6062b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f6064d;
        long j = this.f6062b;
        Object obj2 = this.f6063c;
        switch (this.f6061a) {
            case 0:
                C c10 = (C) obj2;
                c10.getClass();
                int i3 = AbstractC1560u.f20190a;
                C1830z c1830z = ((SurfaceHolderCallbackC1827w) c10.f9078c).f21810a;
                w0.c cVar = c1830z.f21857t;
                w0.a I10 = cVar.I();
                cVar.J(I10, 26, new W4.a(I10, obj, j));
                if (c1830z.f21830X == obj) {
                    c1830z.f21844m.e(26, new C1674t0(10));
                    break;
                }
                break;
            case 1:
                MapboxHttpClient.request$lambda$5((RequestObserver) obj2, j, (HttpRequestError) obj);
                break;
            case 2:
                MapboxHttpClient.request$lambda$6((RequestObserver) obj2, j, (Exception) obj);
                break;
            default:
                q4.k kVar = (q4.k) obj;
                try {
                    FirebaseAnalytics firebaseAnalytics = ((hb.i) obj2).f14495a;
                    if (firebaseAnalytics == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("analytics");
                        firebaseAnalytics = null;
                    }
                    C0657o0 c0657o0 = firebaseAnalytics.f12042a;
                    c0657o0.getClass();
                    c0657o0.a(new C0602d0(c0657o0, j));
                    kVar.b(null);
                    break;
                } catch (Exception e10) {
                    kVar.a(e10);
                }
        }
    }

    public /* synthetic */ t(Object obj, long j, Object obj2, int i3) {
        this.f6061a = i3;
        this.f6063c = obj;
        this.f6062b = j;
        this.f6064d = obj2;
    }
}
