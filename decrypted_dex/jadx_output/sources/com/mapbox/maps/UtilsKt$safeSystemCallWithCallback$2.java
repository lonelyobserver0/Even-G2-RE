package com.mapbox.maps;

import Qb.I;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LQb/I;", "", "<anonymous>", "(LQb/I;)V"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "com.mapbox.maps.UtilsKt$safeSystemCallWithCallback$2", f = "Utils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class UtilsKt$safeSystemCallWithCallback$2 extends SuspendLambda implements Function2<I, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<T, Unit> $onResult;
    final /* synthetic */ T $result;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UtilsKt$safeSystemCallWithCallback$2(Function1<? super T, Unit> function1, T t3, Continuation<? super UtilsKt$safeSystemCallWithCallback$2> continuation) {
        super(2, continuation);
        this.$onResult = function1;
        this.$result = t3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UtilsKt$safeSystemCallWithCallback$2(this.$onResult, this.$result, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(I i3, Continuation<? super Unit> continuation) {
        return ((UtilsKt$safeSystemCallWithCallback$2) create(i3, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException(StubApp.getString2(275));
        }
        ResultKt.throwOnFailure(obj);
        this.$onResult.invoke(this.$result);
        return Unit.INSTANCE;
    }
}
