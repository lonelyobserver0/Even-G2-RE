package Vb;

import Qb.AbstractC0183a;
import Qb.AbstractC0224v;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class u extends AbstractC0183a implements CoroutineStackFrame {

    /* renamed from: d, reason: collision with root package name */
    public final Continuation f7970d;

    public u(Continuation continuation, CoroutineContext coroutineContext) {
        super(coroutineContext, true);
        this.f7970d = continuation;
    }

    @Override // Qb.D0
    public final boolean K() {
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f7970d;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // Qb.D0
    public void n(Object obj) {
        AbstractC0355a.f(AbstractC0224v.a(obj), IntrinsicsKt.intercepted(this.f7970d));
    }

    @Override // Qb.D0
    public void o(Object obj) {
        this.f7970d.resumeWith(AbstractC0224v.a(obj));
    }
}
