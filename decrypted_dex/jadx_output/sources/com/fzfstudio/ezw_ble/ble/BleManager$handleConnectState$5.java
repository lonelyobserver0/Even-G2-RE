package com.fzfstudio.ezw_ble.ble;

import Qb.I;
import com.fzfstudio.ezw_ble.ble.models.BleConnectModel;
import com.fzfstudio.ezw_ble.ble.models.enums.BleConnectState;
import com.stub.StubApp;
import io.flutter.plugin.common.EventChannel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQb/I;", "", "<anonymous>", "(LQb/I;)V"}, k = 3, mv = {2, 1, 0})
@DebugMetadata(c = "com.fzfstudio.ezw_ble.ble.BleManager$handleConnectState$5", f = "BleManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class BleManager$handleConnectState$5 extends SuspendLambda implements Function2<I, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $mtu;
    final /* synthetic */ String $name;
    final /* synthetic */ BleConnectState $state;
    final /* synthetic */ String $uuid;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleManager$handleConnectState$5(String str, String str2, BleConnectState bleConnectState, int i3, Continuation<? super BleManager$handleConnectState$5> continuation) {
        super(2, continuation);
        this.$uuid = str;
        this.$name = str2;
        this.$state = bleConnectState;
        this.$mtu = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BleManager$handleConnectState$5(this.$uuid, this.$name, this.$state, this.$mtu, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(I i3, Continuation<? super Unit> continuation) {
        return ((BleManager$handleConnectState$5) create(i3, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException(StubApp.getString2(275));
        }
        ResultKt.throwOnFailure(obj);
        BleConnectModel bleConnectModel = new BleConnectModel(this.$uuid, this.$name, this.$state, this.$mtu);
        EventChannel.EventSink event = BleEC.CONNECT_STATUS.getEvent();
        if (event != null) {
            event.success(bleConnectModel.toJson());
        }
        return Unit.INSTANCE;
    }
}
