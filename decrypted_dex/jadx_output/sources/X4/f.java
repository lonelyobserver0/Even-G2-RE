package X4;

import E8.n;
import com.stub.StubApp;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f implements ScheduledExecutorService {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f8396a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f8397b;

    public f(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f8396a = executorService;
        this.f8397b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f8396a.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f8396a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        return this.f8396a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        return this.f8396a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f8396a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f8396a.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return new h(new n(this, runnable, j, timeUnit, 2));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j3, TimeUnit timeUnit) {
        return new h(new c(this, runnable, j, j3, timeUnit, 0));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j3, TimeUnit timeUnit) {
        return new h(new c(this, runnable, j, j3, timeUnit, 1));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException(StubApp.getString2(7243));
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException(StubApp.getString2(7243));
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return this.f8396a.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.f8396a.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.f8396a.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return new h(new n(this, callable, j, timeUnit, 3));
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return this.f8396a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return this.f8396a.submit(runnable);
    }
}
