package L8;

import B3.s;
import Qb.I;
import com.stub.StubApp;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Zb.a f4303a;

    /* renamed from: b, reason: collision with root package name */
    public s f4304b;

    /* renamed from: c, reason: collision with root package name */
    public List f4305c;

    /* renamed from: d, reason: collision with root package name */
    public int f4306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f4307e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function0 f4308f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f4309g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(s sVar, Function0 function0, List list, Continuation continuation) {
        super(2, continuation);
        this.f4307e = sVar;
        this.f4308f = function0;
        this.f4309g = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f4307e, this.f4308f, this.f4309g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [Zb.a] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Zb.e eVar;
        List list;
        s sVar;
        Zb.a aVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f4306d;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                s sVar2 = this.f4307e;
                eVar = (Zb.e) sVar2.f652d;
                this.f4303a = eVar;
                this.f4304b = sVar2;
                list = this.f4309g;
                this.f4305c = list;
                this.f4306d = 1;
                if (eVar.e(this) != coroutine_suspended) {
                    sVar = sVar2;
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException(StubApp.getString2(275));
                }
                aVar = this.f4303a;
                try {
                    ResultKt.throwOnFailure(obj);
                    Unit unit = Unit.INSTANCE;
                    ((Zb.e) aVar).g(null);
                    this.f4308f.invoke();
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    th = th;
                    ((Zb.e) aVar).g(null);
                    throw th;
                }
            }
            List list2 = this.f4305c;
            sVar = this.f4304b;
            ?? r52 = this.f4303a;
            ResultKt.throwOnFailure(obj);
            list = list2;
            eVar = r52;
            this.f4303a = eVar;
            this.f4304b = null;
            this.f4305c = null;
            this.f4306d = 2;
            if (s.b(sVar, list, 0, this) != coroutine_suspended) {
                aVar = eVar;
                Unit unit2 = Unit.INSTANCE;
                ((Zb.e) aVar).g(null);
                this.f4308f.invoke();
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            th = th2;
            aVar = eVar;
            ((Zb.e) aVar).g(null);
            throw th;
        }
    }
}
