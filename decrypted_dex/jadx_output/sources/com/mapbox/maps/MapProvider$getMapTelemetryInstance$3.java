package com.mapbox.maps;

import Qb.I;
import com.mapbox.maps.module.MapTelemetry;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQb/I;", "", "<anonymous>", "(LQb/I;)V"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "com.mapbox.maps.MapProvider$getMapTelemetryInstance$3", f = "MapProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapProvider$getMapTelemetryInstance$3 extends SuspendLambda implements Function2<I, Continuation<? super Unit>, Object> {
    int label;

    public MapProvider$getMapTelemetryInstance$3(Continuation<? super MapProvider$getMapTelemetryInstance$3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MapProvider$getMapTelemetryInstance$3(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(I i3, Continuation<? super Unit> continuation) {
        return ((MapProvider$getMapTelemetryInstance$3) create(i3, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MapTelemetry mapTelemetry;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException(StubApp.getString2(275));
        }
        ResultKt.throwOnFailure(obj);
        mapTelemetry = MapProvider.mapTelemetry;
        if (mapTelemetry == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapTelemetry");
            mapTelemetry = null;
        }
        mapTelemetry.onAppUserTurnstileEvent();
        return Unit.INSTANCE;
    }
}
