package com.mapbox.common;

import com.mapbox.common.LifecycleService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lcom/mapbox/common/LifecycleState;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class LifecycleService$setCallback$1 extends Lambda implements Function1<LifecycleState, Unit> {
    final /* synthetic */ LifecycleService.Callback $observer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleService$setCallback$1(LifecycleService.Callback callback) {
        super(1);
        this.$observer = callback;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LifecycleState lifecycleState) {
        invoke2(lifecycleState);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LifecycleState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        LifecycleService.Callback callback = this.$observer;
        if (callback != null) {
            callback.onLifecycleStateChanged(state);
        }
    }
}
