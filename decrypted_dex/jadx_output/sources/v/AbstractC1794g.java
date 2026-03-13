package v;

import com.stub.StubApp;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p0.AbstractC1482f;

/* renamed from: v.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1794g implements Q4.c {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f21506d;

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f21507e;

    /* renamed from: f, reason: collision with root package name */
    public static final android.support.v4.media.session.b f21508f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f21509g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f21510a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C1790c f21511b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C1793f f21512c;

    static {
        android.support.v4.media.session.b c1792e;
        String string2 = StubApp.getString2(2377);
        String string22 = StubApp.getString2(2378);
        f21506d = Boolean.parseBoolean(System.getProperty(StubApp.getString2(23430), StubApp.getString2(9372)));
        f21507e = Logger.getLogger(AbstractC1794g.class.getName());
        try {
            c1792e = new C1791d(AtomicReferenceFieldUpdater.newUpdater(C1793f.class, Thread.class, string22), AtomicReferenceFieldUpdater.newUpdater(C1793f.class, C1793f.class, string2), AtomicReferenceFieldUpdater.newUpdater(AbstractC1794g.class, C1793f.class, StubApp.getString2("2376")), AtomicReferenceFieldUpdater.newUpdater(AbstractC1794g.class, C1790c.class, string2), AtomicReferenceFieldUpdater.newUpdater(AbstractC1794g.class, Object.class, string22));
            th = null;
        } catch (Throwable th) {
            th = th;
            c1792e = new C1792e();
        }
        f21508f = c1792e;
        if (th != null) {
            f21507e.log(Level.SEVERE, StubApp.getString2(23431), th);
        }
        f21509g = new Object();
    }

    public static void d(AbstractC1794g abstractC1794g) {
        C1793f c1793f;
        C1790c c1790c;
        C1790c c1790c2;
        C1790c c1790c3;
        do {
            c1793f = abstractC1794g.f21512c;
        } while (!f21508f.e(abstractC1794g, c1793f, C1793f.f21503c));
        while (true) {
            c1790c = null;
            if (c1793f == null) {
                break;
            }
            Thread thread = c1793f.f21504a;
            if (thread != null) {
                c1793f.f21504a = null;
                LockSupport.unpark(thread);
            }
            c1793f = c1793f.f21505b;
        }
        abstractC1794g.c();
        do {
            c1790c2 = abstractC1794g.f21511b;
        } while (!f21508f.c(abstractC1794g, c1790c2, C1790c.f21494d));
        while (true) {
            c1790c3 = c1790c;
            c1790c = c1790c2;
            if (c1790c == null) {
                break;
            }
            c1790c2 = c1790c.f21497c;
            c1790c.f21497c = c1790c3;
        }
        while (c1790c3 != null) {
            C1790c c1790c4 = c1790c3.f21497c;
            e(c1790c3.f21495a, c1790c3.f21496b);
            c1790c3 = c1790c4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f21507e.log(Level.SEVERE, StubApp.getString2(23432) + runnable + StubApp.getString2(23433) + executor, (Throwable) e10);
        }
    }

    public static Object f(Object obj) {
        if (obj instanceof C1788a) {
            CancellationException cancellationException = ((C1788a) obj).f21492b;
            CancellationException cancellationException2 = new CancellationException(StubApp.getString2(23434));
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof C1789b) {
            throw new ExecutionException(((C1789b) obj).f21493a);
        }
        if (obj == f21509g) {
            return null;
        }
        return obj;
    }

    public static Object g(AbstractC1794g abstractC1794g) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = abstractC1794g.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // Q4.c
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        C1790c c1790c = this.f21511b;
        C1790c c1790c2 = C1790c.f21494d;
        if (c1790c != c1790c2) {
            C1790c c1790c3 = new C1790c(runnable, executor);
            do {
                c1790c3.f21497c = c1790c;
                if (f21508f.c(this, c1790c, c1790c3)) {
                    return;
                } else {
                    c1790c = this.f21511b;
                }
            } while (c1790c != c1790c2);
        }
        e(runnable, executor);
    }

    public final void b(StringBuilder sb2) {
        String string2 = StubApp.getString2(511);
        try {
            Object g10 = g(this);
            sb2.append(StubApp.getString2("23436"));
            sb2.append(g10 == this ? "this future" : String.valueOf(g10));
            sb2.append(string2);
        } catch (CancellationException unused) {
            sb2.append(StubApp.getString2(13677));
        } catch (RuntimeException e10) {
            sb2.append(StubApp.getString2(23437));
            sb2.append(e10.getClass());
            sb2.append(StubApp.getString2(23438));
        } catch (ExecutionException e11) {
            sb2.append(StubApp.getString2(23439));
            sb2.append(e11.getCause());
            sb2.append(string2);
        }
    }

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        Object obj = this.f21510a;
        if (obj != null) {
            return false;
        }
        if (!f21508f.d(this, obj, f21506d ? new C1788a(z2, new CancellationException(StubApp.getString2(23440))) : z2 ? C1788a.f21489c : C1788a.f21490d)) {
            return false;
        }
        d(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f21510a;
        if (obj != null) {
            return f(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C1793f c1793f = this.f21512c;
            C1793f c1793f2 = C1793f.f21503c;
            if (c1793f != c1793f2) {
                C1793f c1793f3 = new C1793f();
                do {
                    android.support.v4.media.session.b bVar = f21508f;
                    bVar.v(c1793f3, c1793f);
                    if (bVar.e(this, c1793f, c1793f3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(c1793f3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f21510a;
                            if (obj2 != null) {
                                return f(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(c1793f3);
                    } else {
                        c1793f = this.f21512c;
                    }
                } while (c1793f != c1793f2);
            }
            return f(this.f21510a);
        }
        while (nanos > 0) {
            Object obj3 = this.f21510a;
            if (obj3 != null) {
                return f(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractC1794g = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String string2 = StubApp.getString2(23441);
        String string22 = StubApp.getString2(397);
        StringBuilder m4 = AbstractC1482f.m(j, string2, string22);
        m4.append(timeUnit.toString().toLowerCase(locale));
        String sb2 = m4.toString();
        if (nanos + 1000 < 0) {
            String g10 = AbstractC1482f.g(sb2, StubApp.getString2(23442));
            long j3 = -nanos;
            long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(convert);
            boolean z2 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str = g10 + convert + string22 + lowerCase;
                if (z2) {
                    str = AbstractC1482f.g(str, StubApp.getString2(321));
                }
                g10 = AbstractC1482f.g(str, string22);
            }
            if (z2) {
                g10 = g10 + nanos2 + StubApp.getString2(23443);
            }
            sb2 = AbstractC1482f.g(g10, StubApp.getString2(23444));
        }
        if (isDone()) {
            throw new TimeoutException(AbstractC1482f.g(sb2, StubApp.getString2(23445)));
        }
        throw new TimeoutException(AbstractC1482f.h(sb2, StubApp.getString2(6035), abstractC1794g));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return StubApp.getString2(23448) + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + StubApp.getString2(23449);
    }

    public final void i(C1793f c1793f) {
        c1793f.f21504a = null;
        while (true) {
            C1793f c1793f2 = this.f21512c;
            if (c1793f2 == C1793f.f21503c) {
                return;
            }
            C1793f c1793f3 = null;
            while (c1793f2 != null) {
                C1793f c1793f4 = c1793f2.f21505b;
                if (c1793f2.f21504a != null) {
                    c1793f3 = c1793f2;
                } else if (c1793f3 != null) {
                    c1793f3.f21505b = c1793f4;
                    if (c1793f3.f21504a == null) {
                        break;
                    }
                } else if (!f21508f.e(this, c1793f2, c1793f4)) {
                    break;
                }
                c1793f2 = c1793f4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f21510a instanceof C1788a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f21510a != null;
    }

    public boolean j(Object obj) {
        if (obj == null) {
            obj = f21509g;
        }
        if (!f21508f.d(this, null, obj)) {
            return false;
        }
        d(this);
        return true;
    }

    public boolean k(Throwable th) {
        th.getClass();
        if (!f21508f.d(this, null, new C1789b(th))) {
            return false;
        }
        d(this);
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(StubApp.getString2(23450));
        boolean z2 = this.f21510a instanceof C1788a;
        String string2 = StubApp.getString2(511);
        if (z2) {
            sb2.append(StubApp.getString2(13677));
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                str = h();
            } catch (RuntimeException e10) {
                str = StubApp.getString2(23451) + e10.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append(StubApp.getString2(23452));
                sb2.append(str);
                sb2.append(string2);
            } else if (isDone()) {
                b(sb2);
            } else {
                sb2.append(StubApp.getString2(13523));
            }
        }
        sb2.append(string2);
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f21510a;
            if (obj2 != null) {
                return f(obj2);
            }
            C1793f c1793f = this.f21512c;
            C1793f c1793f2 = C1793f.f21503c;
            if (c1793f != c1793f2) {
                C1793f c1793f3 = new C1793f();
                do {
                    android.support.v4.media.session.b bVar = f21508f;
                    bVar.v(c1793f3, c1793f);
                    if (bVar.e(this, c1793f, c1793f3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f21510a;
                            } else {
                                i(c1793f3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    c1793f = this.f21512c;
                } while (c1793f != c1793f2);
            }
            return f(this.f21510a);
        }
        throw new InterruptedException();
    }
}
