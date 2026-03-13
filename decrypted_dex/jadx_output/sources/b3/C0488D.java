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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: b3.D, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0488D extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f10509a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0498N f10510b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f10511c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0488D(C0498N c0498n, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f10510b = c0498n;
        this.f10511c = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0488D(this.f10510b, this.f10511c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0488D) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String string2 = StubApp.getString2(8938);
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f10509a;
        Function1 function1 = this.f10511c;
        C0498N c0498n = this.f10510b;
        String string22 = StubApp.getString2(103);
        try {
            try {
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    KProperty[] kPropertyArr = C0498N.f10532Q0;
                    m8.r s10 = c0498n.s();
                    m8.j jVar = new m8.j(s10, 2);
                    boolean z2 = s10.f17218L;
                    if (!z2) {
                        jVar.invoke();
                    } else if (z2) {
                        throw new IllegalStateException(StubApp.getString2("8930"));
                    }
                    R2.c.b(string22, StubApp.getString2("8939"));
                    this.f10509a = 1;
                    if (S.a(200L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException(StubApp.getString2(275));
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e10) {
                c0498n.getClass();
                R2.c.b(string22, string2 + e10.getMessage());
            }
            C0498N.b(c0498n, function1);
        } catch (Exception e11) {
            c0498n.getClass();
            E1.a.u(StubApp.getString2(8940), e11.getMessage(), string22);
            Log.e(string22, StubApp.getString2(8941), e11);
            Result.Companion companion = Result.INSTANCE;
            function1.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(e11))));
        }
        return Unit.INSTANCE;
    }
}
