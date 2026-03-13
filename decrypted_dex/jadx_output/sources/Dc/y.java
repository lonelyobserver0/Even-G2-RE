package Dc;

import Kc.C0099f;
import com.stub.StubApp;
import java.net.SocketTimeoutException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.InstantKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class y extends C0099f {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f1668m;

    public y(z this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this.f1668m = this$0;
    }

    @Override // Kc.C0099f
    public final void k() {
        this.f1668m.e(EnumC0053b.f1554g);
        r rVar = this.f1668m.f1670b;
        synchronized (rVar) {
            long j = rVar.f1631q;
            long j3 = rVar.f1630p;
            if (j < j3) {
                return;
            }
            rVar.f1630p = j3 + 1;
            rVar.f1632r = System.nanoTime() + InstantKt.NANOS_PER_SECOND;
            Unit unit = Unit.INSTANCE;
            rVar.f1625h.c(new Ac.p(rVar, 1, Intrinsics.stringPlus(rVar.f1620c, " ping")), 0L);
        }
    }

    public final void l() {
        if (j()) {
            throw new SocketTimeoutException(StubApp.getString2(1987));
        }
    }
}
