package Qb;

import com.stub.StubApp;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class J {
    public static final Vb.f a(CoroutineContext coroutineContext) {
        if (coroutineContext.get(C0219s0.f5892a) == null) {
            coroutineContext = coroutineContext.plus(L.a());
        }
        return new Vb.f(coroutineContext);
    }

    public static void b(I i3) {
        InterfaceC0221t0 interfaceC0221t0 = (InterfaceC0221t0) i3.h().get(C0219s0.f5892a);
        if (interfaceC0221t0 != null) {
            interfaceC0221t0.d(null);
        } else {
            throw new IllegalStateException((StubApp.getString2(25471) + i3).toString());
        }
    }

    public static final Object c(Function2 function2, Continuation continuation) {
        Vb.u uVar = new Vb.u(continuation, continuation.get$context());
        Object y10 = android.support.v4.media.session.b.y(uVar, uVar, function2);
        if (y10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return y10;
    }
}
