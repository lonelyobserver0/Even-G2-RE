package Vb;

import Qb.AbstractC0186b0;
import Qb.AbstractC0222u;
import Qb.C0220t;
import Qb.L;
import Qb.N0;
import Qb.U;
import com.stub.StubApp;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.Volatile;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class i extends U implements CoroutineStackFrame, Continuation {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f7944h = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, StubApp.getString2(25760));

    @Volatile
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: d, reason: collision with root package name */
    public final Qb.C f7945d;

    /* renamed from: e, reason: collision with root package name */
    public final Continuation f7946e;

    /* renamed from: f, reason: collision with root package name */
    public Object f7947f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f7948g;

    public i(Qb.C c10, Continuation continuation) {
        super(-1);
        this.f7945d = c10;
        this.f7946e = continuation;
        this.f7947f = AbstractC0355a.f7933b;
        this.f7948g = B.b(continuation.get$context());
    }

    @Override // Qb.U
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof AbstractC0222u) {
            ((AbstractC0222u) obj).getClass();
            throw null;
        }
    }

    @Override // Qb.U
    public final Continuation d() {
        return this;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f7946e;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public final CoroutineContext get$context() {
        return this.f7946e.get$context();
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // Qb.U
    public final Object h() {
        Object obj = this.f7947f;
        this.f7947f = AbstractC0355a.f7933b;
        return obj;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Continuation continuation = this.f7946e;
        CoroutineContext coroutineContext = continuation.get$context();
        Throwable m43exceptionOrNullimpl = Result.m43exceptionOrNullimpl(obj);
        Object c0220t = m43exceptionOrNullimpl == null ? obj : new C0220t(m43exceptionOrNullimpl, false);
        Qb.C c10 = this.f7945d;
        if (c10.isDispatchNeeded(coroutineContext)) {
            this.f7947f = c0220t;
            this.f5836c = 0;
            c10.dispatch(coroutineContext, this);
            return;
        }
        AbstractC0186b0 a3 = N0.a();
        if (a3.f5848a >= 4294967296L) {
            this.f7947f = c0220t;
            this.f5836c = 0;
            ArrayDeque arrayDeque = a3.f5850c;
            if (arrayDeque == null) {
                arrayDeque = new ArrayDeque();
                a3.f5850c = arrayDeque;
            }
            arrayDeque.addLast(this);
            return;
        }
        a3.A(true);
        try {
            CoroutineContext coroutineContext2 = continuation.get$context();
            Object c11 = B.c(coroutineContext2, this.f7948g);
            try {
                continuation.resumeWith(obj);
                Unit unit = Unit.INSTANCE;
                while (a3.F()) {
                }
            } finally {
                B.a(coroutineContext2, c11);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return StubApp.getString2(25761) + this.f7945d + StubApp.getString2(81) + L.l(this.f7946e) + ']';
    }
}
