package H5;

import Tb.InterfaceC0328i;
import android.util.Log;
import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class I extends SuspendLambda implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public int f2768a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ InterfaceC0328i f2769b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Throwable f2770c;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        I i3 = new I(3, (Continuation) obj3);
        i3.f2769b = (InterfaceC0328i) obj;
        i3.f2770c = (Throwable) obj2;
        return i3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f2768a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC0328i interfaceC0328i = this.f2769b;
            Log.e(StubApp.getString2(2569), StubApp.getString2(2570), this.f2770c);
            X.b bVar = new X.b(true);
            this.f2769b = null;
            this.f2768a = 1;
            if (interfaceC0328i.a(bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
