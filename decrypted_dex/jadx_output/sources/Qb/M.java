package Qb;

import com.stub.StubApp;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.time.DurationKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class M extends AbstractC0196g0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: h, reason: collision with root package name */
    public static final M f5824h;
    public static final long j;

    static {
        Long l9;
        M m4 = new M();
        f5824h = m4;
        m4.A(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l9 = Long.getLong(StubApp.getString2("25482"), 1000L);
        } catch (SecurityException unused) {
            l9 = 1000L;
        }
        j = timeUnit.toNanos(l9.longValue());
    }

    @Override // Qb.AbstractC0198h0
    public final Thread G() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, StubApp.getString2("25483"));
                _thread = thread;
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // Qb.AbstractC0198h0
    public final void H(long j3, AbstractRunnableC0192e0 abstractRunnableC0192e0) {
        throw new RejectedExecutionException(StubApp.getString2(25484));
    }

    @Override // Qb.AbstractC0196g0
    public final void I(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException(StubApp.getString2(25484));
        }
        super.I(runnable);
    }

    public final synchronized void M() {
        int i3 = debugStatus;
        if (i3 == 2 || i3 == 3) {
            debugStatus = 3;
            AbstractC0196g0.f5867e.set(this, null);
            AbstractC0196g0.f5868f.set(this, null);
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    @Override // Qb.AbstractC0196g0, Qb.Q
    public final Y h(long j3, P0 p02, CoroutineContext coroutineContext) {
        long j10 = j3 > 0 ? j3 >= 9223372036854L ? LongCompanionObject.MAX_VALUE : 1000000 * j3 : 0L;
        if (j10 >= DurationKt.MAX_MILLIS) {
            return H0.f5814a;
        }
        long nanoTime = System.nanoTime();
        C0190d0 c0190d0 = new C0190d0(j10 + nanoTime, p02);
        L(nanoTime, c0190d0);
        return c0190d0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread thread;
        N0.f5826a.set(this);
        Thread thread2 = null;
        try {
            synchronized (this) {
                try {
                    try {
                        int i3 = debugStatus;
                        if (i3 == 2 || i3 == 3) {
                            _thread = null;
                            M();
                            if (K()) {
                                return;
                            }
                            G();
                            return;
                        }
                        debugStatus = 1;
                        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                        notifyAll();
                        long j3 = Long.MAX_VALUE;
                        while (true) {
                            Thread.interrupted();
                            long C10 = C();
                            if (C10 == LongCompanionObject.MAX_VALUE) {
                                long nanoTime = System.nanoTime();
                                if (j3 == LongCompanionObject.MAX_VALUE) {
                                    j3 = j + nanoTime;
                                }
                                thread = thread2;
                                long j10 = j3 - nanoTime;
                                if (j10 <= 0) {
                                    _thread = thread;
                                    M();
                                    if (K()) {
                                        return;
                                    }
                                    G();
                                    return;
                                }
                                C10 = RangesKt.coerceAtMost(C10, j10);
                            } else {
                                thread = thread2;
                                j3 = Long.MAX_VALUE;
                            }
                            if (C10 > 0) {
                                int i10 = debugStatus;
                                if (i10 == 2 || i10 == 3) {
                                    _thread = thread;
                                    M();
                                    if (K()) {
                                        return;
                                    }
                                    G();
                                    return;
                                }
                                LockSupport.parkNanos(this, C10);
                            }
                            thread2 = thread;
                        }
                    } catch (Throwable th) {
                        th = th;
                        _thread = null;
                        M();
                        if (!K()) {
                            G();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    while (true) {
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // Qb.AbstractC0196g0, Qb.AbstractC0186b0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
