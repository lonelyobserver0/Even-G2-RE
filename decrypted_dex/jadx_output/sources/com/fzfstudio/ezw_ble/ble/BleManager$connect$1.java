package com.fzfstudio.ezw_ble.ble;

import Qb.I;
import Qb.S;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import no.nordicsemi.android.dfu.DfuServiceInitiator;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQb/I;", "", "<anonymous>", "(LQb/I;)V"}, k = 3, mv = {2, 1, 0})
@DebugMetadata(c = "com.fzfstudio.ezw_ble.ble.BleManager$connect$1", f = "BleManager.kt", i = {}, l = {260}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class BleManager$connect$1 extends SuspendLambda implements Function2<I, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $afterUpgrade;
    final /* synthetic */ String $belongConfig;
    final /* synthetic */ boolean $isWaitingDevice;
    final /* synthetic */ String $name;
    final /* synthetic */ String $sn;
    final /* synthetic */ String $uuid;
    int label;
    final /* synthetic */ BleManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleManager$connect$1(BleManager bleManager, String str, String str2, String str3, String str4, boolean z2, boolean z10, Continuation<? super BleManager$connect$1> continuation) {
        super(2, continuation);
        this.this$0 = bleManager;
        this.$belongConfig = str;
        this.$uuid = str2;
        this.$name = str3;
        this.$sn = str4;
        this.$isWaitingDevice = z2;
        this.$afterUpgrade = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BleManager$connect$1(this.this$0, this.$belongConfig, this.$uuid, this.$name, this.$sn, this.$isWaitingDevice, this.$afterUpgrade, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(I i3, Continuation<? super Unit> continuation) {
        return ((BleManager$connect$1) create(i3, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (S.a(DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.connect(this.$belongConfig, this.$uuid, this.$name, this.$sn, this.$isWaitingDevice, this.$afterUpgrade, false);
        return Unit.INSTANCE;
    }
}
