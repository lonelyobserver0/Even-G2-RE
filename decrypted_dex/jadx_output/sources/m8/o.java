package m8;

import Qb.I;
import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class o extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Zb.e f17192a;

    /* renamed from: b, reason: collision with root package name */
    public r f17193b;

    /* renamed from: c, reason: collision with root package name */
    public q8.e f17194c;

    /* renamed from: d, reason: collision with root package name */
    public int f17195d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f17196e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q8.e f17197f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, q8.e eVar, Continuation continuation) {
        super(2, continuation);
        this.f17196e = rVar;
        this.f17197f = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new o(this.f17196e, this.f17197f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r rVar;
        Zb.e eVar;
        q8.e routesObserver;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f17195d;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            rVar = this.f17196e;
            Zb.e eVar2 = rVar.f17240u;
            this.f17192a = eVar2;
            this.f17193b = rVar;
            q8.e eVar3 = this.f17197f;
            this.f17194c = eVar3;
            this.f17195d = 1;
            if (eVar2.e(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            eVar = eVar2;
            routesObserver = eVar3;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            routesObserver = this.f17194c;
            rVar = this.f17193b;
            eVar = this.f17192a;
            ResultKt.throwOnFailure(obj);
        }
        try {
            q8.d dVar = rVar.f17228h;
            dVar.getClass();
            Intrinsics.checkNotNullParameter(routesObserver, "routesObserver");
            dVar.f20090b.add(routesObserver);
            q8.g gVar = dVar.f20092d;
            if (gVar != null) {
                routesObserver.a(gVar);
            }
            Unit unit = Unit.INSTANCE;
            eVar.g(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            eVar.g(null);
            throw th;
        }
    }
}
