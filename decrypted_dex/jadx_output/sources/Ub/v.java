package Ub;

import Qb.L;
import Tb.InterfaceC0328i;
import com.stub.StubApp;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class v extends ContinuationImpl implements InterfaceC0328i {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0328i f7616a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineContext f7617b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7618c;

    /* renamed from: d, reason: collision with root package name */
    public CoroutineContext f7619d;

    /* renamed from: e, reason: collision with root package name */
    public Continuation f7620e;

    public v(InterfaceC0328i interfaceC0328i, CoroutineContext coroutineContext) {
        super(s.f7612a, EmptyCoroutineContext.INSTANCE);
        this.f7616a = interfaceC0328i;
        this.f7617b = coroutineContext;
        this.f7618c = ((Number) coroutineContext.fold(0, u.f7615a)).intValue();
    }

    @Override // Tb.InterfaceC0328i
    public final Object a(Object obj, Continuation continuation) {
        try {
            Object b2 = b(continuation, obj);
            if (b2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return b2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b2 : Unit.INSTANCE;
        } catch (Throwable th) {
            this.f7619d = new q(continuation.get$context(), th);
            throw th;
        }
    }

    public final Object b(Continuation continuation, Object obj) {
        CoroutineContext coroutineContext = continuation.get$context();
        L.g(coroutineContext);
        CoroutineContext coroutineContext2 = this.f7619d;
        if (coroutineContext2 != coroutineContext) {
            if (coroutineContext2 instanceof q) {
                throw new IllegalStateException(StringsKt.trimIndent(StubApp.getString2(25695) + ((q) coroutineContext2).f7610a + StubApp.getString2(25696) + obj + StubApp.getString2(25697)).toString());
            }
            if (((Number) coroutineContext.fold(0, new y(this))).intValue() != this.f7618c) {
                throw new IllegalStateException((StubApp.getString2(25692) + this.f7617b + StubApp.getString2(25693) + coroutineContext + StubApp.getString2(25694)).toString());
            }
            this.f7619d = coroutineContext;
        }
        this.f7620e = continuation;
        Function3 function3 = x.f7622a;
        InterfaceC0328i interfaceC0328i = this.f7616a;
        Intrinsics.checkNotNull(interfaceC0328i, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object invoke = function3.invoke(interfaceC0328i, obj, this);
        if (!Intrinsics.areEqual(invoke, IntrinsicsKt.getCOROUTINE_SUSPENDED())) {
            this.f7620e = null;
        }
        return invoke;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f7620e;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public final CoroutineContext get$context() {
        CoroutineContext coroutineContext = this.f7619d;
        return coroutineContext == null ? EmptyCoroutineContext.INSTANCE : coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable m43exceptionOrNullimpl = Result.m43exceptionOrNullimpl(obj);
        if (m43exceptionOrNullimpl != null) {
            this.f7619d = new q(get$context(), m43exceptionOrNullimpl);
        }
        Continuation continuation = this.f7620e;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }
}
