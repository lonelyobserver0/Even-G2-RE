package H5;

import T.InterfaceC0294j;
import android.util.Log;
import com.stub.StubApp;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class M extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f2779a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f2780b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2781c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(N n10, String str, Continuation continuation) {
        super(2, continuation);
        this.f2780b = n10;
        this.f2781c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new M(this.f2780b, this.f2781c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((M) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f2779a;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC0294j interfaceC0294j = this.f2780b.f2783b;
                L l9 = new L(this.f2781c, null);
                this.f2779a = 1;
                if (interfaceC0294j.a(new X.i(l9, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException(StubApp.getString2(275));
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (IOException e10) {
            Log.w(StubApp.getString2(2569), StubApp.getString2(2571) + e10);
        }
        return Unit.INSTANCE;
    }
}
