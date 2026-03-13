package com.mapbox.navigation.core.telemetry.events;

import com.mapbox.bindgen.Expected;
import com.mapbox.common.Cancelable;
import com.mapbox.common.GetLifecycleStateCallback;
import com.mapbox.common.LifecycleMonitorInterface;
import com.mapbox.common.LifecycleObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/mapbox/navigation/core/telemetry/events/LifecycleMonitorCancelableWrapper;", "", "lifecycleMonitorInterface", "Lcom/mapbox/common/LifecycleMonitorInterface;", "(Lcom/mapbox/common/LifecycleMonitorInterface;)V", "getLifecycleState", "Lcom/mapbox/common/Cancelable;", "callback", "Lcom/mapbox/common/GetLifecycleStateCallback;", "registerObserver", "", "observer", "Lcom/mapbox/common/LifecycleObserver;", "unregisterObserver", "navigation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class LifecycleMonitorCancelableWrapper {
    private final LifecycleMonitorInterface lifecycleMonitorInterface;

    public LifecycleMonitorCancelableWrapper(LifecycleMonitorInterface lifecycleMonitorInterface) {
        Intrinsics.checkNotNullParameter(lifecycleMonitorInterface, "lifecycleMonitorInterface");
        this.lifecycleMonitorInterface = lifecycleMonitorInterface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLifecycleState$lambda$0(Ref.BooleanRef cancelled, GetLifecycleStateCallback callback, Expected it) {
        Intrinsics.checkNotNullParameter(cancelled, "$cancelled");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(it, "it");
        if (cancelled.element) {
            return;
        }
        callback.run(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLifecycleState$lambda$1(Ref.BooleanRef cancelled) {
        Intrinsics.checkNotNullParameter(cancelled, "$cancelled");
        cancelled.element = true;
    }

    public final Cancelable getLifecycleState(final GetLifecycleStateCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        this.lifecycleMonitorInterface.getLifecycleState(new GetLifecycleStateCallback() { // from class: com.mapbox.navigation.core.telemetry.events.a
            @Override // com.mapbox.common.GetLifecycleStateCallback
            public final void run(Expected expected) {
                LifecycleMonitorCancelableWrapper.getLifecycleState$lambda$0(Ref.BooleanRef.this, callback, expected);
            }
        });
        return new Cancelable() { // from class: com.mapbox.navigation.core.telemetry.events.b
            @Override // com.mapbox.common.Cancelable
            public final void cancel() {
                LifecycleMonitorCancelableWrapper.getLifecycleState$lambda$1(Ref.BooleanRef.this);
            }
        };
    }

    public final void registerObserver(LifecycleObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.lifecycleMonitorInterface.registerObserver(observer);
    }

    public final void unregisterObserver(LifecycleObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.lifecycleMonitorInterface.unregisterObserver(observer);
    }
}
