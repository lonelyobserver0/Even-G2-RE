package Qb;

import com.stub.StubApp;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
import w.AbstractC1856e;

/* renamed from: Qb.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class AbstractC0183a extends D0 implements Continuation, I {

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineContext f5844c;

    public AbstractC0183a(CoroutineContext coroutineContext, boolean z2) {
        super(z2);
        H((InterfaceC0221t0) coroutineContext.get(C0219s0.f5892a));
        this.f5844c = coroutineContext.plus(this);
    }

    @Override // Qb.D0
    public final void G(H9.b bVar) {
        F.a(this.f5844c, bVar);
    }

    @Override // Qb.D0
    public final void Q(Object obj) {
        if (!(obj instanceof C0220t)) {
            X(obj);
        } else {
            C0220t c0220t = (C0220t) obj;
            W(c0220t.f5894a, C0220t.f5893b.get(c0220t) != 0);
        }
    }

    public void W(Throwable th, boolean z2) {
    }

    public void X(Object obj) {
    }

    public final void Y(int i3, AbstractC0183a abstractC0183a, Function2 function2) {
        int c10 = AbstractC1856e.c(i3);
        if (c10 == 0) {
            Wb.a.a(function2, abstractC0183a, this);
            return;
        }
        if (c10 != 1) {
            if (c10 == 2) {
                ContinuationKt.startCoroutine(function2, abstractC0183a, this);
                return;
            }
            if (c10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Continuation probeCoroutineCreated = DebugProbesKt.probeCoroutineCreated(this);
            try {
                CoroutineContext coroutineContext = this.f5844c;
                Object c11 = Vb.B.c(coroutineContext, null);
                try {
                    Object invoke = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(abstractC0183a, probeCoroutineCreated);
                    if (invoke != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        probeCoroutineCreated.resumeWith(Result.m40constructorimpl(invoke));
                    }
                } finally {
                    Vb.B.a(coroutineContext, c11);
                }
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                probeCoroutineCreated.resumeWith(Result.m40constructorimpl(ResultKt.createFailure(th)));
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public final CoroutineContext get$context() {
        return this.f5844c;
    }

    @Override // Qb.I
    public final CoroutineContext h() {
        return this.f5844c;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable m43exceptionOrNullimpl = Result.m43exceptionOrNullimpl(obj);
        if (m43exceptionOrNullimpl != null) {
            obj = new C0220t(m43exceptionOrNullimpl, false);
        }
        Object M5 = M(obj);
        if (M5 == L.f5819e) {
            return;
        }
        o(M5);
    }

    @Override // Qb.D0
    public final String u() {
        return getClass().getSimpleName().concat(StubApp.getString2(3175));
    }
}
