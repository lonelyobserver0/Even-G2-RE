package com.mapbox.common;

import com.mapbox.common.LifecycleService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "hasForegroundService", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class LifecycleService$getLifecycleState$3$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ Function1<LifecycleState, Unit> $callback;
    final /* synthetic */ LifecycleService $this_runCatching;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleService$getLifecycleState$3$1(LifecycleService lifecycleService, Function1<? super LifecycleState, Unit> function1) {
        super(1);
        this.$this_runCatching = lifecycleService;
        this.$callback = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z2) {
        HashMap hashMap;
        LifecycleState lifecycleState;
        if (z2) {
            LifecycleService lifecycleService = this.$this_runCatching;
            LifecycleState lifecycleState2 = LifecycleState.FOREGROUND;
            lifecycleService.updateLifecycleState(lifecycleState2);
            this.$callback.invoke(lifecycleState2);
            return;
        }
        hashMap = this.$this_runCatching.registeredActivities;
        Collection<LifecycleService.ActivityState> values = hashMap.values();
        Intrinsics.checkNotNullExpressionValue(values, "registeredActivities.values");
        LifecycleService lifecycleService2 = this.$this_runCatching;
        ArrayList arrayList = new ArrayList(CollectionsKt.f(values));
        for (LifecycleService.ActivityState it : values) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            lifecycleState = lifecycleService2.toLifecycleState(it);
            arrayList.add(lifecycleState);
        }
        LifecycleState[] lifecycleStateArr = {LifecycleState.FOREGROUND, LifecycleState.MOVING_FOREGROUND, LifecycleState.INACTIVE, LifecycleState.MOVING_BACKGROUND};
        for (int i3 = 0; i3 < 4; i3++) {
            LifecycleState lifecycleState3 = lifecycleStateArr[i3];
            if (arrayList.contains(lifecycleState3)) {
                this.$this_runCatching.updateLifecycleState(lifecycleState3);
                this.$callback.invoke(lifecycleState3);
                return;
            }
        }
        LifecycleService lifecycleService3 = this.$this_runCatching;
        LifecycleState lifecycleState4 = LifecycleState.BACKGROUND;
        lifecycleService3.updateLifecycleState(lifecycleState4);
        this.$callback.invoke(lifecycleState4);
    }
}
