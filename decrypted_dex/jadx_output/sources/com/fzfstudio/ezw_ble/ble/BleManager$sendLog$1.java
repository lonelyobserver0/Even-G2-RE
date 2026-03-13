package com.fzfstudio.ezw_ble.ble;

import Qb.I;
import com.stub.StubApp;
import io.flutter.plugin.common.EventChannel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQb/I;", "", "<anonymous>", "(LQb/I;)V"}, k = 3, mv = {2, 1, 0})
@DebugMetadata(c = "com.fzfstudio.ezw_ble.ble.BleManager$sendLog$1", f = "BleManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class BleManager$sendLog$1 extends SuspendLambda implements Function2<I, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $log;
    final /* synthetic */ defpackage.a $tag;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleManager$sendLog$1(defpackage.a aVar, String str, Continuation<? super BleManager$sendLog$1> continuation) {
        super(2, continuation);
        this.$tag = aVar;
        this.$log = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BleManager$sendLog$1(this.$tag, this.$log, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(I i3, Continuation<? super Unit> continuation) {
        return ((BleManager$sendLog$1) create(i3, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String string2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException(StubApp.getString2(275));
        }
        ResultKt.throwOnFailure(obj);
        EventChannel.EventSink event = BleEC.LOGGER.getEvent();
        if (event != null) {
            int ordinal = this.$tag.ordinal();
            if (ordinal == 0) {
                string2 = StubApp.getString2(11297);
            } else {
                if (ordinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                string2 = StubApp.getString2(11296);
            }
            event.success(string2 + StubApp.getString2(11298) + this.$log);
        }
        return Unit.INSTANCE;
    }
}
