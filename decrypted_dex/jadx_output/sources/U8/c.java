package U8;

import P7.g;
import Qb.I;
import Qb.S;
import android.os.SystemClock;
import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7485a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f7486b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f7487c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, g gVar, Continuation continuation) {
        super(2, continuation);
        this.f7486b = dVar;
        this.f7487c = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f7486b, this.f7487c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f7485a;
        d dVar = this.f7486b;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            dVar.getClass();
            long elapsedRealtime = 0 - SystemClock.elapsedRealtime();
            this.f7485a = 1;
            if (S.a(elapsedRealtime, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
        }
        dVar.f7490a.updateNotification(this.f7487c);
        return Unit.INSTANCE;
    }
}
