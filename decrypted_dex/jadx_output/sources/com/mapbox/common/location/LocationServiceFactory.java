package com.mapbox.common.location;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class LocationServiceFactory {
    protected long peer;

    public static class LocationServiceFactoryPeerCleaner implements Runnable {
        private long peer;

        public LocationServiceFactoryPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            LocationServiceFactory.cleanNativePeer(this.peer);
        }
    }

    public LocationServiceFactory(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static LocationService getOrCreate() {
        return LocationServiceImpl.createPlatformLocationService();
    }

    public static native void reset();

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new LocationServiceFactoryPeerCleaner(j));
    }
}
