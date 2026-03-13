package com.mapbox.maps;

import Qb.I;
import android.view.Display;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQb/I;", "", "<anonymous>", "(LQb/I;)V"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "com.mapbox.maps.MapView$onStart$1", f = "MapView.kt", i = {}, l = {236}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapView$onStart$1 extends SuspendLambda implements Function2<I, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MapView this$0;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.mapbox.maps.MapView$onStart$1$1", f = "MapView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.mapbox.maps.MapView$onStart$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Integer>, Object> {
        int label;
        final /* synthetic */ MapView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MapView mapView, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.this$0 = mapView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
            Display display = this.this$0.getDisplay();
            return Boxing.boxInt(display != null ? (int) display.getRefreshRate() : 60);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Integer> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapView$onStart$1(MapView mapView, Continuation<? super MapView$onStart$1> continuation) {
        super(2, continuation);
        this.this$0 = mapView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MapView$onStart$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(I i3, Continuation<? super Unit> continuation) {
        return ((MapView$onStart$1) create(i3, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Integer boxInt = Boxing.boxInt(60);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            final MapView mapView = this.this$0;
            Function1<Integer, Unit> function1 = new Function1<Integer, Unit>() { // from class: com.mapbox.maps.MapView$onStart$1.2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i10) {
                    MapView.this.getMapController$maps_sdk_release().setScreenRefreshRate$maps_sdk_release(i10);
                }
            };
            this.label = 1;
            if (UtilsKt.safeSystemCallWithCallback$default(0L, boxInt, StubApp.getString2(13990), null, null, anonymousClass1, function1, this, 25, null) == coroutine_suspended) {
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
