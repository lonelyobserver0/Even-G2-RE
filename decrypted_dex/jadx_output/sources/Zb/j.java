package Zb;

import Qb.InterfaceC0201j;
import Qb.V0;
import Vb.AbstractC0355a;
import Vb.AbstractC0358d;
import Vb.v;
import com.stub.StubApp;
import i2.u;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class j implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f9211c = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, StubApp.getString2(17134));

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f9212d = AtomicLongFieldUpdater.newUpdater(j.class, StubApp.getString2(25970));

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f9213e = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, StubApp.getString2(25971));

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f9214f = AtomicLongFieldUpdater.newUpdater(j.class, StubApp.getString2(25972));

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f9215g = AtomicIntegerFieldUpdater.newUpdater(j.class, StubApp.getString2(25973));

    @Volatile
    private volatile int _availablePermits;

    /* renamed from: a, reason: collision with root package name */
    public final int f9216a;

    /* renamed from: b, reason: collision with root package name */
    public final A8.a f9217b;

    @Volatile
    private volatile long deqIdx;

    @Volatile
    private volatile long enqIdx;

    @Volatile
    private volatile Object head;

    @Volatile
    private volatile Object tail;

    public j(int i3, int i10) {
        this.f9216a = i3;
        if (i3 <= 0) {
            throw new IllegalArgumentException(u.p(i3, StubApp.getString2(25975)).toString());
        }
        if (i10 < 0 || i10 > i3) {
            throw new IllegalArgumentException(u.p(i3, StubApp.getString2(25974)).toString());
        }
        l lVar = new l(0L, null, 2);
        this.head = lVar;
        this.tail = lVar;
        this._availablePermits = i3 - i10;
        this.f9217b = new A8.a(this, 9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0025, code lost:
    
        r1.i(kotlin.Unit.INSTANCE, r4.f9217b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.SuspendLambda r5) {
        /*
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = Zb.j.f9215g
            int r1 = r0.getAndDecrement(r4)
            int r2 = r4.f9216a
            if (r1 > r2) goto L0
            if (r1 <= 0) goto Lf
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        Lf:
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r5)
            Qb.k r1 = Qb.L.i(r1)
            boolean r3 = r4.b(r1)     // Catch: java.lang.Throwable -> L39
            if (r3 != 0) goto L3b
        L1d:
            int r3 = r0.getAndDecrement(r4)     // Catch: java.lang.Throwable -> L39
            if (r3 > r2) goto L1d
            if (r3 <= 0) goto L2d
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L39
            A8.a r2 = r4.f9217b     // Catch: java.lang.Throwable -> L39
            r1.i(r0, r2)     // Catch: java.lang.Throwable -> L39
            goto L3b
        L2d:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.Waiter"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r3)     // Catch: java.lang.Throwable -> L39
            boolean r3 = r4.b(r1)     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L1d
            goto L3b
        L39:
            r5 = move-exception
            goto L5b
        L3b:
            java.lang.Object r0 = r1.r()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L48
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r5)
        L48:
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r5) goto L4f
            goto L51
        L4f:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L51:
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r5) goto L58
            return r0
        L58:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L5b:
            r1.A()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Zb.j.a(kotlin.coroutines.jvm.internal.SuspendLambda):java.lang.Object");
    }

    public final boolean b(V0 v02) {
        Object a3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9213e;
        l lVar = (l) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f9214f.getAndIncrement(this);
        h hVar = h.f9209a;
        long j = andIncrement / k.f9223f;
        loop0: while (true) {
            a3 = AbstractC0358d.a(lVar, j, hVar);
            if (!AbstractC0355a.d(a3)) {
                v b2 = AbstractC0355a.b(a3);
                while (true) {
                    v vVar = (v) atomicReferenceFieldUpdater.get(this);
                    if (vVar.f7972c >= b2.f7972c) {
                        break loop0;
                    }
                    if (!b2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, b2)) {
                        if (atomicReferenceFieldUpdater.get(this) != vVar) {
                            if (b2.e()) {
                                b2.d();
                            }
                        }
                    }
                    if (vVar.e()) {
                        vVar.d();
                    }
                }
            } else {
                break;
            }
        }
        l lVar2 = (l) AbstractC0355a.b(a3);
        int i3 = (int) (andIncrement % k.f9223f);
        AtomicReferenceArray atomicReferenceArray = lVar2.f9224e;
        while (!atomicReferenceArray.compareAndSet(i3, null, v02)) {
            if (atomicReferenceArray.get(i3) != null) {
                F5.c cVar = k.f9219b;
                F5.c cVar2 = k.f9220c;
                while (!atomicReferenceArray.compareAndSet(i3, cVar, cVar2)) {
                    if (atomicReferenceArray.get(i3) != cVar) {
                        return false;
                    }
                }
                if (v02 instanceof InterfaceC0201j) {
                    Intrinsics.checkNotNull(v02, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                    ((InterfaceC0201j) v02).i(Unit.INSTANCE, this.f9217b);
                    return true;
                }
                if (v02 instanceof Yb.d) {
                    ((Yb.c) ((Yb.d) v02)).f8911e = Unit.INSTANCE;
                    return true;
                }
                throw new IllegalStateException((StubApp.getString2(25976) + v02).toString());
            }
        }
        v02.a(lVar2, i3);
        return true;
    }

    public final void c() {
        int i3;
        Object a3;
        boolean z2;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9215g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i10 = this.f9216a;
            if (andIncrement >= i10) {
                do {
                    i3 = atomicIntegerFieldUpdater.get(this);
                    if (i3 <= i10) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, i10));
                throw new IllegalStateException((StubApp.getString2(25977) + i10).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9211c;
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f9212d.getAndIncrement(this);
            long j = andIncrement2 / k.f9223f;
            i iVar = i.f9210a;
            while (true) {
                a3 = AbstractC0358d.a(lVar, j, iVar);
                if (AbstractC0355a.d(a3)) {
                    break;
                }
                v b2 = AbstractC0355a.b(a3);
                while (true) {
                    v vVar = (v) atomicReferenceFieldUpdater.get(this);
                    if (vVar.f7972c >= b2.f7972c) {
                        break;
                    }
                    if (!b2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, b2)) {
                        if (atomicReferenceFieldUpdater.get(this) != vVar) {
                            if (b2.e()) {
                                b2.d();
                            }
                        }
                    }
                    if (vVar.e()) {
                        vVar.d();
                    }
                }
            }
            l lVar2 = (l) AbstractC0355a.b(a3);
            lVar2.a();
            z2 = false;
            if (lVar2.f7972c <= j) {
                int i11 = (int) (andIncrement2 % k.f9223f);
                F5.c cVar = k.f9219b;
                AtomicReferenceArray atomicReferenceArray = lVar2.f9224e;
                Object andSet = atomicReferenceArray.getAndSet(i11, cVar);
                if (andSet == null) {
                    int i12 = k.f9218a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (atomicReferenceArray.get(i11) == k.f9220c) {
                            z2 = true;
                            break;
                        }
                    }
                    F5.c cVar2 = k.f9219b;
                    F5.c cVar3 = k.f9221d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i11, cVar2, cVar3)) {
                            if (atomicReferenceArray.get(i11) != cVar2) {
                                break;
                            }
                        } else {
                            z2 = true;
                            break;
                        }
                    }
                    z2 = !z2;
                } else if (andSet != k.f9222e) {
                    if (andSet instanceof InterfaceC0201j) {
                        Intrinsics.checkNotNull(andSet, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                        InterfaceC0201j interfaceC0201j = (InterfaceC0201j) andSet;
                        F5.c c10 = interfaceC0201j.c(Unit.INSTANCE, this.f9217b);
                        if (c10 != null) {
                            interfaceC0201j.l(c10);
                            z2 = true;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof Yb.d)) {
                            throw new IllegalStateException((StubApp.getString2(25976) + andSet).toString());
                        }
                        z2 = ((Yb.c) ((Yb.d) andSet)).h(this, Unit.INSTANCE);
                    }
                }
            }
        } while (!z2);
    }
}
