package w9;

import Qb.I;
import Qb.L;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineEvent;
import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f22151a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f22152b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f22153c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f22154d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Function2 function2, g gVar, Continuation continuation) {
        super(2, continuation);
        this.f22153c = function2;
        this.f22154d = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        e eVar = new e(this.f22153c, this.f22154d, continuation);
        eVar.f22152b = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        I i3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f22151a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            I i11 = (I) this.f22152b;
            try {
                Function2 function2 = this.f22153c;
                Xb.d dVar = this.f22154d.f22159a;
                this.f22152b = i11;
                this.f22151a = 1;
                Object invoke = function2.invoke(dVar, this);
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i3 = i11;
                obj = invoke;
            } catch (Throwable unused) {
                i3 = i11;
                L.g(i3.h());
                return null;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            i3 = (I) this.f22152b;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable unused2) {
                L.g(i3.h());
                return null;
            }
        }
        return ((RouteLineEvent) obj).toJson();
    }
}
