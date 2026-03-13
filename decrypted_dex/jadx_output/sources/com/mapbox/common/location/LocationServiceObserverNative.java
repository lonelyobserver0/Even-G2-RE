package com.mapbox.common.location;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class LocationServiceObserverNative implements LocationServiceObserver {
    protected long peer;

    public static class LocationServiceObserverPeerCleaner implements Runnable {
        private long peer;

        public LocationServiceObserverPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            LocationServiceObserverNative.cleanNativePeer(this.peer);
        }
    }

    public LocationServiceObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new LocationServiceObserverPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.location.LocationServiceObserver
    public native void onAccuracyAuthorizationChanged(AccuracyAuthorization accuracyAuthorization);

    @Override // com.mapbox.common.location.LocationServiceObserver
    public native void onAvailabilityChanged(boolean z2);

    @Override // com.mapbox.common.location.LocationServiceObserver
    public native void onPermissionStatusChanged(PermissionStatus permissionStatus);
}
