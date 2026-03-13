package R8;

import com.stub.StubApp;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class A extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6248a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f6249b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0249g f6250c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(B b2, C0249g c0249g, Continuation continuation) {
        super(2, continuation);
        this.f6249b = b2;
        this.f6250c = c0249g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new A(this.f6249b, this.f6250c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((A) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f6248a;
        C0249g c0249g = this.f6250c;
        B b2 = this.f6249b;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                y yVar = (y) b2.f6252b;
                List list = c0249g.f6293a;
                long j = b2.f6251a;
                this.f6248a = 1;
                obj = yVar.b(list, j, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException(StubApp.getString2(275));
                }
                ResultKt.throwOnFailure(obj);
            }
            I i10 = (I) obj;
            b2.f6254d = null;
            b2.a();
            c0249g.f6295c.invoke(new F(i10));
            return Unit.INSTANCE;
        } catch (Throwable th) {
            b2.f6254d = null;
            throw th;
        }
    }
}
