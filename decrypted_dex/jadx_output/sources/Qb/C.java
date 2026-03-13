package Qb;

import Vb.AbstractC0355a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class C extends AbstractCoroutineContextElement implements ContinuationInterceptor {
    public static final B Key = new B(ContinuationInterceptor.INSTANCE, A.f5794a);

    public C() {
        super(ContinuationInterceptor.INSTANCE);
    }

    public abstract void dispatch(CoroutineContext coroutineContext, Runnable runnable);

    public void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        dispatch(coroutineContext, runnable);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext, kotlin.coroutines.ContinuationInterceptor
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        return (E) ContinuationInterceptor.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final <T> Continuation<T> interceptContinuation(Continuation<? super T> continuation) {
        return new Vb.i(this, continuation);
    }

    public boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        return true;
    }

    public C limitedParallelism(int i3) {
        AbstractC0355a.a(i3);
        return new Vb.j(this, i3);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext, kotlin.coroutines.ContinuationInterceptor
    public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        return ContinuationInterceptor.DefaultImpls.minusKey(this, key);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two CoroutineDispatcher objects is meaningless. CoroutineDispatcher is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The dispatcher to the right of `+` just replaces the dispatcher to the left.")
    public final C plus(C c10) {
        return c10;
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final void releaseInterceptedContinuation(Continuation<?> continuation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        Vb.i iVar = (Vb.i) continuation;
        iVar.getClass();
        do {
            atomicReferenceFieldUpdater = Vb.i.f7944h;
        } while (atomicReferenceFieldUpdater.get(iVar) == AbstractC0355a.f7934c);
        Object obj = atomicReferenceFieldUpdater.get(iVar);
        C0203k c0203k = obj instanceof C0203k ? (C0203k) obj : null;
        if (c0203k != null) {
            c0203k.o();
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + L.h(this);
    }
}
