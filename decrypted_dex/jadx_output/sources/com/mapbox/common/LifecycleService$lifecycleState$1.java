package com.mapbox.common;

import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/mapbox/common/LifecycleState;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class LifecycleService$lifecycleState$1 extends Lambda implements Function1<LifecycleState, Unit> {
    final /* synthetic */ CountDownLatch $latch;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleService$lifecycleState$1(CountDownLatch countDownLatch) {
        super(1);
        this.$latch = countDownLatch;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LifecycleState lifecycleState) {
        invoke2(lifecycleState);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LifecycleState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$latch.countDown();
    }
}
