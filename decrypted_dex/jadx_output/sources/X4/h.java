package X4;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import v.AbstractC1794g;
import v.C1788a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h extends AbstractC1794g implements ScheduledFuture {

    /* renamed from: h, reason: collision with root package name */
    public final ScheduledFuture f8398h;

    public h(g gVar) {
        this.f8398h = gVar.a(new A0.c(this));
    }

    @Override // v.AbstractC1794g
    public final void c() {
        ScheduledFuture scheduledFuture = this.f8398h;
        Object obj = this.f21510a;
        scheduledFuture.cancel((obj instanceof C1788a) && ((C1788a) obj).f21491a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f8398h.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f8398h.getDelay(timeUnit);
    }
}
