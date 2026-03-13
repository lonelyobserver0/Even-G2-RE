package F1;

import Qb.I;
import android.net.Uri;
import android.view.InputEvent;
import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f2198a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f2199b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f2200c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InputEvent f2201d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, Uri uri, InputEvent inputEvent, Continuation continuation) {
        super(2, continuation);
        this.f2199b = hVar;
        this.f2200c = uri;
        this.f2201d = inputEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f2199b, this.f2200c, this.f2201d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f2198a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            G1.e eVar = this.f2199b.f2211a;
            this.f2198a = 1;
            if (eVar.f(this.f2200c, this.f2201d, this) == coroutine_suspended) {
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
