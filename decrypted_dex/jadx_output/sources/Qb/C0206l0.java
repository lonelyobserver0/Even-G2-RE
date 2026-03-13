package Qb;

import Vb.AbstractC0357c;
import com.stub.StubApp;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;

/* renamed from: Qb.l0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0206l0 extends AbstractC0204k0 implements Q {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f5879a;

    public C0206l0(Executor executor) {
        Method method;
        this.f5879a = executor;
        Method method2 = AbstractC0357c.f7937a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = AbstractC0357c.f7937a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f5879a;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // Qb.C
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.f5879a.execute(runnable);
        } catch (RejectedExecutionException e10) {
            CancellationException cancellationException = new CancellationException(StubApp.getString2(25523));
            cancellationException.initCause(e10);
            InterfaceC0221t0 interfaceC0221t0 = (InterfaceC0221t0) coroutineContext.get(C0219s0.f5892a);
            if (interfaceC0221t0 != null) {
                interfaceC0221t0.d(cancellationException);
            }
            W.f5839b.dispatch(coroutineContext, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0206l0) && ((C0206l0) obj).f5879a == this.f5879a;
    }

    @Override // Qb.Q
    public final Y h(long j, P0 p02, CoroutineContext coroutineContext) {
        Executor executor = this.f5879a;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(p02, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException(StubApp.getString2(25523));
                cancellationException.initCause(e10);
                InterfaceC0221t0 interfaceC0221t0 = (InterfaceC0221t0) coroutineContext.get(C0219s0.f5892a);
                if (interfaceC0221t0 != null) {
                    interfaceC0221t0.d(cancellationException);
                }
            }
        }
        return scheduledFuture != null ? new X(scheduledFuture) : M.f5824h.h(j, p02, coroutineContext);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f5879a);
    }

    @Override // Qb.Q
    public final void k(long j, C0203k c0203k) {
        Executor executor = this.f5879a;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(new Q4.b(10, this, c0203k), j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException(StubApp.getString2(25523));
                cancellationException.initCause(e10);
                InterfaceC0221t0 interfaceC0221t0 = (InterfaceC0221t0) c0203k.f5877e.get(C0219s0.f5892a);
                if (interfaceC0221t0 != null) {
                    interfaceC0221t0.d(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            c0203k.u(new C0197h(scheduledFuture, 0));
        } else {
            M.f5824h.k(j, c0203k);
        }
    }

    @Override // Qb.C
    public final String toString() {
        return this.f5879a.toString();
    }
}
