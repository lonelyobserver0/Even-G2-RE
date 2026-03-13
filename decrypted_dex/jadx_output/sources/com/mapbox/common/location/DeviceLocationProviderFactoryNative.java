package com.mapbox.common.location;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class DeviceLocationProviderFactoryNative implements DeviceLocationProviderFactory {
    protected long peer;

    public static class DeviceLocationProviderFactoryPeerCleaner implements Runnable {
        private long peer;

        public DeviceLocationProviderFactoryPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            DeviceLocationProviderFactoryNative.cleanNativePeer(this.peer);
        }
    }

    public DeviceLocationProviderFactoryNative(long j) {
        this.peer = j;
        CleanerService.register(this, new DeviceLocationProviderFactoryPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.location.DeviceLocationProviderFactory
    public native Expected<LocationError, DeviceLocationProvider> build(LocationProviderRequest locationProviderRequest);
}
