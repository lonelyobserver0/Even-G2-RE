package Qb;

import com.stub.StubApp;
import java.util.concurrent.ScheduledFuture;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class X implements Y {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f5840a;

    public X(ScheduledFuture scheduledFuture) {
        this.f5840a = scheduledFuture;
    }

    @Override // Qb.Y
    public final void dispose() {
        this.f5840a.cancel(false);
    }

    public final String toString() {
        return StubApp.getString2(25495) + this.f5840a + ']';
    }
}
