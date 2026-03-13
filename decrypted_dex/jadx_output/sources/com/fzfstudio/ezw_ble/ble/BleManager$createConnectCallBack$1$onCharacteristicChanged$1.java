package com.fzfstudio.ezw_ble.ble;

import Qb.I;
import com.stub.StubApp;
import io.flutter.plugin.common.EventChannel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQb/I;", "", "<anonymous>", "(LQb/I;)V"}, k = 3, mv = {2, 1, 0})
@DebugMetadata(c = "com.fzfstudio.ezw_ble.ble.BleManager$createConnectCallBack$1$onCharacteristicChanged$1", f = "BleManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class BleManager$createConnectCallBack$1$onCharacteristicChanged$1 extends SuspendLambda implements Function2<I, Continuation<? super Unit>, Object> {
    final /* synthetic */ Map<String, Object> $bleCmdMap;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleManager$createConnectCallBack$1$onCharacteristicChanged$1(Map<String, ? extends Object> map, Continuation<? super BleManager$createConnectCallBack$1$onCharacteristicChanged$1> continuation) {
        super(2, continuation);
        this.$bleCmdMap = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BleManager$createConnectCallBack$1$onCharacteristicChanged$1(this.$bleCmdMap, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(I i3, Continuation<? super Unit> continuation) {
        return ((BleManager$createConnectCallBack$1$onCharacteristicChanged$1) create(i3, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException(StubApp.getString2(275));
        }
        ResultKt.throwOnFailure(obj);
        EventChannel.EventSink event = BleEC.RECEIVE_DATA.getEvent();
        if (event != null) {
            event.success(this.$bleCmdMap);
        }
        return Unit.INSTANCE;
    }
}
