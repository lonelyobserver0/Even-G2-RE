package com.mapbox.common.location;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface LocationServiceObserver {
    void onAccuracyAuthorizationChanged(AccuracyAuthorization accuracyAuthorization);

    void onAvailabilityChanged(boolean z2);

    void onPermissionStatusChanged(PermissionStatus permissionStatus);
}
