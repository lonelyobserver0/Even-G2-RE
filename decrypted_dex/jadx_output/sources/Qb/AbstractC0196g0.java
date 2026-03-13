package Qb;

import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.time.DurationKt;

/* renamed from: Qb.g0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class AbstractC0196g0 extends AbstractC0198h0 implements Q {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5867e = AtomicReferenceFieldUpdater.newUpdater(AbstractC0196g0.class, Object.class, StubApp.getString2(25501));

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5868f = AtomicReferenceFieldUpdater.newUpdater(AbstractC0196g0.class, Object.class, StubApp.getString2(25502));

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5869g = AtomicIntegerFieldUpdater.newUpdater(AbstractC0196g0.class, StubApp.getString2(25503));

    @Volatile
    private volatile Object _delayed;

    @Volatile
    private volatile int _isCompleted = 0;

    @Volatile
    private volatile Object _queue;

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00db, code lost:
    
        if ((((int) (1073741823 & r7)) == ((int) ((r7 & 1152921503533105152L) >> 30))) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0057, code lost:
    
        r7 = null;
     */
    @Override // Qb.AbstractC0186b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long C() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qb.AbstractC0196g0.C():long");
    }

    public void I(Runnable runnable) {
        if (!J(runnable)) {
            M.f5824h.I(runnable);
            return;
        }
        Thread G4 = G();
        if (Thread.currentThread() != G4) {
            LockSupport.unpark(G4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean J(java.lang.Runnable r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Qb.AbstractC0196g0.f5867e
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = Qb.AbstractC0196g0.f5869g
            int r2 = r2.get(r6)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L12
            r2 = r4
            goto L13
        L12:
            r2 = r3
        L13:
            if (r2 == 0) goto L16
            goto L55
        L16:
            if (r1 != 0) goto L27
        L18:
            r1 = 0
            boolean r1 = r0.compareAndSet(r6, r1, r7)
            if (r1 == 0) goto L20
            goto L71
        L20:
            java.lang.Object r1 = r0.get(r6)
            if (r1 == 0) goto L18
            goto L0
        L27:
            boolean r2 = r1 instanceof Vb.p
            if (r2 == 0) goto L51
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            r2 = r1
            Vb.p r2 = (Vb.p) r2
            int r5 = r2.a(r7)
            if (r5 == 0) goto L71
            if (r5 == r4) goto L3f
            r0 = 2
            if (r5 == r0) goto L55
            goto L0
        L3f:
            Vb.p r2 = r2.c()
        L43:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L4a
            goto L0
        L4a:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L43
            goto L0
        L51:
            F5.c r2 = Qb.L.f5817c
            if (r1 != r2) goto L56
        L55:
            return r3
        L56:
            Vb.p r2 = new Vb.p
            r3 = 8
            r2.<init>(r3, r4)
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r3)
            r3 = r1
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.a(r3)
            r2.a(r7)
        L6b:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L72
        L71:
            return r4
        L72:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L6b
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: Qb.AbstractC0196g0.J(java.lang.Runnable):boolean");
    }

    public final boolean K() {
        C0194f0 c0194f0;
        ArrayDeque arrayDeque = this.f5850c;
        if (!(arrayDeque != null ? arrayDeque.isEmpty() : true) || ((c0194f0 = (C0194f0) f5868f.get(this)) != null && Vb.C.f7927b.get(c0194f0) != 0)) {
            return false;
        }
        Object obj = f5867e.get(this);
        if (obj != null) {
            if (obj instanceof Vb.p) {
                long j = Vb.p.f7962f.get((Vb.p) obj);
                return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
            }
            if (obj != L.f5817c) {
                return false;
            }
        }
        return true;
    }

    public final void L(long j, AbstractRunnableC0192e0 abstractRunnableC0192e0) {
        int a3;
        Thread G4;
        boolean z2 = f5869g.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5868f;
        if (z2) {
            a3 = 1;
        } else {
            C0194f0 c0194f0 = (C0194f0) atomicReferenceFieldUpdater.get(this);
            if (c0194f0 == null) {
                C0194f0 c0194f02 = new C0194f0();
                c0194f02.f5865c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c0194f02) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                Intrinsics.checkNotNull(obj);
                c0194f0 = (C0194f0) obj;
            }
            a3 = abstractRunnableC0192e0.a(j, c0194f0, this);
        }
        if (a3 != 0) {
            if (a3 == 1) {
                H(j, abstractRunnableC0192e0);
                return;
            } else {
                if (a3 != 2) {
                    throw new IllegalStateException(StubApp.getString2(25504));
                }
                return;
            }
        }
        C0194f0 c0194f03 = (C0194f0) atomicReferenceFieldUpdater.get(this);
        if (c0194f03 != null) {
            synchronized (c0194f03) {
                AbstractRunnableC0192e0[] abstractRunnableC0192e0Arr = c0194f03.f7928a;
                r4 = abstractRunnableC0192e0Arr != null ? abstractRunnableC0192e0Arr[0] : null;
            }
        }
        if (r4 != abstractRunnableC0192e0 || Thread.currentThread() == (G4 = G())) {
            return;
        }
        LockSupport.unpark(G4);
    }

    @Override // Qb.C
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        I(runnable);
    }

    public Y h(long j, P0 p02, CoroutineContext coroutineContext) {
        return N.f5825a.h(j, p02, coroutineContext);
    }

    @Override // Qb.Q
    public final void k(long j, C0203k c0203k) {
        long j3 = j > 0 ? j >= 9223372036854L ? LongCompanionObject.MAX_VALUE : 1000000 * j : 0L;
        if (j3 < DurationKt.MAX_MILLIS) {
            long nanoTime = System.nanoTime();
            C0188c0 c0188c0 = new C0188c0(this, j3 + nanoTime, c0203k);
            L(nanoTime, c0188c0);
            c0203k.u(new C0197h(c0188c0, 1));
        }
    }

    @Override // Qb.AbstractC0186b0
    public void shutdown() {
        AbstractRunnableC0192e0 b2;
        N0.f5826a.set(null);
        f5869g.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5867e;
            Object obj = atomicReferenceFieldUpdater.get(this);
            F5.c cVar = L.f5817c;
            if (obj != null) {
                if (!(obj instanceof Vb.p)) {
                    if (obj != cVar) {
                        Vb.p pVar = new Vb.p(8, true);
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                        pVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, pVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((Vb.p) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, cVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (C() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            C0194f0 c0194f0 = (C0194f0) f5868f.get(this);
            if (c0194f0 == null) {
                return;
            }
            synchronized (c0194f0) {
                b2 = Vb.C.f7927b.get(c0194f0) > 0 ? c0194f0.b(0) : null;
            }
            if (b2 == null) {
                return;
            } else {
                H(nanoTime, b2);
            }
        }
    }
}
