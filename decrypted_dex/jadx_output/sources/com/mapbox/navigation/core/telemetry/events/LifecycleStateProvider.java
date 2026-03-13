package com.mapbox.navigation.core.telemetry.events;

import c5.B;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.Cancelable;
import com.mapbox.common.LifecycleMonitorFactory;
import com.mapbox.common.LifecycleMonitorInterface;
import com.mapbox.common.LifecycleMonitoringState;
import com.mapbox.common.LifecycleObserver;
import com.mapbox.common.LifecycleState;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0019\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0015\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cR$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/mapbox/navigation/core/telemetry/events/LifecycleStateProvider;", "", "interfaceProvider", "Lkotlin/Function0;", "Lcom/mapbox/navigation/core/telemetry/events/LifecycleMonitorCancelableWrapper;", "(Lkotlin/jvm/functions/Function0;)V", "value", "Lcom/mapbox/common/LifecycleState;", "currentState", "getCurrentState", "()Lcom/mapbox/common/LifecycleState;", "setCurrentState", "(Lcom/mapbox/common/LifecycleState;)V", "getLifecycleStateTask", "Lcom/mapbox/common/Cancelable;", "getGetLifecycleStateTask", "()Lcom/mapbox/common/Cancelable;", "setGetLifecycleStateTask", "(Lcom/mapbox/common/Cancelable;)V", "lifecycleMonitor", "getLifecycleMonitor", "()Lcom/mapbox/navigation/core/telemetry/events/LifecycleMonitorCancelableWrapper;", "lifecycleMonitor$delegate", "Lkotlin/Lazy;", "observer", "com/mapbox/navigation/core/telemetry/events/LifecycleStateProvider$observer$1", "Lcom/mapbox/navigation/core/telemetry/events/LifecycleStateProvider$observer$1;", "destroy", "", "init", "Companion", "navigation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class LifecycleStateProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final LifecycleStateProvider instance = new LifecycleStateProvider(new Function0<LifecycleMonitorCancelableWrapper>() { // from class: com.mapbox.navigation.core.telemetry.events.LifecycleStateProvider$Companion$instance$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final LifecycleMonitorCancelableWrapper invoke() {
            LifecycleMonitorInterface orCreate = LifecycleMonitorFactory.getOrCreate();
            Intrinsics.checkNotNullExpressionValue(orCreate, "getOrCreate()");
            return new LifecycleMonitorCancelableWrapper(orCreate);
        }
    });
    private volatile LifecycleState currentState;
    private Cancelable getLifecycleStateTask;

    /* renamed from: lifecycleMonitor$delegate, reason: from kotlin metadata */
    private final Lazy lifecycleMonitor;
    private final LifecycleStateProvider$observer$1 observer;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/navigation/core/telemetry/events/LifecycleStateProvider$Companion;", "", "()V", "instance", "Lcom/mapbox/navigation/core/telemetry/events/LifecycleStateProvider;", "getInstance", "()Lcom/mapbox/navigation/core/telemetry/events/LifecycleStateProvider;", "navigation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LifecycleStateProvider getInstance() {
            return LifecycleStateProvider.instance;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.mapbox.navigation.core.telemetry.events.LifecycleStateProvider$observer$1] */
    public LifecycleStateProvider(final Function0<LifecycleMonitorCancelableWrapper> interfaceProvider) {
        Intrinsics.checkNotNullParameter(interfaceProvider, "interfaceProvider");
        this.lifecycleMonitor = LazyKt.lazy(new Function0<LifecycleMonitorCancelableWrapper>() { // from class: com.mapbox.navigation.core.telemetry.events.LifecycleStateProvider$lifecycleMonitor$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final LifecycleMonitorCancelableWrapper invoke() {
                return interfaceProvider.invoke();
            }
        });
        this.currentState = LifecycleState.UNKNOWN;
        this.observer = new LifecycleObserver() { // from class: com.mapbox.navigation.core.telemetry.events.LifecycleStateProvider$observer$1
            @Override // com.mapbox.common.LifecycleObserver
            public void onLifecycleStateChanged(LifecycleState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                Cancelable getLifecycleStateTask = LifecycleStateProvider.this.getGetLifecycleStateTask();
                if (getLifecycleStateTask != null) {
                    getLifecycleStateTask.cancel();
                }
                LifecycleStateProvider.this.setCurrentState(state);
            }

            @Override // com.mapbox.common.LifecycleObserver
            public void onMonitoringStateChanged(LifecycleMonitoringState state, String error) {
                Intrinsics.checkNotNullParameter(state, "state");
                if (state == LifecycleMonitoringState.STOPPED) {
                    LifecycleStateProvider.this.setCurrentState(LifecycleState.UNKNOWN);
                }
            }
        };
    }

    private final LifecycleMonitorCancelableWrapper getLifecycleMonitor() {
        return (LifecycleMonitorCancelableWrapper) this.lifecycleMonitor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$1(LifecycleStateProvider this$0, Expected result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        result.onValue(new B(this$0, 13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$1$lambda$0(LifecycleStateProvider this$0, LifecycleState it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.setCurrentState(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentState(LifecycleState lifecycleState) {
        this.currentState = lifecycleState;
        Cancelable cancelable = this.getLifecycleStateTask;
        if (cancelable != null) {
            cancelable.cancel();
        }
        this.getLifecycleStateTask = null;
    }

    public final void destroy() {
        setCurrentState(LifecycleState.UNKNOWN);
        getLifecycleMonitor().unregisterObserver(this.observer);
    }

    public final LifecycleState getCurrentState() {
        return this.currentState;
    }

    public final Cancelable getGetLifecycleStateTask() {
        return this.getLifecycleStateTask;
    }

    public final void init() {
        this.getLifecycleStateTask = getLifecycleMonitor().getLifecycleState(new com.mapbox.common.module.b(this, 1));
        getLifecycleMonitor().registerObserver(this.observer);
    }

    public final void setGetLifecycleStateTask(Cancelable cancelable) {
        this.getLifecycleStateTask = cancelable;
    }
}
