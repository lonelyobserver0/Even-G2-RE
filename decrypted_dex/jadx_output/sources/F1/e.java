package F1;

import Qb.I;
import android.net.Uri;
import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f2204a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f2205b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f2206c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.f2205b = hVar;
        this.f2206c = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f2205b, this.f2206c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f2204a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            G1.e eVar = this.f2205b.f2211a;
            this.f2204a = 1;
            if (eVar.i(this.f2206c, this) == coroutine_suspended) {
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
