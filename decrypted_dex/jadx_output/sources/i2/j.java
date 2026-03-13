package i2;

import Qb.C0227w0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import t2.C1728a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class j implements Q4.c {

    /* renamed from: a, reason: collision with root package name */
    public final t2.j f14742a;

    public j(C0227w0 job) {
        t2.j underlying = new t2.j();
        Intrinsics.checkNotNullExpressionValue(underlying, "create()");
        Intrinsics.checkNotNullParameter(job, "job");
        Intrinsics.checkNotNullParameter(underlying, "underlying");
        this.f14742a = underlying;
        job.I(new A8.a(this, 10));
    }

    @Override // Q4.c
    public final void a(Runnable runnable, Executor executor) {
        this.f14742a.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        return this.f14742a.cancel(z2);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f14742a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f14742a.f21159a instanceof C1728a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f14742a.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f14742a.get(j, timeUnit);
    }
}
