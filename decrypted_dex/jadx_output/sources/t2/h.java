package t2;

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

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class h implements Q4.c {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f21155d;

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f21156e;

    /* renamed from: f, reason: collision with root package name */
    public static final Y3.a f21157f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f21158g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f21159a;

    /* renamed from: b, reason: collision with root package name */
    public volatile c f21160b;

    /* renamed from: c, reason: collision with root package name */
    public volatile g f21161c;

    static {
        Y3.a fVar;
        String string2 = StubApp.getString2(2377);
        String string22 = StubApp.getString2(2378);
        f21155d = Boolean.parseBoolean(System.getProperty(StubApp.getString2(23430), StubApp.getString2(9372)));
        f21156e = Logger.getLogger(h.class.getName());
        try {
            fVar = new d(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, string22), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, string2), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, StubApp.getString2("2376")), AtomicReferenceFieldUpdater.newUpdater(h.class, c.class, string2), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, string22));
            th = null;
        } catch (Throwable th) {
            th = th;
            fVar = new f();
        }
        f21157f = fVar;
        if (th != null) {
            f21156e.log(Level.SEVERE, StubApp.getString2(23431), th);
        }
        f21158g = new Object();
    }

    public static void c(h hVar) {
        c cVar;
        c cVar2;
        c cVar3 = null;
        while (true) {
            g gVar = hVar.f21161c;
            if (f21157f.f(hVar, gVar, g.f21152c)) {
                while (gVar != null) {
                    Thread thread = gVar.f21153a;
                    if (thread != null) {
                        gVar.f21153a = null;
                        LockSupport.unpark(thread);
                    }
                    gVar = gVar.f21154b;
                }
                do {
                    cVar = hVar.f21160b;
                } while (!f21157f.d(hVar, cVar, c.f21142d));
                while (true) {
                    cVar2 = cVar3;
                    cVar3 = cVar;
                    if (cVar3 == null) {
                        break;
                    }
                    cVar = cVar3.f21145c;
                    cVar3.f21145c = cVar2;
                }
                while (cVar2 != null) {
                    cVar3 = cVar2.f21145c;
                    Runnable runnable = cVar2.f21143a;
                    if (runnable instanceof e) {
                        e eVar = (e) runnable;
                        hVar = eVar.f21150a;
                        if (hVar.f21159a == eVar) {
                            if (f21157f.e(hVar, eVar, f(eVar.f21151b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, cVar2.f21144b);
                    }
                    cVar2 = cVar3;
                }
                return;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f21156e.log(Level.SEVERE, StubApp.getString2(23432) + runnable + StubApp.getString2(23433) + executor, (Throwable) e10);
        }
    }

    public static Object e(Object obj) {
        if (obj instanceof C1728a) {
            CancellationException cancellationException = ((C1728a) obj).f21139b;
            CancellationException cancellationException2 = new CancellationException(StubApp.getString2(23434));
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof b) {
            throw new ExecutionException(((b) obj).f21141a);
        }
        if (obj == f21158g) {
            return null;
        }
        return obj;
    }

    public static Object f(Q4.c cVar) {
        if (cVar instanceof h) {
            Object obj = ((h) cVar).f21159a;
            if (!(obj instanceof C1728a)) {
                return obj;
            }
            C1728a c1728a = (C1728a) obj;
            return c1728a.f21138a ? c1728a.f21139b != null ? new C1728a(false, c1728a.f21139b) : C1728a.f21137d : obj;
        }
        boolean isCancelled = cVar.isCancelled();
        if ((!f21155d) && isCancelled) {
            return C1728a.f21137d;
        }
        try {
            Object g10 = g(cVar);
            return g10 == null ? f21158g : g10;
        } catch (CancellationException e10) {
            if (isCancelled) {
                return new C1728a(false, e10);
            }
            return new b(new IllegalArgumentException(StubApp.getString2(23435) + cVar, e10));
        } catch (ExecutionException e11) {
            return new b(e11.getCause());
        } catch (Throwable th) {
            return new b(th);
        }
    }

    public static Object g(Q4.c cVar) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = cVar.get();
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
        c cVar = this.f21160b;
        c cVar2 = c.f21142d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f21145c = cVar;
                if (f21157f.d(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f21160b;
                }
            } while (cVar != cVar2);
        }
        d(runnable, executor);
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

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f21159a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r3 = r1
            goto L9
        L8:
            r3 = r2
        L9:
            boolean r4 = r0 instanceof t2.e
            r3 = r3 | r4
            if (r3 == 0) goto L60
            boolean r3 = t2.h.f21155d
            if (r3 == 0) goto L24
            t2.a r3 = new t2.a
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            r5 = 23440(0x5b90, float:3.2846E-41)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L2b
        L24:
            if (r8 == 0) goto L29
            t2.a r3 = t2.C1728a.f21136c
            goto L2b
        L29:
            t2.a r3 = t2.C1728a.f21137d
        L2b:
            r4 = r7
            r5 = r2
        L2d:
            Y3.a r6 = t2.h.f21157f
            boolean r6 = r6.e(r4, r0, r3)
            if (r6 == 0) goto L59
            c(r4)
            boolean r4 = r0 instanceof t2.e
            if (r4 == 0) goto L58
            t2.e r0 = (t2.e) r0
            Q4.c r0 = r0.f21151b
            boolean r4 = r0 instanceof t2.h
            if (r4 == 0) goto L55
            r4 = r0
            t2.h r4 = (t2.h) r4
            java.lang.Object r0 = r4.f21159a
            if (r0 != 0) goto L4d
            r5 = r1
            goto L4e
        L4d:
            r5 = r2
        L4e:
            boolean r6 = r0 instanceof t2.e
            r5 = r5 | r6
            if (r5 == 0) goto L58
            r5 = r1
            goto L2d
        L55:
            r0.cancel(r8)
        L58:
            return r1
        L59:
            java.lang.Object r0 = r4.f21159a
            boolean r6 = r0 instanceof t2.e
            if (r6 != 0) goto L2d
            return r5
        L60:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.h.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        boolean z2;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f21159a;
        if ((obj != null) && (!(obj instanceof e))) {
            return e(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            g gVar = this.f21161c;
            g gVar2 = g.f21152c;
            if (gVar != gVar2) {
                g gVar3 = new g();
                z2 = true;
                do {
                    Y3.a aVar = f21157f;
                    aVar.s(gVar3, gVar);
                    if (aVar.f(this, gVar, gVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(gVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f21159a;
                            if ((obj2 != null) && (!(obj2 instanceof e))) {
                                return e(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(gVar3);
                    } else {
                        gVar = this.f21161c;
                    }
                } while (gVar != gVar2);
            }
            return e(this.f21159a);
        }
        z2 = true;
        while (nanos > 0) {
            Object obj3 = this.f21159a;
            if ((obj3 != null ? z2 : false) && (!(obj3 instanceof e))) {
                return e(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String hVar = toString();
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
            boolean z10 = (convert == 0 || nanos2 > 1000) ? z2 : false;
            if (convert > 0) {
                String str = g10 + convert + string22 + lowerCase;
                if (z10) {
                    str = AbstractC1482f.g(str, StubApp.getString2(321));
                }
                g10 = AbstractC1482f.g(str, string22);
            }
            if (z10) {
                g10 = g10 + nanos2 + StubApp.getString2(23443);
            }
            sb2 = AbstractC1482f.g(g10, StubApp.getString2(23444));
        }
        if (isDone()) {
            throw new TimeoutException(AbstractC1482f.g(sb2, StubApp.getString2(23445)));
        }
        throw new TimeoutException(AbstractC1482f.h(sb2, StubApp.getString2(6035), hVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String h() {
        Object obj = this.f21159a;
        if (obj instanceof e) {
            StringBuilder sb2 = new StringBuilder(StubApp.getString2(23446));
            Q4.c cVar = ((e) obj).f21151b;
            return AbstractC1482f.k(sb2, cVar == this ? StubApp.getString2(23447) : String.valueOf(cVar), StubApp.getString2(511));
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return StubApp.getString2(23448) + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + StubApp.getString2(23449);
    }

    public final void i(g gVar) {
        gVar.f21153a = null;
        while (true) {
            g gVar2 = this.f21161c;
            if (gVar2 == g.f21152c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f21154b;
                if (gVar2.f21153a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f21154b = gVar4;
                    if (gVar3.f21153a == null) {
                        break;
                    }
                } else if (!f21157f.f(this, gVar2, gVar4)) {
                    break;
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f21159a instanceof C1728a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof e)) & (this.f21159a != null);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(StubApp.getString2(23450));
        boolean z2 = this.f21159a instanceof C1728a;
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
            Object obj2 = this.f21159a;
            if ((obj2 != null) & (!(obj2 instanceof e))) {
                return e(obj2);
            }
            g gVar = this.f21161c;
            g gVar2 = g.f21152c;
            if (gVar != gVar2) {
                g gVar3 = new g();
                do {
                    Y3.a aVar = f21157f;
                    aVar.s(gVar3, gVar);
                    if (aVar.f(this, gVar, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f21159a;
                            } else {
                                i(gVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof e))));
                        return e(obj);
                    }
                    gVar = this.f21161c;
                } while (gVar != gVar2);
            }
            return e(this.f21159a);
        }
        throw new InterruptedException();
    }
}
