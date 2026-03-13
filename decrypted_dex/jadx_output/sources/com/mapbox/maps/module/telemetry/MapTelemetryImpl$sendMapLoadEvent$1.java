package com.mapbox.maps.module.telemetry;

import Qb.I;
import android.content.Context;
import com.google.gson.Gson;
import com.mapbox.maps.MapboxLogger;
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
@DebugMetadata(c = "com.mapbox.maps.module.telemetry.MapTelemetryImpl$sendMapLoadEvent$1", f = "MapTelemetryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapTelemetryImpl$sendMapLoadEvent$1 extends SuspendLambda implements Function2<I, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MapTelemetryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapTelemetryImpl$sendMapLoadEvent$1(MapTelemetryImpl mapTelemetryImpl, Continuation<? super MapTelemetryImpl$sendMapLoadEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = mapTelemetryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MapTelemetryImpl$sendMapLoadEvent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(I i3, Continuation<? super Unit> continuation) {
        return ((MapTelemetryImpl$sendMapLoadEvent$1) create(i3, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Context context;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException(StubApp.getString2(275));
        }
        ResultKt.throwOnFailure(obj);
        try {
            MapEventFactory mapEventFactory = MapEventFactory.INSTANCE;
            context = this.this$0.appContext;
            MapLoadEvent buildMapLoadEvent = mapEventFactory.buildMapLoadEvent(new PhoneState(context));
            MapTelemetryImpl mapTelemetryImpl = this.this$0;
            String json = new Gson().toJson(buildMapLoadEvent);
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(mapLoadEvent)");
            mapTelemetryImpl.sendEvent(json);
        } catch (Throwable th) {
            MapboxLogger.logW(StubApp.getString2(14415), StubApp.getString2(14414) + th);
        }
        return Unit.INSTANCE;
    }
}
