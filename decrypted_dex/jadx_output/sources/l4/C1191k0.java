package l4;

import com.stub.StubApp;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: l4.k0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1191k0 extends AbstractC1214u0 {

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicLong f16490l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c, reason: collision with root package name */
    public C1188j0 f16491c;

    /* renamed from: d, reason: collision with root package name */
    public C1188j0 f16492d;

    /* renamed from: e, reason: collision with root package name */
    public final PriorityBlockingQueue f16493e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedBlockingQueue f16494f;

    /* renamed from: g, reason: collision with root package name */
    public final C1182h0 f16495g;

    /* renamed from: h, reason: collision with root package name */
    public final C1182h0 f16496h;
    public final Object j;

    /* renamed from: k, reason: collision with root package name */
    public final Semaphore f16497k;

    public C1191k0(C1200n0 c1200n0) {
        super(c1200n0);
        this.j = new Object();
        this.f16497k = new Semaphore(2);
        this.f16493e = new PriorityBlockingQueue();
        this.f16494f = new LinkedBlockingQueue();
        this.f16495g = new C1182h0(this, StubApp.getString2(20526));
        this.f16496h = new C1182h0(this, StubApp.getString2(20527));
    }

    @Override // Mb.b
    public final void k() {
        if (Thread.currentThread() != this.f16491c) {
            throw new IllegalStateException(StubApp.getString2(20528));
        }
    }

    @Override // l4.AbstractC1214u0
    public final boolean l() {
        return false;
    }

    public final void o() {
        if (Thread.currentThread() != this.f16492d) {
            throw new IllegalStateException(StubApp.getString2(20529));
        }
    }

    public final void p() {
        if (Thread.currentThread() == this.f16491c) {
            throw new IllegalStateException(StubApp.getString2(20530));
        }
    }

    public final boolean q() {
        return Thread.currentThread() == this.f16491c;
    }

    public final C1185i0 r(Callable callable) {
        m();
        C1185i0 c1185i0 = new C1185i0(this, callable, false);
        if (Thread.currentThread() != this.f16491c) {
            x(c1185i0);
            return c1185i0;
        }
        if (!this.f16493e.isEmpty()) {
            T t3 = ((C1200n0) this.f4728a).f16541f;
            C1200n0.l(t3);
            t3.j.b(StubApp.getString2(20531));
        }
        c1185i0.run();
        return c1185i0;
    }

    public final C1185i0 s(Callable callable) {
        m();
        C1185i0 c1185i0 = new C1185i0(this, callable, true);
        if (Thread.currentThread() == this.f16491c) {
            c1185i0.run();
            return c1185i0;
        }
        x(c1185i0);
        return c1185i0;
    }

    public final void t(Runnable runnable) {
        m();
        S3.D.h(runnable);
        x(new C1185i0(this, runnable, false, StubApp.getString2(20474)));
    }

    public final Object u(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        String string2 = StubApp.getString2(20532);
        synchronized (atomicReference) {
            C1191k0 c1191k0 = ((C1200n0) this.f4728a).f16542g;
            C1200n0.l(c1191k0);
            c1191k0.t(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                T t3 = ((C1200n0) this.f4728a).f16541f;
                C1200n0.l(t3);
                Ac.b bVar = t3.j;
                StringBuilder sb2 = new StringBuilder(str.length() + 24);
                sb2.append(string2);
                sb2.append(str);
                bVar.b(sb2.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            T t10 = ((C1200n0) this.f4728a).f16541f;
            C1200n0.l(t10);
            t10.j.b(StubApp.getString2(20533).concat(str));
        }
        return obj;
    }

    public final void v(Runnable runnable) {
        m();
        x(new C1185i0(this, runnable, true, StubApp.getString2(20474)));
    }

    public final void w(Runnable runnable) {
        m();
        C1185i0 c1185i0 = new C1185i0(this, runnable, false, StubApp.getString2(20534));
        synchronized (this.j) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.f16494f;
                linkedBlockingQueue.add(c1185i0);
                C1188j0 c1188j0 = this.f16492d;
                if (c1188j0 == null) {
                    C1188j0 c1188j02 = new C1188j0(this, StubApp.getString2("20535"), linkedBlockingQueue);
                    this.f16492d = c1188j02;
                    c1188j02.setUncaughtExceptionHandler(this.f16496h);
                    this.f16492d.start();
                } else {
                    Object obj = c1188j0.f16475a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(C1185i0 c1185i0) {
        synchronized (this.j) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f16493e;
                priorityBlockingQueue.add(c1185i0);
                C1188j0 c1188j0 = this.f16491c;
                if (c1188j0 == null) {
                    C1188j0 c1188j02 = new C1188j0(this, StubApp.getString2("20536"), priorityBlockingQueue);
                    this.f16491c = c1188j02;
                    c1188j02.setUncaughtExceptionHandler(this.f16495g);
                    this.f16491c.start();
                } else {
                    Object obj = c1188j0.f16475a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
