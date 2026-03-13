package F1;

import Qb.J;
import Qb.L;
import Qb.W;
import android.net.Uri;
import android.view.InputEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final G1.e f2211a;

    public h(G1.e mMeasurementManager) {
        Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
        this.f2211a = mMeasurementManager;
    }

    public Q4.c a(G1.a deletionRequest) {
        Intrinsics.checkNotNullParameter(deletionRequest, "deletionRequest");
        return Tc.d.d(L.c(J.a(W.f5838a), null, new a(this, null), 3));
    }

    public Q4.c b() {
        return Tc.d.d(L.c(J.a(W.f5838a), null, new b(this, null), 3));
    }

    public Q4.c c(G1.f request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return Tc.d.d(L.c(J.a(W.f5838a), null, new d(this, null), 3));
    }

    public Q4.c d(Uri attributionSource, InputEvent inputEvent) {
        Intrinsics.checkNotNullParameter(attributionSource, "attributionSource");
        return Tc.d.d(L.c(J.a(W.f5838a), null, new c(this, attributionSource, inputEvent, null), 3));
    }

    public Q4.c e(Uri trigger) {
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        return Tc.d.d(L.c(J.a(W.f5838a), null, new e(this, trigger, null), 3));
    }

    public Q4.c f(G1.g request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return Tc.d.d(L.c(J.a(W.f5838a), null, new f(this, null), 3));
    }

    public Q4.c g(G1.h request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return Tc.d.d(L.c(J.a(W.f5838a), null, new g(this, null), 3));
    }
}
