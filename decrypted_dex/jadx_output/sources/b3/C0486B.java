package b3;

import Qb.S;
import com.stub.StubApp;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: b3.B, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0486B extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f10499a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0498N f10500b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f10501c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ X2.j f10502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f10503e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0486B(C0498N c0498n, List list, X2.j jVar, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f10500b = c0498n;
        this.f10501c = list;
        this.f10502d = jVar;
        this.f10503e = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0486B(this.f10500b, this.f10501c, this.f10502d, this.f10503e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0486B) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f10499a;
        C0498N c0498n = this.f10500b;
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
                this.f10499a = 1;
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
            R2.c.f(StubApp.getString2(103), StubApp.getString2(8937) + e10.getMessage());
        }
        c0498n.f10598w = null;
        c0498n.z(this.f10501c, this.f10502d, this.f10503e);
        return Unit.INSTANCE;
    }
}
