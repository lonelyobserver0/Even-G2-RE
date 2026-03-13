package com.mapbox.common;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface MovementMonitorInterface {
    void getMovementInfo(MovementInfoCallback movementInfoCallback);

    void registerObserver(MovementModeObserver movementModeObserver);

    void setMovementInfo(MovementInfo movementInfo);

    void unregisterObserver(MovementModeObserver movementModeObserver);
}
