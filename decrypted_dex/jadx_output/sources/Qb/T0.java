package Qb;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class T0 extends Vb.u {

    /* renamed from: e, reason: collision with root package name */
    public final ThreadLocal f5835e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public T0(kotlin.coroutines.Continuation r3, kotlin.coroutines.CoroutineContext r4) {
        /*
            r2 = this;
            Qb.U0 r0 = Qb.U0.f5837a
            kotlin.coroutines.CoroutineContext$Element r1 = r4.get(r0)
            if (r1 != 0) goto Ld
            kotlin.coroutines.CoroutineContext r0 = r4.plus(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f5835e = r0
            kotlin.coroutines.CoroutineContext r3 = r3.get$context()
            kotlin.coroutines.ContinuationInterceptor$Key r0 = kotlin.coroutines.ContinuationInterceptor.INSTANCE
            kotlin.coroutines.CoroutineContext$Element r3 = r3.get(r0)
            boolean r3 = r3 instanceof Qb.C
            if (r3 != 0) goto L31
            r3 = 0
            java.lang.Object r3 = Vb.B.c(r4, r3)
            Vb.B.a(r4, r3)
            r2.a0(r4, r3)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Qb.T0.<init>(kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext):void");
    }

    public final boolean Z() {
        boolean z2 = this.threadLocalIsSet && this.f5835e.get() == null;
        this.f5835e.remove();
        return !z2;
    }

    public final void a0(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.f5835e.set(TuplesKt.to(coroutineContext, obj));
    }

    @Override // Vb.u, Qb.D0
    public final void o(Object obj) {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.f5835e.get();
            if (pair != null) {
                Vb.B.a((CoroutineContext) pair.component1(), pair.component2());
            }
            this.f5835e.remove();
        }
        Object a3 = AbstractC0224v.a(obj);
        Continuation continuation = this.f7970d;
        CoroutineContext coroutineContext = continuation.get$context();
        Object c10 = Vb.B.c(coroutineContext, null);
        T0 c11 = c10 != Vb.B.f7923a ? AbstractC0231z.c(continuation, coroutineContext, c10) : null;
        try {
            this.f7970d.resumeWith(a3);
            Unit unit = Unit.INSTANCE;
            if (c11 == null || c11.Z()) {
                Vb.B.a(coroutineContext, c10);
            }
        } catch (Throwable th) {
            if (c11 == null || c11.Z()) {
                Vb.B.a(coroutineContext, c10);
            }
            throw th;
        }
    }
}
