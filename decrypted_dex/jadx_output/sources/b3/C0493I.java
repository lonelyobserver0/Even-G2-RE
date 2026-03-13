package b3;

import Qb.S;
import android.util.Log;
import com.stub.StubApp;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: b3.I, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0493I extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f10518a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0498N f10519b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0510l f10520c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0493I(C0498N c0498n, C0510l c0510l, Continuation continuation) {
        super(2, continuation);
        this.f10519b = c0498n;
        this.f10520c = c0510l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0493I(this.f10519b, this.f10520c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0493I) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f10518a;
        C0510l c0510l = this.f10520c;
        C0498N c0498n = this.f10519b;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f10518a = 1;
                if (S.a(50L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException(StubApp.getString2(275));
                }
                ResultKt.throwOnFailure(obj);
            }
            C0498N.b(c0498n, c0510l);
        } catch (Exception e10) {
            c0498n.getClass();
            String message = e10.getMessage();
            String string2 = StubApp.getString2(8942);
            String string22 = StubApp.getString2(103);
            E1.a.u(string2, message, string22);
            Log.e(string22, StubApp.getString2(8943), e10);
            if (c0510l != null) {
                Result.Companion companion = Result.INSTANCE;
                c0510l.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(e10))));
            }
        }
        return Unit.INSTANCE;
    }
}
