package Ub;

import Qb.F0;
import Tb.InterfaceC0327h;
import com.stub.StubApp;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;

/* renamed from: Ub.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class AbstractC0347c {

    /* renamed from: a, reason: collision with root package name */
    public static final Continuation[] f7576a = new Continuation[0];

    /* renamed from: b, reason: collision with root package name */
    public static final F5.c f7577b = new F5.c(StubApp.getString2(3796), 24);

    public static /* synthetic */ InterfaceC0327h a(r rVar, F0 f02, int i3, int i10, int i11) {
        CoroutineContext coroutineContext = f02;
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            i3 = -3;
        }
        if ((i11 & 4) != 0) {
            i10 = 1;
        }
        return rVar.s(coroutineContext, i3, i10);
    }

    public static final Object b(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, Continuation continuation) {
        Object c10 = Vb.B.c(coroutineContext, obj2);
        try {
            Object invoke = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(obj, new A(continuation, coroutineContext));
            Vb.B.a(coroutineContext, c10);
            if (invoke == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return invoke;
        } catch (Throwable th) {
            Vb.B.a(coroutineContext, c10);
            throw th;
        }
    }
}
