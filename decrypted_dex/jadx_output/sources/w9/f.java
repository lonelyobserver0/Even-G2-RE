package w9;

import Qb.L;
import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import t8.C1739a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class f extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f22155a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f22156b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1739a f22157c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f22158d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, C1739a c1739a, Function2 function2, Continuation continuation) {
        super(1, continuation);
        this.f22156b = gVar;
        this.f22157c = c1739a;
        this.f22158d = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new f(this.f22156b, this.f22157c, this.f22158d, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((f) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f22155a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            g gVar = this.f22156b;
            Xb.d dVar = gVar.f22159a;
            e eVar = new e(this.f22158d, gVar, null);
            this.f22155a = 1;
            obj = L.n(dVar, eVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
        }
        String str = (String) obj;
        if (str != null) {
            this.f22157c.b(StubApp.getString2(23863), str);
        }
        return Unit.INSTANCE;
    }
}
