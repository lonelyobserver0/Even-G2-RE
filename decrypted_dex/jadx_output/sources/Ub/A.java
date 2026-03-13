package Ub;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class A implements Continuation, CoroutineStackFrame {

    /* renamed from: a, reason: collision with root package name */
    public final Continuation f7563a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineContext f7564b;

    public A(Continuation continuation, CoroutineContext coroutineContext) {
        this.f7563a = continuation;
        this.f7564b = coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f7563a;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.f7564b;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.f7563a.resumeWith(obj);
    }
}
