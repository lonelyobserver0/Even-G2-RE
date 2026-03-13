package O8;

import Qb.I;
import com.mapbox.bindgen.DataRef;
import com.mapbox.common.LoggingLevel;
import com.mapbox.navigator.RouterOrigin;
import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class o extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5258a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f5259b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DataRef f5260c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f5261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ RouterOrigin f5262e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, DataRef dataRef, String str, RouterOrigin routerOrigin, Continuation continuation) {
        super(2, continuation);
        this.f5259b = pVar;
        this.f5260c = dataRef;
        this.f5261d = str;
        this.f5262e = routerOrigin;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new o(this.f5259b, this.f5260c, this.f5261d, this.f5262e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f5258a;
        p pVar = this.f5259b;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            boolean a3 = D9.l.a(D9.l.g(), LoggingLevel.DEBUG);
            String str = this.f5261d;
            if (a3) {
                D9.l.d(StubApp.getString2(4459) + str, StubApp.getString2(4455));
            }
            this.f5258a = 1;
            obj = p.V(pVar, this.f5260c, str, this.f5262e, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
        }
        m mVar = (m) obj;
        if (!Intrinsics.areEqual(mVar, k.f5252a) && (mVar instanceof l)) {
            pVar.f5266e.invoke(((l) mVar).f5253a, Boxing.boxInt(0));
        }
        return Unit.INSTANCE;
    }
}
