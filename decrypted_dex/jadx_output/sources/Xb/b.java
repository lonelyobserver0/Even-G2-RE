package Xb;

import Qb.L;
import Vb.t;
import com.stub.StubApp;
import i2.o;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p0.AbstractC1482f;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class b implements Executor, Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f8618h = AtomicLongFieldUpdater.newUpdater(b.class, StubApp.getString2(25910));
    public static final AtomicLongFieldUpdater j = AtomicLongFieldUpdater.newUpdater(b.class, StubApp.getString2(25911));

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f8619k = AtomicIntegerFieldUpdater.newUpdater(b.class, StubApp.getString2(25912));

    /* renamed from: l, reason: collision with root package name */
    public static final F5.c f8620l = new F5.c(StubApp.getString2(25913), 24);

    @Volatile
    private volatile int _isTerminated;

    /* renamed from: a, reason: collision with root package name */
    public final int f8621a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8622b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8623c;

    @Volatile
    private volatile long controlState;

    /* renamed from: d, reason: collision with root package name */
    public final String f8624d;

    /* renamed from: e, reason: collision with root package name */
    public final e f8625e;

    /* renamed from: f, reason: collision with root package name */
    public final e f8626f;

    /* renamed from: g, reason: collision with root package name */
    public final t f8627g;

    @Volatile
    private volatile long parkedWorkersStack;

    public b(long j3, String str, int i3, int i10) {
        this.f8621a = i3;
        this.f8622b = i10;
        this.f8623c = j3;
        this.f8624d = str;
        if (i3 < 1) {
            throw new IllegalArgumentException(Xa.h.g(i3, StubApp.getString2(25919), StubApp.getString2(25920)).toString());
        }
        String string2 = StubApp.getString2(25914);
        if (i10 < i3) {
            throw new IllegalArgumentException(Xa.h.o(string2, i10, i3, StubApp.getString2(25918)).toString());
        }
        if (i10 > 2097150) {
            throw new IllegalArgumentException(Xa.h.g(i10, string2, StubApp.getString2(25917)).toString());
        }
        if (j3 <= 0) {
            throw new IllegalArgumentException((StubApp.getString2(25915) + j3 + StubApp.getString2(25916)).toString());
        }
        this.f8625e = new e();
        this.f8626f = new e();
        this.f8627g = new t((i3 + 1) * 2);
        this.controlState = i3 << 42;
        this._isTerminated = 0;
    }

    public static /* synthetic */ void e(b bVar, Runnable runnable, int i3) {
        bVar.d(runnable, j.f8642g, (i3 & 4) == 0);
    }

    public final int a() {
        synchronized (this.f8627g) {
            try {
                if (f8619k.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = j;
                long j3 = atomicLongFieldUpdater.get(this);
                int i3 = (int) (j3 & 2097151);
                int coerceAtLeast = RangesKt.coerceAtLeast(i3 - ((int) ((j3 & 4398044413952L) >> 21)), 0);
                if (coerceAtLeast >= this.f8621a) {
                    return 0;
                }
                if (i3 >= this.f8622b) {
                    return 0;
                }
                int i10 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i10 <= 0 || this.f8627g.b(i10) != null) {
                    throw new IllegalArgumentException(StubApp.getString2("353"));
                }
                a aVar = new a(this, i10);
                this.f8627g.c(i10, aVar);
                if (i10 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException(StubApp.getString2("353"));
                }
                int i11 = coerceAtLeast + 1;
                aVar.start();
                return i11;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = Xb.b.f8619k
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof Xb.a
            r3 = 0
            if (r1 == 0) goto L17
            Xb.a r0 = (Xb.a) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            Xb.b r1 = r0.f8617h
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            Vb.t r1 = r8.f8627g
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = Xb.b.j     // Catch: java.lang.Throwable -> Lc0
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc0
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L76
            r1 = r2
        L36:
            Vb.t r5 = r8.f8627g
            java.lang.Object r5 = r5.b(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            Xb.a r5 = (Xb.a) r5
            if (r5 == r0) goto L71
        L43:
            boolean r6 = r5.isAlive()
            if (r6 == 0) goto L52
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L43
        L52:
            Xb.l r5 = r5.f8610a
            Xb.e r6 = r8.f8626f
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = Xb.l.f8645b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            Xb.h r7 = (Xb.h) r7
            if (r7 == 0) goto L66
            r6.a(r7)
        L66:
            Xb.h r7 = r5.b()
            if (r7 != 0) goto L6d
            goto L71
        L6d:
            r6.a(r7)
            goto L66
        L71:
            if (r1 == r4) goto L76
            int r1 = r1 + 1
            goto L36
        L76:
            Xb.e r1 = r8.f8626f
            r1.b()
            Xb.e r1 = r8.f8625e
            r1.b()
        L80:
            if (r0 == 0) goto L88
            Xb.h r1 = r0.a(r2)
            if (r1 != 0) goto Laf
        L88:
            Xb.e r1 = r8.f8625e
            java.lang.Object r1 = r1.d()
            Xb.h r1 = (Xb.h) r1
            if (r1 != 0) goto Laf
            Xb.e r1 = r8.f8626f
            java.lang.Object r1 = r1.d()
            Xb.h r1 = (Xb.h) r1
            if (r1 != 0) goto Laf
            if (r0 == 0) goto La2
            r1 = 5
            r0.h(r1)
        La2:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = Xb.b.f8618h
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = Xb.b.j
            r0.set(r8, r1)
            return
        Laf:
            r1.run()     // Catch: java.lang.Throwable -> Lb3
            goto L80
        Lb3:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L80
        Lc0:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Xb.b.close():void");
    }

    public final void d(Runnable runnable, o oVar, boolean z2) {
        h iVar;
        int i3;
        j.f8641f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof h) {
            iVar = (h) runnable;
            iVar.f8633a = nanoTime;
            iVar.f8634b = oVar;
        } else {
            iVar = new i(runnable, nanoTime, oVar);
        }
        boolean z10 = false;
        boolean z11 = iVar.f8634b.f14746a == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = j;
        long addAndGet = z11 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !Intrinsics.areEqual(aVar.f8617h, this)) {
            aVar = null;
        }
        if (aVar != null && (i3 = aVar.f8612c) != 5 && (iVar.f8634b.f14746a != 0 || i3 != 2)) {
            aVar.f8616g = true;
            l lVar = aVar.f8610a;
            if (z2) {
                iVar = lVar.a(iVar);
            } else {
                lVar.getClass();
                h hVar = (h) l.f8645b.getAndSet(lVar, iVar);
                iVar = hVar == null ? null : lVar.a(hVar);
            }
        }
        if (iVar != null) {
            if (!(iVar.f8634b.f14746a == 1 ? this.f8626f.a(iVar) : this.f8625e.a(iVar))) {
                throw new RejectedExecutionException(AbstractC1482f.k(new StringBuilder(), this.f8624d, StubApp.getString2(25921)));
            }
        }
        if (z2 && aVar != null) {
            z10 = true;
        }
        if (z11) {
            if (z10 || p() || k(addAndGet)) {
                return;
            }
            p();
            return;
        }
        if (z10 || p() || k(atomicLongFieldUpdater.get(this))) {
            return;
        }
        p();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e(this, runnable, 6);
    }

    public final void h(a aVar, int i3, int i10) {
        while (true) {
            long j3 = f8618h.get(this);
            int i11 = (int) (2097151 & j3);
            long j10 = (2097152 + j3) & (-2097152);
            if (i11 == i3) {
                if (i10 == 0) {
                    Object c10 = aVar.c();
                    while (true) {
                        if (c10 == f8620l) {
                            i11 = -1;
                            break;
                        }
                        if (c10 == null) {
                            i11 = 0;
                            break;
                        }
                        a aVar2 = (a) c10;
                        int b2 = aVar2.b();
                        if (b2 != 0) {
                            i11 = b2;
                            break;
                        }
                        c10 = aVar2.c();
                    }
                } else {
                    i11 = i10;
                }
            }
            if (i11 >= 0) {
                if (f8618h.compareAndSet(this, j3, i11 | j10)) {
                    return;
                }
            }
        }
    }

    public final boolean k(long j3) {
        int coerceAtLeast = RangesKt.coerceAtLeast(((int) (2097151 & j3)) - ((int) ((j3 & 4398044413952L) >> 21)), 0);
        int i3 = this.f8621a;
        if (coerceAtLeast < i3) {
            int a3 = a();
            if (a3 == 1 && i3 > 1) {
                a();
            }
            if (a3 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean p() {
        F5.c cVar;
        int i3;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f8618h;
            long j3 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f8627g.b((int) (2097151 & j3));
            if (aVar == null) {
                aVar = null;
            } else {
                long j10 = (2097152 + j3) & (-2097152);
                Object c10 = aVar.c();
                while (true) {
                    cVar = f8620l;
                    if (c10 == cVar) {
                        i3 = -1;
                        break;
                    }
                    if (c10 == null) {
                        i3 = 0;
                        break;
                    }
                    a aVar2 = (a) c10;
                    i3 = aVar2.b();
                    if (i3 != 0) {
                        break;
                    }
                    c10 = aVar2.c();
                }
                if (i3 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j3, j10 | i3)) {
                    aVar.g(cVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.j.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        t tVar = this.f8627g;
        int a3 = tVar.a();
        int i3 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 1; i14 < a3; i14++) {
            a aVar = (a) tVar.b(i14);
            if (aVar != null) {
                l lVar = aVar.f8610a;
                lVar.getClass();
                int i15 = l.f8645b.get(lVar) != null ? (l.f8646c.get(lVar) - l.f8647d.get(lVar)) + 1 : l.f8646c.get(lVar) - l.f8647d.get(lVar);
                int c10 = AbstractC1856e.c(aVar.f8612c);
                if (c10 == 0) {
                    i3++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i15);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (c10 == 1) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i15);
                    sb3.append('b');
                    arrayList.add(sb3.toString());
                } else if (c10 == 2) {
                    i11++;
                } else if (c10 == 3) {
                    i12++;
                    if (i15 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i15);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else if (c10 == 4) {
                    i13++;
                }
            }
        }
        long j3 = j.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f8624d);
        sb5.append('@');
        sb5.append(L.h(this));
        sb5.append(StubApp.getString2(25922));
        int i16 = this.f8621a;
        sb5.append(i16);
        sb5.append(StubApp.getString2(25923));
        sb5.append(this.f8622b);
        sb5.append(StubApp.getString2(25924));
        sb5.append(i3);
        sb5.append(StubApp.getString2(25925));
        sb5.append(i10);
        sb5.append(StubApp.getString2(25926));
        sb5.append(i11);
        sb5.append(StubApp.getString2(25927));
        sb5.append(i12);
        sb5.append(StubApp.getString2(25928));
        sb5.append(i13);
        sb5.append(StubApp.getString2(25929));
        sb5.append(arrayList);
        sb5.append(StubApp.getString2(25930));
        sb5.append(this.f8625e.c());
        sb5.append(StubApp.getString2(25931));
        sb5.append(this.f8626f.c());
        sb5.append(StubApp.getString2(25932));
        sb5.append((int) (2097151 & j3));
        sb5.append(StubApp.getString2(25933));
        sb5.append((int) ((4398044413952L & j3) >> 21));
        sb5.append(StubApp.getString2(25934));
        sb5.append(i16 - ((int) ((j3 & 9223367638808264704L) >> 42)));
        sb5.append(StubApp.getString2(4985));
        return sb5.toString();
    }
}
