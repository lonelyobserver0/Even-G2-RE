package L5;

import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class m extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4242a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4243b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ X.g f4244c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f4245d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Object obj, X.g gVar, n nVar, Continuation continuation) {
        super(2, continuation);
        this.f4243b = obj;
        this.f4244c = gVar;
        this.f4245d = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        m mVar = new m(this.f4243b, this.f4244c, this.f4245d, continuation);
        mVar.f4242a = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((X.b) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        X.b bVar = (X.b) this.f4242a;
        Object obj2 = this.f4243b;
        String string2 = StubApp.getString2(728);
        X.g gVar = this.f4244c;
        if (obj2 != null) {
            bVar.getClass();
            Intrinsics.checkNotNullParameter(gVar, string2);
            bVar.d(gVar, obj2);
        } else {
            bVar.getClass();
            Intrinsics.checkNotNullParameter(gVar, string2);
            bVar.b();
            bVar.f8221a.remove(gVar);
        }
        n.a(this.f4245d, bVar);
        return Unit.INSTANCE;
    }
}
