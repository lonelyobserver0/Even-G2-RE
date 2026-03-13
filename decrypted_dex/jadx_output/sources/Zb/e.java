package Zb;

import Qb.L;
import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class e extends j implements a {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f9207h = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, StubApp.getString2(9619));

    @Volatile
    private volatile Object owner;

    public e(boolean z2) {
        super(1, z2 ? 1 : 0);
        this.owner = z2 ? null : f.f9208a;
        new d(this, 0);
    }

    public final boolean d() {
        return Math.max(j.f9215g.get(this), 0) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0022, code lost:
    
        r1.i(kotlin.Unit.INSTANCE, r4.f9217b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r4.f()
            if (r0 == 0) goto L9
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L9:
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r5)
            Qb.k r0 = Qb.L.i(r0)
            Zb.c r1 = new Zb.c     // Catch: java.lang.Throwable -> L55
            r1.<init>(r4, r0)     // Catch: java.lang.Throwable -> L55
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = Zb.j.f9215g     // Catch: java.lang.Throwable -> L55
            int r2 = r2.getAndDecrement(r4)     // Catch: java.lang.Throwable -> L55
            int r3 = r4.f9216a     // Catch: java.lang.Throwable -> L55
            if (r2 > r3) goto L16
            if (r2 <= 0) goto L2a
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L55
            A8.a r3 = r4.f9217b     // Catch: java.lang.Throwable -> L55
            r1.i(r2, r3)     // Catch: java.lang.Throwable -> L55
            goto L35
        L2a:
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.Waiter"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)     // Catch: java.lang.Throwable -> L55
            boolean r2 = r4.b(r1)     // Catch: java.lang.Throwable -> L55
            if (r2 == 0) goto L16
        L35:
            java.lang.Object r0 = r0.r()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L42
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r5)
        L42:
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r5) goto L49
            goto L4b
        L49:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L4b:
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r5) goto L52
            return r0
        L52:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L55:
            r5 = move-exception
            r0.A()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Zb.e.e(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final boolean f() {
        int i3;
        char c10;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j.f9215g;
            int i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = this.f9216a;
            if (i10 > i11) {
                do {
                    i3 = atomicIntegerFieldUpdater.get(this);
                    if (i3 > i11) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, i11));
            } else {
                if (i10 <= 0) {
                    c10 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    f9207h.set(this, null);
                    c10 = 0;
                    break;
                }
            }
        }
        if (c10 == 0) {
            return true;
        }
        if (c10 == 1) {
            return false;
        }
        if (c10 != 2) {
            throw new IllegalStateException(StubApp.getString2(6086));
        }
        throw new IllegalStateException(StubApp.getString2(25960).toString());
    }

    public final void g(Object obj) {
        while (d()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9207h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            F5.c cVar = f.f9208a;
            if (obj2 != cVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, cVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    c();
                    return;
                }
                throw new IllegalStateException((StubApp.getString2(25961) + obj2 + StubApp.getString2(25962) + obj + StubApp.getString2(25963)).toString());
            }
        }
        throw new IllegalStateException(StubApp.getString2(25964));
    }

    public final String toString() {
        return StubApp.getString2(25965) + L.h(this) + StubApp.getString2(25966) + d() + StubApp.getString2(25967) + f9207h.get(this) + ']';
    }
}
