package i2;

import Qb.I;
import androidx.work.CoroutineWorker;
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
    public j f14729a;

    /* renamed from: b, reason: collision with root package name */
    public int f14730b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f14731c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f14732d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, CoroutineWorker coroutineWorker, Continuation continuation) {
        super(2, continuation);
        this.f14731c = jVar;
        this.f14732d = coroutineWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f14731c, this.f14732d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f14730b;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f14729a = this.f14731c;
            this.f14730b = 1;
            this.f14732d.getClass();
            throw new IllegalStateException(StubApp.getString2(18463));
        }
        if (i3 != 1) {
            throw new IllegalStateException(StubApp.getString2(275));
        }
        j jVar = this.f14729a;
        ResultKt.throwOnFailure(obj);
        jVar.f14742a.j(obj);
        return Unit.INSTANCE;
    }
}
