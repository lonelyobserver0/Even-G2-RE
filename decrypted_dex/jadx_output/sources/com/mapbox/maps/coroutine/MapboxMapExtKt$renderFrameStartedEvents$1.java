package com.mapbox.maps.coroutine;

import Sb.t;
import Sb.u;
import Sb.v;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.NativeObserver;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LSb/v;", "Lcom/mapbox/maps/RenderFrameStarted;", "", "<anonymous>", "(LSb/v;)V"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "com.mapbox.maps.coroutine.MapboxMapExtKt$renderFrameStartedEvents$1", f = "MapboxMapExt.kt", i = {}, l = {391}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxMapExtKt$renderFrameStartedEvents$1 extends SuspendLambda implements Function2<v, Continuation<? super Unit>, Object> {
    final /* synthetic */ MapboxMap $this_renderFrameStartedEvents;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: com.mapbox.maps.coroutine.MapboxMapExtKt$renderFrameStartedEvents$1$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Unit> {
        public AnonymousClass1(Object obj) {
            super(0, obj, Cancelable.class, StubApp.getString2(6385), StubApp.getString2(14349), 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((Cancelable) this.receiver).cancel();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxMapExtKt$renderFrameStartedEvents$1(MapboxMap mapboxMap, Continuation<? super MapboxMapExtKt$renderFrameStartedEvents$1> continuation) {
        super(2, continuation);
        this.$this_renderFrameStartedEvents = mapboxMap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MapboxMapExtKt$renderFrameStartedEvents$1 mapboxMapExtKt$renderFrameStartedEvents$1 = new MapboxMapExtKt$renderFrameStartedEvents$1(this.$this_renderFrameStartedEvents, continuation);
        mapboxMapExtKt$renderFrameStartedEvents$1.L$0 = obj;
        return mapboxMapExtKt$renderFrameStartedEvents$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v vVar, Continuation<? super Unit> continuation) {
        return ((MapboxMapExtKt$renderFrameStartedEvents$1) create(vVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            v vVar = (v) this.L$0;
            NativeObserver nativeObserver = this.$this_renderFrameStartedEvents.getNativeObserver();
            a aVar = new a(vVar);
            u uVar = (u) vVar;
            uVar.getClass();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(NativeObserver.subscribeRenderFrameStarted$default(nativeObserver, aVar, new MapboxMapExtKt$renderFrameStartedEvents$1$cancelable$2(uVar), null, 4, null));
            this.label = 1;
            if (t.a(vVar, anonymousClass1, this) == coroutine_suspended) {
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
