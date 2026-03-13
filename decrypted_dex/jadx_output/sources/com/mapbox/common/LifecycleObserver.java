package com.mapbox.common;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface LifecycleObserver {
    void onLifecycleStateChanged(LifecycleState lifecycleState);

    void onMonitoringStateChanged(LifecycleMonitoringState lifecycleMonitoringState, String str);
}
